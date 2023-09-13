<!-- Start SDK Example Usage -->


```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.DeleteTicketingConnectionIdAgentIdRequest;
import com.unifiedapi.unifiedto.models.operations.DeleteTicketingConnectionIdAgentIdResponse;
import com.unifiedapi.unifiedto.models.operations.DeleteTicketingConnectionIdAgentIdSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            DeleteTicketingConnectionIdAgentIdRequest req = new DeleteTicketingConnectionIdAgentIdRequest("corrupti", "provident");            

            DeleteTicketingConnectionIdAgentIdResponse res = sdk.agent.deleteTicketingConnectionIdAgentId(req, new DeleteTicketingConnectionIdAgentIdSecurity("distinctio") {{
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
<!-- End SDK Example Usage -->