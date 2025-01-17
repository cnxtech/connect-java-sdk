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
import com.squareup.connect.models.MeasurementUnitCustom;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Represents a unit of measurement to use with a quantity, such as ounces or inches. Exactly one of the following fields are required: &#x60;custom_unit&#x60;, &#x60;area_unit&#x60;, &#x60;length_unit&#x60;, &#x60;volume_unit&#x60;, and &#x60;weight_unit&#x60;.  The &#x60;family&#x60; field describes the type of measurement. For example, ounces are in the weight family.
 */
@ApiModel(description = "Represents a unit of measurement to use with a quantity, such as ounces or inches. Exactly one of the following fields are required: `custom_unit`, `area_unit`, `length_unit`, `volume_unit`, and `weight_unit`.  The `family` field describes the type of measurement. For example, ounces are in the weight family.")

public class MeasurementUnit {
  @JsonProperty("custom_unit")
  private MeasurementUnitCustom customUnit = null;

  /**
   * Represents a standard area unit. See [MeasurementUnitArea](#type-measurementunitarea) for possible values
   */
  public enum AreaUnitEnum {
    IMPERIAL_ACRE("IMPERIAL_ACRE"),
    
    IMPERIAL_SQUARE_INCH("IMPERIAL_SQUARE_INCH"),
    
    IMPERIAL_SQUARE_FOOT("IMPERIAL_SQUARE_FOOT"),
    
    IMPERIAL_SQUARE_YARD("IMPERIAL_SQUARE_YARD"),
    
    IMPERIAL_SQUARE_MILE("IMPERIAL_SQUARE_MILE"),
    
    METRIC_SQUARE_CENTIMETER("METRIC_SQUARE_CENTIMETER"),
    
    METRIC_SQUARE_METER("METRIC_SQUARE_METER"),
    
    METRIC_SQUARE_KILOMETER("METRIC_SQUARE_KILOMETER");

    private String value;

    AreaUnitEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static AreaUnitEnum fromValue(String text) {
      for (AreaUnitEnum b : AreaUnitEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("area_unit")
  private AreaUnitEnum areaUnit = null;

  /**
   * Represents a standard length unit. See [MeasurementUnitLength](#type-measurementunitlength) for possible values
   */
  public enum LengthUnitEnum {
    IMPERIAL_INCH("IMPERIAL_INCH"),
    
    IMPERIAL_FOOT("IMPERIAL_FOOT"),
    
    IMPERIAL_YARD("IMPERIAL_YARD"),
    
    IMPERIAL_MILE("IMPERIAL_MILE"),
    
    METRIC_MILLIMETER("METRIC_MILLIMETER"),
    
    METRIC_CENTIMETER("METRIC_CENTIMETER"),
    
    METRIC_METER("METRIC_METER"),
    
    METRIC_KILOMETER("METRIC_KILOMETER");

    private String value;

    LengthUnitEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static LengthUnitEnum fromValue(String text) {
      for (LengthUnitEnum b : LengthUnitEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("length_unit")
  private LengthUnitEnum lengthUnit = null;

  /**
   * Represents a standard volume unit. See [MeasurementUnitVolume](#type-measurementunitvolume) for possible values
   */
  public enum VolumeUnitEnum {
    GENERIC_FLUID_OUNCE("GENERIC_FLUID_OUNCE"),
    
    GENERIC_SHOT("GENERIC_SHOT"),
    
    GENERIC_CUP("GENERIC_CUP"),
    
    GENERIC_PINT("GENERIC_PINT"),
    
    GENERIC_QUART("GENERIC_QUART"),
    
    GENERIC_GALLON("GENERIC_GALLON"),
    
    IMPERIAL_CUBIC_INCH("IMPERIAL_CUBIC_INCH"),
    
    IMPERIAL_CUBIC_FOOT("IMPERIAL_CUBIC_FOOT"),
    
    IMPERIAL_CUBIC_YARD("IMPERIAL_CUBIC_YARD"),
    
    METRIC_MILLILITER("METRIC_MILLILITER"),
    
    METRIC_LITER("METRIC_LITER");

    private String value;

    VolumeUnitEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static VolumeUnitEnum fromValue(String text) {
      for (VolumeUnitEnum b : VolumeUnitEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("volume_unit")
  private VolumeUnitEnum volumeUnit = null;

  /**
   * Represents a standard unit of weight or mass. See [MeasurementUnitWeight](#type-measurementunitweight) for possible values
   */
  public enum WeightUnitEnum {
    IMPERIAL_WEIGHT_OUNCE("IMPERIAL_WEIGHT_OUNCE"),
    
    IMPERIAL_POUND("IMPERIAL_POUND"),
    
    IMPERIAL_STONE("IMPERIAL_STONE"),
    
    METRIC_MILLIGRAM("METRIC_MILLIGRAM"),
    
    METRIC_GRAM("METRIC_GRAM"),
    
    METRIC_KILOGRAM("METRIC_KILOGRAM");

    private String value;

    WeightUnitEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static WeightUnitEnum fromValue(String text) {
      for (WeightUnitEnum b : WeightUnitEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("weight_unit")
  private WeightUnitEnum weightUnit = null;

  public MeasurementUnit customUnit(MeasurementUnitCustom customUnit) {
    this.customUnit = customUnit;
    return this;
  }

   /**
   * A custom unit of measurement defined by the seller using the Point of Sale app or ad-hoc as an order line item.
   * @return customUnit
  **/
  @ApiModelProperty(value = "A custom unit of measurement defined by the seller using the Point of Sale app or ad-hoc as an order line item.")
  public MeasurementUnitCustom getCustomUnit() {
    return customUnit;
  }

  public void setCustomUnit(MeasurementUnitCustom customUnit) {
    this.customUnit = customUnit;
  }

  public MeasurementUnit areaUnit(AreaUnitEnum areaUnit) {
    this.areaUnit = areaUnit;
    return this;
  }

   /**
   * Represents a standard area unit. See [MeasurementUnitArea](#type-measurementunitarea) for possible values
   * @return areaUnit
  **/
  @ApiModelProperty(value = "Represents a standard area unit. See [MeasurementUnitArea](#type-measurementunitarea) for possible values")
  public AreaUnitEnum getAreaUnit() {
    return areaUnit;
  }

  public void setAreaUnit(AreaUnitEnum areaUnit) {
    this.areaUnit = areaUnit;
  }

  public MeasurementUnit lengthUnit(LengthUnitEnum lengthUnit) {
    this.lengthUnit = lengthUnit;
    return this;
  }

   /**
   * Represents a standard length unit. See [MeasurementUnitLength](#type-measurementunitlength) for possible values
   * @return lengthUnit
  **/
  @ApiModelProperty(value = "Represents a standard length unit. See [MeasurementUnitLength](#type-measurementunitlength) for possible values")
  public LengthUnitEnum getLengthUnit() {
    return lengthUnit;
  }

  public void setLengthUnit(LengthUnitEnum lengthUnit) {
    this.lengthUnit = lengthUnit;
  }

  public MeasurementUnit volumeUnit(VolumeUnitEnum volumeUnit) {
    this.volumeUnit = volumeUnit;
    return this;
  }

   /**
   * Represents a standard volume unit. See [MeasurementUnitVolume](#type-measurementunitvolume) for possible values
   * @return volumeUnit
  **/
  @ApiModelProperty(value = "Represents a standard volume unit. See [MeasurementUnitVolume](#type-measurementunitvolume) for possible values")
  public VolumeUnitEnum getVolumeUnit() {
    return volumeUnit;
  }

  public void setVolumeUnit(VolumeUnitEnum volumeUnit) {
    this.volumeUnit = volumeUnit;
  }

  public MeasurementUnit weightUnit(WeightUnitEnum weightUnit) {
    this.weightUnit = weightUnit;
    return this;
  }

   /**
   * Represents a standard unit of weight or mass. See [MeasurementUnitWeight](#type-measurementunitweight) for possible values
   * @return weightUnit
  **/
  @ApiModelProperty(value = "Represents a standard unit of weight or mass. See [MeasurementUnitWeight](#type-measurementunitweight) for possible values")
  public WeightUnitEnum getWeightUnit() {
    return weightUnit;
  }

  public void setWeightUnit(WeightUnitEnum weightUnit) {
    this.weightUnit = weightUnit;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MeasurementUnit measurementUnit = (MeasurementUnit) o;
    return Objects.equals(this.customUnit, measurementUnit.customUnit) &&
        Objects.equals(this.areaUnit, measurementUnit.areaUnit) &&
        Objects.equals(this.lengthUnit, measurementUnit.lengthUnit) &&
        Objects.equals(this.volumeUnit, measurementUnit.volumeUnit) &&
        Objects.equals(this.weightUnit, measurementUnit.weightUnit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customUnit, areaUnit, lengthUnit, volumeUnit, weightUnit);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MeasurementUnit {\n");
    
    sb.append("    customUnit: ").append(toIndentedString(customUnit)).append("\n");
    sb.append("    areaUnit: ").append(toIndentedString(areaUnit)).append("\n");
    sb.append("    lengthUnit: ").append(toIndentedString(lengthUnit)).append("\n");
    sb.append("    volumeUnit: ").append(toIndentedString(volumeUnit)).append("\n");
    sb.append("    weightUnit: ").append(toIndentedString(weightUnit)).append("\n");
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

