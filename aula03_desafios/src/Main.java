import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import Class.*;

public class Main {
    public static void main(String[] args) {
        /*
        01. Crie um ArrayList de strings e utilize um loop foreach para percorrer e imprimir cada elemento da lista.
         */
        System.out.println("01. Crie um ArrayList de strings e utilize um loop foreach para percorrer e imprimir cada" +
                " elemento da lista.");

        //criando o arraylist
        ArrayList<String> names = new ArrayList<>();

        //atribuindo valores ao array
        names.addAll(Arrays.asList("Douglas", "Diego", "Lucas", "André", "Ana", "Juliana", "Thiago", "Letícia",
                "Pedro", "Camila", "Juliana", "Sofia"));

        //imprimindo valores utilizando o foreach
        for (String name : names) {
            System.out.println(name);
        }

        //imprimindo valores utilizando outro método foreach
        names.forEach(name -> System.out.println(name));

        //imprimindo valores utilizando outro método foreach
        names.forEach(System.out::println);

        /*
        02. Crie uma classe Animal e uma classe Cachorro que herda de Animal. Em seguida, crie um objeto da classe
        Cachorro e faça o casting para a classe Animal.
         */
        System.out.println("\n02. Crie uma classe Animal e uma classe Cachorro que herda de Animal. Em seguida, crie " +
                "um" +
                " objeto da classe Cachorro e faça o casting para a classe Animal.");

        //criando o objeto
        Dog dog = new Dog("Black", "Male", "Rottweiler");

        //realizando o casting
        Animal mascot = (Animal) dog;

        //imprimindo dados do animal
        System.out.println("Nome do mascote: " + mascot.getName());

        /*
        03. Modifique o Exercício 2 para incluir uma verificação usando instanceof para garantir que o objeto seja do
         tipo correto antes de fazer o casting.
         */

        System.out.println("\n03. Modifique o Exercício 2 para incluir uma verificação usando instanceof para " +
                "garantir que o objeto seja do tipo correto antes de fazer o casting.");

        //verificando a classe
        if (mascot instanceof Animal) {
            System.out.println("Sim, o " + mascot.getName() + " é da classe Animel");
        }

        /*
        04. Crie uma classe Produto com propriedades como nome e preço. Em seguida, crie uma lista de produtos e
        utilize um loop para calcular e imprimir o preço médio dos produtos.
         */
        System.out.println("\n04. Crie uma classe Produto com propriedades como nome e preço. Em seguida, crie uma " +
                "lista de produtos e utilize um loop para calcular e imprimir o preço médio dos produtos.");

        //criando a lista de produtos
        ArrayList<Product> barbecue = new ArrayList<>();

        //criando objetos do tipo produto
        Product meat = new Product("Picanha", 38.65);
        Product beer = new Product("Becks", 66);
        Product coal = new Product("NaBrasa", 18.50);

        //adicionando os produtos a lista
        barbecue.addAll(Arrays.asList(meat, beer, coal));

        //calculando o preço médio da lista
        double sum = 0;
        for (int i = 0; i < barbecue.size(); i++) {
            Product item = barbecue.get(i);
            sum += item.getPrice();
        }
        System.out.println("O preço médio da lista é: R$ " + sum/ barbecue.size());

        /*
        05. Crie uma interface Forma com um método calcularArea(). Implemente a interface em duas classes, por
        exemplo, Circulo e Quadrado. Em seguida, crie uma lista de formas (objetos da interface Forma) e utilize um
        loop para calcular e imprimir a área de cada forma.
         */
        System.out.println("\n05. Crie uma interface Forma com um método calcularArea(). Implemente a interface em " +
                "duas classes, por exemplo, Circulo e Quadrado. Em seguida, crie uma lista de formas (objetos da " +
                "interface Forma) e utilize um loop para calcular e imprimir a área de cada forma.");

        //criando os objetos
        Circle circle1 = new Circle(5.09);
        Circle circle2 = new Circle(19.65);
        Circle circle3 = new Circle(12.43);

        Square square1 = new Square(5, 5);
        Square square2 = new Square(12.32, 10);
        Square square3 = new Square(4.65, 2.31);

        //criando a lista de formas
        ArrayList<Form> forms = new ArrayList<>();

        //adicionando os objetos a lista
        forms.addAll(Arrays.asList(circle1, square1, circle2, square2, circle3, square3));

        //calculando e imprimindo a área das formas
        forms.forEach(form -> System.out.println("Área: " + form.calculateArea()));

        /*
        06. Crie uma classe ContaBancaria com propriedades como número da conta e saldo. Em seguida, crie uma lista
        de contas bancárias com diferentes saldos. Utilize um loop para encontrar e imprimir a conta com o maior saldo.
         */
        System.out.println("\n06. Crie uma classe ContaBancaria com propriedades como número da conta e saldo. Em " +
                "seguida, crie uma lista de contas bancárias com diferentes saldos. Utilize um loop para encontrar e " +
                "imprimir a conta com o maior saldo.");
        
        //criando contas bancárias
        BankAccount bankAccount01 = new BankAccount("0001-01", 1500);
        BankAccount bankAccount02 = new BankAccount("0002-01", 890);
        BankAccount bankAccount03 = new BankAccount("0003-01", 120000);
        BankAccount bankAccount04 = new BankAccount("0004-01", 3503);
        BankAccount bankAccount05 = new BankAccount("0005-02", 54990);
        
        //criando a lista
        ArrayList<BankAccount> bankAccounts = new ArrayList();

        //adicionando as contas a lista
        bankAccounts.addAll(Arrays.asList(bankAccount01, bankAccount02, bankAccount03, bankAccount04, bankAccount05));

        //criando o objeto para guardar dados da maior conta
        BankAccount biggestAccount = bankAccounts.get(0);

        //localizando a conta bancária com maior saldo
        for (int i = 0; i < bankAccounts.size(); i++) {
            if (bankAccounts.get(i).getBalance() > biggestAccount.getBalance()) {
                biggestAccount = bankAccounts.get(i);
            }
        }
        System.out.println("A conta com maior saldo é a " + biggestAccount.getNumber() + " com um valor de R$ " + biggestAccount.getBalance());
    }
}
