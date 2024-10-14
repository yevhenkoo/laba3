/**
 * The Main class. It demonstrates
 * the use of decorators to modify the behavior of graphical objects.
 * @author Onischenko Yevhenii
 */
public class Main {
    /**
     * The main method where the program starts.
     * It creats a red circle and then adds border and shadow
     */
    public static void main(String[] args) {
        Graphic Circle = new Figure("червоне");

        Graphic СirleBorder = new BorderDecorator(Circle, 2);

        Graphic СirleBorderAndShadow = new ShadowDecorator(СirleBorder);

        СirleBorderAndShadow.draw();
        System.out.println(СirleBorderAndShadow.getDescription());
    }
}