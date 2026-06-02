public class Cajero implements Runnable {
    private CuentaBancaria cuenta;

    public Cajero(CuentaBancaria cuenta){
        this.cuenta = cuenta;
    }

    @Override 
    public void run(){
        try {
            for(int i = 0; i<5; i++ ){
                double retiró = (int) (Math.random() * 500) + 100;

                cuenta.retirar(retiró);

                Thread.sleep(1000);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    } 
}
