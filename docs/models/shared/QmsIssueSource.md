# QmsIssueSource

Where a quality issue was found

## Example Usage

```java
import to.unified.unified_java_sdk.models.shared.QmsIssueSource;

QmsIssueSource value = QmsIssueSource.INTERNAL;

// Open enum: use .of() to create instances from custom string values
QmsIssueSource custom = QmsIssueSource.of("custom_value");
```


## Values

| Name       | Value      |
| ---------- | ---------- |
| `INTERNAL` | INTERNAL   |
| `SUPPLIER` | SUPPLIER   |
| `CUSTOMER` | CUSTOMER   |
| `AUDIT`    | AUDIT      |
| `OTHER`    | OTHER      |