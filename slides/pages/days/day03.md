---
layout: two-cols
transition: slide-left
---

# <DateTitle offset=2 />

<StartupBadge />

**Agenda**

- Using Arrays
- String Manipulation
- *Break*
- Defining Functions
- Intro to Classes
- Control Flow
- *Worksheet*

::right::

<Toc minDepth=2 maxDepth=3 mode="onlyCurrentTree" />

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
- Defining an array:
<logos-java />
```java
String[] fruits = {"Apple", "Banana", "Cantaloupe"};
String[] fiveEmptyStrings = new String[5];
```
<logos-python /> <span text-sm>(Technically a **list**.)</span>
```py
fruits = ["Apple", "Banana", "Cantaloupe"]
```
- Arrays can be **subscripted** to access their **elements**
  - Each element in an array can be referred to by a number called an **index**
  - In Java and Python, indices (plural for index) <span v-mark.circle.pink="11">start from 0</span> 
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
- Getting the size / length of an array:
<logos-java />
```java
int fruitsCount = fruits.length;
```
<logos-python />
```py
fruits_count = len(fruits) # `len` is short for "length".
```
- <span v-mark.highlight.orange="13">Things to not do with arrays:</span>
  - Mix elements of different types
  - Attempt to access an element that does not exist (such as with an index that's too big or negative)
```java {monaco-run} {autorun:false}
public class Main {
    public static void main(String[] args) {
        String[] fruits = {"Apple", "Banana", "Cantaloupe"};
        
        String someFruit = fruits[3]; // Invalid index.
        System.out.println(somefruit);
    }
}
```

</v-clicks>

<!-- In demo, demonstrate that negative indices and mixing types don't work. Negative indices do work in Python, but that's outside the scope of this. -->

---

### Arrays in Computer Memory

Elements in an array are stored next to each other with incremental indices.

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

<v-click>

<!-- Ask students what the output will be before revealing it. -->

---

### Multidimensional Arrays in Computer Memory

Consider the matrix from the previous slide.
```java
int[][] matrix = {
    {2, 4, 6}, 
    {8, 10, 12}, 
    {14, 16, 18}
};
```

<Excalidraw drawFilePath="/days/day03/arrays_2.excalidraw.json" darkMode />

---

## String Manipulation

<v-clicks>

- Inside a string is an **array of characters**
```java
// Kind of like this:
char[] insideString = {'h', 'e', 'l', 'l', 'o'};
```
- We can use indices to access each character in a string
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
c = s[0] # Get character at index 7.
print(c)
```
- We can also use indices to get a specific part of a string
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
- The addition operator `+` works with strings. It's fairly obvious what it does
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
- Getting the size / length of a string
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
- **There are more ways to manipulate strings (like replacing parts of a strings with `.replace`). Learn more here: [Java: docs.oracle.com](https://docs.oracle.com/javase/tutorial/java/data/manipstrings.html) [Python: docs.python.org](https://docs.python.org/3/library/stdtypes.html#string-methods)**

</v-clicks>

<!-- Also ask for guesses before running examples. Note that the `charAt` and `length` are a methods. We will learn more about methods soon. -->

---

## Break

Have a break!

<RandomPicture />

---


