/**
 * Clase para probar el funcionamiento del código
 * @author Área de programación UQ
 * @since 2023-08
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

import co.edu.uniquindio.poo.application.App;
import co.edu.uniquindio.poo.model.Biblioteca;
import co.edu.uniquindio.poo.model.Bibliotecario;
import co.edu.uniquindio.poo.model.Estudiante;
import co.edu.uniquindio.poo.model.Libro;
import co.edu.uniquindio.poo.model.Prestamo;

/**
 * Unit test for simple App.
 */
public class BibliotecaTest {
    private static final Logger LOG = Logger.getLogger(BibliotecaTest.class.getName());

    @Test
    public void testRegistrarBibliotecario() {
        LOG.info("Iniciado test testRegistrarBibliotecario");

        Biblioteca biblioteca = new Biblioteca();
        Bibliotecario bibliotecario1 = new Bibliotecario("juan","velez", "666194", "3215498420", 262196.0, 38.0f);
        biblioteca.registrarBibliotecario(bibliotecario1);
        assertEquals(1, biblioteca.getListaBibliotecarios().size());

        Bibliotecario bibliotecario2 = new Bibliotecario(null,null, null, null, 0.0, 00);

        assertThrows(IllegalArgumentException.class, () -> {
            biblioteca.registrarBibliotecario(bibliotecario2);
        });

        LOG.info("Finalizando test testRegistrarBibliotecario");
    }





    public void testRegistrarEstudiante() {
        LOG.info("Iniciado test testRegistrarEstudiante");

        Biblioteca biblioteca = new Biblioteca();
        Estudiante estudiante1 = new Estudiante("jorge","hernandez", "32548252", "3216485846", "jorge@gmail.com", 18);
        Estudiante estudiante2 = new Estudiante("Luisa", "perez","2136546", "3246571", "luisa3246@", 22); 
        biblioteca.registrarEstudiante(estudiante1);
        biblioteca.registrarEstudiante(estudiante2);
        assertEquals(2, biblioteca.getListaEstudiantes().size());




        Estudiante estudiante3=new Estudiante(null, null, null, null, null, 0);
        assertThrows(IllegalArgumentException.class, () -> {
            biblioteca.registrarEstudiante(estudiante3);
        });

       


        LOG.info("Finalizando test testRegistrarEstudiante");
    }




    public void testRegistrarLibro() {
        LOG.info("Iniciado test testRegistrarLibro");

        Biblioteca biblioteca = new Biblioteca();
        Libro libro1= new Libro("154568", "945-99849-977", "Jorge Mutiz", "El alquimista", "Master Libros", LocalDate.of(2015, 8, 12), 22);
        biblioteca.registrarLibro(libro1);
        assertEquals(1, biblioteca.getListaLibros().size());


        Libro libro2 = new Libro("23416516", "326-456-654", "Martin Rodriguez", "Impel Down", "Angosta Editores", LocalDate.of(2005, 2, 15), 4);
        assertThrows(IllegalArgumentException.class, () -> {
            biblioteca.registrarLibro(libro2);
        });

        LOG.info("Finalizando test testRegistrarLibro");

    }



    public void testRegistrarPrestamo(){
        LOG.info("Iniciado test testRegistrarPrestamo");

        Biblioteca biblioteca = new Biblioteca();
        Estudiante estudiante1 = new Estudiante("maria", "VELEZ", "616166", "32164975546", "maria@gmail.com", 20);
        Prestamo prestamo1 = new Prestamo("1654844",  LocalDate.of(2024, 5, 5), LocalDate.of(2024, 5, 22), estudiante1);
        biblioteca.registrarPrestamo(prestamo1);
        assertEquals(1, biblioteca.getListaPrestamos().size());


    
        Prestamo prestamo2= new Prestamo("516544", LocalDate.of(2024, 6, 11), LocalDate.of(2024, 6, 28), null);
        assertThrows(IllegalArgumentException.class, () -> {
            biblioteca.registrarPrestamo(prestamo2);
        });

        LOG.info("Finalizando test testRegistrarPrestamo"); 



    }



}



    




