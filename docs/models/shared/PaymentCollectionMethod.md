# PaymentCollectionMethod

When set to charging_automatically, an automated attempt will occur to pay this invoice using the default payment source attached to the contactcustomer. When set to send_invoice, an will email will be sent with this invoice to the contact/customer with payment instructions.

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