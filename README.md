# Build a simple calculator

A console calculator. It shows a menu, reads two numbers and prints the answer with 2 decimals, like `12.00 + 3.50 = 15.50`.

## Features

- Show a menu: 1 Add, 2 Subtract, 3 Multiply, 4 Divide, 5 Exit.
- Read the user's choice and two numbers with `Scanner`.
- Print the result with 2 decimal places.
- Show the menu again after every calculation, until the user picks 5.
- For a choice outside 1 to 5, print a message and show the menu again.
- Never divide by zero: print `Cannot divide by zero.` instead.

## How to run

```
javac Calculator.java
java Calculator
```

## Sample run

```
=== Simple Calculator ===

1. Add
2. Subtract
3. Multiply
4. Divide
5. Exit
Choose an option (1-5): 1
First number: 12
Second number: 3.5
12.00 + 3.50 = 15.50

1. Add
2. Subtract
3. Multiply
4. Divide
5. Exit
Choose an option (1-5): 4
First number: 10
Second number: 0
Cannot divide by zero.

1. Add
2. Subtract
3. Multiply
4. Divide
5. Exit
Choose an option (1-5): 5
Goodbye!
```

## What I used

- [`Scanner`](/learn/java/basics/input-and-output/reading-numbers-text-and-characters) to read whole numbers and decimals (`nextInt`, `nextDouble`)
- A [`while` loop](/learn/java/basics/loops/while-and-do-while) that runs while a `boolean` is `true`
- [`if` / `else if`](/learn/java/basics/conditional-statements/else-if-and-multiple-conditions) to check the choice
- [`switch` expressions](/learn/java/basics/conditional-statements/modern-switch-expressions) with `->`
- [Methods that return a value](/learn/java/basics/methods/return-values-and-void)
- [`printf`](/learn/java/basics/input-and-output/formatting-output) with `%.2f`

## Author

[@munaf085](https://github.com/munaf085)

## Tested

Built in the [MentorNxt](https://www.mentornxt.com/learn/java) Java project lab, where it passed all 6 hidden tests.
