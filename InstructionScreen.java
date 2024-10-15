import greenfoot.*;

public class InstructionScreen extends World {
  private World previousWorld;
  public InstructionScreen(World previousWorld) {
        super(600, 400, 1);
        this.previousWorld = previousWorld;


        addObject(new Button(this::nextInstruction), 500, 340);
        addObject(new Button(this::previousInstruction), 100, 340);
    }

  public void goPrevious() {
      Greenfoot.setWorld(previousWorld);;
    }
}