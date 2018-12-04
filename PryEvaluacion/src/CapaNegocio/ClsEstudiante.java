/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaNegocio;

/**
 *
 * @author Estudiante
 */
public class ClsEstudiante {
    private String _nombre;
    private float []_notas;
    
    public ClsEstudiante (String nombre){
        _nombre=nombre;
        _notas=new float [3];
    }
    public ClsEstudiante (String nombre, float []notas){
        _nombre=nombre;
        _notas=notas;
    }
    public ClsEstudiante (ClsEstudiante n){
        _nombre=n._nombre;
        _notas=n._notas;
    }
    //getter y setter

    public String nombre() {
        return _nombre;
    }

    public void nombre(String _nombre) {
        this._nombre = _nombre;
    }

    public float[] notas() {
        return _notas;
    }

    public void notas(float[] _notas) {
        this._notas = _notas;
    }
    //gett y sett individual
    public void notas (int indice, float valor){
        _notas[indice]=valor;
    }
    public float notas (int indice){
        return _notas [indice];
    }
    //metodos
    public boolean exonerado (){
        return _notas[0]+_notas[1]>=14;
    }
    public boolean pierde (){
        return _notas[0]+_notas[2]<9;
    }
     public boolean aprueba (){
        return (_notas[2]>=12)&&((_notas[0]+_notas[1]+_notas[2])>=42);
    }
     public float promedio (){
         float prom=(_notas [0]+_notas[1])/2;
         if (!exonerado ()&& !pierde()){
             prom=(prom+_notas[2])/3;
         }
         return prom;
     }

    public String estado() {
        String valor="PIERDE";
        if (exonerado ()){
            valor="EXONERADO";
        }
        if(aprueba ()){
            valor="APRUEBA";
        }
        return valor;
    }

    public String Ver() {
        String resp="EL ESTUDIANTE: "+_nombre;
        resp+=estado ()+"CON PROMEDIO DE: "+promedio();
        return resp;
    }
    
}
