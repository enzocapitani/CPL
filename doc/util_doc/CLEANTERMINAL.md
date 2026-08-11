# Terminal

The `Terminal` class provides simple methods for **clearing the terminal screen** and **pausing execution** during Java applications.

> **Package:** `cpl.util`

## Methods

### `clean()`

Clears the terminal screen according to the operating system on which the application is running.

#### How it works

* **Windows:** executes the `cls` command.
* **Linux/macOS:** executes the `clear` command.

> **Important**
>
> This method only works when the application is running in an **operating system terminal**.
>
> In IDE consoles such as **Eclipse**, **IntelliJ IDEA**, **VS Code**, and others, this method may not work because these consoles usually do not interpret the `cls` or `clear` commands.

## Example

```java id="9o2k1c"
package example;

import cpl.util.Terminal;

public class Main {

    public static void main(String[] args) {

        System.out.println("Text before clearing...");

        // Clears the terminal
        Terminal.clean();

        System.out.println("Terminal cleared!");
    }
}
```

## Compatibility

| Operating System |     Support     |
| ---------------- | :-------------: |
| Windows          |        ✅        |
| Linux            |        ✅        |
| macOS            |        ✅        |
| IDE Console      | ⚠️ May not work |

## Notes

* The method is `static`, so creating an instance of the class is not necessary.
* If an error occurs while executing the clearing command, the exception will be caught and displayed in the console.

### Usage Example

```java id="r1ry4t"
Terminal.clean();
```

---

### `sleep(int milisec)`

Pauses the execution of the main thread for a specified amount of time in milliseconds.

## Example

```java id="kz9f1u"
package example;

import cpl.util.Terminal;

public class Main {

    public static void main(String[] args) {

        System.out.println("Text before pausing...");

        // Pauses execution for 1 second
        Terminal.sleep(1000);

        System.out.println("The terminal was successfully paused!");
    }
}
```

## Notes

* The method is `static`, so creating an instance of the class is not necessary.
* If an error occurs while pausing execution, the exception will be caught and displayed in the console.

### Usage Example

```java id="6x2h8p"
Terminal.sleep(1000);
```
