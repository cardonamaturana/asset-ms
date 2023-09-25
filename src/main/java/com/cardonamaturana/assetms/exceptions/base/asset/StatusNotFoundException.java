package com.cardonamaturana.assetms.exceptions.base.asset;


import com.cardonamaturana.assetms.exceptions.base.BaseException;
import com.cardonamaturana.assetms.exceptions.base.ExceptionCode;
import org.springframework.http.HttpStatus;

public class StatusNotFoundException extends BaseException {

  public StatusNotFoundException() {
    super(false, HttpStatus.NOT_FOUND, ExceptionCode.STATUS_NOT_FOUND.getMessage(),
        ExceptionCode.STATUS_NOT_FOUND);
  }
}
