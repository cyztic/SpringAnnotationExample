package springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//annotation allows to add class as a bean to spring container
@Component
@Scope("prototype")
public class TennisCoach implements Coach {

	private FortuneService fortuneService;
	
	//using constructor injection with qualifier to specify which class to inject
	@Autowired 
	public TennisCoach(@Qualifier("randomFortuneService")FortuneService fService) {
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

	//init method
	@PostConstruct
	public void doMyStartUpStuff() {
		System.out.println("do my start up stuff");
	}
	
	//destroy method
	@PreDestroy
	public void doMyCleanUpStuff() {
		System.out.println("do my clean up stuff");
	}
}
