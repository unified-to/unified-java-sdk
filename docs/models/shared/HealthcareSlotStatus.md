# HealthcareSlotStatus

Availability of the slot

## Example Usage

```java
import to.unified.unified_java_sdk.models.shared.HealthcareSlotStatus;

HealthcareSlotStatus value = HealthcareSlotStatus.FREE;

// Open enum: use .of() to create instances from custom string values
HealthcareSlotStatus custom = HealthcareSlotStatus.of("custom_value");
```


## Values

| Name               | Value              |
| ------------------ | ------------------ |
| `FREE`             | FREE               |
| `BUSY`             | BUSY               |
| `BUSY_UNAVAILABLE` | BUSY_UNAVAILABLE   |
| `BUSY_TENTATIVE`   | BUSY_TENTATIVE     |
| `ENTERED_IN_ERROR` | ENTERED_IN_ERROR   |
| `OTHER`            | OTHER              |