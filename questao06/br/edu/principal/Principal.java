package br.edu.principal;

import java.util.Scanner;

public class Principal{
    public static void main(String[]args){
        Scanner sc=new Scanner (System.in);
        System.out.print("Salário:");
        Double salario=sc.nextDouble();
        System.out.print("Valor das vendas:");
        Double vendas=sc.nextDouble();
        Double comissao=(4/100)*vendas;
        System.out.print("Comissão:"+comissao);
        System.out.print("Salário:"+salario);
        
    }
}
