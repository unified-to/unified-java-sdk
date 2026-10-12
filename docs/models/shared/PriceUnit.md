# PriceUnit

Unit that price_amount is quoted in

## Example Usage

```java
import to.unified.unified_java_sdk.models.shared.PriceUnit;

PriceUnit value = PriceUnit.PER_GPU_HOUR;

// Open enum: use .of() to create instances from custom string values
PriceUnit custom = PriceUnit.of("custom_value");
```


## Values

| Name                | Value               |
| ------------------- | ------------------- |
| `PER_GPU_HOUR`      | PER_GPU_HOUR        |
| `PER_INSTANCE_HOUR` | PER_INSTANCE_HOUR   |
| `OTHER`             | OTHER               |