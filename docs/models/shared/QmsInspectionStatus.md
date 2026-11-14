# QmsInspectionStatus

Normalized status of a quality record

## Example Usage

```java
import to.unified.unified_java_sdk.models.shared.QmsInspectionStatus;

QmsInspectionStatus value = QmsInspectionStatus.OPEN;

// Open enum: use .of() to create instances from custom string values
QmsInspectionStatus custom = QmsInspectionStatus.of("custom_value");
```


## Values

| Name          | Value         |
| ------------- | ------------- |
| `OPEN`        | OPEN          |
| `IN_PROGRESS` | IN_PROGRESS   |
| `IN_REVIEW`   | IN_REVIEW     |
| `CLOSED`      | CLOSED        |
| `CANCELLED`   | CANCELLED     |