# ComputeInstanceType

The kind of compute unit

## Example Usage

```java
import to.unified.unified_java_sdk.models.shared.ComputeInstanceType;

ComputeInstanceType value = ComputeInstanceType.CONTAINER;

// Open enum: use .of() to create instances from custom string values
ComputeInstanceType custom = ComputeInstanceType.of("custom_value");
```


## Values

| Name        | Value       |
| ----------- | ----------- |
| `CONTAINER` | CONTAINER   |
| `VM`        | VM          |
| `BAREMETAL` | BAREMETAL   |
| `SANDBOX`   | SANDBOX     |
| `OTHER`     | OTHER       |