package com.cursoJavaEx.projectSpringWeb.controllers;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import com.cursoJavaEx.projectSpringWeb.services.SpringServices;

@ManagedBean
@ViewScoped
public class SpringJsfController {
	
	private String nombreEmpresa;


	@ManagedProperty("#{springServicesImpl}")
	private SpringServices springServiceImpl;
	
	
	
	@PostConstruct
	public void init() {
		System.out.println(springServiceImpl.mostrarNombreEmpresa());
		this.nombreEmpresa = this.springServiceImpl.mostrarNombreEmpresa();
	}
	
	
	/**
	 * @return the springServiceImpl
	 */
	public SpringServices getSpringServiceImpl() {
		return springServiceImpl;
	}


	/**
	 * @param springServiceImpl the springServiceImpl to set
	 */
	public void setSpringServiceImpl(SpringServices springServiceImpl) {
		this.springServiceImpl = springServiceImpl;
	}
	
	/**
	 * @return the nombreEmpresa
	 */
	public String getNombreEmpresa() {
		return nombreEmpresa;
	}


	/**
	 * @param nombreEmpresa the nombreEmpresa to set
	 */
	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}



}
