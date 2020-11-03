package java.com.lsonva.task1;

import java.util.Arrays;
import java.util.stream.Stream;

public class Task1 {

    public static void main(String[] args) {
        int[] intsArray = parseIntArray(args);
        int[] intsArrayWithoutDuplicates = sortAndDistinct(intsArray);
        Arrays.stream(intsArrayWithoutDuplicates).forEach(m -> System.out.print(m + " "));
        int distinctValuesNumber = intsArrayWithoutDuplicates.length;
        print("\ncount: ", intsArray.length);
        print("distinct: ", distinctValuesNumber);
        print("min: ", intsArrayWithoutDuplicates[0]);
        print("max: ", intsArrayWithoutDuplicates[--distinctValuesNumber]);
    }

    private static int[] sortAndDistinct(int[] intsArray) {
        Arrays.sort(intsArray);
        return Arrays.stream(intsArray).distinct().toArray();
    }

    private static int[] parseIntArray(String[] stringsArray) {
        return Stream.of(stringsArray).mapToInt(Integer::parseInt).toArray();
    }

    private static void print(String argument, int number) {
        System.out.println(argument + number);
    }
}

