# Timeoff
(*timeoff()*)

## Overview

### Available Operations

* [getHrisTimeoff](#gethristimeoff) - Retrieve a timeoff
* [listHrisTimeoffs](#listhristimeoffs) - List all timeoffs

## getHrisTimeoff

Retrieve a timeoff

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.errors.SDKError;
import com.unifiedapi.unifiedto.models.operations.GetHrisTimeoffRequest;
import com.unifiedapi.unifiedto.models.operations.GetHrisTimeoffResponse;
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

            GetHrisTimeoffRequest req = GetHrisTimeoffRequest.builder()
                .connectionId("<value>")
                .id("<value>")
                .build();

            GetHrisTimeoffResponse res = sdk.timeoff().getHrisTimeoff()
                .request(req)
                .call();

            if (res.hrisTimeoff().isPresent()) {
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

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [GetHrisTimeoffRequest](../../models/operations/GetHrisTimeoffRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[GetHrisTimeoffResponse](../../models/operations/GetHrisTimeoffResponse.md)**

### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |


## listHrisTimeoffs

List all timeoffs

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.errors.SDKError;
import com.unifiedapi.unifiedto.models.operations.ListHrisTimeoffsRequest;
import com.unifiedapi.unifiedto.models.operations.ListHrisTimeoffsResponse;
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

            ListHrisTimeoffsRequest req = ListHrisTimeoffsRequest.builder()
                .connectionId("<value>")
                .build();

            ListHrisTimeoffsResponse res = sdk.timeoff().listHrisTimeoffs()
                .request(req)
                .call();

            if (res.hrisTimeoffs().isPresent()) {
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

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [ListHrisTimeoffsRequest](../../models/operations/ListHrisTimeoffsRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[ListHrisTimeoffsResponse](../../models/operations/ListHrisTimeoffsResponse.md)**

### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |
