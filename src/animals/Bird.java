package animals;

import java.util.Objects;

public abstract class Bird extends Animal{
	private String environment;
	public Bird(String name,
				int age,
				String environment) {
		super(name, age);
		setEnvironment(environment);
	}

	public String getEnvironment() {
		return environment;
	}

	public void setEnvironment(String environment) {
		if (environment == null || environment.isEmpty()){
		}
		this.environment = environment;
	}
	public abstract void hunt();
	public abstract void fly();

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
		Bird bird = (Bird) o;
		return Objects.equals(environment, bird.environment);
	}

	public abstract void walk();
}
