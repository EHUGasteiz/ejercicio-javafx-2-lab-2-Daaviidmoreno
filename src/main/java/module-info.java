module eus.ehu.eui.isoft.javafxejercicio {
    requires javafx.controls;
    requires javafx.fxml;


    opens eus.ehu.eui.isoft.javafxejercicio2 to javafx.fxml;
    exports eus.ehu.eui.isoft.javafxejercicio2;
}