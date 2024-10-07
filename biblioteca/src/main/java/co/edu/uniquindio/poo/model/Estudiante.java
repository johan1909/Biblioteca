package co.edu.uniquindio.poo.model;

public class Estudiante extends Persona{

    
    private String cedula;
    private String telefono; 
    private String correo;

    public Estudiante(String nombre, String apellido, String cedula, String telefono, String correo, float edad){

        super(nombre, apellido, null);
        this.cedula=cedula;
        this.telefono=telefono;
        this.correo=correo;

    }

    


    public String getCedula() {
        return cedula;
    }



    public void setCedula(String cedula) {
        this.cedula = cedula;
    }



    public String getTelefono() {
        return telefono;
    }



    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }



    public String getCorreo() {
        return correo;
    }



    public void setCorreo(String correo) {
        this.correo = correo;
    }



    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((cedula == null) ? 0 : cedula.hashCode());
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
        Estudiante other = (Estudiante) obj;
        if (cedula == null) {
            if (other.cedula != null)
                return false;
        } else if (!cedula.equals(other.cedula))
            return false;
        return true;
    }




    @Override
    public String toString() {
        return "Estudiante [nombre=" +getNombre()+", apellido=" +getApellido()+", edad=" + getEdad()+",cedula=" + cedula + ", telefono=" + telefono + ", correo=" + correo + "]";
    }



    

    

}
