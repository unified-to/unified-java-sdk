# Payslip

## Overview

### Available Operations

* [getHrisPayslip2](#gethrispayslip2) - Retrieve a payslip
* [listHrisPayslips2](#listhrispayslips2) - List all payslips

## getHrisPayslip2

Retrieve a payslip

### Example Usage

<!-- UsageSnippet language="java" operationID="getHrisPayslip2" method="get" path="/hris/{connection_id}/payslip/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetHrisPayslip2Request;
import to.unified.unified_java_sdk.models.operations.GetHrisPayslip2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetHrisPayslip2Request req = GetHrisPayslip2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetHrisPayslip2Response res = sdk.payslip().getHrisPayslip2()
                .request(req)
                .call();

        if (res.hrisPayslip().isPresent()) {
            System.out.println(res.hrisPayslip().get());
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [GetHrisPayslip2Request](../../models/operations/GetHrisPayslip2Request.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[GetHrisPayslip2Response](../../models/operations/GetHrisPayslip2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listHrisPayslips2

List all payslips

### Example Usage

<!-- UsageSnippet language="java" operationID="listHrisPayslips2" method="get" path="/hris/{connection_id}/payslip" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListHrisPayslips2Request;
import to.unified.unified_java_sdk.models.operations.ListHrisPayslips2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListHrisPayslips2Request req = ListHrisPayslips2Request.builder()
                .connectionId("<id>")
                .build();

        ListHrisPayslips2Response res = sdk.payslip().listHrisPayslips2()
                .request(req)
                .call();

        if (res.hrisPayslips().isPresent()) {
            System.out.println(res.hrisPayslips().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [ListHrisPayslips2Request](../../models/operations/ListHrisPayslips2Request.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[ListHrisPayslips2Response](../../models/operations/ListHrisPayslips2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |