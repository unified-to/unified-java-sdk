# WebhookEvent

The event to subscribe to. "deleted" is supported on native webhooks, and on virtual webhooks where the integration supports it. Check the integration's Feature Support tab.

## Example Usage

```java
import to.unified.unified_java_sdk.models.shared.WebhookEvent;

WebhookEvent value = WebhookEvent.UPDATED;

// Open enum: use .of() to create instances from custom string values
WebhookEvent custom = WebhookEvent.of("custom_value");
```


## Values

| Name      | Value     |
| --------- | --------- |
| `UPDATED` | updated   |
| `CREATED` | created   |
| `DELETED` | deleted   |