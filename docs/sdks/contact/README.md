# contact

### Available Operations

* [deleteCrmConnectionIdContactId](#deletecrmconnectionidcontactid) - Remove a contact
* [deleteCrmConnectionIdContactIdCompanyCompanyId](#deletecrmconnectionidcontactidcompanycompanyid) - Remove company association from a contact
* [deleteCrmConnectionIdContactIdDealDealId](#deletecrmconnectionidcontactiddealdealid) - Remove deal association from a contact
* [deleteUcConnectionIdContactId](#deleteucconnectionidcontactid) - Remove a contact
* [getCrmConnectionIdContact](#getcrmconnectionidcontact) - List all contacts
* [getCrmConnectionIdContactId](#getcrmconnectionidcontactid) - Retrieve a contact
* [getUcConnectionIdContact](#getucconnectionidcontact) - List all contacts
* [getUcConnectionIdContactId](#getucconnectionidcontactid) - Retrieve a contact
* [patchCrmConnectionIdContactId](#patchcrmconnectionidcontactid) - Update a contact
* [patchCrmConnectionIdContactIdCompanyCompanyId](#patchcrmconnectionidcontactidcompanycompanyid) - Associate a company with a contact
* [patchCrmConnectionIdContactIdDealDealId](#patchcrmconnectionidcontactiddealdealid) - Associate a deal with a contact
* [patchUcConnectionIdContactId](#patchucconnectionidcontactid) - Update a contact
* [postCrmConnectionIdContact](#postcrmconnectionidcontact) - Create a contact
* [postUcConnectionIdContact](#postucconnectionidcontact) - Create a contact
* [putCrmConnectionIdContactId](#putcrmconnectionidcontactid) - Update a contact
* [putCrmConnectionIdContactIdCompanyCompanyId](#putcrmconnectionidcontactidcompanycompanyid) - Associate a company with a contact
* [putCrmConnectionIdContactIdDealDealId](#putcrmconnectionidcontactiddealdealid) - Associate a deal with a contact
* [putUcConnectionIdContactId](#putucconnectionidcontactid) - Update a contact

## deleteCrmConnectionIdContactId

Remove a contact

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdContactIdRequest;
import com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdContactIdResponse;
import com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdContactIdSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            DeleteCrmConnectionIdContactIdRequest req = new DeleteCrmConnectionIdContactIdRequest("aspernatur", "quo");            

            DeleteCrmConnectionIdContactIdResponse res = sdk.contact.deleteCrmConnectionIdContactId(req, new DeleteCrmConnectionIdContactIdSecurity("itaque") {{
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

| Parameter                                                                                                                                              | Type                                                                                                                                                   | Required                                                                                                                                               | Description                                                                                                                                            |
| ------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                              | [com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdContactIdRequest](../../models/operations/DeleteCrmConnectionIdContactIdRequest.md)   | :heavy_check_mark:                                                                                                                                     | The request object to use for the request.                                                                                                             |
| `security`                                                                                                                                             | [com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdContactIdSecurity](../../models/operations/DeleteCrmConnectionIdContactIdSecurity.md) | :heavy_check_mark:                                                                                                                                     | The security requirements to use for the request.                                                                                                      |


### Response

**[com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdContactIdResponse](../../models/operations/DeleteCrmConnectionIdContactIdResponse.md)**


## deleteCrmConnectionIdContactIdCompanyCompanyId

Remove company association from a contact

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdContactIdCompanyCompanyIdRequest;
import com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdContactIdCompanyCompanyIdResponse;
import com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdContactIdCompanyCompanyIdSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            DeleteCrmConnectionIdContactIdCompanyCompanyIdRequest req = new DeleteCrmConnectionIdContactIdCompanyCompanyIdRequest("illum", "laborum", "dignissimos");            

            DeleteCrmConnectionIdContactIdCompanyCompanyIdResponse res = sdk.contact.deleteCrmConnectionIdContactIdCompanyCompanyId(req, new DeleteCrmConnectionIdContactIdCompanyCompanyIdSecurity("vero") {{
                jwt = "";
            }});

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

| Parameter                                                                                                                                                                              | Type                                                                                                                                                                                   | Required                                                                                                                                                                               | Description                                                                                                                                                                            |
| -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                                              | [com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdContactIdCompanyCompanyIdRequest](../../models/operations/DeleteCrmConnectionIdContactIdCompanyCompanyIdRequest.md)   | :heavy_check_mark:                                                                                                                                                                     | The request object to use for the request.                                                                                                                                             |
| `security`                                                                                                                                                                             | [com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdContactIdCompanyCompanyIdSecurity](../../models/operations/DeleteCrmConnectionIdContactIdCompanyCompanyIdSecurity.md) | :heavy_check_mark:                                                                                                                                                                     | The security requirements to use for the request.                                                                                                                                      |


### Response

**[com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdContactIdCompanyCompanyIdResponse](../../models/operations/DeleteCrmConnectionIdContactIdCompanyCompanyIdResponse.md)**


## deleteCrmConnectionIdContactIdDealDealId

Remove deal association from a contact

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdContactIdDealDealIdRequest;
import com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdContactIdDealDealIdResponse;
import com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdContactIdDealDealIdSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            DeleteCrmConnectionIdContactIdDealDealIdRequest req = new DeleteCrmConnectionIdContactIdDealDealIdRequest("qui", "consectetur", "repellat");            

            DeleteCrmConnectionIdContactIdDealDealIdResponse res = sdk.contact.deleteCrmConnectionIdContactIdDealDealId(req, new DeleteCrmConnectionIdContactIdDealDealIdSecurity("explicabo") {{
                jwt = "";
            }});

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

| Parameter                                                                                                                                                                  | Type                                                                                                                                                                       | Required                                                                                                                                                                   | Description                                                                                                                                                                |
| -------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                                  | [com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdContactIdDealDealIdRequest](../../models/operations/DeleteCrmConnectionIdContactIdDealDealIdRequest.md)   | :heavy_check_mark:                                                                                                                                                         | The request object to use for the request.                                                                                                                                 |
| `security`                                                                                                                                                                 | [com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdContactIdDealDealIdSecurity](../../models/operations/DeleteCrmConnectionIdContactIdDealDealIdSecurity.md) | :heavy_check_mark:                                                                                                                                                         | The security requirements to use for the request.                                                                                                                          |


### Response

**[com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdContactIdDealDealIdResponse](../../models/operations/DeleteCrmConnectionIdContactIdDealDealIdResponse.md)**


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

            DeleteUcConnectionIdContactIdRequest req = new DeleteUcConnectionIdContactIdRequest("explicabo", "exercitationem");            

            DeleteUcConnectionIdContactIdResponse res = sdk.contact.deleteUcConnectionIdContactId(req, new DeleteUcConnectionIdContactIdSecurity("nihil") {{
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


## getCrmConnectionIdContact

List all contacts

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdContactRequest;
import com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdContactResponse;
import com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdContactSecurity;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            GetCrmConnectionIdContactRequest req = new GetCrmConnectionIdContactRequest("non") {{
                companyId = "ab";
                dealId = "illo";
                limit = 9438.51d;
                offset = 6444.79d;
                order = "delectus";
                query = "non";
                sort = "distinctio";
                updatedGte = OffsetDateTime.parse("2022-08-26T06:03:44.896Z");
            }};            

            GetCrmConnectionIdContactResponse res = sdk.contact.getCrmConnectionIdContact(req, new GetCrmConnectionIdContactSecurity("labore") {{
                jwt = "";
            }});

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

| Parameter                                                                                                                                    | Type                                                                                                                                         | Required                                                                                                                                     | Description                                                                                                                                  |
| -------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                    | [com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdContactRequest](../../models/operations/GetCrmConnectionIdContactRequest.md)   | :heavy_check_mark:                                                                                                                           | The request object to use for the request.                                                                                                   |
| `security`                                                                                                                                   | [com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdContactSecurity](../../models/operations/GetCrmConnectionIdContactSecurity.md) | :heavy_check_mark:                                                                                                                           | The security requirements to use for the request.                                                                                            |


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
import com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdContactIdSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            GetCrmConnectionIdContactIdRequest req = new GetCrmConnectionIdContactIdRequest("numquam", "repudiandae");            

            GetCrmConnectionIdContactIdResponse res = sdk.contact.getCrmConnectionIdContactId(req, new GetCrmConnectionIdContactIdSecurity("modi") {{
                jwt = "";
            }});

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

| Parameter                                                                                                                                        | Type                                                                                                                                             | Required                                                                                                                                         | Description                                                                                                                                      |
| ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                        | [com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdContactIdRequest](../../models/operations/GetCrmConnectionIdContactIdRequest.md)   | :heavy_check_mark:                                                                                                                               | The request object to use for the request.                                                                                                       |
| `security`                                                                                                                                       | [com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdContactIdSecurity](../../models/operations/GetCrmConnectionIdContactIdSecurity.md) | :heavy_check_mark:                                                                                                                               | The security requirements to use for the request.                                                                                                |


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
import com.unifiedapi.unifiedto.models.operations.GetUcConnectionIdContactSecurity;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            GetUcConnectionIdContactRequest req = new GetUcConnectionIdContactRequest("in") {{
                agentId = "explicabo";
                limit = 8798.57d;
                offset = 5258.09d;
                order = "aperiam";
                query = "odit";
                sort = "deleniti";
                updatedGte = OffsetDateTime.parse("2022-07-19T18:04:50.511Z");
            }};            

            GetUcConnectionIdContactResponse res = sdk.contact.getUcConnectionIdContact(req, new GetUcConnectionIdContactSecurity("similique") {{
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

            GetUcConnectionIdContactIdRequest req = new GetUcConnectionIdContactIdRequest("minima", "libero");            

            GetUcConnectionIdContactIdResponse res = sdk.contact.getUcConnectionIdContactId(req, new GetUcConnectionIdContactIdSecurity("magnam") {{
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


## patchCrmConnectionIdContactId

Update a contact

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdContactIdRequest;
import com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdContactIdResponse;
import com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdContactIdSecurity;
import com.unifiedapi.unifiedto.models.shared.CrmContact;
import com.unifiedapi.unifiedto.models.shared.CrmEmail;
import com.unifiedapi.unifiedto.models.shared.CrmEmailType;
import com.unifiedapi.unifiedto.models.shared.CrmTelephone;
import com.unifiedapi.unifiedto.models.shared.CrmTelephoneType;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmContactAddress;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmContactRaw;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            PatchCrmConnectionIdContactIdRequest req = new PatchCrmConnectionIdContactIdRequest("sit", "modi") {{
                crmContact = new CrmContact() {{
                    address = new PropertyCrmContactAddress() {{
                        address1 = "eum";
                        address2 = "nesciunt";
                        city = "Kundehaven";
                        country = "Guadeloupe";
                        countryCode = "KM";
                        postalCode = "90200";
                        region = "eveniet";
                        regionCode = "odio";
                    }};;
                    company = "Gerhold - Pagac";
                    companyIds = new String[]{{
                        add("possimus"),
                    }};
                    createdAt = OffsetDateTime.parse("2022-10-08T00:54:40.246Z");
                    dealIds = new String[]{{
                        add("nesciunt"),
                    }};
                    emails = new com.unifiedapi.unifiedto.models.shared.CrmEmail[]{{
                        add(new CrmEmail() {{
                            email = "Toby71@gmail.com";
                            type = CrmEmailType.HOME;
                        }}),
                    }};
                    id = "81b36a08-088d-4100-afad-a200ef0422eb";
                    name = "Doris Jacobi";
                    raw = new PropertyCrmContactRaw();;
                    telephones = new com.unifiedapi.unifiedto.models.shared.CrmTelephone[]{{
                        add(new CrmTelephone("officia") {{
                            telephone = "voluptatibus";
                            type = CrmTelephoneType.OTHER;
                        }}),
                    }};
                    title = "Miss";
                    updatedAt = OffsetDateTime.parse("2022-08-13T05:20:10.013Z");
                }};;
            }};            

            PatchCrmConnectionIdContactIdResponse res = sdk.contact.patchCrmConnectionIdContactId(req, new PatchCrmConnectionIdContactIdSecurity("aliquid") {{
                jwt = "";
            }});

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

| Parameter                                                                                                                                            | Type                                                                                                                                                 | Required                                                                                                                                             | Description                                                                                                                                          |
| ---------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                            | [com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdContactIdRequest](../../models/operations/PatchCrmConnectionIdContactIdRequest.md)   | :heavy_check_mark:                                                                                                                                   | The request object to use for the request.                                                                                                           |
| `security`                                                                                                                                           | [com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdContactIdSecurity](../../models/operations/PatchCrmConnectionIdContactIdSecurity.md) | :heavy_check_mark:                                                                                                                                   | The security requirements to use for the request.                                                                                                    |


### Response

**[com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdContactIdResponse](../../models/operations/PatchCrmConnectionIdContactIdResponse.md)**


## patchCrmConnectionIdContactIdCompanyCompanyId

Associate a company with a contact

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdContactIdCompanyCompanyIdRequest;
import com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdContactIdCompanyCompanyIdResponse;
import com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdContactIdCompanyCompanyIdSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            PatchCrmConnectionIdContactIdCompanyCompanyIdRequest req = new PatchCrmConnectionIdContactIdCompanyCompanyIdRequest("ea", "impedit", "ducimus");            

            PatchCrmConnectionIdContactIdCompanyCompanyIdResponse res = sdk.contact.patchCrmConnectionIdContactIdCompanyCompanyId(req, new PatchCrmConnectionIdContactIdCompanyCompanyIdSecurity("odit") {{
                jwt = "";
            }});

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

| Parameter                                                                                                                                                                            | Type                                                                                                                                                                                 | Required                                                                                                                                                                             | Description                                                                                                                                                                          |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                            | [com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdContactIdCompanyCompanyIdRequest](../../models/operations/PatchCrmConnectionIdContactIdCompanyCompanyIdRequest.md)   | :heavy_check_mark:                                                                                                                                                                   | The request object to use for the request.                                                                                                                                           |
| `security`                                                                                                                                                                           | [com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdContactIdCompanyCompanyIdSecurity](../../models/operations/PatchCrmConnectionIdContactIdCompanyCompanyIdSecurity.md) | :heavy_check_mark:                                                                                                                                                                   | The security requirements to use for the request.                                                                                                                                    |


### Response

**[com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdContactIdCompanyCompanyIdResponse](../../models/operations/PatchCrmConnectionIdContactIdCompanyCompanyIdResponse.md)**


## patchCrmConnectionIdContactIdDealDealId

Associate a deal with a contact

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdContactIdDealDealIdRequest;
import com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdContactIdDealDealIdResponse;
import com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdContactIdDealDealIdSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            PatchCrmConnectionIdContactIdDealDealIdRequest req = new PatchCrmConnectionIdContactIdDealDealIdRequest("velit", "reiciendis", "repellat");            

            PatchCrmConnectionIdContactIdDealDealIdResponse res = sdk.contact.patchCrmConnectionIdContactIdDealDealId(req, new PatchCrmConnectionIdContactIdDealDealIdSecurity("nulla") {{
                jwt = "";
            }});

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

| Parameter                                                                                                                                                                | Type                                                                                                                                                                     | Required                                                                                                                                                                 | Description                                                                                                                                                              |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                | [com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdContactIdDealDealIdRequest](../../models/operations/PatchCrmConnectionIdContactIdDealDealIdRequest.md)   | :heavy_check_mark:                                                                                                                                                       | The request object to use for the request.                                                                                                                               |
| `security`                                                                                                                                                               | [com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdContactIdDealDealIdSecurity](../../models/operations/PatchCrmConnectionIdContactIdDealDealIdSecurity.md) | :heavy_check_mark:                                                                                                                                                       | The security requirements to use for the request.                                                                                                                        |


### Response

**[com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdContactIdDealDealIdResponse](../../models/operations/PatchCrmConnectionIdContactIdDealDealIdResponse.md)**


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
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            PatchUcConnectionIdContactIdRequest req = new PatchUcConnectionIdContactIdRequest("laborum", "natus") {{
                ucContact = new UcContact() {{
                    company = "Baumbach, Huel and Prohaska";
                    createdAt = OffsetDateTime.parse("2020-04-05T22:53:14.639Z");
                    emails = new com.unifiedapi.unifiedto.models.shared.UcEmail[]{{
                        add(new UcEmail("voluptatibus") {{
                            email = "Judson_Crona@gmail.com";
                            type = UcEmailType.WORK;
                        }}),
                    }};
                    id = "c0e115c8-0bff-4918-944e-c42defcce8f1";
                    name = "Javier Koch";
                    raw = new PropertyUcContactRaw();;
                    telephones = new com.unifiedapi.unifiedto.models.shared.UcTelephone[]{{
                        add(new UcTelephone("vel") {{
                            telephone = "nesciunt";
                            type = UcTelephoneType.MOBILE;
                        }}),
                    }};
                    title = "Mrs.";
                    updatedAt = OffsetDateTime.parse("2022-08-16T23:55:48.181Z");
                }};;
            }};            

            PatchUcConnectionIdContactIdResponse res = sdk.contact.patchUcConnectionIdContactId(req, new PatchUcConnectionIdContactIdSecurity("consequuntur") {{
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


## postCrmConnectionIdContact

Create a contact

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PostCrmConnectionIdContactRequest;
import com.unifiedapi.unifiedto.models.operations.PostCrmConnectionIdContactResponse;
import com.unifiedapi.unifiedto.models.operations.PostCrmConnectionIdContactSecurity;
import com.unifiedapi.unifiedto.models.shared.CrmContact;
import com.unifiedapi.unifiedto.models.shared.CrmEmail;
import com.unifiedapi.unifiedto.models.shared.CrmEmailType;
import com.unifiedapi.unifiedto.models.shared.CrmTelephone;
import com.unifiedapi.unifiedto.models.shared.CrmTelephoneType;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmContactAddress;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmContactRaw;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            PostCrmConnectionIdContactRequest req = new PostCrmConnectionIdContactRequest("officia") {{
                crmContact = new CrmContact() {{
                    address = new PropertyCrmContactAddress() {{
                        address1 = "reprehenderit";
                        address2 = "distinctio";
                        city = "North Joy";
                        country = "Virgin Islands, U.S.";
                        countryCode = "AQ";
                        postalCode = "92835";
                        region = "doloribus";
                        regionCode = "fugiat";
                    }};;
                    company = "Windler, Franecki and Brown";
                    companyIds = new String[]{{
                        add("nesciunt"),
                    }};
                    createdAt = OffsetDateTime.parse("2022-11-07T07:50:11.644Z");
                    dealIds = new String[]{{
                        add("repellat"),
                    }};
                    emails = new com.unifiedapi.unifiedto.models.shared.CrmEmail[]{{
                        add(new CrmEmail() {{
                            email = "Xzavier.Senger@yahoo.com";
                            type = CrmEmailType.WORK;
                        }}),
                    }};
                    id = "59c0b36f-25ea-4944-b3b7-56c11f6c37a5";
                    name = "Lois Hyatt";
                    raw = new PropertyCrmContactRaw();;
                    telephones = new com.unifiedapi.unifiedto.models.shared.CrmTelephone[]{{
                        add(new CrmTelephone("dolor") {{
                            telephone = "adipisci";
                            type = CrmTelephoneType.OTHER;
                        }}),
                    }};
                    title = "Mrs.";
                    updatedAt = OffsetDateTime.parse("2021-08-03T07:41:11.908Z");
                }};;
            }};            

            PostCrmConnectionIdContactResponse res = sdk.contact.postCrmConnectionIdContact(req, new PostCrmConnectionIdContactSecurity("impedit") {{
                jwt = "";
            }});

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
| `request`                                                                                                                                      | [com.unifiedapi.unifiedto.models.operations.PostCrmConnectionIdContactRequest](../../models/operations/PostCrmConnectionIdContactRequest.md)   | :heavy_check_mark:                                                                                                                             | The request object to use for the request.                                                                                                     |
| `security`                                                                                                                                     | [com.unifiedapi.unifiedto.models.operations.PostCrmConnectionIdContactSecurity](../../models/operations/PostCrmConnectionIdContactSecurity.md) | :heavy_check_mark:                                                                                                                             | The security requirements to use for the request.                                                                                              |


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
import com.unifiedapi.unifiedto.models.operations.PostUcConnectionIdContactSecurity;
import com.unifiedapi.unifiedto.models.shared.PropertyUcContactRaw;
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
                .build();

            PostUcConnectionIdContactRequest req = new PostUcConnectionIdContactRequest("sit") {{
                ucContact = new UcContact() {{
                    company = "Nader - Cronin";
                    createdAt = OffsetDateTime.parse("2022-05-10T16:07:37.512Z");
                    emails = new com.unifiedapi.unifiedto.models.shared.UcEmail[]{{
                        add(new UcEmail("doloribus") {{
                            email = "Estefania_Schmidt78@gmail.com";
                            type = UcEmailType.WORK;
                        }}),
                    }};
                    id = "de10a0ce-2169-4e51-8019-c6dc5e347627";
                    name = "Rene Ritchie";
                    raw = new PropertyUcContactRaw();;
                    telephones = new com.unifiedapi.unifiedto.models.shared.UcTelephone[]{{
                        add(new UcTelephone("laboriosam") {{
                            telephone = "quidem";
                            type = UcTelephoneType.MOBILE;
                        }}),
                    }};
                    title = "Miss";
                    updatedAt = OffsetDateTime.parse("2022-05-28T18:04:13.681Z");
                }};;
            }};            

            PostUcConnectionIdContactResponse res = sdk.contact.postUcConnectionIdContact(req, new PostUcConnectionIdContactSecurity("hic") {{
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


## putCrmConnectionIdContactId

Update a contact

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdContactIdRequest;
import com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdContactIdResponse;
import com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdContactIdSecurity;
import com.unifiedapi.unifiedto.models.shared.CrmContact;
import com.unifiedapi.unifiedto.models.shared.CrmEmail;
import com.unifiedapi.unifiedto.models.shared.CrmEmailType;
import com.unifiedapi.unifiedto.models.shared.CrmTelephone;
import com.unifiedapi.unifiedto.models.shared.CrmTelephoneType;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmContactAddress;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmContactRaw;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            PutCrmConnectionIdContactIdRequest req = new PutCrmConnectionIdContactIdRequest("cum", "aspernatur") {{
                crmContact = new CrmContact() {{
                    address = new PropertyCrmContactAddress() {{
                        address1 = "libero";
                        address2 = "nam";
                        city = "Fort Phoebe";
                        country = "Norway";
                        countryCode = "TT";
                        postalCode = "71838";
                        region = "facilis";
                        regionCode = "non";
                    }};;
                    company = "Shields - Walter";
                    companyIds = new String[]{{
                        add("distinctio"),
                    }};
                    createdAt = OffsetDateTime.parse("2022-01-11T21:57:18.174Z");
                    dealIds = new String[]{{
                        add("facere"),
                    }};
                    emails = new com.unifiedapi.unifiedto.models.shared.CrmEmail[]{{
                        add(new CrmEmail() {{
                            email = "Tamia80@hotmail.com";
                            type = CrmEmailType.HOME;
                        }}),
                    }};
                    id = "06a8aa94-c026-444c-b5e9-d9a4578adc1a";
                    name = "Dr. Rick Bauch";
                    raw = new PropertyCrmContactRaw();;
                    telephones = new com.unifiedapi.unifiedto.models.shared.CrmTelephone[]{{
                        add(new CrmTelephone("eaque") {{
                            telephone = "maxime";
                            type = CrmTelephoneType.WORK;
                        }}),
                    }};
                    title = "Mr.";
                    updatedAt = OffsetDateTime.parse("2021-06-08T05:02:10.598Z");
                }};;
            }};            

            PutCrmConnectionIdContactIdResponse res = sdk.contact.putCrmConnectionIdContactId(req, new PutCrmConnectionIdContactIdSecurity("blanditiis") {{
                jwt = "";
            }});

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

| Parameter                                                                                                                                        | Type                                                                                                                                             | Required                                                                                                                                         | Description                                                                                                                                      |
| ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                        | [com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdContactIdRequest](../../models/operations/PutCrmConnectionIdContactIdRequest.md)   | :heavy_check_mark:                                                                                                                               | The request object to use for the request.                                                                                                       |
| `security`                                                                                                                                       | [com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdContactIdSecurity](../../models/operations/PutCrmConnectionIdContactIdSecurity.md) | :heavy_check_mark:                                                                                                                               | The security requirements to use for the request.                                                                                                |


### Response

**[com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdContactIdResponse](../../models/operations/PutCrmConnectionIdContactIdResponse.md)**


## putCrmConnectionIdContactIdCompanyCompanyId

Associate a company with a contact

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdContactIdCompanyCompanyIdRequest;
import com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdContactIdCompanyCompanyIdResponse;
import com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdContactIdCompanyCompanyIdSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            PutCrmConnectionIdContactIdCompanyCompanyIdRequest req = new PutCrmConnectionIdContactIdCompanyCompanyIdRequest("quae", "magni", "officiis");            

            PutCrmConnectionIdContactIdCompanyCompanyIdResponse res = sdk.contact.putCrmConnectionIdContactIdCompanyCompanyId(req, new PutCrmConnectionIdContactIdCompanyCompanyIdSecurity("sed") {{
                jwt = "";
            }});

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

| Parameter                                                                                                                                                                        | Type                                                                                                                                                                             | Required                                                                                                                                                                         | Description                                                                                                                                                                      |
| -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                                        | [com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdContactIdCompanyCompanyIdRequest](../../models/operations/PutCrmConnectionIdContactIdCompanyCompanyIdRequest.md)   | :heavy_check_mark:                                                                                                                                                               | The request object to use for the request.                                                                                                                                       |
| `security`                                                                                                                                                                       | [com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdContactIdCompanyCompanyIdSecurity](../../models/operations/PutCrmConnectionIdContactIdCompanyCompanyIdSecurity.md) | :heavy_check_mark:                                                                                                                                                               | The security requirements to use for the request.                                                                                                                                |


### Response

**[com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdContactIdCompanyCompanyIdResponse](../../models/operations/PutCrmConnectionIdContactIdCompanyCompanyIdResponse.md)**


## putCrmConnectionIdContactIdDealDealId

Associate a deal with a contact

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdContactIdDealDealIdRequest;
import com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdContactIdDealDealIdResponse;
import com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdContactIdDealDealIdSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            PutCrmConnectionIdContactIdDealDealIdRequest req = new PutCrmConnectionIdContactIdDealDealIdRequest("necessitatibus", "impedit", "ipsa");            

            PutCrmConnectionIdContactIdDealDealIdResponse res = sdk.contact.putCrmConnectionIdContactIdDealDealId(req, new PutCrmConnectionIdContactIdDealDealIdSecurity("excepturi") {{
                jwt = "";
            }});

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

| Parameter                                                                                                                                                            | Type                                                                                                                                                                 | Required                                                                                                                                                             | Description                                                                                                                                                          |
| -------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                            | [com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdContactIdDealDealIdRequest](../../models/operations/PutCrmConnectionIdContactIdDealDealIdRequest.md)   | :heavy_check_mark:                                                                                                                                                   | The request object to use for the request.                                                                                                                           |
| `security`                                                                                                                                                           | [com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdContactIdDealDealIdSecurity](../../models/operations/PutCrmConnectionIdContactIdDealDealIdSecurity.md) | :heavy_check_mark:                                                                                                                                                   | The security requirements to use for the request.                                                                                                                    |


### Response

**[com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdContactIdDealDealIdResponse](../../models/operations/PutCrmConnectionIdContactIdDealDealIdResponse.md)**


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
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            PutUcConnectionIdContactIdRequest req = new PutUcConnectionIdContactIdRequest("a", "maiores") {{
                ucContact = new UcContact() {{
                    company = "Wunsch - Abbott";
                    createdAt = OffsetDateTime.parse("2021-06-06T21:58:33.426Z");
                    emails = new com.unifiedapi.unifiedto.models.shared.UcEmail[]{{
                        add(new UcEmail("in") {{
                            email = "Geoffrey.Wehner26@gmail.com";
                            type = UcEmailType.HOME;
                        }}),
                    }};
                    id = "c13e902c-1412-45b0-960a-668151a472af";
                    name = "Jeremy Douglas";
                    raw = new PropertyUcContactRaw();;
                    telephones = new com.unifiedapi.unifiedto.models.shared.UcTelephone[]{{
                        add(new UcTelephone("excepturi") {{
                            telephone = "cupiditate";
                            type = UcTelephoneType.HOME;
                        }}),
                    }};
                    title = "Dr.";
                    updatedAt = OffsetDateTime.parse("2022-07-06T22:48:19.114Z");
                }};;
            }};            

            PutUcConnectionIdContactIdResponse res = sdk.contact.putUcConnectionIdContactId(req, new PutUcConnectionIdContactIdSecurity("reiciendis") {{
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

