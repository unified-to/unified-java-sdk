# HrisBenefitFrequency

Frequency that costs accrue for this benefit. For insurance/benefits, usually "MONTHLY". For compensation, matches pay cycle (WEEKLY, BIWEEKLY, etc).

## Example Usage

```java
import to.unified.unified_java_sdk.models.shared.HrisBenefitFrequency;

HrisBenefitFrequency value = HrisBenefitFrequency.ONE_TIME;

// Open enum: use .of() to create instances from custom string values
HrisBenefitFrequency custom = HrisBenefitFrequency.of("custom_value");
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