package ejercicio4;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        int edjuan, edana, edalber, edmama;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese la edad de Juan");
        edjuan = entrada.nextInt();
        
        edalber = 2*(edjuan/3);
        edana = 2*edalber;
        edmama = edalber+edana+edjuan;
        
        System.out.println("La edad de Juan es " + edjuan);
        System.out.println("La edad de Alberto es " + edalber);
        System.out.println("La edad de Ana es " + edana);
        System.out.println("La edad de mama es " + edmama);
    }
    
}
