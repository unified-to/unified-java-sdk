# Lead

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
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("ratione") {{
                    jwt = "";
                }})
                .build();

            DeleteCrmConnectionIdLeadIdRequest req = new DeleteCrmConnectionIdLeadIdRequest("molestias", "odio");            

            DeleteCrmConnectionIdLeadIdResponse res = sdk.lead.deleteCrmConnectionIdLeadId(req);

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

| Parameter                                                                                                                                      | Type                                                                                                                                           | Required                                                                                                                                       | Description                                                                                                                                    |
| ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                      | [com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdLeadIdRequest](../../models/operations/DeleteCrmConnectionIdLeadIdRequest.md) | :heavy_check_mark:                                                                                                                             | The request object to use for the request.                                                                                                     |


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
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("non") {{
                    jwt = "";
                }})
                .build();

            GetCrmConnectionIdLeadRequest req = new GetCrmConnectionIdLeadRequest("magni") {{
                limit = 5768.7d;
                offset = 101.8d;
                order = "illum";
                query = "adipisci";
                sort = "dolorem";
                updatedGte = OffsetDateTime.parse("2022-08-30T00:40:49.036Z");
            }};            

            GetCrmConnectionIdLeadResponse res = sdk.lead.getCrmConnectionIdLead(req);

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

| Parameter                                                                                                                            | Type                                                                                                                                 | Required                                                                                                                             | Description                                                                                                                          |
| ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                            | [com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdLeadRequest](../../models/operations/GetCrmConnectionIdLeadRequest.md) | :heavy_check_mark:                                                                                                                   | The request object to use for the request.                                                                                           |


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
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("eum") {{
                    jwt = "";
                }})
                .build();

            GetCrmConnectionIdLeadIdRequest req = new GetCrmConnectionIdLeadIdRequest("et", "officiis");            

            GetCrmConnectionIdLeadIdResponse res = sdk.lead.getCrmConnectionIdLeadId(req);

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
| `request`                                                                                                                                | [com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdLeadIdRequest](../../models/operations/GetCrmConnectionIdLeadIdRequest.md) | :heavy_check_mark:                                                                                                                       | The request object to use for the request.                                                                                               |


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
import com.unifiedapi.unifiedto.models.shared.CrmEmail;
import com.unifiedapi.unifiedto.models.shared.CrmEmailType;
import com.unifiedapi.unifiedto.models.shared.CrmLead;
import com.unifiedapi.unifiedto.models.shared.CrmTelephone;
import com.unifiedapi.unifiedto.models.shared.CrmTelephoneType;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmLeadAddress;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmLeadRaw;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("quo") {{
                    jwt = "";
                }})
                .build();

            PatchCrmConnectionIdLeadIdRequest req = new PatchCrmConnectionIdLeadIdRequest("culpa", "architecto") {{
                crmLead = new CrmLead() {{
                    active = false;
                    address = new PropertyCrmLeadAddress() {{
                        address1 = "iure";
                        address2 = "eveniet";
                        city = "Los Angeles";
                        country = "Namibia";
                        countryCode = "ET";
                        postalCode = "06843";
                        region = "accusamus";
                        regionCode = "officiis";
                    }};;
                    companyId = "necessitatibus";
                    contactId = "nam";
                    createdAt = OffsetDateTime.parse("2022-12-01T06:48:28.686Z");
                    creatorUserId = "molestias";
                    emails = new com.unifiedapi.unifiedto.models.shared.CrmEmail[]{{
                        add(new CrmEmail() {{
                            email = "Dina.Senger@hotmail.com";
                            type = CrmEmailType.OTHER;
                        }}),
                    }};
                    id = "ad35512f-06d4-4e5b-b2f0-f548568a0424";
                    name = "Michael Barrows PhD";
                    raw = new PropertyCrmLeadRaw();;
                    telephones = new com.unifiedapi.unifiedto.models.shared.CrmTelephone[]{{
                        add(new CrmTelephone("tempore") {{
                            telephone = "autem";
                            type = CrmTelephoneType.MOBILE;
                        }}),
                    }};
                    updatedAt = OffsetDateTime.parse("2022-06-18T17:15:11.201Z");
                    userId = "ratione";
                }};;
            }};            

            PatchCrmConnectionIdLeadIdResponse res = sdk.lead.patchCrmConnectionIdLeadId(req);

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

| Parameter                                                                                                                                    | Type                                                                                                                                         | Required                                                                                                                                     | Description                                                                                                                                  |
| -------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                    | [com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdLeadIdRequest](../../models/operations/PatchCrmConnectionIdLeadIdRequest.md) | :heavy_check_mark:                                                                                                                           | The request object to use for the request.                                                                                                   |


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
import com.unifiedapi.unifiedto.models.shared.CrmEmail;
import com.unifiedapi.unifiedto.models.shared.CrmEmailType;
import com.unifiedapi.unifiedto.models.shared.CrmLead;
import com.unifiedapi.unifiedto.models.shared.CrmTelephone;
import com.unifiedapi.unifiedto.models.shared.CrmTelephoneType;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmLeadAddress;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmLeadRaw;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("aliquam") {{
                    jwt = "";
                }})
                .build();

            PostCrmConnectionIdLeadRequest req = new PostCrmConnectionIdLeadRequest("ea") {{
                crmLead = new CrmLead() {{
                    active = false;
                    address = new PropertyCrmLeadAddress() {{
                        address1 = "aliquam";
                        address2 = "corporis";
                        city = "Bartlett";
                        country = "Czech Republic";
                        countryCode = "AG";
                        postalCode = "39776-3778";
                        region = "a";
                        regionCode = "tenetur";
                    }};;
                    companyId = "ipsam";
                    contactId = "quod";
                    createdAt = OffsetDateTime.parse("2022-12-02T09:14:46.880Z");
                    creatorUserId = "illo";
                    emails = new com.unifiedapi.unifiedto.models.shared.CrmEmail[]{{
                        add(new CrmEmail() {{
                            email = "Sonia88@hotmail.com";
                            type = CrmEmailType.HOME;
                        }}),
                    }};
                    id = "28a45ac8-2b85-4f8b-82ca-ba8da4127dd5";
                    name = "Gabriel Weissnat";
                    raw = new PropertyCrmLeadRaw();;
                    telephones = new com.unifiedapi.unifiedto.models.shared.CrmTelephone[]{{
                        add(new CrmTelephone("inventore") {{
                            telephone = "esse";
                            type = CrmTelephoneType.WORK;
                        }}),
                    }};
                    updatedAt = OffsetDateTime.parse("2021-09-05T10:47:22.933Z");
                    userId = "et";
                }};;
            }};            

            PostCrmConnectionIdLeadResponse res = sdk.lead.postCrmConnectionIdLead(req);

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

| Parameter                                                                                                                              | Type                                                                                                                                   | Required                                                                                                                               | Description                                                                                                                            |
| -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                              | [com.unifiedapi.unifiedto.models.operations.PostCrmConnectionIdLeadRequest](../../models/operations/PostCrmConnectionIdLeadRequest.md) | :heavy_check_mark:                                                                                                                     | The request object to use for the request.                                                                                             |


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
import com.unifiedapi.unifiedto.models.shared.CrmEmail;
import com.unifiedapi.unifiedto.models.shared.CrmEmailType;
import com.unifiedapi.unifiedto.models.shared.CrmLead;
import com.unifiedapi.unifiedto.models.shared.CrmTelephone;
import com.unifiedapi.unifiedto.models.shared.CrmTelephoneType;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmLeadAddress;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmLeadRaw;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("distinctio") {{
                    jwt = "";
                }})
                .build();

            PutCrmConnectionIdLeadIdRequest req = new PutCrmConnectionIdLeadIdRequest("porro", "nihil") {{
                crmLead = new CrmLead() {{
                    active = false;
                    address = new PropertyCrmLeadAddress() {{
                        address1 = "numquam";
                        address2 = "rerum";
                        city = "Gracefield";
                        country = "Tonga";
                        countryCode = "SE";
                        postalCode = "42944-7253";
                        region = "totam";
                        regionCode = "soluta";
                    }};;
                    companyId = "quibusdam";
                    contactId = "iure";
                    createdAt = OffsetDateTime.parse("2022-03-01T06:49:32.137Z");
                    creatorUserId = "hic";
                    emails = new com.unifiedapi.unifiedto.models.shared.CrmEmail[]{{
                        add(new CrmEmail() {{
                            email = "Donna86@gmail.com";
                            type = CrmEmailType.WORK;
                        }}),
                    }};
                    id = "c3b80809-4373-4e06-8459-bebbad02f258";
                    name = "Melody Schmidt III";
                    raw = new PropertyCrmLeadRaw();;
                    telephones = new com.unifiedapi.unifiedto.models.shared.CrmTelephone[]{{
                        add(new CrmTelephone("minima") {{
                            telephone = "eos";
                            type = CrmTelephoneType.HOME;
                        }}),
                    }};
                    updatedAt = OffsetDateTime.parse("2021-04-25T07:52:46.758Z");
                    userId = "fuga";
                }};;
            }};            

            PutCrmConnectionIdLeadIdResponse res = sdk.lead.putCrmConnectionIdLeadId(req);

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
| `request`                                                                                                                                | [com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdLeadIdRequest](../../models/operations/PutCrmConnectionIdLeadIdRequest.md) | :heavy_check_mark:                                                                                                                       | The request object to use for the request.                                                                                               |


### Response

**[com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdLeadIdResponse](../../models/operations/PutCrmConnectionIdLeadIdResponse.md)**

