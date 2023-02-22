module com.example.fxmldemo {
  requires javafx.controls;
  requires javafx.fxml;

  opens com.example.fxmldemo to javafx.fxml;
  exports com.example.fxmldemo;
}