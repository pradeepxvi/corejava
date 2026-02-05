package com.corejava.dsa;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    void addLast(int data) {

        if (head == null) {
            addFirst(data);
            return;
        }

        Node newNode = new Node(data);
        newNode.next = null;

        Node currentNode = head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
    }

    void addAt(int data, int index) {

        if (index < 1) {
            System.out.println("Enter valid index");
            return;
        }

        if (index == 1 || head == null) {
            addFirst(data);
            return;
        }

        Node newNode = new Node(data);
        newNode.next = null;

        Node currentNode = head;

        for (int i = 1; i < index - 1; i++) {
            if (currentNode == null) {
                System.out.println("Index out of bound");
                return;
            }
            currentNode = currentNode.next;
        }

        if (currentNode == null) {
            System.out.println("Index out of bound");
            return;
        }

        newNode.next = currentNode.next;
        currentNode.next = newNode;
    }
}

public class LinkedListJava {
    public static void main(String[] args) {

    }
}
