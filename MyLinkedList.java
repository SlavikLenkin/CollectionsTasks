package com.mycompany.collection;

public class MyLinkedList<E> implements ILinkedList<E> {

    private Node<E> head;
    private int size;

    private boolean isEmpty() {
        return head == null;
    }

    private Node<E> getNode(int index) {
        if (isEmpty() || index < 0 || index > size) {
            throw new IndexOutOfBoundsException("incorrect index");
        }
        Node<E> node = head;
        for (int i = 0; i < index; i++) {
            node = node.getNext();
        }
        return node;
    }


    public Node<E> getHead() {
        return head;
    }


    @Override
    public void add(E element) {
        if (isEmpty()) {
            head = new Node<>(element, null);
        } else {
            Node<E> tmp = head;
            while (tmp.getNext() != null) {
                tmp = tmp.getNext();
            }
            tmp.setNext(new Node<>(element, null));
        }
        size++;
    }

    @Override
    public void add(int index, E element) {
        if (index == size) {
            add(element);
        } else {
            if (index == 0) {
                head = new Node<>(element, head);
            } else {
                Node<E> previous = getNode(index - 1);
                previous.setNext(new Node<>(element, previous.getNext()));
            }
        }
    }

    @Override
    public void clear() {
        Node<E> tmp = head;
        while (tmp.getNext() != null) {
            Node<E> next = tmp.getNext();
            tmp.setNext(null);
            tmp = next;
        }
        head = null;
        size = 0;
    }

    @Override
    public E get(int index) {
        return getNode(index).getData();
    }

    @Override
    public int indexOf(E element) {
        int index = 0;
        if (element == null) {
            for (Node<E> node = head; node != null; node = node.getNext()) {
                if (node.getData() == null) {
                    return index;
                }
                index++;
            }
        } else {
            for (Node<E> node = head; node != null; node = node.getNext()) {
                if (element.equals(node.getData())) {
                    return index;
                }
                index++;
            }
        }
        return -1;
    }

    @Override
    public E remove(int index) {
        E tmp = head.getData();
        if (index == 0) {
            head = head.getNext();
        } else {
            Node<E> previous = getNode(index - 1);
            tmp = previous.getNext().getData();
            previous.setNext(previous.getNext().getNext());

        }
        size--;
        return tmp;
    }

    @Override
    public E set(int index, E element) {
        Node<E> node = getNode(index);
        E data = node.getData();
        node.setData(element);
        return data;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public <T> T[] toArray(T[] a) {
        if (a.length != size) {
            return  (T[]) java.lang.reflect.Array.newInstance(a.getClass().getComponentType(), size);
        }
        int i = 0;
        Object[] result = a;
        for (E x : this ) {
            result[i++] = x;
        }
        if (a.length > size)
            a[size] = null;
        return a;
    }


    @Override
    public MyIterator<E> iterator() {
        return new MyIterator<>(this);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("[");
        for (Object x : this) {
            result.append(x).append(", ");
        }
        if (!isEmpty()) {
            result.delete(result.length() - 2, result.length());
        }
        result.append("]");
        return result.toString();
    }
}
