The Java Collection Framework is a **unified architecture** for representing and manipulating **collections** — groups of objects. It provides **interfaces**, **classes**, and **algorithms** to work with different types of data structures like lists, sets, queues, maps, and more.

---

## 🔗 Hierarchy of Java Collection Framework

```
java.util
Iterable(1.5)
 ├── Collection (Interface) (1.2)
 │   ├── List (Interface)
 │   │   ├── ArrayList
 │   │   ├── LinkedList
 │   │   └── Vector (Legacy)
 │   ├── Set (Interface)
 │   │   ├── HashSet
 │   │   └── LinkedHashSet
 │   └── Queue (Interface)
 │       └── PriorityQueue
 └── Map (Interface) [Not part of Collection interface]
     ├── HashMap
     ├── LinkedHashMap
     └── TreeMap
```

## 🧰 Key Interfaces & Implementations

### 1. **List**

- Ordered collection (insertion order).
    
- Allows duplicates.
    

| Class        | Description                                              |
| ------------ | -------------------------------------------------------- |
| `ArrayList`  | Dynamic array, fast for random access                    |
| `LinkedList` | Doubly linked list, good for frequent insertion/deletion |
| `Vector`     | Synchronized (legacy class)                              |

### 2. **Set**

- No duplicates.
    
- Unordered (except `LinkedHashSet` which maintains order).
    

|Class|Description|
|---|---|
|`HashSet`|Uses HashMap internally, unordered|
|`LinkedHashSet`|Maintains insertion order|
|`TreeSet`|Sorted set using Red-Black Tree (implements `NavigableSet`)|

### 3. **Queue / Deque**

- Designed for holding elements prior to processing.
    

|Class|Description|
|---|---|
|`PriorityQueue`|Elements ordered by natural ordering or comparator|
|`ArrayDeque`|Resizable array, supports both FIFO and LIFO|

### 4. **Map**

- Key-value pairs. Keys are unique.
    

|Class|Description|
|---|---|
|`HashMap`|Fast, no order guarantee|
|`LinkedHashMap`|Maintains insertion order|
|`TreeMap`|Sorted by keys|
|`Hashtable`|Legacy synchronized Map|
|`ConcurrentHashMap`|Thread-safe, concurrent Map|

---

## 📌 Features of Collection Framework

- **Unified Architecture** (common methods like `add()`, `remove()`, `size()`)
    
- **Polymorphic Algorithms** (`sort()`, `shuffle()`, `reverse()`, etc. in `Collections` class)
    
- **Thread-safety** via wrappers and concurrent classes
    
- **Extensibility** and **Generics Support**
    

---

## 🧠 Common Interview Questions & Answers

### 1. **What is the Java Collection Framework?**

> It is a set of classes and interfaces in `java.util` package for storing and manipulating groups of data as a single unit.

---

### 2. **What is the difference between ArrayList and LinkedList?**

|Feature|ArrayList|LinkedList|
|---|---|---|
|Storage|Dynamic array|Doubly linked list|
|Access time|Faster (O(1))|Slower (O(n))|
|Insertion/Deletion|Slower|Faster|

---

### 3. **HashSet vs TreeSet vs LinkedHashSet?**

| Feature       | HashSet   | TreeSet       | LinkedHashSet    |
| ------------- | --------- | ------------- | ---------------- |
| Order         | Unordered | Sorted        | Insertion order  |
| Null Elements | Allowed   | Only one null | One null allowed |
| Performance   | Fastest   | Slower        | Medium           |

---

### 4. **Difference between HashMap and Hashtable?**

|Feature|HashMap|Hashtable|
|---|---|---|
|Thread-safe|No|Yes|
|Performance|Faster|Slower|
|Null keys|Allowed (1)|Not allowed|

---

### 5. **When do you use a TreeMap?**

> When you want a sorted map based on the natural ordering of keys or a custom comparator.

---

### 6. **How does HashMap work internally?**

- Uses **hashCode()** and **equals()**.
    
- Stores entries in an array of buckets using hashing.
    
- Handles collisions via **LinkedList** (before Java 8) or **Red-Black Tree** (after Java 8).
    

---

### 7. **What is the difference between Collection and Collections?**

- `Collection` is an **interface** (List, Set, Queue).
    
- `Collections` is a **utility class** with static methods (like `sort()`, `reverse()`).
    

---

### 8. **What is fail-fast and fail-safe?**

|Feature|Fail-Fast|Fail-Safe|
|---|---|---|
|Example|`ArrayList`, `HashMap`|`ConcurrentHashMap`, `CopyOnWriteArrayList`|
|Behavior|Throws `ConcurrentModificationException`|Doesn’t throw, works on a copy|
|Thread-safe|No|Yes|

---

### 9. **What are some common methods in Collection interface?**

- `add()`, `remove()`, `size()`, `isEmpty()`, `iterator()`, `contains()`
    

---

### 10. **Which collection would you use for LRU cache?**

> `LinkedHashMap` with access order = true.

---

## 🧠 Bonus: Real-Time Scenarios

- **Use `HashMap`** for fast lookup by key.
    
- **Use `TreeSet`** when you need a sorted, unique collection.
    
- **Use `PriorityQueue`** for task scheduling based on priority.
    
- **Use `Deque`** when implementing stacks or double-ended queues.

A **Collection** in Java is simply a **group of objects** — a **single unit** that stores multiple elements together (like a container).  
It helps you **store, retrieve, manipulate, and communicate** data efficiently.

The **Collection Framework** is a **set of classes and interfaces** in the `java.util` package that implement **data structures** like Lists, Sets, and Maps.

It provides:

- **Interfaces** → define what operations are possible.
    
- **Classes** → provide concrete implementations (like ArrayList, HashSet, etc.).
    
- **Algorithms** → methods like sorting, searching, etc.