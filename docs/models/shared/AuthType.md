# AuthType

the authentication method to use for this workspace integration; when set, it overrides the default auth-method selection (e.g. force 'token' even when Unified OAUTH credentials exist)

## Example Usage

```java
import to.unified.unified_java_sdk.models.shared.AuthType;

AuthType value = AuthType.OAUTH2;

// Open enum: use .of() to create instances from custom string values
AuthType custom = AuthType.of("custom_value");
```


## Values

| Name     | Value    |
| -------- | -------- |
| `OAUTH2` | oauth2   |
| `OTHER`  | other    |
| `TOKEN`  | token    |