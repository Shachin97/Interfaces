import java.awt.*;
import java.util.ArrayList;

public class BigRectList {
    public static void main(String[] args) {


        ArrayList<Rectangle> rectangles = new ArrayList<>();
        rectangles.add(new Rectangle(4, 10));
        rectangles.add(new Rectangle(15, 10));
        rectangles.add(new Rectangle(20, 10));
        rectangles.add(new Rectangle(12, 10));
        rectangles.add(new Rectangle(4, 25));
        rectangles.add(new Rectangle(1, 1));
        rectangles.add(new Rectangle(2, 2));
        rectangles.add(new Rectangle(3, 2));
        rectangles.add(new Rectangle(1, 4));
        rectangles.add(new Rectangle(10, 5));

        BigRectangleFilter filter = new BigRectangleFilter();

        for(Rectangle rect : rectangles)
        {
            if(filter.accept(rect))
            {
                System.out.println(rect);
            }

        }








    }
}
