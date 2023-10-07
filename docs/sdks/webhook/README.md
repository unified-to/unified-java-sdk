# Webhook
(*webhook*)

### Available Operations

* [deleteUnifiedWebhookId](#deleteunifiedwebhookid) - Remove webhook subscription
* [getUnifiedWebhook](#getunifiedwebhook) - Returns all registered webhooks
* [getUnifiedWebhookId](#getunifiedwebhookid) - Retrieve webhook by its ID
* [postUnifiedWebhookConnectionIdObject](#postunifiedwebhookconnectionidobject) - Create webhook subscription

## deleteUnifiedWebhookId

Remove webhook subscription

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.DeleteUnifiedWebhookIdRequest;
import com.unifiedapi.unifiedto.models.operations.DeleteUnifiedWebhookIdResponse;
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("North"){{
                    jwt = "";
                }})
                .build();

            DeleteUnifiedWebhookIdRequest req = new DeleteUnifiedWebhookIdRequest("optio");            

            DeleteUnifiedWebhookIdResponse res = sdk.webhook.deleteUnifiedWebhookId(req);

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

| Parameter                                                                                                                            | Type                                                                                                                                 | Required                                                                                                                             | Description                                                                                                                          |
| ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                            | [com.unifiedapi.unifiedto.models.operations.DeleteUnifiedWebhookIdRequest](../../models/operations/DeleteUnifiedWebhookIdRequest.md) | :heavy_check_mark:                                                                                                                   | The request object to use for the request.                                                                                           |


### Response

**[com.unifiedapi.unifiedto.models.operations.DeleteUnifiedWebhookIdResponse](../../models/operations/DeleteUnifiedWebhookIdResponse.md)**


## getUnifiedWebhook

Returns all registered webhooks

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetUnifiedWebhookRequest;
import com.unifiedapi.unifiedto.models.operations.GetUnifiedWebhookResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("proud"){{
                    jwt = "";
                }})
                .build();

            GetUnifiedWebhookRequest req = new GetUnifiedWebhookRequest(){{
                env = "methodical Fitness";
                limit = 8087.22d;
                object = "Franc past salmon";
                offset = 5240.75d;
                order = "program";
                sort = "below JSON";
                updatedGte = OffsetDateTime.parse("2022-05-29T13:22:55.562Z");
            }};            

            GetUnifiedWebhookResponse res = sdk.webhook.getUnifiedWebhook(req);

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

| Parameter                                                                                                                  | Type                                                                                                                       | Required                                                                                                                   | Description                                                                                                                |
| -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                  | [com.unifiedapi.unifiedto.models.operations.GetUnifiedWebhookRequest](../../models/operations/GetUnifiedWebhookRequest.md) | :heavy_check_mark:                                                                                                         | The request object to use for the request.                                                                                 |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetUnifiedWebhookResponse](../../models/operations/GetUnifiedWebhookResponse.md)**


## getUnifiedWebhookId

Retrieve webhook by its ID

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetUnifiedWebhookIdRequest;
import com.unifiedapi.unifiedto.models.operations.GetUnifiedWebhookIdResponse;
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("up"){{
                    jwt = "";
                }})
                .build();

            GetUnifiedWebhookIdRequest req = new GetUnifiedWebhookIdRequest("optical");            

            GetUnifiedWebhookIdResponse res = sdk.webhook.getUnifiedWebhookId(req);

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

| Parameter                                                                                                                      | Type                                                                                                                           | Required                                                                                                                       | Description                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                      | [com.unifiedapi.unifiedto.models.operations.GetUnifiedWebhookIdRequest](../../models/operations/GetUnifiedWebhookIdRequest.md) | :heavy_check_mark:                                                                                                             | The request object to use for the request.                                                                                     |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetUnifiedWebhookIdResponse](../../models/operations/GetUnifiedWebhookIdResponse.md)**


## postUnifiedWebhookConnectionIdObject

To maintain compatibility with the webhooks specification and Zapier webhooks, only the hook_url field is required in the payload when creating a Webhook.  When updated/new objects are found, the array of objects will be POSTed to the hook_url with the paramater hookId=<hookId>.

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PostUnifiedWebhookConnectionIdObjectEvents;
import com.unifiedapi.unifiedto.models.operations.PostUnifiedWebhookConnectionIdObjectRequest;
import com.unifiedapi.unifiedto.models.operations.PostUnifiedWebhookConnectionIdObjectResponse;
import com.unifiedapi.unifiedto.models.shared.PropertyWebhookEvents;
import com.unifiedapi.unifiedto.models.shared.Security;
import com.unifiedapi.unifiedto.models.shared.Webhook;
import com.unifiedapi.unifiedto.models.shared.WebhookObjectType;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("Arab"){{
                    jwt = "";
                }})
                .build();

            PostUnifiedWebhookConnectionIdObjectRequest req = new PostUnifiedWebhookConnectionIdObjectRequest("tan", "siemens"){{
                webhook = new Webhook("National", new com.unifiedapi.unifiedto.models.shared.PropertyWebhookEvents[]{{
                    add(PropertyWebhookEvents.CREATED),
                }}, "GB", "Rustic", 4473.47d, WebhookObjectType.CRM_COMPANY, "Demigender"){{
                    checkedAt = OffsetDateTime.parse("2023-06-13T05:29:12.399Z");
                    createdAt = OffsetDateTime.parse("2021-08-23T13:47:22.712Z");
                    environment = "female ken";
                    id = "<ID>";
                    includeRaw = false;
                    subscriptions = new String[]{{
                        add("Bronze"),
                    }};
                    updatedAt = OffsetDateTime.parse("2023-02-10T01:49:37.759Z");
                }};
                events = new com.unifiedapi.unifiedto.models.operations.PostUnifiedWebhookConnectionIdObjectEvents[]{{
                    add(PostUnifiedWebhookConnectionIdObjectEvents.UPDATED),
                }};
            }};            

            PostUnifiedWebhookConnectionIdObjectResponse res = sdk.webhook.postUnifiedWebhookConnectionIdObject(req);

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

| Parameter                                                                                                                                                        | Type                                                                                                                                                             | Required                                                                                                                                                         | Description                                                                                                                                                      |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                        | [com.unifiedapi.unifiedto.models.operations.PostUnifiedWebhookConnectionIdObjectRequest](../../models/operations/PostUnifiedWebhookConnectionIdObjectRequest.md) | :heavy_check_mark:                                                                                                                                               | The request object to use for the request.                                                                                                                       |


### Response

**[com.unifiedapi.unifiedto.models.operations.PostUnifiedWebhookConnectionIdObjectResponse](../../models/operations/PostUnifiedWebhookConnectionIdObjectResponse.md)**

