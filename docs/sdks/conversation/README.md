# Conversation

## Overview

### Available Operations

* [createPropertyConversation](#createpropertyconversation) - Create a conversation
* [getPropertyConversation](#getpropertyconversation) - Retrieve a conversation
* [listPropertyConversations](#listpropertyconversations) - List all conversations

## createPropertyConversation

Creates a PropertyConversation. Provide the unified PropertyConversation fields in the request body; they are mapped to the provider's API. Returns the created PropertyConversation.

### Example Usage

<!-- UsageSnippet language="java" operationID="createPropertyConversation" method="post" path="/property/{connection_id}/conversation" example="property_conversation" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreatePropertyConversationRequest;
import to.unified.unified_java_sdk.models.operations.CreatePropertyConversationResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreatePropertyConversationRequest req = CreatePropertyConversationRequest.builder()
                .propertyConversation(PropertyConversation.builder()
                    .createdAt(OffsetDateTime.parse("2022-06-20T00:02:46.530Z"))
                    .guestName("Evie Okuneva")
                    .id("151446fa-b3d4-4b19-b476-dc6e0b6c2ca5")
                    .isUnread(false)
                    .messages(List.of(
                        PropertyMessage.builder()
                            .attachments(List.of())
                            .createdAt(OffsetDateTime.parse("2025-04-26T23:21:36.865Z"))
                            .id("de4adbc9-3914-4dd7-991b-42a2178145b0")
                            .isAutomatic(false)
                            .message("Vinitor caterva amor sophismata admitto colo tempore aufero torrens.")
                            .senderName("Evie Okuneva")
                            .senderType(SenderType.GUEST)
                            .build(),
                        PropertyMessage.builder()
                            .attachments(List.of())
                            .createdAt(OffsetDateTime.parse("2026-05-11T21:45:35.843Z"))
                            .id("481b63ed-b321-4932-8064-d25fdd02bf86")
                            .message("Aequitas torqueo curiositas cimentarius repellendus auditor degero ademptio adnuo.")
                            .senderName("Ms. Patti Lynch")
                            .senderType(SenderType.HOST)
                            .build()))
                    .metadata(List.of())
                    .source("Airbnb")
                    .updatedAt(OffsetDateTime.parse("2026-05-11T21:45:35.843Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreatePropertyConversationResponse res = sdk.conversation().createPropertyConversation()
                .request(req)
                .call();

        if (res.propertyConversation().isPresent()) {
            System.out.println(res.propertyConversation().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                         | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `request`                                                                                         | [CreatePropertyConversationRequest](../../models/operations/CreatePropertyConversationRequest.md) | :heavy_check_mark:                                                                                | The request object to use for the request.                                                        |

### Response

**[CreatePropertyConversationResponse](../../models/operations/CreatePropertyConversationResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getPropertyConversation

Retrieves a single PropertyConversation by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getPropertyConversation" method="get" path="/property/{connection_id}/conversation/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetPropertyConversationRequest;
import to.unified.unified_java_sdk.models.operations.GetPropertyConversationResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetPropertyConversationRequest req = GetPropertyConversationRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetPropertyConversationResponse res = sdk.conversation().getPropertyConversation()
                .request(req)
                .call();

        if (res.propertyConversation().isPresent()) {
            System.out.println(res.propertyConversation().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [GetPropertyConversationRequest](../../models/operations/GetPropertyConversationRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[GetPropertyConversationResponse](../../models/operations/GetPropertyConversationResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listPropertyConversations

Returns a list of PropertyConversations. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listPropertyConversations" method="get" path="/property/{connection_id}/conversation" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListPropertyConversationsRequest;
import to.unified.unified_java_sdk.models.operations.ListPropertyConversationsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListPropertyConversationsRequest req = ListPropertyConversationsRequest.builder()
                .connectionId("<id>")
                .build();

        ListPropertyConversationsResponse res = sdk.conversation().listPropertyConversations()
                .request(req)
                .call();

        if (res.propertyConversations().isPresent()) {
            System.out.println(res.propertyConversations().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `request`                                                                                       | [ListPropertyConversationsRequest](../../models/operations/ListPropertyConversationsRequest.md) | :heavy_check_mark:                                                                              | The request object to use for the request.                                                      |

### Response

**[ListPropertyConversationsResponse](../../models/operations/ListPropertyConversationsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |