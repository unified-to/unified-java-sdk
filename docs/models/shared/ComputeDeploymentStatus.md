# ComputeDeploymentStatus

Normalized deployment status; set to CANCELED on update to cancel

## Example Usage

```java
import to.unified.unified_java_sdk.models.shared.ComputeDeploymentStatus;

ComputeDeploymentStatus value = ComputeDeploymentStatus.QUEUED;

// Open enum: use .of() to create instances from custom string values
ComputeDeploymentStatus custom = ComputeDeploymentStatus.of("custom_value");
```


## Values

| Name         | Value        |
| ------------ | ------------ |
| `QUEUED`     | QUEUED       |
| `BUILDING`   | BUILDING     |
| `DEPLOYING`  | DEPLOYING    |
| `LIVE`       | LIVE         |
| `FAILED`     | FAILED       |
| `CANCELED`   | CANCELED     |
| `SUPERSEDED` | SUPERSEDED   |
| `OTHER`      | OTHER        |