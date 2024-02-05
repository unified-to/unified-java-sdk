# Company
(*company*)

### Available Operations

* [createCrmCompany](#createcrmcompany) - Create a company
* [getAtsCompany](#getatscompany) - Retrieve a company
* [getCrmCompany](#getcrmcompany) - Retrieve a company
* [listAtsCompanies](#listatscompanies) - List all companies
* [listCrmCompanies](#listcrmcompanies) - List all companies
* [listEnrichCompanies](#listenrichcompanies) - Retrieve enrichment information for a company
* [patchCrmCompany](#patchcrmcompany) - Update a company
* [removeCrmCompany](#removecrmcompany) - Remove a company
* [updateCrmCompany](#updatecrmcompany) - Update a company

## createCrmCompany

Create a company

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.CreateCrmCompanyRequest;
import com.unifiedapi.unifiedto.models.operations.CreateCrmCompanyResponse;
import com.unifiedapi.unifiedto.models.shared.CrmCompany;
import com.unifiedapi.unifiedto.models.shared.CrmEmail;
import com.unifiedapi.unifiedto.models.shared.CrmEmailType;
import com.unifiedapi.unifiedto.models.shared.CrmTelephone;
import com.unifiedapi.unifiedto.models.shared.CrmTelephoneType;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmCompanyAddress;
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

            com.unifiedapi.unifiedto.models.operations.CreateCrmCompanyRequest req = new CreateCrmCompanyRequest(
                "string"){{
                crmCompany = new CrmCompany(
){{
                    address = new PropertyCrmCompanyAddress(
){{
                        address1 = "string";
                        address2 = "string";
                        city = "Joanieworth";
                        country = "Brazil";
                        countryCode = "CW";
                        postalCode = "39571";
                        region = "string";
                        regionCode = "string";

                    }};
                    createdAt = OffsetDateTime.parse("2024-02-03T10:04:12.712Z");
                    dealIds = new String[]{{
                        add("string"),
                    }};
                    description = "Pre-emptive responsive task-force";
                    emails = new com.unifiedapi.unifiedto.models.shared.CrmEmail[]{{
                        add(new CrmEmail(
                        ){{}}),
                    }};
                    employees = 4175.89d;
                    id = "<ID>";
                    industry = "string";
                    isActive = false;
                    linkUrls = new String[]{{
                        add("string"),
                    }};
                    name = "string";
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "string");
                    }};
                    tags = new String[]{{
                        add("string"),
                    }};
                    telephones = new com.unifiedapi.unifiedto.models.shared.CrmTelephone[]{{
                        add(new CrmTelephone(
                        "string"){{
                            telephone = "string";
                        }}),
                    }};
                    timezone = "Europe/Bucharest";
                    updatedAt = OffsetDateTime.parse("2023-10-03T19:32:53.625Z");
                    userId = "string";
                    websites = new String[]{{
                        add("string"),
                    }};

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.CreateCrmCompanyResponse res = sdk.company.createCrmCompany(req);

            if (res.crmCompany != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                | Type                                                                                                                     | Required                                                                                                                 | Description                                                                                                              |
| ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                | [com.unifiedapi.unifiedto.models.operations.CreateCrmCompanyRequest](../../models/operations/CreateCrmCompanyRequest.md) | :heavy_check_mark:                                                                                                       | The request object to use for the request.                                                                               |


### Response

**[com.unifiedapi.unifiedto.models.operations.CreateCrmCompanyResponse](../../models/operations/CreateCrmCompanyResponse.md)**


## getAtsCompany

Retrieve a company

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetAtsCompanyRequest;
import com.unifiedapi.unifiedto.models.operations.GetAtsCompanyResponse;
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

            com.unifiedapi.unifiedto.models.operations.GetAtsCompanyRequest req = new GetAtsCompanyRequest(
                "string",
                "string"){{
                fields = new String[]{{
                    add("string"),
                }};

            }};

            com.unifiedapi.unifiedto.models.operations.GetAtsCompanyResponse res = sdk.company.getAtsCompany(req);

            if (res.atsCompany != null) {
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
| `request`                                                                                                          | [com.unifiedapi.unifiedto.models.operations.GetAtsCompanyRequest](../../models/operations/GetAtsCompanyRequest.md) | :heavy_check_mark:                                                                                                 | The request object to use for the request.                                                                         |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetAtsCompanyResponse](../../models/operations/GetAtsCompanyResponse.md)**


## getCrmCompany

Retrieve a company

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetCrmCompanyRequest;
import com.unifiedapi.unifiedto.models.operations.GetCrmCompanyResponse;
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

            com.unifiedapi.unifiedto.models.operations.GetCrmCompanyRequest req = new GetCrmCompanyRequest(
                "string",
                "string"){{
                fields = new String[]{{
                    add("string"),
                }};

            }};

            com.unifiedapi.unifiedto.models.operations.GetCrmCompanyResponse res = sdk.company.getCrmCompany(req);

            if (res.crmCompany != null) {
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
| `request`                                                                                                          | [com.unifiedapi.unifiedto.models.operations.GetCrmCompanyRequest](../../models/operations/GetCrmCompanyRequest.md) | :heavy_check_mark:                                                                                                 | The request object to use for the request.                                                                         |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetCrmCompanyResponse](../../models/operations/GetCrmCompanyResponse.md)**


## listAtsCompanies

List all companies

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.ListAtsCompaniesRequest;
import com.unifiedapi.unifiedto.models.operations.ListAtsCompaniesResponse;
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

            com.unifiedapi.unifiedto.models.operations.ListAtsCompaniesRequest req = new ListAtsCompaniesRequest(
                "string"){{
                fields = new String[]{{
                    add("string"),
                }};
                limit = 6933.84d;
                offset = 7946.52d;
                order = "string";
                query = "string";
                sort = "string";
                updatedGte = OffsetDateTime.parse("2024-10-01T21:39:38.971Z");

            }};

            com.unifiedapi.unifiedto.models.operations.ListAtsCompaniesResponse res = sdk.company.listAtsCompanies(req);

            if (res.atsCompanies != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                | Type                                                                                                                     | Required                                                                                                                 | Description                                                                                                              |
| ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                | [com.unifiedapi.unifiedto.models.operations.ListAtsCompaniesRequest](../../models/operations/ListAtsCompaniesRequest.md) | :heavy_check_mark:                                                                                                       | The request object to use for the request.                                                                               |


### Response

**[com.unifiedapi.unifiedto.models.operations.ListAtsCompaniesResponse](../../models/operations/ListAtsCompaniesResponse.md)**


## listCrmCompanies

List all companies

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.ListCrmCompaniesRequest;
import com.unifiedapi.unifiedto.models.operations.ListCrmCompaniesResponse;
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

            com.unifiedapi.unifiedto.models.operations.ListCrmCompaniesRequest req = new ListCrmCompaniesRequest(
                "string"){{
                contactId = "string";
                dealId = "string";
                fields = new String[]{{
                    add("string"),
                }};
                limit = 9883.97d;
                offset = 5913.88d;
                order = "string";
                query = "string";
                sort = "string";
                updatedGte = OffsetDateTime.parse("2023-05-02T17:52:08.731Z");
                userId = "string";

            }};

            com.unifiedapi.unifiedto.models.operations.ListCrmCompaniesResponse res = sdk.company.listCrmCompanies(req);

            if (res.crmCompanies != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                | Type                                                                                                                     | Required                                                                                                                 | Description                                                                                                              |
| ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                | [com.unifiedapi.unifiedto.models.operations.ListCrmCompaniesRequest](../../models/operations/ListCrmCompaniesRequest.md) | :heavy_check_mark:                                                                                                       | The request object to use for the request.                                                                               |


### Response

**[com.unifiedapi.unifiedto.models.operations.ListCrmCompaniesResponse](../../models/operations/ListCrmCompaniesResponse.md)**


## listEnrichCompanies

Retrieve enrichment information for a company

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.ListEnrichCompaniesRequest;
import com.unifiedapi.unifiedto.models.operations.ListEnrichCompaniesResponse;
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

            com.unifiedapi.unifiedto.models.operations.ListEnrichCompaniesRequest req = new ListEnrichCompaniesRequest(
                "string"){{
                domain = "dismal-cornmeal.org";
                name = "string";

            }};

            com.unifiedapi.unifiedto.models.operations.ListEnrichCompaniesResponse res = sdk.company.listEnrichCompanies(req);

            if (res.enrichCompany != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                      | Type                                                                                                                           | Required                                                                                                                       | Description                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                      | [com.unifiedapi.unifiedto.models.operations.ListEnrichCompaniesRequest](../../models/operations/ListEnrichCompaniesRequest.md) | :heavy_check_mark:                                                                                                             | The request object to use for the request.                                                                                     |


### Response

**[com.unifiedapi.unifiedto.models.operations.ListEnrichCompaniesResponse](../../models/operations/ListEnrichCompaniesResponse.md)**


## patchCrmCompany

Update a company

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PatchCrmCompanyRequest;
import com.unifiedapi.unifiedto.models.operations.PatchCrmCompanyResponse;
import com.unifiedapi.unifiedto.models.shared.CrmCompany;
import com.unifiedapi.unifiedto.models.shared.CrmEmail;
import com.unifiedapi.unifiedto.models.shared.CrmEmailType;
import com.unifiedapi.unifiedto.models.shared.CrmTelephone;
import com.unifiedapi.unifiedto.models.shared.CrmTelephoneType;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmCompanyAddress;
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

            com.unifiedapi.unifiedto.models.operations.PatchCrmCompanyRequest req = new PatchCrmCompanyRequest(
                "string",
                "string"){{
                crmCompany = new CrmCompany(
){{
                    address = new PropertyCrmCompanyAddress(
){{
                        address1 = "string";
                        address2 = "string";
                        city = "Rempelchester";
                        country = "Christmas Island";
                        countryCode = "LA";
                        postalCode = "53644";
                        region = "string";
                        regionCode = "string";

                    }};
                    createdAt = OffsetDateTime.parse("2022-01-19T16:53:30.758Z");
                    dealIds = new String[]{{
                        add("string"),
                    }};
                    description = "Diverse mission-critical project";
                    emails = new com.unifiedapi.unifiedto.models.shared.CrmEmail[]{{
                        add(new CrmEmail(
                        ){{}}),
                    }};
                    employees = 4128.78d;
                    id = "<ID>";
                    industry = "string";
                    isActive = false;
                    linkUrls = new String[]{{
                        add("string"),
                    }};
                    name = "string";
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "string");
                    }};
                    tags = new String[]{{
                        add("string"),
                    }};
                    telephones = new com.unifiedapi.unifiedto.models.shared.CrmTelephone[]{{
                        add(new CrmTelephone(
                        "string"){{
                            telephone = "string";
                        }}),
                    }};
                    timezone = "Europe/Skopje";
                    updatedAt = OffsetDateTime.parse("2022-04-08T08:19:54.922Z");
                    userId = "string";
                    websites = new String[]{{
                        add("string"),
                    }};

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.PatchCrmCompanyResponse res = sdk.company.patchCrmCompany(req);

            if (res.crmCompany != null) {
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
| `request`                                                                                                              | [com.unifiedapi.unifiedto.models.operations.PatchCrmCompanyRequest](../../models/operations/PatchCrmCompanyRequest.md) | :heavy_check_mark:                                                                                                     | The request object to use for the request.                                                                             |


### Response

**[com.unifiedapi.unifiedto.models.operations.PatchCrmCompanyResponse](../../models/operations/PatchCrmCompanyResponse.md)**


## removeCrmCompany

Remove a company

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.RemoveCrmCompanyRequest;
import com.unifiedapi.unifiedto.models.operations.RemoveCrmCompanyResponse;
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

            com.unifiedapi.unifiedto.models.operations.RemoveCrmCompanyRequest req = new RemoveCrmCompanyRequest(
                "string",
                "string");

            com.unifiedapi.unifiedto.models.operations.RemoveCrmCompanyResponse res = sdk.company.removeCrmCompany(req);

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

| Parameter                                                                                                                | Type                                                                                                                     | Required                                                                                                                 | Description                                                                                                              |
| ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                | [com.unifiedapi.unifiedto.models.operations.RemoveCrmCompanyRequest](../../models/operations/RemoveCrmCompanyRequest.md) | :heavy_check_mark:                                                                                                       | The request object to use for the request.                                                                               |


### Response

**[com.unifiedapi.unifiedto.models.operations.RemoveCrmCompanyResponse](../../models/operations/RemoveCrmCompanyResponse.md)**


## updateCrmCompany

Update a company

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.UpdateCrmCompanyRequest;
import com.unifiedapi.unifiedto.models.operations.UpdateCrmCompanyResponse;
import com.unifiedapi.unifiedto.models.shared.CrmCompany;
import com.unifiedapi.unifiedto.models.shared.CrmEmail;
import com.unifiedapi.unifiedto.models.shared.CrmEmailType;
import com.unifiedapi.unifiedto.models.shared.CrmTelephone;
import com.unifiedapi.unifiedto.models.shared.CrmTelephoneType;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmCompanyAddress;
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

            com.unifiedapi.unifiedto.models.operations.UpdateCrmCompanyRequest req = new UpdateCrmCompanyRequest(
                "string",
                "string"){{
                crmCompany = new CrmCompany(
){{
                    address = new PropertyCrmCompanyAddress(
){{
                        address1 = "string";
                        address2 = "string";
                        city = "Margeshire";
                        country = "Bahrain";
                        countryCode = "WS";
                        postalCode = "27563";
                        region = "string";
                        regionCode = "string";

                    }};
                    createdAt = OffsetDateTime.parse("2023-06-19T10:10:37.376Z");
                    dealIds = new String[]{{
                        add("string"),
                    }};
                    description = "Future-proofed zero defect instruction set";
                    emails = new com.unifiedapi.unifiedto.models.shared.CrmEmail[]{{
                        add(new CrmEmail(
                        ){{}}),
                    }};
                    employees = 1100.41d;
                    id = "<ID>";
                    industry = "string";
                    isActive = false;
                    linkUrls = new String[]{{
                        add("string"),
                    }};
                    name = "string";
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "string");
                    }};
                    tags = new String[]{{
                        add("string"),
                    }};
                    telephones = new com.unifiedapi.unifiedto.models.shared.CrmTelephone[]{{
                        add(new CrmTelephone(
                        "string"){{
                            telephone = "string";
                        }}),
                    }};
                    timezone = "Africa/Harare";
                    updatedAt = OffsetDateTime.parse("2023-09-13T13:49:01.082Z");
                    userId = "string";
                    websites = new String[]{{
                        add("string"),
                    }};

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.UpdateCrmCompanyResponse res = sdk.company.updateCrmCompany(req);

            if (res.crmCompany != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                | Type                                                                                                                     | Required                                                                                                                 | Description                                                                                                              |
| ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                | [com.unifiedapi.unifiedto.models.operations.UpdateCrmCompanyRequest](../../models/operations/UpdateCrmCompanyRequest.md) | :heavy_check_mark:                                                                                                       | The request object to use for the request.                                                                               |


### Response

**[com.unifiedapi.unifiedto.models.operations.UpdateCrmCompanyResponse](../../models/operations/UpdateCrmCompanyResponse.md)**

