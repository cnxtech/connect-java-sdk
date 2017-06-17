/*
 * Square Connect API
 * Client library for accessing the Square Connect APIs
 *
 * OpenAPI spec version: 2.0
 * Contact: developers@squareup.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.squareup.connect.models;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * V1ItemImage
 */

public class V1ItemImage {
  @SerializedName("id")
  private String id = null;

  @SerializedName("url")
  private String url = null;

  public V1ItemImage id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The image's unique ID.
   * @return id
  **/
  @ApiModelProperty(value = "The image's unique ID.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public V1ItemImage url(String url) {
    this.url = url;
    return this;
  }

   /**
   * The image's publicly accessible URL.
   * @return url
  **/
  @ApiModelProperty(value = "The image's publicly accessible URL.")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ItemImage v1ItemImage = (V1ItemImage) o;
    return Objects.equals(this.id, v1ItemImage.id) &&
        Objects.equals(this.url, v1ItemImage.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, url);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ItemImage {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

