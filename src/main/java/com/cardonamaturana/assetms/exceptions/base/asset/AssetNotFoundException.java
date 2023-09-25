package com.cardonamaturana.assetms.exceptions.base.asset;


import com.cardonamaturana.assetms.exceptions.base.BaseException;
import com.cardonamaturana.assetms.exceptions.base.ExceptionCode;
import org.springframework.http.HttpStatus;

public class AssetNotFoundException extends BaseException {

  public AssetNotFoundException() {
    super(false, HttpStatus.NOT_FOUND, ExceptionCode.ASSET_NOT_FOUND.getMessage(),
        ExceptionCode.ASSET_NOT_FOUND);
  }
}
