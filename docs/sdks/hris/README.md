# Hris

## Overview

### Available Operations

* [createHrisBankaccount2](#createhrisbankaccount2) - Create a bankaccount
* [createHrisBenefit2](#createhrisbenefit2) - Create a benefit
* [createHrisCompany2](#createhriscompany2) - Create a company
* [createHrisDeduction2](#createhrisdeduction2) - Create a deduction
* [createHrisDevice2](#createhrisdevice2) - Create a device
* [createHrisEmployee2](#createhrisemployee2) - Create an employee
* [createHrisGroup2](#createhrisgroup2) - Create a group
* [createHrisLocation2](#createhrislocation2) - Create a location
* [createHrisTimeoff2](#createhristimeoff2) - Create a timeoff
* [createHrisTimeshift2](#createhristimeshift2) - Create a timeshift
* [getHrisBankaccount2](#gethrisbankaccount2) - Retrieve a bankaccount
* [getHrisBenefit2](#gethrisbenefit2) - Retrieve a benefit
* [getHrisCompany2](#gethriscompany2) - Retrieve a company
* [getHrisDeduction2](#gethrisdeduction2) - Retrieve a deduction
* [getHrisDevice2](#gethrisdevice2) - Retrieve a device
* [getHrisEmployee2](#gethrisemployee2) - Retrieve an employee
* [getHrisGroup2](#gethrisgroup2) - Retrieve a group
* [getHrisLocation2](#gethrislocation2) - Retrieve a location
* [getHrisPayslip2](#gethrispayslip2) - Retrieve a payslip
* [getHrisTimeoff2](#gethristimeoff2) - Retrieve a timeoff
* [getHrisTimeshift2](#gethristimeshift2) - Retrieve a timeshift
* [listHrisBankaccounts2](#listhrisbankaccounts2) - List all bankaccounts
* [listHrisBenefits2](#listhrisbenefits2) - List all benefits
* [listHrisCompanies2](#listhriscompanies2) - List all companies
* [listHrisDeductions2](#listhrisdeductions2) - List all deductions
* [listHrisDevices2](#listhrisdevices2) - List all devices
* [listHrisEmployees2](#listhrisemployees2) - List all employees
* [listHrisGroups2](#listhrisgroups2) - List all groups
* [listHrisLocations2](#listhrislocations2) - List all locations
* [listHrisPayslips2](#listhrispayslips2) - List all payslips
* [listHrisTimeoffs2](#listhristimeoffs2) - List all timeoffs
* [listHrisTimeshifts2](#listhristimeshifts2) - List all timeshifts
* [patchHrisBankaccount2](#patchhrisbankaccount2) - Update a bankaccount
* [patchHrisBenefit2](#patchhrisbenefit2) - Update a benefit
* [patchHrisCompany2](#patchhriscompany2) - Update a company
* [patchHrisDeduction2](#patchhrisdeduction2) - Update a deduction
* [patchHrisDevice2](#patchhrisdevice2) - Update a device
* [patchHrisEmployee2](#patchhrisemployee2) - Update an employee
* [patchHrisGroup2](#patchhrisgroup2) - Update a group
* [patchHrisLocation2](#patchhrislocation2) - Update a location
* [patchHrisTimeoff2](#patchhristimeoff2) - Update a timeoff
* [patchHrisTimeshift2](#patchhristimeshift2) - Update a timeshift
* [removeHrisBankaccount2](#removehrisbankaccount2) - Remove a bankaccount
* [removeHrisBenefit2](#removehrisbenefit2) - Remove a benefit
* [removeHrisCompany2](#removehriscompany2) - Remove a company
* [removeHrisDeduction2](#removehrisdeduction2) - Remove a deduction
* [removeHrisDevice2](#removehrisdevice2) - Remove a device
* [removeHrisEmployee2](#removehrisemployee2) - Remove an employee
* [removeHrisGroup2](#removehrisgroup2) - Remove a group
* [removeHrisLocation2](#removehrislocation2) - Remove a location
* [removeHrisTimeoff2](#removehristimeoff2) - Remove a timeoff
* [removeHrisTimeshift2](#removehristimeshift2) - Remove a timeshift
* [updateHrisBankaccount2](#updatehrisbankaccount2) - Update a bankaccount
* [updateHrisBenefit2](#updatehrisbenefit2) - Update a benefit
* [updateHrisCompany2](#updatehriscompany2) - Update a company
* [updateHrisDeduction2](#updatehrisdeduction2) - Update a deduction
* [updateHrisDevice2](#updatehrisdevice2) - Update a device
* [updateHrisEmployee2](#updatehrisemployee2) - Update an employee
* [updateHrisGroup2](#updatehrisgroup2) - Update a group
* [updateHrisLocation2](#updatehrislocation2) - Update a location
* [updateHrisTimeoff2](#updatehristimeoff2) - Update a timeoff
* [updateHrisTimeshift2](#updatehristimeshift2) - Update a timeshift

## createHrisBankaccount2

Create a bankaccount

### Example Usage

<!-- UsageSnippet language="java" operationID="createHrisBankaccount2" method="post" path="/hris/{connection_id}/bankaccount" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateHrisBankaccount2Request;
import to.unified.unified_java_sdk.models.operations.CreateHrisBankaccount2Response;
import to.unified.unified_java_sdk.models.shared.HrisBankaccount;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateHrisBankaccount2Request req = CreateHrisBankaccount2Request.builder()
                .hrisBankaccount(HrisBankaccount.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateHrisBankaccount2Response res = sdk.hris().createHrisBankaccount2()
                .request(req)
                .call();

        if (res.hrisBankaccount().isPresent()) {
            System.out.println(res.hrisBankaccount().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [CreateHrisBankaccount2Request](../../models/operations/CreateHrisBankaccount2Request.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[CreateHrisBankaccount2Response](../../models/operations/CreateHrisBankaccount2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createHrisBenefit2

Create a benefit

### Example Usage

<!-- UsageSnippet language="java" operationID="createHrisBenefit2" method="post" path="/hris/{connection_id}/benefit" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateHrisBenefit2Request;
import to.unified.unified_java_sdk.models.operations.CreateHrisBenefit2Response;
import to.unified.unified_java_sdk.models.shared.HrisBenefit;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateHrisBenefit2Request req = CreateHrisBenefit2Request.builder()
                .hrisBenefit(HrisBenefit.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateHrisBenefit2Response res = sdk.hris().createHrisBenefit2()
                .request(req)
                .call();

        if (res.hrisBenefit().isPresent()) {
            System.out.println(res.hrisBenefit().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [CreateHrisBenefit2Request](../../models/operations/CreateHrisBenefit2Request.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[CreateHrisBenefit2Response](../../models/operations/CreateHrisBenefit2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createHrisCompany2

Create a company

### Example Usage

<!-- UsageSnippet language="java" operationID="createHrisCompany2" method="post" path="/hris/{connection_id}/company" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateHrisCompany2Request;
import to.unified.unified_java_sdk.models.operations.CreateHrisCompany2Response;
import to.unified.unified_java_sdk.models.shared.HrisCompany;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateHrisCompany2Request req = CreateHrisCompany2Request.builder()
                .hrisCompany(HrisCompany.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateHrisCompany2Response res = sdk.hris().createHrisCompany2()
                .request(req)
                .call();

        if (res.hrisCompany().isPresent()) {
            System.out.println(res.hrisCompany().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [CreateHrisCompany2Request](../../models/operations/CreateHrisCompany2Request.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[CreateHrisCompany2Response](../../models/operations/CreateHrisCompany2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createHrisDeduction2

Create a deduction

### Example Usage

<!-- UsageSnippet language="java" operationID="createHrisDeduction2" method="post" path="/hris/{connection_id}/deduction" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateHrisDeduction2Request;
import to.unified.unified_java_sdk.models.operations.CreateHrisDeduction2Response;
import to.unified.unified_java_sdk.models.shared.HrisDeduction;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateHrisDeduction2Request req = CreateHrisDeduction2Request.builder()
                .hrisDeduction(HrisDeduction.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateHrisDeduction2Response res = sdk.hris().createHrisDeduction2()
                .request(req)
                .call();

        if (res.hrisDeduction().isPresent()) {
            System.out.println(res.hrisDeduction().get());
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [CreateHrisDeduction2Request](../../models/operations/CreateHrisDeduction2Request.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[CreateHrisDeduction2Response](../../models/operations/CreateHrisDeduction2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createHrisDevice2

Create a device

### Example Usage

<!-- UsageSnippet language="java" operationID="createHrisDevice2" method="post" path="/hris/{connection_id}/device" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateHrisDevice2Request;
import to.unified.unified_java_sdk.models.operations.CreateHrisDevice2Response;
import to.unified.unified_java_sdk.models.shared.HrisDevice;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateHrisDevice2Request req = CreateHrisDevice2Request.builder()
                .hrisDevice(HrisDevice.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateHrisDevice2Response res = sdk.hris().createHrisDevice2()
                .request(req)
                .call();

        if (res.hrisDevice().isPresent()) {
            System.out.println(res.hrisDevice().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [CreateHrisDevice2Request](../../models/operations/CreateHrisDevice2Request.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[CreateHrisDevice2Response](../../models/operations/CreateHrisDevice2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createHrisEmployee2

Create an employee

### Example Usage

<!-- UsageSnippet language="java" operationID="createHrisEmployee2" method="post" path="/hris/{connection_id}/employee" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateHrisEmployee2Request;
import to.unified.unified_java_sdk.models.operations.CreateHrisEmployee2Response;
import to.unified.unified_java_sdk.models.shared.HrisEmployee;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateHrisEmployee2Request req = CreateHrisEmployee2Request.builder()
                .hrisEmployee(HrisEmployee.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateHrisEmployee2Response res = sdk.hris().createHrisEmployee2()
                .request(req)
                .call();

        if (res.hrisEmployee().isPresent()) {
            System.out.println(res.hrisEmployee().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [CreateHrisEmployee2Request](../../models/operations/CreateHrisEmployee2Request.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[CreateHrisEmployee2Response](../../models/operations/CreateHrisEmployee2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createHrisGroup2

Create a group

### Example Usage

<!-- UsageSnippet language="java" operationID="createHrisGroup2" method="post" path="/hris/{connection_id}/group" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateHrisGroup2Request;
import to.unified.unified_java_sdk.models.operations.CreateHrisGroup2Response;
import to.unified.unified_java_sdk.models.shared.HrisGroup;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateHrisGroup2Request req = CreateHrisGroup2Request.builder()
                .hrisGroup(HrisGroup.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateHrisGroup2Response res = sdk.hris().createHrisGroup2()
                .request(req)
                .call();

        if (res.hrisGroup().isPresent()) {
            System.out.println(res.hrisGroup().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [CreateHrisGroup2Request](../../models/operations/CreateHrisGroup2Request.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[CreateHrisGroup2Response](../../models/operations/CreateHrisGroup2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createHrisLocation2

Create a location

### Example Usage

<!-- UsageSnippet language="java" operationID="createHrisLocation2" method="post" path="/hris/{connection_id}/location" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateHrisLocation2Request;
import to.unified.unified_java_sdk.models.operations.CreateHrisLocation2Response;
import to.unified.unified_java_sdk.models.shared.HrisLocation;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateHrisLocation2Request req = CreateHrisLocation2Request.builder()
                .hrisLocation(HrisLocation.builder()
                    .build())
                .connectionId("<id>")
                .build();

        CreateHrisLocation2Response res = sdk.hris().createHrisLocation2()
                .request(req)
                .call();

        if (res.hrisLocation().isPresent()) {
            System.out.println(res.hrisLocation().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [CreateHrisLocation2Request](../../models/operations/CreateHrisLocation2Request.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[CreateHrisLocation2Response](../../models/operations/CreateHrisLocation2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createHrisTimeoff2

Create a timeoff

### Example Usage

<!-- UsageSnippet language="java" operationID="createHrisTimeoff2" method="post" path="/hris/{connection_id}/timeoff" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateHrisTimeoff2Request;
import to.unified.unified_java_sdk.models.operations.CreateHrisTimeoff2Response;
import to.unified.unified_java_sdk.models.shared.HrisTimeoff;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateHrisTimeoff2Request req = CreateHrisTimeoff2Request.builder()
                .hrisTimeoff(HrisTimeoff.builder()
                    .userId("<id>")
                    .build())
                .connectionId("<id>")
                .build();

        CreateHrisTimeoff2Response res = sdk.hris().createHrisTimeoff2()
                .request(req)
                .call();

        if (res.hrisTimeoff().isPresent()) {
            System.out.println(res.hrisTimeoff().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [CreateHrisTimeoff2Request](../../models/operations/CreateHrisTimeoff2Request.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[CreateHrisTimeoff2Response](../../models/operations/CreateHrisTimeoff2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createHrisTimeshift2

Create a timeshift

### Example Usage

<!-- UsageSnippet language="java" operationID="createHrisTimeshift2" method="post" path="/hris/{connection_id}/timeshift" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateHrisTimeshift2Request;
import to.unified.unified_java_sdk.models.operations.CreateHrisTimeshift2Response;
import to.unified.unified_java_sdk.models.shared.HrisTimeshift;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateHrisTimeshift2Request req = CreateHrisTimeshift2Request.builder()
                .hrisTimeshift(HrisTimeshift.builder()
                    .employeeUserId("<id>")
                    .build())
                .connectionId("<id>")
                .build();

        CreateHrisTimeshift2Response res = sdk.hris().createHrisTimeshift2()
                .request(req)
                .call();

        if (res.hrisTimeshift().isPresent()) {
            System.out.println(res.hrisTimeshift().get());
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [CreateHrisTimeshift2Request](../../models/operations/CreateHrisTimeshift2Request.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[CreateHrisTimeshift2Response](../../models/operations/CreateHrisTimeshift2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getHrisBankaccount2

Retrieve a bankaccount

### Example Usage

<!-- UsageSnippet language="java" operationID="getHrisBankaccount2" method="get" path="/hris/{connection_id}/bankaccount/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetHrisBankaccount2Request;
import to.unified.unified_java_sdk.models.operations.GetHrisBankaccount2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetHrisBankaccount2Request req = GetHrisBankaccount2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetHrisBankaccount2Response res = sdk.hris().getHrisBankaccount2()
                .request(req)
                .call();

        if (res.hrisBankaccount().isPresent()) {
            System.out.println(res.hrisBankaccount().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [GetHrisBankaccount2Request](../../models/operations/GetHrisBankaccount2Request.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[GetHrisBankaccount2Response](../../models/operations/GetHrisBankaccount2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getHrisBenefit2

Retrieve a benefit

### Example Usage

<!-- UsageSnippet language="java" operationID="getHrisBenefit2" method="get" path="/hris/{connection_id}/benefit/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetHrisBenefit2Request;
import to.unified.unified_java_sdk.models.operations.GetHrisBenefit2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetHrisBenefit2Request req = GetHrisBenefit2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetHrisBenefit2Response res = sdk.hris().getHrisBenefit2()
                .request(req)
                .call();

        if (res.hrisBenefit().isPresent()) {
            System.out.println(res.hrisBenefit().get());
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [GetHrisBenefit2Request](../../models/operations/GetHrisBenefit2Request.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[GetHrisBenefit2Response](../../models/operations/GetHrisBenefit2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getHrisCompany2

Retrieve a company

### Example Usage

<!-- UsageSnippet language="java" operationID="getHrisCompany2" method="get" path="/hris/{connection_id}/company/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetHrisCompany2Request;
import to.unified.unified_java_sdk.models.operations.GetHrisCompany2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetHrisCompany2Request req = GetHrisCompany2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetHrisCompany2Response res = sdk.hris().getHrisCompany2()
                .request(req)
                .call();

        if (res.hrisCompany().isPresent()) {
            System.out.println(res.hrisCompany().get());
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [GetHrisCompany2Request](../../models/operations/GetHrisCompany2Request.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[GetHrisCompany2Response](../../models/operations/GetHrisCompany2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getHrisDeduction2

Retrieve a deduction

### Example Usage

<!-- UsageSnippet language="java" operationID="getHrisDeduction2" method="get" path="/hris/{connection_id}/deduction/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetHrisDeduction2Request;
import to.unified.unified_java_sdk.models.operations.GetHrisDeduction2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetHrisDeduction2Request req = GetHrisDeduction2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetHrisDeduction2Response res = sdk.hris().getHrisDeduction2()
                .request(req)
                .call();

        if (res.hrisDeduction().isPresent()) {
            System.out.println(res.hrisDeduction().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [GetHrisDeduction2Request](../../models/operations/GetHrisDeduction2Request.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[GetHrisDeduction2Response](../../models/operations/GetHrisDeduction2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getHrisDevice2

Retrieve a device

### Example Usage

<!-- UsageSnippet language="java" operationID="getHrisDevice2" method="get" path="/hris/{connection_id}/device/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetHrisDevice2Request;
import to.unified.unified_java_sdk.models.operations.GetHrisDevice2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetHrisDevice2Request req = GetHrisDevice2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetHrisDevice2Response res = sdk.hris().getHrisDevice2()
                .request(req)
                .call();

        if (res.hrisDevice().isPresent()) {
            System.out.println(res.hrisDevice().get());
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [GetHrisDevice2Request](../../models/operations/GetHrisDevice2Request.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[GetHrisDevice2Response](../../models/operations/GetHrisDevice2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getHrisEmployee2

Retrieve an employee

### Example Usage

<!-- UsageSnippet language="java" operationID="getHrisEmployee2" method="get" path="/hris/{connection_id}/employee/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetHrisEmployee2Request;
import to.unified.unified_java_sdk.models.operations.GetHrisEmployee2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetHrisEmployee2Request req = GetHrisEmployee2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetHrisEmployee2Response res = sdk.hris().getHrisEmployee2()
                .request(req)
                .call();

        if (res.hrisEmployee().isPresent()) {
            System.out.println(res.hrisEmployee().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [GetHrisEmployee2Request](../../models/operations/GetHrisEmployee2Request.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[GetHrisEmployee2Response](../../models/operations/GetHrisEmployee2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getHrisGroup2

Retrieve a group

### Example Usage

<!-- UsageSnippet language="java" operationID="getHrisGroup2" method="get" path="/hris/{connection_id}/group/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetHrisGroup2Request;
import to.unified.unified_java_sdk.models.operations.GetHrisGroup2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetHrisGroup2Request req = GetHrisGroup2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetHrisGroup2Response res = sdk.hris().getHrisGroup2()
                .request(req)
                .call();

        if (res.hrisGroup().isPresent()) {
            System.out.println(res.hrisGroup().get());
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [GetHrisGroup2Request](../../models/operations/GetHrisGroup2Request.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[GetHrisGroup2Response](../../models/operations/GetHrisGroup2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getHrisLocation2

Retrieve a location

### Example Usage

<!-- UsageSnippet language="java" operationID="getHrisLocation2" method="get" path="/hris/{connection_id}/location/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetHrisLocation2Request;
import to.unified.unified_java_sdk.models.operations.GetHrisLocation2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetHrisLocation2Request req = GetHrisLocation2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetHrisLocation2Response res = sdk.hris().getHrisLocation2()
                .request(req)
                .call();

        if (res.hrisLocation().isPresent()) {
            System.out.println(res.hrisLocation().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [GetHrisLocation2Request](../../models/operations/GetHrisLocation2Request.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[GetHrisLocation2Response](../../models/operations/GetHrisLocation2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

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

        GetHrisPayslip2Response res = sdk.hris().getHrisPayslip2()
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

## getHrisTimeoff2

Retrieve a timeoff

### Example Usage

<!-- UsageSnippet language="java" operationID="getHrisTimeoff2" method="get" path="/hris/{connection_id}/timeoff/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetHrisTimeoff2Request;
import to.unified.unified_java_sdk.models.operations.GetHrisTimeoff2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetHrisTimeoff2Request req = GetHrisTimeoff2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetHrisTimeoff2Response res = sdk.hris().getHrisTimeoff2()
                .request(req)
                .call();

        if (res.hrisTimeoff().isPresent()) {
            System.out.println(res.hrisTimeoff().get());
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [GetHrisTimeoff2Request](../../models/operations/GetHrisTimeoff2Request.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[GetHrisTimeoff2Response](../../models/operations/GetHrisTimeoff2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getHrisTimeshift2

Retrieve a timeshift

### Example Usage

<!-- UsageSnippet language="java" operationID="getHrisTimeshift2" method="get" path="/hris/{connection_id}/timeshift/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetHrisTimeshift2Request;
import to.unified.unified_java_sdk.models.operations.GetHrisTimeshift2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetHrisTimeshift2Request req = GetHrisTimeshift2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetHrisTimeshift2Response res = sdk.hris().getHrisTimeshift2()
                .request(req)
                .call();

        if (res.hrisTimeshift().isPresent()) {
            System.out.println(res.hrisTimeshift().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [GetHrisTimeshift2Request](../../models/operations/GetHrisTimeshift2Request.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[GetHrisTimeshift2Response](../../models/operations/GetHrisTimeshift2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listHrisBankaccounts2

List all bankaccounts

### Example Usage

<!-- UsageSnippet language="java" operationID="listHrisBankaccounts2" method="get" path="/hris/{connection_id}/bankaccount" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListHrisBankaccounts2Request;
import to.unified.unified_java_sdk.models.operations.ListHrisBankaccounts2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListHrisBankaccounts2Request req = ListHrisBankaccounts2Request.builder()
                .connectionId("<id>")
                .build();

        ListHrisBankaccounts2Response res = sdk.hris().listHrisBankaccounts2()
                .request(req)
                .call();

        if (res.hrisBankaccounts().isPresent()) {
            System.out.println(res.hrisBankaccounts().get());
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [ListHrisBankaccounts2Request](../../models/operations/ListHrisBankaccounts2Request.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[ListHrisBankaccounts2Response](../../models/operations/ListHrisBankaccounts2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listHrisBenefits2

List all benefits

### Example Usage

<!-- UsageSnippet language="java" operationID="listHrisBenefits2" method="get" path="/hris/{connection_id}/benefit" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListHrisBenefits2Request;
import to.unified.unified_java_sdk.models.operations.ListHrisBenefits2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListHrisBenefits2Request req = ListHrisBenefits2Request.builder()
                .connectionId("<id>")
                .build();

        ListHrisBenefits2Response res = sdk.hris().listHrisBenefits2()
                .request(req)
                .call();

        if (res.hrisBenefits().isPresent()) {
            System.out.println(res.hrisBenefits().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [ListHrisBenefits2Request](../../models/operations/ListHrisBenefits2Request.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[ListHrisBenefits2Response](../../models/operations/ListHrisBenefits2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listHrisCompanies2

List all companies

### Example Usage

<!-- UsageSnippet language="java" operationID="listHrisCompanies2" method="get" path="/hris/{connection_id}/company" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListHrisCompanies2Request;
import to.unified.unified_java_sdk.models.operations.ListHrisCompanies2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListHrisCompanies2Request req = ListHrisCompanies2Request.builder()
                .connectionId("<id>")
                .build();

        ListHrisCompanies2Response res = sdk.hris().listHrisCompanies2()
                .request(req)
                .call();

        if (res.hrisCompanies().isPresent()) {
            System.out.println(res.hrisCompanies().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [ListHrisCompanies2Request](../../models/operations/ListHrisCompanies2Request.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[ListHrisCompanies2Response](../../models/operations/ListHrisCompanies2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listHrisDeductions2

List all deductions

### Example Usage

<!-- UsageSnippet language="java" operationID="listHrisDeductions2" method="get" path="/hris/{connection_id}/deduction" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListHrisDeductions2Request;
import to.unified.unified_java_sdk.models.operations.ListHrisDeductions2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListHrisDeductions2Request req = ListHrisDeductions2Request.builder()
                .connectionId("<id>")
                .build();

        ListHrisDeductions2Response res = sdk.hris().listHrisDeductions2()
                .request(req)
                .call();

        if (res.hrisDeductions().isPresent()) {
            System.out.println(res.hrisDeductions().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [ListHrisDeductions2Request](../../models/operations/ListHrisDeductions2Request.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[ListHrisDeductions2Response](../../models/operations/ListHrisDeductions2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listHrisDevices2

List all devices

### Example Usage

<!-- UsageSnippet language="java" operationID="listHrisDevices2" method="get" path="/hris/{connection_id}/device" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListHrisDevices2Request;
import to.unified.unified_java_sdk.models.operations.ListHrisDevices2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListHrisDevices2Request req = ListHrisDevices2Request.builder()
                .connectionId("<id>")
                .build();

        ListHrisDevices2Response res = sdk.hris().listHrisDevices2()
                .request(req)
                .call();

        if (res.hrisDevices().isPresent()) {
            System.out.println(res.hrisDevices().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [ListHrisDevices2Request](../../models/operations/ListHrisDevices2Request.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[ListHrisDevices2Response](../../models/operations/ListHrisDevices2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listHrisEmployees2

List all employees

### Example Usage

<!-- UsageSnippet language="java" operationID="listHrisEmployees2" method="get" path="/hris/{connection_id}/employee" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListHrisEmployees2Request;
import to.unified.unified_java_sdk.models.operations.ListHrisEmployees2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListHrisEmployees2Request req = ListHrisEmployees2Request.builder()
                .connectionId("<id>")
                .build();

        ListHrisEmployees2Response res = sdk.hris().listHrisEmployees2()
                .request(req)
                .call();

        if (res.hrisEmployees().isPresent()) {
            System.out.println(res.hrisEmployees().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [ListHrisEmployees2Request](../../models/operations/ListHrisEmployees2Request.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[ListHrisEmployees2Response](../../models/operations/ListHrisEmployees2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listHrisGroups2

List all groups

### Example Usage

<!-- UsageSnippet language="java" operationID="listHrisGroups2" method="get" path="/hris/{connection_id}/group" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListHrisGroups2Request;
import to.unified.unified_java_sdk.models.operations.ListHrisGroups2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListHrisGroups2Request req = ListHrisGroups2Request.builder()
                .connectionId("<id>")
                .build();

        ListHrisGroups2Response res = sdk.hris().listHrisGroups2()
                .request(req)
                .call();

        if (res.hrisGroups().isPresent()) {
            System.out.println(res.hrisGroups().get());
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [ListHrisGroups2Request](../../models/operations/ListHrisGroups2Request.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[ListHrisGroups2Response](../../models/operations/ListHrisGroups2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listHrisLocations2

List all locations

### Example Usage

<!-- UsageSnippet language="java" operationID="listHrisLocations2" method="get" path="/hris/{connection_id}/location" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListHrisLocations2Request;
import to.unified.unified_java_sdk.models.operations.ListHrisLocations2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListHrisLocations2Request req = ListHrisLocations2Request.builder()
                .connectionId("<id>")
                .build();

        ListHrisLocations2Response res = sdk.hris().listHrisLocations2()
                .request(req)
                .call();

        if (res.hrisLocations().isPresent()) {
            System.out.println(res.hrisLocations().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [ListHrisLocations2Request](../../models/operations/ListHrisLocations2Request.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[ListHrisLocations2Response](../../models/operations/ListHrisLocations2Response.md)**

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

        ListHrisPayslips2Response res = sdk.hris().listHrisPayslips2()
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

## listHrisTimeoffs2

List all timeoffs

### Example Usage

<!-- UsageSnippet language="java" operationID="listHrisTimeoffs2" method="get" path="/hris/{connection_id}/timeoff" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListHrisTimeoffs2Request;
import to.unified.unified_java_sdk.models.operations.ListHrisTimeoffs2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListHrisTimeoffs2Request req = ListHrisTimeoffs2Request.builder()
                .connectionId("<id>")
                .build();

        ListHrisTimeoffs2Response res = sdk.hris().listHrisTimeoffs2()
                .request(req)
                .call();

        if (res.hrisTimeoffs().isPresent()) {
            System.out.println(res.hrisTimeoffs().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [ListHrisTimeoffs2Request](../../models/operations/ListHrisTimeoffs2Request.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[ListHrisTimeoffs2Response](../../models/operations/ListHrisTimeoffs2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listHrisTimeshifts2

List all timeshifts

### Example Usage

<!-- UsageSnippet language="java" operationID="listHrisTimeshifts2" method="get" path="/hris/{connection_id}/timeshift" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListHrisTimeshifts2Request;
import to.unified.unified_java_sdk.models.operations.ListHrisTimeshifts2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListHrisTimeshifts2Request req = ListHrisTimeshifts2Request.builder()
                .connectionId("<id>")
                .build();

        ListHrisTimeshifts2Response res = sdk.hris().listHrisTimeshifts2()
                .request(req)
                .call();

        if (res.hrisTimeshifts().isPresent()) {
            System.out.println(res.hrisTimeshifts().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [ListHrisTimeshifts2Request](../../models/operations/ListHrisTimeshifts2Request.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[ListHrisTimeshifts2Response](../../models/operations/ListHrisTimeshifts2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchHrisBankaccount2

Update a bankaccount

### Example Usage

<!-- UsageSnippet language="java" operationID="patchHrisBankaccount2" method="patch" path="/hris/{connection_id}/bankaccount/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchHrisBankaccount2Request;
import to.unified.unified_java_sdk.models.operations.PatchHrisBankaccount2Response;
import to.unified.unified_java_sdk.models.shared.HrisBankaccount;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchHrisBankaccount2Request req = PatchHrisBankaccount2Request.builder()
                .hrisBankaccount(HrisBankaccount.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchHrisBankaccount2Response res = sdk.hris().patchHrisBankaccount2()
                .request(req)
                .call();

        if (res.hrisBankaccount().isPresent()) {
            System.out.println(res.hrisBankaccount().get());
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [PatchHrisBankaccount2Request](../../models/operations/PatchHrisBankaccount2Request.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[PatchHrisBankaccount2Response](../../models/operations/PatchHrisBankaccount2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchHrisBenefit2

Update a benefit

### Example Usage

<!-- UsageSnippet language="java" operationID="patchHrisBenefit2" method="patch" path="/hris/{connection_id}/benefit/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchHrisBenefit2Request;
import to.unified.unified_java_sdk.models.operations.PatchHrisBenefit2Response;
import to.unified.unified_java_sdk.models.shared.HrisBenefit;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchHrisBenefit2Request req = PatchHrisBenefit2Request.builder()
                .hrisBenefit(HrisBenefit.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchHrisBenefit2Response res = sdk.hris().patchHrisBenefit2()
                .request(req)
                .call();

        if (res.hrisBenefit().isPresent()) {
            System.out.println(res.hrisBenefit().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [PatchHrisBenefit2Request](../../models/operations/PatchHrisBenefit2Request.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[PatchHrisBenefit2Response](../../models/operations/PatchHrisBenefit2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchHrisCompany2

Update a company

### Example Usage

<!-- UsageSnippet language="java" operationID="patchHrisCompany2" method="patch" path="/hris/{connection_id}/company/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchHrisCompany2Request;
import to.unified.unified_java_sdk.models.operations.PatchHrisCompany2Response;
import to.unified.unified_java_sdk.models.shared.HrisCompany;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchHrisCompany2Request req = PatchHrisCompany2Request.builder()
                .hrisCompany(HrisCompany.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchHrisCompany2Response res = sdk.hris().patchHrisCompany2()
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
| `request`                                                                       | [PatchHrisCompany2Request](../../models/operations/PatchHrisCompany2Request.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[PatchHrisCompany2Response](../../models/operations/PatchHrisCompany2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchHrisDeduction2

Update a deduction

### Example Usage

<!-- UsageSnippet language="java" operationID="patchHrisDeduction2" method="patch" path="/hris/{connection_id}/deduction/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchHrisDeduction2Request;
import to.unified.unified_java_sdk.models.operations.PatchHrisDeduction2Response;
import to.unified.unified_java_sdk.models.shared.HrisDeduction;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchHrisDeduction2Request req = PatchHrisDeduction2Request.builder()
                .hrisDeduction(HrisDeduction.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchHrisDeduction2Response res = sdk.hris().patchHrisDeduction2()
                .request(req)
                .call();

        if (res.hrisDeduction().isPresent()) {
            System.out.println(res.hrisDeduction().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [PatchHrisDeduction2Request](../../models/operations/PatchHrisDeduction2Request.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[PatchHrisDeduction2Response](../../models/operations/PatchHrisDeduction2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchHrisDevice2

Update a device

### Example Usage

<!-- UsageSnippet language="java" operationID="patchHrisDevice2" method="patch" path="/hris/{connection_id}/device/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchHrisDevice2Request;
import to.unified.unified_java_sdk.models.operations.PatchHrisDevice2Response;
import to.unified.unified_java_sdk.models.shared.HrisDevice;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchHrisDevice2Request req = PatchHrisDevice2Request.builder()
                .hrisDevice(HrisDevice.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchHrisDevice2Response res = sdk.hris().patchHrisDevice2()
                .request(req)
                .call();

        if (res.hrisDevice().isPresent()) {
            System.out.println(res.hrisDevice().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [PatchHrisDevice2Request](../../models/operations/PatchHrisDevice2Request.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[PatchHrisDevice2Response](../../models/operations/PatchHrisDevice2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchHrisEmployee2

Update an employee

### Example Usage

<!-- UsageSnippet language="java" operationID="patchHrisEmployee2" method="patch" path="/hris/{connection_id}/employee/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchHrisEmployee2Request;
import to.unified.unified_java_sdk.models.operations.PatchHrisEmployee2Response;
import to.unified.unified_java_sdk.models.shared.HrisEmployee;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchHrisEmployee2Request req = PatchHrisEmployee2Request.builder()
                .hrisEmployee(HrisEmployee.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchHrisEmployee2Response res = sdk.hris().patchHrisEmployee2()
                .request(req)
                .call();

        if (res.hrisEmployee().isPresent()) {
            System.out.println(res.hrisEmployee().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [PatchHrisEmployee2Request](../../models/operations/PatchHrisEmployee2Request.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[PatchHrisEmployee2Response](../../models/operations/PatchHrisEmployee2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchHrisGroup2

Update a group

### Example Usage

<!-- UsageSnippet language="java" operationID="patchHrisGroup2" method="patch" path="/hris/{connection_id}/group/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchHrisGroup2Request;
import to.unified.unified_java_sdk.models.operations.PatchHrisGroup2Response;
import to.unified.unified_java_sdk.models.shared.HrisGroup;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchHrisGroup2Request req = PatchHrisGroup2Request.builder()
                .hrisGroup(HrisGroup.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchHrisGroup2Response res = sdk.hris().patchHrisGroup2()
                .request(req)
                .call();

        if (res.hrisGroup().isPresent()) {
            System.out.println(res.hrisGroup().get());
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [PatchHrisGroup2Request](../../models/operations/PatchHrisGroup2Request.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[PatchHrisGroup2Response](../../models/operations/PatchHrisGroup2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchHrisLocation2

Update a location

### Example Usage

<!-- UsageSnippet language="java" operationID="patchHrisLocation2" method="patch" path="/hris/{connection_id}/location/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchHrisLocation2Request;
import to.unified.unified_java_sdk.models.operations.PatchHrisLocation2Response;
import to.unified.unified_java_sdk.models.shared.HrisLocation;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchHrisLocation2Request req = PatchHrisLocation2Request.builder()
                .hrisLocation(HrisLocation.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchHrisLocation2Response res = sdk.hris().patchHrisLocation2()
                .request(req)
                .call();

        if (res.hrisLocation().isPresent()) {
            System.out.println(res.hrisLocation().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [PatchHrisLocation2Request](../../models/operations/PatchHrisLocation2Request.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[PatchHrisLocation2Response](../../models/operations/PatchHrisLocation2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchHrisTimeoff2

Update a timeoff

### Example Usage

<!-- UsageSnippet language="java" operationID="patchHrisTimeoff2" method="patch" path="/hris/{connection_id}/timeoff/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchHrisTimeoff2Request;
import to.unified.unified_java_sdk.models.operations.PatchHrisTimeoff2Response;
import to.unified.unified_java_sdk.models.shared.HrisTimeoff;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchHrisTimeoff2Request req = PatchHrisTimeoff2Request.builder()
                .hrisTimeoff(HrisTimeoff.builder()
                    .userId("<id>")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchHrisTimeoff2Response res = sdk.hris().patchHrisTimeoff2()
                .request(req)
                .call();

        if (res.hrisTimeoff().isPresent()) {
            System.out.println(res.hrisTimeoff().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [PatchHrisTimeoff2Request](../../models/operations/PatchHrisTimeoff2Request.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[PatchHrisTimeoff2Response](../../models/operations/PatchHrisTimeoff2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchHrisTimeshift2

Update a timeshift

### Example Usage

<!-- UsageSnippet language="java" operationID="patchHrisTimeshift2" method="patch" path="/hris/{connection_id}/timeshift/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchHrisTimeshift2Request;
import to.unified.unified_java_sdk.models.operations.PatchHrisTimeshift2Response;
import to.unified.unified_java_sdk.models.shared.HrisTimeshift;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchHrisTimeshift2Request req = PatchHrisTimeshift2Request.builder()
                .hrisTimeshift(HrisTimeshift.builder()
                    .employeeUserId("<id>")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchHrisTimeshift2Response res = sdk.hris().patchHrisTimeshift2()
                .request(req)
                .call();

        if (res.hrisTimeshift().isPresent()) {
            System.out.println(res.hrisTimeshift().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [PatchHrisTimeshift2Request](../../models/operations/PatchHrisTimeshift2Request.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[PatchHrisTimeshift2Response](../../models/operations/PatchHrisTimeshift2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeHrisBankaccount2

Remove a bankaccount

### Example Usage

<!-- UsageSnippet language="java" operationID="removeHrisBankaccount2" method="delete" path="/hris/{connection_id}/bankaccount/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveHrisBankaccount2Request;
import to.unified.unified_java_sdk.models.operations.RemoveHrisBankaccount2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveHrisBankaccount2Request req = RemoveHrisBankaccount2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveHrisBankaccount2Response res = sdk.hris().removeHrisBankaccount2()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [RemoveHrisBankaccount2Request](../../models/operations/RemoveHrisBankaccount2Request.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[RemoveHrisBankaccount2Response](../../models/operations/RemoveHrisBankaccount2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeHrisBenefit2

Remove a benefit

### Example Usage

<!-- UsageSnippet language="java" operationID="removeHrisBenefit2" method="delete" path="/hris/{connection_id}/benefit/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveHrisBenefit2Request;
import to.unified.unified_java_sdk.models.operations.RemoveHrisBenefit2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveHrisBenefit2Request req = RemoveHrisBenefit2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveHrisBenefit2Response res = sdk.hris().removeHrisBenefit2()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [RemoveHrisBenefit2Request](../../models/operations/RemoveHrisBenefit2Request.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[RemoveHrisBenefit2Response](../../models/operations/RemoveHrisBenefit2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeHrisCompany2

Remove a company

### Example Usage

<!-- UsageSnippet language="java" operationID="removeHrisCompany2" method="delete" path="/hris/{connection_id}/company/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveHrisCompany2Request;
import to.unified.unified_java_sdk.models.operations.RemoveHrisCompany2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveHrisCompany2Request req = RemoveHrisCompany2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveHrisCompany2Response res = sdk.hris().removeHrisCompany2()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [RemoveHrisCompany2Request](../../models/operations/RemoveHrisCompany2Request.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[RemoveHrisCompany2Response](../../models/operations/RemoveHrisCompany2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeHrisDeduction2

Remove a deduction

### Example Usage

<!-- UsageSnippet language="java" operationID="removeHrisDeduction2" method="delete" path="/hris/{connection_id}/deduction/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveHrisDeduction2Request;
import to.unified.unified_java_sdk.models.operations.RemoveHrisDeduction2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveHrisDeduction2Request req = RemoveHrisDeduction2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveHrisDeduction2Response res = sdk.hris().removeHrisDeduction2()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [RemoveHrisDeduction2Request](../../models/operations/RemoveHrisDeduction2Request.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[RemoveHrisDeduction2Response](../../models/operations/RemoveHrisDeduction2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeHrisDevice2

Remove a device

### Example Usage

<!-- UsageSnippet language="java" operationID="removeHrisDevice2" method="delete" path="/hris/{connection_id}/device/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveHrisDevice2Request;
import to.unified.unified_java_sdk.models.operations.RemoveHrisDevice2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveHrisDevice2Request req = RemoveHrisDevice2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveHrisDevice2Response res = sdk.hris().removeHrisDevice2()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [RemoveHrisDevice2Request](../../models/operations/RemoveHrisDevice2Request.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[RemoveHrisDevice2Response](../../models/operations/RemoveHrisDevice2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeHrisEmployee2

Remove an employee

### Example Usage

<!-- UsageSnippet language="java" operationID="removeHrisEmployee2" method="delete" path="/hris/{connection_id}/employee/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveHrisEmployee2Request;
import to.unified.unified_java_sdk.models.operations.RemoveHrisEmployee2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveHrisEmployee2Request req = RemoveHrisEmployee2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveHrisEmployee2Response res = sdk.hris().removeHrisEmployee2()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [RemoveHrisEmployee2Request](../../models/operations/RemoveHrisEmployee2Request.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[RemoveHrisEmployee2Response](../../models/operations/RemoveHrisEmployee2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeHrisGroup2

Remove a group

### Example Usage

<!-- UsageSnippet language="java" operationID="removeHrisGroup2" method="delete" path="/hris/{connection_id}/group/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveHrisGroup2Request;
import to.unified.unified_java_sdk.models.operations.RemoveHrisGroup2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveHrisGroup2Request req = RemoveHrisGroup2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveHrisGroup2Response res = sdk.hris().removeHrisGroup2()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [RemoveHrisGroup2Request](../../models/operations/RemoveHrisGroup2Request.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[RemoveHrisGroup2Response](../../models/operations/RemoveHrisGroup2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeHrisLocation2

Remove a location

### Example Usage

<!-- UsageSnippet language="java" operationID="removeHrisLocation2" method="delete" path="/hris/{connection_id}/location/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveHrisLocation2Request;
import to.unified.unified_java_sdk.models.operations.RemoveHrisLocation2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveHrisLocation2Request req = RemoveHrisLocation2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveHrisLocation2Response res = sdk.hris().removeHrisLocation2()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [RemoveHrisLocation2Request](../../models/operations/RemoveHrisLocation2Request.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[RemoveHrisLocation2Response](../../models/operations/RemoveHrisLocation2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeHrisTimeoff2

Remove a timeoff

### Example Usage

<!-- UsageSnippet language="java" operationID="removeHrisTimeoff2" method="delete" path="/hris/{connection_id}/timeoff/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveHrisTimeoff2Request;
import to.unified.unified_java_sdk.models.operations.RemoveHrisTimeoff2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveHrisTimeoff2Request req = RemoveHrisTimeoff2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveHrisTimeoff2Response res = sdk.hris().removeHrisTimeoff2()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [RemoveHrisTimeoff2Request](../../models/operations/RemoveHrisTimeoff2Request.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[RemoveHrisTimeoff2Response](../../models/operations/RemoveHrisTimeoff2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeHrisTimeshift2

Remove a timeshift

### Example Usage

<!-- UsageSnippet language="java" operationID="removeHrisTimeshift2" method="delete" path="/hris/{connection_id}/timeshift/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveHrisTimeshift2Request;
import to.unified.unified_java_sdk.models.operations.RemoveHrisTimeshift2Response;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveHrisTimeshift2Request req = RemoveHrisTimeshift2Request.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveHrisTimeshift2Response res = sdk.hris().removeHrisTimeshift2()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [RemoveHrisTimeshift2Request](../../models/operations/RemoveHrisTimeshift2Request.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[RemoveHrisTimeshift2Response](../../models/operations/RemoveHrisTimeshift2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateHrisBankaccount2

Update a bankaccount

### Example Usage

<!-- UsageSnippet language="java" operationID="updateHrisBankaccount2" method="put" path="/hris/{connection_id}/bankaccount/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateHrisBankaccount2Request;
import to.unified.unified_java_sdk.models.operations.UpdateHrisBankaccount2Response;
import to.unified.unified_java_sdk.models.shared.HrisBankaccount;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateHrisBankaccount2Request req = UpdateHrisBankaccount2Request.builder()
                .hrisBankaccount(HrisBankaccount.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateHrisBankaccount2Response res = sdk.hris().updateHrisBankaccount2()
                .request(req)
                .call();

        if (res.hrisBankaccount().isPresent()) {
            System.out.println(res.hrisBankaccount().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [UpdateHrisBankaccount2Request](../../models/operations/UpdateHrisBankaccount2Request.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[UpdateHrisBankaccount2Response](../../models/operations/UpdateHrisBankaccount2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateHrisBenefit2

Update a benefit

### Example Usage

<!-- UsageSnippet language="java" operationID="updateHrisBenefit2" method="put" path="/hris/{connection_id}/benefit/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateHrisBenefit2Request;
import to.unified.unified_java_sdk.models.operations.UpdateHrisBenefit2Response;
import to.unified.unified_java_sdk.models.shared.HrisBenefit;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateHrisBenefit2Request req = UpdateHrisBenefit2Request.builder()
                .hrisBenefit(HrisBenefit.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateHrisBenefit2Response res = sdk.hris().updateHrisBenefit2()
                .request(req)
                .call();

        if (res.hrisBenefit().isPresent()) {
            System.out.println(res.hrisBenefit().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [UpdateHrisBenefit2Request](../../models/operations/UpdateHrisBenefit2Request.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[UpdateHrisBenefit2Response](../../models/operations/UpdateHrisBenefit2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateHrisCompany2

Update a company

### Example Usage

<!-- UsageSnippet language="java" operationID="updateHrisCompany2" method="put" path="/hris/{connection_id}/company/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateHrisCompany2Request;
import to.unified.unified_java_sdk.models.operations.UpdateHrisCompany2Response;
import to.unified.unified_java_sdk.models.shared.HrisCompany;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateHrisCompany2Request req = UpdateHrisCompany2Request.builder()
                .hrisCompany(HrisCompany.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateHrisCompany2Response res = sdk.hris().updateHrisCompany2()
                .request(req)
                .call();

        if (res.hrisCompany().isPresent()) {
            System.out.println(res.hrisCompany().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [UpdateHrisCompany2Request](../../models/operations/UpdateHrisCompany2Request.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[UpdateHrisCompany2Response](../../models/operations/UpdateHrisCompany2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateHrisDeduction2

Update a deduction

### Example Usage

<!-- UsageSnippet language="java" operationID="updateHrisDeduction2" method="put" path="/hris/{connection_id}/deduction/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateHrisDeduction2Request;
import to.unified.unified_java_sdk.models.operations.UpdateHrisDeduction2Response;
import to.unified.unified_java_sdk.models.shared.HrisDeduction;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateHrisDeduction2Request req = UpdateHrisDeduction2Request.builder()
                .hrisDeduction(HrisDeduction.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateHrisDeduction2Response res = sdk.hris().updateHrisDeduction2()
                .request(req)
                .call();

        if (res.hrisDeduction().isPresent()) {
            System.out.println(res.hrisDeduction().get());
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [UpdateHrisDeduction2Request](../../models/operations/UpdateHrisDeduction2Request.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[UpdateHrisDeduction2Response](../../models/operations/UpdateHrisDeduction2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateHrisDevice2

Update a device

### Example Usage

<!-- UsageSnippet language="java" operationID="updateHrisDevice2" method="put" path="/hris/{connection_id}/device/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateHrisDevice2Request;
import to.unified.unified_java_sdk.models.operations.UpdateHrisDevice2Response;
import to.unified.unified_java_sdk.models.shared.HrisDevice;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateHrisDevice2Request req = UpdateHrisDevice2Request.builder()
                .hrisDevice(HrisDevice.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateHrisDevice2Response res = sdk.hris().updateHrisDevice2()
                .request(req)
                .call();

        if (res.hrisDevice().isPresent()) {
            System.out.println(res.hrisDevice().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [UpdateHrisDevice2Request](../../models/operations/UpdateHrisDevice2Request.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[UpdateHrisDevice2Response](../../models/operations/UpdateHrisDevice2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateHrisEmployee2

Update an employee

### Example Usage

<!-- UsageSnippet language="java" operationID="updateHrisEmployee2" method="put" path="/hris/{connection_id}/employee/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateHrisEmployee2Request;
import to.unified.unified_java_sdk.models.operations.UpdateHrisEmployee2Response;
import to.unified.unified_java_sdk.models.shared.HrisEmployee;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateHrisEmployee2Request req = UpdateHrisEmployee2Request.builder()
                .hrisEmployee(HrisEmployee.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateHrisEmployee2Response res = sdk.hris().updateHrisEmployee2()
                .request(req)
                .call();

        if (res.hrisEmployee().isPresent()) {
            System.out.println(res.hrisEmployee().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [UpdateHrisEmployee2Request](../../models/operations/UpdateHrisEmployee2Request.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[UpdateHrisEmployee2Response](../../models/operations/UpdateHrisEmployee2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateHrisGroup2

Update a group

### Example Usage

<!-- UsageSnippet language="java" operationID="updateHrisGroup2" method="put" path="/hris/{connection_id}/group/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateHrisGroup2Request;
import to.unified.unified_java_sdk.models.operations.UpdateHrisGroup2Response;
import to.unified.unified_java_sdk.models.shared.HrisGroup;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateHrisGroup2Request req = UpdateHrisGroup2Request.builder()
                .hrisGroup(HrisGroup.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateHrisGroup2Response res = sdk.hris().updateHrisGroup2()
                .request(req)
                .call();

        if (res.hrisGroup().isPresent()) {
            System.out.println(res.hrisGroup().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [UpdateHrisGroup2Request](../../models/operations/UpdateHrisGroup2Request.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[UpdateHrisGroup2Response](../../models/operations/UpdateHrisGroup2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateHrisLocation2

Update a location

### Example Usage

<!-- UsageSnippet language="java" operationID="updateHrisLocation2" method="put" path="/hris/{connection_id}/location/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateHrisLocation2Request;
import to.unified.unified_java_sdk.models.operations.UpdateHrisLocation2Response;
import to.unified.unified_java_sdk.models.shared.HrisLocation;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateHrisLocation2Request req = UpdateHrisLocation2Request.builder()
                .hrisLocation(HrisLocation.builder()
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateHrisLocation2Response res = sdk.hris().updateHrisLocation2()
                .request(req)
                .call();

        if (res.hrisLocation().isPresent()) {
            System.out.println(res.hrisLocation().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [UpdateHrisLocation2Request](../../models/operations/UpdateHrisLocation2Request.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[UpdateHrisLocation2Response](../../models/operations/UpdateHrisLocation2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateHrisTimeoff2

Update a timeoff

### Example Usage

<!-- UsageSnippet language="java" operationID="updateHrisTimeoff2" method="put" path="/hris/{connection_id}/timeoff/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateHrisTimeoff2Request;
import to.unified.unified_java_sdk.models.operations.UpdateHrisTimeoff2Response;
import to.unified.unified_java_sdk.models.shared.HrisTimeoff;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateHrisTimeoff2Request req = UpdateHrisTimeoff2Request.builder()
                .hrisTimeoff(HrisTimeoff.builder()
                    .userId("<id>")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateHrisTimeoff2Response res = sdk.hris().updateHrisTimeoff2()
                .request(req)
                .call();

        if (res.hrisTimeoff().isPresent()) {
            System.out.println(res.hrisTimeoff().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [UpdateHrisTimeoff2Request](../../models/operations/UpdateHrisTimeoff2Request.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[UpdateHrisTimeoff2Response](../../models/operations/UpdateHrisTimeoff2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateHrisTimeshift2

Update a timeshift

### Example Usage

<!-- UsageSnippet language="java" operationID="updateHrisTimeshift2" method="put" path="/hris/{connection_id}/timeshift/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateHrisTimeshift2Request;
import to.unified.unified_java_sdk.models.operations.UpdateHrisTimeshift2Response;
import to.unified.unified_java_sdk.models.shared.HrisTimeshift;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateHrisTimeshift2Request req = UpdateHrisTimeshift2Request.builder()
                .hrisTimeshift(HrisTimeshift.builder()
                    .employeeUserId("<id>")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateHrisTimeshift2Response res = sdk.hris().updateHrisTimeshift2()
                .request(req)
                .call();

        if (res.hrisTimeshift().isPresent()) {
            System.out.println(res.hrisTimeshift().get());
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [UpdateHrisTimeshift2Request](../../models/operations/UpdateHrisTimeshift2Request.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[UpdateHrisTimeshift2Response](../../models/operations/UpdateHrisTimeshift2Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |