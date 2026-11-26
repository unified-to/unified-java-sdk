# Taxwithholding

## Overview

### Available Operations

* [createHrisTaxwithholding](#createhristaxwithholding) - Create a taxwithholding
* [getHrisTaxwithholding](#gethristaxwithholding) - Retrieve a taxwithholding
* [listHrisTaxwithholdings](#listhristaxwithholdings) - List all taxwithholdings
* [patchHrisTaxwithholding](#patchhristaxwithholding) - Update a taxwithholding
* [removeHrisTaxwithholding](#removehristaxwithholding) - Remove a taxwithholding
* [updateHrisTaxwithholding](#updatehristaxwithholding) - Update a taxwithholding

## createHrisTaxwithholding

Creates a HrisTaxwithholding. Provide the unified HrisTaxwithholding fields in the request body; they are mapped to the provider's API. Returns the created HrisTaxwithholding.

### Example Usage

<!-- UsageSnippet language="java" operationID="createHrisTaxwithholding" method="post" path="/hris/{connection_id}/taxwithholding" example="hris_taxwithholding" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateHrisTaxwithholdingRequest;
import to.unified.unified_java_sdk.models.operations.CreateHrisTaxwithholdingResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateHrisTaxwithholdingRequest req = CreateHrisTaxwithholdingRequest.builder()
                .hrisTaxwithholding(HrisTaxwithholding.builder()
                    .allowances(1d)
                    .country("US")
                    .createdAt(OffsetDateTime.parse("2022-08-14T05:49:35.141Z"))
                    .effectiveAt(OffsetDateTime.parse("2022-08-14T05:49:35.141Z"))
                    .extraWithholdingAmount(10d)
                    .filingStatus(FilingStatus.QUALIFYING_SURVIVOR)
                    .form(Form.STATE_FORM)
                    .id("9b1ee476-03e1-421c-90c6-cc08f5b7ba27")
                    .isExempt(false)
                    .isResident(true)
                    .jurisdiction("MI")
                    .jurisdictionType(JurisdictionType.STATE)
                    .metadata(List.of())
                    .overrideAmount(19d)
                    .overrideType(OverrideType.FIXED_AMOUNT)
                    .updatedAt(OffsetDateTime.parse("2026-10-07T00:39:45.070Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateHrisTaxwithholdingResponse res = sdk.taxwithholding().createHrisTaxwithholding()
                .request(req)
                .call();

        if (res.hrisTaxwithholding().isPresent()) {
            System.out.println(res.hrisTaxwithholding().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [CreateHrisTaxwithholdingRequest](../../models/operations/CreateHrisTaxwithholdingRequest.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[CreateHrisTaxwithholdingResponse](../../models/operations/CreateHrisTaxwithholdingResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getHrisTaxwithholding

Retrieves a single HrisTaxwithholding by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getHrisTaxwithholding" method="get" path="/hris/{connection_id}/taxwithholding/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetHrisTaxwithholdingRequest;
import to.unified.unified_java_sdk.models.operations.GetHrisTaxwithholdingResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetHrisTaxwithholdingRequest req = GetHrisTaxwithholdingRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetHrisTaxwithholdingResponse res = sdk.taxwithholding().getHrisTaxwithholding()
                .request(req)
                .call();

        if (res.hrisTaxwithholding().isPresent()) {
            System.out.println(res.hrisTaxwithholding().get());
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [GetHrisTaxwithholdingRequest](../../models/operations/GetHrisTaxwithholdingRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[GetHrisTaxwithholdingResponse](../../models/operations/GetHrisTaxwithholdingResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listHrisTaxwithholdings

Returns a list of HrisTaxwithholdings. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listHrisTaxwithholdings" method="get" path="/hris/{connection_id}/taxwithholding" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListHrisTaxwithholdingsRequest;
import to.unified.unified_java_sdk.models.operations.ListHrisTaxwithholdingsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListHrisTaxwithholdingsRequest req = ListHrisTaxwithholdingsRequest.builder()
                .connectionId("<id>")
                .build();

        ListHrisTaxwithholdingsResponse res = sdk.taxwithholding().listHrisTaxwithholdings()
                .request(req)
                .call();

        if (res.hrisTaxwithholdings().isPresent()) {
            System.out.println(res.hrisTaxwithholdings().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [ListHrisTaxwithholdingsRequest](../../models/operations/ListHrisTaxwithholdingsRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[ListHrisTaxwithholdingsResponse](../../models/operations/ListHrisTaxwithholdingsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchHrisTaxwithholding

Updates the HrisTaxwithholding identified by `id`. Provide the unified HrisTaxwithholding fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="patchHrisTaxwithholding" method="patch" path="/hris/{connection_id}/taxwithholding/{id}" example="hris_taxwithholding" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchHrisTaxwithholdingRequest;
import to.unified.unified_java_sdk.models.operations.PatchHrisTaxwithholdingResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchHrisTaxwithholdingRequest req = PatchHrisTaxwithholdingRequest.builder()
                .hrisTaxwithholding(HrisTaxwithholding.builder()
                    .allowances(1d)
                    .country("US")
                    .createdAt(OffsetDateTime.parse("2022-08-14T05:49:35.141Z"))
                    .effectiveAt(OffsetDateTime.parse("2022-08-14T05:49:35.141Z"))
                    .extraWithholdingAmount(10d)
                    .filingStatus(FilingStatus.QUALIFYING_SURVIVOR)
                    .form(Form.STATE_FORM)
                    .id("957e6918-6684-4cd0-a963-d12488a462bf")
                    .isExempt(false)
                    .isResident(true)
                    .jurisdiction("MI")
                    .jurisdictionType(JurisdictionType.STATE)
                    .metadata(List.of())
                    .overrideAmount(19d)
                    .overrideType(OverrideType.FIXED_AMOUNT)
                    .updatedAt(OffsetDateTime.parse("2026-10-07T00:39:45.090Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchHrisTaxwithholdingResponse res = sdk.taxwithholding().patchHrisTaxwithholding()
                .request(req)
                .call();

        if (res.hrisTaxwithholding().isPresent()) {
            System.out.println(res.hrisTaxwithholding().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [PatchHrisTaxwithholdingRequest](../../models/operations/PatchHrisTaxwithholdingRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[PatchHrisTaxwithholdingResponse](../../models/operations/PatchHrisTaxwithholdingResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeHrisTaxwithholding

Deletes the HrisTaxwithholding identified by `id`.

### Example Usage

<!-- UsageSnippet language="java" operationID="removeHrisTaxwithholding" method="delete" path="/hris/{connection_id}/taxwithholding/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveHrisTaxwithholdingRequest;
import to.unified.unified_java_sdk.models.operations.RemoveHrisTaxwithholdingResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveHrisTaxwithholdingRequest req = RemoveHrisTaxwithholdingRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveHrisTaxwithholdingResponse res = sdk.taxwithholding().removeHrisTaxwithholding()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [RemoveHrisTaxwithholdingRequest](../../models/operations/RemoveHrisTaxwithholdingRequest.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[RemoveHrisTaxwithholdingResponse](../../models/operations/RemoveHrisTaxwithholdingResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateHrisTaxwithholding

Updates the HrisTaxwithholding identified by `id`. Provide the unified HrisTaxwithholding fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateHrisTaxwithholding" method="put" path="/hris/{connection_id}/taxwithholding/{id}" example="hris_taxwithholding" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateHrisTaxwithholdingRequest;
import to.unified.unified_java_sdk.models.operations.UpdateHrisTaxwithholdingResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateHrisTaxwithholdingRequest req = UpdateHrisTaxwithholdingRequest.builder()
                .hrisTaxwithholding(HrisTaxwithholding.builder()
                    .allowances(1d)
                    .country("US")
                    .createdAt(OffsetDateTime.parse("2022-08-14T05:49:35.141Z"))
                    .effectiveAt(OffsetDateTime.parse("2022-08-14T05:49:35.141Z"))
                    .extraWithholdingAmount(10d)
                    .filingStatus(FilingStatus.QUALIFYING_SURVIVOR)
                    .form(Form.STATE_FORM)
                    .id("957e6918-6684-4cd0-a963-d12488a462bf")
                    .isExempt(false)
                    .isResident(true)
                    .jurisdiction("MI")
                    .jurisdictionType(JurisdictionType.STATE)
                    .metadata(List.of())
                    .overrideAmount(19d)
                    .overrideType(OverrideType.FIXED_AMOUNT)
                    .updatedAt(OffsetDateTime.parse("2026-10-07T00:39:45.090Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateHrisTaxwithholdingResponse res = sdk.taxwithholding().updateHrisTaxwithholding()
                .request(req)
                .call();

        if (res.hrisTaxwithholding().isPresent()) {
            System.out.println(res.hrisTaxwithholding().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [UpdateHrisTaxwithholdingRequest](../../models/operations/UpdateHrisTaxwithholdingRequest.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[UpdateHrisTaxwithholdingResponse](../../models/operations/UpdateHrisTaxwithholdingResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |