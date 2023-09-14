# company

### Available Operations

* [deleteCrmConnectionIdCompanyId](#deletecrmconnectionidcompanyid) - Remove a company
* [deleteCrmConnectionIdCompanyIdDealDealId](#deletecrmconnectionidcompanyiddealdealid) - Remove deal association from a company
* [getCrmConnectionIdCompany](#getcrmconnectionidcompany) - List all companies
* [getCrmConnectionIdCompanyId](#getcrmconnectionidcompanyid) - Retrieve a company
* [getEnrichConnectionIdCompany](#getenrichconnectionidcompany) - Retrieve enrichment information for a company
* [patchCrmConnectionIdCompanyId](#patchcrmconnectionidcompanyid) - Update a company
* [patchCrmConnectionIdCompanyIdDealDealId](#patchcrmconnectionidcompanyiddealdealid) - Associate a deal with a company
* [postCrmConnectionIdCompany](#postcrmconnectionidcompany) - Create a company
* [putCrmConnectionIdCompanyId](#putcrmconnectionidcompanyid) - Update a company
* [putCrmConnectionIdCompanyIdDealDealId](#putcrmconnectionidcompanyiddealdealid) - Associate a deal with a company

## deleteCrmConnectionIdCompanyId

Remove a company

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdCompanyIdRequest;
import com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdCompanyIdResponse;
import com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdCompanyIdSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            DeleteCrmConnectionIdCompanyIdRequest req = new DeleteCrmConnectionIdCompanyIdRequest("vero", "excepturi");            

            DeleteCrmConnectionIdCompanyIdResponse res = sdk.company.deleteCrmConnectionIdCompanyId(req, new DeleteCrmConnectionIdCompanyIdSecurity("eum") {{
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
| `request`                                                                                                                                              | [com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdCompanyIdRequest](../../models/operations/DeleteCrmConnectionIdCompanyIdRequest.md)   | :heavy_check_mark:                                                                                                                                     | The request object to use for the request.                                                                                                             |
| `security`                                                                                                                                             | [com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdCompanyIdSecurity](../../models/operations/DeleteCrmConnectionIdCompanyIdSecurity.md) | :heavy_check_mark:                                                                                                                                     | The security requirements to use for the request.                                                                                                      |


### Response

**[com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdCompanyIdResponse](../../models/operations/DeleteCrmConnectionIdCompanyIdResponse.md)**


## deleteCrmConnectionIdCompanyIdDealDealId

Remove deal association from a company

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdCompanyIdDealDealIdRequest;
import com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdCompanyIdDealDealIdResponse;
import com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdCompanyIdDealDealIdSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            DeleteCrmConnectionIdCompanyIdDealDealIdRequest req = new DeleteCrmConnectionIdCompanyIdDealDealIdRequest("velit", "ut", "perspiciatis");            

            DeleteCrmConnectionIdCompanyIdDealDealIdResponse res = sdk.company.deleteCrmConnectionIdCompanyIdDealDealId(req, new DeleteCrmConnectionIdCompanyIdDealDealIdSecurity("earum") {{
                jwt = "";
            }});

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

| Parameter                                                                                                                                                                  | Type                                                                                                                                                                       | Required                                                                                                                                                                   | Description                                                                                                                                                                |
| -------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                                  | [com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdCompanyIdDealDealIdRequest](../../models/operations/DeleteCrmConnectionIdCompanyIdDealDealIdRequest.md)   | :heavy_check_mark:                                                                                                                                                         | The request object to use for the request.                                                                                                                                 |
| `security`                                                                                                                                                                 | [com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdCompanyIdDealDealIdSecurity](../../models/operations/DeleteCrmConnectionIdCompanyIdDealDealIdSecurity.md) | :heavy_check_mark:                                                                                                                                                         | The security requirements to use for the request.                                                                                                                          |


### Response

**[com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdCompanyIdDealDealIdResponse](../../models/operations/DeleteCrmConnectionIdCompanyIdDealDealIdResponse.md)**


## getCrmConnectionIdCompany

List all companies

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdCompanyRequest;
import com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdCompanyResponse;
import com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdCompanySecurity;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            GetCrmConnectionIdCompanyRequest req = new GetCrmConnectionIdCompanyRequest("dicta") {{
                contactId = "impedit";
                dealId = "voluptatibus";
                limit = 6109.87d;
                offset = 9325.62d;
                order = "alias";
                query = "nisi";
                sort = "itaque";
                updatedGte = OffsetDateTime.parse("2022-04-30T01:11:05.137Z");
            }};            

            GetCrmConnectionIdCompanyResponse res = sdk.company.getCrmConnectionIdCompany(req, new GetCrmConnectionIdCompanySecurity("non") {{
                jwt = "";
            }});

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

| Parameter                                                                                                                                    | Type                                                                                                                                         | Required                                                                                                                                     | Description                                                                                                                                  |
| -------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                    | [com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdCompanyRequest](../../models/operations/GetCrmConnectionIdCompanyRequest.md)   | :heavy_check_mark:                                                                                                                           | The request object to use for the request.                                                                                                   |
| `security`                                                                                                                                   | [com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdCompanySecurity](../../models/operations/GetCrmConnectionIdCompanySecurity.md) | :heavy_check_mark:                                                                                                                           | The security requirements to use for the request.                                                                                            |


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
import com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdCompanyIdSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            GetCrmConnectionIdCompanyIdRequest req = new GetCrmConnectionIdCompanyIdRequest("dolor", "iusto");            

            GetCrmConnectionIdCompanyIdResponse res = sdk.company.getCrmConnectionIdCompanyId(req, new GetCrmConnectionIdCompanyIdSecurity("sit") {{
                jwt = "";
            }});

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

| Parameter                                                                                                                                        | Type                                                                                                                                             | Required                                                                                                                                         | Description                                                                                                                                      |
| ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                        | [com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdCompanyIdRequest](../../models/operations/GetCrmConnectionIdCompanyIdRequest.md)   | :heavy_check_mark:                                                                                                                               | The request object to use for the request.                                                                                                       |
| `security`                                                                                                                                       | [com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdCompanyIdSecurity](../../models/operations/GetCrmConnectionIdCompanyIdSecurity.md) | :heavy_check_mark:                                                                                                                               | The security requirements to use for the request.                                                                                                |


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
import com.unifiedapi.unifiedto.models.operations.GetEnrichConnectionIdCompanySecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            GetEnrichConnectionIdCompanyRequest req = new GetEnrichConnectionIdCompanyRequest("doloremque") {{
                domain = "consequatur";
                name = "Clay Jast";
            }};            

            GetEnrichConnectionIdCompanyResponse res = sdk.company.getEnrichConnectionIdCompany(req, new GetEnrichConnectionIdCompanySecurity("facilis") {{
                jwt = "";
            }});

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

| Parameter                                                                                                                                          | Type                                                                                                                                               | Required                                                                                                                                           | Description                                                                                                                                        |
| -------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                          | [com.unifiedapi.unifiedto.models.operations.GetEnrichConnectionIdCompanyRequest](../../models/operations/GetEnrichConnectionIdCompanyRequest.md)   | :heavy_check_mark:                                                                                                                                 | The request object to use for the request.                                                                                                         |
| `security`                                                                                                                                         | [com.unifiedapi.unifiedto.models.operations.GetEnrichConnectionIdCompanySecurity](../../models/operations/GetEnrichConnectionIdCompanySecurity.md) | :heavy_check_mark:                                                                                                                                 | The security requirements to use for the request.                                                                                                  |


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
import com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdCompanyIdSecurity;
import com.unifiedapi.unifiedto.models.shared.CrmCompany;
import com.unifiedapi.unifiedto.models.shared.CrmEmail;
import com.unifiedapi.unifiedto.models.shared.CrmEmailType;
import com.unifiedapi.unifiedto.models.shared.CrmTelephone;
import com.unifiedapi.unifiedto.models.shared.CrmTelephoneType;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmCompanyAddress;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmCompanyRaw;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            PatchCrmConnectionIdCompanyIdRequest req = new PatchCrmConnectionIdCompanyIdRequest("placeat", "perspiciatis") {{
                crmCompany = new CrmCompany() {{
                    active = false;
                    address = new PropertyCrmCompanyAddress() {{
                        address1 = "expedita";
                        address2 = "deleniti";
                        city = "Kissimmee";
                        country = "Guam";
                        countryCode = "MQ";
                        postalCode = "67336-6420";
                        region = "vero";
                        regionCode = "consectetur";
                    }};;
                    createdAt = OffsetDateTime.parse("2022-12-02T07:11:00.455Z");
                    dealIds = new String[]{{
                        add("dolorem"),
                    }};
                    emails = new com.unifiedapi.unifiedto.models.shared.CrmEmail[]{{
                        add(new CrmEmail() {{
                            email = "Christa.Moore@gmail.com";
                            type = CrmEmailType.OTHER;
                        }}),
                    }};
                    id = "b8a72026-1143-45e1-b9db-c2259b1abda8";
                    name = "Dr. Paul Kris Jr.";
                    raw = new PropertyCrmCompanyRaw();;
                    tags = new String[]{{
                        add("totam"),
                    }};
                    telephones = new com.unifiedapi.unifiedto.models.shared.CrmTelephone[]{{
                        add(new CrmTelephone("distinctio") {{
                            telephone = "dolore";
                            type = CrmTelephoneType.FAX;
                        }}),
                    }};
                    updatedAt = OffsetDateTime.parse("2022-08-01T09:21:47.394Z");
                    websites = new String[]{{
                        add("esse"),
                    }};
                }};;
            }};            

            PatchCrmConnectionIdCompanyIdResponse res = sdk.company.patchCrmConnectionIdCompanyId(req, new PatchCrmConnectionIdCompanyIdSecurity("dolores") {{
                jwt = "";
            }});

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

| Parameter                                                                                                                                            | Type                                                                                                                                                 | Required                                                                                                                                             | Description                                                                                                                                          |
| ---------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                            | [com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdCompanyIdRequest](../../models/operations/PatchCrmConnectionIdCompanyIdRequest.md)   | :heavy_check_mark:                                                                                                                                   | The request object to use for the request.                                                                                                           |
| `security`                                                                                                                                           | [com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdCompanyIdSecurity](../../models/operations/PatchCrmConnectionIdCompanyIdSecurity.md) | :heavy_check_mark:                                                                                                                                   | The security requirements to use for the request.                                                                                                    |


### Response

**[com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdCompanyIdResponse](../../models/operations/PatchCrmConnectionIdCompanyIdResponse.md)**


## patchCrmConnectionIdCompanyIdDealDealId

Associate a deal with a company

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdCompanyIdDealDealIdRequest;
import com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdCompanyIdDealDealIdResponse;
import com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdCompanyIdDealDealIdSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            PatchCrmConnectionIdCompanyIdDealDealIdRequest req = new PatchCrmConnectionIdCompanyIdDealDealIdRequest("assumenda", "beatae", "est");            

            PatchCrmConnectionIdCompanyIdDealDealIdResponse res = sdk.company.patchCrmConnectionIdCompanyIdDealDealId(req, new PatchCrmConnectionIdCompanyIdDealDealIdSecurity("facere") {{
                jwt = "";
            }});

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

| Parameter                                                                                                                                                                | Type                                                                                                                                                                     | Required                                                                                                                                                                 | Description                                                                                                                                                              |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                | [com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdCompanyIdDealDealIdRequest](../../models/operations/PatchCrmConnectionIdCompanyIdDealDealIdRequest.md)   | :heavy_check_mark:                                                                                                                                                       | The request object to use for the request.                                                                                                                               |
| `security`                                                                                                                                                               | [com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdCompanyIdDealDealIdSecurity](../../models/operations/PatchCrmConnectionIdCompanyIdDealDealIdSecurity.md) | :heavy_check_mark:                                                                                                                                                       | The security requirements to use for the request.                                                                                                                        |


### Response

**[com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdCompanyIdDealDealIdResponse](../../models/operations/PatchCrmConnectionIdCompanyIdDealDealIdResponse.md)**


## postCrmConnectionIdCompany

Create a company

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PostCrmConnectionIdCompanyRequest;
import com.unifiedapi.unifiedto.models.operations.PostCrmConnectionIdCompanyResponse;
import com.unifiedapi.unifiedto.models.operations.PostCrmConnectionIdCompanySecurity;
import com.unifiedapi.unifiedto.models.shared.CrmCompany;
import com.unifiedapi.unifiedto.models.shared.CrmEmail;
import com.unifiedapi.unifiedto.models.shared.CrmEmailType;
import com.unifiedapi.unifiedto.models.shared.CrmTelephone;
import com.unifiedapi.unifiedto.models.shared.CrmTelephoneType;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmCompanyAddress;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmCompanyRaw;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            PostCrmConnectionIdCompanyRequest req = new PostCrmConnectionIdCompanyRequest("corrupti") {{
                crmCompany = new CrmCompany() {{
                    active = false;
                    address = new PropertyCrmCompanyAddress() {{
                        address1 = "molestiae";
                        address2 = "provident";
                        city = "Thousand Oaks";
                        country = "Romania";
                        countryCode = "MK";
                        postalCode = "43753";
                        region = "officiis";
                        regionCode = "voluptatibus";
                    }};;
                    createdAt = OffsetDateTime.parse("2021-04-04T05:15:35.912Z");
                    dealIds = new String[]{{
                        add("alias"),
                    }};
                    emails = new com.unifiedapi.unifiedto.models.shared.CrmEmail[]{{
                        add(new CrmEmail() {{
                            email = "Mattie.Paucek71@gmail.com";
                            type = CrmEmailType.OTHER;
                        }}),
                    }};
                    id = "2d782259-e3ea-44b5-997f-92443da7ce52";
                    name = "Jaime McGlynn";
                    raw = new PropertyCrmCompanyRaw();;
                    tags = new String[]{{
                        add("enim"),
                    }};
                    telephones = new com.unifiedapi.unifiedto.models.shared.CrmTelephone[]{{
                        add(new CrmTelephone("minus") {{
                            telephone = "neque";
                            type = CrmTelephoneType.OTHER;
                        }}),
                    }};
                    updatedAt = OffsetDateTime.parse("2022-09-25T18:15:59.555Z");
                    websites = new String[]{{
                        add("corporis"),
                    }};
                }};;
            }};            

            PostCrmConnectionIdCompanyResponse res = sdk.company.postCrmConnectionIdCompany(req, new PostCrmConnectionIdCompanySecurity("magnam") {{
                jwt = "";
            }});

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
| `request`                                                                                                                                      | [com.unifiedapi.unifiedto.models.operations.PostCrmConnectionIdCompanyRequest](../../models/operations/PostCrmConnectionIdCompanyRequest.md)   | :heavy_check_mark:                                                                                                                             | The request object to use for the request.                                                                                                     |
| `security`                                                                                                                                     | [com.unifiedapi.unifiedto.models.operations.PostCrmConnectionIdCompanySecurity](../../models/operations/PostCrmConnectionIdCompanySecurity.md) | :heavy_check_mark:                                                                                                                             | The security requirements to use for the request.                                                                                              |


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
import com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdCompanyIdSecurity;
import com.unifiedapi.unifiedto.models.shared.CrmCompany;
import com.unifiedapi.unifiedto.models.shared.CrmEmail;
import com.unifiedapi.unifiedto.models.shared.CrmEmailType;
import com.unifiedapi.unifiedto.models.shared.CrmTelephone;
import com.unifiedapi.unifiedto.models.shared.CrmTelephoneType;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmCompanyAddress;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmCompanyRaw;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            PutCrmConnectionIdCompanyIdRequest req = new PutCrmConnectionIdCompanyIdRequest("voluptates", "maiores") {{
                crmCompany = new CrmCompany() {{
                    active = false;
                    address = new PropertyCrmCompanyAddress() {{
                        address1 = "tempore";
                        address2 = "aperiam";
                        city = "Dickensboro";
                        country = "Macedonia";
                        countryCode = "MK";
                        postalCode = "72763";
                        region = "est";
                        regionCode = "impedit";
                    }};;
                    createdAt = OffsetDateTime.parse("2020-10-17T04:42:29.949Z");
                    dealIds = new String[]{{
                        add("vero"),
                    }};
                    emails = new com.unifiedapi.unifiedto.models.shared.CrmEmail[]{{
                        add(new CrmEmail() {{
                            email = "Zita.Streich@gmail.com";
                            type = CrmEmailType.WORK;
                        }}),
                    }};
                    id = "75779291-77de-4ac6-86ec-b573409e3eb1";
                    name = "Leo Okuneva";
                    raw = new PropertyCrmCompanyRaw();;
                    tags = new String[]{{
                        add("dicta"),
                    }};
                    telephones = new com.unifiedapi.unifiedto.models.shared.CrmTelephone[]{{
                        add(new CrmTelephone("nobis") {{
                            telephone = "consequuntur";
                            type = CrmTelephoneType.MOBILE;
                        }}),
                    }};
                    updatedAt = OffsetDateTime.parse("2022-07-03T11:09:14.391Z");
                    websites = new String[]{{
                        add("maiores"),
                    }};
                }};;
            }};            

            PutCrmConnectionIdCompanyIdResponse res = sdk.company.putCrmConnectionIdCompanyId(req, new PutCrmConnectionIdCompanyIdSecurity("veritatis") {{
                jwt = "";
            }});

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

| Parameter                                                                                                                                        | Type                                                                                                                                             | Required                                                                                                                                         | Description                                                                                                                                      |
| ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                        | [com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdCompanyIdRequest](../../models/operations/PutCrmConnectionIdCompanyIdRequest.md)   | :heavy_check_mark:                                                                                                                               | The request object to use for the request.                                                                                                       |
| `security`                                                                                                                                       | [com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdCompanyIdSecurity](../../models/operations/PutCrmConnectionIdCompanyIdSecurity.md) | :heavy_check_mark:                                                                                                                               | The security requirements to use for the request.                                                                                                |


### Response

**[com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdCompanyIdResponse](../../models/operations/PutCrmConnectionIdCompanyIdResponse.md)**


## putCrmConnectionIdCompanyIdDealDealId

Associate a deal with a company

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdCompanyIdDealDealIdRequest;
import com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdCompanyIdDealDealIdResponse;
import com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdCompanyIdDealDealIdSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            PutCrmConnectionIdCompanyIdDealDealIdRequest req = new PutCrmConnectionIdCompanyIdDealDealIdRequest("quasi", "laboriosam", "pariatur");            

            PutCrmConnectionIdCompanyIdDealDealIdResponse res = sdk.company.putCrmConnectionIdCompanyIdDealDealId(req, new PutCrmConnectionIdCompanyIdDealDealIdSecurity("libero") {{
                jwt = "";
            }});

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

| Parameter                                                                                                                                                            | Type                                                                                                                                                                 | Required                                                                                                                                                             | Description                                                                                                                                                          |
| -------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                            | [com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdCompanyIdDealDealIdRequest](../../models/operations/PutCrmConnectionIdCompanyIdDealDealIdRequest.md)   | :heavy_check_mark:                                                                                                                                                   | The request object to use for the request.                                                                                                                           |
| `security`                                                                                                                                                           | [com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdCompanyIdDealDealIdSecurity](../../models/operations/PutCrmConnectionIdCompanyIdDealDealIdSecurity.md) | :heavy_check_mark:                                                                                                                                                   | The security requirements to use for the request.                                                                                                                    |


### Response

**[com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdCompanyIdDealDealIdResponse](../../models/operations/PutCrmConnectionIdCompanyIdDealDealIdResponse.md)**

