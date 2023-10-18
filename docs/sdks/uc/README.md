# Uc
(*uc*)

### Available Operations

* [createUcContact](#createuccontact) - Create a contact
* [getUcContact](#getuccontact) - Retrieve a contact
* [listUcCalls](#listuccalls) - List all calls
* [listUcContacts](#listuccontacts) - List all contacts
* [patchUcContact](#patchuccontact) - Update a contact
* [removeUcContact](#removeuccontact) - Remove a contact
* [updateUcContact](#updateuccontact) - Update a contact

## createUcContact

Create a contact

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.CreateUcContactRequest;
import com.unifiedapi.unifiedto.models.operations.CreateUcContactResponse;
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
                .setSecurity(new Security("Future"){{
                    jwt = "";
                }})
                .build();

            CreateUcContactRequest req = new CreateUcContactRequest("enhance"){{
                ucContact = new UcContact(){{
                    company = "Cummerata - Schaefer";
                    createdAt = OffsetDateTime.parse("2023-09-28T00:27:58.979Z");
                    emails = new com.unifiedapi.unifiedto.models.shared.UcEmail[]{{
                        add(new UcEmail("canoe"){{
                            email = "Daphney_VonRueden@yahoo.com";
                        }}),
                    }};
                    id = "<ID>";
                    name = "darn";
                    raw = new PropertyUcContactRaw();
                    telephones = new com.unifiedapi.unifiedto.models.shared.UcTelephone[]{{
                        add(new UcTelephone("Garden"){{
                            telephone = "Auto";
                        }}),
                    }};
                    title = "Southwest";
                    updatedAt = OffsetDateTime.parse("2021-01-17T23:42:49.226Z");
                }};
            }};            

            CreateUcContactResponse res = sdk.uc.createUcContact(req);

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
                .setSecurity(new Security("for"){{
                    jwt = "";
                }})
                .build();

            GetUcContactRequest req = new GetUcContactRequest("deposit", "katal"){{
                fields = new String[]{{
                    add("cohesive"),
                }};
            }};            

            GetUcContactResponse res = sdk.uc.getUcContact(req);

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


## listUcCalls

List all calls

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.ListUcCallsRequest;
import com.unifiedapi.unifiedto.models.operations.ListUcCallsResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("Liberia"){{
                    jwt = "";
                }})
                .build();

            ListUcCallsRequest req = new ListUcCallsRequest("Cargo"){{
                agentId = "West";
                contactId = "Pop";
                fields = new String[]{{
                    add("AGP"),
                }};
                limit = 1965.31d;
                offset = 4663.16d;
                order = "gracefully";
                query = "so";
                sort = "Paradigm";
                updatedGte = OffsetDateTime.parse("2022-08-04T07:33:45.520Z");
            }};            

            ListUcCallsResponse res = sdk.uc.listUcCalls(req);

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

| Parameter                                                                                                      | Type                                                                                                           | Required                                                                                                       | Description                                                                                                    |
| -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                      | [com.unifiedapi.unifiedto.models.operations.ListUcCallsRequest](../../models/operations/ListUcCallsRequest.md) | :heavy_check_mark:                                                                                             | The request object to use for the request.                                                                     |


### Response

**[com.unifiedapi.unifiedto.models.operations.ListUcCallsResponse](../../models/operations/ListUcCallsResponse.md)**


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
                .setSecurity(new Security("application"){{
                    jwt = "";
                }})
                .build();

            ListUcContactsRequest req = new ListUcContactsRequest("Xenogender"){{
                agentId = "male";
                fields = new String[]{{
                    add("East"),
                }};
                limit = 5154.91d;
                offset = 8550.33d;
                order = "paradigm";
                query = "generating";
                sort = "Legacy";
                updatedGte = OffsetDateTime.parse("2021-01-07T17:07:06.790Z");
            }};            

            ListUcContactsResponse res = sdk.uc.listUcContacts(req);

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


## patchUcContact

Update a contact

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PatchUcContactRequest;
import com.unifiedapi.unifiedto.models.operations.PatchUcContactResponse;
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
                .setSecurity(new Security("sate"){{
                    jwt = "";
                }})
                .build();

            PatchUcContactRequest req = new PatchUcContactRequest("Southwest", "Hybrid"){{
                ucContact = new UcContact(){{
                    company = "Mills Inc";
                    createdAt = OffsetDateTime.parse("2023-05-15T16:26:27.523Z");
                    emails = new com.unifiedapi.unifiedto.models.shared.UcEmail[]{{
                        add(new UcEmail("candela"){{
                            email = "Adrian33@hotmail.com";
                        }}),
                    }};
                    id = "<ID>";
                    name = "Investor";
                    raw = new PropertyUcContactRaw();
                    telephones = new com.unifiedapi.unifiedto.models.shared.UcTelephone[]{{
                        add(new UcTelephone("Electric"){{
                            telephone = "South";
                        }}),
                    }};
                    title = "Paradigm";
                    updatedAt = OffsetDateTime.parse("2023-02-26T22:43:00.788Z");
                }};
            }};            

            PatchUcContactResponse res = sdk.uc.patchUcContact(req);

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
                .setSecurity(new Security("Plastic"){{
                    jwt = "";
                }})
                .build();

            RemoveUcContactRequest req = new RemoveUcContactRequest("Northwest", "till");            

            RemoveUcContactResponse res = sdk.uc.removeUcContact(req);

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


## updateUcContact

Update a contact

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.UpdateUcContactRequest;
import com.unifiedapi.unifiedto.models.operations.UpdateUcContactResponse;
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
                .setSecurity(new Security("Mexico"){{
                    jwt = "";
                }})
                .build();

            UpdateUcContactRequest req = new UpdateUcContactRequest("per", "Convertible"){{
                ucContact = new UcContact(){{
                    company = "Fisher Inc";
                    createdAt = OffsetDateTime.parse("2021-05-01T13:06:37.779Z");
                    emails = new com.unifiedapi.unifiedto.models.shared.UcEmail[]{{
                        add(new UcEmail("Awesome"){{
                            email = "Amya22@yahoo.com";
                        }}),
                    }};
                    id = "<ID>";
                    name = "Northwest";
                    raw = new PropertyUcContactRaw();
                    telephones = new com.unifiedapi.unifiedto.models.shared.UcTelephone[]{{
                        add(new UcTelephone("Fish"){{
                            telephone = "Books";
                        }}),
                    }};
                    title = "Principal";
                    updatedAt = OffsetDateTime.parse("2021-02-19T05:22:48.848Z");
                }};
            }};            

            UpdateUcContactResponse res = sdk.uc.updateUcContact(req);

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

