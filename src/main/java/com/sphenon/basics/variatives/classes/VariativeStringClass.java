package com.sphenon.basics.variatives.classes;

/****************************************************************************
  Copyright 2001-2024 Sphenon GmbH

  Licensed under the Apache License, Version 2.0 (the "License"); you may not
  use this file except in compliance with the License. You may obtain a copy
  of the License at http://www.apache.org/licenses/LICENSE-2.0

  Unless required by applicable law or agreed to in writing, software
  distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
  WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
  License for the specific language governing permissions and limitations
  under the License.
*****************************************************************************/

import com.sphenon.basics.context.*;
import com.sphenon.basics.context.classes.*;
import com.sphenon.basics.variatives.*;

public class VariativeStringClass implements VariativeString {

    protected String id;
    protected StringPool pool;

    protected VariativeStringClass (CallContext cc, String id, StringPool pool) {
        this.id = id;
        this.pool = pool;
    }

    static public VariativeStringClass createVariativeStringClass (CallContext cc, String id, StringPool pool) {
        return new VariativeStringClass(cc, id, pool);
    }

    public String get(CallContext cc) {
        return pool.getString(cc, this.id);
    }

    public String get(CallContext cc, String isolang) {
        return pool.getString(cc, this.id, isolang);
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

    public String getVariant(CallContext context) {
        return this.getVariant_String_(context);
    }

    public String getVariant(CallContext context, VariantSelectors variant_selectors) {
        return this.getVariant_String_(context, variant_selectors);
    }

    public String toString () {
        return this.get(RootContext.getFallbackCallContext());
    }
}
