# Crm

## Overview

### Available Operations

* [createCrmCompany](#createcrmcompany) - Create a company
* [createCrmContact](#createcrmcontact) - Create a contact
* [createCrmDeal](#createcrmdeal) - Create a deal
* [createCrmEvent](#createcrmevent) - Create an event
* [createCrmLead](#createcrmlead) - Create a lead
* [createCrmPipeline](#createcrmpipeline) - Create a pipeline
* [getCrmCompany](#getcrmcompany) - Retrieve a company
* [getCrmContact](#getcrmcontact) - Retrieve a contact
* [getCrmDeal](#getcrmdeal) - Retrieve a deal
* [getCrmEvent](#getcrmevent) - Retrieve an event
* [getCrmLead](#getcrmlead) - Retrieve a lead
* [getCrmPipeline](#getcrmpipeline) - Retrieve a pipeline
* [listCrmCompanies](#listcrmcompanies) - List all companies
* [listCrmContacts](#listcrmcontacts) - List all contacts
* [listCrmDeals](#listcrmdeals) - List all deals
* [listCrmEvents](#listcrmevents) - List all events
* [listCrmLeads](#listcrmleads) - List all leads
* [listCrmPipelines](#listcrmpipelines) - List all pipelines
* [listCrmTaxonomies](#listcrmtaxonomies) - List all taxonomies
* [patchCrmCompany](#patchcrmcompany) - Update a company
* [patchCrmContact](#patchcrmcontact) - Update a contact
* [patchCrmDeal](#patchcrmdeal) - Update a deal
* [patchCrmEvent](#patchcrmevent) - Update an event
* [patchCrmLead](#patchcrmlead) - Update a lead
* [patchCrmPipeline](#patchcrmpipeline) - Update a pipeline
* [removeCrmCompany](#removecrmcompany) - Remove a company
* [removeCrmContact](#removecrmcontact) - Remove a contact
* [removeCrmDeal](#removecrmdeal) - Remove a deal
* [removeCrmEvent](#removecrmevent) - Remove an event
* [removeCrmLead](#removecrmlead) - Remove a lead
* [removeCrmPipeline](#removecrmpipeline) - Remove a pipeline
* [updateCrmCompany](#updatecrmcompany) - Update a company
* [updateCrmContact](#updatecrmcontact) - Update a contact
* [updateCrmDeal](#updatecrmdeal) - Update a deal
* [updateCrmEvent](#updatecrmevent) - Update an event
* [updateCrmLead](#updatecrmlead) - Update a lead
* [updateCrmPipeline](#updatecrmpipeline) - Update a pipeline

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
                        .address1("3328 Wunsch Flat")
                        .address2("Suite 905")
                        .city("New Ryderfort")
                        .countryCode("US")
                        .postalCode("04674")
                        .region("Delaware")
                        .regionCode("NY")
                        .build())
                    .createdAt(OffsetDateTime.parse("2020-05-11T18:26:32.925Z"))
                    .description("Venustas cruentus votum patruus terebro.")
                    .domains(List.of(
                        "goodwinsons.com"))
                    .emails(List.of(
                        CrmEmail.builder()
                            .email("info@goodwinsons.com")
                            .type(CrmEmailType.WORK)
                            .build(),
                        CrmEmail.builder()
                            .email("sales@goodwinsons.com")
                            .type(CrmEmailType.WORK)
                            .build(),
                        CrmEmail.builder()
                            .email("support@goodwinsons.com")
                            .type(CrmEmailType.WORK)
                            .build()))
                    .employees(4177d)
                    .id("336c3fcd-902d-45fa-90f8-8df365343f61")
                    .industry("Metrics")
                    .isActive(true)
                    .linkUrls(List.of(
                        "https://www.linkedin.com/company/goodwin-and-sons"))
                    .metadata(List.of(
                        CrmMetadata.builder()
                            .extraData(CrmMetadataExtraData.of(Map.ofEntries(
                                Map.entry("display_name", "Custom Property"))))
                            .format(CrmMetadataFormat.TEXT)
                            .id("bd33b3c2-c4f5-4a26-81e4-518100efbcc9")
                            .namespace("custom")
                            .slug("custom_property")
                            .value(CrmMetadataValue.of("unde"))
                            .build()))
                    .name("Goodwin and Sons")
                    .tags(List.of(
                        "censura",
                        "abstergo",
                        "ipsam"))
                    .telephones(List.of(
                        CrmTelephone.builder()
                            .telephone("(667) 607-5872")
                            .type(CrmTelephoneType.HOME)
                            .build()))
                    .timezone("Atlantic/Azores")
                    .updatedAt(OffsetDateTime.parse("2025-03-02T06:04:50.216Z"))
                    .websites(List.of(
                        "https://www.goodwinsons.com"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateCrmCompanyResponse res = sdk.crm().createCrmCompany()
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

## createCrmContact

Create a contact

### Example Usage

<!-- UsageSnippet language="java" operationID="createCrmContact" method="post" path="/crm/{connection_id}/contact" example="crm_contact" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateCrmContactRequest;
import to.unified.unified_java_sdk.models.operations.CreateCrmContactResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateCrmContactRequest req = CreateCrmContactRequest.builder()
                .crmContact(CrmContact.builder()
                    .address(PropertyCrmContactAddress.builder()
                        .address1("65838 College Avenue")
                        .address2("Apt. 335")
                        .city("Fort Alexandratown")
                        .countryCode("US")
                        .postalCode("80888-6094")
                        .region("Montana")
                        .regionCode("NM")
                        .build())
                    .createdAt(OffsetDateTime.parse("2021-01-02T00:41:38.885Z"))
                    .department("Beauty")
                    .emails(List.of(
                        CrmEmail.builder()
                            .email("mohammad.bartell@hotmail.com")
                            .type(CrmEmailType.HOME)
                            .build()))
                    .firstName("Mohammad")
                    .id("876d8794-2c3a-44a4-b78b-a392b9c0a25b")
                    .imageUrl("https://avatars.githubusercontent.com/u/26803724")
                    .lastName("Bartell")
                    .linkUrls(List.of(
                        "https://www.linkedin.com/in/mohammad-bartell"))
                    .metadata(List.of(
                        CrmMetadata.builder()
                            .extraData(CrmMetadataExtraData.of(Map.ofEntries(
                                Map.entry("display_name", "Custom Property"))))
                            .format(CrmMetadataFormat.TEXT)
                            .id("e1603bb3-4898-4105-a1d1-4d37408a6a49")
                            .namespace("custom")
                            .slug("custom_property")
                            .value(CrmMetadataValue.of("antiquus"))
                            .build()))
                    .name("Mohammad Bartell")
                    .telephones(List.of(
                        CrmTelephone.builder()
                            .telephone("(254) 404-3529")
                            .type(CrmTelephoneType.OTHER)
                            .build(),
                        CrmTelephone.builder()
                            .telephone("(469) 989-7588")
                            .type(CrmTelephoneType.WORK)
                            .build()))
                    .title("National Tactics Analyst")
                    .updatedAt(OffsetDateTime.parse("2021-02-24T04:22:48.848Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateCrmContactResponse res = sdk.crm().createCrmContact()
                .request(req)
                .call();

        if (res.crmContact().isPresent()) {
            System.out.println(res.crmContact().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [CreateCrmContactRequest](../../models/operations/CreateCrmContactRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[CreateCrmContactResponse](../../models/operations/CreateCrmContactResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

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
                    .closedAt(OffsetDateTime.parse("2024-03-10T04:05:21.178Z"))
                    .closingAt(OffsetDateTime.parse("2025-08-30T17:37:18.528Z"))
                    .createdAt(OffsetDateTime.parse("2023-07-04T12:48:48.470Z"))
                    .currency("USD")
                    .description("Comis tepidus sit cavus crustulum trans tubineus adfectus.")
                    .id("d46548b5-8bb6-4bdd-bb06-6783d8404f7f")
                    .metadata(List.of(
                        CrmMetadata.builder()
                            .extraData(CrmMetadataExtraData.of(Map.ofEntries(
                                Map.entry("display_name", "Custom Property"))))
                            .format(CrmMetadataFormat.TEXT)
                            .id("f26cb4a4-c57d-4a16-8684-ff63d3765543")
                            .namespace("custom")
                            .slug("custom_property")
                            .value(CrmMetadataValue.of("conatus"))
                            .build()))
                    .name("Stoltenberg - Funk - Luxurious Rubber Chicken")
                    .probability(42d)
                    .source("cubo")
                    .tags(List.of(
                        "causa",
                        "suus"))
                    .updatedAt(OffsetDateTime.parse("2024-10-11T10:00:15.170Z"))
                    .wonReason("Usque libero soleo.")
                    .build())
                .connectionId("<id>")
                .build();

        CreateCrmDealResponse res = sdk.crm().createCrmDeal()
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

## createCrmEvent

Create an event

### Example Usage

<!-- UsageSnippet language="java" operationID="createCrmEvent" method="post" path="/crm/{connection_id}/event" example="crm_event" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateCrmEventRequest;
import to.unified.unified_java_sdk.models.operations.CreateCrmEventResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateCrmEventRequest req = CreateCrmEventRequest.builder()
                .crmEvent(CrmEvent.builder()
                    .call(PropertyCrmEventCall.builder()
                        .description("Arbitro aptus.")
                        .duration(64d)
                        .startAt(OffsetDateTime.parse("2024-12-10T04:23:26.129Z"))
                        .build())
                    .createdAt(OffsetDateTime.parse("2020-07-14T04:53:23.784Z"))
                    .id("007dbc50-0981-4467-94be-36d3cd65c1ea")
                    .metadata(List.of())
                    .type(CrmEventType.CALL)
                    .updatedAt(OffsetDateTime.parse("2026-10-10T08:01:43.931Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateCrmEventResponse res = sdk.crm().createCrmEvent()
                .request(req)
                .call();

        if (res.crmEvent().isPresent()) {
            System.out.println(res.crmEvent().get());
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [CreateCrmEventRequest](../../models/operations/CreateCrmEventRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[CreateCrmEventResponse](../../models/operations/CreateCrmEventResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createCrmLead

Create a lead

### Example Usage

<!-- UsageSnippet language="java" operationID="createCrmLead" method="post" path="/crm/{connection_id}/lead" example="crm_lead" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateCrmLeadRequest;
import to.unified.unified_java_sdk.models.operations.CreateCrmLeadResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateCrmLeadRequest req = CreateCrmLeadRequest.builder()
                .crmLead(CrmLead.builder()
                    .address(PropertyCrmLeadAddress.builder()
                        .address1("87206 Hudson Street")
                        .city("Leslieboro")
                        .countryCode("US")
                        .postalCode("49909-1183")
                        .region("Michigan")
                        .regionCode("MO")
                        .build())
                    .companyName("Tillman - Wiegand")
                    .createdAt(OffsetDateTime.parse("2019-10-12T11:27:59.003Z"))
                    .emails(List.of(
                        CrmEmail.builder()
                            .email("velda.sporer@icloud.com")
                            .type(CrmEmailType.WORK)
                            .build()))
                    .firstName("Velda")
                    .id("d3466dda-7c51-471e-8884-b433dfcd5eb2")
                    .isActive(true)
                    .lastName("Sporer")
                    .linkUrls(List.of(
                        "https://www.linkedin.com/in/velda-sporer"))
                    .metadata(List.of(
                        CrmMetadata.builder()
                            .extraData(CrmMetadataExtraData.of(Map.ofEntries(
                                Map.entry("display_name", "Custom Property"))))
                            .format(CrmMetadataFormat.TEXT)
                            .id("eed32765-2330-4461-97e8-4f8322fb5c72")
                            .namespace("custom")
                            .slug("custom_property")
                            .value(CrmMetadataValue.of("vitiosus"))
                            .build()))
                    .name("Velda Sporer")
                    .source("Advertisement")
                    .status("New")
                    .telephones(List.of(
                        CrmTelephone.builder()
                            .telephone("(841) 271-0595")
                            .type(CrmTelephoneType.FAX)
                            .build(),
                        CrmTelephone.builder()
                            .telephone("(664) 498-4952")
                            .type(CrmTelephoneType.HOME)
                            .build(),
                        CrmTelephone.builder()
                            .telephone("(281) 288-0037")
                            .type(CrmTelephoneType.OTHER)
                            .build()))
                    .title("International Factors Administrator")
                    .updatedAt(OffsetDateTime.parse("2020-05-17T19:06:35.607Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateCrmLeadResponse res = sdk.crm().createCrmLead()
                .request(req)
                .call();

        if (res.crmLead().isPresent()) {
            System.out.println(res.crmLead().get());
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [CreateCrmLeadRequest](../../models/operations/CreateCrmLeadRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[CreateCrmLeadResponse](../../models/operations/CreateCrmLeadResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createCrmPipeline

Create a pipeline

### Example Usage

<!-- UsageSnippet language="java" operationID="createCrmPipeline" method="post" path="/crm/{connection_id}/pipeline" example="crm_pipeline" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateCrmPipelineRequest;
import to.unified.unified_java_sdk.models.operations.CreateCrmPipelineResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateCrmPipelineRequest req = CreateCrmPipelineRequest.builder()
                .crmPipeline(CrmPipeline.builder()
                    .createdAt(OffsetDateTime.parse("2022-12-28T13:45:38.446Z"))
                    .dealProbability(99d)
                    .displayOrder(8d)
                    .id("f263bc29-7932-4476-91df-90221fe5fd79")
                    .isActive(true)
                    .metadata(List.of())
                    .name("Small Steel Bacon")
                    .stages(List.of(
                        CrmStage.builder()
                            .active(false)
                            .createdAt(OffsetDateTime.parse("2022-12-28T13:45:38.446Z"))
                            .dealProbability(84d)
                            .displayOrder(72d)
                            .id("fe1f6a22-78b8-40b1-8d2d-957b5d98c14d")
                            .isClosed(true)
                            .name("Veniam.")
                            .updatedAt(OffsetDateTime.parse("2025-10-09T15:16:51.700Z"))
                            .build()))
                    .updatedAt(OffsetDateTime.parse("2025-10-31T08:16:01.208Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateCrmPipelineResponse res = sdk.crm().createCrmPipeline()
                .request(req)
                .call();

        if (res.crmPipeline().isPresent()) {
            System.out.println(res.crmPipeline().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [CreateCrmPipelineRequest](../../models/operations/CreateCrmPipelineRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[CreateCrmPipelineResponse](../../models/operations/CreateCrmPipelineResponse.md)**

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

        GetCrmCompanyResponse res = sdk.crm().getCrmCompany()
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

## getCrmContact

Retrieve a contact

### Example Usage

<!-- UsageSnippet language="java" operationID="getCrmContact" method="get" path="/crm/{connection_id}/contact/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetCrmContactRequest;
import to.unified.unified_java_sdk.models.operations.GetCrmContactResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetCrmContactRequest req = GetCrmContactRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetCrmContactResponse res = sdk.crm().getCrmContact()
                .request(req)
                .call();

        if (res.crmContact().isPresent()) {
            System.out.println(res.crmContact().get());
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [GetCrmContactRequest](../../models/operations/GetCrmContactRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[GetCrmContactResponse](../../models/operations/GetCrmContactResponse.md)**

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

        GetCrmDealResponse res = sdk.crm().getCrmDeal()
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

## getCrmEvent

Retrieve an event

### Example Usage

<!-- UsageSnippet language="java" operationID="getCrmEvent" method="get" path="/crm/{connection_id}/event/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetCrmEventRequest;
import to.unified.unified_java_sdk.models.operations.GetCrmEventResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetCrmEventRequest req = GetCrmEventRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetCrmEventResponse res = sdk.crm().getCrmEvent()
                .request(req)
                .call();

        if (res.crmEvent().isPresent()) {
            System.out.println(res.crmEvent().get());
        }
    }
}
```

### Parameters

| Parameter                                                           | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `request`                                                           | [GetCrmEventRequest](../../models/operations/GetCrmEventRequest.md) | :heavy_check_mark:                                                  | The request object to use for the request.                          |

### Response

**[GetCrmEventResponse](../../models/operations/GetCrmEventResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getCrmLead

Retrieve a lead

### Example Usage

<!-- UsageSnippet language="java" operationID="getCrmLead" method="get" path="/crm/{connection_id}/lead/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetCrmLeadRequest;
import to.unified.unified_java_sdk.models.operations.GetCrmLeadResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetCrmLeadRequest req = GetCrmLeadRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetCrmLeadResponse res = sdk.crm().getCrmLead()
                .request(req)
                .call();

        if (res.crmLead().isPresent()) {
            System.out.println(res.crmLead().get());
        }
    }
}
```

### Parameters

| Parameter                                                         | Type                                                              | Required                                                          | Description                                                       |
| ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- |
| `request`                                                         | [GetCrmLeadRequest](../../models/operations/GetCrmLeadRequest.md) | :heavy_check_mark:                                                | The request object to use for the request.                        |

### Response

**[GetCrmLeadResponse](../../models/operations/GetCrmLeadResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getCrmPipeline

Retrieve a pipeline

### Example Usage

<!-- UsageSnippet language="java" operationID="getCrmPipeline" method="get" path="/crm/{connection_id}/pipeline/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetCrmPipelineRequest;
import to.unified.unified_java_sdk.models.operations.GetCrmPipelineResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetCrmPipelineRequest req = GetCrmPipelineRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetCrmPipelineResponse res = sdk.crm().getCrmPipeline()
                .request(req)
                .call();

        if (res.crmPipeline().isPresent()) {
            System.out.println(res.crmPipeline().get());
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [GetCrmPipelineRequest](../../models/operations/GetCrmPipelineRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[GetCrmPipelineResponse](../../models/operations/GetCrmPipelineResponse.md)**

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

        ListCrmCompaniesResponse res = sdk.crm().listCrmCompanies()
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

## listCrmContacts

List all contacts

### Example Usage

<!-- UsageSnippet language="java" operationID="listCrmContacts" method="get" path="/crm/{connection_id}/contact" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListCrmContactsRequest;
import to.unified.unified_java_sdk.models.operations.ListCrmContactsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListCrmContactsRequest req = ListCrmContactsRequest.builder()
                .connectionId("<id>")
                .build();

        ListCrmContactsResponse res = sdk.crm().listCrmContacts()
                .request(req)
                .call();

        if (res.crmContacts().isPresent()) {
            System.out.println(res.crmContacts().get());
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [ListCrmContactsRequest](../../models/operations/ListCrmContactsRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[ListCrmContactsResponse](../../models/operations/ListCrmContactsResponse.md)**

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

        ListCrmDealsResponse res = sdk.crm().listCrmDeals()
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

## listCrmEvents

List all events

### Example Usage

<!-- UsageSnippet language="java" operationID="listCrmEvents" method="get" path="/crm/{connection_id}/event" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListCrmEventsRequest;
import to.unified.unified_java_sdk.models.operations.ListCrmEventsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListCrmEventsRequest req = ListCrmEventsRequest.builder()
                .connectionId("<id>")
                .build();

        ListCrmEventsResponse res = sdk.crm().listCrmEvents()
                .request(req)
                .call();

        if (res.crmEvents().isPresent()) {
            System.out.println(res.crmEvents().get());
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [ListCrmEventsRequest](../../models/operations/ListCrmEventsRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[ListCrmEventsResponse](../../models/operations/ListCrmEventsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listCrmLeads

List all leads

### Example Usage

<!-- UsageSnippet language="java" operationID="listCrmLeads" method="get" path="/crm/{connection_id}/lead" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListCrmLeadsRequest;
import to.unified.unified_java_sdk.models.operations.ListCrmLeadsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListCrmLeadsRequest req = ListCrmLeadsRequest.builder()
                .connectionId("<id>")
                .build();

        ListCrmLeadsResponse res = sdk.crm().listCrmLeads()
                .request(req)
                .call();

        if (res.crmLeads().isPresent()) {
            System.out.println(res.crmLeads().get());
        }
    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [ListCrmLeadsRequest](../../models/operations/ListCrmLeadsRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[ListCrmLeadsResponse](../../models/operations/ListCrmLeadsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listCrmPipelines

List all pipelines

### Example Usage

<!-- UsageSnippet language="java" operationID="listCrmPipelines" method="get" path="/crm/{connection_id}/pipeline" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListCrmPipelinesRequest;
import to.unified.unified_java_sdk.models.operations.ListCrmPipelinesResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListCrmPipelinesRequest req = ListCrmPipelinesRequest.builder()
                .connectionId("<id>")
                .build();

        ListCrmPipelinesResponse res = sdk.crm().listCrmPipelines()
                .request(req)
                .call();

        if (res.crmPipelines().isPresent()) {
            System.out.println(res.crmPipelines().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [ListCrmPipelinesRequest](../../models/operations/ListCrmPipelinesRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[ListCrmPipelinesResponse](../../models/operations/ListCrmPipelinesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listCrmTaxonomies

List all taxonomies

### Example Usage

<!-- UsageSnippet language="java" operationID="listCrmTaxonomies" method="get" path="/crm/{connection_id}/taxonomy" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListCrmTaxonomiesRequest;
import to.unified.unified_java_sdk.models.operations.ListCrmTaxonomiesResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListCrmTaxonomiesRequest req = ListCrmTaxonomiesRequest.builder()
                .connectionId("<id>")
                .build();

        ListCrmTaxonomiesResponse res = sdk.crm().listCrmTaxonomies()
                .request(req)
                .call();

        if (res.crmTaxonomies().isPresent()) {
            System.out.println(res.crmTaxonomies().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [ListCrmTaxonomiesRequest](../../models/operations/ListCrmTaxonomiesRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[ListCrmTaxonomiesResponse](../../models/operations/ListCrmTaxonomiesResponse.md)**

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
                        .address1("3328 Wunsch Flat")
                        .address2("Suite 905")
                        .city("New Ryderfort")
                        .countryCode("US")
                        .postalCode("04674")
                        .region("Delaware")
                        .regionCode("NY")
                        .build())
                    .createdAt(OffsetDateTime.parse("2020-05-11T18:26:32.925Z"))
                    .description("Venustas cruentus votum patruus terebro.")
                    .domains(List.of(
                        "goodwinsons.com"))
                    .emails(List.of(
                        CrmEmail.builder()
                            .email("info@goodwinsons.com")
                            .type(CrmEmailType.WORK)
                            .build(),
                        CrmEmail.builder()
                            .email("sales@goodwinsons.com")
                            .type(CrmEmailType.WORK)
                            .build(),
                        CrmEmail.builder()
                            .email("support@goodwinsons.com")
                            .type(CrmEmailType.WORK)
                            .build()))
                    .employees(4177d)
                    .id("990fc194-d42e-4046-a9b9-cbddf78ecf7b")
                    .industry("Metrics")
                    .isActive(true)
                    .linkUrls(List.of(
                        "https://www.linkedin.com/company/goodwin-and-sons"))
                    .metadata(List.of(
                        CrmMetadata.builder()
                            .extraData(CrmMetadataExtraData.of(Map.ofEntries(
                                Map.entry("display_name", "Custom Property"))))
                            .format(CrmMetadataFormat.TEXT)
                            .id("7127d8eb-fc60-49d0-b798-b85e108a2dac")
                            .namespace("custom")
                            .slug("custom_property")
                            .value(CrmMetadataValue.of("unde"))
                            .build()))
                    .name("Goodwin and Sons")
                    .tags(List.of(
                        "censura",
                        "abstergo",
                        "ipsam"))
                    .telephones(List.of(
                        CrmTelephone.builder()
                            .telephone("(667) 607-5872")
                            .type(CrmTelephoneType.HOME)
                            .build()))
                    .timezone("Atlantic/Azores")
                    .updatedAt(OffsetDateTime.parse("2025-03-02T06:04:50.249Z"))
                    .websites(List.of(
                        "https://www.goodwinsons.com"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchCrmCompanyResponse res = sdk.crm().patchCrmCompany()
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

## patchCrmContact

Update a contact

### Example Usage

<!-- UsageSnippet language="java" operationID="patchCrmContact" method="patch" path="/crm/{connection_id}/contact/{id}" example="crm_contact" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchCrmContactRequest;
import to.unified.unified_java_sdk.models.operations.PatchCrmContactResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchCrmContactRequest req = PatchCrmContactRequest.builder()
                .crmContact(CrmContact.builder()
                    .address(PropertyCrmContactAddress.builder()
                        .address1("65838 College Avenue")
                        .address2("Apt. 335")
                        .city("Fort Alexandratown")
                        .countryCode("US")
                        .postalCode("80888-6094")
                        .region("Montana")
                        .regionCode("NM")
                        .build())
                    .createdAt(OffsetDateTime.parse("2021-01-02T00:41:38.885Z"))
                    .department("Beauty")
                    .emails(List.of(
                        CrmEmail.builder()
                            .email("mohammad.bartell@hotmail.com")
                            .type(CrmEmailType.HOME)
                            .build()))
                    .firstName("Mohammad")
                    .id("e03138ca-2475-412c-943e-3e39c8cbdd98")
                    .imageUrl("https://avatars.githubusercontent.com/u/26803724")
                    .lastName("Bartell")
                    .linkUrls(List.of(
                        "https://www.linkedin.com/in/mohammad-bartell"))
                    .metadata(List.of(
                        CrmMetadata.builder()
                            .extraData(CrmMetadataExtraData.of(Map.ofEntries(
                                Map.entry("display_name", "Custom Property"))))
                            .format(CrmMetadataFormat.TEXT)
                            .id("3c9f7376-cbb5-4697-9fa6-38f8b8c07c0c")
                            .namespace("custom")
                            .slug("custom_property")
                            .value(CrmMetadataValue.of("antiquus"))
                            .build()))
                    .name("Mohammad Bartell")
                    .telephones(List.of(
                        CrmTelephone.builder()
                            .telephone("(254) 404-3529")
                            .type(CrmTelephoneType.OTHER)
                            .build(),
                        CrmTelephone.builder()
                            .telephone("(469) 989-7588")
                            .type(CrmTelephoneType.WORK)
                            .build()))
                    .title("National Tactics Analyst")
                    .updatedAt(OffsetDateTime.parse("2021-02-24T04:22:48.849Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchCrmContactResponse res = sdk.crm().patchCrmContact()
                .request(req)
                .call();

        if (res.crmContact().isPresent()) {
            System.out.println(res.crmContact().get());
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [PatchCrmContactRequest](../../models/operations/PatchCrmContactRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[PatchCrmContactResponse](../../models/operations/PatchCrmContactResponse.md)**

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
                    .closedAt(OffsetDateTime.parse("2024-03-10T04:05:21.183Z"))
                    .closingAt(OffsetDateTime.parse("2025-08-30T17:37:18.542Z"))
                    .createdAt(OffsetDateTime.parse("2023-07-04T12:48:48.470Z"))
                    .currency("USD")
                    .description("Comis tepidus sit cavus crustulum trans tubineus adfectus.")
                    .id("4131863a-3852-4cbc-8f4e-de24af6c1497")
                    .metadata(List.of(
                        CrmMetadata.builder()
                            .extraData(CrmMetadataExtraData.of(Map.ofEntries(
                                Map.entry("display_name", "Custom Property"))))
                            .format(CrmMetadataFormat.TEXT)
                            .id("b7ecc6f4-e166-4068-9b21-bf504ec40239")
                            .namespace("custom")
                            .slug("custom_property")
                            .value(CrmMetadataValue.of("conatus"))
                            .build()))
                    .name("Stoltenberg - Funk - Luxurious Rubber Chicken")
                    .probability(42d)
                    .source("cubo")
                    .tags(List.of(
                        "causa",
                        "suus"))
                    .updatedAt(OffsetDateTime.parse("2024-10-11T10:00:15.179Z"))
                    .wonReason("Usque libero soleo.")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchCrmDealResponse res = sdk.crm().patchCrmDeal()
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

## patchCrmEvent

Update an event

### Example Usage

<!-- UsageSnippet language="java" operationID="patchCrmEvent" method="patch" path="/crm/{connection_id}/event/{id}" example="crm_event" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchCrmEventRequest;
import to.unified.unified_java_sdk.models.operations.PatchCrmEventResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchCrmEventRequest req = PatchCrmEventRequest.builder()
                .crmEvent(CrmEvent.builder()
                    .call(PropertyCrmEventCall.builder()
                        .description("Arbitro aptus.")
                        .duration(64d)
                        .startAt(OffsetDateTime.parse("2024-12-10T04:23:26.176Z"))
                        .build())
                    .createdAt(OffsetDateTime.parse("2020-07-14T04:53:23.784Z"))
                    .id("1e37c4ca-805c-4ac6-a935-d9235a179c75")
                    .metadata(List.of())
                    .type(CrmEventType.CALL)
                    .updatedAt(OffsetDateTime.parse("2026-10-10T08:01:43.997Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchCrmEventResponse res = sdk.crm().patchCrmEvent()
                .request(req)
                .call();

        if (res.crmEvent().isPresent()) {
            System.out.println(res.crmEvent().get());
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [PatchCrmEventRequest](../../models/operations/PatchCrmEventRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[PatchCrmEventResponse](../../models/operations/PatchCrmEventResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchCrmLead

Update a lead

### Example Usage

<!-- UsageSnippet language="java" operationID="patchCrmLead" method="patch" path="/crm/{connection_id}/lead/{id}" example="crm_lead" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchCrmLeadRequest;
import to.unified.unified_java_sdk.models.operations.PatchCrmLeadResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchCrmLeadRequest req = PatchCrmLeadRequest.builder()
                .crmLead(CrmLead.builder()
                    .address(PropertyCrmLeadAddress.builder()
                        .address1("87206 Hudson Street")
                        .city("Leslieboro")
                        .countryCode("US")
                        .postalCode("49909-1183")
                        .region("Michigan")
                        .regionCode("MO")
                        .build())
                    .companyName("Tillman - Wiegand")
                    .createdAt(OffsetDateTime.parse("2019-10-12T11:27:59.003Z"))
                    .emails(List.of(
                        CrmEmail.builder()
                            .email("velda.sporer@icloud.com")
                            .type(CrmEmailType.WORK)
                            .build()))
                    .firstName("Velda")
                    .id("fe571748-f6f5-47e6-8efc-374dfab63d27")
                    .isActive(true)
                    .lastName("Sporer")
                    .linkUrls(List.of(
                        "https://www.linkedin.com/in/velda-sporer"))
                    .metadata(List.of(
                        CrmMetadata.builder()
                            .extraData(CrmMetadataExtraData.of(Map.ofEntries(
                                Map.entry("display_name", "Custom Property"))))
                            .format(CrmMetadataFormat.TEXT)
                            .id("bbdd7d6b-e833-40f5-863c-5dcc04d14a4d")
                            .namespace("custom")
                            .slug("custom_property")
                            .value(CrmMetadataValue.of("vitiosus"))
                            .build()))
                    .name("Velda Sporer")
                    .source("Advertisement")
                    .status("New")
                    .telephones(List.of(
                        CrmTelephone.builder()
                            .telephone("(841) 271-0595")
                            .type(CrmTelephoneType.FAX)
                            .build(),
                        CrmTelephone.builder()
                            .telephone("(664) 498-4952")
                            .type(CrmTelephoneType.HOME)
                            .build(),
                        CrmTelephone.builder()
                            .telephone("(281) 288-0037")
                            .type(CrmTelephoneType.OTHER)
                            .build()))
                    .title("International Factors Administrator")
                    .updatedAt(OffsetDateTime.parse("2020-05-17T19:06:35.611Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchCrmLeadResponse res = sdk.crm().patchCrmLead()
                .request(req)
                .call();

        if (res.crmLead().isPresent()) {
            System.out.println(res.crmLead().get());
        }
    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [PatchCrmLeadRequest](../../models/operations/PatchCrmLeadRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[PatchCrmLeadResponse](../../models/operations/PatchCrmLeadResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchCrmPipeline

Update a pipeline

### Example Usage

<!-- UsageSnippet language="java" operationID="patchCrmPipeline" method="patch" path="/crm/{connection_id}/pipeline/{id}" example="crm_pipeline" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchCrmPipelineRequest;
import to.unified.unified_java_sdk.models.operations.PatchCrmPipelineResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchCrmPipelineRequest req = PatchCrmPipelineRequest.builder()
                .crmPipeline(CrmPipeline.builder()
                    .createdAt(OffsetDateTime.parse("2022-12-28T13:45:38.446Z"))
                    .dealProbability(99d)
                    .displayOrder(8d)
                    .id("69ea6262-488a-4258-9dd9-065b72211fab")
                    .isActive(true)
                    .metadata(List.of())
                    .name("Small Steel Bacon")
                    .stages(List.of(
                        CrmStage.builder()
                            .active(false)
                            .createdAt(OffsetDateTime.parse("2022-12-28T13:45:38.446Z"))
                            .dealProbability(84d)
                            .displayOrder(72d)
                            .id("3729af60-1866-4c5e-9c78-2d2caa6aa428")
                            .isClosed(true)
                            .name("Veniam.")
                            .updatedAt(OffsetDateTime.parse("2025-10-09T15:16:51.713Z"))
                            .build()))
                    .updatedAt(OffsetDateTime.parse("2025-10-31T08:16:01.221Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchCrmPipelineResponse res = sdk.crm().patchCrmPipeline()
                .request(req)
                .call();

        if (res.crmPipeline().isPresent()) {
            System.out.println(res.crmPipeline().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [PatchCrmPipelineRequest](../../models/operations/PatchCrmPipelineRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[PatchCrmPipelineResponse](../../models/operations/PatchCrmPipelineResponse.md)**

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

        RemoveCrmCompanyResponse res = sdk.crm().removeCrmCompany()
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

## removeCrmContact

Remove a contact

### Example Usage

<!-- UsageSnippet language="java" operationID="removeCrmContact" method="delete" path="/crm/{connection_id}/contact/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveCrmContactRequest;
import to.unified.unified_java_sdk.models.operations.RemoveCrmContactResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveCrmContactRequest req = RemoveCrmContactRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveCrmContactResponse res = sdk.crm().removeCrmContact()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [RemoveCrmContactRequest](../../models/operations/RemoveCrmContactRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[RemoveCrmContactResponse](../../models/operations/RemoveCrmContactResponse.md)**

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

        RemoveCrmDealResponse res = sdk.crm().removeCrmDeal()
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

## removeCrmEvent

Remove an event

### Example Usage

<!-- UsageSnippet language="java" operationID="removeCrmEvent" method="delete" path="/crm/{connection_id}/event/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveCrmEventRequest;
import to.unified.unified_java_sdk.models.operations.RemoveCrmEventResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveCrmEventRequest req = RemoveCrmEventRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveCrmEventResponse res = sdk.crm().removeCrmEvent()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [RemoveCrmEventRequest](../../models/operations/RemoveCrmEventRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[RemoveCrmEventResponse](../../models/operations/RemoveCrmEventResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeCrmLead

Remove a lead

### Example Usage

<!-- UsageSnippet language="java" operationID="removeCrmLead" method="delete" path="/crm/{connection_id}/lead/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveCrmLeadRequest;
import to.unified.unified_java_sdk.models.operations.RemoveCrmLeadResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveCrmLeadRequest req = RemoveCrmLeadRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveCrmLeadResponse res = sdk.crm().removeCrmLead()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [RemoveCrmLeadRequest](../../models/operations/RemoveCrmLeadRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[RemoveCrmLeadResponse](../../models/operations/RemoveCrmLeadResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeCrmPipeline

Remove a pipeline

### Example Usage

<!-- UsageSnippet language="java" operationID="removeCrmPipeline" method="delete" path="/crm/{connection_id}/pipeline/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveCrmPipelineRequest;
import to.unified.unified_java_sdk.models.operations.RemoveCrmPipelineResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveCrmPipelineRequest req = RemoveCrmPipelineRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveCrmPipelineResponse res = sdk.crm().removeCrmPipeline()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [RemoveCrmPipelineRequest](../../models/operations/RemoveCrmPipelineRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[RemoveCrmPipelineResponse](../../models/operations/RemoveCrmPipelineResponse.md)**

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
                        .address1("3328 Wunsch Flat")
                        .address2("Suite 905")
                        .city("New Ryderfort")
                        .countryCode("US")
                        .postalCode("04674")
                        .region("Delaware")
                        .regionCode("NY")
                        .build())
                    .createdAt(OffsetDateTime.parse("2020-05-11T18:26:32.925Z"))
                    .description("Venustas cruentus votum patruus terebro.")
                    .domains(List.of(
                        "goodwinsons.com"))
                    .emails(List.of(
                        CrmEmail.builder()
                            .email("info@goodwinsons.com")
                            .type(CrmEmailType.WORK)
                            .build(),
                        CrmEmail.builder()
                            .email("sales@goodwinsons.com")
                            .type(CrmEmailType.WORK)
                            .build(),
                        CrmEmail.builder()
                            .email("support@goodwinsons.com")
                            .type(CrmEmailType.WORK)
                            .build()))
                    .employees(4177d)
                    .id("990fc194-d42e-4046-a9b9-cbddf78ecf7b")
                    .industry("Metrics")
                    .isActive(true)
                    .linkUrls(List.of(
                        "https://www.linkedin.com/company/goodwin-and-sons"))
                    .metadata(List.of(
                        CrmMetadata.builder()
                            .extraData(CrmMetadataExtraData.of(Map.ofEntries(
                                Map.entry("display_name", "Custom Property"))))
                            .format(CrmMetadataFormat.TEXT)
                            .id("7127d8eb-fc60-49d0-b798-b85e108a2dac")
                            .namespace("custom")
                            .slug("custom_property")
                            .value(CrmMetadataValue.of("unde"))
                            .build()))
                    .name("Goodwin and Sons")
                    .tags(List.of(
                        "censura",
                        "abstergo",
                        "ipsam"))
                    .telephones(List.of(
                        CrmTelephone.builder()
                            .telephone("(667) 607-5872")
                            .type(CrmTelephoneType.HOME)
                            .build()))
                    .timezone("Atlantic/Azores")
                    .updatedAt(OffsetDateTime.parse("2025-03-02T06:04:50.249Z"))
                    .websites(List.of(
                        "https://www.goodwinsons.com"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateCrmCompanyResponse res = sdk.crm().updateCrmCompany()
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

## updateCrmContact

Update a contact

### Example Usage

<!-- UsageSnippet language="java" operationID="updateCrmContact" method="put" path="/crm/{connection_id}/contact/{id}" example="crm_contact" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateCrmContactRequest;
import to.unified.unified_java_sdk.models.operations.UpdateCrmContactResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateCrmContactRequest req = UpdateCrmContactRequest.builder()
                .crmContact(CrmContact.builder()
                    .address(PropertyCrmContactAddress.builder()
                        .address1("65838 College Avenue")
                        .address2("Apt. 335")
                        .city("Fort Alexandratown")
                        .countryCode("US")
                        .postalCode("80888-6094")
                        .region("Montana")
                        .regionCode("NM")
                        .build())
                    .createdAt(OffsetDateTime.parse("2021-01-02T00:41:38.885Z"))
                    .department("Beauty")
                    .emails(List.of(
                        CrmEmail.builder()
                            .email("mohammad.bartell@hotmail.com")
                            .type(CrmEmailType.HOME)
                            .build()))
                    .firstName("Mohammad")
                    .id("e03138ca-2475-412c-943e-3e39c8cbdd98")
                    .imageUrl("https://avatars.githubusercontent.com/u/26803724")
                    .lastName("Bartell")
                    .linkUrls(List.of(
                        "https://www.linkedin.com/in/mohammad-bartell"))
                    .metadata(List.of(
                        CrmMetadata.builder()
                            .extraData(CrmMetadataExtraData.of(Map.ofEntries(
                                Map.entry("display_name", "Custom Property"))))
                            .format(CrmMetadataFormat.TEXT)
                            .id("3c9f7376-cbb5-4697-9fa6-38f8b8c07c0c")
                            .namespace("custom")
                            .slug("custom_property")
                            .value(CrmMetadataValue.of("antiquus"))
                            .build()))
                    .name("Mohammad Bartell")
                    .telephones(List.of(
                        CrmTelephone.builder()
                            .telephone("(254) 404-3529")
                            .type(CrmTelephoneType.OTHER)
                            .build(),
                        CrmTelephone.builder()
                            .telephone("(469) 989-7588")
                            .type(CrmTelephoneType.WORK)
                            .build()))
                    .title("National Tactics Analyst")
                    .updatedAt(OffsetDateTime.parse("2021-02-24T04:22:48.849Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateCrmContactResponse res = sdk.crm().updateCrmContact()
                .request(req)
                .call();

        if (res.crmContact().isPresent()) {
            System.out.println(res.crmContact().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [UpdateCrmContactRequest](../../models/operations/UpdateCrmContactRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[UpdateCrmContactResponse](../../models/operations/UpdateCrmContactResponse.md)**

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
                    .closedAt(OffsetDateTime.parse("2024-03-10T04:05:21.183Z"))
                    .closingAt(OffsetDateTime.parse("2025-08-30T17:37:18.542Z"))
                    .createdAt(OffsetDateTime.parse("2023-07-04T12:48:48.470Z"))
                    .currency("USD")
                    .description("Comis tepidus sit cavus crustulum trans tubineus adfectus.")
                    .id("4131863a-3852-4cbc-8f4e-de24af6c1497")
                    .metadata(List.of(
                        CrmMetadata.builder()
                            .extraData(CrmMetadataExtraData.of(Map.ofEntries(
                                Map.entry("display_name", "Custom Property"))))
                            .format(CrmMetadataFormat.TEXT)
                            .id("b7ecc6f4-e166-4068-9b21-bf504ec40239")
                            .namespace("custom")
                            .slug("custom_property")
                            .value(CrmMetadataValue.of("conatus"))
                            .build()))
                    .name("Stoltenberg - Funk - Luxurious Rubber Chicken")
                    .probability(42d)
                    .source("cubo")
                    .tags(List.of(
                        "causa",
                        "suus"))
                    .updatedAt(OffsetDateTime.parse("2024-10-11T10:00:15.179Z"))
                    .wonReason("Usque libero soleo.")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateCrmDealResponse res = sdk.crm().updateCrmDeal()
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

## updateCrmEvent

Update an event

### Example Usage

<!-- UsageSnippet language="java" operationID="updateCrmEvent" method="put" path="/crm/{connection_id}/event/{id}" example="crm_event" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateCrmEventRequest;
import to.unified.unified_java_sdk.models.operations.UpdateCrmEventResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateCrmEventRequest req = UpdateCrmEventRequest.builder()
                .crmEvent(CrmEvent.builder()
                    .call(PropertyCrmEventCall.builder()
                        .description("Arbitro aptus.")
                        .duration(64d)
                        .startAt(OffsetDateTime.parse("2024-12-10T04:23:26.176Z"))
                        .build())
                    .createdAt(OffsetDateTime.parse("2020-07-14T04:53:23.784Z"))
                    .id("1e37c4ca-805c-4ac6-a935-d9235a179c75")
                    .metadata(List.of())
                    .type(CrmEventType.CALL)
                    .updatedAt(OffsetDateTime.parse("2026-10-10T08:01:43.997Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateCrmEventResponse res = sdk.crm().updateCrmEvent()
                .request(req)
                .call();

        if (res.crmEvent().isPresent()) {
            System.out.println(res.crmEvent().get());
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [UpdateCrmEventRequest](../../models/operations/UpdateCrmEventRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[UpdateCrmEventResponse](../../models/operations/UpdateCrmEventResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateCrmLead

Update a lead

### Example Usage

<!-- UsageSnippet language="java" operationID="updateCrmLead" method="put" path="/crm/{connection_id}/lead/{id}" example="crm_lead" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateCrmLeadRequest;
import to.unified.unified_java_sdk.models.operations.UpdateCrmLeadResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateCrmLeadRequest req = UpdateCrmLeadRequest.builder()
                .crmLead(CrmLead.builder()
                    .address(PropertyCrmLeadAddress.builder()
                        .address1("87206 Hudson Street")
                        .city("Leslieboro")
                        .countryCode("US")
                        .postalCode("49909-1183")
                        .region("Michigan")
                        .regionCode("MO")
                        .build())
                    .companyName("Tillman - Wiegand")
                    .createdAt(OffsetDateTime.parse("2019-10-12T11:27:59.003Z"))
                    .emails(List.of(
                        CrmEmail.builder()
                            .email("velda.sporer@icloud.com")
                            .type(CrmEmailType.WORK)
                            .build()))
                    .firstName("Velda")
                    .id("fe571748-f6f5-47e6-8efc-374dfab63d27")
                    .isActive(true)
                    .lastName("Sporer")
                    .linkUrls(List.of(
                        "https://www.linkedin.com/in/velda-sporer"))
                    .metadata(List.of(
                        CrmMetadata.builder()
                            .extraData(CrmMetadataExtraData.of(Map.ofEntries(
                                Map.entry("display_name", "Custom Property"))))
                            .format(CrmMetadataFormat.TEXT)
                            .id("bbdd7d6b-e833-40f5-863c-5dcc04d14a4d")
                            .namespace("custom")
                            .slug("custom_property")
                            .value(CrmMetadataValue.of("vitiosus"))
                            .build()))
                    .name("Velda Sporer")
                    .source("Advertisement")
                    .status("New")
                    .telephones(List.of(
                        CrmTelephone.builder()
                            .telephone("(841) 271-0595")
                            .type(CrmTelephoneType.FAX)
                            .build(),
                        CrmTelephone.builder()
                            .telephone("(664) 498-4952")
                            .type(CrmTelephoneType.HOME)
                            .build(),
                        CrmTelephone.builder()
                            .telephone("(281) 288-0037")
                            .type(CrmTelephoneType.OTHER)
                            .build()))
                    .title("International Factors Administrator")
                    .updatedAt(OffsetDateTime.parse("2020-05-17T19:06:35.611Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateCrmLeadResponse res = sdk.crm().updateCrmLead()
                .request(req)
                .call();

        if (res.crmLead().isPresent()) {
            System.out.println(res.crmLead().get());
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [UpdateCrmLeadRequest](../../models/operations/UpdateCrmLeadRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[UpdateCrmLeadResponse](../../models/operations/UpdateCrmLeadResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateCrmPipeline

Update a pipeline

### Example Usage

<!-- UsageSnippet language="java" operationID="updateCrmPipeline" method="put" path="/crm/{connection_id}/pipeline/{id}" example="crm_pipeline" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateCrmPipelineRequest;
import to.unified.unified_java_sdk.models.operations.UpdateCrmPipelineResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateCrmPipelineRequest req = UpdateCrmPipelineRequest.builder()
                .crmPipeline(CrmPipeline.builder()
                    .createdAt(OffsetDateTime.parse("2022-12-28T13:45:38.446Z"))
                    .dealProbability(99d)
                    .displayOrder(8d)
                    .id("69ea6262-488a-4258-9dd9-065b72211fab")
                    .isActive(true)
                    .metadata(List.of())
                    .name("Small Steel Bacon")
                    .stages(List.of(
                        CrmStage.builder()
                            .active(false)
                            .createdAt(OffsetDateTime.parse("2022-12-28T13:45:38.446Z"))
                            .dealProbability(84d)
                            .displayOrder(72d)
                            .id("3729af60-1866-4c5e-9c78-2d2caa6aa428")
                            .isClosed(true)
                            .name("Veniam.")
                            .updatedAt(OffsetDateTime.parse("2025-10-09T15:16:51.713Z"))
                            .build()))
                    .updatedAt(OffsetDateTime.parse("2025-10-31T08:16:01.221Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateCrmPipelineResponse res = sdk.crm().updateCrmPipeline()
                .request(req)
                .call();

        if (res.crmPipeline().isPresent()) {
            System.out.println(res.crmPipeline().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [UpdateCrmPipelineRequest](../../models/operations/UpdateCrmPipelineRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[UpdateCrmPipelineResponse](../../models/operations/UpdateCrmPipelineResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |