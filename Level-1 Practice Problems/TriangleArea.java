import java.util.Scanner;
public class TriangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double base = sc.nextDouble();
        double height = sc.nextDouble();
        double areaCm = 0.5 * base * height;
        double areaInches = areaCm / 6.4516;
        System.out.println("The area of triangle in square cm is " + areaCm + " and in square inches is " + areaInches);
    }
}
