# Customer
(*customer*)

### Available Operations

* [createAccountingCustomer](#createaccountingcustomer) - Create a customer
* [createTicketingCustomer](#createticketingcustomer) - Create a customer
* [getAccountingCustomer](#getaccountingcustomer) - Retrieve a customer
* [getTicketingCustomer](#getticketingcustomer) - Retrieve a customer
* [listAccountingCustomers](#listaccountingcustomers) - List all customers
* [listTicketingCustomers](#listticketingcustomers) - List all customers
* [patchAccountingCustomer](#patchaccountingcustomer) - Update a customer
* [patchTicketingCustomer](#patchticketingcustomer) - Update a customer
* [removeAccountingCustomer](#removeaccountingcustomer) - Remove a customer
* [removeTicketingCustomer](#removeticketingcustomer) - Remove a customer
* [updateAccountingCustomer](#updateaccountingcustomer) - Update a customer
* [updateTicketingCustomer](#updateticketingcustomer) - Update a customer

## createAccountingCustomer

Create a customer

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.CreateAccountingCustomerRequest;
import com.unifiedapi.unifiedto.models.operations.CreateAccountingCustomerResponse;
import com.unifiedapi.unifiedto.models.shared.AccountingCustomer;
import com.unifiedapi.unifiedto.models.shared.AccountingEmail;
import com.unifiedapi.unifiedto.models.shared.AccountingEmailType;
import com.unifiedapi.unifiedto.models.shared.AccountingTelephone;
import com.unifiedapi.unifiedto.models.shared.AccountingTelephoneType;
import com.unifiedapi.unifiedto.models.shared.PropertyAccountingCustomerBillingAddress;
import com.unifiedapi.unifiedto.models.shared.PropertyAccountingCustomerRaw;
import com.unifiedapi.unifiedto.models.shared.PropertyAccountingCustomerShippingAddress;
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

            com.unifiedapi.unifiedto.models.operations.CreateAccountingCustomerRequest req = new CreateAccountingCustomerRequest(
                "string"){{
                accountingCustomer = new AccountingCustomer(
){{
                    billingAddress = new PropertyAccountingCustomerBillingAddress(
){{
                        address1 = "string";
                        address2 = "string";
                        city = "New Raulfield";
                        country = "Libyan Arab Jamahiriya";
                        countryCode = "IN";
                        postalCode = "22232";
                        region = "string";
                        regionCode = "string";

                    }};
                    createdAt = OffsetDateTime.parse("2021-07-22T19:16:48.798Z");
                    currency = "Dalasi";
                    emails = new com.unifiedapi.unifiedto.models.shared.AccountingEmail[]{{
                        add(new AccountingEmail(
                        "string"){{
                            email = "Loren78@gmail.com";
                        }}),
                    }};
                    id = "<ID>";
                    isActive = false;
                    name = "string";
                    raw = new PropertyAccountingCustomerRaw(
);
                    shippingAddress = new PropertyAccountingCustomerShippingAddress(
){{
                        address1 = "string";
                        address2 = "string";
                        city = "North Stanford";
                        country = "Iceland";
                        countryCode = "AZ";
                        postalCode = "11906-2906";
                        region = "string";
                        regionCode = "string";

                    }};
                    taxExemption = TaxExemption.RESALE;
                    taxNumber = "string";
                    telephones = new com.unifiedapi.unifiedto.models.shared.AccountingTelephone[]{{
                        add(new AccountingTelephone(
                        "string"){{
                            telephone = "string";
                        }}),
                    }};
                    updatedAt = OffsetDateTime.parse("2021-12-07T14:42:11.734Z");

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.CreateAccountingCustomerResponse res = sdk.customer.createAccountingCustomer(req);

            if (res.accountingCustomer != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                | Type                                                                                                                                     | Required                                                                                                                                 | Description                                                                                                                              |
| ---------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                | [com.unifiedapi.unifiedto.models.operations.CreateAccountingCustomerRequest](../../models/operations/CreateAccountingCustomerRequest.md) | :heavy_check_mark:                                                                                                                       | The request object to use for the request.                                                                                               |


### Response

**[com.unifiedapi.unifiedto.models.operations.CreateAccountingCustomerResponse](../../models/operations/CreateAccountingCustomerResponse.md)**


## createTicketingCustomer

Create a customer

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.CreateTicketingCustomerRequest;
import com.unifiedapi.unifiedto.models.operations.CreateTicketingCustomerResponse;
import com.unifiedapi.unifiedto.models.shared.PropertyTicketingCustomerRaw;
import com.unifiedapi.unifiedto.models.shared.Security;
import com.unifiedapi.unifiedto.models.shared.TicketingCustomer;
import com.unifiedapi.unifiedto.models.shared.TicketingEmail;
import com.unifiedapi.unifiedto.models.shared.TicketingEmailType;
import com.unifiedapi.unifiedto.models.shared.TicketingTelephone;
import com.unifiedapi.unifiedto.models.shared.TicketingTelephoneType;
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

            com.unifiedapi.unifiedto.models.operations.CreateTicketingCustomerRequest req = new CreateTicketingCustomerRequest(
                "string"){{
                ticketingCustomer = new TicketingCustomer(
){{
                    createdAt = OffsetDateTime.parse("2022-06-19T07:03:19.095Z");
                    emails = new com.unifiedapi.unifiedto.models.shared.TicketingEmail[]{{
                        add(new TicketingEmail(
                        "string"){{
                            email = "Jenifer.Friesen50@yahoo.com";
                        }}),
                    }};
                    id = "<ID>";
                    name = "string";
                    raw = new PropertyTicketingCustomerRaw(
);
                    tags = new String[]{{
                        add("string"),
                    }};
                    telephones = new com.unifiedapi.unifiedto.models.shared.TicketingTelephone[]{{
                        add(new TicketingTelephone(
                        "string"){{
                            telephone = "string";
                        }}),
                    }};
                    updatedAt = OffsetDateTime.parse("2023-08-22T11:52:38.346Z");

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.CreateTicketingCustomerResponse res = sdk.customer.createTicketingCustomer(req);

            if (res.ticketingCustomer != null) {
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
| `request`                                                                                                                              | [com.unifiedapi.unifiedto.models.operations.CreateTicketingCustomerRequest](../../models/operations/CreateTicketingCustomerRequest.md) | :heavy_check_mark:                                                                                                                     | The request object to use for the request.                                                                                             |


### Response

**[com.unifiedapi.unifiedto.models.operations.CreateTicketingCustomerResponse](../../models/operations/CreateTicketingCustomerResponse.md)**


## getAccountingCustomer

Retrieve a customer

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetAccountingCustomerRequest;
import com.unifiedapi.unifiedto.models.operations.GetAccountingCustomerResponse;
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

            com.unifiedapi.unifiedto.models.operations.GetAccountingCustomerRequest req = new GetAccountingCustomerRequest(
                "string",
                "string"){{
                fields = new String[]{{
                    add("string"),
                }};

            }};

            com.unifiedapi.unifiedto.models.operations.GetAccountingCustomerResponse res = sdk.customer.getAccountingCustomer(req);

            if (res.accountingCustomer != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                          | Type                                                                                                                               | Required                                                                                                                           | Description                                                                                                                        |
| ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                          | [com.unifiedapi.unifiedto.models.operations.GetAccountingCustomerRequest](../../models/operations/GetAccountingCustomerRequest.md) | :heavy_check_mark:                                                                                                                 | The request object to use for the request.                                                                                         |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetAccountingCustomerResponse](../../models/operations/GetAccountingCustomerResponse.md)**


## getTicketingCustomer

Retrieve a customer

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetTicketingCustomerRequest;
import com.unifiedapi.unifiedto.models.operations.GetTicketingCustomerResponse;
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

            com.unifiedapi.unifiedto.models.operations.GetTicketingCustomerRequest req = new GetTicketingCustomerRequest(
                "string",
                "string"){{
                fields = new String[]{{
                    add("string"),
                }};

            }};

            com.unifiedapi.unifiedto.models.operations.GetTicketingCustomerResponse res = sdk.customer.getTicketingCustomer(req);

            if (res.ticketingCustomer != null) {
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
| `request`                                                                                                                        | [com.unifiedapi.unifiedto.models.operations.GetTicketingCustomerRequest](../../models/operations/GetTicketingCustomerRequest.md) | :heavy_check_mark:                                                                                                               | The request object to use for the request.                                                                                       |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetTicketingCustomerResponse](../../models/operations/GetTicketingCustomerResponse.md)**


## listAccountingCustomers

List all customers

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.ListAccountingCustomersRequest;
import com.unifiedapi.unifiedto.models.operations.ListAccountingCustomersResponse;
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

            com.unifiedapi.unifiedto.models.operations.ListAccountingCustomersRequest req = new ListAccountingCustomersRequest(
                "string"){{
                fields = new String[]{{
                    add("string"),
                }};
                limit = 7844.09d;
                offset = 4439.53d;
                order = "string";
                query = "string";
                sort = "string";
                updatedGte = OffsetDateTime.parse("2021-08-23T13:14:33.970Z");

            }};

            com.unifiedapi.unifiedto.models.operations.ListAccountingCustomersResponse res = sdk.customer.listAccountingCustomers(req);

            if (res.accountingCustomers != null) {
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
| `request`                                                                                                                              | [com.unifiedapi.unifiedto.models.operations.ListAccountingCustomersRequest](../../models/operations/ListAccountingCustomersRequest.md) | :heavy_check_mark:                                                                                                                     | The request object to use for the request.                                                                                             |


### Response

**[com.unifiedapi.unifiedto.models.operations.ListAccountingCustomersResponse](../../models/operations/ListAccountingCustomersResponse.md)**


## listTicketingCustomers

List all customers

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.ListTicketingCustomersRequest;
import com.unifiedapi.unifiedto.models.operations.ListTicketingCustomersResponse;
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

            com.unifiedapi.unifiedto.models.operations.ListTicketingCustomersRequest req = new ListTicketingCustomersRequest(
                "string"){{
                fields = new String[]{{
                    add("string"),
                }};
                limit = 3917.11d;
                offset = 274.81d;
                order = "string";
                query = "string";
                sort = "string";
                updatedGte = OffsetDateTime.parse("2021-06-05T16:20:32.808Z");

            }};

            com.unifiedapi.unifiedto.models.operations.ListTicketingCustomersResponse res = sdk.customer.listTicketingCustomers(req);

            if (res.ticketingCustomers != null) {
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
| `request`                                                                                                                            | [com.unifiedapi.unifiedto.models.operations.ListTicketingCustomersRequest](../../models/operations/ListTicketingCustomersRequest.md) | :heavy_check_mark:                                                                                                                   | The request object to use for the request.                                                                                           |


### Response

**[com.unifiedapi.unifiedto.models.operations.ListTicketingCustomersResponse](../../models/operations/ListTicketingCustomersResponse.md)**


## patchAccountingCustomer

Update a customer

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PatchAccountingCustomerRequest;
import com.unifiedapi.unifiedto.models.operations.PatchAccountingCustomerResponse;
import com.unifiedapi.unifiedto.models.shared.AccountingCustomer;
import com.unifiedapi.unifiedto.models.shared.AccountingEmail;
import com.unifiedapi.unifiedto.models.shared.AccountingEmailType;
import com.unifiedapi.unifiedto.models.shared.AccountingTelephone;
import com.unifiedapi.unifiedto.models.shared.AccountingTelephoneType;
import com.unifiedapi.unifiedto.models.shared.PropertyAccountingCustomerBillingAddress;
import com.unifiedapi.unifiedto.models.shared.PropertyAccountingCustomerRaw;
import com.unifiedapi.unifiedto.models.shared.PropertyAccountingCustomerShippingAddress;
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

            com.unifiedapi.unifiedto.models.operations.PatchAccountingCustomerRequest req = new PatchAccountingCustomerRequest(
                "string",
                "string"){{
                accountingCustomer = new AccountingCustomer(
){{
                    billingAddress = new PropertyAccountingCustomerBillingAddress(
){{
                        address1 = "string";
                        address2 = "string";
                        city = "Visalia";
                        country = "Norway";
                        countryCode = "LY";
                        postalCode = "50996-7347";
                        region = "string";
                        regionCode = "string";

                    }};
                    createdAt = OffsetDateTime.parse("2023-08-27T01:00:12.169Z");
                    currency = "Kina";
                    emails = new com.unifiedapi.unifiedto.models.shared.AccountingEmail[]{{
                        add(new AccountingEmail(
                        "string"){{
                            email = "Imani57@yahoo.com";
                        }}),
                    }};
                    id = "<ID>";
                    isActive = false;
                    name = "string";
                    raw = new PropertyAccountingCustomerRaw(
);
                    shippingAddress = new PropertyAccountingCustomerShippingAddress(
){{
                        address1 = "string";
                        address2 = "string";
                        city = "Haltom City";
                        country = "Uruguay";
                        countryCode = "ZA";
                        postalCode = "10354-8050";
                        region = "string";
                        regionCode = "string";

                    }};
                    taxExemption = TaxExemption.LOCAL_GOV;
                    taxNumber = "string";
                    telephones = new com.unifiedapi.unifiedto.models.shared.AccountingTelephone[]{{
                        add(new AccountingTelephone(
                        "string"){{
                            telephone = "string";
                        }}),
                    }};
                    updatedAt = OffsetDateTime.parse("2022-02-08T06:05:59.693Z");

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.PatchAccountingCustomerResponse res = sdk.customer.patchAccountingCustomer(req);

            if (res.accountingCustomer != null) {
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
| `request`                                                                                                                              | [com.unifiedapi.unifiedto.models.operations.PatchAccountingCustomerRequest](../../models/operations/PatchAccountingCustomerRequest.md) | :heavy_check_mark:                                                                                                                     | The request object to use for the request.                                                                                             |


### Response

**[com.unifiedapi.unifiedto.models.operations.PatchAccountingCustomerResponse](../../models/operations/PatchAccountingCustomerResponse.md)**


## patchTicketingCustomer

Update a customer

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PatchTicketingCustomerRequest;
import com.unifiedapi.unifiedto.models.operations.PatchTicketingCustomerResponse;
import com.unifiedapi.unifiedto.models.shared.PropertyTicketingCustomerRaw;
import com.unifiedapi.unifiedto.models.shared.Security;
import com.unifiedapi.unifiedto.models.shared.TicketingCustomer;
import com.unifiedapi.unifiedto.models.shared.TicketingEmail;
import com.unifiedapi.unifiedto.models.shared.TicketingEmailType;
import com.unifiedapi.unifiedto.models.shared.TicketingTelephone;
import com.unifiedapi.unifiedto.models.shared.TicketingTelephoneType;
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

            com.unifiedapi.unifiedto.models.operations.PatchTicketingCustomerRequest req = new PatchTicketingCustomerRequest(
                "string",
                "string"){{
                ticketingCustomer = new TicketingCustomer(
){{
                    createdAt = OffsetDateTime.parse("2023-06-30T19:19:15.782Z");
                    emails = new com.unifiedapi.unifiedto.models.shared.TicketingEmail[]{{
                        add(new TicketingEmail(
                        "string"){{
                            email = "Rosalinda.Abshire11@hotmail.com";
                        }}),
                    }};
                    id = "<ID>";
                    name = "string";
                    raw = new PropertyTicketingCustomerRaw(
);
                    tags = new String[]{{
                        add("string"),
                    }};
                    telephones = new com.unifiedapi.unifiedto.models.shared.TicketingTelephone[]{{
                        add(new TicketingTelephone(
                        "string"){{
                            telephone = "string";
                        }}),
                    }};
                    updatedAt = OffsetDateTime.parse("2021-10-01T03:16:10.656Z");

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.PatchTicketingCustomerResponse res = sdk.customer.patchTicketingCustomer(req);

            if (res.ticketingCustomer != null) {
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
| `request`                                                                                                                            | [com.unifiedapi.unifiedto.models.operations.PatchTicketingCustomerRequest](../../models/operations/PatchTicketingCustomerRequest.md) | :heavy_check_mark:                                                                                                                   | The request object to use for the request.                                                                                           |


### Response

**[com.unifiedapi.unifiedto.models.operations.PatchTicketingCustomerResponse](../../models/operations/PatchTicketingCustomerResponse.md)**


## removeAccountingCustomer

Remove a customer

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.RemoveAccountingCustomerRequest;
import com.unifiedapi.unifiedto.models.operations.RemoveAccountingCustomerResponse;
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

            com.unifiedapi.unifiedto.models.operations.RemoveAccountingCustomerRequest req = new RemoveAccountingCustomerRequest(
                "string",
                "string");

            com.unifiedapi.unifiedto.models.operations.RemoveAccountingCustomerResponse res = sdk.customer.removeAccountingCustomer(req);

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

| Parameter                                                                                                                                | Type                                                                                                                                     | Required                                                                                                                                 | Description                                                                                                                              |
| ---------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                | [com.unifiedapi.unifiedto.models.operations.RemoveAccountingCustomerRequest](../../models/operations/RemoveAccountingCustomerRequest.md) | :heavy_check_mark:                                                                                                                       | The request object to use for the request.                                                                                               |


### Response

**[com.unifiedapi.unifiedto.models.operations.RemoveAccountingCustomerResponse](../../models/operations/RemoveAccountingCustomerResponse.md)**


## removeTicketingCustomer

Remove a customer

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.RemoveTicketingCustomerRequest;
import com.unifiedapi.unifiedto.models.operations.RemoveTicketingCustomerResponse;
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

            com.unifiedapi.unifiedto.models.operations.RemoveTicketingCustomerRequest req = new RemoveTicketingCustomerRequest(
                "string",
                "string");

            com.unifiedapi.unifiedto.models.operations.RemoveTicketingCustomerResponse res = sdk.customer.removeTicketingCustomer(req);

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
| `request`                                                                                                                              | [com.unifiedapi.unifiedto.models.operations.RemoveTicketingCustomerRequest](../../models/operations/RemoveTicketingCustomerRequest.md) | :heavy_check_mark:                                                                                                                     | The request object to use for the request.                                                                                             |


### Response

**[com.unifiedapi.unifiedto.models.operations.RemoveTicketingCustomerResponse](../../models/operations/RemoveTicketingCustomerResponse.md)**


## updateAccountingCustomer

Update a customer

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.UpdateAccountingCustomerRequest;
import com.unifiedapi.unifiedto.models.operations.UpdateAccountingCustomerResponse;
import com.unifiedapi.unifiedto.models.shared.AccountingCustomer;
import com.unifiedapi.unifiedto.models.shared.AccountingEmail;
import com.unifiedapi.unifiedto.models.shared.AccountingEmailType;
import com.unifiedapi.unifiedto.models.shared.AccountingTelephone;
import com.unifiedapi.unifiedto.models.shared.AccountingTelephoneType;
import com.unifiedapi.unifiedto.models.shared.PropertyAccountingCustomerBillingAddress;
import com.unifiedapi.unifiedto.models.shared.PropertyAccountingCustomerRaw;
import com.unifiedapi.unifiedto.models.shared.PropertyAccountingCustomerShippingAddress;
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

            com.unifiedapi.unifiedto.models.operations.UpdateAccountingCustomerRequest req = new UpdateAccountingCustomerRequest(
                "string",
                "string"){{
                accountingCustomer = new AccountingCustomer(
){{
                    billingAddress = new PropertyAccountingCustomerBillingAddress(
){{
                        address1 = "string";
                        address2 = "string";
                        city = "Renton";
                        country = "Iceland";
                        countryCode = "VN";
                        postalCode = "77223-4340";
                        region = "string";
                        regionCode = "string";

                    }};
                    createdAt = OffsetDateTime.parse("2023-05-08T08:34:01.295Z");
                    currency = "Guinea Franc";
                    emails = new com.unifiedapi.unifiedto.models.shared.AccountingEmail[]{{
                        add(new AccountingEmail(
                        "string"){{
                            email = "Johnson53@hotmail.com";
                        }}),
                    }};
                    id = "<ID>";
                    isActive = false;
                    name = "string";
                    raw = new PropertyAccountingCustomerRaw(
);
                    shippingAddress = new PropertyAccountingCustomerShippingAddress(
){{
                        address1 = "string";
                        address2 = "string";
                        city = "Catalina Foothills";
                        country = "Eritrea";
                        countryCode = "MZ";
                        postalCode = "44150";
                        region = "string";
                        regionCode = "string";

                    }};
                    taxExemption = TaxExemption.CHARITABLE_ORG;
                    taxNumber = "string";
                    telephones = new com.unifiedapi.unifiedto.models.shared.AccountingTelephone[]{{
                        add(new AccountingTelephone(
                        "string"){{
                            telephone = "string";
                        }}),
                    }};
                    updatedAt = OffsetDateTime.parse("2022-07-26T10:11:07.824Z");

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.UpdateAccountingCustomerResponse res = sdk.customer.updateAccountingCustomer(req);

            if (res.accountingCustomer != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                | Type                                                                                                                                     | Required                                                                                                                                 | Description                                                                                                                              |
| ---------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                | [com.unifiedapi.unifiedto.models.operations.UpdateAccountingCustomerRequest](../../models/operations/UpdateAccountingCustomerRequest.md) | :heavy_check_mark:                                                                                                                       | The request object to use for the request.                                                                                               |


### Response

**[com.unifiedapi.unifiedto.models.operations.UpdateAccountingCustomerResponse](../../models/operations/UpdateAccountingCustomerResponse.md)**


## updateTicketingCustomer

Update a customer

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.UpdateTicketingCustomerRequest;
import com.unifiedapi.unifiedto.models.operations.UpdateTicketingCustomerResponse;
import com.unifiedapi.unifiedto.models.shared.PropertyTicketingCustomerRaw;
import com.unifiedapi.unifiedto.models.shared.Security;
import com.unifiedapi.unifiedto.models.shared.TicketingCustomer;
import com.unifiedapi.unifiedto.models.shared.TicketingEmail;
import com.unifiedapi.unifiedto.models.shared.TicketingEmailType;
import com.unifiedapi.unifiedto.models.shared.TicketingTelephone;
import com.unifiedapi.unifiedto.models.shared.TicketingTelephoneType;
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

            com.unifiedapi.unifiedto.models.operations.UpdateTicketingCustomerRequest req = new UpdateTicketingCustomerRequest(
                "string",
                "string"){{
                ticketingCustomer = new TicketingCustomer(
){{
                    createdAt = OffsetDateTime.parse("2023-10-13T13:29:08.944Z");
                    emails = new com.unifiedapi.unifiedto.models.shared.TicketingEmail[]{{
                        add(new TicketingEmail(
                        "string"){{
                            email = "Demetris72@hotmail.com";
                        }}),
                    }};
                    id = "<ID>";
                    name = "string";
                    raw = new PropertyTicketingCustomerRaw(
);
                    tags = new String[]{{
                        add("string"),
                    }};
                    telephones = new com.unifiedapi.unifiedto.models.shared.TicketingTelephone[]{{
                        add(new TicketingTelephone(
                        "string"){{
                            telephone = "string";
                        }}),
                    }};
                    updatedAt = OffsetDateTime.parse("2022-06-02T10:57:20.628Z");

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.UpdateTicketingCustomerResponse res = sdk.customer.updateTicketingCustomer(req);

            if (res.ticketingCustomer != null) {
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
| `request`                                                                                                                              | [com.unifiedapi.unifiedto.models.operations.UpdateTicketingCustomerRequest](../../models/operations/UpdateTicketingCustomerRequest.md) | :heavy_check_mark:                                                                                                                     | The request object to use for the request.                                                                                             |


### Response

**[com.unifiedapi.unifiedto.models.operations.UpdateTicketingCustomerResponse](../../models/operations/UpdateTicketingCustomerResponse.md)**

