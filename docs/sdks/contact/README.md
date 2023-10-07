# Contact
(*contact*)

### Available Operations

* [deleteCrmConnectionIdContactId](#deletecrmconnectionidcontactid) - Remove a contact
* [deleteUcConnectionIdContactId](#deleteucconnectionidcontactid) - Remove a contact
* [getCrmConnectionIdContact](#getcrmconnectionidcontact) - List all contacts
* [getCrmConnectionIdContactId](#getcrmconnectionidcontactid) - Retrieve a contact
* [getUcConnectionIdContact](#getucconnectionidcontact) - List all contacts
* [getUcConnectionIdContactId](#getucconnectionidcontactid) - Retrieve a contact
* [patchCrmConnectionIdContactId](#patchcrmconnectionidcontactid) - Update a contact
* [patchUcConnectionIdContactId](#patchucconnectionidcontactid) - Update a contact
* [postCrmConnectionIdContact](#postcrmconnectionidcontact) - Create a contact
* [postUcConnectionIdContact](#postucconnectionidcontact) - Create a contact
* [putCrmConnectionIdContactId](#putcrmconnectionidcontactid) - Update a contact
* [putUcConnectionIdContactId](#putucconnectionidcontactid) - Update a contact

## deleteCrmConnectionIdContactId

Remove a contact

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdContactIdRequest;
import com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdContactIdResponse;
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("Wyoming"){{
                    jwt = "";
                }})
                .build();

            DeleteCrmConnectionIdContactIdRequest req = new DeleteCrmConnectionIdContactIdRequest("Arizona", "payment");            

            DeleteCrmConnectionIdContactIdResponse res = sdk.contact.deleteCrmConnectionIdContactId(req);

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
| `request`                                                                                                                                            | [com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdContactIdRequest](../../models/operations/DeleteCrmConnectionIdContactIdRequest.md) | :heavy_check_mark:                                                                                                                                   | The request object to use for the request.                                                                                                           |


### Response

**[com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdContactIdResponse](../../models/operations/DeleteCrmConnectionIdContactIdResponse.md)**


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

            DeleteUcConnectionIdContactIdResponse res = sdk.contact.deleteUcConnectionIdContactId(req);

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


## getCrmConnectionIdContact

List all contacts

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdContactRequest;
import com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdContactResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("Technician"){{
                    jwt = "";
                }})
                .build();

            GetCrmConnectionIdContactRequest req = new GetCrmConnectionIdContactRequest("Southeast"){{
                companyId = "magenta loose";
                dealId = "intuitive";
                limit = 9605d;
                offset = 8572.44d;
                order = "Music Electronics";
                query = "Elegant";
                sort = "North Analyst Otis";
                updatedGte = OffsetDateTime.parse("2022-09-18T15:42:24.943Z");
            }};            

            GetCrmConnectionIdContactResponse res = sdk.contact.getCrmConnectionIdContact(req);

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

| Parameter                                                                                                                                  | Type                                                                                                                                       | Required                                                                                                                                   | Description                                                                                                                                |
| ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                  | [com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdContactRequest](../../models/operations/GetCrmConnectionIdContactRequest.md) | :heavy_check_mark:                                                                                                                         | The request object to use for the request.                                                                                                 |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdContactResponse](../../models/operations/GetCrmConnectionIdContactResponse.md)**


## getCrmConnectionIdContactId

Retrieve a contact

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdContactIdRequest;
import com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdContactIdResponse;
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("Southeast"){{
                    jwt = "";
                }})
                .build();

            GetCrmConnectionIdContactIdRequest req = new GetCrmConnectionIdContactIdRequest("fountain", "visionary");            

            GetCrmConnectionIdContactIdResponse res = sdk.contact.getCrmConnectionIdContactId(req);

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

| Parameter                                                                                                                                      | Type                                                                                                                                           | Required                                                                                                                                       | Description                                                                                                                                    |
| ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                      | [com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdContactIdRequest](../../models/operations/GetCrmConnectionIdContactIdRequest.md) | :heavy_check_mark:                                                                                                                             | The request object to use for the request.                                                                                                     |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdContactIdResponse](../../models/operations/GetCrmConnectionIdContactIdResponse.md)**


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

            GetUcConnectionIdContactResponse res = sdk.contact.getUcConnectionIdContact(req);

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

            GetUcConnectionIdContactIdResponse res = sdk.contact.getUcConnectionIdContactId(req);

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


## patchCrmConnectionIdContactId

Update a contact

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdContactIdRequest;
import com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdContactIdResponse;
import com.unifiedapi.unifiedto.models.shared.CrmContact;
import com.unifiedapi.unifiedto.models.shared.CrmEmail;
import com.unifiedapi.unifiedto.models.shared.CrmEmailType;
import com.unifiedapi.unifiedto.models.shared.CrmTelephone;
import com.unifiedapi.unifiedto.models.shared.CrmTelephoneType;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmContactAddress;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmContactRaw;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("Bicycle"){{
                    jwt = "";
                }})
                .build();

            PatchCrmConnectionIdContactIdRequest req = new PatchCrmConnectionIdContactIdRequest("instantly", "Taiwan"){{
                crmContact = new CrmContact(){{
                    address = new PropertyCrmContactAddress(){{
                        address1 = "disintermediate ah Southwest";
                        address2 = "Bicycle communities infomediaries";
                        city = "Mount Vernon";
                        country = "Netherlands Antilles";
                        countryCode = "SC";
                        postalCode = "91274";
                        region = "Investment";
                        regionCode = "cormorant copying";
                    }};
                    company = "Larson Group";
                    companyIds = new String[]{{
                        add("person"),
                    }};
                    createdAt = OffsetDateTime.parse("2022-07-09T02:39:19.057Z");
                    dealIds = new String[]{{
                        add("Soft"),
                    }};
                    emails = new com.unifiedapi.unifiedto.models.shared.CrmEmail[]{{
                        add(new CrmEmail(){{}}),
                    }};
                    id = "<ID>";
                    name = "disintermediate payment unsung";
                    raw = new PropertyCrmContactRaw();
                    telephones = new com.unifiedapi.unifiedto.models.shared.CrmTelephone[]{{
                        add(new CrmTelephone("Kennewick"){{
                            telephone = "Response";
                        }}),
                    }};
                    title = "payment markets";
                    updatedAt = OffsetDateTime.parse("2022-06-29T19:29:52.973Z");
                }};
            }};            

            PatchCrmConnectionIdContactIdResponse res = sdk.contact.patchCrmConnectionIdContactId(req);

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

| Parameter                                                                                                                                          | Type                                                                                                                                               | Required                                                                                                                                           | Description                                                                                                                                        |
| -------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                          | [com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdContactIdRequest](../../models/operations/PatchCrmConnectionIdContactIdRequest.md) | :heavy_check_mark:                                                                                                                                 | The request object to use for the request.                                                                                                         |


### Response

**[com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdContactIdResponse](../../models/operations/PatchCrmConnectionIdContactIdResponse.md)**


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

            PatchUcConnectionIdContactIdResponse res = sdk.contact.patchUcConnectionIdContactId(req);

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


## postCrmConnectionIdContact

Create a contact

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PostCrmConnectionIdContactRequest;
import com.unifiedapi.unifiedto.models.operations.PostCrmConnectionIdContactResponse;
import com.unifiedapi.unifiedto.models.shared.CrmContact;
import com.unifiedapi.unifiedto.models.shared.CrmEmail;
import com.unifiedapi.unifiedto.models.shared.CrmEmailType;
import com.unifiedapi.unifiedto.models.shared.CrmTelephone;
import com.unifiedapi.unifiedto.models.shared.CrmTelephoneType;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmContactAddress;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmContactRaw;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("integrated"){{
                    jwt = "";
                }})
                .build();

            PostCrmConnectionIdContactRequest req = new PostCrmConnectionIdContactRequest("Mobility"){{
                crmContact = new CrmContact(){{
                    address = new PropertyCrmContactAddress(){{
                        address1 = "who SUV";
                        address2 = "sievert Tungsten";
                        city = "Fort Destiny";
                        country = "Sao Tome and Principe";
                        countryCode = "TO";
                        postalCode = "66482-1980";
                        region = "National Money Executive";
                        regionCode = "Southwest";
                    }};
                    company = "Dooley, O'Keefe and Bailey";
                    companyIds = new String[]{{
                        add("Rubber"),
                    }};
                    createdAt = OffsetDateTime.parse("2021-08-24T16:59:07.539Z");
                    dealIds = new String[]{{
                        add("farad"),
                    }};
                    emails = new com.unifiedapi.unifiedto.models.shared.CrmEmail[]{{
                        add(new CrmEmail(){{}}),
                    }};
                    id = "<ID>";
                    name = "Dynamic withdrawal";
                    raw = new PropertyCrmContactRaw();
                    telephones = new com.unifiedapi.unifiedto.models.shared.CrmTelephone[]{{
                        add(new CrmTelephone("Bedfordshire"){{
                            telephone = "SSD";
                        }}),
                    }};
                    title = "Senior Audi Northeast";
                    updatedAt = OffsetDateTime.parse("2023-09-26T11:09:09.553Z");
                }};
            }};            

            PostCrmConnectionIdContactResponse res = sdk.contact.postCrmConnectionIdContact(req);

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

| Parameter                                                                                                                                    | Type                                                                                                                                         | Required                                                                                                                                     | Description                                                                                                                                  |
| -------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                    | [com.unifiedapi.unifiedto.models.operations.PostCrmConnectionIdContactRequest](../../models/operations/PostCrmConnectionIdContactRequest.md) | :heavy_check_mark:                                                                                                                           | The request object to use for the request.                                                                                                   |


### Response

**[com.unifiedapi.unifiedto.models.operations.PostCrmConnectionIdContactResponse](../../models/operations/PostCrmConnectionIdContactResponse.md)**


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

            PostUcConnectionIdContactResponse res = sdk.contact.postUcConnectionIdContact(req);

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


## putCrmConnectionIdContactId

Update a contact

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdContactIdRequest;
import com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdContactIdResponse;
import com.unifiedapi.unifiedto.models.shared.CrmContact;
import com.unifiedapi.unifiedto.models.shared.CrmEmail;
import com.unifiedapi.unifiedto.models.shared.CrmEmailType;
import com.unifiedapi.unifiedto.models.shared.CrmTelephone;
import com.unifiedapi.unifiedto.models.shared.CrmTelephoneType;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmContactAddress;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmContactRaw;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("Outdoors"){{
                    jwt = "";
                }})
                .build();

            PutCrmConnectionIdContactIdRequest req = new PutCrmConnectionIdContactIdRequest("Credit", "laborum"){{
                crmContact = new CrmContact(){{
                    address = new PropertyCrmContactAddress(){{
                        address1 = "copy Coordinator Northwest";
                        address2 = "provided Mazda";
                        city = "Kiarrafurt";
                        country = "Latvia";
                        countryCode = "GP";
                        postalCode = "71632-5257";
                        region = "transmitting till Oriental";
                        regionCode = "Ways";
                    }};
                    company = "Beatty Inc";
                    companyIds = new String[]{{
                        add("ugh"),
                    }};
                    createdAt = OffsetDateTime.parse("2021-02-15T11:20:20.781Z");
                    dealIds = new String[]{{
                        add("Gambia"),
                    }};
                    emails = new com.unifiedapi.unifiedto.models.shared.CrmEmail[]{{
                        add(new CrmEmail(){{}}),
                    }};
                    id = "<ID>";
                    name = "Rhenium";
                    raw = new PropertyCrmContactRaw();
                    telephones = new com.unifiedapi.unifiedto.models.shared.CrmTelephone[]{{
                        add(new CrmTelephone("male"){{
                            telephone = "efficient oof gah";
                        }}),
                    }};
                    title = "overriding incremental";
                    updatedAt = OffsetDateTime.parse("2021-01-03T20:28:22.106Z");
                }};
            }};            

            PutCrmConnectionIdContactIdResponse res = sdk.contact.putCrmConnectionIdContactId(req);

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

| Parameter                                                                                                                                      | Type                                                                                                                                           | Required                                                                                                                                       | Description                                                                                                                                    |
| ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                      | [com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdContactIdRequest](../../models/operations/PutCrmConnectionIdContactIdRequest.md) | :heavy_check_mark:                                                                                                                             | The request object to use for the request.                                                                                                     |


### Response

**[com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdContactIdResponse](../../models/operations/PutCrmConnectionIdContactIdResponse.md)**


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

            PutUcConnectionIdContactIdResponse res = sdk.contact.putUcConnectionIdContactId(req);

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

