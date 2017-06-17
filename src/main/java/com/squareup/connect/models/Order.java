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
import com.squareup.connect.models.OrderLineItem;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * Contains all information related to a single order to process with Square, including line items that specify the products to purchase
 */
@ApiModel(description = "Contains all information related to a single order to process with Square, including line items that specify the products to purchase")

public class Order {
  @SerializedName("id")
  private String id = null;

  @SerializedName("location_id")
  private String locationId = null;

  @SerializedName("reference_id")
  private String referenceId = null;

  @SerializedName("line_items")
  private List<OrderLineItem> lineItems = new ArrayList<OrderLineItem>();

  @SerializedName("total_money")
  private Money totalMoney = null;

  public Order id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The order's unique ID.  This value is not present if the order was not created with the [CreateOrder](#endpoint-createorder) endpoint.
   * @return id
  **/
  @ApiModelProperty(value = "The order's unique ID.  This value is not present if the order was not created with the [CreateOrder](#endpoint-createorder) endpoint.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Order locationId(String locationId) {
    this.locationId = locationId;
    return this;
  }

   /**
   * The ID of the merchant location this order is associated with.
   * @return locationId
  **/
  @ApiModelProperty(value = "The ID of the merchant location this order is associated with.")
  public String getLocationId() {
    return locationId;
  }

  public void setLocationId(String locationId) {
    this.locationId = locationId;
  }

  public Order referenceId(String referenceId) {
    this.referenceId = referenceId;
    return this;
  }

   /**
   * A client specified identifier to associate an entity in another system with this order.
   * @return referenceId
  **/
  @ApiModelProperty(value = "A client specified identifier to associate an entity in another system with this order.")
  public String getReferenceId() {
    return referenceId;
  }

  public void setReferenceId(String referenceId) {
    this.referenceId = referenceId;
  }

  public Order lineItems(List<OrderLineItem> lineItems) {
    this.lineItems = lineItems;
    return this;
  }

  public Order addLineItemsItem(OrderLineItem lineItemsItem) {
    this.lineItems.add(lineItemsItem);
    return this;
  }

   /**
   * The line items included in the order. Every order has at least one line item.
   * @return lineItems
  **/
  @ApiModelProperty(value = "The line items included in the order. Every order has at least one line item.")
  public List<OrderLineItem> getLineItems() {
    return lineItems;
  }

  public void setLineItems(List<OrderLineItem> lineItems) {
    this.lineItems = lineItems;
  }

  public Order totalMoney(Money totalMoney) {
    this.totalMoney = totalMoney;
    return this;
  }

   /**
   * The total amount of money to collect for the order.
   * @return totalMoney
  **/
  @ApiModelProperty(value = "The total amount of money to collect for the order.")
  public Money getTotalMoney() {
    return totalMoney;
  }

  public void setTotalMoney(Money totalMoney) {
    this.totalMoney = totalMoney;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Order order = (Order) o;
    return Objects.equals(this.id, order.id) &&
        Objects.equals(this.locationId, order.locationId) &&
        Objects.equals(this.referenceId, order.referenceId) &&
        Objects.equals(this.lineItems, order.lineItems) &&
        Objects.equals(this.totalMoney, order.totalMoney);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, locationId, referenceId, lineItems, totalMoney);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Order {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    locationId: ").append(toIndentedString(locationId)).append("\n");
    sb.append("    referenceId: ").append(toIndentedString(referenceId)).append("\n");
    sb.append("    lineItems: ").append(toIndentedString(lineItems)).append("\n");
    sb.append("    totalMoney: ").append(toIndentedString(totalMoney)).append("\n");
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

