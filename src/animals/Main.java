package animals;

public class Main {

	public static void main(String[] args) {
		Mammal gazelle = new Herbivore("Юна",
				5,
				"Саванна",
				50,
				"свежие трава и листья");
		gazelle.print();
		gazelle.eat();
		gazelle.sleep();
		gazelle.go();
		gazelle.walk();
		gazelle.graze();

		Mammal giraffe = new Herbivore("Жора",
				7,
				"Саванна",
				10,
				"свежие листья");
		giraffe.print();
		giraffe.eat();
		giraffe.sleep();
		giraffe.go();
		giraffe.walk();
		giraffe.graze();

		Mammal horse = new Herbivore("Ника",
				10,
				"степи",
				40,
				"свежей травой, сеном");
		horse.print();
		horse.eat();
		horse.sleep();
		horse.go();
		horse.walk();
		horse.graze();

		Mammal hyena = new Predator("Жужа",
				3,
				"Саванна",
				25,
				"мелкие позвоночные, ягнята, козлята");
		hyena.print();
		hyena.eat();
		hyena.sleep();
		hyena.go();
		hyena.walk();
		hyena.hunt();

		Mammal tiger = new Predator("Луна",
				6,
				"Саванна",
				20,
				"парнокопытные, рыба");
		tiger.print();
		tiger.eat();
		tiger.sleep();
		tiger.go();
		tiger.walk();
		tiger.hunt();

		Mammal bear = new Predator("Миша",
				9,
				"лес",
				20,
				"орехи, рыба, ягоды");
		bear.print();
		bear.eat();
		bear.sleep();
		bear.go();
		bear.walk();
		bear.hunt();

		Amphibian frog = new Amphibian("Ляша",
				2, "болотистые водоемы");
		frog.print();
		frog.eat();
		frog.sleep();
		frog.go();
		frog.hunt();

		Amphibian grassSnakeFreshwater = new Amphibian("Жук",
				1,
				"болота, реки, озера");
		grassSnakeFreshwater.print();
		grassSnakeFreshwater.eat();
		grassSnakeFreshwater.sleep();
		grassSnakeFreshwater.go();
		grassSnakeFreshwater.hunt();


		Bird peacock = new NonFlyingBird("Павлик",
				4,
				"леса и саванны",
				"ходит");
		peacock.print();
		peacock.eat();
		peacock.sleep();
		peacock.go();
		peacock.hunt();
		peacock.walk();

		Bird penguin = new NonFlyingBird("Эль",
				3,
				"Антарктида",
				"ходит, плавает");
		penguin.print();
		penguin.eat();
		penguin.sleep();
		penguin.go();
		penguin.hunt();
		penguin.walk();

		Bird dodo = new NonFlyingBird("Додо",
				4,
				"Джунгли",
				"ходит");
		dodo.print();
		dodo.eat();
		dodo.sleep();
		dodo.go();
		dodo.hunt();
		dodo.walk();

		Bird seagull = new FlyingBird("Левингстон",
				7,
				"побережье морей и океанов",
				"летает");
		seagull.print();
		seagull.eat();
		seagull.sleep();
		seagull.go();
		seagull.hunt();
		seagull.fly();

		Bird albatross = new FlyingBird("Рос",
				5,
				"воды вокруг Антарктиды",
				"летает");
		albatross.print();
		albatross.eat();
		albatross.sleep();
		albatross.go();
		albatross.hunt();
		albatross.fly();

		Bird falcon = new FlyingBird("Ястреб",
				6,
				"везде",
				"летает");
		falcon.print();
		falcon.eat();
		falcon.sleep();
		falcon.go();
		falcon.hunt();
		falcon.fly();


		falcon.eat();
		peacock.eat();
		gazelle.eat();
	}
}
