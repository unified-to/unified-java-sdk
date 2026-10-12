# OnExpire

What happens when the instance expires

## Example Usage

```java
import to.unified.unified_java_sdk.models.shared.OnExpire;

OnExpire value = OnExpire.TERMINATE;

// Open enum: use .of() to create instances from custom string values
OnExpire custom = OnExpire.of("custom_value");
```


## Values

| Name        | Value       |
| ----------- | ----------- |
| `TERMINATE` | TERMINATE   |
| `PAUSE`     | PAUSE       |
| `STOP`      | STOP        |
| `OTHER`     | OTHER       |