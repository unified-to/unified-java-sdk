# GenaiTaskStatus

## Example Usage

```java
import to.unified.unified_java_sdk.models.shared.GenaiTaskStatus;

GenaiTaskStatus value = GenaiTaskStatus.PENDING;

// Open enum: use .of() to create instances from custom string values
GenaiTaskStatus custom = GenaiTaskStatus.of("custom_value");
```


## Values

| Name        | Value       |
| ----------- | ----------- |
| `PENDING`   | PENDING     |
| `RUNNING`   | RUNNING     |
| `BLOCKED`   | BLOCKED     |
| `COMPLETED` | COMPLETED   |
| `FAILED`    | FAILED      |
| `CANCELLED` | CANCELLED   |
| `EXPIRED`   | EXPIRED     |
| `OTHER`     | OTHER       |