package com.zipcodewilmington.singlylinkedlist;

import javax.xml.soap.Node;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList<T> {
    private Node head;
    private int listSize = 0;

    public Integer getSizeOfList() {
        return getSizeOfList();
    }

    public void addElement(T element1) {
    }

    public T getElementByIndex(int i) {
        return getElementByIndex();
    }

    private class Node {

        private T element;
        private Node next;

        public Node(T element) {
            this.element = element;
        }

        public Node(Node next, T element) {
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

    private void incrementListSize(){
        listSize++;
    }
    private void decrementListSize(){
        listSize--;
    }
    private int getListSize(){
        return listSize;
    }

    }
