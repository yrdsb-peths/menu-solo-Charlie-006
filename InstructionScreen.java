import greenfoot.*;

public class InstructionScreen extends World {
  private World previousWorld;
  private String[] instructions = {
    "Welcome to the game!",
    "Use arrow keys to move.",
    "Press space to jump."
  };

  private Label instructionLabel;
  private int Index = 0;

  public InstructionScreen(World previousWorld) {
        super(600, 400, 1);
        this.previousWorld = previousWorld;
        instructionLabel = new Label(instructions[Index], 30);
        
        addObject(instructionLabel, 300, 200);
        addObject(new Button(this::nextInstruction, "Next"), 500, 340);
        addObject(new Button(this::previousInstruction, "Previous"), 100, 340);
  }
  
  public void nextInstruction() {
    if (Index < instructions.length - 1) {
      Index++;
      instructionLabel.setValue(instructions[Index]);
    }
  }
  
  public void previousInstruction() {
    if (Index > 0) {
      Index--;
      instructionLabel.setValue(instructions[Index]);
  }
  }
  
  public void goPrevious() {
      Greenfoot.setWorld(previousWorld);;
  }
}