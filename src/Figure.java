/**
 * The Figure class represents a simple figure, specifically a circle,
 * that can be drawn with a specified color.
 * It implements the Graphic interface.
 */
public class Figure implements Graphic {

    /**
     * The color of the circle.
     */
    private String color;

    /**
     * Constructs a Figure with the specified color.
     *
     * @param color the color of the circle
     */
    public Figure(String color) {
        this.color = color;
    }

    /**
     * Draws the circle with the specified color.
     * This method prints out a message indicating the color of the circle being drawn.
     */
    @Override
    public void draw() {
        System.out.println("Малюємо " + color + " коло.");
    }

    /**
     * Returns a description of the circle including its color.
     *
     * @return a string describing the color of the circle
     */
    @Override
    public String getDescription() {
        return "Коло " + color + " кольору";
    }
}