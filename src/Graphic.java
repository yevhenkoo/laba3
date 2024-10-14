/**
 * The Graphic interface represents objects that can be drawn and described.
 */
public interface Graphic {

    /**
     * Draws the graphic object.
     */
    public void draw();

    /**
     * Returns a description of the graphic object.
     *
     * @return a string describing the object
     */
    String getDescription();
}