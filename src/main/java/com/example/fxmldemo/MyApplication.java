package com.example.fxmldemo;

import javafx.application.Application;
import javafx.stage.Stage;
import com.example.fxmldemo.model.Model;
import com.example.fxmldemo.model.ModelManager;
import com.example.fxmldemo.view.ViewHandler;
import com.example.fxmldemo.viewmodel.ViewModelFactory;

import java.io.IOException;

public class MyApplication extends Application
{
  public void start(Stage primaryStage)
  {
    Model model = new ModelManager();
    ViewModelFactory viewModelFactory = new ViewModelFactory(model);
    ViewHandler view = new ViewHandler(viewModelFactory);
    view.start(primaryStage);
  }
}
