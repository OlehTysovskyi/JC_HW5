package Second_Task;

public class Human {
	
	private String name;
	private int age;
	private int weight;
	private int height;
	
	Human(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	Human(String name, int age, int weight, int height){
		this(name, age);
		this.weight = weight;
		this.height = height;
	}

	@Override
	public String toString() {
		return "Human [name=" + name + ", age=" + age + ", weight=" + weight + ", height=" + height + "]";
	}
	
	
	
	
	
	
	
}
