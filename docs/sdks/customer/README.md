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
                .setSecurity(new Security("redundant"){{
                    jwt = "";
                }})
                .build();

            CreateTicketingCustomerRequest req = new CreateTicketingCustomerRequest("blue"){{
                ticketingCustomer = new TicketingCustomer(new PropertyTicketingCustomerRaw()){{
                    createdAt = OffsetDateTime.parse("2022-07-09T02:30:21.759Z");
                    emails = new com.unifiedapi.unifiedto.models.shared.TicketingEmail[]{{
                        add(new TicketingEmail("Toys"){{
                            email = "Rosalee13@hotmail.com";
                        }}),
                    }};
                    id = "<ID>";
                    name = "monitor Accountability Berkshire";
                    tags = new String[]{{
                        add("East"),
                    }};
                    telephones = new com.unifiedapi.unifiedto.models.shared.TicketingTelephone[]{{
                        add(new TicketingTelephone("functionalities"){{
                            telephone = "1080p transition Investment";
                        }}),
                    }};
                    updatedAt = OffsetDateTime.parse("2021-07-10T05:40:36.874Z");
                }};
                fields = new String[]{{
                    add("Haiti"),
                }};
            }};            

            CreateTicketingCustomerResponse res = sdk.customer.createTicketingCustomer(req);

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
                .setSecurity(new Security("Berkshire"){{
                    jwt = "";
                }})
                .build();

            GetTicketingCustomerRequest req = new GetTicketingCustomerRequest("Gloves", "Brand"){{
                fields = new String[]{{
                    add("Van"),
                }};
            }};            

            GetTicketingCustomerResponse res = sdk.customer.getTicketingCustomer(req);

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
                .setSecurity(new Security("adapter"){{
                    jwt = "";
                }})
                .build();

            ListTicketingCustomersRequest req = new ListTicketingCustomersRequest("Unions"){{
                fields = new String[]{{
                    add("Ferry"),
                }};
                limit = 4622.26d;
                offset = 2110.17d;
                order = "JSON lavender transmitter";
                query = "billboard Rial";
                sort = "Account Bedfordshire Cis";
                updatedGte = OffsetDateTime.parse("2023-06-22T18:28:19.811Z");
            }};            

            ListTicketingCustomersResponse res = sdk.customer.listTicketingCustomers(req);

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
                .setSecurity(new Security("Royce"){{
                    jwt = "";
                }})
                .build();

            PatchTicketingCustomerRequest req = new PatchTicketingCustomerRequest("West", "Brownsville"){{
                ticketingCustomer = new TicketingCustomer(new PropertyTicketingCustomerRaw()){{
                    createdAt = OffsetDateTime.parse("2021-10-01T03:16:10.656Z");
                    emails = new com.unifiedapi.unifiedto.models.shared.TicketingEmail[]{{
                        add(new TicketingEmail("South"){{
                            email = "Jo_Rippin11@hotmail.com";
                        }}),
                    }};
                    id = "<ID>";
                    name = "Rustic";
                    tags = new String[]{{
                        add("thug"),
                    }};
                    telephones = new com.unifiedapi.unifiedto.models.shared.TicketingTelephone[]{{
                        add(new TicketingTelephone("Tesla"){{
                            telephone = "Cis neatly circuit";
                        }}),
                    }};
                    updatedAt = OffsetDateTime.parse("2023-04-21T14:41:05.293Z");
                }};
                fields = new String[]{{
                    add("Iceland"),
                }};
            }};            

            PatchTicketingCustomerResponse res = sdk.customer.patchTicketingCustomer(req);

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
                .setSecurity(new Security("West"){{
                    jwt = "";
                }})
                .build();

            RemoveTicketingCustomerRequest req = new RemoveTicketingCustomerRequest("compress", "silver");            

            RemoveTicketingCustomerResponse res = sdk.customer.removeTicketingCustomer(req);

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
                .setSecurity(new Security("mmm"){{
                    jwt = "";
                }})
                .build();

            UpdateTicketingCustomerRequest req = new UpdateTicketingCustomerRequest("Granite", "South"){{
                ticketingCustomer = new TicketingCustomer(new PropertyTicketingCustomerRaw()){{
                    createdAt = OffsetDateTime.parse("2022-06-02T10:57:20.628Z");
                    emails = new com.unifiedapi.unifiedto.models.shared.TicketingEmail[]{{
                        add(new TicketingEmail("Bolivia"){{
                            email = "Jonatan.Johnson@gmail.com";
                        }}),
                    }};
                    id = "<ID>";
                    name = "Soft leading Borders";
                    tags = new String[]{{
                        add("Bohrium"),
                    }};
                    telephones = new com.unifiedapi.unifiedto.models.shared.TicketingTelephone[]{{
                        add(new TicketingTelephone("parsing"){{
                            telephone = "safe invoice";
                        }}),
                    }};
                    updatedAt = OffsetDateTime.parse("2022-04-11T11:07:01.811Z");
                }};
                fields = new String[]{{
                    add("Fiat"),
                }};
            }};            

            UpdateTicketingCustomerResponse res = sdk.customer.updateTicketingCustomer(req);

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

