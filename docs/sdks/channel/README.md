# Channel
(*channel()*)

## Overview

### Available Operations

* [getMessagingChannel](#getmessagingchannel) - Retrieve a channel
* [listMessagingChannels](#listmessagingchannels) - List all channels

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
            // handle response
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
            // handle response
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