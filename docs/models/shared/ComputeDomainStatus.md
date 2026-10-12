# ComputeDomainStatus

DNS/ownership verification status

## Example Usage

```java
import to.unified.unified_java_sdk.models.shared.ComputeDomainStatus;

ComputeDomainStatus value = ComputeDomainStatus.PENDING;

// Open enum: use .of() to create instances from custom string values
ComputeDomainStatus custom = ComputeDomainStatus.of("custom_value");
```


## Values

| Name       | Value      |
| ---------- | ---------- |
| `PENDING`  | PENDING    |
| `VERIFIED` | VERIFIED   |
| `FAILED`   | FAILED     |
| `OTHER`    | OTHER      |