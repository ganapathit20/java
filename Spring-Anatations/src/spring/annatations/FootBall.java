package spring.annatations;

import org.springframework.stereotype.Component;

@Component
public class FootBall implements ICoach {

	@Override
	public String getDailyWork() {
		return "Do Running Practice...";
	}

}
