# OverrideType

replaces the calculated withholding with a flat amount or percentage

## Example Usage

```java
import to.unified.unified_java_sdk.models.shared.OverrideType;

OverrideType value = OverrideType.NONE;

// Open enum: use .of() to create instances from custom string values
OverrideType custom = OverrideType.of("custom_value");
```


## Values

| Name           | Value          |
| -------------- | -------------- |
| `NONE`         | NONE           |
| `FIXED_AMOUNT` | FIXED_AMOUNT   |
| `PERCENT`      | PERCENT        |