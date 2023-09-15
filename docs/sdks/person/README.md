# Person

### Available Operations

* [getEnrichConnectionIdPerson](#getenrichconnectionidperson) - Retrieve enrichment information for a person

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

            GetEnrichConnectionIdPersonRequest req = new GetEnrichConnectionIdPersonRequest("nobis") {{
                email = "Lillian70@yahoo.com";
                linkedinUrl = "atque";
                name = "Joshua Padberg";
                twitter = "maiores";
            }};            

            GetEnrichConnectionIdPersonResponse res = sdk.person.getEnrichConnectionIdPerson(req, new GetEnrichConnectionIdPersonSecurity("ea") {{
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

