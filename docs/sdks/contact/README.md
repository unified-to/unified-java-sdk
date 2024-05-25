# Contact
(*contact*)

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

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.CreateAccountingContactRequest;
import com.unifiedapi.unifiedto.models.operations.CreateAccountingContactResponse;
import com.unifiedapi.unifiedto.models.shared.AccountingContact;
import com.unifiedapi.unifiedto.models.shared.AccountingContactPaymentMethod;
import com.unifiedapi.unifiedto.models.shared.AccountingContactPaymentMethodType;
import com.unifiedapi.unifiedto.models.shared.AccountingEmail;
import com.unifiedapi.unifiedto.models.shared.AccountingEmailType;
import com.unifiedapi.unifiedto.models.shared.AccountingTelephone;
import com.unifiedapi.unifiedto.models.shared.AccountingTelephoneType;
import com.unifiedapi.unifiedto.models.shared.PropertyAccountingContactBillingAddress;
import com.unifiedapi.unifiedto.models.shared.PropertyAccountingContactShippingAddress;
import com.unifiedapi.unifiedto.models.shared.Security;
import com.unifiedapi.unifiedto.models.shared.TaxExemption;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.CreateAccountingContactRequest req = new CreateAccountingContactRequest(
                "<value>"){{
                accountingContact = new AccountingContact(
){{
                    billingAddress = new PropertyAccountingContactBillingAddress(
){{
                        address1 = "<value>";
                        address2 = "<value>";
                        city = "Lake Benny";
                        country = "Azerbaijan";
                        countryCode = "GT";
                        postalCode = "48359-3238";
                        region = "<value>";
                        regionCode = "<value>";

                    }};
                    companyName = "Spinka, Ziemann and West";
                    createdAt = OffsetDateTime.parse("2022-06-29T13:45:40.964Z");
                    currency = "US Dollar";
                    emails = new com.unifiedapi.unifiedto.models.shared.AccountingEmail[]{{
                        add(new AccountingEmail(
                        ){{}}),
                    }};
                    id = "<id>";
                    identification = "<value>";
                    isActive = false;
                    isCustomer = false;
                    isSupplier = false;
                    name = "<value>";
                    paymentMethods = new com.unifiedapi.unifiedto.models.shared.AccountingContactPaymentMethod[]{{
                        add(new AccountingContactPaymentMethod(
                        AccountingContactPaymentMethodType.OTHER){{
                            type = AccountingContactPaymentMethodType.PAYPAL;
                        }}),
                    }};
                    portalUrl = "<value>";
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "<value>");
                    }};
                    shippingAddress = new PropertyAccountingContactShippingAddress(
){{
                        address1 = "<value>";
                        address2 = "<value>";
                        city = "North Jazmynefurt";
                        country = "France";
                        countryCode = "BE";
                        postalCode = "36835-6542";
                        region = "<value>";
                        regionCode = "<value>";

                    }};
                    taxExemption = TaxExemption.FEDERAL_GOV;
                    taxNumber = "<value>";
                    telephones = new com.unifiedapi.unifiedto.models.shared.AccountingTelephone[]{{
                        add(new AccountingTelephone(
                        ){{}}),
                    }};
                    updatedAt = OffsetDateTime.parse("2023-09-05T13:56:20.676Z");

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.CreateAccountingContactResponse res = sdk.contact.createAccountingContact(req);

            if (res.accountingContact != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                              | Type                                                                                                                                   | Required                                                                                                                               | Description                                                                                                                            |
| -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                              | [com.unifiedapi.unifiedto.models.operations.CreateAccountingContactRequest](../../models/operations/CreateAccountingContactRequest.md) | :heavy_check_mark:                                                                                                                     | The request object to use for the request.                                                                                             |


### Response

**[com.unifiedapi.unifiedto.models.operations.CreateAccountingContactResponse](../../models/operations/CreateAccountingContactResponse.md)**


## createCrmContact

Create a contact

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.CreateCrmContactRequest;
import com.unifiedapi.unifiedto.models.operations.CreateCrmContactResponse;
import com.unifiedapi.unifiedto.models.shared.CrmContact;
import com.unifiedapi.unifiedto.models.shared.CrmEmail;
import com.unifiedapi.unifiedto.models.shared.CrmEmailType;
import com.unifiedapi.unifiedto.models.shared.CrmTelephone;
import com.unifiedapi.unifiedto.models.shared.CrmTelephoneType;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmContactAddress;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.CreateCrmContactRequest req = new CreateCrmContactRequest(
                "<value>"){{
                crmContact = new CrmContact(
){{
                    address = new PropertyCrmContactAddress(
){{
                        address1 = "<value>";
                        address2 = "<value>";
                        city = "Steuberview";
                        country = "Bulgaria";
                        countryCode = "QA";
                        postalCode = "98809";
                        region = "<value>";
                        regionCode = "<value>";

                    }};
                    company = "Pollich, Emard and Parker";
                    companyIds = new String[]{{
                        add("<value>"),
                    }};
                    createdAt = OffsetDateTime.parse("2024-03-07T10:13:21.309Z");
                    dealIds = new String[]{{
                        add("<value>"),
                    }};
                    emails = new com.unifiedapi.unifiedto.models.shared.CrmEmail[]{{
                        add(new CrmEmail(
                        ){{}}),
                    }};
                    id = "<id>";
                    name = "<value>";
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "<value>");
                    }};
                    telephones = new com.unifiedapi.unifiedto.models.shared.CrmTelephone[]{{
                        add(new CrmTelephone(
                        "<value>"){{
                            telephone = "<value>";
                        }}),
                    }};
                    title = "<value>";
                    updatedAt = OffsetDateTime.parse("2024-03-21T17:10:02.454Z");
                    userId = "<value>";

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.CreateCrmContactResponse res = sdk.contact.createCrmContact(req);

            if (res.crmContact != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                | Type                                                                                                                     | Required                                                                                                                 | Description                                                                                                              |
| ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                | [com.unifiedapi.unifiedto.models.operations.CreateCrmContactRequest](../../models/operations/CreateCrmContactRequest.md) | :heavy_check_mark:                                                                                                       | The request object to use for the request.                                                                               |


### Response

**[com.unifiedapi.unifiedto.models.operations.CreateCrmContactResponse](../../models/operations/CreateCrmContactResponse.md)**


## createUcContact

Create a contact

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.CreateUcContactRequest;
import com.unifiedapi.unifiedto.models.operations.CreateUcContactResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import com.unifiedapi.unifiedto.models.shared.UcContact;
import com.unifiedapi.unifiedto.models.shared.UcEmail;
import com.unifiedapi.unifiedto.models.shared.UcEmailType;
import com.unifiedapi.unifiedto.models.shared.UcTelephone;
import com.unifiedapi.unifiedto.models.shared.UcTelephoneType;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.CreateUcContactRequest req = new CreateUcContactRequest(
                "<value>"){{
                ucContact = new UcContact(
){{
                    company = "Gottlieb - Becker";
                    createdAt = OffsetDateTime.parse("2024-07-20T15:00:17.424Z");
                    emails = new com.unifiedapi.unifiedto.models.shared.UcEmail[]{{
                        add(new UcEmail(
                        "<value>"){{
                            email = "Elliot78@hotmail.com";
                        }}),
                    }};
                    id = "<id>";
                    name = "<value>";
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "<value>");
                    }};
                    telephones = new com.unifiedapi.unifiedto.models.shared.UcTelephone[]{{
                        add(new UcTelephone(
                        "<value>"){{
                            telephone = "<value>";
                        }}),
                    }};
                    title = "<value>";
                    updatedAt = OffsetDateTime.parse("2024-09-27T22:23:04.622Z");

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.CreateUcContactResponse res = sdk.contact.createUcContact(req);

            if (res.ucContact != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                              | Type                                                                                                                   | Required                                                                                                               | Description                                                                                                            |
| ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                              | [com.unifiedapi.unifiedto.models.operations.CreateUcContactRequest](../../models/operations/CreateUcContactRequest.md) | :heavy_check_mark:                                                                                                     | The request object to use for the request.                                                                             |


### Response

**[com.unifiedapi.unifiedto.models.operations.CreateUcContactResponse](../../models/operations/CreateUcContactResponse.md)**


## getAccountingContact

Retrieve a contact

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetAccountingContactRequest;
import com.unifiedapi.unifiedto.models.operations.GetAccountingContactResponse;
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.GetAccountingContactRequest req = new GetAccountingContactRequest(
                "<value>",
                "<value>"){{
                fields = new String[]{{
                    add("<value>"),
                }};

            }};

            com.unifiedapi.unifiedto.models.operations.GetAccountingContactResponse res = sdk.contact.getAccountingContact(req);

            if (res.accountingContact != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                        | Type                                                                                                                             | Required                                                                                                                         | Description                                                                                                                      |
| -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                        | [com.unifiedapi.unifiedto.models.operations.GetAccountingContactRequest](../../models/operations/GetAccountingContactRequest.md) | :heavy_check_mark:                                                                                                               | The request object to use for the request.                                                                                       |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetAccountingContactResponse](../../models/operations/GetAccountingContactResponse.md)**


## getCrmContact

Retrieve a contact

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetCrmContactRequest;
import com.unifiedapi.unifiedto.models.operations.GetCrmContactResponse;
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.GetCrmContactRequest req = new GetCrmContactRequest(
                "<value>",
                "<value>"){{
                fields = new String[]{{
                    add("<value>"),
                }};

            }};

            com.unifiedapi.unifiedto.models.operations.GetCrmContactResponse res = sdk.contact.getCrmContact(req);

            if (res.crmContact != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                          | Type                                                                                                               | Required                                                                                                           | Description                                                                                                        |
| ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                          | [com.unifiedapi.unifiedto.models.operations.GetCrmContactRequest](../../models/operations/GetCrmContactRequest.md) | :heavy_check_mark:                                                                                                 | The request object to use for the request.                                                                         |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetCrmContactResponse](../../models/operations/GetCrmContactResponse.md)**


## getUcContact

Retrieve a contact

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetUcContactRequest;
import com.unifiedapi.unifiedto.models.operations.GetUcContactResponse;
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.GetUcContactRequest req = new GetUcContactRequest(
                "<value>",
                "<value>"){{
                fields = new String[]{{
                    add("<value>"),
                }};

            }};

            com.unifiedapi.unifiedto.models.operations.GetUcContactResponse res = sdk.contact.getUcContact(req);

            if (res.ucContact != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                        | Type                                                                                                             | Required                                                                                                         | Description                                                                                                      |
| ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                        | [com.unifiedapi.unifiedto.models.operations.GetUcContactRequest](../../models/operations/GetUcContactRequest.md) | :heavy_check_mark:                                                                                               | The request object to use for the request.                                                                       |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetUcContactResponse](../../models/operations/GetUcContactResponse.md)**


## listAccountingContacts

List all contacts

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.ListAccountingContactsRequest;
import com.unifiedapi.unifiedto.models.operations.ListAccountingContactsResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.ListAccountingContactsRequest req = new ListAccountingContactsRequest(
                "<value>"){{
                fields = new String[]{{
                    add("<value>"),
                }};
                limit = 4596.32d;
                offset = 8881.9d;
                order = "<value>";
                query = "<value>";
                sort = "<value>";
                type = "<value>";
                updatedGte = OffsetDateTime.parse("2023-09-26T14:00:38.736Z");

            }};

            com.unifiedapi.unifiedto.models.operations.ListAccountingContactsResponse res = sdk.contact.listAccountingContacts(req);

            if (res.accountingContacts != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                            | Type                                                                                                                                 | Required                                                                                                                             | Description                                                                                                                          |
| ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                            | [com.unifiedapi.unifiedto.models.operations.ListAccountingContactsRequest](../../models/operations/ListAccountingContactsRequest.md) | :heavy_check_mark:                                                                                                                   | The request object to use for the request.                                                                                           |


### Response

**[com.unifiedapi.unifiedto.models.operations.ListAccountingContactsResponse](../../models/operations/ListAccountingContactsResponse.md)**


## listCrmContacts

List all contacts

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.ListCrmContactsRequest;
import com.unifiedapi.unifiedto.models.operations.ListCrmContactsResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.ListCrmContactsRequest req = new ListCrmContactsRequest(
                "<value>"){{
                companyId = "<value>";
                dealId = "<value>";
                fields = new String[]{{
                    add("<value>"),
                }};
                limit = 7110.24d;
                offset = 2657.43d;
                order = "<value>";
                query = "<value>";
                sort = "<value>";
                updatedGte = OffsetDateTime.parse("2023-11-15T19:36:59.401Z");
                userId = "<value>";

            }};

            com.unifiedapi.unifiedto.models.operations.ListCrmContactsResponse res = sdk.contact.listCrmContacts(req);

            if (res.crmContacts != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                              | Type                                                                                                                   | Required                                                                                                               | Description                                                                                                            |
| ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                              | [com.unifiedapi.unifiedto.models.operations.ListCrmContactsRequest](../../models/operations/ListCrmContactsRequest.md) | :heavy_check_mark:                                                                                                     | The request object to use for the request.                                                                             |


### Response

**[com.unifiedapi.unifiedto.models.operations.ListCrmContactsResponse](../../models/operations/ListCrmContactsResponse.md)**


## listUcContacts

List all contacts

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.ListUcContactsRequest;
import com.unifiedapi.unifiedto.models.operations.ListUcContactsResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.ListUcContactsRequest req = new ListUcContactsRequest(
                "<value>"){{
                fields = new String[]{{
                    add("<value>"),
                }};
                limit = 5333.71d;
                offset = 7775.9d;
                order = "<value>";
                query = "<value>";
                sort = "<value>";
                updatedGte = OffsetDateTime.parse("2023-10-26T05:35:01.805Z");
                userId = "<value>";

            }};

            com.unifiedapi.unifiedto.models.operations.ListUcContactsResponse res = sdk.contact.listUcContacts(req);

            if (res.ucContacts != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                            | Type                                                                                                                 | Required                                                                                                             | Description                                                                                                          |
| -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                            | [com.unifiedapi.unifiedto.models.operations.ListUcContactsRequest](../../models/operations/ListUcContactsRequest.md) | :heavy_check_mark:                                                                                                   | The request object to use for the request.                                                                           |


### Response

**[com.unifiedapi.unifiedto.models.operations.ListUcContactsResponse](../../models/operations/ListUcContactsResponse.md)**


## patchAccountingContact

Update a contact

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PatchAccountingContactRequest;
import com.unifiedapi.unifiedto.models.operations.PatchAccountingContactResponse;
import com.unifiedapi.unifiedto.models.shared.AccountingContact;
import com.unifiedapi.unifiedto.models.shared.AccountingContactPaymentMethod;
import com.unifiedapi.unifiedto.models.shared.AccountingContactPaymentMethodType;
import com.unifiedapi.unifiedto.models.shared.AccountingEmail;
import com.unifiedapi.unifiedto.models.shared.AccountingEmailType;
import com.unifiedapi.unifiedto.models.shared.AccountingTelephone;
import com.unifiedapi.unifiedto.models.shared.AccountingTelephoneType;
import com.unifiedapi.unifiedto.models.shared.PropertyAccountingContactBillingAddress;
import com.unifiedapi.unifiedto.models.shared.PropertyAccountingContactShippingAddress;
import com.unifiedapi.unifiedto.models.shared.Security;
import com.unifiedapi.unifiedto.models.shared.TaxExemption;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.PatchAccountingContactRequest req = new PatchAccountingContactRequest(
                "<value>",
                "<value>"){{
                accountingContact = new AccountingContact(
){{
                    billingAddress = new PropertyAccountingContactBillingAddress(
){{
                        address1 = "<value>";
                        address2 = "<value>";
                        city = "Sylvestermouth";
                        country = "Norfolk Island";
                        countryCode = "BN";
                        postalCode = "34531-3519";
                        region = "<value>";
                        regionCode = "<value>";

                    }};
                    companyName = "Reichel, Luettgen and Bins";
                    createdAt = OffsetDateTime.parse("2023-11-21T23:25:22.442Z");
                    currency = "Kip";
                    emails = new com.unifiedapi.unifiedto.models.shared.AccountingEmail[]{{
                        add(new AccountingEmail(
                        ){{}}),
                    }};
                    id = "<id>";
                    identification = "<value>";
                    isActive = false;
                    isCustomer = false;
                    isSupplier = false;
                    name = "<value>";
                    paymentMethods = new com.unifiedapi.unifiedto.models.shared.AccountingContactPaymentMethod[]{{
                        add(new AccountingContactPaymentMethod(
                        AccountingContactPaymentMethodType.IDEAL){{
                            type = AccountingContactPaymentMethodType.OTHER;
                        }}),
                    }};
                    portalUrl = "<value>";
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "<value>");
                    }};
                    shippingAddress = new PropertyAccountingContactShippingAddress(
){{
                        address1 = "<value>";
                        address2 = "<value>";
                        city = "Friesenbury";
                        country = "Nepal";
                        countryCode = "PT";
                        postalCode = "12514-2095";
                        region = "<value>";
                        regionCode = "<value>";

                    }};
                    taxExemption = TaxExemption.FEDERAL_GOV;
                    taxNumber = "<value>";
                    telephones = new com.unifiedapi.unifiedto.models.shared.AccountingTelephone[]{{
                        add(new AccountingTelephone(
                        ){{}}),
                    }};
                    updatedAt = OffsetDateTime.parse("2024-11-16T14:39:43.192Z");

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.PatchAccountingContactResponse res = sdk.contact.patchAccountingContact(req);

            if (res.accountingContact != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                            | Type                                                                                                                                 | Required                                                                                                                             | Description                                                                                                                          |
| ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                            | [com.unifiedapi.unifiedto.models.operations.PatchAccountingContactRequest](../../models/operations/PatchAccountingContactRequest.md) | :heavy_check_mark:                                                                                                                   | The request object to use for the request.                                                                                           |


### Response

**[com.unifiedapi.unifiedto.models.operations.PatchAccountingContactResponse](../../models/operations/PatchAccountingContactResponse.md)**


## patchCrmContact

Update a contact

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PatchCrmContactRequest;
import com.unifiedapi.unifiedto.models.operations.PatchCrmContactResponse;
import com.unifiedapi.unifiedto.models.shared.CrmContact;
import com.unifiedapi.unifiedto.models.shared.CrmEmail;
import com.unifiedapi.unifiedto.models.shared.CrmEmailType;
import com.unifiedapi.unifiedto.models.shared.CrmTelephone;
import com.unifiedapi.unifiedto.models.shared.CrmTelephoneType;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmContactAddress;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.PatchCrmContactRequest req = new PatchCrmContactRequest(
                "<value>",
                "<value>"){{
                crmContact = new CrmContact(
){{
                    address = new PropertyCrmContactAddress(
){{
                        address1 = "<value>";
                        address2 = "<value>";
                        city = "North Anne";
                        country = "Puerto Rico";
                        countryCode = "GD";
                        postalCode = "31015";
                        region = "<value>";
                        regionCode = "<value>";

                    }};
                    company = "Goyette - Schultz";
                    companyIds = new String[]{{
                        add("<value>"),
                    }};
                    createdAt = OffsetDateTime.parse("2022-07-12T00:15:47.150Z");
                    dealIds = new String[]{{
                        add("<value>"),
                    }};
                    emails = new com.unifiedapi.unifiedto.models.shared.CrmEmail[]{{
                        add(new CrmEmail(
                        ){{}}),
                    }};
                    id = "<id>";
                    name = "<value>";
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "<value>");
                    }};
                    telephones = new com.unifiedapi.unifiedto.models.shared.CrmTelephone[]{{
                        add(new CrmTelephone(
                        "<value>"){{
                            telephone = "<value>";
                        }}),
                    }};
                    title = "<value>";
                    updatedAt = OffsetDateTime.parse("2022-11-28T22:10:52.030Z");
                    userId = "<value>";

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.PatchCrmContactResponse res = sdk.contact.patchCrmContact(req);

            if (res.crmContact != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                              | Type                                                                                                                   | Required                                                                                                               | Description                                                                                                            |
| ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                              | [com.unifiedapi.unifiedto.models.operations.PatchCrmContactRequest](../../models/operations/PatchCrmContactRequest.md) | :heavy_check_mark:                                                                                                     | The request object to use for the request.                                                                             |


### Response

**[com.unifiedapi.unifiedto.models.operations.PatchCrmContactResponse](../../models/operations/PatchCrmContactResponse.md)**


## patchUcContact

Update a contact

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PatchUcContactRequest;
import com.unifiedapi.unifiedto.models.operations.PatchUcContactResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import com.unifiedapi.unifiedto.models.shared.UcContact;
import com.unifiedapi.unifiedto.models.shared.UcEmail;
import com.unifiedapi.unifiedto.models.shared.UcEmailType;
import com.unifiedapi.unifiedto.models.shared.UcTelephone;
import com.unifiedapi.unifiedto.models.shared.UcTelephoneType;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.PatchUcContactRequest req = new PatchUcContactRequest(
                "<value>",
                "<value>"){{
                ucContact = new UcContact(
){{
                    company = "Runolfsdottir, Boehm and Toy";
                    createdAt = OffsetDateTime.parse("2024-05-28T10:05:49.902Z");
                    emails = new com.unifiedapi.unifiedto.models.shared.UcEmail[]{{
                        add(new UcEmail(
                        "<value>"){{
                            email = "Arlie78@hotmail.com";
                        }}),
                    }};
                    id = "<id>";
                    name = "<value>";
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "<value>");
                    }};
                    telephones = new com.unifiedapi.unifiedto.models.shared.UcTelephone[]{{
                        add(new UcTelephone(
                        "<value>"){{
                            telephone = "<value>";
                        }}),
                    }};
                    title = "<value>";
                    updatedAt = OffsetDateTime.parse("2024-05-08T07:43:27.358Z");

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.PatchUcContactResponse res = sdk.contact.patchUcContact(req);

            if (res.ucContact != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                            | Type                                                                                                                 | Required                                                                                                             | Description                                                                                                          |
| -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                            | [com.unifiedapi.unifiedto.models.operations.PatchUcContactRequest](../../models/operations/PatchUcContactRequest.md) | :heavy_check_mark:                                                                                                   | The request object to use for the request.                                                                           |


### Response

**[com.unifiedapi.unifiedto.models.operations.PatchUcContactResponse](../../models/operations/PatchUcContactResponse.md)**


## removeAccountingContact

Remove a contact

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.RemoveAccountingContactRequest;
import com.unifiedapi.unifiedto.models.operations.RemoveAccountingContactResponse;
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.RemoveAccountingContactRequest req = new RemoveAccountingContactRequest(
                "<value>",
                "<value>");

            com.unifiedapi.unifiedto.models.operations.RemoveAccountingContactResponse res = sdk.contact.removeAccountingContact(req);

            if (res.statusCode == 200) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                              | Type                                                                                                                                   | Required                                                                                                                               | Description                                                                                                                            |
| -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                              | [com.unifiedapi.unifiedto.models.operations.RemoveAccountingContactRequest](../../models/operations/RemoveAccountingContactRequest.md) | :heavy_check_mark:                                                                                                                     | The request object to use for the request.                                                                                             |


### Response

**[com.unifiedapi.unifiedto.models.operations.RemoveAccountingContactResponse](../../models/operations/RemoveAccountingContactResponse.md)**


## removeCrmContact

Remove a contact

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.RemoveCrmContactRequest;
import com.unifiedapi.unifiedto.models.operations.RemoveCrmContactResponse;
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.RemoveCrmContactRequest req = new RemoveCrmContactRequest(
                "<value>",
                "<value>");

            com.unifiedapi.unifiedto.models.operations.RemoveCrmContactResponse res = sdk.contact.removeCrmContact(req);

            if (res.statusCode == 200) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                | Type                                                                                                                     | Required                                                                                                                 | Description                                                                                                              |
| ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                | [com.unifiedapi.unifiedto.models.operations.RemoveCrmContactRequest](../../models/operations/RemoveCrmContactRequest.md) | :heavy_check_mark:                                                                                                       | The request object to use for the request.                                                                               |


### Response

**[com.unifiedapi.unifiedto.models.operations.RemoveCrmContactResponse](../../models/operations/RemoveCrmContactResponse.md)**


## removeUcContact

Remove a contact

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.RemoveUcContactRequest;
import com.unifiedapi.unifiedto.models.operations.RemoveUcContactResponse;
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.RemoveUcContactRequest req = new RemoveUcContactRequest(
                "<value>",
                "<value>");

            com.unifiedapi.unifiedto.models.operations.RemoveUcContactResponse res = sdk.contact.removeUcContact(req);

            if (res.statusCode == 200) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                              | Type                                                                                                                   | Required                                                                                                               | Description                                                                                                            |
| ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                              | [com.unifiedapi.unifiedto.models.operations.RemoveUcContactRequest](../../models/operations/RemoveUcContactRequest.md) | :heavy_check_mark:                                                                                                     | The request object to use for the request.                                                                             |


### Response

**[com.unifiedapi.unifiedto.models.operations.RemoveUcContactResponse](../../models/operations/RemoveUcContactResponse.md)**


## updateAccountingContact

Update a contact

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.UpdateAccountingContactRequest;
import com.unifiedapi.unifiedto.models.operations.UpdateAccountingContactResponse;
import com.unifiedapi.unifiedto.models.shared.AccountingContact;
import com.unifiedapi.unifiedto.models.shared.AccountingContactPaymentMethod;
import com.unifiedapi.unifiedto.models.shared.AccountingContactPaymentMethodType;
import com.unifiedapi.unifiedto.models.shared.AccountingEmail;
import com.unifiedapi.unifiedto.models.shared.AccountingEmailType;
import com.unifiedapi.unifiedto.models.shared.AccountingTelephone;
import com.unifiedapi.unifiedto.models.shared.AccountingTelephoneType;
import com.unifiedapi.unifiedto.models.shared.PropertyAccountingContactBillingAddress;
import com.unifiedapi.unifiedto.models.shared.PropertyAccountingContactShippingAddress;
import com.unifiedapi.unifiedto.models.shared.Security;
import com.unifiedapi.unifiedto.models.shared.TaxExemption;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.UpdateAccountingContactRequest req = new UpdateAccountingContactRequest(
                "<value>",
                "<value>"){{
                accountingContact = new AccountingContact(
){{
                    billingAddress = new PropertyAccountingContactBillingAddress(
){{
                        address1 = "<value>";
                        address2 = "<value>";
                        city = "Mayaguez";
                        country = "Ghana";
                        countryCode = "JE";
                        postalCode = "16521-4269";
                        region = "<value>";
                        regionCode = "<value>";

                    }};
                    companyName = "Turner - Cruickshank";
                    createdAt = OffsetDateTime.parse("2023-09-17T02:48:58.014Z");
                    currency = "Kyat";
                    emails = new com.unifiedapi.unifiedto.models.shared.AccountingEmail[]{{
                        add(new AccountingEmail(
                        ){{}}),
                    }};
                    id = "<id>";
                    identification = "<value>";
                    isActive = false;
                    isCustomer = false;
                    isSupplier = false;
                    name = "<value>";
                    paymentMethods = new com.unifiedapi.unifiedto.models.shared.AccountingContactPaymentMethod[]{{
                        add(new AccountingContactPaymentMethod(
                        AccountingContactPaymentMethodType.GIROPAY){{
                            type = AccountingContactPaymentMethodType.IDEAL;
                        }}),
                    }};
                    portalUrl = "<value>";
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "<value>");
                    }};
                    shippingAddress = new PropertyAccountingContactShippingAddress(
){{
                        address1 = "<value>";
                        address2 = "<value>";
                        city = "Port Arely";
                        country = "Norway";
                        countryCode = "GP";
                        postalCode = "99093-9229";
                        region = "<value>";
                        regionCode = "<value>";

                    }};
                    taxExemption = TaxExemption.MEDICAL_ORG;
                    taxNumber = "<value>";
                    telephones = new com.unifiedapi.unifiedto.models.shared.AccountingTelephone[]{{
                        add(new AccountingTelephone(
                        ){{}}),
                    }};
                    updatedAt = OffsetDateTime.parse("2023-08-30T07:55:45.909Z");

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.UpdateAccountingContactResponse res = sdk.contact.updateAccountingContact(req);

            if (res.accountingContact != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                              | Type                                                                                                                                   | Required                                                                                                                               | Description                                                                                                                            |
| -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                              | [com.unifiedapi.unifiedto.models.operations.UpdateAccountingContactRequest](../../models/operations/UpdateAccountingContactRequest.md) | :heavy_check_mark:                                                                                                                     | The request object to use for the request.                                                                                             |


### Response

**[com.unifiedapi.unifiedto.models.operations.UpdateAccountingContactResponse](../../models/operations/UpdateAccountingContactResponse.md)**


## updateCrmContact

Update a contact

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.UpdateCrmContactRequest;
import com.unifiedapi.unifiedto.models.operations.UpdateCrmContactResponse;
import com.unifiedapi.unifiedto.models.shared.CrmContact;
import com.unifiedapi.unifiedto.models.shared.CrmEmail;
import com.unifiedapi.unifiedto.models.shared.CrmEmailType;
import com.unifiedapi.unifiedto.models.shared.CrmTelephone;
import com.unifiedapi.unifiedto.models.shared.CrmTelephoneType;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmContactAddress;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.UpdateCrmContactRequest req = new UpdateCrmContactRequest(
                "<value>",
                "<value>"){{
                crmContact = new CrmContact(
){{
                    address = new PropertyCrmContactAddress(
){{
                        address1 = "<value>";
                        address2 = "<value>";
                        city = "Fort Carlee";
                        country = "Greenland";
                        countryCode = "AQ";
                        postalCode = "88650";
                        region = "<value>";
                        regionCode = "<value>";

                    }};
                    company = "Hoeger Group";
                    companyIds = new String[]{{
                        add("<value>"),
                    }};
                    createdAt = OffsetDateTime.parse("2022-02-12T12:31:59.837Z");
                    dealIds = new String[]{{
                        add("<value>"),
                    }};
                    emails = new com.unifiedapi.unifiedto.models.shared.CrmEmail[]{{
                        add(new CrmEmail(
                        ){{}}),
                    }};
                    id = "<id>";
                    name = "<value>";
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "<value>");
                    }};
                    telephones = new com.unifiedapi.unifiedto.models.shared.CrmTelephone[]{{
                        add(new CrmTelephone(
                        "<value>"){{
                            telephone = "<value>";
                        }}),
                    }};
                    title = "<value>";
                    updatedAt = OffsetDateTime.parse("2023-09-02T17:59:32.331Z");
                    userId = "<value>";

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.UpdateCrmContactResponse res = sdk.contact.updateCrmContact(req);

            if (res.crmContact != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                | Type                                                                                                                     | Required                                                                                                                 | Description                                                                                                              |
| ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                | [com.unifiedapi.unifiedto.models.operations.UpdateCrmContactRequest](../../models/operations/UpdateCrmContactRequest.md) | :heavy_check_mark:                                                                                                       | The request object to use for the request.                                                                               |


### Response

**[com.unifiedapi.unifiedto.models.operations.UpdateCrmContactResponse](../../models/operations/UpdateCrmContactResponse.md)**


## updateUcContact

Update a contact

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.UpdateUcContactRequest;
import com.unifiedapi.unifiedto.models.operations.UpdateUcContactResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import com.unifiedapi.unifiedto.models.shared.UcContact;
import com.unifiedapi.unifiedto.models.shared.UcEmail;
import com.unifiedapi.unifiedto.models.shared.UcEmailType;
import com.unifiedapi.unifiedto.models.shared.UcTelephone;
import com.unifiedapi.unifiedto.models.shared.UcTelephoneType;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.UpdateUcContactRequest req = new UpdateUcContactRequest(
                "<value>",
                "<value>"){{
                ucContact = new UcContact(
){{
                    company = "Marquardt Group";
                    createdAt = OffsetDateTime.parse("2024-02-21T18:47:57.314Z");
                    emails = new com.unifiedapi.unifiedto.models.shared.UcEmail[]{{
                        add(new UcEmail(
                        "<value>"){{
                            email = "Stephany25@yahoo.com";
                        }}),
                    }};
                    id = "<id>";
                    name = "<value>";
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "<value>");
                    }};
                    telephones = new com.unifiedapi.unifiedto.models.shared.UcTelephone[]{{
                        add(new UcTelephone(
                        "<value>"){{
                            telephone = "<value>";
                        }}),
                    }};
                    title = "<value>";
                    updatedAt = OffsetDateTime.parse("2022-09-20T18:11:34.218Z");

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.UpdateUcContactResponse res = sdk.contact.updateUcContact(req);

            if (res.ucContact != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                              | Type                                                                                                                   | Required                                                                                                               | Description                                                                                                            |
| ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                              | [com.unifiedapi.unifiedto.models.operations.UpdateUcContactRequest](../../models/operations/UpdateUcContactRequest.md) | :heavy_check_mark:                                                                                                     | The request object to use for the request.                                                                             |


### Response

**[com.unifiedapi.unifiedto.models.operations.UpdateUcContactResponse](../../models/operations/UpdateUcContactResponse.md)**

