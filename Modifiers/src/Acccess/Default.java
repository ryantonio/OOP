/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Acccess;

/**
 *
 * @author Putri
 */
public class Default {
  String fname = "Ananda Nabila F";
  String lname = "Nanda";
  String email = "Ananda@nabila.com";
  int age = 19;
  
  public static void main(String[] args) {
    Default myObj = new Default();
    System.out.println("Name: " + myObj.fname + " " + myObj.lname);
    System.out.println("Email: " + myObj.email);
    System.out.println("Age: " + myObj.age);
}
}
