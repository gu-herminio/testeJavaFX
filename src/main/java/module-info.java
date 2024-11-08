module com.example.testejavafx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.testejavafx to javafx.fxml;
    exports com.example.testejavafx;
}