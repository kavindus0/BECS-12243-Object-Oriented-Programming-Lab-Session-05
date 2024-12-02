public class Q05 {


    public static void main(String[] args) {
        String original ="software";
        StringBuilder result = new StringBuilder("hi");
        int index = original.indexOf('a'); // 5
        result.setCharAt(0, original.charAt(0)); //Si
        result.insert(1, original.charAt(4)); //Swi
        result.append(original.substring(1, 4)); //Swioft
        result.insert(3, (original.substring(index, index+2) + "")); //Swiaroft
        System.out.println(result);
    }
}
