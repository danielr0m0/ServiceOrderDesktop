module com.romodaniel.serviceorder {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens com.romodaniel.serviceorder to javafx.fxml;
    exports com.romodaniel.serviceorder;
    exports com.romodaniel.serviceorder.Controller;
    opens com.romodaniel.serviceorder.Controller to javafx.fxml;
}