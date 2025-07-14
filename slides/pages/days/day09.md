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

## Multithreading

The following example creates two threads.  
You can think of a thread as a task the program tries to do at the same time as other tasks.  
The threads in this example each print numbers independently of each other.

```java {monaco-run} {autorun:false}
public class Main {
    public static void main(String[] args) {
        System.out.println("Starting threads...");

        MyThread t1 = new MyThread("Thread A");
        MyThread t2 = new MyThread("Thread B");

        t1.start(); // The Java JVM will start Thread A, 
        t2.start(); // then proceed to start Thread B while Thread A is running.

        System.out.println("Threads started!");
        
        t1.join(); // Wait for Thread A to complete.
        t2.join(); // Wait for Thread B too.
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
