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
import com.sphenon.basics.variatives.*;

/** {@EntitySecurityClass User}

    @doclet {@Category Definition} {@SecurityClass User} {@Maturity Final}

    Base class for string pools, i.e. a repository of variative messages,
    i.e. provided in several variants, typically languages.

    In other words, a multilingual string repository.

    @doclet {@Category Implementation} {@SecurityClass Development} {@Maturity Final}

    Language abbreviations are according to common practice:
    <itemizedlist>
      <listitem><para><ulink url="http://www.faqs.org/rfcs/rfc1766.html">RFC 1766 - Tags for the Identification of Languages</ulink></para></listitem>
      <listitem><para><ulink url="http://www.faqs.org/rfcs/bcp/bcp47.html">BCP 47 - Tags for the Identification of Languages</ulink></para></listitem>
      <listitem><para><ulink url="http://www.loc.gov/standards/iso639-2">ISO 639 - Codes for the Representation of Names of Languages</ulink></para></listitem>
      <listitem><para><ulink url="http://www.iso.org/mara/iso3166">ISO 3166 - Country codes</ulink></para></listitem>
    </itemizedlist>

    There are some cached copies of the standards available.
    The copies were obtained in May 2002.

    Default language is english ("en", german is "de").

    The StringPool entry format is well suited for translation purposes
    and it is easily maintainable during development with a little emacs
    helper macro. The architecture and syntax supports modularised
    development.

    The macro calculates automatically the message ids, opens a window for
    editing the meesage, and inserts it into the code.

    The format is as follows (in case you want to edit manually or cannot
    use the macro):

    <literallayout format="linespecific" class="normal">
      //BEGINNING-OF-STRINGS
      //END-OF-STRINGS
               marks section which is edited by the macro

      //P-<packageid>-<packagename>
               marks beginning of entries for a package

      //F-<packageid>-<fileid>-<filename>
              marks beginning of entries for a file
              must be within respective package section

      addEntry(cc, "<msgid>", "<langid>", "<message>");
              adds <message> to pool
              msgid is <packageid>-<fileid>-msg<id>
              langid is according to BCP 47
    </literallayout></para>

    Ids are used sequentially, i.e. a newly inserted package is
    last-package-id + 1, same for file and message ids.
*/
public abstract class StringPoolAccessor implements StringPool {

    static public String getLanguage(CallContext context) {
        return HumanLanguageVariantFinder.getLanguage(context);
    }

    public VariativeString getVariativeString(CallContext cc, String id) {
        return VariativeStringClass.createVariativeStringClass(cc, id, this);
    }

    public String getString(CallContext context, String id) {
        String result = this.getString(context, id, null);
        return result;
    }

    public class MyStringFinderOperations extends HumanLanguageVariantFinder.StringFinderOperations {
        protected String string_id;
        public MyStringFinderOperations(CallContext context, String string_id) {
            super(context);
            this.string_id = string_id;
        }
        public String getExactVariant(CallContext context, String isolang) {
            if (isolang.equals("*debug*")) {
                return "[" + this.string_id + "-" + StringPoolAccessor.this.getPoolId(context) + "]";
            }
            return StringPoolAccessor.this.getStringFromDataPool(context, this.string_id + "/" + isolang);
        }
    }

    public String getString(CallContext context, String id, String isolangs) {
        return HumanLanguageVariantFinder.findVariant(context, new MyStringFinderOperations(context, id), isolangs);
    }

    static protected boolean ignore_missing_entries = false;

    static public boolean getIgnoreMissingEntries (CallContext context) {
        return ignore_missing_entries;
    }

    static public void setIgnoreMissingEntries (CallContext context, boolean ime) {
        ignore_missing_entries = ime;
    }

    public abstract String getStringFromDataPool (CallContext cc, String key);

    protected String getPoolId (CallContext cc) {
        return this.getClass().toString().replaceFirst("^.*\\.","").replaceFirst("StringPool$","");
    }
}
