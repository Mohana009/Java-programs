import java.io.IOException;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
public class Main extends Application{
    public void start(Stage primaryStage){
        //Layout Manager + components (from fxml file)
        try{
            VBox box = FXMLLoader.load(getClass().getResource("MyWindow.fxml"));
            //Add the layout manager to scene
            Scene scene = new Scene(box);
            //Add the scene to stage
            primaryStage.setScene(scene);
            primaryStage.show();
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        launch(args);
    }
}
