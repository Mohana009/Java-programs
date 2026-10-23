import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.layout.VBox;

//Application is a abstract class 
//-> we should provide implementation for all abstract methods in Application class in our class
public class MyFirstFXApplication extends Application{
    public void start(Stage primaryStage){
        //1. Layout manager -> root
        //2. Add the layout manager to Scene
        //3. Add scene to the stage

        //Layout manager or Pane
        // VBox root = new VBox(10);
        VBox root = new VBox();
        //Let's add some node (Buttons, (Dropdown)ComboBox,...)
        //Label is used to show some text on the window
        //package: javafx.scene.control
        //Class: Label
        Label label1 = new Label("This is my first JavaFX Program");

        Button button1 = new Button("Submit");

        TextField tf1 = new TextField();

        ComboBox<String> box = new ComboBox<>();

        box.getItems().addAll("C", "Java", "Python");

        //Adding nodes (widgets) to layout manager
        root.getChildren().add(label1);
        root.getChildren().add(button1);
        root.getChildren().add(tf1);
        root.getChildren().add(box);

        //Create a scene which holds the layout manager
        //package: javafx.scene
        //class: Scene
        Scene scene = new Scene(root, 300, 300);

        //Set the scene
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
