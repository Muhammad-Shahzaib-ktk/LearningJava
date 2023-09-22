public class FunctionAreacalculator {
    // First we will create a function to calculate the area of the cicle
    public static double CalArea(double radius){
        return Math.PI * radius * radius;
    }

    public static void main(String[] arg){
        double radius;
        radius = 30;

        double Area = CalArea(radius);

        System.out.printf("The Area of a Circle of the given radius %.2f is %.2f :", radius, Area);

    }
}
