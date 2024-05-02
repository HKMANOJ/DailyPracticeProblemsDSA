public class StringBuilderExample {
    public static void main(String[] args) {
        // Create a StringBuilder instance
        StringBuilder stringBuilder = new StringBuilder();

        // Append strings to the StringBuilder
        stringBuilder.append("Hello, ");
        stringBuilder.append("world!");
        stringBuilder.append(" This is a StringBuilder example.");

        // Convert StringBuilder to String
        String result = stringBuilder.toString();

        // Print the final string
        System.out.println(result);
    }
}