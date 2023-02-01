import java.util.Scanner;
public class AreaOfACircle {
    public static void main(String[] args) {
        System.out.print("Enter radius of circle: ");
        Scanner input = new Scanner(System.in);
        Double radius = input.nextDouble();
        Double area = Math.PI * radius * radius;        
        System.out.format("Area: %.2f", area);
    }
}
