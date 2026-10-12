# ComputeSnapshotStatus

Normalized snapshot status

## Example Usage

```java
import to.unified.unified_java_sdk.models.shared.ComputeSnapshotStatus;

ComputeSnapshotStatus value = ComputeSnapshotStatus.CREATING;

// Open enum: use .of() to create instances from custom string values
ComputeSnapshotStatus custom = ComputeSnapshotStatus.of("custom_value");
```


## Values

| Name       | Value      |
| ---------- | ---------- |
| `CREATING` | CREATING   |
| `READY`    | READY      |
| `FAILED`   | FAILED     |
| `DELETING` | DELETING   |
| `OTHER`    | OTHER      |