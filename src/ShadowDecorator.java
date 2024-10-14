/**
 * The ShadowDecorator class is a decorator that adds a shadow effect to a graphic object.
 * It extends the functionality of the base graphic object by applying a shadow.
 */
public class ShadowDecorator extends Decorator {

    /**
     * Constructs a ShadowDecorator that adds a shadow effect to the given graphic object.
     *
     * @param object the graphic object to decorate with a shadow
     */
    public ShadowDecorator(Graphic object) {
        super(object);
    }

    /**
     * Draws the shadow effect and then the graphic object itself.
     * This method first adds the shadow, then calls the draw method of the decorated object.
     */
    @Override
    public void draw() {
        System.out.println("Додаємо тінь");
        super.draw();
    }

    /**
     * Returns a description of the graphic object with the added shadow effect.
     *
     * @return a string describing the graphic object with a shadow
     */
    @Override
    public String getDescription() {
        return super.getDescription() + " з тінню";
    }
}