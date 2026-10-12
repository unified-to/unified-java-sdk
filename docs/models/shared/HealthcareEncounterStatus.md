# HealthcareEncounterStatus

Status of the encounter

## Example Usage

```java
import to.unified.unified_java_sdk.models.shared.HealthcareEncounterStatus;

HealthcareEncounterStatus value = HealthcareEncounterStatus.PLANNED;

// Open enum: use .of() to create instances from custom string values
HealthcareEncounterStatus custom = HealthcareEncounterStatus.of("custom_value");
```


## Values

| Name               | Value              |
| ------------------ | ------------------ |
| `PLANNED`          | PLANNED            |
| `ARRIVED`          | ARRIVED            |
| `TRIAGED`          | TRIAGED            |
| `IN_PROGRESS`      | IN_PROGRESS        |
| `ONLEAVE`          | ONLEAVE            |
| `FINISHED`         | FINISHED           |
| `CANCELLED`        | CANCELLED          |
| `ENTERED_IN_ERROR` | ENTERED_IN_ERROR   |
| `UNKNOWN`          | UNKNOWN            |
| `OTHER`            | OTHER              |