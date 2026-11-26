# PrintingOrderStatus

## Example Usage

```java
import to.unified.unified_java_sdk.models.shared.PrintingOrderStatus;

PrintingOrderStatus value = PrintingOrderStatus.DRAFT;

// Open enum: use .of() to create instances from custom string values
PrintingOrderStatus custom = PrintingOrderStatus.of("custom_value");
```


## Values

| Name                | Value               |
| ------------------- | ------------------- |
| `DRAFT`             | DRAFT               |
| `PENDING`           | PENDING             |
| `ON_HOLD`           | ON_HOLD             |
| `IN_PRODUCTION`     | IN_PRODUCTION       |
| `PARTIALLY_SHIPPED` | PARTIALLY_SHIPPED   |
| `SHIPPED`           | SHIPPED             |
| `DELIVERED`         | DELIVERED           |
| `CANCELLED`         | CANCELLED           |
| `FAILED`            | FAILED              |
| `OTHER`             | OTHER               |