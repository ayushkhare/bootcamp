package org.sephora.day1.multable;

public class MutableExample {
    // do nothing
}

record Immutable(String name) { // already final
}

class Mutable {

    private String name; // try using final keyword here

    public Mutable(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

/**
 * BuilderPattern
 * <p>
 * All fields must be set on initialization, so we need a constructor with all fields.
 * What if we don’t need all the fields to be set?
 * Should we provide multiple constructors or static builder-methods?
 * And how do we ensure that all required fields are set and the resulting object is valid?
 */
record User(Builder builder) {
    static final class Builder {

        // required fields
        private final String email;
        private final String password;

        // optional fields
        private boolean active;
        private int sessions;

        // Only one constructor with the required fields.
        // This way we won't forget to set them.
        public Builder(String email, String password) {
            this.email = email;
            this.password = password;
        }

        public Builder active(boolean active) {
            this.active = active;
            return this;
        }

        public Builder sessions(int sessions) {
            this.sessions = sessions;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
}

class UserExample {
    public static void main(String[] args) {
        User requiredOnly = new User.Builder("hello@world.com", "HelloWorld!").build();
        User withOptional = new User.Builder("hello@world.com", "HelloWorld!").active(true).build();
    }
}

class StringImmutable {
    public static void main(String[] args) {
        // 2 ways of creating a string
        String demo1= "Java"; // create as literal, created in "String pool"
//        String demo3 = "Java";

        // since strings in Java are objects, we can create using "new" keyword, created in heap memory
        String demo2 = new String("Java");

        // Difference b/w the two

        // In Java, the JVM maintains a string pool to store all of its strings inside the memory.
        // The string pool helps in reusing the strings.

        // String demo1 = "Java" ->
        // the compiler first checks the string pool to see if the string already exists.
        // 1. If the string already exists, the new string is not created. Instead, the new reference,
        //    example points to the already existing string (Java).
        //
        // 2. If the string doesn't exist, a new string (Java) is created.

        // String demo2 = new String("Java") ->
        // Here, the value of the string is not directly provided. Hence, a new "Java" string is created even though
        // "Java" is already present inside the memory pool.

        String example = "Hello "; // once we create a string we cannot change it. Strings are immutable
        example = example.concat("World!");
        System.out.println(example);
        // It looks like we are able to change the value of the previous string. However, this is not true.

        //Let's see what has happened here:
        //1. JVM takes the first string "Hello "
        //2. creates a new string by adding "World!" to the first string
        //3. assigns the new string "Hello World!" to the example variable
        //4. The first string "Hello! " remains unchanged
    }
}

/**
 * Since String is immutable in Java, whenever we do String manipulation like concatenation, substring, etc.
 * it generates a new String and discards the older String for garbage collection.
 * These are heavy operations and generate a lot of garbage in heap.
 * So Java has provided StringBuffer and StringBuilder classes that should be used for String manipulation.
 * StringBuffer and StringBuilder are mutable objects in Java.
 * They provide append(), insert(), delete(), and substring() methods for String manipulation.
 */
class StringBufferExample {
    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer("Hello ");
        buffer.append("World!");
        System.out.println(buffer);
    }
}
