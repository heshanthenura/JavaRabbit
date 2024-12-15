module com.heshanthenura.javarabbit {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.heshanthenura.javarabbit to javafx.fxml;
    exports com.heshanthenura.javarabbit;
}