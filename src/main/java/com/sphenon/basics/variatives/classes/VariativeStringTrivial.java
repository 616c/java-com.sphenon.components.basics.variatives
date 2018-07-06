package com.sphenon.basics.variatives.classes;

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

import com.sphenon.basics.context.*;
import com.sphenon.basics.context.classes.*;
import com.sphenon.basics.variatives.*;
import com.sphenon.basics.util.*;

public class VariativeStringTrivial implements VariativeString {

    protected String text;

    protected VariativeStringTrivial (CallContext cc, String text) {
        this.text = text;
    }

    static public VariativeStringTrivial createVariativeStringTrivial (CallContext cc, String text) {
        return new VariativeStringTrivial(cc, text);
    }

    static public VariativeStringTrivial create (CallContext cc, String text) {
        return new VariativeStringTrivial(cc, text);
    }

    public String get(CallContext cc) {
        return text;
    }

    public String get(CallContext cc, String isolang) {
        return text;
    }

    public String getVariant_String_ (CallContext context) {
        return text;
    }

    public String getVariant_String_ (CallContext context, VariantSelectors variant_selectors) {
        return text;
    }

    public String toString () {
        return text;
    }

    static protected class VSTEmpty extends VariativeStringTrivial implements Empty {
        public VSTEmpty(CallContext context) {
            super(context, "");
        }
    }
    static protected VSTEmpty empty;
    static public VariativeStringTrivial getEmpty(CallContext context) {
        if (empty == null) {
            empty = new VSTEmpty(context);
        }
        return empty;
    }
}
