public class Q07 {
    public static void main(String[] args) {
//        A password for a student will be generated as follows. It takes the first letter from the first

//        First Name: Kamala
//        Middle Name: Sugarcane
//        Last Name: Perera
//        Age: 20
//        Password: ksuer2000z
//        Your program should work for any input NOT ONLY this given example in the exercise.
        String fname = args[0];
        String mname = args[1];
        String lname = args[2];
        int age = Integer.parseInt(args[3]);
        StringBuffer password = new StringBuffer();
        password.append(fname.charAt(0));
        password.append(mname.substring(0,2));
        int lengthOf = lname.length();
        password.append(lname.substring(lengthOf-3,lengthOf-1));
        password.append(age*100);

        System.out.println(password);

    }
}
