# enrich

### Available Operations

* [getEnrichConnectionIdCompany](#getenrichconnectionidcompany) - Retrieve enrichment information for a company
* [getEnrichConnectionIdPerson](#getenrichconnectionidperson) - Retrieve enrichment information for a person

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

            GetEnrichConnectionIdCompanyRequest req = new GetEnrichConnectionIdCompanyRequest("laboriosam") {{
                domain = "nemo";
                name = "Latoya Emmerich";
            }};            

            GetEnrichConnectionIdCompanyResponse res = sdk.enrich.getEnrichConnectionIdCompany(req, new GetEnrichConnectionIdCompanySecurity("maxime") {{
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


## getEnrichConnectionIdPerson

Retrieve enrichment information for a person

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetEnrichConnectionIdPersonRequest;
import com.unifiedapi.unifiedto.models.operations.GetEnrichConnectionIdPersonResponse;
import com.unifiedapi.unifiedto.models.operations.GetEnrichConnectionIdPersonSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            GetEnrichConnectionIdPersonRequest req = new GetEnrichConnectionIdPersonRequest("vel") {{
                email = "Kyleigh_Weissnat@hotmail.com";
                linkedinUrl = "iusto";
                name = "Bert Hand";
                twitter = "minus";
            }};            

            GetEnrichConnectionIdPersonResponse res = sdk.enrich.getEnrichConnectionIdPerson(req, new GetEnrichConnectionIdPersonSecurity("aliquid") {{
                jwt = "";
            }});

            if (res.enrichPerson != null) {
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
| `request`                                                                                                                                        | [com.unifiedapi.unifiedto.models.operations.GetEnrichConnectionIdPersonRequest](../../models/operations/GetEnrichConnectionIdPersonRequest.md)   | :heavy_check_mark:                                                                                                                               | The request object to use for the request.                                                                                                       |
| `security`                                                                                                                                       | [com.unifiedapi.unifiedto.models.operations.GetEnrichConnectionIdPersonSecurity](../../models/operations/GetEnrichConnectionIdPersonSecurity.md) | :heavy_check_mark:                                                                                                                               | The security requirements to use for the request.                                                                                                |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetEnrichConnectionIdPersonResponse](../../models/operations/GetEnrichConnectionIdPersonResponse.md)**

