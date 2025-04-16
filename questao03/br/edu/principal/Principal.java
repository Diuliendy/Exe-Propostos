package br.edu.principal;

import java.util.Scanner;

public class Principal{
    public static void main(String[]args){
        Scanner s= new Scanner(System.in);
        System.out.println("Digite um número");
        Float N1=s.nextFloat();
        System.out.println("Digite um número");
        Float N2=s.nextFloat();
        Float divisao=(N1/N2);
        System.out.println(divisao);
    }
}