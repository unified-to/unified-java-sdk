# ComputeKeyType

The kind of credential

## Example Usage

```java
import to.unified.unified_java_sdk.models.shared.ComputeKeyType;

ComputeKeyType value = ComputeKeyType.SSH;

// Open enum: use .of() to create instances from custom string values
ComputeKeyType custom = ComputeKeyType.of("custom_value");
```


## Values

| Name       | Value      |
| ---------- | ---------- |
| `SSH`      | SSH        |
| `REGISTRY` | REGISTRY   |
| `SECRET`   | SECRET     |
| `OTHER`    | OTHER      |