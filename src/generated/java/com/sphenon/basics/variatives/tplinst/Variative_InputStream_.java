// instantiated with jti.pl from Variative
// please do not modify this file directly
package com.sphenon.basics.variatives.tplinst;

import com.sphenon.basics.variatives.*;
import java.io.InputStream;

import com.sphenon.basics.context.*;

import com.sphenon.basics.variatives.*;

public interface Variative_InputStream_
         extends Variative<InputStream>
{
    public InputStream getVariant_InputStream_ (CallContext context);
    public InputStream getVariant_InputStream_ (CallContext context, VariantSelectors variant_selectors);
}

