// This is the class contain business what should happen on MyWindow
// Bindings: you have to map UI components to variables

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
public class MainController {
    @FXML
    TextField tf;   //refer to the text field in the UI
    
    @FXML
    Button submiButton; //refer to the button in the UI

    public void whenClicked(){
        String name = tf.getText(); //fetching data from text field
        Alert al1 = new Alert(AlertType.INFORMATION);
        al1.setTitle("Information");
        al1.setHeaderText("Wishing");
        al1.setContentText("Hello " + name);
        al1.showAndWait();
        tf.clear(); //empty the text field
    }
}
