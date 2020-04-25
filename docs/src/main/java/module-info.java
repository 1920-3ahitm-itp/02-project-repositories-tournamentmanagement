module at.htl.turnier {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires org.apache.derby.client;
    requires org.apache.derby.commons;
    requires org.apache.derby.tools;

    opens at.htl.turnier.view to javafx.fxml;
    exports at.htl.turnier.view;
    exports at.htl.turnier.controller;
    //exports at.htl.turnier.model;
}