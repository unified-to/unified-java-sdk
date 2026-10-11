# TaxMode

INCLUSIVE / EXCLUSIVE / NONE; maps Xero LineAmountTypes (a boolean cannot represent NoTax)

## Example Usage

```java
import to.unified.unified_java_sdk.models.shared.TaxMode;

TaxMode value = TaxMode.INCLUSIVE;

// Open enum: use .of() to create instances from custom string values
TaxMode custom = TaxMode.of("custom_value");
```


## Values

| Name        | Value       |
| ----------- | ----------- |
| `INCLUSIVE` | INCLUSIVE   |
| `EXCLUSIVE` | EXCLUSIVE   |
| `NONE`      | NONE        |