# UcCallStatus

The current or final status of the call

## Example Usage

```java
import to.unified.unified_java_sdk.models.shared.UcCallStatus;

UcCallStatus value = UcCallStatus.QUEUED;

// Open enum: use .of() to create instances from custom string values
UcCallStatus custom = UcCallStatus.of("custom_value");
```


## Values

| Name          | Value         |
| ------------- | ------------- |
| `QUEUED`      | QUEUED        |
| `RINGING`     | RINGING       |
| `IN_PROGRESS` | IN_PROGRESS   |
| `COMPLETED`   | COMPLETED     |
| `BUSY`        | BUSY          |
| `NO_ANSWER`   | NO_ANSWER     |
| `FAILED`      | FAILED        |
| `CANCELED`    | CANCELED      |
| `OTHER`       | OTHER         |