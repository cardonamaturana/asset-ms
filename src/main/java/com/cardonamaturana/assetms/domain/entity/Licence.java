package com.cardonamaturana.assetms.domain.entity;


import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class Licence extends AbstractAsset {

  private String vendor;
  private Date expirationDate;

}