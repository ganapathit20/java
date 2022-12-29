package spring.constr.inject;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Running {

	public static void main(String[] args) {
		
		//load config file
		ClassPathXmlApplicationContext bean = new ClassPathXmlApplicationContext("applicationContextCon.xml");
		
		//Retrive bean from spring container
		Vehicle vehicle = bean.getBean("container", Vehicle.class);
		
		//call methods use bean
//		System.out.println(vehicle.getPrice());
//		System.out.println(vehicle.getMillage());
//		System.out.println(vehicle.getVehicleName());
//		
		Bike bike = bean.getBean("bike",Bike.class);
		System.out.println(bike.getColour());
		System.out.println(bike.getSpeed());
		
		//close the bean
		bean.close();
	}

}
