---
layout: two-cols
transition: slide-left
---

# <DateTitle offset=9 />

<StartupBadge />

**Agenda**

- Turtle
- *Break*
- Lambdas

::right::

<Toc minDepth=2 maxDepth=3 mode="onlyCurrentTree" />

---

## Turtle

The turtle library (a kind of package) for Python can be used to draw colorful spirals.  
This example **cannot be run in Binder**. Create a Replit account at [replit.com](https://replit.com/) to get started. Ask an instructor for help.

```py
import turtle

# Setup screen.
screen = turtle.Screen()
screen.bgcolor("black")

# Create turtle.
spiral = turtle.Turtle()
spiral.speed(0)
spiral.width(2)

# Draw spiral with RGB colors.
for i in range(255):
    # Set RGB color manually
    r = i % 255
    g = (255 - i) % 255
    b = (i * 2) % 255
    spiral.pencolor(r / 255, g / 255, b / 255)

    spiral.forward(i)
    spiral.left(59)

spiral.hideturtle()
turtle.done()
```

<!-- This example requires a GUI. -->

---

## Lambdas

Lambdas are also known as anonymous functions.  
The following Java example shows how to use lambdas.

```java {monaco-run} {autorun:false}
public class Main {
    public static void main(String[] args) {
        MyRunnableLambda[] arrayOfLambdas = {
            (f, l, a) -> { System.out.println(l + ", " + f + " is " + a + " years old.") }, 
            (f, l, a) -> { System.out.println(f + " " + l + " is " + a + " years old.") }, 
            (f, l, a) -> { System.out.println("Somebody is " + a + " years old.") }
        };
        
        int lambdaToUse = 0;
        
        arrayOfLambdas[lambdaToUse].run("Jane", "Doe", 20);
    }
}

@FunctionalInterface
interface MyRunnableLambda {
    int run(String firstName, String lastName, int age);
}
```
