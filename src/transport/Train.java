package transport;

public class Train extends Transport{

	private int cost;
	private int time;
	private String departureStationName;
	private String finalStop;
	private int volumeWagons;

	public Train(String brand,
				 String model,
				 int productionYear,
				 String country,
				 String color,
				 int maxSpeed,
				 int cost,
				 int time,
				 String departureStationName,
				 String finalStop,
				 int volumeWagons,
				 String fuel,
				 double percentageFuel) {
		super(brand, model, productionYear, country, color, maxSpeed, fuel, percentageFuel);
		setCost(cost);
		setTime(time);
		setDepartureStationName(departureStationName);
		setFinalStop(finalStop);
		setVolumeWagons(volumeWagons);
		setFuel(fuel);
	}
	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		if (cost < 0){
			cost = 0;
		}
		this.cost = cost;
	}

	public double getTime() {
		return time;
	}

	public void setTime(int time) {
		if (time < 0){
			time = 0;
		}
		this.time = time;
	}

	public String getDepartureStationName() {
		return departureStationName;
	}

	public void setDepartureStationName(String departureStationName) {
		if (departureStationName == null || departureStationName.isEmpty()){
			departureStationName = "defalt";
		}
		this.departureStationName = departureStationName;
	}

	public String getFinalStop() {
		return finalStop;
	}

	public void setFinalStop(String finalStop) {
		if (finalStop == null || finalStop.isEmpty()){
			finalStop = "defalt";
		}
		this.finalStop = finalStop;
	}

	public int getVolumeWagons() {
		return volumeWagons;
	}

	public void setVolumeWagons(int volumeWagons) {
		if (volumeWagons < 0){
			volumeWagons = 0;
		}
		this.volumeWagons = volumeWagons;
	}

	public void refill(){
		System.out.println("Поезд заправлен топливом " + getFuel());
		setPercentageFuel(100.00);
	}

	public String toString(){
		return "Поезд " + getBrand() + ", модель " + getModel() +
				getProductionYear() + " год выпуска, в " +
				getCountry() + " скорость передвижения " +
		getMaxSpeed() + " км/ч, " + "отходит от " + getDepartureStationName() +
		" и следует до станции " + getFinalStop() + ". " +
				"Цена поездки — " + getCost()+ " рублей," +
			"в поезде " + getVolumeWagons() + " вагонов." + getFuel() + getPercentageFuel();
	}
	public void print(){
		System.out.println(this);
	}
}
