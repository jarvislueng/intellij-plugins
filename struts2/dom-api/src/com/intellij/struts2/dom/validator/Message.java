/*
 * Copyright 2011 The authors
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

package com.intellij.struts2.dom.validator;

import com.intellij.ide.presentation.Presentation;
import com.intellij.struts2.Struts2ValidationPresentationProvider;
import com.intellij.struts2.dom.StrutsDomConstants;
import com.intellij.util.xml.DomElement;
import com.intellij.util.xml.GenericAttributeValue;
import com.intellij.util.xml.Namespace;
import com.intellij.util.xml.TagValue;

/**
 * <code>message</code>.
 *
 * @author Yann C&eacute;bron
 */
@Namespace(StrutsDomConstants.VALIDATOR_NAMESPACE_KEY)
@Presentation(typeName = "Message",
              icon = "Struts2Icons.Message",
              provider = Struts2ValidationPresentationProvider.class)
public interface Message extends DomElement {

  GenericAttributeValue<String> getKey();

  @TagValue
  String getValue();

}
