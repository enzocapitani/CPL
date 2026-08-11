# `Header`

The `Header` class provides methods for creating and displaying **formatted headers in the terminal**.

Headers consist of a separator line and a centered title. The class also provides an animated version using the `Write` class to display the header character by character.

---

## 📦 Package

```java
CPL.menu
```

---

## 🔧 Features

The class provides the following features:

* 📌 Create centered headers.
* ➖ Automatically generate separators based on the title length.
* ✏️ Use a custom separator.
* ⏱️ Display headers with a typing animation.
* 🎨 Use the writing features provided by the `Write` class.

---

## Dependencies

The class uses:

```java
import CPL.style.Write;
```

It also uses the `Separator` and `Title` classes from the `CPL.menu` package to generate the header structure.

---

# Methods

## `header(String title)`

Creates and displays a header using an **automatically generated separator**.

The separator width is determined based on the title length.

### Parameters

| Parameter | Type     | Description                    |
| --------- | -------- | ------------------------------ |
| `title`   | `String` | Title displayed in the header. |

### Example

```java
Header.header("Library Management System");
```

Approximate output:

```text
-------------------------------------
       Library Management System
-------------------------------------
```

The separator is automatically generated using:

```java
Separator.generateSeparator(title);
```

The title is centered using:

```java
Title.generateCenterTitle(separator, title);
```

---

## `header(String title, String separator)`

Creates and displays a header using a **user-defined separator**.

This version provides greater control over the appearance of the header.

### Parameters

| Parameter   | Type     | Description                                |
| ----------- | -------- | ------------------------------------------ |
| `title`     | `String` | Title displayed in the header.             |
| `separator` | `String` | Separator displayed above and below title. |

### Example

```java
Header.header("Main Menu", "==============================");
```

Output:

```text
==============================
          Main Menu
==============================
```

Different characters can also be used:

```java
Header.header("Settings", "##############################");
```

Output:

```text
##############################
           Settings
##############################
```

---

## `typeHeader(String title)`

Creates and displays a header with a **typing animation**.

The separator is automatically generated, and all header elements are displayed using the default delay from the `Write` class.

### Parameters

| Parameter | Type     | Description                    |
| --------- | -------- | ------------------------------ |
| `title`   | `String` | Title displayed in the header. |

### Example

```java
Header.typeHeader("Library Management System");
```

The header will be displayed with an animation:

```text
-------------------------------------
       Library Management System
-------------------------------------
```

However, each character will appear gradually.

Internally, the method uses:

```java
Write.type(separator);
Write.type(Title.generateCenterTitle(separator, title));
Write.type(separator);
```

---

## `typeHeader(String title, int delay)`

Creates and displays an animated header using a **custom delay**.

The delay is applied individually to each part of the header.

### Parameters

| Parameter | Type     | Description                                    |
| --------- | -------- | ---------------------------------------------- |
| `title`   | `String` | Title displayed in the header.                 |
| `delay`   | `int`    | Delay between each character, in milliseconds. |

### Example

```java
Header.typeHeader("Loading system...", 75);
```

In this case, each character will be displayed with a `75 ms` delay.

For a faster animation:

```java
Header.typeHeader("Loading...", 20);
```

For a slower animation:

```java
Header.typeHeader("Loading...", 150);
```

---

# 📋 API Summary

| Method                    | Separator | Animation | Delay   |
| ------------------------- | --------- | --------- | ------- |
| `header(String)`          | Automatic | ❌         | —       |
| `header(String, String)`  | Custom    | ❌         | —       |
| `typeHeader(String)`      | Automatic | ✅         | Default |
| `typeHeader(String, int)` | Automatic | ✅         | Custom  |

---

# 🧩 Usage Examples

## Simple Header

```java
Header.header("MAIN MENU");
```

---

## Header with a Custom Separator

```java
Header.header(
    "MAIN MENU",
    "================================"
);
```

---

## Animated Header

```java
Header.typeHeader("MAIN MENU");
```

---

## Animated Header with Custom Speed

```java
Header.typeHeader("MAIN MENU", 50);
```

---

# 🔗 Integration with Other Classes

The `Header` class acts as an abstraction layer over other CPL features.

### `Separator`

Responsible for automatically generating the separator:

```java
String separator = Separator.generateSeparator(title);
```

### `Title`

Responsible for centering the title according to the separator length:

```java
Title.generateCenterTitle(separator, title);
```

### `Write`

Used by the `typeHeader()` methods to add the typing animation:

```java
Write.type(separator);
```

This allows `Header` to combine multiple library features and simplify the creation of terminal interfaces.

---

# 💡 Example in an Application

The class can be used to structure different sections of a console application:

```java
Header.header("LIBRARY MANAGEMENT SYSTEM");

System.out.println("1 - Register book");
System.out.println("2 - List books");
System.out.println("3 - Borrow book");
System.out.println("4 - Return book");
System.out.println("0 - Exit");
```

It can also be used together with the typing animation:

```java
Header.typeHeader("LIBRARY MANAGEMENT SYSTEM", 30);

Write.type("1 - Register book");
Write.type("2 - List books");
Write.type("3 - Borrow book");
Write.type("4 - Return book");
Write.type("0 - Exit");
```

---

## ⚠️ Notes

* Title centering depends on the size of the `separator`.
* When no separator is provided, it is automatically generated using `Separator`.
* `typeHeader()` uses the `Write` class and therefore follows the same delay behavior.
* The delay is specified in **milliseconds**.
* The class only contains `static` methods, so creating a `Header` instance is not necessary.

### Example

There is no need to do this:

```java
Header header = new Header();
```

Simply use:

```java
Header.header("My System");
```

---

## 📄 Class Structure

In simplified form, the class can be represented as follows:

```text
Header
│
├── header(String)
│   ├── Separator
│   └── Title
│
├── header(String, String)
│   └── Title
│
├── typeHeader(String)
│   ├── Separator
│   ├── Title
│   └── Write
│
└── typeHeader(String, int)
    ├── Separator
    ├── Title
    └── Write
```

The main purpose of the class is to **simplify the creation of standardized headers in terminal applications**, eliminating the need for developers to manually implement separator generation and title alignment.
