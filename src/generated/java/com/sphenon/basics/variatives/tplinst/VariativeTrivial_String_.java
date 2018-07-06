// instantiated with jti.pl from VariativeTrivial

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
