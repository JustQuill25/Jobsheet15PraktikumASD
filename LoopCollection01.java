import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class LoopCollection01 {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Watermelon");
        fruits.add("Leci");
        fruits.add("Salak");

        // Menambahkan elemen baru
        fruits.add("Mango");
        fruits.add("Guava");
        fruits.add("Avocado");

        // Melakukan sorting (pengurutan)
        Collections.sort(fruits);

        // Menampilkan isi fruits setelah penambahan dan sorting
        System.out.println("Fruits setelah penambahan dan sorting:");
        for (String fruit : fruits) {
            System.out.printf("%s ", fruit);
        }
        System.out.println("\n" + fruits.toString());

        // Operasi lain seperti sebelumnya
        while (!fruits.isEmpty()) {
            System.out.printf("%s ", fruits.remove(0));
        }

        fruits.add("Melon");
        fruits.add("Durian");
        System.out.println("");

        for (Iterator<String> it = fruits.iterator(); it.hasNext();) {
            String fruit = it.next();
            System.out.printf("%s ", fruit);
        }
        System.out.println("");

        fruits.stream().forEach(e -> {
            System.out.printf("%s ", e);
        });
        System.out.println("");

        for (int i = 0; i < fruits.size(); i++) {
            System.out.printf("%s ", fruits.get(i));
        }
    }
}
