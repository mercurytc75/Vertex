public class Auditor extends Thread {

    private CuentaBancaria cuenta;

    public Auditor(CuentaBancaria cuenta) {
        this.cuenta = cuenta;
    }

    @Override
    public void run() {

        try {

            for (int i = 0; i < 10; i++) {

                synchronized (cuenta) {

                    System.out.println(
                            "[AUDITOR] Saldo actual: $"
                                    + cuenta.getSaldo());
                }

                Thread.sleep(2000);
            }

        } catch (Exception e) {

            e.printStackTrace();
        }
    }
}