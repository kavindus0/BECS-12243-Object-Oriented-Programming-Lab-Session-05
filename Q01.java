public class Q01 {

    public static void main(String[] args) {
        double purcAmmount = Double.parseDouble(args[0]);
        double dissc = (purcAmmount>5000)?purcAmmount*0.1:purcAmmount*0.05;
        System.out.println("The purchase amount " + (purcAmmount));
        System.out.println("The discount applied " + dissc);
        System.out.printf("The final amount after applying the discount " + (purcAmmount - dissc));

    }


}
