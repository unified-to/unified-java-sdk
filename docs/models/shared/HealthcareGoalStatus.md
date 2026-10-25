# HealthcareGoalStatus

Lifecycle status of the goal

## Example Usage

```java
import to.unified.unified_java_sdk.models.shared.HealthcareGoalStatus;

HealthcareGoalStatus value = HealthcareGoalStatus.PROPOSED;

// Open enum: use .of() to create instances from custom string values
HealthcareGoalStatus custom = HealthcareGoalStatus.of("custom_value");
```


## Values

| Name               | Value              |
| ------------------ | ------------------ |
| `PROPOSED`         | PROPOSED           |
| `PLANNED`          | PLANNED            |
| `ACCEPTED`         | ACCEPTED           |
| `ACTIVE`           | ACTIVE             |
| `ON_HOLD`          | ON_HOLD            |
| `COMPLETED`        | COMPLETED          |
| `CANCELLED`        | CANCELLED          |
| `ENTERED_IN_ERROR` | ENTERED_IN_ERROR   |
| `REJECTED`         | REJECTED           |
| `OTHER`            | OTHER              |