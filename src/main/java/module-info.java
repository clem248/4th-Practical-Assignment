module com.example.pracassign4 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.pracassign4 to javafx.fxml;
    exports com.example.pracassign4;
}