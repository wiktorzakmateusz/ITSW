package animal;

public class Mammal extends Animal {

	private double temperature;
	private int numberOfChildren;
	
	
	
	public Mammal(int mass, String name, int age, double temperature, int numberOfChildren) {
		super(mass, name, age);
		this.temperature = temperature;
		this.numberOfChildren = numberOfChildren;
	}

	@Override
	public void sayHello() {
		System.out.println("Hi, im mammal and my name is " + getName());
	}


	public double getTemperature() {
		return temperature;
	}

	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}

	public int getNumberOfChildren() {
		return numberOfChildren;
	}

	public void setNumberOfChildren(int numberOfChildren) {
		this.numberOfChildren = numberOfChildren;
	}
	
	
	

}
