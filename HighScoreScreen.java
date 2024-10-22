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
    int yint = 100;
    Label title = new Label("High Score:", 30);
    addObject(title, getWidth() / 2, 100);

    for (Map.Entry<String, Integer> entry : highScores.entrySet()) {
      String key = entry.getKey();
      int value = entry.getValue();

      Label scoreLabel = new Label(key + ": ", value);
      addObject(scoreLabel, getWidth() / 2, yint);

      yint += 50;
    }
  }
}
