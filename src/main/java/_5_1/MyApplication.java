package _5_1;

import javafx.application.Application;
import javafx.stage.Stage;
import _5_1.model.Model;
import _5_1.model.ModelManager;
import _5_1.view.ViewHandler;
import _5_1.viewmodel.ViewModelFactory;
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
