import greenfoot.*;

public class InstructionScreen extends World {
  private World previousWorld;
  public InstructionScreen(World previousWorld) {
        super(600, 400, 1);
        this.previousWorld = previousWorld;
    }

  public void goPrevious() {
      Greenfoot.setWorld(previousWorld);;
    }
}