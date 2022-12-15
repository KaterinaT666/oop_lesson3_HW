package animals;

import java.util.Objects;

public abstract class Mammal extends Animal{//млекопитающие

	private int speed;
	private String environment;

	public Mammal(String name,
				  int age,
				  String environment,
				  int speed) {
		super(name, age);
		setSpeed(speed);
		setEnvironment(environment);
	}
	public abstract void walk();

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		if (speed < 0){
		}
		this.speed = speed;
	}
	public String getEnvironment() {
		return environment;
	}

	public void setEnvironment(String environment) {
		if (environment == null || environment.isEmpty()){
		}
		this.environment = environment;
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
		Mammal mammal = (Mammal) o;
		return speed == mammal.speed && Objects.equals(environment, mammal.environment);
	}

	public abstract void graze();

	public abstract void hunt();
}
