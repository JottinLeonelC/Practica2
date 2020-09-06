package P2.JottinLoenel;

import java.util.Scanner;

public class Prestamo {
    public static void main(String[] arg){
        //Amortizacion de prestamos
        System.out.println ("Este progrma muestra la cuota fija por la vida de su prestamo");
        double capitalDeuda = 800000;
        System.out.println("Introduce el numero de cuotas (en meses)");
        Scanner sc = new Scanner(System.in);
        int cuotas =sc.nextInt();

        System.out.println("Introduce la tasa de interes anual (en porciento) ");
        Scanner sd = new Scanner(System.in);
        double interes = sd.nextDouble()/100;
        interes = interes/12;
        double pagomensual;
        pagomensual = capitalDeuda*((interes*(Math.pow(1+interes, cuotas)))/(Math.pow(1+interes,cuotas)-1));
        System.out.println("Su pago mensual es:  "+ pagomensual);

    }
}
