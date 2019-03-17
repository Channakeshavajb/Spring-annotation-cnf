package com.xworkz.spring.jc;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Componet
@Component("indianArmy")
public class Army {
	//@Value("paramilitary")
	@Value("${spring.type}")
	private String type;

	public Army() {
		System.out.println("created.....\t" + this.getClass().getSimpleName());
	}

	public void serving() {
		System.out.println("invoked serving");
		System.out.println("the value of type is:\t" + type);
	}
}
