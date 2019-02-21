package springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		
		//read spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//get bean from container
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		Coach bowlingCoach = context.getBean("bowlingCoach", Coach.class);
		Coach soccerCoach = context.getBean("soccerCoach", Coach.class);
		
		//call method on bean
		//tennis coach using constructor injection:
		System.out.println("Tennis coach: ");
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		
		//bowling coach using method injection
		System.out.println("Bowling coach: ");
		System.out.println(bowlingCoach.getDailyWorkout());
		System.out.println(bowlingCoach.getDailyFortune());
		
		//Soccer coach using field injection
		System.out.println("Soccer coach: ");
		System.out.println(soccerCoach.getDailyWorkout());
		System.out.println(soccerCoach.getDailyFortune());
		
		//close the context
		context.close();
		
	}

}
