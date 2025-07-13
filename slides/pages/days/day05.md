---
layout: two-cols
transition: slide-left
---

# <DateTitle offset=4 />

<StartupBadge />

**Agenda**

- Imports / Packages
- *Break*
- Exception Handling
- *No worksheet today*

::right::

<Toc minDepth=2 maxDepth=3 mode="onlyCurrentTree" />

---

## Packages

<v-clicks depth=3>

- Large programs can be split into separate files
  - Improves organization
  - **Modularize** code
    - Use the same classes / functions across multiple projects
    - Share your code with others
- Related classes are grouped into **packages**
  - Only **top-level public** classes in a package can be accessed outside the package
    - Only one top-level public class per file. Must match file name
    - This will be clarified later
  - Classes in other packages can be **imported**

</v-clicks>

---

```java {all|1-3|1-3,12,15,19|5-6|5-6,16|7-8|10|all}
// We use an `import` statement to import classes from other packages.
import java.util.Scanner; // Importing the `Scanner` class from the `java.util` package.
import java.util.ArrayList; // Importing the `ArrayList` from the same package.

// This import all of the classes in a package.
import java.util.*;
// We do not recommend importing all classes.
// It can make your code less clear. You may forget which classes you are using.

public class Main { // Top-level public class.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // ...
        ArrayList<String> arr = new ArrayList<>();
        LinkedList<String> list = new LinkedList<>();
        // ...
        
        scan.close();
    }
}
```

---

### Creating / Using Custom Packages

<StartupBadge />

<v-clicks depth=3>

- In Binder, the `Main` class is already inside a package called `src.workbench`
  - The file `Main.java` is under the folder `workbench` inside the folder `src`
  - The name of a package should match the **directory** that the class is in
    - The directory in this case is `src/workbench/`

</v-clicks>

---
layout: two-cols-header
---

#### Example 1 - Java <logos-java />

::left::

**demo/MyClass.java**

```java {monaco-run} {autorun:false, runnerOptions:{entrypoint:false, file_path:'MyClass.java'}}
package demo;

public class MyClass { // `MyClass` is the top-level public class of `MyClass.java`
    public static void foo() {
        System.out.println("Foo");
    }
    public void bar() {
        System.out.println("Bar");
    }
}

class SecondClass { // `SecondClass` is top-level, but not public.
    public static void baz() {
        System.out.println("Baz");
    }
}
```

::right::

**demo/Main.java**

```java {monaco-run} {autorun:false, runnerOptions:{addSources:['MyClass.java']}}
package demo;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, world!");
        
        MyClass.foo();
        MyClass myObject = new MyClass();
        myObject.bar();
        
        // We can also access this class because it is in the same package.
        SecondClass.baz();
    }
}
```

<!-- Instructor should explain demos once they appear. -->

---
layout: two-cols-header
---

#### Example 2 - Java <logos-java />

::left::

**package1/MyClass.java**

```java {monaco-run} {autorun:false, runnerOptions:{entrypoint:false, file_path:'MyClass.java'}}
package package1; // Package #1

public class MyClass { // `MyClass` is the top-level public class of `MyClass.java`
    public static void foo() {
        System.out.println("Foo");
    }
    public void bar() {
        System.out.println("Bar");
    }
    public void baz() {
        SecondClass.baz();
    }
}

class SecondClass { // `SecondClass` is top-level, but not public.
    public static void baz() { // It cannot be accessed outside the package1 package.
        System.out.println("Baz");
    }
}
```

::right::

**package2/Main.java**

```java {monaco-run} {autorun:false, runnerOptions:{addSources:['MyClass.java']}}
package package2; // Package #2

import package1.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, world!");
        
        MyClass.foo();
        MyClass myObject = new MyClass();
        myObject.bar();
        
        // We cannot access this class because it is not top-level public.
        // SecondClass.baz();
    }
}
```

<!-- 
Instructor should explain demos once they appear.
Optionally, demo this in an external environment since today is far less busy.
-->

---

#### Example 3 - Python <logos-python />

<span v-mark.underline.red>We will not cover creating packages in Python, which **follows its own rules**.</span>  
But, here is an example of how to import packages in Python:

```python {monaco-run} {autorun:false}
import cowsay # Import the cowsay package.

cowsay.cow("MOO") # Call a function from the package.
```

---

## Break

Have a break!

<RandomPicture />

---


