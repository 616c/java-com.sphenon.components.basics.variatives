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
import com.sphenon.basics.variatives.*;


public class StringPoolHashtable extends StringPoolAccessor {
    protected java.util.Hashtable map;

    protected StringPoolHashtable (CallContext cc) {
        map = new java.util.Hashtable();
    }

    public String getStringFromDataPool (CallContext cc, String key) {
    	return (String) this.map.get(key);
    }

    public void addStringToDataPool (CallContext cc, String key, String text) {
        this.map.put(key, text);
    }
    
    public void addEntry (CallContext cc, String id, String isolang, String text) {
    	 this.addStringToDataPool(cc, id + "/" + isolang, text);
    }
    
}
