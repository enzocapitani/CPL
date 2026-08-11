# WriteColor

The `WriteColor` enum is part of the `CPL.style` package and represents the ANSI colors used by the `Write` class.

Each constant automatically returns its corresponding ANSI code, allowing you to color terminal text easily.

> **Package:** `CPL.style`

---

# Overview

`WriteColor` is used by the methods of the `Write` class and can also be used directly with `System.out.print()` or `System.out.println()`.

Example:

```java
System.out.print(WriteColor.RED);
System.out.println("Red text");
System.out.print(WriteColor.RESET);
```

Since the `toString()` method is overridden, there is no need to call any additional method to obtain the ANSI code.

---

# Constants

## `RED`

Sets the text color to red.

### Example

```java
Write.type("Error!", WriteColor.RED);
```

---

## `GREEN`

Sets the text color to green.

### Example

```java
Write.type("Operation completed successfully!", WriteColor.GREEN);
```

---

## `BLUE`

Sets the text color to blue.

### Example

```java
Write.type("Information", WriteColor.BLUE);
```

---

## `RESET`

Restores the terminal's original color.

This constant is normally used automatically by the `Write` class, but it can also be used manually.

### Example

```java
System.out.print(WriteColor.RESET);
```

---

# Overridden Method

## `toString()`

Returns the ANSI code corresponding to the color.

Thanks to this method override, the enum can be printed directly:

```java
System.out.print(WriteColor.GREEN);
```

Instead of:

```java
System.out.print(WriteColor.GREEN.toString());
```

---

# Complete Example

```java
import CPL.style.WriteColor;

public class Main {

    public static void main(String[] args) {

        System.out.print(WriteColor.RED);
        System.out.println("Red text");

        System.out.print(WriteColor.GREEN);
        System.out.println("Green text");

        System.out.print(WriteColor.BLUE);
        System.out.println("Blue text");

        System.out.print(WriteColor.RESET);
        System.out.println("Color restored");
    }

}
```

---

# Notes

* The colors use **ANSI Escape Codes**.
* Color support depends on the terminal being used.
* Some IDE consoles may not interpret ANSI codes correctly.
* The `RESET` constant should be used whenever you want to return to the terminal's default color.
