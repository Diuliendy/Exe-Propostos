package br.edu.principal;

import java.util.Scanner;

public class Principal{
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Nota 1");
        int nota1= sc.nextInt();
        System.out.println("Nota 2");
        int nota2= sc.nextInt();
        int media= (nota1*2)+(nota2*3)/2;
        int mediapond=media/5;
        System.out.print("Média final:"+mediapond);
    }
}
