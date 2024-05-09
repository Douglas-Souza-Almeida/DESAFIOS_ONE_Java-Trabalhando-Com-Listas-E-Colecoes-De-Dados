/*01. Crie uma classe Pessoa com atributos como nome, idade, e um método toString que represente esses atributos.*/

public class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "(Nome: " + name + "; Idade: " + age + ")";
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
