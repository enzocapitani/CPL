# Write

The `Write` class is part of the `cpl.style` package and provides methods for writing text to the console with a **typewriter effect**. It also supports ANSI colors and customizable delays between characters.

> **Package:** `cpl.style`

---

## Overview

The class provides static methods, so **creating an instance is not necessary**.

```java
Write.type("Hello, world!");
```

---

# Methods

## `type(String phrase)`

Writes a phrase character by character using the library's default delay (`50 ms`).

### Parameters

| Name     | Type     | Description                          |
| -------- | -------- | ------------------------------------ |
| `phrase` | `String` | Text to be displayed in the console. |

### Example

```java
Write.type("Welcome to cpl!");
```

---

## `write(String phrase, int delay)`

Writes a phrase character by character using a custom delay.

### Parameters

| Name     | Type     | Description                                   |
| -------- | -------- | --------------------------------------------- |
| `phrase` | `String` | Text to be displayed.                         |
| `delay`  | `int`    | Time between each character, in milliseconds. |

### Example

```java
Write.type("Loading...", 100);
```

---

## `type(String phrase, WriteColor color)`

Writes a phrase using an ANSI color and the library's default delay.

After the text has finished being written, the terminal color is automatically restored.

### Parameters

| Name     | Type         | Description               |
| -------- | ------------ | ------------------------- |
| `phrase` | `String`     | Text to be displayed.     |
| `color`  | `WriteColor` | Color used while writing. |

### Example

```java
Write.type("Operation completed!", WriteColor.GREEN);
```

---

## `write(String phrase, WriteColor color, int delay)`

Writes a phrase using an ANSI color and a custom delay.

After the text has finished being written, the terminal color is automatically restored.

### Parameters

| Name     | Type         | Description                                   |
| -------- | ------------ | --------------------------------------------- |
| `phrase` | `String`     | Text to be displayed.                         |
| `color`  | `WriteColor` | Color used while writing.                     |
| `delay`  | `int`        | Time between each character, in milliseconds. |

### Example

```java
Write.type(
    "Initializing system...",
    WriteColor.BLUE,
    75
);
```

---

## `setWriteColor(WriteColor color)`

Sets the default color for terminal output.

Unlike the `write(...)` methods, this setting remains active until `resetWriteColor()` is called.

### Parameters

| Name    | Type         | Description                          |
| ------- | ------------ | ------------------------------------ |
| `color` | `WriteColor` | Color to be applied to the terminal. |

### Example

```java
Write.setWriteColor(WriteColor.RED);

System.out.println("Error!");
System.out.println("Another error!");

Write.resetWriteColor();
```

---

## `resetWriteColor()`

Restores the terminal's original color.

### Example

```java
Write.resetWriteColor();
```

---

# Default Delay

The library uses a default delay of:

```text
50 ms
```

This value is used by methods that do not receive a delay as a parameter.

---

# `WriteColor` Enum

The available colors are defined by the `WriteColor` enum.

Example:

```java
WriteColor.RED
WriteColor.GREEN
WriteColor.BLUE
WriteColor.RESET
```

---

# Notes

* The typewriter effect is implemented using `Thread.sleep()`.
* The delay is specified in **milliseconds**.
* The `write(...)` methods always add a line break after the text has finished being written.
* ANSI color support depends on the terminal being used. Some IDE consoles may not display colors correctly.
* The `write(...)` methods that receive a color automatically restore the terminal's original color after finishing the text.

---

# Complete Example

```java
import cpl.style.Write;
import cpl.style.WriteColor;

public class Main {

    public static void main(String[] args) {

        Write.type("Hello!");

        Write.type("Loading...", 80);

        Write.type(
                "Success!",
                WriteColor.GREEN
        );

        Write.type(
                "Error!",
                WriteColor.RED,
                100
        );

        Write.setWriteColor(WriteColor.BLUE);

        System.out.println("Blue text.");
        System.out.println("Another blue text.");

        Write.resetWriteColor();

        System.out.println("Color restored.");
    }

}
```
