import greenfoot.*;

public class Button extends Actor {
    private Runnable action;
    private String text;

    public Button(Runnable action, String text) {
        this.action = action;
        this.text = text;
        GreenfootImage image = new GreenfootImage("images/buttonLong_beige.png");
        setImage(image);

        GreenfootImage textimage = new GreenfootImage(text, 24, Color.BLACK, Color.WHITE);
        setImage(textimage);

    }

    public void act() {
        if (Greenfoot.mouseClicked(this)) {
            if (action != null) {
                action.run();
            }
        }
    }
}