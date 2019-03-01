package springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		
		//get bean from container
		Coach theCoach = context.getBean("tennisCoach", Coach.class);

		
		//call method on bean
		//tennis coach using constructor injection:
		System.out.println("Tennis coach: ");
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		

		
		//close the context
		context.close();
		
	}

}
