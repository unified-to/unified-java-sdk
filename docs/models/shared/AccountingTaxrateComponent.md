# AccountingTaxrateComponent


## Fields

| Field                                                              | Type                                                               | Required                                                           | Description                                                        |
| ------------------------------------------------------------------ | ------------------------------------------------------------------ | ------------------------------------------------------------------ | ------------------------------------------------------------------ |
| `isCompound`                                                       | *Optional\<Boolean>*                                               | :heavy_minus_sign:                                                 | True when this component is charged on top of the other components |
| `name`                                                             | *Optional\<String>*                                                | :heavy_minus_sign:                                                 | Name of the tax component, e.g. GST or PST                         |
| `rate`                                                             | *Optional\<Double>*                                                | :heavy_minus_sign:                                                 | Rate of this component, in %                                       |