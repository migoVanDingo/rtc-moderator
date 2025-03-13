module com.example.rtcmod {
    requires transitive javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires okhttp3;
    requires com.fasterxml.jackson.databind;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.ikonli.fontawesome;
    requires javafx.web;

    opens com.example.rtcmod to javafx.fxml;
    exports com.example.rtcmod;

    // If you have controllers, add this
    opens com.example.rtcmod.controllers to javafx.fxml;
}
