/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.skyworx.tags.component;

import javax.faces.component.UIInput;
import org.richfaces.cdk.annotations.Attribute;
import org.richfaces.cdk.annotations.JsfComponent;
import org.richfaces.cdk.annotations.JsfRenderer;
import org.richfaces.cdk.annotations.Tag;
import org.richfaces.cdk.annotations.TagType;

/**
 *
 * @author ricko
 */
@JsfComponent(
        tag = @Tag(name = "inputDecimal4", type = TagType.Facelets),
        renderer = @JsfRenderer(family = "com.skyworx.Input", 
                                type = "com.skyworx.InputDecimalRenderer")
)
public class UIInputDecimal4 extends UIInput{
}