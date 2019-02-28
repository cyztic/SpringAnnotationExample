package springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BowlingCoach implements Coach {

	private FortuneService fortuneService;
	
	public BowlingCoach(){
		
	}
	
	//using method injection with qualifier to specify which class to inject
	@Autowired
	@Qualifier("happyFortuneService")
	public void setFortuneService(FortuneService fService) {
		fortuneService = fService;
	}
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Bowl 20 strikes";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
