package com.cardonamaturana.assetms.infrastructure.client.response;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString(callSuper = true)
public class BranchResponse extends AssigneeResponse {


  private String name;
  private String city;
  private String address;

  public BranchResponse() {

  }

  public BranchResponse(String name, String city, String address) {
    this.name = name;
    this.city = city;
    this.address = address;
  }

  public BranchResponse(String id, String name, String city, String address) {
    super(id);
    this.name = name;
    this.city = city;
    this.address = address;
  }
}