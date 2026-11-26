# FhirMedicationRequestStatus

active | on-hold | cancelled | completed | entered-in-error | stopped | draft | unknown

## Example Usage

```java
import to.unified.unified_java_sdk.models.shared.FhirMedicationRequestStatus;

FhirMedicationRequestStatus value = FhirMedicationRequestStatus.ACTIVE;

// Open enum: use .of() to create instances from custom string values
FhirMedicationRequestStatus custom = FhirMedicationRequestStatus.of("custom_value");
```


## Values

| Name               | Value              |
| ------------------ | ------------------ |
| `ACTIVE`           | active             |
| `ON_HOLD`          | on-hold            |
| `CANCELLED`        | cancelled          |
| `COMPLETED`        | completed          |
| `ENTERED_IN_ERROR` | entered-in-error   |
| `STOPPED`          | stopped            |
| `DRAFT`            | draft              |
| `UNKNOWN`          | unknown            |