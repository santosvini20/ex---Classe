/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aluno
 */
public class Pessoa {

    private String nome;
    private double altura;
    private double peso;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPesoIdeal() {
        double pi;
       // pi = 25 * this.altura * this.altura;
        pi = 25 * Math.pow(this.altura, 2);
        return (pi);
    }

    public String getSituacao() {
        double pi;
        String s = "";
        pi = this.getPesoIdeal();
        if (Math.abs(this.peso - pi) <= 1) {
            s = "Está no peso ideal."; 
        } else {
            if (this.peso < pi) {
                s = "Magro(a)";
            } else {
                s = "Gordo(a)";
            }
            return (s);
        }
        return null;
    }
    public double getDiff(){
        double pi;
        pi=this.getPesoIdeal();
        return( Math.abs(this.peso - pi));
    }
}
