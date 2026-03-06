# PaymentCollectionMethod

## Example Usage

```java
import to.unified.unified_java_sdk.models.shared.PaymentCollectionMethod;

PaymentCollectionMethod value = PaymentCollectionMethod.SEND_INVOICE;

// Open enum: use .of() to create instances from custom string values
PaymentCollectionMethod custom = PaymentCollectionMethod.of("custom_value");
```


## Values

| Name                   | Value                  |
| ---------------------- | ---------------------- |
| `SEND_INVOICE`         | send_invoice           |
| `CHARGE_AUTOMATICALLY` | charge_automatically   |