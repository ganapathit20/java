package spring.annatations;

import org.springframework.stereotype.Component;

@Component("cricket")
public class Cricket implements ICoach{

	@Override
	public String getDailyWork() {
		return "Do Bating Practice";
	}
	
	

}
