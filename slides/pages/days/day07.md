---
layout: two-cols
transition: slide-left
---

# <DateTitle offset=8 />

<StartupBadge />

**Agenda**

- File I/O
- *Break*

::right::

<Toc minDepth=2 maxDepth=3 mode="onlyCurrentTree" />

---
routeAlias: file_io
---

## File I/O

The following example demonstrates creating a file, writing to the file, adding to the file, and finally reading from the file.  
<carbon-arrow-right />

---
zoom: 0.65
---

```java
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
        String fileName = "example.txt";

        // Creating and writing to the file.
        try {
            FileWriter writer = new FileWriter(fileName);
            writer.write("This is the first line.\n");
            
            System.out.println("File created and initial content written.");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }

        // Appending to the file.
        try {
            FileWriter writer = new FileWriter(fileName, true);
            writer.write("This is an appended line.\n");
            
            System.out.println("Additional content appended.");
        } catch (IOException e) {
            System.out.println("Error appending to file: " + e.getMessage());
        }

        // Reading from the file.
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            
            String line;
            System.out.println("Reading from file:");
            
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }
    }
}
```

<!-- Copy and run in external environment. -->

---
hideInToc: true
---

<!-- The Slidev Toc component is a bit bugged, so we need an empty header here. -->

## 

```py
file_name = "example.txt"

# Creating and writing to the file.
with open(file_name, "w+") as writer:
    writer.write("This is the first line.\n")
    
    print("File created and initial content written.")

# Appending to the file.
with open(file_name, "a") as writer:
    writer.write("This is an appended line.\n")
    
    print("Additional content appended.");

# Reading from the file.
with open(file_name, "r") as reader:
    print("Reading from file:")
    
    for line in reader.readlines():
        print(line)
```
