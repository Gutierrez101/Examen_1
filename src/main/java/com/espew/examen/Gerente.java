/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.espew.examen;
import java.util.ArrayList;
/**
 *
 * @author labctr
 */
public class Gerente extends Empleado {
    private String Nombre;
    private String Cargo;
    private String ID;
    private int Edad;
    private String Email;
    private String Telefono;
    //lista de empleados
    ArrayList<String> Lista1=new ArrayList<String>();
    //Constructor
    public Gerente(String Nombre, String Cargo, String ID, int Edad, String Email, String Telefono) {
        this.Nombre = Nombre;
        this.Cargo = Cargo;
        this.ID = ID;
        this.Edad = Edad;
        this.Email = Email;
        this.Telefono = Telefono;
    }
    
    //Metodos getter and setter
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }
    
    //Mostar informacion
    @Override
    public String Mostrarinformacion() {
        System.out.println("Nombre: " + Nombre);
        System.out.println("Cargo: " + Cargo);
        System.out.println("ID: " + ID);
        System.out.println("Edad: " + Edad);
        System.out.println("Email: " + Email);
        System.out.println("Telefono: " + Telefono);
        Lista1.add(0,"Pogramadores");
        Lista1.add(1,"Ilustradores");
        Lista1.add(2,"Editores");
        System.out.println("Lista de empleados: ");
        System.out.println(Lista1.get(0));
        System.out.println(Lista1.get(1));
        System.out.println(Lista1.get(2));
        return null;
    }
    
}
