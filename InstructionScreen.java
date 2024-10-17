import greenfoot.*;

public class InstructionScreen extends World {
    private World previousWorld;
    private String[] instructions = {
        "Welcome to the game!",
        "Use arrow keys to move.",
        "Press space to jump."
    };

    private Label instructionLabel;
    private int index = 0;

    public InstructionScreen(World previousWorld) {
        super(600, 400, 1);
        this.previousWorld = previousWorld;

        // Create a label with the first instruction
        instructionLabel = new Label(instructions[index], 30);
        
        // Add the instruction label to the screen
        addObject(instructionLabel, 300, 200);

        // Add Next and Previous buttons
        addObject(new Button(this::nextInstruction, "Next"), 450, 340);
        addObject(new Button(this::previousInstruction, "Previous"), 130, 340);
    }

    public void nextInstruction() {
        if (index < instructions.length - 1) {
            index++;
            instructionLabel.setValue(instructions[index]); // Update the label with the next instruction
        }
    }

    public void previousInstruction() {
        if (index > 0) {
            index--;
            instructionLabel.setValue(instructions[index]); // Update the label with the previous instruction
        }
    }

    public void goPrevious() {
        Greenfoot.setWorld(previousWorld);
    }
}