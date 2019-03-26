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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * A record of an employee&#39;s break during a shift.
 */
@ApiModel(description = "A record of an employee's break during a shift.")

public class ModelBreak {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("start_at")
  private String startAt = null;

  @JsonProperty("end_at")
  private String endAt = null;

  @JsonProperty("break_type_id")
  private String breakTypeId = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("expected_duration")
  private String expectedDuration = null;

  @JsonProperty("is_paid")
  private Boolean isPaid = null;

  public ModelBreak id(String id) {
    this.id = id;
    return this;
  }

   /**
   * UUID for this object
   * @return id
  **/
  @ApiModelProperty(value = "UUID for this object")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ModelBreak startAt(String startAt) {
    this.startAt = startAt;
    return this;
  }

   /**
   * RFC 3339; follows same timezone info as `Shift`. Precision up to the minute is respected; seconds are truncated.
   * @return startAt
  **/
  @ApiModelProperty(required = true, value = "RFC 3339; follows same timezone info as `Shift`. Precision up to the minute is respected; seconds are truncated.")
  public String getStartAt() {
    return startAt;
  }

  public void setStartAt(String startAt) {
    this.startAt = startAt;
  }

  public ModelBreak endAt(String endAt) {
    this.endAt = endAt;
    return this;
  }

   /**
   * RFC 3339; follows same timezone info as `Shift`. Precision up to the minute is respected; seconds are truncated. The `end_at` minute is not counted when the break length is calculated. For example, a break from `00:00` to `00:11`  is considered a 10 minute break (midnight to 10 minutes after midnight).
   * @return endAt
  **/
  @ApiModelProperty(value = "RFC 3339; follows same timezone info as `Shift`. Precision up to the minute is respected; seconds are truncated. The `end_at` minute is not counted when the break length is calculated. For example, a break from `00:00` to `00:11`  is considered a 10 minute break (midnight to 10 minutes after midnight).")
  public String getEndAt() {
    return endAt;
  }

  public void setEndAt(String endAt) {
    this.endAt = endAt;
  }

  public ModelBreak breakTypeId(String breakTypeId) {
    this.breakTypeId = breakTypeId;
    return this;
  }

   /**
   * The `BreakType` this `Break` was templated on.
   * @return breakTypeId
  **/
  @ApiModelProperty(required = true, value = "The `BreakType` this `Break` was templated on.")
  public String getBreakTypeId() {
    return breakTypeId;
  }

  public void setBreakTypeId(String breakTypeId) {
    this.breakTypeId = breakTypeId;
  }

  public ModelBreak name(String name) {
    this.name = name;
    return this;
  }

   /**
   * A human-readable name.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "A human-readable name.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ModelBreak expectedDuration(String expectedDuration) {
    this.expectedDuration = expectedDuration;
    return this;
  }

   /**
   * Format: RFC-3339 P[n]Y[n]M[n]DT[n]H[n]M[n]S. The expected length of the break.
   * @return expectedDuration
  **/
  @ApiModelProperty(required = true, value = "Format: RFC-3339 P[n]Y[n]M[n]DT[n]H[n]M[n]S. The expected length of the break.")
  public String getExpectedDuration() {
    return expectedDuration;
  }

  public void setExpectedDuration(String expectedDuration) {
    this.expectedDuration = expectedDuration;
  }

  public ModelBreak isPaid(Boolean isPaid) {
    this.isPaid = isPaid;
    return this;
  }

   /**
   * Whether this break counts towards time worked for compensation purposes.
   * @return isPaid
  **/
  @ApiModelProperty(required = true, value = "Whether this break counts towards time worked for compensation purposes.")
  public Boolean getIsPaid() {
    return isPaid;
  }

  public void setIsPaid(Boolean isPaid) {
    this.isPaid = isPaid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelBreak _break = (ModelBreak) o;
    return Objects.equals(this.id, _break.id) &&
        Objects.equals(this.startAt, _break.startAt) &&
        Objects.equals(this.endAt, _break.endAt) &&
        Objects.equals(this.breakTypeId, _break.breakTypeId) &&
        Objects.equals(this.name, _break.name) &&
        Objects.equals(this.expectedDuration, _break.expectedDuration) &&
        Objects.equals(this.isPaid, _break.isPaid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, startAt, endAt, breakTypeId, name, expectedDuration, isPaid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelBreak {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    startAt: ").append(toIndentedString(startAt)).append("\n");
    sb.append("    endAt: ").append(toIndentedString(endAt)).append("\n");
    sb.append("    breakTypeId: ").append(toIndentedString(breakTypeId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    expectedDuration: ").append(toIndentedString(expectedDuration)).append("\n");
    sb.append("    isPaid: ").append(toIndentedString(isPaid)).append("\n");
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
