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
import com.squareup.connect.models.Address;
import com.squareup.connect.models.Order;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Square Checkout lets merchants accept online payments for supported payment types using a checkout workflow hosted on squareup.com.
 */
@ApiModel(description = "Square Checkout lets merchants accept online payments for supported payment types using a checkout workflow hosted on squareup.com.")

public class Checkout {
  @SerializedName("id")
  private String id = null;

  @SerializedName("checkout_page_url")
  private String checkoutPageUrl = null;

  @SerializedName("ask_for_shipping_address")
  private Boolean askForShippingAddress = null;

  @SerializedName("merchant_support_email")
  private String merchantSupportEmail = null;

  @SerializedName("pre_populate_buyer_email")
  private String prePopulateBuyerEmail = null;

  @SerializedName("pre_populate_shipping_address")
  private Address prePopulateShippingAddress = null;

  @SerializedName("redirect_url")
  private String redirectUrl = null;

  @SerializedName("order")
  private Order order = null;

  @SerializedName("created_at")
  private String createdAt = null;

  public Checkout id(String id) {
    this.id = id;
    return this;
  }

   /**
   * ID generated by Square Checkout when a new checkout is requested.
   * @return id
  **/
  @ApiModelProperty(value = "ID generated by Square Checkout when a new checkout is requested.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Checkout checkoutPageUrl(String checkoutPageUrl) {
    this.checkoutPageUrl = checkoutPageUrl;
    return this;
  }

   /**
   * The URL that the buyer's browser should be redirected to after the checkout is completed.
   * @return checkoutPageUrl
  **/
  @ApiModelProperty(value = "The URL that the buyer's browser should be redirected to after the checkout is completed.")
  public String getCheckoutPageUrl() {
    return checkoutPageUrl;
  }

  public void setCheckoutPageUrl(String checkoutPageUrl) {
    this.checkoutPageUrl = checkoutPageUrl;
  }

  public Checkout askForShippingAddress(Boolean askForShippingAddress) {
    this.askForShippingAddress = askForShippingAddress;
    return this;
  }

   /**
   * If `true`, Square Checkout will collect shipping information on your behalf and store that information with the transaction information in your Square Dashboard.  Default: `false`.
   * @return askForShippingAddress
  **/
  @ApiModelProperty(value = "If `true`, Square Checkout will collect shipping information on your behalf and store that information with the transaction information in your Square Dashboard.  Default: `false`.")
  public Boolean getAskForShippingAddress() {
    return askForShippingAddress;
  }

  public void setAskForShippingAddress(Boolean askForShippingAddress) {
    this.askForShippingAddress = askForShippingAddress;
  }

  public Checkout merchantSupportEmail(String merchantSupportEmail) {
    this.merchantSupportEmail = merchantSupportEmail;
    return this;
  }

   /**
   * The email address to display on the Square Checkout confirmation page and confirmation email that the buyer can use to contact the merchant.  If this value is not set, the confirmation page and email will display the primary email address associated with the merchant's Square account.  Default: none; only exists if explicitly set.
   * @return merchantSupportEmail
  **/
  @ApiModelProperty(value = "The email address to display on the Square Checkout confirmation page and confirmation email that the buyer can use to contact the merchant.  If this value is not set, the confirmation page and email will display the primary email address associated with the merchant's Square account.  Default: none; only exists if explicitly set.")
  public String getMerchantSupportEmail() {
    return merchantSupportEmail;
  }

  public void setMerchantSupportEmail(String merchantSupportEmail) {
    this.merchantSupportEmail = merchantSupportEmail;
  }

  public Checkout prePopulateBuyerEmail(String prePopulateBuyerEmail) {
    this.prePopulateBuyerEmail = prePopulateBuyerEmail;
    return this;
  }

   /**
   * If provided, the buyer's email is pre-populated on the checkout page as an editable text field.  Default: none; only exists if explicitly set.
   * @return prePopulateBuyerEmail
  **/
  @ApiModelProperty(value = "If provided, the buyer's email is pre-populated on the checkout page as an editable text field.  Default: none; only exists if explicitly set.")
  public String getPrePopulateBuyerEmail() {
    return prePopulateBuyerEmail;
  }

  public void setPrePopulateBuyerEmail(String prePopulateBuyerEmail) {
    this.prePopulateBuyerEmail = prePopulateBuyerEmail;
  }

  public Checkout prePopulateShippingAddress(Address prePopulateShippingAddress) {
    this.prePopulateShippingAddress = prePopulateShippingAddress;
    return this;
  }

   /**
   * If provided, the buyer's shipping info is pre-populated on the checkout page as editable text fields.  Default: none; only exists if explicitly set.
   * @return prePopulateShippingAddress
  **/
  @ApiModelProperty(value = "If provided, the buyer's shipping info is pre-populated on the checkout page as editable text fields.  Default: none; only exists if explicitly set.")
  public Address getPrePopulateShippingAddress() {
    return prePopulateShippingAddress;
  }

  public void setPrePopulateShippingAddress(Address prePopulateShippingAddress) {
    this.prePopulateShippingAddress = prePopulateShippingAddress;
  }

  public Checkout redirectUrl(String redirectUrl) {
    this.redirectUrl = redirectUrl;
    return this;
  }

   /**
   * The URL to redirect to after checkout is completed with `checkoutId`, Square's `orderId`, `transactionId`, and `referenceId` appended as URL parameters. For example, if the provided redirect_url is `http://www.example.com/order-complete`, a successful transaction redirects the customer to:  `http://www.example.com/order-complete?checkoutId=xxxxxx&orderId=xxxxxx&referenceId=xxxxxx&transactionId=xxxxxx`  If you do not provide a redirect URL, Square Checkout will display an order confirmation page on your behalf; however Square strongly recommends that you provide a redirect URL so you can verify the transaction results and finalize the order through your existing/normal confirmation workflow.
   * @return redirectUrl
  **/
  @ApiModelProperty(value = "The URL to redirect to after checkout is completed with `checkoutId`, Square's `orderId`, `transactionId`, and `referenceId` appended as URL parameters. For example, if the provided redirect_url is `http://www.example.com/order-complete`, a successful transaction redirects the customer to:  `http://www.example.com/order-complete?checkoutId=xxxxxx&orderId=xxxxxx&referenceId=xxxxxx&transactionId=xxxxxx`  If you do not provide a redirect URL, Square Checkout will display an order confirmation page on your behalf; however Square strongly recommends that you provide a redirect URL so you can verify the transaction results and finalize the order through your existing/normal confirmation workflow.")
  public String getRedirectUrl() {
    return redirectUrl;
  }

  public void setRedirectUrl(String redirectUrl) {
    this.redirectUrl = redirectUrl;
  }

  public Checkout order(Order order) {
    this.order = order;
    return this;
  }

   /**
   * Order to be checked out.
   * @return order
  **/
  @ApiModelProperty(value = "Order to be checked out.")
  public Order getOrder() {
    return order;
  }

  public void setOrder(Order order) {
    this.order = order;
  }

  public Checkout createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * The time when the checkout was created, in RFC 3339 format.
   * @return createdAt
  **/
  @ApiModelProperty(value = "The time when the checkout was created, in RFC 3339 format.")
  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Checkout checkout = (Checkout) o;
    return Objects.equals(this.id, checkout.id) &&
        Objects.equals(this.checkoutPageUrl, checkout.checkoutPageUrl) &&
        Objects.equals(this.askForShippingAddress, checkout.askForShippingAddress) &&
        Objects.equals(this.merchantSupportEmail, checkout.merchantSupportEmail) &&
        Objects.equals(this.prePopulateBuyerEmail, checkout.prePopulateBuyerEmail) &&
        Objects.equals(this.prePopulateShippingAddress, checkout.prePopulateShippingAddress) &&
        Objects.equals(this.redirectUrl, checkout.redirectUrl) &&
        Objects.equals(this.order, checkout.order) &&
        Objects.equals(this.createdAt, checkout.createdAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, checkoutPageUrl, askForShippingAddress, merchantSupportEmail, prePopulateBuyerEmail, prePopulateShippingAddress, redirectUrl, order, createdAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Checkout {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    checkoutPageUrl: ").append(toIndentedString(checkoutPageUrl)).append("\n");
    sb.append("    askForShippingAddress: ").append(toIndentedString(askForShippingAddress)).append("\n");
    sb.append("    merchantSupportEmail: ").append(toIndentedString(merchantSupportEmail)).append("\n");
    sb.append("    prePopulateBuyerEmail: ").append(toIndentedString(prePopulateBuyerEmail)).append("\n");
    sb.append("    prePopulateShippingAddress: ").append(toIndentedString(prePopulateShippingAddress)).append("\n");
    sb.append("    redirectUrl: ").append(toIndentedString(redirectUrl)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
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

