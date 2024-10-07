package co.edu.uniquindio.poo.model;


import java.time.LocalDate;



public class Prestamo {

    private String codigo;
    private LocalDate fechaPrestamo;
    private LocalDate fechaEntrega;
    private Estudiante estudiante;
    



    public Prestamo (String codigo, LocalDate fechaPrestamo, LocalDate fechaEntrega, Estudiante estudiante){

        this.codigo=codigo;
        this.fechaPrestamo=fechaPrestamo;
        this.fechaEntrega=fechaEntrega;
        this.estudiante=estudiante;


    }




    public String getCodigo() {
        return codigo;
    }




    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }




    public LocalDate getFechaPrestamo() {
        return fechaPrestamo;
    }




    public void setFechaPrestamo(LocalDate fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }




    public LocalDate getFechaEntrega() {
        return fechaEntrega;
    }




    public void setFechaEntrega(LocalDate fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }




    public Estudiante getEstudiante() {
        return estudiante;
    }




    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    



    /**
     * Este metodo verifica que no haya dos prestamos con el mismo codigo
     */


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
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
        Prestamo other = (Prestamo) obj;
        if (codigo == null) {
            if (other.codigo != null)
                return false;
        } else if (!codigo.equals(other.codigo))
            return false;
        return true;
    }




    @Override
    public String toString() {
        return "Prestamo [codigo=" + codigo + ", fechaPrestamo=" + fechaPrestamo + ", fechaEntrega=" + fechaEntrega
                + "]";
    }




    



    

}
