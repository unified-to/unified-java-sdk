# Crm
(*crm*)

### Available Operations

* [createCrmCompany](#createcrmcompany) - Create a company
* [createCrmContact](#createcrmcontact) - Create a contact
* [createCrmDeal](#createcrmdeal) - Create a deal
* [createCrmEvent](#createcrmevent) - Create a event
* [createCrmFile](#createcrmfile) - Create a file
* [createCrmLead](#createcrmlead) - Create a lead
* [createCrmPipeline](#createcrmpipeline) - Create a pipeline
* [getCrmCompany](#getcrmcompany) - Retrieve a company
* [getCrmContact](#getcrmcontact) - Retrieve a contact
* [getCrmDeal](#getcrmdeal) - Retrieve a deal
* [getCrmEvent](#getcrmevent) - Retrieve a event
* [getCrmFile](#getcrmfile) - Retrieve a file
* [getCrmLead](#getcrmlead) - Retrieve a lead
* [getCrmPipeline](#getcrmpipeline) - Retrieve a pipeline
* [listCrmCompanies](#listcrmcompanies) - List all companies
* [listCrmContacts](#listcrmcontacts) - List all contacts
* [listCrmDeals](#listcrmdeals) - List all deals
* [listCrmEvents](#listcrmevents) - List all events
* [listCrmFiles](#listcrmfiles) - List all files
* [listCrmLeads](#listcrmleads) - List all leads
* [listCrmPipelines](#listcrmpipelines) - List all pipelines
* [patchCrmCompany](#patchcrmcompany) - Update a company
* [patchCrmContact](#patchcrmcontact) - Update a contact
* [patchCrmDeal](#patchcrmdeal) - Update a deal
* [patchCrmEvent](#patchcrmevent) - Update a event
* [patchCrmFile](#patchcrmfile) - Update a file
* [patchCrmLead](#patchcrmlead) - Update a lead
* [patchCrmPipeline](#patchcrmpipeline) - Update a pipeline
* [removeCrmCompany](#removecrmcompany) - Remove a company
* [removeCrmContact](#removecrmcontact) - Remove a contact
* [removeCrmDeal](#removecrmdeal) - Remove a deal
* [removeCrmEvent](#removecrmevent) - Remove a event
* [removeCrmFile](#removecrmfile) - Remove a file
* [removeCrmLead](#removecrmlead) - Remove a lead
* [removeCrmPipeline](#removecrmpipeline) - Remove a pipeline
* [updateCrmCompany](#updatecrmcompany) - Update a company
* [updateCrmContact](#updatecrmcontact) - Update a contact
* [updateCrmDeal](#updatecrmdeal) - Update a deal
* [updateCrmEvent](#updatecrmevent) - Update a event
* [updateCrmFile](#updatecrmfile) - Update a file
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
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.CreateCrmCompanyRequest req = new CreateCrmCompanyRequest(
                "string"){{
                crmCompany = new CrmCompany(
){{
                    address = new PropertyCrmCompanyAddress(
){{
                        address1 = "string";
                        address2 = "string";
                        city = "Joanieworth";
                        country = "Brazil";
                        countryCode = "CW";
                        postalCode = "39571";
                        region = "string";
                        regionCode = "string";

                    }};
                    createdAt = OffsetDateTime.parse("2024-02-03T10:04:12.712Z");
                    dealIds = new String[]{{
                        add("string"),
                    }};
                    description = "Pre-emptive responsive task-force";
                    emails = new com.unifiedapi.unifiedto.models.shared.CrmEmail[]{{
                        add(new CrmEmail(
                        ){{}}),
                    }};
                    employees = 4175.89d;
                    id = "<ID>";
                    industry = "string";
                    isActive = false;
                    linkUrls = new String[]{{
                        add("string"),
                    }};
                    name = "string";
                    raw = new PropertyCrmCompanyRaw(
);
                    tags = new String[]{{
                        add("string"),
                    }};
                    telephones = new com.unifiedapi.unifiedto.models.shared.CrmTelephone[]{{
                        add(new CrmTelephone(
                        "string"){{
                            telephone = "string";
                        }}),
                    }};
                    timezone = "Europe/Bucharest";
                    updatedAt = OffsetDateTime.parse("2023-10-03T19:32:53.625Z");
                    userId = "string";
                    websites = new String[]{{
                        add("string"),
                    }};

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.CreateCrmCompanyResponse res = sdk.crm.createCrmCompany(req);

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
| `request`                                                                                                                | [com.unifiedapi.unifiedto.models.operations.CreateCrmCompanyRequest](../../models/operations/CreateCrmCompanyRequest.md) | :heavy_check_mark:                                                                                                       | The request object to use for the request.                                                                               |


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
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.CreateCrmContactRequest req = new CreateCrmContactRequest(
                "string"){{
                crmContact = new CrmContact(
){{
                    address = new PropertyCrmContactAddress(
){{
                        address1 = "string";
                        address2 = "string";
                        city = "Steuberview";
                        country = "Bulgaria";
                        countryCode = "QA";
                        postalCode = "98809";
                        region = "string";
                        regionCode = "string";

                    }};
                    company = "Pollich, Emard and Parker";
                    companyIds = new String[]{{
                        add("string"),
                    }};
                    createdAt = OffsetDateTime.parse("2024-03-07T10:13:21.309Z");
                    dealIds = new String[]{{
                        add("string"),
                    }};
                    emails = new com.unifiedapi.unifiedto.models.shared.CrmEmail[]{{
                        add(new CrmEmail(
                        ){{}}),
                    }};
                    id = "<ID>";
                    name = "string";
                    raw = new PropertyCrmContactRaw(
);
                    telephones = new com.unifiedapi.unifiedto.models.shared.CrmTelephone[]{{
                        add(new CrmTelephone(
                        "string"){{
                            telephone = "string";
                        }}),
                    }};
                    title = "string";
                    updatedAt = OffsetDateTime.parse("2024-03-21T17:10:02.454Z");
                    userId = "string";

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.CreateCrmContactResponse res = sdk.crm.createCrmContact(req);

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
| `request`                                                                                                                | [com.unifiedapi.unifiedto.models.operations.CreateCrmContactRequest](../../models/operations/CreateCrmContactRequest.md) | :heavy_check_mark:                                                                                                       | The request object to use for the request.                                                                               |


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
import com.unifiedapi.unifiedto.models.shared.CrmDeal;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmDealRaw;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.CreateCrmDealRequest req = new CreateCrmDealRequest(
                "string"){{
                crmDeal = new CrmDeal(
){{
                    amount = 1917.45d;
                    closedAt = OffsetDateTime.parse("2023-08-28T04:18:49.785Z");
                    createdAt = OffsetDateTime.parse("2023-07-23T15:31:52.925Z");
                    currency = "Cuban Peso";
                    id = "<ID>";
                    lostReason = "string";
                    name = "string";
                    pipeline = "string";
                    probability = 1087.81d;
                    raw = new PropertyCrmDealRaw(
);
                    source = "string";
                    stage = "string";
                    tags = new String[]{{
                        add("string"),
                    }};
                    updatedAt = OffsetDateTime.parse("2023-10-13T19:43:32.331Z");
                    userId = "string";
                    wonReason = "string";

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.CreateCrmDealResponse res = sdk.crm.createCrmDeal(req);

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
| `request`                                                                                                          | [com.unifiedapi.unifiedto.models.operations.CreateCrmDealRequest](../../models/operations/CreateCrmDealRequest.md) | :heavy_check_mark:                                                                                                 | The request object to use for the request.                                                                         |


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
import com.unifiedapi.unifiedto.models.shared.CrmEvent;
import com.unifiedapi.unifiedto.models.shared.CrmEventType;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmEventCall;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmEventEmail;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmEventMeeting;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmEventNote;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmEventRaw;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmEventTask;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmEventTaskStatus;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.CreateCrmEventRequest req = new CreateCrmEventRequest(
                "string"){{
                crmEvent = new CrmEvent(
){{
                    call = new PropertyCrmEventCall(
){{
                        description = "Grass-roots intangible superstructure";
                        duration = 6684.26d;
                        startAt = OffsetDateTime.parse("2024-07-14T22:05:40.365Z");

                    }};
                    companyIds = new String[]{{
                        add("string"),
                    }};
                    contactIds = new String[]{{
                        add("string"),
                    }};
                    createdAt = OffsetDateTime.parse("2024-08-20T19:58:06.686Z");
                    dealIds = new String[]{{
                        add("string"),
                    }};
                    email = new PropertyCrmEventEmail(
){{
                        attachmentFileIds = new String[]{{
                            add("string"),
                        }};
                        body = "string";
                        cc = new String[]{{
                            add("string"),
                        }};
                        createdAt = OffsetDateTime.parse("2024-08-07T07:41:34.472Z");
                        from = "string";
                        subject = "string";
                        to = new String[]{{
                            add("string"),
                        }};

                    }};
                    id = "<ID>";
                    leadIds = new String[]{{
                        add("string"),
                    }};
                    meeting = new PropertyCrmEventMeeting(
){{
                        description = "Ameliorated bottom-line internet solution";
                        endAt = OffsetDateTime.parse("2023-02-09T03:55:08.657Z");
                        startAt = OffsetDateTime.parse("2024-11-30T17:20:52.105Z");
                        title = "string";

                    }};
                    note = new PropertyCrmEventNote(
){{
                        createdAt = OffsetDateTime.parse("2022-03-29T07:09:52.923Z");
                        description = "Extended 5th generation artificial intelligence";

                    }};
                    raw = new PropertyCrmEventRaw(
);
                    task = new PropertyCrmEventTask(
){{
                        description = "Multi-tiered impactful attitude";
                        dueAt = OffsetDateTime.parse("2023-03-26T13:32:41.446Z");
                        name = "string";
                        status = PropertyCrmEventTaskStatus.COMPLETED;

                    }};
                    type = CrmEventType.NOTE;
                    updatedAt = OffsetDateTime.parse("2024-12-09T05:29:10.624Z");
                    userId = "string";

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.CreateCrmEventResponse res = sdk.crm.createCrmEvent(req);

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
| `request`                                                                                                            | [com.unifiedapi.unifiedto.models.operations.CreateCrmEventRequest](../../models/operations/CreateCrmEventRequest.md) | :heavy_check_mark:                                                                                                   | The request object to use for the request.                                                                           |


### Response

**[com.unifiedapi.unifiedto.models.operations.CreateCrmEventResponse](../../models/operations/CreateCrmEventResponse.md)**


## createCrmFile

Create a file

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.CreateCrmFileRequest;
import com.unifiedapi.unifiedto.models.operations.CreateCrmFileResponse;
import com.unifiedapi.unifiedto.models.shared.CrmFile;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmFileRaw;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.CreateCrmFileRequest req = new CreateCrmFileRequest(
                "string"){{
                crmFile = new CrmFile(
){{
                    companyId = "string";
                    contactId = "string";
                    createdAt = OffsetDateTime.parse("2024-08-23T14:06:46.596Z");
                    dealId = "string";
                    description = "Multi-lateral background database";
                    downloadUrl = "string";
                    eventId = "string";
                    id = "<ID>";
                    isActive = false;
                    leadId = "string";
                    mimeType = "string";
                    name = "string";
                    raw = new PropertyCrmFileRaw(
);
                    size = 2318.83d;
                    updatedAt = OffsetDateTime.parse("2024-11-27T09:12:07.889Z");
                    userId = "string";

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.CreateCrmFileResponse res = sdk.crm.createCrmFile(req);

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

| Parameter                                                                                                          | Type                                                                                                               | Required                                                                                                           | Description                                                                                                        |
| ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                          | [com.unifiedapi.unifiedto.models.operations.CreateCrmFileRequest](../../models/operations/CreateCrmFileRequest.md) | :heavy_check_mark:                                                                                                 | The request object to use for the request.                                                                         |


### Response

**[com.unifiedapi.unifiedto.models.operations.CreateCrmFileResponse](../../models/operations/CreateCrmFileResponse.md)**


## createCrmLead

Create a lead

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.CreateCrmLeadRequest;
import com.unifiedapi.unifiedto.models.operations.CreateCrmLeadResponse;
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
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.CreateCrmLeadRequest req = new CreateCrmLeadRequest(
                "string"){{
                crmLead = new CrmLead(
){{
                    address = new PropertyCrmLeadAddress(
){{
                        address1 = "string";
                        address2 = "string";
                        city = "Lindboro";
                        country = "Saint Barthelemy";
                        countryCode = "SG";
                        postalCode = "67307-8667";
                        region = "string";
                        regionCode = "string";

                    }};
                    companyId = "string";
                    companyName = "Langosh - Fritsch";
                    contactId = "string";
                    createdAt = OffsetDateTime.parse("2023-12-23T15:29:07.093Z");
                    creatorUserId = "string";
                    emails = new com.unifiedapi.unifiedto.models.shared.CrmEmail[]{{
                        add(new CrmEmail(
                        ){{}}),
                    }};
                    id = "<ID>";
                    isActive = false;
                    name = "string";
                    raw = new PropertyCrmLeadRaw(
);
                    source = "string";
                    status = "string";
                    telephones = new com.unifiedapi.unifiedto.models.shared.CrmTelephone[]{{
                        add(new CrmTelephone(
                        "string"){{
                            telephone = "string";
                        }}),
                    }};
                    updatedAt = OffsetDateTime.parse("2024-09-01T18:33:52.670Z");
                    userId = "string";

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.CreateCrmLeadResponse res = sdk.crm.createCrmLead(req);

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
| `request`                                                                                                          | [com.unifiedapi.unifiedto.models.operations.CreateCrmLeadRequest](../../models/operations/CreateCrmLeadRequest.md) | :heavy_check_mark:                                                                                                 | The request object to use for the request.                                                                         |


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
import com.unifiedapi.unifiedto.models.shared.CrmPipeline;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmPipelineRaw;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.CreateCrmPipelineRequest req = new CreateCrmPipelineRequest(
                "string"){{
                crmPipeline = new CrmPipeline(
){{
                    createdAt = OffsetDateTime.parse("2024-06-24T10:05:30.432Z");
                    dealProbability = false;
                    displayOrder = 6254.97d;
                    id = "<ID>";
                    isActive = false;
                    name = "string";
                    raw = new PropertyCrmPipelineRaw(
);
                    updatedAt = OffsetDateTime.parse("2022-12-01T13:29:52.270Z");

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.CreateCrmPipelineResponse res = sdk.crm.createCrmPipeline(req);

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
| `request`                                                                                                                  | [com.unifiedapi.unifiedto.models.operations.CreateCrmPipelineRequest](../../models/operations/CreateCrmPipelineRequest.md) | :heavy_check_mark:                                                                                                         | The request object to use for the request.                                                                                 |


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
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.GetCrmCompanyRequest req = new GetCrmCompanyRequest(
                "string",
                "string"){{
                fields = new String[]{{
                    add("string"),
                }};

            }};

            com.unifiedapi.unifiedto.models.operations.GetCrmCompanyResponse res = sdk.crm.getCrmCompany(req);

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

| Parameter                                                                                                          | Type                                                                                                               | Required                                                                                                           | Description                                                                                                        |
| ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                          | [com.unifiedapi.unifiedto.models.operations.GetCrmCompanyRequest](../../models/operations/GetCrmCompanyRequest.md) | :heavy_check_mark:                                                                                                 | The request object to use for the request.                                                                         |


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
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.GetCrmContactRequest req = new GetCrmContactRequest(
                "string",
                "string"){{
                fields = new String[]{{
                    add("string"),
                }};

            }};

            com.unifiedapi.unifiedto.models.operations.GetCrmContactResponse res = sdk.crm.getCrmContact(req);

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

| Parameter                                                                                                          | Type                                                                                                               | Required                                                                                                           | Description                                                                                                        |
| ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                          | [com.unifiedapi.unifiedto.models.operations.GetCrmContactRequest](../../models/operations/GetCrmContactRequest.md) | :heavy_check_mark:                                                                                                 | The request object to use for the request.                                                                         |


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
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.GetCrmDealRequest req = new GetCrmDealRequest(
                "string",
                "string"){{
                fields = new String[]{{
                    add("string"),
                }};

            }};

            com.unifiedapi.unifiedto.models.operations.GetCrmDealResponse res = sdk.crm.getCrmDeal(req);

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

| Parameter                                                                                                    | Type                                                                                                         | Required                                                                                                     | Description                                                                                                  |
| ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                    | [com.unifiedapi.unifiedto.models.operations.GetCrmDealRequest](../../models/operations/GetCrmDealRequest.md) | :heavy_check_mark:                                                                                           | The request object to use for the request.                                                                   |


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
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.GetCrmEventRequest req = new GetCrmEventRequest(
                "string",
                "string"){{
                fields = new String[]{{
                    add("string"),
                }};

            }};

            com.unifiedapi.unifiedto.models.operations.GetCrmEventResponse res = sdk.crm.getCrmEvent(req);

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

| Parameter                                                                                                      | Type                                                                                                           | Required                                                                                                       | Description                                                                                                    |
| -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                      | [com.unifiedapi.unifiedto.models.operations.GetCrmEventRequest](../../models/operations/GetCrmEventRequest.md) | :heavy_check_mark:                                                                                             | The request object to use for the request.                                                                     |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetCrmEventResponse](../../models/operations/GetCrmEventResponse.md)**


## getCrmFile

Retrieve a file

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetCrmFileRequest;
import com.unifiedapi.unifiedto.models.operations.GetCrmFileResponse;
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.GetCrmFileRequest req = new GetCrmFileRequest(
                "string",
                "string"){{
                fields = new String[]{{
                    add("string"),
                }};

            }};

            com.unifiedapi.unifiedto.models.operations.GetCrmFileResponse res = sdk.crm.getCrmFile(req);

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

| Parameter                                                                                                    | Type                                                                                                         | Required                                                                                                     | Description                                                                                                  |
| ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                    | [com.unifiedapi.unifiedto.models.operations.GetCrmFileRequest](../../models/operations/GetCrmFileRequest.md) | :heavy_check_mark:                                                                                           | The request object to use for the request.                                                                   |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetCrmFileResponse](../../models/operations/GetCrmFileResponse.md)**


## getCrmLead

Retrieve a lead

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetCrmLeadRequest;
import com.unifiedapi.unifiedto.models.operations.GetCrmLeadResponse;
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.GetCrmLeadRequest req = new GetCrmLeadRequest(
                "string",
                "string"){{
                fields = new String[]{{
                    add("string"),
                }};

            }};

            com.unifiedapi.unifiedto.models.operations.GetCrmLeadResponse res = sdk.crm.getCrmLead(req);

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

| Parameter                                                                                                    | Type                                                                                                         | Required                                                                                                     | Description                                                                                                  |
| ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                    | [com.unifiedapi.unifiedto.models.operations.GetCrmLeadRequest](../../models/operations/GetCrmLeadRequest.md) | :heavy_check_mark:                                                                                           | The request object to use for the request.                                                                   |


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
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.GetCrmPipelineRequest req = new GetCrmPipelineRequest(
                "string",
                "string"){{
                fields = new String[]{{
                    add("string"),
                }};

            }};

            com.unifiedapi.unifiedto.models.operations.GetCrmPipelineResponse res = sdk.crm.getCrmPipeline(req);

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

| Parameter                                                                                                            | Type                                                                                                                 | Required                                                                                                             | Description                                                                                                          |
| -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                            | [com.unifiedapi.unifiedto.models.operations.GetCrmPipelineRequest](../../models/operations/GetCrmPipelineRequest.md) | :heavy_check_mark:                                                                                                   | The request object to use for the request.                                                                           |


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
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.ListCrmCompaniesRequest req = new ListCrmCompaniesRequest(
                "string"){{
                contactId = "string";
                dealId = "string";
                fields = new String[]{{
                    add("string"),
                }};
                limit = 9883.97d;
                offset = 5913.88d;
                order = "string";
                query = "string";
                sort = "string";
                updatedGte = OffsetDateTime.parse("2023-05-02T17:52:08.731Z");
                userId = "string";

            }};

            com.unifiedapi.unifiedto.models.operations.ListCrmCompaniesResponse res = sdk.crm.listCrmCompanies(req);

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

| Parameter                                                                                                                | Type                                                                                                                     | Required                                                                                                                 | Description                                                                                                              |
| ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                | [com.unifiedapi.unifiedto.models.operations.ListCrmCompaniesRequest](../../models/operations/ListCrmCompaniesRequest.md) | :heavy_check_mark:                                                                                                       | The request object to use for the request.                                                                               |


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
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.ListCrmContactsRequest req = new ListCrmContactsRequest(
                "string"){{
                companyId = "string";
                dealId = "string";
                fields = new String[]{{
                    add("string"),
                }};
                limit = 7110.24d;
                offset = 2657.43d;
                order = "string";
                query = "string";
                sort = "string";
                updatedGte = OffsetDateTime.parse("2023-11-15T19:36:59.401Z");
                userId = "string";

            }};

            com.unifiedapi.unifiedto.models.operations.ListCrmContactsResponse res = sdk.crm.listCrmContacts(req);

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

| Parameter                                                                                                              | Type                                                                                                                   | Required                                                                                                               | Description                                                                                                            |
| ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                              | [com.unifiedapi.unifiedto.models.operations.ListCrmContactsRequest](../../models/operations/ListCrmContactsRequest.md) | :heavy_check_mark:                                                                                                     | The request object to use for the request.                                                                             |


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
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.ListCrmDealsRequest req = new ListCrmDealsRequest(
                "string"){{
                companyId = "string";
                contactId = "string";
                fields = new String[]{{
                    add("string"),
                }};
                limit = 917.49d;
                offset = 8216.92d;
                order = "string";
                query = "string";
                sort = "string";
                updatedGte = OffsetDateTime.parse("2023-09-04T01:39:26.472Z");
                userId = "string";

            }};

            com.unifiedapi.unifiedto.models.operations.ListCrmDealsResponse res = sdk.crm.listCrmDeals(req);

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

| Parameter                                                                                                        | Type                                                                                                             | Required                                                                                                         | Description                                                                                                      |
| ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                        | [com.unifiedapi.unifiedto.models.operations.ListCrmDealsRequest](../../models/operations/ListCrmDealsRequest.md) | :heavy_check_mark:                                                                                               | The request object to use for the request.                                                                       |


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
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.ListCrmEventsRequest req = new ListCrmEventsRequest(
                "string"){{
                companyId = "string";
                contactId = "string";
                dealId = "string";
                fields = new String[]{{
                    add("string"),
                }};
                limit = 4453.11d;
                offset = 4555.2d;
                order = "string";
                query = "string";
                sort = "string";
                type = "string";
                updatedGte = OffsetDateTime.parse("2024-04-30T03:39:38.103Z");
                userId = "string";

            }};

            com.unifiedapi.unifiedto.models.operations.ListCrmEventsResponse res = sdk.crm.listCrmEvents(req);

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

| Parameter                                                                                                          | Type                                                                                                               | Required                                                                                                           | Description                                                                                                        |
| ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                          | [com.unifiedapi.unifiedto.models.operations.ListCrmEventsRequest](../../models/operations/ListCrmEventsRequest.md) | :heavy_check_mark:                                                                                                 | The request object to use for the request.                                                                         |


### Response

**[com.unifiedapi.unifiedto.models.operations.ListCrmEventsResponse](../../models/operations/ListCrmEventsResponse.md)**


## listCrmFiles

List all files

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.ListCrmFilesRequest;
import com.unifiedapi.unifiedto.models.operations.ListCrmFilesResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.ListCrmFilesRequest req = new ListCrmFilesRequest(
                "string"){{
                companyId = "string";
                contactId = "string";
                dealId = "string";
                fields = new String[]{{
                    add("string"),
                }};
                limit = 7725.49d;
                offset = 1697.5d;
                order = "string";
                query = "string";
                sort = "string";
                updatedGte = OffsetDateTime.parse("2024-11-04T17:40:07.899Z");

            }};

            com.unifiedapi.unifiedto.models.operations.ListCrmFilesResponse res = sdk.crm.listCrmFiles(req);

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

| Parameter                                                                                                        | Type                                                                                                             | Required                                                                                                         | Description                                                                                                      |
| ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                        | [com.unifiedapi.unifiedto.models.operations.ListCrmFilesRequest](../../models/operations/ListCrmFilesRequest.md) | :heavy_check_mark:                                                                                               | The request object to use for the request.                                                                       |


### Response

**[com.unifiedapi.unifiedto.models.operations.ListCrmFilesResponse](../../models/operations/ListCrmFilesResponse.md)**


## listCrmLeads

List all leads

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.ListCrmLeadsRequest;
import com.unifiedapi.unifiedto.models.operations.ListCrmLeadsResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.ListCrmLeadsRequest req = new ListCrmLeadsRequest(
                "string"){{
                companyId = "string";
                contactId = "string";
                fields = new String[]{{
                    add("string"),
                }};
                limit = 2895.08d;
                offset = 6446.8d;
                order = "string";
                query = "string";
                sort = "string";
                updatedGte = OffsetDateTime.parse("2024-01-12T07:27:29.016Z");
                userId = "string";

            }};

            com.unifiedapi.unifiedto.models.operations.ListCrmLeadsResponse res = sdk.crm.listCrmLeads(req);

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

| Parameter                                                                                                        | Type                                                                                                             | Required                                                                                                         | Description                                                                                                      |
| ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                        | [com.unifiedapi.unifiedto.models.operations.ListCrmLeadsRequest](../../models/operations/ListCrmLeadsRequest.md) | :heavy_check_mark:                                                                                               | The request object to use for the request.                                                                       |


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
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.ListCrmPipelinesRequest req = new ListCrmPipelinesRequest(
                "string"){{
                fields = new String[]{{
                    add("string"),
                }};
                limit = 3318.18d;
                offset = 4834.28d;
                order = "string";
                query = "string";
                sort = "string";
                updatedGte = OffsetDateTime.parse("2022-04-29T18:23:30.472Z");

            }};

            com.unifiedapi.unifiedto.models.operations.ListCrmPipelinesResponse res = sdk.crm.listCrmPipelines(req);

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

| Parameter                                                                                                                | Type                                                                                                                     | Required                                                                                                                 | Description                                                                                                              |
| ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                | [com.unifiedapi.unifiedto.models.operations.ListCrmPipelinesRequest](../../models/operations/ListCrmPipelinesRequest.md) | :heavy_check_mark:                                                                                                       | The request object to use for the request.                                                                               |


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
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.PatchCrmCompanyRequest req = new PatchCrmCompanyRequest(
                "string",
                "string"){{
                crmCompany = new CrmCompany(
){{
                    address = new PropertyCrmCompanyAddress(
){{
                        address1 = "string";
                        address2 = "string";
                        city = "Rempelchester";
                        country = "Christmas Island";
                        countryCode = "LA";
                        postalCode = "53644";
                        region = "string";
                        regionCode = "string";

                    }};
                    createdAt = OffsetDateTime.parse("2022-01-19T16:53:30.758Z");
                    dealIds = new String[]{{
                        add("string"),
                    }};
                    description = "Diverse mission-critical project";
                    emails = new com.unifiedapi.unifiedto.models.shared.CrmEmail[]{{
                        add(new CrmEmail(
                        ){{}}),
                    }};
                    employees = 4128.78d;
                    id = "<ID>";
                    industry = "string";
                    isActive = false;
                    linkUrls = new String[]{{
                        add("string"),
                    }};
                    name = "string";
                    raw = new PropertyCrmCompanyRaw(
);
                    tags = new String[]{{
                        add("string"),
                    }};
                    telephones = new com.unifiedapi.unifiedto.models.shared.CrmTelephone[]{{
                        add(new CrmTelephone(
                        "string"){{
                            telephone = "string";
                        }}),
                    }};
                    timezone = "Europe/Skopje";
                    updatedAt = OffsetDateTime.parse("2022-04-08T08:19:54.922Z");
                    userId = "string";
                    websites = new String[]{{
                        add("string"),
                    }};

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.PatchCrmCompanyResponse res = sdk.crm.patchCrmCompany(req);

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

| Parameter                                                                                                              | Type                                                                                                                   | Required                                                                                                               | Description                                                                                                            |
| ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                              | [com.unifiedapi.unifiedto.models.operations.PatchCrmCompanyRequest](../../models/operations/PatchCrmCompanyRequest.md) | :heavy_check_mark:                                                                                                     | The request object to use for the request.                                                                             |


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
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.PatchCrmContactRequest req = new PatchCrmContactRequest(
                "string",
                "string"){{
                crmContact = new CrmContact(
){{
                    address = new PropertyCrmContactAddress(
){{
                        address1 = "string";
                        address2 = "string";
                        city = "North Anne";
                        country = "Puerto Rico";
                        countryCode = "GD";
                        postalCode = "31015";
                        region = "string";
                        regionCode = "string";

                    }};
                    company = "Goyette - Schultz";
                    companyIds = new String[]{{
                        add("string"),
                    }};
                    createdAt = OffsetDateTime.parse("2022-07-12T00:15:47.150Z");
                    dealIds = new String[]{{
                        add("string"),
                    }};
                    emails = new com.unifiedapi.unifiedto.models.shared.CrmEmail[]{{
                        add(new CrmEmail(
                        ){{}}),
                    }};
                    id = "<ID>";
                    name = "string";
                    raw = new PropertyCrmContactRaw(
);
                    telephones = new com.unifiedapi.unifiedto.models.shared.CrmTelephone[]{{
                        add(new CrmTelephone(
                        "string"){{
                            telephone = "string";
                        }}),
                    }};
                    title = "string";
                    updatedAt = OffsetDateTime.parse("2022-11-28T22:10:52.030Z");
                    userId = "string";

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.PatchCrmContactResponse res = sdk.crm.patchCrmContact(req);

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

| Parameter                                                                                                              | Type                                                                                                                   | Required                                                                                                               | Description                                                                                                            |
| ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                              | [com.unifiedapi.unifiedto.models.operations.PatchCrmContactRequest](../../models/operations/PatchCrmContactRequest.md) | :heavy_check_mark:                                                                                                     | The request object to use for the request.                                                                             |


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
import com.unifiedapi.unifiedto.models.shared.CrmDeal;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmDealRaw;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.PatchCrmDealRequest req = new PatchCrmDealRequest(
                "string",
                "string"){{
                crmDeal = new CrmDeal(
){{
                    amount = 9874.05d;
                    closedAt = OffsetDateTime.parse("2022-07-09T12:57:05.527Z");
                    createdAt = OffsetDateTime.parse("2023-04-30T17:40:39.112Z");
                    currency = "Riel";
                    id = "<ID>";
                    lostReason = "string";
                    name = "string";
                    pipeline = "string";
                    probability = 9555.58d;
                    raw = new PropertyCrmDealRaw(
);
                    source = "string";
                    stage = "string";
                    tags = new String[]{{
                        add("string"),
                    }};
                    updatedAt = OffsetDateTime.parse("2024-02-22T07:49:20.306Z");
                    userId = "string";
                    wonReason = "string";

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.PatchCrmDealResponse res = sdk.crm.patchCrmDeal(req);

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

| Parameter                                                                                                        | Type                                                                                                             | Required                                                                                                         | Description                                                                                                      |
| ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                        | [com.unifiedapi.unifiedto.models.operations.PatchCrmDealRequest](../../models/operations/PatchCrmDealRequest.md) | :heavy_check_mark:                                                                                               | The request object to use for the request.                                                                       |


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
import com.unifiedapi.unifiedto.models.shared.CrmEvent;
import com.unifiedapi.unifiedto.models.shared.CrmEventType;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmEventCall;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmEventEmail;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmEventMeeting;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmEventNote;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmEventRaw;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmEventTask;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmEventTaskStatus;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.PatchCrmEventRequest req = new PatchCrmEventRequest(
                "string",
                "string"){{
                crmEvent = new CrmEvent(
){{
                    call = new PropertyCrmEventCall(
){{
                        description = "Multi-layered well-modulated middleware";
                        duration = 8718.07d;
                        startAt = OffsetDateTime.parse("2023-07-21T08:28:33.501Z");

                    }};
                    companyIds = new String[]{{
                        add("string"),
                    }};
                    contactIds = new String[]{{
                        add("string"),
                    }};
                    createdAt = OffsetDateTime.parse("2023-02-08T06:50:13.439Z");
                    dealIds = new String[]{{
                        add("string"),
                    }};
                    email = new PropertyCrmEventEmail(
){{
                        attachmentFileIds = new String[]{{
                            add("string"),
                        }};
                        body = "string";
                        cc = new String[]{{
                            add("string"),
                        }};
                        createdAt = OffsetDateTime.parse("2024-09-27T20:19:13.205Z");
                        from = "string";
                        subject = "string";
                        to = new String[]{{
                            add("string"),
                        }};

                    }};
                    id = "<ID>";
                    leadIds = new String[]{{
                        add("string"),
                    }};
                    meeting = new PropertyCrmEventMeeting(
){{
                        description = "Advanced modular attitude";
                        endAt = OffsetDateTime.parse("2022-10-11T02:15:24.355Z");
                        startAt = OffsetDateTime.parse("2024-02-24T08:03:26.575Z");
                        title = "string";

                    }};
                    note = new PropertyCrmEventNote(
){{
                        createdAt = OffsetDateTime.parse("2022-08-26T02:54:49.814Z");
                        description = "Cross-platform bi-directional open architecture";

                    }};
                    raw = new PropertyCrmEventRaw(
);
                    task = new PropertyCrmEventTask(
){{
                        description = "Intuitive zero administration complexity";
                        dueAt = OffsetDateTime.parse("2022-09-27T21:56:51.556Z");
                        name = "string";
                        status = PropertyCrmEventTaskStatus.COMPLETED;

                    }};
                    type = CrmEventType.CALL;
                    updatedAt = OffsetDateTime.parse("2023-10-23T20:19:34.007Z");
                    userId = "string";

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.PatchCrmEventResponse res = sdk.crm.patchCrmEvent(req);

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

| Parameter                                                                                                          | Type                                                                                                               | Required                                                                                                           | Description                                                                                                        |
| ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                          | [com.unifiedapi.unifiedto.models.operations.PatchCrmEventRequest](../../models/operations/PatchCrmEventRequest.md) | :heavy_check_mark:                                                                                                 | The request object to use for the request.                                                                         |


### Response

**[com.unifiedapi.unifiedto.models.operations.PatchCrmEventResponse](../../models/operations/PatchCrmEventResponse.md)**


## patchCrmFile

Update a file

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PatchCrmFileRequest;
import com.unifiedapi.unifiedto.models.operations.PatchCrmFileResponse;
import com.unifiedapi.unifiedto.models.shared.CrmFile;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmFileRaw;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.PatchCrmFileRequest req = new PatchCrmFileRequest(
                "string",
                "string"){{
                crmFile = new CrmFile(
){{
                    companyId = "string";
                    contactId = "string";
                    createdAt = OffsetDateTime.parse("2022-08-02T20:49:30.505Z");
                    dealId = "string";
                    description = "Networked multimedia database";
                    downloadUrl = "string";
                    eventId = "string";
                    id = "<ID>";
                    isActive = false;
                    leadId = "string";
                    mimeType = "string";
                    name = "string";
                    raw = new PropertyCrmFileRaw(
);
                    size = 1185.84d;
                    updatedAt = OffsetDateTime.parse("2023-10-10T22:21:44.295Z");
                    userId = "string";

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.PatchCrmFileResponse res = sdk.crm.patchCrmFile(req);

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

| Parameter                                                                                                        | Type                                                                                                             | Required                                                                                                         | Description                                                                                                      |
| ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                        | [com.unifiedapi.unifiedto.models.operations.PatchCrmFileRequest](../../models/operations/PatchCrmFileRequest.md) | :heavy_check_mark:                                                                                               | The request object to use for the request.                                                                       |


### Response

**[com.unifiedapi.unifiedto.models.operations.PatchCrmFileResponse](../../models/operations/PatchCrmFileResponse.md)**


## patchCrmLead

Update a lead

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PatchCrmLeadRequest;
import com.unifiedapi.unifiedto.models.operations.PatchCrmLeadResponse;
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
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.PatchCrmLeadRequest req = new PatchCrmLeadRequest(
                "string",
                "string"){{
                crmLead = new CrmLead(
){{
                    address = new PropertyCrmLeadAddress(
){{
                        address1 = "string";
                        address2 = "string";
                        city = "Caseyberg";
                        country = "Cote d'Ivoire";
                        countryCode = "LK";
                        postalCode = "22291";
                        region = "string";
                        regionCode = "string";

                    }};
                    companyId = "string";
                    companyName = "Altenwerth, Lebsack and Wintheiser";
                    contactId = "string";
                    createdAt = OffsetDateTime.parse("2023-12-16T13:33:21.530Z");
                    creatorUserId = "string";
                    emails = new com.unifiedapi.unifiedto.models.shared.CrmEmail[]{{
                        add(new CrmEmail(
                        ){{}}),
                    }};
                    id = "<ID>";
                    isActive = false;
                    name = "string";
                    raw = new PropertyCrmLeadRaw(
);
                    source = "string";
                    status = "string";
                    telephones = new com.unifiedapi.unifiedto.models.shared.CrmTelephone[]{{
                        add(new CrmTelephone(
                        "string"){{
                            telephone = "string";
                        }}),
                    }};
                    updatedAt = OffsetDateTime.parse("2022-10-10T11:36:08.811Z");
                    userId = "string";

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.PatchCrmLeadResponse res = sdk.crm.patchCrmLead(req);

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

| Parameter                                                                                                        | Type                                                                                                             | Required                                                                                                         | Description                                                                                                      |
| ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                        | [com.unifiedapi.unifiedto.models.operations.PatchCrmLeadRequest](../../models/operations/PatchCrmLeadRequest.md) | :heavy_check_mark:                                                                                               | The request object to use for the request.                                                                       |


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
import com.unifiedapi.unifiedto.models.shared.CrmPipeline;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmPipelineRaw;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.PatchCrmPipelineRequest req = new PatchCrmPipelineRequest(
                "string",
                "string"){{
                crmPipeline = new CrmPipeline(
){{
                    createdAt = OffsetDateTime.parse("2024-08-26T14:31:39.156Z");
                    dealProbability = false;
                    displayOrder = 8620.92d;
                    id = "<ID>";
                    isActive = false;
                    name = "string";
                    raw = new PropertyCrmPipelineRaw(
);
                    updatedAt = OffsetDateTime.parse("2023-04-03T22:57:09.090Z");

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.PatchCrmPipelineResponse res = sdk.crm.patchCrmPipeline(req);

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

| Parameter                                                                                                                | Type                                                                                                                     | Required                                                                                                                 | Description                                                                                                              |
| ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                | [com.unifiedapi.unifiedto.models.operations.PatchCrmPipelineRequest](../../models/operations/PatchCrmPipelineRequest.md) | :heavy_check_mark:                                                                                                       | The request object to use for the request.                                                                               |


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
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.RemoveCrmCompanyRequest req = new RemoveCrmCompanyRequest(
                "string",
                "string");

            com.unifiedapi.unifiedto.models.operations.RemoveCrmCompanyResponse res = sdk.crm.removeCrmCompany(req);

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

| Parameter                                                                                                                | Type                                                                                                                     | Required                                                                                                                 | Description                                                                                                              |
| ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                | [com.unifiedapi.unifiedto.models.operations.RemoveCrmCompanyRequest](../../models/operations/RemoveCrmCompanyRequest.md) | :heavy_check_mark:                                                                                                       | The request object to use for the request.                                                                               |


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
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.RemoveCrmContactRequest req = new RemoveCrmContactRequest(
                "string",
                "string");

            com.unifiedapi.unifiedto.models.operations.RemoveCrmContactResponse res = sdk.crm.removeCrmContact(req);

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

| Parameter                                                                                                                | Type                                                                                                                     | Required                                                                                                                 | Description                                                                                                              |
| ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                | [com.unifiedapi.unifiedto.models.operations.RemoveCrmContactRequest](../../models/operations/RemoveCrmContactRequest.md) | :heavy_check_mark:                                                                                                       | The request object to use for the request.                                                                               |


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
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.RemoveCrmDealRequest req = new RemoveCrmDealRequest(
                "string",
                "string");

            com.unifiedapi.unifiedto.models.operations.RemoveCrmDealResponse res = sdk.crm.removeCrmDeal(req);

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

| Parameter                                                                                                          | Type                                                                                                               | Required                                                                                                           | Description                                                                                                        |
| ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                          | [com.unifiedapi.unifiedto.models.operations.RemoveCrmDealRequest](../../models/operations/RemoveCrmDealRequest.md) | :heavy_check_mark:                                                                                                 | The request object to use for the request.                                                                         |


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
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.RemoveCrmEventRequest req = new RemoveCrmEventRequest(
                "string",
                "string");

            com.unifiedapi.unifiedto.models.operations.RemoveCrmEventResponse res = sdk.crm.removeCrmEvent(req);

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
| `request`                                                                                                            | [com.unifiedapi.unifiedto.models.operations.RemoveCrmEventRequest](../../models/operations/RemoveCrmEventRequest.md) | :heavy_check_mark:                                                                                                   | The request object to use for the request.                                                                           |


### Response

**[com.unifiedapi.unifiedto.models.operations.RemoveCrmEventResponse](../../models/operations/RemoveCrmEventResponse.md)**


## removeCrmFile

Remove a file

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.RemoveCrmFileRequest;
import com.unifiedapi.unifiedto.models.operations.RemoveCrmFileResponse;
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.RemoveCrmFileRequest req = new RemoveCrmFileRequest(
                "string",
                "string");

            com.unifiedapi.unifiedto.models.operations.RemoveCrmFileResponse res = sdk.crm.removeCrmFile(req);

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

| Parameter                                                                                                          | Type                                                                                                               | Required                                                                                                           | Description                                                                                                        |
| ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                          | [com.unifiedapi.unifiedto.models.operations.RemoveCrmFileRequest](../../models/operations/RemoveCrmFileRequest.md) | :heavy_check_mark:                                                                                                 | The request object to use for the request.                                                                         |


### Response

**[com.unifiedapi.unifiedto.models.operations.RemoveCrmFileResponse](../../models/operations/RemoveCrmFileResponse.md)**


## removeCrmLead

Remove a lead

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.RemoveCrmLeadRequest;
import com.unifiedapi.unifiedto.models.operations.RemoveCrmLeadResponse;
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.RemoveCrmLeadRequest req = new RemoveCrmLeadRequest(
                "string",
                "string");

            com.unifiedapi.unifiedto.models.operations.RemoveCrmLeadResponse res = sdk.crm.removeCrmLead(req);

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

| Parameter                                                                                                          | Type                                                                                                               | Required                                                                                                           | Description                                                                                                        |
| ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                          | [com.unifiedapi.unifiedto.models.operations.RemoveCrmLeadRequest](../../models/operations/RemoveCrmLeadRequest.md) | :heavy_check_mark:                                                                                                 | The request object to use for the request.                                                                         |


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
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.RemoveCrmPipelineRequest req = new RemoveCrmPipelineRequest(
                "string",
                "string");

            com.unifiedapi.unifiedto.models.operations.RemoveCrmPipelineResponse res = sdk.crm.removeCrmPipeline(req);

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
| `request`                                                                                                                  | [com.unifiedapi.unifiedto.models.operations.RemoveCrmPipelineRequest](../../models/operations/RemoveCrmPipelineRequest.md) | :heavy_check_mark:                                                                                                         | The request object to use for the request.                                                                                 |


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
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.UpdateCrmCompanyRequest req = new UpdateCrmCompanyRequest(
                "string",
                "string"){{
                crmCompany = new CrmCompany(
){{
                    address = new PropertyCrmCompanyAddress(
){{
                        address1 = "string";
                        address2 = "string";
                        city = "Margeshire";
                        country = "Bahrain";
                        countryCode = "WS";
                        postalCode = "27563";
                        region = "string";
                        regionCode = "string";

                    }};
                    createdAt = OffsetDateTime.parse("2023-06-19T10:10:37.376Z");
                    dealIds = new String[]{{
                        add("string"),
                    }};
                    description = "Future-proofed zero defect instruction set";
                    emails = new com.unifiedapi.unifiedto.models.shared.CrmEmail[]{{
                        add(new CrmEmail(
                        ){{}}),
                    }};
                    employees = 1100.41d;
                    id = "<ID>";
                    industry = "string";
                    isActive = false;
                    linkUrls = new String[]{{
                        add("string"),
                    }};
                    name = "string";
                    raw = new PropertyCrmCompanyRaw(
);
                    tags = new String[]{{
                        add("string"),
                    }};
                    telephones = new com.unifiedapi.unifiedto.models.shared.CrmTelephone[]{{
                        add(new CrmTelephone(
                        "string"){{
                            telephone = "string";
                        }}),
                    }};
                    timezone = "Africa/Harare";
                    updatedAt = OffsetDateTime.parse("2023-09-13T13:49:01.082Z");
                    userId = "string";
                    websites = new String[]{{
                        add("string"),
                    }};

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.UpdateCrmCompanyResponse res = sdk.crm.updateCrmCompany(req);

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
| `request`                                                                                                                | [com.unifiedapi.unifiedto.models.operations.UpdateCrmCompanyRequest](../../models/operations/UpdateCrmCompanyRequest.md) | :heavy_check_mark:                                                                                                       | The request object to use for the request.                                                                               |


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
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.UpdateCrmContactRequest req = new UpdateCrmContactRequest(
                "string",
                "string"){{
                crmContact = new CrmContact(
){{
                    address = new PropertyCrmContactAddress(
){{
                        address1 = "string";
                        address2 = "string";
                        city = "Fort Carlee";
                        country = "Greenland";
                        countryCode = "AQ";
                        postalCode = "88650";
                        region = "string";
                        regionCode = "string";

                    }};
                    company = "Hoeger Group";
                    companyIds = new String[]{{
                        add("string"),
                    }};
                    createdAt = OffsetDateTime.parse("2022-02-12T12:31:59.837Z");
                    dealIds = new String[]{{
                        add("string"),
                    }};
                    emails = new com.unifiedapi.unifiedto.models.shared.CrmEmail[]{{
                        add(new CrmEmail(
                        ){{}}),
                    }};
                    id = "<ID>";
                    name = "string";
                    raw = new PropertyCrmContactRaw(
);
                    telephones = new com.unifiedapi.unifiedto.models.shared.CrmTelephone[]{{
                        add(new CrmTelephone(
                        "string"){{
                            telephone = "string";
                        }}),
                    }};
                    title = "string";
                    updatedAt = OffsetDateTime.parse("2023-09-02T17:59:32.331Z");
                    userId = "string";

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.UpdateCrmContactResponse res = sdk.crm.updateCrmContact(req);

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
| `request`                                                                                                                | [com.unifiedapi.unifiedto.models.operations.UpdateCrmContactRequest](../../models/operations/UpdateCrmContactRequest.md) | :heavy_check_mark:                                                                                                       | The request object to use for the request.                                                                               |


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
import com.unifiedapi.unifiedto.models.shared.CrmDeal;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmDealRaw;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.UpdateCrmDealRequest req = new UpdateCrmDealRequest(
                "string",
                "string"){{
                crmDeal = new CrmDeal(
){{
                    amount = 854.3d;
                    closedAt = OffsetDateTime.parse("2023-01-13T15:21:09.134Z");
                    createdAt = OffsetDateTime.parse("2022-11-20T23:55:13.334Z");
                    currency = "Pound Sterling";
                    id = "<ID>";
                    lostReason = "string";
                    name = "string";
                    pipeline = "string";
                    probability = 2970.01d;
                    raw = new PropertyCrmDealRaw(
);
                    source = "string";
                    stage = "string";
                    tags = new String[]{{
                        add("string"),
                    }};
                    updatedAt = OffsetDateTime.parse("2023-02-01T00:17:19.942Z");
                    userId = "string";
                    wonReason = "string";

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.UpdateCrmDealResponse res = sdk.crm.updateCrmDeal(req);

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
| `request`                                                                                                          | [com.unifiedapi.unifiedto.models.operations.UpdateCrmDealRequest](../../models/operations/UpdateCrmDealRequest.md) | :heavy_check_mark:                                                                                                 | The request object to use for the request.                                                                         |


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
import com.unifiedapi.unifiedto.models.shared.CrmEvent;
import com.unifiedapi.unifiedto.models.shared.CrmEventType;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmEventCall;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmEventEmail;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmEventMeeting;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmEventNote;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmEventRaw;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmEventTask;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmEventTaskStatus;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.UpdateCrmEventRequest req = new UpdateCrmEventRequest(
                "string",
                "string"){{
                crmEvent = new CrmEvent(
){{
                    call = new PropertyCrmEventCall(
){{
                        description = "Intuitive incremental orchestration";
                        duration = 4665.81d;
                        startAt = OffsetDateTime.parse("2022-09-01T05:59:54.461Z");

                    }};
                    companyIds = new String[]{{
                        add("string"),
                    }};
                    contactIds = new String[]{{
                        add("string"),
                    }};
                    createdAt = OffsetDateTime.parse("2023-09-01T08:44:00.944Z");
                    dealIds = new String[]{{
                        add("string"),
                    }};
                    email = new PropertyCrmEventEmail(
){{
                        attachmentFileIds = new String[]{{
                            add("string"),
                        }};
                        body = "string";
                        cc = new String[]{{
                            add("string"),
                        }};
                        createdAt = OffsetDateTime.parse("2024-04-26T03:56:06.837Z");
                        from = "string";
                        subject = "string";
                        to = new String[]{{
                            add("string"),
                        }};

                    }};
                    id = "<ID>";
                    leadIds = new String[]{{
                        add("string"),
                    }};
                    meeting = new PropertyCrmEventMeeting(
){{
                        description = "Right-sized user-facing moratorium";
                        endAt = OffsetDateTime.parse("2024-07-14T19:40:01.934Z");
                        startAt = OffsetDateTime.parse("2024-12-12T17:15:09.122Z");
                        title = "string";

                    }};
                    note = new PropertyCrmEventNote(
){{
                        createdAt = OffsetDateTime.parse("2022-03-16T21:54:30.192Z");
                        description = "Pre-emptive system-worthy open system";

                    }};
                    raw = new PropertyCrmEventRaw(
);
                    task = new PropertyCrmEventTask(
){{
                        description = "Diverse clear-thinking success";
                        dueAt = OffsetDateTime.parse("2024-06-10T18:42:32.729Z");
                        name = "string";
                        status = PropertyCrmEventTaskStatus.NOT_STARTED;

                    }};
                    type = CrmEventType.TASK;
                    updatedAt = OffsetDateTime.parse("2024-12-12T06:25:41.650Z");
                    userId = "string";

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.UpdateCrmEventResponse res = sdk.crm.updateCrmEvent(req);

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
| `request`                                                                                                            | [com.unifiedapi.unifiedto.models.operations.UpdateCrmEventRequest](../../models/operations/UpdateCrmEventRequest.md) | :heavy_check_mark:                                                                                                   | The request object to use for the request.                                                                           |


### Response

**[com.unifiedapi.unifiedto.models.operations.UpdateCrmEventResponse](../../models/operations/UpdateCrmEventResponse.md)**


## updateCrmFile

Update a file

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.UpdateCrmFileRequest;
import com.unifiedapi.unifiedto.models.operations.UpdateCrmFileResponse;
import com.unifiedapi.unifiedto.models.shared.CrmFile;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmFileRaw;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.UpdateCrmFileRequest req = new UpdateCrmFileRequest(
                "string",
                "string"){{
                crmFile = new CrmFile(
){{
                    companyId = "string";
                    contactId = "string";
                    createdAt = OffsetDateTime.parse("2022-02-11T15:31:35.167Z");
                    dealId = "string";
                    description = "Quality-focused mobile orchestration";
                    downloadUrl = "string";
                    eventId = "string";
                    id = "<ID>";
                    isActive = false;
                    leadId = "string";
                    mimeType = "string";
                    name = "string";
                    raw = new PropertyCrmFileRaw(
);
                    size = 5501.47d;
                    updatedAt = OffsetDateTime.parse("2023-07-25T13:19:41.584Z");
                    userId = "string";

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.UpdateCrmFileResponse res = sdk.crm.updateCrmFile(req);

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

| Parameter                                                                                                          | Type                                                                                                               | Required                                                                                                           | Description                                                                                                        |
| ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                          | [com.unifiedapi.unifiedto.models.operations.UpdateCrmFileRequest](../../models/operations/UpdateCrmFileRequest.md) | :heavy_check_mark:                                                                                                 | The request object to use for the request.                                                                         |


### Response

**[com.unifiedapi.unifiedto.models.operations.UpdateCrmFileResponse](../../models/operations/UpdateCrmFileResponse.md)**


## updateCrmLead

Update a lead

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.UpdateCrmLeadRequest;
import com.unifiedapi.unifiedto.models.operations.UpdateCrmLeadResponse;
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
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.UpdateCrmLeadRequest req = new UpdateCrmLeadRequest(
                "string",
                "string"){{
                crmLead = new CrmLead(
){{
                    address = new PropertyCrmLeadAddress(
){{
                        address1 = "string";
                        address2 = "string";
                        city = "West Vernerworth";
                        country = "Suriname";
                        countryCode = "ID";
                        postalCode = "87400-2256";
                        region = "string";
                        regionCode = "string";

                    }};
                    companyId = "string";
                    companyName = "Gibson - Cummings";
                    contactId = "string";
                    createdAt = OffsetDateTime.parse("2024-12-12T08:55:32.549Z");
                    creatorUserId = "string";
                    emails = new com.unifiedapi.unifiedto.models.shared.CrmEmail[]{{
                        add(new CrmEmail(
                        ){{}}),
                    }};
                    id = "<ID>";
                    isActive = false;
                    name = "string";
                    raw = new PropertyCrmLeadRaw(
);
                    source = "string";
                    status = "string";
                    telephones = new com.unifiedapi.unifiedto.models.shared.CrmTelephone[]{{
                        add(new CrmTelephone(
                        "string"){{
                            telephone = "string";
                        }}),
                    }};
                    updatedAt = OffsetDateTime.parse("2023-06-14T10:08:49.472Z");
                    userId = "string";

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.UpdateCrmLeadResponse res = sdk.crm.updateCrmLead(req);

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
| `request`                                                                                                          | [com.unifiedapi.unifiedto.models.operations.UpdateCrmLeadRequest](../../models/operations/UpdateCrmLeadRequest.md) | :heavy_check_mark:                                                                                                 | The request object to use for the request.                                                                         |


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
import com.unifiedapi.unifiedto.models.shared.CrmPipeline;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmPipelineRaw;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security(
                ){{
                    jwt = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.unifiedapi.unifiedto.models.operations.UpdateCrmPipelineRequest req = new UpdateCrmPipelineRequest(
                "string",
                "string"){{
                crmPipeline = new CrmPipeline(
){{
                    createdAt = OffsetDateTime.parse("2022-12-27T16:21:58.595Z");
                    dealProbability = false;
                    displayOrder = 8923.83d;
                    id = "<ID>";
                    isActive = false;
                    name = "string";
                    raw = new PropertyCrmPipelineRaw(
);
                    updatedAt = OffsetDateTime.parse("2023-07-18T14:05:49.227Z");

                }};

            }};

            com.unifiedapi.unifiedto.models.operations.UpdateCrmPipelineResponse res = sdk.crm.updateCrmPipeline(req);

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
| `request`                                                                                                                  | [com.unifiedapi.unifiedto.models.operations.UpdateCrmPipelineRequest](../../models/operations/UpdateCrmPipelineRequest.md) | :heavy_check_mark:                                                                                                         | The request object to use for the request.                                                                                 |


### Response

**[com.unifiedapi.unifiedto.models.operations.UpdateCrmPipelineResponse](../../models/operations/UpdateCrmPipelineResponse.md)**

