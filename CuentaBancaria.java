public class CuentaBancaria{
    private double saldo;
    public CuentaBancaria(double saldo){
        this.saldo = saldo;
    }
    public synchronized void depositar(double cantidad){
        saldo+=cantidad;
        System.out.println(
            Thread.currentThread().getName()
            +"deposito :" + cantidad 
            + "Saldo: " + saldo);
        notifyAll();
    }
    public synchronized void retirar(double cantidad)throws InterruptedException{
        while (saldo < cantidad) {
            System.out.println(
                Thread.currentThread().getName()
            + "espera fondos para retirar:"
            + cantidad
            );
            wait();
        }
        
        saldo -=cantidad;
        
        System.out.println(
            Thread.currentThread().getName()
                        + " retiró $" + cantidad
                        + " | Saldo: $" + saldo
        );
    }
    public synchronized double getSaldo(){
        return saldo;
    }
}