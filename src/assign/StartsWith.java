package assign;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StartsWith {
    public static void main(String[] args) {
        // Sample list of integers
        List<Integer> n= new ArrayList<>();
        n.add(201);
        n.add(245);
        n.add(123);
        n.add(289);
        n.add(2002);
        n.add(321);

        // Filter integers starting with 2
        List<Integer> result = filterNumbersStartingWithTwo(n);

        // Print the result
        System.out.println("Numbers starting with 2: " + result);
    }

    public static List<Integer> filterNumbersStartingWithTwo(List<Integer> n) {
        // Using Java Stream API to filter numbers starting with 2
        return n.stream()
                .filter(number -> number.toString().startsWith("2"))
                .collect(Collectors.toList());
    }
}