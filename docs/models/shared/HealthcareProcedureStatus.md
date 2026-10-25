# HealthcareProcedureStatus

Status of the procedure

## Example Usage

```java
import to.unified.unified_java_sdk.models.shared.HealthcareProcedureStatus;

HealthcareProcedureStatus value = HealthcareProcedureStatus.PREPARATION;

// Open enum: use .of() to create instances from custom string values
HealthcareProcedureStatus custom = HealthcareProcedureStatus.of("custom_value");
```


## Values

| Name               | Value              |
| ------------------ | ------------------ |
| `PREPARATION`      | PREPARATION        |
| `IN_PROGRESS`      | IN_PROGRESS        |
| `NOT_DONE`         | NOT_DONE           |
| `ON_HOLD`          | ON_HOLD            |
| `STOPPED`          | STOPPED            |
| `COMPLETED`        | COMPLETED          |
| `ENTERED_IN_ERROR` | ENTERED_IN_ERROR   |
| `UNKNOWN`          | UNKNOWN            |
| `OTHER`            | OTHER              |