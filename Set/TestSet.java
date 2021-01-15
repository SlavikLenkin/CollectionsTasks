package com.mycompany.collection.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestSet {

    private int count = 50000;
    private Set<String> hashSet = new HashSet<>();
    private Set<String> linkedHashSet = new LinkedHashSet<>();
    private Set<String> treeSet = new TreeSet<>();

    private long timeOfHashSet;
    private long timeOfLinkedHashSet;
    private long timeOfTreeSet;
    private String str = "hello test";

    private void print(String operation) {
        System.out.println(operation + " count " + count);
        System.out.println("HashSet " + timeOfHashSet / 1000 + " ms");
        System.out.println("LinkedHashSet " + timeOfLinkedHashSet / 1000 + " ms");
        System.out.println("TreeSet " + timeOfTreeSet / 1000 + " ms");
        System.out.println();
    }

    private void testAdd(){
        timeOfHashSet = System.nanoTime();
        for (int i = 0; i < count; i++) {
            hashSet.add(str);
        }
        timeOfHashSet= System.nanoTime() - timeOfHashSet;

        timeOfLinkedHashSet = System.nanoTime();
        for (int i = 0; i < count; i++) {
            linkedHashSet.add(str);
        }
        timeOfLinkedHashSet = System.nanoTime() - timeOfLinkedHashSet;

        timeOfTreeSet = System.nanoTime();
        for (int i = 0; i < count; i++) {
            treeSet.add(str);
        }
        timeOfTreeSet = System.nanoTime() - timeOfTreeSet;
        print("Test add");
    }

    private void testRemove(){
        timeOfHashSet = System.nanoTime();
        for (int i = 0; i < count; i++) {
            hashSet.remove(str);
        }
        timeOfHashSet= System.nanoTime() - timeOfHashSet;

        timeOfLinkedHashSet = System.nanoTime();
        for (int i = 0; i < count; i++) {
            linkedHashSet.remove(str);
        }
        timeOfLinkedHashSet = System.nanoTime() - timeOfLinkedHashSet;

        timeOfTreeSet = System.nanoTime();
        for (int i = 0; i < count; i++) {
            treeSet.remove(str);
        }
        timeOfTreeSet = System.nanoTime() - timeOfTreeSet;
        print("Test remove");
    }

    public static void testingSet(){
        TestSet testSet = new TestSet();

        testSet.testAdd();
        testSet.testRemove();
    }

}
