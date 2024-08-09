# Passthrough
(*passthrough()*)

### Available Operations

* [createPassthrough](#createpassthrough) - Passthrough POST
* [listPassthroughs](#listpassthroughs) - Passthrough GET
* [patchPassthrough](#patchpassthrough) - Passthrough PUT
* [removePassthrough](#removepassthrough) - Passthrough DELETE
* [updatePassthrough](#updatepassthrough) - Passthrough PUT

## createPassthrough

Passthrough POST

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.errors.SDKError;
import com.unifiedapi.unifiedto.models.operations.CreatePassthroughRequest;
import com.unifiedapi.unifiedto.models.operations.CreatePassthroughResponse;
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

            CreatePassthroughRequest req = CreatePassthroughRequest.builder()
                .connectionId("<value>")
                .path("<value>")
                .build();

            CreatePassthroughResponse res = sdk.passthrough().createPassthrough()
                .request(req)
                .call();

            if (res.result().isPresent()) {
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

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [CreatePassthroughRequest](../../models/operations/CreatePassthroughRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |


### Response

**[CreatePassthroughResponse](../../models/operations/CreatePassthroughResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |

## listPassthroughs

Passthrough GET

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.errors.SDKError;
import com.unifiedapi.unifiedto.models.operations.ListPassthroughsRequest;
import com.unifiedapi.unifiedto.models.operations.ListPassthroughsResponse;
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

            ListPassthroughsRequest req = ListPassthroughsRequest.builder()
                .connectionId("<value>")
                .path("<value>")
                .build();

            ListPassthroughsResponse res = sdk.passthrough().listPassthroughs()
                .request(req)
                .call();

            if (res.result().isPresent()) {
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
| `request`                                                                     | [ListPassthroughsRequest](../../models/operations/ListPassthroughsRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |


### Response

**[ListPassthroughsResponse](../../models/operations/ListPassthroughsResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |

## patchPassthrough

Passthrough PUT

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.errors.SDKError;
import com.unifiedapi.unifiedto.models.operations.PatchPassthroughRequest;
import com.unifiedapi.unifiedto.models.operations.PatchPassthroughResponse;
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

            PatchPassthroughRequest req = PatchPassthroughRequest.builder()
                .connectionId("<value>")
                .path("<value>")
                .build();

            PatchPassthroughResponse res = sdk.passthrough().patchPassthrough()
                .request(req)
                .call();

            if (res.result().isPresent()) {
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
| `request`                                                                     | [PatchPassthroughRequest](../../models/operations/PatchPassthroughRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |


### Response

**[PatchPassthroughResponse](../../models/operations/PatchPassthroughResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |

## removePassthrough

Passthrough DELETE

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.errors.SDKError;
import com.unifiedapi.unifiedto.models.operations.RemovePassthroughRequest;
import com.unifiedapi.unifiedto.models.operations.RemovePassthroughResponse;
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

            RemovePassthroughRequest req = RemovePassthroughRequest.builder()
                .connectionId("<value>")
                .path("<value>")
                .build();

            RemovePassthroughResponse res = sdk.passthrough().removePassthrough()
                .request(req)
                .call();

            if (res.result().isPresent()) {
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

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [RemovePassthroughRequest](../../models/operations/RemovePassthroughRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |


### Response

**[RemovePassthroughResponse](../../models/operations/RemovePassthroughResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |

## updatePassthrough

Passthrough PUT

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.errors.SDKError;
import com.unifiedapi.unifiedto.models.operations.UpdatePassthroughRequest;
import com.unifiedapi.unifiedto.models.operations.UpdatePassthroughResponse;
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

            UpdatePassthroughRequest req = UpdatePassthroughRequest.builder()
                .connectionId("<value>")
                .path("<value>")
                .build();

            UpdatePassthroughResponse res = sdk.passthrough().updatePassthrough()
                .request(req)
                .call();

            if (res.result().isPresent()) {
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

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [UpdatePassthroughRequest](../../models/operations/UpdatePassthroughRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |


### Response

**[UpdatePassthroughResponse](../../models/operations/UpdatePassthroughResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |
