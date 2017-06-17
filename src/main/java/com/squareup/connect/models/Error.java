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
 * Represents an error encountered during a request to the Connect API.  See [Handling errors](#handlingerrors) for more information.
 */
@ApiModel(description = "Represents an error encountered during a request to the Connect API.  See [Handling errors](#handlingerrors) for more information.")

public class Error {
  /**
   * The error's high-level category. See [ErrorCategory](#type-errorcategory) for possible values.
   */
  public enum CategoryEnum {
    @SerializedName("API_ERROR")
    API_ERROR("API_ERROR"),
    
    @SerializedName("AUTHENTICATION_ERROR")
    AUTHENTICATION_ERROR("AUTHENTICATION_ERROR"),
    
    @SerializedName("INVALID_REQUEST_ERROR")
    INVALID_REQUEST_ERROR("INVALID_REQUEST_ERROR"),
    
    @SerializedName("RATE_LIMIT_ERROR")
    RATE_LIMIT_ERROR("RATE_LIMIT_ERROR"),
    
    @SerializedName("PAYMENT_METHOD_ERROR")
    PAYMENT_METHOD_ERROR("PAYMENT_METHOD_ERROR"),
    
    @SerializedName("REFUND_ERROR")
    REFUND_ERROR("REFUND_ERROR");

    private String value;

    CategoryEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("category")
  private CategoryEnum category = null;

  /**
   * The error's specific code. See [ErrorCode](#type-errorcode) for possible values
   */
  public enum CodeEnum {
    @SerializedName("INTERNAL_SERVER_ERROR")
    INTERNAL_SERVER_ERROR("INTERNAL_SERVER_ERROR"),
    
    @SerializedName("UNAUTHORIZED")
    UNAUTHORIZED("UNAUTHORIZED"),
    
    @SerializedName("ACCESS_TOKEN_EXPIRED")
    ACCESS_TOKEN_EXPIRED("ACCESS_TOKEN_EXPIRED"),
    
    @SerializedName("ACCESS_TOKEN_REVOKED")
    ACCESS_TOKEN_REVOKED("ACCESS_TOKEN_REVOKED"),
    
    @SerializedName("FORBIDDEN")
    FORBIDDEN("FORBIDDEN"),
    
    @SerializedName("INSUFFICIENT_SCOPES")
    INSUFFICIENT_SCOPES("INSUFFICIENT_SCOPES"),
    
    @SerializedName("APPLICATION_DISABLED")
    APPLICATION_DISABLED("APPLICATION_DISABLED"),
    
    @SerializedName("V1_APPLICATION")
    V1_APPLICATION("V1_APPLICATION"),
    
    @SerializedName("V1_ACCESS_TOKEN")
    V1_ACCESS_TOKEN("V1_ACCESS_TOKEN"),
    
    @SerializedName("CARD_PROCESSING_NOT_ENABLED")
    CARD_PROCESSING_NOT_ENABLED("CARD_PROCESSING_NOT_ENABLED"),
    
    @SerializedName("BAD_REQUEST")
    BAD_REQUEST("BAD_REQUEST"),
    
    @SerializedName("MISSING_REQUIRED_PARAMETER")
    MISSING_REQUIRED_PARAMETER("MISSING_REQUIRED_PARAMETER"),
    
    @SerializedName("INCORRECT_TYPE")
    INCORRECT_TYPE("INCORRECT_TYPE"),
    
    @SerializedName("INVALID_TIME")
    INVALID_TIME("INVALID_TIME"),
    
    @SerializedName("INVALID_TIME_RANGE")
    INVALID_TIME_RANGE("INVALID_TIME_RANGE"),
    
    @SerializedName("INVALID_VALUE")
    INVALID_VALUE("INVALID_VALUE"),
    
    @SerializedName("INVALID_CURSOR")
    INVALID_CURSOR("INVALID_CURSOR"),
    
    @SerializedName("UNKNOWN_QUERY_PARAMETER")
    UNKNOWN_QUERY_PARAMETER("UNKNOWN_QUERY_PARAMETER"),
    
    @SerializedName("CONFLICTING_PARAMETERS")
    CONFLICTING_PARAMETERS("CONFLICTING_PARAMETERS"),
    
    @SerializedName("EXPECTED_JSON_BODY")
    EXPECTED_JSON_BODY("EXPECTED_JSON_BODY"),
    
    @SerializedName("INVALID_SORT_ORDER")
    INVALID_SORT_ORDER("INVALID_SORT_ORDER"),
    
    @SerializedName("VALUE_REGEX_MISMATCH")
    VALUE_REGEX_MISMATCH("VALUE_REGEX_MISMATCH"),
    
    @SerializedName("VALUE_TOO_SHORT")
    VALUE_TOO_SHORT("VALUE_TOO_SHORT"),
    
    @SerializedName("VALUE_TOO_LONG")
    VALUE_TOO_LONG("VALUE_TOO_LONG"),
    
    @SerializedName("VALUE_TOO_LOW")
    VALUE_TOO_LOW("VALUE_TOO_LOW"),
    
    @SerializedName("VALUE_TOO_HIGH")
    VALUE_TOO_HIGH("VALUE_TOO_HIGH"),
    
    @SerializedName("VALUE_EMPTY")
    VALUE_EMPTY("VALUE_EMPTY"),
    
    @SerializedName("ARRAY_EMPTY")
    ARRAY_EMPTY("ARRAY_EMPTY"),
    
    @SerializedName("EXPECTED_BOOLEAN")
    EXPECTED_BOOLEAN("EXPECTED_BOOLEAN"),
    
    @SerializedName("EXPECTED_INTEGER")
    EXPECTED_INTEGER("EXPECTED_INTEGER"),
    
    @SerializedName("EXPECTED_FLOAT")
    EXPECTED_FLOAT("EXPECTED_FLOAT"),
    
    @SerializedName("EXPECTED_STRING")
    EXPECTED_STRING("EXPECTED_STRING"),
    
    @SerializedName("EXPECTED_OBJECT")
    EXPECTED_OBJECT("EXPECTED_OBJECT"),
    
    @SerializedName("EXPECTED_ARRAY")
    EXPECTED_ARRAY("EXPECTED_ARRAY"),
    
    @SerializedName("EXPECTED_BASE64_ENCODED_BYTE_ARRAY")
    EXPECTED_BASE64_ENCODED_BYTE_ARRAY("EXPECTED_BASE64_ENCODED_BYTE_ARRAY"),
    
    @SerializedName("INVALID_ARRAY_VALUE")
    INVALID_ARRAY_VALUE("INVALID_ARRAY_VALUE"),
    
    @SerializedName("INVALID_ENUM_VALUE")
    INVALID_ENUM_VALUE("INVALID_ENUM_VALUE"),
    
    @SerializedName("INVALID_CONTENT_TYPE")
    INVALID_CONTENT_TYPE("INVALID_CONTENT_TYPE"),
    
    @SerializedName("INVALID_FORM_VALUE")
    INVALID_FORM_VALUE("INVALID_FORM_VALUE"),
    
    @SerializedName("ONE_INSTRUMENT_EXPECTED")
    ONE_INSTRUMENT_EXPECTED("ONE_INSTRUMENT_EXPECTED"),
    
    @SerializedName("NO_FIELDS_SET")
    NO_FIELDS_SET("NO_FIELDS_SET"),
    
    @SerializedName("CARD_EXPIRED")
    CARD_EXPIRED("CARD_EXPIRED"),
    
    @SerializedName("INVALID_EXPIRATION")
    INVALID_EXPIRATION("INVALID_EXPIRATION"),
    
    @SerializedName("INVALID_EXPIRATION_YEAR")
    INVALID_EXPIRATION_YEAR("INVALID_EXPIRATION_YEAR"),
    
    @SerializedName("INVALID_EXPIRATION_DATE")
    INVALID_EXPIRATION_DATE("INVALID_EXPIRATION_DATE"),
    
    @SerializedName("UNSUPPORTED_CARD_BRAND")
    UNSUPPORTED_CARD_BRAND("UNSUPPORTED_CARD_BRAND"),
    
    @SerializedName("INVALID_CARD")
    INVALID_CARD("INVALID_CARD"),
    
    @SerializedName("DELAYED_TRANSACTION_EXPIRED")
    DELAYED_TRANSACTION_EXPIRED("DELAYED_TRANSACTION_EXPIRED"),
    
    @SerializedName("DELAYED_TRANSACTION_CANCELED")
    DELAYED_TRANSACTION_CANCELED("DELAYED_TRANSACTION_CANCELED"),
    
    @SerializedName("DELAYED_TRANSACTION_CAPTURED")
    DELAYED_TRANSACTION_CAPTURED("DELAYED_TRANSACTION_CAPTURED"),
    
    @SerializedName("DELAYED_TRANSACTION_FAILED")
    DELAYED_TRANSACTION_FAILED("DELAYED_TRANSACTION_FAILED"),
    
    @SerializedName("CARD_TOKEN_EXPIRED")
    CARD_TOKEN_EXPIRED("CARD_TOKEN_EXPIRED"),
    
    @SerializedName("CARD_TOKEN_USED")
    CARD_TOKEN_USED("CARD_TOKEN_USED"),
    
    @SerializedName("AMOUNT_TOO_HIGH")
    AMOUNT_TOO_HIGH("AMOUNT_TOO_HIGH"),
    
    @SerializedName("UNSUPPORTED_INSTRUMENT_TYPE")
    UNSUPPORTED_INSTRUMENT_TYPE("UNSUPPORTED_INSTRUMENT_TYPE"),
    
    @SerializedName("REFUND_AMOUNT_INVALID")
    REFUND_AMOUNT_INVALID("REFUND_AMOUNT_INVALID"),
    
    @SerializedName("REFUND_ALREADY_PENDING")
    REFUND_ALREADY_PENDING("REFUND_ALREADY_PENDING"),
    
    @SerializedName("PAYMENT_NOT_REFUNDABLE")
    PAYMENT_NOT_REFUNDABLE("PAYMENT_NOT_REFUNDABLE"),
    
    @SerializedName("INVALID_CARD_DATA")
    INVALID_CARD_DATA("INVALID_CARD_DATA"),
    
    @SerializedName("IDEMPOTENCY_KEY_REUSED")
    IDEMPOTENCY_KEY_REUSED("IDEMPOTENCY_KEY_REUSED"),
    
    @SerializedName("UNEXPECTED_VALUE")
    UNEXPECTED_VALUE("UNEXPECTED_VALUE"),
    
    @SerializedName("SANDBOX_NOT_SUPPORTED")
    SANDBOX_NOT_SUPPORTED("SANDBOX_NOT_SUPPORTED"),
    
    @SerializedName("INVALID_EMAIL_ADDRESS")
    INVALID_EMAIL_ADDRESS("INVALID_EMAIL_ADDRESS"),
    
    @SerializedName("CARD_DECLINED")
    CARD_DECLINED("CARD_DECLINED"),
    
    @SerializedName("VERIFY_CVV_FAILURE")
    VERIFY_CVV_FAILURE("VERIFY_CVV_FAILURE"),
    
    @SerializedName("VERIFY_AVS_FAILURE")
    VERIFY_AVS_FAILURE("VERIFY_AVS_FAILURE"),
    
    @SerializedName("CARD_DECLINED_CALL_ISSUER")
    CARD_DECLINED_CALL_ISSUER("CARD_DECLINED_CALL_ISSUER"),
    
    @SerializedName("NOT_FOUND")
    NOT_FOUND("NOT_FOUND"),
    
    @SerializedName("REQUEST_TIMEOUT")
    REQUEST_TIMEOUT("REQUEST_TIMEOUT"),
    
    @SerializedName("CONFLICT")
    CONFLICT("CONFLICT"),
    
    @SerializedName("REQUEST_ENTITY_TOO_LARGE")
    REQUEST_ENTITY_TOO_LARGE("REQUEST_ENTITY_TOO_LARGE"),
    
    @SerializedName("UNSUPPORTED_MEDIA_TYPE")
    UNSUPPORTED_MEDIA_TYPE("UNSUPPORTED_MEDIA_TYPE"),
    
    @SerializedName("RATE_LIMITED")
    RATE_LIMITED("RATE_LIMITED"),
    
    @SerializedName("NOT_IMPLEMENTED")
    NOT_IMPLEMENTED("NOT_IMPLEMENTED"),
    
    @SerializedName("SERVICE_UNAVAILABLE")
    SERVICE_UNAVAILABLE("SERVICE_UNAVAILABLE");

    private String value;

    CodeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("code")
  private CodeEnum code = null;

  @SerializedName("detail")
  private String detail = null;

  @SerializedName("field")
  private String field = null;

  public Error category(CategoryEnum category) {
    this.category = category;
    return this;
  }

   /**
   * The error's high-level category. See [ErrorCategory](#type-errorcategory) for possible values.
   * @return category
  **/
  @ApiModelProperty(required = true, value = "The error's high-level category. See [ErrorCategory](#type-errorcategory) for possible values.")
  public CategoryEnum getCategory() {
    return category;
  }

  public void setCategory(CategoryEnum category) {
    this.category = category;
  }

  public Error code(CodeEnum code) {
    this.code = code;
    return this;
  }

   /**
   * The error's specific code. See [ErrorCode](#type-errorcode) for possible values
   * @return code
  **/
  @ApiModelProperty(required = true, value = "The error's specific code. See [ErrorCode](#type-errorcode) for possible values")
  public CodeEnum getCode() {
    return code;
  }

  public void setCode(CodeEnum code) {
    this.code = code;
  }

  public Error detail(String detail) {
    this.detail = detail;
    return this;
  }

   /**
   * A human-readable description of the error for debugging purposes.
   * @return detail
  **/
  @ApiModelProperty(value = "A human-readable description of the error for debugging purposes.")
  public String getDetail() {
    return detail;
  }

  public void setDetail(String detail) {
    this.detail = detail;
  }

  public Error field(String field) {
    this.field = field;
    return this;
  }

   /**
   * The name of the field provided in the original request that the error pertains to, if any.
   * @return field
  **/
  @ApiModelProperty(value = "The name of the field provided in the original request that the error pertains to, if any.")
  public String getField() {
    return field;
  }

  public void setField(String field) {
    this.field = field;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Error error = (Error) o;
    return Objects.equals(this.category, error.category) &&
        Objects.equals(this.code, error.code) &&
        Objects.equals(this.detail, error.detail) &&
        Objects.equals(this.field, error.field);
  }

  @Override
  public int hashCode() {
    return Objects.hash(category, code, detail, field);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Error {\n");
    
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
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

