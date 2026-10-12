# Interpretation

Interpretation of the result (e.g. high, low)

## Example Usage

```java
import to.unified.unified_java_sdk.models.shared.Interpretation;

Interpretation value = Interpretation.NORMAL;

// Open enum: use .of() to create instances from custom string values
Interpretation custom = Interpretation.of("custom_value");
```


## Values

| Name            | Value           |
| --------------- | --------------- |
| `NORMAL`        | NORMAL          |
| `ABNORMAL`      | ABNORMAL        |
| `LOW`           | LOW             |
| `HIGH`          | HIGH            |
| `CRITICAL_LOW`  | CRITICAL_LOW    |
| `CRITICAL_HIGH` | CRITICAL_HIGH   |
| `OTHER`         | OTHER           |