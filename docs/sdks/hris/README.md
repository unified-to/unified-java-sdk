# Hris

## Overview

### Available Operations

* [createHrisAttendance](#createhrisattendance) - Create an attendance
* [createHrisBankaccount](#createhrisbankaccount) - Create a bankaccount
* [createHrisBenefit](#createhrisbenefit) - Create a benefit
* [createHrisCompany](#createhriscompany) - Create a company
* [createHrisDeduction](#createhrisdeduction) - Create a deduction
* [createHrisDevice](#createhrisdevice) - Create a device
* [createHrisDocument](#createhrisdocument) - Create a document
* [createHrisEarning](#createhrisearning) - Create an earning
* [createHrisEmployee](#createhrisemployee) - Create an employee
* [createHrisGroup](#createhrisgroup) - Create a group
* [createHrisJob](#createhrisjob) - Create a job
* [createHrisLocation](#createhrislocation) - Create a location
* [createHrisTaxonomy](#createhristaxonomy) - Create a taxonomy
* [createHrisTimeoff](#createhristimeoff) - Create a timeoff
* [createHrisTimeshift](#createhristimeshift) - Create a timeshift
* [getHrisAttendance](#gethrisattendance) - Retrieve an attendance
* [getHrisBankaccount](#gethrisbankaccount) - Retrieve a bankaccount
* [getHrisBenefit](#gethrisbenefit) - Retrieve a benefit
* [getHrisCompany](#gethriscompany) - Retrieve a company
* [getHrisDeduction](#gethrisdeduction) - Retrieve a deduction
* [getHrisDevice](#gethrisdevice) - Retrieve a device
* [getHrisDocument](#gethrisdocument) - Retrieve a document
* [getHrisEarning](#gethrisearning) - Retrieve an earning
* [getHrisEmployee](#gethrisemployee) - Retrieve an employee
* [getHrisGroup](#gethrisgroup) - Retrieve a group
* [getHrisJob](#gethrisjob) - Retrieve a job
* [getHrisLocation](#gethrislocation) - Retrieve a location
* [getHrisPaycode](#gethrispaycode) - Retrieve a paycode
* [getHrisPayroll](#gethrispayroll) - Retrieve a payroll
* [getHrisPayslip](#gethrispayslip) - Retrieve a payslip
* [getHrisTaxonomy](#gethristaxonomy) - Retrieve a taxonomy
* [getHrisTimeoff](#gethristimeoff) - Retrieve a timeoff
* [getHrisTimeshift](#gethristimeshift) - Retrieve a timeshift
* [listHrisAttendances](#listhrisattendances) - List all attendances
* [listHrisBankaccounts](#listhrisbankaccounts) - List all bankaccounts
* [listHrisBenefits](#listhrisbenefits) - List all benefits
* [listHrisCompanies](#listhriscompanies) - List all companies
* [listHrisDeductions](#listhrisdeductions) - List all deductions
* [listHrisDevices](#listhrisdevices) - List all devices
* [listHrisDocuments](#listhrisdocuments) - List all documents
* [listHrisEarnings](#listhrisearnings) - List all earnings
* [listHrisEmployees](#listhrisemployees) - List all employees
* [listHrisGroups](#listhrisgroups) - List all groups
* [listHrisJobs](#listhrisjobs) - List all jobs
* [listHrisLocations](#listhrislocations) - List all locations
* [listHrisPaycodes](#listhrispaycodes) - List all paycodes
* [listHrisPayrolls](#listhrispayrolls) - List all payrolls
* [listHrisPayslips](#listhrispayslips) - List all payslips
* [listHrisTaxonomies](#listhristaxonomies) - List all taxonomies
* [listHrisTimeoffs](#listhristimeoffs) - List all timeoffs
* [listHrisTimeshifts](#listhristimeshifts) - List all timeshifts
* [patchHrisAttendance](#patchhrisattendance) - Update an attendance
* [patchHrisBankaccount](#patchhrisbankaccount) - Update a bankaccount
* [patchHrisBenefit](#patchhrisbenefit) - Update a benefit
* [patchHrisCompany](#patchhriscompany) - Update a company
* [patchHrisDeduction](#patchhrisdeduction) - Update a deduction
* [patchHrisDevice](#patchhrisdevice) - Update a device
* [patchHrisDocument](#patchhrisdocument) - Update a document
* [patchHrisEarning](#patchhrisearning) - Update an earning
* [patchHrisEmployee](#patchhrisemployee) - Update an employee
* [patchHrisGroup](#patchhrisgroup) - Update a group
* [patchHrisJob](#patchhrisjob) - Update a job
* [patchHrisLocation](#patchhrislocation) - Update a location
* [patchHrisTimeoff](#patchhristimeoff) - Update a timeoff
* [patchHrisTimeshift](#patchhristimeshift) - Update a timeshift
* [removeHrisAttendance](#removehrisattendance) - Remove an attendance
* [removeHrisBankaccount](#removehrisbankaccount) - Remove a bankaccount
* [removeHrisBenefit](#removehrisbenefit) - Remove a benefit
* [removeHrisCompany](#removehriscompany) - Remove a company
* [removeHrisDeduction](#removehrisdeduction) - Remove a deduction
* [removeHrisDevice](#removehrisdevice) - Remove a device
* [removeHrisDocument](#removehrisdocument) - Remove a document
* [removeHrisEarning](#removehrisearning) - Remove an earning
* [removeHrisEmployee](#removehrisemployee) - Remove an employee
* [removeHrisGroup](#removehrisgroup) - Remove a group
* [removeHrisJob](#removehrisjob) - Remove a job
* [removeHrisLocation](#removehrislocation) - Remove a location
* [removeHrisTimeoff](#removehristimeoff) - Remove a timeoff
* [removeHrisTimeshift](#removehristimeshift) - Remove a timeshift
* [updateHrisAttendance](#updatehrisattendance) - Update an attendance
* [updateHrisBankaccount](#updatehrisbankaccount) - Update a bankaccount
* [updateHrisBenefit](#updatehrisbenefit) - Update a benefit
* [updateHrisCompany](#updatehriscompany) - Update a company
* [updateHrisDeduction](#updatehrisdeduction) - Update a deduction
* [updateHrisDevice](#updatehrisdevice) - Update a device
* [updateHrisDocument](#updatehrisdocument) - Update a document
* [updateHrisEarning](#updatehrisearning) - Update an earning
* [updateHrisEmployee](#updatehrisemployee) - Update an employee
* [updateHrisGroup](#updatehrisgroup) - Update a group
* [updateHrisJob](#updatehrisjob) - Update a job
* [updateHrisLocation](#updatehrislocation) - Update a location
* [updateHrisTimeoff](#updatehristimeoff) - Update a timeoff
* [updateHrisTimeshift](#updatehristimeshift) - Update a timeshift

## createHrisAttendance

Creates a HrisAttendance. Provide the unified HrisAttendance fields in the request body; they are mapped to the provider's API. Returns the created HrisAttendance.

### Example Usage

<!-- UsageSnippet language="java" operationID="createHrisAttendance" method="post" path="/hris/{connection_id}/attendance" example="hris_attendance" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateHrisAttendanceRequest;
import to.unified.unified_java_sdk.models.operations.CreateHrisAttendanceResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateHrisAttendanceRequest req = CreateHrisAttendanceRequest.builder()
                .hrisAttendance(HrisAttendance.builder()
                    .employeeUserId("<id>")
                    .endAt(OffsetDateTime.parse("2024-04-26T23:34:17.571Z"))
                    .startAt(OffsetDateTime.parse("2021-11-11T09:08:17.936Z"))
                    .address(PropertyHrisAttendanceAddress.builder()
                        .address1("14108 Allie Flats")
                        .city("Kearaborough")
                        .countryCode("US")
                        .postalCode("23844-2344")
                        .region("Tennessee")
                        .regionCode("CA")
                        .build())
                    .approvedAt(OffsetDateTime.parse("2021-09-19T17:38:47.254Z"))
                    .breaks(List.of(
                        HrisAttendanceBreak.builder()
                            .durationMinutes(51d)
                            .endAt(OffsetDateTime.parse("2024-02-17T22:54:59.267Z"))
                            .id("f631fb0d-8778-4c70-974a-2663d38d4cd9")
                            .isPaid(false)
                            .name("Lunch")
                            .startAt(OffsetDateTime.parse("2023-11-01T23:07:38.535Z"))
                            .build()))
                    .createdAt(OffsetDateTime.parse("2021-08-10T19:43:18.452Z"))
                    .currency("EUR")
                    .declaredTipsAmount(54d)
                    .hourlyRate(16d)
                    .hours(10d)
                    .id("86fa8a3c-7e33-4684-8d56-469338ca4fea")
                    .jobName("Human Accountability Administrator")
                    .metadata(List.of())
                    .nonCashTipsAmount(167d)
                    .status(HrisAttendanceStatus.OPEN)
                    .timezone("America/Atikokan")
                    .updatedAt(OffsetDateTime.parse("2022-01-20T11:29:39.629Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateHrisAttendanceResponse res = sdk.hris().createHrisAttendance()
                .request(req)
                .call();

        if (res.hrisAttendance().isPresent()) {
            System.out.println(res.hrisAttendance().get());
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [CreateHrisAttendanceRequest](../../models/operations/CreateHrisAttendanceRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[CreateHrisAttendanceResponse](../../models/operations/CreateHrisAttendanceResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createHrisBankaccount

Creates a HrisBankaccount. Provide the unified HrisBankaccount fields in the request body; they are mapped to the provider's API. Returns the created HrisBankaccount.

### Example Usage

<!-- UsageSnippet language="java" operationID="createHrisBankaccount" method="post" path="/hris/{connection_id}/bankaccount" example="hris_bankaccount" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateHrisBankaccountRequest;
import to.unified.unified_java_sdk.models.operations.CreateHrisBankaccountResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateHrisBankaccountRequest req = CreateHrisBankaccountRequest.builder()
                .hrisBankaccount(HrisBankaccount.builder()
                    .accountNumber("****3777")
                    .accountNumberLast4("3777")
                    .accountType(HrisBankaccountAccountType.CHECKING)
                    .bankName("Huel Group")
                    .countryCode("US")
                    .createdAt(OffsetDateTime.parse("2019-11-16T16:43:45.976Z"))
                    .currency("USD")
                    .id("c92411f2-4169-4dc7-b747-ff71ea536798")
                    .isPrimary(true)
                    .metadata(List.of())
                    .name("Granville Schumm - Checking")
                    .priority(2d)
                    .routingNumber("448650724")
                    .splitAmount(98d)
                    .splitType(SplitType.PERCENTAGE)
                    .updatedAt(OffsetDateTime.parse("2025-07-06T23:20:37.460Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateHrisBankaccountResponse res = sdk.hris().createHrisBankaccount()
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
| `request`                                                                               | [CreateHrisBankaccountRequest](../../models/operations/CreateHrisBankaccountRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[CreateHrisBankaccountResponse](../../models/operations/CreateHrisBankaccountResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createHrisBenefit

Creates a HrisBenefit. Provide the unified HrisBenefit fields in the request body; they are mapped to the provider's API. Returns the created HrisBenefit.

### Example Usage

<!-- UsageSnippet language="java" operationID="createHrisBenefit" method="post" path="/hris/{connection_id}/benefit" example="hris_benefit" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateHrisBenefitRequest;
import to.unified.unified_java_sdk.models.operations.CreateHrisBenefitResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateHrisBenefitRequest req = CreateHrisBenefitRequest.builder()
                .hrisBenefit(HrisBenefit.builder()
                    .coverageLevel(CoverageLevel.EMPLOYEE_SPOUSE)
                    .createdAt(OffsetDateTime.parse("2020-06-11T01:24:05.654Z"))
                    .currency("GBP")
                    .description("Vomito voluptas dolor sed.")
                    .employerContributionAmount(185006d)
                    .employerContributionMaxAmount(179093d)
                    .employerContributionType(EmployerContributionType.PERCENTAGE)
                    .frequency(HrisBenefitFrequency.MONTH)
                    .id("29a7b251-4d30-46a8-af26-452f5e3e1f6c")
                    .isActive(false)
                    .metadata(List.of())
                    .name("Frozen Wooden Ball")
                    .tax(Tax.PRE_TAX)
                    .type(HrisBenefitType.OTHER)
                    .updatedAt(OffsetDateTime.parse("2023-03-23T21:56:30.542Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateHrisBenefitResponse res = sdk.hris().createHrisBenefit()
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
| `request`                                                                       | [CreateHrisBenefitRequest](../../models/operations/CreateHrisBenefitRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[CreateHrisBenefitResponse](../../models/operations/CreateHrisBenefitResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createHrisCompany

Creates a HrisCompany. Provide the unified HrisCompany fields in the request body; they are mapped to the provider's API. Returns the created HrisCompany.

### Example Usage

<!-- UsageSnippet language="java" operationID="createHrisCompany" method="post" path="/hris/{connection_id}/company" example="hris_company" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
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
                        .address1("675 Lavinia Lights")
                        .city("Rocky Mount")
                        .countryCode("US")
                        .postalCode("67325")
                        .region("Kentucky")
                        .regionCode("MO")
                        .build())
                    .createdAt(OffsetDateTime.parse("2021-05-02T22:27:38.970Z"))
                    .id("be720e41-acfd-4feb-920e-871ae9298509")
                    .legalName("Gottlieb Group LLC")
                    .metadata(List.of())
                    .name("Gottlieb Group")
                    .updatedAt(OffsetDateTime.parse("2026-10-15T16:07:52.731Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateHrisCompanyResponse res = sdk.hris().createHrisCompany()
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

## createHrisDeduction

Creates a HrisDeduction. Provide the unified HrisDeduction fields in the request body; they are mapped to the provider's API. Returns the created HrisDeduction.

### Example Usage

<!-- UsageSnippet language="java" operationID="createHrisDeduction" method="post" path="/hris/{connection_id}/deduction" example="hris_deduction" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateHrisDeductionRequest;
import to.unified.unified_java_sdk.models.operations.CreateHrisDeductionResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateHrisDeductionRequest req = CreateHrisDeductionRequest.builder()
                .hrisDeduction(HrisDeduction.builder()
                    .amount(564d)
                    .coverageLevel(HrisDeductionCoverageLevel.EMPLOYEE_CHILD)
                    .createdAt(OffsetDateTime.parse("2020-02-05T01:46:31.384Z"))
                    .employerAmount(80510d)
                    .employerType(EmployerType.PERCENTAGE)
                    .frequency(HrisDeductionFrequency.ONE_TIME)
                    .garnishmentType(GarnishmentType.CHILD_SUPPORT)
                    .id("69eb50a9-ae0a-4462-aa1a-69a84c5322ed")
                    .isActive(true)
                    .maxAmount(21794d)
                    .metadata(List.of())
                    .notes("Carmen desidero.")
                    .startAt(OffsetDateTime.parse("2025-03-20T16:11:15.542Z"))
                    .type(HrisDeductionType.FIXED)
                    .updatedAt(OffsetDateTime.parse("2024-03-26T14:50:01.042Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateHrisDeductionResponse res = sdk.hris().createHrisDeduction()
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
| `request`                                                                           | [CreateHrisDeductionRequest](../../models/operations/CreateHrisDeductionRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[CreateHrisDeductionResponse](../../models/operations/CreateHrisDeductionResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createHrisDevice

Creates a HrisDevice. Provide the unified HrisDevice fields in the request body; they are mapped to the provider's API. Returns the created HrisDevice.

### Example Usage

<!-- UsageSnippet language="java" operationID="createHrisDevice" method="post" path="/hris/{connection_id}/device" example="hris_device" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateHrisDeviceRequest;
import to.unified.unified_java_sdk.models.operations.CreateHrisDeviceResponse;
import to.unified.unified_java_sdk.models.shared.HrisDevice;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateHrisDeviceRequest req = CreateHrisDeviceRequest.builder()
                .hrisDevice(HrisDevice.builder()
                    .adminUserIds(List.of())
                    .assetTag("fJNacaaoWi")
                    .createdAt(OffsetDateTime.parse("2019-04-04T17:11:40.322Z"))
                    .hasAntivirus(true)
                    .hasFirewall(true)
                    .hasHdEncrypted(true)
                    .hasPasswordManager(true)
                    .hasScreenlock(false)
                    .id("5ad13e7b-a8ca-43f3-b412-50890e3684e2")
                    .isMissing(false)
                    .manufacturer("Hackett Inc")
                    .metadata(List.of())
                    .model("Fantastic")
                    .name("august-laptop")
                    .os("transmitter")
                    .osVersion("8.4.8")
                    .updatedAt(OffsetDateTime.parse("2023-06-12T04:46:25.358Z"))
                    .version("4.15.7")
                    .build())
                .connectionId("<id>")
                .build();

        CreateHrisDeviceResponse res = sdk.hris().createHrisDevice()
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
| `request`                                                                     | [CreateHrisDeviceRequest](../../models/operations/CreateHrisDeviceRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[CreateHrisDeviceResponse](../../models/operations/CreateHrisDeviceResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createHrisDocument

Creates a HrisDocument. Provide the unified HrisDocument fields in the request body; they are mapped to the provider's API. Returns the created HrisDocument.

### Example Usage

<!-- UsageSnippet language="java" operationID="createHrisDocument" method="post" path="/hris/{connection_id}/document" example="hris_document" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateHrisDocumentRequest;
import to.unified.unified_java_sdk.models.operations.CreateHrisDocumentResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateHrisDocumentRequest req = CreateHrisDocumentRequest.builder()
                .hrisDocument(HrisDocument.builder()
                    .createdAt(OffsetDateTime.parse("2022-10-27T11:47:26.086Z"))
                    .documentUrl("https://sore-decision.biz/")
                    .filename("ridge_forager.xsl")
                    .id("78749b05-2669-4aba-a503-0ad93d7ecded")
                    .metadata(List.of())
                    .type(HrisDocumentType.POLICY)
                    .updatedAt(OffsetDateTime.parse("2025-10-16T19:26:34.206Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateHrisDocumentResponse res = sdk.hris().createHrisDocument()
                .request(req)
                .call();

        if (res.hrisDocument().isPresent()) {
            System.out.println(res.hrisDocument().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [CreateHrisDocumentRequest](../../models/operations/CreateHrisDocumentRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[CreateHrisDocumentResponse](../../models/operations/CreateHrisDocumentResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createHrisEarning

Creates a HrisEarning. Provide the unified HrisEarning fields in the request body; they are mapped to the provider's API. Returns the created HrisEarning.

### Example Usage

<!-- UsageSnippet language="java" operationID="createHrisEarning" method="post" path="/hris/{connection_id}/earning" example="hris_earning" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateHrisEarningRequest;
import to.unified.unified_java_sdk.models.operations.CreateHrisEarningResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateHrisEarningRequest req = CreateHrisEarningRequest.builder()
                .hrisEarning(HrisEarning.builder()
                    .amount(4026d)
                    .createdAt(OffsetDateTime.parse("2019-01-26T12:44:52.326Z"))
                    .currency("USD")
                    .frequency(HrisEarningFrequency.SEMIMONTHLY)
                    .id("6f3573c1-895b-4958-828e-052ef5857d83")
                    .metadata(List.of())
                    .notes("Deporto truculenter vinum beatae.")
                    .startAt(OffsetDateTime.parse("2022-07-28T16:03:52.677Z"))
                    .status(HrisEarningStatus.ENDED)
                    .updatedAt(OffsetDateTime.parse("2020-02-09T19:09:23.408Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateHrisEarningResponse res = sdk.hris().createHrisEarning()
                .request(req)
                .call();

        if (res.hrisEarning().isPresent()) {
            System.out.println(res.hrisEarning().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [CreateHrisEarningRequest](../../models/operations/CreateHrisEarningRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[CreateHrisEarningResponse](../../models/operations/CreateHrisEarningResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createHrisEmployee

Creates a HrisEmployee. Provide the unified HrisEmployee fields in the request body; they are mapped to the provider's API. Returns the created HrisEmployee.

### Example Usage

<!-- UsageSnippet language="java" operationID="createHrisEmployee" method="post" path="/hris/{connection_id}/employee" example="hris_employee" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateHrisEmployeeRequest;
import to.unified.unified_java_sdk.models.operations.CreateHrisEmployeeResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateHrisEmployeeRequest req = CreateHrisEmployeeRequest.builder()
                .hrisEmployee(HrisEmployee.builder()
                    .address(PropertyHrisEmployeeAddress.builder()
                        .address1("7431 Hintz Parkway")
                        .address2("Apt. 520")
                        .city("Port Rogerview")
                        .countryCode("US")
                        .postalCode("01711")
                        .region("Missouri")
                        .regionCode("TN")
                        .build())
                    .bio("fun advocate  🇱🇻")
                    .compensation(List.of(
                        HrisCompensation.builder()
                            .amount(95000d)
                            .currency("USD")
                            .frequency(HrisCompensationFrequency.YEAR)
                            .notes("Eius.")
                            .type(HrisCompensationType.OTHER)
                            .build()))
                    .createdAt(OffsetDateTime.parse("2019-09-16T15:08:53.262Z"))
                    .currency("USD")
                    .dateOfBirth(OffsetDateTime.parse("2001-04-22"))
                    .emails(List.of(
                        HrisEmail.builder()
                            .email("zetta.prohaska@insidious-stump.net")
                            .type(HrisEmailType.WORK)
                            .build()))
                    .employeeNumber("uCk3qaL1ei")
                    .employmentStatus(EmploymentStatus.ACTIVE)
                    .employmentType(HrisEmployeeEmploymentType.PART_TIME)
                    .firstName("Zetta")
                    .flsaStatus(FlsaStatus.EXEMPT)
                    .gender(HrisEmployeeGender.MALE)
                    .hasMfa(true)
                    .hiredAt(OffsetDateTime.parse("2019-09-16T15:08:53.262Z"))
                    .id("143906c4-eace-4fbc-9d71-8a7d86f52979")
                    .imageUrl("https://cdn.jsdelivr.net/gh/faker-js/assets-person-portrait/female/512/85.jpg")
                    .languageLocale("in")
                    .lastName("Prohaska")
                    .locations(List.of())
                    .maritalStatus(HrisEmployeeMaritalStatus.MARRIED)
                    .metadata(List.of(
                        HrisMetadata.builder()
                            .extraData(HrisMetadataExtraData.of(Map.ofEntries(
                                Map.entry("display_name", "Custom Property"))))
                            .format(HrisMetadataFormat.TEXT)
                            .id("19f4ab82-f6f2-4961-b38f-362dcc7e3d31")
                            .namespace("custom")
                            .slug("custom_property")
                            .value(HrisMetadataValue.of("tutis"))
                            .build()))
                    .name("Zetta Prohaska")
                    .payFrequency(PayFrequency.WEEK)
                    .pronouns("she/her")
                    .relationships(List.of(
                        HrisEmployeerelationship.builder()
                            .emails(List.of(
                                HrisEmail.builder()
                                    .email("keith.prohaska@gmail.com")
                                    .build()))
                            .name("Keith Prohaska")
                            .type(HrisEmployeerelationshipType.SIBLING)
                            .build(),
                        HrisEmployeerelationship.builder()
                            .emails(List.of(
                                HrisEmail.builder()
                                    .email("keely.prohaska@icloud.com")
                                    .build()))
                            .name("Keely Prohaska")
                            .type(HrisEmployeerelationshipType.OTHER)
                            .build()))
                    .salutation("Ms.")
                    .ssnSin("284-82-8167")
                    .storageQuotaAllocated(3653713d)
                    .storageQuotaAvailable(3017275d)
                    .storageQuotaUsed(367449d)
                    .telephones(List.of(
                        HrisTelephone.builder()
                            .telephone("(320) 980-1370")
                            .type(HrisTelephoneType.HOME)
                            .build(),
                        HrisTelephone.builder()
                            .telephone("(694) 840-0166")
                            .type(HrisTelephoneType.FAX)
                            .build()))
                    .timeoffDaysTotal(17d)
                    .timeoffDaysUsed(9d)
                    .timezone("Europe/Ljubljana")
                    .title("District Branding Specialist")
                    .updatedAt(OffsetDateTime.parse("2020-07-20T00:10:44.351Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateHrisEmployeeResponse res = sdk.hris().createHrisEmployee()
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
| `request`                                                                         | [CreateHrisEmployeeRequest](../../models/operations/CreateHrisEmployeeRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[CreateHrisEmployeeResponse](../../models/operations/CreateHrisEmployeeResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createHrisGroup

Creates a HrisGroup. Provide the unified HrisGroup fields in the request body; they are mapped to the provider's API. Returns the created HrisGroup.

### Example Usage

<!-- UsageSnippet language="java" operationID="createHrisGroup" method="post" path="/hris/{connection_id}/group" example="hris_group" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateHrisGroupRequest;
import to.unified.unified_java_sdk.models.operations.CreateHrisGroupResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateHrisGroupRequest req = CreateHrisGroupRequest.builder()
                .hrisGroup(HrisGroup.builder()
                    .createdAt(OffsetDateTime.parse("2023-11-01T13:13:40.714Z"))
                    .description("Absorbeo casso.")
                    .id("2b7203a6-0ea2-4bd2-8076-1d91da720405")
                    .isActive(false)
                    .metadata(List.of())
                    .name("Games")
                    .type(HrisGroupType.BRANCH)
                    .updatedAt(OffsetDateTime.parse("2026-05-28T00:35:27.279Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateHrisGroupResponse res = sdk.hris().createHrisGroup()
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
| `request`                                                                   | [CreateHrisGroupRequest](../../models/operations/CreateHrisGroupRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[CreateHrisGroupResponse](../../models/operations/CreateHrisGroupResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createHrisJob

Creates a HrisJob. Provide the unified HrisJob fields in the request body; they are mapped to the provider's API. Returns the created HrisJob.

### Example Usage

<!-- UsageSnippet language="java" operationID="createHrisJob" method="post" path="/hris/{connection_id}/job" example="hris_job" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateHrisJobRequest;
import to.unified.unified_java_sdk.models.operations.CreateHrisJobResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateHrisJobRequest req = CreateHrisJobRequest.builder()
                .hrisJob(HrisJob.builder()
                    .code("P-05547")
                    .createdAt(OffsetDateTime.parse("2020-10-28T01:13:19.491Z"))
                    .description("Alienus timor depromo bonus vobis creator tabella callide cavus triumphus caveo.")
                    .employmentType(HrisJobEmploymentType.FREELANCE)
                    .id("d5a22c5e-add2-40ef-a895-a326cfed7674")
                    .isActive(false)
                    .metadata(List.of())
                    .name("Internal Integration Specialist")
                    .updatedAt(OffsetDateTime.parse("2023-02-01T21:00:31.047Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateHrisJobResponse res = sdk.hris().createHrisJob()
                .request(req)
                .call();

        if (res.hrisJob().isPresent()) {
            System.out.println(res.hrisJob().get());
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [CreateHrisJobRequest](../../models/operations/CreateHrisJobRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[CreateHrisJobResponse](../../models/operations/CreateHrisJobResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createHrisLocation

Creates a HrisLocation. Provide the unified HrisLocation fields in the request body; they are mapped to the provider's API. Returns the created HrisLocation.

### Example Usage

<!-- UsageSnippet language="java" operationID="createHrisLocation" method="post" path="/hris/{connection_id}/location" example="hris_location" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateHrisLocationRequest;
import to.unified.unified_java_sdk.models.operations.CreateHrisLocationResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateHrisLocationRequest req = CreateHrisLocationRequest.builder()
                .hrisLocation(HrisLocation.builder()
                    .address(PropertyHrisLocationAddress.builder()
                        .address1("4418 Daniella Mall")
                        .address2("Apt. 997")
                        .city("Burke")
                        .countryCode("US")
                        .postalCode("54109")
                        .region("Ohio")
                        .regionCode("OR")
                        .build())
                    .createdAt(OffsetDateTime.parse("2021-07-18T10:32:01.414Z"))
                    .currency("MNT")
                    .description("Commemoro acervus.")
                    .id("a72c0ef7-9630-4a1c-9fde-e99535d1250a")
                    .isActive(false)
                    .isHq(true)
                    .languageLocale("it")
                    .metadata(List.of())
                    .name("North Kimberlyland Office")
                    .telephones(List.of(
                        HrisTelephone.builder()
                            .telephone("(371) 245-0699")
                            .type(HrisTelephoneType.FAX)
                            .build(),
                        HrisTelephone.builder()
                            .telephone("(700) 845-5854")
                            .type(HrisTelephoneType.FAX)
                            .build(),
                        HrisTelephone.builder()
                            .telephone("(461) 437-3548")
                            .type(HrisTelephoneType.HOME)
                            .build()))
                    .timezone("Asia/Jerusalem")
                    .updatedAt(OffsetDateTime.parse("2023-06-23T16:12:50.009Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateHrisLocationResponse res = sdk.hris().createHrisLocation()
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
| `request`                                                                         | [CreateHrisLocationRequest](../../models/operations/CreateHrisLocationRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[CreateHrisLocationResponse](../../models/operations/CreateHrisLocationResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createHrisTaxonomy

Creates a HrisTaxonomy. Provide the unified HrisTaxonomy fields in the request body; they are mapped to the provider's API. Returns the created HrisTaxonomy.

### Example Usage

<!-- UsageSnippet language="java" operationID="createHrisTaxonomy" method="post" path="/hris/{connection_id}/taxonomy" example="hris_taxonomy" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateHrisTaxonomyRequest;
import to.unified.unified_java_sdk.models.operations.CreateHrisTaxonomyResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateHrisTaxonomyRequest req = CreateHrisTaxonomyRequest.builder()
                .hrisTaxonomy(HrisTaxonomy.builder()
                    .alternativeNames(List.of(
                        "Facilitator",
                        "National"))
                    .createdAt(OffsetDateTime.parse("2022-06-23T02:10:00.789Z"))
                    .description("Uterque vespillo adnuo ea commodo turbo suscipio condico.")
                    .domain("Health")
                    .id("98aa2c30-8262-408e-8002-7f43ca1a3903")
                    .isActive(false)
                    .metadata(List.of())
                    .name("International Functionality Architect")
                    .subcategory("Marble")
                    .type(HrisTaxonomyType.KNOWLEDGE)
                    .updatedAt(OffsetDateTime.parse("2023-05-30T19:44:31.513Z"))
                    .url("https://fixed-membership.biz/")
                    .build())
                .connectionId("<id>")
                .build();

        CreateHrisTaxonomyResponse res = sdk.hris().createHrisTaxonomy()
                .request(req)
                .call();

        if (res.hrisTaxonomy().isPresent()) {
            System.out.println(res.hrisTaxonomy().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [CreateHrisTaxonomyRequest](../../models/operations/CreateHrisTaxonomyRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[CreateHrisTaxonomyResponse](../../models/operations/CreateHrisTaxonomyResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createHrisTimeoff

Creates a HrisTimeoff. Provide the unified HrisTimeoff fields in the request body; they are mapped to the provider's API. Returns the created HrisTimeoff.

### Example Usage

<!-- UsageSnippet language="java" operationID="createHrisTimeoff" method="post" path="/hris/{connection_id}/timeoff" example="hris_timeoff" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateHrisTimeoffRequest;
import to.unified.unified_java_sdk.models.operations.CreateHrisTimeoffResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateHrisTimeoffRequest req = CreateHrisTimeoffRequest.builder()
                .hrisTimeoff(HrisTimeoff.builder()
                    .userId("<id>")
                    .approvedAt(OffsetDateTime.parse("2022-02-23T21:57:04.373Z"))
                    .comments("Blandior ventus curiositas amplitudo.")
                    .createdAt(OffsetDateTime.parse("2021-10-06T18:00:20.615Z"))
                    .duration(4d)
                    .durationType(DurationType.DAY)
                    .endAt(OffsetDateTime.parse("2025-01-02T05:26:29.894Z"))
                    .id("34e14a1b-57b4-4029-b58e-73d98ba3745b")
                    .isPaid(true)
                    .metadata(List.of())
                    .originalType("acerbitas ut")
                    .reason("verto")
                    .startAt(OffsetDateTime.parse("2023-09-07T11:25:58.677Z"))
                    .status(HrisTimeoffStatus.DENIED)
                    .type(HrisTimeoffType.IN_LIEU)
                    .updatedAt(OffsetDateTime.parse("2022-07-13T21:17:48.709Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateHrisTimeoffResponse res = sdk.hris().createHrisTimeoff()
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
| `request`                                                                       | [CreateHrisTimeoffRequest](../../models/operations/CreateHrisTimeoffRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[CreateHrisTimeoffResponse](../../models/operations/CreateHrisTimeoffResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createHrisTimeshift

Creates a HrisTimeshift. Provide the unified HrisTimeshift fields in the request body; they are mapped to the provider's API. Returns the created HrisTimeshift.

### Example Usage

<!-- UsageSnippet language="java" operationID="createHrisTimeshift" method="post" path="/hris/{connection_id}/timeshift" example="hris_timeshift" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateHrisTimeshiftRequest;
import to.unified.unified_java_sdk.models.operations.CreateHrisTimeshiftResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateHrisTimeshiftRequest req = CreateHrisTimeshiftRequest.builder()
                .hrisTimeshift(HrisTimeshift.builder()
                    .employeeUserId("<id>")
                    .approvedAt(OffsetDateTime.parse("2022-07-21T00:12:25.236Z"))
                    .compensation(List.of(
                        HrisCompensation.builder()
                            .amount(76761d)
                            .currency("GBP")
                            .frequency(HrisCompensationFrequency.SEMIMONTHLY)
                            .notes("Vehemens annus adficio.")
                            .type(HrisCompensationType.COMMISSION)
                            .build()))
                    .createdAt(OffsetDateTime.parse("2019-07-01T23:53:15.738Z"))
                    .endAt(OffsetDateTime.parse("2026-10-04T00:43:18.810Z"))
                    .hours(6d)
                    .id("910fd2d0-251a-4415-82f6-8b69188401c7")
                    .isApproved(false)
                    .metadata(List.of())
                    .startAt(OffsetDateTime.parse("2023-07-16T21:38:13.022Z"))
                    .updatedAt(OffsetDateTime.parse("2021-07-03T20:07:28.750Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateHrisTimeshiftResponse res = sdk.hris().createHrisTimeshift()
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
| `request`                                                                           | [CreateHrisTimeshiftRequest](../../models/operations/CreateHrisTimeshiftRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[CreateHrisTimeshiftResponse](../../models/operations/CreateHrisTimeshiftResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getHrisAttendance

Retrieves a single HrisAttendance by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getHrisAttendance" method="get" path="/hris/{connection_id}/attendance/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetHrisAttendanceRequest;
import to.unified.unified_java_sdk.models.operations.GetHrisAttendanceResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetHrisAttendanceRequest req = GetHrisAttendanceRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetHrisAttendanceResponse res = sdk.hris().getHrisAttendance()
                .request(req)
                .call();

        if (res.hrisAttendance().isPresent()) {
            System.out.println(res.hrisAttendance().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [GetHrisAttendanceRequest](../../models/operations/GetHrisAttendanceRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[GetHrisAttendanceResponse](../../models/operations/GetHrisAttendanceResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getHrisBankaccount

Retrieves a single HrisBankaccount by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getHrisBankaccount" method="get" path="/hris/{connection_id}/bankaccount/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetHrisBankaccountRequest;
import to.unified.unified_java_sdk.models.operations.GetHrisBankaccountResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetHrisBankaccountRequest req = GetHrisBankaccountRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetHrisBankaccountResponse res = sdk.hris().getHrisBankaccount()
                .request(req)
                .call();

        if (res.hrisBankaccount().isPresent()) {
            System.out.println(res.hrisBankaccount().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [GetHrisBankaccountRequest](../../models/operations/GetHrisBankaccountRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[GetHrisBankaccountResponse](../../models/operations/GetHrisBankaccountResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getHrisBenefit

Retrieves a single HrisBenefit by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getHrisBenefit" method="get" path="/hris/{connection_id}/benefit/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetHrisBenefitRequest;
import to.unified.unified_java_sdk.models.operations.GetHrisBenefitResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetHrisBenefitRequest req = GetHrisBenefitRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetHrisBenefitResponse res = sdk.hris().getHrisBenefit()
                .request(req)
                .call();

        if (res.hrisBenefit().isPresent()) {
            System.out.println(res.hrisBenefit().get());
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [GetHrisBenefitRequest](../../models/operations/GetHrisBenefitRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[GetHrisBenefitResponse](../../models/operations/GetHrisBenefitResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getHrisCompany

Retrieves a single HrisCompany by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

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

        GetHrisCompanyResponse res = sdk.hris().getHrisCompany()
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

## getHrisDeduction

Retrieves a single HrisDeduction by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getHrisDeduction" method="get" path="/hris/{connection_id}/deduction/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetHrisDeductionRequest;
import to.unified.unified_java_sdk.models.operations.GetHrisDeductionResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetHrisDeductionRequest req = GetHrisDeductionRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetHrisDeductionResponse res = sdk.hris().getHrisDeduction()
                .request(req)
                .call();

        if (res.hrisDeduction().isPresent()) {
            System.out.println(res.hrisDeduction().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [GetHrisDeductionRequest](../../models/operations/GetHrisDeductionRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[GetHrisDeductionResponse](../../models/operations/GetHrisDeductionResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getHrisDevice

Retrieves a single HrisDevice by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getHrisDevice" method="get" path="/hris/{connection_id}/device/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetHrisDeviceRequest;
import to.unified.unified_java_sdk.models.operations.GetHrisDeviceResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetHrisDeviceRequest req = GetHrisDeviceRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetHrisDeviceResponse res = sdk.hris().getHrisDevice()
                .request(req)
                .call();

        if (res.hrisDevice().isPresent()) {
            System.out.println(res.hrisDevice().get());
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [GetHrisDeviceRequest](../../models/operations/GetHrisDeviceRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[GetHrisDeviceResponse](../../models/operations/GetHrisDeviceResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getHrisDocument

Retrieves a single HrisDocument by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getHrisDocument" method="get" path="/hris/{connection_id}/document/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetHrisDocumentRequest;
import to.unified.unified_java_sdk.models.operations.GetHrisDocumentResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetHrisDocumentRequest req = GetHrisDocumentRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetHrisDocumentResponse res = sdk.hris().getHrisDocument()
                .request(req)
                .call();

        if (res.hrisDocument().isPresent()) {
            System.out.println(res.hrisDocument().get());
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [GetHrisDocumentRequest](../../models/operations/GetHrisDocumentRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[GetHrisDocumentResponse](../../models/operations/GetHrisDocumentResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getHrisEarning

Retrieves a single HrisEarning by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getHrisEarning" method="get" path="/hris/{connection_id}/earning/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetHrisEarningRequest;
import to.unified.unified_java_sdk.models.operations.GetHrisEarningResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetHrisEarningRequest req = GetHrisEarningRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetHrisEarningResponse res = sdk.hris().getHrisEarning()
                .request(req)
                .call();

        if (res.hrisEarning().isPresent()) {
            System.out.println(res.hrisEarning().get());
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [GetHrisEarningRequest](../../models/operations/GetHrisEarningRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[GetHrisEarningResponse](../../models/operations/GetHrisEarningResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getHrisEmployee

Retrieves a single HrisEmployee by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getHrisEmployee" method="get" path="/hris/{connection_id}/employee/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetHrisEmployeeRequest;
import to.unified.unified_java_sdk.models.operations.GetHrisEmployeeResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetHrisEmployeeRequest req = GetHrisEmployeeRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetHrisEmployeeResponse res = sdk.hris().getHrisEmployee()
                .request(req)
                .call();

        if (res.hrisEmployee().isPresent()) {
            System.out.println(res.hrisEmployee().get());
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [GetHrisEmployeeRequest](../../models/operations/GetHrisEmployeeRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[GetHrisEmployeeResponse](../../models/operations/GetHrisEmployeeResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getHrisGroup

Retrieves a single HrisGroup by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getHrisGroup" method="get" path="/hris/{connection_id}/group/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetHrisGroupRequest;
import to.unified.unified_java_sdk.models.operations.GetHrisGroupResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetHrisGroupRequest req = GetHrisGroupRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetHrisGroupResponse res = sdk.hris().getHrisGroup()
                .request(req)
                .call();

        if (res.hrisGroup().isPresent()) {
            System.out.println(res.hrisGroup().get());
        }
    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [GetHrisGroupRequest](../../models/operations/GetHrisGroupRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[GetHrisGroupResponse](../../models/operations/GetHrisGroupResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getHrisJob

Retrieves a single HrisJob by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getHrisJob" method="get" path="/hris/{connection_id}/job/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetHrisJobRequest;
import to.unified.unified_java_sdk.models.operations.GetHrisJobResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetHrisJobRequest req = GetHrisJobRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetHrisJobResponse res = sdk.hris().getHrisJob()
                .request(req)
                .call();

        if (res.hrisJob().isPresent()) {
            System.out.println(res.hrisJob().get());
        }
    }
}
```

### Parameters

| Parameter                                                         | Type                                                              | Required                                                          | Description                                                       |
| ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- |
| `request`                                                         | [GetHrisJobRequest](../../models/operations/GetHrisJobRequest.md) | :heavy_check_mark:                                                | The request object to use for the request.                        |

### Response

**[GetHrisJobResponse](../../models/operations/GetHrisJobResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getHrisLocation

Retrieves a single HrisLocation by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getHrisLocation" method="get" path="/hris/{connection_id}/location/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetHrisLocationRequest;
import to.unified.unified_java_sdk.models.operations.GetHrisLocationResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetHrisLocationRequest req = GetHrisLocationRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetHrisLocationResponse res = sdk.hris().getHrisLocation()
                .request(req)
                .call();

        if (res.hrisLocation().isPresent()) {
            System.out.println(res.hrisLocation().get());
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [GetHrisLocationRequest](../../models/operations/GetHrisLocationRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[GetHrisLocationResponse](../../models/operations/GetHrisLocationResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getHrisPaycode

Retrieves a single HrisPaycode by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getHrisPaycode" method="get" path="/hris/{connection_id}/paycode/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetHrisPaycodeRequest;
import to.unified.unified_java_sdk.models.operations.GetHrisPaycodeResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetHrisPaycodeRequest req = GetHrisPaycodeRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetHrisPaycodeResponse res = sdk.hris().getHrisPaycode()
                .request(req)
                .call();

        if (res.hrisPaycode().isPresent()) {
            System.out.println(res.hrisPaycode().get());
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [GetHrisPaycodeRequest](../../models/operations/GetHrisPaycodeRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[GetHrisPaycodeResponse](../../models/operations/GetHrisPaycodeResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getHrisPayroll

Retrieves a single HrisPayroll by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

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

        GetHrisPayrollResponse res = sdk.hris().getHrisPayroll()
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

## getHrisPayslip

Retrieves a single HrisPayslip by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getHrisPayslip" method="get" path="/hris/{connection_id}/payslip/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetHrisPayslipRequest;
import to.unified.unified_java_sdk.models.operations.GetHrisPayslipResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetHrisPayslipRequest req = GetHrisPayslipRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetHrisPayslipResponse res = sdk.hris().getHrisPayslip()
                .request(req)
                .call();

        if (res.hrisPayslip().isPresent()) {
            System.out.println(res.hrisPayslip().get());
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [GetHrisPayslipRequest](../../models/operations/GetHrisPayslipRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[GetHrisPayslipResponse](../../models/operations/GetHrisPayslipResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getHrisTaxonomy

Retrieves a single HrisTaxonomy by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getHrisTaxonomy" method="get" path="/hris/{connection_id}/taxonomy/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetHrisTaxonomyRequest;
import to.unified.unified_java_sdk.models.operations.GetHrisTaxonomyResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetHrisTaxonomyRequest req = GetHrisTaxonomyRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetHrisTaxonomyResponse res = sdk.hris().getHrisTaxonomy()
                .request(req)
                .call();

        if (res.hrisTaxonomy().isPresent()) {
            System.out.println(res.hrisTaxonomy().get());
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [GetHrisTaxonomyRequest](../../models/operations/GetHrisTaxonomyRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[GetHrisTaxonomyResponse](../../models/operations/GetHrisTaxonomyResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getHrisTimeoff

Retrieves a single HrisTimeoff by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getHrisTimeoff" method="get" path="/hris/{connection_id}/timeoff/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetHrisTimeoffRequest;
import to.unified.unified_java_sdk.models.operations.GetHrisTimeoffResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetHrisTimeoffRequest req = GetHrisTimeoffRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetHrisTimeoffResponse res = sdk.hris().getHrisTimeoff()
                .request(req)
                .call();

        if (res.hrisTimeoff().isPresent()) {
            System.out.println(res.hrisTimeoff().get());
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [GetHrisTimeoffRequest](../../models/operations/GetHrisTimeoffRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[GetHrisTimeoffResponse](../../models/operations/GetHrisTimeoffResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getHrisTimeshift

Retrieves a single HrisTimeshift by its `id`. Obtain `id` values from the corresponding list endpoint. Use `fields` to return only the fields you need.

### Example Usage

<!-- UsageSnippet language="java" operationID="getHrisTimeshift" method="get" path="/hris/{connection_id}/timeshift/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetHrisTimeshiftRequest;
import to.unified.unified_java_sdk.models.operations.GetHrisTimeshiftResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetHrisTimeshiftRequest req = GetHrisTimeshiftRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetHrisTimeshiftResponse res = sdk.hris().getHrisTimeshift()
                .request(req)
                .call();

        if (res.hrisTimeshift().isPresent()) {
            System.out.println(res.hrisTimeshift().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [GetHrisTimeshiftRequest](../../models/operations/GetHrisTimeshiftRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[GetHrisTimeshiftResponse](../../models/operations/GetHrisTimeshiftResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listHrisAttendances

Returns a list of HrisAttendances. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listHrisAttendances" method="get" path="/hris/{connection_id}/attendance" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListHrisAttendancesRequest;
import to.unified.unified_java_sdk.models.operations.ListHrisAttendancesResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListHrisAttendancesRequest req = ListHrisAttendancesRequest.builder()
                .connectionId("<id>")
                .build();

        ListHrisAttendancesResponse res = sdk.hris().listHrisAttendances()
                .request(req)
                .call();

        if (res.hrisAttendances().isPresent()) {
            System.out.println(res.hrisAttendances().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [ListHrisAttendancesRequest](../../models/operations/ListHrisAttendancesRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[ListHrisAttendancesResponse](../../models/operations/ListHrisAttendancesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listHrisBankaccounts

Returns a list of HrisBankaccounts. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listHrisBankaccounts" method="get" path="/hris/{connection_id}/bankaccount" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListHrisBankaccountsRequest;
import to.unified.unified_java_sdk.models.operations.ListHrisBankaccountsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListHrisBankaccountsRequest req = ListHrisBankaccountsRequest.builder()
                .connectionId("<id>")
                .build();

        ListHrisBankaccountsResponse res = sdk.hris().listHrisBankaccounts()
                .request(req)
                .call();

        if (res.hrisBankaccounts().isPresent()) {
            System.out.println(res.hrisBankaccounts().get());
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [ListHrisBankaccountsRequest](../../models/operations/ListHrisBankaccountsRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[ListHrisBankaccountsResponse](../../models/operations/ListHrisBankaccountsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listHrisBenefits

Returns a list of HrisBenefits. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listHrisBenefits" method="get" path="/hris/{connection_id}/benefit" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListHrisBenefitsRequest;
import to.unified.unified_java_sdk.models.operations.ListHrisBenefitsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListHrisBenefitsRequest req = ListHrisBenefitsRequest.builder()
                .connectionId("<id>")
                .build();

        ListHrisBenefitsResponse res = sdk.hris().listHrisBenefits()
                .request(req)
                .call();

        if (res.hrisBenefits().isPresent()) {
            System.out.println(res.hrisBenefits().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [ListHrisBenefitsRequest](../../models/operations/ListHrisBenefitsRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[ListHrisBenefitsResponse](../../models/operations/ListHrisBenefitsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listHrisCompanies

Returns a list of HrisCompanies. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

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

        ListHrisCompaniesResponse res = sdk.hris().listHrisCompanies()
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

## listHrisDeductions

Returns a list of HrisDeductions. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listHrisDeductions" method="get" path="/hris/{connection_id}/deduction" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListHrisDeductionsRequest;
import to.unified.unified_java_sdk.models.operations.ListHrisDeductionsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListHrisDeductionsRequest req = ListHrisDeductionsRequest.builder()
                .connectionId("<id>")
                .build();

        ListHrisDeductionsResponse res = sdk.hris().listHrisDeductions()
                .request(req)
                .call();

        if (res.hrisDeductions().isPresent()) {
            System.out.println(res.hrisDeductions().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [ListHrisDeductionsRequest](../../models/operations/ListHrisDeductionsRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[ListHrisDeductionsResponse](../../models/operations/ListHrisDeductionsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listHrisDevices

Returns a list of HrisDevices. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listHrisDevices" method="get" path="/hris/{connection_id}/device" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListHrisDevicesRequest;
import to.unified.unified_java_sdk.models.operations.ListHrisDevicesResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListHrisDevicesRequest req = ListHrisDevicesRequest.builder()
                .connectionId("<id>")
                .build();

        ListHrisDevicesResponse res = sdk.hris().listHrisDevices()
                .request(req)
                .call();

        if (res.hrisDevices().isPresent()) {
            System.out.println(res.hrisDevices().get());
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [ListHrisDevicesRequest](../../models/operations/ListHrisDevicesRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[ListHrisDevicesResponse](../../models/operations/ListHrisDevicesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listHrisDocuments

Returns a list of HrisDocuments. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listHrisDocuments" method="get" path="/hris/{connection_id}/document" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListHrisDocumentsRequest;
import to.unified.unified_java_sdk.models.operations.ListHrisDocumentsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListHrisDocumentsRequest req = ListHrisDocumentsRequest.builder()
                .connectionId("<id>")
                .build();

        ListHrisDocumentsResponse res = sdk.hris().listHrisDocuments()
                .request(req)
                .call();

        if (res.hrisDocuments().isPresent()) {
            System.out.println(res.hrisDocuments().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [ListHrisDocumentsRequest](../../models/operations/ListHrisDocumentsRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[ListHrisDocumentsResponse](../../models/operations/ListHrisDocumentsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listHrisEarnings

Returns a list of HrisEarnings. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listHrisEarnings" method="get" path="/hris/{connection_id}/earning" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListHrisEarningsRequest;
import to.unified.unified_java_sdk.models.operations.ListHrisEarningsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListHrisEarningsRequest req = ListHrisEarningsRequest.builder()
                .connectionId("<id>")
                .build();

        ListHrisEarningsResponse res = sdk.hris().listHrisEarnings()
                .request(req)
                .call();

        if (res.hrisEarnings().isPresent()) {
            System.out.println(res.hrisEarnings().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [ListHrisEarningsRequest](../../models/operations/ListHrisEarningsRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[ListHrisEarningsResponse](../../models/operations/ListHrisEarningsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listHrisEmployees

Returns a list of HrisEmployees. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listHrisEmployees" method="get" path="/hris/{connection_id}/employee" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListHrisEmployeesRequest;
import to.unified.unified_java_sdk.models.operations.ListHrisEmployeesResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListHrisEmployeesRequest req = ListHrisEmployeesRequest.builder()
                .connectionId("<id>")
                .build();

        ListHrisEmployeesResponse res = sdk.hris().listHrisEmployees()
                .request(req)
                .call();

        if (res.hrisEmployees().isPresent()) {
            System.out.println(res.hrisEmployees().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [ListHrisEmployeesRequest](../../models/operations/ListHrisEmployeesRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[ListHrisEmployeesResponse](../../models/operations/ListHrisEmployeesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listHrisGroups

Returns a list of HrisGroups. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listHrisGroups" method="get" path="/hris/{connection_id}/group" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListHrisGroupsRequest;
import to.unified.unified_java_sdk.models.operations.ListHrisGroupsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListHrisGroupsRequest req = ListHrisGroupsRequest.builder()
                .connectionId("<id>")
                .build();

        ListHrisGroupsResponse res = sdk.hris().listHrisGroups()
                .request(req)
                .call();

        if (res.hrisGroups().isPresent()) {
            System.out.println(res.hrisGroups().get());
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [ListHrisGroupsRequest](../../models/operations/ListHrisGroupsRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[ListHrisGroupsResponse](../../models/operations/ListHrisGroupsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listHrisJobs

Returns a list of HrisJobs. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listHrisJobs" method="get" path="/hris/{connection_id}/job" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListHrisJobsRequest;
import to.unified.unified_java_sdk.models.operations.ListHrisJobsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListHrisJobsRequest req = ListHrisJobsRequest.builder()
                .connectionId("<id>")
                .build();

        ListHrisJobsResponse res = sdk.hris().listHrisJobs()
                .request(req)
                .call();

        if (res.hrisJobs().isPresent()) {
            System.out.println(res.hrisJobs().get());
        }
    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [ListHrisJobsRequest](../../models/operations/ListHrisJobsRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[ListHrisJobsResponse](../../models/operations/ListHrisJobsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listHrisLocations

Returns a list of HrisLocations. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listHrisLocations" method="get" path="/hris/{connection_id}/location" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListHrisLocationsRequest;
import to.unified.unified_java_sdk.models.operations.ListHrisLocationsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListHrisLocationsRequest req = ListHrisLocationsRequest.builder()
                .connectionId("<id>")
                .build();

        ListHrisLocationsResponse res = sdk.hris().listHrisLocations()
                .request(req)
                .call();

        if (res.hrisLocations().isPresent()) {
            System.out.println(res.hrisLocations().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [ListHrisLocationsRequest](../../models/operations/ListHrisLocationsRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[ListHrisLocationsResponse](../../models/operations/ListHrisLocationsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listHrisPaycodes

Returns a list of HrisPaycodes. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listHrisPaycodes" method="get" path="/hris/{connection_id}/paycode" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListHrisPaycodesRequest;
import to.unified.unified_java_sdk.models.operations.ListHrisPaycodesResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListHrisPaycodesRequest req = ListHrisPaycodesRequest.builder()
                .connectionId("<id>")
                .build();

        ListHrisPaycodesResponse res = sdk.hris().listHrisPaycodes()
                .request(req)
                .call();

        if (res.hrisPaycodes().isPresent()) {
            System.out.println(res.hrisPaycodes().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [ListHrisPaycodesRequest](../../models/operations/ListHrisPaycodesRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[ListHrisPaycodesResponse](../../models/operations/ListHrisPaycodesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listHrisPayrolls

Returns a list of HrisPayrolls. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

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

        ListHrisPayrollsResponse res = sdk.hris().listHrisPayrolls()
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

## listHrisPayslips

Returns a list of HrisPayslips. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listHrisPayslips" method="get" path="/hris/{connection_id}/payslip" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListHrisPayslipsRequest;
import to.unified.unified_java_sdk.models.operations.ListHrisPayslipsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListHrisPayslipsRequest req = ListHrisPayslipsRequest.builder()
                .connectionId("<id>")
                .build();

        ListHrisPayslipsResponse res = sdk.hris().listHrisPayslips()
                .request(req)
                .call();

        if (res.hrisPayslips().isPresent()) {
            System.out.println(res.hrisPayslips().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [ListHrisPayslipsRequest](../../models/operations/ListHrisPayslipsRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[ListHrisPayslipsResponse](../../models/operations/ListHrisPayslipsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listHrisTaxonomies

Returns a list of HrisTaxonomies. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listHrisTaxonomies" method="get" path="/hris/{connection_id}/taxonomy" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListHrisTaxonomiesRequest;
import to.unified.unified_java_sdk.models.operations.ListHrisTaxonomiesResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListHrisTaxonomiesRequest req = ListHrisTaxonomiesRequest.builder()
                .connectionId("<id>")
                .build();

        ListHrisTaxonomiesResponse res = sdk.hris().listHrisTaxonomies()
                .request(req)
                .call();

        if (res.hrisTaxonomies().isPresent()) {
            System.out.println(res.hrisTaxonomies().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [ListHrisTaxonomiesRequest](../../models/operations/ListHrisTaxonomiesRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[ListHrisTaxonomiesResponse](../../models/operations/ListHrisTaxonomiesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listHrisTimeoffs

Returns a list of HrisTimeoffs. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listHrisTimeoffs" method="get" path="/hris/{connection_id}/timeoff" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListHrisTimeoffsRequest;
import to.unified.unified_java_sdk.models.operations.ListHrisTimeoffsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListHrisTimeoffsRequest req = ListHrisTimeoffsRequest.builder()
                .connectionId("<id>")
                .build();

        ListHrisTimeoffsResponse res = sdk.hris().listHrisTimeoffs()
                .request(req)
                .call();

        if (res.hrisTimeoffs().isPresent()) {
            System.out.println(res.hrisTimeoffs().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [ListHrisTimeoffsRequest](../../models/operations/ListHrisTimeoffsRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[ListHrisTimeoffsResponse](../../models/operations/ListHrisTimeoffsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listHrisTimeshifts

Returns a list of HrisTimeshifts. Narrow the results with the query parameters before paging, then page through them with `limit` and `offset` (the default and maximum page size depend on the integration). Use `fields` to return only the fields you need and reduce the response size. When the integration supports a total count, it is returned in the `X-Total-Count` response header. Use each item's `id` to retrieve, update, or delete it where those operations are supported.

### Example Usage

<!-- UsageSnippet language="java" operationID="listHrisTimeshifts" method="get" path="/hris/{connection_id}/timeshift" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListHrisTimeshiftsRequest;
import to.unified.unified_java_sdk.models.operations.ListHrisTimeshiftsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListHrisTimeshiftsRequest req = ListHrisTimeshiftsRequest.builder()
                .connectionId("<id>")
                .build();

        ListHrisTimeshiftsResponse res = sdk.hris().listHrisTimeshifts()
                .request(req)
                .call();

        if (res.hrisTimeshifts().isPresent()) {
            System.out.println(res.hrisTimeshifts().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [ListHrisTimeshiftsRequest](../../models/operations/ListHrisTimeshiftsRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[ListHrisTimeshiftsResponse](../../models/operations/ListHrisTimeshiftsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchHrisAttendance

Updates the HrisAttendance identified by `id`. Provide the unified HrisAttendance fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="patchHrisAttendance" method="patch" path="/hris/{connection_id}/attendance/{id}" example="hris_attendance" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchHrisAttendanceRequest;
import to.unified.unified_java_sdk.models.operations.PatchHrisAttendanceResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchHrisAttendanceRequest req = PatchHrisAttendanceRequest.builder()
                .hrisAttendance(HrisAttendance.builder()
                    .employeeUserId("<id>")
                    .endAt(OffsetDateTime.parse("2024-04-26T23:34:17.588Z"))
                    .startAt(OffsetDateTime.parse("2021-11-11T09:08:17.938Z"))
                    .address(PropertyHrisAttendanceAddress.builder()
                        .address1("14108 Allie Flats")
                        .city("Kearaborough")
                        .countryCode("US")
                        .postalCode("23844-2344")
                        .region("Tennessee")
                        .regionCode("CA")
                        .build())
                    .approvedAt(OffsetDateTime.parse("2021-09-19T17:38:47.255Z"))
                    .breaks(List.of(
                        HrisAttendanceBreak.builder()
                            .durationMinutes(51d)
                            .endAt(OffsetDateTime.parse("2024-02-17T22:54:59.283Z"))
                            .id("b098b59a-48a1-4f2c-8aa1-ed3cc7545f3b")
                            .isPaid(false)
                            .name("Lunch")
                            .startAt(OffsetDateTime.parse("2023-11-01T23:07:38.549Z"))
                            .build()))
                    .createdAt(OffsetDateTime.parse("2021-08-10T19:43:18.452Z"))
                    .currency("EUR")
                    .declaredTipsAmount(54d)
                    .hourlyRate(16d)
                    .hours(10d)
                    .id("45ec7c6b-9618-4054-b65a-27c7c6c569d6")
                    .jobName("Human Accountability Administrator")
                    .metadata(List.of())
                    .nonCashTipsAmount(167d)
                    .status(HrisAttendanceStatus.OPEN)
                    .timezone("America/Atikokan")
                    .updatedAt(OffsetDateTime.parse("2022-01-20T11:29:39.631Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchHrisAttendanceResponse res = sdk.hris().patchHrisAttendance()
                .request(req)
                .call();

        if (res.hrisAttendance().isPresent()) {
            System.out.println(res.hrisAttendance().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [PatchHrisAttendanceRequest](../../models/operations/PatchHrisAttendanceRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[PatchHrisAttendanceResponse](../../models/operations/PatchHrisAttendanceResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchHrisBankaccount

Updates the HrisBankaccount identified by `id`. Provide the unified HrisBankaccount fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="patchHrisBankaccount" method="patch" path="/hris/{connection_id}/bankaccount/{id}" example="hris_bankaccount" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchHrisBankaccountRequest;
import to.unified.unified_java_sdk.models.operations.PatchHrisBankaccountResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchHrisBankaccountRequest req = PatchHrisBankaccountRequest.builder()
                .hrisBankaccount(HrisBankaccount.builder()
                    .accountNumber("****3777")
                    .accountNumberLast4("3777")
                    .accountType(HrisBankaccountAccountType.CHECKING)
                    .bankName("Huel Group")
                    .countryCode("US")
                    .createdAt(OffsetDateTime.parse("2019-11-16T16:43:45.976Z"))
                    .currency("USD")
                    .id("4f8f2e02-938d-4efb-b62c-8b5df27072b9")
                    .isPrimary(true)
                    .metadata(List.of())
                    .name("Granville Schumm - Checking")
                    .priority(2d)
                    .routingNumber("448650724")
                    .splitAmount(98d)
                    .splitType(SplitType.PERCENTAGE)
                    .updatedAt(OffsetDateTime.parse("2025-07-06T23:20:37.479Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchHrisBankaccountResponse res = sdk.hris().patchHrisBankaccount()
                .request(req)
                .call();

        if (res.hrisBankaccount().isPresent()) {
            System.out.println(res.hrisBankaccount().get());
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [PatchHrisBankaccountRequest](../../models/operations/PatchHrisBankaccountRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[PatchHrisBankaccountResponse](../../models/operations/PatchHrisBankaccountResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchHrisBenefit

Updates the HrisBenefit identified by `id`. Provide the unified HrisBenefit fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="patchHrisBenefit" method="patch" path="/hris/{connection_id}/benefit/{id}" example="hris_benefit" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchHrisBenefitRequest;
import to.unified.unified_java_sdk.models.operations.PatchHrisBenefitResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchHrisBenefitRequest req = PatchHrisBenefitRequest.builder()
                .hrisBenefit(HrisBenefit.builder()
                    .coverageLevel(CoverageLevel.EMPLOYEE_SPOUSE)
                    .createdAt(OffsetDateTime.parse("2020-06-11T01:24:05.654Z"))
                    .currency("GBP")
                    .description("Vomito voluptas dolor sed.")
                    .employerContributionAmount(185006d)
                    .employerContributionMaxAmount(179093d)
                    .employerContributionType(EmployerContributionType.PERCENTAGE)
                    .frequency(HrisBenefitFrequency.MONTH)
                    .id("03d094b2-177f-41db-b2a9-b36d611df1a1")
                    .isActive(false)
                    .metadata(List.of())
                    .name("Frozen Wooden Ball")
                    .tax(Tax.PRE_TAX)
                    .type(HrisBenefitType.OTHER)
                    .updatedAt(OffsetDateTime.parse("2023-03-23T21:56:30.551Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchHrisBenefitResponse res = sdk.hris().patchHrisBenefit()
                .request(req)
                .call();

        if (res.hrisBenefit().isPresent()) {
            System.out.println(res.hrisBenefit().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [PatchHrisBenefitRequest](../../models/operations/PatchHrisBenefitRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[PatchHrisBenefitResponse](../../models/operations/PatchHrisBenefitResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchHrisCompany

Updates the HrisCompany identified by `id`. Provide the unified HrisCompany fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="patchHrisCompany" method="patch" path="/hris/{connection_id}/company/{id}" example="hris_company" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
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
                        .address1("675 Lavinia Lights")
                        .city("Rocky Mount")
                        .countryCode("US")
                        .postalCode("67325")
                        .region("Kentucky")
                        .regionCode("MO")
                        .build())
                    .createdAt(OffsetDateTime.parse("2021-05-02T22:27:38.970Z"))
                    .id("60f5007b-fa0a-469b-b3ff-c9589d47f616")
                    .legalName("Gottlieb Group LLC")
                    .metadata(List.of())
                    .name("Gottlieb Group")
                    .updatedAt(OffsetDateTime.parse("2026-10-15T16:07:52.750Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchHrisCompanyResponse res = sdk.hris().patchHrisCompany()
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

## patchHrisDeduction

Updates the HrisDeduction identified by `id`. Provide the unified HrisDeduction fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="patchHrisDeduction" method="patch" path="/hris/{connection_id}/deduction/{id}" example="hris_deduction" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchHrisDeductionRequest;
import to.unified.unified_java_sdk.models.operations.PatchHrisDeductionResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchHrisDeductionRequest req = PatchHrisDeductionRequest.builder()
                .hrisDeduction(HrisDeduction.builder()
                    .amount(564d)
                    .coverageLevel(HrisDeductionCoverageLevel.EMPLOYEE_CHILD)
                    .createdAt(OffsetDateTime.parse("2020-02-05T01:46:31.384Z"))
                    .employerAmount(80510d)
                    .employerType(EmployerType.PERCENTAGE)
                    .frequency(HrisDeductionFrequency.ONE_TIME)
                    .garnishmentType(GarnishmentType.CHILD_SUPPORT)
                    .id("f0747469-156b-44b5-b627-fdbeeb43d500")
                    .isActive(true)
                    .maxAmount(21794d)
                    .metadata(List.of())
                    .notes("Carmen desidero.")
                    .startAt(OffsetDateTime.parse("2025-03-20T16:11:15.552Z"))
                    .type(HrisDeductionType.FIXED)
                    .updatedAt(OffsetDateTime.parse("2024-03-26T14:50:01.050Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchHrisDeductionResponse res = sdk.hris().patchHrisDeduction()
                .request(req)
                .call();

        if (res.hrisDeduction().isPresent()) {
            System.out.println(res.hrisDeduction().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [PatchHrisDeductionRequest](../../models/operations/PatchHrisDeductionRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[PatchHrisDeductionResponse](../../models/operations/PatchHrisDeductionResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchHrisDevice

Updates the HrisDevice identified by `id`. Provide the unified HrisDevice fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="patchHrisDevice" method="patch" path="/hris/{connection_id}/device/{id}" example="hris_device" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchHrisDeviceRequest;
import to.unified.unified_java_sdk.models.operations.PatchHrisDeviceResponse;
import to.unified.unified_java_sdk.models.shared.HrisDevice;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchHrisDeviceRequest req = PatchHrisDeviceRequest.builder()
                .hrisDevice(HrisDevice.builder()
                    .adminUserIds(List.of())
                    .assetTag("fJNacaaoWi")
                    .createdAt(OffsetDateTime.parse("2019-04-04T17:11:40.322Z"))
                    .hasAntivirus(true)
                    .hasFirewall(true)
                    .hasHdEncrypted(true)
                    .hasPasswordManager(true)
                    .hasScreenlock(false)
                    .id("f458e315-85f5-40f4-8ac5-407982fa57fa")
                    .isMissing(false)
                    .manufacturer("Hackett Inc")
                    .metadata(List.of())
                    .model("Fantastic")
                    .name("august-laptop")
                    .os("transmitter")
                    .osVersion("8.4.8")
                    .updatedAt(OffsetDateTime.parse("2023-06-12T04:46:25.368Z"))
                    .version("4.15.7")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchHrisDeviceResponse res = sdk.hris().patchHrisDevice()
                .request(req)
                .call();

        if (res.hrisDevice().isPresent()) {
            System.out.println(res.hrisDevice().get());
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [PatchHrisDeviceRequest](../../models/operations/PatchHrisDeviceRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[PatchHrisDeviceResponse](../../models/operations/PatchHrisDeviceResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchHrisDocument

Updates the HrisDocument identified by `id`. Provide the unified HrisDocument fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="patchHrisDocument" method="patch" path="/hris/{connection_id}/document/{id}" example="hris_document" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchHrisDocumentRequest;
import to.unified.unified_java_sdk.models.operations.PatchHrisDocumentResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchHrisDocumentRequest req = PatchHrisDocumentRequest.builder()
                .hrisDocument(HrisDocument.builder()
                    .createdAt(OffsetDateTime.parse("2022-10-27T11:47:26.086Z"))
                    .documentUrl("https://sore-decision.biz/")
                    .filename("ridge_forager.xsl")
                    .id("f44e895e-b6c1-484a-accb-b26d1a4130fb")
                    .metadata(List.of())
                    .type(HrisDocumentType.POLICY)
                    .updatedAt(OffsetDateTime.parse("2025-10-16T19:26:34.219Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchHrisDocumentResponse res = sdk.hris().patchHrisDocument()
                .request(req)
                .call();

        if (res.hrisDocument().isPresent()) {
            System.out.println(res.hrisDocument().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [PatchHrisDocumentRequest](../../models/operations/PatchHrisDocumentRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[PatchHrisDocumentResponse](../../models/operations/PatchHrisDocumentResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchHrisEarning

Updates the HrisEarning identified by `id`. Provide the unified HrisEarning fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="patchHrisEarning" method="patch" path="/hris/{connection_id}/earning/{id}" example="hris_earning" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchHrisEarningRequest;
import to.unified.unified_java_sdk.models.operations.PatchHrisEarningResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchHrisEarningRequest req = PatchHrisEarningRequest.builder()
                .hrisEarning(HrisEarning.builder()
                    .amount(4026d)
                    .createdAt(OffsetDateTime.parse("2019-01-26T12:44:52.326Z"))
                    .currency("USD")
                    .frequency(HrisEarningFrequency.SEMIMONTHLY)
                    .id("f196f2cf-c828-4a0a-ad52-7df7a0e3d4a8")
                    .metadata(List.of())
                    .notes("Deporto truculenter vinum beatae.")
                    .startAt(OffsetDateTime.parse("2022-07-28T16:03:52.686Z"))
                    .status(HrisEarningStatus.ENDED)
                    .updatedAt(OffsetDateTime.parse("2020-02-09T19:09:23.411Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchHrisEarningResponse res = sdk.hris().patchHrisEarning()
                .request(req)
                .call();

        if (res.hrisEarning().isPresent()) {
            System.out.println(res.hrisEarning().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [PatchHrisEarningRequest](../../models/operations/PatchHrisEarningRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[PatchHrisEarningResponse](../../models/operations/PatchHrisEarningResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchHrisEmployee

Updates the HrisEmployee identified by `id`. Provide the unified HrisEmployee fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="patchHrisEmployee" method="patch" path="/hris/{connection_id}/employee/{id}" example="hris_employee" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchHrisEmployeeRequest;
import to.unified.unified_java_sdk.models.operations.PatchHrisEmployeeResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchHrisEmployeeRequest req = PatchHrisEmployeeRequest.builder()
                .hrisEmployee(HrisEmployee.builder()
                    .address(PropertyHrisEmployeeAddress.builder()
                        .address1("7431 Hintz Parkway")
                        .address2("Apt. 520")
                        .city("Port Rogerview")
                        .countryCode("US")
                        .postalCode("01711")
                        .region("Missouri")
                        .regionCode("TN")
                        .build())
                    .bio("fun advocate  🇱🇻")
                    .compensation(List.of(
                        HrisCompensation.builder()
                            .amount(95000d)
                            .currency("USD")
                            .frequency(HrisCompensationFrequency.YEAR)
                            .notes("Eius.")
                            .type(HrisCompensationType.OTHER)
                            .build()))
                    .createdAt(OffsetDateTime.parse("2019-09-16T15:08:53.262Z"))
                    .currency("USD")
                    .dateOfBirth(OffsetDateTime.parse("2001-04-22"))
                    .emails(List.of(
                        HrisEmail.builder()
                            .email("zetta.prohaska@insidious-stump.net")
                            .type(HrisEmailType.WORK)
                            .build()))
                    .employeeNumber("uCk3qaL1ei")
                    .employmentStatus(EmploymentStatus.ACTIVE)
                    .employmentType(HrisEmployeeEmploymentType.PART_TIME)
                    .firstName("Zetta")
                    .flsaStatus(FlsaStatus.EXEMPT)
                    .gender(HrisEmployeeGender.MALE)
                    .hasMfa(true)
                    .hiredAt(OffsetDateTime.parse("2019-09-16T15:08:53.262Z"))
                    .id("39dc12a5-27c2-4ac0-9c08-72313e7f861f")
                    .imageUrl("https://cdn.jsdelivr.net/gh/faker-js/assets-person-portrait/female/512/85.jpg")
                    .languageLocale("in")
                    .lastName("Prohaska")
                    .locations(List.of())
                    .maritalStatus(HrisEmployeeMaritalStatus.MARRIED)
                    .metadata(List.of(
                        HrisMetadata.builder()
                            .extraData(HrisMetadataExtraData.of(Map.ofEntries(
                                Map.entry("display_name", "Custom Property"))))
                            .format(HrisMetadataFormat.TEXT)
                            .id("4e3a0b6d-3b9d-49d1-8297-1607f24fc169")
                            .namespace("custom")
                            .slug("custom_property")
                            .value(HrisMetadataValue.of("tutis"))
                            .build()))
                    .name("Zetta Prohaska")
                    .payFrequency(PayFrequency.WEEK)
                    .pronouns("she/her")
                    .relationships(List.of(
                        HrisEmployeerelationship.builder()
                            .emails(List.of(
                                HrisEmail.builder()
                                    .email("keith.prohaska@gmail.com")
                                    .build()))
                            .name("Keith Prohaska")
                            .type(HrisEmployeerelationshipType.SIBLING)
                            .build(),
                        HrisEmployeerelationship.builder()
                            .emails(List.of(
                                HrisEmail.builder()
                                    .email("keely.prohaska@icloud.com")
                                    .build()))
                            .name("Keely Prohaska")
                            .type(HrisEmployeerelationshipType.OTHER)
                            .build()))
                    .salutation("Ms.")
                    .ssnSin("284-82-8167")
                    .storageQuotaAllocated(3653713d)
                    .storageQuotaAvailable(3017275d)
                    .storageQuotaUsed(367449d)
                    .telephones(List.of(
                        HrisTelephone.builder()
                            .telephone("(320) 980-1370")
                            .type(HrisTelephoneType.HOME)
                            .build(),
                        HrisTelephone.builder()
                            .telephone("(694) 840-0166")
                            .type(HrisTelephoneType.FAX)
                            .build()))
                    .timeoffDaysTotal(17d)
                    .timeoffDaysUsed(9d)
                    .timezone("Europe/Ljubljana")
                    .title("District Branding Specialist")
                    .updatedAt(OffsetDateTime.parse("2020-07-20T00:10:44.366Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchHrisEmployeeResponse res = sdk.hris().patchHrisEmployee()
                .request(req)
                .call();

        if (res.hrisEmployee().isPresent()) {
            System.out.println(res.hrisEmployee().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [PatchHrisEmployeeRequest](../../models/operations/PatchHrisEmployeeRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[PatchHrisEmployeeResponse](../../models/operations/PatchHrisEmployeeResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchHrisGroup

Updates the HrisGroup identified by `id`. Provide the unified HrisGroup fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="patchHrisGroup" method="patch" path="/hris/{connection_id}/group/{id}" example="hris_group" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchHrisGroupRequest;
import to.unified.unified_java_sdk.models.operations.PatchHrisGroupResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchHrisGroupRequest req = PatchHrisGroupRequest.builder()
                .hrisGroup(HrisGroup.builder()
                    .createdAt(OffsetDateTime.parse("2023-11-01T13:13:40.714Z"))
                    .description("Absorbeo casso.")
                    .id("34f4cedf-940a-43db-9965-b942ee889b0a")
                    .isActive(false)
                    .metadata(List.of())
                    .name("Games")
                    .type(HrisGroupType.BRANCH)
                    .updatedAt(OffsetDateTime.parse("2026-05-28T00:35:27.300Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchHrisGroupResponse res = sdk.hris().patchHrisGroup()
                .request(req)
                .call();

        if (res.hrisGroup().isPresent()) {
            System.out.println(res.hrisGroup().get());
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [PatchHrisGroupRequest](../../models/operations/PatchHrisGroupRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[PatchHrisGroupResponse](../../models/operations/PatchHrisGroupResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchHrisJob

Updates the HrisJob identified by `id`. Provide the unified HrisJob fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="patchHrisJob" method="patch" path="/hris/{connection_id}/job/{id}" example="hris_job" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchHrisJobRequest;
import to.unified.unified_java_sdk.models.operations.PatchHrisJobResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchHrisJobRequest req = PatchHrisJobRequest.builder()
                .hrisJob(HrisJob.builder()
                    .code("P-05547")
                    .createdAt(OffsetDateTime.parse("2020-10-28T01:13:19.491Z"))
                    .description("Alienus timor depromo bonus vobis creator tabella callide cavus triumphus caveo.")
                    .employmentType(HrisJobEmploymentType.FREELANCE)
                    .id("63e76f56-bc8a-4296-8116-b7cb15e90a85")
                    .isActive(false)
                    .metadata(List.of())
                    .name("Internal Integration Specialist")
                    .updatedAt(OffsetDateTime.parse("2023-02-01T21:00:31.095Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchHrisJobResponse res = sdk.hris().patchHrisJob()
                .request(req)
                .call();

        if (res.hrisJob().isPresent()) {
            System.out.println(res.hrisJob().get());
        }
    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [PatchHrisJobRequest](../../models/operations/PatchHrisJobRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[PatchHrisJobResponse](../../models/operations/PatchHrisJobResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchHrisLocation

Updates the HrisLocation identified by `id`. Provide the unified HrisLocation fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="patchHrisLocation" method="patch" path="/hris/{connection_id}/location/{id}" example="hris_location" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchHrisLocationRequest;
import to.unified.unified_java_sdk.models.operations.PatchHrisLocationResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchHrisLocationRequest req = PatchHrisLocationRequest.builder()
                .hrisLocation(HrisLocation.builder()
                    .address(PropertyHrisLocationAddress.builder()
                        .address1("4418 Daniella Mall")
                        .address2("Apt. 997")
                        .city("Burke")
                        .countryCode("US")
                        .postalCode("54109")
                        .region("Ohio")
                        .regionCode("OR")
                        .build())
                    .createdAt(OffsetDateTime.parse("2021-07-18T10:32:01.414Z"))
                    .currency("MNT")
                    .description("Commemoro acervus.")
                    .id("301b178a-e3e6-43fc-b157-77bf9abca3cf")
                    .isActive(false)
                    .isHq(true)
                    .languageLocale("it")
                    .metadata(List.of())
                    .name("North Kimberlyland Office")
                    .telephones(List.of(
                        HrisTelephone.builder()
                            .telephone("(371) 245-0699")
                            .type(HrisTelephoneType.FAX)
                            .build(),
                        HrisTelephone.builder()
                            .telephone("(700) 845-5854")
                            .type(HrisTelephoneType.FAX)
                            .build(),
                        HrisTelephone.builder()
                            .telephone("(461) 437-3548")
                            .type(HrisTelephoneType.HOME)
                            .build()))
                    .timezone("Asia/Jerusalem")
                    .updatedAt(OffsetDateTime.parse("2023-06-23T16:12:50.019Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchHrisLocationResponse res = sdk.hris().patchHrisLocation()
                .request(req)
                .call();

        if (res.hrisLocation().isPresent()) {
            System.out.println(res.hrisLocation().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [PatchHrisLocationRequest](../../models/operations/PatchHrisLocationRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[PatchHrisLocationResponse](../../models/operations/PatchHrisLocationResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchHrisTimeoff

Updates the HrisTimeoff identified by `id`. Provide the unified HrisTimeoff fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="patchHrisTimeoff" method="patch" path="/hris/{connection_id}/timeoff/{id}" example="hris_timeoff" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchHrisTimeoffRequest;
import to.unified.unified_java_sdk.models.operations.PatchHrisTimeoffResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchHrisTimeoffRequest req = PatchHrisTimeoffRequest.builder()
                .hrisTimeoff(HrisTimeoff.builder()
                    .userId("<id>")
                    .approvedAt(OffsetDateTime.parse("2022-02-23T21:57:04.375Z"))
                    .comments("Blandior ventus curiositas amplitudo.")
                    .createdAt(OffsetDateTime.parse("2021-10-06T18:00:20.615Z"))
                    .duration(4d)
                    .durationType(DurationType.DAY)
                    .endAt(OffsetDateTime.parse("2025-01-02T05:26:29.910Z"))
                    .id("84ead103-5f78-40bd-b98d-0435d3b56638")
                    .isPaid(true)
                    .metadata(List.of())
                    .originalType("acerbitas ut")
                    .reason("verto")
                    .startAt(OffsetDateTime.parse("2023-09-07T11:25:58.687Z"))
                    .status(HrisTimeoffStatus.DENIED)
                    .type(HrisTimeoffType.IN_LIEU)
                    .updatedAt(OffsetDateTime.parse("2022-07-13T21:17:48.713Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchHrisTimeoffResponse res = sdk.hris().patchHrisTimeoff()
                .request(req)
                .call();

        if (res.hrisTimeoff().isPresent()) {
            System.out.println(res.hrisTimeoff().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [PatchHrisTimeoffRequest](../../models/operations/PatchHrisTimeoffRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[PatchHrisTimeoffResponse](../../models/operations/PatchHrisTimeoffResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchHrisTimeshift

Updates the HrisTimeshift identified by `id`. Provide the unified HrisTimeshift fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="patchHrisTimeshift" method="patch" path="/hris/{connection_id}/timeshift/{id}" example="hris_timeshift" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchHrisTimeshiftRequest;
import to.unified.unified_java_sdk.models.operations.PatchHrisTimeshiftResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchHrisTimeshiftRequest req = PatchHrisTimeshiftRequest.builder()
                .hrisTimeshift(HrisTimeshift.builder()
                    .employeeUserId("<id>")
                    .approvedAt(OffsetDateTime.parse("2022-07-21T00:12:25.245Z"))
                    .compensation(List.of(
                        HrisCompensation.builder()
                            .amount(76761d)
                            .currency("GBP")
                            .frequency(HrisCompensationFrequency.SEMIMONTHLY)
                            .notes("Vehemens annus adficio.")
                            .type(HrisCompensationType.COMMISSION)
                            .build()))
                    .createdAt(OffsetDateTime.parse("2019-07-01T23:53:15.738Z"))
                    .endAt(OffsetDateTime.parse("2026-10-04T00:43:18.831Z"))
                    .hours(6d)
                    .id("0ab36eed-8e1b-4a14-a124-84f89cd011d9")
                    .isApproved(false)
                    .metadata(List.of())
                    .startAt(OffsetDateTime.parse("2023-07-16T21:38:13.034Z"))
                    .updatedAt(OffsetDateTime.parse("2021-07-03T20:07:28.755Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchHrisTimeshiftResponse res = sdk.hris().patchHrisTimeshift()
                .request(req)
                .call();

        if (res.hrisTimeshift().isPresent()) {
            System.out.println(res.hrisTimeshift().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [PatchHrisTimeshiftRequest](../../models/operations/PatchHrisTimeshiftRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[PatchHrisTimeshiftResponse](../../models/operations/PatchHrisTimeshiftResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeHrisAttendance

Deletes the HrisAttendance identified by `id`.

### Example Usage

<!-- UsageSnippet language="java" operationID="removeHrisAttendance" method="delete" path="/hris/{connection_id}/attendance/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveHrisAttendanceRequest;
import to.unified.unified_java_sdk.models.operations.RemoveHrisAttendanceResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveHrisAttendanceRequest req = RemoveHrisAttendanceRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveHrisAttendanceResponse res = sdk.hris().removeHrisAttendance()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [RemoveHrisAttendanceRequest](../../models/operations/RemoveHrisAttendanceRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[RemoveHrisAttendanceResponse](../../models/operations/RemoveHrisAttendanceResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeHrisBankaccount

Deletes the HrisBankaccount identified by `id`.

### Example Usage

<!-- UsageSnippet language="java" operationID="removeHrisBankaccount" method="delete" path="/hris/{connection_id}/bankaccount/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveHrisBankaccountRequest;
import to.unified.unified_java_sdk.models.operations.RemoveHrisBankaccountResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveHrisBankaccountRequest req = RemoveHrisBankaccountRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveHrisBankaccountResponse res = sdk.hris().removeHrisBankaccount()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [RemoveHrisBankaccountRequest](../../models/operations/RemoveHrisBankaccountRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[RemoveHrisBankaccountResponse](../../models/operations/RemoveHrisBankaccountResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeHrisBenefit

Deletes the HrisBenefit identified by `id`.

### Example Usage

<!-- UsageSnippet language="java" operationID="removeHrisBenefit" method="delete" path="/hris/{connection_id}/benefit/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveHrisBenefitRequest;
import to.unified.unified_java_sdk.models.operations.RemoveHrisBenefitResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveHrisBenefitRequest req = RemoveHrisBenefitRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveHrisBenefitResponse res = sdk.hris().removeHrisBenefit()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [RemoveHrisBenefitRequest](../../models/operations/RemoveHrisBenefitRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[RemoveHrisBenefitResponse](../../models/operations/RemoveHrisBenefitResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeHrisCompany

Deletes the HrisCompany identified by `id`.

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

        RemoveHrisCompanyResponse res = sdk.hris().removeHrisCompany()
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

## removeHrisDeduction

Deletes the HrisDeduction identified by `id`.

### Example Usage

<!-- UsageSnippet language="java" operationID="removeHrisDeduction" method="delete" path="/hris/{connection_id}/deduction/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveHrisDeductionRequest;
import to.unified.unified_java_sdk.models.operations.RemoveHrisDeductionResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveHrisDeductionRequest req = RemoveHrisDeductionRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveHrisDeductionResponse res = sdk.hris().removeHrisDeduction()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [RemoveHrisDeductionRequest](../../models/operations/RemoveHrisDeductionRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[RemoveHrisDeductionResponse](../../models/operations/RemoveHrisDeductionResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeHrisDevice

Deletes the HrisDevice identified by `id`.

### Example Usage

<!-- UsageSnippet language="java" operationID="removeHrisDevice" method="delete" path="/hris/{connection_id}/device/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveHrisDeviceRequest;
import to.unified.unified_java_sdk.models.operations.RemoveHrisDeviceResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveHrisDeviceRequest req = RemoveHrisDeviceRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveHrisDeviceResponse res = sdk.hris().removeHrisDevice()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [RemoveHrisDeviceRequest](../../models/operations/RemoveHrisDeviceRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[RemoveHrisDeviceResponse](../../models/operations/RemoveHrisDeviceResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeHrisDocument

Deletes the HrisDocument identified by `id`.

### Example Usage

<!-- UsageSnippet language="java" operationID="removeHrisDocument" method="delete" path="/hris/{connection_id}/document/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveHrisDocumentRequest;
import to.unified.unified_java_sdk.models.operations.RemoveHrisDocumentResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveHrisDocumentRequest req = RemoveHrisDocumentRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveHrisDocumentResponse res = sdk.hris().removeHrisDocument()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [RemoveHrisDocumentRequest](../../models/operations/RemoveHrisDocumentRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[RemoveHrisDocumentResponse](../../models/operations/RemoveHrisDocumentResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeHrisEarning

Deletes the HrisEarning identified by `id`.

### Example Usage

<!-- UsageSnippet language="java" operationID="removeHrisEarning" method="delete" path="/hris/{connection_id}/earning/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveHrisEarningRequest;
import to.unified.unified_java_sdk.models.operations.RemoveHrisEarningResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveHrisEarningRequest req = RemoveHrisEarningRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveHrisEarningResponse res = sdk.hris().removeHrisEarning()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [RemoveHrisEarningRequest](../../models/operations/RemoveHrisEarningRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[RemoveHrisEarningResponse](../../models/operations/RemoveHrisEarningResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeHrisEmployee

Deletes the HrisEmployee identified by `id`.

### Example Usage

<!-- UsageSnippet language="java" operationID="removeHrisEmployee" method="delete" path="/hris/{connection_id}/employee/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveHrisEmployeeRequest;
import to.unified.unified_java_sdk.models.operations.RemoveHrisEmployeeResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveHrisEmployeeRequest req = RemoveHrisEmployeeRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveHrisEmployeeResponse res = sdk.hris().removeHrisEmployee()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [RemoveHrisEmployeeRequest](../../models/operations/RemoveHrisEmployeeRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[RemoveHrisEmployeeResponse](../../models/operations/RemoveHrisEmployeeResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeHrisGroup

Deletes the HrisGroup identified by `id`.

### Example Usage

<!-- UsageSnippet language="java" operationID="removeHrisGroup" method="delete" path="/hris/{connection_id}/group/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveHrisGroupRequest;
import to.unified.unified_java_sdk.models.operations.RemoveHrisGroupResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveHrisGroupRequest req = RemoveHrisGroupRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveHrisGroupResponse res = sdk.hris().removeHrisGroup()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [RemoveHrisGroupRequest](../../models/operations/RemoveHrisGroupRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[RemoveHrisGroupResponse](../../models/operations/RemoveHrisGroupResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeHrisJob

Deletes the HrisJob identified by `id`.

### Example Usage

<!-- UsageSnippet language="java" operationID="removeHrisJob" method="delete" path="/hris/{connection_id}/job/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveHrisJobRequest;
import to.unified.unified_java_sdk.models.operations.RemoveHrisJobResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveHrisJobRequest req = RemoveHrisJobRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveHrisJobResponse res = sdk.hris().removeHrisJob()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [RemoveHrisJobRequest](../../models/operations/RemoveHrisJobRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[RemoveHrisJobResponse](../../models/operations/RemoveHrisJobResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeHrisLocation

Deletes the HrisLocation identified by `id`.

### Example Usage

<!-- UsageSnippet language="java" operationID="removeHrisLocation" method="delete" path="/hris/{connection_id}/location/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveHrisLocationRequest;
import to.unified.unified_java_sdk.models.operations.RemoveHrisLocationResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveHrisLocationRequest req = RemoveHrisLocationRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveHrisLocationResponse res = sdk.hris().removeHrisLocation()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [RemoveHrisLocationRequest](../../models/operations/RemoveHrisLocationRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[RemoveHrisLocationResponse](../../models/operations/RemoveHrisLocationResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeHrisTimeoff

Deletes the HrisTimeoff identified by `id`.

### Example Usage

<!-- UsageSnippet language="java" operationID="removeHrisTimeoff" method="delete" path="/hris/{connection_id}/timeoff/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveHrisTimeoffRequest;
import to.unified.unified_java_sdk.models.operations.RemoveHrisTimeoffResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveHrisTimeoffRequest req = RemoveHrisTimeoffRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveHrisTimeoffResponse res = sdk.hris().removeHrisTimeoff()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [RemoveHrisTimeoffRequest](../../models/operations/RemoveHrisTimeoffRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[RemoveHrisTimeoffResponse](../../models/operations/RemoveHrisTimeoffResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeHrisTimeshift

Deletes the HrisTimeshift identified by `id`.

### Example Usage

<!-- UsageSnippet language="java" operationID="removeHrisTimeshift" method="delete" path="/hris/{connection_id}/timeshift/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveHrisTimeshiftRequest;
import to.unified.unified_java_sdk.models.operations.RemoveHrisTimeshiftResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveHrisTimeshiftRequest req = RemoveHrisTimeshiftRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveHrisTimeshiftResponse res = sdk.hris().removeHrisTimeshift()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [RemoveHrisTimeshiftRequest](../../models/operations/RemoveHrisTimeshiftRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[RemoveHrisTimeshiftResponse](../../models/operations/RemoveHrisTimeshiftResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateHrisAttendance

Updates the HrisAttendance identified by `id`. Provide the unified HrisAttendance fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateHrisAttendance" method="put" path="/hris/{connection_id}/attendance/{id}" example="hris_attendance" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateHrisAttendanceRequest;
import to.unified.unified_java_sdk.models.operations.UpdateHrisAttendanceResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateHrisAttendanceRequest req = UpdateHrisAttendanceRequest.builder()
                .hrisAttendance(HrisAttendance.builder()
                    .employeeUserId("<id>")
                    .endAt(OffsetDateTime.parse("2024-04-26T23:34:17.588Z"))
                    .startAt(OffsetDateTime.parse("2021-11-11T09:08:17.938Z"))
                    .address(PropertyHrisAttendanceAddress.builder()
                        .address1("14108 Allie Flats")
                        .city("Kearaborough")
                        .countryCode("US")
                        .postalCode("23844-2344")
                        .region("Tennessee")
                        .regionCode("CA")
                        .build())
                    .approvedAt(OffsetDateTime.parse("2021-09-19T17:38:47.255Z"))
                    .breaks(List.of(
                        HrisAttendanceBreak.builder()
                            .durationMinutes(51d)
                            .endAt(OffsetDateTime.parse("2024-02-17T22:54:59.283Z"))
                            .id("b098b59a-48a1-4f2c-8aa1-ed3cc7545f3b")
                            .isPaid(false)
                            .name("Lunch")
                            .startAt(OffsetDateTime.parse("2023-11-01T23:07:38.549Z"))
                            .build()))
                    .createdAt(OffsetDateTime.parse("2021-08-10T19:43:18.452Z"))
                    .currency("EUR")
                    .declaredTipsAmount(54d)
                    .hourlyRate(16d)
                    .hours(10d)
                    .id("45ec7c6b-9618-4054-b65a-27c7c6c569d6")
                    .jobName("Human Accountability Administrator")
                    .metadata(List.of())
                    .nonCashTipsAmount(167d)
                    .status(HrisAttendanceStatus.OPEN)
                    .timezone("America/Atikokan")
                    .updatedAt(OffsetDateTime.parse("2022-01-20T11:29:39.631Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateHrisAttendanceResponse res = sdk.hris().updateHrisAttendance()
                .request(req)
                .call();

        if (res.hrisAttendance().isPresent()) {
            System.out.println(res.hrisAttendance().get());
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [UpdateHrisAttendanceRequest](../../models/operations/UpdateHrisAttendanceRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[UpdateHrisAttendanceResponse](../../models/operations/UpdateHrisAttendanceResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateHrisBankaccount

Updates the HrisBankaccount identified by `id`. Provide the unified HrisBankaccount fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateHrisBankaccount" method="put" path="/hris/{connection_id}/bankaccount/{id}" example="hris_bankaccount" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateHrisBankaccountRequest;
import to.unified.unified_java_sdk.models.operations.UpdateHrisBankaccountResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateHrisBankaccountRequest req = UpdateHrisBankaccountRequest.builder()
                .hrisBankaccount(HrisBankaccount.builder()
                    .accountNumber("****3777")
                    .accountNumberLast4("3777")
                    .accountType(HrisBankaccountAccountType.CHECKING)
                    .bankName("Huel Group")
                    .countryCode("US")
                    .createdAt(OffsetDateTime.parse("2019-11-16T16:43:45.976Z"))
                    .currency("USD")
                    .id("4f8f2e02-938d-4efb-b62c-8b5df27072b9")
                    .isPrimary(true)
                    .metadata(List.of())
                    .name("Granville Schumm - Checking")
                    .priority(2d)
                    .routingNumber("448650724")
                    .splitAmount(98d)
                    .splitType(SplitType.PERCENTAGE)
                    .updatedAt(OffsetDateTime.parse("2025-07-06T23:20:37.479Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateHrisBankaccountResponse res = sdk.hris().updateHrisBankaccount()
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
| `request`                                                                               | [UpdateHrisBankaccountRequest](../../models/operations/UpdateHrisBankaccountRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[UpdateHrisBankaccountResponse](../../models/operations/UpdateHrisBankaccountResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateHrisBenefit

Updates the HrisBenefit identified by `id`. Provide the unified HrisBenefit fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateHrisBenefit" method="put" path="/hris/{connection_id}/benefit/{id}" example="hris_benefit" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateHrisBenefitRequest;
import to.unified.unified_java_sdk.models.operations.UpdateHrisBenefitResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateHrisBenefitRequest req = UpdateHrisBenefitRequest.builder()
                .hrisBenefit(HrisBenefit.builder()
                    .coverageLevel(CoverageLevel.EMPLOYEE_SPOUSE)
                    .createdAt(OffsetDateTime.parse("2020-06-11T01:24:05.654Z"))
                    .currency("GBP")
                    .description("Vomito voluptas dolor sed.")
                    .employerContributionAmount(185006d)
                    .employerContributionMaxAmount(179093d)
                    .employerContributionType(EmployerContributionType.PERCENTAGE)
                    .frequency(HrisBenefitFrequency.MONTH)
                    .id("03d094b2-177f-41db-b2a9-b36d611df1a1")
                    .isActive(false)
                    .metadata(List.of())
                    .name("Frozen Wooden Ball")
                    .tax(Tax.PRE_TAX)
                    .type(HrisBenefitType.OTHER)
                    .updatedAt(OffsetDateTime.parse("2023-03-23T21:56:30.551Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateHrisBenefitResponse res = sdk.hris().updateHrisBenefit()
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
| `request`                                                                       | [UpdateHrisBenefitRequest](../../models/operations/UpdateHrisBenefitRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[UpdateHrisBenefitResponse](../../models/operations/UpdateHrisBenefitResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateHrisCompany

Updates the HrisCompany identified by `id`. Provide the unified HrisCompany fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateHrisCompany" method="put" path="/hris/{connection_id}/company/{id}" example="hris_company" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
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
                        .address1("675 Lavinia Lights")
                        .city("Rocky Mount")
                        .countryCode("US")
                        .postalCode("67325")
                        .region("Kentucky")
                        .regionCode("MO")
                        .build())
                    .createdAt(OffsetDateTime.parse("2021-05-02T22:27:38.970Z"))
                    .id("60f5007b-fa0a-469b-b3ff-c9589d47f616")
                    .legalName("Gottlieb Group LLC")
                    .metadata(List.of())
                    .name("Gottlieb Group")
                    .updatedAt(OffsetDateTime.parse("2026-10-15T16:07:52.750Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateHrisCompanyResponse res = sdk.hris().updateHrisCompany()
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

## updateHrisDeduction

Updates the HrisDeduction identified by `id`. Provide the unified HrisDeduction fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateHrisDeduction" method="put" path="/hris/{connection_id}/deduction/{id}" example="hris_deduction" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateHrisDeductionRequest;
import to.unified.unified_java_sdk.models.operations.UpdateHrisDeductionResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateHrisDeductionRequest req = UpdateHrisDeductionRequest.builder()
                .hrisDeduction(HrisDeduction.builder()
                    .amount(564d)
                    .coverageLevel(HrisDeductionCoverageLevel.EMPLOYEE_CHILD)
                    .createdAt(OffsetDateTime.parse("2020-02-05T01:46:31.384Z"))
                    .employerAmount(80510d)
                    .employerType(EmployerType.PERCENTAGE)
                    .frequency(HrisDeductionFrequency.ONE_TIME)
                    .garnishmentType(GarnishmentType.CHILD_SUPPORT)
                    .id("f0747469-156b-44b5-b627-fdbeeb43d500")
                    .isActive(true)
                    .maxAmount(21794d)
                    .metadata(List.of())
                    .notes("Carmen desidero.")
                    .startAt(OffsetDateTime.parse("2025-03-20T16:11:15.552Z"))
                    .type(HrisDeductionType.FIXED)
                    .updatedAt(OffsetDateTime.parse("2024-03-26T14:50:01.050Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateHrisDeductionResponse res = sdk.hris().updateHrisDeduction()
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
| `request`                                                                           | [UpdateHrisDeductionRequest](../../models/operations/UpdateHrisDeductionRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[UpdateHrisDeductionResponse](../../models/operations/UpdateHrisDeductionResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateHrisDevice

Updates the HrisDevice identified by `id`. Provide the unified HrisDevice fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateHrisDevice" method="put" path="/hris/{connection_id}/device/{id}" example="hris_device" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateHrisDeviceRequest;
import to.unified.unified_java_sdk.models.operations.UpdateHrisDeviceResponse;
import to.unified.unified_java_sdk.models.shared.HrisDevice;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateHrisDeviceRequest req = UpdateHrisDeviceRequest.builder()
                .hrisDevice(HrisDevice.builder()
                    .adminUserIds(List.of())
                    .assetTag("fJNacaaoWi")
                    .createdAt(OffsetDateTime.parse("2019-04-04T17:11:40.322Z"))
                    .hasAntivirus(true)
                    .hasFirewall(true)
                    .hasHdEncrypted(true)
                    .hasPasswordManager(true)
                    .hasScreenlock(false)
                    .id("f458e315-85f5-40f4-8ac5-407982fa57fa")
                    .isMissing(false)
                    .manufacturer("Hackett Inc")
                    .metadata(List.of())
                    .model("Fantastic")
                    .name("august-laptop")
                    .os("transmitter")
                    .osVersion("8.4.8")
                    .updatedAt(OffsetDateTime.parse("2023-06-12T04:46:25.368Z"))
                    .version("4.15.7")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateHrisDeviceResponse res = sdk.hris().updateHrisDevice()
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
| `request`                                                                     | [UpdateHrisDeviceRequest](../../models/operations/UpdateHrisDeviceRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[UpdateHrisDeviceResponse](../../models/operations/UpdateHrisDeviceResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateHrisDocument

Updates the HrisDocument identified by `id`. Provide the unified HrisDocument fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateHrisDocument" method="put" path="/hris/{connection_id}/document/{id}" example="hris_document" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateHrisDocumentRequest;
import to.unified.unified_java_sdk.models.operations.UpdateHrisDocumentResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateHrisDocumentRequest req = UpdateHrisDocumentRequest.builder()
                .hrisDocument(HrisDocument.builder()
                    .createdAt(OffsetDateTime.parse("2022-10-27T11:47:26.086Z"))
                    .documentUrl("https://sore-decision.biz/")
                    .filename("ridge_forager.xsl")
                    .id("f44e895e-b6c1-484a-accb-b26d1a4130fb")
                    .metadata(List.of())
                    .type(HrisDocumentType.POLICY)
                    .updatedAt(OffsetDateTime.parse("2025-10-16T19:26:34.219Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateHrisDocumentResponse res = sdk.hris().updateHrisDocument()
                .request(req)
                .call();

        if (res.hrisDocument().isPresent()) {
            System.out.println(res.hrisDocument().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [UpdateHrisDocumentRequest](../../models/operations/UpdateHrisDocumentRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[UpdateHrisDocumentResponse](../../models/operations/UpdateHrisDocumentResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateHrisEarning

Updates the HrisEarning identified by `id`. Provide the unified HrisEarning fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateHrisEarning" method="put" path="/hris/{connection_id}/earning/{id}" example="hris_earning" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateHrisEarningRequest;
import to.unified.unified_java_sdk.models.operations.UpdateHrisEarningResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateHrisEarningRequest req = UpdateHrisEarningRequest.builder()
                .hrisEarning(HrisEarning.builder()
                    .amount(4026d)
                    .createdAt(OffsetDateTime.parse("2019-01-26T12:44:52.326Z"))
                    .currency("USD")
                    .frequency(HrisEarningFrequency.SEMIMONTHLY)
                    .id("f196f2cf-c828-4a0a-ad52-7df7a0e3d4a8")
                    .metadata(List.of())
                    .notes("Deporto truculenter vinum beatae.")
                    .startAt(OffsetDateTime.parse("2022-07-28T16:03:52.686Z"))
                    .status(HrisEarningStatus.ENDED)
                    .updatedAt(OffsetDateTime.parse("2020-02-09T19:09:23.411Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateHrisEarningResponse res = sdk.hris().updateHrisEarning()
                .request(req)
                .call();

        if (res.hrisEarning().isPresent()) {
            System.out.println(res.hrisEarning().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [UpdateHrisEarningRequest](../../models/operations/UpdateHrisEarningRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[UpdateHrisEarningResponse](../../models/operations/UpdateHrisEarningResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateHrisEmployee

Updates the HrisEmployee identified by `id`. Provide the unified HrisEmployee fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateHrisEmployee" method="put" path="/hris/{connection_id}/employee/{id}" example="hris_employee" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateHrisEmployeeRequest;
import to.unified.unified_java_sdk.models.operations.UpdateHrisEmployeeResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateHrisEmployeeRequest req = UpdateHrisEmployeeRequest.builder()
                .hrisEmployee(HrisEmployee.builder()
                    .address(PropertyHrisEmployeeAddress.builder()
                        .address1("7431 Hintz Parkway")
                        .address2("Apt. 520")
                        .city("Port Rogerview")
                        .countryCode("US")
                        .postalCode("01711")
                        .region("Missouri")
                        .regionCode("TN")
                        .build())
                    .bio("fun advocate  🇱🇻")
                    .compensation(List.of(
                        HrisCompensation.builder()
                            .amount(95000d)
                            .currency("USD")
                            .frequency(HrisCompensationFrequency.YEAR)
                            .notes("Eius.")
                            .type(HrisCompensationType.OTHER)
                            .build()))
                    .createdAt(OffsetDateTime.parse("2019-09-16T15:08:53.262Z"))
                    .currency("USD")
                    .dateOfBirth(OffsetDateTime.parse("2001-04-22"))
                    .emails(List.of(
                        HrisEmail.builder()
                            .email("zetta.prohaska@insidious-stump.net")
                            .type(HrisEmailType.WORK)
                            .build()))
                    .employeeNumber("uCk3qaL1ei")
                    .employmentStatus(EmploymentStatus.ACTIVE)
                    .employmentType(HrisEmployeeEmploymentType.PART_TIME)
                    .firstName("Zetta")
                    .flsaStatus(FlsaStatus.EXEMPT)
                    .gender(HrisEmployeeGender.MALE)
                    .hasMfa(true)
                    .hiredAt(OffsetDateTime.parse("2019-09-16T15:08:53.262Z"))
                    .id("39dc12a5-27c2-4ac0-9c08-72313e7f861f")
                    .imageUrl("https://cdn.jsdelivr.net/gh/faker-js/assets-person-portrait/female/512/85.jpg")
                    .languageLocale("in")
                    .lastName("Prohaska")
                    .locations(List.of())
                    .maritalStatus(HrisEmployeeMaritalStatus.MARRIED)
                    .metadata(List.of(
                        HrisMetadata.builder()
                            .extraData(HrisMetadataExtraData.of(Map.ofEntries(
                                Map.entry("display_name", "Custom Property"))))
                            .format(HrisMetadataFormat.TEXT)
                            .id("4e3a0b6d-3b9d-49d1-8297-1607f24fc169")
                            .namespace("custom")
                            .slug("custom_property")
                            .value(HrisMetadataValue.of("tutis"))
                            .build()))
                    .name("Zetta Prohaska")
                    .payFrequency(PayFrequency.WEEK)
                    .pronouns("she/her")
                    .relationships(List.of(
                        HrisEmployeerelationship.builder()
                            .emails(List.of(
                                HrisEmail.builder()
                                    .email("keith.prohaska@gmail.com")
                                    .build()))
                            .name("Keith Prohaska")
                            .type(HrisEmployeerelationshipType.SIBLING)
                            .build(),
                        HrisEmployeerelationship.builder()
                            .emails(List.of(
                                HrisEmail.builder()
                                    .email("keely.prohaska@icloud.com")
                                    .build()))
                            .name("Keely Prohaska")
                            .type(HrisEmployeerelationshipType.OTHER)
                            .build()))
                    .salutation("Ms.")
                    .ssnSin("284-82-8167")
                    .storageQuotaAllocated(3653713d)
                    .storageQuotaAvailable(3017275d)
                    .storageQuotaUsed(367449d)
                    .telephones(List.of(
                        HrisTelephone.builder()
                            .telephone("(320) 980-1370")
                            .type(HrisTelephoneType.HOME)
                            .build(),
                        HrisTelephone.builder()
                            .telephone("(694) 840-0166")
                            .type(HrisTelephoneType.FAX)
                            .build()))
                    .timeoffDaysTotal(17d)
                    .timeoffDaysUsed(9d)
                    .timezone("Europe/Ljubljana")
                    .title("District Branding Specialist")
                    .updatedAt(OffsetDateTime.parse("2020-07-20T00:10:44.366Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateHrisEmployeeResponse res = sdk.hris().updateHrisEmployee()
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
| `request`                                                                         | [UpdateHrisEmployeeRequest](../../models/operations/UpdateHrisEmployeeRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[UpdateHrisEmployeeResponse](../../models/operations/UpdateHrisEmployeeResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateHrisGroup

Updates the HrisGroup identified by `id`. Provide the unified HrisGroup fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateHrisGroup" method="put" path="/hris/{connection_id}/group/{id}" example="hris_group" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateHrisGroupRequest;
import to.unified.unified_java_sdk.models.operations.UpdateHrisGroupResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateHrisGroupRequest req = UpdateHrisGroupRequest.builder()
                .hrisGroup(HrisGroup.builder()
                    .createdAt(OffsetDateTime.parse("2023-11-01T13:13:40.714Z"))
                    .description("Absorbeo casso.")
                    .id("34f4cedf-940a-43db-9965-b942ee889b0a")
                    .isActive(false)
                    .metadata(List.of())
                    .name("Games")
                    .type(HrisGroupType.BRANCH)
                    .updatedAt(OffsetDateTime.parse("2026-05-28T00:35:27.300Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateHrisGroupResponse res = sdk.hris().updateHrisGroup()
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
| `request`                                                                   | [UpdateHrisGroupRequest](../../models/operations/UpdateHrisGroupRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[UpdateHrisGroupResponse](../../models/operations/UpdateHrisGroupResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateHrisJob

Updates the HrisJob identified by `id`. Provide the unified HrisJob fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateHrisJob" method="put" path="/hris/{connection_id}/job/{id}" example="hris_job" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateHrisJobRequest;
import to.unified.unified_java_sdk.models.operations.UpdateHrisJobResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateHrisJobRequest req = UpdateHrisJobRequest.builder()
                .hrisJob(HrisJob.builder()
                    .code("P-05547")
                    .createdAt(OffsetDateTime.parse("2020-10-28T01:13:19.491Z"))
                    .description("Alienus timor depromo bonus vobis creator tabella callide cavus triumphus caveo.")
                    .employmentType(HrisJobEmploymentType.FREELANCE)
                    .id("63e76f56-bc8a-4296-8116-b7cb15e90a85")
                    .isActive(false)
                    .metadata(List.of())
                    .name("Internal Integration Specialist")
                    .updatedAt(OffsetDateTime.parse("2023-02-01T21:00:31.095Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateHrisJobResponse res = sdk.hris().updateHrisJob()
                .request(req)
                .call();

        if (res.hrisJob().isPresent()) {
            System.out.println(res.hrisJob().get());
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [UpdateHrisJobRequest](../../models/operations/UpdateHrisJobRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[UpdateHrisJobResponse](../../models/operations/UpdateHrisJobResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateHrisLocation

Updates the HrisLocation identified by `id`. Provide the unified HrisLocation fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateHrisLocation" method="put" path="/hris/{connection_id}/location/{id}" example="hris_location" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateHrisLocationRequest;
import to.unified.unified_java_sdk.models.operations.UpdateHrisLocationResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateHrisLocationRequest req = UpdateHrisLocationRequest.builder()
                .hrisLocation(HrisLocation.builder()
                    .address(PropertyHrisLocationAddress.builder()
                        .address1("4418 Daniella Mall")
                        .address2("Apt. 997")
                        .city("Burke")
                        .countryCode("US")
                        .postalCode("54109")
                        .region("Ohio")
                        .regionCode("OR")
                        .build())
                    .createdAt(OffsetDateTime.parse("2021-07-18T10:32:01.414Z"))
                    .currency("MNT")
                    .description("Commemoro acervus.")
                    .id("301b178a-e3e6-43fc-b157-77bf9abca3cf")
                    .isActive(false)
                    .isHq(true)
                    .languageLocale("it")
                    .metadata(List.of())
                    .name("North Kimberlyland Office")
                    .telephones(List.of(
                        HrisTelephone.builder()
                            .telephone("(371) 245-0699")
                            .type(HrisTelephoneType.FAX)
                            .build(),
                        HrisTelephone.builder()
                            .telephone("(700) 845-5854")
                            .type(HrisTelephoneType.FAX)
                            .build(),
                        HrisTelephone.builder()
                            .telephone("(461) 437-3548")
                            .type(HrisTelephoneType.HOME)
                            .build()))
                    .timezone("Asia/Jerusalem")
                    .updatedAt(OffsetDateTime.parse("2023-06-23T16:12:50.019Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateHrisLocationResponse res = sdk.hris().updateHrisLocation()
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
| `request`                                                                         | [UpdateHrisLocationRequest](../../models/operations/UpdateHrisLocationRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[UpdateHrisLocationResponse](../../models/operations/UpdateHrisLocationResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateHrisTimeoff

Updates the HrisTimeoff identified by `id`. Provide the unified HrisTimeoff fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateHrisTimeoff" method="put" path="/hris/{connection_id}/timeoff/{id}" example="hris_timeoff" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateHrisTimeoffRequest;
import to.unified.unified_java_sdk.models.operations.UpdateHrisTimeoffResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateHrisTimeoffRequest req = UpdateHrisTimeoffRequest.builder()
                .hrisTimeoff(HrisTimeoff.builder()
                    .userId("<id>")
                    .approvedAt(OffsetDateTime.parse("2022-02-23T21:57:04.375Z"))
                    .comments("Blandior ventus curiositas amplitudo.")
                    .createdAt(OffsetDateTime.parse("2021-10-06T18:00:20.615Z"))
                    .duration(4d)
                    .durationType(DurationType.DAY)
                    .endAt(OffsetDateTime.parse("2025-01-02T05:26:29.910Z"))
                    .id("84ead103-5f78-40bd-b98d-0435d3b56638")
                    .isPaid(true)
                    .metadata(List.of())
                    .originalType("acerbitas ut")
                    .reason("verto")
                    .startAt(OffsetDateTime.parse("2023-09-07T11:25:58.687Z"))
                    .status(HrisTimeoffStatus.DENIED)
                    .type(HrisTimeoffType.IN_LIEU)
                    .updatedAt(OffsetDateTime.parse("2022-07-13T21:17:48.713Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateHrisTimeoffResponse res = sdk.hris().updateHrisTimeoff()
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
| `request`                                                                       | [UpdateHrisTimeoffRequest](../../models/operations/UpdateHrisTimeoffRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[UpdateHrisTimeoffResponse](../../models/operations/UpdateHrisTimeoffResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateHrisTimeshift

Updates the HrisTimeshift identified by `id`. Provide the unified HrisTimeshift fields to change in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateHrisTimeshift" method="put" path="/hris/{connection_id}/timeshift/{id}" example="hris_timeshift" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateHrisTimeshiftRequest;
import to.unified.unified_java_sdk.models.operations.UpdateHrisTimeshiftResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateHrisTimeshiftRequest req = UpdateHrisTimeshiftRequest.builder()
                .hrisTimeshift(HrisTimeshift.builder()
                    .employeeUserId("<id>")
                    .approvedAt(OffsetDateTime.parse("2022-07-21T00:12:25.245Z"))
                    .compensation(List.of(
                        HrisCompensation.builder()
                            .amount(76761d)
                            .currency("GBP")
                            .frequency(HrisCompensationFrequency.SEMIMONTHLY)
                            .notes("Vehemens annus adficio.")
                            .type(HrisCompensationType.COMMISSION)
                            .build()))
                    .createdAt(OffsetDateTime.parse("2019-07-01T23:53:15.738Z"))
                    .endAt(OffsetDateTime.parse("2026-10-04T00:43:18.831Z"))
                    .hours(6d)
                    .id("0ab36eed-8e1b-4a14-a124-84f89cd011d9")
                    .isApproved(false)
                    .metadata(List.of())
                    .startAt(OffsetDateTime.parse("2023-07-16T21:38:13.034Z"))
                    .updatedAt(OffsetDateTime.parse("2021-07-03T20:07:28.755Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateHrisTimeshiftResponse res = sdk.hris().updateHrisTimeshift()
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
| `request`                                                                           | [UpdateHrisTimeshiftRequest](../../models/operations/UpdateHrisTimeshiftRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[UpdateHrisTimeshiftResponse](../../models/operations/UpdateHrisTimeshiftResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |