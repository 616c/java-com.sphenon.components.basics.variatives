package com.sphenon.basics.variatives.factories;

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
import com.sphenon.basics.variatives.classes.*;

public class Factory_VariativeString {

    protected String id;
    protected StringPool pool;

    public void setId(CallContext context, String id) {
        this.id = id;
    }

    public void setPool(CallContext context, StringPool pool) {
        this.pool = pool;
    }

    public VariativeString create (CallContext context) {
        return VariativeStringClass.createVariativeStringClass(context, id, pool);
    }
}
