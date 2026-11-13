# DeliveryType

Ad server line item type / delivery class (Google Ad Manager lineItemType)

## Example Usage

```java
import to.unified.unified_java_sdk.models.shared.DeliveryType;

DeliveryType value = DeliveryType.STANDARD;

// Open enum: use .of() to create instances from custom string values
DeliveryType custom = DeliveryType.of("custom_value");
```


## Values

| Name             | Value            |
| ---------------- | ---------------- |
| `STANDARD`       | STANDARD         |
| `SPONSORSHIP`    | SPONSORSHIP      |
| `NETWORK`        | NETWORK          |
| `BULK`           | BULK             |
| `PRICE_PRIORITY` | PRICE_PRIORITY   |
| `HOUSE`          | HOUSE            |
| `PREFERRED_DEAL` | PREFERRED_DEAL   |
| `AD_EXCHANGE`    | AD_EXCHANGE      |
| `CLICK_TRACKING` | CLICK_TRACKING   |
| `OTHER`          | OTHER            |