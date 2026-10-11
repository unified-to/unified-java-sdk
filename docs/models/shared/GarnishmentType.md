# GarnishmentType

set when this deduction is a court-ordered garnishment

## Example Usage

```java
import to.unified.unified_java_sdk.models.shared.GarnishmentType;

GarnishmentType value = GarnishmentType.CHILD_SUPPORT;

// Open enum: use .of() to create instances from custom string values
GarnishmentType custom = GarnishmentType.of("custom_value");
```


## Values

| Name            | Value           |
| --------------- | --------------- |
| `CHILD_SUPPORT` | CHILD_SUPPORT   |
| `TAX_LEVY`      | TAX_LEVY        |
| `STUDENT_LOAN`  | STUDENT_LOAN    |
| `CREDITOR`      | CREDITOR        |
| `BANKRUPTCY`    | BANKRUPTCY      |
| `OTHER`         | OTHER           |