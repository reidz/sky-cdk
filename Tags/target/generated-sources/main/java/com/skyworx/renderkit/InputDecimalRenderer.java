package com.skyworx.renderkit;

import com.skyworx.renderkit.InputDecimalRendererBase;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;
import org.richfaces.renderkit.RenderKitUtils;
import static org.richfaces.renderkit.RenderKitUtils.*;
import org.richfaces.renderkit.RenderKitUtils.Attributes;
import org.richfaces.renderkit.RenderKitUtils.ScriptHashVariableWrapper;


public class InputDecimalRenderer extends InputDecimalRendererBase {
	
private static final Attributes ATTRIBUTES_FOR_SCRIPT_HASH0 = attributes()
	     .generic("onblur","onblur")
	     
;
	
	
private static String convertToString(Object object) 
 {
		return object != null ? object.toString() : "";
	}
	
@Override
public void encodeEnd(FacesContext facesContext, UIComponent component) 
		throws IOException
	 {
		ResponseWriter responseWriter = facesContext.getResponseWriter(); 
String clientId = component.getClientId(facesContext);
responseWriter.startElement("input", component); 
   {
      String value = clientId;
      if(null != value &&
         value.length()>0
      ) {
        responseWriter.writeAttribute("id",value,null);
      }
      
   }

   {
      String value = clientId;
      if(null != value &&
         value.length()>0
      ) {
        responseWriter.writeAttribute("name",value,null);
      }
      
   }

  responseWriter.writeAttribute("type","text",null);


renderInputHandlers(facesContext, component);;
responseWriter.endElement("input"); 
responseWriter.startElement("script", component); 
  responseWriter.writeAttribute("type","text/javascript",null);


Map<String, Object> options = new LinkedHashMap<String, Object>(); 

	
addToScriptHash(options, facesContext, component, ATTRIBUTES_FOR_SCRIPT_HASH0, ScriptHashVariableWrapper.eventHandler);

{
	Object text = "new RichFaces.ui.InputDecimal(\"" + convertToString(clientId) + "\", \"" + convertToString(toScriptArgs(options)) + "\");";
	if (text != null) {
		responseWriter.writeText(text, null); 
	}
}

responseWriter.endElement("script"); 

	}
}

