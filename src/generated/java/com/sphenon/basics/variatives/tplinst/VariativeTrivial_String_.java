// instantiated with jti.pl from VariativeTrivial
// please do not modify this file directly
package com.sphenon.basics.variatives.tplinst;

import com.sphenon.basics.variatives.*;

import com.sphenon.basics.context.*;
import com.sphenon.basics.context.classes.*;
import com.sphenon.basics.search.*;

import com.sphenon.basics.variatives.*;

public class VariativeTrivial_String_ implements Variative_String_
{
    protected String value;

    protected VariativeTrivial_String_ (CallContext cc, String value) {
        this.value = value;
    }

    static public VariativeTrivial_String_ createVariativeTrivial_String_ (CallContext cc, String value) {
        return new VariativeTrivial_String_(cc, value);
    }

    static public VariativeTrivial_String_ create (CallContext cc, String value) {
        return new VariativeTrivial_String_(cc, value);
    }

    public String get(CallContext cc) {
        return value;
    }

    public String get(CallContext cc, String isolang) {
        return value;
    }

    public String getVariant_String_ (CallContext context) {
        return value;
    }

    public String getVariant_String_ (CallContext context, VariantSelectors variant_selectors) {
        return value;
    }

    public String getVariant(CallContext context) {
        return this.getVariant_String_(context);
    }

    public String getVariant(CallContext context, VariantSelectors variant_selectors) {
        return this.getVariant_String_(context, variant_selectors);
    }

    public String toString () {
        return "[Variative:" + value.toString() + "]";
    }

    // Searchable ----------------------------------------------------------
    public String getSearchableFullText(CallContext context) {
        return SearchText.getFullText(context, this.getVariant_String_(context));
    }
    // static protected String[] search_text_tags = { "type" };
    public String[] getSearchableTags(CallContext context) {
        return null; // search_text_tags;
    }
    public String[] getSearchableTextByTag(CallContext context, String tag) {
        // if (tag.equals("type")) {
        //     String[] result = { this.getMediaType(context) };
        //     return result;
        // } else {
            return null;
        // }
    }
    // ---------------------------------------------------------------------
}
