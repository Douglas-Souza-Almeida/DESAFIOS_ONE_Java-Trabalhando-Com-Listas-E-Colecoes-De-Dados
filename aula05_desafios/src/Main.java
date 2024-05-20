
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reading = new Scanner(System.in);
        System.out.printf("Informe o limite do cartão: ");
        double limit = reading.nextDouble();
        CreditCard card = new CreditCard(limit);

        int exit = 1;
        while(exit != 0) {
            System.out.printf("Digite a descrição da compra: ");
            String  description = reading.next();

            System.out.printf("Digite o valor da compra: ");
            double value = reading.nextDouble();

            Purchase purchase = new Purchase(description, value);
            boolean purchaseMade = card.includePurchase(purchase);

            if (purchaseMade) {
                System.out.println("Compra realizada!");
                System.out.printf("Digite 0 para sair ou 1 para continuar: ");
                exit = reading.nextInt();
            } else {
                System.out.println("Saldo insuficiente!");
                exit = 0;
            }
        }

        System.out.println("***********************");
        System.out.println("COMPRAS REALIZADAS:\n");
        Collections.sort(card.getPurchases());
        for (Purchase c : card.getPurchases()) {
            System.out.println(c.getDescription() + " - " +c.getValue());
        }
        System.out.println("\n***********************");

        System.out.println("\nSaldo do cartão: " +card.getBalance());

    }
}
