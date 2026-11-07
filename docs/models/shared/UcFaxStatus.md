# UcFaxStatus

The current or final status of the fax

## Example Usage

```java
import to.unified.unified_java_sdk.models.shared.UcFaxStatus;

UcFaxStatus value = UcFaxStatus.QUEUED;

// Open enum: use .of() to create instances from custom string values
UcFaxStatus custom = UcFaxStatus.of("custom_value");
```


## Values

| Name        | Value       |
| ----------- | ----------- |
| `QUEUED`    | QUEUED      |
| `SENDING`   | SENDING     |
| `DELIVERED` | DELIVERED   |
| `RECEIVING` | RECEIVING   |
| `RECEIVED`  | RECEIVED    |
| `FAILED`    | FAILED      |
| `CANCELED`  | CANCELED    |
| `OTHER`     | OTHER       |