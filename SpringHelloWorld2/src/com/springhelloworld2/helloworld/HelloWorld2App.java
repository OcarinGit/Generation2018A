package com.springhelloworld2.helloworld;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

@SuppressWarnings("deprecation")
public class HelloWorld2App {

	public static void main(String[] args) {
		//System.out.println("Hola Mundo");
		//Se crean los objetos de la forma t�pica del lado del programador
		/*Bienvenida objBienvenida = new Bienvenida();
		HelloWorld holo = new HelloWorld();
		holo.setBien(objBienvenida);
		holo.setMensajitu("Holo");
		System.out.println(holo.getMensajitu());*/
		
		//Se crean los objetos de la forma Spring. Utilizando el IoC
		//Con la clase BeanFactory que ya se encuentra deprecada
		/*Resource resource = new ClassPathResource("HelloWorldBeans.xml");
		
		BeanFactory factory = new XmlBeanFactory(resource);
		HelloWorld h1 = (HelloWorld) factory.getBean("hola1");
		HelloWorld h2 = factory.getBean("hola2", HelloWorld.class);
		HelloWorld h3 = (HelloWorld) factory.getBean("hola3");
		
		System.out.println("Frijolito 1:"+h1.getMensajitu());
		System.out.println("Frijolito 2:"+h2.getMensajitu());
		System.out.println("Frijolito 3:"+h3.getMensajitu());*/
		
		//Se crean los objetos de la forma Spring. Utilizando el IoC
		//Con la clase ApplicationContext
		ApplicationContext context = new ClassPathXmlApplicationContext("HelloWorldBeans.xml");
		
		/*HelloWorld h1 = (HelloWorld) context.getBean("hola1");
		HelloWorld h2 = context.getBean("hola2", HelloWorld.class);
		HelloWorld h3 = (HelloWorld) context.getBean("hola3");
		
		System.out.println("Frijolito 1:"+h1.getMensajitu());
		System.out.println("Frijolito 2:"+h2.getMensajitu());
		System.out.println("Frijolito 3:"+h3.getMensajitu());*/
		ClassPathXmlApplicationContext ctx = (ClassPathXmlApplicationContext) context;
		ctx.close();
	}

}
