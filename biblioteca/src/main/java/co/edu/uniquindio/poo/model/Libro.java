package co.edu.uniquindio.poo.model;

import java.time.LocalDate;

public class Libro {


    private String codigo;
    private String isbn;
    private String autor;
    private String titulo; 
    private String editorial;
    private LocalDate fecha;
    private int unidadesDisponibles;



    public Libro(String codigo, String isbn, String autor, String titulo, String editorial, LocalDate fecha, int unidadesDisponibles){

        this.codigo=codigo;
        this.isbn=isbn;
        this.autor=autor;
        this.titulo=titulo;
        this.editorial=editorial;
        this.fecha=fecha;
        this.unidadesDisponibles=unidadesDisponibles;

    }



    public String getCodigo() {
        return codigo;
    }



    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }



    public String getIsbn() {
        return isbn;
    }



    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }



    public String getAutor() {
        return autor;
    }



    public void setAutor(String autor) {
        this.autor = autor;
    }



    public String getTitulo() {
        return titulo;
    }



    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }



    public String getEditorial() {
        return editorial;
    }



    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }



    public LocalDate getFecha() {
        return fecha;
    }



    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }



    public int getUnidadesDisponibles() {
        return unidadesDisponibles;
    }



    public void setUnidadesDisponibles(int unidadesDisponibles) {
        this.unidadesDisponibles = unidadesDisponibles;
    }



    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((isbn == null) ? 0 : isbn.hashCode());
        return result;
    }



    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Libro other = (Libro) obj;
        if (isbn == null) {
            if (other.isbn != null)
                return false;
        } else if (!isbn.equals(other.isbn))
            return false;
        return true;
    }



    @Override
    public String toString() {
        return "Libro [codigo=" + codigo + ", isbn=" + isbn + ", autor=" + autor + ", titulo=" + titulo + ", editorial="
                + editorial + ", fecha=" + fecha + ", unidadesDisponobles=" + unidadesDisponibles + "]";
    }



    
    

}
