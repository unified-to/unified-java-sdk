# Job
(*job*)

### Available Operations

* [deleteAtsConnectionIdJobId](#deleteatsconnectionidjobid) - Remove a job
* [getAtsConnectionIdJob](#getatsconnectionidjob) - List all jobs
* [getAtsConnectionIdJobId](#getatsconnectionidjobid) - Retrieve a job
* [patchAtsConnectionIdJobId](#patchatsconnectionidjobid) - Update a job
* [postAtsConnectionIdJob](#postatsconnectionidjob) - Create a job
* [putAtsConnectionIdJobId](#putatsconnectionidjobid) - Update a job

## deleteAtsConnectionIdJobId

Remove a job

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.DeleteAtsConnectionIdJobIdRequest;
import com.unifiedapi.unifiedto.models.operations.DeleteAtsConnectionIdJobIdResponse;
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("Facilitator"){{
                    jwt = "";
                }})
                .build();

            DeleteAtsConnectionIdJobIdRequest req = new DeleteAtsConnectionIdJobIdRequest("Cargo", "Hybrid");            

            DeleteAtsConnectionIdJobIdResponse res = sdk.job.deleteAtsConnectionIdJobId(req);

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

| Parameter                                                                                                                                    | Type                                                                                                                                         | Required                                                                                                                                     | Description                                                                                                                                  |
| -------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                    | [com.unifiedapi.unifiedto.models.operations.DeleteAtsConnectionIdJobIdRequest](../../models/operations/DeleteAtsConnectionIdJobIdRequest.md) | :heavy_check_mark:                                                                                                                           | The request object to use for the request.                                                                                                   |


### Response

**[com.unifiedapi.unifiedto.models.operations.DeleteAtsConnectionIdJobIdResponse](../../models/operations/DeleteAtsConnectionIdJobIdResponse.md)**


## getAtsConnectionIdJob

List all jobs

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetAtsConnectionIdJobRequest;
import com.unifiedapi.unifiedto.models.operations.GetAtsConnectionIdJobResponse;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("process"){{
                    jwt = "";
                }})
                .build();

            GetAtsConnectionIdJobRequest req = new GetAtsConnectionIdJobRequest("Harbor"){{
                limit = 975.14d;
                offset = 9506.38d;
                order = "Rhode national Kip";
                query = "oversleep Baby transmitter";
                sort = "East Electronic proactive";
                updatedGte = OffsetDateTime.parse("2022-03-22T04:18:28.025Z");
            }};            

            GetAtsConnectionIdJobResponse res = sdk.job.getAtsConnectionIdJob(req);

            if (res.atsJobs != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                          | Type                                                                                                                               | Required                                                                                                                           | Description                                                                                                                        |
| ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                          | [com.unifiedapi.unifiedto.models.operations.GetAtsConnectionIdJobRequest](../../models/operations/GetAtsConnectionIdJobRequest.md) | :heavy_check_mark:                                                                                                                 | The request object to use for the request.                                                                                         |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetAtsConnectionIdJobResponse](../../models/operations/GetAtsConnectionIdJobResponse.md)**


## getAtsConnectionIdJobId

Retrieve a job

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.GetAtsConnectionIdJobIdRequest;
import com.unifiedapi.unifiedto.models.operations.GetAtsConnectionIdJobIdResponse;
import com.unifiedapi.unifiedto.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("plum"){{
                    jwt = "";
                }})
                .build();

            GetAtsConnectionIdJobIdRequest req = new GetAtsConnectionIdJobIdRequest("Gold", "bypass");            

            GetAtsConnectionIdJobIdResponse res = sdk.job.getAtsConnectionIdJobId(req);

            if (res.atsJob != null) {
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
| `request`                                                                                                                              | [com.unifiedapi.unifiedto.models.operations.GetAtsConnectionIdJobIdRequest](../../models/operations/GetAtsConnectionIdJobIdRequest.md) | :heavy_check_mark:                                                                                                                     | The request object to use for the request.                                                                                             |


### Response

**[com.unifiedapi.unifiedto.models.operations.GetAtsConnectionIdJobIdResponse](../../models/operations/GetAtsConnectionIdJobIdResponse.md)**


## patchAtsConnectionIdJobId

Update a job

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PatchAtsConnectionIdJobIdRequest;
import com.unifiedapi.unifiedto.models.operations.PatchAtsConnectionIdJobIdResponse;
import com.unifiedapi.unifiedto.models.shared.AtsAddress;
import com.unifiedapi.unifiedto.models.shared.AtsCompensation;
import com.unifiedapi.unifiedto.models.shared.AtsCompensationFrequency;
import com.unifiedapi.unifiedto.models.shared.AtsCompensationType;
import com.unifiedapi.unifiedto.models.shared.AtsJob;
import com.unifiedapi.unifiedto.models.shared.AtsJobEmploymentType;
import com.unifiedapi.unifiedto.models.shared.AtsJobStatus;
import com.unifiedapi.unifiedto.models.shared.PropertyAtsJobRaw;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("Soap"){{
                    jwt = "";
                }})
                .build();

            PatchAtsConnectionIdJobIdRequest req = new PatchAtsConnectionIdJobIdRequest("jaunty", "leach"){{
                atsJob = new AtsJob(){{
                    addresses = new com.unifiedapi.unifiedto.models.shared.AtsAddress[]{{
                        add(new AtsAddress(){{}}),
                    }};
                    closedAt = OffsetDateTime.parse("2022-02-09T22:20:35.711Z");
                    compensation = new com.unifiedapi.unifiedto.models.shared.AtsCompensation[]{{
                        add(new AtsCompensation(AtsCompensationType.OTHER){{
                            type = AtsCompensationType.EQUITY;
                        }}),
                    }};
                    createdAt = OffsetDateTime.parse("2022-07-20T18:20:52.596Z");
                    departments = new String[]{{
                        add("temporibus"),
                    }};
                    description = "Face to face needs-based strategy";
                    employmentType = AtsJobEmploymentType.OTHER;
                    hiringManagerIds = new String[]{{
                        add("redundant"),
                    }};
                    id = "<ID>";
                    languageLocale = "tempore";
                    name = "Manager Grand Cambridgeshire";
                    publicJobUrls = new String[]{{
                        add("Hyundai"),
                    }};
                    raw = new PropertyAtsJobRaw();
                    recruiterIds = new String[]{{
                        add("why"),
                    }};
                    remote = false;
                    status = AtsJobStatus.OPEN;
                    updatedAt = OffsetDateTime.parse("2023-10-29T19:21:43.388Z");
                }};
            }};            

            PatchAtsConnectionIdJobIdResponse res = sdk.job.patchAtsConnectionIdJobId(req);

            if (res.atsJob != null) {
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
| `request`                                                                                                                                  | [com.unifiedapi.unifiedto.models.operations.PatchAtsConnectionIdJobIdRequest](../../models/operations/PatchAtsConnectionIdJobIdRequest.md) | :heavy_check_mark:                                                                                                                         | The request object to use for the request.                                                                                                 |


### Response

**[com.unifiedapi.unifiedto.models.operations.PatchAtsConnectionIdJobIdResponse](../../models/operations/PatchAtsConnectionIdJobIdResponse.md)**


## postAtsConnectionIdJob

Create a job

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PostAtsConnectionIdJobRequest;
import com.unifiedapi.unifiedto.models.operations.PostAtsConnectionIdJobResponse;
import com.unifiedapi.unifiedto.models.shared.AtsAddress;
import com.unifiedapi.unifiedto.models.shared.AtsCompensation;
import com.unifiedapi.unifiedto.models.shared.AtsCompensationFrequency;
import com.unifiedapi.unifiedto.models.shared.AtsCompensationType;
import com.unifiedapi.unifiedto.models.shared.AtsJob;
import com.unifiedapi.unifiedto.models.shared.AtsJobEmploymentType;
import com.unifiedapi.unifiedto.models.shared.AtsJobStatus;
import com.unifiedapi.unifiedto.models.shared.PropertyAtsJobRaw;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("Niger"){{
                    jwt = "";
                }})
                .build();

            PostAtsConnectionIdJobRequest req = new PostAtsConnectionIdJobRequest("Gasoline"){{
                atsJob = new AtsJob(){{
                    addresses = new com.unifiedapi.unifiedto.models.shared.AtsAddress[]{{
                        add(new AtsAddress(){{}}),
                    }};
                    closedAt = OffsetDateTime.parse("2023-05-31T23:44:36.015Z");
                    compensation = new com.unifiedapi.unifiedto.models.shared.AtsCompensation[]{{
                        add(new AtsCompensation(AtsCompensationType.SALARY){{
                            type = AtsCompensationType.STOCK_OPTIONS;
                        }}),
                    }};
                    createdAt = OffsetDateTime.parse("2023-08-05T11:53:41.093Z");
                    departments = new String[]{{
                        add("kelvin"),
                    }};
                    description = "Cross-group tertiary success";
                    employmentType = AtsJobEmploymentType.VOLUNTEER;
                    hiringManagerIds = new String[]{{
                        add("Diesel"),
                    }};
                    id = "<ID>";
                    languageLocale = "web scale";
                    name = "Rockford";
                    publicJobUrls = new String[]{{
                        add("crossly"),
                    }};
                    raw = new PropertyAtsJobRaw();
                    recruiterIds = new String[]{{
                        add("Krona"),
                    }};
                    remote = false;
                    status = AtsJobStatus.CLOSED;
                    updatedAt = OffsetDateTime.parse("2022-09-23T22:03:01.333Z");
                }};
            }};            

            PostAtsConnectionIdJobResponse res = sdk.job.postAtsConnectionIdJob(req);

            if (res.atsJob != null) {
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
| `request`                                                                                                                            | [com.unifiedapi.unifiedto.models.operations.PostAtsConnectionIdJobRequest](../../models/operations/PostAtsConnectionIdJobRequest.md) | :heavy_check_mark:                                                                                                                   | The request object to use for the request.                                                                                           |


### Response

**[com.unifiedapi.unifiedto.models.operations.PostAtsConnectionIdJobResponse](../../models/operations/PostAtsConnectionIdJobResponse.md)**


## putAtsConnectionIdJobId

Update a job

### Example Usage

```java
package hello.world;

import com.unifiedapi.unifiedto.UnifiedTo;
import com.unifiedapi.unifiedto.models.operations.PutAtsConnectionIdJobIdRequest;
import com.unifiedapi.unifiedto.models.operations.PutAtsConnectionIdJobIdResponse;
import com.unifiedapi.unifiedto.models.shared.AtsAddress;
import com.unifiedapi.unifiedto.models.shared.AtsCompensation;
import com.unifiedapi.unifiedto.models.shared.AtsCompensationFrequency;
import com.unifiedapi.unifiedto.models.shared.AtsCompensationType;
import com.unifiedapi.unifiedto.models.shared.AtsJob;
import com.unifiedapi.unifiedto.models.shared.AtsJobEmploymentType;
import com.unifiedapi.unifiedto.models.shared.AtsJobStatus;
import com.unifiedapi.unifiedto.models.shared.PropertyAtsJobRaw;
import com.unifiedapi.unifiedto.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            UnifiedTo sdk = UnifiedTo.builder()
                .setSecurity(new Security("invoice"){{
                    jwt = "";
                }})
                .build();

            PutAtsConnectionIdJobIdRequest req = new PutAtsConnectionIdJobIdRequest("Keyboard", "rosin"){{
                atsJob = new AtsJob(){{
                    addresses = new com.unifiedapi.unifiedto.models.shared.AtsAddress[]{{
                        add(new AtsAddress(){{}}),
                    }};
                    closedAt = OffsetDateTime.parse("2023-09-25T12:33:30.812Z");
                    compensation = new com.unifiedapi.unifiedto.models.shared.AtsCompensation[]{{
                        add(new AtsCompensation(AtsCompensationType.EQUITY){{
                            type = AtsCompensationType.STOCK_OPTIONS;
                        }}),
                    }};
                    createdAt = OffsetDateTime.parse("2023-06-27T17:12:53.112Z");
                    departments = new String[]{{
                        add("Intelligent"),
                    }};
                    description = "Total multi-tasking firmware";
                    employmentType = AtsJobEmploymentType.CONSULTANT;
                    hiringManagerIds = new String[]{{
                        add("male"),
                    }};
                    id = "<ID>";
                    languageLocale = "Home generation online";
                    name = "Bicycle empower";
                    publicJobUrls = new String[]{{
                        add("Avon"),
                    }};
                    raw = new PropertyAtsJobRaw();
                    recruiterIds = new String[]{{
                        add("installation"),
                    }};
                    remote = false;
                    status = AtsJobStatus.DRAFT;
                    updatedAt = OffsetDateTime.parse("2022-08-01T11:34:29.941Z");
                }};
            }};            

            PutAtsConnectionIdJobIdResponse res = sdk.job.putAtsConnectionIdJobId(req);

            if (res.atsJob != null) {
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
| `request`                                                                                                                              | [com.unifiedapi.unifiedto.models.operations.PutAtsConnectionIdJobIdRequest](../../models/operations/PutAtsConnectionIdJobIdRequest.md) | :heavy_check_mark:                                                                                                                     | The request object to use for the request.                                                                                             |


### Response

**[com.unifiedapi.unifiedto.models.operations.PutAtsConnectionIdJobIdResponse](../../models/operations/PutAtsConnectionIdJobIdResponse.md)**

