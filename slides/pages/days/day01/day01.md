# <DateTitle offset=0 />

- Introductions
- Resources
- Schedule
- Coding set up
- Hello World
- *Break*
- About Java and Python
- Variables, built-in functions, basic I/O
- Common Errors and Debugging
- *Worksheet*

---

## Introductions

**Hello!**

Message us on Discord or send an email to the following addresses:
- <code><Obfuscate ob="aW93YWNpdHltYXRoY2lyY2xlQGdtYWlsLmNvbQo=" /></code>
- <code><Obfuscate ob="YWxleHlhbzJAaWxsaW5vaXMuZWR1Cg==" /></code>

---
layout: two-cols-header
---

## Resources

Bookmark this slides presentation to following along!  
<PageURL />

Helpful cheatsheets to reference:
- <Link to="unavailable">Java Cheatsheet</Link>
- <Link to="unavailable">Python Cheatsheet</Link>

::left::

<iframe src="unavailable" />

::right::

<iframe src="unavailable" />

---

## Schedule

### Week 1 - Foundations - <DateTitle offset=0 /> to <DateTitle offset=4 />

| <DateTitle offset=0 /> | <DateTitle offset=1 /> | <DateTitle offset=2 /> | <DateTitle offset=3 /> | <DateTitle offset=4 /> |
| :---: | :---: | :---: | :---: | :---: |
| Running Programs | Variables, Datatypes, Functions | Intro to Classes, Control Flow | Data Structures, ADTs, Polymorphism | Call Stacks, Recusion |

### Week 2 - Projects - <DateTitle offset=7 /> to <DateTitle offset=11 />

| <DateTitle offset=7 /> | <DateTitle offset=8 /> | <DateTitle offset=9 /> | <DateTitle offset=10 /> | <DateTitle offset=11 /> |
| :---: | :---: | :---: | :---: | :---: |
| ANSI Escape Sequences | Lambdas, File I/O | Time, Networking | GUIs, Multithreading | Project Presentations |

<v-click>

### Worksheets

- Worksheets will be frequently assigned, but <span v-mark.underline.pink="+1">are not graded</span>.
- You may check your answers against the answer keys.
- <span v-mark.unerline.pink="+1">Both will be posted on these slides.</span>

</v-click>

---

## Setup

<v-clicks>

<div>

- Click on the button below to open up a **Binder**.

<AutoFitText min=0 max=1>
<span v-mark.circle.pink="0">

[![Binder](https://mybinder.org/badge_logo.svg)](https://mybinder.org/v2/gh/ObjectOops/icmc/HEAD?urlpath=vscode)

</span>
</AutoFitText>

**Always use this button to open Binder.**

</div>

- We will use Binders during camp. <span text-sm>*The Binder service is generously provided for free, but we don't want to overuse it.*</span>

<div>

- When programming outside of class, here are some other options:
  1. Install an editor + Java and/or Python on a non-Chromebook device.<br>
  <span text-sm>You can ask us for guidance.</span>
  2. [Replit](https://replit.com/)
  3. [JavaFiddle](https://javafiddle.leaningtech.com/) (Java)
  4. [JupyterLite](https://jupyterlite.rtfd.io/en/stable/try/lab) (Python)

</div>

</v-clicks>

<!-- Binder, JavaFiddle, and JupyterLite don't save your files sicne they don't require an account. -->

---
layout: two-cols-header
---

### Using Binder

> <span text-sm>Tour shown during in-person session.</span>

::left::

<Transform scale=0.75>
<v-clicks>

<span text-2xl>1. Click "Yes, I trust the authors"</span>
![Binder 1](./binder_1.png)

<span text-2xl>2. Click "Never"</span>
![Binder 2](./binder_2.png)

</v-clicks>
</Transform>

::right::

<div text-sm>
<v-click>

Create a new terminal to run *commands*.

![Binder 3](./binder_3.png)

</v-click>
<v-click>

**Compile** Command: `javac src/workbench/Main.java`  
**Run** Command: `java src.workbench.Main`  
You must always <span v-mark.underline.pink="4">**compile** before **running**</span>.

</v-click>
<v-click>

Use the run button to **compile** and **run** in one step!

</v-click>
<v-click>

Tip: For Python you just need to use the command  
`python main.py`.

</v-click>
</div>

<!-- Students should now run Hello World! -->

---

## Break

Have a break!

<RandomPicture />

---
layout: two-cols-header
---

## About Java and Python

### Java

::left::

<v-clicks depth=2>

- Java 1.0 was released in 1996
  - Not that old, still very popular
  - Originally designed for TV
  - Versions: 1.0, 1.1, ..., 1.4, <v-click hide at="5">?</v-click><v-click at="5">5.0, 6, 7, ...</v-click>
  - <span text-sm>Versions you should care about (LTS):</span> 8, 11, 17, 21
  - <span v-mark.underline.purple="6" border>**Java <logos-java /> and JavaScript <logos-javascript /> are different!**</span>

</v-clicks>
<v-click>

![Minecraft Java Edition](https://www.minecraft.net/content/dam/minecraftnet/archive/4899721d4702ec8e8d548201fb6da050-pre_1122_title.png)

</v-click>

::right::

<v-click>

#### FIRST Robotics

There are many high school robotics teams around Iowa City that use **Java**!  
*Consider joining one!*

**FTC** Teams:
- West High: Trobotix 8696
- City High: Raw Bacon 8743
- Liberty High: ThunderBots 22064

**FRC** Team:  
- Iowa City: Children of the Corn 167

</v-click>

---
zoom: 0.7
---

|  |  |  |
| :---: | :---: | :---: |
| <img width=250 alt="CENTERSTAGE" src="https://8696-trobotix.github.io/images/CENTERSTAGE/CenterstageImg.jpg"> | <img width=250 alt="Pumpkin" src="https://8696-trobotix.github.io/images/CENTERSTAGE/Trobotix2.png"> | <img width=250 alt="167" src="https://static.wixstatic.com/media/5fceb1_90f24f615f1842ad8683642600f7eb66~mv2.jpg/v1/fill/w_756,h_646,al_c,q_85,usm_0.66_1.00_0.01,enc_avif,quality_auto/2024.jpg"> |

<SlidevVideo controls>
  <source src="./robot.mp4" type="video/mp4" />
  <p>Your browser does not support this video.</p>
</SlidevVideo>

---


