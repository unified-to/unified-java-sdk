# Crm

### Available Operations

* [deleteCrmConnectionIdCompanyId](#deletecrmconnectionidcompanyid) - Remove a company
* [deleteCrmConnectionIdCompanyIdDealDealId](#deletecrmconnectionidcompanyiddealdealid) - Remove deal association from a company
* [deleteCrmConnectionIdContactId](#deletecrmconnectionidcontactid) - Remove a contact
* [deleteCrmConnectionIdContactIdCompanyCompanyId](#deletecrmconnectionidcontactidcompanycompanyid) - Remove company association from a contact
* [deleteCrmConnectionIdContactIdDealDealId](#deletecrmconnectionidcontactiddealdealid) - Remove deal association from a contact
* [deleteCrmConnectionIdDealId](#deletecrmconnectioniddealid) - Remove a deal
* [deleteCrmConnectionIdEventId](#deletecrmconnectionideventid) - Remove a event
* [deleteCrmConnectionIdEventIdCompanyCompanyId](#deletecrmconnectionideventidcompanycompanyid) - Remove company association from an event
* [deleteCrmConnectionIdEventIdContactContactId](#deletecrmconnectionideventidcontactcontactid) - Remove contact association from an event
* [deleteCrmConnectionIdEventIdDealDealId](#deletecrmconnectionideventiddealdealid) - Remove deal association from an event
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
* [patchCrmConnectionIdCompanyIdDealDealId](#patchcrmconnectionidcompanyiddealdealid) - Associate a deal with a company
* [patchCrmConnectionIdContactId](#patchcrmconnectionidcontactid) - Update a contact
* [patchCrmConnectionIdContactIdCompanyCompanyId](#patchcrmconnectionidcontactidcompanycompanyid) - Associate a company with a contact
* [patchCrmConnectionIdContactIdDealDealId](#patchcrmconnectionidcontactiddealdealid) - Associate a deal with a contact
* [patchCrmConnectionIdDealId](#patchcrmconnectioniddealid) - Update a deal
* [patchCrmConnectionIdEventId](#patchcrmconnectionideventid) - Update a event
* [patchCrmConnectionIdEventIdCompanyCompanyId](#patchcrmconnectionideventidcompanycompanyid) - Associate a company with an event
* [patchCrmConnectionIdEventIdContactContactId](#patchcrmconnectionideventidcontactcontactid) - Associate a contact with an event
* [patchCrmConnectionIdEventIdDealDealId](#patchcrmconnectionideventiddealdealid) - Associate a deal with an event
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
* [putCrmConnectionIdCompanyIdDealDealId](#putcrmconnectionidcompanyiddealdealid) - Associate a deal with a company
* [putCrmConnectionIdContactId](#putcrmconnectionidcontactid) - Update a contact
* [putCrmConnectionIdContactIdCompanyCompanyId](#putcrmconnectionidcontactidcompanycompanyid) - Associate a company with a contact
* [putCrmConnectionIdContactIdDealDealId](#putcrmconnectionidcontactiddealdealid) - Associate a deal with a contact
* [putCrmConnectionIdDealId](#putcrmconnectioniddealid) - Update a deal
* [putCrmConnectionIdEventId](#putcrmconnectionideventid) - Update a event
* [putCrmConnectionIdEventIdCompanyCompanyId](#putcrmconnectionideventidcompanycompanyid) - Associate a company with an event
* [putCrmConnectionIdEventIdContactContactId](#putcrmconnectionideventidcontactcontactid) - Associate a contact with an event
* [putCrmConnectionIdEventIdDealDealId](#putcrmconnectionideventiddealdealid) - Associate a deal with an event
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
import com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdCompanyIdSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            DeleteCrmConnectionIdCompanyIdRequest req = new DeleteCrmConnectionIdCompanyIdRequest("amet", "nemo");            

            DeleteCrmConnectionIdCompanyIdResponse res = sdk.crm.deleteCrmConnectionIdCompanyId(req, new DeleteCrmConnectionIdCompanyIdSecurity("ipsa") {{
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

            DeleteCrmConnectionIdCompanyIdDealDealIdRequest req = new DeleteCrmConnectionIdCompanyIdDealDealIdRequest("quisquam", "tenetur", "quas");            

            DeleteCrmConnectionIdCompanyIdDealDealIdResponse res = sdk.crm.deleteCrmConnectionIdCompanyIdDealDealId(req, new DeleteCrmConnectionIdCompanyIdDealDealIdSecurity("molestiae") {{
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


## deleteCrmConnectionIdContactId

Remove a contact

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdContactIdRequest;
import com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdContactIdResponse;
import com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdContactIdSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            DeleteCrmConnectionIdContactIdRequest req = new DeleteCrmConnectionIdContactIdRequest("aliquid", "asperiores");            

            DeleteCrmConnectionIdContactIdResponse res = sdk.crm.deleteCrmConnectionIdContactId(req, new DeleteCrmConnectionIdContactIdSecurity("a") {{
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
| `request`                                                                                                                                              | [com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdContactIdRequest](../../models/operations/DeleteCrmConnectionIdContactIdRequest.md)   | :heavy_check_mark:                                                                                                                                     | The request object to use for the request.                                                                                                             |
| `security`                                                                                                                                             | [com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdContactIdSecurity](../../models/operations/DeleteCrmConnectionIdContactIdSecurity.md) | :heavy_check_mark:                                                                                                                                     | The security requirements to use for the request.                                                                                                      |


### Response

**[com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdContactIdResponse](../../models/operations/DeleteCrmConnectionIdContactIdResponse.md)**


## deleteCrmConnectionIdContactIdCompanyCompanyId

Remove company association from a contact

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdContactIdCompanyCompanyIdRequest;
import com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdContactIdCompanyCompanyIdResponse;
import com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdContactIdCompanyCompanyIdSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            DeleteCrmConnectionIdContactIdCompanyCompanyIdRequest req = new DeleteCrmConnectionIdContactIdCompanyCompanyIdRequest("nobis", "perspiciatis", "accusantium");            

            DeleteCrmConnectionIdContactIdCompanyCompanyIdResponse res = sdk.crm.deleteCrmConnectionIdContactIdCompanyCompanyId(req, new DeleteCrmConnectionIdContactIdCompanyCompanyIdSecurity("dicta") {{
                jwt = "";
            }});

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

| Parameter                                                                                                                                                                              | Type                                                                                                                                                                                   | Required                                                                                                                                                                               | Description                                                                                                                                                                            |
| -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                                              | [com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdContactIdCompanyCompanyIdRequest](../../models/operations/DeleteCrmConnectionIdContactIdCompanyCompanyIdRequest.md)   | :heavy_check_mark:                                                                                                                                                                     | The request object to use for the request.                                                                                                                                             |
| `security`                                                                                                                                                                             | [com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdContactIdCompanyCompanyIdSecurity](../../models/operations/DeleteCrmConnectionIdContactIdCompanyCompanyIdSecurity.md) | :heavy_check_mark:                                                                                                                                                                     | The security requirements to use for the request.                                                                                                                                      |


### Response

**[com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdContactIdCompanyCompanyIdResponse](../../models/operations/DeleteCrmConnectionIdContactIdCompanyCompanyIdResponse.md)**


## deleteCrmConnectionIdContactIdDealDealId

Remove deal association from a contact

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdContactIdDealDealIdRequest;
import com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdContactIdDealDealIdResponse;
import com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdContactIdDealDealIdSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            DeleteCrmConnectionIdContactIdDealDealIdRequest req = new DeleteCrmConnectionIdContactIdDealDealIdRequest("minus", "commodi", "eveniet");            

            DeleteCrmConnectionIdContactIdDealDealIdResponse res = sdk.crm.deleteCrmConnectionIdContactIdDealDealId(req, new DeleteCrmConnectionIdContactIdDealDealIdSecurity("porro") {{
                jwt = "";
            }});

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

| Parameter                                                                                                                                                                  | Type                                                                                                                                                                       | Required                                                                                                                                                                   | Description                                                                                                                                                                |
| -------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                                  | [com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdContactIdDealDealIdRequest](../../models/operations/DeleteCrmConnectionIdContactIdDealDealIdRequest.md)   | :heavy_check_mark:                                                                                                                                                         | The request object to use for the request.                                                                                                                                 |
| `security`                                                                                                                                                                 | [com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdContactIdDealDealIdSecurity](../../models/operations/DeleteCrmConnectionIdContactIdDealDealIdSecurity.md) | :heavy_check_mark:                                                                                                                                                         | The security requirements to use for the request.                                                                                                                          |


### Response

**[com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdContactIdDealDealIdResponse](../../models/operations/DeleteCrmConnectionIdContactIdDealDealIdResponse.md)**


## deleteCrmConnectionIdDealId

Remove a deal

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdDealIdRequest;
import com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdDealIdResponse;
import com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdDealIdSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            DeleteCrmConnectionIdDealIdRequest req = new DeleteCrmConnectionIdDealIdRequest("tempore", "quidem");            

            DeleteCrmConnectionIdDealIdResponse res = sdk.crm.deleteCrmConnectionIdDealId(req, new DeleteCrmConnectionIdDealIdSecurity("modi") {{
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

| Parameter                                                                                                                                        | Type                                                                                                                                             | Required                                                                                                                                         | Description                                                                                                                                      |
| ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                        | [com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdDealIdRequest](../../models/operations/DeleteCrmConnectionIdDealIdRequest.md)   | :heavy_check_mark:                                                                                                                               | The request object to use for the request.                                                                                                       |
| `security`                                                                                                                                       | [com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdDealIdSecurity](../../models/operations/DeleteCrmConnectionIdDealIdSecurity.md) | :heavy_check_mark:                                                                                                                               | The security requirements to use for the request.                                                                                                |


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
import com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdEventIdSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            DeleteCrmConnectionIdEventIdRequest req = new DeleteCrmConnectionIdEventIdRequest("voluptates", "fugit");            

            DeleteCrmConnectionIdEventIdResponse res = sdk.crm.deleteCrmConnectionIdEventId(req, new DeleteCrmConnectionIdEventIdSecurity("eius") {{
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

| Parameter                                                                                                                                          | Type                                                                                                                                               | Required                                                                                                                                           | Description                                                                                                                                        |
| -------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                          | [com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdEventIdRequest](../../models/operations/DeleteCrmConnectionIdEventIdRequest.md)   | :heavy_check_mark:                                                                                                                                 | The request object to use for the request.                                                                                                         |
| `security`                                                                                                                                         | [com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdEventIdSecurity](../../models/operations/DeleteCrmConnectionIdEventIdSecurity.md) | :heavy_check_mark:                                                                                                                                 | The security requirements to use for the request.                                                                                                  |


### Response

**[com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdEventIdResponse](../../models/operations/DeleteCrmConnectionIdEventIdResponse.md)**


## deleteCrmConnectionIdEventIdCompanyCompanyId

Remove company association from an event

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdEventIdCompanyCompanyIdRequest;
import com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdEventIdCompanyCompanyIdResponse;
import com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdEventIdCompanyCompanyIdSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            DeleteCrmConnectionIdEventIdCompanyCompanyIdRequest req = new DeleteCrmConnectionIdEventIdCompanyCompanyIdRequest("sequi", "eligendi", "asperiores");            

            DeleteCrmConnectionIdEventIdCompanyCompanyIdResponse res = sdk.crm.deleteCrmConnectionIdEventIdCompanyCompanyId(req, new DeleteCrmConnectionIdEventIdCompanyCompanyIdSecurity("esse") {{
                jwt = "";
            }});

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

| Parameter                                                                                                                                                                          | Type                                                                                                                                                                               | Required                                                                                                                                                                           | Description                                                                                                                                                                        |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                                          | [com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdEventIdCompanyCompanyIdRequest](../../models/operations/DeleteCrmConnectionIdEventIdCompanyCompanyIdRequest.md)   | :heavy_check_mark:                                                                                                                                                                 | The request object to use for the request.                                                                                                                                         |
| `security`                                                                                                                                                                         | [com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdEventIdCompanyCompanyIdSecurity](../../models/operations/DeleteCrmConnectionIdEventIdCompanyCompanyIdSecurity.md) | :heavy_check_mark:                                                                                                                                                                 | The security requirements to use for the request.                                                                                                                                  |


### Response

**[com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdEventIdCompanyCompanyIdResponse](../../models/operations/DeleteCrmConnectionIdEventIdCompanyCompanyIdResponse.md)**


## deleteCrmConnectionIdEventIdContactContactId

Remove contact association from an event

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdEventIdContactContactIdRequest;
import com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdEventIdContactContactIdResponse;
import com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdEventIdContactContactIdSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            DeleteCrmConnectionIdEventIdContactContactIdRequest req = new DeleteCrmConnectionIdEventIdContactContactIdRequest("blanditiis", "sint", "repellat");            

            DeleteCrmConnectionIdEventIdContactContactIdResponse res = sdk.crm.deleteCrmConnectionIdEventIdContactContactId(req, new DeleteCrmConnectionIdEventIdContactContactIdSecurity("a") {{
                jwt = "";
            }});

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

| Parameter                                                                                                                                                                          | Type                                                                                                                                                                               | Required                                                                                                                                                                           | Description                                                                                                                                                                        |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                                          | [com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdEventIdContactContactIdRequest](../../models/operations/DeleteCrmConnectionIdEventIdContactContactIdRequest.md)   | :heavy_check_mark:                                                                                                                                                                 | The request object to use for the request.                                                                                                                                         |
| `security`                                                                                                                                                                         | [com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdEventIdContactContactIdSecurity](../../models/operations/DeleteCrmConnectionIdEventIdContactContactIdSecurity.md) | :heavy_check_mark:                                                                                                                                                                 | The security requirements to use for the request.                                                                                                                                  |


### Response

**[com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdEventIdContactContactIdResponse](../../models/operations/DeleteCrmConnectionIdEventIdContactContactIdResponse.md)**


## deleteCrmConnectionIdEventIdDealDealId

Remove deal association from an event

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdEventIdDealDealIdRequest;
import com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdEventIdDealDealIdResponse;
import com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdEventIdDealDealIdSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            DeleteCrmConnectionIdEventIdDealDealIdRequest req = new DeleteCrmConnectionIdEventIdDealDealIdRequest("animi", "maiores", "itaque");            

            DeleteCrmConnectionIdEventIdDealDealIdResponse res = sdk.crm.deleteCrmConnectionIdEventIdDealDealId(req, new DeleteCrmConnectionIdEventIdDealDealIdSecurity("nulla") {{
                jwt = "";
            }});

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

| Parameter                                                                                                                                                              | Type                                                                                                                                                                   | Required                                                                                                                                                               | Description                                                                                                                                                            |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                              | [com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdEventIdDealDealIdRequest](../../models/operations/DeleteCrmConnectionIdEventIdDealDealIdRequest.md)   | :heavy_check_mark:                                                                                                                                                     | The request object to use for the request.                                                                                                                             |
| `security`                                                                                                                                                             | [com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdEventIdDealDealIdSecurity](../../models/operations/DeleteCrmConnectionIdEventIdDealDealIdSecurity.md) | :heavy_check_mark:                                                                                                                                                     | The security requirements to use for the request.                                                                                                                      |


### Response

**[com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdEventIdDealDealIdResponse](../../models/operations/DeleteCrmConnectionIdEventIdDealDealIdResponse.md)**


## deleteCrmConnectionIdFileId

Remove a file

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdFileIdRequest;
import com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdFileIdResponse;
import com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdFileIdSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            DeleteCrmConnectionIdFileIdRequest req = new DeleteCrmConnectionIdFileIdRequest("deserunt", "corporis");            

            DeleteCrmConnectionIdFileIdResponse res = sdk.crm.deleteCrmConnectionIdFileId(req, new DeleteCrmConnectionIdFileIdSecurity("velit") {{
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

| Parameter                                                                                                                                        | Type                                                                                                                                             | Required                                                                                                                                         | Description                                                                                                                                      |
| ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                        | [com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdFileIdRequest](../../models/operations/DeleteCrmConnectionIdFileIdRequest.md)   | :heavy_check_mark:                                                                                                                               | The request object to use for the request.                                                                                                       |
| `security`                                                                                                                                       | [com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdFileIdSecurity](../../models/operations/DeleteCrmConnectionIdFileIdSecurity.md) | :heavy_check_mark:                                                                                                                               | The security requirements to use for the request.                                                                                                |


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
import com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdLeadIdSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            DeleteCrmConnectionIdLeadIdRequest req = new DeleteCrmConnectionIdLeadIdRequest("officiis", "enim");            

            DeleteCrmConnectionIdLeadIdResponse res = sdk.crm.deleteCrmConnectionIdLeadId(req, new DeleteCrmConnectionIdLeadIdSecurity("officia") {{
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

| Parameter                                                                                                                                        | Type                                                                                                                                             | Required                                                                                                                                         | Description                                                                                                                                      |
| ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                        | [com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdLeadIdRequest](../../models/operations/DeleteCrmConnectionIdLeadIdRequest.md)   | :heavy_check_mark:                                                                                                                               | The request object to use for the request.                                                                                                       |
| `security`                                                                                                                                       | [com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdLeadIdSecurity](../../models/operations/DeleteCrmConnectionIdLeadIdSecurity.md) | :heavy_check_mark:                                                                                                                               | The security requirements to use for the request.                                                                                                |


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
import com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdPipelineIdSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            DeleteCrmConnectionIdPipelineIdRequest req = new DeleteCrmConnectionIdPipelineIdRequest("saepe", "eum");            

            DeleteCrmConnectionIdPipelineIdResponse res = sdk.crm.deleteCrmConnectionIdPipelineId(req, new DeleteCrmConnectionIdPipelineIdSecurity("repudiandae") {{
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

| Parameter                                                                                                                                                | Type                                                                                                                                                     | Required                                                                                                                                                 | Description                                                                                                                                              |
| -------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                | [com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdPipelineIdRequest](../../models/operations/DeleteCrmConnectionIdPipelineIdRequest.md)   | :heavy_check_mark:                                                                                                                                       | The request object to use for the request.                                                                                                               |
| `security`                                                                                                                                               | [com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdPipelineIdSecurity](../../models/operations/DeleteCrmConnectionIdPipelineIdSecurity.md) | :heavy_check_mark:                                                                                                                                       | The security requirements to use for the request.                                                                                                        |


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
import com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdTeamIdSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            DeleteCrmConnectionIdTeamIdRequest req = new DeleteCrmConnectionIdTeamIdRequest("accusantium", "officia");            

            DeleteCrmConnectionIdTeamIdResponse res = sdk.crm.deleteCrmConnectionIdTeamId(req, new DeleteCrmConnectionIdTeamIdSecurity("impedit") {{
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

| Parameter                                                                                                                                        | Type                                                                                                                                             | Required                                                                                                                                         | Description                                                                                                                                      |
| ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                        | [com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdTeamIdRequest](../../models/operations/DeleteCrmConnectionIdTeamIdRequest.md)   | :heavy_check_mark:                                                                                                                               | The request object to use for the request.                                                                                                       |
| `security`                                                                                                                                       | [com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdTeamIdSecurity](../../models/operations/DeleteCrmConnectionIdTeamIdSecurity.md) | :heavy_check_mark:                                                                                                                               | The security requirements to use for the request.                                                                                                |


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
import com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdUserIdSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            DeleteCrmConnectionIdUserIdRequest req = new DeleteCrmConnectionIdUserIdRequest("quasi", "blanditiis");            

            DeleteCrmConnectionIdUserIdResponse res = sdk.crm.deleteCrmConnectionIdUserId(req, new DeleteCrmConnectionIdUserIdSecurity("eius") {{
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

| Parameter                                                                                                                                        | Type                                                                                                                                             | Required                                                                                                                                         | Description                                                                                                                                      |
| ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                        | [com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdUserIdRequest](../../models/operations/DeleteCrmConnectionIdUserIdRequest.md)   | :heavy_check_mark:                                                                                                                               | The request object to use for the request.                                                                                                       |
| `security`                                                                                                                                       | [com.unifiedapi.unifiedto.models.operations.DeleteCrmConnectionIdUserIdSecurity](../../models/operations/DeleteCrmConnectionIdUserIdSecurity.md) | :heavy_check_mark:                                                                                                                               | The security requirements to use for the request.                                                                                                |


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
import com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdCompanySecurity;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            GetCrmConnectionIdCompanyRequest req = new GetCrmConnectionIdCompanyRequest("quisquam") {{
                contactId = "eos";
                dealId = "nobis";
                limit = 6200.54d;
                offset = 7935.68d;
                order = "quia";
                query = "magnam";
                sort = "reprehenderit";
                updatedGte = OffsetDateTime.parse("2021-05-06T01:52:02.683Z");
            }};            

            GetCrmConnectionIdCompanyResponse res = sdk.crm.getCrmConnectionIdCompany(req, new GetCrmConnectionIdCompanySecurity("corrupti") {{
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

            GetCrmConnectionIdCompanyIdRequest req = new GetCrmConnectionIdCompanyIdRequest("amet", "molestiae");            

            GetCrmConnectionIdCompanyIdResponse res = sdk.crm.getCrmConnectionIdCompanyId(req, new GetCrmConnectionIdCompanyIdSecurity("amet") {{
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


## getCrmConnectionIdContact

List all contacts

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdContactRequest;
import com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdContactResponse;
import com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdContactSecurity;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            GetCrmConnectionIdContactRequest req = new GetCrmConnectionIdContactRequest("laborum") {{
                companyId = "modi";
                dealId = "perferendis";
                limit = 8970.58d;
                offset = 1023.16d;
                order = "molestias";
                query = "dolore";
                sort = "sunt";
                updatedGte = OffsetDateTime.parse("2022-05-21T12:17:59.359Z");
            }};            

            GetCrmConnectionIdContactResponse res = sdk.crm.getCrmConnectionIdContact(req, new GetCrmConnectionIdContactSecurity("odit") {{
                jwt = "";
            }});

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

| Parameter                                                                                                                                    | Type                                                                                                                                         | Required                                                                                                                                     | Description                                                                                                                                  |
| -------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                    | [com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdContactRequest](../../models/operations/GetCrmConnectionIdContactRequest.md)   | :heavy_check_mark:                                                                                                                           | The request object to use for the request.                                                                                                   |
| `security`                                                                                                                                   | [com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdContactSecurity](../../models/operations/GetCrmConnectionIdContactSecurity.md) | :heavy_check_mark:                                                                                                                           | The security requirements to use for the request.                                                                                            |


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
import com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdContactIdSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            GetCrmConnectionIdContactIdRequest req = new GetCrmConnectionIdContactIdRequest("earum", "veniam");            

            GetCrmConnectionIdContactIdResponse res = sdk.crm.getCrmConnectionIdContactId(req, new GetCrmConnectionIdContactIdSecurity("ipsam") {{
                jwt = "";
            }});

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

| Parameter                                                                                                                                        | Type                                                                                                                                             | Required                                                                                                                                         | Description                                                                                                                                      |
| ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                        | [com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdContactIdRequest](../../models/operations/GetCrmConnectionIdContactIdRequest.md)   | :heavy_check_mark:                                                                                                                               | The request object to use for the request.                                                                                                       |
| `security`                                                                                                                                       | [com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdContactIdSecurity](../../models/operations/GetCrmConnectionIdContactIdSecurity.md) | :heavy_check_mark:                                                                                                                               | The security requirements to use for the request.                                                                                                |


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
import com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdDealSecurity;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            GetCrmConnectionIdDealRequest req = new GetCrmConnectionIdDealRequest("eaque") {{
                companyId = "exercitationem";
                contactId = "veniam";
                limit = 4699.94d;
                offset = 3203.26d;
                order = "nisi";
                query = "tenetur";
                sort = "quis";
                updatedGte = OffsetDateTime.parse("2021-11-25T16:54:25.224Z");
            }};            

            GetCrmConnectionIdDealResponse res = sdk.crm.getCrmConnectionIdDeal(req, new GetCrmConnectionIdDealSecurity("suscipit") {{
                jwt = "";
            }});

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

| Parameter                                                                                                                              | Type                                                                                                                                   | Required                                                                                                                               | Description                                                                                                                            |
| -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                              | [com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdDealRequest](../../models/operations/GetCrmConnectionIdDealRequest.md)   | :heavy_check_mark:                                                                                                                     | The request object to use for the request.                                                                                             |
| `security`                                                                                                                             | [com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdDealSecurity](../../models/operations/GetCrmConnectionIdDealSecurity.md) | :heavy_check_mark:                                                                                                                     | The security requirements to use for the request.                                                                                      |


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
import com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdDealIdSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            GetCrmConnectionIdDealIdRequest req = new GetCrmConnectionIdDealIdRequest("pariatur", "sit");            

            GetCrmConnectionIdDealIdResponse res = sdk.crm.getCrmConnectionIdDealId(req, new GetCrmConnectionIdDealIdSecurity("quidem") {{
                jwt = "";
            }});

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

| Parameter                                                                                                                                  | Type                                                                                                                                       | Required                                                                                                                                   | Description                                                                                                                                |
| ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                  | [com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdDealIdRequest](../../models/operations/GetCrmConnectionIdDealIdRequest.md)   | :heavy_check_mark:                                                                                                                         | The request object to use for the request.                                                                                                 |
| `security`                                                                                                                                 | [com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdDealIdSecurity](../../models/operations/GetCrmConnectionIdDealIdSecurity.md) | :heavy_check_mark:                                                                                                                         | The security requirements to use for the request.                                                                                          |


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
import com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdEventSecurity;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            GetCrmConnectionIdEventRequest req = new GetCrmConnectionIdEventRequest("repellendus") {{
                companyId = "perferendis";
                contactId = "id";
                dealId = "sapiente";
                limit = 1523.64d;
                offset = 8235.72d;
                order = "repellat";
                query = "repudiandae";
                sort = "architecto";
                updatedGte = OffsetDateTime.parse("2022-02-18T12:04:35.830Z");
            }};            

            GetCrmConnectionIdEventResponse res = sdk.crm.getCrmConnectionIdEvent(req, new GetCrmConnectionIdEventSecurity("harum") {{
                jwt = "";
            }});

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

| Parameter                                                                                                                                | Type                                                                                                                                     | Required                                                                                                                                 | Description                                                                                                                              |
| ---------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                | [com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdEventRequest](../../models/operations/GetCrmConnectionIdEventRequest.md)   | :heavy_check_mark:                                                                                                                       | The request object to use for the request.                                                                                               |
| `security`                                                                                                                               | [com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdEventSecurity](../../models/operations/GetCrmConnectionIdEventSecurity.md) | :heavy_check_mark:                                                                                                                       | The security requirements to use for the request.                                                                                        |


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
import com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdEventIdSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            GetCrmConnectionIdEventIdRequest req = new GetCrmConnectionIdEventIdRequest("dolore", "voluptatibus");            

            GetCrmConnectionIdEventIdResponse res = sdk.crm.getCrmConnectionIdEventId(req, new GetCrmConnectionIdEventIdSecurity("iure") {{
                jwt = "";
            }});

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

| Parameter                                                                                                                                    | Type                                                                                                                                         | Required                                                                                                                                     | Description                                                                                                                                  |
| -------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                    | [com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdEventIdRequest](../../models/operations/GetCrmConnectionIdEventIdRequest.md)   | :heavy_check_mark:                                                                                                                           | The request object to use for the request.                                                                                                   |
| `security`                                                                                                                                   | [com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdEventIdSecurity](../../models/operations/GetCrmConnectionIdEventIdSecurity.md) | :heavy_check_mark:                                                                                                                           | The security requirements to use for the request.                                                                                            |


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
import com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdFileSecurity;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            GetCrmConnectionIdFileRequest req = new GetCrmConnectionIdFileRequest("explicabo") {{
                companyId = "minus";
                contactId = "soluta";
                dealId = "dolorum";
                limit = 2425.31d;
                offset = 9378.65d;
                order = "praesentium";
                query = "error";
                sort = "non";
                updatedGte = OffsetDateTime.parse("2022-05-09T02:28:59.420Z");
            }};            

            GetCrmConnectionIdFileResponse res = sdk.crm.getCrmConnectionIdFile(req, new GetCrmConnectionIdFileSecurity("accusamus") {{
                jwt = "";
            }});

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

| Parameter                                                                                                                              | Type                                                                                                                                   | Required                                                                                                                               | Description                                                                                                                            |
| -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                              | [com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdFileRequest](../../models/operations/GetCrmConnectionIdFileRequest.md)   | :heavy_check_mark:                                                                                                                     | The request object to use for the request.                                                                                             |
| `security`                                                                                                                             | [com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdFileSecurity](../../models/operations/GetCrmConnectionIdFileSecurity.md) | :heavy_check_mark:                                                                                                                     | The security requirements to use for the request.                                                                                      |


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
import com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdFileIdSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            GetCrmConnectionIdFileIdRequest req = new GetCrmConnectionIdFileIdRequest("harum", "cumque");            

            GetCrmConnectionIdFileIdResponse res = sdk.crm.getCrmConnectionIdFileId(req, new GetCrmConnectionIdFileIdSecurity("doloremque") {{
                jwt = "";
            }});

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

| Parameter                                                                                                                                  | Type                                                                                                                                       | Required                                                                                                                                   | Description                                                                                                                                |
| ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                  | [com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdFileIdRequest](../../models/operations/GetCrmConnectionIdFileIdRequest.md)   | :heavy_check_mark:                                                                                                                         | The request object to use for the request.                                                                                                 |
| `security`                                                                                                                                 | [com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdFileIdSecurity](../../models/operations/GetCrmConnectionIdFileIdSecurity.md) | :heavy_check_mark:                                                                                                                         | The security requirements to use for the request.                                                                                          |


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
import com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdLeadSecurity;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            GetCrmConnectionIdLeadRequest req = new GetCrmConnectionIdLeadRequest("expedita") {{
                limit = 5492.37d;
                offset = 537.33d;
                order = "deserunt";
                query = "aliquid";
                sort = "excepturi";
                updatedGte = OffsetDateTime.parse("2022-09-23T02:35:04.203Z");
            }};            

            GetCrmConnectionIdLeadResponse res = sdk.crm.getCrmConnectionIdLead(req, new GetCrmConnectionIdLeadSecurity("possimus") {{
                jwt = "";
            }});

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

| Parameter                                                                                                                              | Type                                                                                                                                   | Required                                                                                                                               | Description                                                                                                                            |
| -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                              | [com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdLeadRequest](../../models/operations/GetCrmConnectionIdLeadRequest.md)   | :heavy_check_mark:                                                                                                                     | The request object to use for the request.                                                                                             |
| `security`                                                                                                                             | [com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdLeadSecurity](../../models/operations/GetCrmConnectionIdLeadSecurity.md) | :heavy_check_mark:                                                                                                                     | The security requirements to use for the request.                                                                                      |


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
import com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdLeadIdSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            GetCrmConnectionIdLeadIdRequest req = new GetCrmConnectionIdLeadIdRequest("dolor", "rerum");            

            GetCrmConnectionIdLeadIdResponse res = sdk.crm.getCrmConnectionIdLeadId(req, new GetCrmConnectionIdLeadIdSecurity("sed") {{
                jwt = "";
            }});

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

| Parameter                                                                                                                                  | Type                                                                                                                                       | Required                                                                                                                                   | Description                                                                                                                                |
| ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                  | [com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdLeadIdRequest](../../models/operations/GetCrmConnectionIdLeadIdRequest.md)   | :heavy_check_mark:                                                                                                                         | The request object to use for the request.                                                                                                 |
| `security`                                                                                                                                 | [com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdLeadIdSecurity](../../models/operations/GetCrmConnectionIdLeadIdSecurity.md) | :heavy_check_mark:                                                                                                                         | The security requirements to use for the request.                                                                                          |


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
import com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdPipelineSecurity;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            GetCrmConnectionIdPipelineRequest req = new GetCrmConnectionIdPipelineRequest("accusamus") {{
                limit = 7598.74d;
                offset = 9665.76d;
                order = "minus";
                query = "quo";
                sort = "quos";
                updatedGte = OffsetDateTime.parse("2021-05-28T02:28:57.203Z");
            }};            

            GetCrmConnectionIdPipelineResponse res = sdk.crm.getCrmConnectionIdPipeline(req, new GetCrmConnectionIdPipelineSecurity("iste") {{
                jwt = "";
            }});

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

| Parameter                                                                                                                                      | Type                                                                                                                                           | Required                                                                                                                                       | Description                                                                                                                                    |
| ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                      | [com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdPipelineRequest](../../models/operations/GetCrmConnectionIdPipelineRequest.md)   | :heavy_check_mark:                                                                                                                             | The request object to use for the request.                                                                                                     |
| `security`                                                                                                                                     | [com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdPipelineSecurity](../../models/operations/GetCrmConnectionIdPipelineSecurity.md) | :heavy_check_mark:                                                                                                                             | The security requirements to use for the request.                                                                                              |


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
import com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdPipelineIdSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            GetCrmConnectionIdPipelineIdRequest req = new GetCrmConnectionIdPipelineIdRequest("corporis", "accusantium");            

            GetCrmConnectionIdPipelineIdResponse res = sdk.crm.getCrmConnectionIdPipelineId(req, new GetCrmConnectionIdPipelineIdSecurity("illo") {{
                jwt = "";
            }});

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

| Parameter                                                                                                                                          | Type                                                                                                                                               | Required                                                                                                                                           | Description                                                                                                                                        |
| -------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                          | [com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdPipelineIdRequest](../../models/operations/GetCrmConnectionIdPipelineIdRequest.md)   | :heavy_check_mark:                                                                                                                                 | The request object to use for the request.                                                                                                         |
| `security`                                                                                                                                         | [com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdPipelineIdSecurity](../../models/operations/GetCrmConnectionIdPipelineIdSecurity.md) | :heavy_check_mark:                                                                                                                                 | The security requirements to use for the request.                                                                                                  |


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
import com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdTeamSecurity;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            GetCrmConnectionIdTeamRequest req = new GetCrmConnectionIdTeamRequest("aut") {{
                limit = 9840.31d;
                offset = 3421.04d;
                order = "at";
                query = "possimus";
                sort = "neque";
                updatedGte = OffsetDateTime.parse("2021-09-22T18:52:21.045Z");
            }};            

            GetCrmConnectionIdTeamResponse res = sdk.crm.getCrmConnectionIdTeam(req, new GetCrmConnectionIdTeamSecurity("sapiente") {{
                jwt = "";
            }});

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

| Parameter                                                                                                                              | Type                                                                                                                                   | Required                                                                                                                               | Description                                                                                                                            |
| -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                              | [com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdTeamRequest](../../models/operations/GetCrmConnectionIdTeamRequest.md)   | :heavy_check_mark:                                                                                                                     | The request object to use for the request.                                                                                             |
| `security`                                                                                                                             | [com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdTeamSecurity](../../models/operations/GetCrmConnectionIdTeamSecurity.md) | :heavy_check_mark:                                                                                                                     | The security requirements to use for the request.                                                                                      |


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
import com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdTeamIdSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            GetCrmConnectionIdTeamIdRequest req = new GetCrmConnectionIdTeamIdRequest("mollitia", "quae");            

            GetCrmConnectionIdTeamIdResponse res = sdk.crm.getCrmConnectionIdTeamId(req, new GetCrmConnectionIdTeamIdSecurity("quos") {{
                jwt = "";
            }});

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

| Parameter                                                                                                                                  | Type                                                                                                                                       | Required                                                                                                                                   | Description                                                                                                                                |
| ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                  | [com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdTeamIdRequest](../../models/operations/GetCrmConnectionIdTeamIdRequest.md)   | :heavy_check_mark:                                                                                                                         | The request object to use for the request.                                                                                                 |
| `security`                                                                                                                                 | [com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdTeamIdSecurity](../../models/operations/GetCrmConnectionIdTeamIdSecurity.md) | :heavy_check_mark:                                                                                                                         | The security requirements to use for the request.                                                                                          |


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
import com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdUserSecurity;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            GetCrmConnectionIdUserRequest req = new GetCrmConnectionIdUserRequest("aperiam") {{
                limit = 2512d;
                offset = 9132.84d;
                order = "ad";
                query = "aliquam";
                sort = "quisquam";
                updatedGte = OffsetDateTime.parse("2022-09-04T09:51:46.699Z");
            }};            

            GetCrmConnectionIdUserResponse res = sdk.crm.getCrmConnectionIdUser(req, new GetCrmConnectionIdUserSecurity("maiores") {{
                jwt = "";
            }});

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

| Parameter                                                                                                                              | Type                                                                                                                                   | Required                                                                                                                               | Description                                                                                                                            |
| -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                              | [com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdUserRequest](../../models/operations/GetCrmConnectionIdUserRequest.md)   | :heavy_check_mark:                                                                                                                     | The request object to use for the request.                                                                                             |
| `security`                                                                                                                             | [com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdUserSecurity](../../models/operations/GetCrmConnectionIdUserSecurity.md) | :heavy_check_mark:                                                                                                                     | The security requirements to use for the request.                                                                                      |


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
import com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdUserIdSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            GetCrmConnectionIdUserIdRequest req = new GetCrmConnectionIdUserIdRequest("inventore", "aliquid");            

            GetCrmConnectionIdUserIdResponse res = sdk.crm.getCrmConnectionIdUserId(req, new GetCrmConnectionIdUserIdSecurity("laudantium") {{
                jwt = "";
            }});

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

| Parameter                                                                                                                                  | Type                                                                                                                                       | Required                                                                                                                                   | Description                                                                                                                                |
| ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                  | [com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdUserIdRequest](../../models/operations/GetCrmConnectionIdUserIdRequest.md)   | :heavy_check_mark:                                                                                                                         | The request object to use for the request.                                                                                                 |
| `security`                                                                                                                                 | [com.unifiedapi.unifiedto.models.operations.GetCrmConnectionIdUserIdSecurity](../../models/operations/GetCrmConnectionIdUserIdSecurity.md) | :heavy_check_mark:                                                                                                                         | The security requirements to use for the request.                                                                                          |


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

            PatchCrmConnectionIdCompanyIdRequest req = new PatchCrmConnectionIdCompanyIdRequest("est", "dolor") {{
                crmCompany = new CrmCompany() {{
                    active = false;
                    address = new PropertyCrmCompanyAddress() {{
                        address1 = "aliquid";
                        address2 = "consectetur";
                        city = "Lefflerstad";
                        country = "Liberia";
                        countryCode = "DM";
                        postalCode = "25215-0709";
                        region = "autem";
                        regionCode = "quidem";
                    }};;
                    createdAt = OffsetDateTime.parse("2021-06-09T17:30:04.825Z");
                    dealIds = new String[]{{
                        add("deserunt"),
                    }};
                    emails = new com.unifiedapi.unifiedto.models.shared.CrmEmail[]{{
                        add(new CrmEmail() {{
                            email = "Janis.Hintz@gmail.com";
                            type = CrmEmailType.WORK;
                        }}),
                    }};
                    id = "a04c495c-c699-4171-b51c-1bdb1cf4b888";
                    name = "Felipe Stracke";
                    raw = new PropertyCrmCompanyRaw();;
                    tags = new String[]{{
                        add("incidunt"),
                    }};
                    telephones = new com.unifiedapi.unifiedto.models.shared.CrmTelephone[]{{
                        add(new CrmTelephone("porro") {{
                            telephone = "quod";
                            type = CrmTelephoneType.FAX;
                        }}),
                    }};
                    updatedAt = OffsetDateTime.parse("2021-11-11T02:45:00.085Z");
                    websites = new String[]{{
                        add("occaecati"),
                    }};
                }};;
            }};            

            PatchCrmConnectionIdCompanyIdResponse res = sdk.crm.patchCrmConnectionIdCompanyId(req, new PatchCrmConnectionIdCompanyIdSecurity("libero") {{
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

            PatchCrmConnectionIdCompanyIdDealDealIdRequest req = new PatchCrmConnectionIdCompanyIdDealDealIdRequest("quo", "esse", "hic");            

            PatchCrmConnectionIdCompanyIdDealDealIdResponse res = sdk.crm.patchCrmConnectionIdCompanyIdDealDealId(req, new PatchCrmConnectionIdCompanyIdDealDealIdSecurity("maxime") {{
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


## patchCrmConnectionIdContactId

Update a contact

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdContactIdRequest;
import com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdContactIdResponse;
import com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdContactIdSecurity;
import com.unifiedapi.unifiedto.models.shared.CrmContact;
import com.unifiedapi.unifiedto.models.shared.CrmEmail;
import com.unifiedapi.unifiedto.models.shared.CrmEmailType;
import com.unifiedapi.unifiedto.models.shared.CrmTelephone;
import com.unifiedapi.unifiedto.models.shared.CrmTelephoneType;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmContactAddress;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmContactRaw;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            PatchCrmConnectionIdContactIdRequest req = new PatchCrmConnectionIdContactIdRequest("accusantium", "soluta") {{
                crmContact = new CrmContact() {{
                    address = new PropertyCrmContactAddress() {{
                        address1 = "fugit";
                        address2 = "pariatur";
                        city = "Walterton";
                        country = "American Samoa";
                        countryCode = "LI";
                        postalCode = "29217";
                        region = "doloremque";
                        regionCode = "voluptatem";
                    }};;
                    company = "Swift - Keeling";
                    companyIds = new String[]{{
                        add("reprehenderit"),
                    }};
                    createdAt = OffsetDateTime.parse("2021-12-30T06:04:09.758Z");
                    dealIds = new String[]{{
                        add("nihil"),
                    }};
                    emails = new com.unifiedapi.unifiedto.models.shared.CrmEmail[]{{
                        add(new CrmEmail() {{
                            email = "Maxime.Oberbrunner@yahoo.com";
                            type = CrmEmailType.HOME;
                        }}),
                    }};
                    id = "1a58208c-54fe-4fa9-895f-2eac5565d307";
                    name = "Emmett Walsh";
                    raw = new PropertyCrmContactRaw();;
                    telephones = new com.unifiedapi.unifiedto.models.shared.CrmTelephone[]{{
                        add(new CrmTelephone("sit") {{
                            telephone = "dicta";
                            type = CrmTelephoneType.WORK;
                        }}),
                    }};
                    title = "Mrs.";
                    updatedAt = OffsetDateTime.parse("2022-07-21T20:56:24.947Z");
                }};;
            }};            

            PatchCrmConnectionIdContactIdResponse res = sdk.crm.patchCrmConnectionIdContactId(req, new PatchCrmConnectionIdContactIdSecurity("deleniti") {{
                jwt = "";
            }});

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

| Parameter                                                                                                                                            | Type                                                                                                                                                 | Required                                                                                                                                             | Description                                                                                                                                          |
| ---------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                            | [com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdContactIdRequest](../../models/operations/PatchCrmConnectionIdContactIdRequest.md)   | :heavy_check_mark:                                                                                                                                   | The request object to use for the request.                                                                                                           |
| `security`                                                                                                                                           | [com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdContactIdSecurity](../../models/operations/PatchCrmConnectionIdContactIdSecurity.md) | :heavy_check_mark:                                                                                                                                   | The security requirements to use for the request.                                                                                                    |


### Response

**[com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdContactIdResponse](../../models/operations/PatchCrmConnectionIdContactIdResponse.md)**


## patchCrmConnectionIdContactIdCompanyCompanyId

Associate a company with a contact

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdContactIdCompanyCompanyIdRequest;
import com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdContactIdCompanyCompanyIdResponse;
import com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdContactIdCompanyCompanyIdSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            PatchCrmConnectionIdContactIdCompanyCompanyIdRequest req = new PatchCrmConnectionIdContactIdCompanyCompanyIdRequest("sunt", "nesciunt", "delectus");            

            PatchCrmConnectionIdContactIdCompanyCompanyIdResponse res = sdk.crm.patchCrmConnectionIdContactIdCompanyCompanyId(req, new PatchCrmConnectionIdContactIdCompanyCompanyIdSecurity("laborum") {{
                jwt = "";
            }});

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

| Parameter                                                                                                                                                                            | Type                                                                                                                                                                                 | Required                                                                                                                                                                             | Description                                                                                                                                                                          |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                            | [com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdContactIdCompanyCompanyIdRequest](../../models/operations/PatchCrmConnectionIdContactIdCompanyCompanyIdRequest.md)   | :heavy_check_mark:                                                                                                                                                                   | The request object to use for the request.                                                                                                                                           |
| `security`                                                                                                                                                                           | [com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdContactIdCompanyCompanyIdSecurity](../../models/operations/PatchCrmConnectionIdContactIdCompanyCompanyIdSecurity.md) | :heavy_check_mark:                                                                                                                                                                   | The security requirements to use for the request.                                                                                                                                    |


### Response

**[com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdContactIdCompanyCompanyIdResponse](../../models/operations/PatchCrmConnectionIdContactIdCompanyCompanyIdResponse.md)**


## patchCrmConnectionIdContactIdDealDealId

Associate a deal with a contact

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdContactIdDealDealIdRequest;
import com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdContactIdDealDealIdResponse;
import com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdContactIdDealDealIdSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            PatchCrmConnectionIdContactIdDealDealIdRequest req = new PatchCrmConnectionIdContactIdDealDealIdRequest("aliquam", "deserunt", "modi");            

            PatchCrmConnectionIdContactIdDealDealIdResponse res = sdk.crm.patchCrmConnectionIdContactIdDealDealId(req, new PatchCrmConnectionIdContactIdDealDealIdSecurity("sunt") {{
                jwt = "";
            }});

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

| Parameter                                                                                                                                                                | Type                                                                                                                                                                     | Required                                                                                                                                                                 | Description                                                                                                                                                              |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                | [com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdContactIdDealDealIdRequest](../../models/operations/PatchCrmConnectionIdContactIdDealDealIdRequest.md)   | :heavy_check_mark:                                                                                                                                                       | The request object to use for the request.                                                                                                                               |
| `security`                                                                                                                                                               | [com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdContactIdDealDealIdSecurity](../../models/operations/PatchCrmConnectionIdContactIdDealDealIdSecurity.md) | :heavy_check_mark:                                                                                                                                                       | The security requirements to use for the request.                                                                                                                        |


### Response

**[com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdContactIdDealDealIdResponse](../../models/operations/PatchCrmConnectionIdContactIdDealDealIdResponse.md)**


## patchCrmConnectionIdDealId

Update a deal

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdDealIdRequest;
import com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdDealIdResponse;
import com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdDealIdSecurity;
import com.unifiedapi.unifiedto.models.shared.CrmDeal;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmDealRaw;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            PatchCrmConnectionIdDealIdRequest req = new PatchCrmConnectionIdDealIdRequest("impedit", "eius") {{
                crmDeal = new CrmDeal() {{
                    amount = 5283.2d;
                    closedAt = OffsetDateTime.parse("2022-02-16T08:36:08.999Z");
                    createdAt = OffsetDateTime.parse("2022-01-01T01:16:49.496Z");
                    currency = "aspernatur";
                    id = "132af031-02d5-414f-8cc6-f18bf9621a6a";
                    lostReason = "dolore";
                    name = "Julio Koch";
                    pipeline = "esse";
                    probability = 9085.39d;
                    raw = new PropertyCrmDealRaw();;
                    source = "earum";
                    stage = "velit";
                    tags = new String[]{{
                        add("officiis"),
                    }};
                    updatedAt = OffsetDateTime.parse("2022-04-19T18:40:34.391Z");
                    wonReason = "itaque";
                }};;
            }};            

            PatchCrmConnectionIdDealIdResponse res = sdk.crm.patchCrmConnectionIdDealId(req, new PatchCrmConnectionIdDealIdSecurity("dignissimos") {{
                jwt = "";
            }});

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

| Parameter                                                                                                                                      | Type                                                                                                                                           | Required                                                                                                                                       | Description                                                                                                                                    |
| ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                      | [com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdDealIdRequest](../../models/operations/PatchCrmConnectionIdDealIdRequest.md)   | :heavy_check_mark:                                                                                                                             | The request object to use for the request.                                                                                                     |
| `security`                                                                                                                                     | [com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdDealIdSecurity](../../models/operations/PatchCrmConnectionIdDealIdSecurity.md) | :heavy_check_mark:                                                                                                                             | The security requirements to use for the request.                                                                                              |


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
import com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdEventIdSecurity;
import com.unifiedapi.unifiedto.models.shared.CrmEvent;
import com.unifiedapi.unifiedto.models.shared.CrmEventType;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmEventCall;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmEventEmail;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmEventMeeting;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmEventNote;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmEventRaw;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmEventTask;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            PatchCrmConnectionIdEventIdRequest req = new PatchCrmConnectionIdEventIdRequest("ipsam", "explicabo") {{
                crmEvent = new CrmEvent() {{
                    call = new PropertyCrmEventCall() {{
                        description = "impedit";
                        duration = 3970.14d;
                    }};;
                    companyIds = new String[]{{
                        add("quis"),
                    }};
                    contactIds = new String[]{{
                        add("facilis"),
                    }};
                    createdAt = OffsetDateTime.parse("2022-09-19T00:24:09.398Z");
                    dealIds = new String[]{{
                        add("quaerat"),
                    }};
                    email = new PropertyCrmEventEmail() {{
                        body = "architecto";
                        cc = new String[]{{
                            add("praesentium"),
                        }};
                        from = "eveniet";
                        subject = "dolor";
                        to = new String[]{{
                            add("expedita"),
                        }};
                    }};;
                    id = "b91c8d97-5e0e-4841-9d8f-84f144f3e07e";
                    meeting = new PropertyCrmEventMeeting() {{
                        description = "facere";
                        endAt = OffsetDateTime.parse("2020-09-10T21:26:41.283Z");
                        startAt = OffsetDateTime.parse("2022-04-28T13:38:24.038Z");
                        title = "Miss";
                    }};;
                    note = new PropertyCrmEventNote() {{
                        description = "ad";
                    }};;
                    raw = new PropertyCrmEventRaw();;
                    task = new PropertyCrmEventTask() {{
                        description = "reiciendis";
                        name = "Francis Osinski";
                        status = "omnis";
                    }};;
                    type = CrmEventType.NOTE;
                    updatedAt = OffsetDateTime.parse("2022-05-11T09:02:32.338Z");
                }};;
            }};            

            PatchCrmConnectionIdEventIdResponse res = sdk.crm.patchCrmConnectionIdEventId(req, new PatchCrmConnectionIdEventIdSecurity("cupiditate") {{
                jwt = "";
            }});

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

| Parameter                                                                                                                                        | Type                                                                                                                                             | Required                                                                                                                                         | Description                                                                                                                                      |
| ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                        | [com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdEventIdRequest](../../models/operations/PatchCrmConnectionIdEventIdRequest.md)   | :heavy_check_mark:                                                                                                                               | The request object to use for the request.                                                                                                       |
| `security`                                                                                                                                       | [com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdEventIdSecurity](../../models/operations/PatchCrmConnectionIdEventIdSecurity.md) | :heavy_check_mark:                                                                                                                               | The security requirements to use for the request.                                                                                                |


### Response

**[com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdEventIdResponse](../../models/operations/PatchCrmConnectionIdEventIdResponse.md)**


## patchCrmConnectionIdEventIdCompanyCompanyId

Associate a company with an event

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdEventIdCompanyCompanyIdRequest;
import com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdEventIdCompanyCompanyIdResponse;
import com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdEventIdCompanyCompanyIdSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            PatchCrmConnectionIdEventIdCompanyCompanyIdRequest req = new PatchCrmConnectionIdEventIdCompanyCompanyIdRequest("reprehenderit", "quia", "necessitatibus");            

            PatchCrmConnectionIdEventIdCompanyCompanyIdResponse res = sdk.crm.patchCrmConnectionIdEventIdCompanyCompanyId(req, new PatchCrmConnectionIdEventIdCompanyCompanyIdSecurity("accusantium") {{
                jwt = "";
            }});

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

| Parameter                                                                                                                                                                        | Type                                                                                                                                                                             | Required                                                                                                                                                                         | Description                                                                                                                                                                      |
| -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                                        | [com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdEventIdCompanyCompanyIdRequest](../../models/operations/PatchCrmConnectionIdEventIdCompanyCompanyIdRequest.md)   | :heavy_check_mark:                                                                                                                                                               | The request object to use for the request.                                                                                                                                       |
| `security`                                                                                                                                                                       | [com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdEventIdCompanyCompanyIdSecurity](../../models/operations/PatchCrmConnectionIdEventIdCompanyCompanyIdSecurity.md) | :heavy_check_mark:                                                                                                                                                               | The security requirements to use for the request.                                                                                                                                |


### Response

**[com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdEventIdCompanyCompanyIdResponse](../../models/operations/PatchCrmConnectionIdEventIdCompanyCompanyIdResponse.md)**


## patchCrmConnectionIdEventIdContactContactId

Associate a contact with an event

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdEventIdContactContactIdRequest;
import com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdEventIdContactContactIdResponse;
import com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdEventIdContactContactIdSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            PatchCrmConnectionIdEventIdContactContactIdRequest req = new PatchCrmConnectionIdEventIdContactContactIdRequest("ad", "nisi", "molestiae");            

            PatchCrmConnectionIdEventIdContactContactIdResponse res = sdk.crm.patchCrmConnectionIdEventIdContactContactId(req, new PatchCrmConnectionIdEventIdContactContactIdSecurity("quia") {{
                jwt = "";
            }});

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

| Parameter                                                                                                                                                                        | Type                                                                                                                                                                             | Required                                                                                                                                                                         | Description                                                                                                                                                                      |
| -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                                        | [com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdEventIdContactContactIdRequest](../../models/operations/PatchCrmConnectionIdEventIdContactContactIdRequest.md)   | :heavy_check_mark:                                                                                                                                                               | The request object to use for the request.                                                                                                                                       |
| `security`                                                                                                                                                                       | [com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdEventIdContactContactIdSecurity](../../models/operations/PatchCrmConnectionIdEventIdContactContactIdSecurity.md) | :heavy_check_mark:                                                                                                                                                               | The security requirements to use for the request.                                                                                                                                |


### Response

**[com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdEventIdContactContactIdResponse](../../models/operations/PatchCrmConnectionIdEventIdContactContactIdResponse.md)**


## patchCrmConnectionIdEventIdDealDealId

Associate a deal with an event

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdEventIdDealDealIdRequest;
import com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdEventIdDealDealIdResponse;
import com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdEventIdDealDealIdSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            PatchCrmConnectionIdEventIdDealDealIdRequest req = new PatchCrmConnectionIdEventIdDealDealIdRequest("laudantium", "sed", "odit");            

            PatchCrmConnectionIdEventIdDealDealIdResponse res = sdk.crm.patchCrmConnectionIdEventIdDealDealId(req, new PatchCrmConnectionIdEventIdDealDealIdSecurity("iusto") {{
                jwt = "";
            }});

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

| Parameter                                                                                                                                                            | Type                                                                                                                                                                 | Required                                                                                                                                                             | Description                                                                                                                                                          |
| -------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                            | [com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdEventIdDealDealIdRequest](../../models/operations/PatchCrmConnectionIdEventIdDealDealIdRequest.md)   | :heavy_check_mark:                                                                                                                                                   | The request object to use for the request.                                                                                                                           |
| `security`                                                                                                                                                           | [com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdEventIdDealDealIdSecurity](../../models/operations/PatchCrmConnectionIdEventIdDealDealIdSecurity.md) | :heavy_check_mark:                                                                                                                                                   | The security requirements to use for the request.                                                                                                                    |


### Response

**[com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdEventIdDealDealIdResponse](../../models/operations/PatchCrmConnectionIdEventIdDealDealIdResponse.md)**


## patchCrmConnectionIdFileId

Update a file

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdFileIdRequest;
import com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdFileIdResponse;
import com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdFileIdSecurity;
import com.unifiedapi.unifiedto.models.shared.CrmFile;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmFileRaw;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            PatchCrmConnectionIdFileIdRequest req = new PatchCrmConnectionIdFileIdRequest("expedita", "eos") {{
                crmFile = new CrmFile() {{
                    active = false;
                    activityId = "repellendus";
                    companyId = "nesciunt";
                    contactId = "ipsa";
                    createdAt = OffsetDateTime.parse("2022-06-02T06:52:03.773Z");
                    dealId = "esse";
                    description = "accusantium";
                    fileName = "distinctio";
                    fileSize = 9565.45d;
                    fileType = "quam";
                    fileUrl = "est";
                    id = "4fa87cf5-35a6-4fae-94eb-f60c321f023b";
                    leadId = "in";
                    raw = new PropertyCrmFileRaw();;
                    updatedAt = OffsetDateTime.parse("2022-03-01T11:57:51.552Z");
                    userId = "ratione";
                }};;
            }};            

            PatchCrmConnectionIdFileIdResponse res = sdk.crm.patchCrmConnectionIdFileId(req, new PatchCrmConnectionIdFileIdSecurity("dolor") {{
                jwt = "";
            }});

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

| Parameter                                                                                                                                      | Type                                                                                                                                           | Required                                                                                                                                       | Description                                                                                                                                    |
| ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                      | [com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdFileIdRequest](../../models/operations/PatchCrmConnectionIdFileIdRequest.md)   | :heavy_check_mark:                                                                                                                             | The request object to use for the request.                                                                                                     |
| `security`                                                                                                                                     | [com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdFileIdSecurity](../../models/operations/PatchCrmConnectionIdFileIdSecurity.md) | :heavy_check_mark:                                                                                                                             | The security requirements to use for the request.                                                                                              |


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
import com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdLeadIdSecurity;
import com.unifiedapi.unifiedto.models.shared.CrmEmail;
import com.unifiedapi.unifiedto.models.shared.CrmEmailType;
import com.unifiedapi.unifiedto.models.shared.CrmLead;
import com.unifiedapi.unifiedto.models.shared.CrmTelephone;
import com.unifiedapi.unifiedto.models.shared.CrmTelephoneType;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmLeadAddress;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmLeadRaw;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            PatchCrmConnectionIdLeadIdRequest req = new PatchCrmConnectionIdLeadIdRequest("nisi", "dignissimos") {{
                crmLead = new CrmLead() {{
                    active = false;
                    address = new PropertyCrmLeadAddress() {{
                        address1 = "reiciendis";
                        address2 = "itaque";
                        city = "Lake Alexannefield";
                        country = "Seychelles";
                        countryCode = "MC";
                        postalCode = "94590-6154";
                        region = "repellendus";
                        regionCode = "unde";
                    }};;
                    companyId = "alias";
                    contactId = "impedit";
                    createdAt = OffsetDateTime.parse("2022-08-03T05:21:55.275Z");
                    creatorUserId = "labore";
                    emails = new com.unifiedapi.unifiedto.models.shared.CrmEmail[]{{
                        add(new CrmEmail() {{
                            email = "Isac31@hotmail.com";
                            type = CrmEmailType.OTHER;
                        }}),
                    }};
                    id = "fbace188-b1c4-4ee2-88c6-ce611feeb1c7";
                    name = "Rudy Senger";
                    raw = new PropertyCrmLeadRaw();;
                    telephones = new com.unifiedapi.unifiedto.models.shared.CrmTelephone[]{{
                        add(new CrmTelephone("quod") {{
                            telephone = "saepe";
                            type = CrmTelephoneType.MOBILE;
                        }}),
                    }};
                    updatedAt = OffsetDateTime.parse("2022-09-09T12:14:58.711Z");
                    userId = "ipsum";
                }};;
            }};            

            PatchCrmConnectionIdLeadIdResponse res = sdk.crm.patchCrmConnectionIdLeadId(req, new PatchCrmConnectionIdLeadIdSecurity("ducimus") {{
                jwt = "";
            }});

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

| Parameter                                                                                                                                      | Type                                                                                                                                           | Required                                                                                                                                       | Description                                                                                                                                    |
| ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                      | [com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdLeadIdRequest](../../models/operations/PatchCrmConnectionIdLeadIdRequest.md)   | :heavy_check_mark:                                                                                                                             | The request object to use for the request.                                                                                                     |
| `security`                                                                                                                                     | [com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdLeadIdSecurity](../../models/operations/PatchCrmConnectionIdLeadIdSecurity.md) | :heavy_check_mark:                                                                                                                             | The security requirements to use for the request.                                                                                              |


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
import com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdPipelineIdSecurity;
import com.unifiedapi.unifiedto.models.shared.CrmPipeline;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmPipelineRaw;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            PatchCrmConnectionIdPipelineIdRequest req = new PatchCrmConnectionIdPipelineIdRequest("laudantium", "rerum") {{
                crmPipeline = new CrmPipeline() {{
                    active = false;
                    createdAt = OffsetDateTime.parse("2022-09-21T22:35:10.419Z");
                    dealProbability = false;
                    displayOrder = 3194.19d;
                    id = "317747dc-915a-4d2c-af5d-d6723dc0f5ae";
                    name = "Dixie Doyle";
                    raw = new PropertyCrmPipelineRaw();;
                    updatedAt = OffsetDateTime.parse("2022-01-03T11:57:21.616Z");
                }};;
            }};            

            PatchCrmConnectionIdPipelineIdResponse res = sdk.crm.patchCrmConnectionIdPipelineId(req, new PatchCrmConnectionIdPipelineIdSecurity("doloremque") {{
                jwt = "";
            }});

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

| Parameter                                                                                                                                              | Type                                                                                                                                                   | Required                                                                                                                                               | Description                                                                                                                                            |
| ------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                              | [com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdPipelineIdRequest](../../models/operations/PatchCrmConnectionIdPipelineIdRequest.md)   | :heavy_check_mark:                                                                                                                                     | The request object to use for the request.                                                                                                             |
| `security`                                                                                                                                             | [com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdPipelineIdSecurity](../../models/operations/PatchCrmConnectionIdPipelineIdSecurity.md) | :heavy_check_mark:                                                                                                                                     | The security requirements to use for the request.                                                                                                      |


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
import com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdTeamIdSecurity;
import com.unifiedapi.unifiedto.models.shared.CrmTeam;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmTeamRaw;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            PatchCrmConnectionIdTeamIdRequest req = new PatchCrmConnectionIdTeamIdRequest("perferendis", "laudantium") {{
                crmTeam = new CrmTeam() {{
                    createdAt = OffsetDateTime.parse("2022-06-15T09:26:04.551Z");
                    description = "molestiae";
                    id = "56143f5a-6c98-4b55-9540-80d40bcacc6c";
                    name = "Ismael Hudson";
                    raw = new PropertyCrmTeamRaw();;
                    updatedAt = OffsetDateTime.parse("2022-04-18T03:31:13.393Z");
                    userIds = new String[]{{
                        add("necessitatibus"),
                    }};
                }};;
            }};            

            PatchCrmConnectionIdTeamIdResponse res = sdk.crm.patchCrmConnectionIdTeamId(req, new PatchCrmConnectionIdTeamIdSecurity("maxime") {{
                jwt = "";
            }});

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

| Parameter                                                                                                                                      | Type                                                                                                                                           | Required                                                                                                                                       | Description                                                                                                                                    |
| ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                      | [com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdTeamIdRequest](../../models/operations/PatchCrmConnectionIdTeamIdRequest.md)   | :heavy_check_mark:                                                                                                                             | The request object to use for the request.                                                                                                     |
| `security`                                                                                                                                     | [com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdTeamIdSecurity](../../models/operations/PatchCrmConnectionIdTeamIdSecurity.md) | :heavy_check_mark:                                                                                                                             | The security requirements to use for the request.                                                                                              |


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
import com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdUserIdSecurity;
import com.unifiedapi.unifiedto.models.shared.CrmEmail;
import com.unifiedapi.unifiedto.models.shared.CrmEmailType;
import com.unifiedapi.unifiedto.models.shared.CrmTelephone;
import com.unifiedapi.unifiedto.models.shared.CrmTelephoneType;
import com.unifiedapi.unifiedto.models.shared.CrmUser;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmUserAddress;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmUserRaw;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            PatchCrmConnectionIdUserIdRequest req = new PatchCrmConnectionIdUserIdRequest("cupiditate", "voluptatem") {{
                crmUser = new CrmUser() {{
                    active = false;
                    address = new PropertyCrmUserAddress() {{
                        address1 = "provident";
                        address2 = "adipisci";
                        city = "West Zoiestead";
                        country = "Bulgaria";
                        countryCode = "IQ";
                        postalCode = "68133-1506";
                        region = "nobis";
                        regionCode = "tempora";
                    }};;
                    createdAt = OffsetDateTime.parse("2022-09-27T16:08:58.380Z");
                    currency = "expedita";
                    department = "aperiam";
                    division = "voluptates";
                    emails = new com.unifiedapi.unifiedto.models.shared.CrmEmail[]{{
                        add(new CrmEmail() {{
                            email = "Caden.Barrows41@hotmail.com";
                            type = CrmEmailType.WORK;
                        }}),
                    }};
                    id = "48fff639-a910-4abd-8ab6-2676696e1ec0";
                    imageUrl = "alias";
                    languageLocale = "qui";
                    name = "Evelyn Predovic";
                    raw = new PropertyCrmUserRaw();;
                    telephones = new com.unifiedapi.unifiedto.models.shared.CrmTelephone[]{{
                        add(new CrmTelephone("praesentium") {{
                            telephone = "exercitationem";
                            type = CrmTelephoneType.MOBILE;
                        }}),
                    }};
                    timezone = "unde";
                    title = "Miss";
                    updatedAt = OffsetDateTime.parse("2020-10-21T07:18:08.779Z");
                }};;
            }};            

            PatchCrmConnectionIdUserIdResponse res = sdk.crm.patchCrmConnectionIdUserId(req, new PatchCrmConnectionIdUserIdSecurity("amet") {{
                jwt = "";
            }});

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

| Parameter                                                                                                                                      | Type                                                                                                                                           | Required                                                                                                                                       | Description                                                                                                                                    |
| ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                      | [com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdUserIdRequest](../../models/operations/PatchCrmConnectionIdUserIdRequest.md)   | :heavy_check_mark:                                                                                                                             | The request object to use for the request.                                                                                                     |
| `security`                                                                                                                                     | [com.unifiedapi.unifiedto.models.operations.PatchCrmConnectionIdUserIdSecurity](../../models/operations/PatchCrmConnectionIdUserIdSecurity.md) | :heavy_check_mark:                                                                                                                             | The security requirements to use for the request.                                                                                              |


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

            PostCrmConnectionIdCompanyRequest req = new PostCrmConnectionIdCompanyRequest("debitis") {{
                crmCompany = new CrmCompany() {{
                    active = false;
                    address = new PropertyCrmCompanyAddress() {{
                        address1 = "nobis";
                        address2 = "asperiores";
                        city = "Palo Alto";
                        country = "Mali";
                        countryCode = "SX";
                        postalCode = "73358";
                        region = "earum";
                        regionCode = "doloremque";
                    }};;
                    createdAt = OffsetDateTime.parse("2022-12-31T20:46:54.246Z");
                    dealIds = new String[]{{
                        add("doloremque"),
                    }};
                    emails = new com.unifiedapi.unifiedto.models.shared.CrmEmail[]{{
                        add(new CrmEmail() {{
                            email = "Laurine_Koepp@gmail.com";
                            type = CrmEmailType.HOME;
                        }}),
                    }};
                    id = "1fa1cf20-688f-477c-9ffc-71dca163f2a3";
                    name = "Ken Bahringer";
                    raw = new PropertyCrmCompanyRaw();;
                    tags = new String[]{{
                        add("nihil"),
                    }};
                    telephones = new com.unifiedapi.unifiedto.models.shared.CrmTelephone[]{{
                        add(new CrmTelephone("velit") {{
                            telephone = "tenetur";
                            type = CrmTelephoneType.MOBILE;
                        }}),
                    }};
                    updatedAt = OffsetDateTime.parse("2022-10-01T15:23:25.886Z");
                    websites = new String[]{{
                        add("optio"),
                    }};
                }};;
            }};            

            PostCrmConnectionIdCompanyResponse res = sdk.crm.postCrmConnectionIdCompany(req, new PostCrmConnectionIdCompanySecurity("illum") {{
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


## postCrmConnectionIdContact

Create a contact

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PostCrmConnectionIdContactRequest;
import com.unifiedapi.unifiedto.models.operations.PostCrmConnectionIdContactResponse;
import com.unifiedapi.unifiedto.models.operations.PostCrmConnectionIdContactSecurity;
import com.unifiedapi.unifiedto.models.shared.CrmContact;
import com.unifiedapi.unifiedto.models.shared.CrmEmail;
import com.unifiedapi.unifiedto.models.shared.CrmEmailType;
import com.unifiedapi.unifiedto.models.shared.CrmTelephone;
import com.unifiedapi.unifiedto.models.shared.CrmTelephoneType;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmContactAddress;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmContactRaw;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            PostCrmConnectionIdContactRequest req = new PostCrmConnectionIdContactRequest("at") {{
                crmContact = new CrmContact() {{
                    address = new PropertyCrmContactAddress() {{
                        address1 = "tenetur";
                        address2 = "molestias";
                        city = "South Mariam";
                        country = "Montserrat";
                        countryCode = "TW";
                        postalCode = "05447";
                        region = "aliquid";
                        regionCode = "mollitia";
                    }};;
                    company = "Cassin, Bosco and Stokes";
                    companyIds = new String[]{{
                        add("magni"),
                    }};
                    createdAt = OffsetDateTime.parse("2021-04-19T15:00:10.201Z");
                    dealIds = new String[]{{
                        add("a"),
                    }};
                    emails = new com.unifiedapi.unifiedto.models.shared.CrmEmail[]{{
                        add(new CrmEmail() {{
                            email = "Leanna.Grady98@hotmail.com";
                            type = CrmEmailType.OTHER;
                        }}),
                    }};
                    id = "cd799390-066a-46d2-9000-355338cec086";
                    name = "Dr. Carlton Considine";
                    raw = new PropertyCrmContactRaw();;
                    telephones = new com.unifiedapi.unifiedto.models.shared.CrmTelephone[]{{
                        add(new CrmTelephone("consequuntur") {{
                            telephone = "dicta";
                            type = CrmTelephoneType.HOME;
                        }}),
                    }};
                    title = "Miss";
                    updatedAt = OffsetDateTime.parse("2022-07-04T05:47:00.578Z");
                }};;
            }};            

            PostCrmConnectionIdContactResponse res = sdk.crm.postCrmConnectionIdContact(req, new PostCrmConnectionIdContactSecurity("beatae") {{
                jwt = "";
            }});

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
| `request`                                                                                                                                      | [com.unifiedapi.unifiedto.models.operations.PostCrmConnectionIdContactRequest](../../models/operations/PostCrmConnectionIdContactRequest.md)   | :heavy_check_mark:                                                                                                                             | The request object to use for the request.                                                                                                     |
| `security`                                                                                                                                     | [com.unifiedapi.unifiedto.models.operations.PostCrmConnectionIdContactSecurity](../../models/operations/PostCrmConnectionIdContactSecurity.md) | :heavy_check_mark:                                                                                                                             | The security requirements to use for the request.                                                                                              |


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
import com.unifiedapi.unifiedto.models.operations.PostCrmConnectionIdDealSecurity;
import com.unifiedapi.unifiedto.models.shared.CrmDeal;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmDealRaw;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            PostCrmConnectionIdDealRequest req = new PostCrmConnectionIdDealRequest("sunt") {{
                crmDeal = new CrmDeal() {{
                    amount = 5658.45d;
                    closedAt = OffsetDateTime.parse("2022-07-31T14:45:14.723Z");
                    createdAt = OffsetDateTime.parse("2022-04-10T02:34:04.729Z");
                    currency = "molestias";
                    id = "e3c8db03-408d-46d3-a4ff-d455906d1263";
                    lostReason = "quibusdam";
                    name = "Patsy Torp";
                    pipeline = "corporis";
                    probability = 7975.27d;
                    raw = new PropertyCrmDealRaw();;
                    source = "dolores";
                    stage = "placeat";
                    tags = new String[]{{
                        add("excepturi"),
                    }};
                    updatedAt = OffsetDateTime.parse("2021-05-06T19:16:47.821Z");
                    wonReason = "dicta";
                }};;
            }};            

            PostCrmConnectionIdDealResponse res = sdk.crm.postCrmConnectionIdDeal(req, new PostCrmConnectionIdDealSecurity("sapiente") {{
                jwt = "";
            }});

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
| `request`                                                                                                                                | [com.unifiedapi.unifiedto.models.operations.PostCrmConnectionIdDealRequest](../../models/operations/PostCrmConnectionIdDealRequest.md)   | :heavy_check_mark:                                                                                                                       | The request object to use for the request.                                                                                               |
| `security`                                                                                                                               | [com.unifiedapi.unifiedto.models.operations.PostCrmConnectionIdDealSecurity](../../models/operations/PostCrmConnectionIdDealSecurity.md) | :heavy_check_mark:                                                                                                                       | The security requirements to use for the request.                                                                                        |


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
import com.unifiedapi.unifiedto.models.operations.PostCrmConnectionIdEventSecurity;
import com.unifiedapi.unifiedto.models.shared.CrmEvent;
import com.unifiedapi.unifiedto.models.shared.CrmEventType;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmEventCall;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmEventEmail;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmEventMeeting;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmEventNote;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmEventRaw;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmEventTask;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            PostCrmConnectionIdEventRequest req = new PostCrmConnectionIdEventRequest("ipsum") {{
                crmEvent = new CrmEvent() {{
                    call = new PropertyCrmEventCall() {{
                        description = "consequatur";
                        duration = 7428.99d;
                    }};;
                    companyIds = new String[]{{
                        add("necessitatibus"),
                    }};
                    contactIds = new String[]{{
                        add("sequi"),
                    }};
                    createdAt = OffsetDateTime.parse("2022-02-21T11:15:33.619Z");
                    dealIds = new String[]{{
                        add("adipisci"),
                    }};
                    email = new PropertyCrmEventEmail() {{
                        body = "magni";
                        cc = new String[]{{
                            add("aperiam"),
                        }};
                        from = "dolores";
                        subject = "illum";
                        to = new String[]{{
                            add("iusto"),
                        }};
                    }};;
                    id = "21657650-6641-4870-99d2-1f9ad030c4ec";
                    meeting = new PropertyCrmEventMeeting() {{
                        description = "maxime";
                        endAt = OffsetDateTime.parse("2022-11-22T20:02:33.919Z");
                        startAt = OffsetDateTime.parse("2022-12-25T09:16:06.861Z");
                        title = "Ms.";
                    }};;
                    note = new PropertyCrmEventNote() {{
                        description = "ratione";
                    }};;
                    raw = new PropertyCrmEventRaw();;
                    task = new PropertyCrmEventTask() {{
                        description = "iure";
                        name = "Mrs. Julia Morissette";
                        status = "facilis";
                    }};;
                    type = CrmEventType.TASK;
                    updatedAt = OffsetDateTime.parse("2022-12-26T13:28:32.312Z");
                }};;
            }};            

            PostCrmConnectionIdEventResponse res = sdk.crm.postCrmConnectionIdEvent(req, new PostCrmConnectionIdEventSecurity("quia") {{
                jwt = "";
            }});

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
| `request`                                                                                                                                  | [com.unifiedapi.unifiedto.models.operations.PostCrmConnectionIdEventRequest](../../models/operations/PostCrmConnectionIdEventRequest.md)   | :heavy_check_mark:                                                                                                                         | The request object to use for the request.                                                                                                 |
| `security`                                                                                                                                 | [com.unifiedapi.unifiedto.models.operations.PostCrmConnectionIdEventSecurity](../../models/operations/PostCrmConnectionIdEventSecurity.md) | :heavy_check_mark:                                                                                                                         | The security requirements to use for the request.                                                                                          |


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
import com.unifiedapi.unifiedto.models.operations.PostCrmConnectionIdFileSecurity;
import com.unifiedapi.unifiedto.models.shared.CrmFile;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmFileRaw;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            PostCrmConnectionIdFileRequest req = new PostCrmConnectionIdFileRequest("officia") {{
                crmFile = new CrmFile() {{
                    active = false;
                    activityId = "quaerat";
                    companyId = "corporis";
                    contactId = "accusamus";
                    createdAt = OffsetDateTime.parse("2022-01-16T03:15:23.830Z");
                    dealId = "esse";
                    description = "neque";
                    fileName = "quidem";
                    fileSize = 7884.69d;
                    fileType = "praesentium";
                    fileUrl = "tempora";
                    id = "5e320a31-9f4b-4adf-947c-9a867bc42426";
                    leadId = "eum";
                    raw = new PropertyCrmFileRaw();;
                    updatedAt = OffsetDateTime.parse("2022-09-05T22:14:53.060Z");
                    userId = "quos";
                }};;
            }};            

            PostCrmConnectionIdFileResponse res = sdk.crm.postCrmConnectionIdFile(req, new PostCrmConnectionIdFileSecurity("illo") {{
                jwt = "";
            }});

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
| `request`                                                                                                                                | [com.unifiedapi.unifiedto.models.operations.PostCrmConnectionIdFileRequest](../../models/operations/PostCrmConnectionIdFileRequest.md)   | :heavy_check_mark:                                                                                                                       | The request object to use for the request.                                                                                               |
| `security`                                                                                                                               | [com.unifiedapi.unifiedto.models.operations.PostCrmConnectionIdFileSecurity](../../models/operations/PostCrmConnectionIdFileSecurity.md) | :heavy_check_mark:                                                                                                                       | The security requirements to use for the request.                                                                                        |


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
import com.unifiedapi.unifiedto.models.operations.PostCrmConnectionIdLeadSecurity;
import com.unifiedapi.unifiedto.models.shared.CrmEmail;
import com.unifiedapi.unifiedto.models.shared.CrmEmailType;
import com.unifiedapi.unifiedto.models.shared.CrmLead;
import com.unifiedapi.unifiedto.models.shared.CrmTelephone;
import com.unifiedapi.unifiedto.models.shared.CrmTelephoneType;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmLeadAddress;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmLeadRaw;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            PostCrmConnectionIdLeadRequest req = new PostCrmConnectionIdLeadRequest("suscipit") {{
                crmLead = new CrmLead() {{
                    active = false;
                    address = new PropertyCrmLeadAddress() {{
                        address1 = "quibusdam";
                        address2 = "fugiat";
                        city = "Naderstad";
                        country = "Turkey";
                        countryCode = "WS";
                        postalCode = "09772";
                        region = "cumque";
                        regionCode = "ipsam";
                    }};;
                    companyId = "occaecati";
                    contactId = "ipsum";
                    createdAt = OffsetDateTime.parse("2020-08-20T00:05:02.582Z");
                    creatorUserId = "quasi";
                    emails = new com.unifiedapi.unifiedto.models.shared.CrmEmail[]{{
                        add(new CrmEmail() {{
                            email = "Orville_Spencer@gmail.com";
                            type = CrmEmailType.OTHER;
                        }}),
                    }};
                    id = "0ec7afed-bd80-4df4-88a4-7f9390c58880";
                    name = "Willard Erdman";
                    raw = new PropertyCrmLeadRaw();;
                    telephones = new com.unifiedapi.unifiedto.models.shared.CrmTelephone[]{{
                        add(new CrmTelephone("error") {{
                            telephone = "facilis";
                            type = CrmTelephoneType.MOBILE;
                        }}),
                    }};
                    updatedAt = OffsetDateTime.parse("2020-02-19T05:19:30.502Z");
                    userId = "consectetur";
                }};;
            }};            

            PostCrmConnectionIdLeadResponse res = sdk.crm.postCrmConnectionIdLead(req, new PostCrmConnectionIdLeadSecurity("sapiente") {{
                jwt = "";
            }});

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
| `request`                                                                                                                                | [com.unifiedapi.unifiedto.models.operations.PostCrmConnectionIdLeadRequest](../../models/operations/PostCrmConnectionIdLeadRequest.md)   | :heavy_check_mark:                                                                                                                       | The request object to use for the request.                                                                                               |
| `security`                                                                                                                               | [com.unifiedapi.unifiedto.models.operations.PostCrmConnectionIdLeadSecurity](../../models/operations/PostCrmConnectionIdLeadSecurity.md) | :heavy_check_mark:                                                                                                                       | The security requirements to use for the request.                                                                                        |


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
import com.unifiedapi.unifiedto.models.operations.PostCrmConnectionIdPipelineSecurity;
import com.unifiedapi.unifiedto.models.shared.CrmPipeline;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmPipelineRaw;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            PostCrmConnectionIdPipelineRequest req = new PostCrmConnectionIdPipelineRequest("voluptatibus") {{
                crmPipeline = new CrmPipeline() {{
                    active = false;
                    createdAt = OffsetDateTime.parse("2020-07-05T23:42:20.771Z");
                    dealProbability = false;
                    displayOrder = 6077.42d;
                    id = "f7f079af-4d35-4724-8db0-f4d281187d56";
                    name = "Joel Gutkowski";
                    raw = new PropertyCrmPipelineRaw();;
                    updatedAt = OffsetDateTime.parse("2020-06-20T11:05:09.885Z");
                }};;
            }};            

            PostCrmConnectionIdPipelineResponse res = sdk.crm.postCrmConnectionIdPipeline(req, new PostCrmConnectionIdPipelineSecurity("praesentium") {{
                jwt = "";
            }});

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
| `request`                                                                                                                                        | [com.unifiedapi.unifiedto.models.operations.PostCrmConnectionIdPipelineRequest](../../models/operations/PostCrmConnectionIdPipelineRequest.md)   | :heavy_check_mark:                                                                                                                               | The request object to use for the request.                                                                                                       |
| `security`                                                                                                                                       | [com.unifiedapi.unifiedto.models.operations.PostCrmConnectionIdPipelineSecurity](../../models/operations/PostCrmConnectionIdPipelineSecurity.md) | :heavy_check_mark:                                                                                                                               | The security requirements to use for the request.                                                                                                |


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
import com.unifiedapi.unifiedto.models.operations.PostCrmConnectionIdTeamSecurity;
import com.unifiedapi.unifiedto.models.shared.CrmTeam;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmTeamRaw;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            PostCrmConnectionIdTeamRequest req = new PostCrmConnectionIdTeamRequest("enim") {{
                crmTeam = new CrmTeam() {{
                    createdAt = OffsetDateTime.parse("2021-10-20T07:20:04.641Z");
                    description = "quae";
                    id = "65e628bd-fc20-432b-ac87-9923b7e13584";
                    name = "Roland Nolan Sr.";
                    raw = new PropertyCrmTeamRaw();;
                    updatedAt = OffsetDateTime.parse("2021-10-18T11:31:00.082Z");
                    userIds = new String[]{{
                        add("praesentium"),
                    }};
                }};;
            }};            

            PostCrmConnectionIdTeamResponse res = sdk.crm.postCrmConnectionIdTeam(req, new PostCrmConnectionIdTeamSecurity("natus") {{
                jwt = "";
            }});

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
| `request`                                                                                                                                | [com.unifiedapi.unifiedto.models.operations.PostCrmConnectionIdTeamRequest](../../models/operations/PostCrmConnectionIdTeamRequest.md)   | :heavy_check_mark:                                                                                                                       | The request object to use for the request.                                                                                               |
| `security`                                                                                                                               | [com.unifiedapi.unifiedto.models.operations.PostCrmConnectionIdTeamSecurity](../../models/operations/PostCrmConnectionIdTeamSecurity.md) | :heavy_check_mark:                                                                                                                       | The security requirements to use for the request.                                                                                        |


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
import com.unifiedapi.unifiedto.models.operations.PostCrmConnectionIdUserSecurity;
import com.unifiedapi.unifiedto.models.shared.CrmEmail;
import com.unifiedapi.unifiedto.models.shared.CrmEmailType;
import com.unifiedapi.unifiedto.models.shared.CrmTelephone;
import com.unifiedapi.unifiedto.models.shared.CrmTelephoneType;
import com.unifiedapi.unifiedto.models.shared.CrmUser;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmUserAddress;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmUserRaw;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            PostCrmConnectionIdUserRequest req = new PostCrmConnectionIdUserRequest("vitae") {{
                crmUser = new CrmUser() {{
                    active = false;
                    address = new PropertyCrmUserAddress() {{
                        address1 = "tenetur";
                        address2 = "laudantium";
                        city = "Port Terrenceland";
                        country = "Belarus";
                        countryCode = "GR";
                        postalCode = "04120";
                        region = "exercitationem";
                        regionCode = "amet";
                    }};;
                    createdAt = OffsetDateTime.parse("2022-07-19T04:55:29.262Z");
                    currency = "pariatur";
                    department = "minus";
                    division = "a";
                    emails = new com.unifiedapi.unifiedto.models.shared.CrmEmail[]{{
                        add(new CrmEmail() {{
                            email = "Josiah_McGlynn60@hotmail.com";
                            type = CrmEmailType.HOME;
                        }}),
                    }};
                    id = "5e356686-092e-49c3-9dc5-f111dea1026d";
                    imageUrl = "enim";
                    languageLocale = "numquam";
                    name = "Genevieve Hagenes V";
                    raw = new PropertyCrmUserRaw();;
                    telephones = new com.unifiedapi.unifiedto.models.shared.CrmTelephone[]{{
                        add(new CrmTelephone("officiis") {{
                            telephone = "alias";
                            type = CrmTelephoneType.MOBILE;
                        }}),
                    }};
                    timezone = "expedita";
                    title = "Mr.";
                    updatedAt = OffsetDateTime.parse("2022-07-06T22:32:03.724Z");
                }};;
            }};            

            PostCrmConnectionIdUserResponse res = sdk.crm.postCrmConnectionIdUser(req, new PostCrmConnectionIdUserSecurity("quas") {{
                jwt = "";
            }});

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
| `request`                                                                                                                                | [com.unifiedapi.unifiedto.models.operations.PostCrmConnectionIdUserRequest](../../models/operations/PostCrmConnectionIdUserRequest.md)   | :heavy_check_mark:                                                                                                                       | The request object to use for the request.                                                                                               |
| `security`                                                                                                                               | [com.unifiedapi.unifiedto.models.operations.PostCrmConnectionIdUserSecurity](../../models/operations/PostCrmConnectionIdUserSecurity.md) | :heavy_check_mark:                                                                                                                       | The security requirements to use for the request.                                                                                        |


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

            PutCrmConnectionIdCompanyIdRequest req = new PutCrmConnectionIdCompanyIdRequest("ipsa", "distinctio") {{
                crmCompany = new CrmCompany() {{
                    active = false;
                    address = new PropertyCrmCompanyAddress() {{
                        address1 = "placeat";
                        address2 = "quod";
                        city = "Balistrerifield";
                        country = "Puerto Rico";
                        countryCode = "PK";
                        postalCode = "87252-4059";
                        region = "facilis";
                        regionCode = "aliquam";
                    }};;
                    createdAt = OffsetDateTime.parse("2022-04-26T23:17:59.840Z");
                    dealIds = new String[]{{
                        add("natus"),
                    }};
                    emails = new com.unifiedapi.unifiedto.models.shared.CrmEmail[]{{
                        add(new CrmEmail() {{
                            email = "Shirley_Keeling6@gmail.com";
                            type = CrmEmailType.WORK;
                        }}),
                    }};
                    id = "8c4c4e54-599e-4a34-a260-e9b200ce78a1";
                    name = "Taylor Lueilwitz";
                    raw = new PropertyCrmCompanyRaw();;
                    tags = new String[]{{
                        add("in"),
                    }};
                    telephones = new com.unifiedapi.unifiedto.models.shared.CrmTelephone[]{{
                        add(new CrmTelephone("fuga") {{
                            telephone = "culpa";
                            type = CrmTelephoneType.WORK;
                        }}),
                    }};
                    updatedAt = OffsetDateTime.parse("2022-11-24T01:49:22.777Z");
                    websites = new String[]{{
                        add("suscipit"),
                    }};
                }};;
            }};            

            PutCrmConnectionIdCompanyIdResponse res = sdk.crm.putCrmConnectionIdCompanyId(req, new PutCrmConnectionIdCompanyIdSecurity("eligendi") {{
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

            PutCrmConnectionIdCompanyIdDealDealIdRequest req = new PutCrmConnectionIdCompanyIdDealDealIdRequest("officiis", "dignissimos", "fugit");            

            PutCrmConnectionIdCompanyIdDealDealIdResponse res = sdk.crm.putCrmConnectionIdCompanyIdDealDealId(req, new PutCrmConnectionIdCompanyIdDealDealIdSecurity("ratione") {{
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


## putCrmConnectionIdContactId

Update a contact

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdContactIdRequest;
import com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdContactIdResponse;
import com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdContactIdSecurity;
import com.unifiedapi.unifiedto.models.shared.CrmContact;
import com.unifiedapi.unifiedto.models.shared.CrmEmail;
import com.unifiedapi.unifiedto.models.shared.CrmEmailType;
import com.unifiedapi.unifiedto.models.shared.CrmTelephone;
import com.unifiedapi.unifiedto.models.shared.CrmTelephoneType;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmContactAddress;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmContactRaw;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            PutCrmConnectionIdContactIdRequest req = new PutCrmConnectionIdContactIdRequest("possimus", "quaerat") {{
                crmContact = new CrmContact() {{
                    address = new PropertyCrmContactAddress() {{
                        address1 = "aut";
                        address2 = "natus";
                        city = "Vinniefurt";
                        country = "Cocos (Keeling) Islands";
                        countryCode = "AZ";
                        postalCode = "66941-3716";
                        region = "dicta";
                        regionCode = "qui";
                    }};;
                    company = "Abshire Inc";
                    companyIds = new String[]{{
                        add("consequatur"),
                    }};
                    createdAt = OffsetDateTime.parse("2021-05-28T08:36:40.882Z");
                    dealIds = new String[]{{
                        add("velit"),
                    }};
                    emails = new com.unifiedapi.unifiedto.models.shared.CrmEmail[]{{
                        add(new CrmEmail() {{
                            email = "Fleta_Nolan48@hotmail.com";
                            type = CrmEmailType.HOME;
                        }}),
                    }};
                    id = "99d22e8c-1f84-4938-a5fd-c42c876c2c2d";
                    name = "Kerry Haag";
                    raw = new PropertyCrmContactRaw();;
                    telephones = new com.unifiedapi.unifiedto.models.shared.CrmTelephone[]{{
                        add(new CrmTelephone("nobis") {{
                            telephone = "quo";
                            type = CrmTelephoneType.WORK;
                        }}),
                    }};
                    title = "Ms.";
                    updatedAt = OffsetDateTime.parse("2022-11-14T16:32:12.833Z");
                }};;
            }};            

            PutCrmConnectionIdContactIdResponse res = sdk.crm.putCrmConnectionIdContactId(req, new PutCrmConnectionIdContactIdSecurity("sequi") {{
                jwt = "";
            }});

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

| Parameter                                                                                                                                        | Type                                                                                                                                             | Required                                                                                                                                         | Description                                                                                                                                      |
| ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                        | [com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdContactIdRequest](../../models/operations/PutCrmConnectionIdContactIdRequest.md)   | :heavy_check_mark:                                                                                                                               | The request object to use for the request.                                                                                                       |
| `security`                                                                                                                                       | [com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdContactIdSecurity](../../models/operations/PutCrmConnectionIdContactIdSecurity.md) | :heavy_check_mark:                                                                                                                               | The security requirements to use for the request.                                                                                                |


### Response

**[com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdContactIdResponse](../../models/operations/PutCrmConnectionIdContactIdResponse.md)**


## putCrmConnectionIdContactIdCompanyCompanyId

Associate a company with a contact

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdContactIdCompanyCompanyIdRequest;
import com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdContactIdCompanyCompanyIdResponse;
import com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdContactIdCompanyCompanyIdSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            PutCrmConnectionIdContactIdCompanyCompanyIdRequest req = new PutCrmConnectionIdContactIdCompanyCompanyIdRequest("alias", "reiciendis", "quos");            

            PutCrmConnectionIdContactIdCompanyCompanyIdResponse res = sdk.crm.putCrmConnectionIdContactIdCompanyCompanyId(req, new PutCrmConnectionIdContactIdCompanyCompanyIdSecurity("numquam") {{
                jwt = "";
            }});

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

| Parameter                                                                                                                                                                        | Type                                                                                                                                                                             | Required                                                                                                                                                                         | Description                                                                                                                                                                      |
| -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                                        | [com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdContactIdCompanyCompanyIdRequest](../../models/operations/PutCrmConnectionIdContactIdCompanyCompanyIdRequest.md)   | :heavy_check_mark:                                                                                                                                                               | The request object to use for the request.                                                                                                                                       |
| `security`                                                                                                                                                                       | [com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdContactIdCompanyCompanyIdSecurity](../../models/operations/PutCrmConnectionIdContactIdCompanyCompanyIdSecurity.md) | :heavy_check_mark:                                                                                                                                                               | The security requirements to use for the request.                                                                                                                                |


### Response

**[com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdContactIdCompanyCompanyIdResponse](../../models/operations/PutCrmConnectionIdContactIdCompanyCompanyIdResponse.md)**


## putCrmConnectionIdContactIdDealDealId

Associate a deal with a contact

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdContactIdDealDealIdRequest;
import com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdContactIdDealDealIdResponse;
import com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdContactIdDealDealIdSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            PutCrmConnectionIdContactIdDealDealIdRequest req = new PutCrmConnectionIdContactIdDealDealIdRequest("vitae", "maiores", "nam");            

            PutCrmConnectionIdContactIdDealDealIdResponse res = sdk.crm.putCrmConnectionIdContactIdDealDealId(req, new PutCrmConnectionIdContactIdDealDealIdSecurity("architecto") {{
                jwt = "";
            }});

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

| Parameter                                                                                                                                                            | Type                                                                                                                                                                 | Required                                                                                                                                                             | Description                                                                                                                                                          |
| -------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                            | [com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdContactIdDealDealIdRequest](../../models/operations/PutCrmConnectionIdContactIdDealDealIdRequest.md)   | :heavy_check_mark:                                                                                                                                                   | The request object to use for the request.                                                                                                                           |
| `security`                                                                                                                                                           | [com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdContactIdDealDealIdSecurity](../../models/operations/PutCrmConnectionIdContactIdDealDealIdSecurity.md) | :heavy_check_mark:                                                                                                                                                   | The security requirements to use for the request.                                                                                                                    |


### Response

**[com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdContactIdDealDealIdResponse](../../models/operations/PutCrmConnectionIdContactIdDealDealIdResponse.md)**


## putCrmConnectionIdDealId

Update a deal

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdDealIdRequest;
import com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdDealIdResponse;
import com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdDealIdSecurity;
import com.unifiedapi.unifiedto.models.shared.CrmDeal;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmDealRaw;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            PutCrmConnectionIdDealIdRequest req = new PutCrmConnectionIdDealIdRequest("rerum", "assumenda") {{
                crmDeal = new CrmDeal() {{
                    amount = 1763.33d;
                    closedAt = OffsetDateTime.parse("2022-01-22T06:20:19.804Z");
                    createdAt = OffsetDateTime.parse("2020-11-02T10:58:44.985Z");
                    currency = "ab";
                    id = "4db6be5a-6859-498e-a2ae-20da16fc2b27";
                    lostReason = "ab";
                    name = "Louis Kuvalis";
                    pipeline = "ullam";
                    probability = 4760.84d;
                    raw = new PropertyCrmDealRaw();;
                    source = "itaque";
                    stage = "rem";
                    tags = new String[]{{
                        add("nemo"),
                    }};
                    updatedAt = OffsetDateTime.parse("2022-01-27T23:00:05.341Z");
                    wonReason = "omnis";
                }};;
            }};            

            PutCrmConnectionIdDealIdResponse res = sdk.crm.putCrmConnectionIdDealId(req, new PutCrmConnectionIdDealIdSecurity("ipsa") {{
                jwt = "";
            }});

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

| Parameter                                                                                                                                  | Type                                                                                                                                       | Required                                                                                                                                   | Description                                                                                                                                |
| ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                  | [com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdDealIdRequest](../../models/operations/PutCrmConnectionIdDealIdRequest.md)   | :heavy_check_mark:                                                                                                                         | The request object to use for the request.                                                                                                 |
| `security`                                                                                                                                 | [com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdDealIdSecurity](../../models/operations/PutCrmConnectionIdDealIdSecurity.md) | :heavy_check_mark:                                                                                                                         | The security requirements to use for the request.                                                                                          |


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
import com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdEventIdSecurity;
import com.unifiedapi.unifiedto.models.shared.CrmEvent;
import com.unifiedapi.unifiedto.models.shared.CrmEventType;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmEventCall;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmEventEmail;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmEventMeeting;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmEventNote;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmEventRaw;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmEventTask;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            PutCrmConnectionIdEventIdRequest req = new PutCrmConnectionIdEventIdRequest("aliquam", "dolor") {{
                crmEvent = new CrmEvent() {{
                    call = new PropertyCrmEventCall() {{
                        description = "occaecati";
                        duration = 8426.78d;
                    }};;
                    companyIds = new String[]{{
                        add("magni"),
                    }};
                    contactIds = new String[]{{
                        add("consequuntur"),
                    }};
                    createdAt = OffsetDateTime.parse("2022-09-28T00:11:15.137Z");
                    dealIds = new String[]{{
                        add("commodi"),
                    }};
                    email = new PropertyCrmEventEmail() {{
                        body = "ipsam";
                        cc = new String[]{{
                            add("vel"),
                        }};
                        from = "cupiditate";
                        subject = "modi";
                        to = new String[]{{
                            add("nisi"),
                        }};
                    }};;
                    id = "2407084f-7ab3-47ce-b022-25194db55410";
                    meeting = new PropertyCrmEventMeeting() {{
                        description = "similique";
                        endAt = OffsetDateTime.parse("2020-09-04T05:22:03.669Z");
                        startAt = OffsetDateTime.parse("2022-08-06T03:50:10.911Z");
                        title = "Ms.";
                    }};;
                    note = new PropertyCrmEventNote() {{
                        description = "est";
                    }};;
                    raw = new PropertyCrmEventRaw();;
                    task = new PropertyCrmEventTask() {{
                        description = "doloribus";
                        name = "James Nolan";
                        status = "quo";
                    }};;
                    type = CrmEventType.TASK;
                    updatedAt = OffsetDateTime.parse("2020-07-22T15:07:27.879Z");
                }};;
            }};            

            PutCrmConnectionIdEventIdResponse res = sdk.crm.putCrmConnectionIdEventId(req, new PutCrmConnectionIdEventIdSecurity("impedit") {{
                jwt = "";
            }});

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

| Parameter                                                                                                                                    | Type                                                                                                                                         | Required                                                                                                                                     | Description                                                                                                                                  |
| -------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                    | [com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdEventIdRequest](../../models/operations/PutCrmConnectionIdEventIdRequest.md)   | :heavy_check_mark:                                                                                                                           | The request object to use for the request.                                                                                                   |
| `security`                                                                                                                                   | [com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdEventIdSecurity](../../models/operations/PutCrmConnectionIdEventIdSecurity.md) | :heavy_check_mark:                                                                                                                           | The security requirements to use for the request.                                                                                            |


### Response

**[com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdEventIdResponse](../../models/operations/PutCrmConnectionIdEventIdResponse.md)**


## putCrmConnectionIdEventIdCompanyCompanyId

Associate a company with an event

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdEventIdCompanyCompanyIdRequest;
import com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdEventIdCompanyCompanyIdResponse;
import com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdEventIdCompanyCompanyIdSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            PutCrmConnectionIdEventIdCompanyCompanyIdRequest req = new PutCrmConnectionIdEventIdCompanyCompanyIdRequest("cupiditate", "deleniti", "quasi");            

            PutCrmConnectionIdEventIdCompanyCompanyIdResponse res = sdk.crm.putCrmConnectionIdEventIdCompanyCompanyId(req, new PutCrmConnectionIdEventIdCompanyCompanyIdSecurity("maiores") {{
                jwt = "";
            }});

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

| Parameter                                                                                                                                                                    | Type                                                                                                                                                                         | Required                                                                                                                                                                     | Description                                                                                                                                                                  |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                                    | [com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdEventIdCompanyCompanyIdRequest](../../models/operations/PutCrmConnectionIdEventIdCompanyCompanyIdRequest.md)   | :heavy_check_mark:                                                                                                                                                           | The request object to use for the request.                                                                                                                                   |
| `security`                                                                                                                                                                   | [com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdEventIdCompanyCompanyIdSecurity](../../models/operations/PutCrmConnectionIdEventIdCompanyCompanyIdSecurity.md) | :heavy_check_mark:                                                                                                                                                           | The security requirements to use for the request.                                                                                                                            |


### Response

**[com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdEventIdCompanyCompanyIdResponse](../../models/operations/PutCrmConnectionIdEventIdCompanyCompanyIdResponse.md)**


## putCrmConnectionIdEventIdContactContactId

Associate a contact with an event

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdEventIdContactContactIdRequest;
import com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdEventIdContactContactIdResponse;
import com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdEventIdContactContactIdSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            PutCrmConnectionIdEventIdContactContactIdRequest req = new PutCrmConnectionIdEventIdContactContactIdRequest("voluptatem", "aliquid", "laudantium");            

            PutCrmConnectionIdEventIdContactContactIdResponse res = sdk.crm.putCrmConnectionIdEventIdContactContactId(req, new PutCrmConnectionIdEventIdContactContactIdSecurity("unde") {{
                jwt = "";
            }});

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

| Parameter                                                                                                                                                                    | Type                                                                                                                                                                         | Required                                                                                                                                                                     | Description                                                                                                                                                                  |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                                    | [com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdEventIdContactContactIdRequest](../../models/operations/PutCrmConnectionIdEventIdContactContactIdRequest.md)   | :heavy_check_mark:                                                                                                                                                           | The request object to use for the request.                                                                                                                                   |
| `security`                                                                                                                                                                   | [com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdEventIdContactContactIdSecurity](../../models/operations/PutCrmConnectionIdEventIdContactContactIdSecurity.md) | :heavy_check_mark:                                                                                                                                                           | The security requirements to use for the request.                                                                                                                            |


### Response

**[com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdEventIdContactContactIdResponse](../../models/operations/PutCrmConnectionIdEventIdContactContactIdResponse.md)**


## putCrmConnectionIdEventIdDealDealId

Associate a deal with an event

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdEventIdDealDealIdRequest;
import com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdEventIdDealDealIdResponse;
import com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdEventIdDealDealIdSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            PutCrmConnectionIdEventIdDealDealIdRequest req = new PutCrmConnectionIdEventIdDealDealIdRequest("corrupti", "quae", "facere");            

            PutCrmConnectionIdEventIdDealDealIdResponse res = sdk.crm.putCrmConnectionIdEventIdDealDealId(req, new PutCrmConnectionIdEventIdDealDealIdSecurity("ea") {{
                jwt = "";
            }});

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

| Parameter                                                                                                                                                        | Type                                                                                                                                                             | Required                                                                                                                                                         | Description                                                                                                                                                      |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                        | [com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdEventIdDealDealIdRequest](../../models/operations/PutCrmConnectionIdEventIdDealDealIdRequest.md)   | :heavy_check_mark:                                                                                                                                               | The request object to use for the request.                                                                                                                       |
| `security`                                                                                                                                                       | [com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdEventIdDealDealIdSecurity](../../models/operations/PutCrmConnectionIdEventIdDealDealIdSecurity.md) | :heavy_check_mark:                                                                                                                                               | The security requirements to use for the request.                                                                                                                |


### Response

**[com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdEventIdDealDealIdResponse](../../models/operations/PutCrmConnectionIdEventIdDealDealIdResponse.md)**


## putCrmConnectionIdFileId

Update a file

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdFileIdRequest;
import com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdFileIdResponse;
import com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdFileIdSecurity;
import com.unifiedapi.unifiedto.models.shared.CrmFile;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmFileRaw;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            PutCrmConnectionIdFileIdRequest req = new PutCrmConnectionIdFileIdRequest("libero", "nam") {{
                crmFile = new CrmFile() {{
                    active = false;
                    activityId = "amet";
                    companyId = "adipisci";
                    contactId = "minus";
                    createdAt = OffsetDateTime.parse("2021-02-11T02:50:29.169Z");
                    dealId = "fuga";
                    description = "consectetur";
                    fileName = "labore";
                    fileSize = 5158.73d;
                    fileType = "cumque";
                    fileUrl = "adipisci";
                    id = "1bf407ee-4fcf-40c4-ab78-f15626398a0d";
                    leadId = "impedit";
                    raw = new PropertyCrmFileRaw();;
                    updatedAt = OffsetDateTime.parse("2022-08-10T17:05:42.553Z");
                    userId = "nisi";
                }};;
            }};            

            PutCrmConnectionIdFileIdResponse res = sdk.crm.putCrmConnectionIdFileId(req, new PutCrmConnectionIdFileIdSecurity("dolor") {{
                jwt = "";
            }});

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

| Parameter                                                                                                                                  | Type                                                                                                                                       | Required                                                                                                                                   | Description                                                                                                                                |
| ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                  | [com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdFileIdRequest](../../models/operations/PutCrmConnectionIdFileIdRequest.md)   | :heavy_check_mark:                                                                                                                         | The request object to use for the request.                                                                                                 |
| `security`                                                                                                                                 | [com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdFileIdSecurity](../../models/operations/PutCrmConnectionIdFileIdSecurity.md) | :heavy_check_mark:                                                                                                                         | The security requirements to use for the request.                                                                                          |


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
import com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdLeadIdSecurity;
import com.unifiedapi.unifiedto.models.shared.CrmEmail;
import com.unifiedapi.unifiedto.models.shared.CrmEmailType;
import com.unifiedapi.unifiedto.models.shared.CrmLead;
import com.unifiedapi.unifiedto.models.shared.CrmTelephone;
import com.unifiedapi.unifiedto.models.shared.CrmTelephoneType;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmLeadAddress;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmLeadRaw;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            PutCrmConnectionIdLeadIdRequest req = new PutCrmConnectionIdLeadIdRequest("fugit", "dolore") {{
                crmLead = new CrmLead() {{
                    active = false;
                    address = new PropertyCrmLeadAddress() {{
                        address1 = "maxime";
                        address2 = "maxime";
                        city = "Bashirianview";
                        country = "Samoa";
                        countryCode = "LK";
                        postalCode = "60180-1315";
                        region = "magni";
                        regionCode = "odio";
                    }};;
                    companyId = "alias";
                    contactId = "quidem";
                    createdAt = OffsetDateTime.parse("2021-05-12T15:02:04.341Z");
                    creatorUserId = "ipsam";
                    emails = new com.unifiedapi.unifiedto.models.shared.CrmEmail[]{{
                        add(new CrmEmail() {{
                            email = "Buck_Collier50@yahoo.com";
                            type = CrmEmailType.HOME;
                        }}),
                    }};
                    id = "5b8bcf24-db95-4969-b352-f74533994d78";
                    name = "Elbert Fay";
                    raw = new PropertyCrmLeadRaw();;
                    telephones = new com.unifiedapi.unifiedto.models.shared.CrmTelephone[]{{
                        add(new CrmTelephone("nesciunt") {{
                            telephone = "necessitatibus";
                            type = CrmTelephoneType.FAX;
                        }}),
                    }};
                    updatedAt = OffsetDateTime.parse("2021-10-29T05:51:45.592Z");
                    userId = "voluptatibus";
                }};;
            }};            

            PutCrmConnectionIdLeadIdResponse res = sdk.crm.putCrmConnectionIdLeadId(req, new PutCrmConnectionIdLeadIdSecurity("ullam") {{
                jwt = "";
            }});

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

| Parameter                                                                                                                                  | Type                                                                                                                                       | Required                                                                                                                                   | Description                                                                                                                                |
| ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                  | [com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdLeadIdRequest](../../models/operations/PutCrmConnectionIdLeadIdRequest.md)   | :heavy_check_mark:                                                                                                                         | The request object to use for the request.                                                                                                 |
| `security`                                                                                                                                 | [com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdLeadIdSecurity](../../models/operations/PutCrmConnectionIdLeadIdSecurity.md) | :heavy_check_mark:                                                                                                                         | The security requirements to use for the request.                                                                                          |


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
import com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdPipelineIdSecurity;
import com.unifiedapi.unifiedto.models.shared.CrmPipeline;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmPipelineRaw;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            PutCrmConnectionIdPipelineIdRequest req = new PutCrmConnectionIdPipelineIdRequest("dolorum", "soluta") {{
                crmPipeline = new CrmPipeline() {{
                    active = false;
                    createdAt = OffsetDateTime.parse("2022-02-06T14:06:29.385Z");
                    dealProbability = false;
                    displayOrder = 9669.56d;
                    id = "662550a2-8382-4ac4-83af-d2315bba6501";
                    name = "Ms. Eva Upton";
                    raw = new PropertyCrmPipelineRaw();;
                    updatedAt = OffsetDateTime.parse("2022-04-22T04:13:53.635Z");
                }};;
            }};            

            PutCrmConnectionIdPipelineIdResponse res = sdk.crm.putCrmConnectionIdPipelineId(req, new PutCrmConnectionIdPipelineIdSecurity("asperiores") {{
                jwt = "";
            }});

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

| Parameter                                                                                                                                          | Type                                                                                                                                               | Required                                                                                                                                           | Description                                                                                                                                        |
| -------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                          | [com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdPipelineIdRequest](../../models/operations/PutCrmConnectionIdPipelineIdRequest.md)   | :heavy_check_mark:                                                                                                                                 | The request object to use for the request.                                                                                                         |
| `security`                                                                                                                                         | [com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdPipelineIdSecurity](../../models/operations/PutCrmConnectionIdPipelineIdSecurity.md) | :heavy_check_mark:                                                                                                                                 | The security requirements to use for the request.                                                                                                  |


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
import com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdTeamIdSecurity;
import com.unifiedapi.unifiedto.models.shared.CrmTeam;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmTeamRaw;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            PutCrmConnectionIdTeamIdRequest req = new PutCrmConnectionIdTeamIdRequest("eum", "deserunt") {{
                crmTeam = new CrmTeam() {{
                    createdAt = OffsetDateTime.parse("2021-11-26T05:34:17.860Z");
                    description = "molestias";
                    id = "1bc8bdef-3612-4b63-8205-fda840774a68";
                    name = "Perry Pacocha";
                    raw = new PropertyCrmTeamRaw();;
                    updatedAt = OffsetDateTime.parse("2022-12-06T20:26:48.917Z");
                    userIds = new String[]{{
                        add("molestias"),
                    }};
                }};;
            }};            

            PutCrmConnectionIdTeamIdResponse res = sdk.crm.putCrmConnectionIdTeamId(req, new PutCrmConnectionIdTeamIdSecurity("voluptas") {{
                jwt = "";
            }});

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

| Parameter                                                                                                                                  | Type                                                                                                                                       | Required                                                                                                                                   | Description                                                                                                                                |
| ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                  | [com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdTeamIdRequest](../../models/operations/PutCrmConnectionIdTeamIdRequest.md)   | :heavy_check_mark:                                                                                                                         | The request object to use for the request.                                                                                                 |
| `security`                                                                                                                                 | [com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdTeamIdSecurity](../../models/operations/PutCrmConnectionIdTeamIdSecurity.md) | :heavy_check_mark:                                                                                                                         | The security requirements to use for the request.                                                                                          |


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
import com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdUserIdSecurity;
import com.unifiedapi.unifiedto.models.shared.CrmEmail;
import com.unifiedapi.unifiedto.models.shared.CrmEmailType;
import com.unifiedapi.unifiedto.models.shared.CrmTelephone;
import com.unifiedapi.unifiedto.models.shared.CrmTelephoneType;
import com.unifiedapi.unifiedto.models.shared.CrmUser;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmUserAddress;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmUserRaw;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .build();

            PutCrmConnectionIdUserIdRequest req = new PutCrmConnectionIdUserIdRequest("expedita", "voluptas") {{
                crmUser = new CrmUser() {{
                    active = false;
                    address = new PropertyCrmUserAddress() {{
                        address1 = "maiores";
                        address2 = "ea";
                        city = "Virginiaside";
                        country = "Vietnam";
                        countryCode = "AE";
                        postalCode = "09593";
                        region = "numquam";
                        regionCode = "non";
                    }};;
                    createdAt = OffsetDateTime.parse("2022-06-12T02:34:20.393Z");
                    currency = "dolores";
                    department = "enim";
                    division = "nihil";
                    emails = new com.unifiedapi.unifiedto.models.shared.CrmEmail[]{{
                        add(new CrmEmail() {{
                            email = "Lenny78@hotmail.com";
                            type = CrmEmailType.HOME;
                        }}),
                    }};
                    id = "dbda6a61-efa2-4198-a58f-d0a9eba47f7d";
                    imageUrl = "dolorem";
                    languageLocale = "voluptates";
                    name = "Thomas Hahn";
                    raw = new PropertyCrmUserRaw();;
                    telephones = new com.unifiedapi.unifiedto.models.shared.CrmTelephone[]{{
                        add(new CrmTelephone("illum") {{
                            telephone = "dolore";
                            type = CrmTelephoneType.WORK;
                        }}),
                    }};
                    timezone = "laboriosam";
                    title = "Miss";
                    updatedAt = OffsetDateTime.parse("2022-06-18T07:26:14.155Z");
                }};;
            }};            

            PutCrmConnectionIdUserIdResponse res = sdk.crm.putCrmConnectionIdUserId(req, new PutCrmConnectionIdUserIdSecurity("ratione") {{
                jwt = "";
            }});

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

| Parameter                                                                                                                                  | Type                                                                                                                                       | Required                                                                                                                                   | Description                                                                                                                                |
| ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                  | [com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdUserIdRequest](../../models/operations/PutCrmConnectionIdUserIdRequest.md)   | :heavy_check_mark:                                                                                                                         | The request object to use for the request.                                                                                                 |
| `security`                                                                                                                                 | [com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdUserIdSecurity](../../models/operations/PutCrmConnectionIdUserIdSecurity.md) | :heavy_check_mark:                                                                                                                         | The security requirements to use for the request.                                                                                          |


### Response

**[com.unifiedapi.unifiedto.models.operations.PutCrmConnectionIdUserIdResponse](../../models/operations/PutCrmConnectionIdUserIdResponse.md)**

