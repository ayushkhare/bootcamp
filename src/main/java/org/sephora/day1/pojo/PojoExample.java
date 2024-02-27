package org.sephora.day1.pojo;

public class PojoExample {

    private int id;
    private String name;
    private String type;

    public PojoExample(int id, String name, String type) {
        this.id = id;
        this.name = name;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public static void main(String[] args) {
        PojoExample example = new PojoExample(1, "Hello", "World");
        System.out.println(example.name + example.type); // with Java 21 you can just use "void main() {}"

        PojoExampleJava17 exampleJava17 = new PojoExampleJava17(2, "Java", "17");
        System.out.println(exampleJava17.id() + exampleJava17.name() + exampleJava17.type());
    }
}

/**
 * Java 17
 * @param id
 * @param name
 * @param type
 */
record PojoExampleJava17(int id, String name, String type) {

    public static void main(String[] args) {
        var example = new PojoExampleJava17(1, "ayush", "type");
        example.id();
        example.name();
    }
}
