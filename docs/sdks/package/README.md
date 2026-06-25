# Package

## Overview

### Available Operations

* [createAssessmentPackage2](#createassessmentpackage2) - Create an assessment package
* [getAssessmentPackage2](#getassessmentpackage2) - Get an assessment package
* [getVerificationPackage2](#getverificationpackage2) - Retrieve a package
* [listAssessmentPackages2](#listassessmentpackages2) - List assessment packages
* [listVerificationPackages2](#listverificationpackages2) - List all packages
* [patchAssessmentPackage2](#patchassessmentpackage2) - Update an assessment package
* [removeAssessmentPackage2](#removeassessmentpackage2) - Delete an assessment package
* [updateAssessmentPackage2](#updateassessmentpackage2) - Update an assessment package

## createAssessmentPackage2

Create an assessment package

### Example Usage

<!-- UsageSnippet language="java" operationID="createAssessmentPackage2" method="post" path="/assessment/{connection_id}/package" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateAssessmentPackage2Request;
import to.unified.unified_java_sdk.models.operations.CreateAssessmentPackage2Response;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateAssessmentPackage2Request req = CreateAssessmentPackage2Request.builder()
                .assessmentPackage(AssessmentPackage.builder()
                    .type(AssessmentPackageType.VIDEO_INTERVIEW)
                    .build())
                .connectionId("<id>")
                .build();

        CreateAssessmentPackage2Response res = sdk.package_().createAssessmentPackage2()
                .request(req)
                .call();

        if (res.assessmentPackage().isPresent()) {
            System.out.println(res.assessmentPackage().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [CreateAssessmentPackage2Request](../../models/operations/CreateAssessmentPackage2Request.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[CreateAssessmentPackage2Response](../../models/operations/CreateAssessmentPackage2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getAssessmentPackage2

Get an assessment package

### Example Usage

<!-- UsageSnippet language="java" operationID="getAssessmentPackage2" method="get" path="/assessment/{connection_id}/package/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetAssessmentPackage2Request;
import to.unified.unified_java_sdk.models.operations.GetAssessmentPackage2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetAssessmentPackage2Request req = GetAssessmentPackage2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetAssessmentPackage2Response res = sdk.package_().getAssessmentPackage2()
                .request(req)
                .call();

        if (res.assessmentPackage().isPresent()) {
            System.out.println(res.assessmentPackage().get());
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [GetAssessmentPackage2Request](../../models/operations/GetAssessmentPackage2Request.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[GetAssessmentPackage2Response](../../models/operations/GetAssessmentPackage2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getVerificationPackage2

Retrieve a package

### Example Usage

<!-- UsageSnippet language="java" operationID="getVerificationPackage2" method="get" path="/verification/{connection_id}/package/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetVerificationPackage2Request;
import to.unified.unified_java_sdk.models.operations.GetVerificationPackage2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetVerificationPackage2Request req = GetVerificationPackage2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetVerificationPackage2Response res = sdk.package_().getVerificationPackage2()
                .request(req)
                .call();

        if (res.verificationPackage().isPresent()) {
            System.out.println(res.verificationPackage().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [GetVerificationPackage2Request](../../models/operations/GetVerificationPackage2Request.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[GetVerificationPackage2Response](../../models/operations/GetVerificationPackage2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listAssessmentPackages2

List assessment packages

### Example Usage

<!-- UsageSnippet language="java" operationID="listAssessmentPackages2" method="get" path="/assessment/{connection_id}/package" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListAssessmentPackages2Request;
import to.unified.unified_java_sdk.models.operations.ListAssessmentPackages2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListAssessmentPackages2Request req = ListAssessmentPackages2Request.builder()
                .connectionId("<id>")
                .build();

        ListAssessmentPackages2Response res = sdk.package_().listAssessmentPackages2()
                .request(req)
                .call();

        if (res.assessmentPackages().isPresent()) {
            System.out.println(res.assessmentPackages().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [ListAssessmentPackages2Request](../../models/operations/ListAssessmentPackages2Request.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[ListAssessmentPackages2Response](../../models/operations/ListAssessmentPackages2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listVerificationPackages2

List all packages

### Example Usage

<!-- UsageSnippet language="java" operationID="listVerificationPackages2" method="get" path="/verification/{connection_id}/package" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListVerificationPackages2Request;
import to.unified.unified_java_sdk.models.operations.ListVerificationPackages2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListVerificationPackages2Request req = ListVerificationPackages2Request.builder()
                .connectionId("<id>")
                .build();

        ListVerificationPackages2Response res = sdk.package_().listVerificationPackages2()
                .request(req)
                .call();

        if (res.verificationPackages().isPresent()) {
            System.out.println(res.verificationPackages().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `request`                                                                                       | [ListVerificationPackages2Request](../../models/operations/ListVerificationPackages2Request.md) | :heavy_check_mark:                                                                              | The request object to use for the request.                                                      |

### Response

**[ListVerificationPackages2Response](../../models/operations/ListVerificationPackages2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchAssessmentPackage2

Update an assessment package

### Example Usage

<!-- UsageSnippet language="java" operationID="patchAssessmentPackage2" method="patch" path="/assessment/{connection_id}/package/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchAssessmentPackage2Request;
import to.unified.unified_java_sdk.models.operations.PatchAssessmentPackage2Response;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchAssessmentPackage2Request req = PatchAssessmentPackage2Request.builder()
                .assessmentPackage(AssessmentPackage.builder()
                    .type(AssessmentPackageType.OTHER)
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchAssessmentPackage2Response res = sdk.package_().patchAssessmentPackage2()
                .request(req)
                .call();

        if (res.assessmentPackage().isPresent()) {
            System.out.println(res.assessmentPackage().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [PatchAssessmentPackage2Request](../../models/operations/PatchAssessmentPackage2Request.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[PatchAssessmentPackage2Response](../../models/operations/PatchAssessmentPackage2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeAssessmentPackage2

Delete an assessment package

### Example Usage

<!-- UsageSnippet language="java" operationID="removeAssessmentPackage2" method="delete" path="/assessment/{connection_id}/package/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveAssessmentPackage2Request;
import to.unified.unified_java_sdk.models.operations.RemoveAssessmentPackage2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveAssessmentPackage2Request req = RemoveAssessmentPackage2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveAssessmentPackage2Response res = sdk.package_().removeAssessmentPackage2()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [RemoveAssessmentPackage2Request](../../models/operations/RemoveAssessmentPackage2Request.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[RemoveAssessmentPackage2Response](../../models/operations/RemoveAssessmentPackage2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateAssessmentPackage2

Update an assessment package

### Example Usage

<!-- UsageSnippet language="java" operationID="updateAssessmentPackage2" method="put" path="/assessment/{connection_id}/package/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateAssessmentPackage2Request;
import to.unified.unified_java_sdk.models.operations.UpdateAssessmentPackage2Response;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateAssessmentPackage2Request req = UpdateAssessmentPackage2Request.builder()
                .assessmentPackage(AssessmentPackage.builder()
                    .type(AssessmentPackageType.OTHER)
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateAssessmentPackage2Response res = sdk.package_().updateAssessmentPackage2()
                .request(req)
                .call();

        if (res.assessmentPackage().isPresent()) {
            System.out.println(res.assessmentPackage().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [UpdateAssessmentPackage2Request](../../models/operations/UpdateAssessmentPackage2Request.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[UpdateAssessmentPackage2Response](../../models/operations/UpdateAssessmentPackage2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |