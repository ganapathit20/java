package spring.constr.inject;

public class Car implements Vehicle{
	
	
	private HondaHero honda;
	
	public Car(HondaHero honda) {
		this.honda = honda;
	}

	@Override
	public String getVehicleName() {
		return "BMW";
	}

	@Override
	public String getPrice() {
		return "2000000";
	}

	@Override
	public String getMillage() {
		return honda.getMillage();
	}

}
