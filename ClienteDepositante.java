public class ClienteDepositante implements Runnable{
    private CuentaBancaria cuenta;

    public ClienteDepositante(CuentaBancaria cuenta){
        this.cuenta = cuenta;
    }

    @Override
    public void run(){
        try {
            for (int i = 0; i < 10; i++) {

                double deposito = (int) (Math.random() * 1000) + 200;

                cuenta.depositar(deposito);

                Thread.sleep(1500);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
