public class FunctionsExample2 {
    private static final double pi = 3.14159; // Global variable.
    
    public static void main(String[] args) {
        double radius1 = 3;
        double radius2 = 9;
        
        double a1 = area(radius1);
        double a2 = area(radius2);
        
        double c1 = circumference(radius1);
        double c2 = circumference(radius2);
        
        outputCircleInfo(radius1, a1, c1);
        outputCircleInfo(radius2, a2, c2);
    }
    
    /*
     * Return Type: double
     * Name: area
     * Parameters: double radius
     */
    private static double area(double radius) {
        return pi * radius * radius; // Function definition and return value.
    }

    /*
     * Return Type: double
     * Name: circumference
     * Parameters: double radius
     */
    private static double circumference(double radius) {
        return 2 * pi * radius; // Function definition and return value.
    }
    
    /*
     * Return Type: void (nothing)
     * Name: outputCircleInfo
     * Parameters: double r, double a, double c
     */
    private static void outputCircleInfo(double r, double a, double c) {
        System.out.println("Circle Info:"); // Function definition.
        System.out.println("Radius: " + r);
        System.out.println("Area: " + a);
        System.out.println("Circumference: " + c);
        // No return value since function return type is `void`!
    }
}
