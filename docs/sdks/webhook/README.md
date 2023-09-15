# Webhook

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
import com.unifiedapi.unifiedto.models.operations.DeleteUnifiedWebhookIdSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            DeleteUnifiedWebhookIdRequest req = new DeleteUnifiedWebhookIdRequest("officiis");            

            DeleteUnifiedWebhookIdResponse res = sdk.webhook.deleteUnifiedWebhookId(req, new DeleteUnifiedWebhookIdSecurity("ratione") {{
                jwt = "";
            }});

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

| Parameter                                                                                                                              | Type                                                                                                                                   | Required                                                                                                                               | Description                                                                                                                            |
| -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                              | [com.unifiedapi.unifiedto.models.operations.DeleteUnifiedWebhookIdRequest](../../models/operations/DeleteUnifiedWebhookIdRequest.md)   | :heavy_check_mark:                                                                                                                     | The request object to use for the request.                                                                                             |
| `security`                                                                                                                             | [com.unifiedapi.unifiedto.models.operations.DeleteUnifiedWebhookIdSecurity](../../models/operations/DeleteUnifiedWebhookIdSecurity.md) | :heavy_check_mark:                                                                                                                     | The security requirements to use for the request.                                                                                      |


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
import com.unifiedapi.unifiedto.models.operations.GetUnifiedWebhookSecurity;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            GetUnifiedWebhookRequest req = new GetUnifiedWebhookRequest() {{
                env = "consequuntur";
                limit = 2083.1d;
                object = "deserunt";
                offset = 2414.63d;
                order = "inventore";
                sort = "tempore";
                updatedGte = OffsetDateTime.parse("2021-07-03T04:57:46.664Z");
            }};            

            GetUnifiedWebhookResponse res = sdk.webhook.getUnifiedWebhook(req, new GetUnifiedWebhookSecurity("rerum") {{
                jwt = "";
            }});

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

| Parameter                                                                                                                    | Type                                                                                                                         | Required                                                                                                                     | Description                                                                                                                  |
| ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                    | [com.unifiedapi.unifiedto.models.operations.GetUnifiedWebhookRequest](../../models/operations/GetUnifiedWebhookRequest.md)   | :heavy_check_mark:                                                                                                           | The request object to use for the request.                                                                                   |
| `security`                                                                                                                   | [com.unifiedapi.unifiedto.models.operations.GetUnifiedWebhookSecurity](../../models/operations/GetUnifiedWebhookSecurity.md) | :heavy_check_mark:                                                                                                           | The security requirements to use for the request.                                                                            |


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
import com.unifiedapi.unifiedto.models.operations.GetUnifiedWebhookIdSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            GetUnifiedWebhookIdRequest req = new GetUnifiedWebhookIdRequest("laborum");            

            GetUnifiedWebhookIdResponse res = sdk.webhook.getUnifiedWebhookId(req, new GetUnifiedWebhookIdSecurity("architecto") {{
                jwt = "";
            }});

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
| `request`                                                                                                                        | [com.unifiedapi.unifiedto.models.operations.GetUnifiedWebhookIdRequest](../../models/operations/GetUnifiedWebhookIdRequest.md)   | :heavy_check_mark:                                                                                                               | The request object to use for the request.                                                                                       |
| `security`                                                                                                                       | [com.unifiedapi.unifiedto.models.operations.GetUnifiedWebhookIdSecurity](../../models/operations/GetUnifiedWebhookIdSecurity.md) | :heavy_check_mark:                                                                                                               | The security requirements to use for the request.                                                                                |


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
import com.unifiedapi.unifiedto.models.operations.PostUnifiedWebhookConnectionIdObjectSecurity;
import com.unifiedapi.unifiedto.models.shared.PropertyWebhookEvents;
import com.unifiedapi.unifiedto.models.shared.Webhook;
import com.unifiedapi.unifiedto.models.shared.WebhookObjectType;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            PostUnifiedWebhookConnectionIdObjectRequest req = new PostUnifiedWebhookConnectionIdObjectRequest("quod", "minus") {{
                webhook = new Webhook("molestias",                 new com.unifiedapi.unifiedto.models.shared.PropertyWebhookEvents[]{{
                                    add(PropertyWebhookEvents.UPDATED),
                                }}, "nihil", "inventore", 4025.15d, WebhookObjectType.TICKETING_CUSTOMER, "deleniti") {{
                    checkedAt = OffsetDateTime.parse("2022-11-07T09:41:32.181Z");
                    createdAt = OffsetDateTime.parse("2020-08-22T20:12:43.406Z");
                    environment = "sint";
                    id = "e0c7d9d3-23f1-4aa6-bed9-cf1c856bcba5";
                    includeRaw = false;
                    subscriptions = new String[]{{
                        add("inventore"),
                    }};
                    updatedAt = OffsetDateTime.parse("2020-01-22T02:04:50.343Z");
                }};;
                events = new com.unifiedapi.unifiedto.models.operations.PostUnifiedWebhookConnectionIdObjectEvents[]{{
                    add(PostUnifiedWebhookConnectionIdObjectEvents.UPDATED),
                }};
            }};            

            PostUnifiedWebhookConnectionIdObjectResponse res = sdk.webhook.postUnifiedWebhookConnectionIdObject(req, new PostUnifiedWebhookConnectionIdObjectSecurity("numquam") {{
                jwt = "";
            }});

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

| Parameter                                                                                                                                                          | Type                                                                                                                                                               | Required                                                                                                                                                           | Description                                                                                                                                                        |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                          | [com.unifiedapi.unifiedto.models.operations.PostUnifiedWebhookConnectionIdObjectRequest](../../models/operations/PostUnifiedWebhookConnectionIdObjectRequest.md)   | :heavy_check_mark:                                                                                                                                                 | The request object to use for the request.                                                                                                                         |
| `security`                                                                                                                                                         | [com.unifiedapi.unifiedto.models.operations.PostUnifiedWebhookConnectionIdObjectSecurity](../../models/operations/PostUnifiedWebhookConnectionIdObjectSecurity.md) | :heavy_check_mark:                                                                                                                                                 | The security requirements to use for the request.                                                                                                                  |


### Response

**[com.unifiedapi.unifiedto.models.operations.PostUnifiedWebhookConnectionIdObjectResponse](../../models/operations/PostUnifiedWebhookConnectionIdObjectResponse.md)**

