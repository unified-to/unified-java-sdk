# Passthrough
(*passthrough*)

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
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("dolorum") {{
                    jwt = "";
                }})
                .build();

            DeletePassthroughConnectionIdPathRequest req = new DeletePassthroughConnectionIdPathRequest("provident", "incidunt");            

            DeletePassthroughConnectionIdPathResponse res = sdk.passthrough.deletePassthroughConnectionIdPath(req);

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
| `request`                                                                                                                                                  | [com.unifiedapi.unifiedto.models.operations.DeletePassthroughConnectionIdPathRequest](../../models/operations/DeletePassthroughConnectionIdPathRequest.md) | :heavy_check_mark:                                                                                                                                         | The request object to use for the request.                                                                                                                 |


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
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("maiores") {{
                    jwt = "";
                }})
                .build();

            GetPassthroughConnectionIdPathRequest req = new GetPassthroughConnectionIdPathRequest("ea", "modi");            

            GetPassthroughConnectionIdPathResponse res = sdk.passthrough.getPassthroughConnectionIdPath(req);

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

| Parameter                                                                                                                                            | Type                                                                                                                                                 | Required                                                                                                                                             | Description                                                                                                                                          |
| ---------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                            | [com.unifiedapi.unifiedto.models.operations.GetPassthroughConnectionIdPathRequest](../../models/operations/GetPassthroughConnectionIdPathRequest.md) | :heavy_check_mark:                                                                                                                                   | The request object to use for the request.                                                                                                           |


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
import com.unifiedapi.unifiedto.models.shared.Security;
import com.unifiedapi.unifiedto.models.shared.Undefined;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("sequi") {{
                    jwt = "";
                }})
                .build();

            PatchPassthroughConnectionIdPathRequest req = new PatchPassthroughConnectionIdPathRequest("nisi", "autem") {{
                undefined = new Undefined();;
            }};            

            PatchPassthroughConnectionIdPathResponse res = sdk.passthrough.patchPassthroughConnectionIdPath(req);

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
| `request`                                                                                                                                                | [com.unifiedapi.unifiedto.models.operations.PatchPassthroughConnectionIdPathRequest](../../models/operations/PatchPassthroughConnectionIdPathRequest.md) | :heavy_check_mark:                                                                                                                                       | The request object to use for the request.                                                                                                               |


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
import com.unifiedapi.unifiedto.models.shared.Security;
import com.unifiedapi.unifiedto.models.shared.Undefined;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("tempora") {{
                    jwt = "";
                }})
                .build();

            PostPassthroughConnectionIdPathRequest req = new PostPassthroughConnectionIdPathRequest("mollitia", "quas") {{
                undefined = new Undefined();;
            }};            

            PostPassthroughConnectionIdPathResponse res = sdk.passthrough.postPassthroughConnectionIdPath(req);

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
| `request`                                                                                                                                              | [com.unifiedapi.unifiedto.models.operations.PostPassthroughConnectionIdPathRequest](../../models/operations/PostPassthroughConnectionIdPathRequest.md) | :heavy_check_mark:                                                                                                                                     | The request object to use for the request.                                                                                                             |


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
import com.unifiedapi.unifiedto.models.shared.Security;
import com.unifiedapi.unifiedto.models.shared.Undefined;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("hic") {{
                    jwt = "";
                }})
                .build();

            PutPassthroughConnectionIdPathRequest req = new PutPassthroughConnectionIdPathRequest("doloremque", "id") {{
                undefined = new Undefined();;
            }};            

            PutPassthroughConnectionIdPathResponse res = sdk.passthrough.putPassthroughConnectionIdPath(req);

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

| Parameter                                                                                                                                            | Type                                                                                                                                                 | Required                                                                                                                                             | Description                                                                                                                                          |
| ---------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                            | [com.unifiedapi.unifiedto.models.operations.PutPassthroughConnectionIdPathRequest](../../models/operations/PutPassthroughConnectionIdPathRequest.md) | :heavy_check_mark:                                                                                                                                   | The request object to use for the request.                                                                                                           |


### Response

**[com.unifiedapi.unifiedto.models.operations.PutPassthroughConnectionIdPathResponse](../../models/operations/PutPassthroughConnectionIdPathResponse.md)**

