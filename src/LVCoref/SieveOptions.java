/*******************************************************************************
 * Copyright 2013,2014 Institute of Mathematics and Computer Science, University of Latvia
 * Author: Artūrs Znotiņš
 * 
 *     This program is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 * 
 *     This program is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 * 
 *     You should have received a copy of the GNU General Public License
 *     along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *******************************************************************************/
package LVCoref;

public class SieveOptions {
  public boolean DO_PRONOUN;
  public boolean USE_iwithini;
  public boolean USE_APPOSITION;
  public boolean USE_PREDICATENOMINATIVES;
  public boolean USE_ACRONYM;
  public boolean USE_RELATIVEPRONOUN;
  public boolean USE_ROLEAPPOSITION;    
  public boolean USE_EXACTSTRINGMATCH;
  public boolean USE_INCLUSION_HEADMATCH;
  public boolean USE_RELAXED_HEADMATCH;
  public boolean USE_INCOMPATIBLE_MODIFIER;
  public boolean USE_DEMONYM;
  public boolean USE_WORDS_INCLUSION;
  public boolean USE_ROLE_SKIP;
  public boolean USE_RELAXED_EXACTSTRINGMATCH;
  public boolean USE_ATTRIBUTES_AGREE;
  public boolean USE_WN_HYPERNYM;
  public boolean USE_WN_SYNONYM;
  public boolean USE_DIFFERENT_LOCATION;
  public boolean USE_NUMBER_IN_MENTION;
  public boolean USE_PROPERHEAD_AT_LAST;
  public boolean USE_ALIAS;
  public boolean USE_SLOT_MATCH;
  public boolean USE_DISCOURSEMATCH;
  public boolean REMOVE_NESTED_MENTIONS;
  public boolean REMOVE_SINGLETONS;
  public boolean REMOVE_TMP_MENTIONS;
  public boolean USE_NAIVE_MATCH;
  
  public String toString() {
    StringBuilder os = new StringBuilder();
    os.append("{");
    if(DO_PRONOUN) os.append("DO_PRONOUN");
    if(USE_iwithini) os.append(", USE_iwithini");
    if(USE_APPOSITION) os.append(", USE_APPOSITION");
    if(USE_PREDICATENOMINATIVES) os.append(", USE_PREDICATENOMINATIVES");
    if(USE_ACRONYM) os.append(", USE_ACRONYM");
    if(USE_RELATIVEPRONOUN) os.append(", USE_RELATIVEPRONOUN");
    if(USE_ROLEAPPOSITION) os.append(", USE_ROLEAPPOSITION");
    if(USE_EXACTSTRINGMATCH) os.append(", USE_EXACTSTRINGMATCH");
    if(USE_INCLUSION_HEADMATCH) os.append(", USE_INCLUSION_HEADMATCH");
    if(USE_RELAXED_HEADMATCH) os.append(", USE_RELAXED_HEADMATCH");
    if(USE_INCOMPATIBLE_MODIFIER) os.append(", USE_INCOMPATIBLE_MODIFIER");
    if(USE_DEMONYM) os.append(", USE_DEMONYM");
    if(USE_WORDS_INCLUSION) os.append(", USE_WORDS_INCLUSION");
    if(USE_ROLE_SKIP) os.append(", USE_ROLE_SKIP");
    if(USE_RELAXED_EXACTSTRINGMATCH) os.append(", USE_RELAXED_EXACTSTRINGMATCH");
    if(USE_ATTRIBUTES_AGREE) os.append(", USE_ATTRIBUTES_AGREE");
    if(USE_WN_HYPERNYM) os.append(", USE_WN_HYPERNYM");
    if(USE_WN_SYNONYM) os.append(", USE_WN_SYNONYM");
    if(USE_DIFFERENT_LOCATION) os.append(", USE_DIFFERENT_LOCATION");
    if(USE_NUMBER_IN_MENTION) os.append(", USE_NUMBER_IN_MENTION");
    if(USE_PROPERHEAD_AT_LAST) os.append(", USE_PROPERHEAD_AT_LAST");
    if(USE_ALIAS) os.append(", USE_ALIAS");
    if(USE_SLOT_MATCH) os.append(", USE_SLOT_MATCH");
    if(USE_DISCOURSEMATCH) os.append(", USE_DISCOURSEMATCH");
    if (REMOVE_NESTED_MENTIONS) os.append(", REMOVE_NESTED_MENTIONS");
    if (REMOVE_SINGLETONS) os.append(", REMOVE_SINGLETONS");
    if (REMOVE_TMP_MENTIONS) os.append(", REMOVE_TMP_MENTIONS");
    if (USE_NAIVE_MATCH) os.append(", USE_NAIVE_MATCH");
    os.append("}");
    return os.toString();
  }
  
  public SieveOptions() {
    DO_PRONOUN= false;
    USE_iwithini = false;
    USE_APPOSITION = false;
    USE_PREDICATENOMINATIVES = false;
    USE_ACRONYM = false;
    USE_RELATIVEPRONOUN = false;
    USE_ROLEAPPOSITION = false;    
    USE_EXACTSTRINGMATCH = false;
    USE_INCLUSION_HEADMATCH = false;
    USE_RELAXED_HEADMATCH = false;
    USE_INCOMPATIBLE_MODIFIER = false;
    USE_DEMONYM = false;
    USE_WORDS_INCLUSION = false;
    USE_ROLE_SKIP = false;
    USE_RELAXED_EXACTSTRINGMATCH = false;
    USE_ATTRIBUTES_AGREE = false;
    USE_WN_HYPERNYM = false;
    USE_WN_SYNONYM = false;
    USE_DIFFERENT_LOCATION = false;
    USE_NUMBER_IN_MENTION = false;
    USE_PROPERHEAD_AT_LAST = false;
    USE_ALIAS = false;
    USE_SLOT_MATCH = false;
    USE_DISCOURSEMATCH = false;
    REMOVE_NESTED_MENTIONS = false;
    REMOVE_SINGLETONS = false;
    REMOVE_TMP_MENTIONS = false;
    USE_NAIVE_MATCH = false;
  }
}
