package Model;

import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void init()
    {

    }
    @Override
    public void stop()
    {

    }


    @Override
    public void start(Stage primaryStage) throws Exception {

        pageLoader.initstage(primaryStage);
        primaryStage.setTitle("Hello World");


        new pageLoader().LoadScene("../Vieww/Entrance/EntrancePanel.fxml");

        primaryStage.show();

    }
}