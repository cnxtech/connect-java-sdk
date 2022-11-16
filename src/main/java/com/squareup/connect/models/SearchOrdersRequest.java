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
import com.squareup.connect.models.SearchOrdersQuery;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * The request does not have any required fields. When given no query criteria, SearchOrders will return all results for all of the merchant’s locations. When fetching additional pages using a &#x60;cursor&#x60;, the &#x60;query&#x60; must be equal to the &#x60;query&#x60; used to fetch the first page of results.
 */
@ApiModel(description = "The request does not have any required fields. When given no query criteria, SearchOrders will return all results for all of the merchant’s locations. When fetching additional pages using a `cursor`, the `query` must be equal to the `query` used to fetch the first page of results.")

public class SearchOrdersRequest {
  @JsonProperty("location_ids")
  private List<String> locationIds = new ArrayList<String>();

  @JsonProperty("cursor")
  private String cursor = null;

  @JsonProperty("query")
  private SearchOrdersQuery query = null;

  @JsonProperty("limit")
  private Integer limit = null;

  @JsonProperty("return_entries")
  private Boolean returnEntries = null;

  public SearchOrdersRequest locationIds(List<String> locationIds) {
    this.locationIds = locationIds;
    return this;
  }

  public SearchOrdersRequest addLocationIdsItem(String locationIdsItem) {
    this.locationIds.add(locationIdsItem);
    return this;
  }

   /**
   * The location IDs for the orders to query. The caller must have access to all provided locations.  Min: 1 `location_ids`. Max: 10 `location_ids`.
   * @return locationIds
  **/
  @ApiModelProperty(value = "The location IDs for the orders to query. The caller must have access to all provided locations.  Min: 1 `location_ids`. Max: 10 `location_ids`.")
  public List<String> getLocationIds() {
    return locationIds;
  }

  public void setLocationIds(List<String> locationIds) {
    this.locationIds = locationIds;
  }

  public SearchOrdersRequest cursor(String cursor) {
    this.cursor = cursor;
    return this;
  }

   /**
   * A pagination cursor returned by a previous call to this endpoint. Provide this to retrieve the next set of results for your original query. See [Pagination](/basics/api101/pagination) for more information.
   * @return cursor
  **/
  @ApiModelProperty(value = "A pagination cursor returned by a previous call to this endpoint. Provide this to retrieve the next set of results for your original query. See [Pagination](/basics/api101/pagination) for more information.")
  public String getCursor() {
    return cursor;
  }

  public void setCursor(String cursor) {
    this.cursor = cursor;
  }

  public SearchOrdersRequest query(SearchOrdersQuery query) {
    this.query = query;
    return this;
  }

   /**
   * Query conditions used to filter or sort the results. Note that when fetching additional pages using a `cursor`, the `query` must be equal to the `query` used to fetch the first page of results.
   * @return query
  **/
  @ApiModelProperty(value = "Query conditions used to filter or sort the results. Note that when fetching additional pages using a `cursor`, the `query` must be equal to the `query` used to fetch the first page of results.")
  public SearchOrdersQuery getQuery() {
    return query;
  }

  public void setQuery(SearchOrdersQuery query) {
    this.query = query;
  }

  public SearchOrdersRequest limit(Integer limit) {
    this.limit = limit;
    return this;
  }

   /**
   * Number of results to be returned in a single page. SearchOrders may use a smaller limit than specified depending on server load. If the response includes a `cursor` field, you can use it to retrieve the next set of results. Default: `500`
   * minimum: 1
   * @return limit
  **/
  @ApiModelProperty(value = "Number of results to be returned in a single page. SearchOrders may use a smaller limit than specified depending on server load. If the response includes a `cursor` field, you can use it to retrieve the next set of results. Default: `500`")
  public Integer getLimit() {
    return limit;
  }

  public void setLimit(Integer limit) {
    this.limit = limit;
  }

  public SearchOrdersRequest returnEntries(Boolean returnEntries) {
    this.returnEntries = returnEntries;
    return this;
  }

   /**
   *  If set to `true`, SearchOrders will return [`OrderEntry`](#type-orderentry) objects instead of `Order` objects. `OrderEntry` objects are lightweight descriptions of orders that include `order_id`s.  Default: `false`.
   * @return returnEntries
  **/
  @ApiModelProperty(value = " If set to `true`, SearchOrders will return [`OrderEntry`](#type-orderentry) objects instead of `Order` objects. `OrderEntry` objects are lightweight descriptions of orders that include `order_id`s.  Default: `false`.")
  public Boolean getReturnEntries() {
    return returnEntries;
  }

  public void setReturnEntries(Boolean returnEntries) {
    this.returnEntries = returnEntries;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchOrdersRequest searchOrdersRequest = (SearchOrdersRequest) o;
    return Objects.equals(this.locationIds, searchOrdersRequest.locationIds) &&
        Objects.equals(this.cursor, searchOrdersRequest.cursor) &&
        Objects.equals(this.query, searchOrdersRequest.query) &&
        Objects.equals(this.limit, searchOrdersRequest.limit) &&
        Objects.equals(this.returnEntries, searchOrdersRequest.returnEntries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(locationIds, cursor, query, limit, returnEntries);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchOrdersRequest {\n");
    
    sb.append("    locationIds: ").append(toIndentedString(locationIds)).append("\n");
    sb.append("    cursor: ").append(toIndentedString(cursor)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    returnEntries: ").append(toIndentedString(returnEntries)).append("\n");
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
