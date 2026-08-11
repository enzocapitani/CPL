# Menu

The `Menu` class allows you to create simple menus for terminal applications, with support for both instant display and a typing effect.

> **Package:** `cpl.menu`

## Methods

### `simple(String title, String[] options)`

Displays a simple menu in the terminal.

#### Parameters

| Parameter | Type       | Description                             |
| --------- | ---------- | --------------------------------------- |
| `title`   | `String`   | Title displayed at the top of the menu. |
| `options` | `String[]` | Array containing the menu options.      |

#### Example

```java
import cpl.menu.Menu;

public class Main {

    public static void main(String[] args) {

        String[] options = {
                "Start",
                "Settings",
                "Exit"
        };

        Menu.simple("MAIN MENU", options);

    }
}
```

**Output:**

```text
==============================
          MAIN MENU
==============================
1- Start
2- Settings
3- Exit
==============================
```

---

### `simple(String title, String[] options, int delay)`

Displays a menu using the typing effect provided by the `Write` class.

#### Parameters

| Parameter | Type       | Description                                            |
| --------- | ---------- | ------------------------------------------------------ |
| `title`   | `String`   | Menu title.                                            |
| `options` | `String[]` | Array containing the menu options.                     |
| `delay`   | `int`      | Time in milliseconds between each displayed character. |

#### Example

```java
import cpl.menu.Menu;

public class Main {

    public static void main(String[] args) {

        String[] options = {
                "New Game",
                "Load Game",
                "Exit"
        };

        Menu.simple("RPG", options, 30);

    }
}
```

---

## Helper Methods

These methods are part of the class implementation and normally do not need to be used directly.

### `generateSeparator(String title, String[] options)`

Automatically generates the separator line (`=`) used in the menu.

The line length is calculated based on the longest text between the title and the options.

**Returns**

```java
String
```

---

### `generateCenterTitle(String separator, String title)`

Centers the title according to the length of the separator line.

**Returns**

```java
String
```

---

## Features

* ✅ Quick menu creation for terminal applications.
* ✅ Automatic option numbering.
* ✅ Automatically generated separator.
* ✅ Centered title.
* ✅ Typing effect support through the `Write` class.
* ✅ No object creation required (all methods are `static`).

## Complete Example

```java
import cpl.menu.Menu;

public class Main {

    public static void main(String[] args) {

        String[] menu = {
                "Register user",
                "List users",
                "Remove user",
                "Exit"
        };

        Menu.simple("SYSTEM", menu);

    }
}
```

**Output:**

```text
========================================
                 SYSTEM
========================================
1- Register user
2- List users
3- Remove user
4- Exit
========================================
```

## Notes

* The menu width is automatically calculated based on the longest text provided.
* The title is centered according to the separator length.
* To use `simple(String title, String[] options, int delay)`, the `Write` class must be available in the project.
