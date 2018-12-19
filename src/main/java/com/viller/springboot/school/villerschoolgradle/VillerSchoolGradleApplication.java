package com.viller.springboot.school.villerschoolgradle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class VillerSchoolGradleApplication {

	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(VillerSchoolGradleApplication.class, args);

//		for (String name: applicationContext.getBeanDefinitionNames()
//			 ) {System.out.println(name);
//
//		}
	}

}

