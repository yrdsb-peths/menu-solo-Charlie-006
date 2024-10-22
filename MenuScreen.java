import greenfoot.*;
import java.util.Queue;
import java.util.LinkedList;

public class MenuScreen extends World {
  private Queue<GreenfootImage> avatars;
  private GreenfootImage currentAvatar;

  public MenuScreen() {
    super(600, 400, 1);

    addObject(new Button(this::goInstructions, "Instructions"), 295, 290);

    avatars = new LinkedList<>();
    avatars.add(new GreenfootImage("face_a.png"));
    avatars.add(new GreenfootImage("face_b.png"));
    avatars.add(new GreenfootImage("face_c.png"));

    currentAvatar = avatars.peek();
    setBackground(currentAvatar);

    addObject(new Button(this::cycleAvatar, "Next Avatar"), 295, 250);

    addObject(new Button(this::goHighScreen, "HighestScore"), 295, 330);
  }

  public void goInstructions() {
    Greenfoot.setWorld(new InstructionScreen(this));
  }

  public void goHighScreen() {
    Greenfoot.setWorld(new HighScoreScreen(this));
  }

  public void cycleAvatar() {
    avatars.add(avatars.remove()); // Rotate the avatars in the queue
    currentAvatar = avatars.peek();
    setBackground(currentAvatar); // Update the background with the new avatar
  }
}
