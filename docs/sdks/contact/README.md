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
                            .id("849cd11b-c680-45ef-8e37-e9a24def34b8")
                            .name("Delores Reynolds")
                            .build(),
                        AccountingAssociatedContact.builder()
                            .id("b7ba795b-96e2-4c00-b11d-7ad43dd15877")
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
                    .id("d501ead1-d963-4360-9d14-5fc86506b5d5")
                    .identification("amicitia")
                    .isActive(true)
                    .isCustomer(true)
                    .lastName("Reynolds")
                    .name("Delores Reynolds")
                    .paymentMethods(List.of(
                        AccountingContactPaymentMethod.builder()
                            .type(AccountingContactPaymentMethodType.CARD)
                            .default_(true)
                            .id("38ac4078-e7eb-4d4a-938e-3a6293a46e62")
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
                    .updatedAt(OffsetDateTime.parse("2023-12-04T22:28:17.517Z"))
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
                    .id("4b00e4e9-fd2c-4c85-904a-2f9fbb538aab")
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
                            .id("f5133e22-9032-4da2-b390-6d9b7c942b49")
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
                    .updatedAt(OffsetDateTime.parse("2021-02-23T09:13:10.758Z"))
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
                    .id("39e5f225-c2fe-448f-9931-c96c7bd540e7")
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
                    .updatedAt(OffsetDateTime.parse("2023-11-18T22:30:46.346Z"))
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
                            .id("5d12d0f4-d6c4-41e4-b66f-1f01b7202257")
                            .name("Delores Reynolds")
                            .build(),
                        AccountingAssociatedContact.builder()
                            .id("866874f1-a317-404b-9ee2-18708e6d0dd7")
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
                    .id("568c731f-d6db-4131-8722-72c16c80c495")
                    .identification("amicitia")
                    .isActive(true)
                    .isCustomer(true)
                    .lastName("Reynolds")
                    .name("Delores Reynolds")
                    .paymentMethods(List.of(
                        AccountingContactPaymentMethod.builder()
                            .type(AccountingContactPaymentMethodType.CARD)
                            .default_(true)
                            .id("f7dccf3b-a03d-4347-a80e-3a3ce580b82d")
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
                    .updatedAt(OffsetDateTime.parse("2023-12-04T22:28:17.531Z"))
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
                    .id("926522c8-4fea-4b31-870c-dbb458b14cb0")
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
                            .id("24067b18-8e42-4ed3-bb17-00f11628302f")
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
                    .updatedAt(OffsetDateTime.parse("2021-02-23T09:13:10.759Z"))
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
                    .id("356575db-851d-45e5-bbd6-3069bcf46bdb")
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
                    .updatedAt(OffsetDateTime.parse("2023-11-18T22:30:46.355Z"))
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
                            .id("5d12d0f4-d6c4-41e4-b66f-1f01b7202257")
                            .name("Delores Reynolds")
                            .build(),
                        AccountingAssociatedContact.builder()
                            .id("866874f1-a317-404b-9ee2-18708e6d0dd7")
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
                    .id("568c731f-d6db-4131-8722-72c16c80c495")
                    .identification("amicitia")
                    .isActive(true)
                    .isCustomer(true)
                    .lastName("Reynolds")
                    .name("Delores Reynolds")
                    .paymentMethods(List.of(
                        AccountingContactPaymentMethod.builder()
                            .type(AccountingContactPaymentMethodType.CARD)
                            .default_(true)
                            .id("f7dccf3b-a03d-4347-a80e-3a3ce580b82d")
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
                    .updatedAt(OffsetDateTime.parse("2023-12-04T22:28:17.531Z"))
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
                    .id("926522c8-4fea-4b31-870c-dbb458b14cb0")
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
                            .id("24067b18-8e42-4ed3-bb17-00f11628302f")
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
                    .updatedAt(OffsetDateTime.parse("2021-02-23T09:13:10.759Z"))
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
                    .id("356575db-851d-45e5-bbd6-3069bcf46bdb")
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
                    .updatedAt(OffsetDateTime.parse("2023-11-18T22:30:46.355Z"))
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