package com.mycompany.collection;

import java.util.Iterator;
import java.util.NoSuchElementException;

class MyIterator<E> implements Iterator<E> {
    private Node<E> nextNode;

    public MyIterator(MyLinkedList<E> list) {
        nextNode = list.getHead();
    }

    @Override
    public boolean hasNext() {
        return  nextNode != null;
    }

    @Override
    public E next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        E result = nextNode.getData();
        nextNode = nextNode.getNext();
        return result;
    }
}
