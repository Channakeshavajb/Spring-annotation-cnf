package com.xworkz.spring.tester;

import java.util.Arrays;

import org.omg.CORBA.portable.ApplicationException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.spring.jc.Army;

public class ArmyTest {

	public static void main(String[] args) {
		
		
		ApplicationContext container=new ClassPathXmlApplicationContext("resource/context.xml");
		Army army=container.getBean(Army.class);
		army.serving();
		
		System.out.println(container.getBeanDefinitionCount());
		String[] bean=container.getBeanDefinitionNames();
		Arrays.asList(bean).forEach(e->System.out.println(e));
		

	}

}
