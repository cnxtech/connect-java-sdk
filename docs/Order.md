
# Order

### Description

Contains all information related to a single order to process with Square, including line items that specify the products to purchase. Order objects also include information on any associated tenders, refunds, and returns.  All Connect V2 Transactions have all been converted to Orders including all associated itemization data.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The order&#39;s unique ID.  This value is only present for Order objects created by the Orders API through the [CreateOrder](#endpoint-orders-createorder) endpoint. |  [optional]
**locationId** | **String** | The ID of the merchant location this order is associated with. | 
**referenceId** | **String** | A client specified identifier to associate an entity in another system with this order. |  [optional]
**source** | [**OrderSource**](OrderSource.md) | The origination details of the order. |  [optional]
**customerId** | **String** | The [Customer](#type-customer) ID of the customer associated with the order. |  [optional]
**lineItems** | [**List&lt;OrderLineItem&gt;**](OrderLineItem.md) | The line items included in the order. |  [optional]
**taxes** | [**List&lt;OrderLineItemTax&gt;**](OrderLineItemTax.md) | A list of taxes applied to this order. On read or retrieve, this list includes both order-level and item-level taxes. When creating an Order, set your order-level taxes in this list. |  [optional]
**discounts** | [**List&lt;OrderLineItemDiscount&gt;**](OrderLineItemDiscount.md) | A list of discounts applied to this order. On read or retrieve, this list includes both order-level and item-level discounts. When creating an Order, set your order-level discounts in this list. |  [optional]
**fulfillments** | [**List&lt;OrderFulfillment&gt;**](OrderFulfillment.md) | Details on order fulfillment.  Orders can only be created with at most one fulfillment. However, orders returned by the API may contain multiple fulfillments. |  [optional]
**returns** | [**List&lt;OrderReturn&gt;**](OrderReturn.md) | Collection of items from sale Orders being returned in this one. Normally part of an Itemized Return or Exchange.  There will be exactly one &#x60;Return&#x60; object per sale Order being referenced. |  [optional]
**returnAmounts** | [**OrderMoneyAmounts**](OrderMoneyAmounts.md) | Rollup of returned money amounts. |  [optional]
**netAmounts** | [**OrderMoneyAmounts**](OrderMoneyAmounts.md) | Net money amounts (sale money - return money). |  [optional]
**roundingAdjustment** | [**OrderRoundingAdjustment**](OrderRoundingAdjustment.md) | A positive or negative rounding adjustment to the total of the order, commonly used to apply Cash Rounding when the minimum unit of account is smaller than the lowest physical denomination of currency. |  [optional]
**tenders** | [**List&lt;Tender&gt;**](Tender.md) | The Tenders which were used to pay for the Order. This field is read-only. |  [optional]
**refunds** | [**List&lt;Refund&gt;**](Refund.md) | The Refunds that are part of this Order. This field is read-only. |  [optional]
**createdAt** | **String** | Timestamp for when the order was created. In RFC 3339 format, e.g., \&quot;2016-09-04T23:59:33.123Z\&quot;. |  [optional]
**updatedAt** | **String** | Timestamp for when the order was last updated. In RFC 3339 format, e.g., \&quot;2016-09-04T23:59:33.123Z\&quot;. |  [optional]
**closedAt** | **String** | Timestamp for when the order was closed. In RFC 3339 format, e.g., \&quot;2016-09-04T23:59:33.123Z\&quot;. |  [optional]
**state** | [**StateEnum**](#StateEnum) | The current state of the order. &#x60;OPEN&#x60;,&#x60;COMPLETED&#x60;,&#x60;CANCELED&#x60; See [OrderState](#type-orderstate) for possible values |  [optional]
**totalMoney** | [**Money**](Money.md) | The total amount of money to collect for the order. |  [optional]
**totalTaxMoney** | [**Money**](Money.md) | The total tax amount of money to collect for the order. |  [optional]
**totalDiscountMoney** | [**Money**](Money.md) | The total discount amount of money to collect for the order. |  [optional]


<a name="StateEnum"></a>
## Enum: StateEnum
Name | Value
---- | -----
OPEN | &quot;OPEN&quot;
COMPLETED | &quot;COMPLETED&quot;
CANCELED | &quot;CANCELED&quot;



