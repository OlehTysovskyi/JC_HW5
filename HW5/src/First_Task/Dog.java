package First_Task;

public class Dog extends Pet{

	Dog(String name){
		super("Dog");
	}
	
	@Override
	public void Voice() {
		System.out.println("I am a "+ this.getName() + " - Gav-Gav");
	}




}
