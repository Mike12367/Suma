public class Suma {
    private int valorUno, valorDos, resultado;
    
    public Suma(int valorUno, int valorDos){
        this.valorUno = valorUno;
        this.valorDos = valorDos;
    }
    public void Operacion(){
        resultado = valorUno + valorDos;
    }
    public void Imprimir(){
        Operacion();
        System.out.println("El resultado de la Suma de los valores es: " + resultado);
    }
}

