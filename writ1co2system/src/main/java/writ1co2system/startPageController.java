package writ1co2system;

import java.io.IOException;
import java.net.Socket;

import javafx.fxml.FXML;

public class startPageController {

    @FXML
    private void connectToServer() throws IOException {
        MyServer server = App.getServerInstance();

        //using method to check extrnally if there is space for a new connection
        boolean hasSpace = server.hasSpaceForConnection();

        //if(hasSpace)
        //{
            //create a new client socket with the host ip and port number
            Socket socket = new Socket("localhost", 5000);
            App.setRoot("accessPage");
        //}
    }
}
