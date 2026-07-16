# EffectiveStatus

## Example Usage

```java
import to.unified.unified_java_sdk.models.shared.EffectiveStatus;

EffectiveStatus value = EffectiveStatus.UNSPECIFIED;

// Open enum: use .of() to create instances from custom string values
EffectiveStatus custom = EffectiveStatus.of("custom_value");
```


## Values

| Name            | Value           |
| --------------- | --------------- |
| `UNSPECIFIED`   | UNSPECIFIED     |
| `SERVING`       | SERVING         |
| `LIMITED`       | LIMITED         |
| `LEARNING`      | LEARNING        |
| `PAUSED`        | PAUSED          |
| `PENDING`       | PENDING         |
| `ENDED`         | ENDED           |
| `MISCONFIGURED` | MISCONFIGURED   |
| `NOT_ELIGIBLE`  | NOT_ELIGIBLE    |
| `ARCHIVED`      | ARCHIVED        |
| `REMOVED`       | REMOVED         |