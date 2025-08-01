/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package to.unified.unified_java_sdk.models.shared;

import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.io.IOException;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

/**
 * <p>Wrapper class for an "open" enum. "Open" enums are those that are expected
 * to evolve (particularly with the addition of enum members over time). If an
 * open enum is used then the appearance of unexpected enum values (say in a 
 * response from an updated an API) will not bring about a runtime error thus 
 * ensuring that non-updated client versions can continue to work without error.
 *
 * <p>Note that instances are immutable and are singletons (an internal thread-safe
 * cache is maintained to ensure that). As a consequence instances created with the 
 * same value will satisfy reference equality (via {@code ==}).
 * 
 * <p>This class is intended to emulate an enum (in terms of common usage and with 
 * reference equality) but with the ability to carry unknown values. Unfortunately
 * Java does not permit the use of an instance in a switch expression but you can 
 * use the {@code asEnum()} method (after dealing with the `Optional` appropriately).
 *
 */
@JsonDeserialize(using = DbType._Deserializer.class)
@JsonSerialize(using = DbType._Serializer.class)
public class DbType {

    public static final DbType MONGODB = new DbType("mongodb");
    public static final DbType MYSQL = new DbType("mysql");
    public static final DbType POSTGRES = new DbType("postgres");
    public static final DbType MSSQL = new DbType("mssql");
    public static final DbType MARIADB = new DbType("mariadb");

    // This map will grow whenever a Color gets created with a new
    // unrecognized value (a potential memory leak if the user is not
    // careful). Keep this field lower case to avoid clashing with
    // generated member names which will always be upper cased (Java
    // convention)
    private static final Map<String, DbType> values = createValuesMap();
    private static final Map<String, DbTypeEnum> enums = createEnumsMap();

    private final String value;

    private DbType(String value) {
        this.value = value;
    }

    /**
     * Returns a DbType with the given value. For a specific value the 
     * returned object will always be a singleton so reference equality 
     * is satisfied when the values are the same.
     * 
     * @param value value to be wrapped as DbType
     */ 
    public static DbType of(String value) {
        synchronized (DbType.class) {
            return values.computeIfAbsent(value, v -> new DbType(v));
        }
    }

    public String value() {
        return value;
    }

    public Optional<DbTypeEnum> asEnum() {
        return Optional.ofNullable(enums.getOrDefault(value, null));
    }

    public boolean isKnown() {
        return asEnum().isPresent();
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        DbType other = (DbType) obj;
        return Objects.equals(value, other.value);
    }

    @Override
    public String toString() {
        return "DbType [value=" + value + "]";
    }

    // return an array just like an enum
    public static DbType[] values() {
        synchronized (DbType.class) {
            return values.values().toArray(new DbType[] {});
        }
    }

    private static final Map<String, DbType> createValuesMap() {
        Map<String, DbType> map = new LinkedHashMap<>();
        map.put("mongodb", MONGODB);
        map.put("mysql", MYSQL);
        map.put("postgres", POSTGRES);
        map.put("mssql", MSSQL);
        map.put("mariadb", MARIADB);
        return map;
    }

    private static final Map<String, DbTypeEnum> createEnumsMap() {
        Map<String, DbTypeEnum> map = new HashMap<>();
        map.put("mongodb", DbTypeEnum.MONGODB);
        map.put("mysql", DbTypeEnum.MYSQL);
        map.put("postgres", DbTypeEnum.POSTGRES);
        map.put("mssql", DbTypeEnum.MSSQL);
        map.put("mariadb", DbTypeEnum.MARIADB);
        return map;
    }
    
    @SuppressWarnings("serial")
    public static final class _Serializer extends StdSerializer<DbType> {

        protected _Serializer() {
            super(DbType.class);
        }

        @Override
        public void serialize(DbType value, JsonGenerator g, SerializerProvider provider)
                throws IOException, JsonProcessingException {
            g.writeObject(value.value);
        }
    }

    @SuppressWarnings("serial")
    public static final class _Deserializer extends StdDeserializer<DbType> {

        protected _Deserializer() {
            super(DbType.class);
        }

        @Override
        public DbType deserialize(JsonParser p, DeserializationContext ctxt)
                throws IOException, JacksonException {
            String v = p.readValueAs(new TypeReference<String>() {});
            // use the factory method to ensure we get singletons
            return DbType.of(v);
        }
    }
    
    public enum DbTypeEnum {

        MONGODB("mongodb"),
        MYSQL("mysql"),
        POSTGRES("postgres"),
        MSSQL("mssql"),
        MARIADB("mariadb"),;

        private final String value;

        private DbTypeEnum(String value) {
            this.value = value;
        }

        public String value() {
            return value;
        }
    }
}

