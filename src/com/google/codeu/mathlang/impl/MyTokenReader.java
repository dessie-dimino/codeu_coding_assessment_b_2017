// Copyright 2017 Google Inc.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//    http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.codeu.mathlang.impl;

import java.io.IOException;

import com.google.codeu.mathlang.core.tokens.Token;
import com.google.codeu.mathlang.parsing.TokenReader;

// MY TOKEN READER
//
// This is YOUR implementation of the token reader interface. To know how
// it should work, read src/com/google/codeu/mathlang/parsing/TokenReader.java.
// You should not need to change any other files to get your token reader to
// work with the test of the system.
public final class MyTokenReader implements TokenReader {

  public MyTokenReader(String source) {
    // Your token reader will only be given a string for input. The string will
    // contain the whole source (0 or more lines).

    //this will be where the string is taken in
    //and whitespace is removed but then it will call next?
    Pattern namesPattern = Pattern.compile("^[A-Z][a-z]+$");
    Pattern numberPattern = Pattern.compile("^[0-9]+\.[0-9]+?");
    Pattern symbolPattern = Pattern.compile("[]");
    Pattern stringPattern = Pattern.compile(".");

    Matcher nameMatcher = namesPattern.matcher(source);
    Matcher numberMatcher = numberPattern.matcher(source);
    Matcher symbolMatcher = symbolPattern.matcher(source);
    Matcher stringMatcher = stringPattern.matcher(source);


   for(int i = 1; i++; i<nameMatcher.length()){
     System.out.println(NameToken(nameMatcher.group(i)));
   }

  for(int i = 1; i++; i<numberMatcher.length()){
      System.out.println(NumberToken(NumberMatcher.group(i)));
      }

   for(int i = 1; i++; i<symbolMatcher.length()){
      System.out.println(symbolMatcher.group(i));
         }

  for(int i = 1; i++; i<stringMatcher.length()){
      System.out.println(StringToken(stringMatcher.group(i)));
        }
}

  @Override
  public Token next() throws IOException {
    // Most of your work will take place here. For every call to |next| you should
    // return a token until you reach the end. When there are no more tokens, you
    // should return |null| to signal the end of input.

    // If for any reason you detect an error in the input, you may throw an IOException
    // which will stop all execution.


    // NEXT
    //
    // Get the next token in the stream. When the end of stream has been reached
    // |next| should return |null|. The only valid tokens that can be returned are:
    //  - com.google.codeu.mathlang.core.tokens.StringToken
    //  - com.google.codeu.mathlang.core.tokens.NameToken
    //  - com.google.codeu.mathlang.core.tokens.SymbolToken
    //  - com.google.codeu.mathlang.core.tokens.NumberToken
    // If there is ever a problem with the source data, |next| should throw an
    // IOException.

    //this will go through the token and find matching tokebns
    //and then return/print them in the correct type
    //and I guess if it doesn't find anything then
    //return the exception?
    //basically return null when each of the groups
    //with the strings from regex have run out?




    return null;
  }
}
