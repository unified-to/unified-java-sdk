# HealthcareDocumentType

Unified, normalized kind of clinical document (OTHER when unmappable)

## Example Usage

```java
import to.unified.unified_java_sdk.models.shared.HealthcareDocumentType;

HealthcareDocumentType value = HealthcareDocumentType.PROGRESS_NOTE;

// Open enum: use .of() to create instances from custom string values
HealthcareDocumentType custom = HealthcareDocumentType.of("custom_value");
```


## Values

| Name                   | Value                  |
| ---------------------- | ---------------------- |
| `PROGRESS_NOTE`        | PROGRESS_NOTE          |
| `CONSULTATION_NOTE`    | CONSULTATION_NOTE      |
| `HISTORY_AND_PHYSICAL` | HISTORY_AND_PHYSICAL   |
| `DISCHARGE_SUMMARY`    | DISCHARGE_SUMMARY      |
| `PROCEDURE_NOTE`       | PROCEDURE_NOTE         |
| `REFERRAL_NOTE`        | REFERRAL_NOTE          |
| `SUMMARY`              | SUMMARY                |
| `LABORATORY_REPORT`    | LABORATORY_REPORT      |
| `IMAGING_REPORT`       | IMAGING_REPORT         |
| `CONSENT`              | CONSENT                |
| `OTHER`                | OTHER                  |