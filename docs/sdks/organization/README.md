# Organization

## Overview

### Available Operations

* [createAdsOrganization](#createadsorganization) - Create an organization
* [createGenaiOrganization](#creategenaiorganization) - Create an organization
* [createRepoOrganization](#createrepoorganization) - Create an organization
* [getAccountingOrganization](#getaccountingorganization) - Retrieve an organization
* [getAdsOrganization](#getadsorganization) - Retrieve an organization
* [getGenaiOrganization](#getgenaiorganization) - Retrieve an organization
* [getRepoOrganization](#getrepoorganization) - Retrieve an organization
* [listAccountingOrganizations](#listaccountingorganizations) - List all organizations
* [listAdsOrganizations](#listadsorganizations) - List all organizations
* [listGenaiOrganizations](#listgenaiorganizations) - List all organizations
* [listRepoOrganizations](#listrepoorganizations) - List all organizations
* [patchAdsOrganization](#patchadsorganization) - Update an organization
* [patchGenaiOrganization](#patchgenaiorganization) - Update an organization
* [patchRepoOrganization](#patchrepoorganization) - Update an organization
* [removeAdsOrganization](#removeadsorganization) - Remove an organization
* [removeGenaiOrganization](#removegenaiorganization) - Remove an organization
* [removeRepoOrganization](#removerepoorganization) - Remove an organization
* [updateAdsOrganization](#updateadsorganization) - Update an organization
* [updateGenaiOrganization](#updategenaiorganization) - Update an organization
* [updateRepoOrganization](#updaterepoorganization) - Update an organization

## createAdsOrganization

Create an organization

### Example Usage

<!-- UsageSnippet language="java" operationID="createAdsOrganization" method="post" path="/ads/{connection_id}/organization" example="ads_organization" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateAdsOrganizationRequest;
import to.unified.unified_java_sdk.models.operations.CreateAdsOrganizationResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateAdsOrganizationRequest req = CreateAdsOrganizationRequest.builder()
                .adsOrganization(AdsOrganization.builder()
                    .accountNumber("LQUJx8zQBW")
                    .createdAt(OffsetDateTime.parse("2020-07-23T21:47:11.440Z"))
                    .currency("USD")
                    .id("e3012e78-dbb9-43c3-b089-c52634a97002")
                    .managers(List.of(
                        AdsManager.builder()
                            .id("e4fd87df-9f8b-4fa0-a77b-b7d18669e350")
                            .name("Parker, Leannon and Gibson")
                            .build()))
                    .name("Ankunding Inc")
                    .status(AdsOrganizationStatus.PROCESSING)
                    .timezone("Europe/Chisinau")
                    .updatedAt(OffsetDateTime.parse("2026-03-01T20:43:52.695Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateAdsOrganizationResponse res = sdk.organization().createAdsOrganization()
                .request(req)
                .call();

        if (res.adsOrganization().isPresent()) {
            System.out.println(res.adsOrganization().get());
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [CreateAdsOrganizationRequest](../../models/operations/CreateAdsOrganizationRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[CreateAdsOrganizationResponse](../../models/operations/CreateAdsOrganizationResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createGenaiOrganization

Create an organization

### Example Usage

<!-- UsageSnippet language="java" operationID="createGenaiOrganization" method="post" path="/genai/{connection_id}/organization" example="genai_organization" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateGenaiOrganizationRequest;
import to.unified.unified_java_sdk.models.operations.CreateGenaiOrganizationResponse;
import to.unified.unified_java_sdk.models.shared.GenaiOrganization;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateGenaiOrganizationRequest req = CreateGenaiOrganizationRequest.builder()
                .genaiOrganization(GenaiOrganization.builder()
                    .createdAt(OffsetDateTime.parse("2020-10-27T16:03:47.122Z"))
                    .description("Voluptates abeo subseco.")
                    .id("9942ae74-f1b5-48d6-a941-810141e8c41f")
                    .isActive(false)
                    .name("officially about")
                    .updatedAt(OffsetDateTime.parse("2023-01-15T04:21:51.211Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateGenaiOrganizationResponse res = sdk.organization().createGenaiOrganization()
                .request(req)
                .call();

        if (res.genaiOrganization().isPresent()) {
            System.out.println(res.genaiOrganization().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [CreateGenaiOrganizationRequest](../../models/operations/CreateGenaiOrganizationRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[CreateGenaiOrganizationResponse](../../models/operations/CreateGenaiOrganizationResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createRepoOrganization

Create an organization

### Example Usage

<!-- UsageSnippet language="java" operationID="createRepoOrganization" method="post" path="/repo/{connection_id}/organization" example="repo_organization" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateRepoOrganizationRequest;
import to.unified.unified_java_sdk.models.operations.CreateRepoOrganizationResponse;
import to.unified.unified_java_sdk.models.shared.RepoOrganization;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateRepoOrganizationRequest req = CreateRepoOrganizationRequest.builder()
                .repoOrganization(RepoOrganization.builder()
                    .avatarUrl("https://picsum.photos/seed/fGl6Lb/3157/3173")
                    .createdAt(OffsetDateTime.parse("2022-07-07T00:18:40.748Z"))
                    .description("Trepide defendo supra testimonium ager.")
                    .id("c5328bd2-b906-4f4d-ab67-1d60be96411c")
                    .name("Denesik - Lemke")
                    .updatedAt(OffsetDateTime.parse("2023-08-13T18:39:07.932Z"))
                    .webUrl("https://turbulent-overheard.biz")
                    .build())
                .connectionId("<id>")
                .build();

        CreateRepoOrganizationResponse res = sdk.organization().createRepoOrganization()
                .request(req)
                .call();

        if (res.repoOrganization().isPresent()) {
            System.out.println(res.repoOrganization().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [CreateRepoOrganizationRequest](../../models/operations/CreateRepoOrganizationRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[CreateRepoOrganizationResponse](../../models/operations/CreateRepoOrganizationResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getAccountingOrganization

Retrieve an organization

### Example Usage

<!-- UsageSnippet language="java" operationID="getAccountingOrganization" method="get" path="/accounting/{connection_id}/organization/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetAccountingOrganizationRequest;
import to.unified.unified_java_sdk.models.operations.GetAccountingOrganizationResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetAccountingOrganizationRequest req = GetAccountingOrganizationRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetAccountingOrganizationResponse res = sdk.organization().getAccountingOrganization()
                .request(req)
                .call();

        if (res.accountingOrganization().isPresent()) {
            System.out.println(res.accountingOrganization().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `request`                                                                                       | [GetAccountingOrganizationRequest](../../models/operations/GetAccountingOrganizationRequest.md) | :heavy_check_mark:                                                                              | The request object to use for the request.                                                      |

### Response

**[GetAccountingOrganizationResponse](../../models/operations/GetAccountingOrganizationResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getAdsOrganization

Retrieve an organization

### Example Usage

<!-- UsageSnippet language="java" operationID="getAdsOrganization" method="get" path="/ads/{connection_id}/organization/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetAdsOrganizationRequest;
import to.unified.unified_java_sdk.models.operations.GetAdsOrganizationResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetAdsOrganizationRequest req = GetAdsOrganizationRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetAdsOrganizationResponse res = sdk.organization().getAdsOrganization()
                .request(req)
                .call();

        if (res.adsOrganization().isPresent()) {
            System.out.println(res.adsOrganization().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [GetAdsOrganizationRequest](../../models/operations/GetAdsOrganizationRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[GetAdsOrganizationResponse](../../models/operations/GetAdsOrganizationResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getGenaiOrganization

Retrieve an organization

### Example Usage

<!-- UsageSnippet language="java" operationID="getGenaiOrganization" method="get" path="/genai/{connection_id}/organization/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetGenaiOrganizationRequest;
import to.unified.unified_java_sdk.models.operations.GetGenaiOrganizationResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetGenaiOrganizationRequest req = GetGenaiOrganizationRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetGenaiOrganizationResponse res = sdk.organization().getGenaiOrganization()
                .request(req)
                .call();

        if (res.genaiOrganization().isPresent()) {
            System.out.println(res.genaiOrganization().get());
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [GetGenaiOrganizationRequest](../../models/operations/GetGenaiOrganizationRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[GetGenaiOrganizationResponse](../../models/operations/GetGenaiOrganizationResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getRepoOrganization

Retrieve an organization

### Example Usage

<!-- UsageSnippet language="java" operationID="getRepoOrganization" method="get" path="/repo/{connection_id}/organization/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetRepoOrganizationRequest;
import to.unified.unified_java_sdk.models.operations.GetRepoOrganizationResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetRepoOrganizationRequest req = GetRepoOrganizationRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetRepoOrganizationResponse res = sdk.organization().getRepoOrganization()
                .request(req)
                .call();

        if (res.repoOrganization().isPresent()) {
            System.out.println(res.repoOrganization().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [GetRepoOrganizationRequest](../../models/operations/GetRepoOrganizationRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[GetRepoOrganizationResponse](../../models/operations/GetRepoOrganizationResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listAccountingOrganizations

List all organizations

### Example Usage

<!-- UsageSnippet language="java" operationID="listAccountingOrganizations" method="get" path="/accounting/{connection_id}/organization" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListAccountingOrganizationsRequest;
import to.unified.unified_java_sdk.models.operations.ListAccountingOrganizationsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListAccountingOrganizationsRequest req = ListAccountingOrganizationsRequest.builder()
                .connectionId("<id>")
                .build();

        ListAccountingOrganizationsResponse res = sdk.organization().listAccountingOrganizations()
                .request(req)
                .call();

        if (res.accountingOrganizations().isPresent()) {
            System.out.println(res.accountingOrganizations().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                           | Type                                                                                                | Required                                                                                            | Description                                                                                         |
| --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- |
| `request`                                                                                           | [ListAccountingOrganizationsRequest](../../models/operations/ListAccountingOrganizationsRequest.md) | :heavy_check_mark:                                                                                  | The request object to use for the request.                                                          |

### Response

**[ListAccountingOrganizationsResponse](../../models/operations/ListAccountingOrganizationsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listAdsOrganizations

List all organizations

### Example Usage

<!-- UsageSnippet language="java" operationID="listAdsOrganizations" method="get" path="/ads/{connection_id}/organization" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListAdsOrganizationsRequest;
import to.unified.unified_java_sdk.models.operations.ListAdsOrganizationsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListAdsOrganizationsRequest req = ListAdsOrganizationsRequest.builder()
                .connectionId("<id>")
                .build();

        ListAdsOrganizationsResponse res = sdk.organization().listAdsOrganizations()
                .request(req)
                .call();

        if (res.adsOrganizations().isPresent()) {
            System.out.println(res.adsOrganizations().get());
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [ListAdsOrganizationsRequest](../../models/operations/ListAdsOrganizationsRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[ListAdsOrganizationsResponse](../../models/operations/ListAdsOrganizationsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listGenaiOrganizations

List all organizations

### Example Usage

<!-- UsageSnippet language="java" operationID="listGenaiOrganizations" method="get" path="/genai/{connection_id}/organization" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListGenaiOrganizationsRequest;
import to.unified.unified_java_sdk.models.operations.ListGenaiOrganizationsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListGenaiOrganizationsRequest req = ListGenaiOrganizationsRequest.builder()
                .connectionId("<id>")
                .build();

        ListGenaiOrganizationsResponse res = sdk.organization().listGenaiOrganizations()
                .request(req)
                .call();

        if (res.genaiOrganizations().isPresent()) {
            System.out.println(res.genaiOrganizations().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [ListGenaiOrganizationsRequest](../../models/operations/ListGenaiOrganizationsRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[ListGenaiOrganizationsResponse](../../models/operations/ListGenaiOrganizationsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listRepoOrganizations

List all organizations

### Example Usage

<!-- UsageSnippet language="java" operationID="listRepoOrganizations" method="get" path="/repo/{connection_id}/organization" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListRepoOrganizationsRequest;
import to.unified.unified_java_sdk.models.operations.ListRepoOrganizationsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListRepoOrganizationsRequest req = ListRepoOrganizationsRequest.builder()
                .connectionId("<id>")
                .build();

        ListRepoOrganizationsResponse res = sdk.organization().listRepoOrganizations()
                .request(req)
                .call();

        if (res.repoOrganizations().isPresent()) {
            System.out.println(res.repoOrganizations().get());
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [ListRepoOrganizationsRequest](../../models/operations/ListRepoOrganizationsRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[ListRepoOrganizationsResponse](../../models/operations/ListRepoOrganizationsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchAdsOrganization

Update an organization

### Example Usage

<!-- UsageSnippet language="java" operationID="patchAdsOrganization" method="patch" path="/ads/{connection_id}/organization/{id}" example="ads_organization" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchAdsOrganizationRequest;
import to.unified.unified_java_sdk.models.operations.PatchAdsOrganizationResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchAdsOrganizationRequest req = PatchAdsOrganizationRequest.builder()
                .adsOrganization(AdsOrganization.builder()
                    .accountNumber("LQUJx8zQBW")
                    .createdAt(OffsetDateTime.parse("2020-07-23T21:47:11.440Z"))
                    .currency("USD")
                    .id("342b0c9f-6f03-4da3-8936-b68c6b4ad0c0")
                    .managers(List.of(
                        AdsManager.builder()
                            .id("e4fd87df-9f8b-4fa0-a77b-b7d18669e350")
                            .name("Parker, Leannon and Gibson")
                            .build()))
                    .name("Ankunding Inc")
                    .status(AdsOrganizationStatus.PROCESSING)
                    .timezone("Europe/Chisinau")
                    .updatedAt(OffsetDateTime.parse("2026-03-01T20:43:52.701Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchAdsOrganizationResponse res = sdk.organization().patchAdsOrganization()
                .request(req)
                .call();

        if (res.adsOrganization().isPresent()) {
            System.out.println(res.adsOrganization().get());
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [PatchAdsOrganizationRequest](../../models/operations/PatchAdsOrganizationRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[PatchAdsOrganizationResponse](../../models/operations/PatchAdsOrganizationResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchGenaiOrganization

Update an organization

### Example Usage

<!-- UsageSnippet language="java" operationID="patchGenaiOrganization" method="patch" path="/genai/{connection_id}/organization/{id}" example="genai_organization" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchGenaiOrganizationRequest;
import to.unified.unified_java_sdk.models.operations.PatchGenaiOrganizationResponse;
import to.unified.unified_java_sdk.models.shared.GenaiOrganization;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchGenaiOrganizationRequest req = PatchGenaiOrganizationRequest.builder()
                .genaiOrganization(GenaiOrganization.builder()
                    .createdAt(OffsetDateTime.parse("2020-10-27T16:03:47.122Z"))
                    .description("Voluptates abeo subseco.")
                    .id("b1da2f82-66e6-44ab-8556-dccd964b2224")
                    .isActive(false)
                    .name("officially about")
                    .updatedAt(OffsetDateTime.parse("2023-01-15T04:21:51.214Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchGenaiOrganizationResponse res = sdk.organization().patchGenaiOrganization()
                .request(req)
                .call();

        if (res.genaiOrganization().isPresent()) {
            System.out.println(res.genaiOrganization().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [PatchGenaiOrganizationRequest](../../models/operations/PatchGenaiOrganizationRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[PatchGenaiOrganizationResponse](../../models/operations/PatchGenaiOrganizationResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchRepoOrganization

Update an organization

### Example Usage

<!-- UsageSnippet language="java" operationID="patchRepoOrganization" method="patch" path="/repo/{connection_id}/organization/{id}" example="repo_organization" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchRepoOrganizationRequest;
import to.unified.unified_java_sdk.models.operations.PatchRepoOrganizationResponse;
import to.unified.unified_java_sdk.models.shared.RepoOrganization;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchRepoOrganizationRequest req = PatchRepoOrganizationRequest.builder()
                .repoOrganization(RepoOrganization.builder()
                    .avatarUrl("https://picsum.photos/seed/fGl6Lb/3157/3173")
                    .createdAt(OffsetDateTime.parse("2022-07-07T00:18:40.748Z"))
                    .description("Trepide defendo supra testimonium ager.")
                    .id("e4a2893c-7445-459a-ae15-677ebc3066bd")
                    .name("Denesik - Lemke")
                    .updatedAt(OffsetDateTime.parse("2023-08-13T18:39:07.934Z"))
                    .webUrl("https://turbulent-overheard.biz")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchRepoOrganizationResponse res = sdk.organization().patchRepoOrganization()
                .request(req)
                .call();

        if (res.repoOrganization().isPresent()) {
            System.out.println(res.repoOrganization().get());
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [PatchRepoOrganizationRequest](../../models/operations/PatchRepoOrganizationRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[PatchRepoOrganizationResponse](../../models/operations/PatchRepoOrganizationResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeAdsOrganization

Remove an organization

### Example Usage

<!-- UsageSnippet language="java" operationID="removeAdsOrganization" method="delete" path="/ads/{connection_id}/organization/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveAdsOrganizationRequest;
import to.unified.unified_java_sdk.models.operations.RemoveAdsOrganizationResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveAdsOrganizationRequest req = RemoveAdsOrganizationRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveAdsOrganizationResponse res = sdk.organization().removeAdsOrganization()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [RemoveAdsOrganizationRequest](../../models/operations/RemoveAdsOrganizationRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[RemoveAdsOrganizationResponse](../../models/operations/RemoveAdsOrganizationResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeGenaiOrganization

Remove an organization

### Example Usage

<!-- UsageSnippet language="java" operationID="removeGenaiOrganization" method="delete" path="/genai/{connection_id}/organization/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveGenaiOrganizationRequest;
import to.unified.unified_java_sdk.models.operations.RemoveGenaiOrganizationResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveGenaiOrganizationRequest req = RemoveGenaiOrganizationRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveGenaiOrganizationResponse res = sdk.organization().removeGenaiOrganization()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [RemoveGenaiOrganizationRequest](../../models/operations/RemoveGenaiOrganizationRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[RemoveGenaiOrganizationResponse](../../models/operations/RemoveGenaiOrganizationResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeRepoOrganization

Remove an organization

### Example Usage

<!-- UsageSnippet language="java" operationID="removeRepoOrganization" method="delete" path="/repo/{connection_id}/organization/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveRepoOrganizationRequest;
import to.unified.unified_java_sdk.models.operations.RemoveRepoOrganizationResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveRepoOrganizationRequest req = RemoveRepoOrganizationRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveRepoOrganizationResponse res = sdk.organization().removeRepoOrganization()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [RemoveRepoOrganizationRequest](../../models/operations/RemoveRepoOrganizationRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[RemoveRepoOrganizationResponse](../../models/operations/RemoveRepoOrganizationResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateAdsOrganization

Update an organization

### Example Usage

<!-- UsageSnippet language="java" operationID="updateAdsOrganization" method="put" path="/ads/{connection_id}/organization/{id}" example="ads_organization" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateAdsOrganizationRequest;
import to.unified.unified_java_sdk.models.operations.UpdateAdsOrganizationResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateAdsOrganizationRequest req = UpdateAdsOrganizationRequest.builder()
                .adsOrganization(AdsOrganization.builder()
                    .accountNumber("LQUJx8zQBW")
                    .createdAt(OffsetDateTime.parse("2020-07-23T21:47:11.440Z"))
                    .currency("USD")
                    .id("342b0c9f-6f03-4da3-8936-b68c6b4ad0c0")
                    .managers(List.of(
                        AdsManager.builder()
                            .id("e4fd87df-9f8b-4fa0-a77b-b7d18669e350")
                            .name("Parker, Leannon and Gibson")
                            .build()))
                    .name("Ankunding Inc")
                    .status(AdsOrganizationStatus.PROCESSING)
                    .timezone("Europe/Chisinau")
                    .updatedAt(OffsetDateTime.parse("2026-03-01T20:43:52.701Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateAdsOrganizationResponse res = sdk.organization().updateAdsOrganization()
                .request(req)
                .call();

        if (res.adsOrganization().isPresent()) {
            System.out.println(res.adsOrganization().get());
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [UpdateAdsOrganizationRequest](../../models/operations/UpdateAdsOrganizationRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[UpdateAdsOrganizationResponse](../../models/operations/UpdateAdsOrganizationResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateGenaiOrganization

Update an organization

### Example Usage

<!-- UsageSnippet language="java" operationID="updateGenaiOrganization" method="put" path="/genai/{connection_id}/organization/{id}" example="genai_organization" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateGenaiOrganizationRequest;
import to.unified.unified_java_sdk.models.operations.UpdateGenaiOrganizationResponse;
import to.unified.unified_java_sdk.models.shared.GenaiOrganization;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateGenaiOrganizationRequest req = UpdateGenaiOrganizationRequest.builder()
                .genaiOrganization(GenaiOrganization.builder()
                    .createdAt(OffsetDateTime.parse("2020-10-27T16:03:47.122Z"))
                    .description("Voluptates abeo subseco.")
                    .id("b1da2f82-66e6-44ab-8556-dccd964b2224")
                    .isActive(false)
                    .name("officially about")
                    .updatedAt(OffsetDateTime.parse("2023-01-15T04:21:51.214Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateGenaiOrganizationResponse res = sdk.organization().updateGenaiOrganization()
                .request(req)
                .call();

        if (res.genaiOrganization().isPresent()) {
            System.out.println(res.genaiOrganization().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [UpdateGenaiOrganizationRequest](../../models/operations/UpdateGenaiOrganizationRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[UpdateGenaiOrganizationResponse](../../models/operations/UpdateGenaiOrganizationResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateRepoOrganization

Update an organization

### Example Usage

<!-- UsageSnippet language="java" operationID="updateRepoOrganization" method="put" path="/repo/{connection_id}/organization/{id}" example="repo_organization" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateRepoOrganizationRequest;
import to.unified.unified_java_sdk.models.operations.UpdateRepoOrganizationResponse;
import to.unified.unified_java_sdk.models.shared.RepoOrganization;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateRepoOrganizationRequest req = UpdateRepoOrganizationRequest.builder()
                .repoOrganization(RepoOrganization.builder()
                    .avatarUrl("https://picsum.photos/seed/fGl6Lb/3157/3173")
                    .createdAt(OffsetDateTime.parse("2022-07-07T00:18:40.748Z"))
                    .description("Trepide defendo supra testimonium ager.")
                    .id("e4a2893c-7445-459a-ae15-677ebc3066bd")
                    .name("Denesik - Lemke")
                    .updatedAt(OffsetDateTime.parse("2023-08-13T18:39:07.934Z"))
                    .webUrl("https://turbulent-overheard.biz")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateRepoOrganizationResponse res = sdk.organization().updateRepoOrganization()
                .request(req)
                .call();

        if (res.repoOrganization().isPresent()) {
            System.out.println(res.repoOrganization().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [UpdateRepoOrganizationRequest](../../models/operations/UpdateRepoOrganizationRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[UpdateRepoOrganizationResponse](../../models/operations/UpdateRepoOrganizationResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |