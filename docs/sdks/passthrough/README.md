# Passthrough

### Available Operations

* [deletePassthroughConnectionIdPath](#deletepassthroughconnectionidpath) - Passthrough DELETE
* [getPassthroughConnectionIdPath](#getpassthroughconnectionidpath) - Passthrough GET
* [patchPassthroughConnectionIdPath](#patchpassthroughconnectionidpath) - Passthrough PUT
* [postPassthroughConnectionIdPath](#postpassthroughconnectionidpath) - Passthrough POST
* [putPassthroughConnectionIdPath](#putpassthroughconnectionidpath) - Passthrough PUT

## deletePassthroughConnectionIdPath

Passthrough DELETE

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.DeletePassthroughConnectionIdPathRequest;
import com.unifiedapi.unifiedto.models.operations.DeletePassthroughConnectionIdPathResponse;
import com.unifiedapi.unifiedto.models.operations.DeletePassthroughConnectionIdPathSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            DeletePassthroughConnectionIdPathRequest req = new DeletePassthroughConnectionIdPathRequest("totam", "provident");            

            DeletePassthroughConnectionIdPathResponse res = sdk.passthrough.deletePassthroughConnectionIdPath(req, new DeletePassthroughConnectionIdPathSecurity("maxime") {{
                jwt = "";
            }});

            if (res.undefined != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                    | Type                                                                                                                                                         | Required                                                                                                                                                     | Description                                                                                                                                                  |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                    | [com.unifiedapi.unifiedto.models.operations.DeletePassthroughConnectionIdPathRequest](../../models/operations/DeletePassthroughConnectionIdPathRequest.md)   | :heavy_check_mark:                                                                                                                                           | The request object to use for the request.                                                                                                                   |
| `security`                                                                                                                                                   | [com.unifiedapi.unifiedto.models.operations.DeletePassthroughConnectionIdPathSecurity](../../models/operations/DeletePassthroughConnectionIdPathSecurity.md) | :heavy_check_mark:                                                                                                                                           | The security requirements to use for the request.                                                                                                            |


### Response

**[com.unifiedapi.unifiedto.models.operations.DeletePassthroughConnectionIdPathResponse](../../models/operations/DeletePassthroughConnectionIdPathResponse.md)**


## getPassthroughConnectionIdPath

Passthrough GET

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetPassthroughConnectionIdPathRequest;
import com.unifiedapi.unifiedto.models.operations.GetPassthroughConnectionIdPathResponse;
import com.unifiedapi.unifiedto.models.operations.GetPassthroughConnectionIdPathSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            GetPassthroughConnectionIdPathRequest req = new GetPassthroughConnectionIdPathRequest("totam", "id");            

            GetPassthroughConnectionIdPathResponse res = sdk.passthrough.getPassthroughConnectionIdPath(req, new GetPassthroughConnectionIdPathSecurity("neque") {{
                jwt = "";
            }});

            if (res.undefined != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                              | Type                                                                                                                                                   | Required                                                                                                                                               | Description                                                                                                                                            |
| ------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                              | [com.unifiedapi.unifiedto.models.operations.GetPassthroughConnectionIdPathRequest](../../models/operations/GetPassthroughConnectionIdPathRequest.md)   | :heavy_check_mark:                                                                                                                                     | The request object to use for the request.                                                                                                             |
| `security`                                                                                                                                             | [com.unifiedapi.unifiedto.models.operations.GetPassthroughConnectionIdPathSecurity](../../models/operations/GetPassthroughConnectionIdPathSecurity.md) | :heavy_check_mark:                                                                                                                                     | The security requirements to use for the request.                                                                                                      |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetPassthroughConnectionIdPathResponse](../../models/operations/GetPassthroughConnectionIdPathResponse.md)**


## patchPassthroughConnectionIdPath

Passthrough PUT

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PatchPassthroughConnectionIdPathRequest;
import com.unifiedapi.unifiedto.models.operations.PatchPassthroughConnectionIdPathResponse;
import com.unifiedapi.unifiedto.models.operations.PatchPassthroughConnectionIdPathSecurity;
import com.unifiedapi.unifiedto.models.shared.Undefined;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            PatchPassthroughConnectionIdPathRequest req = new PatchPassthroughConnectionIdPathRequest("dolores", "vel") {{
                undefined = new Undefined();;
            }};            

            PatchPassthroughConnectionIdPathResponse res = sdk.passthrough.patchPassthroughConnectionIdPath(req, new PatchPassthroughConnectionIdPathSecurity("ipsum") {{
                jwt = "";
            }});

            if (res.undefined != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                  | Type                                                                                                                                                       | Required                                                                                                                                                   | Description                                                                                                                                                |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                  | [com.unifiedapi.unifiedto.models.operations.PatchPassthroughConnectionIdPathRequest](../../models/operations/PatchPassthroughConnectionIdPathRequest.md)   | :heavy_check_mark:                                                                                                                                         | The request object to use for the request.                                                                                                                 |
| `security`                                                                                                                                                 | [com.unifiedapi.unifiedto.models.operations.PatchPassthroughConnectionIdPathSecurity](../../models/operations/PatchPassthroughConnectionIdPathSecurity.md) | :heavy_check_mark:                                                                                                                                         | The security requirements to use for the request.                                                                                                          |


### Response

**[com.unifiedapi.unifiedto.models.operations.PatchPassthroughConnectionIdPathResponse](../../models/operations/PatchPassthroughConnectionIdPathResponse.md)**


## postPassthroughConnectionIdPath

Passthrough POST

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PostPassthroughConnectionIdPathRequest;
import com.unifiedapi.unifiedto.models.operations.PostPassthroughConnectionIdPathResponse;
import com.unifiedapi.unifiedto.models.operations.PostPassthroughConnectionIdPathSecurity;
import com.unifiedapi.unifiedto.models.shared.Undefined;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            PostPassthroughConnectionIdPathRequest req = new PostPassthroughConnectionIdPathRequest("occaecati", "pariatur") {{
                undefined = new Undefined();;
            }};            

            PostPassthroughConnectionIdPathResponse res = sdk.passthrough.postPassthroughConnectionIdPath(req, new PostPassthroughConnectionIdPathSecurity("similique") {{
                jwt = "";
            }});

            if (res.undefined != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                | Type                                                                                                                                                     | Required                                                                                                                                                 | Description                                                                                                                                              |
| -------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                | [com.unifiedapi.unifiedto.models.operations.PostPassthroughConnectionIdPathRequest](../../models/operations/PostPassthroughConnectionIdPathRequest.md)   | :heavy_check_mark:                                                                                                                                       | The request object to use for the request.                                                                                                               |
| `security`                                                                                                                                               | [com.unifiedapi.unifiedto.models.operations.PostPassthroughConnectionIdPathSecurity](../../models/operations/PostPassthroughConnectionIdPathSecurity.md) | :heavy_check_mark:                                                                                                                                       | The security requirements to use for the request.                                                                                                        |


### Response

**[com.unifiedapi.unifiedto.models.operations.PostPassthroughConnectionIdPathResponse](../../models/operations/PostPassthroughConnectionIdPathResponse.md)**


## putPassthroughConnectionIdPath

Passthrough PUT

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PutPassthroughConnectionIdPathRequest;
import com.unifiedapi.unifiedto.models.operations.PutPassthroughConnectionIdPathResponse;
import com.unifiedapi.unifiedto.models.operations.PutPassthroughConnectionIdPathSecurity;
import com.unifiedapi.unifiedto.models.shared.Undefined;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            PutPassthroughConnectionIdPathRequest req = new PutPassthroughConnectionIdPathRequest("quis", "facilis") {{
                undefined = new Undefined();;
            }};            

            PutPassthroughConnectionIdPathResponse res = sdk.passthrough.putPassthroughConnectionIdPath(req, new PutPassthroughConnectionIdPathSecurity("in") {{
                jwt = "";
            }});

            if (res.undefined != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                              | Type                                                                                                                                                   | Required                                                                                                                                               | Description                                                                                                                                            |
| ------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                              | [com.unifiedapi.unifiedto.models.operations.PutPassthroughConnectionIdPathRequest](../../models/operations/PutPassthroughConnectionIdPathRequest.md)   | :heavy_check_mark:                                                                                                                                     | The request object to use for the request.                                                                                                             |
| `security`                                                                                                                                             | [com.unifiedapi.unifiedto.models.operations.PutPassthroughConnectionIdPathSecurity](../../models/operations/PutPassthroughConnectionIdPathSecurity.md) | :heavy_check_mark:                                                                                                                                     | The security requirements to use for the request.                                                                                                      |


### Response

**[com.unifiedapi.unifiedto.models.operations.PutPassthroughConnectionIdPathResponse](../../models/operations/PutPassthroughConnectionIdPathResponse.md)**

