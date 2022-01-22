#Import Classes
import math

#Fuctions/Methods
def volume(r,h):
    v = (math.pi*math.pow(r,2)*h)#Sets v to the volume of the cylinder
    return round(v,2)#Returns the volume rounded to 2 decimals

def area(r,h):
    a = (2*math.pi*r*h+2*math.pi*math.pow(r,2))#Sets a to the surface area of the cylinder
    return round(a,2)#Returns the volume rounded to 2 decimals

#Gets user input for the radius and height
r = float(input("Please enter the radius for your cylinder (in meters)\n"))
h = float(input("Please enter the height for your cylinder (in meters)\n"))

#Prints the volume and surface area
print("The Volume of your cylinder is: ", volume(r,h),"m^3")
print("The Surface Area of your cylinder is: ", area(r,h),"m^2")
