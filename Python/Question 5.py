#Funtions/Methods
def nameReverse(userName):
    return userName[::-1]#A simple method to reverse the string


def vowelCheck(userName, vowels):
    userName=userName.casefold()#Makes the user input ignore cases(i.e .equalsIgnoreCase from java)
   
    count = {}.fromkeys(vowels, 0)#Creates a dictionary with key as a vowel and the value is 0
    #Creates a for loop to count the vowels
    for char in userName:
        if char in count:
            count[char]+=1
    return count

#Declares the vowel string
vowels = "aeiou"

#Asks for user input
userName = input("What is your name?\n")

#Print Statements 
print("Name in reverse:")
print(nameReverse(userName))
print("Vowels in name:")
print(vowelCheck(userName,vowels))