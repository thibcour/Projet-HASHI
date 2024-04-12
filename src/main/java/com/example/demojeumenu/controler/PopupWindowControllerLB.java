package com.example.demojeumenu.controler;

import com.example.demojeumenu.FXMLUtils;
import com.example.demojeumenu.SoundUtils;
import com.example.demojeumenu.utils.BaseController;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import org.springframework.stereotype.Controller;

@Controller
public class PopupWindowControllerLB extends BaseController {
    @FXML
    private Button continueButton;
/// hi


    @FXML
    //private Button newGameButton;
    private final StringProperty username = new SimpleStringProperty();

    private static Stage stage;
    @FXML
    private Label usernameLabel;
    public static void setStage(Stage st){
        stage = st;
    }

    public void setUsername(String username) {
        this.username.set(username);
    }

    @FXML
    private void btnHome() {
        stage.close();
        FXMLUtils.loadFXML("/MenuPrincipal.fxml", scene);
    }
    @FXML
    private void backButton() {
        // Code pour fermer la fenêtre du popup
        //Stage stage = (Stage) continueButton.getScene().getWindow();
        if(stage!=null)
            stage.close();
    }



    @FXML
    public void initialize(){
        usernameLabel.textProperty().bind(username);
        SoundUtils.addClickSound(continueButton, this::backButton);
    }
}