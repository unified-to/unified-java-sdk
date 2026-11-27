# Deal

## Overview

### Available Operations

* [createCrmDeal](#createcrmdeal) - Create a deal
* [getCrmDeal](#getcrmdeal) - Retrieve a deal
* [listCrmDeals](#listcrmdeals) - List all deals
* [patchCrmDeal](#patchcrmdeal) - Update a deal
* [removeCrmDeal](#removecrmdeal) - Remove a deal
* [updateCrmDeal](#updatecrmdeal) - Update a deal

## createCrmDeal

Creates a CrmDeal. Provide the unified CrmDeal fields in the request body; they are mapped to the provider's API. Returns the created CrmDeal.

### Example Usage

<!-- UsageSnippet language="java" operationID="createCrmDeal" method="post" path="/crm/{connection_id}/deal" example="crm_deal" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateCrmDealRequest;
import to.unified.unified_java_sdk.models.operations.CreateCrmDealResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateCrmDealRequest req = CreateCrmDealRequest.builder()
                .crmDeal(CrmDeal.builder()
                    .amount(98162d)
                    .closedAt(OffsetDateTime.parse("2024-03-18T02:26:08.566Z"))
                    .closingAt(OffsetDateTime.parse("2025-09-24T18:37:13.401Z"))
                    .createdAt(OffsetDateTime.parse("2023-07-04T12:48:48.470Z"))
                    .currency("USD")
                    .description("Trans tubineus adfectus cubo causa suus.")
                    .id("1edcd825-5aba-453f-b833-f7bf68a01803")
                    .metadata(List.of(
                        CrmMetadata.builder()
                            .extraData(CrmMetadataExtraData.of(Map.ofEntries(
                                Map.entry("display_name", "Custom Property"))))
                            .format(CrmMetadataFormat.TEXT)
                            .id("e3dc7e35-3251-4ff0-978d-e70271c58dc9")
                            .namespace("custom")
                            .slug("custom_property")
                            .value(CrmMetadataValue.of("tandem"))
                            .build()))
                    .name("Orn Inc - Refined Metal Chicken")
                    .probability(42d)
                    .source("conatus")
                    .tags(List.of(
                        "sol",
                        "odit"))
                    .updatedAt(OffsetDateTime.parse("2024-10-26T04:28:29.968Z"))
                    .wonReason("Libero soleo cetera unus caterva.")
                    .build())
                .connectionId("<id>")
                .build();

        CreateCrmDealResponse res = sdk.deal().createCrmDeal()
                .request(req)
                .call();

        if (res.crmDeal().isPresent()) {
            System.out.println(res.crmDeal().get());
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [CreateCrmDealRequest](../../models/operations/CreateCrmDealRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[CreateCrmDealResponse](../../models/operations/CreateCrmDealResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getCrmDeal

Retrieves a single CrmDeal by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getCrmDeal" method="get" path="/crm/{connection_id}/deal/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetCrmDealRequest;
import to.unified.unified_java_sdk.models.operations.GetCrmDealResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetCrmDealRequest req = GetCrmDealRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetCrmDealResponse res = sdk.deal().getCrmDeal()
                .request(req)
                .call();

        if (res.crmDeal().isPresent()) {
            System.out.println(res.crmDeal().get());
        }
    }
}
```

### Parameters

| Parameter                                                         | Type                                                              | Required                                                          | Description                                                       |
| ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- |
| `request`                                                         | [GetCrmDealRequest](../../models/operations/GetCrmDealRequest.md) | :heavy_check_mark:                                                | The request object to use for the request.                        |

### Response

**[GetCrmDealResponse](../../models/operations/GetCrmDealResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listCrmDeals

Returns a list of CrmDeals. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listCrmDeals" method="get" path="/crm/{connection_id}/deal" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListCrmDealsRequest;
import to.unified.unified_java_sdk.models.operations.ListCrmDealsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListCrmDealsRequest req = ListCrmDealsRequest.builder()
                .connectionId("<id>")
                .build();

        ListCrmDealsResponse res = sdk.deal().listCrmDeals()
                .request(req)
                .call();

        if (res.crmDeals().isPresent()) {
            System.out.println(res.crmDeals().get());
        }
    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [ListCrmDealsRequest](../../models/operations/ListCrmDealsRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[ListCrmDealsResponse](../../models/operations/ListCrmDealsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchCrmDeal

Updates the CrmDeal identified by `id`. Provide the unified CrmDeal fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="patchCrmDeal" method="patch" path="/crm/{connection_id}/deal/{id}" example="crm_deal" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchCrmDealRequest;
import to.unified.unified_java_sdk.models.operations.PatchCrmDealResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchCrmDealRequest req = PatchCrmDealRequest.builder()
                .crmDeal(CrmDeal.builder()
                    .amount(98162d)
                    .closedAt(OffsetDateTime.parse("2024-03-18T02:26:08.568Z"))
                    .closingAt(OffsetDateTime.parse("2025-09-24T18:37:13.409Z"))
                    .createdAt(OffsetDateTime.parse("2023-07-04T12:48:48.470Z"))
                    .currency("USD")
                    .description("Trans tubineus adfectus cubo causa suus.")
                    .id("ab0bb2d1-2751-432c-9f34-29b91242ddf2")
                    .metadata(List.of(
                        CrmMetadata.builder()
                            .extraData(CrmMetadataExtraData.of(Map.ofEntries(
                                Map.entry("display_name", "Custom Property"))))
                            .format(CrmMetadataFormat.TEXT)
                            .id("437351e0-699b-4de8-9713-1258c29f4cbd")
                            .namespace("custom")
                            .slug("custom_property")
                            .value(CrmMetadataValue.of("tandem"))
                            .build()))
                    .name("Orn Inc - Refined Metal Chicken")
                    .probability(42d)
                    .source("conatus")
                    .tags(List.of(
                        "sol",
                        "odit"))
                    .updatedAt(OffsetDateTime.parse("2024-10-26T04:28:29.972Z"))
                    .wonReason("Libero soleo cetera unus caterva.")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchCrmDealResponse res = sdk.deal().patchCrmDeal()
                .request(req)
                .call();

        if (res.crmDeal().isPresent()) {
            System.out.println(res.crmDeal().get());
        }
    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [PatchCrmDealRequest](../../models/operations/PatchCrmDealRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[PatchCrmDealResponse](../../models/operations/PatchCrmDealResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeCrmDeal

Deletes the CrmDeal identified by `id`.

### Example Usage

<!-- UsageSnippet language="java" operationID="removeCrmDeal" method="delete" path="/crm/{connection_id}/deal/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveCrmDealRequest;
import to.unified.unified_java_sdk.models.operations.RemoveCrmDealResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveCrmDealRequest req = RemoveCrmDealRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveCrmDealResponse res = sdk.deal().removeCrmDeal()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [RemoveCrmDealRequest](../../models/operations/RemoveCrmDealRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[RemoveCrmDealResponse](../../models/operations/RemoveCrmDealResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateCrmDeal

Updates the CrmDeal identified by `id`. Provide the unified CrmDeal fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateCrmDeal" method="put" path="/crm/{connection_id}/deal/{id}" example="crm_deal" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateCrmDealRequest;
import to.unified.unified_java_sdk.models.operations.UpdateCrmDealResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateCrmDealRequest req = UpdateCrmDealRequest.builder()
                .crmDeal(CrmDeal.builder()
                    .amount(98162d)
                    .closedAt(OffsetDateTime.parse("2024-03-18T02:26:08.568Z"))
                    .closingAt(OffsetDateTime.parse("2025-09-24T18:37:13.409Z"))
                    .createdAt(OffsetDateTime.parse("2023-07-04T12:48:48.470Z"))
                    .currency("USD")
                    .description("Trans tubineus adfectus cubo causa suus.")
                    .id("ab0bb2d1-2751-432c-9f34-29b91242ddf2")
                    .metadata(List.of(
                        CrmMetadata.builder()
                            .extraData(CrmMetadataExtraData.of(Map.ofEntries(
                                Map.entry("display_name", "Custom Property"))))
                            .format(CrmMetadataFormat.TEXT)
                            .id("437351e0-699b-4de8-9713-1258c29f4cbd")
                            .namespace("custom")
                            .slug("custom_property")
                            .value(CrmMetadataValue.of("tandem"))
                            .build()))
                    .name("Orn Inc - Refined Metal Chicken")
                    .probability(42d)
                    .source("conatus")
                    .tags(List.of(
                        "sol",
                        "odit"))
                    .updatedAt(OffsetDateTime.parse("2024-10-26T04:28:29.972Z"))
                    .wonReason("Libero soleo cetera unus caterva.")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateCrmDealResponse res = sdk.deal().updateCrmDeal()
                .request(req)
                .call();

        if (res.crmDeal().isPresent()) {
            System.out.println(res.crmDeal().get());
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [UpdateCrmDealRequest](../../models/operations/UpdateCrmDealRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[UpdateCrmDealResponse](../../models/operations/UpdateCrmDealResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |