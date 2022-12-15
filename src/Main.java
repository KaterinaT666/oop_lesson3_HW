import transport.Bus;
import transport.Car;
import transport.Train;
public class Main {
	public static void main(String[] args) {

		Car lada = new Car("Lada",
				"Priora",
				2015,
				"России",
				null,
				"",
				"",
				0,
				0,
				null,
				null,
				null,
				0,
				null,
				55);

		Car audi = new Car("Audi",
				" A8 50 L TDI quattro",
				2000,
				"Германии",
				null,
				"",
				"",
				0,
				0,
				null,
				null,
				null,
				0,
				null,
				50);

		Car bmw = new Car("BMW",
				null,
				2021,
				"Германия",
				null,
				null,
				"",
				0,
				0,
				null,
				null,
				null,
				0,
				null,
				45);

		Car kia = new Car("Kia",
				"Sportage 4-го поколения",
				2018,
				"Южной Корее",
				"",
				null,
				"",
				0,
				0,
				null,
				null,
				null,
				0,
				null,
				50);

		Car hyundai = new Car("Hyundai",
				"Avante",
				2016,
				"оранжевый",
				"Южной Корее",
				"",
				"",
				0,
				0,
				null,
				null,
				null,
				0,
				null,
				45);


		lada.print();
		audi.print();
		bmw.print();
		kia.print();
		hyundai.print();


		Train lastochka = new Train("«Ласточка»",
				" B-901",
				2011,
				"России",
				"",
				301,
				3500,
				0,
				"Белорусского вокзала",
				"Минск-Пассажирский",
				11,
				"дизель",
				57);

		Train leningrad = new Train("«Ленинград»",
				"D-125",
				2019,
				"России",
				"",
				270,
				1700,
				0,
				"Ленинградского вокзала",
				"Ленинград-Пассажирский",
				8,
				"дизель",
				55);
		lastochka.print();
		leningrad.print();

		Bus liaz = new Bus("ЛиАЗ",
				"677",
				1960,
				"Россия",
				"желтый",
				90,
				"дизель",
				58);

		Bus paz = new Bus ("ПАЗ",
				"3205",
				2000,
				"Россия",
				"белый",
				100,
				"дизель",
				60);
		Bus nefaz = new Bus("НефАЗ",
				"5299",
				2010,
				"Россия",
				"синий",
				120,
				"дизель",
				67);

		liaz.print();
		paz.print();
		nefaz.print();
	}
}