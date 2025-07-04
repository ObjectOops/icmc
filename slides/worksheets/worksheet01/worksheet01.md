---
src: ../headmatter.md
---

## <div text-center>Worksheet 1</div><br>

1. What differences have you noticed between Java and Python so far?  
Use your own words. Feel free to use the internet to search.

2. In Java, write a program that asks for the user's name, then echo their name back.  
Example:
```
Enter your name: John
Your name is: John
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

        boolean isCorrect = (guess == 2);
        
        System.out.println("The guess was correct?: " + isCorrect);
        scan.close();
    }
}
```
