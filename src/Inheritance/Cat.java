public class Cat {

    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}