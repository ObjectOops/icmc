---
download: true
lineNumbers: true
colorSchema: light
aspectRatio: 1/1.294
drawings:
  persist: true
---

## <div text-center>Worksheet 1</div><br>

1. What differences have you noticed between Java and Python so far?  
Use your own words. Feel free to use the internet to search.

2. In Java, write a program that asks for the user's name, then repeats their name back to them.  
Example input / output:
```
Enter your name: <user enters their name here>
Your name is: <program repeats the name here>
```

3. Rewrite the program described above in Python.

4. Identify the error in the following program and how to fix it.
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("How many pizzas would you like?: ");
        String pizzasCount = scan.nextLine();
        System.out.println("You are ordering " + pizzasCount + " pizzas.");

        double costPerPizza = 15.99;
        double totalCost = pizzasCount * costPerPizza;
        
        System.out.println("Total cost: " + totalCost);
        scan.close();
    }
}
```

5. Identify the three problems in the following line of <logos-java /> code:
```
string thisIsAString! = "hi"
```

6. Identify why the following program won't run.

> Hint: Look very carefully.
```java
import java.util.Scanner;

public class Main {
    public static void notmain(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("I'm thinking of a not-so-random number between 1 and 10: ");
        int guess = scan.nextInt();
        System.out.println("You have guessed " + guess + ".");

        boolean isCorrect = (guess == 2); // This line is correct.
        
        System.out.println("The guess was correct?: " + isCorrect);
        scan.close();
    }
}
```

7. In Java and Python, define a variable for each of the following types with your choice of data  
a) int b) String c) double d) char e) boolean
