package com.ferbo.example.controller;

import javax.faces.application.FacesMessage;
import javax.inject.Named;
import javax.faces.context.FacesContext;

@Named
public class HelloBean {
    public void sayHello() {
        FacesContext.getCurrentInstance().addMessage(null,
                new FacesMessage(FacesMessage.SEVERITY_INFO, "Hello", "Welcome to PrimeFaces!"));
    }
}
