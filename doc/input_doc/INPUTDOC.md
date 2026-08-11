# Input Class

## Utilities

Capture data entered by the user in the terminal using `Scanner`. The `Input` class provides functions for four types of values: `String`, `double`, `int`, and `boolean`.

> **Attention:** This class does not provide error handling for user input. Handling invalid input is the responsibility of the programmer.

## Functions

### `catchBoolean()`

This function captures the next boolean value entered by the user in the terminal, analyzes it, and returns the value.

#### Example

```java
public void genericFunction(){
    boolean userValue = Input.catchBoolean();
    System.out.println(userValue);
}
```

**Output:**

```text
true
true
```

or

```text
false
false
```

---

### `catchString()`

Following the same pattern as the previous function, `catchString()` waits for a `String` value entered by the user, reads it, and returns the value.

#### Example

```java
public void genericFunction(){
    String userValue = Input.catchString();
    System.out.println(userValue);
}
```

**Output:**

```text
CPL is very useful!
CPL is very useful!
```

---

### `catchInt()`

This function waits for an `int` value entered by the user, reads it, and returns the value.

#### Example

```java
public void genericFunction(){
    int userValue = Input.catchInt();
    System.out.println(userValue);
}
```

**Output:**

```text
100
100
```

---

### `catchDouble()`

This function waits for a `double` value entered by the user, reads it, and returns the value.

#### Example

```java
public void genericFunction(){
    double userValue = Input.catchDouble();
    System.out.println(userValue);
}
```

**Output:**

```text
5.94
5.94
```

---

## Detailed Example: Simple Addition

The following example demonstrates how the `Input` class can be used to capture different types of user input in a simple addition program.

```java
public void sum(){
    System.out.println("Hey! What is your name?");
    String name = Input.catchString();

    System.out.println("Let's calculate a sum!");

    System.out.println("What is the first value?");
    int value1 = Input.catchInt();
    
    System.out.println("What is the second value?");
    int value2 = Input.catchInt();

    System.out.println("Do you want to see the sum? true/false");
    boolean answer = Input.catchBoolean();

    if(answer){
        int sum = value1 + value2;
        System.out.println("Sum: " + sum);
    }else{
        System.out.println("Okay, bye " + name + "!");
    }
}
```
