# Customer

### Available Operations

* [deleteTicketingConnectionIdCustomerId](#deleteticketingconnectionidcustomerid) - Remove a customer
* [getTicketingConnectionIdCustomer](#getticketingconnectionidcustomer) - List all customers
* [getTicketingConnectionIdCustomerId](#getticketingconnectionidcustomerid) - Retrieve a customer
* [patchTicketingConnectionIdCustomerId](#patchticketingconnectionidcustomerid) - Update a customer
* [postTicketingConnectionIdCustomer](#postticketingconnectionidcustomer) - Create a customer
* [putTicketingConnectionIdCustomerId](#putticketingconnectionidcustomerid) - Update a customer

## deleteTicketingConnectionIdCustomerId

Remove a customer

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.DeleteTicketingConnectionIdCustomerIdRequest;
import com.unifiedapi.unifiedto.models.operations.DeleteTicketingConnectionIdCustomerIdResponse;
import com.unifiedapi.unifiedto.models.operations.DeleteTicketingConnectionIdCustomerIdSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            DeleteTicketingConnectionIdCustomerIdRequest req = new DeleteTicketingConnectionIdCustomerIdRequest("vitae", "quisquam");            

            DeleteTicketingConnectionIdCustomerIdResponse res = sdk.customer.deleteTicketingConnectionIdCustomerId(req, new DeleteTicketingConnectionIdCustomerIdSecurity("atque") {{
                jwt = "";
            }});

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

| Parameter                                                                                                                                                            | Type                                                                                                                                                                 | Required                                                                                                                                                             | Description                                                                                                                                                          |
| -------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                            | [com.unifiedapi.unifiedto.models.operations.DeleteTicketingConnectionIdCustomerIdRequest](../../models/operations/DeleteTicketingConnectionIdCustomerIdRequest.md)   | :heavy_check_mark:                                                                                                                                                   | The request object to use for the request.                                                                                                                           |
| `security`                                                                                                                                                           | [com.unifiedapi.unifiedto.models.operations.DeleteTicketingConnectionIdCustomerIdSecurity](../../models/operations/DeleteTicketingConnectionIdCustomerIdSecurity.md) | :heavy_check_mark:                                                                                                                                                   | The security requirements to use for the request.                                                                                                                    |


### Response

**[com.unifiedapi.unifiedto.models.operations.DeleteTicketingConnectionIdCustomerIdResponse](../../models/operations/DeleteTicketingConnectionIdCustomerIdResponse.md)**


## getTicketingConnectionIdCustomer

List all customers

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetTicketingConnectionIdCustomerRequest;
import com.unifiedapi.unifiedto.models.operations.GetTicketingConnectionIdCustomerResponse;
import com.unifiedapi.unifiedto.models.operations.GetTicketingConnectionIdCustomerSecurity;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            GetTicketingConnectionIdCustomerRequest req = new GetTicketingConnectionIdCustomerRequest("nihil") {{
                limit = 6319.04d;
                offset = 8377.39d;
                order = "a";
                query = "ad";
                sort = "cupiditate";
                updatedGte = OffsetDateTime.parse("2022-01-12T21:34:14.646Z");
            }};            

            GetTicketingConnectionIdCustomerResponse res = sdk.customer.getTicketingConnectionIdCustomer(req, new GetTicketingConnectionIdCustomerSecurity("repellendus") {{
                jwt = "";
            }});

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

| Parameter                                                                                                                                                  | Type                                                                                                                                                       | Required                                                                                                                                                   | Description                                                                                                                                                |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                  | [com.unifiedapi.unifiedto.models.operations.GetTicketingConnectionIdCustomerRequest](../../models/operations/GetTicketingConnectionIdCustomerRequest.md)   | :heavy_check_mark:                                                                                                                                         | The request object to use for the request.                                                                                                                 |
| `security`                                                                                                                                                 | [com.unifiedapi.unifiedto.models.operations.GetTicketingConnectionIdCustomerSecurity](../../models/operations/GetTicketingConnectionIdCustomerSecurity.md) | :heavy_check_mark:                                                                                                                                         | The security requirements to use for the request.                                                                                                          |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetTicketingConnectionIdCustomerResponse](../../models/operations/GetTicketingConnectionIdCustomerResponse.md)**


## getTicketingConnectionIdCustomerId

Retrieve a customer

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetTicketingConnectionIdCustomerIdRequest;
import com.unifiedapi.unifiedto.models.operations.GetTicketingConnectionIdCustomerIdResponse;
import com.unifiedapi.unifiedto.models.operations.GetTicketingConnectionIdCustomerIdSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            GetTicketingConnectionIdCustomerIdRequest req = new GetTicketingConnectionIdCustomerIdRequest("delectus", "ab");            

            GetTicketingConnectionIdCustomerIdResponse res = sdk.customer.getTicketingConnectionIdCustomerId(req, new GetTicketingConnectionIdCustomerIdSecurity("mollitia") {{
                jwt = "";
            }});

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

| Parameter                                                                                                                                                      | Type                                                                                                                                                           | Required                                                                                                                                                       | Description                                                                                                                                                    |
| -------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                      | [com.unifiedapi.unifiedto.models.operations.GetTicketingConnectionIdCustomerIdRequest](../../models/operations/GetTicketingConnectionIdCustomerIdRequest.md)   | :heavy_check_mark:                                                                                                                                             | The request object to use for the request.                                                                                                                     |
| `security`                                                                                                                                                     | [com.unifiedapi.unifiedto.models.operations.GetTicketingConnectionIdCustomerIdSecurity](../../models/operations/GetTicketingConnectionIdCustomerIdSecurity.md) | :heavy_check_mark:                                                                                                                                             | The security requirements to use for the request.                                                                                                              |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetTicketingConnectionIdCustomerIdResponse](../../models/operations/GetTicketingConnectionIdCustomerIdResponse.md)**


## patchTicketingConnectionIdCustomerId

Update a customer

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PatchTicketingConnectionIdCustomerIdRequest;
import com.unifiedapi.unifiedto.models.operations.PatchTicketingConnectionIdCustomerIdResponse;
import com.unifiedapi.unifiedto.models.operations.PatchTicketingConnectionIdCustomerIdSecurity;
import com.unifiedapi.unifiedto.models.shared.PropertyTicketingCustomerRaw;
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
                .build();

            PatchTicketingConnectionIdCustomerIdRequest req = new PatchTicketingConnectionIdCustomerIdRequest("possimus", "praesentium") {{
                ticketingCustomer = new TicketingCustomer(                new PropertyTicketingCustomerRaw();) {{
                    createdAt = OffsetDateTime.parse("2022-07-14T21:38:57.686Z");
                    emails = new com.unifiedapi.unifiedto.models.shared.TicketingEmail[]{{
                        add(new TicketingEmail("cumque") {{
                            email = "Sigmund78@yahoo.com";
                            type = TicketingEmailType.WORK;
                        }}),
                    }};
                    id = "19c95ba9-9867-48fa-bf69-6991af388ce0";
                    name = "Stacey Brown";
                    tags = new String[]{{
                        add("modi"),
                    }};
                    telephones = new com.unifiedapi.unifiedto.models.shared.TicketingTelephone[]{{
                        add(new TicketingTelephone("voluptate") {{
                            telephone = "quos";
                            type = TicketingTelephoneType.FAX;
                        }}),
                    }};
                    updatedAt = OffsetDateTime.parse("2022-02-13T12:26:31.089Z");
                }};;
            }};            

            PatchTicketingConnectionIdCustomerIdResponse res = sdk.customer.patchTicketingConnectionIdCustomerId(req, new PatchTicketingConnectionIdCustomerIdSecurity("reprehenderit") {{
                jwt = "";
            }});

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

| Parameter                                                                                                                                                          | Type                                                                                                                                                               | Required                                                                                                                                                           | Description                                                                                                                                                        |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                          | [com.unifiedapi.unifiedto.models.operations.PatchTicketingConnectionIdCustomerIdRequest](../../models/operations/PatchTicketingConnectionIdCustomerIdRequest.md)   | :heavy_check_mark:                                                                                                                                                 | The request object to use for the request.                                                                                                                         |
| `security`                                                                                                                                                         | [com.unifiedapi.unifiedto.models.operations.PatchTicketingConnectionIdCustomerIdSecurity](../../models/operations/PatchTicketingConnectionIdCustomerIdSecurity.md) | :heavy_check_mark:                                                                                                                                                 | The security requirements to use for the request.                                                                                                                  |


### Response

**[com.unifiedapi.unifiedto.models.operations.PatchTicketingConnectionIdCustomerIdResponse](../../models/operations/PatchTicketingConnectionIdCustomerIdResponse.md)**


## postTicketingConnectionIdCustomer

Create a customer

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PostTicketingConnectionIdCustomerRequest;
import com.unifiedapi.unifiedto.models.operations.PostTicketingConnectionIdCustomerResponse;
import com.unifiedapi.unifiedto.models.operations.PostTicketingConnectionIdCustomerSecurity;
import com.unifiedapi.unifiedto.models.shared.PropertyTicketingCustomerRaw;
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
                .build();

            PostTicketingConnectionIdCustomerRequest req = new PostTicketingConnectionIdCustomerRequest("animi") {{
                ticketingCustomer = new TicketingCustomer(                new PropertyTicketingCustomerRaw();) {{
                    createdAt = OffsetDateTime.parse("2022-01-31T11:35:16.490Z");
                    emails = new com.unifiedapi.unifiedto.models.shared.TicketingEmail[]{{
                        add(new TicketingEmail("doloremque") {{
                            email = "Christopher.Windler@hotmail.com";
                            type = TicketingEmailType.HOME;
                        }}),
                    }};
                    id = "28efeef9-3415-42ed-be25-3f4c157deaa7";
                    name = "Maureen Abshire";
                    tags = new String[]{{
                        add("dolore"),
                    }};
                    telephones = new com.unifiedapi.unifiedto.models.shared.TicketingTelephone[]{{
                        add(new TicketingTelephone("quo") {{
                            telephone = "nemo";
                            type = TicketingTelephoneType.FAX;
                        }}),
                    }};
                    updatedAt = OffsetDateTime.parse("2020-02-07T03:05:41.608Z");
                }};;
            }};            

            PostTicketingConnectionIdCustomerResponse res = sdk.customer.postTicketingConnectionIdCustomer(req, new PostTicketingConnectionIdCustomerSecurity("laboriosam") {{
                jwt = "";
            }});

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

| Parameter                                                                                                                                                    | Type                                                                                                                                                         | Required                                                                                                                                                     | Description                                                                                                                                                  |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                    | [com.unifiedapi.unifiedto.models.operations.PostTicketingConnectionIdCustomerRequest](../../models/operations/PostTicketingConnectionIdCustomerRequest.md)   | :heavy_check_mark:                                                                                                                                           | The request object to use for the request.                                                                                                                   |
| `security`                                                                                                                                                   | [com.unifiedapi.unifiedto.models.operations.PostTicketingConnectionIdCustomerSecurity](../../models/operations/PostTicketingConnectionIdCustomerSecurity.md) | :heavy_check_mark:                                                                                                                                           | The security requirements to use for the request.                                                                                                            |


### Response

**[com.unifiedapi.unifiedto.models.operations.PostTicketingConnectionIdCustomerResponse](../../models/operations/PostTicketingConnectionIdCustomerResponse.md)**


## putTicketingConnectionIdCustomerId

Update a customer

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PutTicketingConnectionIdCustomerIdRequest;
import com.unifiedapi.unifiedto.models.operations.PutTicketingConnectionIdCustomerIdResponse;
import com.unifiedapi.unifiedto.models.operations.PutTicketingConnectionIdCustomerIdSecurity;
import com.unifiedapi.unifiedto.models.shared.PropertyTicketingCustomerRaw;
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
                .build();

            PutTicketingConnectionIdCustomerIdRequest req = new PutTicketingConnectionIdCustomerIdRequest("laboriosam", "quam") {{
                ticketingCustomer = new TicketingCustomer(                new PropertyTicketingCustomerRaw();) {{
                    createdAt = OffsetDateTime.parse("2021-09-19T03:24:19.827Z");
                    emails = new com.unifiedapi.unifiedto.models.shared.TicketingEmail[]{{
                        add(new TicketingEmail("atque") {{
                            email = "Lacy_Rodriguez85@hotmail.com";
                            type = TicketingEmailType.WORK;
                        }}),
                    }};
                    id = "5fe431d6-bf5c-4838-bbb8-c20cb67fc4b4";
                    name = "Sally VonRueden";
                    tags = new String[]{{
                        add("debitis"),
                    }};
                    telephones = new com.unifiedapi.unifiedto.models.shared.TicketingTelephone[]{{
                        add(new TicketingTelephone("amet") {{
                            telephone = "laboriosam";
                            type = TicketingTelephoneType.WORK;
                        }}),
                    }};
                    updatedAt = OffsetDateTime.parse("2022-03-21T00:11:47.771Z");
                }};;
            }};            

            PutTicketingConnectionIdCustomerIdResponse res = sdk.customer.putTicketingConnectionIdCustomerId(req, new PutTicketingConnectionIdCustomerIdSecurity("occaecati") {{
                jwt = "";
            }});

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

| Parameter                                                                                                                                                      | Type                                                                                                                                                           | Required                                                                                                                                                       | Description                                                                                                                                                    |
| -------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                      | [com.unifiedapi.unifiedto.models.operations.PutTicketingConnectionIdCustomerIdRequest](../../models/operations/PutTicketingConnectionIdCustomerIdRequest.md)   | :heavy_check_mark:                                                                                                                                             | The request object to use for the request.                                                                                                                     |
| `security`                                                                                                                                                     | [com.unifiedapi.unifiedto.models.operations.PutTicketingConnectionIdCustomerIdSecurity](../../models/operations/PutTicketingConnectionIdCustomerIdSecurity.md) | :heavy_check_mark:                                                                                                                                             | The security requirements to use for the request.                                                                                                              |


### Response

**[com.unifiedapi.unifiedto.models.operations.PutTicketingConnectionIdCustomerIdResponse](../../models/operations/PutTicketingConnectionIdCustomerIdResponse.md)**

