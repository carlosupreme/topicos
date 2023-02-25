/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.HashMap;

/**
 *
 * @author carlos
 */
public class Login {
    private HashMap<String, String> data;

    public Login() {
        data = new HashMap<>();
        data.put("admin", "admin");
    }

    public boolean isValid(String username, String password) {
        if (!data.containsKey(username)) {
            return false;
        }

        return data.get(username).equals(password);
    }
    
    public User getUserData(String username){
        User user = new User();
        user.setNombre("Carlos");
        user.setApellidos("Sosa Perera");
        user.setId(1);
        user.setUsername(username);
        
        return user;
    }
}
