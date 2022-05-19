import Java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome");
        String name = scanner.next();
        System.out.println("Digite seu sobrenome");
        String surname = scanner.next();
        String initials = name.charAt(0) + " " + surname.charAt(0);
        System.out.println("Digite o dia do seu nascimento");
        int birthDay = scanner.next();
        System.out.println("Digite o mês do seu nascimento");
        int birthMonth = scanner.next();
        System.out.println("Digite o ano do seu nascimento");
        int birthYear = scanner.next();

        System.out.println("Seu nome é " + name + " " +initials + " " + surname + ".");
        System.out.println("Você nasceu em " + birthDay + "/" + String.format("%02d",birthMonth) + "/" + birthYear + ".");


    }
}