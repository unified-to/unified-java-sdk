# ResponseStatus

## Example Usage

```java
import to.unified.unified_java_sdk.models.shared.ResponseStatus;

ResponseStatus value = ResponseStatus.OPEN;

// Open enum: use .of() to create instances from custom string values
ResponseStatus custom = ResponseStatus.of("custom_value");
```


## Values

| Name          | Value         |
| ------------- | ------------- |
| `OPEN`        | OPEN          |
| `IN_PROGRESS` | IN_PROGRESS   |
| `COMPLETED`   | COMPLETED     |
| `FAILED`      | FAILED        |
| `REJECTED`    | REJECTED      |