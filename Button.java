import greenfoot.*;

public class Button extends Actor {
    private Runnable action;
    private String labelText;

    public Button(Runnable action, String labelText) {
        this.action = action;
        this.labelText = labelText;

        // Load the button image
        GreenfootImage buttonImage = new GreenfootImage("images/buttonLong_beige.png");

        // Create a new image to combine the button and the label
        GreenfootImage combinedImage = new GreenfootImage(buttonImage);

        // Set text properties: color, font size
        combinedImage.setColor(Color.BLACK);
        combinedImage.setFont(new Font("Arial", false, false, 24)); // Adjust the font size

        // Calculate the width and height of the text to center it
        GreenfootImage tempTextImage = new GreenfootImage(labelText, 24, Color.BLACK, new Color(0, 0, 0, 0)); // Transparent background
        int textWidth = tempTextImage.getWidth();
        int textHeight = tempTextImage.getHeight();

        // Draw the label text on top of the button image (centered)
        combinedImage.drawString(labelText, (buttonImage.getWidth() - textWidth) / 2, (buttonImage.getHeight() + textHeight) / 2 - 5);

        // Set the combined image as the actor's image
        setImage(combinedImage);
    }

    public void act() {
        if (Greenfoot.mouseClicked(this)) {
            if (action != null) {
                action.run();
            }
        }
    }
}
