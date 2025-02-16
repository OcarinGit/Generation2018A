package com.mvchibernate.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.mvchibernate.model.Pacientes;

@WebServlet("/CreatePacientesServlet")
public class CreatePacientesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter salida = response.getWriter();
		/*salida.append("Hola Mundo");
		response.getWriter().append("Hola Mundo");
		*/
		Pacientes pacienteNuevo = new Pacientes();
		Pacientes pacienteElMacho = new Pacientes(1,"ElMacho",1,"ElMacho");
		Pacientes pacienteOtro = new Pacientes(3,request.getParameter("nombrePacienteText"),Integer.parseInt(request.getParameter("noCuartoText")),request.getParameter("nombreResponsableText"));
		pacienteNuevo.setNSSPaciente(Integer.parseInt(request.getParameter("NSSPacienteText")));
		pacienteNuevo.setNombrePaciente(request.getParameter("nombrePacienteText"));
		pacienteNuevo.setNoCuarto(Integer.parseInt(request.getParameter("noCuartoText")));
		pacienteNuevo.setNombreResponsable(request.getParameter("nombreResponsableText"));
		
		salida.append("Nss Paciente:"+pacienteNuevo.getNSSPaciente());
		salida.append("Nombre Paciente:"+pacienteNuevo.getNombrePaciente());
		salida.append("No Cuarto:"+pacienteNuevo.getNoCuarto());
		salida.append("Nombre Responsable:"+pacienteNuevo.getNombreResponsable());
		
		Configuration cfg = new Configuration();
		cfg.addAnnotatedClass(com.mvchibernate.model.Pacientes.class);
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session sesion = factory.openSession();
		Transaction transa = sesion.beginTransaction();
		sesion.save(pacienteElMacho);
		transa.commit();
		sesion.close();
	}

}
