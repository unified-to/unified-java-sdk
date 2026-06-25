# Channel

## Overview

### Available Operations

* [getMessagingChannel2](#getmessagingchannel2) - Retrieve a channel
* [listMessagingChannels2](#listmessagingchannels2) - List all channels

## getMessagingChannel2

Retrieve a channel

### Example Usage

<!-- UsageSnippet language="java" operationID="getMessagingChannel2" method="get" path="/messaging/{connection_id}/channel/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetMessagingChannel2Request;
import to.unified.unified_java_sdk.models.operations.GetMessagingChannel2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetMessagingChannel2Request req = GetMessagingChannel2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetMessagingChannel2Response res = sdk.channel().getMessagingChannel2()
                .request(req)
                .call();

        if (res.messagingChannel().isPresent()) {
            System.out.println(res.messagingChannel().get());
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [GetMessagingChannel2Request](../../models/operations/GetMessagingChannel2Request.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[GetMessagingChannel2Response](../../models/operations/GetMessagingChannel2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listMessagingChannels2

List all channels

### Example Usage

<!-- UsageSnippet language="java" operationID="listMessagingChannels2" method="get" path="/messaging/{connection_id}/channel" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListMessagingChannels2Request;
import to.unified.unified_java_sdk.models.operations.ListMessagingChannels2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListMessagingChannels2Request req = ListMessagingChannels2Request.builder()
                .connectionId("<id>")
                .build();

        ListMessagingChannels2Response res = sdk.channel().listMessagingChannels2()
                .request(req)
                .call();

        if (res.messagingChannels().isPresent()) {
            System.out.println(res.messagingChannels().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [ListMessagingChannels2Request](../../models/operations/ListMessagingChannels2Request.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[ListMessagingChannels2Response](../../models/operations/ListMessagingChannels2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |