package First_Task;

public abstract class Pet {
	
	private String name;
		
	Pet(String name){
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public abstract void Voice();

}
