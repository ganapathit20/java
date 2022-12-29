package spring.basic;

public class Car implements Vehicle{

	@Override
	public String getVehicleName() {
		return "BMW";
	}

	@Override
	public String getPrice() {
		return "2000000";
	}

}
