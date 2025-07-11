/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package to.unified.unified_java_sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Double;
import java.lang.Override;
import java.lang.String;
import java.util.Optional;
import to.unified.unified_java_sdk.utils.Utils;


public class CommerceItemPrice {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("compare_at_price")
    private Optional<Double> compareAtPrice;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("currency")
    private Optional<String> currency;


    @JsonProperty("price")
    private double price;

    @JsonCreator
    public CommerceItemPrice(
            @JsonProperty("compare_at_price") Optional<Double> compareAtPrice,
            @JsonProperty("currency") Optional<String> currency,
            @JsonProperty("price") double price) {
        Utils.checkNotNull(compareAtPrice, "compareAtPrice");
        Utils.checkNotNull(currency, "currency");
        Utils.checkNotNull(price, "price");
        this.compareAtPrice = compareAtPrice;
        this.currency = currency;
        this.price = price;
    }
    
    public CommerceItemPrice(
            double price) {
        this(Optional.empty(), Optional.empty(), price);
    }

    @JsonIgnore
    public Optional<Double> compareAtPrice() {
        return compareAtPrice;
    }

    @JsonIgnore
    public Optional<String> currency() {
        return currency;
    }

    @JsonIgnore
    public double price() {
        return price;
    }

    public static Builder builder() {
        return new Builder();
    }


    public CommerceItemPrice withCompareAtPrice(double compareAtPrice) {
        Utils.checkNotNull(compareAtPrice, "compareAtPrice");
        this.compareAtPrice = Optional.ofNullable(compareAtPrice);
        return this;
    }


    public CommerceItemPrice withCompareAtPrice(Optional<Double> compareAtPrice) {
        Utils.checkNotNull(compareAtPrice, "compareAtPrice");
        this.compareAtPrice = compareAtPrice;
        return this;
    }

    public CommerceItemPrice withCurrency(String currency) {
        Utils.checkNotNull(currency, "currency");
        this.currency = Optional.ofNullable(currency);
        return this;
    }


    public CommerceItemPrice withCurrency(Optional<String> currency) {
        Utils.checkNotNull(currency, "currency");
        this.currency = currency;
        return this;
    }

    public CommerceItemPrice withPrice(double price) {
        Utils.checkNotNull(price, "price");
        this.price = price;
        return this;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CommerceItemPrice other = (CommerceItemPrice) o;
        return 
            Utils.enhancedDeepEquals(this.compareAtPrice, other.compareAtPrice) &&
            Utils.enhancedDeepEquals(this.currency, other.currency) &&
            Utils.enhancedDeepEquals(this.price, other.price);
    }
    
    @Override
    public int hashCode() {
        return Utils.enhancedHash(
            compareAtPrice, currency, price);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CommerceItemPrice.class,
                "compareAtPrice", compareAtPrice,
                "currency", currency,
                "price", price);
    }

    @SuppressWarnings("UnusedReturnValue")
    public final static class Builder {

        private Optional<Double> compareAtPrice = Optional.empty();

        private Optional<String> currency = Optional.empty();

        private Double price;

        private Builder() {
          // force use of static builder() method
        }


        public Builder compareAtPrice(double compareAtPrice) {
            Utils.checkNotNull(compareAtPrice, "compareAtPrice");
            this.compareAtPrice = Optional.ofNullable(compareAtPrice);
            return this;
        }

        public Builder compareAtPrice(Optional<Double> compareAtPrice) {
            Utils.checkNotNull(compareAtPrice, "compareAtPrice");
            this.compareAtPrice = compareAtPrice;
            return this;
        }


        public Builder currency(String currency) {
            Utils.checkNotNull(currency, "currency");
            this.currency = Optional.ofNullable(currency);
            return this;
        }

        public Builder currency(Optional<String> currency) {
            Utils.checkNotNull(currency, "currency");
            this.currency = currency;
            return this;
        }


        public Builder price(double price) {
            Utils.checkNotNull(price, "price");
            this.price = price;
            return this;
        }

        public CommerceItemPrice build() {

            return new CommerceItemPrice(
                compareAtPrice, currency, price);
        }

    }
}
