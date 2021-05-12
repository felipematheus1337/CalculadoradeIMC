/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.calculadoradeimc;

/**
 *
 * @author Felipe
 */
import java.util.Scanner;
public class KernelIMC {

    private String nome;
    private double altura, peso;
    private String controle;

    public String getControle() {
        return controle;
    }

    public void setControle(String controle) {
        this.controle = controle;
    }

    public KernelIMC() {
    }

    public void setNome(String name) {
        this.nome = name;
    }

    public void setAltura(double a) {
        altura = a;
    }

    public void setPeso(double p) {
        peso = p;
    }

    public String getNome() {
        return nome;
    }

    public double getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }

    public void displayMessage() {
        System.out.println("O seu nome é  " + nome);
    }

    public KernelIMC(String nome, double altura, double peso) {
        this.nome = nome;
        this.altura = altura;
        this.peso = peso;
    }

    public double calculo() {
        double imc;
        String control;
        imc = peso / (altura * altura);
        Scanner input = new Scanner(System.in);
        

        if (imc < 18.5) {
            System.out.print("Está abaixo do peso!");

        } else if (imc >= 18.5 && imc <= 24.9) {
            System.out.print("Está com o peso normal!");

        } else if (imc >= 25 && imc <= 29.9) {
            System.out.print("Está com sobrepeso!");

        } else {
            System.out.print("Está obeso!");
        }
       
        return imc;
    

}
    
    
    
    
}
