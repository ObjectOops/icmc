---
download: true
lineNumbers: true
colorSchema: light
aspectRatio: 1/1.294
drawings:
  persist: true
---

## <div text-center>Worksheet 3</div><br>

> *Legend:*  
> *Only in Java:* <logos-java />  
> *Only in Python:* <logos-python />  
> *In both Java and Python:* <logos-java /> <logos-python />

1. <logos-java /> <logos-python /> Create an array of five strings of your choice.

2. <logos-java /> Create an array of 100 integers with value 0.

3. Given the array `int[] nums = {3, 1, 4, 1, 5, 9};`:  
a) What integer is at index 3?  
b) How many elements are in the array?  
c) <logos-java /> Write code to print the value at index 3.  
d) <logos-java /> Write code to print the size of the array.

4. Given the following multidimensional array representing a simplified chess board:
```java
String[][] board = {
    // Col 1     Col 2     Col 3
    {"Knight B", "King B", "Knight B"}, // Row 1
    {"Pawn B", "Pawn B", "Pawn B"}, // Row 2...
    {"", "", ""}, 
    {"Pawn W", "Pawn W", "Pawn W"}, 
    {"Knight W", "King W", "Knight W"} // Row 5
};
```
<logos-java /> Write code to get the piece at row 4, column 2.

5. Given the following strings:
<logos-java /> `String secretMessage = "asdfghjkl";`<br>
<logos-python /> `secret_message = "asdfghjkl"`
Write code to get the fifth character in each.
> Hint: Strings indices also start at zero.

6. <logos-python /> Print the following text exactly using **only one print statement** (do not include line numbers).
```
Linus's Law:
"given enough eyeballs, all bugs are shallow"
- Eric S. Raymond
```

> Hint: Use escape sequences.

7. <logos-java /> Write a function that has two integer parameters and returns the sum of the two integers.

8. What is wrong with the following function?
```java
private void someFunction(boolean activate) {
    System.out.println("State of activation: " + activate);
    return activate;
}
```

9. (No correct answer) Do you understand how to use classes and objects?  
a) Yes b) No c) Maybe
