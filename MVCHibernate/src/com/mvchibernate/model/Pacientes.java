package com.mvchibernate.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Pacientes")
public class Pacientes {
	
	@Id
	@Column(name="NSSPaciente")
	private int NSSPaciente;
	
	@Column(name="nombrePaciente")
	private String nombrePaciente;
	
	@Column(name="noCuarto")
	private int noCuarto;
	
	@Column(name="nombreResponsable")
	private String nombreResponsable;
	
	public int getNSSPaciente() {
		return NSSPaciente;
	}
	public void setNSSPaciente(int nSSPaciente) {
		NSSPaciente = nSSPaciente;
	}
	public String getNombrePaciente() {
		return nombrePaciente;
	}
	public void setNombrePaciente(String nombrePaciente) {
		this.nombrePaciente = nombrePaciente;
	}
	public int getNoCuarto() {
		return noCuarto;
	}
	
	public void setNoCuarto(int noCuarto) {
		this.noCuarto = noCuarto;
	}
	
	public String getNombreResponsable()
	{
		return nombreResponsable;
	}
	public void setNombreResponsable(String nombreRes)
	{
		nombreResponsable = nombreRes;
	}
	
	public Pacientes()
	{
	}
	
	public Pacientes(int nSSPaciente, String nombrePaciente, int noCuarto, String nombreResponsable) {
		super();
		NSSPaciente = nSSPaciente;
		this.nombrePaciente = nombrePaciente;
		this.noCuarto = noCuarto;
		this.nombreResponsable = nombreResponsable;
	}
}
