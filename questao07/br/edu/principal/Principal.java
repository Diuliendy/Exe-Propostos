package br.edu.principal;
import java.util.Scanner;


public class Principal{
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        System.out.print("Peso:");
        Float pesos=s.nextFloat();
        Float porcentagem1=pesos+(15/100)*pesos;
        Float porcentagem2=pesos+(20/100)*pesos;
        System.out.print(porcentagem1 + "Kg");
        System.out.print(porcentagem2 + "Kg");
        
        
        
        
        
    }
}
