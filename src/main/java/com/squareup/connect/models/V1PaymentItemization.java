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
import com.squareup.connect.models.V1Money;
import com.squareup.connect.models.V1PaymentDiscount;
import com.squareup.connect.models.V1PaymentItemDetail;
import com.squareup.connect.models.V1PaymentModifier;
import com.squareup.connect.models.V1PaymentTax;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * V1PaymentItemization
 */

public class V1PaymentItemization {
  @SerializedName("name")
  private String name = null;

  @SerializedName("quantity")
  private BigDecimal quantity = null;

  /**
   * The type of purchase that the itemization represents, such as an ITEM or CUSTOM_AMOUNT
   */
  public enum ItemizationTypeEnum {
    @SerializedName("ITEM")
    ITEM("ITEM"),
    
    @SerializedName("CUSTOM_AMOUNT")
    CUSTOM_AMOUNT("CUSTOM_AMOUNT"),
    
    @SerializedName("GIFT_CARD_ACTIVATION")
    GIFT_CARD_ACTIVATION("GIFT_CARD_ACTIVATION"),
    
    @SerializedName("GIFT_CARD_RELOAD")
    GIFT_CARD_RELOAD("GIFT_CARD_RELOAD"),
    
    @SerializedName("GIFT_CARD_UNKNOWN")
    GIFT_CARD_UNKNOWN("GIFT_CARD_UNKNOWN"),
    
    @SerializedName("OTHER")
    OTHER("OTHER");

    private String value;

    ItemizationTypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("itemization_type")
  private ItemizationTypeEnum itemizationType = null;

  @SerializedName("item_detail")
  private V1PaymentItemDetail itemDetail = null;

  @SerializedName("notes")
  private String notes = null;

  @SerializedName("item_variation_name")
  private String itemVariationName = null;

  @SerializedName("total_money")
  private V1Money totalMoney = null;

  @SerializedName("single_quantity_money")
  private V1Money singleQuantityMoney = null;

  @SerializedName("gross_sales_money")
  private V1Money grossSalesMoney = null;

  @SerializedName("discount_money")
  private V1Money discountMoney = null;

  @SerializedName("net_sales_money")
  private V1Money netSalesMoney = null;

  @SerializedName("taxes")
  private List<V1PaymentTax> taxes = new ArrayList<V1PaymentTax>();

  @SerializedName("discounts")
  private List<V1PaymentDiscount> discounts = new ArrayList<V1PaymentDiscount>();

  @SerializedName("modifiers")
  private List<V1PaymentModifier> modifiers = new ArrayList<V1PaymentModifier>();

  public V1PaymentItemization name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The item's name.
   * @return name
  **/
  @ApiModelProperty(value = "The item's name.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public V1PaymentItemization quantity(BigDecimal quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * The quantity of the item purchased. This can be a decimal value.
   * @return quantity
  **/
  @ApiModelProperty(value = "The quantity of the item purchased. This can be a decimal value.")
  public BigDecimal getQuantity() {
    return quantity;
  }

  public void setQuantity(BigDecimal quantity) {
    this.quantity = quantity;
  }

  public V1PaymentItemization itemizationType(ItemizationTypeEnum itemizationType) {
    this.itemizationType = itemizationType;
    return this;
  }

   /**
   * The type of purchase that the itemization represents, such as an ITEM or CUSTOM_AMOUNT
   * @return itemizationType
  **/
  @ApiModelProperty(value = "The type of purchase that the itemization represents, such as an ITEM or CUSTOM_AMOUNT")
  public ItemizationTypeEnum getItemizationType() {
    return itemizationType;
  }

  public void setItemizationType(ItemizationTypeEnum itemizationType) {
    this.itemizationType = itemizationType;
  }

  public V1PaymentItemization itemDetail(V1PaymentItemDetail itemDetail) {
    this.itemDetail = itemDetail;
    return this;
  }

   /**
   * Details of the item, including its unique identifier and the identifier of the item variation purchased.
   * @return itemDetail
  **/
  @ApiModelProperty(value = "Details of the item, including its unique identifier and the identifier of the item variation purchased.")
  public V1PaymentItemDetail getItemDetail() {
    return itemDetail;
  }

  public void setItemDetail(V1PaymentItemDetail itemDetail) {
    this.itemDetail = itemDetail;
  }

  public V1PaymentItemization notes(String notes) {
    this.notes = notes;
    return this;
  }

   /**
   * Notes entered by the merchant about the item at the time of payment, if any.
   * @return notes
  **/
  @ApiModelProperty(value = "Notes entered by the merchant about the item at the time of payment, if any.")
  public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }

  public V1PaymentItemization itemVariationName(String itemVariationName) {
    this.itemVariationName = itemVariationName;
    return this;
  }

   /**
   * The name of the item variation purchased, if any.
   * @return itemVariationName
  **/
  @ApiModelProperty(value = "The name of the item variation purchased, if any.")
  public String getItemVariationName() {
    return itemVariationName;
  }

  public void setItemVariationName(String itemVariationName) {
    this.itemVariationName = itemVariationName;
  }

  public V1PaymentItemization totalMoney(V1Money totalMoney) {
    this.totalMoney = totalMoney;
    return this;
  }

   /**
   * The total cost of the item, including all taxes and discounts.
   * @return totalMoney
  **/
  @ApiModelProperty(value = "The total cost of the item, including all taxes and discounts.")
  public V1Money getTotalMoney() {
    return totalMoney;
  }

  public void setTotalMoney(V1Money totalMoney) {
    this.totalMoney = totalMoney;
  }

  public V1PaymentItemization singleQuantityMoney(V1Money singleQuantityMoney) {
    this.singleQuantityMoney = singleQuantityMoney;
    return this;
  }

   /**
   * The cost of a single unit of this item.
   * @return singleQuantityMoney
  **/
  @ApiModelProperty(value = "The cost of a single unit of this item.")
  public V1Money getSingleQuantityMoney() {
    return singleQuantityMoney;
  }

  public void setSingleQuantityMoney(V1Money singleQuantityMoney) {
    this.singleQuantityMoney = singleQuantityMoney;
  }

  public V1PaymentItemization grossSalesMoney(V1Money grossSalesMoney) {
    this.grossSalesMoney = grossSalesMoney;
    return this;
  }

   /**
   * The total cost of the itemization and its modifiers, not including taxes or discounts.
   * @return grossSalesMoney
  **/
  @ApiModelProperty(value = "The total cost of the itemization and its modifiers, not including taxes or discounts.")
  public V1Money getGrossSalesMoney() {
    return grossSalesMoney;
  }

  public void setGrossSalesMoney(V1Money grossSalesMoney) {
    this.grossSalesMoney = grossSalesMoney;
  }

  public V1PaymentItemization discountMoney(V1Money discountMoney) {
    this.discountMoney = discountMoney;
    return this;
  }

   /**
   * The total of all discounts applied to the itemization. This value is always negative or zero.
   * @return discountMoney
  **/
  @ApiModelProperty(value = "The total of all discounts applied to the itemization. This value is always negative or zero.")
  public V1Money getDiscountMoney() {
    return discountMoney;
  }

  public void setDiscountMoney(V1Money discountMoney) {
    this.discountMoney = discountMoney;
  }

  public V1PaymentItemization netSalesMoney(V1Money netSalesMoney) {
    this.netSalesMoney = netSalesMoney;
    return this;
  }

   /**
   * The sum of gross_sales_money and discount_money.
   * @return netSalesMoney
  **/
  @ApiModelProperty(value = "The sum of gross_sales_money and discount_money.")
  public V1Money getNetSalesMoney() {
    return netSalesMoney;
  }

  public void setNetSalesMoney(V1Money netSalesMoney) {
    this.netSalesMoney = netSalesMoney;
  }

  public V1PaymentItemization taxes(List<V1PaymentTax> taxes) {
    this.taxes = taxes;
    return this;
  }

  public V1PaymentItemization addTaxesItem(V1PaymentTax taxesItem) {
    this.taxes.add(taxesItem);
    return this;
  }

   /**
   * All taxes applied to this itemization.
   * @return taxes
  **/
  @ApiModelProperty(value = "All taxes applied to this itemization.")
  public List<V1PaymentTax> getTaxes() {
    return taxes;
  }

  public void setTaxes(List<V1PaymentTax> taxes) {
    this.taxes = taxes;
  }

  public V1PaymentItemization discounts(List<V1PaymentDiscount> discounts) {
    this.discounts = discounts;
    return this;
  }

  public V1PaymentItemization addDiscountsItem(V1PaymentDiscount discountsItem) {
    this.discounts.add(discountsItem);
    return this;
  }

   /**
   * All discounts applied to this itemization.
   * @return discounts
  **/
  @ApiModelProperty(value = "All discounts applied to this itemization.")
  public List<V1PaymentDiscount> getDiscounts() {
    return discounts;
  }

  public void setDiscounts(List<V1PaymentDiscount> discounts) {
    this.discounts = discounts;
  }

  public V1PaymentItemization modifiers(List<V1PaymentModifier> modifiers) {
    this.modifiers = modifiers;
    return this;
  }

  public V1PaymentItemization addModifiersItem(V1PaymentModifier modifiersItem) {
    this.modifiers.add(modifiersItem);
    return this;
  }

   /**
   * All modifier options applied to this itemization.
   * @return modifiers
  **/
  @ApiModelProperty(value = "All modifier options applied to this itemization.")
  public List<V1PaymentModifier> getModifiers() {
    return modifiers;
  }

  public void setModifiers(List<V1PaymentModifier> modifiers) {
    this.modifiers = modifiers;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1PaymentItemization v1PaymentItemization = (V1PaymentItemization) o;
    return Objects.equals(this.name, v1PaymentItemization.name) &&
        Objects.equals(this.quantity, v1PaymentItemization.quantity) &&
        Objects.equals(this.itemizationType, v1PaymentItemization.itemizationType) &&
        Objects.equals(this.itemDetail, v1PaymentItemization.itemDetail) &&
        Objects.equals(this.notes, v1PaymentItemization.notes) &&
        Objects.equals(this.itemVariationName, v1PaymentItemization.itemVariationName) &&
        Objects.equals(this.totalMoney, v1PaymentItemization.totalMoney) &&
        Objects.equals(this.singleQuantityMoney, v1PaymentItemization.singleQuantityMoney) &&
        Objects.equals(this.grossSalesMoney, v1PaymentItemization.grossSalesMoney) &&
        Objects.equals(this.discountMoney, v1PaymentItemization.discountMoney) &&
        Objects.equals(this.netSalesMoney, v1PaymentItemization.netSalesMoney) &&
        Objects.equals(this.taxes, v1PaymentItemization.taxes) &&
        Objects.equals(this.discounts, v1PaymentItemization.discounts) &&
        Objects.equals(this.modifiers, v1PaymentItemization.modifiers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, quantity, itemizationType, itemDetail, notes, itemVariationName, totalMoney, singleQuantityMoney, grossSalesMoney, discountMoney, netSalesMoney, taxes, discounts, modifiers);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1PaymentItemization {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    itemizationType: ").append(toIndentedString(itemizationType)).append("\n");
    sb.append("    itemDetail: ").append(toIndentedString(itemDetail)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    itemVariationName: ").append(toIndentedString(itemVariationName)).append("\n");
    sb.append("    totalMoney: ").append(toIndentedString(totalMoney)).append("\n");
    sb.append("    singleQuantityMoney: ").append(toIndentedString(singleQuantityMoney)).append("\n");
    sb.append("    grossSalesMoney: ").append(toIndentedString(grossSalesMoney)).append("\n");
    sb.append("    discountMoney: ").append(toIndentedString(discountMoney)).append("\n");
    sb.append("    netSalesMoney: ").append(toIndentedString(netSalesMoney)).append("\n");
    sb.append("    taxes: ").append(toIndentedString(taxes)).append("\n");
    sb.append("    discounts: ").append(toIndentedString(discounts)).append("\n");
    sb.append("    modifiers: ").append(toIndentedString(modifiers)).append("\n");
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

