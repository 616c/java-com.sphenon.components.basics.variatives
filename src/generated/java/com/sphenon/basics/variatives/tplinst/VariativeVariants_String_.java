// instantiated with jti.pl from VariativeVariants

/****************************************************************************
  Copyright 2001-2018 Sphenon GmbH

  Licensed under the Apache License, Version 2.0 (the "License"); you may not
  use this file except in compliance with the License. You may obtain a copy
  of the License at http://www.apache.org/licenses/LICENSE-2.0

  Unless required by applicable law or agreed to in writing, software
  distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
  WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
  License for the specific language governing permissions and limitations
  under the License.
*****************************************************************************/
// please do not modify this file directly
package com.sphenon.basics.variatives.tplinst;

import com.sphenon.basics.variatives.*;

import com.sphenon.basics.context.*;
import com.sphenon.basics.context.classes.*;
import com.sphenon.basics.search.*;

import com.sphenon.basics.variatives.*;
import com.sphenon.basics.variatives.classes.*;

public class VariativeVariants_String_ implements Variative_String_
{
    protected java.util.Hashtable values;

    protected VariativeVariants_String_ (CallContext context) {
        this.values = new java.util.Hashtable();
    }

    static public VariativeVariants_String_ createVariativeVariants_String_ (CallContext context) {
        return new VariativeVariants_String_(context);
    }

    static public VariativeVariants_String_ create (CallContext context) {
        return new VariativeVariants_String_(context);
    }

    public void setVariant (CallContext context, String isolang, String value) {
        this.values.put(isolang, value);
    }

    public String get(CallContext context) {
        return this.get(context, null);
    }

    public class MyFinderOperations implements HumanLanguageVariantFinder.FinderOperations<String> {
        protected String result;
        public MyFinderOperations(CallContext context) {
            this.result = null;
        }
        public void addResult(CallContext context, String variant, String isolang) {
            if (variant == null) {
                variant = "---";
            }
            if (this.result == null) {
                this.result = variant;
            } else {
                this.result += " / " + variant;
            }
        }
        public String getResult(CallContext context, String isolang) {
            return this.result;
        }
        public String getExactVariant(CallContext context, String isolang) {
            return (String) values.get(isolang);
        }
    }

    public String get(CallContext context, String isolangs) {
        return HumanLanguageVariantFinder.findVariant(context, new MyFinderOperations(context), isolangs);
    }

    public String getVariant_String_ (CallContext context) {
        return this.get(context);
    }

    public String getVariant_String_ (CallContext context, VariantSelectors variant_selectors) {
        VariantSelector vs = (variant_selectors == null ? null : variant_selectors.tryGetSelector(context, com.sphenon.basics.variatives.selectors.HumanLanguage.class));
        if (vs == null) {
            return this.get(context);
        } else {
            return this.get(context, ((com.sphenon.basics.variatives.selectors.HumanLanguage) vs).getLanguage(context));
        }
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
