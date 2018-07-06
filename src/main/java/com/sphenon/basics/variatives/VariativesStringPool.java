package com.sphenon.basics.variatives;

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
import com.sphenon.basics.variatives.classes.*;

public class VariativesStringPool extends StringPoolClass {
    static protected VariativesStringPool singleton = null;

    static public VariativesStringPool getSingleton (CallContext cc) {
        if (singleton == null) {
            singleton = new VariativesStringPool(cc);
        }
        return singleton;
    }

    static public VariativeString get(CallContext cc, String id) {
        return VariativeStringClass.createVariativeStringClass(cc, id, getSingleton(cc));
    }

    static public String get(CallContext cc, String id, String isolang) {
        return getSingleton(cc).getString(cc, id, isolang);
    }

    protected VariativesStringPool (CallContext cc) {
        super(cc);
        /*************************************************/
        /* THE FOLLOWING SECTION IS PARTIALLY GENERATED. */
        /* BE CAREFUL WHEN EDITING MANUALLY !            */
        /*                                               */
        /* See StringPool.java for explanation.          */
        /*************************************************/
        //BEGINNING-OF-STRINGS
        //X-general entries
        addEntry(cc, "x.true", "en", "true");
        addEntry(cc, "x.true", "de", "wahr");
        addEntry(cc, "x.false", "en", "false");
        addEntry(cc, "x.false", "de", "falsch");
        //P-0-com.sphenon.basics.variatives
        //F-0-0-VariantSelectorsClass.java
        addEntry(cc, "0.0.0", "en", "Found more than one instance of '%(class)' in VariantSelectors, first one of type '%(first)' is used, others are ignored");
        addEntry(cc, "0.0.0", "de", "Es wurde mehr als eine Instanz vom Typ '%(class)' in den VariantSelectors gefunden, der erste vom Typ '%(first)' wird benutzt, die anderen werden ignoriert");
        //END-OF-STRINGS
        /*************************************************/
    }
}
