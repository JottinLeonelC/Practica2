package P2.JottinLoenel;

import P2.JottinLoenel.apoyo.Operaciones;

import java.util.Scanner;

public class Retiro {
    public static void main(String[] arg){
        //Retiro de dinero
        double capital = 18765.43;
        System.out.println("Introduce el monto a retirar ");
        Scanner sc = new Scanner(System.in);
        double monto =sc.nextDouble();
        if (monto > capital){
            System.out.println("El monto solicitado excede su limite disponible");
        }
        if(monto <= capital) {
            System.out.println("Su nuevo balance disponible es: " +Operaciones.restar(capital, monto));
            }
    }
}
