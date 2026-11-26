# FhirEncounterStatus

planned | arrived | triaged | in-progress | onleave | finished | cancelled | entered-in-error | unknown

## Example Usage

```java
import to.unified.unified_java_sdk.models.shared.FhirEncounterStatus;

FhirEncounterStatus value = FhirEncounterStatus.PLANNED;

// Open enum: use .of() to create instances from custom string values
FhirEncounterStatus custom = FhirEncounterStatus.of("custom_value");
```


## Values

| Name               | Value              |
| ------------------ | ------------------ |
| `PLANNED`          | planned            |
| `ARRIVED`          | arrived            |
| `TRIAGED`          | triaged            |
| `IN_PROGRESS`      | in-progress        |
| `ONLEAVE`          | onleave            |
| `FINISHED`         | finished           |
| `CANCELLED`        | cancelled          |
| `ENTERED_IN_ERROR` | entered-in-error   |
| `UNKNOWN`          | unknown            |