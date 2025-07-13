---
download: true
lineNumbers: true
colorSchema: light
aspectRatio: 1/1.294
drawings:
  persist: true
---

## <div text-center>Worksheet 4</div><br>

> Unless specified, all questions are in Java <logos-java />.

1. Trace the following program **by hand**. Write its output.
```java
public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 100; ++i) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
```

> Hint: The modulo operator `%` gets the remainder. `num % d == 0` tests if `num` is divisible by `d`.

2. Describe with one sentence in your own words what the program above does.

3. Trace the following program **by hand**. Write its output.
```java
public class Main {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int c = 0;
        System.out.print(a + " " + b + " ");
        while (b < 50) {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
}
```

4. (Optional Challenge) What is the sequence of numbers printed by the program above called?

---

5. Trace the following program **by hand**. Write its output.
```java
public class Main {
    public static void main(String[] args) {
        String[] northernCities = {
            "Helsinki", "Somewhere Snowy", "Moscow", "Harbin", "Anchorage", "Toronto", "Longyearbyen"
        };
        for (String city : northernCities) {
            if (city.equals("Longyearbyen")) {
                break;
            }
            if (city.contains("Somewhere")) {
                continue;
            }
            System.out.print(city);
            if (city.equals("Helsinki")) {
                System.out.println(", Finland");
            } else {
                char c = city.charAt(0);
                if (c == 'H' || c == 'A') {
                    System.out.println(", China or U.S.");
                } else if (c == 'M' || c == 'T') {
                    System.out.println(", Russia or Canada");
                }
            }
        }
    }
}
```

6. Use the following Python program to create a **truth table** for the XOR (exclusive OR) operator.
```py
# Test all possible combinations of True and False for `a` and `b` (4 total).
a = False
b = False
print(a ^ b) # XOR operator: `^`
```

7. What is the output of the following program?
```java
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8};
        
        doSomething(nums);
        
        System.out.println(Arrays.toString(nums));
    }
    
    private static void doSomething(int[] referenceNums) {
        referenceNums[2] *= 100; // Same as referenceNums[2] = referenceNums[2] * 100.
        referenceNums[3] *= 100;
        referenceNums[4] *= 100;
    }
}
```

8. Say that we want a data structure which is fast at inserting new elements at the start and end of a sequence.  
What data structure should we use?

9. Say that we want a data structure which is fast at accessing an element at any position in a sequence, but is also flexible in size.  
What data structure should we use?
