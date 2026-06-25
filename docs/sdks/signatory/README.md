# Signatory

## Overview

### Available Operations

* [createSigningSignatory2](#createsigningsignatory2) - Create a signatory
* [getSigningSignatory2](#getsigningsignatory2) - Retrieve a signatory
* [listSigningSignatories2](#listsigningsignatories2) - List all signatories
* [patchSigningSignatory2](#patchsigningsignatory2) - Update a signatory
* [removeSigningSignatory2](#removesigningsignatory2) - Remove a signatory
* [updateSigningSignatory2](#updatesigningsignatory2) - Update a signatory

## createSigningSignatory2

Create a signatory

### Example Usage

<!-- UsageSnippet language="java" operationID="createSigningSignatory2" method="post" path="/signing/{connection_id}/signatory" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateSigningSignatory2Request;
import to.unified.unified_java_sdk.models.operations.CreateSigningSignatory2Response;
import to.unified.unified_java_sdk.models.shared.Security;
import to.unified.unified_java_sdk.models.shared.SigningSignatory;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateSigningSignatory2Request req = CreateSigningSignatory2Request.builder()
                .signingSignatory(SigningSignatory.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateSigningSignatory2Response res = sdk.signatory().createSigningSignatory2()
                .request(req)
                .call();

        if (res.signingSignatory().isPresent()) {
            System.out.println(res.signingSignatory().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [CreateSigningSignatory2Request](../../models/operations/CreateSigningSignatory2Request.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[CreateSigningSignatory2Response](../../models/operations/CreateSigningSignatory2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getSigningSignatory2

Retrieve a signatory

### Example Usage

<!-- UsageSnippet language="java" operationID="getSigningSignatory2" method="get" path="/signing/{connection_id}/signatory/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetSigningSignatory2Request;
import to.unified.unified_java_sdk.models.operations.GetSigningSignatory2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetSigningSignatory2Request req = GetSigningSignatory2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetSigningSignatory2Response res = sdk.signatory().getSigningSignatory2()
                .request(req)
                .call();

        if (res.signingSignatory().isPresent()) {
            System.out.println(res.signingSignatory().get());
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [GetSigningSignatory2Request](../../models/operations/GetSigningSignatory2Request.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[GetSigningSignatory2Response](../../models/operations/GetSigningSignatory2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listSigningSignatories2

List all signatories

### Example Usage

<!-- UsageSnippet language="java" operationID="listSigningSignatories2" method="get" path="/signing/{connection_id}/signatory" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListSigningSignatories2Request;
import to.unified.unified_java_sdk.models.operations.ListSigningSignatories2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListSigningSignatories2Request req = ListSigningSignatories2Request.builder()
                .connectionId("<id>")
                .build();

        ListSigningSignatories2Response res = sdk.signatory().listSigningSignatories2()
                .request(req)
                .call();

        if (res.signingSignatories().isPresent()) {
            System.out.println(res.signingSignatories().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [ListSigningSignatories2Request](../../models/operations/ListSigningSignatories2Request.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[ListSigningSignatories2Response](../../models/operations/ListSigningSignatories2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchSigningSignatory2

Update a signatory

### Example Usage

<!-- UsageSnippet language="java" operationID="patchSigningSignatory2" method="patch" path="/signing/{connection_id}/signatory/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchSigningSignatory2Request;
import to.unified.unified_java_sdk.models.operations.PatchSigningSignatory2Response;
import to.unified.unified_java_sdk.models.shared.Security;
import to.unified.unified_java_sdk.models.shared.SigningSignatory;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchSigningSignatory2Request req = PatchSigningSignatory2Request.builder()
                .signingSignatory(SigningSignatory.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchSigningSignatory2Response res = sdk.signatory().patchSigningSignatory2()
                .request(req)
                .call();

        if (res.signingSignatory().isPresent()) {
            System.out.println(res.signingSignatory().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [PatchSigningSignatory2Request](../../models/operations/PatchSigningSignatory2Request.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[PatchSigningSignatory2Response](../../models/operations/PatchSigningSignatory2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeSigningSignatory2

Remove a signatory

### Example Usage

<!-- UsageSnippet language="java" operationID="removeSigningSignatory2" method="delete" path="/signing/{connection_id}/signatory/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveSigningSignatory2Request;
import to.unified.unified_java_sdk.models.operations.RemoveSigningSignatory2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveSigningSignatory2Request req = RemoveSigningSignatory2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveSigningSignatory2Response res = sdk.signatory().removeSigningSignatory2()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [RemoveSigningSignatory2Request](../../models/operations/RemoveSigningSignatory2Request.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[RemoveSigningSignatory2Response](../../models/operations/RemoveSigningSignatory2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateSigningSignatory2

Update a signatory

### Example Usage

<!-- UsageSnippet language="java" operationID="updateSigningSignatory2" method="put" path="/signing/{connection_id}/signatory/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateSigningSignatory2Request;
import to.unified.unified_java_sdk.models.operations.UpdateSigningSignatory2Response;
import to.unified.unified_java_sdk.models.shared.Security;
import to.unified.unified_java_sdk.models.shared.SigningSignatory;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateSigningSignatory2Request req = UpdateSigningSignatory2Request.builder()
                .signingSignatory(SigningSignatory.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateSigningSignatory2Response res = sdk.signatory().updateSigningSignatory2()
                .request(req)
                .call();

        if (res.signingSignatory().isPresent()) {
            System.out.println(res.signingSignatory().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [UpdateSigningSignatory2Request](../../models/operations/UpdateSigningSignatory2Request.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[UpdateSigningSignatory2Response](../../models/operations/UpdateSigningSignatory2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |