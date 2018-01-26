package com.gracjan;

public class LinkedList<T> {
    private int counter;
    private Node<T> head;

    public LinkedList() {
        this.counter = 0;
        this.head = null;
    }

    public boolean isEmpty() {
        return(head == null);
    }

    public void addFirst(T data) {
        Node<T> newNode = new Node<>(data);

        newNode.setNext(head);
        this.head = newNode;
        this.counter++;
    }

    public Node<T> removeFirst() {
        Node<T> nodeReference = this.head;

        if (!isEmpty()) {
            this.head = this.head.getNext();
        } else {
            System.out.println("No objects to remove!");
        }

        return nodeReference;
    }

    public Node<T> insert(int index, T data) {
        int indexCounter = 0;
        Node<T> newNode = new Node<T>(data);
        Node<T> currentNode = this.head;
        Node<T> previousNode = this.head;

        while (indexCounter != index) {

            if (currentNode.getNext() == null) {

                System.out.println("Index out of bound");
                return null;

            } else {
                previousNode = currentNode;
                currentNode = currentNode.getNext();
            }
            indexCounter++;
        }
        
        if (currentNode == this.head) {
            newNode.setNext(currentNode);
            this.head = newNode;

        } else {
            newNode.setNext(currentNode);
            currentNode = newNode;
            previousNode.setNext(currentNode);
        }

        return currentNode;
    }

    public Node<T> remove(int index) {
        int indexCounter = 0;
        Node<T> currentNode = this.head;
        Node<T> previousNode = this.head;

        while (indexCounter != index) {

            if (currentNode.getNext() == null) {
                return null;

            } else {
                previousNode = currentNode;
                currentNode = currentNode.getNext();
            }
            indexCounter++;
        }

        if (currentNode == this.head) {
            this.head = this.head.getNext();

        } else {
            previousNode.setNext(currentNode.getNext());
        }

        return currentNode;
    }

    public int getCounter() {
        return counter;
    }

    public void display() {
        int index = 0;
        Node<T> node = this.head;
        while (node != null) {
            System.out.println(node.getData() + " index: " + index);
            node = node.getNext();
            index++;
        }
    }
}
