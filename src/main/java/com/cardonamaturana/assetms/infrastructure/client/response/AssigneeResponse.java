package com.cardonamaturana.assetms.infrastructure.client.response;

import lombok.Data;

@Data
public class AssigneeResponse {

  protected String id;

  public AssigneeResponse() {
  }

  public AssigneeResponse(String id) {
    this.id = id;
  }

  @Override
  public String toString() {
    return "AssigneeResponse{}";
  }
}