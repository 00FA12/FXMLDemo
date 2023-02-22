package com.example.fxmldemo.viewmodel;
import com.example.fxmldemo.model.Model;
public class ViewModelFactory
{
  private ConvertViewModel convertViewModel;
  private Model model;
  public ViewModelFactory(Model model)
  {
    this.model=model;
    convertViewModel = new ConvertViewModel(model);
  }

  public ConvertViewModel getConvertViewModel()
  {
    return convertViewModel;
  }
}
