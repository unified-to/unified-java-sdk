# Lead
(*lead*)

### Available Operations

* [createCrmLead](#createcrmlead) - Create a lead
* [getCrmLead](#getcrmlead) - Retrieve a lead
* [listCrmLeads](#listcrmleads) - List all leads
* [patchCrmLead](#patchcrmlead) - Update a lead
* [removeCrmLead](#removecrmlead) - Remove a lead
* [updateCrmLead](#updatecrmlead) - Update a lead

## createCrmLead

Create a lead

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.CreateCrmLeadRequest;
import com.unifiedapi.unifiedto.models.operations.CreateCrmLeadResponse;
import com.unifiedapi.unifiedto.models.shared.CrmEmail;
import com.unifiedapi.unifiedto.models.shared.CrmEmailType;
import com.unifiedapi.unifiedto.models.shared.CrmLead;
import com.unifiedapi.unifiedto.models.shared.CrmTelephone;
import com.unifiedapi.unifiedto.models.shared.CrmTelephoneType;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmLeadAddress;
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

            com.unifiedapi.unifiedto.models.operations.CreateCrmLeadRequest req = new CreateCrmLeadRequest(
                "string"){{
                crmLead = new CrmLead(
){{
                    address = new PropertyCrmLeadAddress(
){{
                        address1 = "string";
                        address2 = "string";
                        city = "Lindboro";
                        country = "Saint Barthelemy";
                        countryCode = "SG";
                        postalCode = "67307-8667";
                        region = "string";
                        regionCode = "string";

                    }};
                    companyId = "string";
                    companyName = "Langosh - Fritsch";
                    contactId = "string";
                    createdAt = OffsetDateTime.parse("2023-12-23T15:29:07.093Z");
                    creatorUserId = "string";
                    emails = new com.unifiedapi.unifiedto.models.shared.CrmEmail[]{{
                        add(new CrmEmail(
                        ){{}}),
                    }};
                    id = "<ID>";
                    isActive = false;
                    name = "string";
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "string");
                    }};
                    source = "string";
                    status = "string";
                    telephones = new com.unifiedapi.unifiedto.models.shared.CrmTelephone[]{{
                        add(new CrmTelephone(
                        "string"){{
                            telephone = "string";
                        }}),
                    }};
                    updatedAt = OffsetDateTime.parse("2024-09-01T18:33:52.670Z");
                    userId = "string";

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.CreateCrmLeadResponse res = sdk.lead.createCrmLead(req);

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

| Parameter                                                                                                          | Type                                                                                                               | Required                                                                                                           | Description                                                                                                        |
| ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                          | [com.unifiedapi.unifiedto.models.operations.CreateCrmLeadRequest](../../models/operations/CreateCrmLeadRequest.md) | :heavy_check_mark:                                                                                                 | The request object to use for the request.                                                                         |


### Response

**[com.unifiedapi.unifiedto.models.operations.CreateCrmLeadResponse](../../models/operations/CreateCrmLeadResponse.md)**


## getCrmLead

Retrieve a lead

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetCrmLeadRequest;
import com.unifiedapi.unifiedto.models.operations.GetCrmLeadResponse;
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

            com.unifiedapi.unifiedto.models.operations.GetCrmLeadRequest req = new GetCrmLeadRequest(
                "string",
                "string"){{
                fields = new String[]{{
                    add("string"),
                }};

            }};

            com.unifiedapi.unifiedto.models.operations.GetCrmLeadResponse res = sdk.lead.getCrmLead(req);

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

| Parameter                                                                                                    | Type                                                                                                         | Required                                                                                                     | Description                                                                                                  |
| ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                    | [com.unifiedapi.unifiedto.models.operations.GetCrmLeadRequest](../../models/operations/GetCrmLeadRequest.md) | :heavy_check_mark:                                                                                           | The request object to use for the request.                                                                   |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetCrmLeadResponse](../../models/operations/GetCrmLeadResponse.md)**


## listCrmLeads

List all leads

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.ListCrmLeadsRequest;
import com.unifiedapi.unifiedto.models.operations.ListCrmLeadsResponse;
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

            com.unifiedapi.unifiedto.models.operations.ListCrmLeadsRequest req = new ListCrmLeadsRequest(
                "string"){{
                companyId = "string";
                contactId = "string";
                fields = new String[]{{
                    add("string"),
                }};
                limit = 2895.08d;
                offset = 6446.8d;
                order = "string";
                query = "string";
                sort = "string";
                updatedGte = OffsetDateTime.parse("2024-01-12T07:27:29.016Z");
                userId = "string";

            }};

            com.unifiedapi.unifiedto.models.operations.ListCrmLeadsResponse res = sdk.lead.listCrmLeads(req);

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

| Parameter                                                                                                        | Type                                                                                                             | Required                                                                                                         | Description                                                                                                      |
| ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                        | [com.unifiedapi.unifiedto.models.operations.ListCrmLeadsRequest](../../models/operations/ListCrmLeadsRequest.md) | :heavy_check_mark:                                                                                               | The request object to use for the request.                                                                       |


### Response

**[com.unifiedapi.unifiedto.models.operations.ListCrmLeadsResponse](../../models/operations/ListCrmLeadsResponse.md)**


## patchCrmLead

Update a lead

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PatchCrmLeadRequest;
import com.unifiedapi.unifiedto.models.operations.PatchCrmLeadResponse;
import com.unifiedapi.unifiedto.models.shared.CrmEmail;
import com.unifiedapi.unifiedto.models.shared.CrmEmailType;
import com.unifiedapi.unifiedto.models.shared.CrmLead;
import com.unifiedapi.unifiedto.models.shared.CrmTelephone;
import com.unifiedapi.unifiedto.models.shared.CrmTelephoneType;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmLeadAddress;
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

            com.unifiedapi.unifiedto.models.operations.PatchCrmLeadRequest req = new PatchCrmLeadRequest(
                "string",
                "string"){{
                crmLead = new CrmLead(
){{
                    address = new PropertyCrmLeadAddress(
){{
                        address1 = "string";
                        address2 = "string";
                        city = "Caseyberg";
                        country = "Cote d'Ivoire";
                        countryCode = "LK";
                        postalCode = "22291";
                        region = "string";
                        regionCode = "string";

                    }};
                    companyId = "string";
                    companyName = "Altenwerth, Lebsack and Wintheiser";
                    contactId = "string";
                    createdAt = OffsetDateTime.parse("2023-12-16T13:33:21.530Z");
                    creatorUserId = "string";
                    emails = new com.unifiedapi.unifiedto.models.shared.CrmEmail[]{{
                        add(new CrmEmail(
                        ){{}}),
                    }};
                    id = "<ID>";
                    isActive = false;
                    name = "string";
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "string");
                    }};
                    source = "string";
                    status = "string";
                    telephones = new com.unifiedapi.unifiedto.models.shared.CrmTelephone[]{{
                        add(new CrmTelephone(
                        "string"){{
                            telephone = "string";
                        }}),
                    }};
                    updatedAt = OffsetDateTime.parse("2022-10-10T11:36:08.811Z");
                    userId = "string";

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.PatchCrmLeadResponse res = sdk.lead.patchCrmLead(req);

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

| Parameter                                                                                                        | Type                                                                                                             | Required                                                                                                         | Description                                                                                                      |
| ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                        | [com.unifiedapi.unifiedto.models.operations.PatchCrmLeadRequest](../../models/operations/PatchCrmLeadRequest.md) | :heavy_check_mark:                                                                                               | The request object to use for the request.                                                                       |


### Response

**[com.unifiedapi.unifiedto.models.operations.PatchCrmLeadResponse](../../models/operations/PatchCrmLeadResponse.md)**


## removeCrmLead

Remove a lead

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.RemoveCrmLeadRequest;
import com.unifiedapi.unifiedto.models.operations.RemoveCrmLeadResponse;
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

            com.unifiedapi.unifiedto.models.operations.RemoveCrmLeadRequest req = new RemoveCrmLeadRequest(
                "string",
                "string");

            com.unifiedapi.unifiedto.models.operations.RemoveCrmLeadResponse res = sdk.lead.removeCrmLead(req);

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

| Parameter                                                                                                          | Type                                                                                                               | Required                                                                                                           | Description                                                                                                        |
| ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                          | [com.unifiedapi.unifiedto.models.operations.RemoveCrmLeadRequest](../../models/operations/RemoveCrmLeadRequest.md) | :heavy_check_mark:                                                                                                 | The request object to use for the request.                                                                         |


### Response

**[com.unifiedapi.unifiedto.models.operations.RemoveCrmLeadResponse](../../models/operations/RemoveCrmLeadResponse.md)**


## updateCrmLead

Update a lead

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.UpdateCrmLeadRequest;
import com.unifiedapi.unifiedto.models.operations.UpdateCrmLeadResponse;
import com.unifiedapi.unifiedto.models.shared.CrmEmail;
import com.unifiedapi.unifiedto.models.shared.CrmEmailType;
import com.unifiedapi.unifiedto.models.shared.CrmLead;
import com.unifiedapi.unifiedto.models.shared.CrmTelephone;
import com.unifiedapi.unifiedto.models.shared.CrmTelephoneType;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmLeadAddress;
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

            com.unifiedapi.unifiedto.models.operations.UpdateCrmLeadRequest req = new UpdateCrmLeadRequest(
                "string",
                "string"){{
                crmLead = new CrmLead(
){{
                    address = new PropertyCrmLeadAddress(
){{
                        address1 = "string";
                        address2 = "string";
                        city = "West Vernerworth";
                        country = "Suriname";
                        countryCode = "ID";
                        postalCode = "87400-2256";
                        region = "string";
                        regionCode = "string";

                    }};
                    companyId = "string";
                    companyName = "Gibson - Cummings";
                    contactId = "string";
                    createdAt = OffsetDateTime.parse("2024-12-12T08:55:32.549Z");
                    creatorUserId = "string";
                    emails = new com.unifiedapi.unifiedto.models.shared.CrmEmail[]{{
                        add(new CrmEmail(
                        ){{}}),
                    }};
                    id = "<ID>";
                    isActive = false;
                    name = "string";
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "string");
                    }};
                    source = "string";
                    status = "string";
                    telephones = new com.unifiedapi.unifiedto.models.shared.CrmTelephone[]{{
                        add(new CrmTelephone(
                        "string"){{
                            telephone = "string";
                        }}),
                    }};
                    updatedAt = OffsetDateTime.parse("2023-06-14T10:08:49.472Z");
                    userId = "string";

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.UpdateCrmLeadResponse res = sdk.lead.updateCrmLead(req);

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

| Parameter                                                                                                          | Type                                                                                                               | Required                                                                                                           | Description                                                                                                        |
| ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                          | [com.unifiedapi.unifiedto.models.operations.UpdateCrmLeadRequest](../../models/operations/UpdateCrmLeadRequest.md) | :heavy_check_mark:                                                                                                 | The request object to use for the request.                                                                         |


### Response

**[com.unifiedapi.unifiedto.models.operations.UpdateCrmLeadResponse](../../models/operations/UpdateCrmLeadResponse.md)**

