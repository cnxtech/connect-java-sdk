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
import com.squareup.connect.models.CatalogObject;
import com.squareup.connect.models.Error;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 */
@ApiModel(description = "")

public class RetrieveCatalogObjectResponse {
  @SerializedName("errors")
  private List<Error> errors = new ArrayList<Error>();

  @SerializedName("object")
  private CatalogObject object = null;

  @SerializedName("related_objects")
  private List<CatalogObject> relatedObjects = new ArrayList<CatalogObject>();

  public RetrieveCatalogObjectResponse errors(List<Error> errors) {
    this.errors = errors;
    return this;
  }

  public RetrieveCatalogObjectResponse addErrorsItem(Error errorsItem) {
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * The set of [Error](#type-error)s encountered.
   * @return errors
  **/
  @ApiModelProperty(value = "The set of [Error](#type-error)s encountered.")
  public List<Error> getErrors() {
    return errors;
  }

  public void setErrors(List<Error> errors) {
    this.errors = errors;
  }

  public RetrieveCatalogObjectResponse object(CatalogObject object) {
    this.object = object;
    return this;
  }

   /**
   * The [CatalogObject](#type-catalogobject)s returned.
   * @return object
  **/
  @ApiModelProperty(value = "The [CatalogObject](#type-catalogobject)s returned.")
  public CatalogObject getObject() {
    return object;
  }

  public void setObject(CatalogObject object) {
    this.object = object;
  }

  public RetrieveCatalogObjectResponse relatedObjects(List<CatalogObject> relatedObjects) {
    this.relatedObjects = relatedObjects;
    return this;
  }

  public RetrieveCatalogObjectResponse addRelatedObjectsItem(CatalogObject relatedObjectsItem) {
    this.relatedObjects.add(relatedObjectsItem);
    return this;
  }

   /**
   * A list of [CatalogObject](#type-catalogobject)s referenced by the object in the `object` field.
   * @return relatedObjects
  **/
  @ApiModelProperty(value = "A list of [CatalogObject](#type-catalogobject)s referenced by the object in the `object` field.")
  public List<CatalogObject> getRelatedObjects() {
    return relatedObjects;
  }

  public void setRelatedObjects(List<CatalogObject> relatedObjects) {
    this.relatedObjects = relatedObjects;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetrieveCatalogObjectResponse retrieveCatalogObjectResponse = (RetrieveCatalogObjectResponse) o;
    return Objects.equals(this.errors, retrieveCatalogObjectResponse.errors) &&
        Objects.equals(this.object, retrieveCatalogObjectResponse.object) &&
        Objects.equals(this.relatedObjects, retrieveCatalogObjectResponse.relatedObjects);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors, object, relatedObjects);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetrieveCatalogObjectResponse {\n");
    
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    relatedObjects: ").append(toIndentedString(relatedObjects)).append("\n");
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

