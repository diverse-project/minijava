package org.tetrabox.minijava.xminijava.adapters.minijavamt.miniJava;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.tetrabox.minijava.xminijava.adapters.minijavamt.MiniJavaMTAdaptersFactory;
import org.tetrabox.minijava.xminijava.miniJava.Program;
import org.tetrabox.minijava.xtext.miniJava.Import;
import org.tetrabox.minijava.xtext.miniJava.TypeDeclaration;

@SuppressWarnings("all")
public class ProgramAdapter extends EObjectAdapter<Program> implements org.tetrabox.minijava.xtext.miniJava.Program {
  private MiniJavaMTAdaptersFactory adaptersFactory;
  
  public ProgramAdapter() {
    super(org.tetrabox.minijava.xminijava.adapters.minijavamt.MiniJavaMTAdaptersFactory.getInstance());
    adaptersFactory = org.tetrabox.minijava.xminijava.adapters.minijavamt.MiniJavaMTAdaptersFactory.getInstance();
  }
  
  @Override
  public String getName() {
    return adaptee.getName();
  }
  
  @Override
  public void setName(final String o) {
    adaptee.setName(o);
  }
  
  private EList<Import> imports_;
  
  @Override
  public EList<Import> getImports() {
    if (imports_ == null)
    	imports_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getImports(), adaptersFactory, eResource);
    return imports_;
  }
  
  private EList<TypeDeclaration> classes_;
  
  @Override
  public EList<TypeDeclaration> getClasses() {
    if (classes_ == null)
    	classes_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getClasses(), adaptersFactory, eResource);
    return classes_;
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage.eINSTANCE.getProgram();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage.PROGRAM__NAME:
    		return getName();
    	case org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage.PROGRAM__IMPORTS:
    		return getImports();
    	case org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage.PROGRAM__CLASSES:
    		return getClasses();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage.PROGRAM__NAME:
    		return getName() != NAME_EDEFAULT;
    	case org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage.PROGRAM__IMPORTS:
    		return getImports() != null && !getImports().isEmpty();
    	case org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage.PROGRAM__CLASSES:
    		return getClasses() != null && !getClasses().isEmpty();
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage.PROGRAM__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage.PROGRAM__IMPORTS:
    		getImports().clear();
    		getImports().addAll((Collection) newValue);
    		return;
    	case org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage.PROGRAM__CLASSES:
    		getClasses().clear();
    		getClasses().addAll((Collection) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}