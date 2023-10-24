/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package proyectoaula;

/**
 *
 * @author sebig
 */
public interface Usuario {
    void registrarUsuario(String nombre, String correo, String contraseña);

        boolean iniciarSesion(String correo, String contraseña);
    
}
