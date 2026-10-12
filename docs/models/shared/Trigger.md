# Trigger

What started the deployment

## Example Usage

```java
import to.unified.unified_java_sdk.models.shared.Trigger;

Trigger value = Trigger.GIT;

// Open enum: use .of() to create instances from custom string values
Trigger custom = Trigger.of("custom_value");
```


## Values

| Name       | Value      |
| ---------- | ---------- |
| `GIT`      | GIT        |
| `MANUAL`   | MANUAL     |
| `API`      | API        |
| `ROLLBACK` | ROLLBACK   |
| `OTHER`    | OTHER      |