package animal;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Demonstrator {
	public static void main(String[] args) {
		
		String[] names = {"finn", "apollo", "murphy" , "diesel", "simba", "george"};
		String[] dogOwnerName = {"Noah", "Emma", "Oliver", "Amelia", "James", "Henry", "Lucas"};
		String[] dogFood = {"chicken", "bone", "turkey", "beef"};
		
		List<Dog> dogs = new ArrayList();
		Random random = new Random();
		
		for (int i = 0; i < 10; i++) {
			dogs.add(new Dog(
					random.nextInt(1, 101),
					names[random.nextInt(0, names.length)],
					random.nextInt(1, 101),
					Math.round(random.nextDouble(20, 40)),
					random.nextInt(1, 11),
					dogOwnerName[random.nextInt(0, dogOwnerName.length)],
					dogFood[random.nextInt(0, dogFood.length)]));
			
		}
		
		for (Dog dog: dogs ) {
			dog.sayHello();
		}
		
		
		
	}
}
