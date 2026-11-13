# AdsInventoryStatus

## Example Usage

```java
import to.unified.unified_java_sdk.models.shared.AdsInventoryStatus;

AdsInventoryStatus value = AdsInventoryStatus.UNSPECIFIED;

// Open enum: use .of() to create instances from custom string values
AdsInventoryStatus custom = AdsInventoryStatus.of("custom_value");
```


## Values

| Name                     | Value                    |
| ------------------------ | ------------------------ |
| `UNSPECIFIED`            | UNSPECIFIED              |
| `ACTIVE`                 | ACTIVE                   |
| `PAUSED`                 | PAUSED                   |
| `ARCHIVED`               | ARCHIVED                 |
| `DRAFT`                  | DRAFT                    |
| `SCHEDULED_FOR_DELETION` | SCHEDULED_FOR_DELETION   |
| `PROCESSING`             | PROCESSING               |
| `PROCESSING_FAILED`      | PROCESSING_FAILED        |