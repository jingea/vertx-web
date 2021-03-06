package io.vertx.ext.web.client.impl;

import io.vertx.ext.web.client.FormDataPart;

public class AttributeFormDataPart implements FormDataPart {
  private final String key;
  private final String value;

  public AttributeFormDataPart(String key, String value) {
    this.key = key;
    this.value = value;
  }

  public String getKey() {
    return key;
  }

  public String getValue() {
    return value;
  }
}
