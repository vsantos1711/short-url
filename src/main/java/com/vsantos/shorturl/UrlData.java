package com.vsantos.shorturl;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter
public class UrlData {

  private String originalUrl;
  private long expirationTime;

}
