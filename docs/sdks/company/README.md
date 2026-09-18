# Company

## Overview

### Available Operations

* [createAtsCompany](#createatscompany) - Create a company
* [createCrmCompany](#createcrmcompany) - Create a company
* [createHrisCompany](#createhriscompany) - Create a company
* [getAtsCompany](#getatscompany) - Retrieve a company
* [getCrmCompany](#getcrmcompany) - Retrieve a company
* [getHrisCompany](#gethriscompany) - Retrieve a company
* [listAtsCompanies](#listatscompanies) - List all companies
* [listCrmCompanies](#listcrmcompanies) - List all companies
* [listEnrichCompanies](#listenrichcompanies) - Retrieve enrichment information for a company
* [listHrisCompanies](#listhriscompanies) - List all companies
* [patchAtsCompany](#patchatscompany) - Update a company
* [patchCrmCompany](#patchcrmcompany) - Update a company
* [patchHrisCompany](#patchhriscompany) - Update a company
* [removeAtsCompany](#removeatscompany) - Remove a company
* [removeCrmCompany](#removecrmcompany) - Remove a company
* [removeHrisCompany](#removehriscompany) - Remove a company
* [updateAtsCompany](#updateatscompany) - Update a company
* [updateCrmCompany](#updatecrmcompany) - Update a company
* [updateHrisCompany](#updatehriscompany) - Update a company

## createAtsCompany

Create a company

### Example Usage

<!-- UsageSnippet language="java" operationID="createAtsCompany" method="post" path="/ats/{connection_id}/company" example="ats_company" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateAtsCompanyRequest;
import to.unified.unified_java_sdk.models.operations.CreateAtsCompanyResponse;
import to.unified.unified_java_sdk.models.shared.AtsCompany;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateAtsCompanyRequest req = CreateAtsCompanyRequest.builder()
                .atsCompany(AtsCompany.builder()
                    .createdAt(OffsetDateTime.parse("2019-04-22T03:50:02.920Z"))
                    .id("56afd204-7f7a-49b5-99da-923b6a432b67")
                    .name("Gulgowski, Dibbert and Wilderman")
                    .phone("1-602-210-4548")
                    .updatedAt(OffsetDateTime.parse("2020-09-24T19:30:24.553Z"))
                    .websiteUrl("https://somber-substitution.com/")
                    .build())
                .connectionId("<id>")
                .build();

        CreateAtsCompanyResponse res = sdk.company().createAtsCompany()
                .request(req)
                .call();

        if (res.atsCompany().isPresent()) {
            System.out.println(res.atsCompany().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [CreateAtsCompanyRequest](../../models/operations/CreateAtsCompanyRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[CreateAtsCompanyResponse](../../models/operations/CreateAtsCompanyResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createCrmCompany

Create a company

### Example Usage

<!-- UsageSnippet language="java" operationID="createCrmCompany" method="post" path="/crm/{connection_id}/company" example="crm_company" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateCrmCompanyRequest;
import to.unified.unified_java_sdk.models.operations.CreateCrmCompanyResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateCrmCompanyRequest req = CreateCrmCompanyRequest.builder()
                .crmCompany(CrmCompany.builder()
                    .address(PropertyCrmCompanyAddress.builder()
                        .address1("7261 Salisbury Road")
                        .address2("Apt. 778")
                        .city("Harrisburg")
                        .countryCode("US")
                        .postalCode("56293-3678")
                        .region("Pennsylvania")
                        .regionCode("ID")
                        .build())
                    .createdAt(OffsetDateTime.parse("2020-05-11T18:26:32.925Z"))
                    .description("Balbus crapula spiculum.")
                    .domains(List.of(
                        "fussy-nerve.info",
                        "sturdy-lobster.org",
                        "greedy-offset.name"))
                    .emails(List.of(
                        CrmEmail.builder()
                            .email("Sandrine_Jacobi@hotmail.com")
                            .type(CrmEmailType.WORK)
                            .build(),
                        CrmEmail.builder()
                            .email("Sandrine_Jacobi@gmail.com")
                            .type(CrmEmailType.WORK)
                            .build(),
                        CrmEmail.builder()
                            .email("Sandrine.Jacobi@yahoo.com")
                            .type(CrmEmailType.OTHER)
                            .build()))
                    .employees(967d)
                    .id("878a4579-b9a2-4c57-8199-2ead09812aa8")
                    .industry("Infrastructure")
                    .isActive(true)
                    .linkUrls(List.of(
                        "https://blue-license.org",
                        "https://minor-formation.com",
                        "https://ecstatic-hammock.com"))
                    .metadata(List.of(
                        CrmMetadata.builder()
                            .extraData(CrmMetadataExtraData.of(Map.ofEntries(
                                Map.entry("display_name", "Custom Property"))))
                            .format(CrmMetadataFormat.TEXT)
                            .id("011e5f4e-5ac6-4bab-bc6e-ad1927085f0f")
                            .namespace("custom")
                            .slug("custom_property")
                            .value(CrmMetadataValue.of("esse"))
                            .build()))
                    .name("Goodwin and Sons")
                    .tags(List.of(
                        "quaerat",
                        "valeo"))
                    .telephones(List.of(
                        CrmTelephone.builder()
                            .telephone("(432) 849-2690")
                            .type(CrmTelephoneType.MOBILE)
                            .build(),
                        CrmTelephone.builder()
                            .telephone("(606) 871-2046")
                            .type(CrmTelephoneType.OTHER)
                            .build(),
                        CrmTelephone.builder()
                            .telephone("(842) 258-9395")
                            .type(CrmTelephoneType.MOBILE)
                            .build()))
                    .timezone("Europe/San_Marino")
                    .updatedAt(OffsetDateTime.parse("2025-02-06T12:34:04.282Z"))
                    .websites(List.of(
                        "https://wise-possession.org"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateCrmCompanyResponse res = sdk.company().createCrmCompany()
                .request(req)
                .call();

        if (res.crmCompany().isPresent()) {
            System.out.println(res.crmCompany().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [CreateCrmCompanyRequest](../../models/operations/CreateCrmCompanyRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[CreateCrmCompanyResponse](../../models/operations/CreateCrmCompanyResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createHrisCompany

Create a company

### Example Usage

<!-- UsageSnippet language="java" operationID="createHrisCompany" method="post" path="/hris/{connection_id}/company" example="hris_company" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateHrisCompanyRequest;
import to.unified.unified_java_sdk.models.operations.CreateHrisCompanyResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateHrisCompanyRequest req = CreateHrisCompanyRequest.builder()
                .hrisCompany(HrisCompany.builder()
                    .address(PropertyHrisCompanyAddress.builder()
                        .address1("2549 Church Walk")
                        .city("Lake Nettiebury")
                        .countryCode("US")
                        .postalCode("32877-4898")
                        .region("Idaho")
                        .regionCode("PA")
                        .build())
                    .createdAt(OffsetDateTime.parse("2021-05-02T22:27:38.970Z"))
                    .id("698ffe76-ccdf-460f-8855-4518977a5977")
                    .legalName("Schultz LLC")
                    .name("Gottlieb Group")
                    .updatedAt(OffsetDateTime.parse("2026-09-05T21:12:19.808Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateHrisCompanyResponse res = sdk.company().createHrisCompany()
                .request(req)
                .call();

        if (res.hrisCompany().isPresent()) {
            System.out.println(res.hrisCompany().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [CreateHrisCompanyRequest](../../models/operations/CreateHrisCompanyRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[CreateHrisCompanyResponse](../../models/operations/CreateHrisCompanyResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getAtsCompany

Retrieve a company

### Example Usage

<!-- UsageSnippet language="java" operationID="getAtsCompany" method="get" path="/ats/{connection_id}/company/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetAtsCompanyRequest;
import to.unified.unified_java_sdk.models.operations.GetAtsCompanyResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetAtsCompanyRequest req = GetAtsCompanyRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetAtsCompanyResponse res = sdk.company().getAtsCompany()
                .request(req)
                .call();

        if (res.atsCompany().isPresent()) {
            System.out.println(res.atsCompany().get());
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [GetAtsCompanyRequest](../../models/operations/GetAtsCompanyRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[GetAtsCompanyResponse](../../models/operations/GetAtsCompanyResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getCrmCompany

Retrieve a company

### Example Usage

<!-- UsageSnippet language="java" operationID="getCrmCompany" method="get" path="/crm/{connection_id}/company/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetCrmCompanyRequest;
import to.unified.unified_java_sdk.models.operations.GetCrmCompanyResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetCrmCompanyRequest req = GetCrmCompanyRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetCrmCompanyResponse res = sdk.company().getCrmCompany()
                .request(req)
                .call();

        if (res.crmCompany().isPresent()) {
            System.out.println(res.crmCompany().get());
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [GetCrmCompanyRequest](../../models/operations/GetCrmCompanyRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[GetCrmCompanyResponse](../../models/operations/GetCrmCompanyResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getHrisCompany

Retrieve a company

### Example Usage

<!-- UsageSnippet language="java" operationID="getHrisCompany" method="get" path="/hris/{connection_id}/company/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetHrisCompanyRequest;
import to.unified.unified_java_sdk.models.operations.GetHrisCompanyResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetHrisCompanyRequest req = GetHrisCompanyRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetHrisCompanyResponse res = sdk.company().getHrisCompany()
                .request(req)
                .call();

        if (res.hrisCompany().isPresent()) {
            System.out.println(res.hrisCompany().get());
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [GetHrisCompanyRequest](../../models/operations/GetHrisCompanyRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[GetHrisCompanyResponse](../../models/operations/GetHrisCompanyResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listAtsCompanies

List all companies

### Example Usage

<!-- UsageSnippet language="java" operationID="listAtsCompanies" method="get" path="/ats/{connection_id}/company" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListAtsCompaniesRequest;
import to.unified.unified_java_sdk.models.operations.ListAtsCompaniesResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListAtsCompaniesRequest req = ListAtsCompaniesRequest.builder()
                .connectionId("<id>")
                .build();

        ListAtsCompaniesResponse res = sdk.company().listAtsCompanies()
                .request(req)
                .call();

        if (res.atsCompanies().isPresent()) {
            System.out.println(res.atsCompanies().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [ListAtsCompaniesRequest](../../models/operations/ListAtsCompaniesRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[ListAtsCompaniesResponse](../../models/operations/ListAtsCompaniesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listCrmCompanies

List all companies

### Example Usage

<!-- UsageSnippet language="java" operationID="listCrmCompanies" method="get" path="/crm/{connection_id}/company" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListCrmCompaniesRequest;
import to.unified.unified_java_sdk.models.operations.ListCrmCompaniesResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListCrmCompaniesRequest req = ListCrmCompaniesRequest.builder()
                .connectionId("<id>")
                .build();

        ListCrmCompaniesResponse res = sdk.company().listCrmCompanies()
                .request(req)
                .call();

        if (res.crmCompanies().isPresent()) {
            System.out.println(res.crmCompanies().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [ListCrmCompaniesRequest](../../models/operations/ListCrmCompaniesRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[ListCrmCompaniesResponse](../../models/operations/ListCrmCompaniesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listEnrichCompanies

Retrieve enrichment information for a company

### Example Usage

<!-- UsageSnippet language="java" operationID="listEnrichCompanies" method="get" path="/enrich/{connection_id}/company" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListEnrichCompaniesRequest;
import to.unified.unified_java_sdk.models.operations.ListEnrichCompaniesResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListEnrichCompaniesRequest req = ListEnrichCompaniesRequest.builder()
                .connectionId("<id>")
                .build();

        ListEnrichCompaniesResponse res = sdk.company().listEnrichCompanies()
                .request(req)
                .call();

        if (res.enrichCompany().isPresent()) {
            System.out.println(res.enrichCompany().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [ListEnrichCompaniesRequest](../../models/operations/ListEnrichCompaniesRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[ListEnrichCompaniesResponse](../../models/operations/ListEnrichCompaniesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listHrisCompanies

List all companies

### Example Usage

<!-- UsageSnippet language="java" operationID="listHrisCompanies" method="get" path="/hris/{connection_id}/company" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListHrisCompaniesRequest;
import to.unified.unified_java_sdk.models.operations.ListHrisCompaniesResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListHrisCompaniesRequest req = ListHrisCompaniesRequest.builder()
                .connectionId("<id>")
                .build();

        ListHrisCompaniesResponse res = sdk.company().listHrisCompanies()
                .request(req)
                .call();

        if (res.hrisCompanies().isPresent()) {
            System.out.println(res.hrisCompanies().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [ListHrisCompaniesRequest](../../models/operations/ListHrisCompaniesRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[ListHrisCompaniesResponse](../../models/operations/ListHrisCompaniesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchAtsCompany

Update a company

### Example Usage

<!-- UsageSnippet language="java" operationID="patchAtsCompany" method="patch" path="/ats/{connection_id}/company/{id}" example="ats_company" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchAtsCompanyRequest;
import to.unified.unified_java_sdk.models.operations.PatchAtsCompanyResponse;
import to.unified.unified_java_sdk.models.shared.AtsCompany;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchAtsCompanyRequest req = PatchAtsCompanyRequest.builder()
                .atsCompany(AtsCompany.builder()
                    .createdAt(OffsetDateTime.parse("2019-04-22T03:50:02.920Z"))
                    .id("690c8c51-afd0-48c0-af3f-6cbe5db597c6")
                    .name("Gulgowski, Dibbert and Wilderman")
                    .phone("1-602-210-4548")
                    .updatedAt(OffsetDateTime.parse("2020-09-24T19:30:24.557Z"))
                    .websiteUrl("https://somber-substitution.com/")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchAtsCompanyResponse res = sdk.company().patchAtsCompany()
                .request(req)
                .call();

        if (res.atsCompany().isPresent()) {
            System.out.println(res.atsCompany().get());
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [PatchAtsCompanyRequest](../../models/operations/PatchAtsCompanyRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[PatchAtsCompanyResponse](../../models/operations/PatchAtsCompanyResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchCrmCompany

Update a company

### Example Usage

<!-- UsageSnippet language="java" operationID="patchCrmCompany" method="patch" path="/crm/{connection_id}/company/{id}" example="crm_company" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchCrmCompanyRequest;
import to.unified.unified_java_sdk.models.operations.PatchCrmCompanyResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchCrmCompanyRequest req = PatchCrmCompanyRequest.builder()
                .crmCompany(CrmCompany.builder()
                    .address(PropertyCrmCompanyAddress.builder()
                        .address1("7261 Salisbury Road")
                        .address2("Apt. 778")
                        .city("Harrisburg")
                        .countryCode("US")
                        .postalCode("56293-3678")
                        .region("Pennsylvania")
                        .regionCode("ID")
                        .build())
                    .createdAt(OffsetDateTime.parse("2020-05-11T18:26:32.925Z"))
                    .description("Balbus crapula spiculum.")
                    .domains(List.of(
                        "fussy-nerve.info",
                        "sturdy-lobster.org",
                        "greedy-offset.name"))
                    .emails(List.of(
                        CrmEmail.builder()
                            .email("Sandrine_Jacobi@hotmail.com")
                            .type(CrmEmailType.WORK)
                            .build(),
                        CrmEmail.builder()
                            .email("Sandrine_Jacobi@gmail.com")
                            .type(CrmEmailType.WORK)
                            .build(),
                        CrmEmail.builder()
                            .email("Sandrine.Jacobi@yahoo.com")
                            .type(CrmEmailType.OTHER)
                            .build()))
                    .employees(967d)
                    .id("8003016a-bd6c-4df3-a7c3-d668a5c955a0")
                    .industry("Infrastructure")
                    .isActive(true)
                    .linkUrls(List.of(
                        "https://blue-license.org",
                        "https://minor-formation.com",
                        "https://ecstatic-hammock.com"))
                    .metadata(List.of(
                        CrmMetadata.builder()
                            .extraData(CrmMetadataExtraData.of(Map.ofEntries(
                                Map.entry("display_name", "Custom Property"))))
                            .format(CrmMetadataFormat.TEXT)
                            .id("c0e84923-8a1c-4b7e-94a6-498d9d0416a4")
                            .namespace("custom")
                            .slug("custom_property")
                            .value(CrmMetadataValue.of("esse"))
                            .build()))
                    .name("Goodwin and Sons")
                    .tags(List.of(
                        "quaerat",
                        "valeo"))
                    .telephones(List.of(
                        CrmTelephone.builder()
                            .telephone("(432) 849-2690")
                            .type(CrmTelephoneType.MOBILE)
                            .build(),
                        CrmTelephone.builder()
                            .telephone("(606) 871-2046")
                            .type(CrmTelephoneType.OTHER)
                            .build(),
                        CrmTelephone.builder()
                            .telephone("(842) 258-9395")
                            .type(CrmTelephoneType.MOBILE)
                            .build()))
                    .timezone("Europe/San_Marino")
                    .updatedAt(OffsetDateTime.parse("2025-02-06T12:34:04.305Z"))
                    .websites(List.of(
                        "https://wise-possession.org"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchCrmCompanyResponse res = sdk.company().patchCrmCompany()
                .request(req)
                .call();

        if (res.crmCompany().isPresent()) {
            System.out.println(res.crmCompany().get());
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [PatchCrmCompanyRequest](../../models/operations/PatchCrmCompanyRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[PatchCrmCompanyResponse](../../models/operations/PatchCrmCompanyResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchHrisCompany

Update a company

### Example Usage

<!-- UsageSnippet language="java" operationID="patchHrisCompany" method="patch" path="/hris/{connection_id}/company/{id}" example="hris_company" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchHrisCompanyRequest;
import to.unified.unified_java_sdk.models.operations.PatchHrisCompanyResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchHrisCompanyRequest req = PatchHrisCompanyRequest.builder()
                .hrisCompany(HrisCompany.builder()
                    .address(PropertyHrisCompanyAddress.builder()
                        .address1("2549 Church Walk")
                        .city("Lake Nettiebury")
                        .countryCode("US")
                        .postalCode("32877-4898")
                        .region("Idaho")
                        .regionCode("PA")
                        .build())
                    .createdAt(OffsetDateTime.parse("2021-05-02T22:27:38.970Z"))
                    .id("fa4b8143-5f86-4d31-8b32-f1197757c6cf")
                    .legalName("Schultz LLC")
                    .name("Gottlieb Group")
                    .updatedAt(OffsetDateTime.parse("2026-09-05T21:12:19.828Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchHrisCompanyResponse res = sdk.company().patchHrisCompany()
                .request(req)
                .call();

        if (res.hrisCompany().isPresent()) {
            System.out.println(res.hrisCompany().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [PatchHrisCompanyRequest](../../models/operations/PatchHrisCompanyRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[PatchHrisCompanyResponse](../../models/operations/PatchHrisCompanyResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeAtsCompany

Remove a company

### Example Usage

<!-- UsageSnippet language="java" operationID="removeAtsCompany" method="delete" path="/ats/{connection_id}/company/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveAtsCompanyRequest;
import to.unified.unified_java_sdk.models.operations.RemoveAtsCompanyResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveAtsCompanyRequest req = RemoveAtsCompanyRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveAtsCompanyResponse res = sdk.company().removeAtsCompany()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [RemoveAtsCompanyRequest](../../models/operations/RemoveAtsCompanyRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[RemoveAtsCompanyResponse](../../models/operations/RemoveAtsCompanyResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeCrmCompany

Remove a company

### Example Usage

<!-- UsageSnippet language="java" operationID="removeCrmCompany" method="delete" path="/crm/{connection_id}/company/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveCrmCompanyRequest;
import to.unified.unified_java_sdk.models.operations.RemoveCrmCompanyResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveCrmCompanyRequest req = RemoveCrmCompanyRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveCrmCompanyResponse res = sdk.company().removeCrmCompany()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [RemoveCrmCompanyRequest](../../models/operations/RemoveCrmCompanyRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[RemoveCrmCompanyResponse](../../models/operations/RemoveCrmCompanyResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeHrisCompany

Remove a company

### Example Usage

<!-- UsageSnippet language="java" operationID="removeHrisCompany" method="delete" path="/hris/{connection_id}/company/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveHrisCompanyRequest;
import to.unified.unified_java_sdk.models.operations.RemoveHrisCompanyResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveHrisCompanyRequest req = RemoveHrisCompanyRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveHrisCompanyResponse res = sdk.company().removeHrisCompany()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [RemoveHrisCompanyRequest](../../models/operations/RemoveHrisCompanyRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[RemoveHrisCompanyResponse](../../models/operations/RemoveHrisCompanyResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateAtsCompany

Update a company

### Example Usage

<!-- UsageSnippet language="java" operationID="updateAtsCompany" method="put" path="/ats/{connection_id}/company/{id}" example="ats_company" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateAtsCompanyRequest;
import to.unified.unified_java_sdk.models.operations.UpdateAtsCompanyResponse;
import to.unified.unified_java_sdk.models.shared.AtsCompany;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateAtsCompanyRequest req = UpdateAtsCompanyRequest.builder()
                .atsCompany(AtsCompany.builder()
                    .createdAt(OffsetDateTime.parse("2019-04-22T03:50:02.920Z"))
                    .id("690c8c51-afd0-48c0-af3f-6cbe5db597c6")
                    .name("Gulgowski, Dibbert and Wilderman")
                    .phone("1-602-210-4548")
                    .updatedAt(OffsetDateTime.parse("2020-09-24T19:30:24.557Z"))
                    .websiteUrl("https://somber-substitution.com/")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateAtsCompanyResponse res = sdk.company().updateAtsCompany()
                .request(req)
                .call();

        if (res.atsCompany().isPresent()) {
            System.out.println(res.atsCompany().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [UpdateAtsCompanyRequest](../../models/operations/UpdateAtsCompanyRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[UpdateAtsCompanyResponse](../../models/operations/UpdateAtsCompanyResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateCrmCompany

Update a company

### Example Usage

<!-- UsageSnippet language="java" operationID="updateCrmCompany" method="put" path="/crm/{connection_id}/company/{id}" example="crm_company" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateCrmCompanyRequest;
import to.unified.unified_java_sdk.models.operations.UpdateCrmCompanyResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateCrmCompanyRequest req = UpdateCrmCompanyRequest.builder()
                .crmCompany(CrmCompany.builder()
                    .address(PropertyCrmCompanyAddress.builder()
                        .address1("7261 Salisbury Road")
                        .address2("Apt. 778")
                        .city("Harrisburg")
                        .countryCode("US")
                        .postalCode("56293-3678")
                        .region("Pennsylvania")
                        .regionCode("ID")
                        .build())
                    .createdAt(OffsetDateTime.parse("2020-05-11T18:26:32.925Z"))
                    .description("Balbus crapula spiculum.")
                    .domains(List.of(
                        "fussy-nerve.info",
                        "sturdy-lobster.org",
                        "greedy-offset.name"))
                    .emails(List.of(
                        CrmEmail.builder()
                            .email("Sandrine_Jacobi@hotmail.com")
                            .type(CrmEmailType.WORK)
                            .build(),
                        CrmEmail.builder()
                            .email("Sandrine_Jacobi@gmail.com")
                            .type(CrmEmailType.WORK)
                            .build(),
                        CrmEmail.builder()
                            .email("Sandrine.Jacobi@yahoo.com")
                            .type(CrmEmailType.OTHER)
                            .build()))
                    .employees(967d)
                    .id("8003016a-bd6c-4df3-a7c3-d668a5c955a0")
                    .industry("Infrastructure")
                    .isActive(true)
                    .linkUrls(List.of(
                        "https://blue-license.org",
                        "https://minor-formation.com",
                        "https://ecstatic-hammock.com"))
                    .metadata(List.of(
                        CrmMetadata.builder()
                            .extraData(CrmMetadataExtraData.of(Map.ofEntries(
                                Map.entry("display_name", "Custom Property"))))
                            .format(CrmMetadataFormat.TEXT)
                            .id("c0e84923-8a1c-4b7e-94a6-498d9d0416a4")
                            .namespace("custom")
                            .slug("custom_property")
                            .value(CrmMetadataValue.of("esse"))
                            .build()))
                    .name("Goodwin and Sons")
                    .tags(List.of(
                        "quaerat",
                        "valeo"))
                    .telephones(List.of(
                        CrmTelephone.builder()
                            .telephone("(432) 849-2690")
                            .type(CrmTelephoneType.MOBILE)
                            .build(),
                        CrmTelephone.builder()
                            .telephone("(606) 871-2046")
                            .type(CrmTelephoneType.OTHER)
                            .build(),
                        CrmTelephone.builder()
                            .telephone("(842) 258-9395")
                            .type(CrmTelephoneType.MOBILE)
                            .build()))
                    .timezone("Europe/San_Marino")
                    .updatedAt(OffsetDateTime.parse("2025-02-06T12:34:04.305Z"))
                    .websites(List.of(
                        "https://wise-possession.org"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateCrmCompanyResponse res = sdk.company().updateCrmCompany()
                .request(req)
                .call();

        if (res.crmCompany().isPresent()) {
            System.out.println(res.crmCompany().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [UpdateCrmCompanyRequest](../../models/operations/UpdateCrmCompanyRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[UpdateCrmCompanyResponse](../../models/operations/UpdateCrmCompanyResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateHrisCompany

Update a company

### Example Usage

<!-- UsageSnippet language="java" operationID="updateHrisCompany" method="put" path="/hris/{connection_id}/company/{id}" example="hris_company" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateHrisCompanyRequest;
import to.unified.unified_java_sdk.models.operations.UpdateHrisCompanyResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateHrisCompanyRequest req = UpdateHrisCompanyRequest.builder()
                .hrisCompany(HrisCompany.builder()
                    .address(PropertyHrisCompanyAddress.builder()
                        .address1("2549 Church Walk")
                        .city("Lake Nettiebury")
                        .countryCode("US")
                        .postalCode("32877-4898")
                        .region("Idaho")
                        .regionCode("PA")
                        .build())
                    .createdAt(OffsetDateTime.parse("2021-05-02T22:27:38.970Z"))
                    .id("fa4b8143-5f86-4d31-8b32-f1197757c6cf")
                    .legalName("Schultz LLC")
                    .name("Gottlieb Group")
                    .updatedAt(OffsetDateTime.parse("2026-09-05T21:12:19.828Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateHrisCompanyResponse res = sdk.company().updateHrisCompany()
                .request(req)
                .call();

        if (res.hrisCompany().isPresent()) {
            System.out.println(res.hrisCompany().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [UpdateHrisCompanyRequest](../../models/operations/UpdateHrisCompanyRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[UpdateHrisCompanyResponse](../../models/operations/UpdateHrisCompanyResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |