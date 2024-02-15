module es.ieslosmontecillos.appayuda {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;
    requires jdk.jsobject;


    opens es.ieslosmontecillos.appayuda to javafx.fxml;
    exports es.ieslosmontecillos.appayuda;
}