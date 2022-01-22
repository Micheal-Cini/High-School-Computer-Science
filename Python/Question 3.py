#Fuctions/Methods
def UStoCAD(amount):
    cad = amount*1.27#Multiplies the given amount by 1.27
    return round(cad,2)#Returns the amount rounded to 2 decimal places

def CADtoUS(amount):
    us = amount*0.79#Multiplies the given amount by 0.79
    return round(us)#Returns the amount rounded to 2 decimal places

#Asks use for input
answer = int(input("Do you want to convert from\n1)US to CAD\n2)CAD to US\n"))

#If statements to check what the user wants to do
if(answer==1):
    convert = float(input("How much USD do you have?\n"))
    print("$",convert, "USD is equal to $",UStoCAD(convert)," CAD")#Prints total USD to CAD

elif(answer==2):
    convert = float(input("How much CAD do you have?\n"))
    print("$",convert, "CAD is equal to $",CADtoUS(convert)," USD")#Prints total CAD to USD