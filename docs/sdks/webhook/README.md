# Webhook
(*webhook*)

### Available Operations

* [createUnifiedWebhook](#createunifiedwebhook) - Create webhook subscription
* [getUnifiedWebhook](#getunifiedwebhook) - Retrieve webhook by its ID
* [listUnifiedWebhooks](#listunifiedwebhooks) - Returns all registered webhooks
* [patchUnifiedWebhookTrigger](#patchunifiedwebhooktrigger) - Trigger webhook
* [removeUnifiedWebhook](#removeunifiedwebhook) - Remove webhook subscription
* [updateUnifiedWebhookTrigger](#updateunifiedwebhooktrigger) - Trigger webhook

## createUnifiedWebhook

The data payload received by your server is described at https://docs.unified.to/unified/overview. The `interval` field can be set as low as 1 minute for paid accounts, and 60 minutes for free accounts.

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.CreateUnifiedWebhookRequest;
import com.unifiedapi.unifiedto.models.operations.CreateUnifiedWebhookResponse;
import com.unifiedapi.unifiedto.models.shared.Event;
import com.unifiedapi.unifiedto.models.shared.ObjectType;
import com.unifiedapi.unifiedto.models.shared.Security;
import com.unifiedapi.unifiedto.models.shared.Webhook;
import com.unifiedapi.unifiedto.models.shared.WebhookType;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.CreateUnifiedWebhookRequest req = new CreateUnifiedWebhookRequest(
){{
                webhook = new Webhook(
                    "<value>",
                    Event.CREATED,
                    "<value>",
                    ObjectType.ACCOUNTING_TRANSACTION){{
                    checkedAt = OffsetDateTime.parse("2023-05-18T07:32:59.218Z");
                    createdAt = OffsetDateTime.parse("2023-11-05T05:21:48.024Z");
                    environment = "<value>";
                    fields = "<value>";
                    filters = new java.util.HashMap<String, String>(
                    ){{
                        put("key", "<value>");
                    }};
                    id = "<id>";
                    integrationType = "<value>";
                    interval = 738.04d;
                    isHealthy = false;
                    meta = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "<value>");
                    }};
                    pageMaxLimit = 5349.08d;
                    runs = new String[]{{
                        add("<value>"),
                    }};
                    updatedAt = OffsetDateTime.parse("2024-01-16T23:55:52.787Z");
                    webhookType = WebhookType.NATIVE_;
                    workspaceId = "<value>";

                }};
                includeAll = false;

            }};

            com.unifiedapi.unifiedto.models.operations.CreateUnifiedWebhookResponse res = sdk.webhook.createUnifiedWebhook(req);

            if (res.webhook != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                        | Type                                                                                                                             | Required                                                                                                                         | Description                                                                                                                      |
| -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                        | [com.unifiedapi.unifiedto.models.operations.CreateUnifiedWebhookRequest](../../models/operations/CreateUnifiedWebhookRequest.md) | :heavy_check_mark:                                                                                                               | The request object to use for the request.                                                                                       |


### Response

**[com.unifiedapi.unifiedto.models.operations.CreateUnifiedWebhookResponse](../../models/operations/CreateUnifiedWebhookResponse.md)**


## getUnifiedWebhook

Retrieve webhook by its ID

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetUnifiedWebhookRequest;
import com.unifiedapi.unifiedto.models.operations.GetUnifiedWebhookResponse;
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.GetUnifiedWebhookRequest req = new GetUnifiedWebhookRequest(
                "<value>");

            com.unifiedapi.unifiedto.models.operations.GetUnifiedWebhookResponse res = sdk.webhook.getUnifiedWebhook(req);

            if (res.webhook != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                  | Type                                                                                                                       | Required                                                                                                                   | Description                                                                                                                |
| -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                  | [com.unifiedapi.unifiedto.models.operations.GetUnifiedWebhookRequest](../../models/operations/GetUnifiedWebhookRequest.md) | :heavy_check_mark:                                                                                                         | The request object to use for the request.                                                                                 |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetUnifiedWebhookResponse](../../models/operations/GetUnifiedWebhookResponse.md)**


## listUnifiedWebhooks

Returns all registered webhooks

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.ListUnifiedWebhooksRequest;
import com.unifiedapi.unifiedto.models.operations.ListUnifiedWebhooksResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.ListUnifiedWebhooksRequest req = new ListUnifiedWebhooksRequest(
){{
                env = "<value>";
                limit = 1162.24d;
                object = "<value>";
                offset = 5094.7d;
                order = "<value>";
                sort = "<value>";
                updatedGte = OffsetDateTime.parse("2022-04-20T17:03:56.207Z");

            }};

            com.unifiedapi.unifiedto.models.operations.ListUnifiedWebhooksResponse res = sdk.webhook.listUnifiedWebhooks(req);

            if (res.webhooks != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                      | Type                                                                                                                           | Required                                                                                                                       | Description                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                      | [com.unifiedapi.unifiedto.models.operations.ListUnifiedWebhooksRequest](../../models/operations/ListUnifiedWebhooksRequest.md) | :heavy_check_mark:                                                                                                             | The request object to use for the request.                                                                                     |


### Response

**[com.unifiedapi.unifiedto.models.operations.ListUnifiedWebhooksResponse](../../models/operations/ListUnifiedWebhooksResponse.md)**


## patchUnifiedWebhookTrigger

Trigger webhook

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PatchUnifiedWebhookTriggerRequest;
import com.unifiedapi.unifiedto.models.operations.PatchUnifiedWebhookTriggerResponse;
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.PatchUnifiedWebhookTriggerRequest req = new PatchUnifiedWebhookTriggerRequest(
                "<value>");

            com.unifiedapi.unifiedto.models.operations.PatchUnifiedWebhookTriggerResponse res = sdk.webhook.patchUnifiedWebhookTrigger(req);

            if (res.statusCode == 200) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                    | Type                                                                                                                                         | Required                                                                                                                                     | Description                                                                                                                                  |
| -------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                    | [com.unifiedapi.unifiedto.models.operations.PatchUnifiedWebhookTriggerRequest](../../models/operations/PatchUnifiedWebhookTriggerRequest.md) | :heavy_check_mark:                                                                                                                           | The request object to use for the request.                                                                                                   |


### Response

**[com.unifiedapi.unifiedto.models.operations.PatchUnifiedWebhookTriggerResponse](../../models/operations/PatchUnifiedWebhookTriggerResponse.md)**


## removeUnifiedWebhook

Remove webhook subscription

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.RemoveUnifiedWebhookRequest;
import com.unifiedapi.unifiedto.models.operations.RemoveUnifiedWebhookResponse;
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.RemoveUnifiedWebhookRequest req = new RemoveUnifiedWebhookRequest(
                "<value>");

            com.unifiedapi.unifiedto.models.operations.RemoveUnifiedWebhookResponse res = sdk.webhook.removeUnifiedWebhook(req);

            if (res.statusCode == 200) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                        | Type                                                                                                                             | Required                                                                                                                         | Description                                                                                                                      |
| -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                        | [com.unifiedapi.unifiedto.models.operations.RemoveUnifiedWebhookRequest](../../models/operations/RemoveUnifiedWebhookRequest.md) | :heavy_check_mark:                                                                                                               | The request object to use for the request.                                                                                       |


### Response

**[com.unifiedapi.unifiedto.models.operations.RemoveUnifiedWebhookResponse](../../models/operations/RemoveUnifiedWebhookResponse.md)**


## updateUnifiedWebhookTrigger

Trigger webhook

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.UpdateUnifiedWebhookTriggerRequest;
import com.unifiedapi.unifiedto.models.operations.UpdateUnifiedWebhookTriggerResponse;
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.UpdateUnifiedWebhookTriggerRequest req = new UpdateUnifiedWebhookTriggerRequest(
                "<value>");

            com.unifiedapi.unifiedto.models.operations.UpdateUnifiedWebhookTriggerResponse res = sdk.webhook.updateUnifiedWebhookTrigger(req);

            if (res.statusCode == 200) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                      | Type                                                                                                                                           | Required                                                                                                                                       | Description                                                                                                                                    |
| ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                      | [com.unifiedapi.unifiedto.models.operations.UpdateUnifiedWebhookTriggerRequest](../../models/operations/UpdateUnifiedWebhookTriggerRequest.md) | :heavy_check_mark:                                                                                                                             | The request object to use for the request.                                                                                                     |


### Response

**[com.unifiedapi.unifiedto.models.operations.UpdateUnifiedWebhookTriggerResponse](../../models/operations/UpdateUnifiedWebhookTriggerResponse.md)**

