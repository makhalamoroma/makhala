/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flags;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

/**
 *
 * @author CypherTeQ
 */
public class FXMLDocumentController implements Initializable {
     @FXML
    private Button nigeria;

    @FXML
    private Rectangle rectangle1;

    @FXML
    private Rectangle rectangle2;

    @FXML
    private Rectangle rectangle3;
     @FXML
    private Button belgium;

    @FXML
    private Button clear;

    @FXML
    private Button france;

    @FXML
    private Button guinea;

    @FXML
    private Button italy;
      @FXML
    private Label label;

    @FXML
    void nigeriaButton(ActionEvent event) {
        label.setText("NIGERIA");
        rectangle1.setFill(Color.LIGHTGREEN);
        rectangle2.setFill(Color.WHITE);
        rectangle3.setFill(Color.LIGHTGREEN); 
    }
       @FXML
    void belgium(ActionEvent event) {
        label.setText("BELGIUM");
        rectangle1.setFill(Color.BLACK);
        rectangle2.setFill(Color.YELLOW);
        rectangle3.setFill(Color.RED); 
    }
    @FXML
    void franceButton(ActionEvent event) {
        label.setText("FRANCE");
        rectangle1.setFill(Color.BLUE);
        rectangle2.setFill(Color.WHITE);
        rectangle3.setFill(Color.RED); 
    }

    @FXML
    void guineabutton(ActionEvent event) {
       label.setText("GUINEA");
        rectangle1.setFill(Color.RED);
        rectangle2.setFill(Color.YELLOW);
        rectangle3.setFill(Color.GREEN); 
    }

    @FXML
    void italy(ActionEvent event) {
        label.setText("ITALY");
        rectangle1.setFill(Color.GREEN);
        rectangle2.setFill(Color.WHITE);
        rectangle3.setFill(Color.RED); 
    }
       @FXML
    void clearbutton(ActionEvent event) {
        label.setText("COUNTRY NAME");
        rectangle1.setFill(null);
        rectangle2.setFill(null);
        rectangle3.setFill(null); 
    }

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
    
}
