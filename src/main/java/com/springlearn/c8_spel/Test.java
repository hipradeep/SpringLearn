package com.springlearn.c8_spel;

import java.beans.Expression;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.spel.standard.SpelExpressionParser;




public class Test {

	public static void main(String[] args) {
		// C7
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springlearn/c8_spel/config.xml");

		//StudentNew s1 = (StudentNew) context.getBean("studentNew", StudentNew.class); //default name created by IoC
		Paule s1 = (Paule) context.getBean("poule", Paule.class);
		
		System.out.println(s1);
		
		
		
		
		/*
		 * SpelExpressionParser temp = new SpelExpressionParser(); Expression expression
		 * = temp.parseExpression("22+44"); System.out.println(expression.getValue());
		 */
	}

	}


