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
import com.sphenon.basics.variatives.tplinst.*;

public class VariativeStringConcatenation implements Variative_String_ {

    protected Variative_String_[] parts;

    protected VariativeStringConcatenation (CallContext context, Variative_String_[] parts) {
        this.parts = parts;
    }

    static public VariativeStringConcatenation create (CallContext context, String part1) {
        return new VariativeStringConcatenation(context, new Variative_String_[] { VariativeStringTrivial.create(context, part1) });
    }

    static public VariativeStringConcatenation create (CallContext context, Variative_String_ part1) {
        return new VariativeStringConcatenation(context, new Variative_String_[] { part1 });
    }

    static public VariativeStringConcatenation create (CallContext context, String part1, String part2) {
        return new VariativeStringConcatenation(context, new Variative_String_[] { VariativeStringTrivial.create(context, part1), VariativeStringTrivial.create(context, part2) });
    }

    static public VariativeStringConcatenation create (CallContext context, Variative_String_ part1, String part2) {
        return new VariativeStringConcatenation(context, new Variative_String_[] { part1, VariativeStringTrivial.create(context, part2) });
    }

    static public VariativeStringConcatenation create (CallContext context, String part1, Variative_String_ part2) {
        return new VariativeStringConcatenation(context, new Variative_String_[] { VariativeStringTrivial.create(context, part1), part2 });
    }

    static public VariativeStringConcatenation create (CallContext context, Variative_String_ part1, Variative_String_ part2) {
        return new VariativeStringConcatenation(context, new Variative_String_[] { part1, part2 });
    }

    static public VariativeStringConcatenation create (CallContext context, String part1, String part2, String part3) {
        return new VariativeStringConcatenation(context, new Variative_String_[] { VariativeStringTrivial.create(context, part1), VariativeStringTrivial.create(context, part2), VariativeStringTrivial.create(context, part3) });
    }

    static public VariativeStringConcatenation create (CallContext context, Variative_String_ part1, String part2, String part3) {
        return new VariativeStringConcatenation(context, new Variative_String_[] { part1, VariativeStringTrivial.create(context, part2), VariativeStringTrivial.create(context, part3) });
    }

    static public VariativeStringConcatenation create (CallContext context, String part1, Variative_String_ part2, String part3) {
        return new VariativeStringConcatenation(context, new Variative_String_[] { VariativeStringTrivial.create(context, part1), part2, VariativeStringTrivial.create(context, part3) });
    }

    static public VariativeStringConcatenation create (CallContext context, Variative_String_ part1, Variative_String_ part2, String part3) {
        return new VariativeStringConcatenation(context, new Variative_String_[] { part1, part2, VariativeStringTrivial.create(context, part3) });
    }

    static public VariativeStringConcatenation create (CallContext context, String part1, String part2, Variative_String_ part3) {
        return new VariativeStringConcatenation(context, new Variative_String_[] { VariativeStringTrivial.create(context, part1), VariativeStringTrivial.create(context, part2), part3 });
    }

    static public VariativeStringConcatenation create (CallContext context, Variative_String_ part1, String part2, Variative_String_ part3) {
        return new VariativeStringConcatenation(context, new Variative_String_[] { part1, VariativeStringTrivial.create(context, part2), part3 });
    }

    static public VariativeStringConcatenation create (CallContext context, String part1, Variative_String_ part2, Variative_String_ part3) {
        return new VariativeStringConcatenation(context, new Variative_String_[] { VariativeStringTrivial.create(context, part1), part2, part3 });
    }

    static public VariativeStringConcatenation create (CallContext context, Variative_String_ part1, Variative_String_ part2, Variative_String_ part3) {
        return new VariativeStringConcatenation(context, new Variative_String_[] { part1, part2, part3 });
    }

    static public VariativeStringConcatenation create (CallContext context, String part1, String part2, String part3, String part4) {
        return new VariativeStringConcatenation(context, new Variative_String_[] { VariativeStringTrivial.create(context, part1), VariativeStringTrivial.create(context, part2), VariativeStringTrivial.create(context, part3), VariativeStringTrivial.create(context, part4) });
    }

    static public VariativeStringConcatenation create (CallContext context, Variative_String_ part1, String part2, String part3, String part4) {
        return new VariativeStringConcatenation(context, new Variative_String_[] { part1, VariativeStringTrivial.create(context, part2), VariativeStringTrivial.create(context, part3), VariativeStringTrivial.create(context, part4) });
    }

    static public VariativeStringConcatenation create (CallContext context, String part1, Variative_String_ part2, String part3, String part4) {
        return new VariativeStringConcatenation(context, new Variative_String_[] { VariativeStringTrivial.create(context, part1), part2, VariativeStringTrivial.create(context, part3), VariativeStringTrivial.create(context, part4) });
    }

    static public VariativeStringConcatenation create (CallContext context, Variative_String_ part1, Variative_String_ part2, String part3, String part4) {
        return new VariativeStringConcatenation(context, new Variative_String_[] { part1, part2, VariativeStringTrivial.create(context, part3), VariativeStringTrivial.create(context, part4) });
    }

    static public VariativeStringConcatenation create (CallContext context, String part1, String part2, Variative_String_ part3, String part4) {
        return new VariativeStringConcatenation(context, new Variative_String_[] { VariativeStringTrivial.create(context, part1), VariativeStringTrivial.create(context, part2), part3, VariativeStringTrivial.create(context, part4) });
    }

    static public VariativeStringConcatenation create (CallContext context, Variative_String_ part1, String part2, Variative_String_ part3, String part4) {
        return new VariativeStringConcatenation(context, new Variative_String_[] { part1, VariativeStringTrivial.create(context, part2), part3, VariativeStringTrivial.create(context, part4) });
    }

    static public VariativeStringConcatenation create (CallContext context, String part1, Variative_String_ part2, Variative_String_ part3, String part4) {
        return new VariativeStringConcatenation(context, new Variative_String_[] { VariativeStringTrivial.create(context, part1), part2, part3, VariativeStringTrivial.create(context, part4) });
    }

    static public VariativeStringConcatenation create (CallContext context, Variative_String_ part1, Variative_String_ part2, Variative_String_ part3, String part4) {
        return new VariativeStringConcatenation(context, new Variative_String_[] { part1, part2, part3, VariativeStringTrivial.create(context, part4) });
    }

    static public VariativeStringConcatenation create (CallContext context, String part1, String part2, String part3, Variative_String_ part4) {
        return new VariativeStringConcatenation(context, new Variative_String_[] { VariativeStringTrivial.create(context, part1), VariativeStringTrivial.create(context, part2), VariativeStringTrivial.create(context, part3), part4 });
    }

    static public VariativeStringConcatenation create (CallContext context, Variative_String_ part1, String part2, String part3, Variative_String_ part4) {
        return new VariativeStringConcatenation(context, new Variative_String_[] { part1, VariativeStringTrivial.create(context, part2), VariativeStringTrivial.create(context, part3), part4 });
    }

    static public VariativeStringConcatenation create (CallContext context, String part1, Variative_String_ part2, String part3, Variative_String_ part4) {
        return new VariativeStringConcatenation(context, new Variative_String_[] { VariativeStringTrivial.create(context, part1), part2, VariativeStringTrivial.create(context, part3), part4 });
    }

    static public VariativeStringConcatenation create (CallContext context, Variative_String_ part1, Variative_String_ part2, String part3, Variative_String_ part4) {
        return new VariativeStringConcatenation(context, new Variative_String_[] { part1, part2, VariativeStringTrivial.create(context, part3), part4 });
    }

    static public VariativeStringConcatenation create (CallContext context, String part1, String part2, Variative_String_ part3, Variative_String_ part4) {
        return new VariativeStringConcatenation(context, new Variative_String_[] { VariativeStringTrivial.create(context, part1), VariativeStringTrivial.create(context, part2), part3, part4 });
    }

    static public VariativeStringConcatenation create (CallContext context, Variative_String_ part1, String part2, Variative_String_ part3, Variative_String_ part4) {
        return new VariativeStringConcatenation(context, new Variative_String_[] { part1, VariativeStringTrivial.create(context, part2), part3, part4 });
    }

    static public VariativeStringConcatenation create (CallContext context, String part1, Variative_String_ part2, Variative_String_ part3, Variative_String_ part4) {
        return new VariativeStringConcatenation(context, new Variative_String_[] { VariativeStringTrivial.create(context, part1), part2, part3, part4 });
    }

    static public VariativeStringConcatenation create (CallContext context, Variative_String_ part1, Variative_String_ part2, Variative_String_ part3, Variative_String_ part4) {
        return new VariativeStringConcatenation(context, new Variative_String_[] { part1, part2, part3, part4 });
    }

    public String getVariant_String_ (CallContext context) {
        String result = "";
        for (int i=0; i<parts.length; i++) {
            result += parts[i].getVariant_String_(context);
        }
        return result;
    }

    public String getVariant_String_ (CallContext context, VariantSelectors variant_selectors) {
        String result = "";
        for (int i=0; i<parts.length; i++) {
            result += parts[i].getVariant_String_(context, variant_selectors);
        }
        return result;
    }

    public String toString () {
        return this.getVariant_String_(RootContext.getFallbackCallContext());
    }
}
