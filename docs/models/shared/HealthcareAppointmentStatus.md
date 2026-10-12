# HealthcareAppointmentStatus

Status of the appointment

## Example Usage

```java
import to.unified.unified_java_sdk.models.shared.HealthcareAppointmentStatus;

HealthcareAppointmentStatus value = HealthcareAppointmentStatus.PROPOSED;

// Open enum: use .of() to create instances from custom string values
HealthcareAppointmentStatus custom = HealthcareAppointmentStatus.of("custom_value");
```


## Values

| Name               | Value              |
| ------------------ | ------------------ |
| `PROPOSED`         | PROPOSED           |
| `PENDING`          | PENDING            |
| `BOOKED`           | BOOKED             |
| `ARRIVED`          | ARRIVED            |
| `CHECKED_IN`       | CHECKED_IN         |
| `FULFILLED`        | FULFILLED          |
| `CANCELLED`        | CANCELLED          |
| `NOSHOW`           | NOSHOW             |
| `WAITLIST`         | WAITLIST           |
| `ENTERED_IN_ERROR` | ENTERED_IN_ERROR   |
| `OTHER`            | OTHER              |