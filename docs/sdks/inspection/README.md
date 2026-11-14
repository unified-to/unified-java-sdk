# Inspection

## Overview

### Available Operations

* [createQmsInspection](#createqmsinspection) - Create an inspection
* [getQmsInspection](#getqmsinspection) - Retrieve an inspection
* [listQmsInspections](#listqmsinspections) - List all inspections
* [patchQmsInspection](#patchqmsinspection) - Update an inspection
* [updateQmsInspection](#updateqmsinspection) - Update an inspection

## createQmsInspection

Creates a QmsInspection. Provide the unified QmsInspection fields in the request body; they are mapped to the provider's API. Returns the created QmsInspection.

### Example Usage

<!-- UsageSnippet language="java" operationID="createQmsInspection" method="post" path="/qms/{connection_id}/inspection" example="qms_inspection" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateQmsInspectionRequest;
import to.unified.unified_java_sdk.models.operations.CreateQmsInspectionResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateQmsInspectionRequest req = CreateQmsInspectionRequest.builder()
                .qmsInspection(QmsInspection.builder()
                    .characteristics(List.of(
                        QmsCharacteristic.builder()
                            .lowerLimit(152.9)
                            .measuredValue("152.94")
                            .name("Hole position")
                            .nominalValue(153d)
                            .result(Result.PASS)
                            .unitOfMeasure("mm")
                            .upperLimit(153.1)
                            .build(),
                        QmsCharacteristic.builder()
                            .lowerLimit(24.95)
                            .measuredValue("25.03")
                            .name("Flatness")
                            .nominalValue(25d)
                            .result(Result.PASS)
                            .unitOfMeasure("mm")
                            .upperLimit(25.05)
                            .build(),
                        QmsCharacteristic.builder()
                            .lowerLimit(53.99)
                            .measuredValue("53.99")
                            .name("Bore diameter")
                            .nominalValue(54d)
                            .result(Result.PASS)
                            .unitOfMeasure("mm")
                            .upperLimit(54.01)
                            .build()))
                    .createdAt(OffsetDateTime.parse("2020-04-18T21:23:54.000Z"))
                    .fileIds(List.of())
                    .id("013e67cc-e4a7-4f03-8e8e-db614eb1877b")
                    .inspectedAt(OffsetDateTime.parse("2021-02-07T08:45:10.646Z"))
                    .issueIds(List.of())
                    .lifecycleState("Complete")
                    .metadata(List.of())
                    .name("Source inspection")
                    .number("INSP-96996")
                    .partNumber("PRT-048483")
                    .quantityAccepted(41d)
                    .quantityInspected(41d)
                    .quantityRejected(0d)
                    .result(QmsInspectionResult.PASS)
                    .revision("A")
                    .status(QmsInspectionStatus.CLOSED)
                    .supplierName("Gerlach LLC")
                    .type(QmsInspectionType.SOURCE)
                    .updatedAt(OffsetDateTime.parse("2026-05-08T14:03:14.383Z"))
                    .url("https://purple-newsprint.name/")
                    .build())
                .connectionId("<id>")
                .build();

        CreateQmsInspectionResponse res = sdk.inspection().createQmsInspection()
                .request(req)
                .call();

        if (res.qmsInspection().isPresent()) {
            System.out.println(res.qmsInspection().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [CreateQmsInspectionRequest](../../models/operations/CreateQmsInspectionRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[CreateQmsInspectionResponse](../../models/operations/CreateQmsInspectionResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getQmsInspection

Retrieves a single QmsInspection by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getQmsInspection" method="get" path="/qms/{connection_id}/inspection/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetQmsInspectionRequest;
import to.unified.unified_java_sdk.models.operations.GetQmsInspectionResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetQmsInspectionRequest req = GetQmsInspectionRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetQmsInspectionResponse res = sdk.inspection().getQmsInspection()
                .request(req)
                .call();

        if (res.qmsInspection().isPresent()) {
            System.out.println(res.qmsInspection().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [GetQmsInspectionRequest](../../models/operations/GetQmsInspectionRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[GetQmsInspectionResponse](../../models/operations/GetQmsInspectionResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listQmsInspections

Returns a list of QmsInspections. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listQmsInspections" method="get" path="/qms/{connection_id}/inspection" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListQmsInspectionsRequest;
import to.unified.unified_java_sdk.models.operations.ListQmsInspectionsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListQmsInspectionsRequest req = ListQmsInspectionsRequest.builder()
                .connectionId("<id>")
                .build();

        ListQmsInspectionsResponse res = sdk.inspection().listQmsInspections()
                .request(req)
                .call();

        if (res.qmsInspections().isPresent()) {
            System.out.println(res.qmsInspections().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [ListQmsInspectionsRequest](../../models/operations/ListQmsInspectionsRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[ListQmsInspectionsResponse](../../models/operations/ListQmsInspectionsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchQmsInspection

Updates the QmsInspection identified by `id`. Provide the unified QmsInspection fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="patchQmsInspection" method="patch" path="/qms/{connection_id}/inspection/{id}" example="qms_inspection" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchQmsInspectionRequest;
import to.unified.unified_java_sdk.models.operations.PatchQmsInspectionResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchQmsInspectionRequest req = PatchQmsInspectionRequest.builder()
                .qmsInspection(QmsInspection.builder()
                    .characteristics(List.of(
                        QmsCharacteristic.builder()
                            .lowerLimit(152.9)
                            .measuredValue("152.94")
                            .name("Hole position")
                            .nominalValue(153d)
                            .result(Result.PASS)
                            .unitOfMeasure("mm")
                            .upperLimit(153.1)
                            .build(),
                        QmsCharacteristic.builder()
                            .lowerLimit(24.95)
                            .measuredValue("25.03")
                            .name("Flatness")
                            .nominalValue(25d)
                            .result(Result.PASS)
                            .unitOfMeasure("mm")
                            .upperLimit(25.05)
                            .build(),
                        QmsCharacteristic.builder()
                            .lowerLimit(53.99)
                            .measuredValue("53.99")
                            .name("Bore diameter")
                            .nominalValue(54d)
                            .result(Result.PASS)
                            .unitOfMeasure("mm")
                            .upperLimit(54.01)
                            .build()))
                    .createdAt(OffsetDateTime.parse("2020-04-18T21:23:54.000Z"))
                    .fileIds(List.of())
                    .id("893f655e-e036-4227-acd8-5cbe7f5e02c0")
                    .inspectedAt(OffsetDateTime.parse("2021-02-07T08:45:10.649Z"))
                    .issueIds(List.of())
                    .lifecycleState("Complete")
                    .metadata(List.of())
                    .name("Source inspection")
                    .number("INSP-96996")
                    .partNumber("PRT-048483")
                    .quantityAccepted(41d)
                    .quantityInspected(41d)
                    .quantityRejected(0d)
                    .result(QmsInspectionResult.PASS)
                    .revision("A")
                    .status(QmsInspectionStatus.CLOSED)
                    .supplierName("Gerlach LLC")
                    .type(QmsInspectionType.SOURCE)
                    .updatedAt(OffsetDateTime.parse("2026-05-08T14:03:14.400Z"))
                    .url("https://purple-newsprint.name/")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchQmsInspectionResponse res = sdk.inspection().patchQmsInspection()
                .request(req)
                .call();

        if (res.qmsInspection().isPresent()) {
            System.out.println(res.qmsInspection().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [PatchQmsInspectionRequest](../../models/operations/PatchQmsInspectionRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[PatchQmsInspectionResponse](../../models/operations/PatchQmsInspectionResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateQmsInspection

Updates the QmsInspection identified by `id`. Provide the unified QmsInspection fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateQmsInspection" method="put" path="/qms/{connection_id}/inspection/{id}" example="qms_inspection" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateQmsInspectionRequest;
import to.unified.unified_java_sdk.models.operations.UpdateQmsInspectionResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateQmsInspectionRequest req = UpdateQmsInspectionRequest.builder()
                .qmsInspection(QmsInspection.builder()
                    .characteristics(List.of(
                        QmsCharacteristic.builder()
                            .lowerLimit(152.9)
                            .measuredValue("152.94")
                            .name("Hole position")
                            .nominalValue(153d)
                            .result(Result.PASS)
                            .unitOfMeasure("mm")
                            .upperLimit(153.1)
                            .build(),
                        QmsCharacteristic.builder()
                            .lowerLimit(24.95)
                            .measuredValue("25.03")
                            .name("Flatness")
                            .nominalValue(25d)
                            .result(Result.PASS)
                            .unitOfMeasure("mm")
                            .upperLimit(25.05)
                            .build(),
                        QmsCharacteristic.builder()
                            .lowerLimit(53.99)
                            .measuredValue("53.99")
                            .name("Bore diameter")
                            .nominalValue(54d)
                            .result(Result.PASS)
                            .unitOfMeasure("mm")
                            .upperLimit(54.01)
                            .build()))
                    .createdAt(OffsetDateTime.parse("2020-04-18T21:23:54.000Z"))
                    .fileIds(List.of())
                    .id("893f655e-e036-4227-acd8-5cbe7f5e02c0")
                    .inspectedAt(OffsetDateTime.parse("2021-02-07T08:45:10.649Z"))
                    .issueIds(List.of())
                    .lifecycleState("Complete")
                    .metadata(List.of())
                    .name("Source inspection")
                    .number("INSP-96996")
                    .partNumber("PRT-048483")
                    .quantityAccepted(41d)
                    .quantityInspected(41d)
                    .quantityRejected(0d)
                    .result(QmsInspectionResult.PASS)
                    .revision("A")
                    .status(QmsInspectionStatus.CLOSED)
                    .supplierName("Gerlach LLC")
                    .type(QmsInspectionType.SOURCE)
                    .updatedAt(OffsetDateTime.parse("2026-05-08T14:03:14.400Z"))
                    .url("https://purple-newsprint.name/")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateQmsInspectionResponse res = sdk.inspection().updateQmsInspection()
                .request(req)
                .call();

        if (res.qmsInspection().isPresent()) {
            System.out.println(res.qmsInspection().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [UpdateQmsInspectionRequest](../../models/operations/UpdateQmsInspectionRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[UpdateQmsInspectionResponse](../../models/operations/UpdateQmsInspectionResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |