package com.example.fxmldemo.view;

import com.example.fxmldemo.MyApplication;
import com.example.fxmldemo.viewmodel.ViewModelFactory;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Region;

import java.io.IOException;

public class ViewFactory
{
  private ViewHandler viewHandler;
  private ConvertViewController convertViewController;
  private ViewModelFactory viewModelFactory;

  public ViewFactory(ViewHandler viewHandler, ViewModelFactory viewModelFactory)
  {
    this.viewHandler = viewHandler;
    this.viewModelFactory = viewModelFactory;
  }

  private Region loadConvertView() throws IOException
  {
    if (convertViewController == null)
    {
      FXMLLoader loader = new FXMLLoader();
      loader.setLocation(MyApplication.class.getResource("ConvertView.fxml"));
      Region root = loader.load();
      convertViewController = loader.getController();
      convertViewController.init(viewHandler,
          viewModelFactory.getConvertViewModel(), root);
    }
    convertViewController.reset();
    return convertViewController.getRoot();
  }

  public Region loadView(String id) throws IOException
  {
    return loadConvertView();
  }
}