package pet;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
  // Objects
    pets Pets = new pets();
    dog Dog = new dog();
    fish Fish = new fish();
    snake Snake = new snake();

  //menu
  String options;
  Scanner input = new Scanner (System.in);

  System.out.println("Welcome to the SSOP: Secret Socitiy Of Pets. The following information is Classified to continue type your last name");
  options = input.nextLine();

  if(options.equalsIgnoreCase("d'angelo")){
    System.out.println("Welcome D'Angelo your level of clearance allows you to view the following: \n 1. Example \n 2. Dog \n 3. Fish \n 4. Snake" );
    String var = input.next();

    if(var.equals("1")){
      System.out.println(pets.getName() + "\n" + pets.getAct() + "\n" + pets.getFood() + "\n" + pets.getSpeak());
    }
    if(var.equals("2")){
        System.out.println(dog.getName() + "\n" + dog.getAct() + "\n" + dog.getFood() + "\n" + dog.getSpeak());
      }
    if(var.equals("3")){
        System.out.println(fish.getName() + "\n" + fish.getAct() + "\n" + fish.getFood() + "\n" + fish.getSpeak());
      }
    if(var.equals("4")){
        System.out.println(snake.getName() + "\n" + snake.getAct() + "\n" + snake.getFood() + "\n" + snake.getSpeak());
      }


  else {
    System.out.println("INCORRECT PASSWORD");
  }
  }
}
}