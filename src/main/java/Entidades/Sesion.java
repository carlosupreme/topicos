/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author carlos
 */
public class Sesion {

    public static User user = new User();

    public static void login(User user) {
        Sesion.user =  user;
    }
    
    public static void logout(){
        Sesion.user = new User();
    }
}
