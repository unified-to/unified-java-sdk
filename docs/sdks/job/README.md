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
                .setSecurity(new Security("Facilitator") {{
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
                .setSecurity(new Security("process") {{
                    jwt = "";
                }})
                .build();

            GetAtsConnectionIdJobRequest req = new GetAtsConnectionIdJobRequest("Harbor") {{
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
                .setSecurity(new Security("plum") {{
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
                .setSecurity(new Security("Soap") {{
                    jwt = "";
                }})
                .build();

            PatchAtsConnectionIdJobIdRequest req = new PatchAtsConnectionIdJobIdRequest("jaunty", "leach") {{
                atsJob = new AtsJob() {{
                    addresses = new com.unifiedapi.unifiedto.models.shared.AtsAddress[]{{
                        add(new AtsAddress() {{
                            address1 = "Planner redundant";
                            address2 = "tempore";
                            city = "Euless";
                            country = "Chad";
                            countryCode = "NU";
                            postalCode = "22603";
                            region = "Cambridgeshire";
                            regionCode = "Account Copernicium at";
                        }}),
                    }};
                    closedAt = OffsetDateTime.parse("2023-01-02T09:14:26.844Z");
                    compensation = new com.unifiedapi.unifiedto.models.shared.AtsCompensation[]{{
                        add(new AtsCompensation(AtsCompensationType.STOCK_OPTIONS) {{
                            currency = "Metical";
                            frequency = AtsCompensationFrequency.HOUR;
                            max = 1424.24d;
                            min = 3626.17d;
                            type = AtsCompensationType.SALARY;
                        }}),
                    }};
                    createdAt = OffsetDateTime.parse("2021-07-23T21:10:49.249Z");
                    departments = new String[]{{
                        add("Hatchback"),
                    }};
                    description = "Customer-focused bifurcated flexibility";
                    employmentType = AtsJobEmploymentType.VOLUNTEER;
                    hiringManagerIds = new String[]{{
                        add("fuga"),
                    }};
                    id = "<ID>";
                    languageLocale = "hence gracefully invoice";
                    name = "Southeast vacantly Uranium";
                    publicJobUrls = new String[]{{
                        add("Keith"),
                    }};
                    raw = new PropertyAtsJobRaw();;
                    recruiterIds = new String[]{{
                        add("happily"),
                    }};
                    remote = false;
                    status = AtsJobStatus.OPEN;
                    updatedAt = OffsetDateTime.parse("2023-08-04T07:33:03.088Z");
                }};;
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
                .setSecurity(new Security("Niger") {{
                    jwt = "";
                }})
                .build();

            PostAtsConnectionIdJobRequest req = new PostAtsConnectionIdJobRequest("Gasoline") {{
                atsJob = new AtsJob() {{
                    addresses = new com.unifiedapi.unifiedto.models.shared.AtsAddress[]{{
                        add(new AtsAddress() {{
                            address1 = "shiny yellow upwardly";
                            address2 = "Diesel virtual";
                            city = "Arlington";
                            country = "Gambia";
                            countryCode = "PT";
                            postalCode = "07814";
                            region = "unknown eaque athwart";
                            regionCode = "architectures protocol";
                        }}),
                    }};
                    closedAt = OffsetDateTime.parse("2023-03-01T04:59:12.553Z");
                    compensation = new com.unifiedapi.unifiedto.models.shared.AtsCompensation[]{{
                        add(new AtsCompensation(AtsCompensationType.STOCK_OPTIONS) {{
                            currency = "Bahraini Dinar";
                            frequency = AtsCompensationFrequency.MONTH;
                            max = 7040.68d;
                            min = 6740.24d;
                            type = AtsCompensationType.BONUS;
                        }}),
                    }};
                    createdAt = OffsetDateTime.parse("2022-01-31T22:52:23.593Z");
                    departments = new String[]{{
                        add("itaque"),
                    }};
                    description = "Organized well-modulated projection";
                    employmentType = AtsJobEmploymentType.FREELANCE;
                    hiringManagerIds = new String[]{{
                        add("architecture"),
                    }};
                    id = "<ID>";
                    languageLocale = "because harbor";
                    name = "Jarrod rerum empowering";
                    publicJobUrls = new String[]{{
                        add("Fiat"),
                    }};
                    raw = new PropertyAtsJobRaw();;
                    recruiterIds = new String[]{{
                        add("Innovative"),
                    }};
                    remote = false;
                    status = AtsJobStatus.PENDING;
                    updatedAt = OffsetDateTime.parse("2022-12-29T22:11:42.825Z");
                }};;
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
                .setSecurity(new Security("invoice") {{
                    jwt = "";
                }})
                .build();

            PutAtsConnectionIdJobIdRequest req = new PutAtsConnectionIdJobIdRequest("Keyboard", "rosin") {{
                atsJob = new AtsJob() {{
                    addresses = new com.unifiedapi.unifiedto.models.shared.AtsAddress[]{{
                        add(new AtsAddress() {{
                            address1 = "payment Dodge Outdoors";
                            address2 = "Southwest Division Coordinator";
                            city = "League City";
                            country = "Latvia";
                            countryCode = "KI";
                            postalCode = "79320-1355";
                            region = "solution embrace";
                            regionCode = "continually Keyboard";
                        }}),
                    }};
                    closedAt = OffsetDateTime.parse("2022-12-01T04:41:25.085Z");
                    compensation = new com.unifiedapi.unifiedto.models.shared.AtsCompensation[]{{
                        add(new AtsCompensation(AtsCompensationType.OTHER) {{
                            currency = "Belarusian Ruble";
                            frequency = AtsCompensationFrequency.WEEK;
                            max = 6633.85d;
                            min = 2659.56d;
                            type = AtsCompensationType.EQUITY;
                        }}),
                    }};
                    createdAt = OffsetDateTime.parse("2023-03-29T05:48:33.492Z");
                    departments = new String[]{{
                        add("Gasoline"),
                    }};
                    description = "Open-source reciprocal interface";
                    employmentType = AtsJobEmploymentType.FULL_TIME;
                    hiringManagerIds = new String[]{{
                        add("Utah"),
                    }};
                    id = "<ID>";
                    languageLocale = "clamber West";
                    name = "Supervisor North Security";
                    publicJobUrls = new String[]{{
                        add("Meridian"),
                    }};
                    raw = new PropertyAtsJobRaw();;
                    recruiterIds = new String[]{{
                        add("Handmade"),
                    }};
                    remote = false;
                    status = AtsJobStatus.DRAFT;
                    updatedAt = OffsetDateTime.parse("2023-03-24T08:00:25.046Z");
                }};;
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

