/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.una.tarea.Controller;

import com.jfoenix.controls.JFXButton;
import cr.ac.una.tarea.util.FlowController;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author David
 */
public class MenuviewController extends Controller implements Initializable {

    @FXML
    private AnchorPane root;
    @FXML
    private JFXButton btnregistro;
    @FXML
    private JFXButton btntorneo;
    @FXML
    private JFXButton btnacercade;
    @FXML
    private JFXButton btnsalir;
    @FXML
    private JFXButton btnestadisticas;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @Override
    public void initialize() {
     //To change body of generated methods, choose Tools | Templates.
    }

    @FXML
    private void OnActionRegistro(ActionEvent event) {
       FlowController.getInstance().goViewInWindow("Registro");
        
    }

    @FXML
    private void OnActionTorneo(ActionEvent event) {
    }

    @FXML
    private void OnActionAcercaDe(ActionEvent event) {
    }

    @FXML
    private void OnActionSalir(ActionEvent event) {
    }

    @FXML
    private void OnActionEstadisticas(ActionEvent event) {
    }
    
    
}
