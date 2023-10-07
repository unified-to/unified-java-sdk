# Uc
(*uc*)

### Available Operations

* [deleteUcConnectionIdContactId](#deleteucconnectionidcontactid) - Remove a contact
* [getUcConnectionIdAgent](#getucconnectionidagent) - List all agents
* [getUcConnectionIdCall](#getucconnectionidcall) - List all calls
* [getUcConnectionIdContact](#getucconnectionidcontact) - List all contacts
* [getUcConnectionIdContactId](#getucconnectionidcontactid) - Retrieve a contact
* [patchUcConnectionIdContactId](#patchucconnectionidcontactid) - Update a contact
* [postUcConnectionIdContact](#postucconnectionidcontact) - Create a contact
* [putUcConnectionIdContactId](#putucconnectionidcontactid) - Update a contact

## deleteUcConnectionIdContactId

Remove a contact

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.DeleteUcConnectionIdContactIdRequest;
import com.unifiedapi.unifiedto.models.operations.DeleteUcConnectionIdContactIdResponse;
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("Aluminium"){{
                    jwt = "";
                }})
                .build();

            DeleteUcConnectionIdContactIdRequest req = new DeleteUcConnectionIdContactIdRequest("Tactics", "Cobalt");            

            DeleteUcConnectionIdContactIdResponse res = sdk.uc.deleteUcConnectionIdContactId(req);

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

| Parameter                                                                                                                                          | Type                                                                                                                                               | Required                                                                                                                                           | Description                                                                                                                                        |
| -------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                          | [com.unifiedapi.unifiedto.models.operations.DeleteUcConnectionIdContactIdRequest](../../models/operations/DeleteUcConnectionIdContactIdRequest.md) | :heavy_check_mark:                                                                                                                                 | The request object to use for the request.                                                                                                         |


### Response

**[com.unifiedapi.unifiedto.models.operations.DeleteUcConnectionIdContactIdResponse](../../models/operations/DeleteUcConnectionIdContactIdResponse.md)**


## getUcConnectionIdAgent

List all agents

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetUcConnectionIdAgentRequest;
import com.unifiedapi.unifiedto.models.operations.GetUcConnectionIdAgentResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("Passenger"){{
                    jwt = "";
                }})
                .build();

            GetUcConnectionIdAgentRequest req = new GetUcConnectionIdAgentRequest("East"){{
                contactId = "drafty blue teal";
                limit = 745.71d;
                offset = 7741.1d;
                order = "reverse Bacon";
                query = "Product which";
                sort = "Chips";
                updatedGte = OffsetDateTime.parse("2023-11-26T07:47:09.916Z");
            }};            

            GetUcConnectionIdAgentResponse res = sdk.uc.getUcConnectionIdAgent(req);

            if (res.ucAgents != null) {
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
| `request`                                                                                                                            | [com.unifiedapi.unifiedto.models.operations.GetUcConnectionIdAgentRequest](../../models/operations/GetUcConnectionIdAgentRequest.md) | :heavy_check_mark:                                                                                                                   | The request object to use for the request.                                                                                           |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetUcConnectionIdAgentResponse](../../models/operations/GetUcConnectionIdAgentResponse.md)**


## getUcConnectionIdCall

List all calls

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetUcConnectionIdCallRequest;
import com.unifiedapi.unifiedto.models.operations.GetUcConnectionIdCallResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("Southeast"){{
                    jwt = "";
                }})
                .build();

            GetUcConnectionIdCallRequest req = new GetUcConnectionIdCallRequest("blue"){{
                agentId = "than";
                contactId = "reintermediate Enid Applications";
                limit = 1980.39d;
                offset = 3478d;
                order = "white Oklahoma Functionality";
                query = "pricing whether Hillsboro";
                sort = "Wooden desensitize SCSI";
                updatedGte = OffsetDateTime.parse("2021-11-03T12:40:46.997Z");
            }};            

            GetUcConnectionIdCallResponse res = sdk.uc.getUcConnectionIdCall(req);

            if (res.ucCalls != null) {
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
| `request`                                                                                                                          | [com.unifiedapi.unifiedto.models.operations.GetUcConnectionIdCallRequest](../../models/operations/GetUcConnectionIdCallRequest.md) | :heavy_check_mark:                                                                                                                 | The request object to use for the request.                                                                                         |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetUcConnectionIdCallResponse](../../models/operations/GetUcConnectionIdCallResponse.md)**


## getUcConnectionIdContact

List all contacts

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetUcConnectionIdContactRequest;
import com.unifiedapi.unifiedto.models.operations.GetUcConnectionIdContactResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("Integration"){{
                    jwt = "";
                }})
                .build();

            GetUcConnectionIdContactRequest req = new GetUcConnectionIdContactRequest("envious"){{
                agentId = "Non Dodge";
                limit = 7215.14d;
                offset = 2910.48d;
                order = "Vermont";
                query = "maroon JBOD";
                sort = "hertz";
                updatedGte = OffsetDateTime.parse("2023-01-29T17:06:35.136Z");
            }};            

            GetUcConnectionIdContactResponse res = sdk.uc.getUcConnectionIdContact(req);

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

| Parameter                                                                                                                                | Type                                                                                                                                     | Required                                                                                                                                 | Description                                                                                                                              |
| ---------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                | [com.unifiedapi.unifiedto.models.operations.GetUcConnectionIdContactRequest](../../models/operations/GetUcConnectionIdContactRequest.md) | :heavy_check_mark:                                                                                                                       | The request object to use for the request.                                                                                               |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetUcConnectionIdContactResponse](../../models/operations/GetUcConnectionIdContactResponse.md)**


## getUcConnectionIdContactId

Retrieve a contact

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetUcConnectionIdContactIdRequest;
import com.unifiedapi.unifiedto.models.operations.GetUcConnectionIdContactIdResponse;
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("Africa"){{
                    jwt = "";
                }})
                .build();

            GetUcConnectionIdContactIdRequest req = new GetUcConnectionIdContactIdRequest("person", "firewall");            

            GetUcConnectionIdContactIdResponse res = sdk.uc.getUcConnectionIdContactId(req);

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

| Parameter                                                                                                                                    | Type                                                                                                                                         | Required                                                                                                                                     | Description                                                                                                                                  |
| -------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                    | [com.unifiedapi.unifiedto.models.operations.GetUcConnectionIdContactIdRequest](../../models/operations/GetUcConnectionIdContactIdRequest.md) | :heavy_check_mark:                                                                                                                           | The request object to use for the request.                                                                                                   |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetUcConnectionIdContactIdResponse](../../models/operations/GetUcConnectionIdContactIdResponse.md)**


## patchUcConnectionIdContactId

Update a contact

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PatchUcConnectionIdContactIdRequest;
import com.unifiedapi.unifiedto.models.operations.PatchUcConnectionIdContactIdResponse;
import com.unifiedapi.unifiedto.models.shared.PropertyUcContactRaw;
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
                .setSecurity(new Security("whose"){{
                    jwt = "";
                }})
                .build();

            PatchUcConnectionIdContactIdRequest req = new PatchUcConnectionIdContactIdRequest("Rosemary", "copying"){{
                ucContact = new UcContact(){{
                    company = "Swaniawski - Hegmann";
                    createdAt = OffsetDateTime.parse("2023-08-12T14:43:43.240Z");
                    emails = new com.unifiedapi.unifiedto.models.shared.UcEmail[]{{
                        add(new UcEmail("24/7"){{
                            email = "Jerod_Effertz1@hotmail.com";
                        }}),
                    }};
                    id = "<ID>";
                    name = "Table compress";
                    raw = new PropertyUcContactRaw();
                    telephones = new com.unifiedapi.unifiedto.models.shared.UcTelephone[]{{
                        add(new UcTelephone("overriding"){{
                            telephone = "Legacy";
                        }}),
                    }};
                    title = "meanwhile atque Akron";
                    updatedAt = OffsetDateTime.parse("2022-01-15T14:31:49.366Z");
                }};
            }};            

            PatchUcConnectionIdContactIdResponse res = sdk.uc.patchUcConnectionIdContactId(req);

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

| Parameter                                                                                                                                        | Type                                                                                                                                             | Required                                                                                                                                         | Description                                                                                                                                      |
| ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                        | [com.unifiedapi.unifiedto.models.operations.PatchUcConnectionIdContactIdRequest](../../models/operations/PatchUcConnectionIdContactIdRequest.md) | :heavy_check_mark:                                                                                                                               | The request object to use for the request.                                                                                                       |


### Response

**[com.unifiedapi.unifiedto.models.operations.PatchUcConnectionIdContactIdResponse](../../models/operations/PatchUcConnectionIdContactIdResponse.md)**


## postUcConnectionIdContact

Create a contact

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PostUcConnectionIdContactRequest;
import com.unifiedapi.unifiedto.models.operations.PostUcConnectionIdContactResponse;
import com.unifiedapi.unifiedto.models.shared.PropertyUcContactRaw;
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
                .setSecurity(new Security("Plain"){{
                    jwt = "";
                }})
                .build();

            PostUcConnectionIdContactRequest req = new PostUcConnectionIdContactRequest("Bacon"){{
                ucContact = new UcContact(){{
                    company = "Runolfsson - Bruen";
                    createdAt = OffsetDateTime.parse("2022-11-30T09:19:12.974Z");
                    emails = new com.unifiedapi.unifiedto.models.shared.UcEmail[]{{
                        add(new UcEmail("Avon"){{
                            email = "Marianne_Haley35@hotmail.com";
                        }}),
                    }};
                    id = "<ID>";
                    name = "Division Human COM";
                    raw = new PropertyUcContactRaw();
                    telephones = new com.unifiedapi.unifiedto.models.shared.UcTelephone[]{{
                        add(new UcTelephone("Solutions"){{
                            telephone = "International Connecticut Fiat";
                        }}),
                    }};
                    title = "Chair Potassium";
                    updatedAt = OffsetDateTime.parse("2022-02-26T18:17:55.274Z");
                }};
            }};            

            PostUcConnectionIdContactResponse res = sdk.uc.postUcConnectionIdContact(req);

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

| Parameter                                                                                                                                  | Type                                                                                                                                       | Required                                                                                                                                   | Description                                                                                                                                |
| ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                  | [com.unifiedapi.unifiedto.models.operations.PostUcConnectionIdContactRequest](../../models/operations/PostUcConnectionIdContactRequest.md) | :heavy_check_mark:                                                                                                                         | The request object to use for the request.                                                                                                 |


### Response

**[com.unifiedapi.unifiedto.models.operations.PostUcConnectionIdContactResponse](../../models/operations/PostUcConnectionIdContactResponse.md)**


## putUcConnectionIdContactId

Update a contact

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PutUcConnectionIdContactIdRequest;
import com.unifiedapi.unifiedto.models.operations.PutUcConnectionIdContactIdResponse;
import com.unifiedapi.unifiedto.models.shared.PropertyUcContactRaw;
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
                .setSecurity(new Security("geez"){{
                    jwt = "";
                }})
                .build();

            PutUcConnectionIdContactIdRequest req = new PutUcConnectionIdContactIdRequest("sticky", "Alabama"){{
                ucContact = new UcContact(){{
                    company = "Walker - Koch";
                    createdAt = OffsetDateTime.parse("2022-05-19T07:42:19.696Z");
                    emails = new com.unifiedapi.unifiedto.models.shared.UcEmail[]{{
                        add(new UcEmail("Hip"){{
                            email = "Yasmine.Johns@yahoo.com";
                        }}),
                    }};
                    id = "<ID>";
                    name = "drat";
                    raw = new PropertyUcContactRaw();
                    telephones = new com.unifiedapi.unifiedto.models.shared.UcTelephone[]{{
                        add(new UcTelephone("Buckinghamshire"){{
                            telephone = "Dynamic Loan Wooden";
                        }}),
                    }};
                    title = "cyan Movies";
                    updatedAt = OffsetDateTime.parse("2022-03-11T10:02:46.895Z");
                }};
            }};            

            PutUcConnectionIdContactIdResponse res = sdk.uc.putUcConnectionIdContactId(req);

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

| Parameter                                                                                                                                    | Type                                                                                                                                         | Required                                                                                                                                     | Description                                                                                                                                  |
| -------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                    | [com.unifiedapi.unifiedto.models.operations.PutUcConnectionIdContactIdRequest](../../models/operations/PutUcConnectionIdContactIdRequest.md) | :heavy_check_mark:                                                                                                                           | The request object to use for the request.                                                                                                   |


### Response

**[com.unifiedapi.unifiedto.models.operations.PutUcConnectionIdContactIdResponse](../../models/operations/PutUcConnectionIdContactIdResponse.md)**

