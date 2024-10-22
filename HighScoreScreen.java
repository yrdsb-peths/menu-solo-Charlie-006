import greenfoot.*;
import java.util.Map;
import java.util.HashMap;

public class HighScoreScreen extends World {
  private Map<String, Integer> highScores;
  private World menuScreen;

  public HighScoreScreen(World menuScreen) {
    super(600, 400, 1);
    this.menuScreen = menuScreen;

    highScores = new HashMap<>();
    highScores.put("Alice", 1500);
    highScores.put("Bob", 1200);
    highScores.put("Charlie", 900);

    displayHighScores();

    addObject(new Button(this::goBacktoMenu, "Menu"), 300, 350);
  }

  public void displayHighScores() {
    int yint = 150;
    Label title = new Label("High Score:", 40);
    addObject(title, 300, 100);
    addObject(new Button(this::goBacktoMenu, "Menu"), 150, 400);
  }


    for (Map.Entry<String, Integer> entry : highScores.entrySet()) {
      String key = entry.getKey();
      int value = entry.getValue();

      Label scoreLabel = new Label(key + ": " + value, 40);
      addObject(scoreLabel, getWidth() / 2, yint);

      yint += 50;
    }
  }

  public void goBacktoMenu() {
    Greenfoot.setWorld(menuScreen);
  }
}
