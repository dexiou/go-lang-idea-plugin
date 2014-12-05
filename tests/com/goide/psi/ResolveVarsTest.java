/*
 * Copyright 2013-2014 Sergey Ignatov, Alexander Zolotov, Mihai Claudiu Toader
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.goide.psi;

import com.goide.GoResolvingTestCase;

public class ResolveVarsTest extends GoResolvingTestCase {

  @Override
  protected String getBasePath() {
    return "psi/resolve/vars";
  }

  public void testDeclaredInForRange() { doResolveTest(); }

  public void testFromDefaultImportedPackage() {
    addPackage("test", "test/test1.go");
    doResolveTest();
  }
}