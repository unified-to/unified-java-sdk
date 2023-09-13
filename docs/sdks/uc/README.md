# uc

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
import com.unifiedapi.unifiedto.models.operations.DeleteUcConnectionIdContactIdSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            DeleteUcConnectionIdContactIdRequest req = new DeleteUcConnectionIdContactIdRequest("saepe", "consequatur");            

            DeleteUcConnectionIdContactIdResponse res = sdk.uc.deleteUcConnectionIdContactId(req, new DeleteUcConnectionIdContactIdSecurity("architecto") {{
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

| Parameter                                                                                                                                            | Type                                                                                                                                                 | Required                                                                                                                                             | Description                                                                                                                                          |
| ---------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                            | [com.unifiedapi.unifiedto.models.operations.DeleteUcConnectionIdContactIdRequest](../../models/operations/DeleteUcConnectionIdContactIdRequest.md)   | :heavy_check_mark:                                                                                                                                   | The request object to use for the request.                                                                                                           |
| `security`                                                                                                                                           | [com.unifiedapi.unifiedto.models.operations.DeleteUcConnectionIdContactIdSecurity](../../models/operations/DeleteUcConnectionIdContactIdSecurity.md) | :heavy_check_mark:                                                                                                                                   | The security requirements to use for the request.                                                                                                    |


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
import com.unifiedapi.unifiedto.models.operations.GetUcConnectionIdAgentSecurity;
import java.time.LocalDate;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            GetUcConnectionIdAgentRequest req = new GetUcConnectionIdAgentRequest("dicta") {{
                contactId = "sit";
                limit = 3202.94d;
                offset = 8370.8d;
                order = "sequi";
                query = "laudantium";
                sort = "excepturi";
                updatedGte = LocalDate.parse("2022-06-19");
            }};            

            GetUcConnectionIdAgentResponse res = sdk.uc.getUcConnectionIdAgent(req, new GetUcConnectionIdAgentSecurity("quasi") {{
                jwt = "";
            }});

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

| Parameter                                                                                                                              | Type                                                                                                                                   | Required                                                                                                                               | Description                                                                                                                            |
| -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                              | [com.unifiedapi.unifiedto.models.operations.GetUcConnectionIdAgentRequest](../../models/operations/GetUcConnectionIdAgentRequest.md)   | :heavy_check_mark:                                                                                                                     | The request object to use for the request.                                                                                             |
| `security`                                                                                                                             | [com.unifiedapi.unifiedto.models.operations.GetUcConnectionIdAgentSecurity](../../models/operations/GetUcConnectionIdAgentSecurity.md) | :heavy_check_mark:                                                                                                                     | The security requirements to use for the request.                                                                                      |


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
import com.unifiedapi.unifiedto.models.operations.GetUcConnectionIdCallSecurity;
import java.time.LocalDate;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            GetUcConnectionIdCallRequest req = new GetUcConnectionIdCallRequest("laboriosam") {{
                agentId = "aspernatur";
                contactId = "quod";
                limit = 3795.52d;
                offset = 7311.57d;
                order = "recusandae";
                query = "harum";
                sort = "nisi";
                updatedGte = LocalDate.parse("2021-09-25");
            }};            

            GetUcConnectionIdCallResponse res = sdk.uc.getUcConnectionIdCall(req, new GetUcConnectionIdCallSecurity("doloremque") {{
                jwt = "";
            }});

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

| Parameter                                                                                                                            | Type                                                                                                                                 | Required                                                                                                                             | Description                                                                                                                          |
| ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                            | [com.unifiedapi.unifiedto.models.operations.GetUcConnectionIdCallRequest](../../models/operations/GetUcConnectionIdCallRequest.md)   | :heavy_check_mark:                                                                                                                   | The request object to use for the request.                                                                                           |
| `security`                                                                                                                           | [com.unifiedapi.unifiedto.models.operations.GetUcConnectionIdCallSecurity](../../models/operations/GetUcConnectionIdCallSecurity.md) | :heavy_check_mark:                                                                                                                   | The security requirements to use for the request.                                                                                    |


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
import com.unifiedapi.unifiedto.models.operations.GetUcConnectionIdContactSecurity;
import java.time.LocalDate;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            GetUcConnectionIdContactRequest req = new GetUcConnectionIdContactRequest("doloribus") {{
                agentId = "vel";
                limit = 3174.8d;
                offset = 4991.82d;
                order = "quidem";
                query = "in";
                sort = "at";
                updatedGte = LocalDate.parse("2022-10-08");
            }};            

            GetUcConnectionIdContactResponse res = sdk.uc.getUcConnectionIdContact(req, new GetUcConnectionIdContactSecurity("mollitia") {{
                jwt = "";
            }});

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

| Parameter                                                                                                                                  | Type                                                                                                                                       | Required                                                                                                                                   | Description                                                                                                                                |
| ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                  | [com.unifiedapi.unifiedto.models.operations.GetUcConnectionIdContactRequest](../../models/operations/GetUcConnectionIdContactRequest.md)   | :heavy_check_mark:                                                                                                                         | The request object to use for the request.                                                                                                 |
| `security`                                                                                                                                 | [com.unifiedapi.unifiedto.models.operations.GetUcConnectionIdContactSecurity](../../models/operations/GetUcConnectionIdContactSecurity.md) | :heavy_check_mark:                                                                                                                         | The security requirements to use for the request.                                                                                          |


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
import com.unifiedapi.unifiedto.models.operations.GetUcConnectionIdContactIdSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            GetUcConnectionIdContactIdRequest req = new GetUcConnectionIdContactIdRequest("beatae", "numquam");            

            GetUcConnectionIdContactIdResponse res = sdk.uc.getUcConnectionIdContactId(req, new GetUcConnectionIdContactIdSecurity("praesentium") {{
                jwt = "";
            }});

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

| Parameter                                                                                                                                      | Type                                                                                                                                           | Required                                                                                                                                       | Description                                                                                                                                    |
| ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                      | [com.unifiedapi.unifiedto.models.operations.GetUcConnectionIdContactIdRequest](../../models/operations/GetUcConnectionIdContactIdRequest.md)   | :heavy_check_mark:                                                                                                                             | The request object to use for the request.                                                                                                     |
| `security`                                                                                                                                     | [com.unifiedapi.unifiedto.models.operations.GetUcConnectionIdContactIdSecurity](../../models/operations/GetUcConnectionIdContactIdSecurity.md) | :heavy_check_mark:                                                                                                                             | The security requirements to use for the request.                                                                                              |


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
import com.unifiedapi.unifiedto.models.operations.PatchUcConnectionIdContactIdSecurity;
import com.unifiedapi.unifiedto.models.shared.PropertyUcContactRaw;
import com.unifiedapi.unifiedto.models.shared.UcContact;
import com.unifiedapi.unifiedto.models.shared.UcEmail;
import com.unifiedapi.unifiedto.models.shared.UcEmailType;
import com.unifiedapi.unifiedto.models.shared.UcTelephone;
import com.unifiedapi.unifiedto.models.shared.UcTelephoneType;
import java.time.LocalDate;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            PatchUcConnectionIdContactIdRequest req = new PatchUcConnectionIdContactIdRequest("aperiam", "hic") {{
                ucContact = new UcContact() {{
                    company = "Strosin - Waelchi";
                    createdAt = LocalDate.parse("2022-12-21");
                    emails = new com.unifiedapi.unifiedto.models.shared.UcEmail[]{{
                        add(new UcEmail("beatae") {{
                            email = "Adrian_Jacobs@hotmail.com";
                            type = UcEmailType.HOME;
                        }}),
                    }};
                    id = "0618d97e-1522-4975-90da-80312292cc61";
                    name = "Louis Pacocha Sr.";
                    raw = new PropertyUcContactRaw();;
                    telephones = new com.unifiedapi.unifiedto.models.shared.UcTelephone[]{{
                        add(new UcTelephone("sint") {{
                            telephone = "distinctio";
                            type = UcTelephoneType.FAX;
                        }}),
                    }};
                    title = "Ms.";
                    updatedAt = LocalDate.parse("2020-05-12");
                }};;
            }};            

            PatchUcConnectionIdContactIdResponse res = sdk.uc.patchUcConnectionIdContactId(req, new PatchUcConnectionIdContactIdSecurity("quasi") {{
                jwt = "";
            }});

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

| Parameter                                                                                                                                          | Type                                                                                                                                               | Required                                                                                                                                           | Description                                                                                                                                        |
| -------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                          | [com.unifiedapi.unifiedto.models.operations.PatchUcConnectionIdContactIdRequest](../../models/operations/PatchUcConnectionIdContactIdRequest.md)   | :heavy_check_mark:                                                                                                                                 | The request object to use for the request.                                                                                                         |
| `security`                                                                                                                                         | [com.unifiedapi.unifiedto.models.operations.PatchUcConnectionIdContactIdSecurity](../../models/operations/PatchUcConnectionIdContactIdSecurity.md) | :heavy_check_mark:                                                                                                                                 | The security requirements to use for the request.                                                                                                  |


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
import com.unifiedapi.unifiedto.models.operations.PostUcConnectionIdContactSecurity;
import com.unifiedapi.unifiedto.models.shared.PropertyUcContactRaw;
import com.unifiedapi.unifiedto.models.shared.UcContact;
import com.unifiedapi.unifiedto.models.shared.UcEmail;
import com.unifiedapi.unifiedto.models.shared.UcEmailType;
import com.unifiedapi.unifiedto.models.shared.UcTelephone;
import com.unifiedapi.unifiedto.models.shared.UcTelephoneType;
import java.time.LocalDate;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            PostUcConnectionIdContactRequest req = new PostUcConnectionIdContactRequest("accusantium") {{
                ucContact = new UcContact() {{
                    company = "Steuber LLC";
                    createdAt = LocalDate.parse("2022-02-23");
                    emails = new com.unifiedapi.unifiedto.models.shared.UcEmail[]{{
                        add(new UcEmail("quasi") {{
                            email = "Cordia_Hansen88@hotmail.com";
                            type = UcEmailType.WORK;
                        }}),
                    }};
                    id = "bf33eaab-4540-42ac-9704-bf1cc9fc61aa";
                    name = "Derek Von";
                    raw = new PropertyUcContactRaw();;
                    telephones = new com.unifiedapi.unifiedto.models.shared.UcTelephone[]{{
                        add(new UcTelephone("porro") {{
                            telephone = "delectus";
                            type = UcTelephoneType.WORK;
                        }}),
                    }};
                    title = "Mrs.";
                    updatedAt = LocalDate.parse("2022-08-18");
                }};;
            }};            

            PostUcConnectionIdContactResponse res = sdk.uc.postUcConnectionIdContact(req, new PostUcConnectionIdContactSecurity("soluta") {{
                jwt = "";
            }});

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
| `request`                                                                                                                                    | [com.unifiedapi.unifiedto.models.operations.PostUcConnectionIdContactRequest](../../models/operations/PostUcConnectionIdContactRequest.md)   | :heavy_check_mark:                                                                                                                           | The request object to use for the request.                                                                                                   |
| `security`                                                                                                                                   | [com.unifiedapi.unifiedto.models.operations.PostUcConnectionIdContactSecurity](../../models/operations/PostUcConnectionIdContactSecurity.md) | :heavy_check_mark:                                                                                                                           | The security requirements to use for the request.                                                                                            |


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
import com.unifiedapi.unifiedto.models.operations.PutUcConnectionIdContactIdSecurity;
import com.unifiedapi.unifiedto.models.shared.PropertyUcContactRaw;
import com.unifiedapi.unifiedto.models.shared.UcContact;
import com.unifiedapi.unifiedto.models.shared.UcEmail;
import com.unifiedapi.unifiedto.models.shared.UcEmailType;
import com.unifiedapi.unifiedto.models.shared.UcTelephone;
import com.unifiedapi.unifiedto.models.shared.UcTelephoneType;
import java.time.LocalDate;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            PutUcConnectionIdContactIdRequest req = new PutUcConnectionIdContactIdRequest("ullam", "nihil") {{
                ucContact = new UcContact() {{
                    company = "Goyette Group";
                    createdAt = LocalDate.parse("2022-06-23");
                    emails = new com.unifiedapi.unifiedto.models.shared.UcEmail[]{{
                        add(new UcEmail("est") {{
                            email = "Braxton.Conroy@hotmail.com";
                            type = UcEmailType.HOME;
                        }}),
                    }};
                    id = "ee79e3c7-1ad3-41be-8b83-d2378ae3bfc2";
                    name = "Christie Marquardt";
                    raw = new PropertyUcContactRaw();;
                    telephones = new com.unifiedapi.unifiedto.models.shared.UcTelephone[]{{
                        add(new UcTelephone("unde") {{
                            telephone = "aperiam";
                            type = UcTelephoneType.FAX;
                        }}),
                    }};
                    title = "Ms.";
                    updatedAt = LocalDate.parse("2022-05-17");
                }};;
            }};            

            PutUcConnectionIdContactIdResponse res = sdk.uc.putUcConnectionIdContactId(req, new PutUcConnectionIdContactIdSecurity("aliquam") {{
                jwt = "";
            }});

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

| Parameter                                                                                                                                      | Type                                                                                                                                           | Required                                                                                                                                       | Description                                                                                                                                    |
| ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                      | [com.unifiedapi.unifiedto.models.operations.PutUcConnectionIdContactIdRequest](../../models/operations/PutUcConnectionIdContactIdRequest.md)   | :heavy_check_mark:                                                                                                                             | The request object to use for the request.                                                                                                     |
| `security`                                                                                                                                     | [com.unifiedapi.unifiedto.models.operations.PutUcConnectionIdContactIdSecurity](../../models/operations/PutUcConnectionIdContactIdSecurity.md) | :heavy_check_mark:                                                                                                                             | The security requirements to use for the request.                                                                                              |


### Response

**[com.unifiedapi.unifiedto.models.operations.PutUcConnectionIdContactIdResponse](../../models/operations/PutUcConnectionIdContactIdResponse.md)**

