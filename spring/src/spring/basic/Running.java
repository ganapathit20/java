package spring.basic;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Running {

	public static void main(String[] args) {
		
		//load config file
		ClassPathXmlApplicationContext bean = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Retrive bean from spring container
		Vehicle vehicle = bean.getBean("container", Vehicle.class);
		
		//call methods use bean
		System.out.println(vehicle.getPrice());
		System.out.println(vehicle.getVehicleName());
		
		//close the bean
		bean.close();
	}

}
