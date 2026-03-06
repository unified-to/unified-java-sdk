# MessagingEventType

## Example Usage

```java
import to.unified.unified_java_sdk.models.shared.MessagingEventType;

MessagingEventType value = MessagingEventType.MESSAGE_RECEIVED;

// Open enum: use .of() to create instances from custom string values
MessagingEventType custom = MessagingEventType.of("custom_value");
```


## Values

| Name               | Value              |
| ------------------ | ------------------ |
| `MESSAGE_RECEIVED` | MESSAGE_RECEIVED   |
| `REACTION_ADDED`   | REACTION_ADDED     |
| `REACTION_REMOVED` | REACTION_REMOVED   |
| `BUTTON_CLICK`     | BUTTON_CLICK       |
| `APP_MENTION`      | APP_MENTION        |
| `CHANNEL_JOINED`   | CHANNEL_JOINED     |
| `CHANNEL_LEFT`     | CHANNEL_LEFT       |
| `CHANNEL_CREATED`  | CHANNEL_CREATED    |
| `CHANNEL_DELETED`  | CHANNEL_DELETED    |
| `USER_CREATED`     | USER_CREATED       |
| `USER_DELETED`     | USER_DELETED       |
| `USER_UPDATED`     | USER_UPDATED       |