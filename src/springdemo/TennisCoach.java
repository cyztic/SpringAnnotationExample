package springdemo;

import org.springframework.stereotype.Component;

//annotation allows to add class as a bean to spring container
@Component("thatSillyCoach")
public class TennisCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice backhand volley";
	}

}
