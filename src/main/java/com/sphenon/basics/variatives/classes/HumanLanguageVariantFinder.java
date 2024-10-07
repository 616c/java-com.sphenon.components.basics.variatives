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

public class HumanLanguageVariantFinder<T> {
    static private String default_language = "en,de";

    static public interface LanguageRetriever {
        public String getLanguage(CallContext context);
    }

    static private LanguageRetriever language_retriever = null;

    static public void setLanguageRetriever(CallContext context, LanguageRetriever new_language_retriever) {
        language_retriever = new_language_retriever;
    }

    static public String getLanguage(CallContext context) {
        return (language_retriever == null ? default_language : language_retriever.getLanguage(context));
    }

    static public interface FinderOperations<T> {
        public T      getExactVariant(CallContext context, String isolang);
        public void   addResult      (CallContext context, T variant, String isolang);
        public T      getResult      (CallContext context, String isolang);
    }

    static public abstract class StringFinderOperations implements FinderOperations<String> {
        protected String result;
        public StringFinderOperations(CallContext context) {
            this.result = null;
        }
        public void addResult(CallContext context, String string, String isolang) {
            if (string == null) { string = ""; }
            if (this.result == null) {
                this.result = string;
            } else {
                this.result += " / " + string;
            }
        }
        public String getResult(CallContext context, String isolangs) {
            return this.result;
        }
    }

    static public<T> T findVariant(CallContext context, FinderOperations<T> fo) {
        return findVariant(context, fo, null);
    }

    static public<T> T findVariant(CallContext context, FinderOperations<T> fo, String isolangs) {
        if (isolangs == null) {
            isolangs = getLanguage(context);
        }

        String[] isolangs_array = isolangs.split("\\+");

        for (String isolang_sequence : isolangs_array) {
            T part = null;
            for (String isolang : isolang_sequence.split(",")) {
                int pos = -1;
                do {
                    if (pos != -1) { isolang = isolang.substring(0,pos); }
                    part = fo.getExactVariant(context, isolang);
                } while (part == null && (pos = isolang.lastIndexOf("-")) != -1);
                if (part != null) {
                    break;
                }
            }
            fo.addResult(context, part, isolang_sequence);
        }
        return fo.getResult(context, isolangs);
    }

    static public class LanguageChecker implements FinderOperations<Boolean> {
        protected String language;
        protected boolean matches;
        public LanguageChecker(CallContext context, String language) {
            this.language = language;
            this.matches = false;
        }
        public Boolean getExactVariant(CallContext context, String isolang) {
            return (isolang != null && isolang.equals(this.language) ? true : false);
        }
        public void addResult(CallContext context, Boolean isolang_matches, String isolang) {
            if (this.matches == false && isolang_matches != null && isolang_matches == true) { this.matches = true; }
        }
        public Boolean getResult(CallContext context, String isolangs) {
            return this.matches;
        }
    }

    static public boolean matches(CallContext context, String language_to_check, String language_selector) {
        LanguageChecker lc = new LanguageChecker(context, language_to_check);
        return findVariant(context, lc, language_selector);
    }
}
