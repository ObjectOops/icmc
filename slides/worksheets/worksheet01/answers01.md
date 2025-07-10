---
download: true
lineNumbers: true
colorSchema: light
aspectRatio: 1/1.294
drawings:
  persist: true
---

## <div text-center>Answers 1</div><br>

1. What differences have you noticed between Java and Python so far?  
Use your own words. Feel free to use the internet to search.

<span text-sm>

Possible answers:
- Java tends to be more wordy than Python.
- Java is a "compiled language", Python is an "interpreted language".
- Both Java and Python have modern-day uses.

</span>

2. In Java, write a program that asks for the user's name, then echo their name back.  

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scan.nextLine();
        System.out.println("Your name is: " + name);
        
        scan.close();
    }
}
```

3. Rewrite the program described above in Python.

```py
name = input("Enter your name: ")
print("Your name is:", name)
```

4. Identify the error in the following program and how to fix it.

The variable `pizzasCount` is of type `String`, but is being treated as a type `int` in the program.
```java
String pizzasCount = scan.nextLine(); // Incorrect
```
```java
int pizzasCount = scan.nextInt(); // Correct
```

5. Identify the three problems in the following line of <logos-java /> code:

```
string thisIsAString! = "hi"
```

<span text-sm>

1. `string` should be capitalized <carbon-arrow-right /> `String`
2. The variable name `thisIsAString!` is invalid because it ends with `!`.
3. There is a missing semicolon after `"hi"`.
Corrected:

</span>

```
String thisIsAString = "hi";
```

6. Identify why the following program won't run.

Notice that the main function is called "notmain".
```java
public static void notmain(String[] args) { ...
```
It should actually be called "main".
```java
public static void main(String[] args) { ...
```

---

7. In Java and Python, define a variable for each of the following types with your choice of data  
a) int b) String c) double d) char e) boolean

Possible answers (Java):  
a) `int num = 2;`  
b) `String someString = "some text";`  
c) `double pi = 3.14159;`  
d) `char someCharacter = 'Y';`  
e) `boolean isBool = true;`

Possible answers (Python):  
a) `num = 2`  
b) `some_string = "some text"`  
c) `pi = 3.14159`  
d) `some_char = 'Y'`  
e) `is_bool = True`
