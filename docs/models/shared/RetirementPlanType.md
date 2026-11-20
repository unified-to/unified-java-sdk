# RetirementPlanType

the retirement plan this benefit belongs to (for RETIREMENT* types)

## Example Usage

```java
import to.unified.unified_java_sdk.models.shared.RetirementPlanType;

RetirementPlanType value = RetirementPlanType.PLAN401_K;

// Open enum: use .of() to create instances from custom string values
RetirementPlanType custom = RetirementPlanType.of("custom_value");
```


## Values

| Name         | Value        |
| ------------ | ------------ |
| `PLAN401_K`  | PLAN_401K    |
| `PLAN403_B`  | PLAN_403B    |
| `PLAN457_B`  | PLAN_457B    |
| `SIMPLE_IRA` | SIMPLE_IRA   |
| `SEP_IRA`    | SEP_IRA      |
| `NQDC`       | NQDC         |
| `PENSION`    | PENSION      |
| `OTHER`      | OTHER        |