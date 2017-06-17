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
 * Represents an amount of money.  __Important:__ Unlike version 1 of the Connect API, __all monetary amounts returned by v2 endpoints are positive.__ (In v1, monetary amounts are negative if they represent money being paid _by_ a merchant, instead of money being paid _to_ a merchant.)
 */
@ApiModel(description = "Represents an amount of money.  __Important:__ Unlike version 1 of the Connect API, __all monetary amounts returned by v2 endpoints are positive.__ (In v1, monetary amounts are negative if they represent money being paid _by_ a merchant, instead of money being paid _to_ a merchant.)")

public class Money {
  @SerializedName("amount")
  private Long amount = null;

  /**
   * The type of currency, in __ISO 4217 format__. For example, the currency code for US dollars is `USD`.  See [Currency](#type-currency) for possible values.
   */
  public enum CurrencyEnum {
    @SerializedName("AED")
    AED("AED"),
    
    @SerializedName("AFN")
    AFN("AFN"),
    
    @SerializedName("ALL")
    ALL("ALL"),
    
    @SerializedName("AMD")
    AMD("AMD"),
    
    @SerializedName("ANG")
    ANG("ANG"),
    
    @SerializedName("AOA")
    AOA("AOA"),
    
    @SerializedName("ARS")
    ARS("ARS"),
    
    @SerializedName("AUD")
    AUD("AUD"),
    
    @SerializedName("AWG")
    AWG("AWG"),
    
    @SerializedName("AZN")
    AZN("AZN"),
    
    @SerializedName("BAM")
    BAM("BAM"),
    
    @SerializedName("BBD")
    BBD("BBD"),
    
    @SerializedName("BDT")
    BDT("BDT"),
    
    @SerializedName("BGN")
    BGN("BGN"),
    
    @SerializedName("BHD")
    BHD("BHD"),
    
    @SerializedName("BIF")
    BIF("BIF"),
    
    @SerializedName("BMD")
    BMD("BMD"),
    
    @SerializedName("BND")
    BND("BND"),
    
    @SerializedName("BOB")
    BOB("BOB"),
    
    @SerializedName("BOV")
    BOV("BOV"),
    
    @SerializedName("BRL")
    BRL("BRL"),
    
    @SerializedName("BSD")
    BSD("BSD"),
    
    @SerializedName("BTN")
    BTN("BTN"),
    
    @SerializedName("BWP")
    BWP("BWP"),
    
    @SerializedName("BYR")
    BYR("BYR"),
    
    @SerializedName("BZD")
    BZD("BZD"),
    
    @SerializedName("CAD")
    CAD("CAD"),
    
    @SerializedName("CDF")
    CDF("CDF"),
    
    @SerializedName("CHE")
    CHE("CHE"),
    
    @SerializedName("CHF")
    CHF("CHF"),
    
    @SerializedName("CHW")
    CHW("CHW"),
    
    @SerializedName("CLF")
    CLF("CLF"),
    
    @SerializedName("CLP")
    CLP("CLP"),
    
    @SerializedName("CNY")
    CNY("CNY"),
    
    @SerializedName("COP")
    COP("COP"),
    
    @SerializedName("COU")
    COU("COU"),
    
    @SerializedName("CRC")
    CRC("CRC"),
    
    @SerializedName("CUC")
    CUC("CUC"),
    
    @SerializedName("CUP")
    CUP("CUP"),
    
    @SerializedName("CVE")
    CVE("CVE"),
    
    @SerializedName("CZK")
    CZK("CZK"),
    
    @SerializedName("DJF")
    DJF("DJF"),
    
    @SerializedName("DKK")
    DKK("DKK"),
    
    @SerializedName("DOP")
    DOP("DOP"),
    
    @SerializedName("DZD")
    DZD("DZD"),
    
    @SerializedName("EGP")
    EGP("EGP"),
    
    @SerializedName("ERN")
    ERN("ERN"),
    
    @SerializedName("ETB")
    ETB("ETB"),
    
    @SerializedName("EUR")
    EUR("EUR"),
    
    @SerializedName("FJD")
    FJD("FJD"),
    
    @SerializedName("FKP")
    FKP("FKP"),
    
    @SerializedName("GBP")
    GBP("GBP"),
    
    @SerializedName("GEL")
    GEL("GEL"),
    
    @SerializedName("GHS")
    GHS("GHS"),
    
    @SerializedName("GIP")
    GIP("GIP"),
    
    @SerializedName("GMD")
    GMD("GMD"),
    
    @SerializedName("GNF")
    GNF("GNF"),
    
    @SerializedName("GTQ")
    GTQ("GTQ"),
    
    @SerializedName("GYD")
    GYD("GYD"),
    
    @SerializedName("HKD")
    HKD("HKD"),
    
    @SerializedName("HNL")
    HNL("HNL"),
    
    @SerializedName("HRK")
    HRK("HRK"),
    
    @SerializedName("HTG")
    HTG("HTG"),
    
    @SerializedName("HUF")
    HUF("HUF"),
    
    @SerializedName("IDR")
    IDR("IDR"),
    
    @SerializedName("ILS")
    ILS("ILS"),
    
    @SerializedName("INR")
    INR("INR"),
    
    @SerializedName("IQD")
    IQD("IQD"),
    
    @SerializedName("IRR")
    IRR("IRR"),
    
    @SerializedName("ISK")
    ISK("ISK"),
    
    @SerializedName("JMD")
    JMD("JMD"),
    
    @SerializedName("JOD")
    JOD("JOD"),
    
    @SerializedName("JPY")
    JPY("JPY"),
    
    @SerializedName("KES")
    KES("KES"),
    
    @SerializedName("KGS")
    KGS("KGS"),
    
    @SerializedName("KHR")
    KHR("KHR"),
    
    @SerializedName("KMF")
    KMF("KMF"),
    
    @SerializedName("KPW")
    KPW("KPW"),
    
    @SerializedName("KRW")
    KRW("KRW"),
    
    @SerializedName("KWD")
    KWD("KWD"),
    
    @SerializedName("KYD")
    KYD("KYD"),
    
    @SerializedName("KZT")
    KZT("KZT"),
    
    @SerializedName("LAK")
    LAK("LAK"),
    
    @SerializedName("LBP")
    LBP("LBP"),
    
    @SerializedName("LKR")
    LKR("LKR"),
    
    @SerializedName("LRD")
    LRD("LRD"),
    
    @SerializedName("LSL")
    LSL("LSL"),
    
    @SerializedName("LTL")
    LTL("LTL"),
    
    @SerializedName("LVL")
    LVL("LVL"),
    
    @SerializedName("LYD")
    LYD("LYD"),
    
    @SerializedName("MAD")
    MAD("MAD"),
    
    @SerializedName("MDL")
    MDL("MDL"),
    
    @SerializedName("MGA")
    MGA("MGA"),
    
    @SerializedName("MKD")
    MKD("MKD"),
    
    @SerializedName("MMK")
    MMK("MMK"),
    
    @SerializedName("MNT")
    MNT("MNT"),
    
    @SerializedName("MOP")
    MOP("MOP"),
    
    @SerializedName("MRO")
    MRO("MRO"),
    
    @SerializedName("MUR")
    MUR("MUR"),
    
    @SerializedName("MVR")
    MVR("MVR"),
    
    @SerializedName("MWK")
    MWK("MWK"),
    
    @SerializedName("MXN")
    MXN("MXN"),
    
    @SerializedName("MXV")
    MXV("MXV"),
    
    @SerializedName("MYR")
    MYR("MYR"),
    
    @SerializedName("MZN")
    MZN("MZN"),
    
    @SerializedName("NAD")
    NAD("NAD"),
    
    @SerializedName("NGN")
    NGN("NGN"),
    
    @SerializedName("NIO")
    NIO("NIO"),
    
    @SerializedName("NOK")
    NOK("NOK"),
    
    @SerializedName("NPR")
    NPR("NPR"),
    
    @SerializedName("NZD")
    NZD("NZD"),
    
    @SerializedName("OMR")
    OMR("OMR"),
    
    @SerializedName("PAB")
    PAB("PAB"),
    
    @SerializedName("PEN")
    PEN("PEN"),
    
    @SerializedName("PGK")
    PGK("PGK"),
    
    @SerializedName("PHP")
    PHP("PHP"),
    
    @SerializedName("PKR")
    PKR("PKR"),
    
    @SerializedName("PLN")
    PLN("PLN"),
    
    @SerializedName("PYG")
    PYG("PYG"),
    
    @SerializedName("QAR")
    QAR("QAR"),
    
    @SerializedName("RON")
    RON("RON"),
    
    @SerializedName("RSD")
    RSD("RSD"),
    
    @SerializedName("RUB")
    RUB("RUB"),
    
    @SerializedName("RWF")
    RWF("RWF"),
    
    @SerializedName("SAR")
    SAR("SAR"),
    
    @SerializedName("SBD")
    SBD("SBD"),
    
    @SerializedName("SCR")
    SCR("SCR"),
    
    @SerializedName("SDG")
    SDG("SDG"),
    
    @SerializedName("SEK")
    SEK("SEK"),
    
    @SerializedName("SGD")
    SGD("SGD"),
    
    @SerializedName("SHP")
    SHP("SHP"),
    
    @SerializedName("SLL")
    SLL("SLL"),
    
    @SerializedName("SOS")
    SOS("SOS"),
    
    @SerializedName("SRD")
    SRD("SRD"),
    
    @SerializedName("SSP")
    SSP("SSP"),
    
    @SerializedName("STD")
    STD("STD"),
    
    @SerializedName("SVC")
    SVC("SVC"),
    
    @SerializedName("SYP")
    SYP("SYP"),
    
    @SerializedName("SZL")
    SZL("SZL"),
    
    @SerializedName("THB")
    THB("THB"),
    
    @SerializedName("TJS")
    TJS("TJS"),
    
    @SerializedName("TMT")
    TMT("TMT"),
    
    @SerializedName("TND")
    TND("TND"),
    
    @SerializedName("TOP")
    TOP("TOP"),
    
    @SerializedName("TRY")
    TRY("TRY"),
    
    @SerializedName("TTD")
    TTD("TTD"),
    
    @SerializedName("TWD")
    TWD("TWD"),
    
    @SerializedName("TZS")
    TZS("TZS"),
    
    @SerializedName("UAH")
    UAH("UAH"),
    
    @SerializedName("UGX")
    UGX("UGX"),
    
    @SerializedName("USD")
    USD("USD"),
    
    @SerializedName("USN")
    USN("USN"),
    
    @SerializedName("USS")
    USS("USS"),
    
    @SerializedName("UYI")
    UYI("UYI"),
    
    @SerializedName("UYU")
    UYU("UYU"),
    
    @SerializedName("UZS")
    UZS("UZS"),
    
    @SerializedName("VEF")
    VEF("VEF"),
    
    @SerializedName("VND")
    VND("VND"),
    
    @SerializedName("VUV")
    VUV("VUV"),
    
    @SerializedName("WST")
    WST("WST"),
    
    @SerializedName("XAF")
    XAF("XAF"),
    
    @SerializedName("XAG")
    XAG("XAG"),
    
    @SerializedName("XAU")
    XAU("XAU"),
    
    @SerializedName("XBA")
    XBA("XBA"),
    
    @SerializedName("XBB")
    XBB("XBB"),
    
    @SerializedName("XBC")
    XBC("XBC"),
    
    @SerializedName("XBD")
    XBD("XBD"),
    
    @SerializedName("XCD")
    XCD("XCD"),
    
    @SerializedName("XDR")
    XDR("XDR"),
    
    @SerializedName("XOF")
    XOF("XOF"),
    
    @SerializedName("XPD")
    XPD("XPD"),
    
    @SerializedName("XPF")
    XPF("XPF"),
    
    @SerializedName("XPT")
    XPT("XPT"),
    
    @SerializedName("XTS")
    XTS("XTS"),
    
    @SerializedName("XXX")
    XXX("XXX"),
    
    @SerializedName("YER")
    YER("YER"),
    
    @SerializedName("ZAR")
    ZAR("ZAR"),
    
    @SerializedName("ZMK")
    ZMK("ZMK"),
    
    @SerializedName("ZMW")
    ZMW("ZMW"),
    
    @SerializedName("BTC")
    BTC("BTC");

    private String value;

    CurrencyEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("currency")
  private CurrencyEnum currency = null;

  public Money amount(Long amount) {
    this.amount = amount;
    return this;
  }

   /**
   * The amount of money, in the smallest denomination of the currency indicated by `currency`. For example, when `currency` is `USD`, `amount` is in cents.
   * @return amount
  **/
  @ApiModelProperty(value = "The amount of money, in the smallest denomination of the currency indicated by `currency`. For example, when `currency` is `USD`, `amount` is in cents.")
  public Long getAmount() {
    return amount;
  }

  public void setAmount(Long amount) {
    this.amount = amount;
  }

  public Money currency(CurrencyEnum currency) {
    this.currency = currency;
    return this;
  }

   /**
   * The type of currency, in __ISO 4217 format__. For example, the currency code for US dollars is `USD`.  See [Currency](#type-currency) for possible values.
   * @return currency
  **/
  @ApiModelProperty(value = "The type of currency, in __ISO 4217 format__. For example, the currency code for US dollars is `USD`.  See [Currency](#type-currency) for possible values.")
  public CurrencyEnum getCurrency() {
    return currency;
  }

  public void setCurrency(CurrencyEnum currency) {
    this.currency = currency;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Money money = (Money) o;
    return Objects.equals(this.amount, money.amount) &&
        Objects.equals(this.currency, money.currency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, currency);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Money {\n");
    
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
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

