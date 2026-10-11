# PayFrequency

how often the employee is paid (eg. BIWEEKLY)

## Example Usage

```java
import to.unified.unified_java_sdk.models.shared.PayFrequency;

PayFrequency value = PayFrequency.ONE_TIME;

// Open enum: use .of() to create instances from custom string values
PayFrequency custom = PayFrequency.of("custom_value");
```


## Values

| Name          | Value         |
| ------------- | ------------- |
| `ONE_TIME`    | ONE_TIME      |
| `DAY`         | DAY           |
| `QUARTER`     | QUARTER       |
| `YEAR`        | YEAR          |
| `HOUR`        | HOUR          |
| `MONTH`       | MONTH         |
| `WEEK`        | WEEK          |
| `BIWEEKLY`    | BIWEEKLY      |
| `SEMIMONTHLY` | SEMIMONTHLY   |