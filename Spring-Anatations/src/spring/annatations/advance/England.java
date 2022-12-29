package spring.annatations.advance;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class England implements ICricket{
	@Autowired
	private IPL ipl;
	
//	@Autowired
//	public England(IPL ipl) {
//		this.ipl = ipl;
//	}

	@Override
	public String match() {
		return "Nxt match of India";
	}

	@Override
	public String t20() {
		return ipl.Start();
	}

}
