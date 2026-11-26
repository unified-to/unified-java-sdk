# FhirObservationStatus

registered | preliminary | final | amended | corrected | cancelled | entered-in-error | unknown

## Example Usage

```java
import to.unified.unified_java_sdk.models.shared.FhirObservationStatus;

FhirObservationStatus value = FhirObservationStatus.REGISTERED;

// Open enum: use .of() to create instances from custom string values
FhirObservationStatus custom = FhirObservationStatus.of("custom_value");
```


## Values

| Name               | Value              |
| ------------------ | ------------------ |
| `REGISTERED`       | registered         |
| `PRELIMINARY`      | preliminary        |
| `FINAL`            | final              |
| `AMENDED`          | amended            |
| `CORRECTED`        | corrected          |
| `CANCELLED`        | cancelled          |
| `ENTERED_IN_ERROR` | entered-in-error   |
| `UNKNOWN`          | unknown            |