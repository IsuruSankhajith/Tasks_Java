public class Tasks2 {
    public static void main(String[] args) {
        // Given values for x, y, and w
        int x = 10;
        int y = 5;
        int w = 8;

        // Calculate Z
        int Z = x + (y * w / 4) % 5 - 20;

        // Display the result
        System.out.println("The value of Z is: " + Z);
    }
}
