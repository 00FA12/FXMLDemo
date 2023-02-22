package _5_1.viewmodel;
import _5_1.model.Model;
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
