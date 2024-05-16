import java.util.*;

import Class.*;

public class Main {
    public static void main(String[] args) {
        /*
    01. Crie uma lista de números inteiros e utilize o método Collections.sort para ordená-la em ordem crescente. Em
    seguida, imprima a lista ordenada.
     */
        System.out.println("01. Crie uma lista de números inteiros e utilize o método Collections.sort para ordená-la" +
                " em ordem crescente. Em seguida, imprima a lista ordenada.");

        //criando uma lista de números inteiros
        ArrayList<Integer> listNumbers = new ArrayList<>();

        //adicionando valores a lista
        listNumbers.addAll(Arrays.asList(100, 1, 60, 43, 56, 23, 7, 2, 9, 150, 123, 5, 1467, 2031, 4));

        //exibindo lista desordenada
        System.out.println("Lista de números inteiros desordenada: " + listNumbers);

        //ordenando a lista
        Collections.sort(listNumbers);

        //exibindo lista ordenada
        System.out.println("Lista de números inteiros ordenada: " + listNumbers);

        /*
        02. Crie uma classe Titulo com um atributo nome do tipo String. Implemente a interface Comparable na classe
        para que seja possível ordenar uma lista de objetos Titulo.
         */
        System.out.println("\n02. Crie uma classe Titulo com um atributo nome do tipo String. Implemente a interface " +
                "Comparable na classe para que seja possível ordenar uma lista de objetos Titulo.");

        /*
        03. No Exercício 2, crie alguns objetos da classe Titulo e adicione-os a uma lista. Utilize o método
        Collections.sort para ordenar a lista e, em seguida, imprima os títulos ordenados.
         */
        System.out.println("\n03. No Exercício 2, crie alguns objetos da classe Titulo e adicione-os a uma lista. " +
                "Utilize o método Collections.sort para ordenar a lista e, em seguida, imprima os títulos ordenados.");

        //criando a lista
        ArrayList<Title> titles = new ArrayList<>();

        //criando objetos
        Title book1 = new Title("Effective Java", "Joshua Bloch");
        Title book2 = new Title("Head First Java", "Kathy Sierra and Bert Bates");
        Title book3 = new Title("Java: The Complete Reference", "Herbert Schildt");
        Title book4 = new Title("Clean Code: A Handbook of Agile Software Craftsmanship", "Robert C. Martin");
        Title book5 = new Title("Java Concurrency in Practice", "Brian Goetz, Tim Peierls, Joshua Bloch, Joseph " +
                "Bowbeer, David Holmes and Doug Lea");
        Title book6 = new Title("Java Performance: The Definitive Guide", "Scott Oaks");
        Title book7 = new Title("Java Generics and Collections", "Maurice Naftalin and Philip Wadler");
        Title book8 = new Title("Thinking in Java", "Bruce Eckel");
        Title book9 = new Title("Java 8 in Action: Lambdas, Streams, and Functional-style Programming", "Raoul" +
                "-Gabriel Urma, Mario Fusco and Alan Mycroft");
        Title book10 = new Title("Java Design Patterns: A Hands-On Experience with Real-World Examples", "Vaskaran " +
                "Sarcar");

        //adicionando elementos a lista
        titles.addAll(Arrays.asList(book1, book2, book3, book4, book5, book6, book7, book8, book9, book10));

        //ordenando a lista
        Collections.sort(titles);

        //exibindo lista em tela
        System.out.println("Lista de livros: \n" + titles);

        /*
        Crie uma lista utilizando a interface List e instancie-a tanto como ArrayList quanto como LinkedList.
        Adicione elementos e imprima a lista, mostrando que é possível trocar facilmente a implementação.
         */
        System.out.println("\n04. Crie uma lista utilizando a interface List e instancie-a tanto como ArrayList " +
                "quanto como LinkedList. Adicione elementos e imprima a lista, mostrando que é possível trocar " +
                "facilmente a implementação.");

        //criando uma lista arraylist
        List<String> listArrayList = new ArrayList<>();

        //adicionando elementos a lista
        listArrayList.add("Hidrogênio (H)");
        listArrayList.add("Oxigênio (O)");
        listArrayList.add("Carbno (C)");
        listArrayList.add("Nitrogênio (N)");
        listArrayList.add("Ferro (Fe)");
        listArrayList.add("Cálcio (Ca)");
        listArrayList.add("Sódio (Na)");
        listArrayList.add("Cloro (Cl)");
        listArrayList.add("Potássio (K)");
        listArrayList.add("Magnésio (Mg)");

        //exibindo dados
        System.out.println("Lista ArrayList:\n" + listArrayList);

        //criando uma lista linkedlist
        List<String> listLinkedList = new LinkedList<>();

        //adicionando elementos a lista
        listLinkedList.add("Fósforo (P)");
        listLinkedList.add("Enxofre (S)");
        listLinkedList.add("Alumínio (Al)");
        listLinkedList.add("Silício (Si)");
        listLinkedList.add("Mercúrio (Hg)");
        listLinkedList.add("Zinco (Zn)");
        listLinkedList.add("Cobre (Cu)");
        listLinkedList.add("Ouro (Au)");
        listLinkedList.add("Prata (Ag)");
        listLinkedList.add("Chumbo (Pb)");

        //exibindo dados
        System.out.println("Lista LinkedList:\n" + listLinkedList);

        /*
        05. Modifique o Exercício 4 para declarar a variável de lista como a interface List, demonstrando o uso de
        polimorfismo.
         */
        System.out.println("\n05, Modifique o Exercício 4 para declarar a variável de lista como a interface List, " +
                "demonstrando o uso de polimorfismo,");

        //criando a lista
        List<String> polymorphicList;

        //utilizando com ArrayList
        polymorphicList = new ArrayList<>();

        //adicionando elementos
        polymorphicList.add("Hélio (He)");
        polymorphicList.add("Lítio (Li)");

        //exibindo dados
        System.out.println("Lista ArrayList:\n" + polymorphicList);

        //utilizando LinkedList
        polymorphicList = new LinkedList<>();

        //adicionando elementos
        polymorphicList.add("Boro (B)");
        polymorphicList.add("Neônio (Ne)");

        //exibindo dados
        System.out.println("Lista LinkedList:\n" + polymorphicList);



    }

}
