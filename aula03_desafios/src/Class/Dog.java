package Class;

public class Dog extends Animal {
    private String breed;

    public Dog (String name, String gender, String breed) {
        super(name, gender);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
