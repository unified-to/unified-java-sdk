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
                .setSecurity(new Security("connecting"){{
                    jwt = "";
                }})
                .build();

            CreateCrmCompanyRequest req = new CreateCrmCompanyRequest("carouse"){{
                crmCompany = new CrmCompany(){{
                    address = new PropertyCrmCompanyAddress(){{
                        address1 = "Car";
                        address2 = "experiences";
                        city = "Narcisoville";
                        country = "Paraguay";
                        countryCode = "MV";
                        postalCode = "94455-5359";
                        region = "ea";
                        regionCode = "Gorgeous";
                    }};
                    createdAt = OffsetDateTime.parse("2021-10-18T22:02:23.716Z");
                    dealIds = new String[]{{
                        add("Compatible"),
                    }};
                    emails = new com.unifiedapi.unifiedto.models.shared.CrmEmail[]{{
                        add(new CrmEmail(){{}}),
                    }};
                    id = "<ID>";
                    isActive = false;
                    name = "Dodge";
                    raw = new PropertyCrmCompanyRaw();
                    tags = new String[]{{
                        add("Harrisonburg"),
                    }};
                    telephones = new com.unifiedapi.unifiedto.models.shared.CrmTelephone[]{{
                        add(new CrmTelephone("Bicycle"){{
                            telephone = "Electric";
                        }}),
                    }};
                    updatedAt = OffsetDateTime.parse("2022-05-14T16:32:52.189Z");
                    websites = new String[]{{
                        add("hm"),
                    }};
                }};
            }};            

            CreateCrmCompanyResponse res = sdk.crm.createCrmCompany(req);

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
                .setSecurity(new Security("Mendelevium"){{
                    jwt = "";
                }})
                .build();

            CreateCrmContactRequest req = new CreateCrmContactRequest("Account"){{
                crmContact = new CrmContact(){{
                    address = new PropertyCrmContactAddress(){{
                        address1 = "Chips";
                        address2 = "superb";
                        city = "Fort Rosamondchester";
                        country = "Croatia";
                        countryCode = "NU";
                        postalCode = "73616-0067";
                        region = "deposit";
                        regionCode = "Birr";
                    }};
                    company = "Bahringer - Gulgowski";
                    companyIds = new String[]{{
                        add("Northwest"),
                    }};
                    createdAt = OffsetDateTime.parse("2023-10-05T01:54:07.502Z");
                    dealIds = new String[]{{
                        add("male"),
                    }};
                    emails = new com.unifiedapi.unifiedto.models.shared.CrmEmail[]{{
                        add(new CrmEmail(){{}}),
                    }};
                    id = "<ID>";
                    name = "functionalities";
                    raw = new PropertyCrmContactRaw();
                    telephones = new com.unifiedapi.unifiedto.models.shared.CrmTelephone[]{{
                        add(new CrmTelephone("yet"){{
                            telephone = "Account";
                        }}),
                    }};
                    title = "asperiores";
                    updatedAt = OffsetDateTime.parse("2022-12-11T06:27:07.072Z");
                }};
            }};            

            CreateCrmContactResponse res = sdk.crm.createCrmContact(req);

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
                .setSecurity(new Security("Toys"){{
                    jwt = "";
                }})
                .build();

            CreateCrmDealRequest req = new CreateCrmDealRequest("hacking"){{
                crmDeal = new CrmDeal(){{
                    amount = 1087.81d;
                    closedAt = OffsetDateTime.parse("2022-10-13T05:28:26.663Z");
                    createdAt = OffsetDateTime.parse("2023-12-05T13:48:49.322Z");
                    currency = "Zimbabwe Dollar";
                    id = "<ID>";
                    lostReason = "lay";
                    name = "programming";
                    pipeline = "Pop";
                    probability = 4228.64d;
                    raw = new PropertyCrmDealRaw();
                    source = "Intersex";
                    stage = "female";
                    tags = new String[]{{
                        add("Xenon"),
                    }};
                    updatedAt = OffsetDateTime.parse("2023-04-10T21:15:23.733Z");
                    wonReason = "Elegant";
                }};
            }};            

            CreateCrmDealResponse res = sdk.crm.createCrmDeal(req);

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
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("repeatedly"){{
                    jwt = "";
                }})
                .build();

            CreateCrmEventRequest req = new CreateCrmEventRequest("Sedan"){{
                crmEvent = new CrmEvent(){{
                    call = new PropertyCrmEventCall(){{
                        description = "Synergistic 3rd generation capacity";
                        duration = 5320.65d;
                    }};
                    companyIds = new String[]{{
                        add("zero"),
                    }};
                    contactIds = new String[]{{
                        add("Bronze"),
                    }};
                    createdAt = OffsetDateTime.parse("2021-05-09T00:50:22.588Z");
                    dealIds = new String[]{{
                        add("Savings"),
                    }};
                    email = new PropertyCrmEventEmail(){{
                        body = "within";
                        cc = new String[]{{
                            add("PNG"),
                        }};
                        from = "generation";
                        subject = "Underpass";
                        to = new String[]{{
                            add("astrakhan"),
                        }};
                    }};
                    id = "<ID>";
                    meeting = new PropertyCrmEventMeeting(){{
                        description = "Exclusive optimal matrix";
                        endAt = OffsetDateTime.parse("2023-07-15T12:28:49.883Z");
                        startAt = OffsetDateTime.parse("2023-03-21T07:12:55.587Z");
                        title = "supposing";
                    }};
                    note = new PropertyCrmEventNote(){{
                        description = "Ameliorated homogeneous utilisation";
                    }};
                    raw = new PropertyCrmEventRaw();
                    task = new PropertyCrmEventTask(){{
                        description = "Switchable directional productivity";
                        name = "Fresh";
                        status = "Southeast";
                    }};
                    type = CrmEventType.EMAIL;
                    updatedAt = OffsetDateTime.parse("2023-04-17T00:16:04.496Z");
                }};
            }};            

            CreateCrmEventResponse res = sdk.crm.createCrmEvent(req);

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
                .setSecurity(new Security("loyally"){{
                    jwt = "";
                }})
                .build();

            CreateCrmFileRequest req = new CreateCrmFileRequest("Northwest"){{
                crmFile = new CrmFile(){{
                    activityId = "Tasty";
                    companyId = "Gasoline";
                    contactId = "Tactics";
                    createdAt = OffsetDateTime.parse("2023-04-25T01:22:24.549Z");
                    dealId = "invoice";
                    description = "Optional eco-centric definition";
                    fileName = "generate_coulomb.mp4v";
                    fileSize = 7403.39d;
                    fileType = "video";
                    fileUrl = "male";
                    id = "<ID>";
                    isActive = false;
                    leadId = "mole";
                    raw = new PropertyCrmFileRaw();
                    updatedAt = OffsetDateTime.parse("2021-08-10T15:19:38.772Z");
                    userId = "Coupe";
                }};
            }};            

            CreateCrmFileResponse res = sdk.crm.createCrmFile(req);

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
                .setSecurity(new Security("Designer"){{
                    jwt = "";
                }})
                .build();

            CreateCrmLeadRequest req = new CreateCrmLeadRequest("Soft"){{
                crmLead = new CrmLead(){{
                    address = new PropertyCrmLeadAddress(){{
                        address1 = "maroon";
                        address2 = "South";
                        city = "Plantation";
                        country = "Mozambique";
                        countryCode = "SE";
                        postalCode = "52684-4776";
                        region = "Health";
                        regionCode = "North";
                    }};
                    companyId = "invoice";
                    contactId = "Strategist";
                    createdAt = OffsetDateTime.parse("2022-12-29T06:24:16.487Z");
                    creatorUserId = "applications";
                    emails = new com.unifiedapi.unifiedto.models.shared.CrmEmail[]{{
                        add(new CrmEmail(){{}}),
                    }};
                    id = "<ID>";
                    isActive = false;
                    name = "Account";
                    raw = new PropertyCrmLeadRaw();
                    source = "sievert";
                    telephones = new com.unifiedapi.unifiedto.models.shared.CrmTelephone[]{{
                        add(new CrmTelephone("Chief"){{
                            telephone = "possimus";
                        }}),
                    }};
                    updatedAt = OffsetDateTime.parse("2021-10-22T23:53:59.320Z");
                    userId = "Baby";
                }};
            }};            

            CreateCrmLeadResponse res = sdk.crm.createCrmLead(req);

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
                .setSecurity(new Security("Mazda"){{
                    jwt = "";
                }})
                .build();

            CreateCrmPipelineRequest req = new CreateCrmPipelineRequest("enable"){{
                crmPipeline = new CrmPipeline(){{
                    createdAt = OffsetDateTime.parse("2023-01-01T02:57:01.626Z");
                    dealProbability = false;
                    displayOrder = 16.09d;
                    id = "<ID>";
                    isActive = false;
                    name = "round";
                    raw = new PropertyCrmPipelineRaw();
                    updatedAt = OffsetDateTime.parse("2021-07-13T00:16:45.285Z");
                }};
            }};            

            CreateCrmPipelineResponse res = sdk.crm.createCrmPipeline(req);

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
                .setSecurity(new Security("forenenst"){{
                    jwt = "";
                }})
                .build();

            GetCrmCompanyRequest req = new GetCrmCompanyRequest("Mini", "inaugurate"){{
                fields = new String[]{{
                    add("Zimbabwe"),
                }};
            }};            

            GetCrmCompanyResponse res = sdk.crm.getCrmCompany(req);

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
                .setSecurity(new Security("North"){{
                    jwt = "";
                }})
                .build();

            GetCrmContactRequest req = new GetCrmContactRequest("Silver", "transgender"){{
                fields = new String[]{{
                    add("Associate"),
                }};
            }};            

            GetCrmContactResponse res = sdk.crm.getCrmContact(req);

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
                .setSecurity(new Security("payment"){{
                    jwt = "";
                }})
                .build();

            GetCrmDealRequest req = new GetCrmDealRequest("mint", "Reduced"){{
                fields = new String[]{{
                    add("East"),
                }};
            }};            

            GetCrmDealResponse res = sdk.crm.getCrmDeal(req);

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
                .setSecurity(new Security("Technetium"){{
                    jwt = "";
                }})
                .build();

            GetCrmEventRequest req = new GetCrmEventRequest("Ergonomic", "Director"){{
                fields = new String[]{{
                    add("comics"),
                }};
            }};            

            GetCrmEventResponse res = sdk.crm.getCrmEvent(req);

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
                .setSecurity(new Security("Southwest"){{
                    jwt = "";
                }})
                .build();

            GetCrmFileRequest req = new GetCrmFileRequest("sexy", "Southeast"){{
                fields = new String[]{{
                    add("lightly"),
                }};
            }};            

            GetCrmFileResponse res = sdk.crm.getCrmFile(req);

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
                .setSecurity(new Security("how"){{
                    jwt = "";
                }})
                .build();

            GetCrmLeadRequest req = new GetCrmLeadRequest("Curium", "Bahamas"){{
                fields = new String[]{{
                    add("Keyboard"),
                }};
            }};            

            GetCrmLeadResponse res = sdk.crm.getCrmLead(req);

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
                .setSecurity(new Security("withdrawal"){{
                    jwt = "";
                }})
                .build();

            GetCrmPipelineRequest req = new GetCrmPipelineRequest("online", "boliviano"){{
                fields = new String[]{{
                    add("evolve"),
                }};
            }};            

            GetCrmPipelineResponse res = sdk.crm.getCrmPipeline(req);

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
                .setSecurity(new Security("override"){{
                    jwt = "";
                }})
                .build();

            ListCrmCompaniesRequest req = new ListCrmCompaniesRequest("withdrawal"){{
                contactId = "yuck";
                dealId = "Lamborghini";
                fields = new String[]{{
                    add("Sleek"),
                }};
                limit = 7660.91d;
                offset = 9558.16d;
                order = "honestly";
                query = "South";
                sort = "dolor";
                updatedGte = OffsetDateTime.parse("2022-06-03T14:44:05.988Z");
            }};            

            ListCrmCompaniesResponse res = sdk.crm.listCrmCompanies(req);

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
                .setSecurity(new Security("female"){{
                    jwt = "";
                }})
                .build();

            ListCrmContactsRequest req = new ListCrmContactsRequest("Research"){{
                companyId = "but";
                dealId = "index";
                fields = new String[]{{
                    add("steradian"),
                }};
                limit = 6500.88d;
                offset = 4474.76d;
                order = "upon";
                query = "Directives";
                sort = "Alaska";
                updatedGte = OffsetDateTime.parse("2022-07-19T05:08:36.583Z");
            }};            

            ListCrmContactsResponse res = sdk.crm.listCrmContacts(req);

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
                .setSecurity(new Security("Southeast"){{
                    jwt = "";
                }})
                .build();

            ListCrmDealsRequest req = new ListCrmDealsRequest("synthesize"){{
                companyId = "Health";
                contactId = "male";
                fields = new String[]{{
                    add("Tala"),
                }};
                limit = 620.3d;
                offset = 1651.48d;
                order = "virtual";
                query = "female";
                sort = "sweetly";
                updatedGte = OffsetDateTime.parse("2022-07-15T10:37:52.542Z");
            }};            

            ListCrmDealsResponse res = sdk.crm.listCrmDeals(req);

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
                .setSecurity(new Security("withdrawal"){{
                    jwt = "";
                }})
                .build();

            ListCrmEventsRequest req = new ListCrmEventsRequest("empower"){{
                companyId = "violet";
                contactId = "generating";
                dealId = "paradigms";
                fields = new String[]{{
                    add("Checking"),
                }};
                limit = 2512.65d;
                offset = 3220.29d;
                order = "Saint";
                query = "gadzooks";
                sort = "Borders";
                updatedGte = OffsetDateTime.parse("2023-10-24T12:08:20.855Z");
            }};            

            ListCrmEventsResponse res = sdk.crm.listCrmEvents(req);

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
                .setSecurity(new Security("Bicycle"){{
                    jwt = "";
                }})
                .build();

            ListCrmFilesRequest req = new ListCrmFilesRequest("Genderflux"){{
                companyId = "Southeast";
                contactId = "invoice";
                dealId = "hertz";
                fields = new String[]{{
                    add("invoice"),
                }};
                limit = 7868.48d;
                offset = 7222.04d;
                order = "Tuvalu";
                query = "West";
                sort = "Gorgeous";
                updatedGte = OffsetDateTime.parse("2021-07-02T02:06:49.991Z");
            }};            

            ListCrmFilesResponse res = sdk.crm.listCrmFiles(req);

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
                .setSecurity(new Security("Implementation"){{
                    jwt = "";
                }})
                .build();

            ListCrmLeadsRequest req = new ListCrmLeadsRequest("dam"){{
                fields = new String[]{{
                    add("SDD"),
                }};
                limit = 8343.84d;
                offset = 6533.73d;
                order = "generous";
                query = "Mazda";
                sort = "Macedonia";
                updatedGte = OffsetDateTime.parse("2022-12-26T04:44:56.329Z");
            }};            

            ListCrmLeadsResponse res = sdk.crm.listCrmLeads(req);

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
                .setSecurity(new Security("Southeast"){{
                    jwt = "";
                }})
                .build();

            ListCrmPipelinesRequest req = new ListCrmPipelinesRequest("Concrete"){{
                fields = new String[]{{
                    add("tesla"),
                }};
                limit = 6683.61d;
                offset = 8826.41d;
                order = "OCR";
                query = "muss";
                sort = "firewall";
                updatedGte = OffsetDateTime.parse("2023-02-18T11:32:10.923Z");
            }};            

            ListCrmPipelinesResponse res = sdk.crm.listCrmPipelines(req);

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
                .setSecurity(new Security("Producer"){{
                    jwt = "";
                }})
                .build();

            PatchCrmCompanyRequest req = new PatchCrmCompanyRequest("Corporate", "indexing"){{
                crmCompany = new CrmCompany(){{
                    address = new PropertyCrmCompanyAddress(){{
                        address1 = "array";
                        address2 = "Genderflux";
                        city = "Agustinaberg";
                        country = "Myanmar";
                        countryCode = "SH";
                        postalCode = "30076";
                        region = "didactic";
                        regionCode = "Coupe";
                    }};
                    createdAt = OffsetDateTime.parse("2023-07-14T17:37:26.000Z");
                    dealIds = new String[]{{
                        add("Salad"),
                    }};
                    emails = new com.unifiedapi.unifiedto.models.shared.CrmEmail[]{{
                        add(new CrmEmail(){{}}),
                    }};
                    id = "<ID>";
                    isActive = false;
                    name = "Cyprus";
                    raw = new PropertyCrmCompanyRaw();
                    tags = new String[]{{
                        add("SUV"),
                    }};
                    telephones = new com.unifiedapi.unifiedto.models.shared.CrmTelephone[]{{
                        add(new CrmTelephone("Ford"){{
                            telephone = "mole";
                        }}),
                    }};
                    updatedAt = OffsetDateTime.parse("2023-01-01T12:10:17.789Z");
                    websites = new String[]{{
                        add("generally"),
                    }};
                }};
            }};            

            PatchCrmCompanyResponse res = sdk.crm.patchCrmCompany(req);

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
                .setSecurity(new Security("architecture"){{
                    jwt = "";
                }})
                .build();

            PatchCrmContactRequest req = new PatchCrmContactRequest("Buckinghamshire", "morph"){{
                crmContact = new CrmContact(){{
                    address = new PropertyCrmContactAddress(){{
                        address1 = "array";
                        address2 = "East";
                        city = "Mafaldaboro";
                        country = "Slovenia";
                        countryCode = "CI";
                        postalCode = "51751";
                        region = "angelic";
                        regionCode = "World";
                    }};
                    company = "Prohaska and Sons";
                    companyIds = new String[]{{
                        add("notwithstanding"),
                    }};
                    createdAt = OffsetDateTime.parse("2022-04-02T15:56:00.231Z");
                    dealIds = new String[]{{
                        add("Music"),
                    }};
                    emails = new com.unifiedapi.unifiedto.models.shared.CrmEmail[]{{
                        add(new CrmEmail(){{}}),
                    }};
                    id = "<ID>";
                    name = "questioning";
                    raw = new PropertyCrmContactRaw();
                    telephones = new com.unifiedapi.unifiedto.models.shared.CrmTelephone[]{{
                        add(new CrmTelephone("Senior"){{
                            telephone = "Developer";
                        }}),
                    }};
                    title = "resident";
                    updatedAt = OffsetDateTime.parse("2023-02-03T23:50:19.466Z");
                }};
            }};            

            PatchCrmContactResponse res = sdk.crm.patchCrmContact(req);

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
                .setSecurity(new Security("consign"){{
                    jwt = "";
                }})
                .build();

            PatchCrmDealRequest req = new PatchCrmDealRequest("withdrawal", "quill"){{
                crmDeal = new CrmDeal(){{
                    amount = 639.27d;
                    closedAt = OffsetDateTime.parse("2021-03-27T18:57:29.941Z");
                    createdAt = OffsetDateTime.parse("2022-03-18T14:17:53.089Z");
                    currency = "New Taiwan Dollar";
                    id = "<ID>";
                    lostReason = "Integration";
                    name = "cyan";
                    pipeline = "including";
                    probability = 536.01d;
                    raw = new PropertyCrmDealRaw();
                    source = "Computer";
                    stage = "Cheese";
                    tags = new String[]{{
                        add("kaleidoscopic"),
                    }};
                    updatedAt = OffsetDateTime.parse("2022-01-13T05:30:26.726Z");
                    wonReason = "Executive";
                }};
            }};            

            PatchCrmDealResponse res = sdk.crm.patchCrmDeal(req);

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
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("XML"){{
                    jwt = "";
                }})
                .build();

            PatchCrmEventRequest req = new PatchCrmEventRequest("Accountability", "copying"){{
                crmEvent = new CrmEvent(){{
                    call = new PropertyCrmEventCall(){{
                        description = "Universal 24/7 migration";
                        duration = 1195.18d;
                    }};
                    companyIds = new String[]{{
                        add("Metal"),
                    }};
                    contactIds = new String[]{{
                        add("Keyboard"),
                    }};
                    createdAt = OffsetDateTime.parse("2021-05-24T04:28:38.959Z");
                    dealIds = new String[]{{
                        add("Administrator"),
                    }};
                    email = new PropertyCrmEventEmail(){{
                        body = "around";
                        cc = new String[]{{
                            add("Wooden"),
                        }};
                        from = "Gasoline";
                        subject = "neural";
                        to = new String[]{{
                            add("mole"),
                        }};
                    }};
                    id = "<ID>";
                    meeting = new PropertyCrmEventMeeting(){{
                        description = "Total homogeneous policy";
                        endAt = OffsetDateTime.parse("2023-11-15T04:26:14.346Z");
                        startAt = OffsetDateTime.parse("2023-11-08T07:39:26.236Z");
                        title = "Idaho";
                    }};
                    note = new PropertyCrmEventNote(){{
                        description = "Up-sized asymmetric open architecture";
                    }};
                    raw = new PropertyCrmEventRaw();
                    task = new PropertyCrmEventTask(){{
                        description = "Profound holistic interface";
                        name = "DNS";
                        status = "Shoes";
                    }};
                    type = CrmEventType.EMAIL;
                    updatedAt = OffsetDateTime.parse("2021-11-11T23:29:31.701Z");
                }};
            }};            

            PatchCrmEventResponse res = sdk.crm.patchCrmEvent(req);

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
                .setSecurity(new Security("Health"){{
                    jwt = "";
                }})
                .build();

            PatchCrmFileRequest req = new PatchCrmFileRequest("Future", "Southeast"){{
                crmFile = new CrmFile(){{
                    activityId = "communities";
                    companyId = "watt";
                    contactId = "Gasoline";
                    createdAt = OffsetDateTime.parse("2021-02-07T08:18:55.524Z");
                    dealId = "dreamily";
                    description = "Function-based zero defect conglomeration";
                    fileName = "fundamental_directives.mpga";
                    fileSize = 7321.52d;
                    fileType = "video";
                    fileUrl = "molestiae";
                    id = "<ID>";
                    isActive = false;
                    leadId = "qua";
                    raw = new PropertyCrmFileRaw();
                    updatedAt = OffsetDateTime.parse("2021-03-11T08:59:40.328Z");
                    userId = "Usability";
                }};
            }};            

            PatchCrmFileResponse res = sdk.crm.patchCrmFile(req);

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
                .setSecurity(new Security("deposit"){{
                    jwt = "";
                }})
                .build();

            PatchCrmLeadRequest req = new PatchCrmLeadRequest("Bike", "copying"){{
                crmLead = new CrmLead(){{
                    address = new PropertyCrmLeadAddress(){{
                        address1 = "Ball";
                        address2 = "Chips";
                        city = "Port Adeliamouth";
                        country = "Venezuela";
                        countryCode = "NF";
                        postalCode = "47585";
                        region = "Ameliorated";
                        regionCode = "Mandatory";
                    }};
                    companyId = "by";
                    contactId = "input";
                    createdAt = OffsetDateTime.parse("2022-02-02T07:00:30.982Z");
                    creatorUserId = "Lanka";
                    emails = new com.unifiedapi.unifiedto.models.shared.CrmEmail[]{{
                        add(new CrmEmail(){{}}),
                    }};
                    id = "<ID>";
                    isActive = false;
                    name = "Northeast";
                    raw = new PropertyCrmLeadRaw();
                    source = "female";
                    telephones = new com.unifiedapi.unifiedto.models.shared.CrmTelephone[]{{
                        add(new CrmTelephone("methodology"){{
                            telephone = "Field";
                        }}),
                    }};
                    updatedAt = OffsetDateTime.parse("2021-04-14T13:59:39.244Z");
                    userId = "index";
                }};
            }};            

            PatchCrmLeadResponse res = sdk.crm.patchCrmLead(req);

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
                .setSecurity(new Security("unimpressively"){{
                    jwt = "";
                }})
                .build();

            PatchCrmPipelineRequest req = new PatchCrmPipelineRequest("Checking", "Electronic"){{
                crmPipeline = new CrmPipeline(){{
                    createdAt = OffsetDateTime.parse("2023-09-09T16:00:07.264Z");
                    dealProbability = false;
                    displayOrder = 9737.04d;
                    id = "<ID>";
                    isActive = false;
                    name = "Zloty";
                    raw = new PropertyCrmPipelineRaw();
                    updatedAt = OffsetDateTime.parse("2021-02-02T18:05:08.135Z");
                }};
            }};            

            PatchCrmPipelineResponse res = sdk.crm.patchCrmPipeline(req);

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
                .setSecurity(new Security("although"){{
                    jwt = "";
                }})
                .build();

            RemoveCrmCompanyRequest req = new RemoveCrmCompanyRequest("hard", "wireless");            

            RemoveCrmCompanyResponse res = sdk.crm.removeCrmCompany(req);

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
                .setSecurity(new Security("plum"){{
                    jwt = "";
                }})
                .build();

            RemoveCrmContactRequest req = new RemoveCrmContactRequest("Concrete", "ROI");            

            RemoveCrmContactResponse res = sdk.crm.removeCrmContact(req);

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
                .setSecurity(new Security("Handmade"){{
                    jwt = "";
                }})
                .build();

            RemoveCrmDealRequest req = new RemoveCrmDealRequest("for", "Eritrea");            

            RemoveCrmDealResponse res = sdk.crm.removeCrmDeal(req);

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
                .setSecurity(new Security("enterprise"){{
                    jwt = "";
                }})
                .build();

            RemoveCrmEventRequest req = new RemoveCrmEventRequest("Kyat", "integrate");            

            RemoveCrmEventResponse res = sdk.crm.removeCrmEvent(req);

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
                .setSecurity(new Security("Zambia"){{
                    jwt = "";
                }})
                .build();

            RemoveCrmFileRequest req = new RemoveCrmFileRequest("Florida", "female");            

            RemoveCrmFileResponse res = sdk.crm.removeCrmFile(req);

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
                .setSecurity(new Security("Springs"){{
                    jwt = "";
                }})
                .build();

            RemoveCrmLeadRequest req = new RemoveCrmLeadRequest("incubate", "in");            

            RemoveCrmLeadResponse res = sdk.crm.removeCrmLead(req);

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
                .setSecurity(new Security("protocol"){{
                    jwt = "";
                }})
                .build();

            RemoveCrmPipelineRequest req = new RemoveCrmPipelineRequest("while", "haptic");            

            RemoveCrmPipelineResponse res = sdk.crm.removeCrmPipeline(req);

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
                .setSecurity(new Security("SMS"){{
                    jwt = "";
                }})
                .build();

            UpdateCrmCompanyRequest req = new UpdateCrmCompanyRequest("barrel", "except"){{
                crmCompany = new CrmCompany(){{
                    address = new PropertyCrmCompanyAddress(){{
                        address1 = "enterprise";
                        address2 = "alarm";
                        city = "South Everett";
                        country = "Yemen";
                        countryCode = "LI";
                        postalCode = "55323";
                        region = "unsightly";
                        regionCode = "Metrics";
                    }};
                    createdAt = OffsetDateTime.parse("2022-09-09T22:26:47.796Z");
                    dealIds = new String[]{{
                        add("Massachusetts"),
                    }};
                    emails = new com.unifiedapi.unifiedto.models.shared.CrmEmail[]{{
                        add(new CrmEmail(){{}}),
                    }};
                    id = "<ID>";
                    isActive = false;
                    name = "illustrious";
                    raw = new PropertyCrmCompanyRaw();
                    tags = new String[]{{
                        add("THX"),
                    }};
                    telephones = new com.unifiedapi.unifiedto.models.shared.CrmTelephone[]{{
                        add(new CrmTelephone("Rubber"){{
                            telephone = "Kyat";
                        }}),
                    }};
                    updatedAt = OffsetDateTime.parse("2023-06-22T10:50:30.857Z");
                    websites = new String[]{{
                        add("abdicate"),
                    }};
                }};
            }};            

            UpdateCrmCompanyResponse res = sdk.crm.updateCrmCompany(req);

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
                .setSecurity(new Security("Universal"){{
                    jwt = "";
                }})
                .build();

            UpdateCrmContactRequest req = new UpdateCrmContactRequest("Harbors", "relieved"){{
                crmContact = new CrmContact(){{
                    address = new PropertyCrmContactAddress(){{
                        address1 = "backing";
                        address2 = "responsive";
                        city = "New Laylaton";
                        country = "Mauritania";
                        countryCode = "LR";
                        postalCode = "05940";
                        region = "Sigrid";
                        regionCode = "Northeast";
                    }};
                    company = "Kub - Robel";
                    companyIds = new String[]{{
                        add("Northeast"),
                    }};
                    createdAt = OffsetDateTime.parse("2021-09-13T08:55:04.418Z");
                    dealIds = new String[]{{
                        add("Virginia"),
                    }};
                    emails = new com.unifiedapi.unifiedto.models.shared.CrmEmail[]{{
                        add(new CrmEmail(){{}}),
                    }};
                    id = "<ID>";
                    name = "Berkshire";
                    raw = new PropertyCrmContactRaw();
                    telephones = new com.unifiedapi.unifiedto.models.shared.CrmTelephone[]{{
                        add(new CrmTelephone("program"){{
                            telephone = "Ergonomic";
                        }}),
                    }};
                    title = "Silver";
                    updatedAt = OffsetDateTime.parse("2021-02-24T19:24:14.026Z");
                }};
            }};            

            UpdateCrmContactResponse res = sdk.crm.updateCrmContact(req);

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
                .setSecurity(new Security("South"){{
                    jwt = "";
                }})
                .build();

            UpdateCrmDealRequest req = new UpdateCrmDealRequest("global", "viral"){{
                crmDeal = new CrmDeal(){{
                    amount = 4059.95d;
                    closedAt = OffsetDateTime.parse("2023-02-16T21:28:03.065Z");
                    createdAt = OffsetDateTime.parse("2021-12-04T07:17:25.283Z");
                    currency = "Russian Ruble";
                    id = "<ID>";
                    lostReason = "Transexual";
                    name = "envisioneer";
                    pipeline = "bus";
                    probability = 5809.97d;
                    raw = new PropertyCrmDealRaw();
                    source = "Tala";
                    stage = "Elegant";
                    tags = new String[]{{
                        add("Loan"),
                    }};
                    updatedAt = OffsetDateTime.parse("2023-12-25T07:28:40.200Z");
                    wonReason = "payment";
                }};
            }};            

            UpdateCrmDealResponse res = sdk.crm.updateCrmDeal(req);

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
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("Account"){{
                    jwt = "";
                }})
                .build();

            UpdateCrmEventRequest req = new UpdateCrmEventRequest("DRAM", "input"){{
                crmEvent = new CrmEvent(){{
                    call = new PropertyCrmEventCall(){{
                        description = "Right-sized user-facing moratorium";
                        duration = 8447.26d;
                    }};
                    companyIds = new String[]{{
                        add("beset"),
                    }};
                    contactIds = new String[]{{
                        add("Accountability"),
                    }};
                    createdAt = OffsetDateTime.parse("2023-02-03T22:22:41.402Z");
                    dealIds = new String[]{{
                        add("Keyboard"),
                    }};
                    email = new PropertyCrmEventEmail(){{
                        body = "thoroughly";
                        cc = new String[]{{
                            add("impactful"),
                        }};
                        from = "arse";
                        subject = "Jazz";
                        to = new String[]{{
                            add("Global"),
                        }};
                    }};
                    id = "<ID>";
                    meeting = new PropertyCrmEventMeeting(){{
                        description = "Organized full-range productivity";
                        endAt = OffsetDateTime.parse("2021-07-12T17:04:07.207Z");
                        startAt = OffsetDateTime.parse("2021-07-28T12:59:49.441Z");
                        title = "Industrial";
                    }};
                    note = new PropertyCrmEventNote(){{
                        description = "Pre-emptive tertiary Graphic Interface";
                    }};
                    raw = new PropertyCrmEventRaw();
                    task = new PropertyCrmEventTask(){{
                        description = "Grass-roots responsive local area network";
                        name = "Baby";
                        status = "Rial";
                    }};
                    type = CrmEventType.NOTE;
                    updatedAt = OffsetDateTime.parse("2021-04-13T01:04:45.491Z");
                }};
            }};            

            UpdateCrmEventResponse res = sdk.crm.updateCrmEvent(req);

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
                .setSecurity(new Security("Plano"){{
                    jwt = "";
                }})
                .build();

            UpdateCrmFileRequest req = new UpdateCrmFileRequest("generate", "unexpectedly"){{
                crmFile = new CrmFile(){{
                    activityId = "Nakfa";
                    companyId = "wireless";
                    contactId = "seamless";
                    createdAt = OffsetDateTime.parse("2021-09-11T08:15:48.719Z");
                    dealId = "Station";
                    description = "Function-based grid-enabled strategy";
                    fileName = "lead_haptic_successfully.png";
                    fileSize = 2930.3d;
                    fileType = "text";
                    fileUrl = "Bicycle";
                    id = "<ID>";
                    isActive = false;
                    leadId = "Oregon";
                    raw = new PropertyCrmFileRaw();
                    updatedAt = OffsetDateTime.parse("2023-03-20T00:28:11.359Z");
                    userId = "navigating";
                }};
            }};            

            UpdateCrmFileResponse res = sdk.crm.updateCrmFile(req);

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
                .setSecurity(new Security("Northwest"){{
                    jwt = "";
                }})
                .build();

            UpdateCrmLeadRequest req = new UpdateCrmLeadRequest("violation", "Pickup"){{
                crmLead = new CrmLead(){{
                    address = new PropertyCrmLeadAddress(){{
                        address1 = "Polestar";
                        address2 = "Checking";
                        city = "West Laisha";
                        country = "Pakistan";
                        countryCode = "MA";
                        postalCode = "19406";
                        region = "holistic";
                        regionCode = "corner";
                    }};
                    companyId = "Bicycle";
                    contactId = "local";
                    createdAt = OffsetDateTime.parse("2022-12-30T09:10:32.001Z");
                    creatorUserId = "deposit";
                    emails = new com.unifiedapi.unifiedto.models.shared.CrmEmail[]{{
                        add(new CrmEmail(){{}}),
                    }};
                    id = "<ID>";
                    isActive = false;
                    name = "Buckinghamshire";
                    raw = new PropertyCrmLeadRaw();
                    source = "Electric";
                    telephones = new com.unifiedapi.unifiedto.models.shared.CrmTelephone[]{{
                        add(new CrmTelephone("Wooden"){{
                            telephone = "Bespoke";
                        }}),
                    }};
                    updatedAt = OffsetDateTime.parse("2021-10-02T07:44:27.408Z");
                    userId = "Concrete";
                }};
            }};            

            UpdateCrmLeadResponse res = sdk.crm.updateCrmLead(req);

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
                .setSecurity(new Security("functionalities"){{
                    jwt = "";
                }})
                .build();

            UpdateCrmPipelineRequest req = new UpdateCrmPipelineRequest("generating", "North"){{
                crmPipeline = new CrmPipeline(){{
                    createdAt = OffsetDateTime.parse("2021-08-22T21:47:34.241Z");
                    dealProbability = false;
                    displayOrder = 1646.47d;
                    id = "<ID>";
                    isActive = false;
                    name = "Proactive";
                    raw = new PropertyCrmPipelineRaw();
                    updatedAt = OffsetDateTime.parse("2023-08-02T23:22:34.017Z");
                }};
            }};            

            UpdateCrmPipelineResponse res = sdk.crm.updateCrmPipeline(req);

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

