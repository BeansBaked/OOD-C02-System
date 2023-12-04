package writ1co2system;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class accessPageController {

    @FXML
    private TextField txtHostIp;
    @FXML
    private TextField txtPortNum;

    private String HostIP;
    private String PortNum;
    
    @FXML
    private void writeData() throws IOException {
        HostIP = txtHostIp.getText();
        PortNum = txtPortNum.getText();
    }
}