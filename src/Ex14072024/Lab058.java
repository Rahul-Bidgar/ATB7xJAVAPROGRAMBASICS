package Ex14072024;

public class Lab058 {
    public static void main(String[] args) {
        // Real time example
        int course = 100;
        float GST = 18.45F;
        //int total_cost = course +  GST; // Implicit Narrowing - JVM
        int total_cost = course + (int) GST; // explicit Narrowing - JVM
        System.out.println(total_cost); // loss -0.45

    }
}
