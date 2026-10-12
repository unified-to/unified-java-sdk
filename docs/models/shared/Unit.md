# Unit

Unit of quantity

## Example Usage

```java
import to.unified.unified_java_sdk.models.shared.Unit;

Unit value = Unit.GPU_HOUR;

// Open enum: use .of() to create instances from custom string values
Unit custom = Unit.of("custom_value");
```


## Values

| Name          | Value         |
| ------------- | ------------- |
| `GPU_HOUR`    | GPU_HOUR      |
| `VCPU_SECOND` | VCPU_SECOND   |
| `GB_SECOND`   | GB_SECOND     |
| `GB_MONTH`    | GB_MONTH      |
| `BYTE`        | BYTE          |
| `SECOND`      | SECOND        |
| `OTHER`       | OTHER         |