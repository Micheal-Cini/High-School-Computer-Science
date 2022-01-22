#Import Classes
import math

#Fuctions/Methods
def factorial(amount):
    factorial=1
    #Checks if the number can be used
    if amount<0:
        print("Invalid Entry! A factorial can not be a negative number!")
    elif amount == 0:
        print("0 Factorial is 1")
    else:
        for i in range(1, amount+1):#For loop that muliplies the number by the number below it
            factorial=factorial*i

        print (amount," Factorial is ", factorial)

def sqrt(amount):
    print("The Square root of ",amount," is ", round(math.sqrt(amount),2))#Square Roots the given number

def cubed(amount):
    print(amount," cubed is equal to ", round(math.pow(amount, 3),2))#Cubes the given nubmer

#Takes user input
number = int(input("Please enter a number\n"))

#Outputs the funtions/methods
factorial(number)
cubed(number)
sqrt(number)