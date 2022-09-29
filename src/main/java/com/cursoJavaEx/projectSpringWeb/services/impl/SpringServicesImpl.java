package com.cursoJavaEx.projectSpringWeb.services.impl;

import org.springframework.stereotype.Service;

import com.cursoJavaEx.projectSpringWeb.services.SpringServices;

@Service
public class SpringServicesImpl implements SpringServices {

	@Override
	public String mostrarNombreEmpresa() {
		return "Anotaciones con Spring y JSF";
	}

}
