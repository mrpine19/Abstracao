package application;

import entities.Rectangle;
import entities.Shape;
import entities.Circle;
import entities.enums.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of shapes: ");
        int n = sc.nextInt();

        List<Shape> list = new ArrayList<>();

        for (int i=1; i<= n; i++){
            System.out.print("Shape #"+i+" data: ");
            System.out.print("Rectangle or Circle? (r/c): ");
            char ch = sc.next().charAt(0);

            System.out.print("Color? (BLACK/BLUE/RED): ");
            Color color = Color.valueOf(sc.next());

            if (ch == 'r'){
                System.out.print("Width: ");
                double width = sc.nextDouble();
                System.out.print("Heigth: ");
                double heigth = sc.nextDouble();

                Rectangle rec = new Rectangle(color, width, heigth);
                list.add(rec);
            } else if (ch == 'c') {
                System.out.print("Radius: ");
                double radius = sc.nextDouble();

                list.add(new Circle(color, radius));
            }
        }

        System.out.println("Shape areas");
        for (Shape shape : list){
            double area = shape.area();
            System.out.println(String.format("%.2f", area));
        }

        sc.close();
    }
}
