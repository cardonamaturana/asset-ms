package com.cardonamaturana.assetms.domain.entity;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class Computer extends Technological {

  private String processor;
  private String ramQuantity;
  private String storageQuantiy;

}