# Matter

## Overview

### Available Operations

* [createLegalMatter](#createlegalmatter) - Create a matter
* [getLegalMatter](#getlegalmatter) - Retrieve a matter
* [listLegalMatters](#listlegalmatters) - List all matters
* [patchLegalMatter](#patchlegalmatter) - Update a matter
* [removeLegalMatter](#removelegalmatter) - Remove a matter
* [updateLegalMatter](#updatelegalmatter) - Update a matter

## createLegalMatter

Create a matter

### Example Usage

<!-- UsageSnippet language="java" operationID="createLegalMatter" method="post" path="/legal/{connection_id}/matter" example="legal_matter" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateLegalMatterRequest;
import to.unified.unified_java_sdk.models.operations.CreateLegalMatterResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateLegalMatterRequest req = CreateLegalMatterRequest.builder()
                .legalMatter(LegalMatter.builder()
                    .billingMethod(BillingMethod.OTHER)
                    .clientReference("qSrjIBAD")
                    .companyIds(List.of())
                    .contactIds(List.of())
                    .createdAt(OffsetDateTime.parse("2023-05-28T04:10:42.375Z"))
                    .currency("BOB")
                    .description("Speciosus cresco aut cotidie temeritas arma.")
                    .id("66c30769-1bbd-4043-b833-b67770b1a54e")
                    .metadata(List.of())
                    .name("Walter v. Franecki - Spinka")
                    .number("2023-3062")
                    .openedAt(OffsetDateTime.parse("2023-07-05T01:55:19.938Z"))
                    .parties(List.of(
                        LegalParty.builder()
                            .description("Urban Walter")
                            .role(LegalPartyRole.EXPERT)
                            .build()))
                    .stage("currus")
                    .status(LegalMatterStatus.OPEN)
                    .statuteOfLimitationsAt(OffsetDateTime.parse("2027-06-22T22:04:39.146Z"))
                    .updatedAt(OffsetDateTime.parse("2023-07-17T04:17:56.302Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateLegalMatterResponse res = sdk.matter().createLegalMatter()
                .request(req)
                .call();

        if (res.legalMatter().isPresent()) {
            System.out.println(res.legalMatter().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [CreateLegalMatterRequest](../../models/operations/CreateLegalMatterRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[CreateLegalMatterResponse](../../models/operations/CreateLegalMatterResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getLegalMatter

Retrieve a matter

### Example Usage

<!-- UsageSnippet language="java" operationID="getLegalMatter" method="get" path="/legal/{connection_id}/matter/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetLegalMatterRequest;
import to.unified.unified_java_sdk.models.operations.GetLegalMatterResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetLegalMatterRequest req = GetLegalMatterRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetLegalMatterResponse res = sdk.matter().getLegalMatter()
                .request(req)
                .call();

        if (res.legalMatter().isPresent()) {
            System.out.println(res.legalMatter().get());
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [GetLegalMatterRequest](../../models/operations/GetLegalMatterRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[GetLegalMatterResponse](../../models/operations/GetLegalMatterResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listLegalMatters

List all matters

### Example Usage

<!-- UsageSnippet language="java" operationID="listLegalMatters" method="get" path="/legal/{connection_id}/matter" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListLegalMattersRequest;
import to.unified.unified_java_sdk.models.operations.ListLegalMattersResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListLegalMattersRequest req = ListLegalMattersRequest.builder()
                .connectionId("<id>")
                .build();

        ListLegalMattersResponse res = sdk.matter().listLegalMatters()
                .request(req)
                .call();

        if (res.legalMatters().isPresent()) {
            System.out.println(res.legalMatters().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [ListLegalMattersRequest](../../models/operations/ListLegalMattersRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[ListLegalMattersResponse](../../models/operations/ListLegalMattersResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchLegalMatter

Update a matter

### Example Usage

<!-- UsageSnippet language="java" operationID="patchLegalMatter" method="patch" path="/legal/{connection_id}/matter/{id}" example="legal_matter" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchLegalMatterRequest;
import to.unified.unified_java_sdk.models.operations.PatchLegalMatterResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchLegalMatterRequest req = PatchLegalMatterRequest.builder()
                .legalMatter(LegalMatter.builder()
                    .billingMethod(BillingMethod.OTHER)
                    .clientReference("qSrjIBAD")
                    .companyIds(List.of())
                    .contactIds(List.of())
                    .createdAt(OffsetDateTime.parse("2023-05-28T04:10:42.375Z"))
                    .currency("BOB")
                    .description("Speciosus cresco aut cotidie temeritas arma.")
                    .id("a0621f08-085f-438d-a5d1-8e7b486caecd")
                    .metadata(List.of())
                    .name("Walter v. Franecki - Spinka")
                    .number("2023-3062")
                    .openedAt(OffsetDateTime.parse("2023-07-05T01:55:19.938Z"))
                    .parties(List.of(
                        LegalParty.builder()
                            .description("Urban Walter")
                            .role(LegalPartyRole.EXPERT)
                            .build()))
                    .stage("currus")
                    .status(LegalMatterStatus.OPEN)
                    .statuteOfLimitationsAt(OffsetDateTime.parse("2027-06-22T22:04:39.161Z"))
                    .updatedAt(OffsetDateTime.parse("2023-07-17T04:17:56.302Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchLegalMatterResponse res = sdk.matter().patchLegalMatter()
                .request(req)
                .call();

        if (res.legalMatter().isPresent()) {
            System.out.println(res.legalMatter().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [PatchLegalMatterRequest](../../models/operations/PatchLegalMatterRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[PatchLegalMatterResponse](../../models/operations/PatchLegalMatterResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeLegalMatter

Remove a matter

### Example Usage

<!-- UsageSnippet language="java" operationID="removeLegalMatter" method="delete" path="/legal/{connection_id}/matter/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveLegalMatterRequest;
import to.unified.unified_java_sdk.models.operations.RemoveLegalMatterResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveLegalMatterRequest req = RemoveLegalMatterRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveLegalMatterResponse res = sdk.matter().removeLegalMatter()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [RemoveLegalMatterRequest](../../models/operations/RemoveLegalMatterRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[RemoveLegalMatterResponse](../../models/operations/RemoveLegalMatterResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateLegalMatter

Update a matter

### Example Usage

<!-- UsageSnippet language="java" operationID="updateLegalMatter" method="put" path="/legal/{connection_id}/matter/{id}" example="legal_matter" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateLegalMatterRequest;
import to.unified.unified_java_sdk.models.operations.UpdateLegalMatterResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateLegalMatterRequest req = UpdateLegalMatterRequest.builder()
                .legalMatter(LegalMatter.builder()
                    .billingMethod(BillingMethod.OTHER)
                    .clientReference("qSrjIBAD")
                    .companyIds(List.of())
                    .contactIds(List.of())
                    .createdAt(OffsetDateTime.parse("2023-05-28T04:10:42.375Z"))
                    .currency("BOB")
                    .description("Speciosus cresco aut cotidie temeritas arma.")
                    .id("a0621f08-085f-438d-a5d1-8e7b486caecd")
                    .metadata(List.of())
                    .name("Walter v. Franecki - Spinka")
                    .number("2023-3062")
                    .openedAt(OffsetDateTime.parse("2023-07-05T01:55:19.938Z"))
                    .parties(List.of(
                        LegalParty.builder()
                            .description("Urban Walter")
                            .role(LegalPartyRole.EXPERT)
                            .build()))
                    .stage("currus")
                    .status(LegalMatterStatus.OPEN)
                    .statuteOfLimitationsAt(OffsetDateTime.parse("2027-06-22T22:04:39.161Z"))
                    .updatedAt(OffsetDateTime.parse("2023-07-17T04:17:56.302Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateLegalMatterResponse res = sdk.matter().updateLegalMatter()
                .request(req)
                .call();

        if (res.legalMatter().isPresent()) {
            System.out.println(res.legalMatter().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [UpdateLegalMatterRequest](../../models/operations/UpdateLegalMatterRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[UpdateLegalMatterResponse](../../models/operations/UpdateLegalMatterResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |