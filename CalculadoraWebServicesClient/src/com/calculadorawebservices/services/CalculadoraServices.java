/**
 * CalculadoraServices.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.calculadorawebservices.services;

public interface CalculadoraServices extends java.rmi.Remote {
    public int resta(int a, int b) throws java.rmi.RemoteException;
    public int multiplicacion(int a, int b) throws java.rmi.RemoteException;
    public int suma(int a, int b) throws java.rmi.RemoteException;
    public double division(int a, int b) throws java.rmi.RemoteException;
}
