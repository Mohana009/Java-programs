import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
public class App extends Application {
  public void start(Stage primaryStage) {
    // Layout Manager -> Root
    VBox box = new VBox(10);
    box.setAlignment(Pos.TOP_CENTER);
    Label lb = new Label("Enter your name");
    TextField tf = new TextField();
    Button submitButton = new Button("Submit");
    submitButton.setOnAction(e -> {
      String name = tf.getText();
      //Alerts
      Alert al1 = new Alert(AlertType.INFORMATION);
      al1.setTitle("My Alert");
      al1.setHeaderText("Wishing...");
      al1.setContentText("Hello " + name);
      al1.showAndWait();
      //System.out.println("Hello " + name);
      tf.clear();
    });
    box.getChildren().addAll(lb, tf, submitButton);
    // Add the layout manager to Scene
    Scene scene = new Scene(box, 400, 300);
    // Add Scene to the stage
    primaryStage.setScene(scene);
    primaryStage.setTitle("My window");
    primaryStage.show();
  }
  public static void main(String[] args) {
    launch(args);
  }
}
