
# InventoryTransfer

### Description

Represents the transfer of a quantity of product inventory at a particular time from one location to another.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | A unique ID generated by Square for the [InventoryTransfer](#type-inventorytransfer). |  [optional]
**referenceId** | **String** | An optional ID provided by the application to tie the [InventoryTransfer](#type-inventorytransfer) to an external system. |  [optional]
**state** | [**StateEnum**](#StateEnum) | The [InventoryState](#type-inventorystate) for the quantity of items being transfered. See [InventoryState](#type-inventorystate) for possible values |  [optional]
**fromLocationId** | **String** | The Square ID of the [Location](#type-location) where the related quantity of items were tracked before the transfer. |  [optional]
**toLocationId** | **String** | The Square ID of the [Location](#type-location) where the related quantity of items were tracked after the transfer. |  [optional]
**catalogObjectId** | **String** | The Square generated ID of the [CatalogObject](#type-catalogobject) being tracked. |  [optional]
**catalogObjectType** | **String** | The [CatalogObjectType](#type-catalogobjecttype) of the [CatalogObject](#type-catalogobject) being tracked.Tracking is only supported for the &#x60;ITEM_VARIATION&#x60; type. |  [optional]
**quantity** | **String** | The number of items affected by the transfer as a decimal string. Can support up to 5 digits after the decimal point.  _Important_: The Point of Sale app and Dashboard do not currently support decimal quantities. If a Point of Sale app or Dashboard attempts to read a decimal quantity on inventory counts or adjustments, the quantity will be rounded down to the nearest integer. For example, &#x60;2.5&#x60; will become &#x60;2&#x60;, and &#x60;-2.5&#x60; will become &#x60;-3&#x60;. Read [Decimal Quantities (BETA)](/more-apis/inventory/overview#decimal-quantities-beta) for more information. |  [optional]
**occurredAt** | **String** | A client-generated timestamp in RFC 3339 format that indicates when the transfer took place. For write actions, the &#x60;occurred_at&#x60; timestamp cannot be older than 24 hours or in the future relative to the time of the request. |  [optional]
**createdAt** | **String** | A read-only timestamp in RFC 3339 format that indicates when Square received the transfer request. |  [optional]
**source** | [**SourceApplication**](SourceApplication.md) | Read-only information about the application that initiated the inventory transfer. |  [optional]
**employeeId** | **String** | The Square ID of the [Employee](#type-employee) responsible for the inventory transfer. |  [optional]


<a name="StateEnum"></a>
## Enum: StateEnum
Name | Value
---- | -----
CUSTOM | &quot;CUSTOM&quot;
IN_STOCK | &quot;IN_STOCK&quot;
SOLD | &quot;SOLD&quot;
RETURNED_BY_CUSTOMER | &quot;RETURNED_BY_CUSTOMER&quot;
RESERVED_FOR_SALE | &quot;RESERVED_FOR_SALE&quot;
SOLD_ONLINE | &quot;SOLD_ONLINE&quot;
ORDERED_FROM_VENDOR | &quot;ORDERED_FROM_VENDOR&quot;
RECEIVED_FROM_VENDOR | &quot;RECEIVED_FROM_VENDOR&quot;
IN_TRANSIT_TO | &quot;IN_TRANSIT_TO&quot;
NONE | &quot;NONE&quot;
WASTE | &quot;WASTE&quot;
UNLINKED_RETURN | &quot;UNLINKED_RETURN&quot;



