// instantiated with jti.pl from Variative
// please do not modify this file directly
package com.sphenon.basics.variatives.tplinst;

import com.sphenon.basics.variatives.*;
import java.io.File;

import com.sphenon.basics.context.*;

import com.sphenon.basics.variatives.*;

public interface Variative_File_
         extends Variative<File>
{
    public File getVariant_File_ (CallContext context);
    public File getVariant_File_ (CallContext context, VariantSelectors variant_selectors);
}

