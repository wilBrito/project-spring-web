package com.cursoJavaEx.projectSpringWeb.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.cursoJavaEx.projectSpringWeb.services.SpringServices;


@RunWith(SpringRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext-test.xml"})
public class SpringJUnit4Test {
	
	private SpringServices springServicesImpl;
	

	@Test
	public void test() {
		assertNotNull(springServicesImpl);
		System.out.println(this.springServicesImpl.mostrarNombreEmpresa());
	}

}
