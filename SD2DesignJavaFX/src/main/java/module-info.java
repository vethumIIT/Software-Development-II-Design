module org.example.sd2designjavafx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens org.example.sd2designjavafx to javafx.fxml;
    exports org.example.sd2designjavafx;
}