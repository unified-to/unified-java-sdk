# Passthrough
(*passthrough*)

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
import com.unifiedapi.unifiedto.models.operations.CreatePassthroughRequest;
import com.unifiedapi.unifiedto.models.operations.CreatePassthroughResponse;
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

            com.unifiedapi.unifiedto.models.operations.CreatePassthroughRequest req = new CreatePassthroughRequest(
                "string",
                "string"){{
                requestBody = new java.util.HashMap<String, java.lang.Object>(
                ){{
                    put("key", "string");
                }};

            }};

            com.unifiedapi.unifiedto.models.operations.CreatePassthroughResponse res = sdk.passthrough.createPassthrough(req);

            if (res.result != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                  | Type                                                                                                                       | Required                                                                                                                   | Description                                                                                                                |
| -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                  | [com.unifiedapi.unifiedto.models.operations.CreatePassthroughRequest](../../models/operations/CreatePassthroughRequest.md) | :heavy_check_mark:                                                                                                         | The request object to use for the request.                                                                                 |


### Response

**[com.unifiedapi.unifiedto.models.operations.CreatePassthroughResponse](../../models/operations/CreatePassthroughResponse.md)**


## listPassthroughs

Passthrough GET

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.ListPassthroughsRequest;
import com.unifiedapi.unifiedto.models.operations.ListPassthroughsResponse;
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

            com.unifiedapi.unifiedto.models.operations.ListPassthroughsRequest req = new ListPassthroughsRequest(
                "string",
                "string");

            com.unifiedapi.unifiedto.models.operations.ListPassthroughsResponse res = sdk.passthrough.listPassthroughs(req);

            if (res.result != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                | Type                                                                                                                     | Required                                                                                                                 | Description                                                                                                              |
| ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                | [com.unifiedapi.unifiedto.models.operations.ListPassthroughsRequest](../../models/operations/ListPassthroughsRequest.md) | :heavy_check_mark:                                                                                                       | The request object to use for the request.                                                                               |


### Response

**[com.unifiedapi.unifiedto.models.operations.ListPassthroughsResponse](../../models/operations/ListPassthroughsResponse.md)**


## patchPassthrough

Passthrough PUT

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PatchPassthroughRequest;
import com.unifiedapi.unifiedto.models.operations.PatchPassthroughResponse;
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

            com.unifiedapi.unifiedto.models.operations.PatchPassthroughRequest req = new PatchPassthroughRequest(
                "string",
                "string"){{
                requestBody = new java.util.HashMap<String, java.lang.Object>(
                ){{
                    put("key", "string");
                }};

            }};

            com.unifiedapi.unifiedto.models.operations.PatchPassthroughResponse res = sdk.passthrough.patchPassthrough(req);

            if (res.result != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                | Type                                                                                                                     | Required                                                                                                                 | Description                                                                                                              |
| ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                | [com.unifiedapi.unifiedto.models.operations.PatchPassthroughRequest](../../models/operations/PatchPassthroughRequest.md) | :heavy_check_mark:                                                                                                       | The request object to use for the request.                                                                               |


### Response

**[com.unifiedapi.unifiedto.models.operations.PatchPassthroughResponse](../../models/operations/PatchPassthroughResponse.md)**


## removePassthrough

Passthrough DELETE

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.RemovePassthroughRequest;
import com.unifiedapi.unifiedto.models.operations.RemovePassthroughResponse;
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

            com.unifiedapi.unifiedto.models.operations.RemovePassthroughRequest req = new RemovePassthroughRequest(
                "string",
                "string");

            com.unifiedapi.unifiedto.models.operations.RemovePassthroughResponse res = sdk.passthrough.removePassthrough(req);

            if (res.result != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                  | Type                                                                                                                       | Required                                                                                                                   | Description                                                                                                                |
| -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                  | [com.unifiedapi.unifiedto.models.operations.RemovePassthroughRequest](../../models/operations/RemovePassthroughRequest.md) | :heavy_check_mark:                                                                                                         | The request object to use for the request.                                                                                 |


### Response

**[com.unifiedapi.unifiedto.models.operations.RemovePassthroughResponse](../../models/operations/RemovePassthroughResponse.md)**


## updatePassthrough

Passthrough PUT

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.UpdatePassthroughRequest;
import com.unifiedapi.unifiedto.models.operations.UpdatePassthroughResponse;
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

            com.unifiedapi.unifiedto.models.operations.UpdatePassthroughRequest req = new UpdatePassthroughRequest(
                "string",
                "string"){{
                requestBody = new java.util.HashMap<String, java.lang.Object>(
                ){{
                    put("key", "string");
                }};

            }};

            com.unifiedapi.unifiedto.models.operations.UpdatePassthroughResponse res = sdk.passthrough.updatePassthrough(req);

            if (res.result != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                  | Type                                                                                                                       | Required                                                                                                                   | Description                                                                                                                |
| -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                  | [com.unifiedapi.unifiedto.models.operations.UpdatePassthroughRequest](../../models/operations/UpdatePassthroughRequest.md) | :heavy_check_mark:                                                                                                         | The request object to use for the request.                                                                                 |


### Response

**[com.unifiedapi.unifiedto.models.operations.UpdatePassthroughResponse](../../models/operations/UpdatePassthroughResponse.md)**

