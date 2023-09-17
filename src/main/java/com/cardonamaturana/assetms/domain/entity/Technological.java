package com.cardonamaturana.assetservicems.domain.entity;


import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
public class Technological extends Asset {

  private String brand;
  private String location;
  private String detail;
  private Date warrantyExpirationDate;
  private String warrantyDetails;

}