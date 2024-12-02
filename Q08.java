public class Q08 {
    public static void main(String[] args) {
//        8. Create an enum WeatherCondition with constants SUNNY, RAINY, and CLOUDY. Write
//        a program that uses a ternary operator to display an activity based on the weather condition:
//        If the weather is SUNNY, the activity is "Go for a picnic."
//        If the weather is RAINY, the activity is "Stay indoors and read a book."
//        If the weather is CLOUDY, the activity is "Take a relaxing walk."

        enum WeatherCondition{
            SUNNY,
            RAINY,
            CLOUDY
        }

        WeatherCondition currentWeathrt = WeatherCondition.CLOUDY;

        System.out.println((currentWeathrt == WeatherCondition.SUNNY) ? System.out.printf("Go for a picnic.\n\n\n"):(currentWeathrt == WeatherCondition.CLOUDY) ? System.out.printf("Take a relaxing walk.\n\n\n"):(currentWeathrt == WeatherCondition.RAINY) ? System.out.printf("Stay indoors and read a book.\n\n\n"):System.out.printf("ERROR"));






    }
}
