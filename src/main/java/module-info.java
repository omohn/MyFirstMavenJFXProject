module org.omohn {
    requires javafx.controls;
    requires javafx.fxml;

    opens org.omohn to javafx.fxml;
    exports org.omohn;
}