package P2.JottinLoenel;

import P2.JottinLoenel.apoyo.Operaciones;
import java.util.Scanner;
public class SumaResta {
    public static void main(String[] args) {
    //Este progrma pide al usuario Sumar o Restar

    System.out.println ("Este progrma pide al usuario Sumar o Restar dos numeros");
    System.out.println("Introduce el primer numero");
    Scanner sc = new Scanner(System.in);
    double numero1 =sc.nextDouble();
    System.out.println("Introduce el segundo numero");
    Scanner n2 = new Scanner(System.in);
    double numero2 =n2.nextDouble();
            String S;
            String R;
            S = "S";
            R = "R";
            System.out.println("Operacion a realizar: S -suma o R -resta");
            Scanner sr = new Scanner(System.in);
            String oper = sr.next();
            if (oper.equals(S) ) {
                System.out.println(Operaciones.sumar(numero1, numero2));

            }else if (oper .equals(R)) System.out.println(Operaciones.restar(numero1, numero2));
            else System.out.println("Esta opcion no es permitida");

    }
}
