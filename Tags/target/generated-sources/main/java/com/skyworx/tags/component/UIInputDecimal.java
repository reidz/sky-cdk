/*
 * JBoss, Home of Professional Open Source
 * Copyright , Red Hat, Inc. and individual contributors
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package com.skyworx.tags.component;

import javax.annotation.Generated;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import javax.faces.context.FacesContext;
import javax.faces.component.UIComponent;
import javax.faces.component.behavior.ClientBehaviorHolder;
import javax.el.MethodExpression;
import javax.el.ValueExpression;
import javax.faces.component.StateHelper;
import com.skyworx.tags.AbstractInputDecimal;

/**
 * 
 @author ricko

 **/
@Generated({"RichFaces CDK", "4.0.0-SNAPSHOT"})
public class UIInputDecimal extends AbstractInputDecimal
    implements ClientBehaviorHolder    {

    public static final String COMPONENT_TYPE="com.skyworx.tags.InputDecimal";

    public static final String COMPONENT_FAMILY="com.skyworx.tags.InputDecimal";

    @Override
    public String getFamily() {
        return COMPONENT_FAMILY;
    }

    public UIInputDecimal() {
        super();
        setRendererType("com.skyworx.InputDecimalRenderer");
    }

    private static final Collection<String> EVENT_NAMES = Collections.unmodifiableCollection(Arrays.asList(
        "blur"
        ));
    
    public Collection<String> getEventNames() {
        return EVENT_NAMES;
    }


    public String getDefaultEventName() {
        return "blur";
    }


    protected enum Properties {
        onblur
        
    }

 
    public String getOnblur() {
        String value = (String) getStateHelper().eval(Properties.onblur);
        return value;
    }
    
    public void setOnblur(String onblur) {
        getStateHelper().put(Properties.onblur, onblur);
    }

    

}