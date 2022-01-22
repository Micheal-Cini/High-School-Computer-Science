package Assignment_1;

import java.util.Scanner;

	class assignment1 {
	  public static void main(String[] args) {
		    Scanner input = new Scanner(System.in);
		    System.out.println("Enter a positive whole number");
		    int num = input.nextInt();
		    while(num<=0){
		      System.out.println("That number is not positive! Please enter a new number");
		      num = input.nextInt();
		    }
		    
		    squareNum(num);
		    facNum(num);
		    factorNum(num);
		    primeNum(num);
		    
		    
		}
		
		public static void squareNum(int num) {
			System.out.println(num + " Squared is: " + (int) Math.pow(num, 2));
		}
		
		public static void facNum(int num) {
			int fact = 1;
		    for(int i=1; i<=num; i++) { 
		    	fact = fact*i;
		    }
		    System.out.println(num + " Factorial is: " + fact);
		}
		
		public static void factorNum(int num) {
		    System.out.print("Factors of " + num + " are: ");
		    
		    // loop runs from 1 to 60
		    for (int i = 1; i <= num; ++i) {
	
		      // if number is divided by i
		      // i is the factor
		      if (num % i == 0) {
		        System.out.print(i + " ");
		      }
		      
		    }
		    System.out.println("");
		}
		
		public static void primeNum(int num) {
		    System.out.print("The prime factors are: ");
		    // Checking for prime numbers
		    int prime = num;
		      for(int i = 2; i< prime; i++) {
		         while(prime%i == 0) {
		            System.out.print(i+" ");
		            prime = prime/i;
		         }
		      }
		      if(prime >2) {
		         System.out.print(prime);
		      }
		}

}