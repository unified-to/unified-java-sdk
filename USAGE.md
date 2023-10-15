<!-- Start SDK Example Usage -->


```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.CreateTicketingAgentRequest;
import com.unifiedapi.unifiedto.models.operations.CreateTicketingAgentResponse;
import com.unifiedapi.unifiedto.models.shared.PropertyTicketingAgentRaw;
import com.unifiedapi.unifiedto.models.shared.Security;
import com.unifiedapi.unifiedto.models.shared.TicketingAgent;
import com.unifiedapi.unifiedto.models.shared.TicketingEmail;
import com.unifiedapi.unifiedto.models.shared.TicketingEmailType;
import com.unifiedapi.unifiedto.models.shared.TicketingTelephone;
import com.unifiedapi.unifiedto.models.shared.TicketingTelephoneType;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("Trans"){{
                    jwt = "";
                }})
                .build();

            CreateTicketingAgentRequest req = new CreateTicketingAgentRequest("bleakly"){{
                ticketingAgent = new TicketingAgent(new PropertyTicketingAgentRaw()){{
                    createdAt = OffsetDateTime.parse("2021-04-08T12:16:35.476Z");
                    emails = new com.unifiedapi.unifiedto.models.shared.TicketingEmail[]{{
                        add(new TicketingEmail("navigating"){{
                            email = "Sierra59@hotmail.com";
                        }}),
                    }};
                    id = "<ID>";
                    name = "smoothly Algeria";
                    telephones = new com.unifiedapi.unifiedto.models.shared.TicketingTelephone[]{{
                        add(new TicketingTelephone("Africa"){{
                            telephone = "array lime";
                        }}),
                    }};
                    updatedAt = OffsetDateTime.parse("2023-10-21T20:56:48.294Z");
                }};
            }};            

            CreateTicketingAgentResponse res = sdk.agent.createTicketingAgent(req);

            if (res.ticketingAgent != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```
<!-- End SDK Example Usage -->