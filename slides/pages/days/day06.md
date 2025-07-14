---
layout: two-cols
transition: slide-left
---

# <DateTitle offset=7 />

<StartupBadge />

**Agenda**

- Time & Random
- *Break*
- Basic ANSI Escape Sequences

::right::

<Toc minDepth=2 maxDepth=3 mode="onlyCurrentTree" />

---
routeAlias: time
---

## Time

- Pausing execution
- Getting the time

---

### Pausing Execution

The following example prints "Pausing...", waits for 3 second (3000 milliseconds), and then finally prints "Done".

```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Pausing execution for 3 seconds...");
        pause(3000);
        System.out.println("Done.");
    }
    
    // Pauses execution for some amount of milliseconds.
    // 1 second --> 1000 milliseconds
    private static void pause(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            System.out.println("Thread was interrupted.");
        }
    }
}
```

<!-- Due to the nature of the Slidev Java runner, this example must be run in an external environment. -->

---

### Getting the Time

The following example prints the current year, month, day, and time.  
In Binder, it may not match the time on your computer. This is supposed to happen.

```java {monaco-run} {autorun:false}
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedTime = now.format(formatter);
        
        System.out.println("Current time: " + formattedTime);
    }
}
```

---
routeAlias: ansi_escape_sequences
---

## Basic ANSI Escape Sequences

ANSI escape sequences allow us to give our program output colors, styles, and perform other operations on the terminal.  
Moving the cursor: [en.wikipedia.org](https://en.wikipedia.org/wiki/ANSI_escape_code#Control_Sequence_Introducer_commands)  
Adding colors and styles: [en.wikipedia.org](https://en.wikipedia.org/wiki/ANSI_escape_code#Select_Graphic_Rendition_parameters)

```java
public class Main {
    public static void main(String[] args) {
        String CSI = "\033["
        
        // Clear the terminal / screen.
        System.out.print(CSI + "H" + CSI + "J");
        
        // Move the cursor to a position.
        int row = 5, column = 5;
        System.out.print(CSI + row + ";" + column + "H");
        
        // Set text to bold.
        System.out.println(CSI + "1m" + "This is some bold text.");
        
        // Set text to italic.
        System.out.println(CSI + "3m" + "This is some bold and italic text.");
        
        // Set text to a color.
        System.out.println(CSI + "95m" + "This is some bold, italic, and colorful text.");
        
        // Set background / highlight color.
        System.out.println(CSI + "44m" + "Colorful text 2.");
        
        // Set text to a color (advanced).
        System.out.println(CSI + "38;2;25;210;75m" + "Colorful text 3."); // Text
        System.out.println(CSI + "48;2;20;225;225m" + "Colorful text 4."); // Background / Highlight
        
        // Clear all colors and styles.
        System.out.println(CSI + "0m");
    }
}
```

<!-- Due to the nature of the Slidev Java runner, this example is best run in an external environment. -->
