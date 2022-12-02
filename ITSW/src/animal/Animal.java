package animal;

public abstract class Animal {
	private int mass;
	private String Name;
	private int age;
	
	public Animal(int mass, String name, int age) {
		super();
		this.mass = mass;
		Name = name;
		this.age = age;
	}
	
	protected void sayHello() {
	}

	
	
	
	public int getMass() {
		return mass;
	}

	public void setMass(int mass) {
		this.mass = mass;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	
}
