# Package
(*package_()*)

## Overview

### Available Operations

* [getVerificationPackage](#getverificationpackage) - Retrieve a package
* [listVerificationPackages](#listverificationpackages) - List all packages

## getVerificationPackage

Retrieve a package

### Example Usage

<!-- UsageSnippet language="java" operationID="getVerificationPackage" method="get" path="/verification/{connection_id}/package/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetVerificationPackageRequest;
import to.unified.unified_java_sdk.models.operations.GetVerificationPackageResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetVerificationPackageRequest req = GetVerificationPackageRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetVerificationPackageResponse res = sdk.package_().getVerificationPackage()
                .request(req)
                .call();

        if (res.verificationPackage().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [GetVerificationPackageRequest](../../models/operations/GetVerificationPackageRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[GetVerificationPackageResponse](../../models/operations/GetVerificationPackageResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listVerificationPackages

List all packages

### Example Usage

<!-- UsageSnippet language="java" operationID="listVerificationPackages" method="get" path="/verification/{connection_id}/package" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListVerificationPackagesRequest;
import to.unified.unified_java_sdk.models.operations.ListVerificationPackagesResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListVerificationPackagesRequest req = ListVerificationPackagesRequest.builder()
                .connectionId("<id>")
                .build();

        ListVerificationPackagesResponse res = sdk.package_().listVerificationPackages()
                .request(req)
                .call();

        if (res.verificationPackages().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [ListVerificationPackagesRequest](../../models/operations/ListVerificationPackagesRequest.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[ListVerificationPackagesResponse](../../models/operations/ListVerificationPackagesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |