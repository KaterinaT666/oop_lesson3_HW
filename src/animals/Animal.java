package animals;

import java.util.Objects;

public abstract class Animal {

	private String name;
	private int age;

	public Animal(String name, int age) {
		setName(name);
		setAge(age);
	}

	public abstract void eat();

	public abstract void sleep();

	public abstract void go();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name == null || name.isEmpty()){
		}
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age < 0){
		}
		this.age = age;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o){
			return true;
		}
		if (o == null || getClass() != o.getClass()){
			return false;
		}
		Animal animal = (Animal) o;
		return age == animal.age && Objects.equals(name, animal.name);
	}

	public abstract void print();
}
