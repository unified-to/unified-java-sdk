# HealthcareEncounterType

Class of the encounter (e.g. ambulatory, inpatient)

## Example Usage

```java
import to.unified.unified_java_sdk.models.shared.HealthcareEncounterType;

HealthcareEncounterType value = HealthcareEncounterType.AMBULATORY;

// Open enum: use .of() to create instances from custom string values
HealthcareEncounterType custom = HealthcareEncounterType.of("custom_value");
```


## Values

| Name          | Value         |
| ------------- | ------------- |
| `AMBULATORY`  | AMBULATORY    |
| `EMERGENCY`   | EMERGENCY     |
| `INPATIENT`   | INPATIENT     |
| `OBSERVATION` | OBSERVATION   |
| `HOME_HEALTH` | HOME_HEALTH   |
| `VIRTUAL`     | VIRTUAL       |
| `OTHER`       | OTHER         |