package animals;

import java.util.Objects;

public class NonFlyingBird extends Bird{

	private String movement;
	public NonFlyingBird(String name,
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

	public void walk(){System.out.println("Нелетающая птица гуляет по земле");}

	@Override
	public void eat() {
		System.out.println("Нелетающая птица ест на земле");
	}

	@Override
	public void sleep() {
		System.out.println("Нелетающая птица спит ночью");
	}

	@Override
	public void go() {
		System.out.println("Нелетающая птица ходит на 2х лапах" + getMovement());
	}

	@Override
	public void hunt() {
		System.out.println("Нелетающая птица охотится на земле");
	}

	@Override
	public void fly() {

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
		NonFlyingBird that = (NonFlyingBird) o;
		return Objects.equals(getMovement(), that.getMovement());
	}

	@Override
	public String toString() {
		return "Животное, " + getClass() +
				", по кличке: " + getName() +
				", возраста: " + getAge() + " лет" +
				", среда проживания: " + getEnvironment()+
				", способ передвижения: " + getMovement() ;
	}
	public void print(){
		System.out.println(this);
	}
}
