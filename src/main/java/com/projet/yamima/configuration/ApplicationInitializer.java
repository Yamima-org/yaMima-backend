package com.projet.yamima.configuration;


import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.projet.yamima.configuration.filtres.CORSFilter;

import jakarta.servlet.Filter;



public class ApplicationInitializer  extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected String[] getServletMappings() {
		// TODO Auto-generated method stub
		return new String[] { "/" };
	}
	
	  @Override
	    protected Filter[] getServletFilters() {
	        return new Filter[]{new CORSFilter()};
	    }  
	
}
