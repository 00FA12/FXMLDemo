package com.example.fxmldemo.viewmodel;
import com.example.fxmldemo.model.Model;
import com.example.fxmldemo.view.ViewHandler;

public class ViewModelFactory
{
  private ConvertViewModel convertViewModel;
  private ViewHandler viewHandler;
  public ViewModelFactory(Model model)
  {
    convertViewModel = new ConvertViewModel(model);
  }
  public ConvertViewModel getConvertViewModel()
  {
    return convertViewModel;
  }
  public ViewHandler getViewHandler()
  {
    return viewHandler;
  }
}
