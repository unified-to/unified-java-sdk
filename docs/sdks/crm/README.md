# Crm
(*crm*)

### Available Operations

* [deleteCrmConnectionIdCompanyId](#deletecrmconnectionidcompanyid) - Remove a company
* [deleteCrmConnectionIdContactId](#deletecrmconnectionidcontactid) - Remove a contact
* [deleteCrmConnectionIdDealId](#deletecrmconnectioniddealid) - Remove a deal
* [deleteCrmConnectionIdEventId](#deletecrmconnectionideventid) - Remove a event
* [deleteCrmConnectionIdFileId](#deletecrmconnectionidfileid) - Remove a file
* [deleteCrmConnectionIdLeadId](#deletecrmconnectionidleadid) - Remove a lead
* [deleteCrmConnectionIdPipelineId](#deletecrmconnectionidpipelineid) - Remove a pipeline
* [deleteCrmConnectionIdTeamId](#deletecrmconnectionidteamid) - Remove a team
* [deleteCrmConnectionIdUserId](#deletecrmconnectioniduserid) - Remove a user
* [getCrmConnectionIdCompany](#getcrmconnectionidcompany) - List all companies
* [getCrmConnectionIdCompanyId](#getcrmconnectionidcompanyid) - Retrieve a company
* [getCrmConnectionIdContact](#getcrmconnectionidcontact) - List all contacts
* [getCrmConnectionIdContactId](#getcrmconnectionidcontactid) - Retrieve a contact
* [getCrmConnectionIdDeal](#getcrmconnectioniddeal) - List all deals
* [getCrmConnectionIdDealId](#getcrmconnectioniddealid) - Retrieve a deal
* [getCrmConnectionIdEvent](#getcrmconnectionidevent) - List all events
* [getCrmConnectionIdEventId](#getcrmconnectionideventid) - Retrieve a event
* [getCrmConnectionIdFile](#getcrmconnectionidfile) - List all files
* [getCrmConnectionIdFileId](#getcrmconnectionidfileid) - Retrieve a file
* [getCrmConnectionIdLead](#getcrmconnectionidlead) - List all leads
* [getCrmConnectionIdLeadId](#getcrmconnectionidleadid) - Retrieve a lead
* [getCrmConnectionIdPipeline](#getcrmconnectionidpipeline) - List all pipelines
* [getCrmConnectionIdPipelineId](#getcrmconnectionidpipelineid) - Retrieve a pipeline
* [getCrmConnectionIdTeam](#getcrmconnectionidteam) - List all teams
* [getCrmConnectionIdTeamId](#getcrmconnectionidteamid) - Retrieve a team
* [getCrmConnectionIdUser](#getcrmconnectioniduser) - List all users
* [getCrmConnectionIdUserId](#getcrmconnectioniduserid) - Retrieve a user
* [patchCrmConnectionIdCompanyId](#patchcrmconnectionidcompanyid) - Update a company
* [patchCrmConnectionIdContactId](#patchcrmconnectionidcontactid) - Update a contact
* [patchCrmConnectionIdDealId](#patchcrmconnectioniddealid) - Update a deal
* [patchCrmConnectionIdEventId](#patchcrmconnectionideventid) - Update a event
* [patchCrmConnectionIdFileId](#patchcrmconnectionidfileid) - Update a file
* [patchCrmConnectionIdLeadId](#patchcrmconnectionidleadid) - Update a lead
* [patchCrmConnectionIdPipelineId](#patchcrmconnectionidpipelineid) - Update a pipeline
* [patchCrmConnectionIdTeamId](#patchcrmconnectionidteamid) - Update a team
* [patchCrmConnectionIdUserId](#patchcrmconnectioniduserid) - Update a user
* [postCrmConnectionIdCompany](#postcrmconnectionidcompany) - Create a company
* [postCrmConnectionIdContact](#postcrmconnectionidcontact) - Create a contact
* [postCrmConnectionIdDeal](#postcrmconnectioniddeal) - Create a deal
* [postCrmConnectionIdEvent](#postcrmconnectionidevent) - Create a event
* [postCrmConnectionIdFile](#postcrmconnectionidfile) - Create a file
* [postCrmConnectionIdLead](#postcrmconnectionidlead) - Create a lead
* [postCrmConnectionIdPipeline](#postcrmconnectionidpipeline) - Create a pipeline
* [postCrmConnectionIdTeam](#postcrmconnectionidteam) - Create a team
* [postCrmConnectionIdUser](#postcrmconnectioniduser) - Create a user
* [putCrmConnectionIdCompanyId](#putcrmconnectionidcompanyid) - Update a company
* [putCrmConnectionIdContactId](#putcrmconnectionidcontactid) - Update a contact
* [putCrmConnectionIdDealId](#putcrmconnectioniddealid) - Update a deal
* [putCrmConnectionIdEventId](#putcrmconnectionideventid) - Update a event
* [putCrmConnectionIdFileId](#putcrmconnectionidfileid) - Update a file
* [putCrmConnectionIdLeadId](#putcrmconnectionidleadid) - Update a lead
* [putCrmConnectionIdPipelineId](#putcrmconnectionidpipelineid) - Update a pipeline
* [putCrmConnectionIdTeamId](#putcrmconnectionidteamid) - Update a team
* [putCrmConnectionIdUserId](#putcrmconnectioniduserid) - Update a user

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
                .setSecurity(new Security("portal") {{
                    jwt = "";
                }})
                .build();

            DeleteCrmConnectionIdCompanyIdRequest req = new DeleteCrmConnectionIdCompanyIdRequest("granular", "Salad");            

            DeleteCrmConnectionIdCompanyIdResponse res = sdk.crm.deleteCrmConnectionIdCompanyId(req);

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


## deleteCrmConnectionIdContactId

Remove a contact

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdContactIdRequest;
import com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdContactIdResponse;
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("Wyoming") {{
                    jwt = "";
                }})
                .build();

            DeleteCrmConnectionIdContactIdRequest req = new DeleteCrmConnectionIdContactIdRequest("Arizona", "payment");            

            DeleteCrmConnectionIdContactIdResponse res = sdk.crm.deleteCrmConnectionIdContactId(req);

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
| `request`                                                                                                                                            | [com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdContactIdRequest](../../models/operations/DeleteCrmConnectionIdContactIdRequest.md) | :heavy_check_mark:                                                                                                                                   | The request object to use for the request.                                                                                                           |


### Response

**[com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdContactIdResponse](../../models/operations/DeleteCrmConnectionIdContactIdResponse.md)**


## deleteCrmConnectionIdDealId

Remove a deal

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdDealIdRequest;
import com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdDealIdResponse;
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("Concrete") {{
                    jwt = "";
                }})
                .build();

            DeleteCrmConnectionIdDealIdRequest req = new DeleteCrmConnectionIdDealIdRequest("Tokelau", "Generic");            

            DeleteCrmConnectionIdDealIdResponse res = sdk.crm.deleteCrmConnectionIdDealId(req);

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
| `request`                                                                                                                                      | [com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdDealIdRequest](../../models/operations/DeleteCrmConnectionIdDealIdRequest.md) | :heavy_check_mark:                                                                                                                             | The request object to use for the request.                                                                                                     |


### Response

**[com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdDealIdResponse](../../models/operations/DeleteCrmConnectionIdDealIdResponse.md)**


## deleteCrmConnectionIdEventId

Remove a event

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdEventIdRequest;
import com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdEventIdResponse;
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("overriding") {{
                    jwt = "";
                }})
                .build();

            DeleteCrmConnectionIdEventIdRequest req = new DeleteCrmConnectionIdEventIdRequest("Towels", "Moscovium");            

            DeleteCrmConnectionIdEventIdResponse res = sdk.crm.deleteCrmConnectionIdEventId(req);

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

| Parameter                                                                                                                                        | Type                                                                                                                                             | Required                                                                                                                                         | Description                                                                                                                                      |
| ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                        | [com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdEventIdRequest](../../models/operations/DeleteCrmConnectionIdEventIdRequest.md) | :heavy_check_mark:                                                                                                                               | The request object to use for the request.                                                                                                       |


### Response

**[com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdEventIdResponse](../../models/operations/DeleteCrmConnectionIdEventIdResponse.md)**


## deleteCrmConnectionIdFileId

Remove a file

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdFileIdRequest;
import com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdFileIdResponse;
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("ivory") {{
                    jwt = "";
                }})
                .build();

            DeleteCrmConnectionIdFileIdRequest req = new DeleteCrmConnectionIdFileIdRequest("Hybrid", "Dobra");            

            DeleteCrmConnectionIdFileIdResponse res = sdk.crm.deleteCrmConnectionIdFileId(req);

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
| `request`                                                                                                                                      | [com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdFileIdRequest](../../models/operations/DeleteCrmConnectionIdFileIdRequest.md) | :heavy_check_mark:                                                                                                                             | The request object to use for the request.                                                                                                     |


### Response

**[com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdFileIdResponse](../../models/operations/DeleteCrmConnectionIdFileIdResponse.md)**


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
                .setSecurity(new Security("officia") {{
                    jwt = "";
                }})
                .build();

            DeleteCrmConnectionIdLeadIdRequest req = new DeleteCrmConnectionIdLeadIdRequest("Buckinghamshire", "whose");            

            DeleteCrmConnectionIdLeadIdResponse res = sdk.crm.deleteCrmConnectionIdLeadId(req);

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


## deleteCrmConnectionIdPipelineId

Remove a pipeline

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdPipelineIdRequest;
import com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdPipelineIdResponse;
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("maxime") {{
                    jwt = "";
                }})
                .build();

            DeleteCrmConnectionIdPipelineIdRequest req = new DeleteCrmConnectionIdPipelineIdRequest("Cambridgeshire", "astronomy");            

            DeleteCrmConnectionIdPipelineIdResponse res = sdk.crm.deleteCrmConnectionIdPipelineId(req);

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
| `request`                                                                                                                                              | [com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdPipelineIdRequest](../../models/operations/DeleteCrmConnectionIdPipelineIdRequest.md) | :heavy_check_mark:                                                                                                                                     | The request object to use for the request.                                                                                                             |


### Response

**[com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdPipelineIdResponse](../../models/operations/DeleteCrmConnectionIdPipelineIdResponse.md)**


## deleteCrmConnectionIdTeamId

Remove a team

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdTeamIdRequest;
import com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdTeamIdResponse;
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("Louisiana") {{
                    jwt = "";
                }})
                .build();

            DeleteCrmConnectionIdTeamIdRequest req = new DeleteCrmConnectionIdTeamIdRequest("Tuna", "Cruiser");            

            DeleteCrmConnectionIdTeamIdResponse res = sdk.crm.deleteCrmConnectionIdTeamId(req);

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
| `request`                                                                                                                                      | [com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdTeamIdRequest](../../models/operations/DeleteCrmConnectionIdTeamIdRequest.md) | :heavy_check_mark:                                                                                                                             | The request object to use for the request.                                                                                                     |


### Response

**[com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdTeamIdResponse](../../models/operations/DeleteCrmConnectionIdTeamIdResponse.md)**


## deleteCrmConnectionIdUserId

Remove a user

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdUserIdRequest;
import com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdUserIdResponse;
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("calculate") {{
                    jwt = "";
                }})
                .build();

            DeleteCrmConnectionIdUserIdRequest req = new DeleteCrmConnectionIdUserIdRequest("Classical", "pink");            

            DeleteCrmConnectionIdUserIdResponse res = sdk.crm.deleteCrmConnectionIdUserId(req);

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
| `request`                                                                                                                                      | [com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdUserIdRequest](../../models/operations/DeleteCrmConnectionIdUserIdRequest.md) | :heavy_check_mark:                                                                                                                             | The request object to use for the request.                                                                                                     |


### Response

**[com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdUserIdResponse](../../models/operations/DeleteCrmConnectionIdUserIdResponse.md)**


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
                .setSecurity(new Security("Northeast") {{
                    jwt = "";
                }})
                .build();

            GetCrmConnectionIdCompanyRequest req = new GetCrmConnectionIdCompanyRequest("withdrawal") {{
                contactId = "blue synthesize Bronze";
                dealId = "Gasoline";
                limit = 9098.32d;
                offset = 3330.24d;
                order = "juxtapose invoice";
                query = "Luxembourg yellow";
                sort = "generate Forward";
                updatedGte = OffsetDateTime.parse("2022-03-23T08:07:05.969Z");
            }};            

            GetCrmConnectionIdCompanyResponse res = sdk.crm.getCrmConnectionIdCompany(req);

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
                .setSecurity(new Security("Ergonomic") {{
                    jwt = "";
                }})
                .build();

            GetCrmConnectionIdCompanyIdRequest req = new GetCrmConnectionIdCompanyIdRequest("Data", "boo");            

            GetCrmConnectionIdCompanyIdResponse res = sdk.crm.getCrmConnectionIdCompanyId(req);

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


## getCrmConnectionIdContact

List all contacts

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdContactRequest;
import com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdContactResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("Technician") {{
                    jwt = "";
                }})
                .build();

            GetCrmConnectionIdContactRequest req = new GetCrmConnectionIdContactRequest("Southeast") {{
                companyId = "magenta loose";
                dealId = "intuitive";
                limit = 9605d;
                offset = 8572.44d;
                order = "Music Electronics";
                query = "Elegant";
                sort = "North Analyst Otis";
                updatedGte = OffsetDateTime.parse("2022-09-18T15:42:24.943Z");
            }};            

            GetCrmConnectionIdContactResponse res = sdk.crm.getCrmConnectionIdContact(req);

            if (res.crmContacts != null) {
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
| `request`                                                                                                                                  | [com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdContactRequest](../../models/operations/GetCrmConnectionIdContactRequest.md) | :heavy_check_mark:                                                                                                                         | The request object to use for the request.                                                                                                 |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdContactResponse](../../models/operations/GetCrmConnectionIdContactResponse.md)**


## getCrmConnectionIdContactId

Retrieve a contact

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdContactIdRequest;
import com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdContactIdResponse;
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("Southeast") {{
                    jwt = "";
                }})
                .build();

            GetCrmConnectionIdContactIdRequest req = new GetCrmConnectionIdContactIdRequest("fountain", "visionary");            

            GetCrmConnectionIdContactIdResponse res = sdk.crm.getCrmConnectionIdContactId(req);

            if (res.crmContact != null) {
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
| `request`                                                                                                                                      | [com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdContactIdRequest](../../models/operations/GetCrmConnectionIdContactIdRequest.md) | :heavy_check_mark:                                                                                                                             | The request object to use for the request.                                                                                                     |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdContactIdResponse](../../models/operations/GetCrmConnectionIdContactIdResponse.md)**


## getCrmConnectionIdDeal

List all deals

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdDealRequest;
import com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdDealResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("apud") {{
                    jwt = "";
                }})
                .build();

            GetCrmConnectionIdDealRequest req = new GetCrmConnectionIdDealRequest("foreground") {{
                companyId = "Soul communities Renminbi";
                contactId = "till payment World";
                limit = 8656.16d;
                offset = 4455.8d;
                order = "global";
                query = "Program Bespoke Wisconsin";
                sort = "Netherlands under";
                updatedGte = OffsetDateTime.parse("2022-12-23T01:47:21.816Z");
            }};            

            GetCrmConnectionIdDealResponse res = sdk.crm.getCrmConnectionIdDeal(req);

            if (res.crmDeals != null) {
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
| `request`                                                                                                                            | [com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdDealRequest](../../models/operations/GetCrmConnectionIdDealRequest.md) | :heavy_check_mark:                                                                                                                   | The request object to use for the request.                                                                                           |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdDealResponse](../../models/operations/GetCrmConnectionIdDealResponse.md)**


## getCrmConnectionIdDealId

Retrieve a deal

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdDealIdRequest;
import com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdDealIdResponse;
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("Response") {{
                    jwt = "";
                }})
                .build();

            GetCrmConnectionIdDealIdRequest req = new GetCrmConnectionIdDealIdRequest("Electric", "Practical");            

            GetCrmConnectionIdDealIdResponse res = sdk.crm.getCrmConnectionIdDealId(req);

            if (res.crmDeal != null) {
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
| `request`                                                                                                                                | [com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdDealIdRequest](../../models/operations/GetCrmConnectionIdDealIdRequest.md) | :heavy_check_mark:                                                                                                                       | The request object to use for the request.                                                                                               |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdDealIdResponse](../../models/operations/GetCrmConnectionIdDealIdResponse.md)**


## getCrmConnectionIdEvent

List all events

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdEventRequest;
import com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdEventResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("qua") {{
                    jwt = "";
                }})
                .build();

            GetCrmConnectionIdEventRequest req = new GetCrmConnectionIdEventRequest("markets") {{
                companyId = "Bedfordshire";
                contactId = "Hybrid grey Ferrari";
                dealId = "Checking Southeast";
                limit = 7975.61d;
                offset = 1549.88d;
                order = "Salad Applications who";
                query = "Tricycle";
                sort = "Woman Recycled";
                updatedGte = OffsetDateTime.parse("2021-03-01T02:52:41.600Z");
            }};            

            GetCrmConnectionIdEventResponse res = sdk.crm.getCrmConnectionIdEvent(req);

            if (res.crmEvents != null) {
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
| `request`                                                                                                                              | [com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdEventRequest](../../models/operations/GetCrmConnectionIdEventRequest.md) | :heavy_check_mark:                                                                                                                     | The request object to use for the request.                                                                                             |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdEventResponse](../../models/operations/GetCrmConnectionIdEventResponse.md)**


## getCrmConnectionIdEventId

Retrieve a event

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdEventIdRequest;
import com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdEventIdResponse;
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("Credit") {{
                    jwt = "";
                }})
                .build();

            GetCrmConnectionIdEventIdRequest req = new GetCrmConnectionIdEventIdRequest("equalise", "Diesel");            

            GetCrmConnectionIdEventIdResponse res = sdk.crm.getCrmConnectionIdEventId(req);

            if (res.crmEvent != null) {
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
| `request`                                                                                                                                  | [com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdEventIdRequest](../../models/operations/GetCrmConnectionIdEventIdRequest.md) | :heavy_check_mark:                                                                                                                         | The request object to use for the request.                                                                                                 |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdEventIdResponse](../../models/operations/GetCrmConnectionIdEventIdResponse.md)**


## getCrmConnectionIdFile

List all files

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdFileRequest;
import com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdFileResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("South") {{
                    jwt = "";
                }})
                .build();

            GetCrmConnectionIdFileRequest req = new GetCrmConnectionIdFileRequest("hm") {{
                companyId = "Salad Recycled Electronic";
                contactId = "Seychelles";
                dealId = "Investment deposit";
                limit = 2748.99d;
                offset = 7968.15d;
                order = "experiences Milo";
                query = "Unbranded haptic FTP";
                sort = "watt soprano deliverables";
                updatedGte = OffsetDateTime.parse("2022-03-02T03:00:09.711Z");
            }};            

            GetCrmConnectionIdFileResponse res = sdk.crm.getCrmConnectionIdFile(req);

            if (res.crmFiles != null) {
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
| `request`                                                                                                                            | [com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdFileRequest](../../models/operations/GetCrmConnectionIdFileRequest.md) | :heavy_check_mark:                                                                                                                   | The request object to use for the request.                                                                                           |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdFileResponse](../../models/operations/GetCrmConnectionIdFileResponse.md)**


## getCrmConnectionIdFileId

Retrieve a file

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdFileIdRequest;
import com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdFileIdResponse;
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("Buckinghamshire") {{
                    jwt = "";
                }})
                .build();

            GetCrmConnectionIdFileIdRequest req = new GetCrmConnectionIdFileIdRequest("haptic", "Sheboygan");            

            GetCrmConnectionIdFileIdResponse res = sdk.crm.getCrmConnectionIdFileId(req);

            if (res.crmFile != null) {
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
| `request`                                                                                                                                | [com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdFileIdRequest](../../models/operations/GetCrmConnectionIdFileIdRequest.md) | :heavy_check_mark:                                                                                                                       | The request object to use for the request.                                                                                               |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdFileIdResponse](../../models/operations/GetCrmConnectionIdFileIdResponse.md)**


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
                .setSecurity(new Security("Southeast") {{
                    jwt = "";
                }})
                .build();

            GetCrmConnectionIdLeadRequest req = new GetCrmConnectionIdLeadRequest("henry") {{
                limit = 9979.59d;
                offset = 6297.92d;
                order = "candela Integration";
                query = "impactful transform";
                sort = "Tala defense Southwest";
                updatedGte = OffsetDateTime.parse("2021-09-29T00:37:32.184Z");
            }};            

            GetCrmConnectionIdLeadResponse res = sdk.crm.getCrmConnectionIdLead(req);

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
                .setSecurity(new Security("beyond") {{
                    jwt = "";
                }})
                .build();

            GetCrmConnectionIdLeadIdRequest req = new GetCrmConnectionIdLeadIdRequest("Tandem", "Minnesota");            

            GetCrmConnectionIdLeadIdResponse res = sdk.crm.getCrmConnectionIdLeadId(req);

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


## getCrmConnectionIdPipeline

List all pipelines

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdPipelineRequest;
import com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdPipelineResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("fuchsia") {{
                    jwt = "";
                }})
                .build();

            GetCrmConnectionIdPipelineRequest req = new GetCrmConnectionIdPipelineRequest("Bike") {{
                limit = 6106.83d;
                offset = 4108.25d;
                order = "iterate";
                query = "Industrial contingency";
                sort = "Ramp Honda";
                updatedGte = OffsetDateTime.parse("2023-08-06T19:32:12.657Z");
            }};            

            GetCrmConnectionIdPipelineResponse res = sdk.crm.getCrmConnectionIdPipeline(req);

            if (res.crmPipelines != null) {
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
| `request`                                                                                                                                    | [com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdPipelineRequest](../../models/operations/GetCrmConnectionIdPipelineRequest.md) | :heavy_check_mark:                                                                                                                           | The request object to use for the request.                                                                                                   |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdPipelineResponse](../../models/operations/GetCrmConnectionIdPipelineResponse.md)**


## getCrmConnectionIdPipelineId

Retrieve a pipeline

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdPipelineIdRequest;
import com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdPipelineIdResponse;
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("soon") {{
                    jwt = "";
                }})
                .build();

            GetCrmConnectionIdPipelineIdRequest req = new GetCrmConnectionIdPipelineIdRequest("swath", "Director");            

            GetCrmConnectionIdPipelineIdResponse res = sdk.crm.getCrmConnectionIdPipelineId(req);

            if (res.crmPipeline != null) {
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
| `request`                                                                                                                                        | [com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdPipelineIdRequest](../../models/operations/GetCrmConnectionIdPipelineIdRequest.md) | :heavy_check_mark:                                                                                                                               | The request object to use for the request.                                                                                                       |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdPipelineIdResponse](../../models/operations/GetCrmConnectionIdPipelineIdResponse.md)**


## getCrmConnectionIdTeam

List all teams

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdTeamRequest;
import com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdTeamResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("Buckinghamshire") {{
                    jwt = "";
                }})
                .build();

            GetCrmConnectionIdTeamRequest req = new GetCrmConnectionIdTeamRequest("bypass") {{
                limit = 1586.42d;
                offset = 8382.08d;
                order = "Northeast Shoes transform";
                query = "Bedfordshire Senior strategize";
                sort = "Ford up";
                updatedGte = OffsetDateTime.parse("2021-01-24T11:58:31.884Z");
            }};            

            GetCrmConnectionIdTeamResponse res = sdk.crm.getCrmConnectionIdTeam(req);

            if (res.crmTeams != null) {
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
| `request`                                                                                                                            | [com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdTeamRequest](../../models/operations/GetCrmConnectionIdTeamRequest.md) | :heavy_check_mark:                                                                                                                   | The request object to use for the request.                                                                                           |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdTeamResponse](../../models/operations/GetCrmConnectionIdTeamResponse.md)**


## getCrmConnectionIdTeamId

Retrieve a team

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdTeamIdRequest;
import com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdTeamIdResponse;
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("Arsenic") {{
                    jwt = "";
                }})
                .build();

            GetCrmConnectionIdTeamIdRequest req = new GetCrmConnectionIdTeamIdRequest("Garden", "CLI");            

            GetCrmConnectionIdTeamIdResponse res = sdk.crm.getCrmConnectionIdTeamId(req);

            if (res.crmTeam != null) {
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
| `request`                                                                                                                                | [com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdTeamIdRequest](../../models/operations/GetCrmConnectionIdTeamIdRequest.md) | :heavy_check_mark:                                                                                                                       | The request object to use for the request.                                                                                               |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdTeamIdResponse](../../models/operations/GetCrmConnectionIdTeamIdResponse.md)**


## getCrmConnectionIdUser

List all users

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdUserRequest;
import com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdUserResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("Strategist") {{
                    jwt = "";
                }})
                .build();

            GetCrmConnectionIdUserRequest req = new GetCrmConnectionIdUserRequest("enchanting") {{
                limit = 1042.84d;
                offset = 220.21d;
                order = "visionary Tasty set";
                query = "Fitness";
                sort = "success servant";
                updatedGte = OffsetDateTime.parse("2023-02-23T05:53:04.259Z");
            }};            

            GetCrmConnectionIdUserResponse res = sdk.crm.getCrmConnectionIdUser(req);

            if (res.crmUsers != null) {
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
| `request`                                                                                                                            | [com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdUserRequest](../../models/operations/GetCrmConnectionIdUserRequest.md) | :heavy_check_mark:                                                                                                                   | The request object to use for the request.                                                                                           |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdUserResponse](../../models/operations/GetCrmConnectionIdUserResponse.md)**


## getCrmConnectionIdUserId

Retrieve a user

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdUserIdRequest;
import com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdUserIdResponse;
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("blanditiis") {{
                    jwt = "";
                }})
                .build();

            GetCrmConnectionIdUserIdRequest req = new GetCrmConnectionIdUserIdRequest("quantifying", "Yemen");            

            GetCrmConnectionIdUserIdResponse res = sdk.crm.getCrmConnectionIdUserId(req);

            if (res.crmUser != null) {
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
| `request`                                                                                                                                | [com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdUserIdRequest](../../models/operations/GetCrmConnectionIdUserIdRequest.md) | :heavy_check_mark:                                                                                                                       | The request object to use for the request.                                                                                               |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdUserIdResponse](../../models/operations/GetCrmConnectionIdUserIdResponse.md)**


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
                .setSecurity(new Security("Soft") {{
                    jwt = "";
                }})
                .build();

            PatchCrmConnectionIdCompanyIdRequest req = new PatchCrmConnectionIdCompanyIdRequest("invoice", "Synergized") {{
                crmCompany = new CrmCompany() {{
                    active = false;
                    address = new PropertyCrmCompanyAddress() {{
                        address1 = "Quality redefine";
                        address2 = "invoice National";
                        city = "Feilport";
                        country = "Switzerland";
                        countryCode = "SZ";
                        postalCode = "82050-3091";
                        region = "Vermont Astatine";
                        regionCode = "whoa female";
                    }};;
                    createdAt = OffsetDateTime.parse("2021-11-05T19:33:29.059Z");
                    dealIds = new String[]{{
                        add("Representative"),
                    }};
                    emails = new com.unifiedapi.unifiedto.models.shared.CrmEmail[]{{
                        add(new CrmEmail() {{
                            email = "Cortez51@gmail.com";
                            type = CrmEmailType.HOME;
                        }}),
                    }};
                    id = "<ID>";
                    name = "intensely";
                    raw = new PropertyCrmCompanyRaw();;
                    tags = new String[]{{
                        add("vitamin"),
                    }};
                    telephones = new com.unifiedapi.unifiedto.models.shared.CrmTelephone[]{{
                        add(new CrmTelephone("navigate") {{
                            telephone = "Waterloo";
                            type = CrmTelephoneType.MOBILE;
                        }}),
                    }};
                    updatedAt = OffsetDateTime.parse("2021-10-02T21:01:43.582Z");
                    websites = new String[]{{
                        add("transmit"),
                    }};
                }};;
            }};            

            PatchCrmConnectionIdCompanyIdResponse res = sdk.crm.patchCrmConnectionIdCompanyId(req);

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


## patchCrmConnectionIdContactId

Update a contact

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdContactIdRequest;
import com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdContactIdResponse;
import com.unifiedapi.unifiedto.models.shared.CrmContact;
import com.unifiedapi.unifiedto.models.shared.CrmEmail;
import com.unifiedapi.unifiedto.models.shared.CrmEmailType;
import com.unifiedapi.unifiedto.models.shared.CrmTelephone;
import com.unifiedapi.unifiedto.models.shared.CrmTelephoneType;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmContactAddress;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmContactRaw;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("Bicycle") {{
                    jwt = "";
                }})
                .build();

            PatchCrmConnectionIdContactIdRequest req = new PatchCrmConnectionIdContactIdRequest("instantly", "Taiwan") {{
                crmContact = new CrmContact() {{
                    address = new PropertyCrmContactAddress() {{
                        address1 = "disintermediate ah Southwest";
                        address2 = "Bicycle communities infomediaries";
                        city = "Mount Vernon";
                        country = "Netherlands Antilles";
                        countryCode = "SC";
                        postalCode = "91274";
                        region = "Investment";
                        regionCode = "cormorant copying";
                    }};;
                    company = "Larson Group";
                    companyIds = new String[]{{
                        add("person"),
                    }};
                    createdAt = OffsetDateTime.parse("2022-07-09T02:39:19.057Z");
                    dealIds = new String[]{{
                        add("Soft"),
                    }};
                    emails = new com.unifiedapi.unifiedto.models.shared.CrmEmail[]{{
                        add(new CrmEmail() {{
                            email = "Freeda_Gutkowski@hotmail.com";
                            type = CrmEmailType.OTHER;
                        }}),
                    }};
                    id = "<ID>";
                    name = "Borders Cotton Tactics";
                    raw = new PropertyCrmContactRaw();;
                    telephones = new com.unifiedapi.unifiedto.models.shared.CrmTelephone[]{{
                        add(new CrmTelephone("corn") {{
                            telephone = "radian";
                            type = CrmTelephoneType.HOME;
                        }}),
                    }};
                    title = "autem Tuvalu";
                    updatedAt = OffsetDateTime.parse("2022-09-21T14:40:36.486Z");
                }};;
            }};            

            PatchCrmConnectionIdContactIdResponse res = sdk.crm.patchCrmConnectionIdContactId(req);

            if (res.crmContact != null) {
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
| `request`                                                                                                                                          | [com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdContactIdRequest](../../models/operations/PatchCrmConnectionIdContactIdRequest.md) | :heavy_check_mark:                                                                                                                                 | The request object to use for the request.                                                                                                         |


### Response

**[com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdContactIdResponse](../../models/operations/PatchCrmConnectionIdContactIdResponse.md)**


## patchCrmConnectionIdDealId

Update a deal

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdDealIdRequest;
import com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdDealIdResponse;
import com.unifiedapi.unifiedto.models.shared.CrmDeal;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmDealRaw;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("Bicycle") {{
                    jwt = "";
                }})
                .build();

            PatchCrmConnectionIdDealIdRequest req = new PatchCrmConnectionIdDealIdRequest("East", "North") {{
                crmDeal = new CrmDeal() {{
                    amount = 83.47d;
                    closedAt = OffsetDateTime.parse("2023-11-10T10:13:15.860Z");
                    createdAt = OffsetDateTime.parse("2022-09-06T02:31:05.722Z");
                    currency = "European Unit of Account 17(E.U.A.-17)";
                    id = "<ID>";
                    lostReason = "benchmark";
                    name = "Loan";
                    pipeline = "Cotton Blues ah";
                    probability = 263.43d;
                    raw = new PropertyCrmDealRaw();;
                    source = "logistical transition Universal";
                    stage = "Investment Elegant kilogram";
                    tags = new String[]{{
                        add("Germanium"),
                    }};
                    updatedAt = OffsetDateTime.parse("2021-08-13T23:49:24.798Z");
                    wonReason = "West";
                }};;
            }};            

            PatchCrmConnectionIdDealIdResponse res = sdk.crm.patchCrmConnectionIdDealId(req);

            if (res.crmDeal != null) {
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
| `request`                                                                                                                                    | [com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdDealIdRequest](../../models/operations/PatchCrmConnectionIdDealIdRequest.md) | :heavy_check_mark:                                                                                                                           | The request object to use for the request.                                                                                                   |


### Response

**[com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdDealIdResponse](../../models/operations/PatchCrmConnectionIdDealIdResponse.md)**


## patchCrmConnectionIdEventId

Update a event

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdEventIdRequest;
import com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdEventIdResponse;
import com.unifiedapi.unifiedto.models.shared.CrmEvent;
import com.unifiedapi.unifiedto.models.shared.CrmEventType;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmEventCall;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmEventEmail;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmEventMeeting;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmEventNote;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmEventRaw;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmEventTask;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("parse") {{
                    jwt = "";
                }})
                .build();

            PatchCrmConnectionIdEventIdRequest req = new PatchCrmConnectionIdEventIdRequest("intranet", "silver") {{
                crmEvent = new CrmEvent() {{
                    call = new PropertyCrmEventCall() {{
                        description = "Fully-configurable zero administration collaboration";
                        duration = 6394.52d;
                    }};;
                    companyIds = new String[]{{
                        add("North"),
                    }};
                    contactIds = new String[]{{
                        add("French"),
                    }};
                    createdAt = OffsetDateTime.parse("2022-04-03T00:59:00.853Z");
                    dealIds = new String[]{{
                        add("Avon"),
                    }};
                    email = new PropertyCrmEventEmail() {{
                        body = "SDD Toyota Northeast";
                        cc = new String[]{{
                            add("Sports"),
                        }};
                        from = "Electronics";
                        subject = "Demiflux impedit";
                        to = new String[]{{
                            add("Hyundai"),
                        }};
                    }};;
                    id = "<ID>";
                    meeting = new PropertyCrmEventMeeting() {{
                        description = "Multi-lateral 5th generation protocol";
                        endAt = OffsetDateTime.parse("2022-01-23T16:29:52.497Z");
                        startAt = OffsetDateTime.parse("2023-07-12T04:52:28.989Z");
                        title = "Executive";
                    }};;
                    note = new PropertyCrmEventNote() {{
                        description = "Multi-lateral fault-tolerant framework";
                    }};;
                    raw = new PropertyCrmEventRaw();;
                    task = new PropertyCrmEventTask() {{
                        description = "Function-based even-keeled pricing structure";
                        name = "teethe Rustic";
                        status = "Investment male Electric";
                    }};;
                    type = CrmEventType.EMAIL;
                    updatedAt = OffsetDateTime.parse("2021-09-28T03:55:44.303Z");
                }};;
            }};            

            PatchCrmConnectionIdEventIdResponse res = sdk.crm.patchCrmConnectionIdEventId(req);

            if (res.crmEvent != null) {
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
| `request`                                                                                                                                      | [com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdEventIdRequest](../../models/operations/PatchCrmConnectionIdEventIdRequest.md) | :heavy_check_mark:                                                                                                                             | The request object to use for the request.                                                                                                     |


### Response

**[com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdEventIdResponse](../../models/operations/PatchCrmConnectionIdEventIdResponse.md)**


## patchCrmConnectionIdFileId

Update a file

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdFileIdRequest;
import com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdFileIdResponse;
import com.unifiedapi.unifiedto.models.shared.CrmFile;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmFileRaw;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("tragedy") {{
                    jwt = "";
                }})
                .build();

            PatchCrmConnectionIdFileIdRequest req = new PatchCrmConnectionIdFileIdRequest("Engineer", "male") {{
                crmFile = new CrmFile() {{
                    active = false;
                    activityId = "Home communities CFP";
                    companyId = "unaware yellow generating";
                    contactId = "World";
                    createdAt = OffsetDateTime.parse("2021-07-25T09:47:16.664Z");
                    dealId = "City and Electronic";
                    description = "Virtual client-driven benchmark";
                    fileName = "handcrafted_kong_maximized.jpeg";
                    fileSize = 8601.07d;
                    fileType = "image";
                    fileUrl = "Awesome Accountability gadzooks";
                    id = "<ID>";
                    leadId = "Incredible Chromium";
                    raw = new PropertyCrmFileRaw();;
                    updatedAt = OffsetDateTime.parse("2021-10-07T21:25:44.502Z");
                    userId = "Hybrid";
                }};;
            }};            

            PatchCrmConnectionIdFileIdResponse res = sdk.crm.patchCrmConnectionIdFileId(req);

            if (res.crmFile != null) {
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
| `request`                                                                                                                                    | [com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdFileIdRequest](../../models/operations/PatchCrmConnectionIdFileIdRequest.md) | :heavy_check_mark:                                                                                                                           | The request object to use for the request.                                                                                                   |


### Response

**[com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdFileIdResponse](../../models/operations/PatchCrmConnectionIdFileIdResponse.md)**


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
                .setSecurity(new Security("robust") {{
                    jwt = "";
                }})
                .build();

            PatchCrmConnectionIdLeadIdRequest req = new PatchCrmConnectionIdLeadIdRequest("when", "Oriental") {{
                crmLead = new CrmLead() {{
                    active = false;
                    address = new PropertyCrmLeadAddress() {{
                        address1 = "Gasoline Gasoline grey";
                        address2 = "oof Passenger Southwest";
                        city = "Boca Raton";
                        country = "Bahrain";
                        countryCode = "CG";
                        postalCode = "07844-0796";
                        region = "Gasoline conglomeration Tennessine";
                        regionCode = "grow hub";
                    }};;
                    companyId = "so digital watt";
                    contactId = "sensor whiteboard";
                    createdAt = OffsetDateTime.parse("2023-03-28T10:49:33.417Z");
                    creatorUserId = "Diesel Triathlon/Time";
                    emails = new com.unifiedapi.unifiedto.models.shared.CrmEmail[]{{
                        add(new CrmEmail() {{
                            email = "Arvel_Ortiz@hotmail.com";
                            type = CrmEmailType.WORK;
                        }}),
                    }};
                    id = "<ID>";
                    name = "yellow";
                    raw = new PropertyCrmLeadRaw();;
                    telephones = new com.unifiedapi.unifiedto.models.shared.CrmTelephone[]{{
                        add(new CrmTelephone("Bicycle") {{
                            telephone = "radiant";
                            type = CrmTelephoneType.OTHER;
                        }}),
                    }};
                    updatedAt = OffsetDateTime.parse("2022-01-01T11:37:27.820Z");
                    userId = "bypass deliverables Hyundai";
                }};;
            }};            

            PatchCrmConnectionIdLeadIdResponse res = sdk.crm.patchCrmConnectionIdLeadId(req);

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


## patchCrmConnectionIdPipelineId

Update a pipeline

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdPipelineIdRequest;
import com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdPipelineIdResponse;
import com.unifiedapi.unifiedto.models.shared.CrmPipeline;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmPipelineRaw;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("boastfully") {{
                    jwt = "";
                }})
                .build();

            PatchCrmConnectionIdPipelineIdRequest req = new PatchCrmConnectionIdPipelineIdRequest("relationships", "Southwest") {{
                crmPipeline = new CrmPipeline() {{
                    active = false;
                    createdAt = OffsetDateTime.parse("2021-01-06T10:07:28.591Z");
                    dealProbability = false;
                    displayOrder = 2164.62d;
                    id = "<ID>";
                    name = "Licensed AI Trial";
                    raw = new PropertyCrmPipelineRaw();;
                    updatedAt = OffsetDateTime.parse("2023-12-18T09:09:15.002Z");
                }};;
            }};            

            PatchCrmConnectionIdPipelineIdResponse res = sdk.crm.patchCrmConnectionIdPipelineId(req);

            if (res.crmPipeline != null) {
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
| `request`                                                                                                                                            | [com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdPipelineIdRequest](../../models/operations/PatchCrmConnectionIdPipelineIdRequest.md) | :heavy_check_mark:                                                                                                                                   | The request object to use for the request.                                                                                                           |


### Response

**[com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdPipelineIdResponse](../../models/operations/PatchCrmConnectionIdPipelineIdResponse.md)**


## patchCrmConnectionIdTeamId

Update a team

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdTeamIdRequest;
import com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdTeamIdResponse;
import com.unifiedapi.unifiedto.models.shared.CrmTeam;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmTeamRaw;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("Arizona") {{
                    jwt = "";
                }})
                .build();

            PatchCrmConnectionIdTeamIdRequest req = new PatchCrmConnectionIdTeamIdRequest("to", "Internal") {{
                crmTeam = new CrmTeam() {{
                    createdAt = OffsetDateTime.parse("2022-01-07T23:31:14.855Z");
                    description = "Up-sized high-level portal";
                    id = "<ID>";
                    name = "Moroccan pink";
                    raw = new PropertyCrmTeamRaw();;
                    updatedAt = OffsetDateTime.parse("2023-08-14T10:23:48.923Z");
                    userIds = new String[]{{
                        add("Candace"),
                    }};
                }};;
            }};            

            PatchCrmConnectionIdTeamIdResponse res = sdk.crm.patchCrmConnectionIdTeamId(req);

            if (res.crmTeam != null) {
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
| `request`                                                                                                                                    | [com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdTeamIdRequest](../../models/operations/PatchCrmConnectionIdTeamIdRequest.md) | :heavy_check_mark:                                                                                                                           | The request object to use for the request.                                                                                                   |


### Response

**[com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdTeamIdResponse](../../models/operations/PatchCrmConnectionIdTeamIdResponse.md)**


## patchCrmConnectionIdUserId

Update a user

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdUserIdRequest;
import com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdUserIdResponse;
import com.unifiedapi.unifiedto.models.shared.CrmEmail;
import com.unifiedapi.unifiedto.models.shared.CrmEmailType;
import com.unifiedapi.unifiedto.models.shared.CrmTelephone;
import com.unifiedapi.unifiedto.models.shared.CrmTelephoneType;
import com.unifiedapi.unifiedto.models.shared.CrmUser;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmUserAddress;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmUserRaw;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("Northwest") {{
                    jwt = "";
                }})
                .build();

            PatchCrmConnectionIdUserIdRequest req = new PatchCrmConnectionIdUserIdRequest("Blues", "violet") {{
                crmUser = new CrmUser() {{
                    active = false;
                    address = new PropertyCrmUserAddress() {{
                        address1 = "Loan Grocery";
                        address2 = "pish Supervisor North";
                        city = "Justiceshire";
                        country = "Israel";
                        countryCode = "JO";
                        postalCode = "37126";
                        region = "Interactions";
                        regionCode = "whiteboard";
                    }};;
                    createdAt = OffsetDateTime.parse("2021-11-25T05:08:21.665Z");
                    currency = "Falkland Islands Pound";
                    department = "pascal Berkshire Europium";
                    division = "anti";
                    emails = new com.unifiedapi.unifiedto.models.shared.CrmEmail[]{{
                        add(new CrmEmail() {{
                            email = "Aniya40@yahoo.com";
                            type = CrmEmailType.WORK;
                        }}),
                    }};
                    id = "<ID>";
                    imageUrl = "sputter";
                    languageLocale = "Porsche matrix Electric";
                    name = "Nissan sedately Tricycle";
                    raw = new PropertyCrmUserRaw();;
                    telephones = new com.unifiedapi.unifiedto.models.shared.CrmTelephone[]{{
                        add(new CrmTelephone("Computer") {{
                            telephone = "ubiquitous input ashamed";
                            type = CrmTelephoneType.OTHER;
                        }}),
                    }};
                    timezone = "Asia/Chongqing";
                    title = "newton Corporate";
                    updatedAt = OffsetDateTime.parse("2023-06-03T09:54:55.953Z");
                }};;
            }};            

            PatchCrmConnectionIdUserIdResponse res = sdk.crm.patchCrmConnectionIdUserId(req);

            if (res.crmUser != null) {
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
| `request`                                                                                                                                    | [com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdUserIdRequest](../../models/operations/PatchCrmConnectionIdUserIdRequest.md) | :heavy_check_mark:                                                                                                                           | The request object to use for the request.                                                                                                   |


### Response

**[com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdUserIdResponse](../../models/operations/PatchCrmConnectionIdUserIdResponse.md)**


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
                .setSecurity(new Security("Personal") {{
                    jwt = "";
                }})
                .build();

            PostCrmConnectionIdCompanyRequest req = new PostCrmConnectionIdCompanyRequest("gosh") {{
                crmCompany = new CrmCompany() {{
                    active = false;
                    address = new PropertyCrmCompanyAddress() {{
                        address1 = "phooey";
                        address2 = "Bedfordshire neural";
                        city = "Port Victoria";
                        country = "Kenya";
                        countryCode = "NF";
                        postalCode = "77670";
                        region = "male";
                        regionCode = "utilisation Bronze";
                    }};;
                    createdAt = OffsetDateTime.parse("2023-07-06T10:14:02.898Z");
                    dealIds = new String[]{{
                        add("connect"),
                    }};
                    emails = new com.unifiedapi.unifiedto.models.shared.CrmEmail[]{{
                        add(new CrmEmail() {{
                            email = "Marisa84@yahoo.com";
                            type = CrmEmailType.HOME;
                        }}),
                    }};
                    id = "<ID>";
                    name = "East frenetically athwart";
                    raw = new PropertyCrmCompanyRaw();;
                    tags = new String[]{{
                        add("pink"),
                    }};
                    telephones = new com.unifiedapi.unifiedto.models.shared.CrmTelephone[]{{
                        add(new CrmTelephone("who") {{
                            telephone = "violet Account";
                            type = CrmTelephoneType.OTHER;
                        }}),
                    }};
                    updatedAt = OffsetDateTime.parse("2021-09-12T17:31:24.634Z");
                    websites = new String[]{{
                        add("Intuitive"),
                    }};
                }};;
            }};            

            PostCrmConnectionIdCompanyResponse res = sdk.crm.postCrmConnectionIdCompany(req);

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


## postCrmConnectionIdContact

Create a contact

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PostCrmConnectionIdContactRequest;
import com.unifiedapi.unifiedto.models.operations.PostCrmConnectionIdContactResponse;
import com.unifiedapi.unifiedto.models.shared.CrmContact;
import com.unifiedapi.unifiedto.models.shared.CrmEmail;
import com.unifiedapi.unifiedto.models.shared.CrmEmailType;
import com.unifiedapi.unifiedto.models.shared.CrmTelephone;
import com.unifiedapi.unifiedto.models.shared.CrmTelephoneType;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmContactAddress;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmContactRaw;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("integrated") {{
                    jwt = "";
                }})
                .build();

            PostCrmConnectionIdContactRequest req = new PostCrmConnectionIdContactRequest("Mobility") {{
                crmContact = new CrmContact() {{
                    address = new PropertyCrmContactAddress() {{
                        address1 = "who SUV";
                        address2 = "sievert Tungsten";
                        city = "Fort Destiny";
                        country = "Sao Tome and Principe";
                        countryCode = "TO";
                        postalCode = "66482-1980";
                        region = "National Money Executive";
                        regionCode = "Southwest";
                    }};;
                    company = "Dooley, O'Keefe and Bailey";
                    companyIds = new String[]{{
                        add("Rubber"),
                    }};
                    createdAt = OffsetDateTime.parse("2021-08-24T16:59:07.539Z");
                    dealIds = new String[]{{
                        add("farad"),
                    }};
                    emails = new com.unifiedapi.unifiedto.models.shared.CrmEmail[]{{
                        add(new CrmEmail() {{
                            email = "Lurline.Emmerich@yahoo.com";
                            type = CrmEmailType.WORK;
                        }}),
                    }};
                    id = "<ID>";
                    name = "second Fresh";
                    raw = new PropertyCrmContactRaw();;
                    telephones = new com.unifiedapi.unifiedto.models.shared.CrmTelephone[]{{
                        add(new CrmTelephone("Refined") {{
                            telephone = "Cambridgeshire kilogram Audi";
                            type = CrmTelephoneType.WORK;
                        }}),
                    }};
                    title = "streamline Berkshire World";
                    updatedAt = OffsetDateTime.parse("2023-05-09T06:25:49.274Z");
                }};;
            }};            

            PostCrmConnectionIdContactResponse res = sdk.crm.postCrmConnectionIdContact(req);

            if (res.crmContact != null) {
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
| `request`                                                                                                                                    | [com.unifiedapi.unifiedto.models.operations.PostCrmConnectionIdContactRequest](../../models/operations/PostCrmConnectionIdContactRequest.md) | :heavy_check_mark:                                                                                                                           | The request object to use for the request.                                                                                                   |


### Response

**[com.unifiedapi.unifiedto.models.operations.PostCrmConnectionIdContactResponse](../../models/operations/PostCrmConnectionIdContactResponse.md)**


## postCrmConnectionIdDeal

Create a deal

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PostCrmConnectionIdDealRequest;
import com.unifiedapi.unifiedto.models.operations.PostCrmConnectionIdDealResponse;
import com.unifiedapi.unifiedto.models.shared.CrmDeal;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmDealRaw;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("M2F") {{
                    jwt = "";
                }})
                .build();

            PostCrmConnectionIdDealRequest req = new PostCrmConnectionIdDealRequest("programming") {{
                crmDeal = new CrmDeal() {{
                    amount = 2558.82d;
                    closedAt = OffsetDateTime.parse("2023-02-16T08:39:46.084Z");
                    createdAt = OffsetDateTime.parse("2021-12-12T19:23:52.754Z");
                    currency = "Canadian Dollar";
                    id = "<ID>";
                    lostReason = "payment";
                    name = "International";
                    pipeline = "Luxurious West";
                    probability = 867.08d;
                    raw = new PropertyCrmDealRaw();;
                    source = "Account sometimes South";
                    stage = "intermediate Latin Cisgender";
                    tags = new String[]{{
                        add("input"),
                    }};
                    updatedAt = OffsetDateTime.parse("2022-06-01T07:39:00.559Z");
                    wonReason = "local Huntsville";
                }};;
            }};            

            PostCrmConnectionIdDealResponse res = sdk.crm.postCrmConnectionIdDeal(req);

            if (res.crmDeal != null) {
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
| `request`                                                                                                                              | [com.unifiedapi.unifiedto.models.operations.PostCrmConnectionIdDealRequest](../../models/operations/PostCrmConnectionIdDealRequest.md) | :heavy_check_mark:                                                                                                                     | The request object to use for the request.                                                                                             |


### Response

**[com.unifiedapi.unifiedto.models.operations.PostCrmConnectionIdDealResponse](../../models/operations/PostCrmConnectionIdDealResponse.md)**


## postCrmConnectionIdEvent

Create a event

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PostCrmConnectionIdEventRequest;
import com.unifiedapi.unifiedto.models.operations.PostCrmConnectionIdEventResponse;
import com.unifiedapi.unifiedto.models.shared.CrmEvent;
import com.unifiedapi.unifiedto.models.shared.CrmEventType;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmEventCall;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmEventEmail;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmEventMeeting;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmEventNote;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmEventRaw;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmEventTask;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("carburize") {{
                    jwt = "";
                }})
                .build();

            PostCrmConnectionIdEventRequest req = new PostCrmConnectionIdEventRequest("SDR") {{
                crmEvent = new CrmEvent() {{
                    call = new PropertyCrmEventCall() {{
                        description = "Customer-focused empowering conglomeration";
                        duration = 1255.4d;
                    }};;
                    companyIds = new String[]{{
                        add("male"),
                    }};
                    contactIds = new String[]{{
                        add("Cupertino"),
                    }};
                    createdAt = OffsetDateTime.parse("2022-07-24T22:18:30.290Z");
                    dealIds = new String[]{{
                        add("Cambodia"),
                    }};
                    email = new PropertyCrmEventEmail() {{
                        body = "male Games woman";
                        cc = new String[]{{
                            add("Rock"),
                        }};
                        from = "Soft Southeast";
                        subject = "capacitor Krone violet";
                        to = new String[]{{
                            add("Synergized"),
                        }};
                    }};;
                    id = "<ID>";
                    meeting = new PropertyCrmEventMeeting() {{
                        description = "Upgradable asymmetric hardware";
                        endAt = OffsetDateTime.parse("2021-12-19T09:09:38.264Z");
                        startAt = OffsetDateTime.parse("2023-11-21T21:46:08.139Z");
                        title = "harness Collierville payment";
                    }};;
                    note = new PropertyCrmEventNote() {{
                        description = "Team-oriented context-sensitive definition";
                    }};;
                    raw = new PropertyCrmEventRaw();;
                    task = new PropertyCrmEventTask() {{
                        description = "Multi-layered radical projection";
                        name = "Gorgeous Louisiana Directives";
                        status = "indicate";
                    }};;
                    type = CrmEventType.EMAIL;
                    updatedAt = OffsetDateTime.parse("2021-11-05T22:28:17.344Z");
                }};;
            }};            

            PostCrmConnectionIdEventResponse res = sdk.crm.postCrmConnectionIdEvent(req);

            if (res.crmEvent != null) {
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
| `request`                                                                                                                                | [com.unifiedapi.unifiedto.models.operations.PostCrmConnectionIdEventRequest](../../models/operations/PostCrmConnectionIdEventRequest.md) | :heavy_check_mark:                                                                                                                       | The request object to use for the request.                                                                                               |


### Response

**[com.unifiedapi.unifiedto.models.operations.PostCrmConnectionIdEventResponse](../../models/operations/PostCrmConnectionIdEventResponse.md)**


## postCrmConnectionIdFile

Create a file

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PostCrmConnectionIdFileRequest;
import com.unifiedapi.unifiedto.models.operations.PostCrmConnectionIdFileResponse;
import com.unifiedapi.unifiedto.models.shared.CrmFile;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmFileRaw;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("contaminate") {{
                    jwt = "";
                }})
                .build();

            PostCrmConnectionIdFileRequest req = new PostCrmConnectionIdFileRequest("standardization") {{
                crmFile = new CrmFile() {{
                    active = false;
                    activityId = "Manager";
                    companyId = "Florida Shoes East";
                    contactId = "Ohio loyally regarding";
                    createdAt = OffsetDateTime.parse("2022-08-05T21:17:21.878Z");
                    dealId = "indigo Delaware";
                    description = "Enhanced bifurcated structure";
                    fileName = "for_chips_under.gif";
                    fileSize = 9649.84d;
                    fileType = "video";
                    fileUrl = "Avon male";
                    id = "<ID>";
                    leadId = "Transgender";
                    raw = new PropertyCrmFileRaw();;
                    updatedAt = OffsetDateTime.parse("2021-11-20T07:00:09.078Z");
                    userId = "national Lead";
                }};;
            }};            

            PostCrmConnectionIdFileResponse res = sdk.crm.postCrmConnectionIdFile(req);

            if (res.crmFile != null) {
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
| `request`                                                                                                                              | [com.unifiedapi.unifiedto.models.operations.PostCrmConnectionIdFileRequest](../../models/operations/PostCrmConnectionIdFileRequest.md) | :heavy_check_mark:                                                                                                                     | The request object to use for the request.                                                                                             |


### Response

**[com.unifiedapi.unifiedto.models.operations.PostCrmConnectionIdFileResponse](../../models/operations/PostCrmConnectionIdFileResponse.md)**


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
                .setSecurity(new Security("merrily") {{
                    jwt = "";
                }})
                .build();

            PostCrmConnectionIdLeadRequest req = new PostCrmConnectionIdLeadRequest("overrun") {{
                crmLead = new CrmLead() {{
                    active = false;
                    address = new PropertyCrmLeadAddress() {{
                        address1 = "knowledge monthly";
                        address2 = "Ghana Clothing";
                        city = "South Herminio";
                        country = "Vietnam";
                        countryCode = "LB";
                        postalCode = "58522";
                        region = "Southeast Iowa";
                        regionCode = "skedaddle demanding scratch";
                    }};;
                    companyId = "calculating Xenogender driver";
                    contactId = "black port";
                    createdAt = OffsetDateTime.parse("2022-08-30T18:59:43.604Z");
                    creatorUserId = "engine";
                    emails = new com.unifiedapi.unifiedto.models.shared.CrmEmail[]{{
                        add(new CrmEmail() {{
                            email = "Florence_Beatty5@hotmail.com";
                            type = CrmEmailType.WORK;
                        }}),
                    }};
                    id = "<ID>";
                    name = "Consultant";
                    raw = new PropertyCrmLeadRaw();;
                    telephones = new com.unifiedapi.unifiedto.models.shared.CrmTelephone[]{{
                        add(new CrmTelephone("Minnesota") {{
                            telephone = "solutions gosh";
                            type = CrmTelephoneType.HOME;
                        }}),
                    }};
                    updatedAt = OffsetDateTime.parse("2023-01-03T19:46:34.554Z");
                    userId = "networks Southwest";
                }};;
            }};            

            PostCrmConnectionIdLeadResponse res = sdk.crm.postCrmConnectionIdLead(req);

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


## postCrmConnectionIdPipeline

Create a pipeline

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PostCrmConnectionIdPipelineRequest;
import com.unifiedapi.unifiedto.models.operations.PostCrmConnectionIdPipelineResponse;
import com.unifiedapi.unifiedto.models.shared.CrmPipeline;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmPipelineRaw;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("glean") {{
                    jwt = "";
                }})
                .build();

            PostCrmConnectionIdPipelineRequest req = new PostCrmConnectionIdPipelineRequest("Account") {{
                crmPipeline = new CrmPipeline() {{
                    active = false;
                    createdAt = OffsetDateTime.parse("2021-01-25T16:28:43.841Z");
                    dealProbability = false;
                    displayOrder = 5334.42d;
                    id = "<ID>";
                    name = "motivating";
                    raw = new PropertyCrmPipelineRaw();;
                    updatedAt = OffsetDateTime.parse("2021-01-20T13:44:14.220Z");
                }};;
            }};            

            PostCrmConnectionIdPipelineResponse res = sdk.crm.postCrmConnectionIdPipeline(req);

            if (res.crmPipeline != null) {
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
| `request`                                                                                                                                      | [com.unifiedapi.unifiedto.models.operations.PostCrmConnectionIdPipelineRequest](../../models/operations/PostCrmConnectionIdPipelineRequest.md) | :heavy_check_mark:                                                                                                                             | The request object to use for the request.                                                                                                     |


### Response

**[com.unifiedapi.unifiedto.models.operations.PostCrmConnectionIdPipelineResponse](../../models/operations/PostCrmConnectionIdPipelineResponse.md)**


## postCrmConnectionIdTeam

Create a team

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PostCrmConnectionIdTeamRequest;
import com.unifiedapi.unifiedto.models.operations.PostCrmConnectionIdTeamResponse;
import com.unifiedapi.unifiedto.models.shared.CrmTeam;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmTeamRaw;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("local") {{
                    jwt = "";
                }})
                .build();

            PostCrmConnectionIdTeamRequest req = new PostCrmConnectionIdTeamRequest("when") {{
                crmTeam = new CrmTeam() {{
                    createdAt = OffsetDateTime.parse("2022-02-04T15:43:12.746Z");
                    description = "Horizontal contextually-based orchestration";
                    id = "<ID>";
                    name = "bandwidth Legacy holistic";
                    raw = new PropertyCrmTeamRaw();;
                    updatedAt = OffsetDateTime.parse("2021-02-01T07:27:20.539Z");
                    userIds = new String[]{{
                        add("East"),
                    }};
                }};;
            }};            

            PostCrmConnectionIdTeamResponse res = sdk.crm.postCrmConnectionIdTeam(req);

            if (res.crmTeam != null) {
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
| `request`                                                                                                                              | [com.unifiedapi.unifiedto.models.operations.PostCrmConnectionIdTeamRequest](../../models/operations/PostCrmConnectionIdTeamRequest.md) | :heavy_check_mark:                                                                                                                     | The request object to use for the request.                                                                                             |


### Response

**[com.unifiedapi.unifiedto.models.operations.PostCrmConnectionIdTeamResponse](../../models/operations/PostCrmConnectionIdTeamResponse.md)**


## postCrmConnectionIdUser

Create a user

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PostCrmConnectionIdUserRequest;
import com.unifiedapi.unifiedto.models.operations.PostCrmConnectionIdUserResponse;
import com.unifiedapi.unifiedto.models.shared.CrmEmail;
import com.unifiedapi.unifiedto.models.shared.CrmEmailType;
import com.unifiedapi.unifiedto.models.shared.CrmTelephone;
import com.unifiedapi.unifiedto.models.shared.CrmTelephoneType;
import com.unifiedapi.unifiedto.models.shared.CrmUser;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmUserAddress;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmUserRaw;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("Soul") {{
                    jwt = "";
                }})
                .build();

            PostCrmConnectionIdUserRequest req = new PostCrmConnectionIdUserRequest("Abilene") {{
                crmUser = new CrmUser() {{
                    active = false;
                    address = new PropertyCrmUserAddress() {{
                        address1 = "brr port";
                        address2 = "Northeast like";
                        city = "Fort Guillermo";
                        country = "Cayman Islands";
                        countryCode = "BW";
                        postalCode = "34958";
                        region = "South";
                        regionCode = "morph an colossal";
                    }};;
                    createdAt = OffsetDateTime.parse("2021-02-02T08:27:21.693Z");
                    currency = "Cayman Islands Dollar";
                    department = "um";
                    division = "West sievert generating";
                    emails = new com.unifiedapi.unifiedto.models.shared.CrmEmail[]{{
                        add(new CrmEmail() {{
                            email = "Jadon_Schumm45@gmail.com";
                            type = CrmEmailType.HOME;
                        }}),
                    }};
                    id = "<ID>";
                    imageUrl = "radian Borders Southeast";
                    languageLocale = "Silicon Awesome Industrial";
                    name = "Mouse Accounts";
                    raw = new PropertyCrmUserRaw();;
                    telephones = new com.unifiedapi.unifiedto.models.shared.CrmTelephone[]{{
                        add(new CrmTelephone("integrate") {{
                            telephone = "ohm Southeast ROI";
                            type = CrmTelephoneType.MOBILE;
                        }}),
                    }};
                    timezone = "Europe/Amsterdam";
                    title = "Leannon";
                    updatedAt = OffsetDateTime.parse("2022-09-02T21:48:50.401Z");
                }};;
            }};            

            PostCrmConnectionIdUserResponse res = sdk.crm.postCrmConnectionIdUser(req);

            if (res.crmUser != null) {
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
| `request`                                                                                                                              | [com.unifiedapi.unifiedto.models.operations.PostCrmConnectionIdUserRequest](../../models/operations/PostCrmConnectionIdUserRequest.md) | :heavy_check_mark:                                                                                                                     | The request object to use for the request.                                                                                             |


### Response

**[com.unifiedapi.unifiedto.models.operations.PostCrmConnectionIdUserResponse](../../models/operations/PostCrmConnectionIdUserResponse.md)**


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
                .setSecurity(new Security("dicta") {{
                    jwt = "";
                }})
                .build();

            PutCrmConnectionIdCompanyIdRequest req = new PutCrmConnectionIdCompanyIdRequest("background", "Malaysian") {{
                crmCompany = new CrmCompany() {{
                    active = false;
                    address = new PropertyCrmCompanyAddress() {{
                        address1 = "Diesel bitterly";
                        address2 = "red overriding uniform";
                        city = "Robertsburgh";
                        country = "Nicaragua";
                        countryCode = "FO";
                        postalCode = "93827";
                        region = "trigger North";
                        regionCode = "invoice briefly";
                    }};;
                    createdAt = OffsetDateTime.parse("2023-11-09T10:26:12.787Z");
                    dealIds = new String[]{{
                        add("magenta"),
                    }};
                    emails = new com.unifiedapi.unifiedto.models.shared.CrmEmail[]{{
                        add(new CrmEmail() {{
                            email = "Travis_McClure@yahoo.com";
                            type = CrmEmailType.HOME;
                        }}),
                    }};
                    id = "<ID>";
                    name = "female";
                    raw = new PropertyCrmCompanyRaw();;
                    tags = new String[]{{
                        add("holistic"),
                    }};
                    telephones = new com.unifiedapi.unifiedto.models.shared.CrmTelephone[]{{
                        add(new CrmTelephone("Electric") {{
                            telephone = "lavender";
                            type = CrmTelephoneType.FAX;
                        }}),
                    }};
                    updatedAt = OffsetDateTime.parse("2021-10-31T18:09:08.755Z");
                    websites = new String[]{{
                        add("hard"),
                    }};
                }};;
            }};            

            PutCrmConnectionIdCompanyIdResponse res = sdk.crm.putCrmConnectionIdCompanyId(req);

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


## putCrmConnectionIdContactId

Update a contact

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdContactIdRequest;
import com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdContactIdResponse;
import com.unifiedapi.unifiedto.models.shared.CrmContact;
import com.unifiedapi.unifiedto.models.shared.CrmEmail;
import com.unifiedapi.unifiedto.models.shared.CrmEmailType;
import com.unifiedapi.unifiedto.models.shared.CrmTelephone;
import com.unifiedapi.unifiedto.models.shared.CrmTelephoneType;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmContactAddress;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmContactRaw;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("Outdoors") {{
                    jwt = "";
                }})
                .build();

            PutCrmConnectionIdContactIdRequest req = new PutCrmConnectionIdContactIdRequest("Credit", "laborum") {{
                crmContact = new CrmContact() {{
                    address = new PropertyCrmContactAddress() {{
                        address1 = "copy Coordinator Northwest";
                        address2 = "provided Mazda";
                        city = "Kiarrafurt";
                        country = "Latvia";
                        countryCode = "GP";
                        postalCode = "71632-5257";
                        region = "transmitting till Oriental";
                        regionCode = "Ways";
                    }};;
                    company = "Beatty Inc";
                    companyIds = new String[]{{
                        add("ugh"),
                    }};
                    createdAt = OffsetDateTime.parse("2021-02-15T11:20:20.781Z");
                    dealIds = new String[]{{
                        add("Gambia"),
                    }};
                    emails = new com.unifiedapi.unifiedto.models.shared.CrmEmail[]{{
                        add(new CrmEmail() {{
                            email = "Myron.Nicolas56@gmail.com";
                            type = CrmEmailType.OTHER;
                        }}),
                    }};
                    id = "<ID>";
                    name = "gah male Malagasy";
                    raw = new PropertyCrmContactRaw();;
                    telephones = new com.unifiedapi.unifiedto.models.shared.CrmTelephone[]{{
                        add(new CrmTelephone("Vermont") {{
                            telephone = "up Northeast";
                            type = CrmTelephoneType.FAX;
                        }}),
                    }};
                    title = "ew";
                    updatedAt = OffsetDateTime.parse("2022-03-04T13:25:22.825Z");
                }};;
            }};            

            PutCrmConnectionIdContactIdResponse res = sdk.crm.putCrmConnectionIdContactId(req);

            if (res.crmContact != null) {
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
| `request`                                                                                                                                      | [com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdContactIdRequest](../../models/operations/PutCrmConnectionIdContactIdRequest.md) | :heavy_check_mark:                                                                                                                             | The request object to use for the request.                                                                                                     |


### Response

**[com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdContactIdResponse](../../models/operations/PutCrmConnectionIdContactIdResponse.md)**


## putCrmConnectionIdDealId

Update a deal

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdDealIdRequest;
import com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdDealIdResponse;
import com.unifiedapi.unifiedto.models.shared.CrmDeal;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmDealRaw;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("Account") {{
                    jwt = "";
                }})
                .build();

            PutCrmConnectionIdDealIdRequest req = new PutCrmConnectionIdDealIdRequest("West", "laudantium") {{
                crmDeal = new CrmDeal() {{
                    amount = 1175.04d;
                    closedAt = OffsetDateTime.parse("2023-10-14T13:29:58.098Z");
                    createdAt = OffsetDateTime.parse("2022-10-24T03:12:54.428Z");
                    currency = "Zambian Kwacha";
                    id = "<ID>";
                    lostReason = "Developer magenta calculating";
                    name = "Gourde Chief";
                    pipeline = "program Nihonium Corporate";
                    probability = 4456.95d;
                    raw = new PropertyCrmDealRaw();;
                    source = "Tasty extranet";
                    stage = "Unbranded";
                    tags = new String[]{{
                        add("Bangladesh"),
                    }};
                    updatedAt = OffsetDateTime.parse("2022-10-01T16:47:53.632Z");
                    wonReason = "deter Montana";
                }};;
            }};            

            PutCrmConnectionIdDealIdResponse res = sdk.crm.putCrmConnectionIdDealId(req);

            if (res.crmDeal != null) {
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
| `request`                                                                                                                                | [com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdDealIdRequest](../../models/operations/PutCrmConnectionIdDealIdRequest.md) | :heavy_check_mark:                                                                                                                       | The request object to use for the request.                                                                                               |


### Response

**[com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdDealIdResponse](../../models/operations/PutCrmConnectionIdDealIdResponse.md)**


## putCrmConnectionIdEventId

Update a event

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdEventIdRequest;
import com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdEventIdResponse;
import com.unifiedapi.unifiedto.models.shared.CrmEvent;
import com.unifiedapi.unifiedto.models.shared.CrmEventType;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmEventCall;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmEventEmail;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmEventMeeting;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmEventNote;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmEventRaw;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmEventTask;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("Iron") {{
                    jwt = "";
                }})
                .build();

            PutCrmConnectionIdEventIdRequest req = new PutCrmConnectionIdEventIdRequest("marshmallow", "DNS") {{
                crmEvent = new CrmEvent() {{
                    call = new PropertyCrmEventCall() {{
                        description = "Ameliorated solution-oriented installation";
                        duration = 7468.95d;
                    }};;
                    companyIds = new String[]{{
                        add("naturalisation"),
                    }};
                    contactIds = new String[]{{
                        add("Hatchback"),
                    }};
                    createdAt = OffsetDateTime.parse("2022-07-29T22:06:09.835Z");
                    dealIds = new String[]{{
                        add("engineer"),
                    }};
                    email = new PropertyCrmEventEmail() {{
                        body = "Modern provided";
                        cc = new String[]{{
                            add("Markets"),
                        }};
                        from = "Human Card";
                        subject = "Screen Reggae";
                        to = new String[]{{
                            add("frenetically"),
                        }};
                    }};;
                    id = "<ID>";
                    meeting = new PropertyCrmEventMeeting() {{
                        description = "Down-sized systematic installation";
                        endAt = OffsetDateTime.parse("2023-10-23T15:46:53.856Z");
                        startAt = OffsetDateTime.parse("2023-05-31T07:59:54.819Z");
                        title = "portal";
                    }};;
                    note = new PropertyCrmEventNote() {{
                        description = "Assimilated 6th generation website";
                    }};;
                    raw = new PropertyCrmEventRaw();;
                    task = new PropertyCrmEventTask() {{
                        description = "Inverse client-server initiative";
                        name = "utilize nor";
                        status = "Customer sky";
                    }};;
                    type = CrmEventType.NOTE;
                    updatedAt = OffsetDateTime.parse("2023-07-27T14:02:37.510Z");
                }};;
            }};            

            PutCrmConnectionIdEventIdResponse res = sdk.crm.putCrmConnectionIdEventId(req);

            if (res.crmEvent != null) {
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
| `request`                                                                                                                                  | [com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdEventIdRequest](../../models/operations/PutCrmConnectionIdEventIdRequest.md) | :heavy_check_mark:                                                                                                                         | The request object to use for the request.                                                                                                 |


### Response

**[com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdEventIdResponse](../../models/operations/PutCrmConnectionIdEventIdResponse.md)**


## putCrmConnectionIdFileId

Update a file

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdFileIdRequest;
import com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdFileIdResponse;
import com.unifiedapi.unifiedto.models.shared.CrmFile;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmFileRaw;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("East") {{
                    jwt = "";
                }})
                .build();

            PutCrmConnectionIdFileIdRequest req = new PutCrmConnectionIdFileIdRequest("Checking", "South") {{
                crmFile = new CrmFile() {{
                    active = false;
                    activityId = "Southwest";
                    companyId = "brief";
                    contactId = "toward confiscate East";
                    createdAt = OffsetDateTime.parse("2021-07-09T08:13:21.861Z");
                    dealId = "Hip Suriname Tactics";
                    description = "Extended homogeneous forecast";
                    fileName = "framework_azure_metal.gif";
                    fileSize = 7410.83d;
                    fileType = "video";
                    fileUrl = "Cheese error Minnesota";
                    id = "<ID>";
                    leadId = "biplane Handcrafted";
                    raw = new PropertyCrmFileRaw();;
                    updatedAt = OffsetDateTime.parse("2021-02-25T14:09:45.532Z");
                    userId = "Implementation Fremont Rutherfordium";
                }};;
            }};            

            PutCrmConnectionIdFileIdResponse res = sdk.crm.putCrmConnectionIdFileId(req);

            if (res.crmFile != null) {
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
| `request`                                                                                                                                | [com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdFileIdRequest](../../models/operations/PutCrmConnectionIdFileIdRequest.md) | :heavy_check_mark:                                                                                                                       | The request object to use for the request.                                                                                               |


### Response

**[com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdFileIdResponse](../../models/operations/PutCrmConnectionIdFileIdResponse.md)**


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
                .setSecurity(new Security("Delaware") {{
                    jwt = "";
                }})
                .build();

            PutCrmConnectionIdLeadIdRequest req = new PutCrmConnectionIdLeadIdRequest("South", "Fish") {{
                crmLead = new CrmLead() {{
                    active = false;
                    address = new PropertyCrmLeadAddress() {{
                        address1 = "supposing Dorado Assistant";
                        address2 = "Nissan Kwacha female";
                        city = "Handboro";
                        country = "Cyprus";
                        countryCode = "BR";
                        postalCode = "24449-7716";
                        region = "models";
                        regionCode = "District";
                    }};;
                    companyId = "male";
                    contactId = "bunch edge";
                    createdAt = OffsetDateTime.parse("2021-04-03T18:08:02.798Z");
                    creatorUserId = "East Panama";
                    emails = new com.unifiedapi.unifiedto.models.shared.CrmEmail[]{{
                        add(new CrmEmail() {{
                            email = "Jamal20@yahoo.com";
                            type = CrmEmailType.WORK;
                        }}),
                    }};
                    id = "<ID>";
                    name = "pianist";
                    raw = new PropertyCrmLeadRaw();;
                    telephones = new com.unifiedapi.unifiedto.models.shared.CrmTelephone[]{{
                        add(new CrmTelephone("interface") {{
                            telephone = "caricature female";
                            type = CrmTelephoneType.HOME;
                        }}),
                    }};
                    updatedAt = OffsetDateTime.parse("2023-01-17T06:22:01.751Z");
                    userId = "Folding Tandem";
                }};;
            }};            

            PutCrmConnectionIdLeadIdResponse res = sdk.crm.putCrmConnectionIdLeadId(req);

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


## putCrmConnectionIdPipelineId

Update a pipeline

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdPipelineIdRequest;
import com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdPipelineIdResponse;
import com.unifiedapi.unifiedto.models.shared.CrmPipeline;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmPipelineRaw;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("Nevada") {{
                    jwt = "";
                }})
                .build();

            PutCrmConnectionIdPipelineIdRequest req = new PutCrmConnectionIdPipelineIdRequest("Bonita", "archive") {{
                crmPipeline = new CrmPipeline() {{
                    active = false;
                    createdAt = OffsetDateTime.parse("2022-02-09T07:18:58.841Z");
                    dealProbability = false;
                    displayOrder = 7464.57d;
                    id = "<ID>";
                    name = "meter";
                    raw = new PropertyCrmPipelineRaw();;
                    updatedAt = OffsetDateTime.parse("2023-08-26T13:09:17.139Z");
                }};;
            }};            

            PutCrmConnectionIdPipelineIdResponse res = sdk.crm.putCrmConnectionIdPipelineId(req);

            if (res.crmPipeline != null) {
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
| `request`                                                                                                                                        | [com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdPipelineIdRequest](../../models/operations/PutCrmConnectionIdPipelineIdRequest.md) | :heavy_check_mark:                                                                                                                               | The request object to use for the request.                                                                                                       |


### Response

**[com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdPipelineIdResponse](../../models/operations/PutCrmConnectionIdPipelineIdResponse.md)**


## putCrmConnectionIdTeamId

Update a team

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdTeamIdRequest;
import com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdTeamIdResponse;
import com.unifiedapi.unifiedto.models.shared.CrmTeam;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmTeamRaw;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("immense") {{
                    jwt = "";
                }})
                .build();

            PutCrmConnectionIdTeamIdRequest req = new PutCrmConnectionIdTeamIdRequest("Quality", "Orchestrator") {{
                crmTeam = new CrmTeam() {{
                    createdAt = OffsetDateTime.parse("2022-11-23T06:02:39.043Z");
                    description = "Multi-channelled methodical success";
                    id = "<ID>";
                    name = "Montebello as pixel";
                    raw = new PropertyCrmTeamRaw();;
                    updatedAt = OffsetDateTime.parse("2023-12-25T12:21:33.544Z");
                    userIds = new String[]{{
                        add("Southwest"),
                    }};
                }};;
            }};            

            PutCrmConnectionIdTeamIdResponse res = sdk.crm.putCrmConnectionIdTeamId(req);

            if (res.crmTeam != null) {
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
| `request`                                                                                                                                | [com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdTeamIdRequest](../../models/operations/PutCrmConnectionIdTeamIdRequest.md) | :heavy_check_mark:                                                                                                                       | The request object to use for the request.                                                                                               |


### Response

**[com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdTeamIdResponse](../../models/operations/PutCrmConnectionIdTeamIdResponse.md)**


## putCrmConnectionIdUserId

Update a user

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdUserIdRequest;
import com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdUserIdResponse;
import com.unifiedapi.unifiedto.models.shared.CrmEmail;
import com.unifiedapi.unifiedto.models.shared.CrmEmailType;
import com.unifiedapi.unifiedto.models.shared.CrmTelephone;
import com.unifiedapi.unifiedto.models.shared.CrmTelephoneType;
import com.unifiedapi.unifiedto.models.shared.CrmUser;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmUserAddress;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmUserRaw;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("Small") {{
                    jwt = "";
                }})
                .build();

            PutCrmConnectionIdUserIdRequest req = new PutCrmConnectionIdUserIdRequest("moratorium", "Oxygen") {{
                crmUser = new CrmUser() {{
                    active = false;
                    address = new PropertyCrmUserAddress() {{
                        address1 = "backing";
                        address2 = "Benin";
                        city = "Port Art";
                        country = "Djibouti";
                        countryCode = "IN";
                        postalCode = "07811";
                        region = "psst how overriding";
                        regionCode = "District Tricycle vaguely";
                    }};;
                    createdAt = OffsetDateTime.parse("2023-10-20T20:13:29.023Z");
                    currency = "Netherlands Antillian Guilder";
                    department = "bluetooth Argon Designer";
                    division = "wimp Colombia majestically";
                    emails = new com.unifiedapi.unifiedto.models.shared.CrmEmail[]{{
                        add(new CrmEmail() {{
                            email = "Yvette.Rolfson@gmail.com";
                            type = CrmEmailType.HOME;
                        }}),
                    }};
                    id = "<ID>";
                    imageUrl = "Plastic";
                    languageLocale = "deposit Central";
                    name = "Transexual Indiana gleefully";
                    raw = new PropertyCrmUserRaw();;
                    telephones = new com.unifiedapi.unifiedto.models.shared.CrmTelephone[]{{
                        add(new CrmTelephone("navigating") {{
                            telephone = "red compressing copy";
                            type = CrmTelephoneType.HOME;
                        }}),
                    }};
                    timezone = "America/Monterrey";
                    title = "Berkshire";
                    updatedAt = OffsetDateTime.parse("2021-03-26T04:25:18.533Z");
                }};;
            }};            

            PutCrmConnectionIdUserIdResponse res = sdk.crm.putCrmConnectionIdUserId(req);

            if (res.crmUser != null) {
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
| `request`                                                                                                                                | [com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdUserIdRequest](../../models/operations/PutCrmConnectionIdUserIdRequest.md) | :heavy_check_mark:                                                                                                                       | The request object to use for the request.                                                                                               |


### Response

**[com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdUserIdResponse](../../models/operations/PutCrmConnectionIdUserIdResponse.md)**

