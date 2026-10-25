# HealthcareCareplanStatus

Status of the care plan

## Example Usage

```java
import to.unified.unified_java_sdk.models.shared.HealthcareCareplanStatus;

HealthcareCareplanStatus value = HealthcareCareplanStatus.DRAFT;

// Open enum: use .of() to create instances from custom string values
HealthcareCareplanStatus custom = HealthcareCareplanStatus.of("custom_value");
```


## Values

| Name               | Value              |
| ------------------ | ------------------ |
| `DRAFT`            | DRAFT              |
| `ACTIVE`           | ACTIVE             |
| `ON_HOLD`          | ON_HOLD            |
| `REVOKED`          | REVOKED            |
| `COMPLETED`        | COMPLETED          |
| `ENTERED_IN_ERROR` | ENTERED_IN_ERROR   |
| `UNKNOWN`          | UNKNOWN            |
| `OTHER`            | OTHER              |