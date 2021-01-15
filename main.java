package com.mycompany.collection;

import com.mycompany.lecture.figures.Circle;

import java.util.LinkedList;
import java.util.List;

public class main {
    static int count = 10000;
    static ILinkedList<Circle> myLinkedList = new MyLinkedList<>();
    static List<Circle> javaLinkedList = new LinkedList<>();
    static long timeOfMyList;
    static long timeOfJavaList;
    static Circle circle = new Circle(2, "red");

    public static void main(String[] args) {
        testAdd();
        testGetByIndex();
        testRemove();
        simpleTest();

    }

    public static void simpleTest() {
        for (int i = 0; i < 3; i++) {
            myLinkedList.add(circle);
        }
        System.out.println(myLinkedList);
        myLinkedList.set(2, new Circle(4, "green"));
        System.out.println(myLinkedList);
        System.out.println(myLinkedList.indexOf(circle));
        System.out.println(myLinkedList.get(2));
        myLinkedList.remove(2);
        System.out.println(myLinkedList);
        myLinkedList.clear();
        System.out.println(myLinkedList);
    }

    public static void print(String operation) {
        System.out.println(operation);
        System.out.println("timeOfMyList " + timeOfMyList / 1000000 + " ms");
        System.out.println("timeOfCustomList " + timeOfJavaList / 1000000 + " ms");
        System.out.println();
    }

    public static void testAdd() {
        timeOfMyList = System.nanoTime();
        for (int i = 0; i < count; i++) {
            myLinkedList.add(circle);
        }
        timeOfMyList = System.nanoTime() - timeOfMyList;

        timeOfJavaList = System.nanoTime();
        for (int i = 0; i < count; i++) {
            javaLinkedList.add(circle);
        }
        timeOfJavaList = System.nanoTime() - timeOfJavaList;
        print("Test add(E element)");
    }

    public static void testGetByIndex() {
        timeOfMyList = System.nanoTime();
        for (int i = 0; i < count; i++) {
            myLinkedList.get(i);
        }
        timeOfMyList = System.nanoTime() - timeOfMyList;

        timeOfJavaList = System.nanoTime();
        for (int i = 0; i < count; i++) {
            javaLinkedList.get(i);
        }
        timeOfJavaList = System.nanoTime() - timeOfJavaList;
        print("Test get(int index)");
    }

    public static void testRemove() {
        timeOfMyList = System.nanoTime();
        for (int i = count - 1; i >= 0; i--) {
            myLinkedList.remove(i);
        }
        timeOfMyList = System.nanoTime() - timeOfMyList;

        timeOfJavaList = System.nanoTime();
        for (int i = count - 1; i >= 0; i--) {
            javaLinkedList.remove(i);
        }
        timeOfJavaList = System.nanoTime() - timeOfJavaList;
        print("Test remove(int index)");
    }

}
