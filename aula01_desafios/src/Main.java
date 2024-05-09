import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /*
        02. No método main da classe Principal, crie um ArrayList de Pessoa chamado listaDePessoas.
         */
        ArrayList<Person> personList = new ArrayList<>();
        /*
        03. Adicione pelo menos três pessoas à lista utilizando o método add.
         */
        personList.add(new Person("Olívia Palito", 27));
        personList.add(new Person("Marinheiro Popeye", 38));
        personList.add(new Person("Brutus", 37));

        /*
        04. Imprima o tamanho da lista utilizando o método size.
         */
        System.out.println("Tamanho da lista: " + personList.size());

        /*
        05. Imprima a primeira pessoa da lista utilizando o método get.
         */
        System.out.println("Primeira pessoa da lista: " + personList.get(0));

        /*
        06. Imprima a lista completa
         */
        System.out.println("Lista completa: " + personList.toString());
    }
}
