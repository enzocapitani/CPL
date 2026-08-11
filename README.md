# 📚⚙ cpl Console Project Library | Java

Open-source library for developing terminal or console applications.

Write with style, generate menus quickly, capture user input from the terminal, and more!

## 🤔 What is this library?

This library was developed to simplify the creation of console applications using Java. Its main goal is to provide features that make development simpler, more organized, and more enjoyable, especially for those who are just getting started with programming.

With cpl, you can add more style to terminal applications and use utilities that speed up common tasks, allowing developers to focus on their project's logic instead of reimplementing basic functionalities.

## 💻⬇ How to download and use cpl?

**Attention!** Using **JDK 21** is essential for the best experience.

### ⚙👉 Eclipse

1. Download the library's `.jar` file from the project's **Releases** page.
2. In Eclipse, right-click on the project.
3. Select **Build Path → Configure Build Path...**
4. Go to the **Libraries** tab.
5. Click **Add External JARs...**
6. Select the cpl `.jar` file.
7. Click **Apply and Close**.

---

### ⚙👉 IntelliJ IDEA

1. Download the library's `.jar` file from the project's **Releases** page.
2. Open your project in IntelliJ.
3. Go to **File → Project Structure...** (`Ctrl + Alt + Shift + S`).
4. Select **Modules → Dependencies**.
5. Click the **+** button and select **JARs or Directories**.
6. Select the cpl `.jar` file.
7. Click **OK** and then **Apply**.

---

### ⚙👉 Visual Studio Code

1. Download the library's `.jar` file from the project's **Releases** page.
2. Open your project in VS Code.
3. Create a folder named `lib` in the project's root directory, if it does not already exist.
4. Place the cpl `.jar` file inside this folder.
5. In the **JAVA PROJECTS** panel, locate **Referenced Libraries**.
6. Click the **+** button (**Add JARs**) and select the `.jar` file from the `lib` folder.

After importing the library, cpl will be available for use in your project.

## Example of code using cpl

### Write and Terminal

```java
package principal;

import cpl.style.Write;
import cpl.util.Terminal;

public class Main {
    public static void main(String[] args) {
        Write.type("Hello world!!", 100);
        Terminal.clean();
    }
}
```

Writes the text letter by letter and then clears the terminal.

# License 📃

This project is licensed under the MIT License. See the `LICENSE` file for more information.

# Credits 👩‍💻

Developed and published by **Enzo Capitani**, software developer and Computer Science undergraduate.
