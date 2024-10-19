print("Simple Calculator")
print("Choose an operation:")
print("1. Addition (+)")
print("2. Subtraction (-)")
print("3. Multiplication (*)")
print("4. Division (/)")

num1 = eval(input("Enter the first number: "))
num2 = eval(input("Enter the second number: "))
operation = input("Enter the operation (1/2/3/4): ")

if operation == '1':
    result = num1 + num2
elif operation == '2':
    result = num1 - num2
elif operation == '3':
    result = num1 * num2
elif operation == '4':
    result = num1 / num2 if num2 != 0 else "Cannot divide by zero"
else:
    result = "Invalid operation choice."

print("Result:", result)