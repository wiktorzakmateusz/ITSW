package animal;

public class Bird extends Animal {
	
	private double wingsWidth;
	private boolean isMigrating;
	
	public Bird(int mass, String name, int age, double wingsWidth, boolean isMigrating) {
		super(mass, name, age);
		this.wingsWidth = wingsWidth;
		this.isMigrating = isMigrating;
	}

	@Override
	protected void sayHello() {
		System.out.println("Hi, im bird and my name is" + getName());
	}

	public double getWingsWidth() {
		return wingsWidth;
	}

	public void setWingsWidth(double wingsWidth) {
		this.wingsWidth = wingsWidth;
	}

	public boolean isMigrating() {
		return isMigrating;
	}

	public void setMigrating(boolean isMigrating) {
		this.isMigrating = isMigrating;
	}
	
	
	
	
	

}
