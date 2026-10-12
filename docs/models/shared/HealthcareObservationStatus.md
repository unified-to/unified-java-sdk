# HealthcareObservationStatus

Status of the observation result

## Example Usage

```java
import to.unified.unified_java_sdk.models.shared.HealthcareObservationStatus;

HealthcareObservationStatus value = HealthcareObservationStatus.REGISTERED;

// Open enum: use .of() to create instances from custom string values
HealthcareObservationStatus custom = HealthcareObservationStatus.of("custom_value");
```


## Values

| Name               | Value              |
| ------------------ | ------------------ |
| `REGISTERED`       | REGISTERED         |
| `PRELIMINARY`      | PRELIMINARY        |
| `FINAL`            | FINAL              |
| `AMENDED`          | AMENDED            |
| `CORRECTED`        | CORRECTED          |
| `CANCELLED`        | CANCELLED          |
| `ENTERED_IN_ERROR` | ENTERED_IN_ERROR   |
| `UNKNOWN`          | UNKNOWN            |
| `OTHER`            | OTHER              |