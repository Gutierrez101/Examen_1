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
public class Editor extends Empleado {
    private String Nombre;
    private String Cargo;
    private String ID;
    private int Edad;
    private String Email;
    private String Telefono;
     //Lista   
    ArrayList<String> Lista4=new ArrayList<String>();
    //constructor
    public Editor(String Nombre, String Cargo, String ID, int Edad, String Email, String Telefono) {
        this.Nombre = Nombre;
        this.Cargo = Cargo;
        this.ID = ID;
        this.Edad = Edad;
        this.Email = Email;
        this.Telefono = Telefono;
    }
    //Metodoas getter an setter
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
    //Mostrar informacion
    @Override
    public String Mostrarinformacion() {
        System.out.println("Nombre: " + Nombre);
        System.out.println("Cargo: " + Cargo);
        System.out.println("ID: " + ID);
        System.out.println("Edad: " + Edad);
        System.out.println("Email: " + Email);
        System.out.println("Telefono: " + Telefono);
        Lista4.add(0,"Conocimiento del ingles");
        Lista4.add(1,"Liderazgo");
        Lista4.add(2,"Dotes de planificacion y organizacion");
        System.out.println("Lista de habilidades: ");
        System.out.println(Lista4.get(0));
        System.out.println(Lista4.get(1));
        System.out.println(Lista4.get(2));
        return null;
    }
    
}
