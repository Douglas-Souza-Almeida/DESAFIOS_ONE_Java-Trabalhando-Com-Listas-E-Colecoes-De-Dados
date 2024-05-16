package Class;

public class Title implements Comparable <Title> {
    private String name;
    private String author;

    public Title (String name, String author) {
        this.name = name;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "\n(" +this.name + " - " + this.author + ")";
    }

    @Override
    public int compareTo(Title OtherTitle) {
        return this.getName().compareTo(OtherTitle.getName());
    }
}
