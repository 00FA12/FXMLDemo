package com.example.fxmldemo.viewmodel;

import com.example.fxmldemo.model.Model;
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


  public void convert()
  {
    try
    {
      reply.set(model.convert(request.get()));
      error.set(null);
    }
    catch (Exception e)
    {
      error.set(e.getMessage());
    }
  }
  public String getRequest()
  {
    return request.get();
  }
  public String getReply()
  {
    return reply.get();
  }
  public String getError()
  {
    return error.get();
  }

  public void bindRequest(StringProperty property)
  {
    property.bindBidirectional(request);
  }

  public void bindReply(StringProperty property)
  {
    property.bindBidirectional(reply);
  }

  public void bindError(StringProperty property)
  {
    property.bindBidirectional(error);
  }
}
