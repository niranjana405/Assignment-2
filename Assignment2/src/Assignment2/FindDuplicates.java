package Assignment2;

import java.util.HashSet;

public class FindDuplicates {

    public static void findDuplicates(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();

        for (int i : arr) {
            if (!set.add(i)) {
                duplicates.add(i);
            }
        }

        if (duplicates.isEmpty()) {
            System.out.println("No duplicates found.");
        } else {
            System.out.println("Duplicates found: " + duplicates);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 1, 2, 7, 8, 2, 3, 8};

        findDuplicates(arr);
    }
}
