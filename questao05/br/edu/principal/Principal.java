package br.edu.principal;
import java.util.Scanner;
public class Principal{
   public static void main(String[]args){
       Scanner sc= new Scanner(System.in);
       System.out.print("Preço:");
       double preco=sc.nextDouble();
       double taxa=0.10;
       double valordesc=preco*taxa;
       double valorfinal=preco-valordesc;
       System.out.print("Total a pagar com desconto:"+valorfinal);
       
       
       
    }
   
}
