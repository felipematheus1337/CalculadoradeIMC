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

//CLASSE MAIN DA CALCULADORA DE IMC!
public class Program extends KernelIMC {

    public static void main(String[] args) {
        KernelIMC user = new KernelIMC();
        String name, control;
        double altura, peso;
        System.out.println("------------------------------");
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Bem vindo a Calculadora de IMC! ");
            System.out.println("------------------------------");
            System.out.println("Digite o seu nome :");
            name = input.nextLine();
            user.setNome(name);
            System.out.println("------------------------------");
            System.out.println("Qual a sua altura ? :");
            altura = input.nextDouble();
            user.setAltura(altura);
            System.out.println("------------------------------");
            System.out.println("Qual o seu peso? :");
            peso = input.nextDouble();
            user.setPeso(peso);
            System.out.println("------------------------------");
            user.calculo();
            System.out.println("\n------------------------------");
            System.out.println("Deseja continuar ? :  SIM=y, Não=n ");
            control = input.nextLine();
            control = input.nextLine();
            user.setControle(control);

        } while (user.getControle().equals("y"));

        input.close();
    }

}
