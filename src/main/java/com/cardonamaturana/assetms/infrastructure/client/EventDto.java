package com.cardonamaturana.assetms.infrastructure.client;

import java.io.Serializable;
import java.util.Map;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class EventDto implements Serializable {

  public EventDto(){

  }
  private Map<String, String> headers;
  private String data;


}