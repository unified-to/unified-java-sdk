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

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.CreateUnifiedWebhookRequest;
import com.unifiedapi.unifiedto.models.operations.CreateUnifiedWebhookResponse;
import com.unifiedapi.unifiedto.models.shared.Event;
import com.unifiedapi.unifiedto.models.shared.ObjectType;
import com.unifiedapi.unifiedto.models.shared.Security;
import com.unifiedapi.unifiedto.models.shared.Webhook;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        CreateUnifiedWebhookRequest req = CreateUnifiedWebhookRequest.builder()
                .webhook(Webhook.builder()
                    .connectionId("<id>")
                    .event(Event.CREATED)
                    .objectType(ObjectType.HRIS_EMPLOYEE)
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

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetUnifiedWebhookRequest;
import com.unifiedapi.unifiedto.models.operations.GetUnifiedWebhookResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
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

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.ListUnifiedWebhooksRequest;
import com.unifiedapi.unifiedto.models.operations.ListUnifiedWebhooksResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        ListUnifiedWebhooksRequest req = ListUnifiedWebhooksRequest.builder()
                .build();

        ListUnifiedWebhooksResponse res = sdk.webhook().listUnifiedWebhooks()
                .request(req)
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

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PatchUnifiedWebhookRequest;
import com.unifiedapi.unifiedto.models.operations.PatchUnifiedWebhookResponse;
import com.unifiedapi.unifiedto.models.shared.Event;
import com.unifiedapi.unifiedto.models.shared.ObjectType;
import com.unifiedapi.unifiedto.models.shared.Security;
import com.unifiedapi.unifiedto.models.shared.Webhook;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        PatchUnifiedWebhookRequest req = PatchUnifiedWebhookRequest.builder()
                .webhook(Webhook.builder()
                    .connectionId("<id>")
                    .event(Event.DELETED)
                    .objectType(ObjectType.CRM_DEAL)
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

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PatchUnifiedWebhookTriggerRequest;
import com.unifiedapi.unifiedto.models.operations.PatchUnifiedWebhookTriggerResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
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

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.RemoveUnifiedWebhookRequest;
import com.unifiedapi.unifiedto.models.operations.RemoveUnifiedWebhookResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
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

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.UpdateUnifiedWebhookRequest;
import com.unifiedapi.unifiedto.models.operations.UpdateUnifiedWebhookResponse;
import com.unifiedapi.unifiedto.models.shared.Event;
import com.unifiedapi.unifiedto.models.shared.ObjectType;
import com.unifiedapi.unifiedto.models.shared.Security;
import com.unifiedapi.unifiedto.models.shared.Webhook;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        UpdateUnifiedWebhookRequest req = UpdateUnifiedWebhookRequest.builder()
                .webhook(Webhook.builder()
                    .connectionId("<id>")
                    .event(Event.CREATED)
                    .objectType(ObjectType.PAYMENT_LINK)
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

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.UpdateUnifiedWebhookTriggerRequest;
import com.unifiedapi.unifiedto.models.operations.UpdateUnifiedWebhookTriggerResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
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