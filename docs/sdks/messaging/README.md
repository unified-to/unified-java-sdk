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

Create a channel

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
                    .id("37379eae-f237-42c3-b7f8-52f8349e06c8")
                    .isActive(false)
                    .isPrivate(true)
                    .members(List.of())
                    .metadata(List.of())
                    .name("tego")
                    .updatedAt(OffsetDateTime.parse("2026-05-21T13:55:20.566Z"))
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

Create a message

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
                            .contentIdentifier("c7a9f43d-1524-4fae-8d37-b08b4da25f65")
                            .contentType("coaegresco")
                            .downloadUrl("https://rotating-advertisement.org")
                            .filename("super")
                            .messageId("896e1944-76ec-4bad-9195-59130bbab30a")
                            .size(327d)
                            .build()))
                    .buttons(List.of(
                        MessagingButton.builder()
                            .id("42ba4605-c291-45c3-988e-1e755b3646bf")
                            .text("comparo")
                            .build()))
                    .createdAt(OffsetDateTime.parse("2021-11-26T09:26:33.973Z"))
                    .destinationMembers(List.of())
                    .hasChildren(true)
                    .hiddenMembers(List.of())
                    .id("896e1944-76ec-4bad-9195-59130bbab30a")
                    .isUnread(false)
                    .mentionedMembers(List.of())
                    .message("Sum utique aliquid.")
                    .messageHtml("Articulus tardus tergiversatio.")
                    .messageMarkdown("Territo uterque tergo curiositas.")
                    .metadata(List.of())
                    .reactions(List.of())
                    .subject("Cernuus optio cohaero summisse in.")
                    .updatedAt(OffsetDateTime.parse("2023-07-17T11:57:15.507Z"))
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

Retrieve a message

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

List all messages

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

Update a channel

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
                    .id("1a911b65-496f-44a9-a9d1-f1cc15fdab35")
                    .isActive(false)
                    .isPrivate(true)
                    .members(List.of())
                    .metadata(List.of())
                    .name("tego")
                    .updatedAt(OffsetDateTime.parse("2026-05-21T13:55:20.577Z"))
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

Update an event

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
                    .id("0c3d20f6-1993-4a48-a62e-b6c80eee63a7")
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

Update a message

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
                            .contentIdentifier("e0d5fa31-f0f6-45bd-9d0d-dd5e451aa76f")
                            .contentType("coaegresco")
                            .downloadUrl("https://rotating-advertisement.org")
                            .filename("super")
                            .messageId("74a664a2-4eff-4f58-a082-d61921759d4e")
                            .size(327d)
                            .build()))
                    .buttons(List.of(
                        MessagingButton.builder()
                            .id("6fdd1631-0bf3-4408-ae46-fcddad603fdc")
                            .text("comparo")
                            .build()))
                    .createdAt(OffsetDateTime.parse("2021-11-26T09:26:33.973Z"))
                    .destinationMembers(List.of())
                    .hasChildren(true)
                    .hiddenMembers(List.of())
                    .id("74a664a2-4eff-4f58-a082-d61921759d4e")
                    .isUnread(false)
                    .mentionedMembers(List.of())
                    .message("Sum utique aliquid.")
                    .messageHtml("Articulus tardus tergiversatio.")
                    .messageMarkdown("Territo uterque tergo curiositas.")
                    .metadata(List.of())
                    .reactions(List.of())
                    .subject("Cernuus optio cohaero summisse in.")
                    .updatedAt(OffsetDateTime.parse("2023-07-17T11:57:15.521Z"))
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

Remove a message

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

Update a channel

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
                    .id("1a911b65-496f-44a9-a9d1-f1cc15fdab35")
                    .isActive(false)
                    .isPrivate(true)
                    .members(List.of())
                    .metadata(List.of())
                    .name("tego")
                    .updatedAt(OffsetDateTime.parse("2026-05-21T13:55:20.577Z"))
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

Update an event

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
                    .id("0c3d20f6-1993-4a48-a62e-b6c80eee63a7")
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

Update a message

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
                            .contentIdentifier("e0d5fa31-f0f6-45bd-9d0d-dd5e451aa76f")
                            .contentType("coaegresco")
                            .downloadUrl("https://rotating-advertisement.org")
                            .filename("super")
                            .messageId("74a664a2-4eff-4f58-a082-d61921759d4e")
                            .size(327d)
                            .build()))
                    .buttons(List.of(
                        MessagingButton.builder()
                            .id("6fdd1631-0bf3-4408-ae46-fcddad603fdc")
                            .text("comparo")
                            .build()))
                    .createdAt(OffsetDateTime.parse("2021-11-26T09:26:33.973Z"))
                    .destinationMembers(List.of())
                    .hasChildren(true)
                    .hiddenMembers(List.of())
                    .id("74a664a2-4eff-4f58-a082-d61921759d4e")
                    .isUnread(false)
                    .mentionedMembers(List.of())
                    .message("Sum utique aliquid.")
                    .messageHtml("Articulus tardus tergiversatio.")
                    .messageMarkdown("Territo uterque tergo curiositas.")
                    .metadata(List.of())
                    .reactions(List.of())
                    .subject("Cernuus optio cohaero summisse in.")
                    .updatedAt(OffsetDateTime.parse("2023-07-17T11:57:15.521Z"))
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