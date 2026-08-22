# Notification

## Overview

### Available Operations

* [listUnifiedNotifications](#listunifiednotifications) - List event notifications

## listUnifiedNotifications

List event notifications

### Example Usage

<!-- UsageSnippet language="java" operationID="listUnifiedNotifications" method="get" path="/unified/notification" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListUnifiedNotificationsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListUnifiedNotificationsResponse res = sdk.notification().listUnifiedNotifications()
                .call();

        if (res.notifications().isPresent()) {
            System.out.println(res.notifications().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [ListUnifiedNotificationsRequest](../../models/operations/ListUnifiedNotificationsRequest.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[ListUnifiedNotificationsResponse](../../models/operations/ListUnifiedNotificationsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |