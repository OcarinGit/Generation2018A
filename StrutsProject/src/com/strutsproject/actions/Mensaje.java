package com.strutsproject.actions;

import com.opensymphony.xwork2.ActionSupport;

public class Mensaje extends ActionSupport{
	
	private String mensaje;
	
	public String execute()
	{
		System.out.println("Si entro al execute");
		return mensaje;
	}
	
	public void setMensaje(String msg)
	{
		mensaje=msg;
	}
	
	public String getMensaje()
	{
		return mensaje;
	}
}
