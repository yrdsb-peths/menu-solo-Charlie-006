import greenfoot.*;

public class InstructionScreen extends World {
  private World previousWorld;
  public InstructionScreen(World previousWorld) {
        super(600, 400, 1);
        this.previousWorld = previousWorld;

        Button ButtonNext = new Button();
        Button ButtonPrevious = new Button();

        addObject(ButtonNext, 500, 340);
        addObject(ButtonPrevious, 100, 340);
    }

  public void goPrevious() {
      Greenfoot.setWorld(previousWorld);;
    }
}