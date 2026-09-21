# PaymentPayoutLineitemObjectType

## Example Usage

```java
import to.unified.unified_java_sdk.models.shared.PaymentPayoutLineitemObjectType;

PaymentPayoutLineitemObjectType value = PaymentPayoutLineitemObjectType.PAYMENT;

// Open enum: use .of() to create instances from custom string values
PaymentPayoutLineitemObjectType custom = PaymentPayoutLineitemObjectType.of("custom_value");
```


## Values

| Name         | Value        |
| ------------ | ------------ |
| `PAYMENT`    | PAYMENT      |
| `REFUND`     | REFUND       |
| `FEE`        | FEE          |
| `ADJUSTMENT` | ADJUSTMENT   |
| `TRANSFER`   | TRANSFER     |
| `OTHER`      | OTHER        |