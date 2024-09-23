package co.edu.uniquindio.poo.model;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
import java.time.LocalDate;


public class Biblioteca {

    private ArrayList<Bibliotecario> listaBibliotecarios;
    private LinkedList<Estudiante> listaEstudiantes;
    private Stack<Libro> listaLibros;
    private ArrayList<Prestamo> listaPrestamos;



    public Biblioteca(){

        
        this.listaBibliotecarios= new ArrayList<>();
        this.listaEstudiantes= new LinkedList<>();
        this.listaLibros= new Stack<>();
        this.listaPrestamos= new ArrayList<>();


    }



    /**
     * Este metodo agrega un nuevo blibliotecario
     * @param nuevoBibliotecario
     * @return
     */

    public String registrarBibliotecario(Bibliotecario nuevoBibliotecario) {
        String mensaje = "";
        Bibliotecario bibliotecarioEncontrado = buscarBibliotecario(nuevoBibliotecario.getCedula());

        if (bibliotecarioEncontrado != null) {
            mensaje = "Ya existe";
        } else {
            listaBibliotecarios.add(nuevoBibliotecario);
            mensaje = " se agregó correctamente";
        }

        return mensaje;
    }

    private Bibliotecario buscarBibliotecario(String cedula) {
        for (Bibliotecario bibliotecarioAux : listaBibliotecarios) {
            if (bibliotecarioAux.getCedula().equals(cedula)) {
                return bibliotecarioAux;
            }
        }
        return null;
    }



    /**
     * elimina el registro de un bibliotecario por medio de la cedula
     * @param cedula
     * @return
     */


    public String eliminarBibliotecario(String cedula){
        String mensaje="empleado inexistente";
        for (Bibliotecario biblioAux : listaBibliotecarios){
            if(biblioAux.getCedula().equals(cedula)){
                listaBibliotecarios.remove(biblioAux);
                mensaje=" El registro se elimino correctamente";
                return mensaje;
            }
        }

        return mensaje;
    }




    /**
     * Actualiza la informacion de un bibliotecario
     * @param nombre
     * @param cedula
     * @param telefono
     * @param salario
     * @return
     */

    public String actualizarBibliotecario(String nombre,String cedula, String telefono, Double salario){

        String mensaje = " no encontrado";
        Bibliotecario bibliotecarioEncontrado = buscarBibliotecario(cedula);
        if(bibliotecarioEncontrado != null){
            bibliotecarioEncontrado.setNombre(nombre);
            bibliotecarioEncontrado.setTelefono(telefono);
            bibliotecarioEncontrado.setSalario(salario);
            mensaje = " se actualizó correctamente";
        }
        return mensaje;
    }





    /**
     * registra un nuevo estudiante
     * @param nuevoEstudiante
     * @return
     */
    
    public String registrarEstudiante(Estudiante nuevoEstudiante) {
        String mensaje = "";
        Estudiante estudianteEncontrado = buscarEstudiante(nuevoEstudiante.getCedula());
    
        if (estudianteEncontrado != null) {
            mensaje = "Ya existe";
        } else {
            listaEstudiantes.add(nuevoEstudiante);
            mensaje = " se agregó correctamente";
        }
    
        return mensaje;
    }


    
    private Estudiante buscarEstudiante(String cedula) {
        for (Estudiante estudianteAux : listaEstudiantes) {
            if (estudianteAux.getCedula().equals(cedula)) {
                return estudianteAux;
            }
        }
        return null;
    }




    /**
     * este metodo elimina un estudiante
     * @param cedula
     * @return
     */


    public String eliminarEstudiante(String cedula){
        String mensaje="estudiante inexistente";
        for (Estudiante estudianteAux : listaEstudiantes){
            if(estudianteAux.getCedula().equals(cedula)){
                listaEstudiantes.remove(estudianteAux);
                mensaje=" El registro se elimino correctamente";
                return mensaje;
            }
        }

        return mensaje;
    }





    public String actualizarEstudiante(String nombre,String cedula, String telefono, String correo){

        String mensaje = " no encontrado";
        Estudiante estudianteEncontrado = buscarEstudiante(cedula);
        if(estudianteEncontrado != null){
            estudianteEncontrado.setNombre(nombre);
            estudianteEncontrado.setTelefono(telefono);
            estudianteEncontrado.setCorreo(correo);
            mensaje = " se actualizó correctamente";
        }
        return mensaje;
    }






    /**
     * registra un nuevo libro
     * @param nuevoLibro
     * @return
     */



    public String registrarLibro(Libro nuevoLibro) {
        String mensaje = "";
        Libro libroEncontrado = buscarLibro(nuevoLibro.getIsbn());
    
        if (libroEncontrado != null) {
            mensaje = "Ya existe";
        } else {
            listaLibros.push(nuevoLibro);
            mensaje = " se agregó correctamente";
        }
    
        return mensaje;
    }


    
    private Libro buscarLibro(String isbn) {
        for (Libro libroAux : listaLibros) {
            if (libroAux.getIsbn().equals(isbn)) {
                return libroAux;
            }
        }
        return null;
    }



    /**
     * elimina un libro
     * @param cedula
     * @return
     */


    public String eliminarLibro(String isbn){
        String mensaje="libro inexistente";
        for (Libro libroAux : listaLibros){
            if(libroAux.getIsbn().equals(isbn)){
                listaLibros.remove(libroAux);
                mensaje=" El libro se elimino correctamente";
                return mensaje;
            }
        }

        return mensaje;
    }





    /**
     * actualiza la informacion de un libro
     * @param codigo
     * @param isbn
     * @param autor
     * @param titulo
     * @param editorial
     * @param fecha
     * @param unidadesDisponibles
     * @return
     */


    public String actualizarLibro(String codigo,String isbn, String autor, String titulo, String editorial, LocalDate fecha, int unidadesDisponibles){

        String mensaje = " libro no encontrado";
        Libro libroEncontrado = buscarLibro(isbn);
        if(libroEncontrado != null){
            libroEncontrado.setCodigo(codigo);
            libroEncontrado.setAutor(autor);
            libroEncontrado.setTitulo(titulo);
            libroEncontrado.setEditorial(editorial);
            libroEncontrado.setFecha(fecha);
            libroEncontrado.setUnidadesDisponibles(unidadesDisponibles);
            mensaje = " se actualizó correctamente";
        }
        return mensaje;
    }






    /**
     * registra un nuevo prestamo
     * @param nuevoPrestamo
     * @return
     */


    public String registrarPrestamo(Prestamo nuevoPrestamo) {
        String mensaje = "";
        Prestamo prestamoEncontrado = buscarPrestamo(nuevoPrestamo.getCodigo());

        if (prestamoEncontrado != null) {
            mensaje = "Ya existe";
        } else {
            listaPrestamos.add(nuevoPrestamo);
            mensaje = " se agregó correctamente";
        }

        return mensaje;
    }

    private Prestamo buscarPrestamo(String codigo) {
        for (Prestamo prestamoAux : listaPrestamos) {
            if (prestamoAux.getCodigo().equals(codigo)) {
                return prestamoAux;
            }
        }
        return null;
    }



    /**
     * elimina el registro de un Prestamo por medio de la cedula
     * @param codigo
     * @return
     */


    public String eliminarPrestamo(String codigo){
        String mensaje="prestamo inexistente";
        for (Prestamo prestamoAux : listaPrestamos){
            if(prestamoAux.getCodigo().equals(codigo)){
                listaPrestamos.remove(prestamoAux);
                mensaje=" El registro se elimino correctamente";
                return mensaje;
            }
        }

        return mensaje;
    }




    /**
     * actualiza la informacion de un prestamo
     * @param codigo
     * @param fechaPrestamo
     * @param fechaEntrega
     * @param estudiante
     * @return
     */
    public String actualizarPrestamo(String codigo,LocalDate fechaPrestamo, LocalDate fechaEntrega, Estudiante estudiante){

        String mensaje = " no encontrado";
        Prestamo prestamoEncontrado = buscarPrestamo(codigo);
        if(prestamoEncontrado != null){
            prestamoEncontrado.setFechaPrestamo(fechaPrestamo);
            prestamoEncontrado.setFechaEntrega(fechaEntrega);
            prestamoEncontrado.setEstudiante(estudiante);
            mensaje = " se actualizó correctamente";
        }
        return mensaje;
    }

}
