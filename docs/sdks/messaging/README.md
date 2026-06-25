# Messaging

## Overview

### Available Operations

* [createMessagingMessage2](#createmessagingmessage2) - Create a message
* [getMessagingChannel2](#getmessagingchannel2) - Retrieve a channel
* [getMessagingMessage2](#getmessagingmessage2) - Retrieve a message
* [listMessagingChannels2](#listmessagingchannels2) - List all channels
* [listMessagingMessages2](#listmessagingmessages2) - List all messages
* [patchMessagingEvent2](#patchmessagingevent2) - Update an event
* [patchMessagingMessage2](#patchmessagingmessage2) - Update a message
* [removeMessagingMessage2](#removemessagingmessage2) - Remove a message
* [updateMessagingEvent2](#updatemessagingevent2) - Update an event
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

        CreateMessagingMessage2Response res = sdk.messaging().createMessagingMessage2()
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

        GetMessagingChannel2Response res = sdk.messaging().getMessagingChannel2()
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

        GetMessagingMessage2Response res = sdk.messaging().getMessagingMessage2()
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

        ListMessagingChannels2Response res = sdk.messaging().listMessagingChannels2()
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

        ListMessagingMessages2Response res = sdk.messaging().listMessagingMessages2()
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

## patchMessagingEvent2

Update an event

### Example Usage

<!-- UsageSnippet language="java" operationID="patchMessagingEvent2" method="patch" path="/messaging/{connection_id}/event/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchMessagingEvent2Request;
import to.unified.unified_java_sdk.models.operations.PatchMessagingEvent2Response;
import to.unified.unified_java_sdk.models.shared.MessagingEvent;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchMessagingEvent2Request req = PatchMessagingEvent2Request.builder()
                .messagingEvent(MessagingEvent.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchMessagingEvent2Response res = sdk.messaging().patchMessagingEvent2()
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
| `request`                                                                             | [PatchMessagingEvent2Request](../../models/operations/PatchMessagingEvent2Request.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[PatchMessagingEvent2Response](../../models/operations/PatchMessagingEvent2Response.md)**

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

        PatchMessagingMessage2Response res = sdk.messaging().patchMessagingMessage2()
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

        RemoveMessagingMessage2Response res = sdk.messaging().removeMessagingMessage2()
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

## updateMessagingEvent2

Update an event

### Example Usage

<!-- UsageSnippet language="java" operationID="updateMessagingEvent2" method="put" path="/messaging/{connection_id}/event/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateMessagingEvent2Request;
import to.unified.unified_java_sdk.models.operations.UpdateMessagingEvent2Response;
import to.unified.unified_java_sdk.models.shared.MessagingEvent;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateMessagingEvent2Request req = UpdateMessagingEvent2Request.builder()
                .messagingEvent(MessagingEvent.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateMessagingEvent2Response res = sdk.messaging().updateMessagingEvent2()
                .request(req)
                .call();

        if (res.messagingEvent().isPresent()) {
            System.out.println(res.messagingEvent().get());
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [UpdateMessagingEvent2Request](../../models/operations/UpdateMessagingEvent2Request.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[UpdateMessagingEvent2Response](../../models/operations/UpdateMessagingEvent2Response.md)**

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

        UpdateMessagingMessage2Response res = sdk.messaging().updateMessagingMessage2()
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