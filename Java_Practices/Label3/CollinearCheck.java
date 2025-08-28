package Java_Practices.Label3;

import java.util.Scanner;

public class CollinearCheck {
    
    public static boolean areCollinearSlope(int x1, int y1, int x2, int y2, int x3, int y3) {
        int lhs = (y2 - y1) * (x3 - x1);
        int rhs = (y3 - y1) * (x2 - x1);
        return lhs == rhs;
    }

    public static boolean areCollinearArea(int x1, int y1, int x2, int y2, int x3, int y3) {
        int area = x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2);
        return area == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();

        boolean slopeMethod = areCollinearSlope(x1, y1, x2, y2, x3, y3);
        boolean areaMethod = areCollinearArea(x1, y1, x2, y2, x3, y3);

        if (slopeMethod && areaMethod) {
            System.out.println("The points are Collinear");
        } else {
            System.out.println("The points are NOT Collinear");
        }
    }
}
