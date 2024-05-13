import java.util.ArrayList;
import java.util.Arrays;
import Class.Product;
import Class.PerishableProduct;

public class Main {
    public static void main(String[] args) {
        /*
        01. Crie uma classe Produto com atributos como nome, preco, e quantidade. Em seguida, crie uma lista de
        objetos Produto utilizando a classe ArrayList. Adicione alguns produtos, imprima o tamanho da lista e
        recupere um produto pelo índice.
         */
        System.out.println("01. Crie uma classe Produto com atributos como nome, preco, e quantidade. Em seguida, " +
                "crie uma lista de objetos Produto utilizando a classe ArrayList. Adicione alguns produtos, imprima o" +
                " tamanho da lista e recupere um produto pelo índice.");

        //criando uma lista de objetos do tipo Produto
        ArrayList<Product> productsList = new ArrayList<>();

        //criando os produtos
        Product product01 = new Product("Detergente", 3.2, 150);
        Product product02 = new Product("Sabão em pó", 8.2, 200);
        Product product03 = new Product("Desinfetante", 6.5, 182);

        //adicionando os produtos a lista
        productsList.addAll(Arrays.asList(product01, product02, product03));

        //imprimindo o tamanho da lista
        System.out.println("Tamanho da lista:" + productsList.size());

        //recuperando dados de um produto da lista
        /*
        02. Implemente o método toString() na classe Produto para retornar uma representação em texto do objeto. Em
        seguida, imprima a lista de produtos utilizando o método System.out.println().
         */
        System.out.println("02. Implemente o método toString() na classe Produto para retornar uma representação em " +
                "texto do objeto. Em seguida, imprima a lista de produtos utilizando o método System.out.println().");

        //imprimindo dados
        System.out.println("Exibindo um produto da lita: " + productsList.get(2));

        /*
        03. Modifique a classe Produto para incluir um construtor que aceite parâmetros para inicializar os atributos
        . Em seguida, crie objetos Produto utilizando esse novo construtor.
         */

        System.out.println("03. Modifique a classe Produto para incluir um construtor que aceite parâmetros para " +
                "inicializar os atributos. Em seguida, crie objetos Produto utilizando esse novo construtor.");

        //incluindo novos produtos
        Product product04 = new Product("Desengordurante", 4.3, 250);

        //adicionando a lista
        productsList.add(product04);

        //exibindo os dados
        System.out.println("Produto: " + productsList.get(3));

        /*
        04. Crie uma classe ProdutoPerecivel que herde de Produto. Adicione um atributo dataValidade e um construtor que
        utilize o construtor da classe mãe (super) para inicializar os atributos herdados. Crie um objeto
        ProdutoPerecivel e imprima seus valores.
         */

        System.out.println("04. Crie uma classe ProdutoPerecivel que herde de Produto. Adicione um atributo " +
                "dataValidade e um construtor que utilize o construtor da classe mãe (super) para inicializar os " +
                "atributos herdados. Crie um objeto ProdutoPerecivel e imprima seus valores.");

        //criando o objeto
        PerishableProduct perishable01 = new PerishableProduct("Leite", 3.99, 211, "10/09/2024");

        //imprimindo os dados
        System.out.println("Produto perecível: " + perishable01.toString());
    }
}