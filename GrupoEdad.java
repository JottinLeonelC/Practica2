package P2.JottinLoenel;

import java.util.Scanner;

public class GrupoEdad {
    public static void main(String[] arg) {
        //A que grupo de edad perteneces
        System.out.println("Ingrese un edad");
        Scanner sc = new Scanner(System.in);
        int edad = sc.nextInt();
        if (edad < 0){
            System.out.println("Edad incorrecta");
    }else if(edad <= 10) {
            System.out.println("Eres un Ninho");
        }else if(edad >=11 && edad<= 17){
            System.out.println("Eres un Adolecente");
        }else if(edad >18 && edad<= 38){
            System.out.println("Eres un Adulto Joven");
        }else if(edad >=39 && edad<= 59){
            System.out.println("Eres de Mediana Edad");
        }else if(edad >=60 && edad<= 99) {
            System.out.println("Eres un Adulto Mayor");
        }
    }
}
