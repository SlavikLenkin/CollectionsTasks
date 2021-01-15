package com.mycompany.collection.map;

import java.util.*;

public class TestMap {

    private int count = 50000;
    private Map<Integer, String> hashMap = new HashMap<>();
    private Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
    private Map<Integer, String> treeMap = new TreeMap<>();

    private long timeOfHashMap;
    private long timeOfLinkedHashMap;
    private long timeOfTreeMap;
    private String str = "hello test";

    private void print(String operation) {
        System.out.println(operation + " count " + count);
        System.out.println("HashMap " + timeOfHashMap / 1000 + " ms");
        System.out.println("LinkedHashMap " + timeOfLinkedHashMap / 1000 + " ms");
        System.out.println("TreeMap " + timeOfTreeMap / 1000 + " ms");
        System.out.println();
    }

    private void testAdd() {
        timeOfHashMap = System.nanoTime();
        for (int i = 0; i < count; i++) {
            hashMap.put(i, str);
        }
        timeOfHashMap = System.nanoTime() - timeOfHashMap;

        timeOfLinkedHashMap = System.nanoTime();
        for (int i = 0; i < count; i++) {
            linkedHashMap.put(i, str);
        }
        timeOfLinkedHashMap = System.nanoTime() - timeOfLinkedHashMap;

        timeOfTreeMap = System.nanoTime();
        for (int i = 0; i < count; i++) {
            treeMap.put(i, str);
        }
        timeOfTreeMap = System.nanoTime() - timeOfTreeMap;
        print("Test add");
    }

    private void testGet() {
        timeOfHashMap = System.nanoTime();
        for (int i = 0; i < count; i++) {
            hashMap.get(i);
        }
        timeOfHashMap = System.nanoTime() - timeOfHashMap;

        timeOfLinkedHashMap = System.nanoTime();
        for (int i = 0; i < count; i++) {
            linkedHashMap.get(i);
        }
        timeOfLinkedHashMap = System.nanoTime() - timeOfLinkedHashMap;

        timeOfTreeMap = System.nanoTime();
        for (int i = 0; i < count; i++) {
            treeMap.get(i);
        }
        timeOfTreeMap = System.nanoTime() - timeOfTreeMap;
        print("Test get");
    }

    private void testRemove() {
        timeOfHashMap = System.nanoTime();
        for (int i = 0; i < count; i++) {
            hashMap.remove(i);
        }
        timeOfHashMap = System.nanoTime() - timeOfHashMap;

        timeOfLinkedHashMap = System.nanoTime();
        for (int i = 0; i < count; i++) {
            linkedHashMap.remove(i);
        }
        timeOfLinkedHashMap = System.nanoTime() - timeOfLinkedHashMap;

        timeOfTreeMap = System.nanoTime();
        for (int i = 0; i < count; i++) {
            treeMap.remove(i);
        }
        timeOfTreeMap = System.nanoTime() - timeOfTreeMap;
        print("Test remove");
    }

    public static void testingMap() {
        TestMap testMap = new TestMap();

        testMap.testAdd();
        testMap.testGet();
        testMap.testRemove();
    }
}
