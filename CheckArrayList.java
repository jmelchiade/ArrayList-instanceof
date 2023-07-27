import java.util.ArrayList;

class Product {
    String name;
    double price;

    Product(String s, double p) {
        name = s;
        price = p;
    }

    String getName() {
        return name;
    }

}

class Person {
    String name;

    Person(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }
}

class CheckArrayList {
    public static void main(String[] arg) {

        ArrayList<Object> list = new ArrayList<>();

        display(list);
        // auto-boxing to convert a primitive value to its corresponding object
        list.add("A");
        list.add(0, "B");
        list.add(1, "C");

        list.add(new Product("Chair", 249.99));

        list.add(new Person("Jenniffer Melchiade"));

        list.add(new Integer(25));
        display(list);

        list.add("A");
        list.add(0, "B");
        list.add(1, "C");

        double x = 3.75;
        char p = 'a';
        list.add(x);
        list.add(p);

        display(list);

        list.remove(1);
        list.add("D");
        list.get(2);
        display(list);

    }

    // use instanceof operator through for loop at [i] of array

    static void display(ArrayList<Object> list) {
        System.out.println("The size of the list is " + list.size());
        System.out.println("The list is empty " + list.isEmpty());
        System.out.println();

        for (int i = 0; i < list.size(); i++) {
            Object o = list.get(i);
            if (o instanceof String)
                System.out.println("This object " + (String) o + " is a string ");
            else if (o instanceof Integer)
                System.out.println("This object " + (Integer) o + " is an integer ");
            else if (o instanceof Double)
                System.out.println("This object " + (Double) o + " is a double");
            else if (o instanceof Character)
                System.out.println("This object " + (Character) o + "is a char");
            else if (o instanceof Product)
                System.out.println("This object " + ((Product) o).getName() + " is a product");
            else if (o instanceof Person)
                System.out.println("This object " + ((Person) o).getName() + " is a person");

        }
    }
}
