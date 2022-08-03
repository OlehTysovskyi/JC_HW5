package First_Task;

public class Cow extends Pet {
	
	Cow(String name){
		super("Cow");
	}

	@Override
	public void Voice() {
		System.out.println("I am a "+ this.getName() + " - Muu-Muu");
	}

}
