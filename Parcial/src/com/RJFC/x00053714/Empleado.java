package com.RJFC.x00053714;

import java.util.ArrayList;
import java.util.List;

public abstract class  Empleado {
    protected String name;
    protected String puesto;
    protected List<Documento> documentos;
    protected  double salario;

    // Constructor
    public  Empleado(String name, String puesto, double salario) {
        this.name = name;
        this.puesto = puesto;
        this.salario = salario;
        documentos = new ArrayList<>();
    }
    // Getters
    public String getName() {
        return name;
    }

    public String getPuesto() {
        return puesto;
    }

    public List<Documento> getDocumentos() {
        return documentos;
    }

    public double getSalario() {
        return salario;
    }

    // Setter
    public void setSalario(double salario) {
        this.salario = salario;
    }

    //Metodos
    public void addDocumento(Documento unDoc){
        getDocumentos();
        documentos.add(unDoc);
    }

    public void removeDocumento(Documento unDoc){

    }

}
