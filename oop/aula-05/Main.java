public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente(1, "João", 100.0);
        System.out.println(cliente.getNumero());
        System.out.println(cliente.getNome());
        printDivida(cliente);
        cliente.pagar(50.0);
        printDivida(cliente);
        cliente.receber(100.0);
        printDivida(cliente);
        cliente.setDivida(5.0);
        printDivida(cliente);
    }
    private static void printDivida(Cliente cliente) {
        System.out.println("Sua dívida atual é de " + cliente.getDivida());
    }
}
