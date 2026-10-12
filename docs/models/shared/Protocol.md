# Protocol

The protocol served on this port

## Example Usage

```java
import to.unified.unified_java_sdk.models.shared.Protocol;

Protocol value = Protocol.HTTP;

// Open enum: use .of() to create instances from custom string values
Protocol custom = Protocol.of("custom_value");
```


## Values

| Name    | Value   |
| ------- | ------- |
| `HTTP`  | HTTP    |
| `HTTPS` | HTTPS   |
| `TCP`   | TCP     |
| `UDP`   | UDP     |
| `OTHER` | OTHER   |