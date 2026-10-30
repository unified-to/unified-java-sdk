# PropertyReservationStatus

the reservation status

## Example Usage

```java
import to.unified.unified_java_sdk.models.shared.PropertyReservationStatus;

PropertyReservationStatus value = PropertyReservationStatus.INQUIRY;

// Open enum: use .of() to create instances from custom string values
PropertyReservationStatus custom = PropertyReservationStatus.of("custom_value");
```


## Values

| Name          | Value         |
| ------------- | ------------- |
| `INQUIRY`     | INQUIRY       |
| `PENDING`     | PENDING       |
| `CONFIRMED`   | CONFIRMED     |
| `CANCELLED`   | CANCELLED     |
| `CHECKED_IN`  | CHECKED_IN    |
| `CHECKED_OUT` | CHECKED_OUT   |
| `NO_SHOW`     | NO_SHOW       |
| `OTHER`       | OTHER         |