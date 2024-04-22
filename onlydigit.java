public class Main {
    public static void main(String[] args) {
        String str = "Spae12011";
        StringBuilder numbers = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                numbers.append(c);
            }
        }

        System.out.println(numbers.toString());
    }
}