# EmploymentStatusReason

why the employee is not actively working (eg. LEAVE, TERMINATED, RETIRED)

## Example Usage

```java
import to.unified.unified_java_sdk.models.shared.EmploymentStatusReason;

EmploymentStatusReason value = EmploymentStatusReason.LEAVE;

// Open enum: use .of() to create instances from custom string values
EmploymentStatusReason custom = EmploymentStatusReason.of("custom_value");
```


## Values

| Name         | Value        |
| ------------ | ------------ |
| `LEAVE`      | LEAVE        |
| `TERMINATED` | TERMINATED   |
| `RETIRED`    | RETIRED      |
| `DECEASED`   | DECEASED     |
| `DISABLED`   | DISABLED     |
| `OTHER`      | OTHER        |