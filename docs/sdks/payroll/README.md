# Payroll

## Overview

### Available Operations

* [getHrisPayroll](#gethrispayroll) - Retrieve a payroll
* [listHrisPayrolls](#listhrispayrolls) - List all payrolls

## getHrisPayroll

Retrieve a payroll

### Example Usage

<!-- UsageSnippet language="java" operationID="getHrisPayroll" method="get" path="/hris/{connection_id}/payroll/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetHrisPayrollRequest;
import to.unified.unified_java_sdk.models.operations.GetHrisPayrollResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetHrisPayrollRequest req = GetHrisPayrollRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetHrisPayrollResponse res = sdk.payroll().getHrisPayroll()
                .request(req)
                .call();

        if (res.hrisPayroll().isPresent()) {
            System.out.println(res.hrisPayroll().get());
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [GetHrisPayrollRequest](../../models/operations/GetHrisPayrollRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[GetHrisPayrollResponse](../../models/operations/GetHrisPayrollResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listHrisPayrolls

List all payrolls

### Example Usage

<!-- UsageSnippet language="java" operationID="listHrisPayrolls" method="get" path="/hris/{connection_id}/payroll" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListHrisPayrollsRequest;
import to.unified.unified_java_sdk.models.operations.ListHrisPayrollsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListHrisPayrollsRequest req = ListHrisPayrollsRequest.builder()
                .connectionId("<id>")
                .build();

        ListHrisPayrollsResponse res = sdk.payroll().listHrisPayrolls()
                .request(req)
                .call();

        if (res.hrisPayrolls().isPresent()) {
            System.out.println(res.hrisPayrolls().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [ListHrisPayrollsRequest](../../models/operations/ListHrisPayrollsRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[ListHrisPayrollsResponse](../../models/operations/ListHrisPayrollsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |