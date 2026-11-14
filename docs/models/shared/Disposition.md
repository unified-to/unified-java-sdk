# Disposition

What to do with the nonconforming material

## Example Usage

```java
import to.unified.unified_java_sdk.models.shared.Disposition;

Disposition value = Disposition.USE_AS_IS;

// Open enum: use .of() to create instances from custom string values
Disposition custom = Disposition.of("custom_value");
```


## Values

| Name               | Value              |
| ------------------ | ------------------ |
| `USE_AS_IS`        | USE_AS_IS          |
| `REWORK`           | REWORK             |
| `REPAIR`           | REPAIR             |
| `SCRAP`            | SCRAP              |
| `RETURN_TO_VENDOR` | RETURN_TO_VENDOR   |
| `OTHER`            | OTHER              |