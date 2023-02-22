package com.example.fxmldemo.view;

import com.example.fxmldemo.viewmodel.ViewModelFactory;
import javafx.scene.Scene;
import javafx.scene.layout.Region;
import javafx.stage.Stage;

import java.io.IOException;

public class ViewHandler
{
  private Stage primaryStage;
  private Scene currentScene;
  private ViewFactory  viewFactory;
  public ViewHandler(ViewModelFactory viewModelFactory)
  {
    viewFactory = new ViewFactory(this, viewModelFactory);
    currentScene = new Scene(new Region());
  }
  public void start(Stage stage)
  {
    primaryStage = stage;
    primaryStage.show();
  }
  public void openView(String id) throws IOException
  {
    Region root = viewFactory.loadView(id);
    currentScene = new Scene(null);
    currentScene.setRoot(root);
    if (root.getUserData() == null)
    {
      primaryStage.setTitle("");
    }
    else
    {
      primaryStage.setTitle(root.getUserData().toString());
    }
    primaryStage.setScene(currentScene);
    primaryStage.sizeToScene();
    primaryStage.show();
  }
  public void close()
  {
    primaryStage.close();
  }
}
