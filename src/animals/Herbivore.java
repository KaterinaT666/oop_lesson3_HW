package animals;

import java.util.Objects;

public class Herbivore extends Mammal{

	private String food;

	public Herbivore(String name,
					 int age,
					 String environment,
					 int speed,
					 String food) {
		super(name, age, environment, speed);
		setFood(food);	}

	public String getFood() {
		return food;
	}

	public void setFood(String food) {
		if (food == null || food.isEmpty()){
		}
		this.food = food;
	}

	public void graze(){
		System.out.println("Травоядное пасется");
	}

	@Override
	public void hunt() {

	}

	@Override
	public void eat() {
		System.out.println("Травоядное питается " + getFood());
	}

	@Override
	public void sleep() {
		System.out.println("Травоядное спит ночью ");
	}

	@Override
	public void go(){
		System.out.println("Травоядное ходит на 4х лапах");
	}

	@Override
	public void walk() {
		System.out.println("Травоядное гуляет днем ");
	}

	@Override
	public boolean equals(Object o) {
		if (this == o){
			return true;
		}
		if (o == null || getClass() != o.getClass()){
			return false;
		}
		if (!super.equals(o)){
			return false;
		}
		Herbivore herbivore = (Herbivore) o;
		return Objects.equals(getFood(), herbivore.getFood());
	}

	@Override
	public String toString() {
		return "Животное, " + getClass() +
				", по кличке: " + getName() +
				", возраста: " + getAge() + " лет" +
				", среда проживания: " + getEnvironment() +
				", пища: " + getFood()+
				", скорость передвижения: " + getSpeed() + "км/ч";
	}
	public void print(){
		System.out.println(this);
	}
}
