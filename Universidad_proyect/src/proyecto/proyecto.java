package proyecto;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rojas
 */
public class proyecto {
    int dni;
    String nombre;
    int edad;
    String tipo_de_empleo;

    public proyecto(int dni, String nombre, int edad, String tipo_de_empleo) {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
        this.tipo_de_empleo = tipo_de_empleo;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTipo_de_empleo() {
        return tipo_de_empleo;
    }

    public void setTipo_de_empleo(String tipo_de_empleo) {
        this.tipo_de_empleo = tipo_de_empleo;
    }
    
}
