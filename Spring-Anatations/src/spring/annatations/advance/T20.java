package spring.annatations.advance;

import org.springframework.stereotype.Component;

@Component
public class T20 implements ITwentyTwenty{

	@Override
	public String Start() {
		return "ICC T20 nxt year started..";
	}

}
