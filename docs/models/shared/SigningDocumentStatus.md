# SigningDocumentStatus

## Example Usage

```java
import to.unified.unified_java_sdk.models.shared.SigningDocumentStatus;

SigningDocumentStatus value = SigningDocumentStatus.DRAFT;

// Open enum: use .of() to create instances from custom string values
SigningDocumentStatus custom = SigningDocumentStatus.of("custom_value");
```


## Values

| Name          | Value         |
| ------------- | ------------- |
| `DRAFT`       | DRAFT         |
| `SENT`        | SENT          |
| `DELIVERED`   | DELIVERED     |
| `IN_PROGRESS` | IN_PROGRESS   |
| `COMPLETED`   | COMPLETED     |
| `DECLINED`    | DECLINED      |
| `VOIDED`      | VOIDED        |
| `EXPIRED`     | EXPIRED       |