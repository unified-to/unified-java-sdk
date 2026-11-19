# Message

## Overview

### Available Operations

* [createMessagingMessage](#createmessagingmessage) - Create a message
* [getMessagingMessage](#getmessagingmessage) - Retrieve a message
* [listMessagingMessages](#listmessagingmessages) - List all messages
* [patchMessagingMessage](#patchmessagingmessage) - Update a message
* [removeMessagingMessage](#removemessagingmessage) - Remove a message
* [updateMessagingMessage](#updatemessagingmessage) - Update a message

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
                            .contentIdentifier("8222d1c5-8022-4d0c-8a7a-525627a4b436")
                            .contentType("coaegresco")
                            .downloadUrl("https://rotating-advertisement.org")
                            .filename("super")
                            .messageId("17168ee6-462c-4c47-a326-1cc393f11706")
                            .size(327d)
                            .build()))
                    .buttons(List.of(
                        MessagingButton.builder()
                            .id("2143548b-1a4a-4c48-85fa-d75aa2ccfb2f")
                            .text("comparo")
                            .build()))
                    .createdAt(OffsetDateTime.parse("2021-11-26T09:26:33.973Z"))
                    .destinationMembers(List.of())
                    .hasChildren(true)
                    .hiddenMembers(List.of())
                    .id("17168ee6-462c-4c47-a326-1cc393f11706")
                    .isUnread(false)
                    .mentionedMembers(List.of())
                    .message("Sum utique aliquid.")
                    .messageHtml("Articulus tardus tergiversatio.")
                    .messageMarkdown("Territo uterque tergo curiositas.")
                    .metadata(List.of())
                    .reactions(List.of())
                    .subject("Cernuus optio cohaero summisse in.")
                    .updatedAt(OffsetDateTime.parse("2023-07-27T04:47:39.440Z"))
                    .webUrl("https://grumpy-kit.net")
                    .build())
                .connectionId("<id>")
                .build();

        CreateMessagingMessageResponse res = sdk.message().createMessagingMessage()
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

        GetMessagingMessageResponse res = sdk.message().getMessagingMessage()
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

        ListMessagingMessagesResponse res = sdk.message().listMessagingMessages()
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
                            .contentIdentifier("97c198a5-097f-4ca3-ae1f-a7ca550a0753")
                            .contentType("coaegresco")
                            .downloadUrl("https://rotating-advertisement.org")
                            .filename("super")
                            .messageId("ca8fb1f7-826e-43ed-9697-23583f3ad92e")
                            .size(327d)
                            .build()))
                    .buttons(List.of(
                        MessagingButton.builder()
                            .id("a4a136c6-55f0-4004-85a0-45f3dd62b507")
                            .text("comparo")
                            .build()))
                    .createdAt(OffsetDateTime.parse("2021-11-26T09:26:33.973Z"))
                    .destinationMembers(List.of())
                    .hasChildren(true)
                    .hiddenMembers(List.of())
                    .id("ca8fb1f7-826e-43ed-9697-23583f3ad92e")
                    .isUnread(false)
                    .mentionedMembers(List.of())
                    .message("Sum utique aliquid.")
                    .messageHtml("Articulus tardus tergiversatio.")
                    .messageMarkdown("Territo uterque tergo curiositas.")
                    .metadata(List.of())
                    .reactions(List.of())
                    .subject("Cernuus optio cohaero summisse in.")
                    .updatedAt(OffsetDateTime.parse("2023-07-27T04:47:39.451Z"))
                    .webUrl("https://grumpy-kit.net")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchMessagingMessageResponse res = sdk.message().patchMessagingMessage()
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

        RemoveMessagingMessageResponse res = sdk.message().removeMessagingMessage()
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
                            .contentIdentifier("97c198a5-097f-4ca3-ae1f-a7ca550a0753")
                            .contentType("coaegresco")
                            .downloadUrl("https://rotating-advertisement.org")
                            .filename("super")
                            .messageId("ca8fb1f7-826e-43ed-9697-23583f3ad92e")
                            .size(327d)
                            .build()))
                    .buttons(List.of(
                        MessagingButton.builder()
                            .id("a4a136c6-55f0-4004-85a0-45f3dd62b507")
                            .text("comparo")
                            .build()))
                    .createdAt(OffsetDateTime.parse("2021-11-26T09:26:33.973Z"))
                    .destinationMembers(List.of())
                    .hasChildren(true)
                    .hiddenMembers(List.of())
                    .id("ca8fb1f7-826e-43ed-9697-23583f3ad92e")
                    .isUnread(false)
                    .mentionedMembers(List.of())
                    .message("Sum utique aliquid.")
                    .messageHtml("Articulus tardus tergiversatio.")
                    .messageMarkdown("Territo uterque tergo curiositas.")
                    .metadata(List.of())
                    .reactions(List.of())
                    .subject("Cernuus optio cohaero summisse in.")
                    .updatedAt(OffsetDateTime.parse("2023-07-27T04:47:39.451Z"))
                    .webUrl("https://grumpy-kit.net")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateMessagingMessageResponse res = sdk.message().updateMessagingMessage()
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