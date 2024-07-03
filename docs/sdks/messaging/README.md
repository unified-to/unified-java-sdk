# Messaging
(*messaging*)

### Available Operations

* [createMessagingMessage](#createmessagingmessage) - Create a message
* [getMessagingChannel](#getmessagingchannel) - Retrieve a channel
* [getMessagingMessage](#getmessagingmessage) - Retrieve a message
* [listMessagingChannels](#listmessagingchannels) - List all channels
* [listMessagingMessages](#listmessagingmessages) - List all messages
* [patchMessagingMessage](#patchmessagingmessage) - Update a message
* [removeMessagingMessage](#removemessagingmessage) - Remove a message
* [updateMessagingMessage](#updatemessagingmessage) - Update a message

## createMessagingMessage

Create a message

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.CreateMessagingMessageRequest;
import com.unifiedapi.unifiedto.models.operations.CreateMessagingMessageResponse;
import com.unifiedapi.unifiedto.models.shared.MessagingAttachment;
import com.unifiedapi.unifiedto.models.shared.MessagingMember;
import com.unifiedapi.unifiedto.models.shared.MessagingMessage;
import com.unifiedapi.unifiedto.models.shared.PropertyMessagingMessageAuthorMember;
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.CreateMessagingMessageRequest req = new CreateMessagingMessageRequest(
                "<value>"){{
                messagingMessage = new MessagingMessage(
){{
                    attachments = new com.unifiedapi.unifiedto.models.shared.MessagingAttachment[]{{
                        add(new MessagingAttachment(
                        ){{}}),
                    }};
                    authorMember = new PropertyMessagingMessageAuthorMember(
){{
                        email = "Eugene54@gmail.com";
                        name = "<value>";
                        userId = "<value>";

                    }};
                    channelId = "<value>";
                    createdAt = "<value>";
                    destinationMembers = new com.unifiedapi.unifiedto.models.shared.MessagingMember[]{{
                        add(new MessagingMember(
                        ){{}}),
                    }};
                    hiddenMembers = new com.unifiedapi.unifiedto.models.shared.MessagingMember[]{{
                        add(new MessagingMember(
                        ){{}}),
                    }};
                    id = "<id>";
                    mentionedMembers = new com.unifiedapi.unifiedto.models.shared.MessagingMember[]{{
                        add(new MessagingMember(
                        ){{}}),
                    }};
                    message = "<value>";
                    messageHtml = "<value>";
                    parentMessageId = "<value>";
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "<value>");
                    }};
                    subject = "<value>";
                    updatedAt = "<value>";
                    webUrl = "<value>";

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.CreateMessagingMessageResponse res = sdk.messaging.createMessagingMessage(req);

            if (res.messagingMessage != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                            | Type                                                                                                                                 | Required                                                                                                                             | Description                                                                                                                          |
| ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                            | [com.unifiedapi.unifiedto.models.operations.CreateMessagingMessageRequest](../../models/operations/CreateMessagingMessageRequest.md) | :heavy_check_mark:                                                                                                                   | The request object to use for the request.                                                                                           |


### Response

**[com.unifiedapi.unifiedto.models.operations.CreateMessagingMessageResponse](../../models/operations/CreateMessagingMessageResponse.md)**


## getMessagingChannel

Retrieve a channel

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetMessagingChannelRequest;
import com.unifiedapi.unifiedto.models.operations.GetMessagingChannelResponse;
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.GetMessagingChannelRequest req = new GetMessagingChannelRequest(
                "<value>",
                "<value>"){{
                fields = new String[]{{
                    add("<value>"),
                }};

            }};

            com.unifiedapi.unifiedto.models.operations.GetMessagingChannelResponse res = sdk.messaging.getMessagingChannel(req);

            if (res.messagingChannel != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                      | Type                                                                                                                           | Required                                                                                                                       | Description                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                      | [com.unifiedapi.unifiedto.models.operations.GetMessagingChannelRequest](../../models/operations/GetMessagingChannelRequest.md) | :heavy_check_mark:                                                                                                             | The request object to use for the request.                                                                                     |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetMessagingChannelResponse](../../models/operations/GetMessagingChannelResponse.md)**


## getMessagingMessage

Retrieve a message

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetMessagingMessageRequest;
import com.unifiedapi.unifiedto.models.operations.GetMessagingMessageResponse;
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.GetMessagingMessageRequest req = new GetMessagingMessageRequest(
                "<value>",
                "<value>"){{
                fields = new String[]{{
                    add("<value>"),
                }};

            }};

            com.unifiedapi.unifiedto.models.operations.GetMessagingMessageResponse res = sdk.messaging.getMessagingMessage(req);

            if (res.messagingMessage != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                      | Type                                                                                                                           | Required                                                                                                                       | Description                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                      | [com.unifiedapi.unifiedto.models.operations.GetMessagingMessageRequest](../../models/operations/GetMessagingMessageRequest.md) | :heavy_check_mark:                                                                                                             | The request object to use for the request.                                                                                     |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetMessagingMessageResponse](../../models/operations/GetMessagingMessageResponse.md)**


## listMessagingChannels

List all channels

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.ListMessagingChannelsRequest;
import com.unifiedapi.unifiedto.models.operations.ListMessagingChannelsResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.ListMessagingChannelsRequest req = new ListMessagingChannelsRequest(
                "<value>"){{
                fields = new String[]{{
                    add("<value>"),
                }};
                limit = 8836d;
                offset = 9706.94d;
                parentId = "<value>";
                query = "<value>";
                updatedGte = OffsetDateTime.parse("2022-12-12T05:55:39.243Z");

            }};

            com.unifiedapi.unifiedto.models.operations.ListMessagingChannelsResponse res = sdk.messaging.listMessagingChannels(req);

            if (res.messagingChannels != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                          | Type                                                                                                                               | Required                                                                                                                           | Description                                                                                                                        |
| ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                          | [com.unifiedapi.unifiedto.models.operations.ListMessagingChannelsRequest](../../models/operations/ListMessagingChannelsRequest.md) | :heavy_check_mark:                                                                                                                 | The request object to use for the request.                                                                                         |


### Response

**[com.unifiedapi.unifiedto.models.operations.ListMessagingChannelsResponse](../../models/operations/ListMessagingChannelsResponse.md)**


## listMessagingMessages

List all messages

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.ListMessagingMessagesRequest;
import com.unifiedapi.unifiedto.models.operations.ListMessagingMessagesResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.ListMessagingMessagesRequest req = new ListMessagingMessagesRequest(
                "<value>"){{
                channelId = "<value>";
                fields = new String[]{{
                    add("<value>"),
                }};
                limit = 4272.96d;
                offset = 6110.39d;
                parentId = "<value>";
                query = "<value>";
                updatedGte = OffsetDateTime.parse("2022-11-14T22:11:58.965Z");

            }};

            com.unifiedapi.unifiedto.models.operations.ListMessagingMessagesResponse res = sdk.messaging.listMessagingMessages(req);

            if (res.messagingMessages != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                          | Type                                                                                                                               | Required                                                                                                                           | Description                                                                                                                        |
| ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                          | [com.unifiedapi.unifiedto.models.operations.ListMessagingMessagesRequest](../../models/operations/ListMessagingMessagesRequest.md) | :heavy_check_mark:                                                                                                                 | The request object to use for the request.                                                                                         |


### Response

**[com.unifiedapi.unifiedto.models.operations.ListMessagingMessagesResponse](../../models/operations/ListMessagingMessagesResponse.md)**


## patchMessagingMessage

Update a message

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PatchMessagingMessageRequest;
import com.unifiedapi.unifiedto.models.operations.PatchMessagingMessageResponse;
import com.unifiedapi.unifiedto.models.shared.MessagingAttachment;
import com.unifiedapi.unifiedto.models.shared.MessagingMember;
import com.unifiedapi.unifiedto.models.shared.MessagingMessage;
import com.unifiedapi.unifiedto.models.shared.PropertyMessagingMessageAuthorMember;
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.PatchMessagingMessageRequest req = new PatchMessagingMessageRequest(
                "<value>",
                "<value>"){{
                messagingMessage = new MessagingMessage(
){{
                    attachments = new com.unifiedapi.unifiedto.models.shared.MessagingAttachment[]{{
                        add(new MessagingAttachment(
                        ){{}}),
                    }};
                    authorMember = new PropertyMessagingMessageAuthorMember(
){{
                        email = "Desmond.Pagac78@gmail.com";
                        name = "<value>";
                        userId = "<value>";

                    }};
                    channelId = "<value>";
                    createdAt = "<value>";
                    destinationMembers = new com.unifiedapi.unifiedto.models.shared.MessagingMember[]{{
                        add(new MessagingMember(
                        ){{}}),
                    }};
                    hiddenMembers = new com.unifiedapi.unifiedto.models.shared.MessagingMember[]{{
                        add(new MessagingMember(
                        ){{}}),
                    }};
                    id = "<id>";
                    mentionedMembers = new com.unifiedapi.unifiedto.models.shared.MessagingMember[]{{
                        add(new MessagingMember(
                        ){{}}),
                    }};
                    message = "<value>";
                    messageHtml = "<value>";
                    parentMessageId = "<value>";
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "<value>");
                    }};
                    subject = "<value>";
                    updatedAt = "<value>";
                    webUrl = "<value>";

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.PatchMessagingMessageResponse res = sdk.messaging.patchMessagingMessage(req);

            if (res.messagingMessage != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                          | Type                                                                                                                               | Required                                                                                                                           | Description                                                                                                                        |
| ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                          | [com.unifiedapi.unifiedto.models.operations.PatchMessagingMessageRequest](../../models/operations/PatchMessagingMessageRequest.md) | :heavy_check_mark:                                                                                                                 | The request object to use for the request.                                                                                         |


### Response

**[com.unifiedapi.unifiedto.models.operations.PatchMessagingMessageResponse](../../models/operations/PatchMessagingMessageResponse.md)**


## removeMessagingMessage

Remove a message

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.RemoveMessagingMessageRequest;
import com.unifiedapi.unifiedto.models.operations.RemoveMessagingMessageResponse;
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.RemoveMessagingMessageRequest req = new RemoveMessagingMessageRequest(
                "<value>",
                "<value>");

            com.unifiedapi.unifiedto.models.operations.RemoveMessagingMessageResponse res = sdk.messaging.removeMessagingMessage(req);

            if (res.statusCode == 200) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                            | Type                                                                                                                                 | Required                                                                                                                             | Description                                                                                                                          |
| ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                            | [com.unifiedapi.unifiedto.models.operations.RemoveMessagingMessageRequest](../../models/operations/RemoveMessagingMessageRequest.md) | :heavy_check_mark:                                                                                                                   | The request object to use for the request.                                                                                           |


### Response

**[com.unifiedapi.unifiedto.models.operations.RemoveMessagingMessageResponse](../../models/operations/RemoveMessagingMessageResponse.md)**


## updateMessagingMessage

Update a message

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.UpdateMessagingMessageRequest;
import com.unifiedapi.unifiedto.models.operations.UpdateMessagingMessageResponse;
import com.unifiedapi.unifiedto.models.shared.MessagingAttachment;
import com.unifiedapi.unifiedto.models.shared.MessagingMember;
import com.unifiedapi.unifiedto.models.shared.MessagingMessage;
import com.unifiedapi.unifiedto.models.shared.PropertyMessagingMessageAuthorMember;
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.UpdateMessagingMessageRequest req = new UpdateMessagingMessageRequest(
                "<value>",
                "<value>"){{
                messagingMessage = new MessagingMessage(
){{
                    attachments = new com.unifiedapi.unifiedto.models.shared.MessagingAttachment[]{{
                        add(new MessagingAttachment(
                        ){{}}),
                    }};
                    authorMember = new PropertyMessagingMessageAuthorMember(
){{
                        email = "Johnpaul.Jenkins99@yahoo.com";
                        name = "<value>";
                        userId = "<value>";

                    }};
                    channelId = "<value>";
                    createdAt = "<value>";
                    destinationMembers = new com.unifiedapi.unifiedto.models.shared.MessagingMember[]{{
                        add(new MessagingMember(
                        ){{}}),
                    }};
                    hiddenMembers = new com.unifiedapi.unifiedto.models.shared.MessagingMember[]{{
                        add(new MessagingMember(
                        ){{}}),
                    }};
                    id = "<id>";
                    mentionedMembers = new com.unifiedapi.unifiedto.models.shared.MessagingMember[]{{
                        add(new MessagingMember(
                        ){{}}),
                    }};
                    message = "<value>";
                    messageHtml = "<value>";
                    parentMessageId = "<value>";
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "<value>");
                    }};
                    subject = "<value>";
                    updatedAt = "<value>";
                    webUrl = "<value>";

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.UpdateMessagingMessageResponse res = sdk.messaging.updateMessagingMessage(req);

            if (res.messagingMessage != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                            | Type                                                                                                                                 | Required                                                                                                                             | Description                                                                                                                          |
| ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                            | [com.unifiedapi.unifiedto.models.operations.UpdateMessagingMessageRequest](../../models/operations/UpdateMessagingMessageRequest.md) | :heavy_check_mark:                                                                                                                   | The request object to use for the request.                                                                                           |


### Response

**[com.unifiedapi.unifiedto.models.operations.UpdateMessagingMessageResponse](../../models/operations/UpdateMessagingMessageResponse.md)**

