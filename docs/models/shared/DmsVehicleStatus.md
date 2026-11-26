# DmsVehicleStatus

Stock status; only set for inventory units

## Example Usage

```java
import to.unified.unified_java_sdk.models.shared.DmsVehicleStatus;

DmsVehicleStatus value = DmsVehicleStatus.AVAILABLE;

// Open enum: use .of() to create instances from custom string values
DmsVehicleStatus custom = DmsVehicleStatus.of("custom_value");
```


## Values

| Name          | Value         |
| ------------- | ------------- |
| `AVAILABLE`   | AVAILABLE     |
| `ON_ORDER`    | ON_ORDER      |
| `IN_TRANSIT`  | IN_TRANSIT    |
| `RESERVED`    | RESERVED      |
| `SOLD`        | SOLD          |
| `UNAVAILABLE` | UNAVAILABLE   |
| `OTHER`       | OTHER         |