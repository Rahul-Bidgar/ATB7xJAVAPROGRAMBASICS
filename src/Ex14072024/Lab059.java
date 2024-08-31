package Ex14072024;

public class Lab059 {
    public static void main(String[] args) {
        // Real time example
        int course = 100;
        float GST = 18.45f;
        float total_cost = course + GST; // explicit Narrowing - JVM
        System.out.println(total_cost);

    }
}
