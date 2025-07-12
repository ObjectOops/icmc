---
layout: two-cols
transition: slide-left
---

# <DateTitle offset=2 />

<StartupBadge />

**Agenda**

- Review arrays and functions
- Boolean Expressions
- Conditionals
- Loops
- *Break*
- Pass by value vs. pass by reference
- Basic Runtime Complexity
- Data structures beyond arrays
- *Worksheet*

::right::

<Toc minDepth=2 maxDepth=3 mode="onlyCurrentTree" />

---
src: day03.md#4-5,23
---

---

## Boolean Expressions

### Comparison Operators

<v-clicks depth=2>

- This is the multiplication operator: `*`
  - What needs to be on either side of it to work? <v-click>Two integers or floating-point values</v-click>
  - What does it return? <v-click>An integer if both values are integers, a floating-point if at least one value is an integer</v-click>
- This is the equality operator: `==`
  - What needs to be on either side of it to work? <v-click hide>(Guess!)</v-click><v-click at="+0">Two variable of compatible primitive types, like an integer and an integer, or a double and an integer</v-click>
  - What does it return? <v-click hide>(Guess!)</v-click><v-click at="+0">**A boolean value**</v-click>
- List of comparison operators:
  - `==` <carbon-arrow-right /> equality operator, tests if two values are equal
    - <span text-sm>The single equals sign `=` is already used as the assignment operator!</span>
  - `!=` <carbon-arrow-right /> inequality operator, tests if two values are not equal
  - `<` <carbon-arrow-right /> less than
  - `>` <carbon-arrow-right /> greater then
  - `<=` <carbon-arrow-right /> less than or equal to
  - `>=` <carbon-arrow-right /> greater than or equal to

</v-clicks>

<!-- Will discuss comparing reference types later. -->

---

```python {monaco-run} {autorun:false}
num1 = 5
num2 = 7.0

bool1 = True
bool2 = False

print(f"num1 == num2: {num1 == num2}")
print(f"num1 != num2: {num1 != num2}")
print(f"num1 + 2 == num2: {num1 == num2}")
print(f"num1 + 2 != num2: {num1 != num2}")
print(f"num1 < num2: {num1 < num2}")
print(f"num1 > num2: {num1 > num2}")

print(f"bool1 == bool2: {bool1 == bool2}")
print(f"bool1 != bool2: {bool1 != bool2}")
print(f"not bool1 == bool2: {not bool1 == bool2}")
print(f"not bool1 != bool2: {not bool1 != bool2}")
# Note that in Java, the not operator is `!`, so replace "not" above with `!`.
# Example: !bool1 == bool2
```

<!-- Solve examples manually before running. -->

---

### Logical Operators

<v-clicks depth=2>

- A logical operator takes boolean value(s) and outputs a boolean value
- Operators:
  - Java <logos-java />:
    - `&&` <carbon-arrow-right /> AND operator
    - `||` <carbon-arrow-right /> OR operator
    - `!` <carbon-arrow-right /> NOT operator
  - Python <logos-python />:
    - `and` <carbon-arrow-right /> AND operator
    - `or` <carbon-arrow-right /> OR operator
    - `not` <carbon-arrow-right /> NOT operator

</v-clicks>

---

#### AND Operator

<v-clicks>

Given two boolean values (*A*, *B*), the AND operator returns *true* if and only if *A* AND *B* are both *true*.

The following shows the **truth table** for AND.  
A **truth table** shows all possible cominations of inputs, and the corresponding outputs.

| AND | A=0 | A=1 |
| :---: | :---: | :---: |
| B=0 | 0 | 0 |
| B=1 | 0 | 1 |

</v-clicks>

---

#### OR Operator

<v-clicks>

Given two boolean values (*A*, *B*), the OR operator returns *true* if *A* is *true* OR *B* is *true*.

| OR | A=0 | A=1 |
| :---: | :---: | :---: |
| B=0 | 0 | 1 |
| B=1 | 1 | 1 |

</v-clicks>

<!-- Develop truth table by hand before revealing answer. -->

---

#### NOT Operator

<v-clicks>

Given **a single** boolean value (*A*), the NOT operator returns the opposite of *A*.

| NOT |  |
| :---: | :---: |
| A=0 | 1 |
| A=1 | 0 |

</v-clicks>

<!-- Develop truth table by hand before revealing answer. -->

---

<v-click>

Let's say that Mr. Dijkstra (a very famous computer scientist) wants to get from the city of Rotterdam to Groningen, but he needs to pass through some other cities inbetween.

These are the distances between the cities:
| Distances (km) | Rotterdam | Amsterdam | Utrecht | Groningen |
| :---: | :---: | :---: | :---: | :---: |
| Rotterdam | 0 | 65 | 55 | ? |
| Amsterdam | 65 | 0 | 40 | 180 |
| Utrecht | 55 | 40 | 0 | 180 |
| Groningen | ? | 180 | 180 | 0 |

However, he only wants to know which route**s** meet **at least one** of these criteria:
- If the route is the shortest
- The distance of the route **is not** divisible by 7 or 11

---

#### Example - Java <logos-java />

```java {monaco-run} {autorun:false}
public class Main {
    public static void main(String[] args) {
        int r_to_a = 65;
        int r_to_u = 55;
        int a_to_u = 40;
        int u_to_a = 40;
        int a_to_g = 180;
        int u_to_g = 180;

        int path_1 = r_to_a + a_to_g;
        int path_2 = r_to_u + u_to_g;
        int path_3 = r_to_a + a_to_u + u_to_g;
        int path_4 = r_to_u + u_to_a + a_to_g;
        
        boolean path_1_valid = isPathValid(path_1, path_2, path_3, path_4)
        boolean path_2_valid = isPathValid(path_2, path_1, path_3, path_4)
        boolean path_3_valid = isPathValid(path_3, path_1, path_2, path_4)
        boolean path_4_valid = isPathValid(path_4, path_1, path_2, path_3)

        System.out.println("Rotterdam --> Amsterdam --> Groningen: " + path_1_valid)
        System.out.println("Rotterdam --> Utrecht --> Groningen: " + path_2_valid)
        System.out.println("Rotterdam --> Amsterdam --> Utrecht --> Groningen: " + path_3_valid)
        System.out.println("Rotterdam --> Utrecht --> Amsterdam --> Groningen: " + path_4_valid)
    }
    
    public static boolean isPathValid(int main_path, int other_path_a, int other_path_b, int other_path_c) {
        // This is the main boolean expression that return `true` if the path meets Dijkstra's criteria.
        return (
            (main_path <= other_path_a && main_path <= other_path_b && main_path <= other_path_c)
            || (main_path % 7 != 0 && main_path % 11 != 0)
        );
        // There can be multiple ways to write a boolean expression:
        // return (
        //     !(main_path > other_path_a || main_path > other_path_b || main_path > other_path_c)
        //     && !(main_path % 7 == 0 || main_path % 11 == 0)
        // );
    }
}
```

<!-- 
Calculate demo manually first.
Instructor: an on-the-spot drawn map of the cities might help.
-->

---

#### Example - Python <logos-python />

```python {monaco-run} {autorun:false}
r_to_a = 65
r_to_u = 55
a_to_u = 40
u_to_a = 40
a_to_g = 180
u_to_g = 180

path_1 = r_to_a + a_to_g
path_2 = r_to_u + u_to_g
path_3 = r_to_a + a_to_u + u_to_g
path_4 = r_to_u + u_to_a + a_to_g

def is_path_valid(main_path, other_path_a, other_path_b, other_path_c):
    # This is the main boolean expression that return `True` if the path meets Dijkstra's criteria.
    return (
        (main_path <= other_path_a and main_path <= other_path_b and main_path <= other_path_c)
        or (main_path % 7 != 0 and main_path % 11 != 0)
    )
    # There can be multiple ways to write a boolean expression:
    # return (
    #     not (main_path > other_path_a or main_path > other_path_b or main_path > other_path_c)
    #     and not (main_path % 7 == 0 or main_path % 11 == 0)
    # )

path_1_valid = is_path_valid(path_1, path_2, path_3, path_4)
path_2_valid = is_path_valid(path_2, path_1, path_3, path_4)
path_3_valid = is_path_valid(path_3, path_1, path_2, path_4)
path_4_valid = is_path_valid(path_4, path_1, path_2, path_3)

print(f"Rotterdam --> Amsterdam --> Groningen: {path_1_valid}")
print(f"Rotterdam --> Utrecht --> Groningen: {path_2_valid}")
print(f"Rotterdam --> Amsterdam --> Utrecht --> Groningen: {path_3_valid}")
print(f"Rotterdam --> Utrecht --> Amsterdam --> Groningen: {path_4_valid}")
```

</v-click>

---

## Conditionals

<v-clicks depth=2>

- Conditionals allow us to control the flow of execution in our code
  - Use boolean expressions to determine which code should run
  - Made of **if-else statements**
- For instance: play an animation **if** *the user presses a button, **else** tell the user to press the button

</v-clicks>

---

#### Example - Java <logos-java />

```java {monaco-run} {autorun:false}
public class Main {
    public static void main(String[] args) {
        int num1 = 3;
        int num2 = 5;
        boolean bool1 = true;
        boolean bool2 = false;
        
        // These outer parenthesis "(expr)" are necessary.
        if (num1 < num2) { // Case 1: Runs if num1 < num2.
            System.out.println("num1 < num2");
        } else if (num1 == num2) { // Case 2: Runs if Case 1 did not run and num1 == num2.
            System.out.println("num1 == num2");
        } else { // If both Case 1 and Case 2 did not run, then num1 > num2.
            System.out.println("num1 > num2");
        }
        
        if (bool1 || bool2) { // Case 1: Runs if bool1 is true OR bool2 is true.
            System.out.println("OR");
        }
        if (bool1 && bool2) { // This is a separate case! It doesn't depend on Case 1!
            System.out.println("AND");
        } else {
            System.out.println("At least one is false.");
        }
    }
}
```

<!-- Trace by hand first. Demonstrate the example by changing values / expressions. -->

---

#### Example - Python <logos-python />

```python {monaco-run} {autorun:false}
num1 = 3
num2 = 5
bool1 = True
bool2 = False

# Python does not need the outer parenthesis "(expr)" and uses a colon ":".
if num1 < num2: # Case 1: Runs if num1 < num2.
    print("num1 < num2")
# Instead of "else if" Python uses a single word "elif".
elif num1 == num2: # Case 2: Runs if Case 1 did not run and num1 == num2.
    print("num1 == num2")
else: # If both Case 1 and Case 2 did not run, then num1 > num2.
    print("num1 > num2")

if bool1 or bool2: # Case 1: Runs if bool1 is true OR bool2 is true.
    print("OR")

if bool1 and bool2: # This is a separate case! It doesn't depend on Case 1!
    print("AND")
else:
    print("At least one is false.")
```

<!-- Instructor can skip this slide completely. -->

---

## Loops

<v-clicks depth=2>

- Loops allow us to run a block of code multiple times
- Very similar to conditionals
  - A loop will run if a specific boolean expression is *true*
- There are four kinds of loops:
  - `while` loops
  - `for` loops
  - *for-each* loops
  - *do-while* loops
- Loops can be stopped by any point by using a `break` statement

</v-clicks>

---

### `while` Loop

A while loop will run as long as a boolean expressionis *true*.

<v-click>

The following examples print the integers 0 to 9.

<logos-java />

```java {monaco-run} {autorun:false}
public class Main {
    public static void main(String[] args) {
        int num = 0;
        
        while (num < 10) {
          System.out.print(num + " ");
          ++num; // This is the prefix increment operator.
          // It does the same thing as num = num + 1.
        }
    }
}
```

</v-click>
<v-click>

<logos-python />

```python {monaco-run} {autorun:false}
num = 0
while num < 10:
    print(f"{num} ", end='')
    num += 1 # Python does not have the prefix increment operator.
    # However, num += 1 is also the same thing as num = num + 1.
    # The += operator also works in Java.
```

</v-click>

<!-- 
Fiddle with these example to demonstrate.
Emphasize that 10 is never printed because the expression evaluates to false.
-->

---

### `for` Loop

<v-clicks depth=2>

- A `for` loop has three parts:
  - *initialization statement* <carbon-arrow-right /> initializes a variable
    - Often used during the loop
  - *condition* <carbon-arrow-right /> a condition that indicates if the body of the for loop should run (like the `while` loop)
  - *update statement* <carbon-arrow-right /> a statement that does something at the end of **each loop*
   - Often used to update variables that control the loop

</v-clicks>
<v-click>

The following examples print the *even integers* from 0 to 20.

<logos-java />

```java {monaco-run} {autorun:false}
public class Main {
    public static void main(String[] args) {
        // int i = 0;
        
        // Notice that we use i <= 20 so that i == 20 will be true.
        for (int i = 0; i <= 20; i += 2) { // i += 2 ensures that only even numbers will be calculated.
            System.out.print(num + " ");
        }
    }
}
```

</v-click>
<v-click>

<logos-python />

```python {monaco-run} {autorun:false}
# for-loops in Python are weird. You can just pay attention to how to use them.
for i in range(20):
    if i % 2 == 0: # If i is even.
      print(f"{num} ", end='')
```

</v-click>

<!-- 
Fiddle with these example to demonstrate.
Show that num can also be outside the loop; that the initialization and update portions of the loop can be optionally omitted.
Can skip for loops for Python since it's weird.
-->

---

### *for-each* loops

<v-clicks>

- These loops are useful when going through the elements of an array **in order**

</v-clicks>
<v-click>

The following examples print the elements in an array of strings.

<logos-java />

```java {monaco-run} {autorun:false}
public class Main {
    public static void main(String[] args) {
        String[] arr = {"Alice", "Bob", "Charlie"};
        
        for (String s : arr) {
            System.out.print(s + " ");
        }
    }
}
```

</v-click>
<v-click>

<logos-python />

```python {monaco-run} {autorun:false}
arr = ["Alice", "Bob", "Charlie"]

for s in arr:
    print(s)
```

</v-click>

---

### *do-while* loops

<v-clicks depth=2>

- *do-while* loops are rarely used
  - Checks if the condition is true **after** running the body / block of code
  <span text-sm>(a `while` loop check the condition **before** running)</span>
  - Can help in some specific cases
- Java has *do-while* loops, but <span v-mark.underline.pink="4">Python does not</span>

</v-clicks>
<v-click>

The following example continuously asks the user to enter "confirm" before executing the rest of the program.

<logos-java />

```java
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String input;
        do {
            System.out.print("Please enter \"confirm\": ");
            input = scan.nextLine();
        } while (!input.equals("confirm")); // We will discuss why comparing Strings is tricky later.
        
        scan.close();
    }
}
```

</v-click>

<!-- Example must be run in an external environment. -->

---

### `break` statement

To stop and break out of a loop, use the `break` statement.

<v-click>

<logos-java />

```java {monaco-run} {autorun:false}
public class Main {
    public static void main(String[] args) {
        int num = 0;
        while (true) {
            System.out.print(num);
            if (num == 9) {
                break; // Breaks the loop.
            }
            System.out.print(" | ");
        }
        // Execution jumps to here when `break` executes.
        System.out.println("\nDone");
    }
}
```

</v-click>
<v-click>

<logos-python />

```python {monaco-run} {autorun:false}
num = 0
while True:
    print(num, end='')
    if num == 9:
        break
    print(" | ", end='')
print("\nDone")
```

</v-click>

---

## Break

Have a break!

<RandomPicture />

---

## Pass by reference vs. pass by value

<v-clicks depth=2>

- Notice testing if `input` was not equal to "confirm" in the previous example
  - `!input.equals("confirm")`
  - *not input string equals "confirm"*
- The `String` type is a *reference type*
  - Other reference types include *arrays*, the `Scanner`, and any *classes*
  - <span v-mark.highlight.red="6">We cannot use the equality operator `==` on reference types</span>

</v-clicks>

### Variables in Computer Memory

<v-clicks depth=2>

- Many modern computers break data into **bytes**
  - A **byte** is 8 **bits**
  - A **bit** is a single binary state state, `1` or `0`
  - Recall: A 32-bit integer has "31 binary digits and 1 bit to indicate the sign"
    - <Link to="bits">Link to slide</Link>
- In these systems, each **byte** has an **address** that represents where it is in computer memory

</v-clicks>
<v-click>

<Excalidraw drawFilePath="/days/day04/bytes.excalidraw.json" darkMode />

</v-click>

---

<v-clicks>

- *primitive types* like `int`, `double`, `char`, `boolean`:
  - Variable contains data in bytes
- *reference types* like `String`, `Scanner`, *arrays*, any *classes*:
  - Variable contains <span v-mark.underline.pink="2">address to data in bytes</span>
  <span text-sm>(simplification)</span>
- **If we use the equality operator `==` on reference types, it compares the addresses, not the data**

</v-clicks>

---

<Excalidraw drawFilePath="/days/day04/by_reference.excalidraw.json" darkMode />

---

### Example 1 - Java <logos-java />

```java {monaco-run} {autorun:false}
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Comparing Strings
        String s1 = "hello";
        String s2 = "hello";
        // Incorrect
        System.out.println(s1 == s2);
        // Correct
        System.out.println(s1.equals(s2));
        
        // Comparing Arrays
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};
        // Incorrect
        System.out.println(arr1 == arr2);
        // Correct
        Arrays.equals(arr1, arr2);
        Arrays.deepEquals(arr1, arr2); // Use for multidimensional arrays.
    }
}
```

---

### Example 2 - Java <logos-java />

<v-clicks depth=2>

- When passing *arguments* into the *parameters* of a *function*, 
  - The data of *primitive types* is copied
  - The data of *reference types* is **not** copied
- Example of this:

</v-clicks>
<v-click>

```java {monaco-run} {autorun:false}
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        int num = 4;
        String myString = "Test 1";
        System.out.println("nums before: " + Arrays.toString(nums));
        System.out.println("num before: " + num);
        System.out.println("myString before: " + myString);
        doSomething(nums, num);
        System.out.println("nums after: " + Arrays.toString(nums));
        System.out.println("num after: " + num);
        System.out.println("myString after: " + myString);
    }
    
    private static void doSomething(int[] arr, int n, String s) {
        arr[1] = 3;
        num = 5;
        s = "Test 2"; // Although strings are a reference type, Java treats them more like primitive type in this context.
    }
}
```

</v-click>
<v-click>

**Both `nums` and `arr` are references to the same data. Changing one of them will change the other.**  
`num` and `n` each have their own copy of the data originally in `num`. Changing one of them **will not** change the other. Same with `myString` and `s` <span text-sm>(but this is a special case with strings in Java)</span>

</v-click>

---

### Examples - Python <logos-python />

In Python, things are weird and it's difficult to explain.  
The example below shows how primitive and reference types are treated.

```python {monaco-run} {autorun:false}
# Comparing Strings
s1 = "hello"
s2 = "hello"
print(s1 == s2) # This is correct in Python!
# The Python interpreter is designed to make things easier for programmers.
# It knows to compare the data in the strings when using the `==` operator.

arr1 = [1, 2, 3]
arr2 = [1, 2, 3]
print(arr1 == arr2) # This also works. The Python interpreter helps us again.

arr3 = [[1, 2, 3], [4, 5, 6]]
arr4 = [[1, 2, 3], [4, 5, 6]]
print(arr3 == arr4) # This does not work!
# The Python interpret will not help you when using multidimensional arrays / lists!
# It fails to compare the data correctly within the sublists.

def do_something(arr, n, s):
    arr[1] = 3
    n = 5
    s = "Test 2"

nums = [1, 2, 3]
num = 4
my_string = "Test 1"
print(f"Before: {nums=} {num=} {my_string=}")
do_something()
print(f"After: {nums=} {num=} {my_string=}")
```

<!-- This slide can be noted, and then promptly skipped. -->

---

## Basic Runtime Complexity

<v-clicks>

The following program is an **algorithm** (steps to solve a program) that finds the smallest integer in a list of integers.

```python {monaco-run} {autorun:false}
nums = [-100, 400, 600, -200, 300, 0, -1, 500, -600, 800]
smallest = nums[0]
for i in nums:
    if i < smallest:
        smallest = i
print(f"{smallest} found in {len(nums)} integers")
```

How fast is the program?  
How fast would it be if we used a million integers? A billion?

</v-clicks>

<!-- Python provides utilities to do this more simply and efficienctly, but the loop algorithm is written out here for clarity. -->

---

<v-clicks>

- The **runtime complexity** of an algorithm describes how the amount of time for an algorithm to run changes as the size of the input to the algorithm changes.
  - You can refer back to this slide once later examples make it more clear what this means
- We use Big-O notation to describe this behavior:
  - $O(1)$ <carbon-arrow-right /> constant time
  - $O(\log(n))$ <carbon-arrow-right /> logarithmic time
  - $O(n)$ <carbon-arrow-right /> linear time
  - $O(n\log(n))$ <carbon-arrow-right /> linearithmic time
  - $O(n^2)$ <carbon-arrow-right /> quadratic time
  - $O(n^3)$ <carbon-arrow-right /> cubic time
  - $O(2^n)$ <carbon-arrow-right /> exponential time
- Example: Accessing an element from an array using an index takes the same amount of time regardless of how big or small the index is
  - $O(1)$ / constant time

</v-clicks>
<v-click>

<Excalidraw drawFilePath="/days/day04/complexity.excalidraw.json" darkMode />

</v-click>

---

## More Data Structures

<v-clicks depth=2>

- Arrays have some disadvantages:
  - Cannot add or insert new elements
  - Cannot remove existing elements
  - Indices can be difficult to work with
- Other *data structures* are available to solve these issues
- There are many data structures, we will look at these:
  - `ArrayList`
  - `LinkedList`
  - `HashMap`

</v-clicks>

---

### `ArrayList`

An `ArrayList` is a variable-length array:
- Add / insert elements
- Remove elements

Learn more here: [docs.oracle.com](https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html)

<v-click>

<logos-java />

```java {monaco-run} {autorun:false}
import java.util.Arrays;
import java.util.ArrayList; // Import the `ArrayList` class!

public class Main {
    public static void main(String[] args) {
        // Specify the data type being stored inside angle brackets "<>".
        // Notice that the class `Integer` is used here instead of simply `int`.
        // This is a quirk of Java.
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(2, 4, 6, 8));
        // Initialize with some data using `Arrays.asList`.
        
        // Get an element at a specific index in the array-list.
        int element = nums.get(2); // Gets the integer at index 2 --> 6
        System.out.println(element);
        
        // Add an element to the end of the array-list.
        nums.add(5);
        
        // Insert an element at index 3.
        nums.add(3, 6);
        
        // Remove an element at index 1.
        nums.remove(1);
        
        // Get the number of elements in the linked-list.
        int count = nums.size();
        System.out.println("Final contents: " + nums + ", size: " + count);
    }
}
```

</v-click>
<v-clicks depth=3>

- Additional notes:
  - Using an invalid index will cause an error
  - `get` runs on $O(1)$ / constant time
  - `add` and `remove` run on average $O(n)$ / linear time
    - Adding / removing is a comparatively slow operation

</v-clicks>
<v-click>

<logos-python />

```python {monaco-run} {autorun:false}
# Lists in Python are already variable-length arrays.
# No need to import anything.
nums = [2, 4, 6, 8]

# Get an element at a specific index.
e = nums[2]

# Add an element to the end of the list.
nums.append(5)

# Insert an element at index 3.
nums.insert(3, 6)

# Remove an element at index 1.
nums.pop(1)

print(f"Final contents: {nums}, size: {len(nums)}")
```

Learn more here: [docs.python.org](https://docs.python.org/3/tutorial/datastructures.html)

</v-click>

<!-- 
Instructor does not have to work through Python examples manually, as it's largely similar to arrays.
If time permits, the instructor can opt to explain the internal working of variable-length arrays once the remaining slides for this day are complete.
-->

---

### `LinkedList`

A `LinkedList` behaves like an `ArrayList`, but with certain advantages and disadvantages.  
<span v-mark.underline.white>Python does not have linked-lists</span>, so we will only look at Java.

Learn more here: [docs.oracle.com](https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html)

<v-click>

<logos-java />

```java {monaco-run} {autorun:false}
import java.util.Arrays;
import java.util.LinkedList; // Import the `LinkedList` class!

public class Main {
    public static void main(String[] args) {
        // Specify the data type being stored inside angle brackets "<>".
        // Notice that the class `Integer` is used here instead of simply `int`.
        // This is a quirk of Java.
        LinkedList<Integer> nums = new LinkedList<>(Arrays.asList(2, 4, 6, 8));
        // Initialize with some data using `Arrays.asList`.
        
        // Get an element at a specific index in the linked-list.
        int element = nums.get(2); // Gets the integer at index 2 --> 6
        System.out.println(element);
        
        // Add an element to the beginning and end of the linked-list.
        nums.addFirst(5);
        nums.addLast(5);
        
        // Insert an element at index 3.
        nums.add(3, 6);
        
        // Remove an element at index 1.
        nums.remove(1);
        
        // Remove the first and last elements.
        nums.removeFirst();
        nums.removeLast();
        
        // Get the number of elements in the linked-list.
        int count = nums.size();
        System.out.println("Final contents: " + nums + ", size: " + count);
    }
}
```

</v-click>
<v-clicks depth=3>

- Additional notes:
  - Using an invalid index will cause an error
  - `get` runs on $O(n)$ / linear time
    - <span v-mark.underline.pink="4">This is **slower** than `ArrayList`!</span>
  - `add` and `remove` run on average $O(n)$ / linear time
  - `addFirst`, `addLast`, `removeFirst`, `removeLast` run on $O(1)$ / constant time
    - <span v-mark.underline.pink="7">This is **faster** than `ArrayList`!</span>
- Prefer to use `LinkedList` over `ArrayList` when frequently adding / removing elements at the start / end of the data structure.

</v-clicks>

<!-- If time permits, the instructor can opt to explain the internal working of linked-lists once the remaining slides for this day are complete. -->

---

### `HashMap`

<v-clicks depth=2>

- An array is a data structure that relates indices to values.
- A `HashMap` is a data structure that relates *keys* to *values*
  - We can get a values associated with a key
    - But not a key asociated with a value!
  - A key does not have to be an integer!
  - Keys are often useful as strings, but can be anything
  - Keys do not have to be in-order
  - A single key is associated with a single value
    - Stored as a *key-value pair*
  - **There are no duplicate keys**

</v-clicks>
<v-click>

Learn more here: [docs.oracle.com](https://docs.oracle.com/javase/8/docs/api/java/util/HashMap.html)

</v-click>
<v-click>

Let's say that a group of friends are playing the board game Monopoly, and they want to use a program to keep track of their cash balance in the game.

<logos-java />

```java {monaco-run} {autorun:false}
import java.util.Arrays;
import java.util.HashMap; // Import the `HashMap` class!

public class Main {
    public static void main(String[] args) {
        // Key type: `String`
        // Value type: `Integer` / `int`
        HashMap<String, Integer> map = new HashMap<>();
        
        // Add / change a key-value pair.
        map.put("Alice", 2000);
        map.put("Bob", 1900);
        map.put("Charlie", 1950);

        map.put("Alice", 3000); // Changes the Alice's existing balance.
        
        // Check if the map has a specific key.
        System.out.println("Contains Alice: " + map.containsKey("Alice"));
        System.out.println("Contains Dennis: " + map.containsKey("Dennis"));
        
        // Get a value associated with a key.
        System.out.println("Alice's Balance: " + map.get("Alice"));
        System.out.println("Dennis's Balance: " + map.get("Dennis")); // `null` since Dennis is not in the map.
        
        // Get the number of key-value pairs in the hashmap.
        int count = map.size();
        System.out.println("Final contents: " + map + ", size: " + count);
    }
}
```

</v-click>
<v-clicks depth=3>

- Additional notes:
  - `put`, `constansKey`, and `get` all run on average $O(1)$ / constant time
  - The hashmap is a very efficient data structure

</v-clicks>
<v-click>

In Python, hashmaps are called *dictionaries*.

<logos-python />

```python {monaco-run} {autorun:false}
map = dict()

# Or, create a dictionary with some initial data.
# map = {
#     "Alice": 100,
#     "Bob": 200,
#     "Charlie": 150
# }

# Add / change a key-value pair.
map["Alice"] = 2000
map["Bob"] = 1900
map["Charlie"] = 1950

map["Alice"] = 3000 # Changes the Alice's existing balance.

# Check if the map has a specific key.
hasAlice = "Alice" in map
hasDennis = "Dennis" in map
print("Contains Alice:", hasAlice)
print("Contains Dennis:", hasDennis)

# Get a value associated with a key.
print("Alice's Balance: " + map.get("Alice"))
print("Dennis's Balance: " + map.get("Dennis")) # `None` since Dennis is not in the map.
# `None` is the equivalent of `null` in Python.

print(f"Final contents: {map}, key-value pairs: {len(map)}")
```

Learn more here: [docs.python.org](https://docs.python.org/3/tutorial/datastructures.html#dictionaries)

</v-click>

<!-- If time permits, the instructor can opt to explain the internal working of hashmaps once the remaining slides for this day are complete. -->

---

## Worksheet

[Click here to access the worksheet.](worksheets/worksheet04/worksheet04.pdf)

[Click here to access the answer key.](worksheets/worksheet04/answers04.pdf)
