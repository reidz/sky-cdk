/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.skyworx.renderkit;

import javax.faces.application.ResourceDependencies;
import javax.faces.application.ResourceDependency;
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
}