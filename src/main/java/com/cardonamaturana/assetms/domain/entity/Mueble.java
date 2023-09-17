package com.cardonamaturana.assetms.domain.entity;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class Mueble extends Asset {


  private String manufacturer;
  private String location;
  private Long quantity;
  private String detail;

}