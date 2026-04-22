# Signatory

## Overview

### Available Operations

* [createSigningSignatory](#createsigningsignatory) - Create a signatory
* [getSigningSignatory](#getsigningsignatory) - Retrieve a signatory
* [listSigningSignatories](#listsigningsignatories) - List all signatories
* [patchSigningSignatory](#patchsigningsignatory) - Update a signatory
* [removeSigningSignatory](#removesigningsignatory) - Remove a signatory
* [updateSigningSignatory](#updatesigningsignatory) - Update a signatory

## createSigningSignatory

Create a signatory

### Example Usage

<!-- UsageSnippet language="java" operationID="createSigningSignatory" method="post" path="/signing/{connection_id}/signatory" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateSigningSignatoryRequest;
import to.unified.unified_java_sdk.models.operations.CreateSigningSignatoryResponse;
import to.unified.unified_java_sdk.models.shared.Security;
import to.unified.unified_java_sdk.models.shared.SigningSignatory;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateSigningSignatoryRequest req = CreateSigningSignatoryRequest.builder()
                .signingSignatory(SigningSignatory.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateSigningSignatoryResponse res = sdk.signatory().createSigningSignatory()
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
| `request`                                                                                 | [CreateSigningSignatoryRequest](../../models/operations/CreateSigningSignatoryRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[CreateSigningSignatoryResponse](../../models/operations/CreateSigningSignatoryResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getSigningSignatory

Retrieve a signatory

### Example Usage

<!-- UsageSnippet language="java" operationID="getSigningSignatory" method="get" path="/signing/{connection_id}/signatory/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetSigningSignatoryRequest;
import to.unified.unified_java_sdk.models.operations.GetSigningSignatoryResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetSigningSignatoryRequest req = GetSigningSignatoryRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetSigningSignatoryResponse res = sdk.signatory().getSigningSignatory()
                .request(req)
                .call();

        if (res.signingSignatory().isPresent()) {
            System.out.println(res.signingSignatory().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [GetSigningSignatoryRequest](../../models/operations/GetSigningSignatoryRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[GetSigningSignatoryResponse](../../models/operations/GetSigningSignatoryResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listSigningSignatories

List all signatories

### Example Usage

<!-- UsageSnippet language="java" operationID="listSigningSignatories" method="get" path="/signing/{connection_id}/signatory" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListSigningSignatoriesRequest;
import to.unified.unified_java_sdk.models.operations.ListSigningSignatoriesResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListSigningSignatoriesRequest req = ListSigningSignatoriesRequest.builder()
                .connectionId("<id>")
                .build();

        ListSigningSignatoriesResponse res = sdk.signatory().listSigningSignatories()
                .request(req)
                .call();

        if (res.signingSignatories().isPresent()) {
            System.out.println(res.signingSignatories().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [ListSigningSignatoriesRequest](../../models/operations/ListSigningSignatoriesRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[ListSigningSignatoriesResponse](../../models/operations/ListSigningSignatoriesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchSigningSignatory

Update a signatory

### Example Usage

<!-- UsageSnippet language="java" operationID="patchSigningSignatory" method="patch" path="/signing/{connection_id}/signatory/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchSigningSignatoryRequest;
import to.unified.unified_java_sdk.models.operations.PatchSigningSignatoryResponse;
import to.unified.unified_java_sdk.models.shared.Security;
import to.unified.unified_java_sdk.models.shared.SigningSignatory;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchSigningSignatoryRequest req = PatchSigningSignatoryRequest.builder()
                .signingSignatory(SigningSignatory.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchSigningSignatoryResponse res = sdk.signatory().patchSigningSignatory()
                .request(req)
                .call();

        if (res.signingSignatory().isPresent()) {
            System.out.println(res.signingSignatory().get());
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [PatchSigningSignatoryRequest](../../models/operations/PatchSigningSignatoryRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[PatchSigningSignatoryResponse](../../models/operations/PatchSigningSignatoryResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeSigningSignatory

Remove a signatory

### Example Usage

<!-- UsageSnippet language="java" operationID="removeSigningSignatory" method="delete" path="/signing/{connection_id}/signatory/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveSigningSignatoryRequest;
import to.unified.unified_java_sdk.models.operations.RemoveSigningSignatoryResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveSigningSignatoryRequest req = RemoveSigningSignatoryRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveSigningSignatoryResponse res = sdk.signatory().removeSigningSignatory()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [RemoveSigningSignatoryRequest](../../models/operations/RemoveSigningSignatoryRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[RemoveSigningSignatoryResponse](../../models/operations/RemoveSigningSignatoryResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateSigningSignatory

Update a signatory

### Example Usage

<!-- UsageSnippet language="java" operationID="updateSigningSignatory" method="put" path="/signing/{connection_id}/signatory/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateSigningSignatoryRequest;
import to.unified.unified_java_sdk.models.operations.UpdateSigningSignatoryResponse;
import to.unified.unified_java_sdk.models.shared.Security;
import to.unified.unified_java_sdk.models.shared.SigningSignatory;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateSigningSignatoryRequest req = UpdateSigningSignatoryRequest.builder()
                .signingSignatory(SigningSignatory.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateSigningSignatoryResponse res = sdk.signatory().updateSigningSignatory()
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
| `request`                                                                                 | [UpdateSigningSignatoryRequest](../../models/operations/UpdateSigningSignatoryRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[UpdateSigningSignatoryResponse](../../models/operations/UpdateSigningSignatoryResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |