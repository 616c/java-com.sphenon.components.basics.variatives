// instantiated with jti.pl from VariativeTrivial
// please do not modify this file directly
package com.sphenon.basics.variatives.tplinst;

import com.sphenon.basics.variatives.*;
import java.io.File;

import com.sphenon.basics.context.*;
import com.sphenon.basics.context.classes.*;
import com.sphenon.basics.search.*;

import com.sphenon.basics.variatives.*;

public class VariativeTrivial_File_ implements Variative_File_
{
    protected File value;

    protected VariativeTrivial_File_ (CallContext cc, File value) {
        this.value = value;
    }

    static public VariativeTrivial_File_ createVariativeTrivial_File_ (CallContext cc, File value) {
        return new VariativeTrivial_File_(cc, value);
    }

    static public VariativeTrivial_File_ create (CallContext cc, File value) {
        return new VariativeTrivial_File_(cc, value);
    }

    public File get(CallContext cc) {
        return value;
    }

    public File get(CallContext cc, String isolang) {
        return value;
    }

    public File getVariant_File_ (CallContext context) {
        return value;
    }

    public File getVariant_File_ (CallContext context, VariantSelectors variant_selectors) {
        return value;
    }

    public File getVariant(CallContext context) {
        return this.getVariant_File_(context);
    }

    public File getVariant(CallContext context, VariantSelectors variant_selectors) {
        return this.getVariant_File_(context, variant_selectors);
    }

    public String toString () {
        return "[Variative:" + value.toString() + "]";
    }

    // Searchable ----------------------------------------------------------
    public String getSearchableFullText(CallContext context) {
        return SearchText.getFullText(context, this.getVariant_File_(context));
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
