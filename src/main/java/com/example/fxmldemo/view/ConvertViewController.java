package com.example.fxmldemo.view;

import com.example.fxmldemo.viewmodel.ConvertViewModel;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Region;

public class ConvertViewController
{
  @FXML TextField requestField;
  @FXML TextField replyField;
  @FXML Label errorLabel;
  private Region root;
  private ViewHandler viewHandler;
  private ConvertViewModel viewModel;
  public void init(ViewHandler viewHandler, ConvertViewModel viewModel, Region root)
  {
    this.viewHandler = viewHandler;
    this.viewModel = viewModel;
    this.root=root;
    viewModel.getRequest().bindBidirectional(requestField.textProperty());
    viewModel.getReply().bindBidirectional(replyField.textProperty());
    viewModel.getError().bindBidirectional(errorLabel.textProperty());
  }
  public Region getRoot()
  {
    return root;
  }
  public void reset()
  {}
  @FXML void onSubmit()
  {
    viewModel.convert();
  }
  @FXML void onEnter()
  {
    onSubmit();
  }
  

}
