module org.ochoa.apiclient {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens org.ochoa.apiclient to javafx.fxml;
    exports org.ochoa.apiclient;
}