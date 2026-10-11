# WebhookType

"native" registers with the integration, which sends events as they happen. "virtual" checks for changes on "interval". Optional on create; if omitted, Unified.to picks a supported type for the object. Requesting a type the integration doesn't support returns 400. Set on create only: changes sent on update are ignored without an error. Delete and recreate the webhook to change type.

## Example Usage

```java
import to.unified.unified_java_sdk.models.shared.WebhookType;

WebhookType value = WebhookType.VIRTUAL;

// Open enum: use .of() to create instances from custom string values
WebhookType custom = WebhookType.of("custom_value");
```


## Values

| Name      | Value     |
| --------- | --------- |
| `VIRTUAL` | virtual   |
| `NATIVE`  | native    |