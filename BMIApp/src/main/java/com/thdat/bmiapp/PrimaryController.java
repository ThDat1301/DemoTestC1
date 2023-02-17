package com.thdat.bmiapp;

import java.io.IOException;
import javafx.fxml.FXML;

public class PrimaryController {

    @FXML
    private void switchToSecondary() throws IOException {
        int b = 5;
        if (b == 5)
            App.setRoot("secondary");

    }
    
}
