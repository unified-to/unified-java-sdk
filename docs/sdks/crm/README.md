# Crm
(*crm*)

### Available Operations

* [createCrmCompany](#createcrmcompany) - Create a company
* [createCrmContact](#createcrmcontact) - Create a contact
* [createCrmDeal](#createcrmdeal) - Create a deal
* [createCrmEvent](#createcrmevent) - Create a event
* [createCrmLead](#createcrmlead) - Create a lead
* [createCrmPipeline](#createcrmpipeline) - Create a pipeline
* [getCrmCompany](#getcrmcompany) - Retrieve a company
* [getCrmContact](#getcrmcontact) - Retrieve a contact
* [getCrmDeal](#getcrmdeal) - Retrieve a deal
* [getCrmEvent](#getcrmevent) - Retrieve a event
* [getCrmLead](#getcrmlead) - Retrieve a lead
* [getCrmPipeline](#getcrmpipeline) - Retrieve a pipeline
* [listCrmCompanies](#listcrmcompanies) - List all companies
* [listCrmContacts](#listcrmcontacts) - List all contacts
* [listCrmDeals](#listcrmdeals) - List all deals
* [listCrmEvents](#listcrmevents) - List all events
* [listCrmLeads](#listcrmleads) - List all leads
* [listCrmPipelines](#listcrmpipelines) - List all pipelines
* [patchCrmCompany](#patchcrmcompany) - Update a company
* [patchCrmContact](#patchcrmcontact) - Update a contact
* [patchCrmDeal](#patchcrmdeal) - Update a deal
* [patchCrmEvent](#patchcrmevent) - Update a event
* [patchCrmLead](#patchcrmlead) - Update a lead
* [patchCrmPipeline](#patchcrmpipeline) - Update a pipeline
* [removeCrmCompany](#removecrmcompany) - Remove a company
* [removeCrmContact](#removecrmcontact) - Remove a contact
* [removeCrmDeal](#removecrmdeal) - Remove a deal
* [removeCrmEvent](#removecrmevent) - Remove a event
* [removeCrmLead](#removecrmlead) - Remove a lead
* [removeCrmPipeline](#removecrmpipeline) - Remove a pipeline
* [updateCrmCompany](#updatecrmcompany) - Update a company
* [updateCrmContact](#updatecrmcontact) - Update a contact
* [updateCrmDeal](#updatecrmdeal) - Update a deal
* [updateCrmEvent](#updatecrmevent) - Update a event
* [updateCrmLead](#updatecrmlead) - Update a lead
* [updateCrmPipeline](#updatecrmpipeline) - Update a pipeline

## createCrmCompany

Create a company

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.CreateCrmCompanyRequest;
import com.unifiedapi.unifiedto.models.operations.CreateCrmCompanyResponse;
import com.unifiedapi.unifiedto.models.operations.CreateCrmCompanySecurity;
import com.unifiedapi.unifiedto.models.shared.CrmCompany;
import com.unifiedapi.unifiedto.models.shared.CrmEmail;
import com.unifiedapi.unifiedto.models.shared.CrmEmailType;
import com.unifiedapi.unifiedto.models.shared.CrmTelephone;
import com.unifiedapi.unifiedto.models.shared.CrmTelephoneType;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmCompanyAddress;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()            .build();

            com.unifiedapi.unifiedto.models.operations.CreateCrmCompanyRequest req = new CreateCrmCompanyRequest(
                "<value>"){{
                crmCompany = new CrmCompany(
){{
                    address = new PropertyCrmCompanyAddress(
){{
                        address1 = "<value>";
                        address2 = "<value>";
                        city = "Joanieworth";
                        country = "Brazil";
                        countryCode = "CW";
                        postalCode = "39571";
                        region = "<value>";
                        regionCode = "<value>";

                    }};
                    createdAt = OffsetDateTime.parse("2024-02-03T10:04:12.712Z");
                    dealIds = new String[]{{
                        add("<value>"),
                    }};
                    description = "Pre-emptive responsive task-force";
                    emails = new com.unifiedapi.unifiedto.models.shared.CrmEmail[]{{
                        add(new CrmEmail(
                        ){{}}),
                    }};
                    employees = 4175.89d;
                    id = "<id>";
                    industry = "<value>";
                    isActive = false;
                    linkUrls = new String[]{{
                        add("<value>"),
                    }};
                    name = "<value>";
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "<value>");
                    }};
                    tags = new String[]{{
                        add("<value>"),
                    }};
                    telephones = new com.unifiedapi.unifiedto.models.shared.CrmTelephone[]{{
                        add(new CrmTelephone(
                        "<value>"){{
                            telephone = "<value>";
                        }}),
                    }};
                    timezone = "Europe/Bucharest";
                    updatedAt = OffsetDateTime.parse("2023-10-03T19:32:53.625Z");
                    userId = "<value>";
                    websites = new String[]{{
                        add("<value>"),
                    }};

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.CreateCrmCompanyResponse res = sdk.crm.createCrmCompany(req, new CreateCrmCompanySecurity(
            "<value>"){{
                jwt = "<YOUR_API_KEY_HERE>";
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

| Parameter                                                                                                                  | Type                                                                                                                       | Required                                                                                                                   | Description                                                                                                                |
| -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                  | [com.unifiedapi.unifiedto.models.operations.CreateCrmCompanyRequest](../../models/operations/CreateCrmCompanyRequest.md)   | :heavy_check_mark:                                                                                                         | The request object to use for the request.                                                                                 |
| `security`                                                                                                                 | [com.unifiedapi.unifiedto.models.operations.CreateCrmCompanySecurity](../../models/operations/CreateCrmCompanySecurity.md) | :heavy_check_mark:                                                                                                         | The security requirements to use for the request.                                                                          |


### Response

**[com.unifiedapi.unifiedto.models.operations.CreateCrmCompanyResponse](../../models/operations/CreateCrmCompanyResponse.md)**


## createCrmContact

Create a contact

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.CreateCrmContactRequest;
import com.unifiedapi.unifiedto.models.operations.CreateCrmContactResponse;
import com.unifiedapi.unifiedto.models.operations.CreateCrmContactSecurity;
import com.unifiedapi.unifiedto.models.shared.CrmContact;
import com.unifiedapi.unifiedto.models.shared.CrmEmail;
import com.unifiedapi.unifiedto.models.shared.CrmEmailType;
import com.unifiedapi.unifiedto.models.shared.CrmTelephone;
import com.unifiedapi.unifiedto.models.shared.CrmTelephoneType;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmContactAddress;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()            .build();

            com.unifiedapi.unifiedto.models.operations.CreateCrmContactRequest req = new CreateCrmContactRequest(
                "<value>"){{
                crmContact = new CrmContact(
){{
                    address = new PropertyCrmContactAddress(
){{
                        address1 = "<value>";
                        address2 = "<value>";
                        city = "Steuberview";
                        country = "Bulgaria";
                        countryCode = "QA";
                        postalCode = "98809";
                        region = "<value>";
                        regionCode = "<value>";

                    }};
                    company = "Pollich, Emard and Parker";
                    companyIds = new String[]{{
                        add("<value>"),
                    }};
                    createdAt = OffsetDateTime.parse("2024-03-07T10:13:21.309Z");
                    dealIds = new String[]{{
                        add("<value>"),
                    }};
                    emails = new com.unifiedapi.unifiedto.models.shared.CrmEmail[]{{
                        add(new CrmEmail(
                        ){{}}),
                    }};
                    id = "<id>";
                    name = "<value>";
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "<value>");
                    }};
                    telephones = new com.unifiedapi.unifiedto.models.shared.CrmTelephone[]{{
                        add(new CrmTelephone(
                        "<value>"){{
                            telephone = "<value>";
                        }}),
                    }};
                    title = "<value>";
                    updatedAt = OffsetDateTime.parse("2024-03-21T17:10:02.454Z");
                    userId = "<value>";

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.CreateCrmContactResponse res = sdk.crm.createCrmContact(req, new CreateCrmContactSecurity(
            "<value>"){{
                jwt = "<YOUR_API_KEY_HERE>";
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

| Parameter                                                                                                                  | Type                                                                                                                       | Required                                                                                                                   | Description                                                                                                                |
| -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                  | [com.unifiedapi.unifiedto.models.operations.CreateCrmContactRequest](../../models/operations/CreateCrmContactRequest.md)   | :heavy_check_mark:                                                                                                         | The request object to use for the request.                                                                                 |
| `security`                                                                                                                 | [com.unifiedapi.unifiedto.models.operations.CreateCrmContactSecurity](../../models/operations/CreateCrmContactSecurity.md) | :heavy_check_mark:                                                                                                         | The security requirements to use for the request.                                                                          |


### Response

**[com.unifiedapi.unifiedto.models.operations.CreateCrmContactResponse](../../models/operations/CreateCrmContactResponse.md)**


## createCrmDeal

Create a deal

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.CreateCrmDealRequest;
import com.unifiedapi.unifiedto.models.operations.CreateCrmDealResponse;
import com.unifiedapi.unifiedto.models.operations.CreateCrmDealSecurity;
import com.unifiedapi.unifiedto.models.shared.CrmDeal;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()            .build();

            com.unifiedapi.unifiedto.models.operations.CreateCrmDealRequest req = new CreateCrmDealRequest(
                "<value>"){{
                crmDeal = new CrmDeal(
){{
                    amount = 1917.45d;
                    closedAt = OffsetDateTime.parse("2023-08-28T04:18:49.785Z");
                    createdAt = OffsetDateTime.parse("2023-07-23T15:31:52.925Z");
                    currency = "Cuban Peso";
                    id = "<id>";
                    lostReason = "<value>";
                    name = "<value>";
                    pipeline = "<value>";
                    probability = 1087.81d;
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "<value>");
                    }};
                    source = "<value>";
                    stage = "<value>";
                    tags = new String[]{{
                        add("<value>"),
                    }};
                    updatedAt = OffsetDateTime.parse("2023-10-13T19:43:32.331Z");
                    userId = "<value>";
                    wonReason = "<value>";

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.CreateCrmDealResponse res = sdk.crm.createCrmDeal(req, new CreateCrmDealSecurity(
            "<value>"){{
                jwt = "<YOUR_API_KEY_HERE>";
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

| Parameter                                                                                                            | Type                                                                                                                 | Required                                                                                                             | Description                                                                                                          |
| -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                            | [com.unifiedapi.unifiedto.models.operations.CreateCrmDealRequest](../../models/operations/CreateCrmDealRequest.md)   | :heavy_check_mark:                                                                                                   | The request object to use for the request.                                                                           |
| `security`                                                                                                           | [com.unifiedapi.unifiedto.models.operations.CreateCrmDealSecurity](../../models/operations/CreateCrmDealSecurity.md) | :heavy_check_mark:                                                                                                   | The security requirements to use for the request.                                                                    |


### Response

**[com.unifiedapi.unifiedto.models.operations.CreateCrmDealResponse](../../models/operations/CreateCrmDealResponse.md)**


## createCrmEvent

Create a event

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.CreateCrmEventRequest;
import com.unifiedapi.unifiedto.models.operations.CreateCrmEventResponse;
import com.unifiedapi.unifiedto.models.operations.CreateCrmEventSecurity;
import com.unifiedapi.unifiedto.models.shared.CrmEvent;
import com.unifiedapi.unifiedto.models.shared.CrmEventType;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmEventCall;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmEventEmail;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmEventMeeting;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmEventNote;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmEventTask;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmEventTaskStatus;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()            .build();

            com.unifiedapi.unifiedto.models.operations.CreateCrmEventRequest req = new CreateCrmEventRequest(
                "<value>"){{
                crmEvent = new CrmEvent(
){{
                    call = new PropertyCrmEventCall(
){{
                        description = "Grass-roots intangible superstructure";
                        duration = 6684.26d;
                        startAt = OffsetDateTime.parse("2024-07-14T22:05:40.365Z");

                    }};
                    companyIds = new String[]{{
                        add("<value>"),
                    }};
                    contactIds = new String[]{{
                        add("<value>"),
                    }};
                    createdAt = OffsetDateTime.parse("2024-08-20T19:58:06.686Z");
                    dealIds = new String[]{{
                        add("<value>"),
                    }};
                    email = new PropertyCrmEventEmail(
){{
                        attachmentFileIds = new String[]{{
                            add("<value>"),
                        }};
                        body = "<value>";
                        cc = new String[]{{
                            add("<value>"),
                        }};
                        from = "<value>";
                        subject = "<value>";
                        to = new String[]{{
                            add("<value>"),
                        }};

                    }};
                    id = "<id>";
                    leadIds = new String[]{{
                        add("<value>"),
                    }};
                    meeting = new PropertyCrmEventMeeting(
){{
                        description = "Synergistic 3rd generation capacity";
                        endAt = OffsetDateTime.parse("2023-08-07T03:26:53.520Z");
                        startAt = OffsetDateTime.parse("2023-02-09T03:55:08.657Z");
                        title = "<value>";

                    }};
                    note = new PropertyCrmEventNote(
){{
                        description = "Virtual asymmetric definition";

                    }};
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "<value>");
                    }};
                    task = new PropertyCrmEventTask(
){{
                        description = "Automated attitude-oriented info-mediaries";
                        dueAt = OffsetDateTime.parse("2023-07-15T02:47:03.388Z");
                        name = "<value>";
                        status = PropertyCrmEventTaskStatus.COMPLETED;

                    }};
                    type = CrmEventType.TASK;
                    updatedAt = OffsetDateTime.parse("2022-07-19T04:33:06.810Z");
                    userId = "<value>";

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.CreateCrmEventResponse res = sdk.crm.createCrmEvent(req, new CreateCrmEventSecurity(
            "<value>"){{
                jwt = "<YOUR_API_KEY_HERE>";
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

| Parameter                                                                                                              | Type                                                                                                                   | Required                                                                                                               | Description                                                                                                            |
| ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                              | [com.unifiedapi.unifiedto.models.operations.CreateCrmEventRequest](../../models/operations/CreateCrmEventRequest.md)   | :heavy_check_mark:                                                                                                     | The request object to use for the request.                                                                             |
| `security`                                                                                                             | [com.unifiedapi.unifiedto.models.operations.CreateCrmEventSecurity](../../models/operations/CreateCrmEventSecurity.md) | :heavy_check_mark:                                                                                                     | The security requirements to use for the request.                                                                      |


### Response

**[com.unifiedapi.unifiedto.models.operations.CreateCrmEventResponse](../../models/operations/CreateCrmEventResponse.md)**


## createCrmLead

Create a lead

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.CreateCrmLeadRequest;
import com.unifiedapi.unifiedto.models.operations.CreateCrmLeadResponse;
import com.unifiedapi.unifiedto.models.operations.CreateCrmLeadSecurity;
import com.unifiedapi.unifiedto.models.shared.CrmEmail;
import com.unifiedapi.unifiedto.models.shared.CrmEmailType;
import com.unifiedapi.unifiedto.models.shared.CrmLead;
import com.unifiedapi.unifiedto.models.shared.CrmTelephone;
import com.unifiedapi.unifiedto.models.shared.CrmTelephoneType;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmLeadAddress;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()            .build();

            com.unifiedapi.unifiedto.models.operations.CreateCrmLeadRequest req = new CreateCrmLeadRequest(
                "<value>"){{
                crmLead = new CrmLead(
){{
                    address = new PropertyCrmLeadAddress(
){{
                        address1 = "<value>";
                        address2 = "<value>";
                        city = "Lindboro";
                        country = "Saint Barthelemy";
                        countryCode = "SG";
                        postalCode = "67307-8667";
                        region = "<value>";
                        regionCode = "<value>";

                    }};
                    companyId = "<value>";
                    companyName = "Langosh - Fritsch";
                    contactId = "<value>";
                    createdAt = OffsetDateTime.parse("2023-12-23T15:29:07.093Z");
                    creatorUserId = "<value>";
                    emails = new com.unifiedapi.unifiedto.models.shared.CrmEmail[]{{
                        add(new CrmEmail(
                        ){{}}),
                    }};
                    id = "<id>";
                    isActive = false;
                    name = "<value>";
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "<value>");
                    }};
                    source = "<value>";
                    status = "<value>";
                    telephones = new com.unifiedapi.unifiedto.models.shared.CrmTelephone[]{{
                        add(new CrmTelephone(
                        "<value>"){{
                            telephone = "<value>";
                        }}),
                    }};
                    updatedAt = OffsetDateTime.parse("2024-09-01T18:33:52.670Z");
                    userId = "<value>";

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.CreateCrmLeadResponse res = sdk.crm.createCrmLead(req, new CreateCrmLeadSecurity(
            "<value>"){{
                jwt = "<YOUR_API_KEY_HERE>";
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

| Parameter                                                                                                            | Type                                                                                                                 | Required                                                                                                             | Description                                                                                                          |
| -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                            | [com.unifiedapi.unifiedto.models.operations.CreateCrmLeadRequest](../../models/operations/CreateCrmLeadRequest.md)   | :heavy_check_mark:                                                                                                   | The request object to use for the request.                                                                           |
| `security`                                                                                                           | [com.unifiedapi.unifiedto.models.operations.CreateCrmLeadSecurity](../../models/operations/CreateCrmLeadSecurity.md) | :heavy_check_mark:                                                                                                   | The security requirements to use for the request.                                                                    |


### Response

**[com.unifiedapi.unifiedto.models.operations.CreateCrmLeadResponse](../../models/operations/CreateCrmLeadResponse.md)**


## createCrmPipeline

Create a pipeline

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.CreateCrmPipelineRequest;
import com.unifiedapi.unifiedto.models.operations.CreateCrmPipelineResponse;
import com.unifiedapi.unifiedto.models.operations.CreateCrmPipelineSecurity;
import com.unifiedapi.unifiedto.models.shared.CrmPipeline;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()            .build();

            com.unifiedapi.unifiedto.models.operations.CreateCrmPipelineRequest req = new CreateCrmPipelineRequest(
                "<value>"){{
                crmPipeline = new CrmPipeline(
){{
                    createdAt = OffsetDateTime.parse("2024-06-24T10:05:30.432Z");
                    dealProbability = 6254.97d;
                    displayOrder = 3052.57d;
                    id = "<id>";
                    isActive = false;
                    name = "<value>";
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "<value>");
                    }};
                    updatedAt = OffsetDateTime.parse("2022-06-06T17:15:48.268Z");

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.CreateCrmPipelineResponse res = sdk.crm.createCrmPipeline(req, new CreateCrmPipelineSecurity(
            "<value>"){{
                jwt = "<YOUR_API_KEY_HERE>";
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

| Parameter                                                                                                                    | Type                                                                                                                         | Required                                                                                                                     | Description                                                                                                                  |
| ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                    | [com.unifiedapi.unifiedto.models.operations.CreateCrmPipelineRequest](../../models/operations/CreateCrmPipelineRequest.md)   | :heavy_check_mark:                                                                                                           | The request object to use for the request.                                                                                   |
| `security`                                                                                                                   | [com.unifiedapi.unifiedto.models.operations.CreateCrmPipelineSecurity](../../models/operations/CreateCrmPipelineSecurity.md) | :heavy_check_mark:                                                                                                           | The security requirements to use for the request.                                                                            |


### Response

**[com.unifiedapi.unifiedto.models.operations.CreateCrmPipelineResponse](../../models/operations/CreateCrmPipelineResponse.md)**


## getCrmCompany

Retrieve a company

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetCrmCompanyRequest;
import com.unifiedapi.unifiedto.models.operations.GetCrmCompanyResponse;
import com.unifiedapi.unifiedto.models.operations.GetCrmCompanySecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()            .build();

            com.unifiedapi.unifiedto.models.operations.GetCrmCompanyRequest req = new GetCrmCompanyRequest(
                "<value>",
                "<value>"){{
                fields = new String[]{{
                    add("<value>"),
                }};

            }};

            com.unifiedapi.unifiedto.models.operations.GetCrmCompanyResponse res = sdk.crm.getCrmCompany(req, new GetCrmCompanySecurity(
            "<value>"){{
                jwt = "<YOUR_API_KEY_HERE>";
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

| Parameter                                                                                                            | Type                                                                                                                 | Required                                                                                                             | Description                                                                                                          |
| -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                            | [com.unifiedapi.unifiedto.models.operations.GetCrmCompanyRequest](../../models/operations/GetCrmCompanyRequest.md)   | :heavy_check_mark:                                                                                                   | The request object to use for the request.                                                                           |
| `security`                                                                                                           | [com.unifiedapi.unifiedto.models.operations.GetCrmCompanySecurity](../../models/operations/GetCrmCompanySecurity.md) | :heavy_check_mark:                                                                                                   | The security requirements to use for the request.                                                                    |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetCrmCompanyResponse](../../models/operations/GetCrmCompanyResponse.md)**


## getCrmContact

Retrieve a contact

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetCrmContactRequest;
import com.unifiedapi.unifiedto.models.operations.GetCrmContactResponse;
import com.unifiedapi.unifiedto.models.operations.GetCrmContactSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()            .build();

            com.unifiedapi.unifiedto.models.operations.GetCrmContactRequest req = new GetCrmContactRequest(
                "<value>",
                "<value>"){{
                fields = new String[]{{
                    add("<value>"),
                }};

            }};

            com.unifiedapi.unifiedto.models.operations.GetCrmContactResponse res = sdk.crm.getCrmContact(req, new GetCrmContactSecurity(
            "<value>"){{
                jwt = "<YOUR_API_KEY_HERE>";
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

| Parameter                                                                                                            | Type                                                                                                                 | Required                                                                                                             | Description                                                                                                          |
| -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                            | [com.unifiedapi.unifiedto.models.operations.GetCrmContactRequest](../../models/operations/GetCrmContactRequest.md)   | :heavy_check_mark:                                                                                                   | The request object to use for the request.                                                                           |
| `security`                                                                                                           | [com.unifiedapi.unifiedto.models.operations.GetCrmContactSecurity](../../models/operations/GetCrmContactSecurity.md) | :heavy_check_mark:                                                                                                   | The security requirements to use for the request.                                                                    |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetCrmContactResponse](../../models/operations/GetCrmContactResponse.md)**


## getCrmDeal

Retrieve a deal

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetCrmDealRequest;
import com.unifiedapi.unifiedto.models.operations.GetCrmDealResponse;
import com.unifiedapi.unifiedto.models.operations.GetCrmDealSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()            .build();

            com.unifiedapi.unifiedto.models.operations.GetCrmDealRequest req = new GetCrmDealRequest(
                "<value>",
                "<value>"){{
                fields = new String[]{{
                    add("<value>"),
                }};

            }};

            com.unifiedapi.unifiedto.models.operations.GetCrmDealResponse res = sdk.crm.getCrmDeal(req, new GetCrmDealSecurity(
            "<value>"){{
                jwt = "<YOUR_API_KEY_HERE>";
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

| Parameter                                                                                                      | Type                                                                                                           | Required                                                                                                       | Description                                                                                                    |
| -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                      | [com.unifiedapi.unifiedto.models.operations.GetCrmDealRequest](../../models/operations/GetCrmDealRequest.md)   | :heavy_check_mark:                                                                                             | The request object to use for the request.                                                                     |
| `security`                                                                                                     | [com.unifiedapi.unifiedto.models.operations.GetCrmDealSecurity](../../models/operations/GetCrmDealSecurity.md) | :heavy_check_mark:                                                                                             | The security requirements to use for the request.                                                              |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetCrmDealResponse](../../models/operations/GetCrmDealResponse.md)**


## getCrmEvent

Retrieve a event

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetCrmEventRequest;
import com.unifiedapi.unifiedto.models.operations.GetCrmEventResponse;
import com.unifiedapi.unifiedto.models.operations.GetCrmEventSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()            .build();

            com.unifiedapi.unifiedto.models.operations.GetCrmEventRequest req = new GetCrmEventRequest(
                "<value>",
                "<value>"){{
                fields = new String[]{{
                    add("<value>"),
                }};

            }};

            com.unifiedapi.unifiedto.models.operations.GetCrmEventResponse res = sdk.crm.getCrmEvent(req, new GetCrmEventSecurity(
            "<value>"){{
                jwt = "<YOUR_API_KEY_HERE>";
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

| Parameter                                                                                                        | Type                                                                                                             | Required                                                                                                         | Description                                                                                                      |
| ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                        | [com.unifiedapi.unifiedto.models.operations.GetCrmEventRequest](../../models/operations/GetCrmEventRequest.md)   | :heavy_check_mark:                                                                                               | The request object to use for the request.                                                                       |
| `security`                                                                                                       | [com.unifiedapi.unifiedto.models.operations.GetCrmEventSecurity](../../models/operations/GetCrmEventSecurity.md) | :heavy_check_mark:                                                                                               | The security requirements to use for the request.                                                                |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetCrmEventResponse](../../models/operations/GetCrmEventResponse.md)**


## getCrmLead

Retrieve a lead

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetCrmLeadRequest;
import com.unifiedapi.unifiedto.models.operations.GetCrmLeadResponse;
import com.unifiedapi.unifiedto.models.operations.GetCrmLeadSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()            .build();

            com.unifiedapi.unifiedto.models.operations.GetCrmLeadRequest req = new GetCrmLeadRequest(
                "<value>",
                "<value>"){{
                fields = new String[]{{
                    add("<value>"),
                }};

            }};

            com.unifiedapi.unifiedto.models.operations.GetCrmLeadResponse res = sdk.crm.getCrmLead(req, new GetCrmLeadSecurity(
            "<value>"){{
                jwt = "<YOUR_API_KEY_HERE>";
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

| Parameter                                                                                                      | Type                                                                                                           | Required                                                                                                       | Description                                                                                                    |
| -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                      | [com.unifiedapi.unifiedto.models.operations.GetCrmLeadRequest](../../models/operations/GetCrmLeadRequest.md)   | :heavy_check_mark:                                                                                             | The request object to use for the request.                                                                     |
| `security`                                                                                                     | [com.unifiedapi.unifiedto.models.operations.GetCrmLeadSecurity](../../models/operations/GetCrmLeadSecurity.md) | :heavy_check_mark:                                                                                             | The security requirements to use for the request.                                                              |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetCrmLeadResponse](../../models/operations/GetCrmLeadResponse.md)**


## getCrmPipeline

Retrieve a pipeline

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetCrmPipelineRequest;
import com.unifiedapi.unifiedto.models.operations.GetCrmPipelineResponse;
import com.unifiedapi.unifiedto.models.operations.GetCrmPipelineSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()            .build();

            com.unifiedapi.unifiedto.models.operations.GetCrmPipelineRequest req = new GetCrmPipelineRequest(
                "<value>",
                "<value>"){{
                fields = new String[]{{
                    add("<value>"),
                }};

            }};

            com.unifiedapi.unifiedto.models.operations.GetCrmPipelineResponse res = sdk.crm.getCrmPipeline(req, new GetCrmPipelineSecurity(
            "<value>"){{
                jwt = "<YOUR_API_KEY_HERE>";
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

| Parameter                                                                                                              | Type                                                                                                                   | Required                                                                                                               | Description                                                                                                            |
| ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                              | [com.unifiedapi.unifiedto.models.operations.GetCrmPipelineRequest](../../models/operations/GetCrmPipelineRequest.md)   | :heavy_check_mark:                                                                                                     | The request object to use for the request.                                                                             |
| `security`                                                                                                             | [com.unifiedapi.unifiedto.models.operations.GetCrmPipelineSecurity](../../models/operations/GetCrmPipelineSecurity.md) | :heavy_check_mark:                                                                                                     | The security requirements to use for the request.                                                                      |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetCrmPipelineResponse](../../models/operations/GetCrmPipelineResponse.md)**


## listCrmCompanies

List all companies

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.ListCrmCompaniesRequest;
import com.unifiedapi.unifiedto.models.operations.ListCrmCompaniesResponse;
import com.unifiedapi.unifiedto.models.operations.ListCrmCompaniesSecurity;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()            .build();

            com.unifiedapi.unifiedto.models.operations.ListCrmCompaniesRequest req = new ListCrmCompaniesRequest(
                "<value>"){{
                contactId = "<value>";
                dealId = "<value>";
                fields = new String[]{{
                    add("<value>"),
                }};
                limit = 9883.97d;
                offset = 5913.88d;
                order = "<value>";
                query = "<value>";
                sort = "<value>";
                updatedGte = OffsetDateTime.parse("2023-05-02T17:52:08.731Z");
                userId = "<value>";

            }};

            com.unifiedapi.unifiedto.models.operations.ListCrmCompaniesResponse res = sdk.crm.listCrmCompanies(req, new ListCrmCompaniesSecurity(
            "<value>"){{
                jwt = "<YOUR_API_KEY_HERE>";
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

| Parameter                                                                                                                  | Type                                                                                                                       | Required                                                                                                                   | Description                                                                                                                |
| -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                  | [com.unifiedapi.unifiedto.models.operations.ListCrmCompaniesRequest](../../models/operations/ListCrmCompaniesRequest.md)   | :heavy_check_mark:                                                                                                         | The request object to use for the request.                                                                                 |
| `security`                                                                                                                 | [com.unifiedapi.unifiedto.models.operations.ListCrmCompaniesSecurity](../../models/operations/ListCrmCompaniesSecurity.md) | :heavy_check_mark:                                                                                                         | The security requirements to use for the request.                                                                          |


### Response

**[com.unifiedapi.unifiedto.models.operations.ListCrmCompaniesResponse](../../models/operations/ListCrmCompaniesResponse.md)**


## listCrmContacts

List all contacts

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.ListCrmContactsRequest;
import com.unifiedapi.unifiedto.models.operations.ListCrmContactsResponse;
import com.unifiedapi.unifiedto.models.operations.ListCrmContactsSecurity;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()            .build();

            com.unifiedapi.unifiedto.models.operations.ListCrmContactsRequest req = new ListCrmContactsRequest(
                "<value>"){{
                companyId = "<value>";
                dealId = "<value>";
                fields = new String[]{{
                    add("<value>"),
                }};
                limit = 7110.24d;
                offset = 2657.43d;
                order = "<value>";
                query = "<value>";
                sort = "<value>";
                updatedGte = OffsetDateTime.parse("2023-11-15T19:36:59.401Z");
                userId = "<value>";

            }};

            com.unifiedapi.unifiedto.models.operations.ListCrmContactsResponse res = sdk.crm.listCrmContacts(req, new ListCrmContactsSecurity(
            "<value>"){{
                jwt = "<YOUR_API_KEY_HERE>";
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

| Parameter                                                                                                                | Type                                                                                                                     | Required                                                                                                                 | Description                                                                                                              |
| ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                | [com.unifiedapi.unifiedto.models.operations.ListCrmContactsRequest](../../models/operations/ListCrmContactsRequest.md)   | :heavy_check_mark:                                                                                                       | The request object to use for the request.                                                                               |
| `security`                                                                                                               | [com.unifiedapi.unifiedto.models.operations.ListCrmContactsSecurity](../../models/operations/ListCrmContactsSecurity.md) | :heavy_check_mark:                                                                                                       | The security requirements to use for the request.                                                                        |


### Response

**[com.unifiedapi.unifiedto.models.operations.ListCrmContactsResponse](../../models/operations/ListCrmContactsResponse.md)**


## listCrmDeals

List all deals

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.ListCrmDealsRequest;
import com.unifiedapi.unifiedto.models.operations.ListCrmDealsResponse;
import com.unifiedapi.unifiedto.models.operations.ListCrmDealsSecurity;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()            .build();

            com.unifiedapi.unifiedto.models.operations.ListCrmDealsRequest req = new ListCrmDealsRequest(
                "<value>"){{
                companyId = "<value>";
                contactId = "<value>";
                fields = new String[]{{
                    add("<value>"),
                }};
                limit = 917.49d;
                offset = 8216.92d;
                order = "<value>";
                query = "<value>";
                sort = "<value>";
                updatedGte = OffsetDateTime.parse("2023-09-04T01:39:26.472Z");
                userId = "<value>";

            }};

            com.unifiedapi.unifiedto.models.operations.ListCrmDealsResponse res = sdk.crm.listCrmDeals(req, new ListCrmDealsSecurity(
            "<value>"){{
                jwt = "<YOUR_API_KEY_HERE>";
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

| Parameter                                                                                                          | Type                                                                                                               | Required                                                                                                           | Description                                                                                                        |
| ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                          | [com.unifiedapi.unifiedto.models.operations.ListCrmDealsRequest](../../models/operations/ListCrmDealsRequest.md)   | :heavy_check_mark:                                                                                                 | The request object to use for the request.                                                                         |
| `security`                                                                                                         | [com.unifiedapi.unifiedto.models.operations.ListCrmDealsSecurity](../../models/operations/ListCrmDealsSecurity.md) | :heavy_check_mark:                                                                                                 | The security requirements to use for the request.                                                                  |


### Response

**[com.unifiedapi.unifiedto.models.operations.ListCrmDealsResponse](../../models/operations/ListCrmDealsResponse.md)**


## listCrmEvents

List all events

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.ListCrmEventsRequest;
import com.unifiedapi.unifiedto.models.operations.ListCrmEventsResponse;
import com.unifiedapi.unifiedto.models.operations.ListCrmEventsSecurity;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()            .build();

            com.unifiedapi.unifiedto.models.operations.ListCrmEventsRequest req = new ListCrmEventsRequest(
                "<value>"){{
                companyId = "<value>";
                contactId = "<value>";
                dealId = "<value>";
                fields = new String[]{{
                    add("<value>"),
                }};
                limit = 4453.11d;
                offset = 4555.2d;
                order = "<value>";
                query = "<value>";
                sort = "<value>";
                type = "<value>";
                updatedGte = OffsetDateTime.parse("2024-04-30T03:39:38.103Z");
                userId = "<value>";

            }};

            com.unifiedapi.unifiedto.models.operations.ListCrmEventsResponse res = sdk.crm.listCrmEvents(req, new ListCrmEventsSecurity(
            "<value>"){{
                jwt = "<YOUR_API_KEY_HERE>";
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

| Parameter                                                                                                            | Type                                                                                                                 | Required                                                                                                             | Description                                                                                                          |
| -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                            | [com.unifiedapi.unifiedto.models.operations.ListCrmEventsRequest](../../models/operations/ListCrmEventsRequest.md)   | :heavy_check_mark:                                                                                                   | The request object to use for the request.                                                                           |
| `security`                                                                                                           | [com.unifiedapi.unifiedto.models.operations.ListCrmEventsSecurity](../../models/operations/ListCrmEventsSecurity.md) | :heavy_check_mark:                                                                                                   | The security requirements to use for the request.                                                                    |


### Response

**[com.unifiedapi.unifiedto.models.operations.ListCrmEventsResponse](../../models/operations/ListCrmEventsResponse.md)**


## listCrmLeads

List all leads

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.ListCrmLeadsRequest;
import com.unifiedapi.unifiedto.models.operations.ListCrmLeadsResponse;
import com.unifiedapi.unifiedto.models.operations.ListCrmLeadsSecurity;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()            .build();

            com.unifiedapi.unifiedto.models.operations.ListCrmLeadsRequest req = new ListCrmLeadsRequest(
                "<value>"){{
                companyId = "<value>";
                contactId = "<value>";
                fields = new String[]{{
                    add("<value>"),
                }};
                limit = 2895.08d;
                offset = 6446.8d;
                order = "<value>";
                query = "<value>";
                sort = "<value>";
                updatedGte = OffsetDateTime.parse("2024-01-12T07:27:29.016Z");
                userId = "<value>";

            }};

            com.unifiedapi.unifiedto.models.operations.ListCrmLeadsResponse res = sdk.crm.listCrmLeads(req, new ListCrmLeadsSecurity(
            "<value>"){{
                jwt = "<YOUR_API_KEY_HERE>";
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

| Parameter                                                                                                          | Type                                                                                                               | Required                                                                                                           | Description                                                                                                        |
| ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                          | [com.unifiedapi.unifiedto.models.operations.ListCrmLeadsRequest](../../models/operations/ListCrmLeadsRequest.md)   | :heavy_check_mark:                                                                                                 | The request object to use for the request.                                                                         |
| `security`                                                                                                         | [com.unifiedapi.unifiedto.models.operations.ListCrmLeadsSecurity](../../models/operations/ListCrmLeadsSecurity.md) | :heavy_check_mark:                                                                                                 | The security requirements to use for the request.                                                                  |


### Response

**[com.unifiedapi.unifiedto.models.operations.ListCrmLeadsResponse](../../models/operations/ListCrmLeadsResponse.md)**


## listCrmPipelines

List all pipelines

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.ListCrmPipelinesRequest;
import com.unifiedapi.unifiedto.models.operations.ListCrmPipelinesResponse;
import com.unifiedapi.unifiedto.models.operations.ListCrmPipelinesSecurity;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()            .build();

            com.unifiedapi.unifiedto.models.operations.ListCrmPipelinesRequest req = new ListCrmPipelinesRequest(
                "<value>"){{
                fields = new String[]{{
                    add("<value>"),
                }};
                limit = 3318.18d;
                offset = 4834.28d;
                order = "<value>";
                query = "<value>";
                sort = "<value>";
                updatedGte = OffsetDateTime.parse("2022-04-29T18:23:30.472Z");

            }};

            com.unifiedapi.unifiedto.models.operations.ListCrmPipelinesResponse res = sdk.crm.listCrmPipelines(req, new ListCrmPipelinesSecurity(
            "<value>"){{
                jwt = "<YOUR_API_KEY_HERE>";
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

| Parameter                                                                                                                  | Type                                                                                                                       | Required                                                                                                                   | Description                                                                                                                |
| -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                  | [com.unifiedapi.unifiedto.models.operations.ListCrmPipelinesRequest](../../models/operations/ListCrmPipelinesRequest.md)   | :heavy_check_mark:                                                                                                         | The request object to use for the request.                                                                                 |
| `security`                                                                                                                 | [com.unifiedapi.unifiedto.models.operations.ListCrmPipelinesSecurity](../../models/operations/ListCrmPipelinesSecurity.md) | :heavy_check_mark:                                                                                                         | The security requirements to use for the request.                                                                          |


### Response

**[com.unifiedapi.unifiedto.models.operations.ListCrmPipelinesResponse](../../models/operations/ListCrmPipelinesResponse.md)**


## patchCrmCompany

Update a company

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PatchCrmCompanyRequest;
import com.unifiedapi.unifiedto.models.operations.PatchCrmCompanyResponse;
import com.unifiedapi.unifiedto.models.operations.PatchCrmCompanySecurity;
import com.unifiedapi.unifiedto.models.shared.CrmCompany;
import com.unifiedapi.unifiedto.models.shared.CrmEmail;
import com.unifiedapi.unifiedto.models.shared.CrmEmailType;
import com.unifiedapi.unifiedto.models.shared.CrmTelephone;
import com.unifiedapi.unifiedto.models.shared.CrmTelephoneType;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmCompanyAddress;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()            .build();

            com.unifiedapi.unifiedto.models.operations.PatchCrmCompanyRequest req = new PatchCrmCompanyRequest(
                "<value>",
                "<value>"){{
                crmCompany = new CrmCompany(
){{
                    address = new PropertyCrmCompanyAddress(
){{
                        address1 = "<value>";
                        address2 = "<value>";
                        city = "Rempelchester";
                        country = "Christmas Island";
                        countryCode = "LA";
                        postalCode = "53644";
                        region = "<value>";
                        regionCode = "<value>";

                    }};
                    createdAt = OffsetDateTime.parse("2022-01-19T16:53:30.758Z");
                    dealIds = new String[]{{
                        add("<value>"),
                    }};
                    description = "Diverse mission-critical project";
                    emails = new com.unifiedapi.unifiedto.models.shared.CrmEmail[]{{
                        add(new CrmEmail(
                        ){{}}),
                    }};
                    employees = 4128.78d;
                    id = "<id>";
                    industry = "<value>";
                    isActive = false;
                    linkUrls = new String[]{{
                        add("<value>"),
                    }};
                    name = "<value>";
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "<value>");
                    }};
                    tags = new String[]{{
                        add("<value>"),
                    }};
                    telephones = new com.unifiedapi.unifiedto.models.shared.CrmTelephone[]{{
                        add(new CrmTelephone(
                        "<value>"){{
                            telephone = "<value>";
                        }}),
                    }};
                    timezone = "Europe/Skopje";
                    updatedAt = OffsetDateTime.parse("2022-04-08T08:19:54.922Z");
                    userId = "<value>";
                    websites = new String[]{{
                        add("<value>"),
                    }};

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.PatchCrmCompanyResponse res = sdk.crm.patchCrmCompany(req, new PatchCrmCompanySecurity(
            "<value>"){{
                jwt = "<YOUR_API_KEY_HERE>";
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

| Parameter                                                                                                                | Type                                                                                                                     | Required                                                                                                                 | Description                                                                                                              |
| ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                | [com.unifiedapi.unifiedto.models.operations.PatchCrmCompanyRequest](../../models/operations/PatchCrmCompanyRequest.md)   | :heavy_check_mark:                                                                                                       | The request object to use for the request.                                                                               |
| `security`                                                                                                               | [com.unifiedapi.unifiedto.models.operations.PatchCrmCompanySecurity](../../models/operations/PatchCrmCompanySecurity.md) | :heavy_check_mark:                                                                                                       | The security requirements to use for the request.                                                                        |


### Response

**[com.unifiedapi.unifiedto.models.operations.PatchCrmCompanyResponse](../../models/operations/PatchCrmCompanyResponse.md)**


## patchCrmContact

Update a contact

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PatchCrmContactRequest;
import com.unifiedapi.unifiedto.models.operations.PatchCrmContactResponse;
import com.unifiedapi.unifiedto.models.operations.PatchCrmContactSecurity;
import com.unifiedapi.unifiedto.models.shared.CrmContact;
import com.unifiedapi.unifiedto.models.shared.CrmEmail;
import com.unifiedapi.unifiedto.models.shared.CrmEmailType;
import com.unifiedapi.unifiedto.models.shared.CrmTelephone;
import com.unifiedapi.unifiedto.models.shared.CrmTelephoneType;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmContactAddress;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()            .build();

            com.unifiedapi.unifiedto.models.operations.PatchCrmContactRequest req = new PatchCrmContactRequest(
                "<value>",
                "<value>"){{
                crmContact = new CrmContact(
){{
                    address = new PropertyCrmContactAddress(
){{
                        address1 = "<value>";
                        address2 = "<value>";
                        city = "North Anne";
                        country = "Puerto Rico";
                        countryCode = "GD";
                        postalCode = "31015";
                        region = "<value>";
                        regionCode = "<value>";

                    }};
                    company = "Goyette - Schultz";
                    companyIds = new String[]{{
                        add("<value>"),
                    }};
                    createdAt = OffsetDateTime.parse("2022-07-12T00:15:47.150Z");
                    dealIds = new String[]{{
                        add("<value>"),
                    }};
                    emails = new com.unifiedapi.unifiedto.models.shared.CrmEmail[]{{
                        add(new CrmEmail(
                        ){{}}),
                    }};
                    id = "<id>";
                    name = "<value>";
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "<value>");
                    }};
                    telephones = new com.unifiedapi.unifiedto.models.shared.CrmTelephone[]{{
                        add(new CrmTelephone(
                        "<value>"){{
                            telephone = "<value>";
                        }}),
                    }};
                    title = "<value>";
                    updatedAt = OffsetDateTime.parse("2022-11-28T22:10:52.030Z");
                    userId = "<value>";

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.PatchCrmContactResponse res = sdk.crm.patchCrmContact(req, new PatchCrmContactSecurity(
            "<value>"){{
                jwt = "<YOUR_API_KEY_HERE>";
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

| Parameter                                                                                                                | Type                                                                                                                     | Required                                                                                                                 | Description                                                                                                              |
| ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                | [com.unifiedapi.unifiedto.models.operations.PatchCrmContactRequest](../../models/operations/PatchCrmContactRequest.md)   | :heavy_check_mark:                                                                                                       | The request object to use for the request.                                                                               |
| `security`                                                                                                               | [com.unifiedapi.unifiedto.models.operations.PatchCrmContactSecurity](../../models/operations/PatchCrmContactSecurity.md) | :heavy_check_mark:                                                                                                       | The security requirements to use for the request.                                                                        |


### Response

**[com.unifiedapi.unifiedto.models.operations.PatchCrmContactResponse](../../models/operations/PatchCrmContactResponse.md)**


## patchCrmDeal

Update a deal

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PatchCrmDealRequest;
import com.unifiedapi.unifiedto.models.operations.PatchCrmDealResponse;
import com.unifiedapi.unifiedto.models.operations.PatchCrmDealSecurity;
import com.unifiedapi.unifiedto.models.shared.CrmDeal;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()            .build();

            com.unifiedapi.unifiedto.models.operations.PatchCrmDealRequest req = new PatchCrmDealRequest(
                "<value>",
                "<value>"){{
                crmDeal = new CrmDeal(
){{
                    amount = 9874.05d;
                    closedAt = OffsetDateTime.parse("2022-07-09T12:57:05.527Z");
                    createdAt = OffsetDateTime.parse("2023-04-30T17:40:39.112Z");
                    currency = "Riel";
                    id = "<id>";
                    lostReason = "<value>";
                    name = "<value>";
                    pipeline = "<value>";
                    probability = 9555.58d;
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "<value>");
                    }};
                    source = "<value>";
                    stage = "<value>";
                    tags = new String[]{{
                        add("<value>"),
                    }};
                    updatedAt = OffsetDateTime.parse("2024-02-22T07:49:20.306Z");
                    userId = "<value>";
                    wonReason = "<value>";

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.PatchCrmDealResponse res = sdk.crm.patchCrmDeal(req, new PatchCrmDealSecurity(
            "<value>"){{
                jwt = "<YOUR_API_KEY_HERE>";
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

| Parameter                                                                                                          | Type                                                                                                               | Required                                                                                                           | Description                                                                                                        |
| ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                          | [com.unifiedapi.unifiedto.models.operations.PatchCrmDealRequest](../../models/operations/PatchCrmDealRequest.md)   | :heavy_check_mark:                                                                                                 | The request object to use for the request.                                                                         |
| `security`                                                                                                         | [com.unifiedapi.unifiedto.models.operations.PatchCrmDealSecurity](../../models/operations/PatchCrmDealSecurity.md) | :heavy_check_mark:                                                                                                 | The security requirements to use for the request.                                                                  |


### Response

**[com.unifiedapi.unifiedto.models.operations.PatchCrmDealResponse](../../models/operations/PatchCrmDealResponse.md)**


## patchCrmEvent

Update a event

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PatchCrmEventRequest;
import com.unifiedapi.unifiedto.models.operations.PatchCrmEventResponse;
import com.unifiedapi.unifiedto.models.operations.PatchCrmEventSecurity;
import com.unifiedapi.unifiedto.models.shared.CrmEvent;
import com.unifiedapi.unifiedto.models.shared.CrmEventType;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmEventCall;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmEventEmail;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmEventMeeting;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmEventNote;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmEventTask;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmEventTaskStatus;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()            .build();

            com.unifiedapi.unifiedto.models.operations.PatchCrmEventRequest req = new PatchCrmEventRequest(
                "<value>",
                "<value>"){{
                crmEvent = new CrmEvent(
){{
                    call = new PropertyCrmEventCall(
){{
                        description = "Multi-layered well-modulated middleware";
                        duration = 8718.07d;
                        startAt = OffsetDateTime.parse("2023-07-21T08:28:33.501Z");

                    }};
                    companyIds = new String[]{{
                        add("<value>"),
                    }};
                    contactIds = new String[]{{
                        add("<value>"),
                    }};
                    createdAt = OffsetDateTime.parse("2023-02-08T06:50:13.439Z");
                    dealIds = new String[]{{
                        add("<value>"),
                    }};
                    email = new PropertyCrmEventEmail(
){{
                        attachmentFileIds = new String[]{{
                            add("<value>"),
                        }};
                        body = "<value>";
                        cc = new String[]{{
                            add("<value>"),
                        }};
                        from = "<value>";
                        subject = "<value>";
                        to = new String[]{{
                            add("<value>"),
                        }};

                    }};
                    id = "<id>";
                    leadIds = new String[]{{
                        add("<value>"),
                    }};
                    meeting = new PropertyCrmEventMeeting(
){{
                        description = "Universal 24/7 migration";
                        endAt = OffsetDateTime.parse("2022-05-11T23:48:02.911Z");
                        startAt = OffsetDateTime.parse("2022-10-11T02:15:24.355Z");
                        title = "<value>";

                    }};
                    note = new PropertyCrmEventNote(
){{
                        description = "Realigned composite benchmark";

                    }};
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "<value>");
                    }};
                    task = new PropertyCrmEventTask(
){{
                        description = "Customer-focused needs-based groupware";
                        dueAt = OffsetDateTime.parse("2024-11-30T20:05:52.386Z");
                        name = "<value>";
                        status = PropertyCrmEventTaskStatus.COMPLETED;

                    }};
                    type = CrmEventType.EMAIL;
                    updatedAt = OffsetDateTime.parse("2022-07-15T05:10:26.446Z");
                    userId = "<value>";

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.PatchCrmEventResponse res = sdk.crm.patchCrmEvent(req, new PatchCrmEventSecurity(
            "<value>"){{
                jwt = "<YOUR_API_KEY_HERE>";
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

| Parameter                                                                                                            | Type                                                                                                                 | Required                                                                                                             | Description                                                                                                          |
| -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                            | [com.unifiedapi.unifiedto.models.operations.PatchCrmEventRequest](../../models/operations/PatchCrmEventRequest.md)   | :heavy_check_mark:                                                                                                   | The request object to use for the request.                                                                           |
| `security`                                                                                                           | [com.unifiedapi.unifiedto.models.operations.PatchCrmEventSecurity](../../models/operations/PatchCrmEventSecurity.md) | :heavy_check_mark:                                                                                                   | The security requirements to use for the request.                                                                    |


### Response

**[com.unifiedapi.unifiedto.models.operations.PatchCrmEventResponse](../../models/operations/PatchCrmEventResponse.md)**


## patchCrmLead

Update a lead

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PatchCrmLeadRequest;
import com.unifiedapi.unifiedto.models.operations.PatchCrmLeadResponse;
import com.unifiedapi.unifiedto.models.operations.PatchCrmLeadSecurity;
import com.unifiedapi.unifiedto.models.shared.CrmEmail;
import com.unifiedapi.unifiedto.models.shared.CrmEmailType;
import com.unifiedapi.unifiedto.models.shared.CrmLead;
import com.unifiedapi.unifiedto.models.shared.CrmTelephone;
import com.unifiedapi.unifiedto.models.shared.CrmTelephoneType;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmLeadAddress;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()            .build();

            com.unifiedapi.unifiedto.models.operations.PatchCrmLeadRequest req = new PatchCrmLeadRequest(
                "<value>",
                "<value>"){{
                crmLead = new CrmLead(
){{
                    address = new PropertyCrmLeadAddress(
){{
                        address1 = "<value>";
                        address2 = "<value>";
                        city = "Caseyberg";
                        country = "Cote d'Ivoire";
                        countryCode = "LK";
                        postalCode = "22291";
                        region = "<value>";
                        regionCode = "<value>";

                    }};
                    companyId = "<value>";
                    companyName = "Altenwerth, Lebsack and Wintheiser";
                    contactId = "<value>";
                    createdAt = OffsetDateTime.parse("2023-12-16T13:33:21.530Z");
                    creatorUserId = "<value>";
                    emails = new com.unifiedapi.unifiedto.models.shared.CrmEmail[]{{
                        add(new CrmEmail(
                        ){{}}),
                    }};
                    id = "<id>";
                    isActive = false;
                    name = "<value>";
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "<value>");
                    }};
                    source = "<value>";
                    status = "<value>";
                    telephones = new com.unifiedapi.unifiedto.models.shared.CrmTelephone[]{{
                        add(new CrmTelephone(
                        "<value>"){{
                            telephone = "<value>";
                        }}),
                    }};
                    updatedAt = OffsetDateTime.parse("2022-10-10T11:36:08.811Z");
                    userId = "<value>";

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.PatchCrmLeadResponse res = sdk.crm.patchCrmLead(req, new PatchCrmLeadSecurity(
            "<value>"){{
                jwt = "<YOUR_API_KEY_HERE>";
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

| Parameter                                                                                                          | Type                                                                                                               | Required                                                                                                           | Description                                                                                                        |
| ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                          | [com.unifiedapi.unifiedto.models.operations.PatchCrmLeadRequest](../../models/operations/PatchCrmLeadRequest.md)   | :heavy_check_mark:                                                                                                 | The request object to use for the request.                                                                         |
| `security`                                                                                                         | [com.unifiedapi.unifiedto.models.operations.PatchCrmLeadSecurity](../../models/operations/PatchCrmLeadSecurity.md) | :heavy_check_mark:                                                                                                 | The security requirements to use for the request.                                                                  |


### Response

**[com.unifiedapi.unifiedto.models.operations.PatchCrmLeadResponse](../../models/operations/PatchCrmLeadResponse.md)**


## patchCrmPipeline

Update a pipeline

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PatchCrmPipelineRequest;
import com.unifiedapi.unifiedto.models.operations.PatchCrmPipelineResponse;
import com.unifiedapi.unifiedto.models.operations.PatchCrmPipelineSecurity;
import com.unifiedapi.unifiedto.models.shared.CrmPipeline;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()            .build();

            com.unifiedapi.unifiedto.models.operations.PatchCrmPipelineRequest req = new PatchCrmPipelineRequest(
                "<value>",
                "<value>"){{
                crmPipeline = new CrmPipeline(
){{
                    createdAt = OffsetDateTime.parse("2024-08-26T14:31:39.156Z");
                    dealProbability = 8620.92d;
                    displayOrder = 4178.43d;
                    id = "<id>";
                    isActive = false;
                    name = "<value>";
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "<value>");
                    }};
                    updatedAt = OffsetDateTime.parse("2022-02-25T13:09:02.644Z");

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.PatchCrmPipelineResponse res = sdk.crm.patchCrmPipeline(req, new PatchCrmPipelineSecurity(
            "<value>"){{
                jwt = "<YOUR_API_KEY_HERE>";
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

| Parameter                                                                                                                  | Type                                                                                                                       | Required                                                                                                                   | Description                                                                                                                |
| -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                  | [com.unifiedapi.unifiedto.models.operations.PatchCrmPipelineRequest](../../models/operations/PatchCrmPipelineRequest.md)   | :heavy_check_mark:                                                                                                         | The request object to use for the request.                                                                                 |
| `security`                                                                                                                 | [com.unifiedapi.unifiedto.models.operations.PatchCrmPipelineSecurity](../../models/operations/PatchCrmPipelineSecurity.md) | :heavy_check_mark:                                                                                                         | The security requirements to use for the request.                                                                          |


### Response

**[com.unifiedapi.unifiedto.models.operations.PatchCrmPipelineResponse](../../models/operations/PatchCrmPipelineResponse.md)**


## removeCrmCompany

Remove a company

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.RemoveCrmCompanyRequest;
import com.unifiedapi.unifiedto.models.operations.RemoveCrmCompanyResponse;
import com.unifiedapi.unifiedto.models.operations.RemoveCrmCompanySecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()            .build();

            com.unifiedapi.unifiedto.models.operations.RemoveCrmCompanyRequest req = new RemoveCrmCompanyRequest(
                "<value>",
                "<value>");

            com.unifiedapi.unifiedto.models.operations.RemoveCrmCompanyResponse res = sdk.crm.removeCrmCompany(req, new RemoveCrmCompanySecurity(
            "<value>"){{
                jwt = "<YOUR_API_KEY_HERE>";
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

| Parameter                                                                                                                  | Type                                                                                                                       | Required                                                                                                                   | Description                                                                                                                |
| -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                  | [com.unifiedapi.unifiedto.models.operations.RemoveCrmCompanyRequest](../../models/operations/RemoveCrmCompanyRequest.md)   | :heavy_check_mark:                                                                                                         | The request object to use for the request.                                                                                 |
| `security`                                                                                                                 | [com.unifiedapi.unifiedto.models.operations.RemoveCrmCompanySecurity](../../models/operations/RemoveCrmCompanySecurity.md) | :heavy_check_mark:                                                                                                         | The security requirements to use for the request.                                                                          |


### Response

**[com.unifiedapi.unifiedto.models.operations.RemoveCrmCompanyResponse](../../models/operations/RemoveCrmCompanyResponse.md)**


## removeCrmContact

Remove a contact

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.RemoveCrmContactRequest;
import com.unifiedapi.unifiedto.models.operations.RemoveCrmContactResponse;
import com.unifiedapi.unifiedto.models.operations.RemoveCrmContactSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()            .build();

            com.unifiedapi.unifiedto.models.operations.RemoveCrmContactRequest req = new RemoveCrmContactRequest(
                "<value>",
                "<value>");

            com.unifiedapi.unifiedto.models.operations.RemoveCrmContactResponse res = sdk.crm.removeCrmContact(req, new RemoveCrmContactSecurity(
            "<value>"){{
                jwt = "<YOUR_API_KEY_HERE>";
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

| Parameter                                                                                                                  | Type                                                                                                                       | Required                                                                                                                   | Description                                                                                                                |
| -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                  | [com.unifiedapi.unifiedto.models.operations.RemoveCrmContactRequest](../../models/operations/RemoveCrmContactRequest.md)   | :heavy_check_mark:                                                                                                         | The request object to use for the request.                                                                                 |
| `security`                                                                                                                 | [com.unifiedapi.unifiedto.models.operations.RemoveCrmContactSecurity](../../models/operations/RemoveCrmContactSecurity.md) | :heavy_check_mark:                                                                                                         | The security requirements to use for the request.                                                                          |


### Response

**[com.unifiedapi.unifiedto.models.operations.RemoveCrmContactResponse](../../models/operations/RemoveCrmContactResponse.md)**


## removeCrmDeal

Remove a deal

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.RemoveCrmDealRequest;
import com.unifiedapi.unifiedto.models.operations.RemoveCrmDealResponse;
import com.unifiedapi.unifiedto.models.operations.RemoveCrmDealSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()            .build();

            com.unifiedapi.unifiedto.models.operations.RemoveCrmDealRequest req = new RemoveCrmDealRequest(
                "<value>",
                "<value>");

            com.unifiedapi.unifiedto.models.operations.RemoveCrmDealResponse res = sdk.crm.removeCrmDeal(req, new RemoveCrmDealSecurity(
            "<value>"){{
                jwt = "<YOUR_API_KEY_HERE>";
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

| Parameter                                                                                                            | Type                                                                                                                 | Required                                                                                                             | Description                                                                                                          |
| -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                            | [com.unifiedapi.unifiedto.models.operations.RemoveCrmDealRequest](../../models/operations/RemoveCrmDealRequest.md)   | :heavy_check_mark:                                                                                                   | The request object to use for the request.                                                                           |
| `security`                                                                                                           | [com.unifiedapi.unifiedto.models.operations.RemoveCrmDealSecurity](../../models/operations/RemoveCrmDealSecurity.md) | :heavy_check_mark:                                                                                                   | The security requirements to use for the request.                                                                    |


### Response

**[com.unifiedapi.unifiedto.models.operations.RemoveCrmDealResponse](../../models/operations/RemoveCrmDealResponse.md)**


## removeCrmEvent

Remove a event

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.RemoveCrmEventRequest;
import com.unifiedapi.unifiedto.models.operations.RemoveCrmEventResponse;
import com.unifiedapi.unifiedto.models.operations.RemoveCrmEventSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()            .build();

            com.unifiedapi.unifiedto.models.operations.RemoveCrmEventRequest req = new RemoveCrmEventRequest(
                "<value>",
                "<value>");

            com.unifiedapi.unifiedto.models.operations.RemoveCrmEventResponse res = sdk.crm.removeCrmEvent(req, new RemoveCrmEventSecurity(
            "<value>"){{
                jwt = "<YOUR_API_KEY_HERE>";
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

| Parameter                                                                                                              | Type                                                                                                                   | Required                                                                                                               | Description                                                                                                            |
| ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                              | [com.unifiedapi.unifiedto.models.operations.RemoveCrmEventRequest](../../models/operations/RemoveCrmEventRequest.md)   | :heavy_check_mark:                                                                                                     | The request object to use for the request.                                                                             |
| `security`                                                                                                             | [com.unifiedapi.unifiedto.models.operations.RemoveCrmEventSecurity](../../models/operations/RemoveCrmEventSecurity.md) | :heavy_check_mark:                                                                                                     | The security requirements to use for the request.                                                                      |


### Response

**[com.unifiedapi.unifiedto.models.operations.RemoveCrmEventResponse](../../models/operations/RemoveCrmEventResponse.md)**


## removeCrmLead

Remove a lead

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.RemoveCrmLeadRequest;
import com.unifiedapi.unifiedto.models.operations.RemoveCrmLeadResponse;
import com.unifiedapi.unifiedto.models.operations.RemoveCrmLeadSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()            .build();

            com.unifiedapi.unifiedto.models.operations.RemoveCrmLeadRequest req = new RemoveCrmLeadRequest(
                "<value>",
                "<value>");

            com.unifiedapi.unifiedto.models.operations.RemoveCrmLeadResponse res = sdk.crm.removeCrmLead(req, new RemoveCrmLeadSecurity(
            "<value>"){{
                jwt = "<YOUR_API_KEY_HERE>";
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

| Parameter                                                                                                            | Type                                                                                                                 | Required                                                                                                             | Description                                                                                                          |
| -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                            | [com.unifiedapi.unifiedto.models.operations.RemoveCrmLeadRequest](../../models/operations/RemoveCrmLeadRequest.md)   | :heavy_check_mark:                                                                                                   | The request object to use for the request.                                                                           |
| `security`                                                                                                           | [com.unifiedapi.unifiedto.models.operations.RemoveCrmLeadSecurity](../../models/operations/RemoveCrmLeadSecurity.md) | :heavy_check_mark:                                                                                                   | The security requirements to use for the request.                                                                    |


### Response

**[com.unifiedapi.unifiedto.models.operations.RemoveCrmLeadResponse](../../models/operations/RemoveCrmLeadResponse.md)**


## removeCrmPipeline

Remove a pipeline

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.RemoveCrmPipelineRequest;
import com.unifiedapi.unifiedto.models.operations.RemoveCrmPipelineResponse;
import com.unifiedapi.unifiedto.models.operations.RemoveCrmPipelineSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()            .build();

            com.unifiedapi.unifiedto.models.operations.RemoveCrmPipelineRequest req = new RemoveCrmPipelineRequest(
                "<value>",
                "<value>");

            com.unifiedapi.unifiedto.models.operations.RemoveCrmPipelineResponse res = sdk.crm.removeCrmPipeline(req, new RemoveCrmPipelineSecurity(
            "<value>"){{
                jwt = "<YOUR_API_KEY_HERE>";
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

| Parameter                                                                                                                    | Type                                                                                                                         | Required                                                                                                                     | Description                                                                                                                  |
| ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                    | [com.unifiedapi.unifiedto.models.operations.RemoveCrmPipelineRequest](../../models/operations/RemoveCrmPipelineRequest.md)   | :heavy_check_mark:                                                                                                           | The request object to use for the request.                                                                                   |
| `security`                                                                                                                   | [com.unifiedapi.unifiedto.models.operations.RemoveCrmPipelineSecurity](../../models/operations/RemoveCrmPipelineSecurity.md) | :heavy_check_mark:                                                                                                           | The security requirements to use for the request.                                                                            |


### Response

**[com.unifiedapi.unifiedto.models.operations.RemoveCrmPipelineResponse](../../models/operations/RemoveCrmPipelineResponse.md)**


## updateCrmCompany

Update a company

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.UpdateCrmCompanyRequest;
import com.unifiedapi.unifiedto.models.operations.UpdateCrmCompanyResponse;
import com.unifiedapi.unifiedto.models.operations.UpdateCrmCompanySecurity;
import com.unifiedapi.unifiedto.models.shared.CrmCompany;
import com.unifiedapi.unifiedto.models.shared.CrmEmail;
import com.unifiedapi.unifiedto.models.shared.CrmEmailType;
import com.unifiedapi.unifiedto.models.shared.CrmTelephone;
import com.unifiedapi.unifiedto.models.shared.CrmTelephoneType;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmCompanyAddress;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()            .build();

            com.unifiedapi.unifiedto.models.operations.UpdateCrmCompanyRequest req = new UpdateCrmCompanyRequest(
                "<value>",
                "<value>"){{
                crmCompany = new CrmCompany(
){{
                    address = new PropertyCrmCompanyAddress(
){{
                        address1 = "<value>";
                        address2 = "<value>";
                        city = "Margeshire";
                        country = "Bahrain";
                        countryCode = "WS";
                        postalCode = "27563";
                        region = "<value>";
                        regionCode = "<value>";

                    }};
                    createdAt = OffsetDateTime.parse("2023-06-19T10:10:37.376Z");
                    dealIds = new String[]{{
                        add("<value>"),
                    }};
                    description = "Future-proofed zero defect instruction set";
                    emails = new com.unifiedapi.unifiedto.models.shared.CrmEmail[]{{
                        add(new CrmEmail(
                        ){{}}),
                    }};
                    employees = 1100.41d;
                    id = "<id>";
                    industry = "<value>";
                    isActive = false;
                    linkUrls = new String[]{{
                        add("<value>"),
                    }};
                    name = "<value>";
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "<value>");
                    }};
                    tags = new String[]{{
                        add("<value>"),
                    }};
                    telephones = new com.unifiedapi.unifiedto.models.shared.CrmTelephone[]{{
                        add(new CrmTelephone(
                        "<value>"){{
                            telephone = "<value>";
                        }}),
                    }};
                    timezone = "Africa/Harare";
                    updatedAt = OffsetDateTime.parse("2023-09-13T13:49:01.082Z");
                    userId = "<value>";
                    websites = new String[]{{
                        add("<value>"),
                    }};

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.UpdateCrmCompanyResponse res = sdk.crm.updateCrmCompany(req, new UpdateCrmCompanySecurity(
            "<value>"){{
                jwt = "<YOUR_API_KEY_HERE>";
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

| Parameter                                                                                                                  | Type                                                                                                                       | Required                                                                                                                   | Description                                                                                                                |
| -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                  | [com.unifiedapi.unifiedto.models.operations.UpdateCrmCompanyRequest](../../models/operations/UpdateCrmCompanyRequest.md)   | :heavy_check_mark:                                                                                                         | The request object to use for the request.                                                                                 |
| `security`                                                                                                                 | [com.unifiedapi.unifiedto.models.operations.UpdateCrmCompanySecurity](../../models/operations/UpdateCrmCompanySecurity.md) | :heavy_check_mark:                                                                                                         | The security requirements to use for the request.                                                                          |


### Response

**[com.unifiedapi.unifiedto.models.operations.UpdateCrmCompanyResponse](../../models/operations/UpdateCrmCompanyResponse.md)**


## updateCrmContact

Update a contact

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.UpdateCrmContactRequest;
import com.unifiedapi.unifiedto.models.operations.UpdateCrmContactResponse;
import com.unifiedapi.unifiedto.models.operations.UpdateCrmContactSecurity;
import com.unifiedapi.unifiedto.models.shared.CrmContact;
import com.unifiedapi.unifiedto.models.shared.CrmEmail;
import com.unifiedapi.unifiedto.models.shared.CrmEmailType;
import com.unifiedapi.unifiedto.models.shared.CrmTelephone;
import com.unifiedapi.unifiedto.models.shared.CrmTelephoneType;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmContactAddress;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()            .build();

            com.unifiedapi.unifiedto.models.operations.UpdateCrmContactRequest req = new UpdateCrmContactRequest(
                "<value>",
                "<value>"){{
                crmContact = new CrmContact(
){{
                    address = new PropertyCrmContactAddress(
){{
                        address1 = "<value>";
                        address2 = "<value>";
                        city = "Fort Carlee";
                        country = "Greenland";
                        countryCode = "AQ";
                        postalCode = "88650";
                        region = "<value>";
                        regionCode = "<value>";

                    }};
                    company = "Hoeger Group";
                    companyIds = new String[]{{
                        add("<value>"),
                    }};
                    createdAt = OffsetDateTime.parse("2022-02-12T12:31:59.837Z");
                    dealIds = new String[]{{
                        add("<value>"),
                    }};
                    emails = new com.unifiedapi.unifiedto.models.shared.CrmEmail[]{{
                        add(new CrmEmail(
                        ){{}}),
                    }};
                    id = "<id>";
                    name = "<value>";
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "<value>");
                    }};
                    telephones = new com.unifiedapi.unifiedto.models.shared.CrmTelephone[]{{
                        add(new CrmTelephone(
                        "<value>"){{
                            telephone = "<value>";
                        }}),
                    }};
                    title = "<value>";
                    updatedAt = OffsetDateTime.parse("2023-09-02T17:59:32.331Z");
                    userId = "<value>";

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.UpdateCrmContactResponse res = sdk.crm.updateCrmContact(req, new UpdateCrmContactSecurity(
            "<value>"){{
                jwt = "<YOUR_API_KEY_HERE>";
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

| Parameter                                                                                                                  | Type                                                                                                                       | Required                                                                                                                   | Description                                                                                                                |
| -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                  | [com.unifiedapi.unifiedto.models.operations.UpdateCrmContactRequest](../../models/operations/UpdateCrmContactRequest.md)   | :heavy_check_mark:                                                                                                         | The request object to use for the request.                                                                                 |
| `security`                                                                                                                 | [com.unifiedapi.unifiedto.models.operations.UpdateCrmContactSecurity](../../models/operations/UpdateCrmContactSecurity.md) | :heavy_check_mark:                                                                                                         | The security requirements to use for the request.                                                                          |


### Response

**[com.unifiedapi.unifiedto.models.operations.UpdateCrmContactResponse](../../models/operations/UpdateCrmContactResponse.md)**


## updateCrmDeal

Update a deal

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.UpdateCrmDealRequest;
import com.unifiedapi.unifiedto.models.operations.UpdateCrmDealResponse;
import com.unifiedapi.unifiedto.models.operations.UpdateCrmDealSecurity;
import com.unifiedapi.unifiedto.models.shared.CrmDeal;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()            .build();

            com.unifiedapi.unifiedto.models.operations.UpdateCrmDealRequest req = new UpdateCrmDealRequest(
                "<value>",
                "<value>"){{
                crmDeal = new CrmDeal(
){{
                    amount = 854.3d;
                    closedAt = OffsetDateTime.parse("2023-01-13T15:21:09.134Z");
                    createdAt = OffsetDateTime.parse("2022-11-20T23:55:13.334Z");
                    currency = "Pound Sterling";
                    id = "<id>";
                    lostReason = "<value>";
                    name = "<value>";
                    pipeline = "<value>";
                    probability = 2970.01d;
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "<value>");
                    }};
                    source = "<value>";
                    stage = "<value>";
                    tags = new String[]{{
                        add("<value>"),
                    }};
                    updatedAt = OffsetDateTime.parse("2023-02-01T00:17:19.942Z");
                    userId = "<value>";
                    wonReason = "<value>";

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.UpdateCrmDealResponse res = sdk.crm.updateCrmDeal(req, new UpdateCrmDealSecurity(
            "<value>"){{
                jwt = "<YOUR_API_KEY_HERE>";
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

| Parameter                                                                                                            | Type                                                                                                                 | Required                                                                                                             | Description                                                                                                          |
| -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                            | [com.unifiedapi.unifiedto.models.operations.UpdateCrmDealRequest](../../models/operations/UpdateCrmDealRequest.md)   | :heavy_check_mark:                                                                                                   | The request object to use for the request.                                                                           |
| `security`                                                                                                           | [com.unifiedapi.unifiedto.models.operations.UpdateCrmDealSecurity](../../models/operations/UpdateCrmDealSecurity.md) | :heavy_check_mark:                                                                                                   | The security requirements to use for the request.                                                                    |


### Response

**[com.unifiedapi.unifiedto.models.operations.UpdateCrmDealResponse](../../models/operations/UpdateCrmDealResponse.md)**


## updateCrmEvent

Update a event

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.UpdateCrmEventRequest;
import com.unifiedapi.unifiedto.models.operations.UpdateCrmEventResponse;
import com.unifiedapi.unifiedto.models.operations.UpdateCrmEventSecurity;
import com.unifiedapi.unifiedto.models.shared.CrmEvent;
import com.unifiedapi.unifiedto.models.shared.CrmEventType;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmEventCall;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmEventEmail;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmEventMeeting;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmEventNote;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmEventTask;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmEventTaskStatus;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()            .build();

            com.unifiedapi.unifiedto.models.operations.UpdateCrmEventRequest req = new UpdateCrmEventRequest(
                "<value>",
                "<value>"){{
                crmEvent = new CrmEvent(
){{
                    call = new PropertyCrmEventCall(
){{
                        description = "Intuitive incremental orchestration";
                        duration = 4665.81d;
                        startAt = OffsetDateTime.parse("2022-09-01T05:59:54.461Z");

                    }};
                    companyIds = new String[]{{
                        add("<value>"),
                    }};
                    contactIds = new String[]{{
                        add("<value>"),
                    }};
                    createdAt = OffsetDateTime.parse("2023-09-01T08:44:00.944Z");
                    dealIds = new String[]{{
                        add("<value>"),
                    }};
                    email = new PropertyCrmEventEmail(
){{
                        attachmentFileIds = new String[]{{
                            add("<value>"),
                        }};
                        body = "<value>";
                        cc = new String[]{{
                            add("<value>"),
                        }};
                        from = "<value>";
                        subject = "<value>";
                        to = new String[]{{
                            add("<value>"),
                        }};

                    }};
                    id = "<id>";
                    leadIds = new String[]{{
                        add("<value>"),
                    }};
                    meeting = new PropertyCrmEventMeeting(
){{
                        description = "Robust radical task-force";
                        endAt = OffsetDateTime.parse("2024-01-04T13:11:49.866Z");
                        startAt = OffsetDateTime.parse("2024-07-14T19:40:01.934Z");
                        title = "<value>";

                    }};
                    note = new PropertyCrmEventNote(
){{
                        description = "Visionary actuating migration";

                    }};
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "<value>");
                    }};
                    task = new PropertyCrmEventTask(
){{
                        description = "Synergized neutral complexity";
                        dueAt = OffsetDateTime.parse("2022-06-26T11:53:18.745Z");
                        name = "<value>";
                        status = PropertyCrmEventTaskStatus.DEFERRED;

                    }};
                    type = CrmEventType.CALL;
                    updatedAt = OffsetDateTime.parse("2023-02-13T22:59:19.685Z");
                    userId = "<value>";

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.UpdateCrmEventResponse res = sdk.crm.updateCrmEvent(req, new UpdateCrmEventSecurity(
            "<value>"){{
                jwt = "<YOUR_API_KEY_HERE>";
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

| Parameter                                                                                                              | Type                                                                                                                   | Required                                                                                                               | Description                                                                                                            |
| ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                              | [com.unifiedapi.unifiedto.models.operations.UpdateCrmEventRequest](../../models/operations/UpdateCrmEventRequest.md)   | :heavy_check_mark:                                                                                                     | The request object to use for the request.                                                                             |
| `security`                                                                                                             | [com.unifiedapi.unifiedto.models.operations.UpdateCrmEventSecurity](../../models/operations/UpdateCrmEventSecurity.md) | :heavy_check_mark:                                                                                                     | The security requirements to use for the request.                                                                      |


### Response

**[com.unifiedapi.unifiedto.models.operations.UpdateCrmEventResponse](../../models/operations/UpdateCrmEventResponse.md)**


## updateCrmLead

Update a lead

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.UpdateCrmLeadRequest;
import com.unifiedapi.unifiedto.models.operations.UpdateCrmLeadResponse;
import com.unifiedapi.unifiedto.models.operations.UpdateCrmLeadSecurity;
import com.unifiedapi.unifiedto.models.shared.CrmEmail;
import com.unifiedapi.unifiedto.models.shared.CrmEmailType;
import com.unifiedapi.unifiedto.models.shared.CrmLead;
import com.unifiedapi.unifiedto.models.shared.CrmTelephone;
import com.unifiedapi.unifiedto.models.shared.CrmTelephoneType;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmLeadAddress;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()            .build();

            com.unifiedapi.unifiedto.models.operations.UpdateCrmLeadRequest req = new UpdateCrmLeadRequest(
                "<value>",
                "<value>"){{
                crmLead = new CrmLead(
){{
                    address = new PropertyCrmLeadAddress(
){{
                        address1 = "<value>";
                        address2 = "<value>";
                        city = "West Vernerworth";
                        country = "Suriname";
                        countryCode = "ID";
                        postalCode = "87400-2256";
                        region = "<value>";
                        regionCode = "<value>";

                    }};
                    companyId = "<value>";
                    companyName = "Gibson - Cummings";
                    contactId = "<value>";
                    createdAt = OffsetDateTime.parse("2024-12-12T08:55:32.549Z");
                    creatorUserId = "<value>";
                    emails = new com.unifiedapi.unifiedto.models.shared.CrmEmail[]{{
                        add(new CrmEmail(
                        ){{}}),
                    }};
                    id = "<id>";
                    isActive = false;
                    name = "<value>";
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "<value>");
                    }};
                    source = "<value>";
                    status = "<value>";
                    telephones = new com.unifiedapi.unifiedto.models.shared.CrmTelephone[]{{
                        add(new CrmTelephone(
                        "<value>"){{
                            telephone = "<value>";
                        }}),
                    }};
                    updatedAt = OffsetDateTime.parse("2023-06-14T10:08:49.472Z");
                    userId = "<value>";

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.UpdateCrmLeadResponse res = sdk.crm.updateCrmLead(req, new UpdateCrmLeadSecurity(
            "<value>"){{
                jwt = "<YOUR_API_KEY_HERE>";
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

| Parameter                                                                                                            | Type                                                                                                                 | Required                                                                                                             | Description                                                                                                          |
| -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                            | [com.unifiedapi.unifiedto.models.operations.UpdateCrmLeadRequest](../../models/operations/UpdateCrmLeadRequest.md)   | :heavy_check_mark:                                                                                                   | The request object to use for the request.                                                                           |
| `security`                                                                                                           | [com.unifiedapi.unifiedto.models.operations.UpdateCrmLeadSecurity](../../models/operations/UpdateCrmLeadSecurity.md) | :heavy_check_mark:                                                                                                   | The security requirements to use for the request.                                                                    |


### Response

**[com.unifiedapi.unifiedto.models.operations.UpdateCrmLeadResponse](../../models/operations/UpdateCrmLeadResponse.md)**


## updateCrmPipeline

Update a pipeline

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.UpdateCrmPipelineRequest;
import com.unifiedapi.unifiedto.models.operations.UpdateCrmPipelineResponse;
import com.unifiedapi.unifiedto.models.operations.UpdateCrmPipelineSecurity;
import com.unifiedapi.unifiedto.models.shared.CrmPipeline;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()            .build();

            com.unifiedapi.unifiedto.models.operations.UpdateCrmPipelineRequest req = new UpdateCrmPipelineRequest(
                "<value>",
                "<value>"){{
                crmPipeline = new CrmPipeline(
){{
                    createdAt = OffsetDateTime.parse("2022-12-27T16:21:58.595Z");
                    dealProbability = 8923.83d;
                    displayOrder = 5142.22d;
                    id = "<id>";
                    isActive = false;
                    name = "<value>";
                    raw = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "<value>");
                    }};
                    updatedAt = OffsetDateTime.parse("2023-11-03T02:41:03.928Z");

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.UpdateCrmPipelineResponse res = sdk.crm.updateCrmPipeline(req, new UpdateCrmPipelineSecurity(
            "<value>"){{
                jwt = "<YOUR_API_KEY_HERE>";
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

| Parameter                                                                                                                    | Type                                                                                                                         | Required                                                                                                                     | Description                                                                                                                  |
| ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                    | [com.unifiedapi.unifiedto.models.operations.UpdateCrmPipelineRequest](../../models/operations/UpdateCrmPipelineRequest.md)   | :heavy_check_mark:                                                                                                           | The request object to use for the request.                                                                                   |
| `security`                                                                                                                   | [com.unifiedapi.unifiedto.models.operations.UpdateCrmPipelineSecurity](../../models/operations/UpdateCrmPipelineSecurity.md) | :heavy_check_mark:                                                                                                           | The security requirements to use for the request.                                                                            |


### Response

**[com.unifiedapi.unifiedto.models.operations.UpdateCrmPipelineResponse](../../models/operations/UpdateCrmPipelineResponse.md)**

