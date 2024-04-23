import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int factor = 2;

        List<Integer> multipliedNumbers = numbers.stream()
                                                .map(num -> num * factor)
                                                .collect(Collectors.toList());

        System.out.println("Original numbers: " + numbers);
        System.out.println("Multiplied numbers: " + multipliedNumbers);
    }
}