package com.sphenon.basics.variatives.selectors.classes;

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
import com.sphenon.basics.variatives.*;
import com.sphenon.basics.variatives.selectors.*;

public class HumanLanguageClass implements HumanLanguage {
    private String language;
    static private String id = "hl";

    static public HumanLanguageClass tryCreate(CallContext context, String id_arg, String language) {
        if (id.equals(id_arg)) { return new HumanLanguageClass (context, language); }
        return null;
    }

    public HumanLanguageClass (CallContext context, String language) {
        this.language = language;
    }

    public String getLanguage(CallContext context) {
        return this.language;
    }

    public void setLanguage(CallContext context, String language) {
        this.language = language;
    }

    public String toString() {
        return this.language;
    }

    public String toString(CallContext context) {
        return id + ":" + this.language;
    }
}
