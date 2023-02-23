module com.example.fxmldemo {
  requires javafx.controls;
  requires javafx.fxml;
  requires java.desktop;

  opens com.example.fxmldemo to javafx.fxml;
  exports com.example.fxmldemo;
}