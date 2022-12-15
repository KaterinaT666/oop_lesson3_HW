package animals;

import java.util.Objects;

public class Predator extends Mammal{

	private String food;

	public Predator(String name,
					int age,
					String environment,
					int speed,
					String food) {
		super(name, age, environment, speed);
		setFood(food);
	}

	public String getFood() {
		return food;
	}

	public void setFood(String food) {
		if (food == null || food.isEmpty()){
		}
		this.food = food;
	}

	@Override
	public void eat() {System.out.println("Хищник охотится ");}

	@Override
	public void sleep() {
		System.out.println("Хищник спит днем");
	}

	@Override
	public void go() {
		System.out.println("Хищник ходит на 4х лапах");
	}

	@Override
	public void walk() {
		System.out.println("Хищник гуляет ночью и днем");
	}


	public void hunt() {
		System.out.println("Хищник охотится");
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		if (!super.equals(o)){
			return false;
		}
		Predator predator = (Predator) o;
		return Objects.equals(getFood(), predator.getFood());
	}

	@Override
	public void graze() {

	}

	@Override
	public String toString() {
		return "Животное, " + getClass() +
				", по кличке: " + getName() +
				", возраста: " + getAge() + " лет" +
				", среда проживания: " + getEnvironment() +
				", скорость передвижения: " + getSpeed() + " км/ч" +
				", пища : " + getFood();
	}
	public void print(){
		System.out.println(this);
	}
}
