---
layout: two-cols
transition: slide-left
---

# <DateTitle offset=2 />

<StartupBadge />

**Agenda**

- Review basic I/O
- Using Arrays
- String Manipulation
- Basic Escape Sequences
- *Break*
- Defining Functions
- Intro to Classes
- *Worksheet*

::right::

<Transform scale=0.9>

<Toc minDepth=2 maxDepth=3 mode="onlyCurrentTree" />

</Transform>

<!-- Next slide contains a review of declaring arrays and strings. -->

---
src: day01.md#18
---

---

## Arrays

<v-clicks depth=3>

- An array is a collection of multiple pieces of data
  - An array is a kind of **data structure** <span text-sm>, because it structures other pieces of data</span>
  - We call these pieces of data **elements**
  - An array is *fixed-size*, meaning that it <span v-mark.underline.pink="4">always has the same number of elements</span>
    - Python uses **lists**, which are similar to arrays
    - For now, we will treat them as the same thing
  - Most of the time, every **element** in an array will be of the same **data type**

</v-clicks>

---

<v-clicks depth=3>

- Defining an array:<br>
  <logos-java />
  ```java
  String[] fruits = {"Apple", "Banana", "Cantaloupe"};
  String[] fiveEmptyStrings = new String[5];
  int[] fiveZeroes = new int[5];
  ```
  <logos-python /> <span text-sm>(Technically a **list**.)</span>
  ```py
  fruits = ["Apple", "Banana", "Cantaloupe"]
  ```
- Arrays can be **subscripted** to access their **elements**
  - Each element in an array can be referred to by a number called an **index**
  - In Java and Python, indices (plural for index) <span v-mark.circle.pink="4">start from 0</span><br>
    <logos-java />
    ```java
    String firstFruit = fruits[0]; // The string "Apple" is at index 0.
    String secondFruit = fruits[1]; // The string "Banana" is at index 1.
    ```
    <logos-python />
    ```py
    first_fruit = fruits[0] # "Apple", same for Python.
    second_fruit = fruits[1] # "Banana"
    ```

</v-clicks>

---

<v-clicks depth=3>

- Getting the size / length of an array:<br>
  <logos-java />
  ```java
  int fruitsCount = fruits.length;
  ```
  <logos-python />
  ```py
  fruits_count = len(fruits) # `len` is short for "length".
  ```
- <span v-mark.highlight.orange="2">Things to not do with arrays:</span>
  - Mix elements of different types
  - Attempt to access an element that does not exist (such as with an index that's too big or negative)

</v-clicks>
<v-click>

```java {monaco-run} {autorun:false}
public class Main {
    public static void main(String[] args) {
        String[] fruits = {"Apple", "Banana", "Cantaloupe"};
        
        String someFruit = fruits[3]; // Invalid index.
        System.out.println(someFruit);
    }
}
```

</v-click>

<!-- In demo, demonstrate that negative indices and mixing types don't work. Negative indices do work in Python, but that's outside the scope of this. -->

---

### Arrays in Computer Memory

Elements in an array are sequentially stored with incremental indices.

```java
int[] nums = {5, 10, 15, 20};
```

<Excalidraw drawFilePath="/days/day03/arrays_1.excalidraw.json" darkMode />

---

## Multidimensional Arrays

You can have arrays as elements of other arrays.  
**The Multidimensional Array**

```java {monaco-run} {autorun:false}
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] matrix = {
            {2, 4, 6}, 
            {8, 10, 12}, 
            {14, 16, 18}
        };
        System.out.println(Arrays.toString(matrix[1]));
        System.out.println(matrix[1][2]);
    }
}
```

<v-click>

```py
# Same array in Python.
matrix = [[2, 4, 6], [8, 10, 12], [14, 16, 18]]
```

</v-click>

<!-- Ask students what the output will be before revealing it. -->

---
layout: two-cols-header
---

### Multidimensional Arrays in Computer Memory

::left::

Consider the matrix from the previous slide.
```java
int[][] matrix = {
    {2, 4, 6}, 
    {8, 10, 12}, 
    {14, 16, 18}
};
```

::right::

<Excalidraw drawFilePath="/days/day03/arrays_2.excalidraw.json" darkMode />

---

## String Manipulation

<v-clicks depth=2>

- Inside a string is an **array of characters**<br>
  <logos-java />
  ```java
  // Kind of like this:
  char[] insideString = {'h', 'e', 'l', 'l', 'o'};
  ```
  - We can use indices to access each character in a string <carbon-arrow-right />

</v-clicks>

---

<logos-java />
```java {monaco-run} {autorun:false}
public class Main {
    public static void main(String[] args) {
        String s = "Hello, world!";
        char c = s.charAt(7); // Get character at index 7.
        System.out.println(c);
    }
}
```
<logos-python />
```python {monaco-run} {autorun:false}
s = "Hello, world!"
c = s[7] # Get character at index 7.
print(c)
```

---

- We can also use indices to get a specific part of a string

<v-click>

<logos-java />
```java {monaco-run} {autorun:false}
public class Main {
    public static void main(String[] args) {
        //          0123456789...
        String s = "Hello, world!";
        // Get a substring from string `s`, starting at index 0 and stopping right before index 5.
        String s2 = s.substring(0, 5);
        System.out.println(s2);
    }
}
```
<logos-python />
```python {monaco-run} {autorun:false}
#    0123456789...
s = "Hello, world!"
# Get a substring starting at index 0 and stopping right before index 5.
s2 = s[0:5]
print(s2)
```

</v-click>

---
zoom: 0.85
---

<v-clicks depth=2>

- The addition operator `+` works with strings. It's fairly obvious what it does<br>
  <logos-java />
  ```java
  String s1 = "Hello, ";
  String s2 = "world!";
  String s3 = s1 + s2; // --> s3 is "Hello, world!"
  ```
  <logos-python />
  ```py
  s1 = "Hello, "
  s2 = "world!"
  s3 = s1 + s2 # --> s3 is "Hello, world!"
  ```
- Getting the size / length of a string<br>
  <logos-java />
  ```java
  String s = "...";
  int stringLength = s.length(); // Notice that the empty parenthesis "()" are required.
  ```
  <logos-python />
  ```py
  s = "..."
  str_len = len(s)
  ```
- **There are more ways to manipulate strings (like replacing parts of a strings with `.replace`).  
  Learn more here:  
  [Java: docs.oracle.com](https://docs.oracle.com/javase/tutorial/java/data/manipstrings.html)  
  [Python: docs.python.org](https://docs.python.org/3/library/stdtypes.html#string-methods)**

</v-clicks>

<!-- Also ask for guesses before running examples. Note that the `charAt` and `length` are a methods. We will learn more about methods soon. -->

---

## Basic Escape Sequences

<v-clicks depth=2>

- When defining *strings* and *characters* in Java and Python, some characters cannot be usde directly.
```python {monaco-run} {autorun:false}
fail_string = "This is an "invalid string""
```

</v-clicks>

---

<v-clicks depth=2>

- In the previous example, the double quote character (`"`) is already used to indicate the start and end of a string
  - Using more double quote characters within the string "confuses" the programming language as to where the string starts, and where it ends.
- To use double quotes inside a string, we can use a backslash (`\`)

</v-clicks>
<v-click>

```python {monaco-run} {autorun:false}
fail_string = "This is a \"valid string\"" # The \ character "escapes" the double quote.
print(fail_string) # Notice that the \ character is not printed, but the double quotes are printed.
```

</v-click>

---

<v-clicks depth=2>

  - The sequence of characters `\"` is called an **escape sequence**
  - Inside a string `\"` is replaced by `"`
- Characters to **not** use inside strings / characters and their **escape sequence**:
  - `"` <carbon-arrow-right /> `\"`
  - `'` <carbon-arrow-right /> `\'`
  - `\` <carbon-arrow-right /> `\\`
  - See the <Link to="keyboard_map">keyboard map</Link> to locate the `\` character
- Escape sequences can also insert invisble characters
  - The newline (LF) character <carbon-arrow-right /> `\n`
  - The tab character <carbon-arrow-right /> `\t`
  - See the <Link to="ascii_table">ASCII Table</Link> for more

</v-clicks>
<v-click>

```python {monaco-run} {autorun:false}
print("This string prints \" \' \n \t escape sequences.")
```

</v-click>

---

## Break

Have a break!

<RandomPicture />

---

## Functions / Methods

<v-clicks depth=2>

- A **function**, also called a **method**, is a block of code that can be reused in varying contexts
  - This definition is unclear; let's see some examples
- Say that we have a math function $f(x)=2^x*100$
  - $f(0)=$<v-click at="5">$100$</v-click>
  - $f(1)=$<v-click at="6">$200$</v-click>
  - $f(5)=$<v-click at="7">$3200$</v-click>
- If we have a complicated formula, we can simplify it with our function
  - $2^5*100+2^1*100+2^0*100\Rightarrow f(5)+f(1)+f(0)=3200+200+100=3500$
- We can do the same thing in languages like Java and Python
- Functions have four parts:
  - *return type*
  - *name*
  - *parameters*
  - *definition*
    - Might include: *return value* (if *return type* is not `void`)

</v-clicks>

<!-- It's okay if younger students haven't learned mathematical functions yet. -->

---

### Example 1 - Java <logos-java />

Our goal: Ask the user for two names <span v-mark.underline.white>using the same prompt</span> and output them together.

<Transform scale=0.85>

````md magic-move
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter name #1");
        String name1 = scan.nextLine();
        
        System.out.println("Enter name #2");
        String name2 = scan.nextLine();
        
        System.out.println(name1 + " and " + name2);
        
        scan.close();
        
        // This is too much typing!
    }
}
```
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String prompt = "Enter name #";
        
        System.out.println(prompt + "1");
        String name1 = scan.nextLine();
        
        System.out.println(prompt + "2");
        String name2 = scan.nextLine();
        
        System.out.println(name1 + " and " + name2);
        
        scan.close();
        
        // We can change the prompt from one place instead of two.
        // Better, but we can do more!
    }
}
```
```java
import java.util.Scanner;

public class Main {
    
    private static Scanner scan = null; // This is a global variable.
    
    public static void main(String[] args) {
        scan = new Scanner(System.in);
        
        String name1 = prompt(1);
        String name2 = prompt(2);
        
        System.out.println(name1 + " and " + name2);
        
        scan.close();
        
        // We have turned the prompting process into a function!
    }
    
    private static String prompt(int num) {
        System.out.println("Enter name #" + num);
        String name = scan.nextLine();
        return name;
    }
}
```
```java
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    
    private static Scanner scan = null; // This is a global variable.
    
    public static void main(String[] args) {
        scan = new Scanner(System.in);
        
        String[] manyNames = {prompt(1), prompt(2), prompt(3), prompt(4)};
        
        System.out.println(Arrays.toString(manyNames));
        
        scan.close();
        
        // We can use the same `prompt` many times!
        // Less typing, more coding!
    }
    
    private static String prompt(int num) {
        System.out.println("Enter name #" + num);
        String name = scan.nextLine();
        return name;
    }
}
```
````

</Transform>

<!-- 
Copy-paste first and final transition into external environment and run from there.
Explain each part of function definition, including return value. 
> Will learn more about access modifers later!
> Arguments are 1, 2, 3, 4.
Explain the global variable.

Inform students that the main method is also a function, just a special one.
We won't break it down since it makes for a good worksheet exercise.
-->

---

### Example 2 - Java <logos-java />

This example shows how to define a function with **multiple parameters** and **no return value**.  
Goal: Calculate and output the *area* and *circumference* of two circles.  
$$
A(r)=\pi*r^2\\
P(r)=2*\pi*r
$$

<RenderWhen context="print">
<span text-sm>

The code below will be cut off by the page during export. Please view the full file here: <Link to="unavailable">FunctionsExample2.java</Link>

</span>
</RenderWhen>

<<< @/snippets/FunctionsExample2.java java {monaco-run} {autorun:false, height:'200px'}

<!-- Arguments start with the radii, then are passed down as the areas and circumferences. -->

---

### Examples - Python <logos-python />

These are the same as the two prior examples, but written using Python.  
<span v-mark.underline.pink>Python automatically infers the types for the *return type* and *parameters*.</span>

#### Example 1

```py
def prompt(num): # <-- notice that Python uses a single colon ":" instead of curly braces "{}".
    return input(f"Enter name #{num}\n")

names = [prompt(1), prompt(2), prompt(3), prompt(4)]

print(names)
```

Continued <carbon-arrow-right />

<!-- 
Instructor can skip this slide completely.
First example needs to be run in an external environment. 
-->

---

#### Example 2

```py
pi = 3.14159

# All Python functions start with `def`.
def area(radius):
    return pi * radius * radius

def circumference(radius):
    return 2 * pi * radius

def output_circle_info(r, a, c):
    print("Circle Info:")
    print(f"Radius: {r}")
    print(f"Area: {a}")
    print(f"Circumference: {c}")

radius1 = 3
radius2 = 9

a1 = area(radius1)
a2 = area(radius2)

c1 = circumference(radius1)
c2 = circumference(radius2)

output_circle_info(radius1, a1, c1)
output_circle_info(radius2, a2, c2)
```

<!-- Instructor can skip this slide completely. -->

---

### Global Variables

<v-clicks>

In the past few Java examples, we saw the use of **global variables** or "class-scope variables".

```java
private static Scanner scan = null;
```
```java
private static final double pi = 3.14159;
```

And with Python...
```py
pi = 3.14159
```

</v-clicks>
<v-clicks>

- <span v-mark.highlight.purple="6">Global variables are available to all functions!</span>
- Useful for values which don't change (*constants*)
- The `final` keyword used when declaring the global variable `pi` tells Java that the value of `pi` cannot be changed to something other than 3.14159.
- The `static` keyword will be discussed later

</v-clicks>

---

### Summary

<Transform scale=0.9>

<Excalidraw drawFilePath="/days/day03/functions.excalidraw.json" darkMode />

</Transform>

---

## Intro to Classes

<v-clicks depth=2>

- Let's say that we want to store information about multiple people
- We can use arrays:
  ```java
  String[] names  = {   "Alice",      "Bob", "Charlie"};
  int[]    ages   = {        20,         21,        25};
  String[] cities = {"Shanghai", "New York",  "London"};
  ```
- To get an individual person:
  ```java
  String name = names[0]; // Alice
  int age = ages[0]; // 20
  String city = cities[0]; // Shanghai
  ```

</v-clicks>

---

<v-clicks depth=2>

- This is an inefficient way of storing and retrieving data!
- **Classes** allow us to *abstract* our data
  - A **class** is like a blueprint for how to construct something
  - An **object** is like a thing made from a **class's** "blueprint"
- A **class** has components called **members**
  - There are multiple kinds of members
  - **attributes** - variables contained within a class
  - **methods** - functions which are a part of a class
  - **constructors** - *special methods* which define how to create objects from a class
    - When we create an *object* from a *class*, we call it *instantiation*
  - **static members** - if an **attribute** or **method** is *static*, it means that the member is associated with the class, and not an object
    - Useful for defining *constants* and extra functions
- We will only be looking at classes in Java

</v-clicks>

---

### Example

<RenderWhen context="print">
<span text-sm>

The code below will be cut off by the page during export. Please view the full file here: <Link to="unavailable">class_example.java</Link>

</span>
</RenderWhen>

<<< @/snippets/ClassExample.java java {monaco-run} {autorun:false, height:'300px'}

<!-- 
The instructor will be required to elaborate upon each of the comments.

If time permits, use an external environment (it may be faster) to demonstrate getters and setters.
-->

---

## Worksheet

[Click here to access the worksheet.](worksheets/worksheet03/worksheet03.pdf)

[Click here to access the answer key.](worksheets/worksheet03/answers03.pdf)

[Bonus worksheet (one question, if you're willing).](worksheets/worksheet03/bonus03.pdf)

[Bonus worksheet answer key.](worksheets/worksheet03/bonus_answers03.pdf)
