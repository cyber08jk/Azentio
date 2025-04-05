import java.util.*;

public class Duplicate {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 2, 5, 6, 3};
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    System.out.println("Duplicate found: " + array[i]);
                }
            }
        }
    }
}