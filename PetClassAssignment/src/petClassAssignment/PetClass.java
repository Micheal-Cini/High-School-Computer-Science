package petClassAssignment;

public class PetClass {

	//Declares variables (I used "protected" so that I can use between classes without using getters/setters
	protected String name;
	protected String activity;
	protected String food;
	protected String sound;
	private String menuAnswer;

	//Getter for name
	public String getName() {
		return name;
	}

	//Default Constructor
	public PetClass() {
		this.name = " ";
		this.activity = " ";
		this.food = " ";
		this.sound = " ";
	}
	
	//Default toString that is polymorphed by other classes
	public String showToString() {
		return "\nInformation about Oinkers: \n"
				+ "Species - Pig\n"
				+ "Favourite Activity(ies) - Loves to Eat Food\n"
				+ "Favourite Food - Bacon\n"
				+ "Sound - Oink Oink\n";		
	}
	
	//Class that is made for polymorphism
	public String movement() {
		return "Movement - Doesn't like to move";
	}
	
	//Class that is made for polymorphism
	public String hair() {
		return "Hair/Fur - Has very short hair";
		
	}

	//Getter for getting activity
	public String getActivity() {
		return activity;
	}

	//Setter for setting activity
	public void setActivity(String activity) {
		this.activity = activity;
	}

	//Getter for getting food
	public String getFood() {
		return food;
	}

	//Setter for setting food
	public void setFood(String food) {
		this.food = food;
	}

	//Getter for getting food
	public String getSound() {
		return sound;
	}

	//Setter for setting sound
	public void setSound(String sound) {
		this.sound = sound;
	}

	//Setter for setting name
	public void setName(String name) {
		this.name = name;
	}

	//Getter for getting MenuAnswer
	public String getMenuAnswer() {
		return menuAnswer;
	}

	//Setter for setting MenuAnswer
	public void setMenuAnswer(String menuAnswer) {
		this.menuAnswer = menuAnswer;
	}
	
}
