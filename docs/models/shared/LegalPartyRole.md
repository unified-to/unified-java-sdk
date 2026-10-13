# LegalPartyRole

the party role on the matter

## Example Usage

```java
import to.unified.unified_java_sdk.models.shared.LegalPartyRole;

LegalPartyRole value = LegalPartyRole.CLIENT;

// Open enum: use .of() to create instances from custom string values
LegalPartyRole custom = LegalPartyRole.of("custom_value");
```


## Values

| Name               | Value              |
| ------------------ | ------------------ |
| `CLIENT`           | CLIENT             |
| `OPPOSING_PARTY`   | OPPOSING_PARTY     |
| `OPPOSING_COUNSEL` | OPPOSING_COUNSEL   |
| `CO_COUNSEL`       | CO_COUNSEL         |
| `WITNESS`          | WITNESS            |
| `EXPERT`           | EXPERT             |
| `JUDGE`            | JUDGE              |
| `REFERRER`         | REFERRER           |
| `OTHER`            | OTHER              |