package com.mycompany.collection.list;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestList {

    private int count = 50000;
    private List<String> linkedList = new LinkedList<>();
    private List<String> arrayList = new ArrayList<>();
    private long timeOfLinkedList;
    private long timeOfArrayList;
    private String str = "hello test";

    private void print(java.lang.String operation) {
        System.out.println(operation + " count " + count);
        System.out.println("LinkedList " + timeOfLinkedList / 1000 + " ms");
        System.out.println("ArrayList " + timeOfArrayList / 1000 + " ms");
        System.out.println();
    }

    private void testAdd() {
        timeOfLinkedList = System.nanoTime();
        for (int i = 0; i < count; i++) {
            linkedList.add(str);
        }
        timeOfLinkedList = System.nanoTime() - timeOfLinkedList;

        timeOfArrayList = System.nanoTime();
        for (int i = 0; i < count; i++) {
            arrayList.add(str);
        }
        timeOfArrayList = System.nanoTime() - timeOfArrayList;
        print("Test add(E element)");
    }

    private void testAddToBegin() {
        timeOfLinkedList = System.nanoTime();
        for (int i = 0; i < count; i++) {
            linkedList.add(0, str);
        }
        timeOfLinkedList = System.nanoTime() - timeOfLinkedList;

        timeOfArrayList = System.nanoTime();
        for (int i = 0; i < count; i++) {
            arrayList.add(0, str);
        }
        timeOfArrayList = System.nanoTime() - timeOfArrayList;
        print("Test add(0,E element)");
    }

    private void testAddToMiddle() {
        timeOfLinkedList = System.nanoTime();
        for (int i = 0; i < count; i++) {
            linkedList.add(linkedList.size() / 2, str);
        }
        timeOfLinkedList = System.nanoTime() - timeOfLinkedList;

        timeOfArrayList = System.nanoTime();
        for (int i = 0; i < count; i++) {
            arrayList.add(arrayList.size() / 2, str);
        }
        timeOfArrayList = System.nanoTime() - timeOfArrayList;
        print("Test add(size/2,E element)");
    }

    private void testGetToBegin() {
        timeOfLinkedList = System.nanoTime();
        for (int i = 0; i < count; i++) {
            linkedList.get(i);
        }
        timeOfLinkedList = System.nanoTime() - timeOfLinkedList;

        timeOfArrayList = System.nanoTime();
        for (int i = 0; i < count; i++) {
            arrayList.get(i);
        }
        timeOfArrayList = System.nanoTime() - timeOfArrayList;
        print("Test get begin");
    }

    private void testGetToMiddle() {
        timeOfLinkedList = System.nanoTime();
        for (int i = 0; i < count; i++) {
            linkedList.get(linkedList.size() / 2);
        }
        timeOfLinkedList = System.nanoTime() - timeOfLinkedList;

        timeOfArrayList = System.nanoTime();
        for (int i = 0; i < count; i++) {
            arrayList.get(arrayList.size() / 2);
        }
        timeOfArrayList = System.nanoTime() - timeOfArrayList;
        print("Test get middle");
    }

    private void testGetToEnd() {
        timeOfLinkedList = System.nanoTime();
        for (int i = 0; i < count; i++) {
            linkedList.get(linkedList.size() - 1);
        }
        timeOfLinkedList = System.nanoTime() - timeOfLinkedList;

        timeOfArrayList = System.nanoTime();
        for (int i = 0; i < count; i++) {
            arrayList.get(arrayList.size() - 1);
        }
        timeOfArrayList = System.nanoTime() - timeOfArrayList;
        print("Test get end");
    }

    private void testRemoveToBegin() {
        timeOfLinkedList = System.nanoTime();
        for (int i = 0; i < count; i++) {
            linkedList.remove(0);
        }
        timeOfLinkedList = System.nanoTime() - timeOfLinkedList;

        timeOfArrayList = System.nanoTime();
        for (int i = 0; i < count; i++) {
            arrayList.remove(0);
        }
        timeOfArrayList = System.nanoTime() - timeOfArrayList;
        print("Test remove begin");
    }

    private void testRemoveToMiddle() {
        timeOfLinkedList = System.nanoTime();
        for (int i = 0; i < count; i++) {
            linkedList.remove(linkedList.size() / 2);
        }
        timeOfLinkedList = System.nanoTime() - timeOfLinkedList;

        timeOfArrayList = System.nanoTime();
        for (int i = 0; i < count; i++) {
            arrayList.remove(arrayList.size() / 2);
        }
        timeOfArrayList = System.nanoTime() - timeOfArrayList;
        print("Test remove middle");
    }

    private void testRemoveToEnd() {
        timeOfLinkedList = System.nanoTime();
        for (int i = linkedList.size() - 1; i >= 0; i--) {
            linkedList.remove(i);
        }
        timeOfLinkedList = System.nanoTime() - timeOfLinkedList;

        timeOfArrayList = System.nanoTime();
        for (int i = arrayList.size() - 1; i >= 0; i--) {
            arrayList.remove(i);
        }
        timeOfArrayList = System.nanoTime() - timeOfArrayList;
        print("Test remove end");
    }

    private void testSetToBegin() {
        timeOfLinkedList = System.nanoTime();
        for (int i = linkedList.size() - 1; i >= 0; i--) {
            linkedList.set(0, str);
        }
        timeOfLinkedList = System.nanoTime() - timeOfLinkedList;

        timeOfArrayList = System.nanoTime();
        for (int i = arrayList.size() - 1; i >= 0; i--) {
            arrayList.set(0, str);
        }
        timeOfArrayList = System.nanoTime() - timeOfArrayList;
        print("Test set to begin");
    }

    private void testSetToMiddle() {
        timeOfLinkedList = System.nanoTime();
        for (int i = linkedList.size() - 1; i >= 0; i--) {
            linkedList.set(linkedList.size() / 2, str);
        }
        timeOfLinkedList = System.nanoTime() - timeOfLinkedList;

        timeOfArrayList = System.nanoTime();
        for (int i = arrayList.size() - 1; i >= 0; i--) {
            arrayList.set(linkedList.size() / 2, str);
        }
        timeOfArrayList = System.nanoTime() - timeOfArrayList;
        print("Test set to middle");
    }


    public static void testingList() {
        TestList testList = new TestList();
        testList.testAdd();
        testList.testRemoveToBegin();
        testList.testAddToBegin();
        testList.testRemoveToMiddle();
        testList.testAddToMiddle();
        testList.testGetToBegin();
        testList.testGetToMiddle();
        testList.testGetToEnd();
        testList.testSetToBegin();
        testList.testSetToMiddle();
        testList.testRemoveToEnd();
    }
}
