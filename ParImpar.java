package P2.JottinLoenel;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	// este programa te dice si el numero ingresado por teclado es par o impar
      System.out.println("Ingrese un numero para decirle si es Par o Impar");
        Scanner sc = new Scanner(System.in);
        double numero = sc.nextDouble();
        if(numero % 2 ==0) System.out.println("El numero ingresado es par");
        else System.out.println("El numero es impar");

    }

}
