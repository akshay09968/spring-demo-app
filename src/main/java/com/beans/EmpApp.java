package com.beans;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class EmpApp {

	public static void main(String[] args) {
		//create resource object
		Resource rs = new ClassPathResource("config.xml");
		//create object for bean factory
		BeanFactory factory = new XmlBeanFactory(rs);
		
		//Values n config.xml are injected into empinfo object.
		Employee empinfo = (Employee)factory.getBean("empObj");
		
		System.out.println("Employee ID: "+empinfo.getEmpno());
		System.out.println("Employee name: "+empinfo.getEname());
		System.out.println("Employee job: "+empinfo.getJob());
		System.out.println("Employee salary: "+empinfo.getSalary() );
	}
}
