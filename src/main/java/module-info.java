module org.ochoa.apiclient {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires okhttp3;
    requires com.google.gson;

    opens org.ochoa.apiclient to javafx.fxml;
    exports org.ochoa.apiclient;
    exports org.ochoa.apiclient.ui.controllers;
    opens org.ochoa.apiclient.ui.controllers to javafx.fxml;
}