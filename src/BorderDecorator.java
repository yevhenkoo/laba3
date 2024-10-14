/**
 * The BorderDecorator class is a decorator that adds a border to a graphic object.
 * It extends the functionality of the base graphic object by adding a border of specified width.
 */
class BorderDecorator extends Decorator {
    /**
     * The width of the border in pixels.
     */
    private int width;
    /**
     * Constructs a BorderDecorator that adds a border with the specified width
     * to the given graphic object.
     *
     * @param object the graphic object to decorate
     * @param width the width of the border in pixels
     */
    public BorderDecorator(Graphic object, int width) {
        super(object);
        this.width = width;
    }
    /**
     * Draws the border around the graphic object and then draws the object itself.
     * This method first draws the border with the specified width, then calls the
     * draw method of the decorated object.
     */
    @Override
    public void draw() {
        System.out.println("Малюємо рамку з товщиною " + width + " пікселі.");
        super.draw();
    }
    /**
     * Returns a description of the graphic object with the added border.
     *
     * @return a string describing the graphic object with the border, including
     *         the border thickness in pixels
     */
    @Override
    public String getDescription() {
        return super.getDescription() + " з рамкою товщиною " + width + " пікселі";
    }
}