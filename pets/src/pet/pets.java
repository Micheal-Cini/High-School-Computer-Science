package pet;
public class pets{

    protected String Name;
    protected String Act;
    protected String Food;
    protected String Speak;

  public pets() {
    this.Name = " ";
    this.Act = " ";
    this.Food = " ";
    this.Speak = " ";
  }

  public void setName(String Name) {
    this.Name = Name;
  }

  public String getName(){
    return Name;
  }

  public void setAct(String Act) {
    this.Act = Act;
  }

  public String getAct(){
    return Act;
  }
  public void setFood(String Food) {
    this.Food = Food;
  }

  public String getFood(){
    return Food;
  }
  public void setSpeak(String Speak) {
    this.Speak = Speak;
  }

  public String getSpeak() {
    return Speak;
  }

 

}