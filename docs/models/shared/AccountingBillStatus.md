# AccountingBillStatus

## Example Usage

```java
import to.unified.unified_java_sdk.models.shared.AccountingBillStatus;

AccountingBillStatus value = AccountingBillStatus.DRAFT;

// Open enum: use .of() to create instances from custom string values
AccountingBillStatus custom = AccountingBillStatus.of("custom_value");
```


## Values

| Name                 | Value                |
| -------------------- | -------------------- |
| `DRAFT`              | DRAFT                |
| `VOIDED`             | VOIDED               |
| `AUTHORIZED`         | AUTHORIZED           |
| `PAID`               | PAID                 |
| `PARTIALLY_PAID`     | PARTIALLY_PAID       |
| `PARTIALLY_REFUNDED` | PARTIALLY_REFUNDED   |
| `REFUNDED`           | REFUNDED             |
| `SUBMITTED`          | SUBMITTED            |
| `DELETED`            | DELETED              |
| `OVERDUE`            | OVERDUE              |