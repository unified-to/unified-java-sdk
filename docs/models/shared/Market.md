# Market

Pricing market the instance runs in

## Example Usage

```java
import to.unified.unified_java_sdk.models.shared.Market;

Market value = Market.ON_DEMAND;

// Open enum: use .of() to create instances from custom string values
Market custom = Market.of("custom_value");
```


## Values

| Name        | Value       |
| ----------- | ----------- |
| `ON_DEMAND` | ON_DEMAND   |
| `SPOT`      | SPOT        |
| `RESERVED`  | RESERVED    |
| `COMMUNITY` | COMMUNITY   |
| `OTHER`     | OTHER       |