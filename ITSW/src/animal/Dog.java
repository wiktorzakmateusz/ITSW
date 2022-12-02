package animal;

public class Dog extends Mammal {
	
	private String ownerName;
	private String favouriteFood;
	
	public Dog(int mass, String name, int age, double temperature, int numberOfChildren, String ownerName,
			String favouriteFood) {
		super(mass, name, age, temperature, numberOfChildren);
		this.ownerName = ownerName;
		this.favouriteFood = favouriteFood;
	}

	@Override
	public void sayHello() {
		super.sayHello();
		System.out.println("Im also a dog !");
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getFavouriteFood() {
		return favouriteFood;
	}

	public void setFavouriteFood(String favouriteFood) {
		this.favouriteFood = favouriteFood;
	}
	
	
	
	
}
