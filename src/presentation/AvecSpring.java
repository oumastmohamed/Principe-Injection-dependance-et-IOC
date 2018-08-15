package presentation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import metier.IMetier;

public class AvecSpring {

	public static void main(String[] args) {
		/*
		Avec le fichier de configuration config.xml
		ApplicationContext springContext = new ClassPathXmlApplicationContext("config.xml");
		IMetier metier = (IMetier) springContext.getBean("metier");
		*/
		//Avec les annotations
		ApplicationContext springContext = new AnnotationConfigApplicationContext("dao","metier");// les deux package dao et metier
		IMetier metier = (IMetier) springContext.getBean(IMetier.class);
		
		System.out.println(metier.calcul());
	}

}
