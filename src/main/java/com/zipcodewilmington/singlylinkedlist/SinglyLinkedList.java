package com.zipcodewilmington.singlylinkedlist;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList<T> {

    private Node<T> head;
    private int listSize = 0;

    public int getSizeOfList() {
        return listSize;
    }

    private class Node<T> {

        private T element;
        private Node<T> next;

        public Node(T element) {
            this.element = element;
            next = null;
        }

        public Node(T element, Node<T> next) {
            this.element = element;
            this.next = next;
        }

        public Node<T> getNext() {
            return next;
        }

        public void setNext(Node<T> next) {
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
        Node<T> newNode = new Node<T>(element);

        if (this.head == null) {
            this.head = newNode;
        } else {
            Node<T> last = head;

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
        Node<T> previous = null;
        Node<T> current = head;
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
        Node<T> selectedElement = head;
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
        Node<T> selectedNode = head;
        for (int i = 0; i < getListSize(); i++) ;
        if (selectedNode.getElement().equals(element)) {

        }
        selectedNode = selectedNode.getNext();
        return 1;
    }

    public int getListSize() {
        return listSize;
    }

    public T getElementByIndex(int index) {
        if (index < 0 || index > getListSize())
            return null;
        Node<T> selectedElement = head;
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

    public void sortList() {
        for (int i = 0; i < listSize; i++) {
            Node<T> currentNode = head;
            Node<T> nextNode = head.next;

            for (int j = 0; j < listSize - 1; j++) {
                if (currentNode.element).compareTo(nextNode.element) > 0){
                    T temp = currentNode.element;
                    currentNode.setElement(nextNode.element);
                    nextNode.setElement(temp);
                }
                currentNode = nextNode;
                nextNode = nextNode.next;
            }
        }
    }
}
