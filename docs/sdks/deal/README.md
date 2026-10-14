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

Create a deal

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
                    .closedAt(OffsetDateTime.parse("2024-03-08T23:26:03.477Z"))
                    .closingAt(OffsetDateTime.parse("2025-08-26T23:08:49.190Z"))
                    .createdAt(OffsetDateTime.parse("2023-07-04T12:48:48.470Z"))
                    .currency("IQD")
                    .description("Tabula cicuta sophismata comis tepidus sit cavus.")
                    .id("72e47419-4155-4635-ab69-47da2536346a")
                    .metadata(List.of(
                        CrmMetadata.builder()
                            .extraData(CrmMetadataExtraData.of(Map.ofEntries(
                                Map.entry("display_name", "Custom Property"))))
                            .format(CrmMetadataFormat.TEXT)
                            .id("d39acb95-d1b1-490f-b691-6fdd17e6d02e")
                            .namespace("custom")
                            .slug("custom_property")
                            .value(CrmMetadataValue.of("conatus"))
                            .build()))
                    .name("Frozen Silk Chicken")
                    .pipelines(List.of(
                        CrmReference.builder()
                            .id("e352489e-2742-46db-9aa6-38801f45a7d6")
                            .name("trans")
                            .build()))
                    .probability(65d)
                    .source("cubo")
                    .stages(List.of(
                        CrmReference.builder()
                            .id("b4dd5fa4-1ab4-430e-b57f-de15158fc50b")
                            .name("tubineus")
                            .build(),
                        CrmReference.builder()
                            .id("147414e5-6fe7-4c35-b5ac-74a79ed166f4")
                            .name("adfectus")
                            .build()))
                    .tags(List.of(
                        "causa",
                        "suus"))
                    .updatedAt(OffsetDateTime.parse("2024-10-09T04:38:30.818Z"))
                    .wonReason("Usque libero soleo.")
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

Retrieve a deal

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

List all deals

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

Update a deal

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
                    .closedAt(OffsetDateTime.parse("2024-03-08T23:26:03.480Z"))
                    .closingAt(OffsetDateTime.parse("2025-08-26T23:08:49.200Z"))
                    .createdAt(OffsetDateTime.parse("2023-07-04T12:48:48.470Z"))
                    .currency("IQD")
                    .description("Tabula cicuta sophismata comis tepidus sit cavus.")
                    .id("2ad00578-585a-4eb4-8059-f97f4a0b9f63")
                    .metadata(List.of(
                        CrmMetadata.builder()
                            .extraData(CrmMetadataExtraData.of(Map.ofEntries(
                                Map.entry("display_name", "Custom Property"))))
                            .format(CrmMetadataFormat.TEXT)
                            .id("9e10d541-fa44-40fc-afed-038956cfbb6a")
                            .namespace("custom")
                            .slug("custom_property")
                            .value(CrmMetadataValue.of("conatus"))
                            .build()))
                    .name("Frozen Silk Chicken")
                    .pipelines(List.of(
                        CrmReference.builder()
                            .id("19fd79ec-bf6c-4a76-a54a-a8a762455870")
                            .name("trans")
                            .build()))
                    .probability(65d)
                    .source("cubo")
                    .stages(List.of(
                        CrmReference.builder()
                            .id("8f5daab0-6799-4bdc-8910-86a5322bdb72")
                            .name("tubineus")
                            .build(),
                        CrmReference.builder()
                            .id("571eae32-2278-4235-9ebe-63628a87872f")
                            .name("adfectus")
                            .build()))
                    .tags(List.of(
                        "causa",
                        "suus"))
                    .updatedAt(OffsetDateTime.parse("2024-10-09T04:38:30.824Z"))
                    .wonReason("Usque libero soleo.")
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

Remove a deal

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

Update a deal

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
                    .closedAt(OffsetDateTime.parse("2024-03-08T23:26:03.480Z"))
                    .closingAt(OffsetDateTime.parse("2025-08-26T23:08:49.200Z"))
                    .createdAt(OffsetDateTime.parse("2023-07-04T12:48:48.470Z"))
                    .currency("IQD")
                    .description("Tabula cicuta sophismata comis tepidus sit cavus.")
                    .id("2ad00578-585a-4eb4-8059-f97f4a0b9f63")
                    .metadata(List.of(
                        CrmMetadata.builder()
                            .extraData(CrmMetadataExtraData.of(Map.ofEntries(
                                Map.entry("display_name", "Custom Property"))))
                            .format(CrmMetadataFormat.TEXT)
                            .id("9e10d541-fa44-40fc-afed-038956cfbb6a")
                            .namespace("custom")
                            .slug("custom_property")
                            .value(CrmMetadataValue.of("conatus"))
                            .build()))
                    .name("Frozen Silk Chicken")
                    .pipelines(List.of(
                        CrmReference.builder()
                            .id("19fd79ec-bf6c-4a76-a54a-a8a762455870")
                            .name("trans")
                            .build()))
                    .probability(65d)
                    .source("cubo")
                    .stages(List.of(
                        CrmReference.builder()
                            .id("8f5daab0-6799-4bdc-8910-86a5322bdb72")
                            .name("tubineus")
                            .build(),
                        CrmReference.builder()
                            .id("571eae32-2278-4235-9ebe-63628a87872f")
                            .name("adfectus")
                            .build()))
                    .tags(List.of(
                        "causa",
                        "suus"))
                    .updatedAt(OffsetDateTime.parse("2024-10-09T04:38:30.824Z"))
                    .wonReason("Usque libero soleo.")
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