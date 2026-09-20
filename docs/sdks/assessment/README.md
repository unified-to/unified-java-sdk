# Assessment

## Overview

### Available Operations

* [createAssessmentOrder](#createassessmentorder) - Create an order
* [createAssessmentPackage](#createassessmentpackage) - Create an assessment package
* [getAssessmentOrder](#getassessmentorder) - Retrieve an order
* [getAssessmentPackage](#getassessmentpackage) - Get an assessment package
* [listAssessmentPackages](#listassessmentpackages) - List assessment packages
* [patchAssessmentOrder](#patchassessmentorder) - Update an order
* [patchAssessmentPackage](#patchassessmentpackage) - Update an assessment package
* [removeAssessmentPackage](#removeassessmentpackage) - Delete an assessment package
* [updateAssessmentOrder](#updateassessmentorder) - Update an order
* [updateAssessmentPackage](#updateassessmentpackage) - Update an assessment package

## createAssessmentOrder

Create an order

### Example Usage

<!-- UsageSnippet language="java" operationID="createAssessmentOrder" method="post" path="/assessment/{connection_id}/order" example="assessment_order" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateAssessmentOrderRequest;
import to.unified.unified_java_sdk.models.operations.CreateAssessmentOrderResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateAssessmentOrderRequest req = CreateAssessmentOrderRequest.builder()
                .assessmentOrder(AssessmentOrder.builder()
                    .connectionId("<id>")
                    .workspaceId("<id>")
                    .createdAt(OffsetDateTime.parse("2021-09-18T10:33:57.803Z"))
                    .id("8abb02f5-a747-4a60-adad-64f4c09c00d5")
                    .parameters(List.of())
                    .profileAddresses(List.of())
                    .profileDateOfBirth("1989-07-22T16:18:37.650Z")
                    .profileEmails(List.of(
                        "Cleta.Daugherty@gmail.com"))
                    .profileFirstName("Amy")
                    .profileGender(ProfileGender.NON_BINARY)
                    .profileLastName("Kris-Windler")
                    .profileName("Amy Kris-Windler")
                    .profileResumeUrl("https://enchanted-cycle.biz/")
                    .profileSocialMediaUrls(List.of())
                    .profileTelephones(List.of(
                        "(828) 263-1594 x5248"))
                    .reference("ab")
                    .responseAttributes(List.of())
                    .responseDetails(List.of())
                    .responseDownloadUrls(List.of())
                    .responseMaxScore(82d)
                    .responseScore(92d)
                    .responseStatus(ResponseStatus.FAILED)
                    .responseUrl("https://irresponsible-trench.info/")
                    .status(AssessmentOrderStatus.REJECTED)
                    .targetUrl("https://cautious-turret.info")
                    .updatedAt(OffsetDateTime.parse("2023-01-17T14:56:29.000Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateAssessmentOrderResponse res = sdk.assessment().createAssessmentOrder()
                .request(req)
                .call();

        if (res.assessmentOrder().isPresent()) {
            System.out.println(res.assessmentOrder().get());
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [CreateAssessmentOrderRequest](../../models/operations/CreateAssessmentOrderRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[CreateAssessmentOrderResponse](../../models/operations/CreateAssessmentOrderResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createAssessmentPackage

Create an assessment package

### Example Usage

<!-- UsageSnippet language="java" operationID="createAssessmentPackage" method="post" path="/assessment/{connection_id}/package" example="assessment_package" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
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
                    .type(AssessmentPackageType.VIDEO_INTERVIEW)
                    .aliases(List.of(
                        "quia"))
                    .createdAt(OffsetDateTime.parse("2022-11-18T19:48:39.433Z"))
                    .description("Eos aedificium consectetur urbs. Admitto summa accusator tabesco distinctio vapulus culpo templum ancilla.")
                    .hasRedirectUrl(true)
                    .hasTargetUrl(false)
                    .id("59bfd15e-6e57-4ae6-9d23-81643dba769d")
                    .infoUrl("https://ugly-instance.biz/")
                    .integrationTypes(List.of(
                        "viridis"))
                    .maxScore(22d)
                    .name("Carus sed vox doloremque vigor surgo tabella cupiditas abduco clarus.")
                    .needsIpAddress(true)
                    .parameters(List.of())
                    .regions(List.of())
                    .tags(List.of(
                        "clamo"))
                    .updatedAt(OffsetDateTime.parse("2023-09-18T16:08:23.098Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateAssessmentPackageResponse res = sdk.assessment().createAssessmentPackage()
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
| `request`                                                                                   | [CreateAssessmentPackageRequest](../../models/operations/CreateAssessmentPackageRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[CreateAssessmentPackageResponse](../../models/operations/CreateAssessmentPackageResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getAssessmentOrder

Retrieve an order

### Example Usage

<!-- UsageSnippet language="java" operationID="getAssessmentOrder" method="get" path="/assessment/{connection_id}/order/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetAssessmentOrderRequest;
import to.unified.unified_java_sdk.models.operations.GetAssessmentOrderResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetAssessmentOrderRequest req = GetAssessmentOrderRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetAssessmentOrderResponse res = sdk.assessment().getAssessmentOrder()
                .request(req)
                .call();

        if (res.assessmentOrder().isPresent()) {
            System.out.println(res.assessmentOrder().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [GetAssessmentOrderRequest](../../models/operations/GetAssessmentOrderRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[GetAssessmentOrderResponse](../../models/operations/GetAssessmentOrderResponse.md)**

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

        GetAssessmentPackageResponse res = sdk.assessment().getAssessmentPackage()
                .request(req)
                .call();

        if (res.assessmentPackage().isPresent()) {
            System.out.println(res.assessmentPackage().get());
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

        ListAssessmentPackagesResponse res = sdk.assessment().listAssessmentPackages()
                .request(req)
                .call();

        if (res.assessmentPackages().isPresent()) {
            System.out.println(res.assessmentPackages().get());
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

## patchAssessmentOrder

Update an order

### Example Usage

<!-- UsageSnippet language="java" operationID="patchAssessmentOrder" method="patch" path="/assessment/{connection_id}/order/{id}" example="assessment_order" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchAssessmentOrderRequest;
import to.unified.unified_java_sdk.models.operations.PatchAssessmentOrderResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchAssessmentOrderRequest req = PatchAssessmentOrderRequest.builder()
                .assessmentOrder(AssessmentOrder.builder()
                    .connectionId("<id>")
                    .workspaceId("<id>")
                    .createdAt(OffsetDateTime.parse("2021-09-18T10:33:57.803Z"))
                    .id("b4f6f443-ab3a-450a-9b45-49eb856700df")
                    .parameters(List.of())
                    .profileAddresses(List.of())
                    .profileDateOfBirth("1989-07-22T16:18:37.650Z")
                    .profileEmails(List.of(
                        "Cleta.Daugherty@gmail.com"))
                    .profileFirstName("Amy")
                    .profileGender(ProfileGender.NON_BINARY)
                    .profileLastName("Kris-Windler")
                    .profileName("Amy Kris-Windler")
                    .profileResumeUrl("https://enchanted-cycle.biz/")
                    .profileSocialMediaUrls(List.of())
                    .profileTelephones(List.of(
                        "(828) 263-1594 x5248"))
                    .reference("ab")
                    .responseAttributes(List.of())
                    .responseDetails(List.of())
                    .responseDownloadUrls(List.of())
                    .responseMaxScore(82d)
                    .responseScore(92d)
                    .responseStatus(ResponseStatus.FAILED)
                    .responseUrl("https://irresponsible-trench.info/")
                    .status(AssessmentOrderStatus.REJECTED)
                    .targetUrl("https://cautious-turret.info")
                    .updatedAt(OffsetDateTime.parse("2023-01-17T14:56:29.008Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchAssessmentOrderResponse res = sdk.assessment().patchAssessmentOrder()
                .request(req)
                .call();

        if (res.assessmentOrder().isPresent()) {
            System.out.println(res.assessmentOrder().get());
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [PatchAssessmentOrderRequest](../../models/operations/PatchAssessmentOrderRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[PatchAssessmentOrderResponse](../../models/operations/PatchAssessmentOrderResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchAssessmentPackage

Update an assessment package

### Example Usage

<!-- UsageSnippet language="java" operationID="patchAssessmentPackage" method="patch" path="/assessment/{connection_id}/package/{id}" example="assessment_package" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
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
                    .type(AssessmentPackageType.VIDEO_INTERVIEW)
                    .aliases(List.of(
                        "quia"))
                    .createdAt(OffsetDateTime.parse("2022-11-18T19:48:39.433Z"))
                    .description("Eos aedificium consectetur urbs. Admitto summa accusator tabesco distinctio vapulus culpo templum ancilla.")
                    .hasRedirectUrl(true)
                    .hasTargetUrl(false)
                    .id("e3afda7a-05e5-4c69-8467-1c6fc3247761")
                    .infoUrl("https://ugly-instance.biz/")
                    .integrationTypes(List.of(
                        "viridis"))
                    .maxScore(22d)
                    .name("Carus sed vox doloremque vigor surgo tabella cupiditas abduco clarus.")
                    .needsIpAddress(true)
                    .parameters(List.of())
                    .regions(List.of())
                    .tags(List.of(
                        "clamo"))
                    .updatedAt(OffsetDateTime.parse("2023-09-18T16:08:23.101Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchAssessmentPackageResponse res = sdk.assessment().patchAssessmentPackage()
                .request(req)
                .call();

        if (res.assessmentPackage().isPresent()) {
            System.out.println(res.assessmentPackage().get());
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

        RemoveAssessmentPackageResponse res = sdk.assessment().removeAssessmentPackage()
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

## updateAssessmentOrder

Update an order

### Example Usage

<!-- UsageSnippet language="java" operationID="updateAssessmentOrder" method="put" path="/assessment/{connection_id}/order/{id}" example="assessment_order" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateAssessmentOrderRequest;
import to.unified.unified_java_sdk.models.operations.UpdateAssessmentOrderResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateAssessmentOrderRequest req = UpdateAssessmentOrderRequest.builder()
                .assessmentOrder(AssessmentOrder.builder()
                    .connectionId("<id>")
                    .workspaceId("<id>")
                    .createdAt(OffsetDateTime.parse("2021-09-18T10:33:57.803Z"))
                    .id("b4f6f443-ab3a-450a-9b45-49eb856700df")
                    .parameters(List.of())
                    .profileAddresses(List.of())
                    .profileDateOfBirth("1989-07-22T16:18:37.650Z")
                    .profileEmails(List.of(
                        "Cleta.Daugherty@gmail.com"))
                    .profileFirstName("Amy")
                    .profileGender(ProfileGender.NON_BINARY)
                    .profileLastName("Kris-Windler")
                    .profileName("Amy Kris-Windler")
                    .profileResumeUrl("https://enchanted-cycle.biz/")
                    .profileSocialMediaUrls(List.of())
                    .profileTelephones(List.of(
                        "(828) 263-1594 x5248"))
                    .reference("ab")
                    .responseAttributes(List.of())
                    .responseDetails(List.of())
                    .responseDownloadUrls(List.of())
                    .responseMaxScore(82d)
                    .responseScore(92d)
                    .responseStatus(ResponseStatus.FAILED)
                    .responseUrl("https://irresponsible-trench.info/")
                    .status(AssessmentOrderStatus.REJECTED)
                    .targetUrl("https://cautious-turret.info")
                    .updatedAt(OffsetDateTime.parse("2023-01-17T14:56:29.008Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateAssessmentOrderResponse res = sdk.assessment().updateAssessmentOrder()
                .request(req)
                .call();

        if (res.assessmentOrder().isPresent()) {
            System.out.println(res.assessmentOrder().get());
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [UpdateAssessmentOrderRequest](../../models/operations/UpdateAssessmentOrderRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[UpdateAssessmentOrderResponse](../../models/operations/UpdateAssessmentOrderResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateAssessmentPackage

Update an assessment package

### Example Usage

<!-- UsageSnippet language="java" operationID="updateAssessmentPackage" method="put" path="/assessment/{connection_id}/package/{id}" example="assessment_package" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
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
                    .type(AssessmentPackageType.VIDEO_INTERVIEW)
                    .aliases(List.of(
                        "quia"))
                    .createdAt(OffsetDateTime.parse("2022-11-18T19:48:39.433Z"))
                    .description("Eos aedificium consectetur urbs. Admitto summa accusator tabesco distinctio vapulus culpo templum ancilla.")
                    .hasRedirectUrl(true)
                    .hasTargetUrl(false)
                    .id("e3afda7a-05e5-4c69-8467-1c6fc3247761")
                    .infoUrl("https://ugly-instance.biz/")
                    .integrationTypes(List.of(
                        "viridis"))
                    .maxScore(22d)
                    .name("Carus sed vox doloremque vigor surgo tabella cupiditas abduco clarus.")
                    .needsIpAddress(true)
                    .parameters(List.of())
                    .regions(List.of())
                    .tags(List.of(
                        "clamo"))
                    .updatedAt(OffsetDateTime.parse("2023-09-18T16:08:23.101Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateAssessmentPackageResponse res = sdk.assessment().updateAssessmentPackage()
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
| `request`                                                                                   | [UpdateAssessmentPackageRequest](../../models/operations/UpdateAssessmentPackageRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[UpdateAssessmentPackageResponse](../../models/operations/UpdateAssessmentPackageResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |