package animals;

public class Amphibian extends Animal{
	private String environment;

	public Amphibian(String name,
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

	public void hunt() {
		System.out.println("Земноводное охотится около воды");
	}

	@Override
	public void eat() {
		System.out.println("Земноводное питается насекомыми или рыбой");
	}

	@Override
	public void sleep() {
		System.out.println("Земноводное спит ночью");
	}

	@Override
	public void go() {
		System.out.println("Земноводное ходит на 4х лапах или ползает либо плавает");
	}

	@Override
	public String toString() {
		return "Животное," + getClass() +
				", по кличке: " + getName() +
				", возраста: " + getAge() + " лет" +
				", среда проживания: " + getEnvironment();
	}
	public void print(){
		System.out.println(this);
	}
}
