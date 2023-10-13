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
* [createCrmTeam](#createcrmteam) - Create a team
* [createCrmUser](#createcrmuser) - Create a user
* [getCrmCompany](#getcrmcompany) - Retrieve a company
* [getCrmContact](#getcrmcontact) - Retrieve a contact
* [getCrmDeal](#getcrmdeal) - Retrieve a deal
* [getCrmEvent](#getcrmevent) - Retrieve a event
* [getCrmFile](#getcrmfile) - Retrieve a file
* [getCrmLead](#getcrmlead) - Retrieve a lead
* [getCrmPipeline](#getcrmpipeline) - Retrieve a pipeline
* [getCrmTeam](#getcrmteam) - Retrieve a team
* [getCrmUser](#getcrmuser) - Retrieve a user
* [listCrmCompanies](#listcrmcompanies) - List all companies
* [listCrmContacts](#listcrmcontacts) - List all contacts
* [listCrmDeals](#listcrmdeals) - List all deals
* [listCrmEvents](#listcrmevents) - List all events
* [listCrmFiles](#listcrmfiles) - List all files
* [listCrmLeads](#listcrmleads) - List all leads
* [listCrmPipelines](#listcrmpipelines) - List all pipelines
* [listCrmTeams](#listcrmteams) - List all teams
* [listCrmUsers](#listcrmusers) - List all users
* [patchCrmCompany](#patchcrmcompany) - Update a company
* [patchCrmContact](#patchcrmcontact) - Update a contact
* [patchCrmDeal](#patchcrmdeal) - Update a deal
* [patchCrmEvent](#patchcrmevent) - Update a event
* [patchCrmFile](#patchcrmfile) - Update a file
* [patchCrmLead](#patchcrmlead) - Update a lead
* [patchCrmPipeline](#patchcrmpipeline) - Update a pipeline
* [patchCrmTeam](#patchcrmteam) - Update a team
* [patchCrmUser](#patchcrmuser) - Update a user
* [removeCrmCompany](#removecrmcompany) - Remove a company
* [removeCrmContact](#removecrmcontact) - Remove a contact
* [removeCrmDeal](#removecrmdeal) - Remove a deal
* [removeCrmEvent](#removecrmevent) - Remove a event
* [removeCrmFile](#removecrmfile) - Remove a file
* [removeCrmLead](#removecrmlead) - Remove a lead
* [removeCrmPipeline](#removecrmpipeline) - Remove a pipeline
* [removeCrmTeam](#removecrmteam) - Remove a team
* [removeCrmUser](#removecrmuser) - Remove a user
* [updateCrmCompany](#updatecrmcompany) - Update a company
* [updateCrmContact](#updatecrmcontact) - Update a contact
* [updateCrmDeal](#updatecrmdeal) - Update a deal
* [updateCrmEvent](#updatecrmevent) - Update a event
* [updateCrmFile](#updatecrmfile) - Update a file
* [updateCrmLead](#updatecrmlead) - Update a lead
* [updateCrmPipeline](#updatecrmpipeline) - Update a pipeline
* [updateCrmTeam](#updatecrmteam) - Update a team
* [updateCrmUser](#updatecrmuser) - Update a user

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
                    active = false;
                    address = new PropertyCrmCompanyAddress(){{
                        address1 = "Germany";
                        address2 = "soluta magenta Data";
                        city = "Indio";
                        country = "Jordan";
                        countryCode = "MM";
                        postalCode = "53595-4222";
                        region = "Bedfordshire Compatible";
                        regionCode = "Steel protocol users";
                    }};
                    createdAt = OffsetDateTime.parse("2021-08-20T21:53:39.286Z");
                    dealIds = new String[]{{
                        add("joint"),
                    }};
                    emails = new com.unifiedapi.unifiedto.models.shared.CrmEmail[]{{
                        add(new CrmEmail(){{}}),
                    }};
                    id = "<ID>";
                    name = "Profound woman Illinois";
                    raw = new PropertyCrmCompanyRaw();
                    tags = new String[]{{
                        add("bewilder"),
                    }};
                    telephones = new com.unifiedapi.unifiedto.models.shared.CrmTelephone[]{{
                        add(new CrmTelephone("meanwhile"){{
                            telephone = "joule";
                        }}),
                    }};
                    updatedAt = OffsetDateTime.parse("2023-04-25T05:51:27.903Z");
                    websites = new String[]{{
                        add("Benz"),
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
                        address1 = "towards";
                        address2 = "Cambridgeshire Passenger Producer";
                        city = "Gutkowskifurt";
                        country = "Bolivia";
                        countryCode = "NA";
                        postalCode = "06740";
                        region = "Fresh auxiliary";
                        regionCode = "Northwest";
                    }};
                    company = "Ratke, Pacocha and Harvey";
                    companyIds = new String[]{{
                        add("likewise"),
                    }};
                    createdAt = OffsetDateTime.parse("2023-03-19T11:45:23.493Z");
                    dealIds = new String[]{{
                        add("thatch"),
                    }};
                    emails = new com.unifiedapi.unifiedto.models.shared.CrmEmail[]{{
                        add(new CrmEmail(){{}}),
                    }};
                    id = "<ID>";
                    name = "asperiores Principal Wooden";
                    raw = new PropertyCrmContactRaw();
                    telephones = new com.unifiedapi.unifiedto.models.shared.CrmTelephone[]{{
                        add(new CrmTelephone("flat"){{
                            telephone = "generate rapidly Southeast";
                        }}),
                    }};
                    title = "Coupe Industrial Won";
                    updatedAt = OffsetDateTime.parse("2021-12-23T10:16:54.912Z");
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
                    lostReason = "haptic supposing Lexi";
                    name = "Mercury Xenon";
                    pipeline = "Elegant revolutionary ick";
                    probability = 2681.26d;
                    raw = new PropertyCrmDealRaw();
                    source = "North PNG voluptatibus";
                    stage = "Hybrid protocol";
                    tags = new String[]{{
                        add("bitterly"),
                    }};
                    updatedAt = OffsetDateTime.parse("2021-07-10T09:34:06.255Z");
                    wonReason = "calculate Maryland";
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
                        body = "forenenst interface Switzerland";
                        cc = new String[]{{
                            add("Underpass"),
                        }};
                        from = "Egypt Lutetium SUV";
                        subject = "Rock XSS Pickup";
                        to = new String[]{{
                            add("Fresh"),
                        }};
                    }};
                    id = "<ID>";
                    meeting = new PropertyCrmEventMeeting(){{
                        description = "Configurable needs-based forecast";
                        endAt = OffsetDateTime.parse("2023-04-17T00:16:04.496Z");
                        startAt = OffsetDateTime.parse("2022-08-12T07:03:56.644Z");
                        title = "Hip Loan";
                    }};
                    note = new PropertyCrmEventNote(){{
                        description = "Quality-focused upward-trending budgetary management";
                    }};
                    raw = new PropertyCrmEventRaw();
                    task = new PropertyCrmEventTask(){{
                        description = "Secured stable software";
                        name = "as interface United";
                        status = "meanwhile viral Marketing";
                    }};
                    type = CrmEventType.CALL;
                    updatedAt = OffsetDateTime.parse("2021-03-02T15:18:14.793Z");
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
                    active = false;
                    activityId = "the";
                    companyId = "Tactics Bicycle copy";
                    contactId = "Soul";
                    createdAt = OffsetDateTime.parse("2022-08-31T22:30:51.049Z");
                    dealId = "SSL Reduced Buckinghamshire";
                    description = "Upgradable radical archive";
                    fileName = "coupe.mp4v";
                    fileSize = 4288.39d;
                    fileType = "application";
                    fileUrl = "program hacking";
                    id = "<ID>";
                    leadId = "Bicycle Marketing Helium";
                    raw = new PropertyCrmFileRaw();
                    updatedAt = OffsetDateTime.parse("2022-09-17T10:16:03.549Z");
                    userId = "mobile firewall salmon";
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
                    active = false;
                    address = new PropertyCrmLeadAddress(){{
                        address1 = "ability Einsteinium Orchestrator";
                        address2 = "Optimization Rubber loyally";
                        city = "Mitchellfort";
                        country = "Morocco";
                        countryCode = "GT";
                        postalCode = "14014";
                        region = "Strategist Product Reggae";
                        regionCode = "possimus Chief Intelligent";
                    }};
                    companyId = "Division Ball Diesel";
                    contactId = "Peso Grocery";
                    createdAt = OffsetDateTime.parse("2022-01-25T18:26:15.433Z");
                    creatorUserId = "Southeast";
                    emails = new com.unifiedapi.unifiedto.models.shared.CrmEmail[]{{
                        add(new CrmEmail(){{}}),
                    }};
                    id = "<ID>";
                    name = "North";
                    raw = new PropertyCrmLeadRaw();
                    telephones = new com.unifiedapi.unifiedto.models.shared.CrmTelephone[]{{
                        add(new CrmTelephone("payment"){{
                            telephone = "Diesel Shirt";
                        }}),
                    }};
                    updatedAt = OffsetDateTime.parse("2021-04-11T02:45:56.928Z");
                    userId = "sky male";
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
                    active = false;
                    createdAt = OffsetDateTime.parse("2023-01-01T02:57:01.626Z");
                    dealProbability = false;
                    displayOrder = 16.09d;
                    id = "<ID>";
                    name = "Bicycle Hatchback Nobelium";
                    raw = new PropertyCrmPipelineRaw();
                    updatedAt = OffsetDateTime.parse("2021-05-19T19:45:21.711Z");
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


## createCrmTeam

Create a team

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.CreateCrmTeamRequest;
import com.unifiedapi.unifiedto.models.operations.CreateCrmTeamResponse;
import com.unifiedapi.unifiedto.models.shared.CrmTeam;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmTeamRaw;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("exercitationem"){{
                    jwt = "";
                }})
                .build();

            CreateCrmTeamRequest req = new CreateCrmTeamRequest("who"){{
                crmTeam = new CrmTeam(){{
                    createdAt = OffsetDateTime.parse("2021-03-06T10:56:47.076Z");
                    description = "Mandatory mission-critical ability";
                    id = "<ID>";
                    name = "Barbados volt";
                    raw = new PropertyCrmTeamRaw();
                    updatedAt = OffsetDateTime.parse("2021-06-02T08:20:09.148Z");
                    userIds = new String[]{{
                        add("Northwest"),
                    }};
                }};
            }};            

            CreateCrmTeamResponse res = sdk.crm.createCrmTeam(req);

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

| Parameter                                                                                                          | Type                                                                                                               | Required                                                                                                           | Description                                                                                                        |
| ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                          | [com.unifiedapi.unifiedto.models.operations.CreateCrmTeamRequest](../../models/operations/CreateCrmTeamRequest.md) | :heavy_check_mark:                                                                                                 | The request object to use for the request.                                                                         |


### Response

**[com.unifiedapi.unifiedto.models.operations.CreateCrmTeamResponse](../../models/operations/CreateCrmTeamResponse.md)**


## createCrmUser

Create a user

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.CreateCrmUserRequest;
import com.unifiedapi.unifiedto.models.operations.CreateCrmUserResponse;
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
                .setSecurity(new Security("zero"){{
                    jwt = "";
                }})
                .build();

            CreateCrmUserRequest req = new CreateCrmUserRequest("male"){{
                crmUser = new CrmUser(){{
                    active = false;
                    address = new PropertyCrmUserAddress(){{
                        address1 = "Incredible Virginia";
                        address2 = "Dakota";
                        city = "Atascocita";
                        country = "Brazil";
                        countryCode = "JP";
                        postalCode = "31377-1960";
                        region = "red";
                        regionCode = "male";
                    }};
                    createdAt = OffsetDateTime.parse("2023-02-24T09:43:14.454Z");
                    currency = "Silver";
                    department = "AI North";
                    division = "Latin Will the";
                    emails = new com.unifiedapi.unifiedto.models.shared.CrmEmail[]{{
                        add(new CrmEmail(){{}}),
                    }};
                    id = "<ID>";
                    imageUrl = "Central Director";
                    languageLocale = "Personal compelling similique";
                    name = "pink Toms";
                    raw = new PropertyCrmUserRaw();
                    telephones = new com.unifiedapi.unifiedto.models.shared.CrmTelephone[]{{
                        add(new CrmTelephone("Clifton"){{
                            telephone = "cyan";
                        }}),
                    }};
                    timezone = "Asia/Dhaka";
                    title = "violet";
                    updatedAt = OffsetDateTime.parse("2023-12-25T13:02:25.837Z");
                }};
            }};            

            CreateCrmUserResponse res = sdk.crm.createCrmUser(req);

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

| Parameter                                                                                                          | Type                                                                                                               | Required                                                                                                           | Description                                                                                                        |
| ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                          | [com.unifiedapi.unifiedto.models.operations.CreateCrmUserRequest](../../models/operations/CreateCrmUserRequest.md) | :heavy_check_mark:                                                                                                 | The request object to use for the request.                                                                         |


### Response

**[com.unifiedapi.unifiedto.models.operations.CreateCrmUserResponse](../../models/operations/CreateCrmUserResponse.md)**


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

            GetCrmCompanyRequest req = new GetCrmCompanyRequest("Mini", "inaugurate");            

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

            GetCrmContactRequest req = new GetCrmContactRequest("Silver", "transgender");            

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

            GetCrmDealRequest req = new GetCrmDealRequest("mint", "Reduced");            

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

            GetCrmEventRequest req = new GetCrmEventRequest("Ergonomic", "Director");            

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

            GetCrmFileRequest req = new GetCrmFileRequest("sexy", "Southeast");            

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

            GetCrmLeadRequest req = new GetCrmLeadRequest("Curium", "Bahamas");            

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

            GetCrmPipelineRequest req = new GetCrmPipelineRequest("online", "boliviano");            

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


## getCrmTeam

Retrieve a team

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetCrmTeamRequest;
import com.unifiedapi.unifiedto.models.operations.GetCrmTeamResponse;
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("online"){{
                    jwt = "";
                }})
                .build();

            GetCrmTeamRequest req = new GetCrmTeamRequest("Outdoors", "Armenia");            

            GetCrmTeamResponse res = sdk.crm.getCrmTeam(req);

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

| Parameter                                                                                                    | Type                                                                                                         | Required                                                                                                     | Description                                                                                                  |
| ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                    | [com.unifiedapi.unifiedto.models.operations.GetCrmTeamRequest](../../models/operations/GetCrmTeamRequest.md) | :heavy_check_mark:                                                                                           | The request object to use for the request.                                                                   |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetCrmTeamResponse](../../models/operations/GetCrmTeamResponse.md)**


## getCrmUser

Retrieve a user

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetCrmUserRequest;
import com.unifiedapi.unifiedto.models.operations.GetCrmUserResponse;
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("adipisci"){{
                    jwt = "";
                }})
                .build();

            GetCrmUserRequest req = new GetCrmUserRequest("connect", "Bacon");            

            GetCrmUserResponse res = sdk.crm.getCrmUser(req);

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

| Parameter                                                                                                    | Type                                                                                                         | Required                                                                                                     | Description                                                                                                  |
| ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                    | [com.unifiedapi.unifiedto.models.operations.GetCrmUserRequest](../../models/operations/GetCrmUserRequest.md) | :heavy_check_mark:                                                                                           | The request object to use for the request.                                                                   |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetCrmUserResponse](../../models/operations/GetCrmUserResponse.md)**


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
                contactId = "Hill Sleek Tricycle";
                dealId = "synergies molestias Recycled";
                limit = 7700.92d;
                offset = 7980.96d;
                order = "Malden Interactions";
                query = "salmon Southwest Manager";
                sort = "but Northwest";
                updatedGte = OffsetDateTime.parse("2022-09-14T00:38:40.164Z");
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
                companyId = "Nevada portal Recumbent";
                dealId = "bah Music Lubbock";
                limit = 6222.97d;
                offset = 9658.75d;
                order = "Rubber strategic Chair";
                query = "Gloves gadzooks";
                sort = "Electric";
                updatedGte = OffsetDateTime.parse("2021-08-01T17:00:48.842Z");
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
                companyId = "payment";
                contactId = "Tala Avon";
                limit = 4899.83d;
                offset = 2926.12d;
                order = "West tan Cambridgeshire";
                query = "Identity ash";
                sort = "Bespoke Tuvalu woman";
                updatedGte = OffsetDateTime.parse("2021-03-11T21:18:26.023Z");
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
                companyId = "payment Female Checking";
                contactId = "pascal";
                dealId = "Senior Executive warmly";
                limit = 3159.73d;
                offset = 1427.26d;
                order = "Borders proffer";
                query = "Road";
                sort = "Tasty";
                updatedGte = OffsetDateTime.parse("2023-04-23T19:45:04.750Z");
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
                companyId = "Paradigm";
                contactId = "invoice hertz";
                dealId = "SUV Carbon";
                limit = 9242.75d;
                offset = 824.64d;
                order = "Gorgeous olive";
                query = "suite Checking";
                sort = "SUV";
                updatedGte = OffsetDateTime.parse("2021-11-26T17:23:51.411Z");
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
                limit = 4734.01d;
                offset = 6489.94d;
                order = "Human applications Program";
                query = "Agent Automotive";
                sort = "Electric Plastic";
                updatedGte = OffsetDateTime.parse("2023-11-17T22:27:19.954Z");
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
                limit = 7450.66d;
                offset = 5820.53d;
                order = "majestically mobile generate";
                query = "female National";
                sort = "Buckinghamshire Bedfordshire";
                updatedGte = OffsetDateTime.parse("2021-12-10T20:55:53.457Z");
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


## listCrmTeams

List all teams

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.ListCrmTeamsRequest;
import com.unifiedapi.unifiedto.models.operations.ListCrmTeamsResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("Celsius"){{
                    jwt = "";
                }})
                .build();

            ListCrmTeamsRequest req = new ListCrmTeamsRequest("microchip"){{
                limit = 2537.47d;
                offset = 2305.88d;
                order = "Folk Direct conglomeration";
                query = "brand becquerel audit";
                sort = "Buckinghamshire Berkshire";
                updatedGte = OffsetDateTime.parse("2022-08-22T07:37:51.566Z");
            }};            

            ListCrmTeamsResponse res = sdk.crm.listCrmTeams(req);

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

| Parameter                                                                                                        | Type                                                                                                             | Required                                                                                                         | Description                                                                                                      |
| ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                        | [com.unifiedapi.unifiedto.models.operations.ListCrmTeamsRequest](../../models/operations/ListCrmTeamsRequest.md) | :heavy_check_mark:                                                                                               | The request object to use for the request.                                                                       |


### Response

**[com.unifiedapi.unifiedto.models.operations.ListCrmTeamsResponse](../../models/operations/ListCrmTeamsResponse.md)**


## listCrmUsers

List all users

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.ListCrmUsersRequest;
import com.unifiedapi.unifiedto.models.operations.ListCrmUsersResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("CFA"){{
                    jwt = "";
                }})
                .build();

            ListCrmUsersRequest req = new ListCrmUsersRequest("Costa"){{
                limit = 1707.72d;
                offset = 6650.22d;
                order = "cyan Southeast";
                query = "scale Rock San";
                sort = "Centralized Neptunium";
                updatedGte = OffsetDateTime.parse("2023-10-13T06:25:33.606Z");
            }};            

            ListCrmUsersResponse res = sdk.crm.listCrmUsers(req);

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

| Parameter                                                                                                        | Type                                                                                                             | Required                                                                                                         | Description                                                                                                      |
| ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                        | [com.unifiedapi.unifiedto.models.operations.ListCrmUsersRequest](../../models/operations/ListCrmUsersRequest.md) | :heavy_check_mark:                                                                                               | The request object to use for the request.                                                                       |


### Response

**[com.unifiedapi.unifiedto.models.operations.ListCrmUsersResponse](../../models/operations/ListCrmUsersResponse.md)**


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
                    active = false;
                    address = new PropertyCrmCompanyAddress(){{
                        address1 = "Phased Investment";
                        address2 = "Trans";
                        city = "Ewaldland";
                        country = "Benin";
                        countryCode = "SA";
                        postalCode = "32828-2802";
                        region = "Thorium Buckinghamshire Programmable";
                        regionCode = "revolutionary Lock Investment";
                    }};
                    createdAt = OffsetDateTime.parse("2022-06-26T20:56:24.683Z");
                    dealIds = new String[]{{
                        add("over"),
                    }};
                    emails = new com.unifiedapi.unifiedto.models.shared.CrmEmail[]{{
                        add(new CrmEmail(){{}}),
                    }};
                    id = "<ID>";
                    name = "invoice Metal";
                    raw = new PropertyCrmCompanyRaw();
                    tags = new String[]{{
                        add("upon"),
                    }};
                    telephones = new com.unifiedapi.unifiedto.models.shared.CrmTelephone[]{{
                        add(new CrmTelephone("shelf"){{
                            telephone = "steradian Sleek";
                        }}),
                    }};
                    updatedAt = OffsetDateTime.parse("2023-11-02T22:14:25.075Z");
                    websites = new String[]{{
                        add("Palos"),
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
                        address1 = "Northeast salmon";
                        address2 = "Wooden Southwest";
                        city = "Caylaside";
                        country = "Antigua and Barbuda";
                        countryCode = "MM";
                        postalCode = "17496";
                        region = "Music questioning";
                        regionCode = "Minivan Consultant Senior";
                    }};
                    company = "Roberts, Price and Ondricka";
                    companyIds = new String[]{{
                        add("Northwest"),
                    }};
                    createdAt = OffsetDateTime.parse("2022-02-10T03:20:51.348Z");
                    dealIds = new String[]{{
                        add("Southwest"),
                    }};
                    emails = new com.unifiedapi.unifiedto.models.shared.CrmEmail[]{{
                        add(new CrmEmail(){{}}),
                    }};
                    id = "<ID>";
                    name = "South blockchains West";
                    raw = new PropertyCrmContactRaw();
                    telephones = new com.unifiedapi.unifiedto.models.shared.CrmTelephone[]{{
                        add(new CrmTelephone("whereas"){{
                            telephone = "quibusdam optical";
                        }}),
                    }};
                    title = "feed navigate";
                    updatedAt = OffsetDateTime.parse("2023-04-18T19:04:11.197Z");
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
                    lostReason = "SCSI Licensed";
                    name = "including Costa Cheese";
                    pipeline = "HEX Executive Books";
                    probability = 8889.47d;
                    raw = new PropertyCrmDealRaw();
                    source = "Account Metal Paradigm";
                    stage = "est Principal Kids";
                    tags = new String[]{{
                        add("Folk"),
                    }};
                    updatedAt = OffsetDateTime.parse("2021-11-27T11:12:42.357Z");
                    wonReason = "channels second";
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
                        body = "Bike gold Intersex";
                        cc = new String[]{{
                            add("Polestar"),
                        }};
                        from = "miserably";
                        subject = "vein Idaho boo";
                        to = new String[]{{
                            add("Technician"),
                        }};
                    }};
                    id = "<ID>";
                    meeting = new PropertyCrmEventMeeting(){{
                        description = "Multi-lateral intangible implementation";
                        endAt = OffsetDateTime.parse("2021-08-21T02:50:26.982Z");
                        startAt = OffsetDateTime.parse("2021-10-12T21:23:43.046Z");
                        title = "jest down";
                    }};
                    note = new PropertyCrmEventNote(){{
                        description = "Face to face coherent flexibility";
                    }};
                    raw = new PropertyCrmEventRaw();
                    task = new PropertyCrmEventTask(){{
                        description = "Enhanced multimedia array";
                        name = "Extended zero compressing";
                        status = "hierarchy mostly communities";
                    }};
                    type = CrmEventType.CALL;
                    updatedAt = OffsetDateTime.parse("2021-06-15T11:47:58.504Z");
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
                    active = false;
                    activityId = "Oriental invoice";
                    companyId = "Texas blockchains";
                    contactId = "navigate";
                    createdAt = OffsetDateTime.parse("2021-12-30T16:07:40.056Z");
                    dealId = "yellow Buckinghamshire";
                    description = "Configurable exuding budgetary management";
                    fileName = "xml_oxygen.gif";
                    fileSize = 9689.63d;
                    fileType = "application";
                    fileUrl = "National Granite redundant";
                    id = "<ID>";
                    leadId = "East";
                    raw = new PropertyCrmFileRaw();
                    updatedAt = OffsetDateTime.parse("2022-11-16T13:24:51.820Z");
                    userId = "corrupti withdrawal Diesel";
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
                    active = false;
                    address = new PropertyCrmLeadAddress(){{
                        address1 = "Computer";
                        address2 = "matrix";
                        city = "Gerholdview";
                        country = "Sao Tome and Principe";
                        countryCode = "LC";
                        postalCode = "53034-9357";
                        region = "Lanka Northeast";
                        regionCode = "Decentralized gray Fresh";
                    }};
                    companyId = "woman Forint";
                    contactId = "Associate";
                    createdAt = OffsetDateTime.parse("2022-02-07T21:39:27.693Z");
                    creatorUserId = "Ergonomic";
                    emails = new com.unifiedapi.unifiedto.models.shared.CrmEmail[]{{
                        add(new CrmEmail(){{}}),
                    }};
                    id = "<ID>";
                    name = "Credit Coupe";
                    raw = new PropertyCrmLeadRaw();
                    telephones = new com.unifiedapi.unifiedto.models.shared.CrmTelephone[]{{
                        add(new CrmTelephone("Hybrid"){{
                            telephone = "Fisher convergence";
                        }}),
                    }};
                    updatedAt = OffsetDateTime.parse("2021-11-20T08:57:15.653Z");
                    userId = "Shoes magenta";
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
                    active = false;
                    createdAt = OffsetDateTime.parse("2023-09-09T16:00:07.264Z");
                    dealProbability = false;
                    displayOrder = 9737.04d;
                    id = "<ID>";
                    name = "Lead Operative";
                    raw = new PropertyCrmPipelineRaw();
                    updatedAt = OffsetDateTime.parse("2021-10-29T04:39:52.787Z");
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


## patchCrmTeam

Update a team

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PatchCrmTeamRequest;
import com.unifiedapi.unifiedto.models.operations.PatchCrmTeamResponse;
import com.unifiedapi.unifiedto.models.shared.CrmTeam;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmTeamRaw;
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

            PatchCrmTeamRequest req = new PatchCrmTeamRequest("Customer", "redefine"){{
                crmTeam = new CrmTeam(){{
                    createdAt = OffsetDateTime.parse("2021-07-12T19:43:20.661Z");
                    description = "Streamlined contextually-based encryption";
                    id = "<ID>";
                    name = "Latin";
                    raw = new PropertyCrmTeamRaw();
                    updatedAt = OffsetDateTime.parse("2022-03-09T00:20:45.927Z");
                    userIds = new String[]{{
                        add("convergence"),
                    }};
                }};
            }};            

            PatchCrmTeamResponse res = sdk.crm.patchCrmTeam(req);

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

| Parameter                                                                                                        | Type                                                                                                             | Required                                                                                                         | Description                                                                                                      |
| ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                        | [com.unifiedapi.unifiedto.models.operations.PatchCrmTeamRequest](../../models/operations/PatchCrmTeamRequest.md) | :heavy_check_mark:                                                                                               | The request object to use for the request.                                                                       |


### Response

**[com.unifiedapi.unifiedto.models.operations.PatchCrmTeamResponse](../../models/operations/PatchCrmTeamResponse.md)**


## patchCrmUser

Update a user

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PatchCrmUserRequest;
import com.unifiedapi.unifiedto.models.operations.PatchCrmUserResponse;
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
                .setSecurity(new Security("Demiflux"){{
                    jwt = "";
                }})
                .build();

            PatchCrmUserRequest req = new PatchCrmUserRequest("grey", "Pizza"){{
                crmUser = new CrmUser(){{
                    active = false;
                    address = new PropertyCrmUserAddress(){{
                        address1 = "around overburden Factors";
                        address2 = "Samir";
                        city = "Lake Glennaboro";
                        country = "Bahamas";
                        countryCode = "AU";
                        postalCode = "38358-1281";
                        region = "Bike";
                        regionCode = "blue";
                    }};
                    createdAt = OffsetDateTime.parse("2021-01-31T22:26:45.960Z");
                    currency = "Fiji Dollar";
                    department = "sticky pink card";
                    division = "synergize Cotton apud";
                    emails = new com.unifiedapi.unifiedto.models.shared.CrmEmail[]{{
                        add(new CrmEmail(){{}}),
                    }};
                    id = "<ID>";
                    imageUrl = "male Land fumbling";
                    languageLocale = "bypassing microchip GB";
                    name = "Cambridgeshire sit Account";
                    raw = new PropertyCrmUserRaw();
                    telephones = new com.unifiedapi.unifiedto.models.shared.CrmTelephone[]{{
                        add(new CrmTelephone("Engineer"){{
                            telephone = "though";
                        }}),
                    }};
                    timezone = "Europe/Brussels";
                    title = "Agender Bicycle";
                    updatedAt = OffsetDateTime.parse("2023-09-30T00:47:17.388Z");
                }};
            }};            

            PatchCrmUserResponse res = sdk.crm.patchCrmUser(req);

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

| Parameter                                                                                                        | Type                                                                                                             | Required                                                                                                         | Description                                                                                                      |
| ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                        | [com.unifiedapi.unifiedto.models.operations.PatchCrmUserRequest](../../models/operations/PatchCrmUserRequest.md) | :heavy_check_mark:                                                                                               | The request object to use for the request.                                                                       |


### Response

**[com.unifiedapi.unifiedto.models.operations.PatchCrmUserResponse](../../models/operations/PatchCrmUserResponse.md)**


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


## removeCrmTeam

Remove a team

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.RemoveCrmTeamRequest;
import com.unifiedapi.unifiedto.models.operations.RemoveCrmTeamResponse;
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("Cotton"){{
                    jwt = "";
                }})
                .build();

            RemoveCrmTeamRequest req = new RemoveCrmTeamRequest("Communications", "Recumbent");            

            RemoveCrmTeamResponse res = sdk.crm.removeCrmTeam(req);

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
| `request`                                                                                                          | [com.unifiedapi.unifiedto.models.operations.RemoveCrmTeamRequest](../../models/operations/RemoveCrmTeamRequest.md) | :heavy_check_mark:                                                                                                 | The request object to use for the request.                                                                         |


### Response

**[com.unifiedapi.unifiedto.models.operations.RemoveCrmTeamResponse](../../models/operations/RemoveCrmTeamResponse.md)**


## removeCrmUser

Remove a user

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.RemoveCrmUserRequest;
import com.unifiedapi.unifiedto.models.operations.RemoveCrmUserResponse;
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("yellow"){{
                    jwt = "";
                }})
                .build();

            RemoveCrmUserRequest req = new RemoveCrmUserRequest("Central", "paradigms");            

            RemoveCrmUserResponse res = sdk.crm.removeCrmUser(req);

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
| `request`                                                                                                          | [com.unifiedapi.unifiedto.models.operations.RemoveCrmUserRequest](../../models/operations/RemoveCrmUserRequest.md) | :heavy_check_mark:                                                                                                 | The request object to use for the request.                                                                         |


### Response

**[com.unifiedapi.unifiedto.models.operations.RemoveCrmUserResponse](../../models/operations/RemoveCrmUserResponse.md)**


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
                    active = false;
                    address = new PropertyCrmCompanyAddress(){{
                        address1 = "Bicycle";
                        address2 = "mar Southeast";
                        city = "Enidburgh";
                        country = "Honduras";
                        countryCode = "TG";
                        postalCode = "69514-8448";
                        region = "port male";
                        regionCode = "portals";
                    }};
                    createdAt = OffsetDateTime.parse("2021-05-19T11:53:09.825Z");
                    dealIds = new String[]{{
                        add("Salvador"),
                    }};
                    emails = new com.unifiedapi.unifiedto.models.shared.CrmEmail[]{{
                        add(new CrmEmail(){{}}),
                    }};
                    id = "<ID>";
                    name = "monitor Blues Northwest";
                    raw = new PropertyCrmCompanyRaw();
                    tags = new String[]{{
                        add("Borders"),
                    }};
                    telephones = new com.unifiedapi.unifiedto.models.shared.CrmTelephone[]{{
                        add(new CrmTelephone("discrete"){{
                            telephone = "Romania";
                        }}),
                    }};
                    updatedAt = OffsetDateTime.parse("2022-04-16T09:00:32.301Z");
                    websites = new String[]{{
                        add("Product"),
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
                        address1 = "Des green";
                        address2 = "man panel";
                        city = "New Zacharyport";
                        country = "Australia";
                        countryCode = "BW";
                        postalCode = "83405";
                        region = "1080p Northeast";
                        regionCode = "Virginia";
                    }};
                    company = "Klocko Inc";
                    companyIds = new String[]{{
                        add("Macedonia"),
                    }};
                    createdAt = OffsetDateTime.parse("2021-09-06T18:08:34.170Z");
                    dealIds = new String[]{{
                        add("Silver"),
                    }};
                    emails = new com.unifiedapi.unifiedto.models.shared.CrmEmail[]{{
                        add(new CrmEmail(){{}}),
                    }};
                    id = "<ID>";
                    name = "Buckinghamshire";
                    raw = new PropertyCrmContactRaw();
                    telephones = new com.unifiedapi.unifiedto.models.shared.CrmTelephone[]{{
                        add(new CrmTelephone("successfully"){{
                            telephone = "violet synthesize";
                        }}),
                    }};
                    title = "Electronics 1080p withdrawal";
                    updatedAt = OffsetDateTime.parse("2023-12-17T06:39:56.020Z");
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
                    lostReason = "Coupe envisioneer";
                    name = "obese Tala";
                    pipeline = "technologies";
                    probability = 5802.98d;
                    raw = new PropertyCrmDealRaw();
                    source = "infect calculating";
                    stage = "Minivan although";
                    tags = new String[]{{
                        add("deposit"),
                    }};
                    updatedAt = OffsetDateTime.parse("2021-04-03T08:12:18.698Z");
                    wonReason = "Orchestrator Lamborghini ah";
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
                        body = "Electric parsing Morgan";
                        cc = new String[]{{
                            add("Global"),
                        }};
                        from = "Manat mint";
                        subject = "Interactions Account ratione";
                        to = new String[]{{
                            add("Group"),
                        }};
                    }};
                    id = "<ID>";
                    meeting = new PropertyCrmEventMeeting(){{
                        description = "Polarised coherent circuit";
                        endAt = OffsetDateTime.parse("2021-04-13T01:04:45.491Z");
                        startAt = OffsetDateTime.parse("2022-03-05T22:42:07.974Z");
                        title = "pish Specialist";
                    }};
                    note = new PropertyCrmEventNote(){{
                        description = "Down-sized secondary success";
                    }};
                    raw = new PropertyCrmEventRaw();
                    task = new PropertyCrmEventTask(){{
                        description = "User-friendly background installation";
                        name = "Intranet monitor Washington";
                        status = "hard drat weber";
                    }};
                    type = CrmEventType.MEETING;
                    updatedAt = OffsetDateTime.parse("2023-10-23T02:58:57.471Z");
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
                    active = false;
                    activityId = "Cotton Specialist";
                    companyId = "Rustic Bluffs";
                    contactId = "content sorrowful Lead";
                    createdAt = OffsetDateTime.parse("2022-06-16T11:45:11.956Z");
                    dealId = "successfully Account";
                    description = "Right-sized dedicated productivity";
                    fileName = "radium.jpg";
                    fileSize = 5172.6d;
                    fileType = "audio";
                    fileUrl = "Northeast Mandatory";
                    id = "<ID>";
                    leadId = "AI Small wasting";
                    raw = new PropertyCrmFileRaw();
                    updatedAt = OffsetDateTime.parse("2021-08-04T14:31:18.269Z");
                    userId = "UTF8";
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
                    active = false;
                    address = new PropertyCrmLeadAddress(){{
                        address1 = "joule North Concrete";
                        address2 = "Officer auxiliary";
                        city = "Greenfelderworth";
                        country = "Uzbekistan";
                        countryCode = "CV";
                        postalCode = "85356-4106";
                        region = "numquam Ball Concrete";
                        regionCode = "Technician";
                    }};
                    companyId = "treasure attitude sint";
                    contactId = "Cab charming";
                    createdAt = OffsetDateTime.parse("2022-09-10T10:31:16.748Z");
                    creatorUserId = "purple yawningly";
                    emails = new com.unifiedapi.unifiedto.models.shared.CrmEmail[]{{
                        add(new CrmEmail(){{}}),
                    }};
                    id = "<ID>";
                    name = "Concrete Incredible Tesla";
                    raw = new PropertyCrmLeadRaw();
                    telephones = new com.unifiedapi.unifiedto.models.shared.CrmTelephone[]{{
                        add(new CrmTelephone("provided"){{
                            telephone = "Health";
                        }}),
                    }};
                    updatedAt = OffsetDateTime.parse("2023-03-27T06:34:53.317Z");
                    userId = "Customer";
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
                    active = false;
                    createdAt = OffsetDateTime.parse("2021-08-22T21:47:34.241Z");
                    dealProbability = false;
                    displayOrder = 1646.47d;
                    id = "<ID>";
                    name = "Configuration Minivan";
                    raw = new PropertyCrmPipelineRaw();
                    updatedAt = OffsetDateTime.parse("2021-01-09T13:17:28.520Z");
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


## updateCrmTeam

Update a team

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.UpdateCrmTeamRequest;
import com.unifiedapi.unifiedto.models.operations.UpdateCrmTeamResponse;
import com.unifiedapi.unifiedto.models.shared.CrmTeam;
import com.unifiedapi.unifiedto.models.shared.PropertyCrmTeamRaw;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("Carbon"){{
                    jwt = "";
                }})
                .build();

            UpdateCrmTeamRequest req = new UpdateCrmTeamRequest("East", "Customer"){{
                crmTeam = new CrmTeam(){{
                    createdAt = OffsetDateTime.parse("2023-02-08T11:34:45.438Z");
                    description = "Fundamental actuating protocol";
                    id = "<ID>";
                    name = "bandwidth";
                    raw = new PropertyCrmTeamRaw();
                    updatedAt = OffsetDateTime.parse("2021-07-22T21:20:20.482Z");
                    userIds = new String[]{{
                        add("orchid"),
                    }};
                }};
            }};            

            UpdateCrmTeamResponse res = sdk.crm.updateCrmTeam(req);

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

| Parameter                                                                                                          | Type                                                                                                               | Required                                                                                                           | Description                                                                                                        |
| ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                          | [com.unifiedapi.unifiedto.models.operations.UpdateCrmTeamRequest](../../models/operations/UpdateCrmTeamRequest.md) | :heavy_check_mark:                                                                                                 | The request object to use for the request.                                                                         |


### Response

**[com.unifiedapi.unifiedto.models.operations.UpdateCrmTeamResponse](../../models/operations/UpdateCrmTeamResponse.md)**


## updateCrmUser

Update a user

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.UpdateCrmUserRequest;
import com.unifiedapi.unifiedto.models.operations.UpdateCrmUserResponse;
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
                .setSecurity(new Security("benchmark"){{
                    jwt = "";
                }})
                .build();

            UpdateCrmUserRequest req = new UpdateCrmUserRequest("Rustic", "Bedfordshire"){{
                crmUser = new CrmUser(){{
                    active = false;
                    address = new PropertyCrmUserAddress(){{
                        address1 = "Carlo Beryllium";
                        address2 = "Southwest throughout Wooden";
                        city = "North Richland Hills";
                        country = "Namibia";
                        countryCode = "EG";
                        postalCode = "00841";
                        region = "lazy";
                        regionCode = "Hat";
                    }};
                    createdAt = OffsetDateTime.parse("2023-10-16T17:08:05.884Z");
                    currency = "Tanzanian Shilling";
                    department = "invoice";
                    division = "Ethiopian";
                    emails = new com.unifiedapi.unifiedto.models.shared.CrmEmail[]{{
                        add(new CrmEmail(){{}}),
                    }};
                    id = "<ID>";
                    imageUrl = "female less";
                    languageLocale = "perspiciatis Creative 1080p";
                    name = "Road Movies regulation";
                    raw = new PropertyCrmUserRaw();
                    telephones = new com.unifiedapi.unifiedto.models.shared.CrmTelephone[]{{
                        add(new CrmTelephone("Granite"){{
                            telephone = "Northeast Avon";
                        }}),
                    }};
                    timezone = "Asia/Singapore";
                    title = "hmph connecting Movies";
                    updatedAt = OffsetDateTime.parse("2021-02-07T04:55:02.364Z");
                }};
            }};            

            UpdateCrmUserResponse res = sdk.crm.updateCrmUser(req);

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

| Parameter                                                                                                          | Type                                                                                                               | Required                                                                                                           | Description                                                                                                        |
| ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                          | [com.unifiedapi.unifiedto.models.operations.UpdateCrmUserRequest](../../models/operations/UpdateCrmUserRequest.md) | :heavy_check_mark:                                                                                                 | The request object to use for the request.                                                                         |


### Response

**[com.unifiedapi.unifiedto.models.operations.UpdateCrmUserResponse](../../models/operations/UpdateCrmUserResponse.md)**

