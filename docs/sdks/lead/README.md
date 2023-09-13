# lead

### Available Operations

* [deleteCrmConnectionIdLeadId](#deletecrmconnectionidleadid) - Remove a lead
* [getCrmConnectionIdLead](#getcrmconnectionidlead) - List all leads
* [getCrmConnectionIdLeadId](#getcrmconnectionidleadid) - Retrieve a lead
* [patchCrmConnectionIdLeadId](#patchcrmconnectionidleadid) - Update a lead
* [postCrmConnectionIdLead](#postcrmconnectionidlead) - Create a lead
* [putCrmConnectionIdLeadId](#putcrmconnectionidleadid) - Update a lead

## deleteCrmConnectionIdLeadId

Remove a lead

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdLeadIdRequest;
import com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdLeadIdResponse;
import com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdLeadIdSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            DeleteCrmConnectionIdLeadIdRequest req = new DeleteCrmConnectionIdLeadIdRequest("sapiente", "recusandae");            

            DeleteCrmConnectionIdLeadIdResponse res = sdk.lead.deleteCrmConnectionIdLeadId(req, new DeleteCrmConnectionIdLeadIdSecurity("perspiciatis") {{
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

| Parameter                                                                                                                                        | Type                                                                                                                                             | Required                                                                                                                                         | Description                                                                                                                                      |
| ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                        | [com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdLeadIdRequest](../../models/operations/DeleteCrmConnectionIdLeadIdRequest.md)   | :heavy_check_mark:                                                                                                                               | The request object to use for the request.                                                                                                       |
| `security`                                                                                                                                       | [com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdLeadIdSecurity](../../models/operations/DeleteCrmConnectionIdLeadIdSecurity.md) | :heavy_check_mark:                                                                                                                               | The security requirements to use for the request.                                                                                                |


### Response

**[com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdLeadIdResponse](../../models/operations/DeleteCrmConnectionIdLeadIdResponse.md)**


## getCrmConnectionIdLead

List all leads

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdLeadRequest;
import com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdLeadResponse;
import com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdLeadSecurity;
import java.time.LocalDate;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            GetCrmConnectionIdLeadRequest req = new GetCrmConnectionIdLeadRequest("natus") {{
                limit = 4403.3d;
                offset = 2088.26d;
                order = "sunt";
                query = "fuga";
                sort = "nulla";
                updatedGte = LocalDate.parse("2022-11-13");
            }};            

            GetCrmConnectionIdLeadResponse res = sdk.lead.getCrmConnectionIdLead(req, new GetCrmConnectionIdLeadSecurity("ad") {{
                jwt = "";
            }});

            if (res.crmLeads != null) {
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
| `request`                                                                                                                              | [com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdLeadRequest](../../models/operations/GetCrmConnectionIdLeadRequest.md)   | :heavy_check_mark:                                                                                                                     | The request object to use for the request.                                                                                             |
| `security`                                                                                                                             | [com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdLeadSecurity](../../models/operations/GetCrmConnectionIdLeadSecurity.md) | :heavy_check_mark:                                                                                                                     | The security requirements to use for the request.                                                                                      |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdLeadResponse](../../models/operations/GetCrmConnectionIdLeadResponse.md)**


## getCrmConnectionIdLeadId

Retrieve a lead

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdLeadIdRequest;
import com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdLeadIdResponse;
import com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdLeadIdSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            GetCrmConnectionIdLeadIdRequest req = new GetCrmConnectionIdLeadIdRequest("fugiat", "quas");            

            GetCrmConnectionIdLeadIdResponse res = sdk.lead.getCrmConnectionIdLeadId(req, new GetCrmConnectionIdLeadIdSecurity("quis") {{
                jwt = "";
            }});

            if (res.crmLead != null) {
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
| `request`                                                                                                                                  | [com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdLeadIdRequest](../../models/operations/GetCrmConnectionIdLeadIdRequest.md)   | :heavy_check_mark:                                                                                                                         | The request object to use for the request.                                                                                                 |
| `security`                                                                                                                                 | [com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdLeadIdSecurity](../../models/operations/GetCrmConnectionIdLeadIdSecurity.md) | :heavy_check_mark:                                                                                                                         | The security requirements to use for the request.                                                                                          |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdLeadIdResponse](../../models/operations/GetCrmConnectionIdLeadIdResponse.md)**


## patchCrmConnectionIdLeadId

Update a lead

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdLeadIdRequest;
import com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdLeadIdResponse;
import com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdLeadIdSecurity;
import com.unifiedapi.unifiedto.models.shared.CrmEmail;
import com.unifiedapi.unifiedto.models.shared.CrmEmailType;
import com.unifiedapi.unifiedto.models.shared.CrmLead;
import com.unifiedapi.unifiedto.models.shared.CrmTelephone;
import com.unifiedapi.unifiedto.models.shared.CrmTelephoneType;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmLeadAddress;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmLeadRaw;
import java.time.LocalDate;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            PatchCrmConnectionIdLeadIdRequest req = new PatchCrmConnectionIdLeadIdRequest("fuga", "eveniet") {{
                crmLead = new CrmLead() {{
                    active = false;
                    address = new PropertyCrmLeadAddress() {{
                        address1 = "consequuntur";
                        address2 = "illum";
                        city = "Plantation";
                        country = "Kazakhstan";
                        countryCode = "AL";
                        postalCode = "61542-1508";
                        region = "adipisci";
                        regionCode = "dolorem";
                    }};;
                    companyId = "ex";
                    contactId = "quis";
                    createdAt = LocalDate.parse("2022-11-29");
                    creatorUserId = "officiis";
                    emails = new com.unifiedapi.unifiedto.models.shared.CrmEmail[]{{
                        add(new CrmEmail() {{
                            email = "Lottie_Boyle@hotmail.com";
                            type = CrmEmailType.OTHER;
                        }}),
                    }};
                    id = "89451bd7-6eee-4b51-8c4d-a1fad35512f0";
                    name = "Janis Greenholt";
                    raw = new PropertyCrmLeadRaw();;
                    telephones = new com.unifiedapi.unifiedto.models.shared.CrmTelephone[]{{
                        add(new CrmTelephone("consequuntur") {{
                            telephone = "nam";
                            type = CrmTelephoneType.OTHER;
                        }}),
                    }};
                    updatedAt = LocalDate.parse("2022-12-31");
                    userId = "doloribus";
                }};;
            }};            

            PatchCrmConnectionIdLeadIdResponse res = sdk.lead.patchCrmConnectionIdLeadId(req, new PatchCrmConnectionIdLeadIdSecurity("nemo") {{
                jwt = "";
            }});

            if (res.crmLead != null) {
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
| `request`                                                                                                                                      | [com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdLeadIdRequest](../../models/operations/PatchCrmConnectionIdLeadIdRequest.md)   | :heavy_check_mark:                                                                                                                             | The request object to use for the request.                                                                                                     |
| `security`                                                                                                                                     | [com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdLeadIdSecurity](../../models/operations/PatchCrmConnectionIdLeadIdSecurity.md) | :heavy_check_mark:                                                                                                                             | The security requirements to use for the request.                                                                                              |


### Response

**[com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdLeadIdResponse](../../models/operations/PatchCrmConnectionIdLeadIdResponse.md)**


## postCrmConnectionIdLead

Create a lead

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PostCrmConnectionIdLeadRequest;
import com.unifiedapi.unifiedto.models.operations.PostCrmConnectionIdLeadResponse;
import com.unifiedapi.unifiedto.models.operations.PostCrmConnectionIdLeadSecurity;
import com.unifiedapi.unifiedto.models.shared.CrmEmail;
import com.unifiedapi.unifiedto.models.shared.CrmEmailType;
import com.unifiedapi.unifiedto.models.shared.CrmLead;
import com.unifiedapi.unifiedto.models.shared.CrmTelephone;
import com.unifiedapi.unifiedto.models.shared.CrmTelephoneType;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmLeadAddress;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmLeadRaw;
import java.time.LocalDate;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            PostCrmConnectionIdLeadRequest req = new PostCrmConnectionIdLeadRequest("dolore") {{
                crmLead = new CrmLead() {{
                    active = false;
                    address = new PropertyCrmLeadAddress() {{
                        address1 = "corrupti";
                        address2 = "exercitationem";
                        city = "Johnsonchester";
                        country = "Albania";
                        countryCode = "FI";
                        postalCode = "29006";
                        region = "architecto";
                        regionCode = "quibusdam";
                    }};;
                    companyId = "autem";
                    contactId = "voluptates";
                    createdAt = LocalDate.parse("2021-10-29");
                    creatorUserId = "modi";
                    emails = new com.unifiedapi.unifiedto.models.shared.CrmEmail[]{{
                        add(new CrmEmail() {{
                            email = "Elmo35@gmail.com";
                            type = CrmEmailType.OTHER;
                        }}),
                    }};
                    id = "03084fbb-a5cc-4eff-9cb0-1fe51e528a45";
                    name = "Miss Roosevelt Luettgen";
                    raw = new PropertyCrmLeadRaw();;
                    telephones = new com.unifiedapi.unifiedto.models.shared.CrmTelephone[]{{
                        add(new CrmTelephone("corrupti") {{
                            telephone = "ullam";
                            type = CrmTelephoneType.MOBILE;
                        }}),
                    }};
                    updatedAt = LocalDate.parse("2021-05-18");
                    userId = "explicabo";
                }};;
            }};            

            PostCrmConnectionIdLeadResponse res = sdk.lead.postCrmConnectionIdLead(req, new PostCrmConnectionIdLeadSecurity("placeat") {{
                jwt = "";
            }});

            if (res.crmLead != null) {
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
| `request`                                                                                                                                | [com.unifiedapi.unifiedto.models.operations.PostCrmConnectionIdLeadRequest](../../models/operations/PostCrmConnectionIdLeadRequest.md)   | :heavy_check_mark:                                                                                                                       | The request object to use for the request.                                                                                               |
| `security`                                                                                                                               | [com.unifiedapi.unifiedto.models.operations.PostCrmConnectionIdLeadSecurity](../../models/operations/PostCrmConnectionIdLeadSecurity.md) | :heavy_check_mark:                                                                                                                       | The security requirements to use for the request.                                                                                        |


### Response

**[com.unifiedapi.unifiedto.models.operations.PostCrmConnectionIdLeadResponse](../../models/operations/PostCrmConnectionIdLeadResponse.md)**


## putCrmConnectionIdLeadId

Update a lead

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdLeadIdRequest;
import com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdLeadIdResponse;
import com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdLeadIdSecurity;
import com.unifiedapi.unifiedto.models.shared.CrmEmail;
import com.unifiedapi.unifiedto.models.shared.CrmEmailType;
import com.unifiedapi.unifiedto.models.shared.CrmLead;
import com.unifiedapi.unifiedto.models.shared.CrmTelephone;
import com.unifiedapi.unifiedto.models.shared.CrmTelephoneType;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmLeadAddress;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmLeadRaw;
import java.time.LocalDate;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            PutCrmConnectionIdLeadIdRequest req = new PutCrmConnectionIdLeadIdRequest("animi", "expedita") {{
                crmLead = new CrmLead() {{
                    active = false;
                    address = new PropertyCrmLeadAddress() {{
                        address1 = "laborum";
                        address2 = "atque";
                        city = "Peabody";
                        country = "French Guiana";
                        countryCode = "BG";
                        postalCode = "48836";
                        region = "iure";
                        regionCode = "hic";
                    }};;
                    companyId = "sapiente";
                    contactId = "eius";
                    createdAt = LocalDate.parse("2022-11-26");
                    creatorUserId = "inventore";
                    emails = new com.unifiedapi.unifiedto.models.shared.CrmEmail[]{{
                        add(new CrmEmail() {{
                            email = "Maia_Bosco46@yahoo.com";
                            type = CrmEmailType.WORK;
                        }}),
                    }};
                    id = "b86cecc7-4f77-4b48-88bd-6a6f0441d2c3";
                    name = "Morris Bahringer V";
                    raw = new PropertyCrmLeadRaw();;
                    telephones = new com.unifiedapi.unifiedto.models.shared.CrmTelephone[]{{
                        add(new CrmTelephone("molestiae") {{
                            telephone = "quaerat";
                            type = CrmTelephoneType.HOME;
                        }}),
                    }};
                    updatedAt = LocalDate.parse("2022-02-02");
                    userId = "ipsa";
                }};;
            }};            

            PutCrmConnectionIdLeadIdResponse res = sdk.lead.putCrmConnectionIdLeadId(req, new PutCrmConnectionIdLeadIdSecurity("laboriosam") {{
                jwt = "";
            }});

            if (res.crmLead != null) {
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
| `request`                                                                                                                                  | [com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdLeadIdRequest](../../models/operations/PutCrmConnectionIdLeadIdRequest.md)   | :heavy_check_mark:                                                                                                                         | The request object to use for the request.                                                                                                 |
| `security`                                                                                                                                 | [com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdLeadIdSecurity](../../models/operations/PutCrmConnectionIdLeadIdSecurity.md) | :heavy_check_mark:                                                                                                                         | The security requirements to use for the request.                                                                                          |


### Response

**[com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdLeadIdResponse](../../models/operations/PutCrmConnectionIdLeadIdResponse.md)**

