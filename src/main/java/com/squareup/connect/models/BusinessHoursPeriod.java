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
 *  Represents a period of time during which a business location is open.
 */
@ApiModel(description = " Represents a period of time during which a business location is open.")

public class BusinessHoursPeriod {
  /**
   * The day of week for this time period. See [DayOfWeek](#type-dayofweek) for possible values
   */
  public enum DayOfWeekEnum {
    SUN("SUN"),
    
    MON("MON"),
    
    TUE("TUE"),
    
    WED("WED"),
    
    THU("THU"),
    
    FRI("FRI"),
    
    SAT("SAT");

    private String value;

    DayOfWeekEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static DayOfWeekEnum fromValue(String text) {
      for (DayOfWeekEnum b : DayOfWeekEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("day_of_week")
  private DayOfWeekEnum dayOfWeek = null;

  @JsonProperty("start_local_time")
  private String startLocalTime = null;

  @JsonProperty("end_local_time")
  private String endLocalTime = null;

  public BusinessHoursPeriod dayOfWeek(DayOfWeekEnum dayOfWeek) {
    this.dayOfWeek = dayOfWeek;
    return this;
  }

   /**
   * The day of week for this time period. See [DayOfWeek](#type-dayofweek) for possible values
   * @return dayOfWeek
  **/
  @ApiModelProperty(value = "The day of week for this time period. See [DayOfWeek](#type-dayofweek) for possible values")
  public DayOfWeekEnum getDayOfWeek() {
    return dayOfWeek;
  }

  public void setDayOfWeek(DayOfWeekEnum dayOfWeek) {
    this.dayOfWeek = dayOfWeek;
  }

  public BusinessHoursPeriod startLocalTime(String startLocalTime) {
    this.startLocalTime = startLocalTime;
    return this;
  }

   /**
   * The start time of a business hours period, specified in local time using partial-time RFC3339 format.
   * @return startLocalTime
  **/
  @ApiModelProperty(value = "The start time of a business hours period, specified in local time using partial-time RFC3339 format.")
  public String getStartLocalTime() {
    return startLocalTime;
  }

  public void setStartLocalTime(String startLocalTime) {
    this.startLocalTime = startLocalTime;
  }

  public BusinessHoursPeriod endLocalTime(String endLocalTime) {
    this.endLocalTime = endLocalTime;
    return this;
  }

   /**
   * The end time of a business hours period, specified in local time using partial-time RFC3339 format.
   * @return endLocalTime
  **/
  @ApiModelProperty(value = "The end time of a business hours period, specified in local time using partial-time RFC3339 format.")
  public String getEndLocalTime() {
    return endLocalTime;
  }

  public void setEndLocalTime(String endLocalTime) {
    this.endLocalTime = endLocalTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BusinessHoursPeriod businessHoursPeriod = (BusinessHoursPeriod) o;
    return Objects.equals(this.dayOfWeek, businessHoursPeriod.dayOfWeek) &&
        Objects.equals(this.startLocalTime, businessHoursPeriod.startLocalTime) &&
        Objects.equals(this.endLocalTime, businessHoursPeriod.endLocalTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dayOfWeek, startLocalTime, endLocalTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BusinessHoursPeriod {\n");
    
    sb.append("    dayOfWeek: ").append(toIndentedString(dayOfWeek)).append("\n");
    sb.append("    startLocalTime: ").append(toIndentedString(startLocalTime)).append("\n");
    sb.append("    endLocalTime: ").append(toIndentedString(endLocalTime)).append("\n");
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

