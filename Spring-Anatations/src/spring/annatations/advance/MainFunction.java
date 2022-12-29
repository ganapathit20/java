package spring.annatations.advance;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainFunction {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext bean = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		ICricket cricket = bean.getBean("india", ICricket.class);
		
		String result = cricket.match();
		
		System.out.println(result + "\n" + cricket.t20());
	}

}
