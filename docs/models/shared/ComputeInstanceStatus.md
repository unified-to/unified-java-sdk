# ComputeInstanceStatus

Normalized lifecycle status; set on update to start, stop, pause, resume, restart or terminate

## Example Usage

```java
import to.unified.unified_java_sdk.models.shared.ComputeInstanceStatus;

ComputeInstanceStatus value = ComputeInstanceStatus.PROVISIONING;

// Open enum: use .of() to create instances from custom string values
ComputeInstanceStatus custom = ComputeInstanceStatus.of("custom_value");
```


## Values

| Name           | Value          |
| -------------- | -------------- |
| `PROVISIONING` | PROVISIONING   |
| `STARTING`     | STARTING       |
| `RUNNING`      | RUNNING        |
| `STOPPING`     | STOPPING       |
| `STOPPED`      | STOPPED        |
| `PAUSING`      | PAUSING        |
| `PAUSED`       | PAUSED         |
| `RESUMING`     | RESUMING       |
| `RESTARTING`   | RESTARTING     |
| `TERMINATING`  | TERMINATING    |
| `TERMINATED`   | TERMINATED     |
| `PREEMPTED`    | PREEMPTED      |
| `ERROR`        | ERROR          |
| `OTHER`        | OTHER          |