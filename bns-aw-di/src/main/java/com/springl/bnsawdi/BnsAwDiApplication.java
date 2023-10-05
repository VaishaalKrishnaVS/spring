package com.springl.bnsawdi;

import com.springl.bean.Person;
import com.springl.bean.Vehicle;
import com.springl.configs.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BnsAwDiApplication {

	public static void main(String[] args) {
		var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
		Person person = context.getBean(Person.class);
		Vehicle vehicle = context.getBean(Vehicle.class);
		vehicle.getVehicleService().playMusic();
		person.getVehicle().getVehicleService().moveForward();
		person.getVehicle().getVehicleService().playMusic();
	}

}
