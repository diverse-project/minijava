package org.tetrabox.minijava.xminijava.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.tetrabox.minijava.xminijava.minijavadynamicdata.Context;
import org.tetrabox.minijava.xminijava.minijavadynamicdata.IntegerValue;
import org.tetrabox.minijava.xminijava.minijavadynamicdata.MinijavadynamicdataFactory;
import org.tetrabox.minijava.xminijava.minijavadynamicdata.Value;
import org.tetrabox.minijava.xminijava.aspects.ExpressionAspect;
import org.tetrabox.minijava.xminijava.aspects.IntConstantAspectIntConstantAspectProperties;
import org.tetrabox.minijava.xminijava.miniJava.IntConstant;

@Aspect(className = IntConstant.class)
@SuppressWarnings("all")
public class IntConstantAspect extends ExpressionAspect {
  @OverrideAspectMethod
  public static Value evaluate(final IntConstant _self, final Context context) {
	final org.tetrabox.minijava.xminijava.aspects.IntConstantAspectIntConstantAspectProperties _self_ = org.tetrabox.minijava.xminijava.aspects.IntConstantAspectIntConstantAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_evaluate(_self_, _self, context);
	;
	return (org.tetrabox.minijava.xminijava.minijavadynamicdata.Value) result;
}
  
  private static Value super_evaluate(final IntConstant _self, final Context context) {
    final org.tetrabox.minijava.xminijava.aspects.ExpressionAspectExpressionAspectProperties _self_ = org.tetrabox.minijava.xminijava.aspects.ExpressionAspectExpressionAspectContext.getSelf(_self);
    return  org.tetrabox.minijava.xminijava.aspects.ExpressionAspect._privk3_evaluate(_self_, _self,context);
  }
  
  protected static Value _privk3_evaluate(final IntConstantAspectIntConstantAspectProperties _self_, final IntConstant _self, final Context context) {
    IntegerValue _createIntegerValue = MinijavadynamicdataFactory.eINSTANCE.createIntegerValue();
    final Procedure1<IntegerValue> _function = (IntegerValue it) -> {
      it.setValue(_self.getConstant());
    };
    return ObjectExtensions.<IntegerValue>operator_doubleArrow(_createIntegerValue, _function);
  }
}
