---
download: true
lineNumbers: true
colorSchema: light
aspectRatio: 1/1.294
drawings:
  persist: true

addons:
  - excalidraw
---

## <div text-center>Java Cheatsheet</div><br>

### Variables

<Excalidraw drawFilePath="./variables_summary.excalidraw.json" />

### Scanner

```java
import java.util.Scanner; // Required to use the scanner.

// ...

Scanner scan = new Scanner(Systen.in); // Initialize a scanner.

int num = scan.nextInt();        // `nextInt` gets an integer.
double num2 = scan.nextDouble(); // `nextDouble` gets a floating-point.
String s = scan.nextLine();      // `nextLine` gets a string.

scan.close() // Remember to close the scanner.
```

### Operators

![Java Operators](https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEjK4MpGlFS0LioQfawWbgmDzxDt2wcb8AjX30LkTHPlqtI7OBgySiYhAhwbvaAoe3FWu8t4672L7a8FEoHIStoUFoWC0LqwxHxAeV4knC34u8JYbKCq2BG_dE9ewckh2hFyCzb1_p771jh_/s1600/Screenshot+%2528447%2529.png)

---

### Casting

```java
double num = 3.14159;
int num2 = (int)num; // `num` casted to an integer.

// Casting to a String is a bit different:
String numString = Double.toString(num); // `Double` is uppercase!
String numString2 = Integer.toString(num2);

// Casting from a String to other data types:
String numString3 = "123";
int num3 = Integer.valueOf(numString3);
```

### Arrays

```java
int[] arr = {5, 6, 7};
int i = arr[0]; // First element: 5
int j = arr[1]; // Second element: 6
// ...

int size = arr.length; // Number of elements in array.

int[][] matrix = { // Multidimensional
    {2, 4, 6}, 
    {8, 10, 12}, 
    {14, 16, 18}
};
```

### Strings

```java
String s = "Hello, world!";
char c = s.charAt(7); // Get character at index 7.

// Get a substring from string `s`, starting at index 0 and stopping right before index 5.
String sub = s.substring(0, 5);

String s1 = "Hello, ";
String s2 = "world!";
String s3 = s1 + s2; // --> s3 is "Hello, world!"
```

### Basic Escape Sequences

`\"`, `\'`, `\\`, `\n`, `\t`, ...

---

### Functions

<Excalidraw drawFilePath="./functions.excalidraw.json" />

### By Reference

<Excalidraw drawFilePath="./by_reference.excalidraw.json" />

---

### Comparison Operators

- *==* <carbon-arrow-right /> equality operator, tests if two values are equal
- <span text-sm>The single equals sign *=* is already used as the assignment operator!</span>
- *!=* <carbon-arrow-right /> inequality operator, tests if two values are not equal
- *<* <carbon-arrow-right /> less than
- *>* <carbon-arrow-right /> greater then
- *<=* <carbon-arrow-right /> less than or equal to
- *>=* <carbon-arrow-right /> greater than or equal to

### Logical Operators

- `&&` <carbon-arrow-right /> AND operator
- `||` <carbon-arrow-right /> OR operator
- `!` <carbon-arrow-right /> NOT operator

### Conditionals

```java
if (/* boolean expression */) {
    // ...
} else if (/* boolean expression */) {
    // ...
} else {
    // ...
}
```

### Loops

```java
int num = 0;
while (num < 10) {
    System.out.print(num + " ");
    ++num; // This is the prefix increment operator.
    // It does the same thing as num = num + 1.
}
```
```java
//   init.      cond.    update
for (int i = 0; i <= 20; i += 2) {
    System.out.print(i + " ");
}
```
```java
String[] arr = {"Alice", "Bob", "Charlie"};
for (String s : arr) {
    System.out.print(s + " ");
}
```
```java
String input;
do {
    System.out.print("Please enter \"confirm\": ");
    input = scan.nextLine();
} while (!input.equals("confirm"));
```

Loop statements: `break`, `continue`

---

### Other Data Structures

```java
import java.util.Arrays;
import java.util.ArrayList;

// ...

ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(2, 4, 6, 8));
int element = nums.get(2); // Gets the integer at index 2 --> 6
// Add an element to the end of the array-list.
nums.add(5);

// Insert an element at index 3.
nums.add(3, 6);

// Remove an element at index 1.
nums.remove(1);

// Get the number of elements in the linked-list.
int count = nums.size();
```
```java
import java.util.Arrays;
import java.util.LinkedList;

// ...

LinkedList<Integer> nums = new LinkedList<>(Arrays.asList(2, 4, 6, 8));
int element = nums.get(2); // Gets the integer at index 2 --> 6
System.out.println(element);
// Other methods.
element = nums.getFirst();
System.out.println(element);
element = nums.getLast();
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
```

---

```java
import java.util.HashMap;

// ...

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
System.out.println("Contains Dave: " + map.containsKey("Dave"));

// Get a value associated with a key.
System.out.println("Alice's Balance: " + map.get("Alice"));
System.out.println("Dave's Balance: " + map.get("Dave")); // `null` since Dave is not in the map.

// Get the number of key-value pairs in the hashmap.
int count = map.size();
```

### Exception Handling

```java
// Start of the `try` block!
try {
    
    // ArrayIndexOutOfBoundsException
    int[] nums = {1, 2, 3};
    System.out.println(nums[10]); // Index 10 is out-of-bounds.
    
    // ArithmeticException
    int n = 10 / 0; // Dividing by 0 is illegal.
    
    // NullPointerException
    String s = null;
    s.length(); // Don't use an object which is `null`.
    
    // Your own exception!
    throw new Exception("MY EXCEPTION");

// End of the `try` block. Start of the `catch` block!
} catch (Exception e) {
    System.out.println("A problem occurred!");
    
    // You can also print the details of the exception.
    System.out.println(e.toString());
    System.out.println(e.getMessage());
}
```
