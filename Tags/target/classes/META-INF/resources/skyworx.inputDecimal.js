(function ($, rf) {
    rf.ui = rf.ui || {};
    rf.ui.InputDecimal= rf.BaseComponent.extendClass({
        // class name
        name:"InputDecimal",
        init: function (componentId) {
            if (!document.getElementById(componentId)) {
                throw "No element with id '" + componentId + "' found.";
            }
            else{
                alert('else');
            }
            $super.constructor.call(this, componentId);
            
            this.element = $(document.getElementById(componentId));
            this.element.bind("blur", $.proxy(this.__blurHandler, this));
            
            this.attachToDom(this.id);
        },
        __blurHandler: function(e) {
            this.onblur(e);
        },

        onblur: function(e) {
            this.invokeEvent.call("blur", this, e);
        }
    });
    var $super = rf.ui.InputDecimal.$super;
})(jQuery, RichFaces);