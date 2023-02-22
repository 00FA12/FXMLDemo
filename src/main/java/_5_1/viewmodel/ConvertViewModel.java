package _5_1.viewmodel;

import _5_1.model.Model;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class ConvertViewModel
{
  private StringProperty request;
  private StringProperty reply;
  private StringProperty error;
  private Model model;

  public ConvertViewModel(Model model)
  {
    this.model = model;
    request = new SimpleStringProperty();
    reply = new SimpleStringProperty();
    error = new SimpleStringProperty();
  }

  public StringProperty getRequest()
  {
    return request;
  }
  public StringProperty getReply()
  {
    return reply;
  }
  public StringProperty getError()
  {
    return error;
  }
  public void convert()
  {
    try
    {
      reply.set(model.convert(String.valueOf(request)));
    }
    catch (Exception e)
    {
      error.set(String.valueOf(new RuntimeException(e)));
    }
  }
}
