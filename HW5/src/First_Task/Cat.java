package First_Task;

public class Cat extends Pet{
	
	Cat(String name){
		super("Cat");
	}

	@Override
	public void Voice() {
		System.out.println("I am a "+ this.getName() + " - Miau-Miau");

	}

}
