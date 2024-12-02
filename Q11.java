public class Q11 {
//
//    the exerc
public static void main(String[] args) {

    String name1 = "Niroshan Perera";
    String[] name1Arr = name1.split(" ");
    String name2 = "Kamal Alwis";
    String[] name2Arr = name2.split(" ");
    String newName1 = name1Arr[0].concat(" "+name2Arr[1]);
    String newName2 = name2Arr[0].concat(" "+name1Arr[1]);
    System.out.println(newName1);
    System.out.println(newName2);
}
}
