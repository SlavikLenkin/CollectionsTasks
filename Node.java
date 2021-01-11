package com.mycompany.collection;

public class Node<E> {
    private E data;
    private Node<E> next;


    Node(E data, Node<E> next) {
        this.data = data;
        this.next = next;
    }

    E getData() {
        return data;
    }

    Node<E> getNext() {
        return next;
    }

    void setData(E data) {
        this.data = data;
    }

    void setNext(Node<E> next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                '}';
    }
}
