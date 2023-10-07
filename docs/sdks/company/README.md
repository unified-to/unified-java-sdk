# Company
(*company*)

### Available Operations

* [deleteCrmConnectionIdCompanyId](#deletecrmconnectionidcompanyid) - Remove a company
* [getCrmConnectionIdCompany](#getcrmconnectionidcompany) - List all companies
* [getCrmConnectionIdCompanyId](#getcrmconnectionidcompanyid) - Retrieve a company
* [getEnrichConnectionIdCompany](#getenrichconnectionidcompany) - Retrieve enrichment information for a company
* [patchCrmConnectionIdCompanyId](#patchcrmconnectionidcompanyid) - Update a company
* [postCrmConnectionIdCompany](#postcrmconnectionidcompany) - Create a company
* [putCrmConnectionIdCompanyId](#putcrmconnectionidcompanyid) - Update a company

## deleteCrmConnectionIdCompanyId

Remove a company

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdCompanyIdRequest;
import com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdCompanyIdResponse;
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("portal"){{
                    jwt = "";
                }})
                .build();

            DeleteCrmConnectionIdCompanyIdRequest req = new DeleteCrmConnectionIdCompanyIdRequest("granular", "Salad");            

            DeleteCrmConnectionIdCompanyIdResponse res = sdk.company.deleteCrmConnectionIdCompanyId(req);

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
| `request`                                                                                                                                            | [com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdCompanyIdRequest](../../models/operations/DeleteCrmConnectionIdCompanyIdRequest.md) | :heavy_check_mark:                                                                                                                                   | The request object to use for the request.                                                                                                           |


### Response

**[com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdCompanyIdResponse](../../models/operations/DeleteCrmConnectionIdCompanyIdResponse.md)**


## getCrmConnectionIdCompany

List all companies

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdCompanyRequest;
import com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdCompanyResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("Northeast"){{
                    jwt = "";
                }})
                .build();

            GetCrmConnectionIdCompanyRequest req = new GetCrmConnectionIdCompanyRequest("withdrawal"){{
                contactId = "blue synthesize Bronze";
                dealId = "Gasoline";
                limit = 9098.32d;
                offset = 3330.24d;
                order = "juxtapose invoice";
                query = "Luxembourg yellow";
                sort = "generate Forward";
                updatedGte = OffsetDateTime.parse("2022-03-23T08:07:05.969Z");
            }};            

            GetCrmConnectionIdCompanyResponse res = sdk.company.getCrmConnectionIdCompany(req);

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

| Parameter                                                                                                                                  | Type                                                                                                                                       | Required                                                                                                                                   | Description                                                                                                                                |
| ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                  | [com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdCompanyRequest](../../models/operations/GetCrmConnectionIdCompanyRequest.md) | :heavy_check_mark:                                                                                                                         | The request object to use for the request.                                                                                                 |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdCompanyResponse](../../models/operations/GetCrmConnectionIdCompanyResponse.md)**


## getCrmConnectionIdCompanyId

Retrieve a company

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdCompanyIdRequest;
import com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdCompanyIdResponse;
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("Ergonomic"){{
                    jwt = "";
                }})
                .build();

            GetCrmConnectionIdCompanyIdRequest req = new GetCrmConnectionIdCompanyIdRequest("Data", "boo");            

            GetCrmConnectionIdCompanyIdResponse res = sdk.company.getCrmConnectionIdCompanyId(req);

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

| Parameter                                                                                                                                      | Type                                                                                                                                           | Required                                                                                                                                       | Description                                                                                                                                    |
| ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                      | [com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdCompanyIdRequest](../../models/operations/GetCrmConnectionIdCompanyIdRequest.md) | :heavy_check_mark:                                                                                                                             | The request object to use for the request.                                                                                                     |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdCompanyIdResponse](../../models/operations/GetCrmConnectionIdCompanyIdResponse.md)**


## getEnrichConnectionIdCompany

Retrieve enrichment information for a company

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetEnrichConnectionIdCompanyRequest;
import com.unifiedapi.unifiedto.models.operations.GetEnrichConnectionIdCompanyResponse;
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("refresh"){{
                    jwt = "";
                }})
                .build();

            GetEnrichConnectionIdCompanyRequest req = new GetEnrichConnectionIdCompanyRequest("Costa"){{
                domain = "precious-legislation.net";
                name = "gold";
            }};            

            GetEnrichConnectionIdCompanyResponse res = sdk.company.getEnrichConnectionIdCompany(req);

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

| Parameter                                                                                                                                        | Type                                                                                                                                             | Required                                                                                                                                         | Description                                                                                                                                      |
| ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                        | [com.unifiedapi.unifiedto.models.operations.GetEnrichConnectionIdCompanyRequest](../../models/operations/GetEnrichConnectionIdCompanyRequest.md) | :heavy_check_mark:                                                                                                                               | The request object to use for the request.                                                                                                       |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetEnrichConnectionIdCompanyResponse](../../models/operations/GetEnrichConnectionIdCompanyResponse.md)**


## patchCrmConnectionIdCompanyId

Update a company

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdCompanyIdRequest;
import com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdCompanyIdResponse;
import com.unifiedapi.unifiedto.models.shared.CrmCompany;
import com.unifiedapi.unifiedto.models.shared.CrmEmail;
import com.unifiedapi.unifiedto.models.shared.CrmEmailType;
import com.unifiedapi.unifiedto.models.shared.CrmTelephone;
import com.unifiedapi.unifiedto.models.shared.CrmTelephoneType;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmCompanyAddress;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmCompanyRaw;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("Soft"){{
                    jwt = "";
                }})
                .build();

            PatchCrmConnectionIdCompanyIdRequest req = new PatchCrmConnectionIdCompanyIdRequest("invoice", "Synergized"){{
                crmCompany = new CrmCompany(){{
                    active = false;
                    address = new PropertyCrmCompanyAddress(){{
                        address1 = "Quality redefine";
                        address2 = "invoice National";
                        city = "Feilport";
                        country = "Switzerland";
                        countryCode = "SZ";
                        postalCode = "82050-3091";
                        region = "Vermont Astatine";
                        regionCode = "whoa female";
                    }};
                    createdAt = OffsetDateTime.parse("2021-11-05T19:33:29.059Z");
                    dealIds = new String[]{{
                        add("Representative"),
                    }};
                    emails = new com.unifiedapi.unifiedto.models.shared.CrmEmail[]{{
                        add(new CrmEmail(){{}}),
                    }};
                    id = "<ID>";
                    name = "Cheese";
                    raw = new PropertyCrmCompanyRaw();
                    tags = new String[]{{
                        add("Hat"),
                    }};
                    telephones = new com.unifiedapi.unifiedto.models.shared.CrmTelephone[]{{
                        add(new CrmTelephone("navigate"){{
                            telephone = "Ville stacking";
                        }}),
                    }};
                    updatedAt = OffsetDateTime.parse("2021-10-02T21:01:43.582Z");
                    websites = new String[]{{
                        add("transmit"),
                    }};
                }};
            }};            

            PatchCrmConnectionIdCompanyIdResponse res = sdk.company.patchCrmConnectionIdCompanyId(req);

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

| Parameter                                                                                                                                          | Type                                                                                                                                               | Required                                                                                                                                           | Description                                                                                                                                        |
| -------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                          | [com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdCompanyIdRequest](../../models/operations/PatchCrmConnectionIdCompanyIdRequest.md) | :heavy_check_mark:                                                                                                                                 | The request object to use for the request.                                                                                                         |


### Response

**[com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdCompanyIdResponse](../../models/operations/PatchCrmConnectionIdCompanyIdResponse.md)**


## postCrmConnectionIdCompany

Create a company

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PostCrmConnectionIdCompanyRequest;
import com.unifiedapi.unifiedto.models.operations.PostCrmConnectionIdCompanyResponse;
import com.unifiedapi.unifiedto.models.shared.CrmCompany;
import com.unifiedapi.unifiedto.models.shared.CrmEmail;
import com.unifiedapi.unifiedto.models.shared.CrmEmailType;
import com.unifiedapi.unifiedto.models.shared.CrmTelephone;
import com.unifiedapi.unifiedto.models.shared.CrmTelephoneType;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmCompanyAddress;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmCompanyRaw;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("Personal"){{
                    jwt = "";
                }})
                .build();

            PostCrmConnectionIdCompanyRequest req = new PostCrmConnectionIdCompanyRequest("gosh"){{
                crmCompany = new CrmCompany(){{
                    active = false;
                    address = new PropertyCrmCompanyAddress(){{
                        address1 = "phooey";
                        address2 = "Bedfordshire neural";
                        city = "Port Victoria";
                        country = "Kenya";
                        countryCode = "NF";
                        postalCode = "77670";
                        region = "male";
                        regionCode = "utilisation Bronze";
                    }};
                    createdAt = OffsetDateTime.parse("2023-07-06T10:14:02.898Z");
                    dealIds = new String[]{{
                        add("connect"),
                    }};
                    emails = new com.unifiedapi.unifiedto.models.shared.CrmEmail[]{{
                        add(new CrmEmail(){{}}),
                    }};
                    id = "<ID>";
                    name = "Executive Luxurious";
                    raw = new PropertyCrmCompanyRaw();
                    tags = new String[]{{
                        add("Wooden"),
                    }};
                    telephones = new com.unifiedapi.unifiedto.models.shared.CrmTelephone[]{{
                        add(new CrmTelephone("invoice"){{
                            telephone = "violet Account";
                        }}),
                    }};
                    updatedAt = OffsetDateTime.parse("2023-09-28T22:11:10.763Z");
                    websites = new String[]{{
                        add("Fantastic"),
                    }};
                }};
            }};            

            PostCrmConnectionIdCompanyResponse res = sdk.company.postCrmConnectionIdCompany(req);

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

| Parameter                                                                                                                                    | Type                                                                                                                                         | Required                                                                                                                                     | Description                                                                                                                                  |
| -------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                    | [com.unifiedapi.unifiedto.models.operations.PostCrmConnectionIdCompanyRequest](../../models/operations/PostCrmConnectionIdCompanyRequest.md) | :heavy_check_mark:                                                                                                                           | The request object to use for the request.                                                                                                   |


### Response

**[com.unifiedapi.unifiedto.models.operations.PostCrmConnectionIdCompanyResponse](../../models/operations/PostCrmConnectionIdCompanyResponse.md)**


## putCrmConnectionIdCompanyId

Update a company

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdCompanyIdRequest;
import com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdCompanyIdResponse;
import com.unifiedapi.unifiedto.models.shared.CrmCompany;
import com.unifiedapi.unifiedto.models.shared.CrmEmail;
import com.unifiedapi.unifiedto.models.shared.CrmEmailType;
import com.unifiedapi.unifiedto.models.shared.CrmTelephone;
import com.unifiedapi.unifiedto.models.shared.CrmTelephoneType;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmCompanyAddress;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmCompanyRaw;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("dicta"){{
                    jwt = "";
                }})
                .build();

            PutCrmConnectionIdCompanyIdRequest req = new PutCrmConnectionIdCompanyIdRequest("background", "Malaysian"){{
                crmCompany = new CrmCompany(){{
                    active = false;
                    address = new PropertyCrmCompanyAddress(){{
                        address1 = "Diesel bitterly";
                        address2 = "red overriding uniform";
                        city = "Robertsburgh";
                        country = "Nicaragua";
                        countryCode = "FO";
                        postalCode = "93827";
                        region = "trigger North";
                        regionCode = "invoice briefly";
                    }};
                    createdAt = OffsetDateTime.parse("2023-11-09T10:26:12.787Z");
                    dealIds = new String[]{{
                        add("magenta"),
                    }};
                    emails = new com.unifiedapi.unifiedto.models.shared.CrmEmail[]{{
                        add(new CrmEmail(){{}}),
                    }};
                    id = "<ID>";
                    name = "yippee programming";
                    raw = new PropertyCrmCompanyRaw();
                    tags = new String[]{{
                        add("architecture"),
                    }};
                    telephones = new com.unifiedapi.unifiedto.models.shared.CrmTelephone[]{{
                        add(new CrmTelephone("farad"){{
                            telephone = "East EXE lavender";
                        }}),
                    }};
                    updatedAt = OffsetDateTime.parse("2022-02-21T09:41:36.696Z");
                    websites = new String[]{{
                        add("Keyboard"),
                    }};
                }};
            }};            

            PutCrmConnectionIdCompanyIdResponse res = sdk.company.putCrmConnectionIdCompanyId(req);

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

| Parameter                                                                                                                                      | Type                                                                                                                                           | Required                                                                                                                                       | Description                                                                                                                                    |
| ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                      | [com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdCompanyIdRequest](../../models/operations/PutCrmConnectionIdCompanyIdRequest.md) | :heavy_check_mark:                                                                                                                             | The request object to use for the request.                                                                                                     |


### Response

**[com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdCompanyIdResponse](../../models/operations/PutCrmConnectionIdCompanyIdResponse.md)**

