package springdemo;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//annotation allows to add class as a bean to spring container
@Component
public class TennisCoach implements Coach {

	private FortuneService fortuneService;
	
	//using constructor injection
	//@Autowired 
	public TennisCoach(FortuneService fService) {
		fortuneService = fService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Practice backhand volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
