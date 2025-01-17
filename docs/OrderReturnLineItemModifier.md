
# OrderReturnLineItemModifier

### Description

A line item modifier being returned.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**uid** | **String** | The return modifier&#39;s Unique identifier, unique only within this order |  [optional]
**sourceModifierUid** | **String** | &#x60;uid&#x60; of the Modifier from the LineItem from the Order which contains the original sale of this line item modifier. |  [optional]
**catalogObjectId** | **String** | The catalog object id referencing [CatalogModifier](#type-catalogmodifier). |  [optional]
**name** | **String** | The name of the item modifier. |  [optional]
**basePriceMoney** | [**Money**](Money.md) | The base price for the modifier.  &#x60;base_price_money&#x60; is required for ad hoc modifiers. If both &#x60;catalog_object_id&#x60; and &#x60;base_price_money&#x60; are set, &#x60;base_price_money&#x60; will override the predefined [CatalogModifier](#type-catalogmodifier) price. |  [optional]
**totalPriceMoney** | [**Money**](Money.md) | The total price of the item modifier for its line item. This is the modifier&#39;s &#x60;base_price_money&#x60; multiplied by the line item&#39;s quantity. |  [optional]



