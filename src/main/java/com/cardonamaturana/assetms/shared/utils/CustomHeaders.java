package com.cardonamaturana.assetms.shared.utils;


import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum CustomHeaders {

  X_OBJECT_TYPE("X-Object-Type");


  private final String message;


}
