# Channel
(*channel()*)

### Available Operations

* [getMessagingChannel](#getmessagingchannel) - Retrieve a channel
* [listMessagingChannels](#listmessagingchannels) - List all channels

## getMessagingChannel

Retrieve a channel

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.errors.SDKError;
import com.unifiedapi.unifiedto.models.operations.GetMessagingChannelRequest;
import com.unifiedapi.unifiedto.models.operations.GetMessagingChannelResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
                    .build())
                .build();

            GetMessagingChannelRequest req = GetMessagingChannelRequest.builder()
                .connectionId("<value>")
                .id("<value>")
                .build();

            GetMessagingChannelResponse res = sdk.channel().getMessagingChannel()
                .request(req)
                .call();

            if (res.messagingChannel().isPresent()) {
                // handle response
            }
        } catch (SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
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

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |

## listMessagingChannels

List all channels

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.errors.SDKError;
import com.unifiedapi.unifiedto.models.operations.ListMessagingChannelsRequest;
import com.unifiedapi.unifiedto.models.operations.ListMessagingChannelsResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt("<YOUR_API_KEY_HERE>")
                    .build())
                .build();

            ListMessagingChannelsRequest req = ListMessagingChannelsRequest.builder()
                .connectionId("<value>")
                .build();

            ListMessagingChannelsResponse res = sdk.channel().listMessagingChannels()
                .request(req)
                .call();

            if (res.messagingChannels().isPresent()) {
                // handle response
            }
        } catch (SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
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

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |
