# PlmDocumentStatus

Normalized lifecycle status of a part or document revision

## Example Usage

```java
import to.unified.unified_java_sdk.models.shared.PlmDocumentStatus;

PlmDocumentStatus value = PlmDocumentStatus.IN_WORK;

// Open enum: use .of() to create instances from custom string values
PlmDocumentStatus custom = PlmDocumentStatus.of("custom_value");
```


## Values

| Name        | Value       |
| ----------- | ----------- |
| `IN_WORK`   | IN_WORK     |
| `IN_REVIEW` | IN_REVIEW   |
| `RELEASED`  | RELEASED    |
| `OBSOLETE`  | OBSOLETE    |
| `OTHER`     | OTHER       |