# HealthcareReportStatus

Status of the report

## Example Usage

```java
import to.unified.unified_java_sdk.models.shared.HealthcareReportStatus;

HealthcareReportStatus value = HealthcareReportStatus.REGISTERED;

// Open enum: use .of() to create instances from custom string values
HealthcareReportStatus custom = HealthcareReportStatus.of("custom_value");
```


## Values

| Name               | Value              |
| ------------------ | ------------------ |
| `REGISTERED`       | REGISTERED         |
| `PARTIAL`          | PARTIAL            |
| `PRELIMINARY`      | PRELIMINARY        |
| `FINAL`            | FINAL              |
| `AMENDED`          | AMENDED            |
| `CORRECTED`        | CORRECTED          |
| `APPENDED`         | APPENDED           |
| `CANCELLED`        | CANCELLED          |
| `ENTERED_IN_ERROR` | ENTERED_IN_ERROR   |
| `UNKNOWN`          | UNKNOWN            |
| `OTHER`            | OTHER              |