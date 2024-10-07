package co.edu.uniquindio.poo.application;

import co.edu.uniquindio.poo.model.Biblioteca;
import co.edu.uniquindio.poo.model.Bibliotecario;


public class App {
    public static void main(String[] args) {
    
        Biblioteca biblioteca= new Biblioteca();
        Bibliotecario nuevoBibliotecario = new Bibliotecario("jorge", "rodriguez", "316584416", "321654215", 21651.0, 32);
        String empleados= biblioteca.registrarBibliotecario(nuevoBibliotecario);

        System.out.println(empleados);

    }
}
