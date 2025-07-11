# Webhook
(*webhook()*)

## Overview

### Available Operations

* [createUnifiedWebhook](#createunifiedwebhook) - Create webhook subscription
* [getUnifiedWebhook](#getunifiedwebhook) - Retrieve webhook by its ID
* [listUnifiedWebhooks](#listunifiedwebhooks) - Returns all registered webhooks
* [patchUnifiedWebhook](#patchunifiedwebhook) - Update webhook subscription
* [patchUnifiedWebhookTrigger](#patchunifiedwebhooktrigger) - Trigger webhook
* [removeUnifiedWebhook](#removeunifiedwebhook) - Remove webhook subscription
* [updateUnifiedWebhook](#updateunifiedwebhook) - Update webhook subscription
* [updateUnifiedWebhookTrigger](#updateunifiedwebhooktrigger) - Trigger webhook

## createUnifiedWebhook

The data payload received by your server is described at https://docs.unified.to/unified/overview. The `interval` field can be set as low as 1 minute for paid accounts, and 60 minutes for free accounts.

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateUnifiedWebhookRequest;
import to.unified.unified_java_sdk.models.operations.CreateUnifiedWebhookResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateUnifiedWebhookRequest req = CreateUnifiedWebhookRequest.builder()
                .webhook(Webhook.builder()
                    .connectionId("<id>")
                    .event(Event.CREATED)
                    .objectType(ObjectType.ATS_SCORECARD)
                    .build())
                .build();

        CreateUnifiedWebhookResponse res = sdk.webhook().createUnifiedWebhook()
                .request(req)
                .call();

        if (res.webhook().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [CreateUnifiedWebhookRequest](../../models/operations/CreateUnifiedWebhookRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[CreateUnifiedWebhookResponse](../../models/operations/CreateUnifiedWebhookResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getUnifiedWebhook

Retrieve webhook by its ID

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetUnifiedWebhookRequest;
import to.unified.unified_java_sdk.models.operations.GetUnifiedWebhookResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetUnifiedWebhookRequest req = GetUnifiedWebhookRequest.builder()
                .id("<id>")
                .build();

        GetUnifiedWebhookResponse res = sdk.webhook().getUnifiedWebhook()
                .request(req)
                .call();

        if (res.webhook().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [GetUnifiedWebhookRequest](../../models/operations/GetUnifiedWebhookRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[GetUnifiedWebhookResponse](../../models/operations/GetUnifiedWebhookResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listUnifiedWebhooks

Returns all registered webhooks

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListUnifiedWebhooksResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListUnifiedWebhooksResponse res = sdk.webhook().listUnifiedWebhooks()
                .call();

        if (res.webhooks().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [ListUnifiedWebhooksRequest](../../models/operations/ListUnifiedWebhooksRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[ListUnifiedWebhooksResponse](../../models/operations/ListUnifiedWebhooksResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchUnifiedWebhook

Update webhook subscription

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchUnifiedWebhookRequest;
import to.unified.unified_java_sdk.models.operations.PatchUnifiedWebhookResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchUnifiedWebhookRequest req = PatchUnifiedWebhookRequest.builder()
                .webhook(Webhook.builder()
                    .connectionId("<id>")
                    .event(Event.UPDATED)
                    .objectType(ObjectType.TICKETING_TICKET)
                    .build())
                .id("<id>")
                .build();

        PatchUnifiedWebhookResponse res = sdk.webhook().patchUnifiedWebhook()
                .request(req)
                .call();

        if (res.webhook().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [PatchUnifiedWebhookRequest](../../models/operations/PatchUnifiedWebhookRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[PatchUnifiedWebhookResponse](../../models/operations/PatchUnifiedWebhookResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchUnifiedWebhookTrigger

Trigger webhook

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchUnifiedWebhookTriggerRequest;
import to.unified.unified_java_sdk.models.operations.PatchUnifiedWebhookTriggerResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchUnifiedWebhookTriggerRequest req = PatchUnifiedWebhookTriggerRequest.builder()
                .id("<id>")
                .build();

        PatchUnifiedWebhookTriggerResponse res = sdk.webhook().patchUnifiedWebhookTrigger()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                         | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `request`                                                                                         | [PatchUnifiedWebhookTriggerRequest](../../models/operations/PatchUnifiedWebhookTriggerRequest.md) | :heavy_check_mark:                                                                                | The request object to use for the request.                                                        |

### Response

**[PatchUnifiedWebhookTriggerResponse](../../models/operations/PatchUnifiedWebhookTriggerResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeUnifiedWebhook

Remove webhook subscription

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveUnifiedWebhookRequest;
import to.unified.unified_java_sdk.models.operations.RemoveUnifiedWebhookResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveUnifiedWebhookRequest req = RemoveUnifiedWebhookRequest.builder()
                .id("<id>")
                .build();

        RemoveUnifiedWebhookResponse res = sdk.webhook().removeUnifiedWebhook()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [RemoveUnifiedWebhookRequest](../../models/operations/RemoveUnifiedWebhookRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[RemoveUnifiedWebhookResponse](../../models/operations/RemoveUnifiedWebhookResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateUnifiedWebhook

Update webhook subscription

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateUnifiedWebhookRequest;
import to.unified.unified_java_sdk.models.operations.UpdateUnifiedWebhookResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateUnifiedWebhookRequest req = UpdateUnifiedWebhookRequest.builder()
                .webhook(Webhook.builder()
                    .connectionId("<id>")
                    .event(Event.DELETED)
                    .objectType(ObjectType.MESSAGING_CHANNEL)
                    .build())
                .id("<id>")
                .build();

        UpdateUnifiedWebhookResponse res = sdk.webhook().updateUnifiedWebhook()
                .request(req)
                .call();

        if (res.webhook().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [UpdateUnifiedWebhookRequest](../../models/operations/UpdateUnifiedWebhookRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[UpdateUnifiedWebhookResponse](../../models/operations/UpdateUnifiedWebhookResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateUnifiedWebhookTrigger

Trigger webhook

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateUnifiedWebhookTriggerRequest;
import to.unified.unified_java_sdk.models.operations.UpdateUnifiedWebhookTriggerResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateUnifiedWebhookTriggerRequest req = UpdateUnifiedWebhookTriggerRequest.builder()
                .id("<id>")
                .build();

        UpdateUnifiedWebhookTriggerResponse res = sdk.webhook().updateUnifiedWebhookTrigger()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                           | Type                                                                                                | Required                                                                                            | Description                                                                                         |
| --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- |
| `request`                                                                                           | [UpdateUnifiedWebhookTriggerRequest](../../models/operations/UpdateUnifiedWebhookTriggerRequest.md) | :heavy_check_mark:                                                                                  | The request object to use for the request.                                                          |

### Response

**[UpdateUnifiedWebhookTriggerResponse](../../models/operations/UpdateUnifiedWebhookTriggerResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |