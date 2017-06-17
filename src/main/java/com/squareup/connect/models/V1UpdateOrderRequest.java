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
 * V1UpdateOrderRequest
 */

public class V1UpdateOrderRequest {
  /**
   * The action to perform on the order (COMPLETE, CANCEL, or REFUND).
   */
  public enum ActionEnum {
    @SerializedName("COMPLETE")
    COMPLETE("COMPLETE"),
    
    @SerializedName("CANCEL")
    CANCEL("CANCEL"),
    
    @SerializedName("REFUND")
    REFUND("REFUND");

    private String value;

    ActionEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("action")
  private ActionEnum action = null;

  @SerializedName("shipped_tracking_number")
  private String shippedTrackingNumber = null;

  @SerializedName("completed_note")
  private String completedNote = null;

  @SerializedName("refunded_note")
  private String refundedNote = null;

  @SerializedName("canceled_note")
  private String canceledNote = null;

  public V1UpdateOrderRequest action(ActionEnum action) {
    this.action = action;
    return this;
  }

   /**
   * The action to perform on the order (COMPLETE, CANCEL, or REFUND).
   * @return action
  **/
  @ApiModelProperty(required = true, value = "The action to perform on the order (COMPLETE, CANCEL, or REFUND).")
  public ActionEnum getAction() {
    return action;
  }

  public void setAction(ActionEnum action) {
    this.action = action;
  }

  public V1UpdateOrderRequest shippedTrackingNumber(String shippedTrackingNumber) {
    this.shippedTrackingNumber = shippedTrackingNumber;
    return this;
  }

   /**
   * The tracking number of the shipment associated with the order. Only valid if action is COMPLETE.
   * @return shippedTrackingNumber
  **/
  @ApiModelProperty(value = "The tracking number of the shipment associated with the order. Only valid if action is COMPLETE.")
  public String getShippedTrackingNumber() {
    return shippedTrackingNumber;
  }

  public void setShippedTrackingNumber(String shippedTrackingNumber) {
    this.shippedTrackingNumber = shippedTrackingNumber;
  }

  public V1UpdateOrderRequest completedNote(String completedNote) {
    this.completedNote = completedNote;
    return this;
  }

   /**
   * A merchant-specified note about the completion of the order. Only valid if action is COMPLETE.
   * @return completedNote
  **/
  @ApiModelProperty(value = "A merchant-specified note about the completion of the order. Only valid if action is COMPLETE.")
  public String getCompletedNote() {
    return completedNote;
  }

  public void setCompletedNote(String completedNote) {
    this.completedNote = completedNote;
  }

  public V1UpdateOrderRequest refundedNote(String refundedNote) {
    this.refundedNote = refundedNote;
    return this;
  }

   /**
   * A merchant-specified note about the refunding of the order. Only valid if action is REFUND.
   * @return refundedNote
  **/
  @ApiModelProperty(value = "A merchant-specified note about the refunding of the order. Only valid if action is REFUND.")
  public String getRefundedNote() {
    return refundedNote;
  }

  public void setRefundedNote(String refundedNote) {
    this.refundedNote = refundedNote;
  }

  public V1UpdateOrderRequest canceledNote(String canceledNote) {
    this.canceledNote = canceledNote;
    return this;
  }

   /**
   * A merchant-specified note about the canceling of the order. Only valid if action is CANCEL.
   * @return canceledNote
  **/
  @ApiModelProperty(value = "A merchant-specified note about the canceling of the order. Only valid if action is CANCEL.")
  public String getCanceledNote() {
    return canceledNote;
  }

  public void setCanceledNote(String canceledNote) {
    this.canceledNote = canceledNote;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1UpdateOrderRequest v1UpdateOrderRequest = (V1UpdateOrderRequest) o;
    return Objects.equals(this.action, v1UpdateOrderRequest.action) &&
        Objects.equals(this.shippedTrackingNumber, v1UpdateOrderRequest.shippedTrackingNumber) &&
        Objects.equals(this.completedNote, v1UpdateOrderRequest.completedNote) &&
        Objects.equals(this.refundedNote, v1UpdateOrderRequest.refundedNote) &&
        Objects.equals(this.canceledNote, v1UpdateOrderRequest.canceledNote);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, shippedTrackingNumber, completedNote, refundedNote, canceledNote);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1UpdateOrderRequest {\n");
    
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    shippedTrackingNumber: ").append(toIndentedString(shippedTrackingNumber)).append("\n");
    sb.append("    completedNote: ").append(toIndentedString(completedNote)).append("\n");
    sb.append("    refundedNote: ").append(toIndentedString(refundedNote)).append("\n");
    sb.append("    canceledNote: ").append(toIndentedString(canceledNote)).append("\n");
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

