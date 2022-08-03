package First_Task;

public class Main {
	
	public static void main(String[] args) {
		
		Pet cow = new Cow("Cow");
		Pet cat = new Cat("Cat");
		Pet dog = new Dog("Dog");
		
		cow.Voice();
		cat.Voice();
		dog.Voice();

		
	}
}
