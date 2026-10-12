# HealthcareMedicationStatus

Status of the medication order

## Example Usage

```java
import to.unified.unified_java_sdk.models.shared.HealthcareMedicationStatus;

HealthcareMedicationStatus value = HealthcareMedicationStatus.DRAFT;

// Open enum: use .of() to create instances from custom string values
HealthcareMedicationStatus custom = HealthcareMedicationStatus.of("custom_value");
```


## Values

| Name               | Value              |
| ------------------ | ------------------ |
| `DRAFT`            | DRAFT              |
| `ACTIVE`           | ACTIVE             |
| `ON_HOLD`          | ON_HOLD            |
| `COMPLETED`        | COMPLETED          |
| `STOPPED`          | STOPPED            |
| `CANCELLED`        | CANCELLED          |
| `ENTERED_IN_ERROR` | ENTERED_IN_ERROR   |
| `UNKNOWN`          | UNKNOWN            |
| `OTHER`            | OTHER              |