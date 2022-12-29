package spring.basic;

public class Bike implements Vehicle {

	@Override
	public String getVehicleName() {
		return "Hero Honda";
	}

	@Override
	public String getPrice() {
		return "90000";
	}

}
