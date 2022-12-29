package spring.constr.inject;

public class Bike implements Vehicle {

	private String colour;
	private String speed;

	private HondaHero honda;

	public Bike() {}
	public Bike(HondaHero honda) {
		this.honda = honda;
	}

	@Override
	public String getVehicleName() {
		return "Hero Honda";
	}

	@Override
	public String getPrice() {
		return "90000";
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getSpeed() {
		return speed;
	}

	public void setSpeed(String speed) {
		this.speed = speed;
	}

	public HondaHero getHonda() {
		return honda;
	}

	public void setHonda(HondaHero honda) {
		this.honda = honda;
	}

	@Override
	public String getMillage() {
		return honda.getMillage();
	}

}
