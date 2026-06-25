# Message

## Overview

### Available Operations

* [createMessagingMessage2](#createmessagingmessage2) - Create a message
* [getMessagingMessage2](#getmessagingmessage2) - Retrieve a message
* [listMessagingMessages2](#listmessagingmessages2) - List all messages
* [patchMessagingMessage2](#patchmessagingmessage2) - Update a message
* [removeMessagingMessage2](#removemessagingmessage2) - Remove a message
* [updateMessagingMessage2](#updatemessagingmessage2) - Update a message

## createMessagingMessage2

Create a message

### Example Usage

<!-- UsageSnippet language="java" operationID="createMessagingMessage2" method="post" path="/messaging/{connection_id}/message" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateMessagingMessage2Request;
import to.unified.unified_java_sdk.models.operations.CreateMessagingMessage2Response;
import to.unified.unified_java_sdk.models.shared.MessagingMessage;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateMessagingMessage2Request req = CreateMessagingMessage2Request.builder()
                .messagingMessage(MessagingMessage.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateMessagingMessage2Response res = sdk.message().createMessagingMessage2()
                .request(req)
                .call();

        if (res.messagingMessage().isPresent()) {
            System.out.println(res.messagingMessage().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [CreateMessagingMessage2Request](../../models/operations/CreateMessagingMessage2Request.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[CreateMessagingMessage2Response](../../models/operations/CreateMessagingMessage2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getMessagingMessage2

Retrieve a message

### Example Usage

<!-- UsageSnippet language="java" operationID="getMessagingMessage2" method="get" path="/messaging/{connection_id}/message/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetMessagingMessage2Request;
import to.unified.unified_java_sdk.models.operations.GetMessagingMessage2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetMessagingMessage2Request req = GetMessagingMessage2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetMessagingMessage2Response res = sdk.message().getMessagingMessage2()
                .request(req)
                .call();

        if (res.messagingMessage().isPresent()) {
            System.out.println(res.messagingMessage().get());
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [GetMessagingMessage2Request](../../models/operations/GetMessagingMessage2Request.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[GetMessagingMessage2Response](../../models/operations/GetMessagingMessage2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listMessagingMessages2

List all messages

### Example Usage

<!-- UsageSnippet language="java" operationID="listMessagingMessages2" method="get" path="/messaging/{connection_id}/message" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListMessagingMessages2Request;
import to.unified.unified_java_sdk.models.operations.ListMessagingMessages2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListMessagingMessages2Request req = ListMessagingMessages2Request.builder()
                .connectionId("<id>")
                .build();

        ListMessagingMessages2Response res = sdk.message().listMessagingMessages2()
                .request(req)
                .call();

        if (res.messagingMessages().isPresent()) {
            System.out.println(res.messagingMessages().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [ListMessagingMessages2Request](../../models/operations/ListMessagingMessages2Request.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[ListMessagingMessages2Response](../../models/operations/ListMessagingMessages2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchMessagingMessage2

Update a message

### Example Usage

<!-- UsageSnippet language="java" operationID="patchMessagingMessage2" method="patch" path="/messaging/{connection_id}/message/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchMessagingMessage2Request;
import to.unified.unified_java_sdk.models.operations.PatchMessagingMessage2Response;
import to.unified.unified_java_sdk.models.shared.MessagingMessage;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchMessagingMessage2Request req = PatchMessagingMessage2Request.builder()
                .messagingMessage(MessagingMessage.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchMessagingMessage2Response res = sdk.message().patchMessagingMessage2()
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
| `request`                                                                                 | [PatchMessagingMessage2Request](../../models/operations/PatchMessagingMessage2Request.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[PatchMessagingMessage2Response](../../models/operations/PatchMessagingMessage2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeMessagingMessage2

Remove a message

### Example Usage

<!-- UsageSnippet language="java" operationID="removeMessagingMessage2" method="delete" path="/messaging/{connection_id}/message/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveMessagingMessage2Request;
import to.unified.unified_java_sdk.models.operations.RemoveMessagingMessage2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveMessagingMessage2Request req = RemoveMessagingMessage2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveMessagingMessage2Response res = sdk.message().removeMessagingMessage2()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [RemoveMessagingMessage2Request](../../models/operations/RemoveMessagingMessage2Request.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[RemoveMessagingMessage2Response](../../models/operations/RemoveMessagingMessage2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateMessagingMessage2

Update a message

### Example Usage

<!-- UsageSnippet language="java" operationID="updateMessagingMessage2" method="put" path="/messaging/{connection_id}/message/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateMessagingMessage2Request;
import to.unified.unified_java_sdk.models.operations.UpdateMessagingMessage2Response;
import to.unified.unified_java_sdk.models.shared.MessagingMessage;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateMessagingMessage2Request req = UpdateMessagingMessage2Request.builder()
                .messagingMessage(MessagingMessage.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateMessagingMessage2Response res = sdk.message().updateMessagingMessage2()
                .request(req)
                .call();

        if (res.messagingMessage().isPresent()) {
            System.out.println(res.messagingMessage().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [UpdateMessagingMessage2Request](../../models/operations/UpdateMessagingMessage2Request.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[UpdateMessagingMessage2Response](../../models/operations/UpdateMessagingMessage2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |