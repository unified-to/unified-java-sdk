# ComputeVolumeStatus

Normalized volume status

## Example Usage

```java
import to.unified.unified_java_sdk.models.shared.ComputeVolumeStatus;

ComputeVolumeStatus value = ComputeVolumeStatus.CREATING;

// Open enum: use .of() to create instances from custom string values
ComputeVolumeStatus custom = ComputeVolumeStatus.of("custom_value");
```


## Values

| Name        | Value       |
| ----------- | ----------- |
| `CREATING`  | CREATING    |
| `AVAILABLE` | AVAILABLE   |
| `IN_USE`    | IN_USE      |
| `DELETING`  | DELETING    |
| `ERROR`     | ERROR       |
| `OTHER`     | OTHER       |