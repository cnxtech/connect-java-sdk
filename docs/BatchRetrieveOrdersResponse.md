
# BatchRetrieveOrdersResponse

### Description

Defines the fields that are included in the response body of a request to the BatchRetrieveOrders endpoint.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**orders** | [**List&lt;Order&gt;**](Order.md) | The requested orders. This will omit any requested orders that do not exist or are not charged. |  [optional]
**errors** | [**List&lt;Error&gt;**](Error.md) | Any errors that occurred during the request. |  [optional]
**unconvertibleTransactionIds** | **List&lt;String&gt;** | List of transaction ids within the requested set of ids that encountered transformation issues when being converted to an Order. |  [optional]



