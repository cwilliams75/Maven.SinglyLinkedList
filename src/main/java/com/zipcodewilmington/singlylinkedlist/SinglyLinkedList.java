package com.zipcodewilmington.singlylinkedlist;

import javax.xml.soap.Node;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList<T> {

    private Node head;
    private int listSize = 0;

    private class Node {

        private T element;
        private Node next;

        public Node(T element) {
            this.element = element;
            next = null;
        }

        public Node(T element, Node next) {
            this.element = element;
            this.next = next;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public T getElement() {

            return element;
        }

        public void setElement(T element) {
            this.element = element;
        }

    }

    private void incrementListSize() {
        listSize++;
    }

    private void decrementListSize() {
        listSize--;
    }


    public void addElement(T element) {
        Node newNode = new Node(element);

        if (this.head == null) {
            this.head = newNode;
        } else {
            Node last = head;

            while (last.getNext() != null) {
                last = last.getNext();
            }
            last.setNext(newNode);
        }

        incrementListSize();
    }

    public boolean removeElementByIndex(int index) {
        if (index < 0 || index > getListSize() || head == null)
            return false;
        if (index == 0) {
            head = head.getNext();
            return true;
        }
        Node previous = null;
        Node current = head;
        for (int listIndex = 1; listIndex < index; listIndex++) {
            previous = current.getNext();
            current = current.getNext();
        }
        previous.setNext(current.getNext());
        decrementListSize();
        return true;
    }

    public boolean containsElement(T element) {
        if (head == null) {
            return false;
        }
        Node selectedElement = head;
        if (selectedElement.getElement().equals(element)) {
            return true;
        }
        for (int i = 0; i < getListSize(); i++) {
            selectedElement = selectedElement.getNext();
            if (selectedElement.getElement().equals(element)) {
                return true;
            }
        }
        return false;
    }

    public int findIndexByElement(T element) {
        if (head == null) {
            return -1;
        }
        return 1;
    }

    public int getListSize() {
        return listSize;
    }

    public T getElementByIndex(int index) {
        if (index < 0 || index > getListSize())
            return null;
        Node selectedElement = head;
        for (int i = 0; i < index; i++) {
            selectedElement = selectedElement.getNext();
        }
        return selectedElement.getElement();

    }

    public SinglyLinkedList<T> copySameValues(SinglyLinkedList list) {
        SinglyLinkedList<T> copyList = new SinglyLinkedList<T>();
        for (int i = 0; i < list.getListSize(); i++) {
            copyList.addElement(getElementByIndex(i));
        }
        return copyList;
    }


}
