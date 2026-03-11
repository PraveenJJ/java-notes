public class Driver {
    public static void main(String[] args) {
        // Stop loop when number equals 5
        // for(int i = 1; i <= 10; i++) {
        //     if(i == 5) {
        //         break;
        //     }
        //     System.out.println(i);
        // }
        
        // System.out.println("=====================================");
        // // Skip number 5
        // for(int i = 1; i <= 10; i++) {
        //     if(i == 5) {
        //         continue;
        //     }
        //     System.out.println(i);
        // }

        // int[] numbers = {10, 20, 30, 40};

        // for(int i = 0; i < numbers.length; i++) {
        //     System.out.println(numbers[i]);
        // }

        // String str = "Programming";
        // String data = "Programming";
        // String sample = "  Java  ";

        // // find the length of a string
        // System.out.println(str.length());

        // // find the character at a specific index
        // System.out.println(str.charAt(1));

        // // Compare two strings
        // System.out.println(str.equals(data));

        // // Compare two strings ignoring case
        // System.out.println(str.equalsIgnoreCase(data));

        // // Extract part of a string
        // System.out.println(str.substring(3)); // starting from index 3, return the rest of the string
        // System.out.println(str.substring(3,7)); // starting from index 3, return the rest of the string till index 7

        // // Convert the string to uppercase or lowercase
        // System.out.println(str.toUpperCase());
        // System.out.println(str.toLowerCase());

        // // Removes leading and trailing spaces
        // System.out.println(sample.trim());

        // // Checks if a string contains a substring
        // System.out.println(sample.contains("Java"));

        // // Replace a character or substring
        // System.out.println(sample.replace('J','K'));


        String str = "Hello";

        // Attempt to modify the string
        str.concat(" World");

        // Printing the string
        System.out.println("Concat without reassignment: " + str);

        // Reassigning the result
        str = str.concat(" World");

        System.out.println("Concat with reassignment: " + str);
    }
}