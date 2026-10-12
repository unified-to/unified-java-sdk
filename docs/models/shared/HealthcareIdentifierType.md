# HealthcareIdentifierType

The kind of identifier

## Example Usage

```java
import to.unified.unified_java_sdk.models.shared.HealthcareIdentifierType;

HealthcareIdentifierType value = HealthcareIdentifierType.MRN;

// Open enum: use .of() to create instances from custom string values
HealthcareIdentifierType custom = HealthcareIdentifierType.of("custom_value");
```


## Values

| Name              | Value             |
| ----------------- | ----------------- |
| `MRN`             | MRN               |
| `NPI`             | NPI               |
| `SSN`             | SSN               |
| `DRIVERS_LICENSE` | DRIVERS_LICENSE   |
| `PASSPORT`        | PASSPORT          |
| `INSURANCE`       | INSURANCE         |
| `OTHER`           | OTHER             |