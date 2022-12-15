package animals;

import java.util.Objects;

public class FlyingBird extends Bird{

	private String movement;

	public FlyingBird(String name,
					  int age,
					  String environment,
					  String movement) {
		super(name, age, environment);
		setMovement(movement);
	}

	public String getMovement() {
		return movement;
	}

	public void setMovement(String movement) {
		if (movement == null || movement.isEmpty()){
		}
		this.movement = movement;
	}

	public void fly(){System.out.println("Летающая птица летает");}

	@Override
	public void eat() {
		System.out.println("Летающая птица ест на земле и в полете");
	}

	@Override
	public void sleep() {
		System.out.println("Летающая птица спит ночью и днем");
	}

	@Override
	public void go() {
		System.out.println("Летающая птица летает" + getMovement());
	}

	@Override
	public void hunt() {
		System.out.println("Летающая птица охотится на земле и в полете");
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
		FlyingBird that = (FlyingBird) o;
		return Objects.equals(getMovement(), that.getMovement());
	}

	@Override
	public void walk() {

	}

	@Override
	public String toString() {
		return "Животное, " + getClass() +
				", по кличке: " + getName() +
				", возраста: " + getAge() + " лет" +
				", среда проживания: " + getEnvironment() +
				", способ передвижения: " + getMovement();
	}
	public void print(){
		System.out.println(this);
	}
}
