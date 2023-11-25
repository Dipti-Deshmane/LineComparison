package LineComparison;

import java.util.Scanner;

public class LineComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the line 1 coordinates of the  first point x1, y1: ");
        double Line1x1 = scanner.nextDouble();
        double Line1y1 = scanner.nextDouble();

        System.out.print("Enter the line 1 coordinates of the second point x2, y2: ");
        double Line1x2 = scanner.nextDouble();
        double Line1y2 = scanner.nextDouble();

        System.out.print("Enter the line 2 coordinates of the second point x1, y1: ");
        double Line2x1 = scanner.nextDouble();
        double Line2y1 = scanner.nextDouble();
        System.out.print("Enter the line 2coordinates of the second point x2, y2: ");
        double Line2x2 = scanner.nextDouble();
        double Line2y2 = scanner.nextDouble();

        double Line1length = Math.sqrt(Math.pow(Line1x2 - Line1x1, 2) + Math.pow(Line1y2 - Line1y1, 2));
        double Line2length = Math.sqrt(Math.pow(Line2x2 - Line2x1, 2) + Math.pow(Line2y2 - Line2y1, 2));
        System.out.println("Length of the line = " + Line1length);
        System.out.println("Length of the line = " + Line2length);

        if(Line1length==Line2length){
            System.out.println("Line is equal");
        }
        else {
            System.out.println("Line is not equal");
        }



    }
}
