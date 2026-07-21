# Channel

## Overview

### Available Operations

* [createMessagingChannel](#createmessagingchannel) - Create a channel
* [getMessagingChannel](#getmessagingchannel) - Retrieve a channel
* [listMessagingChannels](#listmessagingchannels) - List all channels
* [patchMessagingChannel](#patchmessagingchannel) - Update a channel
* [removeMessagingChannel](#removemessagingchannel) - Remove a channel
* [updateMessagingChannel](#updatemessagingchannel) - Update a channel

## createMessagingChannel

Create a channel

### Example Usage

<!-- UsageSnippet language="java" operationID="createMessagingChannel" method="post" path="/messaging/{connection_id}/channel" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateMessagingChannelRequest;
import to.unified.unified_java_sdk.models.operations.CreateMessagingChannelResponse;
import to.unified.unified_java_sdk.models.shared.MessagingChannel;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateMessagingChannelRequest req = CreateMessagingChannelRequest.builder()
                .messagingChannel(MessagingChannel.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateMessagingChannelResponse res = sdk.channel().createMessagingChannel()
                .request(req)
                .call();

        if (res.messagingChannel().isPresent()) {
            System.out.println(res.messagingChannel().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [CreateMessagingChannelRequest](../../models/operations/CreateMessagingChannelRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[CreateMessagingChannelResponse](../../models/operations/CreateMessagingChannelResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getMessagingChannel

Retrieve a channel

### Example Usage

<!-- UsageSnippet language="java" operationID="getMessagingChannel" method="get" path="/messaging/{connection_id}/channel/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetMessagingChannelRequest;
import to.unified.unified_java_sdk.models.operations.GetMessagingChannelResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetMessagingChannelRequest req = GetMessagingChannelRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetMessagingChannelResponse res = sdk.channel().getMessagingChannel()
                .request(req)
                .call();

        if (res.messagingChannel().isPresent()) {
            System.out.println(res.messagingChannel().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [GetMessagingChannelRequest](../../models/operations/GetMessagingChannelRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[GetMessagingChannelResponse](../../models/operations/GetMessagingChannelResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listMessagingChannels

List all channels

### Example Usage

<!-- UsageSnippet language="java" operationID="listMessagingChannels" method="get" path="/messaging/{connection_id}/channel" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListMessagingChannelsRequest;
import to.unified.unified_java_sdk.models.operations.ListMessagingChannelsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListMessagingChannelsRequest req = ListMessagingChannelsRequest.builder()
                .connectionId("<id>")
                .build();

        ListMessagingChannelsResponse res = sdk.channel().listMessagingChannels()
                .request(req)
                .call();

        if (res.messagingChannels().isPresent()) {
            System.out.println(res.messagingChannels().get());
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [ListMessagingChannelsRequest](../../models/operations/ListMessagingChannelsRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[ListMessagingChannelsResponse](../../models/operations/ListMessagingChannelsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchMessagingChannel

Update a channel

### Example Usage

<!-- UsageSnippet language="java" operationID="patchMessagingChannel" method="patch" path="/messaging/{connection_id}/channel/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchMessagingChannelRequest;
import to.unified.unified_java_sdk.models.operations.PatchMessagingChannelResponse;
import to.unified.unified_java_sdk.models.shared.MessagingChannel;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchMessagingChannelRequest req = PatchMessagingChannelRequest.builder()
                .messagingChannel(MessagingChannel.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchMessagingChannelResponse res = sdk.channel().patchMessagingChannel()
                .request(req)
                .call();

        if (res.messagingChannel().isPresent()) {
            System.out.println(res.messagingChannel().get());
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [PatchMessagingChannelRequest](../../models/operations/PatchMessagingChannelRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[PatchMessagingChannelResponse](../../models/operations/PatchMessagingChannelResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeMessagingChannel

Remove a channel

### Example Usage

<!-- UsageSnippet language="java" operationID="removeMessagingChannel" method="delete" path="/messaging/{connection_id}/channel/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveMessagingChannelRequest;
import to.unified.unified_java_sdk.models.operations.RemoveMessagingChannelResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveMessagingChannelRequest req = RemoveMessagingChannelRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveMessagingChannelResponse res = sdk.channel().removeMessagingChannel()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [RemoveMessagingChannelRequest](../../models/operations/RemoveMessagingChannelRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[RemoveMessagingChannelResponse](../../models/operations/RemoveMessagingChannelResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateMessagingChannel

Update a channel

### Example Usage

<!-- UsageSnippet language="java" operationID="updateMessagingChannel" method="put" path="/messaging/{connection_id}/channel/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateMessagingChannelRequest;
import to.unified.unified_java_sdk.models.operations.UpdateMessagingChannelResponse;
import to.unified.unified_java_sdk.models.shared.MessagingChannel;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateMessagingChannelRequest req = UpdateMessagingChannelRequest.builder()
                .messagingChannel(MessagingChannel.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateMessagingChannelResponse res = sdk.channel().updateMessagingChannel()
                .request(req)
                .call();

        if (res.messagingChannel().isPresent()) {
            System.out.println(res.messagingChannel().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [UpdateMessagingChannelRequest](../../models/operations/UpdateMessagingChannelRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[UpdateMessagingChannelResponse](../../models/operations/UpdateMessagingChannelResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |