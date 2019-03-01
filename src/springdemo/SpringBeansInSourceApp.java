package springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringBeansInSourceApp {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		
		//get bean from container
		SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class);

		
		//call method on bean
		//tennis coach using constructor injection:
		System.out.println("Swim coach: ");
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		System.out.println("Email: " + theCoach.getEmail());
		System.out.println("Team name: " + theCoach.getTeam());
		

		
		//close the context
		context.close();
		
	}

}
