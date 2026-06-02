public class BancoMain {
    public static void main(String[] args)throws InterruptedException {

        CuentaBancaria cuenta =
                new CuentaBancaria(1000);

        Thread cliente1 =
                new Thread(
                        new ClienteDepositante(cuenta),
                        "Cliente-1");

        Thread cliente2 =
                new Thread(
                        new ClienteDepositante(cuenta),
                        "Cliente-2");

        Thread cajero1 =
                new Thread(
                        new Cajero(cuenta),
                        "Cajero-1");

        Thread cajero2 =
                new Thread(
                        new Cajero(cuenta),
                        "Cajero-2");

        Auditor auditor =
                new Auditor(cuenta);

        cliente1.start();
        cliente2.start();

        cajero1.start();
        cajero2.start();

        auditor.start();

        cliente1.join();
        cliente2.join();

        cajero1.join();
        cajero2.join();

        auditor.join();

        System.out.println("\n======== RESUMEN ========");
        System.out.println(
                "Saldo final: $"
                        + cuenta.getSaldo());
    }
}