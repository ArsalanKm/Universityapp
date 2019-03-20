package Model;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.nio.file.Paths;

public class pageLoader {
    private static final int Height = 750;
    private static final int Width = 500;
    private static Stage stage;

    public static void initstage(Stage primaryStage) {
        stage = primaryStage;
        stage.setTitle("University Managment");
        stage.setResizable(true);
        stage.setWidth(Width);
        stage.setHeight(Height);
        stage.initStyle(StageStyle.DECORATED);
        stage.getIcons().add(new Image(Paths.get("Recources/Background.jpg").toUri().toString()));
    }

    public void LoadScene(String url) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource(url));
        stage.setTitle("Hello World");

        stage.setScene(new Scene(root, Width, Height));

    }
}