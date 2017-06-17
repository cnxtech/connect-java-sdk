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
import com.squareup.connect.models.Device;
import com.squareup.connect.models.V1Money;
import com.squareup.connect.models.V1PaymentItemization;
import com.squareup.connect.models.V1PaymentTax;
import com.squareup.connect.models.V1Refund;
import com.squareup.connect.models.V1Tender;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * V1Payment
 */

public class V1Payment {
  @SerializedName("id")
  private String id = null;

  @SerializedName("merchant_id")
  private String merchantId = null;

  @SerializedName("created_at")
  private String createdAt = null;

  @SerializedName("creator_id")
  private Boolean creatorId = null;

  @SerializedName("device")
  private Device device = null;

  @SerializedName("payment_url")
  private String paymentUrl = null;

  @SerializedName("receipt_url")
  private String receiptUrl = null;

  @SerializedName("inclusive_tax_money")
  private V1Money inclusiveTaxMoney = null;

  @SerializedName("additive_tax_money")
  private V1Money additiveTaxMoney = null;

  @SerializedName("tax_money")
  private V1Money taxMoney = null;

  @SerializedName("tip_money")
  private V1Money tipMoney = null;

  @SerializedName("discount_money")
  private V1Money discountMoney = null;

  @SerializedName("total_collected_money")
  private V1Money totalCollectedMoney = null;

  @SerializedName("processing_fee_money")
  private V1Money processingFeeMoney = null;

  @SerializedName("net_total_money")
  private V1Money netTotalMoney = null;

  @SerializedName("refunded_money")
  private V1Money refundedMoney = null;

  @SerializedName("swedish_rounding_money")
  private V1Money swedishRoundingMoney = null;

  @SerializedName("gross_sales_money")
  private V1Money grossSalesMoney = null;

  @SerializedName("net_sales_money")
  private V1Money netSalesMoney = null;

  @SerializedName("inclusive_tax")
  private List<V1PaymentTax> inclusiveTax = new ArrayList<V1PaymentTax>();

  @SerializedName("additive_tax")
  private List<V1PaymentTax> additiveTax = new ArrayList<V1PaymentTax>();

  @SerializedName("tender")
  private List<V1Tender> tender = new ArrayList<V1Tender>();

  @SerializedName("refunds")
  private List<V1Refund> refunds = new ArrayList<V1Refund>();

  @SerializedName("itemizations")
  private List<V1PaymentItemization> itemizations = new ArrayList<V1PaymentItemization>();

  public V1Payment id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The payment's unique identifier.
   * @return id
  **/
  @ApiModelProperty(value = "The payment's unique identifier.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public V1Payment merchantId(String merchantId) {
    this.merchantId = merchantId;
    return this;
  }

   /**
   * The unique identifier of the merchant that took the payment.
   * @return merchantId
  **/
  @ApiModelProperty(value = "The unique identifier of the merchant that took the payment.")
  public String getMerchantId() {
    return merchantId;
  }

  public void setMerchantId(String merchantId) {
    this.merchantId = merchantId;
  }

  public V1Payment createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * The time when the payment was created, in ISO 8601 format.
   * @return createdAt
  **/
  @ApiModelProperty(value = "The time when the payment was created, in ISO 8601 format.")
  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public V1Payment creatorId(Boolean creatorId) {
    this.creatorId = creatorId;
    return this;
  }

   /**
   * The unique identifier of the Square account that took the payment.
   * @return creatorId
  **/
  @ApiModelProperty(value = "The unique identifier of the Square account that took the payment.")
  public Boolean getCreatorId() {
    return creatorId;
  }

  public void setCreatorId(Boolean creatorId) {
    this.creatorId = creatorId;
  }

  public V1Payment device(Device device) {
    this.device = device;
    return this;
  }

   /**
   * The device that took the payment.
   * @return device
  **/
  @ApiModelProperty(value = "The device that took the payment.")
  public Device getDevice() {
    return device;
  }

  public void setDevice(Device device) {
    this.device = device;
  }

  public V1Payment paymentUrl(String paymentUrl) {
    this.paymentUrl = paymentUrl;
    return this;
  }

   /**
   * The URL of the payment's detail page in the merchant dashboard. The merchant must be signed in to the merchant dashboard to view this page.
   * @return paymentUrl
  **/
  @ApiModelProperty(value = "The URL of the payment's detail page in the merchant dashboard. The merchant must be signed in to the merchant dashboard to view this page.")
  public String getPaymentUrl() {
    return paymentUrl;
  }

  public void setPaymentUrl(String paymentUrl) {
    this.paymentUrl = paymentUrl;
  }

  public V1Payment receiptUrl(String receiptUrl) {
    this.receiptUrl = receiptUrl;
    return this;
  }

   /**
   * The URL of the receipt for the payment. Note that for split tender payments, this URL corresponds to the receipt for the first tender listed in the payment's tender field. Each Tender object has its own receipt_url field you can use to get the other receipts associated with a split tender payment.
   * @return receiptUrl
  **/
  @ApiModelProperty(value = "The URL of the receipt for the payment. Note that for split tender payments, this URL corresponds to the receipt for the first tender listed in the payment's tender field. Each Tender object has its own receipt_url field you can use to get the other receipts associated with a split tender payment.")
  public String getReceiptUrl() {
    return receiptUrl;
  }

  public void setReceiptUrl(String receiptUrl) {
    this.receiptUrl = receiptUrl;
  }

  public V1Payment inclusiveTaxMoney(V1Money inclusiveTaxMoney) {
    this.inclusiveTaxMoney = inclusiveTaxMoney;
    return this;
  }

   /**
   * The sum of all inclusive taxes associated with the payment.
   * @return inclusiveTaxMoney
  **/
  @ApiModelProperty(value = "The sum of all inclusive taxes associated with the payment.")
  public V1Money getInclusiveTaxMoney() {
    return inclusiveTaxMoney;
  }

  public void setInclusiveTaxMoney(V1Money inclusiveTaxMoney) {
    this.inclusiveTaxMoney = inclusiveTaxMoney;
  }

  public V1Payment additiveTaxMoney(V1Money additiveTaxMoney) {
    this.additiveTaxMoney = additiveTaxMoney;
    return this;
  }

   /**
   * The sum of all additive taxes associated with the payment.
   * @return additiveTaxMoney
  **/
  @ApiModelProperty(value = "The sum of all additive taxes associated with the payment.")
  public V1Money getAdditiveTaxMoney() {
    return additiveTaxMoney;
  }

  public void setAdditiveTaxMoney(V1Money additiveTaxMoney) {
    this.additiveTaxMoney = additiveTaxMoney;
  }

  public V1Payment taxMoney(V1Money taxMoney) {
    this.taxMoney = taxMoney;
    return this;
  }

   /**
   * The total of all taxes applied to the payment. This is always the sum of inclusive_tax_money and additive_tax_money.
   * @return taxMoney
  **/
  @ApiModelProperty(value = "The total of all taxes applied to the payment. This is always the sum of inclusive_tax_money and additive_tax_money.")
  public V1Money getTaxMoney() {
    return taxMoney;
  }

  public void setTaxMoney(V1Money taxMoney) {
    this.taxMoney = taxMoney;
  }

  public V1Payment tipMoney(V1Money tipMoney) {
    this.tipMoney = tipMoney;
    return this;
  }

   /**
   * The total of all tips applied to the payment.
   * @return tipMoney
  **/
  @ApiModelProperty(value = "The total of all tips applied to the payment.")
  public V1Money getTipMoney() {
    return tipMoney;
  }

  public void setTipMoney(V1Money tipMoney) {
    this.tipMoney = tipMoney;
  }

  public V1Payment discountMoney(V1Money discountMoney) {
    this.discountMoney = discountMoney;
    return this;
  }

   /**
   * The total of all discounts applied to the payment.
   * @return discountMoney
  **/
  @ApiModelProperty(value = "The total of all discounts applied to the payment.")
  public V1Money getDiscountMoney() {
    return discountMoney;
  }

  public void setDiscountMoney(V1Money discountMoney) {
    this.discountMoney = discountMoney;
  }

  public V1Payment totalCollectedMoney(V1Money totalCollectedMoney) {
    this.totalCollectedMoney = totalCollectedMoney;
    return this;
  }

   /**
   * The total of all discounts applied to the payment.
   * @return totalCollectedMoney
  **/
  @ApiModelProperty(value = "The total of all discounts applied to the payment.")
  public V1Money getTotalCollectedMoney() {
    return totalCollectedMoney;
  }

  public void setTotalCollectedMoney(V1Money totalCollectedMoney) {
    this.totalCollectedMoney = totalCollectedMoney;
  }

  public V1Payment processingFeeMoney(V1Money processingFeeMoney) {
    this.processingFeeMoney = processingFeeMoney;
    return this;
  }

   /**
   * The total of all processing fees collected by Square for the payment.
   * @return processingFeeMoney
  **/
  @ApiModelProperty(value = "The total of all processing fees collected by Square for the payment.")
  public V1Money getProcessingFeeMoney() {
    return processingFeeMoney;
  }

  public void setProcessingFeeMoney(V1Money processingFeeMoney) {
    this.processingFeeMoney = processingFeeMoney;
  }

  public V1Payment netTotalMoney(V1Money netTotalMoney) {
    this.netTotalMoney = netTotalMoney;
    return this;
  }

   /**
   * The amount to be deposited into the merchant's bank account for the payment.
   * @return netTotalMoney
  **/
  @ApiModelProperty(value = "The amount to be deposited into the merchant's bank account for the payment.")
  public V1Money getNetTotalMoney() {
    return netTotalMoney;
  }

  public void setNetTotalMoney(V1Money netTotalMoney) {
    this.netTotalMoney = netTotalMoney;
  }

  public V1Payment refundedMoney(V1Money refundedMoney) {
    this.refundedMoney = refundedMoney;
    return this;
  }

   /**
   * The total of all refunds applied to the payment.
   * @return refundedMoney
  **/
  @ApiModelProperty(value = "The total of all refunds applied to the payment.")
  public V1Money getRefundedMoney() {
    return refundedMoney;
  }

  public void setRefundedMoney(V1Money refundedMoney) {
    this.refundedMoney = refundedMoney;
  }

  public V1Payment swedishRoundingMoney(V1Money swedishRoundingMoney) {
    this.swedishRoundingMoney = swedishRoundingMoney;
    return this;
  }

   /**
   * Get swedishRoundingMoney
   * @return swedishRoundingMoney
  **/
  @ApiModelProperty(value = "")
  public V1Money getSwedishRoundingMoney() {
    return swedishRoundingMoney;
  }

  public void setSwedishRoundingMoney(V1Money swedishRoundingMoney) {
    this.swedishRoundingMoney = swedishRoundingMoney;
  }

  public V1Payment grossSalesMoney(V1Money grossSalesMoney) {
    this.grossSalesMoney = grossSalesMoney;
    return this;
  }

   /**
   * Get grossSalesMoney
   * @return grossSalesMoney
  **/
  @ApiModelProperty(value = "")
  public V1Money getGrossSalesMoney() {
    return grossSalesMoney;
  }

  public void setGrossSalesMoney(V1Money grossSalesMoney) {
    this.grossSalesMoney = grossSalesMoney;
  }

  public V1Payment netSalesMoney(V1Money netSalesMoney) {
    this.netSalesMoney = netSalesMoney;
    return this;
  }

   /**
   * Get netSalesMoney
   * @return netSalesMoney
  **/
  @ApiModelProperty(value = "")
  public V1Money getNetSalesMoney() {
    return netSalesMoney;
  }

  public void setNetSalesMoney(V1Money netSalesMoney) {
    this.netSalesMoney = netSalesMoney;
  }

  public V1Payment inclusiveTax(List<V1PaymentTax> inclusiveTax) {
    this.inclusiveTax = inclusiveTax;
    return this;
  }

  public V1Payment addInclusiveTaxItem(V1PaymentTax inclusiveTaxItem) {
    this.inclusiveTax.add(inclusiveTaxItem);
    return this;
  }

   /**
   * All of the inclusive taxes associated with the payment.
   * @return inclusiveTax
  **/
  @ApiModelProperty(value = "All of the inclusive taxes associated with the payment.")
  public List<V1PaymentTax> getInclusiveTax() {
    return inclusiveTax;
  }

  public void setInclusiveTax(List<V1PaymentTax> inclusiveTax) {
    this.inclusiveTax = inclusiveTax;
  }

  public V1Payment additiveTax(List<V1PaymentTax> additiveTax) {
    this.additiveTax = additiveTax;
    return this;
  }

  public V1Payment addAdditiveTaxItem(V1PaymentTax additiveTaxItem) {
    this.additiveTax.add(additiveTaxItem);
    return this;
  }

   /**
   * All of the additive taxes associated with the payment.
   * @return additiveTax
  **/
  @ApiModelProperty(value = "All of the additive taxes associated with the payment.")
  public List<V1PaymentTax> getAdditiveTax() {
    return additiveTax;
  }

  public void setAdditiveTax(List<V1PaymentTax> additiveTax) {
    this.additiveTax = additiveTax;
  }

  public V1Payment tender(List<V1Tender> tender) {
    this.tender = tender;
    return this;
  }

  public V1Payment addTenderItem(V1Tender tenderItem) {
    this.tender.add(tenderItem);
    return this;
  }

   /**
   * All of the additive taxes associated with the payment.
   * @return tender
  **/
  @ApiModelProperty(value = "All of the additive taxes associated with the payment.")
  public List<V1Tender> getTender() {
    return tender;
  }

  public void setTender(List<V1Tender> tender) {
    this.tender = tender;
  }

  public V1Payment refunds(List<V1Refund> refunds) {
    this.refunds = refunds;
    return this;
  }

  public V1Payment addRefundsItem(V1Refund refundsItem) {
    this.refunds.add(refundsItem);
    return this;
  }

   /**
   * All of the refunds applied to the payment.
   * @return refunds
  **/
  @ApiModelProperty(value = "All of the refunds applied to the payment.")
  public List<V1Refund> getRefunds() {
    return refunds;
  }

  public void setRefunds(List<V1Refund> refunds) {
    this.refunds = refunds;
  }

  public V1Payment itemizations(List<V1PaymentItemization> itemizations) {
    this.itemizations = itemizations;
    return this;
  }

  public V1Payment addItemizationsItem(V1PaymentItemization itemizationsItem) {
    this.itemizations.add(itemizationsItem);
    return this;
  }

   /**
   * The items purchased in the payment.
   * @return itemizations
  **/
  @ApiModelProperty(value = "The items purchased in the payment.")
  public List<V1PaymentItemization> getItemizations() {
    return itemizations;
  }

  public void setItemizations(List<V1PaymentItemization> itemizations) {
    this.itemizations = itemizations;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1Payment v1Payment = (V1Payment) o;
    return Objects.equals(this.id, v1Payment.id) &&
        Objects.equals(this.merchantId, v1Payment.merchantId) &&
        Objects.equals(this.createdAt, v1Payment.createdAt) &&
        Objects.equals(this.creatorId, v1Payment.creatorId) &&
        Objects.equals(this.device, v1Payment.device) &&
        Objects.equals(this.paymentUrl, v1Payment.paymentUrl) &&
        Objects.equals(this.receiptUrl, v1Payment.receiptUrl) &&
        Objects.equals(this.inclusiveTaxMoney, v1Payment.inclusiveTaxMoney) &&
        Objects.equals(this.additiveTaxMoney, v1Payment.additiveTaxMoney) &&
        Objects.equals(this.taxMoney, v1Payment.taxMoney) &&
        Objects.equals(this.tipMoney, v1Payment.tipMoney) &&
        Objects.equals(this.discountMoney, v1Payment.discountMoney) &&
        Objects.equals(this.totalCollectedMoney, v1Payment.totalCollectedMoney) &&
        Objects.equals(this.processingFeeMoney, v1Payment.processingFeeMoney) &&
        Objects.equals(this.netTotalMoney, v1Payment.netTotalMoney) &&
        Objects.equals(this.refundedMoney, v1Payment.refundedMoney) &&
        Objects.equals(this.swedishRoundingMoney, v1Payment.swedishRoundingMoney) &&
        Objects.equals(this.grossSalesMoney, v1Payment.grossSalesMoney) &&
        Objects.equals(this.netSalesMoney, v1Payment.netSalesMoney) &&
        Objects.equals(this.inclusiveTax, v1Payment.inclusiveTax) &&
        Objects.equals(this.additiveTax, v1Payment.additiveTax) &&
        Objects.equals(this.tender, v1Payment.tender) &&
        Objects.equals(this.refunds, v1Payment.refunds) &&
        Objects.equals(this.itemizations, v1Payment.itemizations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, merchantId, createdAt, creatorId, device, paymentUrl, receiptUrl, inclusiveTaxMoney, additiveTaxMoney, taxMoney, tipMoney, discountMoney, totalCollectedMoney, processingFeeMoney, netTotalMoney, refundedMoney, swedishRoundingMoney, grossSalesMoney, netSalesMoney, inclusiveTax, additiveTax, tender, refunds, itemizations);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1Payment {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    merchantId: ").append(toIndentedString(merchantId)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    creatorId: ").append(toIndentedString(creatorId)).append("\n");
    sb.append("    device: ").append(toIndentedString(device)).append("\n");
    sb.append("    paymentUrl: ").append(toIndentedString(paymentUrl)).append("\n");
    sb.append("    receiptUrl: ").append(toIndentedString(receiptUrl)).append("\n");
    sb.append("    inclusiveTaxMoney: ").append(toIndentedString(inclusiveTaxMoney)).append("\n");
    sb.append("    additiveTaxMoney: ").append(toIndentedString(additiveTaxMoney)).append("\n");
    sb.append("    taxMoney: ").append(toIndentedString(taxMoney)).append("\n");
    sb.append("    tipMoney: ").append(toIndentedString(tipMoney)).append("\n");
    sb.append("    discountMoney: ").append(toIndentedString(discountMoney)).append("\n");
    sb.append("    totalCollectedMoney: ").append(toIndentedString(totalCollectedMoney)).append("\n");
    sb.append("    processingFeeMoney: ").append(toIndentedString(processingFeeMoney)).append("\n");
    sb.append("    netTotalMoney: ").append(toIndentedString(netTotalMoney)).append("\n");
    sb.append("    refundedMoney: ").append(toIndentedString(refundedMoney)).append("\n");
    sb.append("    swedishRoundingMoney: ").append(toIndentedString(swedishRoundingMoney)).append("\n");
    sb.append("    grossSalesMoney: ").append(toIndentedString(grossSalesMoney)).append("\n");
    sb.append("    netSalesMoney: ").append(toIndentedString(netSalesMoney)).append("\n");
    sb.append("    inclusiveTax: ").append(toIndentedString(inclusiveTax)).append("\n");
    sb.append("    additiveTax: ").append(toIndentedString(additiveTax)).append("\n");
    sb.append("    tender: ").append(toIndentedString(tender)).append("\n");
    sb.append("    refunds: ").append(toIndentedString(refunds)).append("\n");
    sb.append("    itemizations: ").append(toIndentedString(itemizations)).append("\n");
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

