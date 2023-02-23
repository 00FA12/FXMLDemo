package com.example.fxmldemo.view;

import com.example.fxmldemo.viewmodel.ConvertViewModel;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Region;

public class ConvertViewController
{
  @FXML private TextField requestField;
  @FXML private TextField replyField;
  @FXML private Label errorLabel;
  private Region root;
  private ViewHandler viewHandler;
  private ConvertViewModel viewModel;
  public void init(ViewHandler viewHandler, ConvertViewModel viewModel, Region root)
  {
    this.viewHandler = viewHandler;
    this.viewModel = viewModel;
    this.root=root;
    viewModel.bindRequest(requestField.textProperty());
    viewModel.bindReply(replyField.textProperty());
    viewModel.bindError(errorLabel.textProperty());
  }
  public Region getRoot()
  {
    return root;
  }
  public void reset()
  {}
  @FXML public void onSubmit()
  {
    viewModel.convert();
  }
  @FXML public void onEnter()
  {
    viewModel.convert();
  }
  

}
