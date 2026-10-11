# SplitType

how net pay is split into this account when an employee has several accounts

## Example Usage

```java
import to.unified.unified_java_sdk.models.shared.SplitType;

SplitType value = SplitType.PERCENTAGE;

// Open enum: use .of() to create instances from custom string values
SplitType custom = SplitType.of("custom_value");
```


## Values

| Name         | Value        |
| ------------ | ------------ |
| `PERCENTAGE` | PERCENTAGE   |
| `FIXED`      | FIXED        |
| `REMAINDER`  | REMAINDER    |