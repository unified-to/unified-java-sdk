# Messaging

## Overview

### Available Operations

* [createMessagingChannel](#createmessagingchannel) - Create a channel
* [createMessagingMessage](#createmessagingmessage) - Create a message
* [getMessagingChannel](#getmessagingchannel) - Retrieve a channel
* [getMessagingMessage](#getmessagingmessage) - Retrieve a message
* [listMessagingChannels](#listmessagingchannels) - List all channels
* [listMessagingMessages](#listmessagingmessages) - List all messages
* [patchMessagingChannel](#patchmessagingchannel) - Update a channel
* [patchMessagingEvent](#patchmessagingevent) - Update an event
* [patchMessagingMessage](#patchmessagingmessage) - Update a message
* [removeMessagingChannel](#removemessagingchannel) - Remove a channel
* [removeMessagingMessage](#removemessagingmessage) - Remove a message
* [updateMessagingChannel](#updatemessagingchannel) - Update a channel
* [updateMessagingEvent](#updatemessagingevent) - Update an event
* [updateMessagingMessage](#updatemessagingmessage) - Update a message

## createMessagingChannel

Creates a MessagingChannel. Provide the unified MessagingChannel fields in the request body; they are mapped to the provider's API. Returns the created MessagingChannel.

### Example Usage

<!-- UsageSnippet language="java" operationID="createMessagingChannel" method="post" path="/messaging/{connection_id}/channel" example="messaging_channel" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
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
                    .createdAt(OffsetDateTime.parse("2023-10-05T02:09:22.795Z"))
                    .description("Dolores tutis.")
                    .hasSubchannels(true)
                    .id("3b4154fe-2e07-4606-9177-9d93190cd0b9")
                    .isActive(false)
                    .isPrivate(true)
                    .members(List.of())
                    .metadata(List.of())
                    .name("tego")
                    .updatedAt(OffsetDateTime.parse("2026-05-27T15:32:47.283Z"))
                    .webUrl("https://svelte-rule.name/")
                    .build())
                .connectionId("<id>")
                .build();

        CreateMessagingChannelResponse res = sdk.messaging().createMessagingChannel()
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

## createMessagingMessage

Creates a MessagingMessage. Provide the unified MessagingMessage fields in the request body; they are mapped to the provider's API. Returns the created MessagingMessage.

### Example Usage

<!-- UsageSnippet language="java" operationID="createMessagingMessage" method="post" path="/messaging/{connection_id}/message" example="messaging_message" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateMessagingMessageRequest;
import to.unified.unified_java_sdk.models.operations.CreateMessagingMessageResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateMessagingMessageRequest req = CreateMessagingMessageRequest.builder()
                .messagingMessage(MessagingMessage.builder()
                    .attachments(List.of(
                        MessagingAttachment.builder()
                            .contentIdentifier("455b666a-7c4a-4e48-9e00-478c9573d3d2")
                            .contentType("coaegresco")
                            .downloadUrl("https://rotating-advertisement.org")
                            .filename("super")
                            .messageId("fa2bf5c8-faae-4a6d-bfda-da9214754050")
                            .size(327d)
                            .build()))
                    .buttons(List.of(
                        MessagingButton.builder()
                            .id("781ca563-c7a8-4f12-8684-47662aae4813")
                            .text("comparo")
                            .build()))
                    .createdAt(OffsetDateTime.parse("2021-11-26T09:26:33.973Z"))
                    .destinationMembers(List.of())
                    .hasChildren(true)
                    .hiddenMembers(List.of())
                    .id("fa2bf5c8-faae-4a6d-bfda-da9214754050")
                    .isUnread(false)
                    .mentionedMembers(List.of())
                    .message("Sum utique aliquid.")
                    .messageHtml("Articulus tardus tergiversatio.")
                    .messageMarkdown("Territo uterque tergo curiositas.")
                    .metadata(List.of())
                    .reactions(List.of())
                    .subject("Cernuus optio cohaero summisse in.")
                    .updatedAt(OffsetDateTime.parse("2023-07-19T20:21:15.982Z"))
                    .webUrl("https://grumpy-kit.net")
                    .build())
                .connectionId("<id>")
                .build();

        CreateMessagingMessageResponse res = sdk.messaging().createMessagingMessage()
                .request(req)
                .call();

        if (res.messagingMessage().isPresent()) {
            System.out.println(res.messagingMessage().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [CreateMessagingMessageRequest](../../models/operations/CreateMessagingMessageRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[CreateMessagingMessageResponse](../../models/operations/CreateMessagingMessageResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getMessagingChannel

Retrieves a single MessagingChannel by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

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

        GetMessagingChannelResponse res = sdk.messaging().getMessagingChannel()
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

## getMessagingMessage

Retrieves a single MessagingMessage by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getMessagingMessage" method="get" path="/messaging/{connection_id}/message/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetMessagingMessageRequest;
import to.unified.unified_java_sdk.models.operations.GetMessagingMessageResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetMessagingMessageRequest req = GetMessagingMessageRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetMessagingMessageResponse res = sdk.messaging().getMessagingMessage()
                .request(req)
                .call();

        if (res.messagingMessage().isPresent()) {
            System.out.println(res.messagingMessage().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [GetMessagingMessageRequest](../../models/operations/GetMessagingMessageRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[GetMessagingMessageResponse](../../models/operations/GetMessagingMessageResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listMessagingChannels

Returns a list of MessagingChannels. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

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

        ListMessagingChannelsResponse res = sdk.messaging().listMessagingChannels()
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

## listMessagingMessages

Returns a list of MessagingMessages. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listMessagingMessages" method="get" path="/messaging/{connection_id}/message" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListMessagingMessagesRequest;
import to.unified.unified_java_sdk.models.operations.ListMessagingMessagesResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListMessagingMessagesRequest req = ListMessagingMessagesRequest.builder()
                .connectionId("<id>")
                .build();

        ListMessagingMessagesResponse res = sdk.messaging().listMessagingMessages()
                .request(req)
                .call();

        if (res.messagingMessages().isPresent()) {
            System.out.println(res.messagingMessages().get());
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [ListMessagingMessagesRequest](../../models/operations/ListMessagingMessagesRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[ListMessagingMessagesResponse](../../models/operations/ListMessagingMessagesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchMessagingChannel

Updates the MessagingChannel identified by `id`. Provide the unified MessagingChannel fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="patchMessagingChannel" method="patch" path="/messaging/{connection_id}/channel/{id}" example="messaging_channel" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
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
                    .createdAt(OffsetDateTime.parse("2023-10-05T02:09:22.795Z"))
                    .description("Dolores tutis.")
                    .hasSubchannels(true)
                    .id("95bfa35d-eb91-4b7c-9226-a305632f3bdc")
                    .isActive(false)
                    .isPrivate(true)
                    .members(List.of())
                    .metadata(List.of())
                    .name("tego")
                    .updatedAt(OffsetDateTime.parse("2026-05-27T15:32:47.298Z"))
                    .webUrl("https://svelte-rule.name/")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchMessagingChannelResponse res = sdk.messaging().patchMessagingChannel()
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

## patchMessagingEvent

Updates the MessagingEvent identified by `id`. Provide the unified MessagingEvent fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="patchMessagingEvent" method="patch" path="/messaging/{connection_id}/event/{id}" example="messaging_event" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchMessagingEventRequest;
import to.unified.unified_java_sdk.models.operations.PatchMessagingEventResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchMessagingEventRequest req = PatchMessagingEventRequest.builder()
                .messagingEvent(MessagingEvent.builder()
                    .channel(PropertyMessagingEventChannel.builder()
                        .id("")
                        .name("")
                        .build())
                    .createdAt(OffsetDateTime.parse("2019-05-30T19:44:46.461Z"))
                    .id("9b759a15-41f0-4adb-8649-05f2bc4b005c")
                    .isReplacingOriginal(false)
                    .metadata(List.of())
                    .type(MessagingEventType.BUTTON_CLICK)
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchMessagingEventResponse res = sdk.messaging().patchMessagingEvent()
                .request(req)
                .call();

        if (res.messagingEvent().isPresent()) {
            System.out.println(res.messagingEvent().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [PatchMessagingEventRequest](../../models/operations/PatchMessagingEventRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[PatchMessagingEventResponse](../../models/operations/PatchMessagingEventResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchMessagingMessage

Updates the MessagingMessage identified by `id`. Provide the unified MessagingMessage fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="patchMessagingMessage" method="patch" path="/messaging/{connection_id}/message/{id}" example="messaging_message" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchMessagingMessageRequest;
import to.unified.unified_java_sdk.models.operations.PatchMessagingMessageResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchMessagingMessageRequest req = PatchMessagingMessageRequest.builder()
                .messagingMessage(MessagingMessage.builder()
                    .attachments(List.of(
                        MessagingAttachment.builder()
                            .contentIdentifier("0d02a549-aed5-4259-a7af-ec5170547981")
                            .contentType("coaegresco")
                            .downloadUrl("https://rotating-advertisement.org")
                            .filename("super")
                            .messageId("c5d7f8e5-bc36-487a-a68f-52497fa1aa4d")
                            .size(327d)
                            .build()))
                    .buttons(List.of(
                        MessagingButton.builder()
                            .id("58d62ee3-6511-4690-8955-b8e74f2dc751")
                            .text("comparo")
                            .build()))
                    .createdAt(OffsetDateTime.parse("2021-11-26T09:26:33.973Z"))
                    .destinationMembers(List.of())
                    .hasChildren(true)
                    .hiddenMembers(List.of())
                    .id("c5d7f8e5-bc36-487a-a68f-52497fa1aa4d")
                    .isUnread(false)
                    .mentionedMembers(List.of())
                    .message("Sum utique aliquid.")
                    .messageHtml("Articulus tardus tergiversatio.")
                    .messageMarkdown("Territo uterque tergo curiositas.")
                    .metadata(List.of())
                    .reactions(List.of())
                    .subject("Cernuus optio cohaero summisse in.")
                    .updatedAt(OffsetDateTime.parse("2023-07-19T20:21:15.998Z"))
                    .webUrl("https://grumpy-kit.net")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchMessagingMessageResponse res = sdk.messaging().patchMessagingMessage()
                .request(req)
                .call();

        if (res.messagingMessage().isPresent()) {
            System.out.println(res.messagingMessage().get());
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [PatchMessagingMessageRequest](../../models/operations/PatchMessagingMessageRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[PatchMessagingMessageResponse](../../models/operations/PatchMessagingMessageResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeMessagingChannel

Deletes the MessagingChannel identified by `id`.

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

        RemoveMessagingChannelResponse res = sdk.messaging().removeMessagingChannel()
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

## removeMessagingMessage

Deletes the MessagingMessage identified by `id`.

### Example Usage

<!-- UsageSnippet language="java" operationID="removeMessagingMessage" method="delete" path="/messaging/{connection_id}/message/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveMessagingMessageRequest;
import to.unified.unified_java_sdk.models.operations.RemoveMessagingMessageResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveMessagingMessageRequest req = RemoveMessagingMessageRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveMessagingMessageResponse res = sdk.messaging().removeMessagingMessage()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [RemoveMessagingMessageRequest](../../models/operations/RemoveMessagingMessageRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[RemoveMessagingMessageResponse](../../models/operations/RemoveMessagingMessageResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateMessagingChannel

Updates the MessagingChannel identified by `id`. Provide the unified MessagingChannel fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateMessagingChannel" method="put" path="/messaging/{connection_id}/channel/{id}" example="messaging_channel" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
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
                    .createdAt(OffsetDateTime.parse("2023-10-05T02:09:22.795Z"))
                    .description("Dolores tutis.")
                    .hasSubchannels(true)
                    .id("95bfa35d-eb91-4b7c-9226-a305632f3bdc")
                    .isActive(false)
                    .isPrivate(true)
                    .members(List.of())
                    .metadata(List.of())
                    .name("tego")
                    .updatedAt(OffsetDateTime.parse("2026-05-27T15:32:47.298Z"))
                    .webUrl("https://svelte-rule.name/")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateMessagingChannelResponse res = sdk.messaging().updateMessagingChannel()
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

## updateMessagingEvent

Updates the MessagingEvent identified by `id`. Provide the unified MessagingEvent fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateMessagingEvent" method="put" path="/messaging/{connection_id}/event/{id}" example="messaging_event" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateMessagingEventRequest;
import to.unified.unified_java_sdk.models.operations.UpdateMessagingEventResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateMessagingEventRequest req = UpdateMessagingEventRequest.builder()
                .messagingEvent(MessagingEvent.builder()
                    .channel(PropertyMessagingEventChannel.builder()
                        .id("")
                        .name("")
                        .build())
                    .createdAt(OffsetDateTime.parse("2019-05-30T19:44:46.461Z"))
                    .id("9b759a15-41f0-4adb-8649-05f2bc4b005c")
                    .isReplacingOriginal(false)
                    .metadata(List.of())
                    .type(MessagingEventType.BUTTON_CLICK)
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateMessagingEventResponse res = sdk.messaging().updateMessagingEvent()
                .request(req)
                .call();

        if (res.messagingEvent().isPresent()) {
            System.out.println(res.messagingEvent().get());
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [UpdateMessagingEventRequest](../../models/operations/UpdateMessagingEventRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[UpdateMessagingEventResponse](../../models/operations/UpdateMessagingEventResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateMessagingMessage

Updates the MessagingMessage identified by `id`. Provide the unified MessagingMessage fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateMessagingMessage" method="put" path="/messaging/{connection_id}/message/{id}" example="messaging_message" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateMessagingMessageRequest;
import to.unified.unified_java_sdk.models.operations.UpdateMessagingMessageResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateMessagingMessageRequest req = UpdateMessagingMessageRequest.builder()
                .messagingMessage(MessagingMessage.builder()
                    .attachments(List.of(
                        MessagingAttachment.builder()
                            .contentIdentifier("0d02a549-aed5-4259-a7af-ec5170547981")
                            .contentType("coaegresco")
                            .downloadUrl("https://rotating-advertisement.org")
                            .filename("super")
                            .messageId("c5d7f8e5-bc36-487a-a68f-52497fa1aa4d")
                            .size(327d)
                            .build()))
                    .buttons(List.of(
                        MessagingButton.builder()
                            .id("58d62ee3-6511-4690-8955-b8e74f2dc751")
                            .text("comparo")
                            .build()))
                    .createdAt(OffsetDateTime.parse("2021-11-26T09:26:33.973Z"))
                    .destinationMembers(List.of())
                    .hasChildren(true)
                    .hiddenMembers(List.of())
                    .id("c5d7f8e5-bc36-487a-a68f-52497fa1aa4d")
                    .isUnread(false)
                    .mentionedMembers(List.of())
                    .message("Sum utique aliquid.")
                    .messageHtml("Articulus tardus tergiversatio.")
                    .messageMarkdown("Territo uterque tergo curiositas.")
                    .metadata(List.of())
                    .reactions(List.of())
                    .subject("Cernuus optio cohaero summisse in.")
                    .updatedAt(OffsetDateTime.parse("2023-07-19T20:21:15.998Z"))
                    .webUrl("https://grumpy-kit.net")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateMessagingMessageResponse res = sdk.messaging().updateMessagingMessage()
                .request(req)
                .call();

        if (res.messagingMessage().isPresent()) {
            System.out.println(res.messagingMessage().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [UpdateMessagingMessageRequest](../../models/operations/UpdateMessagingMessageRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[UpdateMessagingMessageResponse](../../models/operations/UpdateMessagingMessageResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |