package Ex14072024;

public class Lab056 {
    public static void main(String[] args) {
       // Type casting - Source and destination conversion
        //widening = Converting lower type to higher type( safe conversion)

        byte b = 10;
        // int a = b; // Implicit type casting
        int a = (int) b; // Explicit type casting
        System.out.println(a);

        // Narrowing - converting higher type to lower type
            int val =300;
           // byte b1 = val; // invalid implicit casting - JVM
            byte b1 = (byte) val; // invalid implicit casting - JVM, Loss of data
        System.out.println(b1);


    }
}
