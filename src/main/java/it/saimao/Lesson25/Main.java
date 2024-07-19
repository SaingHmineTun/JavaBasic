package it.saimao.Lesson25;
public class Main {
    public static void main(String[] args) {
        String[] cities = {"Mu-se", "Namhkam", "Kutkai", "Hsenwi", "Lashio"};
//        for (int i = 0; i <= cities.length; i ++) {
//            String city = cities[i];
//            System.out.println(city);
//        }
        // enhanced for loop
        // for (var value: array ) { ... }
        // continue
        String totalCities = "";
        for (var city: cities) {
            if (city.equals("Hsenwi")) continue;
            totalCities += city + ", ";
        }
        System.out.println(totalCities);

    }
}