package transport;

public class Car extends Transport {

	private String gear;
	private String body;
	private String number;
	private int capacity;
	private boolean summerTyres;
	private Key key;
	private Insurance insurance;
	private double engineVolume;

	private static class Key{

	}

	private static class Insurance{

	}

	public Car(String brand,
			   String model,
			   int productionYear,
			   String country,
			   String gear,
			   String body,
			   String number,
			   int capacity,
			   double engineVolume,
			   Key key,
			   Insurance insurance,
			   String color,
			   int maxSpeed,
			   String fuel,
			   double percentageFuel) {
		super(brand, model, productionYear, country, color, maxSpeed,fuel, percentageFuel);
		this.gear = gear;
		this.body = body;
		this.number = number;
		this.capacity = capacity;
		this.key = key;
		this.insurance = insurance;
		setEngineVolume(engineVolume);
	}

	public double getEngineVolume() {
		return engineVolume;
	}

	public void setEngineVolume(double engineVolume) {
		if (Double.compare(engineVolume,0D) == 0){
			engineVolume = 1.5;
		}
		this.engineVolume = engineVolume;
	}

	public Key getKey() {
		return key;
	}

	public void setKey(Key key) {
		this.key = key;
	}

	public Insurance getInsurance() {
		return insurance;
	}

	public void setInsurance(Insurance insurance) {
		this.insurance = insurance;
	}

	public String getGear() {
		return gear;
	}

	public void setGear(String gear) {
		this.gear = gear;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public void refill(){
		System.out.println("Автомобиль заправлен топливом " + getFuel() );
		setPercentageFuel(100.00);
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public boolean isSummerTyres() {
		return summerTyres;
	}

	public void setSummerTyres(boolean summerTyres) {
		this.summerTyres = summerTyres;
	}

	public String toString(){
		return " Марка автомобиля: " + getBrand() + ". " + " Модель автомобиля: " + getModel() + ". " +
				" Сборка в: " + getCountry() + ". " + " Цвет кузова — " + getColor() + ". " +
				" Объем двигателя — " + getEngineVolume() + "л" + ". " +
				" Год выпуска — " + getProductionYear() +"год."
				+ " Коробка передачь: " + getGear() +
				" Тип кузова: " + body +
				" Номер: " + number +
				" Колличество мест: " + getCapacity() +
				" Тип резины: " + summerTyres + getFuel() + getPercentageFuel();
	}
	public void print(){
		System.out.println(this);
	}
}


