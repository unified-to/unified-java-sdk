# Person
(*person*)

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
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("Cisgender"){{
                    jwt = "";
                }})
                .build();

            GetEnrichConnectionIdPersonRequest req = new GetEnrichConnectionIdPersonRequest("Account"){{
                email = "Jaiden_Weimann24@gmail.com";
                linkedinUrl = "paradigms integrate Creative";
                name = "Investment";
                twitter = "Hills";
            }};            

            GetEnrichConnectionIdPersonResponse res = sdk.person.getEnrichConnectionIdPerson(req);

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

| Parameter                                                                                                                                      | Type                                                                                                                                           | Required                                                                                                                                       | Description                                                                                                                                    |
| ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                      | [com.unifiedapi.unifiedto.models.operations.GetEnrichConnectionIdPersonRequest](../../models/operations/GetEnrichConnectionIdPersonRequest.md) | :heavy_check_mark:                                                                                                                             | The request object to use for the request.                                                                                                     |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetEnrichConnectionIdPersonResponse](../../models/operations/GetEnrichConnectionIdPersonResponse.md)**

