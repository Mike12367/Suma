import java.util.Scanner;

public class SumaMain {
    public static void main(String args[]){
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Dame un numero: ");
        int valorUno = entrada.nextInt();
        
        System.out.println("Dame otro numero: ");
        int valorDos = entrada.nextInt();
        
        Suma valores = new Suma(valorUno, valorDos);
        valores.Imprimir();
    }    
}