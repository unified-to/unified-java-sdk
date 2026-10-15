# Contact

## Overview

### Available Operations

* [createAccountingContact](#createaccountingcontact) - Create a contact
* [createCrmContact](#createcrmcontact) - Create a contact
* [createUcContact](#createuccontact) - Create a contact
* [getAccountingContact](#getaccountingcontact) - Retrieve a contact
* [getCrmContact](#getcrmcontact) - Retrieve a contact
* [getUcContact](#getuccontact) - Retrieve a contact
* [listAccountingContacts](#listaccountingcontacts) - List all contacts
* [listCrmContacts](#listcrmcontacts) - List all contacts
* [listUcContacts](#listuccontacts) - List all contacts
* [patchAccountingContact](#patchaccountingcontact) - Update a contact
* [patchCrmContact](#patchcrmcontact) - Update a contact
* [patchUcContact](#patchuccontact) - Update a contact
* [removeAccountingContact](#removeaccountingcontact) - Remove a contact
* [removeCrmContact](#removecrmcontact) - Remove a contact
* [removeUcContact](#removeuccontact) - Remove a contact
* [updateAccountingContact](#updateaccountingcontact) - Update a contact
* [updateCrmContact](#updatecrmcontact) - Update a contact
* [updateUcContact](#updateuccontact) - Update a contact

## createAccountingContact

Create a contact

### Example Usage

<!-- UsageSnippet language="java" operationID="createAccountingContact" method="post" path="/accounting/{connection_id}/contact" example="accounting_contact" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateAccountingContactRequest;
import to.unified.unified_java_sdk.models.operations.CreateAccountingContactResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateAccountingContactRequest req = CreateAccountingContactRequest.builder()
                .accountingContact(AccountingContact.builder()
                    .associatedContacts(List.of(
                        AccountingAssociatedContact.builder()
                            .id("d9fee1cb-603c-411b-a92d-01549bbfbd42")
                            .name("Delores Reynolds")
                            .build(),
                        AccountingAssociatedContact.builder()
                            .id("69cc0111-28fa-47d4-8d56-62ff5bf181b1")
                            .name("Delores Reynolds")
                            .build()))
                    .billingAddress(PropertyAccountingContactBillingAddress.builder()
                        .address1("2633 Stoney Lane")
                        .address2("Suite 176")
                        .city("Ladariusboro")
                        .countryCode("US")
                        .postalCode("70131-2908")
                        .region("Illinois")
                        .regionCode("NV")
                        .build())
                    .companyName("Marquardt Inc")
                    .createdAt(OffsetDateTime.parse("2021-08-15T14:56:50.258Z"))
                    .currency("ISK")
                    .emails(List.of(
                        AccountingEmail.builder()
                            .email("Delores.Reynolds10@hotmail.com")
                            .type(AccountingEmailType.HOME)
                            .build()))
                    .firstName("Delores")
                    .id("56682c91-6b21-4d99-a96c-9a04f27473da")
                    .identification("amicitia")
                    .isActive(true)
                    .isCustomer(true)
                    .lastName("Reynolds")
                    .name("Delores Reynolds")
                    .notes("Caput accusamus et videlicet.")
                    .paymentMethods(List.of(
                        AccountingContactPaymentMethod.builder()
                            .type(AccountingContactPaymentMethodType.CARD)
                            .default_(true)
                            .id("21b16acf-7aca-4390-adb2-6fe04ed5d58a")
                            .name("Visa 1234")
                            .build()))
                    .portalUrl("https://scented-t-shirt.info/")
                    .shippingAddress(PropertyAccountingContactShippingAddress.builder()
                        .address1("786 Renner Stream")
                        .address2("Apt. 555")
                        .city("Roanoke")
                        .countryCode("US")
                        .postalCode("80686-7556")
                        .region("Vermont")
                        .regionCode("NE")
                        .build())
                    .taxExemption(TaxExemption.RESALE)
                    .taxNumber("amplexus")
                    .telephones(List.of(
                        AccountingTelephone.builder()
                            .telephone("(427) 701-7160")
                            .type(AccountingTelephoneType.HOME)
                            .build(),
                        AccountingTelephone.builder()
                            .telephone("(540) 913-9171")
                            .type(AccountingTelephoneType.FAX)
                            .build()))
                    .updatedAt(OffsetDateTime.parse("2023-12-17T04:05:50.179Z"))
                    .website("https://noxious-advertisement.org")
                    .build())
                .connectionId("<id>")
                .build();

        CreateAccountingContactResponse res = sdk.contact().createAccountingContact()
                .request(req)
                .call();

        if (res.accountingContact().isPresent()) {
            System.out.println(res.accountingContact().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [CreateAccountingContactRequest](../../models/operations/CreateAccountingContactRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[CreateAccountingContactResponse](../../models/operations/CreateAccountingContactResponse.md)**

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
                        .address1("518 Brannon Burg")
                        .city("East Helenebury")
                        .countryCode("US")
                        .postalCode("92622-2406")
                        .region("Vermont")
                        .regionCode("AZ")
                        .build())
                    .company("Lowe - Jakubowski")
                    .createdAt(OffsetDateTime.parse("2021-01-02T00:41:38.885Z"))
                    .department("systematic")
                    .emails(List.of(
                        CrmEmail.builder()
                            .email("Mohammad.Bartell45@hotmail.com")
                            .type(CrmEmailType.HOME)
                            .build(),
                        CrmEmail.builder()
                            .email("Mohammad.Bartell90@hotmail.com")
                            .type(CrmEmailType.HOME)
                            .build(),
                        CrmEmail.builder()
                            .email("Mohammad_Bartell@hotmail.com")
                            .type(CrmEmailType.WORK)
                            .build()))
                    .firstName("Mohammad")
                    .id("6ba64a22-8ac8-4aee-b636-5c2550e49ff5")
                    .imageUrl("https://picsum.photos/seed/zmbPeg/2905/378")
                    .lastName("Bartell")
                    .linkUrls(List.of(
                        "https://limited-parade.info",
                        "https://faint-papa.com/",
                        "https://windy-accountability.name"))
                    .metadata(List.of(
                        CrmMetadata.builder()
                            .extraData(CrmMetadataExtraData.of(Map.ofEntries(
                                Map.entry("display_name", "Custom Property"))))
                            .format(CrmMetadataFormat.TEXT)
                            .id("c2a0ee5e-2267-4634-adea-01d28348f77e")
                            .namespace("custom")
                            .slug("custom_property")
                            .value(CrmMetadataValue.of("autem"))
                            .build()))
                    .name("Mohammad Bartell")
                    .telephones(List.of(
                        CrmTelephone.builder()
                            .telephone("(975) 986-1658")
                            .type(CrmTelephoneType.WORK)
                            .build(),
                        CrmTelephone.builder()
                            .telephone("(489) 332-3509")
                            .type(CrmTelephoneType.HOME)
                            .build(),
                        CrmTelephone.builder()
                            .telephone("(205) 880-8886")
                            .type(CrmTelephoneType.HOME)
                            .build()))
                    .title("National Tactics Analyst")
                    .updatedAt(OffsetDateTime.parse("2021-02-24T01:30:53.982Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateCrmContactResponse res = sdk.contact().createCrmContact()
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

## createUcContact

Create a contact

### Example Usage

<!-- UsageSnippet language="java" operationID="createUcContact" method="post" path="/uc/{connection_id}/contact" example="uc_contact" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.CreateUcContactRequest;
import to.unified.unified_java_sdk.models.operations.CreateUcContactResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        CreateUcContactRequest req = CreateUcContactRequest.builder()
                .ucContact(UcContact.builder()
                    .company("Tillman Group")
                    .createdAt(OffsetDateTime.parse("2019-10-28T11:06:56.460Z"))
                    .emails(List.of(
                        UcEmail.builder()
                            .email("Luther_Rogahn32@yahoo.com")
                            .type(UcEmailType.WORK)
                            .build()))
                    .firstName("Luther")
                    .id("d48435a0-5050-4e0c-ac14-d61829a0f61e")
                    .lastName("Rogahn")
                    .name("Luther Rogahn")
                    .telephones(List.of(
                        UcTelephone.builder()
                            .telephone("(809) 992-1681")
                            .type(UcTelephoneType.FAX)
                            .build(),
                        UcTelephone.builder()
                            .telephone("(868) 238-2746")
                            .type(UcTelephoneType.HOME)
                            .build(),
                        UcTelephone.builder()
                            .telephone("(219) 736-0357")
                            .type(UcTelephoneType.MOBILE)
                            .build()))
                    .title("Chief Optimization Executive")
                    .updatedAt(OffsetDateTime.parse("2023-12-04T20:47:51.001Z"))
                    .build())
                .connectionId("<id>")
                .build();

        CreateUcContactResponse res = sdk.contact().createUcContact()
                .request(req)
                .call();

        if (res.ucContact().isPresent()) {
            System.out.println(res.ucContact().get());
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [CreateUcContactRequest](../../models/operations/CreateUcContactRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[CreateUcContactResponse](../../models/operations/CreateUcContactResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getAccountingContact

Retrieve a contact

### Example Usage

<!-- UsageSnippet language="java" operationID="getAccountingContact" method="get" path="/accounting/{connection_id}/contact/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetAccountingContactRequest;
import to.unified.unified_java_sdk.models.operations.GetAccountingContactResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetAccountingContactRequest req = GetAccountingContactRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetAccountingContactResponse res = sdk.contact().getAccountingContact()
                .request(req)
                .call();

        if (res.accountingContact().isPresent()) {
            System.out.println(res.accountingContact().get());
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [GetAccountingContactRequest](../../models/operations/GetAccountingContactRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[GetAccountingContactResponse](../../models/operations/GetAccountingContactResponse.md)**

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

        GetCrmContactResponse res = sdk.contact().getCrmContact()
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

## getUcContact

Retrieve a contact

### Example Usage

<!-- UsageSnippet language="java" operationID="getUcContact" method="get" path="/uc/{connection_id}/contact/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.GetUcContactRequest;
import to.unified.unified_java_sdk.models.operations.GetUcContactResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        GetUcContactRequest req = GetUcContactRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        GetUcContactResponse res = sdk.contact().getUcContact()
                .request(req)
                .call();

        if (res.ucContact().isPresent()) {
            System.out.println(res.ucContact().get());
        }
    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [GetUcContactRequest](../../models/operations/GetUcContactRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[GetUcContactResponse](../../models/operations/GetUcContactResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listAccountingContacts

List all contacts

### Example Usage

<!-- UsageSnippet language="java" operationID="listAccountingContacts" method="get" path="/accounting/{connection_id}/contact" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListAccountingContactsRequest;
import to.unified.unified_java_sdk.models.operations.ListAccountingContactsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListAccountingContactsRequest req = ListAccountingContactsRequest.builder()
                .connectionId("<id>")
                .build();

        ListAccountingContactsResponse res = sdk.contact().listAccountingContacts()
                .request(req)
                .call();

        if (res.accountingContacts().isPresent()) {
            System.out.println(res.accountingContacts().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [ListAccountingContactsRequest](../../models/operations/ListAccountingContactsRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[ListAccountingContactsResponse](../../models/operations/ListAccountingContactsResponse.md)**

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

        ListCrmContactsResponse res = sdk.contact().listCrmContacts()
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

## listUcContacts

List all contacts

### Example Usage

<!-- UsageSnippet language="java" operationID="listUcContacts" method="get" path="/uc/{connection_id}/contact" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.ListUcContactsRequest;
import to.unified.unified_java_sdk.models.operations.ListUcContactsResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        ListUcContactsRequest req = ListUcContactsRequest.builder()
                .connectionId("<id>")
                .build();

        ListUcContactsResponse res = sdk.contact().listUcContacts()
                .request(req)
                .call();

        if (res.ucContacts().isPresent()) {
            System.out.println(res.ucContacts().get());
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [ListUcContactsRequest](../../models/operations/ListUcContactsRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[ListUcContactsResponse](../../models/operations/ListUcContactsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## patchAccountingContact

Update a contact

### Example Usage

<!-- UsageSnippet language="java" operationID="patchAccountingContact" method="patch" path="/accounting/{connection_id}/contact/{id}" example="accounting_contact" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchAccountingContactRequest;
import to.unified.unified_java_sdk.models.operations.PatchAccountingContactResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchAccountingContactRequest req = PatchAccountingContactRequest.builder()
                .accountingContact(AccountingContact.builder()
                    .associatedContacts(List.of(
                        AccountingAssociatedContact.builder()
                            .id("d76b9441-eacb-4aae-9e78-2516cf1c4603")
                            .name("Delores Reynolds")
                            .build(),
                        AccountingAssociatedContact.builder()
                            .id("d04af929-6a62-48f3-8c57-a5710b195a85")
                            .name("Delores Reynolds")
                            .build()))
                    .billingAddress(PropertyAccountingContactBillingAddress.builder()
                        .address1("2633 Stoney Lane")
                        .address2("Suite 176")
                        .city("Ladariusboro")
                        .countryCode("US")
                        .postalCode("70131-2908")
                        .region("Illinois")
                        .regionCode("NV")
                        .build())
                    .companyName("Marquardt Inc")
                    .createdAt(OffsetDateTime.parse("2021-08-15T14:56:50.258Z"))
                    .currency("ISK")
                    .emails(List.of(
                        AccountingEmail.builder()
                            .email("Delores.Reynolds10@hotmail.com")
                            .type(AccountingEmailType.HOME)
                            .build()))
                    .firstName("Delores")
                    .id("6a05d5a6-b7ed-47a6-a6cd-d6a12c07efcb")
                    .identification("amicitia")
                    .isActive(true)
                    .isCustomer(true)
                    .lastName("Reynolds")
                    .name("Delores Reynolds")
                    .notes("Caput accusamus et videlicet.")
                    .paymentMethods(List.of(
                        AccountingContactPaymentMethod.builder()
                            .type(AccountingContactPaymentMethodType.CARD)
                            .default_(true)
                            .id("01a7bd2b-3cb3-4cf0-bdfb-6ec37e00a391")
                            .name("Visa 1234")
                            .build()))
                    .portalUrl("https://scented-t-shirt.info/")
                    .shippingAddress(PropertyAccountingContactShippingAddress.builder()
                        .address1("786 Renner Stream")
                        .address2("Apt. 555")
                        .city("Roanoke")
                        .countryCode("US")
                        .postalCode("80686-7556")
                        .region("Vermont")
                        .regionCode("NE")
                        .build())
                    .taxExemption(TaxExemption.RESALE)
                    .taxNumber("amplexus")
                    .telephones(List.of(
                        AccountingTelephone.builder()
                            .telephone("(427) 701-7160")
                            .type(AccountingTelephoneType.HOME)
                            .build(),
                        AccountingTelephone.builder()
                            .telephone("(540) 913-9171")
                            .type(AccountingTelephoneType.FAX)
                            .build()))
                    .updatedAt(OffsetDateTime.parse("2023-12-17T04:05:50.190Z"))
                    .website("https://noxious-advertisement.org")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchAccountingContactResponse res = sdk.contact().patchAccountingContact()
                .request(req)
                .call();

        if (res.accountingContact().isPresent()) {
            System.out.println(res.accountingContact().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [PatchAccountingContactRequest](../../models/operations/PatchAccountingContactRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[PatchAccountingContactResponse](../../models/operations/PatchAccountingContactResponse.md)**

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
                        .address1("518 Brannon Burg")
                        .city("East Helenebury")
                        .countryCode("US")
                        .postalCode("92622-2406")
                        .region("Vermont")
                        .regionCode("AZ")
                        .build())
                    .company("Lowe - Jakubowski")
                    .createdAt(OffsetDateTime.parse("2021-01-02T00:41:38.885Z"))
                    .department("systematic")
                    .emails(List.of(
                        CrmEmail.builder()
                            .email("Mohammad.Bartell45@hotmail.com")
                            .type(CrmEmailType.HOME)
                            .build(),
                        CrmEmail.builder()
                            .email("Mohammad.Bartell90@hotmail.com")
                            .type(CrmEmailType.HOME)
                            .build(),
                        CrmEmail.builder()
                            .email("Mohammad_Bartell@hotmail.com")
                            .type(CrmEmailType.WORK)
                            .build()))
                    .firstName("Mohammad")
                    .id("a731a1d2-87e9-4268-ae56-973823fb80e9")
                    .imageUrl("https://picsum.photos/seed/zmbPeg/2905/378")
                    .lastName("Bartell")
                    .linkUrls(List.of(
                        "https://limited-parade.info",
                        "https://faint-papa.com/",
                        "https://windy-accountability.name"))
                    .metadata(List.of(
                        CrmMetadata.builder()
                            .extraData(CrmMetadataExtraData.of(Map.ofEntries(
                                Map.entry("display_name", "Custom Property"))))
                            .format(CrmMetadataFormat.TEXT)
                            .id("624ae029-ca49-4475-b320-df1341e99e93")
                            .namespace("custom")
                            .slug("custom_property")
                            .value(CrmMetadataValue.of("autem"))
                            .build()))
                    .name("Mohammad Bartell")
                    .telephones(List.of(
                        CrmTelephone.builder()
                            .telephone("(975) 986-1658")
                            .type(CrmTelephoneType.WORK)
                            .build(),
                        CrmTelephone.builder()
                            .telephone("(489) 332-3509")
                            .type(CrmTelephoneType.HOME)
                            .build(),
                        CrmTelephone.builder()
                            .telephone("(205) 880-8886")
                            .type(CrmTelephoneType.HOME)
                            .build()))
                    .title("National Tactics Analyst")
                    .updatedAt(OffsetDateTime.parse("2021-02-24T01:30:53.982Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchCrmContactResponse res = sdk.contact().patchCrmContact()
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

## patchUcContact

Update a contact

### Example Usage

<!-- UsageSnippet language="java" operationID="patchUcContact" method="patch" path="/uc/{connection_id}/contact/{id}" example="uc_contact" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.PatchUcContactRequest;
import to.unified.unified_java_sdk.models.operations.PatchUcContactResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        PatchUcContactRequest req = PatchUcContactRequest.builder()
                .ucContact(UcContact.builder()
                    .company("Tillman Group")
                    .createdAt(OffsetDateTime.parse("2019-10-28T11:06:56.460Z"))
                    .emails(List.of(
                        UcEmail.builder()
                            .email("Luther_Rogahn32@yahoo.com")
                            .type(UcEmailType.WORK)
                            .build()))
                    .firstName("Luther")
                    .id("472445f2-a90f-439a-be33-59333f16dc92")
                    .lastName("Rogahn")
                    .name("Luther Rogahn")
                    .telephones(List.of(
                        UcTelephone.builder()
                            .telephone("(809) 992-1681")
                            .type(UcTelephoneType.FAX)
                            .build(),
                        UcTelephone.builder()
                            .telephone("(868) 238-2746")
                            .type(UcTelephoneType.HOME)
                            .build(),
                        UcTelephone.builder()
                            .telephone("(219) 736-0357")
                            .type(UcTelephoneType.MOBILE)
                            .build()))
                    .title("Chief Optimization Executive")
                    .updatedAt(OffsetDateTime.parse("2023-12-04T20:47:51.006Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        PatchUcContactResponse res = sdk.contact().patchUcContact()
                .request(req)
                .call();

        if (res.ucContact().isPresent()) {
            System.out.println(res.ucContact().get());
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [PatchUcContactRequest](../../models/operations/PatchUcContactRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[PatchUcContactResponse](../../models/operations/PatchUcContactResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeAccountingContact

Remove a contact

### Example Usage

<!-- UsageSnippet language="java" operationID="removeAccountingContact" method="delete" path="/accounting/{connection_id}/contact/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveAccountingContactRequest;
import to.unified.unified_java_sdk.models.operations.RemoveAccountingContactResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveAccountingContactRequest req = RemoveAccountingContactRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveAccountingContactResponse res = sdk.contact().removeAccountingContact()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [RemoveAccountingContactRequest](../../models/operations/RemoveAccountingContactRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[RemoveAccountingContactResponse](../../models/operations/RemoveAccountingContactResponse.md)**

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

        RemoveCrmContactResponse res = sdk.contact().removeCrmContact()
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

## removeUcContact

Remove a contact

### Example Usage

<!-- UsageSnippet language="java" operationID="removeUcContact" method="delete" path="/uc/{connection_id}/contact/{id}" -->
```java
package hello.world;

import java.lang.Exception;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.RemoveUcContactRequest;
import to.unified.unified_java_sdk.models.operations.RemoveUcContactResponse;
import to.unified.unified_java_sdk.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        RemoveUcContactRequest req = RemoveUcContactRequest.builder()
                .connectionId("<id>")
                .id("<id>")
                .build();

        RemoveUcContactResponse res = sdk.contact().removeUcContact()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [RemoveUcContactRequest](../../models/operations/RemoveUcContactRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[RemoveUcContactResponse](../../models/operations/RemoveUcContactResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateAccountingContact

Update a contact

### Example Usage

<!-- UsageSnippet language="java" operationID="updateAccountingContact" method="put" path="/accounting/{connection_id}/contact/{id}" example="accounting_contact" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateAccountingContactRequest;
import to.unified.unified_java_sdk.models.operations.UpdateAccountingContactResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateAccountingContactRequest req = UpdateAccountingContactRequest.builder()
                .accountingContact(AccountingContact.builder()
                    .associatedContacts(List.of(
                        AccountingAssociatedContact.builder()
                            .id("d76b9441-eacb-4aae-9e78-2516cf1c4603")
                            .name("Delores Reynolds")
                            .build(),
                        AccountingAssociatedContact.builder()
                            .id("d04af929-6a62-48f3-8c57-a5710b195a85")
                            .name("Delores Reynolds")
                            .build()))
                    .billingAddress(PropertyAccountingContactBillingAddress.builder()
                        .address1("2633 Stoney Lane")
                        .address2("Suite 176")
                        .city("Ladariusboro")
                        .countryCode("US")
                        .postalCode("70131-2908")
                        .region("Illinois")
                        .regionCode("NV")
                        .build())
                    .companyName("Marquardt Inc")
                    .createdAt(OffsetDateTime.parse("2021-08-15T14:56:50.258Z"))
                    .currency("ISK")
                    .emails(List.of(
                        AccountingEmail.builder()
                            .email("Delores.Reynolds10@hotmail.com")
                            .type(AccountingEmailType.HOME)
                            .build()))
                    .firstName("Delores")
                    .id("6a05d5a6-b7ed-47a6-a6cd-d6a12c07efcb")
                    .identification("amicitia")
                    .isActive(true)
                    .isCustomer(true)
                    .lastName("Reynolds")
                    .name("Delores Reynolds")
                    .notes("Caput accusamus et videlicet.")
                    .paymentMethods(List.of(
                        AccountingContactPaymentMethod.builder()
                            .type(AccountingContactPaymentMethodType.CARD)
                            .default_(true)
                            .id("01a7bd2b-3cb3-4cf0-bdfb-6ec37e00a391")
                            .name("Visa 1234")
                            .build()))
                    .portalUrl("https://scented-t-shirt.info/")
                    .shippingAddress(PropertyAccountingContactShippingAddress.builder()
                        .address1("786 Renner Stream")
                        .address2("Apt. 555")
                        .city("Roanoke")
                        .countryCode("US")
                        .postalCode("80686-7556")
                        .region("Vermont")
                        .regionCode("NE")
                        .build())
                    .taxExemption(TaxExemption.RESALE)
                    .taxNumber("amplexus")
                    .telephones(List.of(
                        AccountingTelephone.builder()
                            .telephone("(427) 701-7160")
                            .type(AccountingTelephoneType.HOME)
                            .build(),
                        AccountingTelephone.builder()
                            .telephone("(540) 913-9171")
                            .type(AccountingTelephoneType.FAX)
                            .build()))
                    .updatedAt(OffsetDateTime.parse("2023-12-17T04:05:50.190Z"))
                    .website("https://noxious-advertisement.org")
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateAccountingContactResponse res = sdk.contact().updateAccountingContact()
                .request(req)
                .call();

        if (res.accountingContact().isPresent()) {
            System.out.println(res.accountingContact().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [UpdateAccountingContactRequest](../../models/operations/UpdateAccountingContactRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[UpdateAccountingContactResponse](../../models/operations/UpdateAccountingContactResponse.md)**

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
                        .address1("518 Brannon Burg")
                        .city("East Helenebury")
                        .countryCode("US")
                        .postalCode("92622-2406")
                        .region("Vermont")
                        .regionCode("AZ")
                        .build())
                    .company("Lowe - Jakubowski")
                    .createdAt(OffsetDateTime.parse("2021-01-02T00:41:38.885Z"))
                    .department("systematic")
                    .emails(List.of(
                        CrmEmail.builder()
                            .email("Mohammad.Bartell45@hotmail.com")
                            .type(CrmEmailType.HOME)
                            .build(),
                        CrmEmail.builder()
                            .email("Mohammad.Bartell90@hotmail.com")
                            .type(CrmEmailType.HOME)
                            .build(),
                        CrmEmail.builder()
                            .email("Mohammad_Bartell@hotmail.com")
                            .type(CrmEmailType.WORK)
                            .build()))
                    .firstName("Mohammad")
                    .id("a731a1d2-87e9-4268-ae56-973823fb80e9")
                    .imageUrl("https://picsum.photos/seed/zmbPeg/2905/378")
                    .lastName("Bartell")
                    .linkUrls(List.of(
                        "https://limited-parade.info",
                        "https://faint-papa.com/",
                        "https://windy-accountability.name"))
                    .metadata(List.of(
                        CrmMetadata.builder()
                            .extraData(CrmMetadataExtraData.of(Map.ofEntries(
                                Map.entry("display_name", "Custom Property"))))
                            .format(CrmMetadataFormat.TEXT)
                            .id("624ae029-ca49-4475-b320-df1341e99e93")
                            .namespace("custom")
                            .slug("custom_property")
                            .value(CrmMetadataValue.of("autem"))
                            .build()))
                    .name("Mohammad Bartell")
                    .telephones(List.of(
                        CrmTelephone.builder()
                            .telephone("(975) 986-1658")
                            .type(CrmTelephoneType.WORK)
                            .build(),
                        CrmTelephone.builder()
                            .telephone("(489) 332-3509")
                            .type(CrmTelephoneType.HOME)
                            .build(),
                        CrmTelephone.builder()
                            .telephone("(205) 880-8886")
                            .type(CrmTelephoneType.HOME)
                            .build()))
                    .title("National Tactics Analyst")
                    .updatedAt(OffsetDateTime.parse("2021-02-24T01:30:53.982Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateCrmContactResponse res = sdk.contact().updateCrmContact()
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

## updateUcContact

Update a contact

### Example Usage

<!-- UsageSnippet language="java" operationID="updateUcContact" method="put" path="/uc/{connection_id}/contact/{id}" example="uc_contact" -->
```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import to.unified.unified_java_sdk.UnifiedTo;
import to.unified.unified_java_sdk.models.operations.UpdateUcContactRequest;
import to.unified.unified_java_sdk.models.operations.UpdateUcContactResponse;
import to.unified.unified_java_sdk.models.shared.*;

public class Application {

    public static void main(String[] args) throws Exception {

        UnifiedTo sdk = UnifiedTo.builder()
                .security(Security.builder()
                    .jwt(System.getenv().getOrDefault("JWT", ""))
                    .build())
            .build();

        UpdateUcContactRequest req = UpdateUcContactRequest.builder()
                .ucContact(UcContact.builder()
                    .company("Tillman Group")
                    .createdAt(OffsetDateTime.parse("2019-10-28T11:06:56.460Z"))
                    .emails(List.of(
                        UcEmail.builder()
                            .email("Luther_Rogahn32@yahoo.com")
                            .type(UcEmailType.WORK)
                            .build()))
                    .firstName("Luther")
                    .id("472445f2-a90f-439a-be33-59333f16dc92")
                    .lastName("Rogahn")
                    .name("Luther Rogahn")
                    .telephones(List.of(
                        UcTelephone.builder()
                            .telephone("(809) 992-1681")
                            .type(UcTelephoneType.FAX)
                            .build(),
                        UcTelephone.builder()
                            .telephone("(868) 238-2746")
                            .type(UcTelephoneType.HOME)
                            .build(),
                        UcTelephone.builder()
                            .telephone("(219) 736-0357")
                            .type(UcTelephoneType.MOBILE)
                            .build()))
                    .title("Chief Optimization Executive")
                    .updatedAt(OffsetDateTime.parse("2023-12-04T20:47:51.006Z"))
                    .build())
                .connectionId("<id>")
                .id("<id>")
                .build();

        UpdateUcContactResponse res = sdk.contact().updateUcContact()
                .request(req)
                .call();

        if (res.ucContact().isPresent()) {
            System.out.println(res.ucContact().get());
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [UpdateUcContactRequest](../../models/operations/UpdateUcContactRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[UpdateUcContactResponse](../../models/operations/UpdateUcContactResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |