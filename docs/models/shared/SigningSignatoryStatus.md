# SigningSignatoryStatus

## Example Usage

```java
import to.unified.unified_java_sdk.models.shared.SigningSignatoryStatus;

SigningSignatoryStatus value = SigningSignatoryStatus.PENDING;

// Open enum: use .of() to create instances from custom string values
SigningSignatoryStatus custom = SigningSignatoryStatus.of("custom_value");
```


## Values

| Name        | Value       |
| ----------- | ----------- |
| `PENDING`   | PENDING     |
| `SENT`      | SENT        |
| `DELIVERED` | DELIVERED   |
| `SIGNED`    | SIGNED      |
| `DECLINED`  | DECLINED    |
| `ERROR`     | ERROR       |