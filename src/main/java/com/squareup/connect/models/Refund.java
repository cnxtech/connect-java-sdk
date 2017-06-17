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
import com.squareup.connect.models.Money;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Represents a refund processed for a Square transaction.
 */
@ApiModel(description = "Represents a refund processed for a Square transaction.")

public class Refund {
  @SerializedName("id")
  private String id = null;

  @SerializedName("location_id")
  private String locationId = null;

  @SerializedName("transaction_id")
  private String transactionId = null;

  @SerializedName("tender_id")
  private String tenderId = null;

  @SerializedName("created_at")
  private String createdAt = null;

  @SerializedName("reason")
  private String reason = null;

  @SerializedName("amount_money")
  private Money amountMoney = null;

  /**
   * The current status of the refund (`PENDING`, `APPROVED`, `REJECTED`, or `FAILED`).
   */
  public enum StatusEnum {
    @SerializedName("PENDING")
    PENDING("PENDING"),
    
    @SerializedName("APPROVED")
    APPROVED("APPROVED"),
    
    @SerializedName("REJECTED")
    REJECTED("REJECTED"),
    
    @SerializedName("FAILED")
    FAILED("FAILED");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("status")
  private StatusEnum status = null;

  @SerializedName("processing_fee_money")
  private Money processingFeeMoney = null;

  public Refund id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The refund's unique ID.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "The refund's unique ID.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Refund locationId(String locationId) {
    this.locationId = locationId;
    return this;
  }

   /**
   * The ID of the refund's associated location.
   * @return locationId
  **/
  @ApiModelProperty(required = true, value = "The ID of the refund's associated location.")
  public String getLocationId() {
    return locationId;
  }

  public void setLocationId(String locationId) {
    this.locationId = locationId;
  }

  public Refund transactionId(String transactionId) {
    this.transactionId = transactionId;
    return this;
  }

   /**
   * The ID of the transaction that the refunded tender is part of.
   * @return transactionId
  **/
  @ApiModelProperty(required = true, value = "The ID of the transaction that the refunded tender is part of.")
  public String getTransactionId() {
    return transactionId;
  }

  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }

  public Refund tenderId(String tenderId) {
    this.tenderId = tenderId;
    return this;
  }

   /**
   * The ID of the refunded tender.
   * @return tenderId
  **/
  @ApiModelProperty(required = true, value = "The ID of the refunded tender.")
  public String getTenderId() {
    return tenderId;
  }

  public void setTenderId(String tenderId) {
    this.tenderId = tenderId;
  }

  public Refund createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * The time when the refund was created, in RFC 3339 format.
   * @return createdAt
  **/
  @ApiModelProperty(value = "The time when the refund was created, in RFC 3339 format.")
  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public Refund reason(String reason) {
    this.reason = reason;
    return this;
  }

   /**
   * The reason for the refund being issued.
   * @return reason
  **/
  @ApiModelProperty(required = true, value = "The reason for the refund being issued.")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public Refund amountMoney(Money amountMoney) {
    this.amountMoney = amountMoney;
    return this;
  }

   /**
   * The amount of money refunded to the buyer.
   * @return amountMoney
  **/
  @ApiModelProperty(required = true, value = "The amount of money refunded to the buyer.")
  public Money getAmountMoney() {
    return amountMoney;
  }

  public void setAmountMoney(Money amountMoney) {
    this.amountMoney = amountMoney;
  }

  public Refund status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * The current status of the refund (`PENDING`, `APPROVED`, `REJECTED`, or `FAILED`).
   * @return status
  **/
  @ApiModelProperty(required = true, value = "The current status of the refund (`PENDING`, `APPROVED`, `REJECTED`, or `FAILED`).")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public Refund processingFeeMoney(Money processingFeeMoney) {
    this.processingFeeMoney = processingFeeMoney;
    return this;
  }

   /**
   * The amount of Square processing fee money refunded to the *merchant*.
   * @return processingFeeMoney
  **/
  @ApiModelProperty(value = "The amount of Square processing fee money refunded to the *merchant*.")
  public Money getProcessingFeeMoney() {
    return processingFeeMoney;
  }

  public void setProcessingFeeMoney(Money processingFeeMoney) {
    this.processingFeeMoney = processingFeeMoney;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Refund refund = (Refund) o;
    return Objects.equals(this.id, refund.id) &&
        Objects.equals(this.locationId, refund.locationId) &&
        Objects.equals(this.transactionId, refund.transactionId) &&
        Objects.equals(this.tenderId, refund.tenderId) &&
        Objects.equals(this.createdAt, refund.createdAt) &&
        Objects.equals(this.reason, refund.reason) &&
        Objects.equals(this.amountMoney, refund.amountMoney) &&
        Objects.equals(this.status, refund.status) &&
        Objects.equals(this.processingFeeMoney, refund.processingFeeMoney);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, locationId, transactionId, tenderId, createdAt, reason, amountMoney, status, processingFeeMoney);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Refund {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    locationId: ").append(toIndentedString(locationId)).append("\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    tenderId: ").append(toIndentedString(tenderId)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    amountMoney: ").append(toIndentedString(amountMoney)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    processingFeeMoney: ").append(toIndentedString(processingFeeMoney)).append("\n");
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

