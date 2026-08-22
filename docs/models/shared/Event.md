# Event

## Example Usage

```java
import to.unified.unified_java_sdk.models.shared.Event;

Event value = Event.USER_CREATED;

// Open enum: use .of() to create instances from custom string values
Event custom = Event.of("custom_value");
```


## Values

| Name                        | Value                       |
| --------------------------- | --------------------------- |
| `USER_CREATED`              | USER_CREATED                |
| `USER_DELETED`              | USER_DELETED                |
| `CONNECTION_HEALTHY`        | CONNECTION_HEALTHY          |
| `CONNECTION_UNHEALTHY`      | CONNECTION_UNHEALTHY        |
| `CONNECTION_CREATED`        | CONNECTION_CREATED          |
| `CONNECTION_UPDATED`        | CONNECTION_UPDATED          |
| `CONNECTION_DELETED`        | CONNECTION_DELETED          |
| `CONNECTION_PAUSED`         | CONNECTION_PAUSED           |
| `CONNECTION_UNPAUSED`       | CONNECTION_UNPAUSED         |
| `INTEGRATION_ACTIVATED`     | INTEGRATION_ACTIVATED       |
| `INTEGRATION_DEACTIVATED`   | INTEGRATION_DEACTIVATED     |
| `INTEGRATION_UPDATED`       | INTEGRATION_UPDATED         |
| `WORKSPACE_UPDATED`         | WORKSPACE_UPDATED           |
| `WORKSPACE_OVER_LIMIT`      | WORKSPACE_OVER_LIMIT        |
| `WORKSPACE80_PERCENT_LIMIT` | WORKSPACE_80PERCENT_LIMIT   |
| `WEBHOOK_CREATED`           | WEBHOOK_CREATED             |
| `WEBHOOK_DELETED`           | WEBHOOK_DELETED             |
| `WEBHOOK_UNHEALTHY`         | WEBHOOK_UNHEALTHY           |
| `WEBHOOK_PAUSED`            | WEBHOOK_PAUSED              |
| `WEBHOOK_UNPAUSED`          | WEBHOOK_UNPAUSED            |