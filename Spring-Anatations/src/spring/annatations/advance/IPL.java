package spring.annatations.advance;

import org.springframework.stereotype.Component;

@Component
public class IPL implements ITwentyTwenty {

	@Override
	public String Start() {
		return "April 4th in India";
	}

}
