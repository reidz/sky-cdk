/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.skyworx.tags;

import javax.faces.component.UIComponentBase;
import org.richfaces.cdk.annotations.Attribute;
import org.richfaces.cdk.annotations.EventName;
import org.richfaces.cdk.annotations.JsfComponent;
import org.richfaces.cdk.annotations.JsfRenderer;
import org.richfaces.cdk.annotations.Tag;
import org.richfaces.cdk.annotations.TagType;

/**
 *
 * @author ricko
 */
@JsfComponent(
        tag = @Tag(name = "inputDecimal", type = TagType.Facelets),
        renderer = @JsfRenderer(family = "com.skyworx.Input", 
                                type = "com.skyworx.InputDecimalRenderer")
)
public abstract class AbstractInputDecimal extends UIComponentBase{   
    
    @Attribute(events = @EventName(value = "blur", defaultEvent = true))
    public abstract String getOnblur();
}