public class Q04 {
    public static void main(String[] args) {
//        Write a Java program that takes two strings as command line arguments and compares them
//        to check if they are equal. The program should print whether the strings are equal or not.
//                If the entered strings are "Hello" and "hello", the output should be:
//        Two strings are equal: false
        //String boolExp = args[0].compareTo(args[1]) == 1 ? "True" : "False";
        System.out.println("Two strings are equal: "+args[0].equals(args[1]));

    }
}
