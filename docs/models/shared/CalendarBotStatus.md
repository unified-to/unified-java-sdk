# CalendarBotStatus

## Example Usage

```java
import to.unified.unified_java_sdk.models.shared.CalendarBotStatus;

CalendarBotStatus value = CalendarBotStatus.READY;

// Open enum: use .of() to create instances from custom string values
CalendarBotStatus custom = CalendarBotStatus.of("custom_value");
```


## Values

| Name                           | Value                          |
| ------------------------------ | ------------------------------ |
| `READY`                        | READY                          |
| `JOINING_CALL`                 | JOINING_CALL                   |
| `IN_WAITING_ROOM`              | IN_WAITING_ROOM                |
| `IN_CALL_NOT_RECORDING`        | IN_CALL_NOT_RECORDING          |
| `RECORDING_PERMISSION_ALLOWED` | RECORDING_PERMISSION_ALLOWED   |
| `RECORDING_PERMISSION_DENIED`  | RECORDING_PERMISSION_DENIED    |
| `IN_CALL_RECORDING`            | IN_CALL_RECORDING              |
| `CALL_ENDED`                   | CALL_ENDED                     |
| `DONE`                         | DONE                           |
| `FATAL`                        | FATAL                          |