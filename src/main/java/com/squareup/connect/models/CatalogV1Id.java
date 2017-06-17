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
 * An Items Connect V1 object ID along with its associated location ID.
 */
@ApiModel(description = "An Items Connect V1 object ID along with its associated location ID.")

public class CatalogV1Id {
  @SerializedName("catalog_v1_id")
  private String catalogV1Id = null;

  @SerializedName("location_id")
  private String locationId = null;

  public CatalogV1Id catalogV1Id(String catalogV1Id) {
    this.catalogV1Id = catalogV1Id;
    return this;
  }

   /**
   * The ID for an object in Connect V1, if different from its Connect V2 ID.
   * @return catalogV1Id
  **/
  @ApiModelProperty(value = "The ID for an object in Connect V1, if different from its Connect V2 ID.")
  public String getCatalogV1Id() {
    return catalogV1Id;
  }

  public void setCatalogV1Id(String catalogV1Id) {
    this.catalogV1Id = catalogV1Id;
  }

  public CatalogV1Id locationId(String locationId) {
    this.locationId = locationId;
    return this;
  }

   /**
   * The ID of the location this Connect V1 ID is associated with.
   * @return locationId
  **/
  @ApiModelProperty(value = "The ID of the location this Connect V1 ID is associated with.")
  public String getLocationId() {
    return locationId;
  }

  public void setLocationId(String locationId) {
    this.locationId = locationId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogV1Id catalogV1Id = (CatalogV1Id) o;
    return Objects.equals(this.catalogV1Id, catalogV1Id.catalogV1Id) &&
        Objects.equals(this.locationId, catalogV1Id.locationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogV1Id, locationId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogV1Id {\n");
    
    sb.append("    catalogV1Id: ").append(toIndentedString(catalogV1Id)).append("\n");
    sb.append("    locationId: ").append(toIndentedString(locationId)).append("\n");
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

