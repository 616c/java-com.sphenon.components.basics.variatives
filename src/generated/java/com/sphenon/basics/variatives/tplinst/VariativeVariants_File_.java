// instantiated with jti.pl from VariativeVariants
// please do not modify this file directly
package com.sphenon.basics.variatives.tplinst;

import com.sphenon.basics.variatives.*;
import java.io.File;

import com.sphenon.basics.context.*;
import com.sphenon.basics.context.classes.*;
import com.sphenon.basics.search.*;

import com.sphenon.basics.variatives.*;
import com.sphenon.basics.variatives.classes.*;

public class VariativeVariants_File_ implements Variative_File_
{
    protected java.util.Hashtable values;

    protected VariativeVariants_File_ (CallContext context) {
        this.values = new java.util.Hashtable();
    }

    static public VariativeVariants_File_ createVariativeVariants_File_ (CallContext context) {
        return new VariativeVariants_File_(context);
    }

    static public VariativeVariants_File_ create (CallContext context) {
        return new VariativeVariants_File_(context);
    }

    public void setVariant (CallContext context, String isolang, File value) {
        this.values.put(isolang, value);
    }

    public File get(CallContext context) {
        return this.get(context, null);
    }

    public class MyFinderOperations implements HumanLanguageVariantFinder.FinderOperations<File> {
        protected File result;
        public MyFinderOperations(CallContext context) {
            this.result = null;
        }
        public void addResult(CallContext context, File variant, String isolang) {
            if (variant == null) {
                variant = null;
            }
            if (this.result == null) {
                this.result = variant;
            } else {
                if (this.result == null) { this.result = variant; } /* nicht kombiniert, aber immerhin erster != null */;
            }
        }
        public File getResult(CallContext context, String isolang) {
            return this.result;
        }
        public File getExactVariant(CallContext context, String isolang) {
            return (File) values.get(isolang);
        }
    }

    public File get(CallContext context, String isolangs) {
        return HumanLanguageVariantFinder.findVariant(context, new MyFinderOperations(context), isolangs);
    }

    public File getVariant_File_ (CallContext context) {
        return this.get(context);
    }

    public File getVariant_File_ (CallContext context, VariantSelectors variant_selectors) {
        VariantSelector vs = (variant_selectors == null ? null : variant_selectors.tryGetSelector(context, com.sphenon.basics.variatives.selectors.HumanLanguage.class));
        if (vs == null) {
            return this.get(context);
        } else {
            return this.get(context, ((com.sphenon.basics.variatives.selectors.HumanLanguage) vs).getLanguage(context));
        }
    }

    public File getVariant(CallContext context) {
        return this.getVariant_File_(context);
    }

    public File getVariant(CallContext context, VariantSelectors variant_selectors) {
        return this.getVariant_File_(context, variant_selectors);
    }

    public String toString () {
        String             result = null;
        java.util.Set      entry_set = values.entrySet();
        java.util.Iterator iterator = entry_set.iterator();

        while (iterator.hasNext()) {
            java.util.Map.Entry me = (java.util.Map.Entry) iterator.next();
            if (result == null) {
                result = "[";
            } else {
                result += "|";
            }
            result += me.getKey().toString() + ":" + me.getValue().toString();
            result += "]";
        }

        return result;
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
