# Package

## Overview

### Available Operations

* [createAssessmentPackage](#createassessmentpackage) - Create an assessment package
* [getAssessmentPackage](#getassessmentpackage) - Get an assessment package
* [getVerificationPackage](#getverificationpackage) - Retrieve a package
* [listAssessmentPackages](#listassessmentpackages) - List assessment packages
* [listVerificationPackages](#listverificationpackages) - List all packages
* [patchAssessmentPackage](#patchassessmentpackage) - Update an assessment package
* [removeAssessmentPackage](#removeassessmentpackage) - Delete an assessment package
* [updateAssessmentPackage](#updateassessmentpackage) - Update an assessment package

## createAssessmentPackage

Create an assessment package

### Example Usage

<!-- UsageSnippet language="java" operationID="createAssessmentPackage" method="post" path="/assessment/{connection_id}/package" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateAssessmentPackageRequest;
import to.unified.unified_java_sdk.models.operations.CreateAssessmentPackageResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateAssessmentPackageRequest req = CreateAssessmentPackageRequest.builder()
                .assessmentPackage(AssessmentPackage.builder()
                    .id("<id>")
                    .name("<value>")
                    .type(AssessmentPackageType.REFERENCE_CHECK)
                    .build())
                .connectionId("<id>")
                .build();

        CreateAssessmentPackageResponse res = sdk.package_().createAssessmentPackage()
                .request(req)
                .call();

        if (res.assessmentPackage().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [CreateAssessmentPackageRequest](../../models/operations/CreateAssessmentPackageRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[CreateAssessmentPackageResponse](../../models/operations/CreateAssessmentPackageResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getAssessmentPackage

Get an assessment package

### Example Usage

<!-- UsageSnippet language="java" operationID="getAssessmentPackage" method="get" path="/assessment/{connection_id}/package/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetAssessmentPackageRequest;
import to.unified.unified_java_sdk.models.operations.GetAssessmentPackageResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetAssessmentPackageRequest req = GetAssessmentPackageRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetAssessmentPackageResponse res = sdk.package_().getAssessmentPackage()
                .request(req)
                .call();

        if (res.assessmentPackage().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [GetAssessmentPackageRequest](../../models/operations/GetAssessmentPackageRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[GetAssessmentPackageResponse](../../models/operations/GetAssessmentPackageResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

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

## listAssessmentPackages

List assessment packages

### Example Usage

<!-- UsageSnippet language="java" operationID="listAssessmentPackages" method="get" path="/assessment/{connection_id}/package" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListAssessmentPackagesRequest;
import to.unified.unified_java_sdk.models.operations.ListAssessmentPackagesResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListAssessmentPackagesRequest req = ListAssessmentPackagesRequest.builder()
                .connectionId("<id>")
                .build();

        ListAssessmentPackagesResponse res = sdk.package_().listAssessmentPackages()
                .request(req)
                .call();

        if (res.assessmentPackages().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [ListAssessmentPackagesRequest](../../models/operations/ListAssessmentPackagesRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[ListAssessmentPackagesResponse](../../models/operations/ListAssessmentPackagesResponse.md)**

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

## patchAssessmentPackage

Update an assessment package

### Example Usage

<!-- UsageSnippet language="java" operationID="patchAssessmentPackage" method="patch" path="/assessment/{connection_id}/package/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchAssessmentPackageRequest;
import to.unified.unified_java_sdk.models.operations.PatchAssessmentPackageResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchAssessmentPackageRequest req = PatchAssessmentPackageRequest.builder()
                .assessmentPackage(AssessmentPackage.builder()
                    .id("<id>")
                    .name("<value>")
                    .type(AssessmentPackageType.BACKGROUND_CHECK)
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchAssessmentPackageResponse res = sdk.package_().patchAssessmentPackage()
                .request(req)
                .call();

        if (res.assessmentPackage().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [PatchAssessmentPackageRequest](../../models/operations/PatchAssessmentPackageRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[PatchAssessmentPackageResponse](../../models/operations/PatchAssessmentPackageResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeAssessmentPackage

Delete an assessment package

### Example Usage

<!-- UsageSnippet language="java" operationID="removeAssessmentPackage" method="delete" path="/assessment/{connection_id}/package/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveAssessmentPackageRequest;
import to.unified.unified_java_sdk.models.operations.RemoveAssessmentPackageResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveAssessmentPackageRequest req = RemoveAssessmentPackageRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveAssessmentPackageResponse res = sdk.package_().removeAssessmentPackage()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [RemoveAssessmentPackageRequest](../../models/operations/RemoveAssessmentPackageRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[RemoveAssessmentPackageResponse](../../models/operations/RemoveAssessmentPackageResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateAssessmentPackage

Update an assessment package

### Example Usage

<!-- UsageSnippet language="java" operationID="updateAssessmentPackage" method="put" path="/assessment/{connection_id}/package/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateAssessmentPackageRequest;
import to.unified.unified_java_sdk.models.operations.UpdateAssessmentPackageResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateAssessmentPackageRequest req = UpdateAssessmentPackageRequest.builder()
                .assessmentPackage(AssessmentPackage.builder()
                    .id("<id>")
                    .name("<value>")
                    .type(AssessmentPackageType.OTHER)
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateAssessmentPackageResponse res = sdk.package_().updateAssessmentPackage()
                .request(req)
                .call();

        if (res.assessmentPackage().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [UpdateAssessmentPackageRequest](../../models/operations/UpdateAssessmentPackageRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[UpdateAssessmentPackageResponse](../../models/operations/UpdateAssessmentPackageResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |