import greenfoot.*;
import java.util.Map;
import java.util.HashMap;

public class HighScoreScreen extends World {
  private Map<String, Integer> highScores;

  public HighScoreScreen() {
    // Create the world
    super(600, 400, 1);

    highScores = new HashMap<>();
    highScores.put("Alice", 1500);
    highScores.put("Bob", 1200);
    highScores.put("Charlie", 900);

    displayHighScores();
  }

  public void displayHighScores() {
    
  }
}
