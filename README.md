# CollectionsTasks


**Сравнение производительности собственной коллекции с Java реализацией.**

![](https://github.com/SlavikLenkin/CollectionsTasks/blob/main/%D0%A1%D0%BA%D1%80%D0%B8%D0%BD%D1%88%D0%BE%D1%82%2011-01-2021%20233018.jpg)



**TestCollections**

**ArrayList and LinkedList:**

![](https://github.com/SlavikLenkin/CollectionsTasks/blob/main/list/add%2050000.jpg)

Add elements -> ArrayList is faster

![](https://github.com/SlavikLenkin/CollectionsTasks/blob/main/list/add%20begin%2050000.jpg)

Add elements to begin -> LinkedList is fasted

![](https://github.com/SlavikLenkin/CollectionsTasks/blob/main/list/add%20middle%2050000.jpg)

Add elements to middle -> ArrayList is faster

![](https://github.com/SlavikLenkin/CollectionsTasks/blob/main/list/get%20begin%2050000.jpg)

Get elements to begin -> ArrayList is faster

![](https://github.com/SlavikLenkin/CollectionsTasks/blob/main/list/get%20middle%2050000.jpg)

Get elements to middle -> ArrayList is faster

![](https://github.com/SlavikLenkin/CollectionsTasks/blob/main/list/get%20end%2050000.jpg)

Get elements to end -> ArrayList is faster

![](https://github.com/SlavikLenkin/CollectionsTasks/blob/main/list/remove%20begin%2050000.jpg)

Remove elements to begin -> LinkedList is faster

![](https://github.com/SlavikLenkin/CollectionsTasks/blob/main/list/remove%20middle%2050000.jpg)

Remove elements to middle -> ArrayList is faster

![](https://github.com/SlavikLenkin/CollectionsTasks/blob/main/list/remove%20end%2050000.jpg)

Remove elements to end -> ArrayList is faster

![](https://github.com/SlavikLenkin/CollectionsTasks/blob/main/list/set%20begin%2050000.jpg)

Set elements to begin ->  ArrayList is faster

![](https://github.com/SlavikLenkin/CollectionsTasks/blob/main/list/set%20middle%2050000.jpg)

Set elements to middle ->  ArrayList is faster

Выводы: 

1)LinkedList быстрее, чем ArrayList, добавляет элементы в начало списка.

2)Удаление из начала списка LinkedList осуществляет быстрее.

3)В остальных случаях лучше ArrayList.

**HashSet LinkedHashSet TreeSet**

![](https://github.com/SlavikLenkin/CollectionsTasks/blob/main/Set/add%2050000.jpg)

Add elements -> HashSet is faster

![](https://github.com/SlavikLenkin/CollectionsTasks/blob/main/Set/remove%2050000.jpg)

Remove elements -> LinkedHashSet is faster

Выводы:

1)HashSet дает лучшую производительность при добавлении элементов.

2)LinkedHashSet показывает лучший результат на удалении элементов.



**HashMap LinkedHashMap TreeMap**

![](https://github.com/SlavikLenkin/CollectionsTasks/blob/main/map/add%2050000.jpg)

Add elements -> HashSet is faster

![](https://github.com/SlavikLenkin/CollectionsTasks/blob/main/map/get%2050000.jpg)

Get elements -> LinkedHasMap is faster

![](https://github.com/SlavikLenkin/CollectionsTasks/blob/main/map/remove%2050000.jpg)

Remove elements -> LinkedHashSet is faster

Выводы:

1) HashMap  дает лучшую производительность при добавлении элементов.

2) При удалении и получении элементов самую высокую скорость показала LinkedHashMap.

