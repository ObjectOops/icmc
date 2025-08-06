---
layout: two-cols
transition: slide-left
---

# <DateTitle offset=10 />

<StartupBadge />

**Agenda**

- Multithreading
- *Break*

::right::

<Toc minDepth=2 maxDepth=3 mode="onlyCurrentTree" />

---
routeAlias: multithreading
---

## Multithreading

The following example creates two threads.  
You can think of a thread as a task the program tries to do at the same time as other tasks.  
The threads in this example each print numbers independently of each other.  
<carbon-arrow-right />

---
zoom: 0.8
---

```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Starting threads...");

        MyThread t1 = new MyThread("Thread A");
        MyThread t2 = new MyThread("Thread B");

        t1.start(); // The Java JVM will start Thread A, 
        t2.start(); // then proceed to start Thread B while Thread A is running.

        System.out.println("Threads started!");
        
        try {
            t1.join(); // Wait for Thread A to complete.
            t2.join(); // Wait for Thread B too.
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}

class MyThread extends Thread {
    private String name;

    public MyThread(String name) {
        this.name = name;
    }

    public void run() {
        for (int i = 1; i < 10; ++i) {
            System.out.println(name + " - " + i);
        }
    }
}
```

<!-- Run example in external environment. -->

---

```py
from threading import Thread

def task(name):
    for i in range(1, 11):
        print(name + " - " + str(i))

print("Starting threads...")

t1 = Thread(target=task, args=["Thread A"])
t2 = Thread(target=task, args=["Thread B"])

t1.start(); # The Python interpreter will start Thread A, 
t2.start(); # then proceed to start Thread B while Thread A is running.

print("Threads started!")

t1.join(); # Wait for Thread A to complete.
t2.join(); # Wait for Thread B too.
```

---

## Tomorrow

Share your projects with us!  
We will be presenting them tomorrow.  
If you don't want to share or aren't done yet, that's okay too.
