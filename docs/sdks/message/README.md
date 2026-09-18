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
                            .contentIdentifier("1c72f1d5-f6e4-4ed8-a96a-02a4102f79f4")
                            .contentType("coaegresco")
                            .downloadUrl("https://rotating-advertisement.org")
                            .filename("super")
                            .messageId("222cedb6-3d1c-47ba-982b-2520c268f506")
                            .size(327d)
                            .build()))
                    .buttons(List.of(
                        MessagingButton.builder()
                            .id("337e2909-4d4a-4452-8eee-916bebb29ae2")
                            .text("denuo")
                            .build()))
                    .createdAt(OffsetDateTime.parse("2021-11-26T09:26:33.973Z"))
                    .destinationMembers(List.of())
                    .hasChildren(true)
                    .hiddenMembers(List.of())
                    .id("222cedb6-3d1c-47ba-982b-2520c268f506")
                    .isUnread(false)
                    .mentionedMembers(List.of())
                    .message("Sum utique aliquid.")
                    .messageHtml("Articulus tardus tergiversatio.")
                    .messageMarkdown("Territo uterque tergo curiositas.")
                    .reactions(List.of())
                    .reference("571483f2-d95b-4f06-8b78-d35e7046bb74")
                    .subject("Cernuus optio cohaero summisse in.")
                    .updatedAt(OffsetDateTime.parse("2023-07-06T11:13:40.621Z"))
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
                            .contentIdentifier("1a2fed76-5d16-4c7f-8c90-b8124cfe267b")
                            .contentType("coaegresco")
                            .downloadUrl("https://rotating-advertisement.org")
                            .filename("super")
                            .messageId("5dcf9147-6192-40ad-bfd6-c02931e4722f")
                            .size(327d)
                            .build()))
                    .buttons(List.of(
                        MessagingButton.builder()
                            .id("11857e5d-8b5b-44bd-ab54-af6df290a21b")
                            .text("denuo")
                            .build()))
                    .createdAt(OffsetDateTime.parse("2021-11-26T09:26:33.973Z"))
                    .destinationMembers(List.of())
                    .hasChildren(true)
                    .hiddenMembers(List.of())
                    .id("5dcf9147-6192-40ad-bfd6-c02931e4722f")
                    .isUnread(false)
                    .mentionedMembers(List.of())
                    .message("Sum utique aliquid.")
                    .messageHtml("Articulus tardus tergiversatio.")
                    .messageMarkdown("Territo uterque tergo curiositas.")
                    .reactions(List.of())
                    .reference("571483f2-d95b-4f06-8b78-d35e7046bb74")
                    .subject("Cernuus optio cohaero summisse in.")
                    .updatedAt(OffsetDateTime.parse("2023-07-06T11:13:40.638Z"))
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
                            .contentIdentifier("1a2fed76-5d16-4c7f-8c90-b8124cfe267b")
                            .contentType("coaegresco")
                            .downloadUrl("https://rotating-advertisement.org")
                            .filename("super")
                            .messageId("5dcf9147-6192-40ad-bfd6-c02931e4722f")
                            .size(327d)
                            .build()))
                    .buttons(List.of(
                        MessagingButton.builder()
                            .id("11857e5d-8b5b-44bd-ab54-af6df290a21b")
                            .text("denuo")
                            .build()))
                    .createdAt(OffsetDateTime.parse("2021-11-26T09:26:33.973Z"))
                    .destinationMembers(List.of())
                    .hasChildren(true)
                    .hiddenMembers(List.of())
                    .id("5dcf9147-6192-40ad-bfd6-c02931e4722f")
                    .isUnread(false)
                    .mentionedMembers(List.of())
                    .message("Sum utique aliquid.")
                    .messageHtml("Articulus tardus tergiversatio.")
                    .messageMarkdown("Territo uterque tergo curiositas.")
                    .reactions(List.of())
                    .reference("571483f2-d95b-4f06-8b78-d35e7046bb74")
                    .subject("Cernuus optio cohaero summisse in.")
                    .updatedAt(OffsetDateTime.parse("2023-07-06T11:13:40.638Z"))
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