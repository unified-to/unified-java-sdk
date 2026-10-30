# SenderType

whether the guest, host or system sent the message

## Example Usage

```java
import to.unified.unified_java_sdk.models.shared.SenderType;

SenderType value = SenderType.GUEST;

// Open enum: use .of() to create instances from custom string values
SenderType custom = SenderType.of("custom_value");
```


## Values

| Name     | Value    |
| -------- | -------- |
| `GUEST`  | GUEST    |
| `HOST`   | HOST     |
| `SYSTEM` | SYSTEM   |