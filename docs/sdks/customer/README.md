# Customer
(*customer*)

### Available Operations

* [createTicketingCustomer](#createticketingcustomer) - Create a customer
* [getTicketingCustomer](#getticketingcustomer) - Retrieve a customer
* [listTicketingCustomers](#listticketingcustomers) - List all customers
* [patchTicketingCustomer](#patchticketingcustomer) - Update a customer
* [removeTicketingCustomer](#removeticketingcustomer) - Remove a customer
* [updateTicketingCustomer](#updateticketingcustomer) - Update a customer

## createTicketingCustomer

Create a customer

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.CreateTicketingCustomerRequest;
import com.unifiedapi.unifiedto.models.operations.CreateTicketingCustomerResponse;
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
                "<value>"){{
                ticketingCustomer = new TicketingCustomer(
){{
                    createdAt = OffsetDateTime.parse("2023-06-19T18:45:57.085Z");
                    emails = new com.unifiedapi.unifiedto.models.shared.TicketingEmail[]{{
                        add(new TicketingEmail(
                        "<value>"){{
                            email = "Jenifer.Friesen50@yahoo.com";
                        }}),
                    }};
                    id = "<id>";
                    name = "<value>";
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "<value>");
                    }};
                    tags = new String[]{{
                        add("<value>"),
                    }};
                    telephones = new com.unifiedapi.unifiedto.models.shared.TicketingTelephone[]{{
                        add(new TicketingTelephone(
                        "<value>"){{
                            telephone = "<value>";
                        }}),
                    }};
                    updatedAt = OffsetDateTime.parse("2024-08-22T08:59:42.052Z");

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
                "<value>",
                "<value>"){{
                fields = new String[]{{
                    add("<value>"),
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
                "<value>"){{
                fields = new String[]{{
                    add("<value>"),
                }};
                limit = 3917.11d;
                offset = 274.81d;
                order = "<value>";
                query = "<value>";
                sort = "<value>";
                updatedGte = OffsetDateTime.parse("2022-06-05T19:45:16.674Z");

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


## patchTicketingCustomer

Update a customer

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PatchTicketingCustomerRequest;
import com.unifiedapi.unifiedto.models.operations.PatchTicketingCustomerResponse;
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
                "<value>",
                "<value>"){{
                ticketingCustomer = new TicketingCustomer(
){{
                    createdAt = OffsetDateTime.parse("2024-06-30T15:17:02.043Z");
                    emails = new com.unifiedapi.unifiedto.models.shared.TicketingEmail[]{{
                        add(new TicketingEmail(
                        "<value>"){{
                            email = "Rosalinda.Abshire11@hotmail.com";
                        }}),
                    }};
                    id = "<id>";
                    name = "<value>";
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "<value>");
                    }};
                    tags = new String[]{{
                        add("<value>"),
                    }};
                    telephones = new com.unifiedapi.unifiedto.models.shared.TicketingTelephone[]{{
                        add(new TicketingTelephone(
                        "<value>"){{
                            telephone = "<value>";
                        }}),
                    }};
                    updatedAt = OffsetDateTime.parse("2022-10-01T09:15:22.227Z");

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
                "<value>",
                "<value>");

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


## updateTicketingCustomer

Update a customer

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.UpdateTicketingCustomerRequest;
import com.unifiedapi.unifiedto.models.operations.UpdateTicketingCustomerResponse;
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
                "<value>",
                "<value>"){{
                ticketingCustomer = new TicketingCustomer(
){{
                    createdAt = OffsetDateTime.parse("2024-10-13T11:44:40.953Z");
                    emails = new com.unifiedapi.unifiedto.models.shared.TicketingEmail[]{{
                        add(new TicketingEmail(
                        "<value>"){{
                            email = "Demetris72@hotmail.com";
                        }}),
                    }};
                    id = "<id>";
                    name = "<value>";
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "<value>");
                    }};
                    tags = new String[]{{
                        add("<value>"),
                    }};
                    telephones = new com.unifiedapi.unifiedto.models.shared.TicketingTelephone[]{{
                        add(new TicketingTelephone(
                        "<value>"){{
                            telephone = "<value>";
                        }}),
                    }};
                    updatedAt = OffsetDateTime.parse("2023-06-02T22:17:50.071Z");

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

