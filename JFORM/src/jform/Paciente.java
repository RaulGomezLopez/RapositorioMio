package jform;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alumne
 */
public class Paciente {
    private String dni;
    private String nombre;
    private String apellidos;
    private int anyoNac;
    private int numVisitas=0;
    private String historial="";
    private boolean cita=false;
    private String citaP;

    public Paciente(String dni, String nombre, String apellidos, int anyoNac) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.anyoNac = anyoNac;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getAnyoNac() {
        return anyoNac;
    }

    public int getNumVisitas() {
        return numVisitas;
    }

    public String getHistorial() {
        return historial;
    }
    
    public void addVisita(String cadena){
        Calendar cl = GregorianCalendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm");
        String hoy = sdf.format(cl.getTime());
        this.numVisitas++;
        this.historial=this.historial+hoy+" - "+cadena+"\n";
    }
    public String detallePaciente(){
        String detalle="";
        
        detalle="Nombre: "+this.nombre+" "+this.apellidos+"\n"+"DNI: "+this.dni+"\n"+"Año Nacimiento: "
        +this.anyoNac+"\n"+"Visitas Realizadas: "+this.numVisitas+"\n"+"Historial:\n"
        +this.historial+"Próxima cita: ";
        
        if(cita){
            detalle+=citaP;
        }else{
            detalle+="Sin cita";
        }
        
        return detalle;
    }

    public void reiniciarHistorial() {
        this.historial = "";
        this.numVisitas = 0;
    }

    public boolean isCita() {
        return cita;
    }

    public String getCitaP() {
        return citaP;
    }

    public void setCitaP(String citaP) {
        this.citaP = citaP;
        this.cita = true;
    }

    
    
    
    
    
}
