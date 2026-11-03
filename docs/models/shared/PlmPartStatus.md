# PlmPartStatus

Normalized lifecycle status

## Example Usage

```java
import to.unified.unified_java_sdk.models.shared.PlmPartStatus;

PlmPartStatus value = PlmPartStatus.IN_WORK;

// Open enum: use .of() to create instances from custom string values
PlmPartStatus custom = PlmPartStatus.of("custom_value");
```


## Values

| Name        | Value       |
| ----------- | ----------- |
| `IN_WORK`   | IN_WORK     |
| `IN_REVIEW` | IN_REVIEW   |
| `RELEASED`  | RELEASED    |
| `OBSOLETE`  | OBSOLETE    |
| `OTHER`     | OTHER       |