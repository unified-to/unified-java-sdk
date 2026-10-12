# ComputeServiceStatus

Normalized status; set to SUSPENDED or LIVE on update to suspend or resume

## Example Usage

```java
import to.unified.unified_java_sdk.models.shared.ComputeServiceStatus;

ComputeServiceStatus value = ComputeServiceStatus.CREATING;

// Open enum: use .of() to create instances from custom string values
ComputeServiceStatus custom = ComputeServiceStatus.of("custom_value");
```


## Values

| Name        | Value       |
| ----------- | ----------- |
| `CREATING`  | CREATING    |
| `DEPLOYING` | DEPLOYING   |
| `LIVE`      | LIVE        |
| `SUSPENDED` | SUSPENDED   |
| `FAILED`    | FAILED      |
| `OTHER`     | OTHER       |