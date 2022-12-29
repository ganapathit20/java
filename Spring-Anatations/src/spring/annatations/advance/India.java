package spring.annatations.advance;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
public class India implements ICricket{
//	@Autowired
//	private IPL ipl;
	
	@Autowired
	@Qualifier("t20")
	private ITwentyTwenty match;
	
//	@Autowired
//	public void setIpl(IPL ipl) {
//		this.ipl = ipl;
//	}

	@Override
	public String match() {
		return "Nxt Match of Austria";
	}

	@Override
	public String t20() {
		return match.Start();
	}
	
	
	
	
	

}
