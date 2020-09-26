package world.ucode.scenes;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public abstract class GameScene {
    private Scene scene;
    GameScene(Stage primaryStage, String fxmlName, Object Controller) {
        try {
            FXMLLoader loader = new
                    FXMLLoader(getClass().getResource(fxmlName));
            loader.setController(Controller);
            Parent PaneRoot = loader.load();
            scene = new Scene(PaneRoot, 800, 600);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public Scene getScene() {
        return scene;
    }
}