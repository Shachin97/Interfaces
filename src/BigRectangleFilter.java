import java.awt.*;
public class BigRectangleFilter implements Filter {

    @Override
    public boolean accept(Object x) {
        {

          Rectangle rectangle = (Rectangle) x;
          rectangle.x = rectangle.width;
          rectangle.y = rectangle.height;
          return (2*(rectangle.height) + (2*rectangle.width) ) > 10;
        }


    }

}


