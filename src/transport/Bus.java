package transport;

public class Bus extends Transport{

	public Bus(String brand,
			   String model,
			   int productionYear,
			   String country,
			   String color,
			   int maxSpeed,
			   String fuel,
			   double percentageFuel) {
		super(brand, model, productionYear, country, color, maxSpeed, fuel, percentageFuel);


	}

	public void refill(){
		System.out.println("Автобус заправлен топливом " + getFuel());
		setPercentageFuel(100.00);
	}

	@Override
	public String toString() {
		return "Автобус марки: " + getBrand() + ", модель: " + getModel() +
				" год производства: " + getProductionYear() + ", страна производства: "
				+ getCountry() + " цвет: " + getColor() + ", максимальная скорость: "
				+ getMaxSpeed() + "." + getFuel() + getPercentageFuel();
	}
	public void print(){
		System.out.println(this);
	}
}
