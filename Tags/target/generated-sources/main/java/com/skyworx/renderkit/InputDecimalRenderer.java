package com.skyworx.renderkit;

import com.skyworx.renderkit.InputDecimalRendererBase;
import java.io.IOException;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;


public class InputDecimalRenderer extends InputDecimalRendererBase {
	
	
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


responseWriter.endElement("input"); 
responseWriter.startElement("script", component); 
  responseWriter.writeAttribute("type","text/javascript",null);


{
	Object text = "new RichFaces.ui.InputDecimal(\"" + convertToString(clientId) + "\");";
	if (text != null) {
		responseWriter.writeText(text, null); 
	}
}

responseWriter.endElement("script"); 

	}
}

