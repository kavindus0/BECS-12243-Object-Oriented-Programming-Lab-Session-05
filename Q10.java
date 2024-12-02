public class Q10 {
    public static void main(String[] args) {

        String string = "ICS 102: Introduction to Computing I";
        String[] parts = string.split(" ");
        System.out.println("Course Name: "+parts[0]);
        System.out.println("Course Number: "+parts[1].substring(0,3));
        StringBuilder courseName = new StringBuilder("");
        for (int i =2; i < parts.length; i++) {
            courseName.append(" "+parts[i]);
        }
        System.out.println("Course Description: "+courseName);
    }
}
