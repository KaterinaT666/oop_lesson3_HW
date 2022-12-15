package transport;

public abstract class Transport {

	private final String brand;
	private final String model;
	private final int productionYear;
	private final String country;
	private String color;
	private int maxSpeed;
	private String fuel;
	private double percentageFuel;

	public Transport(String brand,
					 String model,
					 int productionYear,
					 String country,
					 String color,
					 int maxSpeed,
					 String fuel,
					 double percentageFuel) {
		this.brand = brand;
		this.model = model;
		this.productionYear = productionYear;
		this.country = country;
		this.percentageFuel =percentageFuel;
		setColor(color);
		setMaxSpeed(maxSpeed);
		setFuel(fuel);
	}

	public String getFuel() {
		return fuel;
	}

	public void setFuel(String fuel) {
		if(fuel == null){
			fuel = "1.0";
		}
		this.fuel = fuel;
	}

	public double getPercentageFuel() {
		return percentageFuel;
	}

	public void setPercentageFuel(double percentageFuel) {
		if (percentageFuel < 0.0) {
			percentageFuel = 0.0;
		}
		this.percentageFuel = percentageFuel;
	}

	public String getBrand() {
		return brand;
	}

	public String getModel() {
		return model;
	}

	public int getProductionYear() {
		return productionYear;
	}

	public String getCountry() {
		return country;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		if (color == null || color.isEmpty()){
			color = "белый";
		}
		this.color = color;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		if (maxSpeed <= 0){
			maxSpeed = 120;
		}
		this.maxSpeed = maxSpeed;
	}
	public abstract void  refill();
}
