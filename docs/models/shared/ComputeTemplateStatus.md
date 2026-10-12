# ComputeTemplateStatus

Normalized build status

## Example Usage

```java
import to.unified.unified_java_sdk.models.shared.ComputeTemplateStatus;

ComputeTemplateStatus value = ComputeTemplateStatus.PENDING;

// Open enum: use .of() to create instances from custom string values
ComputeTemplateStatus custom = ComputeTemplateStatus.of("custom_value");
```


## Values

| Name       | Value      |
| ---------- | ---------- |
| `PENDING`  | PENDING    |
| `BUILDING` | BUILDING   |
| `READY`    | READY      |
| `FAILED`   | FAILED     |
| `OTHER`    | OTHER      |