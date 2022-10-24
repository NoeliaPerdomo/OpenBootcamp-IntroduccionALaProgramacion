package com.example.ejerciciotema9;

import javafx.application.Application;
import javafx.stage.Stage;

import java.io.IOException;

public class EjercicioTema9
{
    public static void main(String[] args)
    {
        Cliente cliente=new Cliente();
        cliente.setNombre("Claudio");
        cliente.setEdad(34);
        cliente.setTelefono(99575624);
        cliente.setCredito(32000);
        System.out.println("Nombre cliente: "+cliente.getNombre()+
                "\nTelefono: "+cliente.getTelefono()+
                "\nEdad: "+cliente.getEdad()+
                "\nCredito: "+cliente.getCredito());
        Trabajador trabajador=new Trabajador();
        trabajador.setNombre("Leandro");
        trabajador.setEdad(38);
        trabajador.setTelefono(98773240);
        trabajador.setSalario(1200);
        System.out.println("-----------------------------\n" +
                "Nombre trabajador: "+trabajador.getNombre()+
                "\nTelefono: "+trabajador.getTelefono()+
                "\nEdad: "+trabajador.getEdad()+
                "\nSalario: "+trabajador.getSalario());
    }
}

class Persona{
    private String nombre;
    private int edad, telefono;

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public int getEdad()
    {
        return edad;
    }

    public void setEdad(int edad)
    {
        this.edad = edad;
    }

    public int getTelefono()
    {
        return telefono;
    }

    public void setTelefono(int telefono)
    {
        this.telefono = telefono;
    }
}

class Cliente extends Persona
{
    private int credito;

    public int getCredito()
    {
        return credito;
    }

    public void setCredito(int credito)
    {
        this.credito = credito;
    }
}

class Trabajador extends Persona
{
    private int salario;

    public int getSalario()
    {
        return salario;
    }

    public void setSalario(int salario)
    {
        this.salario = salario;
    }
}

