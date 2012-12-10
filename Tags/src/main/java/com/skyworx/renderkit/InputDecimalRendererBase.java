/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.skyworx.renderkit;

import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import javax.faces.application.ResourceDependencies;
import javax.faces.application.ResourceDependency;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import org.richfaces.renderkit.ComponentAttribute;
import org.richfaces.renderkit.HtmlConstants;
import org.richfaces.renderkit.RenderKitUtils;
import org.richfaces.renderkit.RendererBase;

/**
 *
 * @author ricko
 */
@ResourceDependencies({
    @ResourceDependency(library = "javax.faces", name = "jsf.js"),
    @ResourceDependency(name = "jquery.js", target = "head"),
    @ResourceDependency(name = "richfaces.js", target = "head"),
    @ResourceDependency(name = "richfaces-event.js", target = "head"),
    @ResourceDependency(name = "richfaces-base-component.js", target = "head"),
    @ResourceDependency(name = "skyworx.inputDecimal.js", target = "head")
})
public abstract class InputDecimalRendererBase extends RendererBase{
    
    protected static final Map<String, ComponentAttribute> INPUT_DECIMAL_HANDLER_ATTRIBUTES = Collections
        .unmodifiableMap(ComponentAttribute.createMap(
            new ComponentAttribute(HtmlConstants.ONBLUR_ATTRIBUTE).setEventNames("blur")
            .setComponentAttributeName("onblur")
            ));
    
    public void renderInputHandlers(FacesContext facesContext, UIComponent component) throws IOException {
        RenderKitUtils.renderPassThroughAttributesOptimized(facesContext, component, INPUT_DECIMAL_HANDLER_ATTRIBUTES);
    }
    
}