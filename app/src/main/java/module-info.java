module boilerplate {

    requires javafx.fxml;
    requires javafx.base;
    requires javafx.controls;
    requires javafx.graphics;
    requires transitive com.jfoenix;
    requires java.desktop;

    opens boilerplate to javafx.fxml;

    exports boilerplate;
}
