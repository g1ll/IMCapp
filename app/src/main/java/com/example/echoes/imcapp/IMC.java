package com.example.echoes.imcapp;

/**
 * Created by echoes on 11/01/17.
 * Esta classe foi criada para calcular o IMC (Índice de Massa Comporal)
 * This Class was created to evaluate the BMI (Body Mass Index)
 */

public class IMC {

    private float peso;
    private float altura;
    private float imc;
    private String tipo;

    public IMC(float pe, float alt){
        this.peso = pe;
        this.altura = alt;
        this.calcIMC();
        this.classificaIMC();
    }

    public void calcIMC(){
        this.imc = (this.peso/(this.altura*this.altura));
    }

    public void classificaIMC(){
        if(this.imc!=0){
            if(this.imc<17)
                tipo = "Muito Abaixo do Peso !";
            else if(this.imc>=17 && this.imc<=18.49)
                tipo = "Abaixo do Peso !";
            else if(this.imc>=18.5 && this.imc<=24.99)
                tipo = "Peso Normal !";
            else if(this.imc>=25 && this.imc<=29.99)
                tipo = "Acima do Peso !";
            else if(this.imc>30)
                tipo = "Obesidade !";
        }else{
            tipo = "Calcule o IMC primeiro !";
        }
    }

    public String toString(){
        if(this.imc != 0){
            return String.valueOf(this.getImc())+" | "+this.getTipo()+" |";
        }else{
            classificaIMC();
            return this.getTipo();
        }
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public String getTipo() {
        return tipo;
    }

    public float getImc() {

        return imc;
    }

}
