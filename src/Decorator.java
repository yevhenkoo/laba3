/**
 * The Decorator class is an abstract class that adds extra features to a Graphic object.
 * It passes the work of drawing and getting descriptions to the object it decorates.
 */
abstract public class Decorator implements Graphic {

    /**
     * The Graphic object being decorated.
     */
    protected Graphic object;

    /**
     * Creates a Decorator for the given Graphic object.
     *
     * @param object the Graphic object to be decorated
     */
    public Decorator(Graphic object) {
        this.object = object;
    }

    /**
     * Calls the draw method of the decorated object.
     */
    @Override
    public void draw() {
        object.draw();
    }

    /**
     * Returns the description from the decorated object.
     *
     * @return a string describing the object
     */
    @Override
    public String getDescription() {
        return object.getDescription();
    }
}
