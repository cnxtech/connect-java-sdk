package com.squareup.connect.api;

import com.squareup.connect.ApiException;
import com.squareup.connect.ApiClient;
import com.squareup.connect.Configuration;
import com.squareup.connect.Pair;
import com.squareup.connect.CompleteResponse;

import javax.ws.rs.core.GenericType;

import com.squareup.connect.models.BatchRetrieveOrdersRequest;
import com.squareup.connect.models.BatchRetrieveOrdersResponse;
import com.squareup.connect.models.CreateOrderRequest;
import com.squareup.connect.models.CreateOrderResponse;
import com.squareup.connect.models.SearchOrdersRequest;
import com.squareup.connect.models.SearchOrdersResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class OrdersApi {
  private ApiClient apiClient;

  public OrdersApi() {
    this(Configuration.getDefaultApiClient());
  }

  public OrdersApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * BatchRetrieveOrders
   * Retrieves a set of [Order](#type-order)s by their IDs.  If a given Order ID does not exist, the ID is ignored instead of generating an error.
   * @param locationId The ID of the orders&#39; associated location. (required)
   * @param body An object containing the fields to POST for the request.  See the corresponding object definition for field details. (required)
   * @return BatchRetrieveOrdersResponse
   * @throws ApiException if fails to make API call
   */
  public BatchRetrieveOrdersResponse batchRetrieveOrders(String locationId, BatchRetrieveOrdersRequest body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'locationId' is set
    if (locationId == null) {
      throw new ApiException(400, "Missing the required parameter 'locationId' when calling batchRetrieveOrders");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling batchRetrieveOrders");
    }
    
    // create path and map variables
    String localVarPath = "/v2/locations/{location_id}/orders/batch-retrieve"
      .replaceAll("\\{" + "location_id" + "\\}", apiClient.escapeString(locationId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();
    localVarHeaderParams.put("Square-Version", "2019-05-08");

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "oauth2" };

    GenericType<BatchRetrieveOrdersResponse> localVarReturnType = new GenericType<BatchRetrieveOrdersResponse>() {};
    CompleteResponse<BatchRetrieveOrdersResponse> completeResponse = (CompleteResponse<BatchRetrieveOrdersResponse>)apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return completeResponse.getData();
      }

  /**
   * BatchRetrieveOrders
   * Retrieves a set of [Order](#type-order)s by their IDs.  If a given Order ID does not exist, the ID is ignored instead of generating an error.
   * @param locationId The ID of the orders&#39; associated location. (required)
   * @param body An object containing the fields to POST for the request.  See the corresponding object definition for field details. (required)
   * @return CompleteResponse<BatchRetrieveOrdersResponse>
   * @throws ApiException if fails to make API call
   */
  public CompleteResponse<BatchRetrieveOrdersResponse>batchRetrieveOrdersWithHttpInfo(String locationId, BatchRetrieveOrdersRequest body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'locationId' is set
    if (locationId == null) {
      throw new ApiException(400, "Missing the required parameter 'locationId' when calling batchRetrieveOrders");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling batchRetrieveOrders");
    }
    
    // create path and map variables
    String localVarPath = "/v2/locations/{location_id}/orders/batch-retrieve"
      .replaceAll("\\{" + "location_id" + "\\}", apiClient.escapeString(locationId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "oauth2" };

    GenericType<BatchRetrieveOrdersResponse> localVarReturnType = new GenericType<BatchRetrieveOrdersResponse>() {};
    return (CompleteResponse<BatchRetrieveOrdersResponse>)apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * CreateOrder
   * Creates an [Order](#type-order) that can then be referenced as &#x60;order_id&#x60; in a request to the [Charge](#endpoint-charge) endpoint. Orders specify products for purchase, along with discounts, taxes, and other settings to apply to the purchase.  To associate a created order with a request to the Charge endpoint, provide the order&#39;s &#x60;id&#x60; in the &#x60;order_id&#x60; field of your request.  You cannot modify an order after you create it. If you need to modify an order, instead create a new order with modified details.  To learn more about the Orders API, see the [Orders API Overview](/products/orders/overview).
   * @param locationId The ID of the business location to associate the order with. (required)
   * @param body An object containing the fields to POST for the request.  See the corresponding object definition for field details. (required)
   * @return CreateOrderResponse
   * @throws ApiException if fails to make API call
   */
  public CreateOrderResponse createOrder(String locationId, CreateOrderRequest body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'locationId' is set
    if (locationId == null) {
      throw new ApiException(400, "Missing the required parameter 'locationId' when calling createOrder");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createOrder");
    }
    
    // create path and map variables
    String localVarPath = "/v2/locations/{location_id}/orders"
      .replaceAll("\\{" + "location_id" + "\\}", apiClient.escapeString(locationId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();
    localVarHeaderParams.put("Square-Version", "2019-05-08");

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "oauth2" };

    GenericType<CreateOrderResponse> localVarReturnType = new GenericType<CreateOrderResponse>() {};
    CompleteResponse<CreateOrderResponse> completeResponse = (CompleteResponse<CreateOrderResponse>)apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return completeResponse.getData();
      }

  /**
   * CreateOrder
   * Creates an [Order](#type-order) that can then be referenced as &#x60;order_id&#x60; in a request to the [Charge](#endpoint-charge) endpoint. Orders specify products for purchase, along with discounts, taxes, and other settings to apply to the purchase.  To associate a created order with a request to the Charge endpoint, provide the order&#39;s &#x60;id&#x60; in the &#x60;order_id&#x60; field of your request.  You cannot modify an order after you create it. If you need to modify an order, instead create a new order with modified details.  To learn more about the Orders API, see the [Orders API Overview](/products/orders/overview).
   * @param locationId The ID of the business location to associate the order with. (required)
   * @param body An object containing the fields to POST for the request.  See the corresponding object definition for field details. (required)
   * @return CompleteResponse<CreateOrderResponse>
   * @throws ApiException if fails to make API call
   */
  public CompleteResponse<CreateOrderResponse>createOrderWithHttpInfo(String locationId, CreateOrderRequest body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'locationId' is set
    if (locationId == null) {
      throw new ApiException(400, "Missing the required parameter 'locationId' when calling createOrder");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createOrder");
    }
    
    // create path and map variables
    String localVarPath = "/v2/locations/{location_id}/orders"
      .replaceAll("\\{" + "location_id" + "\\}", apiClient.escapeString(locationId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "oauth2" };

    GenericType<CreateOrderResponse> localVarReturnType = new GenericType<CreateOrderResponse>() {};
    return (CompleteResponse<CreateOrderResponse>)apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * SearchOrders
   * Search all Orders for a merchant and return either [Orders](#type-order) or [OrderEntries](#type-orderentry).  Note that details for orders processed with Square Point of Sale while in offline mode may not be transmitted to Square for up to 72 hours. Offline orders have a &#x60;created_at&#x60; value that reflects the time the order was originally processed, not the time it was subsequently transmitted to Square. Consequently, the SearchOrder endpoint might list an offline Order chronologically between online Orders that were seen in a previous request.  By default, SearchOrders will return all results for all of the merchant’s locations. When fetching additional pages using a &#x60;cursor&#x60;, the &#x60;query&#x60; must be equal to the &#x60;query&#x60; used to fetch the first page of results.
   * @param body An object containing the fields to POST for the request.  See the corresponding object definition for field details. (required)
   * @return SearchOrdersResponse
   * @throws ApiException if fails to make API call
   */
  public SearchOrdersResponse searchOrders(SearchOrdersRequest body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling searchOrders");
    }
    
    // create path and map variables
    String localVarPath = "/v2/orders/search";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();
    localVarHeaderParams.put("Square-Version", "2019-05-08");

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "oauth2" };

    GenericType<SearchOrdersResponse> localVarReturnType = new GenericType<SearchOrdersResponse>() {};
    CompleteResponse<SearchOrdersResponse> completeResponse = (CompleteResponse<SearchOrdersResponse>)apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return completeResponse.getData();
      }

  /**
   * SearchOrders
   * Search all Orders for a merchant and return either [Orders](#type-order) or [OrderEntries](#type-orderentry).  Note that details for orders processed with Square Point of Sale while in offline mode may not be transmitted to Square for up to 72 hours. Offline orders have a &#x60;created_at&#x60; value that reflects the time the order was originally processed, not the time it was subsequently transmitted to Square. Consequently, the SearchOrder endpoint might list an offline Order chronologically between online Orders that were seen in a previous request.  By default, SearchOrders will return all results for all of the merchant’s locations. When fetching additional pages using a &#x60;cursor&#x60;, the &#x60;query&#x60; must be equal to the &#x60;query&#x60; used to fetch the first page of results.
   * @param body An object containing the fields to POST for the request.  See the corresponding object definition for field details. (required)
   * @return CompleteResponse<SearchOrdersResponse>
   * @throws ApiException if fails to make API call
   */
  public CompleteResponse<SearchOrdersResponse>searchOrdersWithHttpInfo(SearchOrdersRequest body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling searchOrders");
    }
    
    // create path and map variables
    String localVarPath = "/v2/orders/search";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "oauth2" };

    GenericType<SearchOrdersResponse> localVarReturnType = new GenericType<SearchOrdersResponse>() {};
    return (CompleteResponse<SearchOrdersResponse>)apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
}
