---
download: true
lineNumbers: true
colorSchema: light
aspectRatio: 1/1.294
drawings:
  persist: true
---

## <div text-center>Bonus Answers 4</div><br>

### Simplified FizzBuzz

One possible solution:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int num = scan.nextInt();
        if (num % 3 == 0) {
            System.out.print("Fizz");
        }
        if (num % 5 == 0) {
            System.out.print("Buzz");
        }
        
        scan.close();
    }
}
```

Another possible solution:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int num = scan.nextInt();
        String ans = "";
        if (num % 3 == 0) {
            ans += "Fizz";
        }
        if (num % 5 == 0) {
            ans += "Buzz";
        }
        System.out.print(ans);
        
        scan.close();
    }
}
```
