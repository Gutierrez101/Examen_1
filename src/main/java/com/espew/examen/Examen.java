/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.espew.examen;
import java.util.Scanner;
/**
 *
 * @author USUARIO
 */
public class Examen {

    public static void main(String[] args) {
      Scanner leer=new Scanner(System.in);  
      System.out.println("Ingrese su Nombre: ");
      String Nombre=leer.next();
      System.out.println("Ingrese su Cargo: ");
      String Cargo=leer.next();
      System.out.println("Ingrese su ID: ");
      String ID=leer.next();
      System.out.println("Ingrese su Edad: ");
      int Edad=leer.nextInt();
      System.out.println("Ingrese su Email: ");
      String Email=leer.next();
      System.out.println("Ingrese su Telefono: ");
      String Telefono=leer.next();
      Gerente gr1=new Gerente(Nombre,Cargo,ID,Edad,Email,Telefono);
      gr1.Mostrarinformacion();
    }
}
