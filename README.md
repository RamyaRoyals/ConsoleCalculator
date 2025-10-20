# 🖩 Console Calculator

## Description
A simple console-based calculator built in Java.  
Supports addition, subtraction, multiplication, and division using operator input (`+`, `-`, `*`, `/`).  
Includes input validation and an option to exit the program.

## Features
- ➕ Addition  
- ➖ Subtraction  
- ✖️ Multiplication  
- ➗ Division  
- Handles divide-by-zero errors  
- Operator-based console input (`+`, `-`, `*`, `/`)  
- Repeat calculations until the user chooses to exit  
- Validates continue input (`y/n`)  

## Requirements
- Java JDK 8 or higher  
- VS Code 

## 🏃 How to Run & Sample Output

> ✅ Note: The instructions and sample output are combined in one section for easier understanding.

1. Open terminal  
2. Navigate to the project folder  
3. Compile and run the program:

```bash
javac CalculatorApp.java
java CalculatorApp

===== Console Calculator =====
Operations: +  -  *  /
==============================

Enter first number: 20
Enter operator (+, -, *, /): *
Enter second number: 10
Result = 200.0

Do you want to continue? (y/n): y

Enter first number: 50
Enter operator (+, -, *, /): /
Enter second number: 0
Error: Cannot divide by zero!
Result = 0.0

Do you want to continue? (y/n): n
Exit!

Author:
Subramanyam Vaari Ramya


