# Employee

## Overview

### Available Operations

* [createHrisEmployee](#createhrisemployee) - Create an employee
* [getHrisEmployee](#gethrisemployee) - Retrieve an employee
* [listHrisEmployees](#listhrisemployees) - List all employees
* [patchHrisEmployee](#patchhrisemployee) - Update an employee
* [removeHrisEmployee](#removehrisemployee) - Remove an employee
* [updateHrisEmployee](#updatehrisemployee) - Update an employee

## createHrisEmployee

Create an employee

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
                        .address1("52008 Lansdowne Road")
                        .address2("Apt. 101")
                        .city("Connellyberg")
                        .countryCode("US")
                        .postalCode("18978")
                        .region("South Dakota")
                        .regionCode("NM")
                        .build())
                    .bio("sushi devotee, singer")
                    .compensation(List.of(
                        HrisCompensation.builder()
                            .amount(60136d)
                            .currency("CRC")
                            .frequency(HrisCompensationFrequency.QUARTER)
                            .notes("Tergeo laborum laboriosam tutis.")
                            .type(HrisCompensationType.STOCK_OPTIONS)
                            .build()))
                    .createdAt(OffsetDateTime.parse("2019-09-16T15:08:53.262Z"))
                    .currency("IDR")
                    .dateOfBirth(OffsetDateTime.parse("2001-04-22"))
                    .emails(List.of(
                        HrisEmail.builder()
                            .email("Zetta_Prohaska67@hotmail.com")
                            .type(HrisEmailType.HOME)
                            .build()))
                    .employeeNumber("YuOt169CGu")
                    .employmentStatus(EmploymentStatus.ACTIVE)
                    .employmentType(HrisEmployeeEmploymentType.VOLUNTEER)
                    .firstName("Zetta")
                    .flsaStatus(FlsaStatus.SALARIED_NONEXEMPT)
                    .gender(HrisEmployeeGender.INTERSEX)
                    .hasMfa(false)
                    .hiredAt(OffsetDateTime.parse("2023-05-23T12:33:34.323Z"))
                    .id("082f319e-e46e-4709-81b8-6862cb9238b0")
                    .imageUrl("https://loremflickr.com/3684/2116?lock=4686991638584456")
                    .languageLocale("es")
                    .lastName("Prohaska")
                    .locations(List.of())
                    .maritalStatus(MaritalStatus.MARRIED)
                    .metadata(List.of(
                        HrisMetadata.builder()
                            .extraData(HrisMetadataExtraData.of(Map.ofEntries(
                                Map.entry("display_name", "Custom Property"))))
                            .format(HrisMetadataFormat.TEXT)
                            .id("964e55ba-00cb-4b2d-875a-8d79e3e738e4")
                            .namespace("custom")
                            .slug("custom_property")
                            .value(HrisMetadataValue.of("appono"))
                            .build()))
                    .name("Zetta Prohaska")
                    .payFrequency(PayFrequency.BIWEEKLY)
                    .pronouns("she/her")
                    .relationships(List.of(
                        HrisEmployeerelationship.builder()
                            .emails(List.of(
                                HrisEmail.builder()
                                    .email("Deshaun.Sanford24@yahoo.com")
                                    .build(),
                                HrisEmail.builder()
                                    .email("Rebeca.Dibbert11@hotmail.com")
                                    .build(),
                                HrisEmail.builder()
                                    .email("Hester80@gmail.com")
                                    .build()))
                            .name("Automotive")
                            .type(HrisEmployeerelationshipType.FRIEND)
                            .build(),
                        HrisEmployeerelationship.builder()
                            .emails(List.of(
                                HrisEmail.builder()
                                    .email("Benedict_Wisozk83@hotmail.com")
                                    .build()))
                            .name("Music")
                            .type(HrisEmployeerelationshipType.SIBLING)
                            .build(),
                        HrisEmployeerelationship.builder()
                            .emails(List.of(
                                HrisEmail.builder()
                                    .email("Margot11@yahoo.com")
                                    .build(),
                                HrisEmail.builder()
                                    .email("Jaden_Miller@gmail.com")
                                    .build()))
                            .name("Electronics")
                            .type(HrisEmployeerelationshipType.OTHER)
                            .build()))
                    .salutation("Miss")
                    .ssnSin("yMRtj0Q3xO")
                    .storageQuotaAllocated(7748057d)
                    .storageQuotaAvailable(1590710d)
                    .storageQuotaUsed(730343d)
                    .telephones(List.of(
                        HrisTelephone.builder()
                            .telephone("(409) 801-3705")
                            .type(HrisTelephoneType.FAX)
                            .build()))
                    .terminationReason("Communis adnuo damnatio atavus terebro acies canis cogito triumphus creber temptatio defendo cubo amissio paulatim corroboro.")
                    .timeoffDaysTotal(12d)
                    .timeoffDaysUsed(6d)
                    .timezone("Africa/Harare")
                    .title("Investor Paradigm Liaison")
                    .updatedAt(OffsetDateTime.parse("2022-02-27T20:15:32.762Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateHrisEmployeeResponse res = sdk.employee().createHrisEmployee()
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

## getHrisEmployee

Retrieve an employee

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

        GetHrisEmployeeResponse res = sdk.employee().getHrisEmployee()
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

## listHrisEmployees

List all employees

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

        ListHrisEmployeesResponse res = sdk.employee().listHrisEmployees()
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

## patchHrisEmployee

Update an employee

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
                        .address1("52008 Lansdowne Road")
                        .address2("Apt. 101")
                        .city("Connellyberg")
                        .countryCode("US")
                        .postalCode("18978")
                        .region("South Dakota")
                        .regionCode("NM")
                        .build())
                    .bio("sushi devotee, singer")
                    .compensation(List.of(
                        HrisCompensation.builder()
                            .amount(60136d)
                            .currency("CRC")
                            .frequency(HrisCompensationFrequency.QUARTER)
                            .notes("Tergeo laborum laboriosam tutis.")
                            .type(HrisCompensationType.STOCK_OPTIONS)
                            .build()))
                    .createdAt(OffsetDateTime.parse("2019-09-16T15:08:53.262Z"))
                    .currency("IDR")
                    .dateOfBirth(OffsetDateTime.parse("2001-04-22"))
                    .emails(List.of(
                        HrisEmail.builder()
                            .email("Zetta_Prohaska67@hotmail.com")
                            .type(HrisEmailType.HOME)
                            .build()))
                    .employeeNumber("YuOt169CGu")
                    .employmentStatus(EmploymentStatus.ACTIVE)
                    .employmentType(HrisEmployeeEmploymentType.VOLUNTEER)
                    .firstName("Zetta")
                    .flsaStatus(FlsaStatus.SALARIED_NONEXEMPT)
                    .gender(HrisEmployeeGender.INTERSEX)
                    .hasMfa(false)
                    .hiredAt(OffsetDateTime.parse("2023-05-23T12:33:34.361Z"))
                    .id("f243822e-0b4a-408c-8fe0-cdf632ee3124")
                    .imageUrl("https://loremflickr.com/3684/2116?lock=4686991638584456")
                    .languageLocale("es")
                    .lastName("Prohaska")
                    .locations(List.of())
                    .maritalStatus(MaritalStatus.MARRIED)
                    .metadata(List.of(
                        HrisMetadata.builder()
                            .extraData(HrisMetadataExtraData.of(Map.ofEntries(
                                Map.entry("display_name", "Custom Property"))))
                            .format(HrisMetadataFormat.TEXT)
                            .id("08f3f2c1-d5c6-4e3f-8b72-7fab1184f197")
                            .namespace("custom")
                            .slug("custom_property")
                            .value(HrisMetadataValue.of("appono"))
                            .build()))
                    .name("Zetta Prohaska")
                    .payFrequency(PayFrequency.BIWEEKLY)
                    .pronouns("she/her")
                    .relationships(List.of(
                        HrisEmployeerelationship.builder()
                            .emails(List.of(
                                HrisEmail.builder()
                                    .email("Deshaun.Sanford24@yahoo.com")
                                    .build(),
                                HrisEmail.builder()
                                    .email("Rebeca.Dibbert11@hotmail.com")
                                    .build(),
                                HrisEmail.builder()
                                    .email("Hester80@gmail.com")
                                    .build()))
                            .name("Automotive")
                            .type(HrisEmployeerelationshipType.FRIEND)
                            .build(),
                        HrisEmployeerelationship.builder()
                            .emails(List.of(
                                HrisEmail.builder()
                                    .email("Benedict_Wisozk83@hotmail.com")
                                    .build()))
                            .name("Music")
                            .type(HrisEmployeerelationshipType.SIBLING)
                            .build(),
                        HrisEmployeerelationship.builder()
                            .emails(List.of(
                                HrisEmail.builder()
                                    .email("Margot11@yahoo.com")
                                    .build(),
                                HrisEmail.builder()
                                    .email("Jaden_Miller@gmail.com")
                                    .build()))
                            .name("Electronics")
                            .type(HrisEmployeerelationshipType.OTHER)
                            .build()))
                    .salutation("Miss")
                    .ssnSin("yMRtj0Q3xO")
                    .storageQuotaAllocated(7748057d)
                    .storageQuotaAvailable(1590710d)
                    .storageQuotaUsed(730343d)
                    .telephones(List.of(
                        HrisTelephone.builder()
                            .telephone("(409) 801-3705")
                            .type(HrisTelephoneType.FAX)
                            .build()))
                    .terminationReason("Communis adnuo damnatio atavus terebro acies canis cogito triumphus creber temptatio defendo cubo amissio paulatim corroboro.")
                    .timeoffDaysTotal(12d)
                    .timeoffDaysUsed(6d)
                    .timezone("Africa/Harare")
                    .title("Investor Paradigm Liaison")
                    .updatedAt(OffsetDateTime.parse("2022-02-27T20:15:32.788Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchHrisEmployeeResponse res = sdk.employee().patchHrisEmployee()
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

## removeHrisEmployee

Remove an employee

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

        RemoveHrisEmployeeResponse res = sdk.employee().removeHrisEmployee()
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

## updateHrisEmployee

Update an employee

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
                        .address1("52008 Lansdowne Road")
                        .address2("Apt. 101")
                        .city("Connellyberg")
                        .countryCode("US")
                        .postalCode("18978")
                        .region("South Dakota")
                        .regionCode("NM")
                        .build())
                    .bio("sushi devotee, singer")
                    .compensation(List.of(
                        HrisCompensation.builder()
                            .amount(60136d)
                            .currency("CRC")
                            .frequency(HrisCompensationFrequency.QUARTER)
                            .notes("Tergeo laborum laboriosam tutis.")
                            .type(HrisCompensationType.STOCK_OPTIONS)
                            .build()))
                    .createdAt(OffsetDateTime.parse("2019-09-16T15:08:53.262Z"))
                    .currency("IDR")
                    .dateOfBirth(OffsetDateTime.parse("2001-04-22"))
                    .emails(List.of(
                        HrisEmail.builder()
                            .email("Zetta_Prohaska67@hotmail.com")
                            .type(HrisEmailType.HOME)
                            .build()))
                    .employeeNumber("YuOt169CGu")
                    .employmentStatus(EmploymentStatus.ACTIVE)
                    .employmentType(HrisEmployeeEmploymentType.VOLUNTEER)
                    .firstName("Zetta")
                    .flsaStatus(FlsaStatus.SALARIED_NONEXEMPT)
                    .gender(HrisEmployeeGender.INTERSEX)
                    .hasMfa(false)
                    .hiredAt(OffsetDateTime.parse("2023-05-23T12:33:34.361Z"))
                    .id("f243822e-0b4a-408c-8fe0-cdf632ee3124")
                    .imageUrl("https://loremflickr.com/3684/2116?lock=4686991638584456")
                    .languageLocale("es")
                    .lastName("Prohaska")
                    .locations(List.of())
                    .maritalStatus(MaritalStatus.MARRIED)
                    .metadata(List.of(
                        HrisMetadata.builder()
                            .extraData(HrisMetadataExtraData.of(Map.ofEntries(
                                Map.entry("display_name", "Custom Property"))))
                            .format(HrisMetadataFormat.TEXT)
                            .id("08f3f2c1-d5c6-4e3f-8b72-7fab1184f197")
                            .namespace("custom")
                            .slug("custom_property")
                            .value(HrisMetadataValue.of("appono"))
                            .build()))
                    .name("Zetta Prohaska")
                    .payFrequency(PayFrequency.BIWEEKLY)
                    .pronouns("she/her")
                    .relationships(List.of(
                        HrisEmployeerelationship.builder()
                            .emails(List.of(
                                HrisEmail.builder()
                                    .email("Deshaun.Sanford24@yahoo.com")
                                    .build(),
                                HrisEmail.builder()
                                    .email("Rebeca.Dibbert11@hotmail.com")
                                    .build(),
                                HrisEmail.builder()
                                    .email("Hester80@gmail.com")
                                    .build()))
                            .name("Automotive")
                            .type(HrisEmployeerelationshipType.FRIEND)
                            .build(),
                        HrisEmployeerelationship.builder()
                            .emails(List.of(
                                HrisEmail.builder()
                                    .email("Benedict_Wisozk83@hotmail.com")
                                    .build()))
                            .name("Music")
                            .type(HrisEmployeerelationshipType.SIBLING)
                            .build(),
                        HrisEmployeerelationship.builder()
                            .emails(List.of(
                                HrisEmail.builder()
                                    .email("Margot11@yahoo.com")
                                    .build(),
                                HrisEmail.builder()
                                    .email("Jaden_Miller@gmail.com")
                                    .build()))
                            .name("Electronics")
                            .type(HrisEmployeerelationshipType.OTHER)
                            .build()))
                    .salutation("Miss")
                    .ssnSin("yMRtj0Q3xO")
                    .storageQuotaAllocated(7748057d)
                    .storageQuotaAvailable(1590710d)
                    .storageQuotaUsed(730343d)
                    .telephones(List.of(
                        HrisTelephone.builder()
                            .telephone("(409) 801-3705")
                            .type(HrisTelephoneType.FAX)
                            .build()))
                    .terminationReason("Communis adnuo damnatio atavus terebro acies canis cogito triumphus creber temptatio defendo cubo amissio paulatim corroboro.")
                    .timeoffDaysTotal(12d)
                    .timeoffDaysUsed(6d)
                    .timezone("Africa/Harare")
                    .title("Investor Paradigm Liaison")
                    .updatedAt(OffsetDateTime.parse("2022-02-27T20:15:32.788Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateHrisEmployeeResponse res = sdk.employee().updateHrisEmployee()
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