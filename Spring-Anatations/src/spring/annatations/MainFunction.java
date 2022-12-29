package spring.annatations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainFunction {

	public static void main(String[] args) {

		 ClassPathXmlApplicationContext bean = new
		 ClassPathXmlApplicationContext("applicationContext.xml");
		
		 ICoach coach = bean.getBean("footBall", ICoach.class);
		
		 System.out.println(coach.getDailyWork());

		
	}

}
