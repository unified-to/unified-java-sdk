# FhirCapabilityStatementResourceType

Always CapabilityStatement

## Example Usage

```java
import to.unified.unified_java_sdk.models.shared.FhirCapabilityStatementResourceType;

FhirCapabilityStatementResourceType value = FhirCapabilityStatementResourceType.PATIENT;

// Open enum: use .of() to create instances from custom string values
FhirCapabilityStatementResourceType custom = FhirCapabilityStatementResourceType.of("custom_value");
```


## Values

| Name                   | Value                  |
| ---------------------- | ---------------------- |
| `PATIENT`              | Patient                |
| `PRACTITIONER`         | Practitioner           |
| `ENCOUNTER`            | Encounter              |
| `OBSERVATION`          | Observation            |
| `CONDITION`            | Condition              |
| `ALLERGY_INTOLERANCE`  | AllergyIntolerance     |
| `MEDICATION_REQUEST`   | MedicationRequest      |
| `IMMUNIZATION`         | Immunization           |
| `BUNDLE`               | Bundle                 |
| `OPERATION_OUTCOME`    | OperationOutcome       |
| `CAPABILITY_STATEMENT` | CapabilityStatement    |
| `DIAGNOSTIC_REPORT`    | DiagnosticReport       |