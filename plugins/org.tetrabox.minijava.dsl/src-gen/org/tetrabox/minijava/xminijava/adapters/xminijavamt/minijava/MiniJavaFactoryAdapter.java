package org.tetrabox.minijava.xminijava.adapters.xminijavamt.minijava;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.tetrabox.minijava.xminijava.adapters.xminijavamt.XMiniJavaMTAdaptersFactory;
import org.tetrabox.minijava.xminijavamt.miniJava.And;
import org.tetrabox.minijava.xminijavamt.miniJava.ArrayTypeRef;
import org.tetrabox.minijava.xminijavamt.miniJava.Assignee;
import org.tetrabox.minijava.xminijavamt.miniJava.Assignment;
import org.tetrabox.minijava.xminijavamt.miniJava.Block;
import org.tetrabox.minijava.xminijavamt.miniJava.BoolConstant;
import org.tetrabox.minijava.xminijavamt.miniJava.BooleanTypeRef;
import org.tetrabox.minijava.xminijavamt.miniJava.BooleanValue;
import org.tetrabox.minijava.xminijavamt.miniJava.Call;
import org.tetrabox.minijava.xminijavamt.miniJava.ClassRef;
import org.tetrabox.minijava.xminijavamt.miniJava.Context;
import org.tetrabox.minijava.xminijavamt.miniJava.Division;
import org.tetrabox.minijava.xminijavamt.miniJava.Equality;
import org.tetrabox.minijava.xminijavamt.miniJava.Expression;
import org.tetrabox.minijava.xminijavamt.miniJava.Field;
import org.tetrabox.minijava.xminijavamt.miniJava.FieldAccess;
import org.tetrabox.minijava.xminijavamt.miniJava.FieldBinding;
import org.tetrabox.minijava.xminijavamt.miniJava.ForStatement;
import org.tetrabox.minijava.xminijavamt.miniJava.Frame;
import org.tetrabox.minijava.xminijavamt.miniJava.IfStatement;
import org.tetrabox.minijava.xminijavamt.miniJava.Import;
import org.tetrabox.minijava.xminijavamt.miniJava.Inequality;
import org.tetrabox.minijava.xminijavamt.miniJava.Inferior;
import org.tetrabox.minijava.xminijavamt.miniJava.InferiorOrEqual;
import org.tetrabox.minijava.xminijavamt.miniJava.Instance;
import org.tetrabox.minijava.xminijavamt.miniJava.IntConstant;
import org.tetrabox.minijava.xminijavamt.miniJava.IntegerTypeRef;
import org.tetrabox.minijava.xminijavamt.miniJava.IntegerValue;
import org.tetrabox.minijava.xminijavamt.miniJava.Interface;
import org.tetrabox.minijava.xminijavamt.miniJava.Member;
import org.tetrabox.minijava.xminijavamt.miniJava.Method;
import org.tetrabox.minijava.xminijavamt.miniJava.MethodCall;
import org.tetrabox.minijava.xminijavamt.miniJava.MethodCall2;
import org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaFactory;
import org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage;
import org.tetrabox.minijava.xminijavamt.miniJava.Minus;
import org.tetrabox.minijava.xminijavamt.miniJava.Multiplication;
import org.tetrabox.minijava.xminijavamt.miniJava.NamedElement;
import org.tetrabox.minijava.xminijavamt.miniJava.Neg;
import org.tetrabox.minijava.xminijavamt.miniJava.New;
import org.tetrabox.minijava.xminijavamt.miniJava.NewCall;
import org.tetrabox.minijava.xminijavamt.miniJava.Not;
import org.tetrabox.minijava.xminijavamt.miniJava.Null;
import org.tetrabox.minijava.xminijavamt.miniJava.NullValue;
import org.tetrabox.minijava.xminijavamt.miniJava.Or;
import org.tetrabox.minijava.xminijavamt.miniJava.OutputStream;
import org.tetrabox.minijava.xminijavamt.miniJava.Parameter;
import org.tetrabox.minijava.xminijavamt.miniJava.Plus;
import org.tetrabox.minijava.xminijavamt.miniJava.PrintStatement;
import org.tetrabox.minijava.xminijavamt.miniJava.Program;
import org.tetrabox.minijava.xminijavamt.miniJava.RefValue;
import org.tetrabox.minijava.xminijavamt.miniJava.Return;
import org.tetrabox.minijava.xminijavamt.miniJava.SingleTypeRef;
import org.tetrabox.minijava.xminijavamt.miniJava.State;
import org.tetrabox.minijava.xminijavamt.miniJava.Statement;
import org.tetrabox.minijava.xminijavamt.miniJava.StringConstant;
import org.tetrabox.minijava.xminijavamt.miniJava.StringTypeRef;
import org.tetrabox.minijava.xminijavamt.miniJava.StringValue;
import org.tetrabox.minijava.xminijavamt.miniJava.Super;
import org.tetrabox.minijava.xminijavamt.miniJava.Superior;
import org.tetrabox.minijava.xminijavamt.miniJava.SuperiorOrEqual;
import org.tetrabox.minijava.xminijavamt.miniJava.Symbol;
import org.tetrabox.minijava.xminijavamt.miniJava.SymbolBinding;
import org.tetrabox.minijava.xminijavamt.miniJava.SymbolRef;
import org.tetrabox.minijava.xminijavamt.miniJava.This;
import org.tetrabox.minijava.xminijavamt.miniJava.TypeDeclaration;
import org.tetrabox.minijava.xminijavamt.miniJava.TypeRef;
import org.tetrabox.minijava.xminijavamt.miniJava.TypedDeclaration;
import org.tetrabox.minijava.xminijavamt.miniJava.Value;
import org.tetrabox.minijava.xminijavamt.miniJava.VariableDeclaration;
import org.tetrabox.minijava.xminijavamt.miniJava.VoidTypeRef;
import org.tetrabox.minijava.xminijavamt.miniJava.WhileStatement;

@SuppressWarnings("all")
public class MiniJavaFactoryAdapter extends EFactoryImpl implements MiniJavaFactory {
  private XMiniJavaMTAdaptersFactory adaptersFactory = org.tetrabox.minijava.xminijava.adapters.xminijavamt.XMiniJavaMTAdaptersFactory.getInstance();
  
  private org.tetrabox.minijava.xminijava.miniJava.MiniJavaFactory miniJavaAdaptee = org.tetrabox.minijava.xminijava.miniJava.MiniJavaFactory.eINSTANCE;
  
  @Override
  public Program createProgram() {
    return adaptersFactory.createProgramAdapter(miniJavaAdaptee.createProgram(), null);
  }
  
  @Override
  public Import createImport() {
    return adaptersFactory.createImportAdapter(miniJavaAdaptee.createImport(), null);
  }
  
  @Override
  public TypeDeclaration createTypeDeclaration() {
    return adaptersFactory.createTypeDeclarationAdapter(miniJavaAdaptee.createTypeDeclaration(), null);
  }
  
  @Override
  public org.tetrabox.minijava.xminijavamt.miniJava.Class createClass() {
    return adaptersFactory.createClassAdapter(miniJavaAdaptee.createClass(), null);
  }
  
  @Override
  public Interface createInterface() {
    return adaptersFactory.createInterfaceAdapter(miniJavaAdaptee.createInterface(), null);
  }
  
  @Override
  public Member createMember() {
    return adaptersFactory.createMemberAdapter(miniJavaAdaptee.createMember(), null);
  }
  
  @Override
  public Method createMethod() {
    return adaptersFactory.createMethodAdapter(miniJavaAdaptee.createMethod(), null);
  }
  
  @Override
  public Parameter createParameter() {
    return adaptersFactory.createParameterAdapter(miniJavaAdaptee.createParameter(), null);
  }
  
  @Override
  public Field createField() {
    return adaptersFactory.createFieldAdapter(miniJavaAdaptee.createField(), null);
  }
  
  @Override
  public Expression createExpression() {
    return adaptersFactory.createExpressionAdapter(miniJavaAdaptee.createExpression(), null);
  }
  
  @Override
  public Block createBlock() {
    return adaptersFactory.createBlockAdapter(miniJavaAdaptee.createBlock(), null);
  }
  
  @Override
  public Statement createStatement() {
    return adaptersFactory.createStatementAdapter(miniJavaAdaptee.createStatement(), null);
  }
  
  @Override
  public PrintStatement createPrintStatement() {
    return adaptersFactory.createPrintStatementAdapter(miniJavaAdaptee.createPrintStatement(), null);
  }
  
  @Override
  public Return createReturn() {
    return adaptersFactory.createReturnAdapter(miniJavaAdaptee.createReturn(), null);
  }
  
  @Override
  public IfStatement createIfStatement() {
    return adaptersFactory.createIfStatementAdapter(miniJavaAdaptee.createIfStatement(), null);
  }
  
  @Override
  public WhileStatement createWhileStatement() {
    return adaptersFactory.createWhileStatementAdapter(miniJavaAdaptee.createWhileStatement(), null);
  }
  
  @Override
  public ForStatement createForStatement() {
    return adaptersFactory.createForStatementAdapter(miniJavaAdaptee.createForStatement(), null);
  }
  
  @Override
  public TypeRef createTypeRef() {
    return adaptersFactory.createTypeRefAdapter(miniJavaAdaptee.createTypeRef(), null);
  }
  
  @Override
  public SingleTypeRef createSingleTypeRef() {
    return adaptersFactory.createSingleTypeRefAdapter(miniJavaAdaptee.createSingleTypeRef(), null);
  }
  
  @Override
  public ClassRef createClassRef() {
    return adaptersFactory.createClassRefAdapter(miniJavaAdaptee.createClassRef(), null);
  }
  
  @Override
  public NamedElement createNamedElement() {
    return adaptersFactory.createNamedElementAdapter(miniJavaAdaptee.createNamedElement(), null);
  }
  
  @Override
  public TypedDeclaration createTypedDeclaration() {
    return adaptersFactory.createTypedDeclarationAdapter(miniJavaAdaptee.createTypedDeclaration(), null);
  }
  
  @Override
  public Symbol createSymbol() {
    return adaptersFactory.createSymbolAdapter(miniJavaAdaptee.createSymbol(), null);
  }
  
  @Override
  public VariableDeclaration createVariableDeclaration() {
    return adaptersFactory.createVariableDeclarationAdapter(miniJavaAdaptee.createVariableDeclaration(), null);
  }
  
  @Override
  public Assignment createAssignment() {
    return adaptersFactory.createAssignmentAdapter(miniJavaAdaptee.createAssignment(), null);
  }
  
  @Override
  public Assignee createAssignee() {
    return adaptersFactory.createAssigneeAdapter(miniJavaAdaptee.createAssignee(), null);
  }
  
  @Override
  public ArrayTypeRef createArrayTypeRef() {
    return adaptersFactory.createArrayTypeRefAdapter(miniJavaAdaptee.createArrayTypeRef(), null);
  }
  
  @Override
  public IntegerTypeRef createIntegerTypeRef() {
    return adaptersFactory.createIntegerTypeRefAdapter(miniJavaAdaptee.createIntegerTypeRef(), null);
  }
  
  @Override
  public BooleanTypeRef createBooleanTypeRef() {
    return adaptersFactory.createBooleanTypeRefAdapter(miniJavaAdaptee.createBooleanTypeRef(), null);
  }
  
  @Override
  public StringTypeRef createStringTypeRef() {
    return adaptersFactory.createStringTypeRefAdapter(miniJavaAdaptee.createStringTypeRef(), null);
  }
  
  @Override
  public VoidTypeRef createVoidTypeRef() {
    return adaptersFactory.createVoidTypeRefAdapter(miniJavaAdaptee.createVoidTypeRef(), null);
  }
  
  @Override
  public Or createOr() {
    return adaptersFactory.createOrAdapter(miniJavaAdaptee.createOr(), null);
  }
  
  @Override
  public And createAnd() {
    return adaptersFactory.createAndAdapter(miniJavaAdaptee.createAnd(), null);
  }
  
  @Override
  public Equality createEquality() {
    return adaptersFactory.createEqualityAdapter(miniJavaAdaptee.createEquality(), null);
  }
  
  @Override
  public Inequality createInequality() {
    return adaptersFactory.createInequalityAdapter(miniJavaAdaptee.createInequality(), null);
  }
  
  @Override
  public SuperiorOrEqual createSuperiorOrEqual() {
    return adaptersFactory.createSuperiorOrEqualAdapter(miniJavaAdaptee.createSuperiorOrEqual(), null);
  }
  
  @Override
  public InferiorOrEqual createInferiorOrEqual() {
    return adaptersFactory.createInferiorOrEqualAdapter(miniJavaAdaptee.createInferiorOrEqual(), null);
  }
  
  @Override
  public Superior createSuperior() {
    return adaptersFactory.createSuperiorAdapter(miniJavaAdaptee.createSuperior(), null);
  }
  
  @Override
  public Inferior createInferior() {
    return adaptersFactory.createInferiorAdapter(miniJavaAdaptee.createInferior(), null);
  }
  
  @Override
  public Plus createPlus() {
    return adaptersFactory.createPlusAdapter(miniJavaAdaptee.createPlus(), null);
  }
  
  @Override
  public Minus createMinus() {
    return adaptersFactory.createMinusAdapter(miniJavaAdaptee.createMinus(), null);
  }
  
  @Override
  public Multiplication createMultiplication() {
    return adaptersFactory.createMultiplicationAdapter(miniJavaAdaptee.createMultiplication(), null);
  }
  
  @Override
  public Division createDivision() {
    return adaptersFactory.createDivisionAdapter(miniJavaAdaptee.createDivision(), null);
  }
  
  @Override
  public Not createNot() {
    return adaptersFactory.createNotAdapter(miniJavaAdaptee.createNot(), null);
  }
  
  @Override
  public Neg createNeg() {
    return adaptersFactory.createNegAdapter(miniJavaAdaptee.createNeg(), null);
  }
  
  @Override
  public FieldAccess createFieldAccess() {
    return adaptersFactory.createFieldAccessAdapter(miniJavaAdaptee.createFieldAccess(), null);
  }
  
  @Override
  public MethodCall createMethodCall() {
    return adaptersFactory.createMethodCallAdapter(miniJavaAdaptee.createMethodCall(), null);
  }
  
  @Override
  public StringConstant createStringConstant() {
    return adaptersFactory.createStringConstantAdapter(miniJavaAdaptee.createStringConstant(), null);
  }
  
  @Override
  public IntConstant createIntConstant() {
    return adaptersFactory.createIntConstantAdapter(miniJavaAdaptee.createIntConstant(), null);
  }
  
  @Override
  public BoolConstant createBoolConstant() {
    return adaptersFactory.createBoolConstantAdapter(miniJavaAdaptee.createBoolConstant(), null);
  }
  
  @Override
  public This createThis() {
    return adaptersFactory.createThisAdapter(miniJavaAdaptee.createThis(), null);
  }
  
  @Override
  public Super createSuper() {
    return adaptersFactory.createSuperAdapter(miniJavaAdaptee.createSuper(), null);
  }
  
  @Override
  public Null createNull() {
    return adaptersFactory.createNullAdapter(miniJavaAdaptee.createNull(), null);
  }
  
  @Override
  public New createNew() {
    return adaptersFactory.createNewAdapter(miniJavaAdaptee.createNew(), null);
  }
  
  @Override
  public SymbolRef createSymbolRef() {
    return adaptersFactory.createSymbolRefAdapter(miniJavaAdaptee.createSymbolRef(), null);
  }
  
  @Override
  public Context createContext() {
    return adaptersFactory.createContextAdapter(miniJavaAdaptee.createContext(), null);
  }
  
  @Override
  public Value createValue() {
    return adaptersFactory.createValueAdapter(miniJavaAdaptee.createValue(), null);
  }
  
  @Override
  public IntegerValue createIntegerValue() {
    return adaptersFactory.createIntegerValueAdapter(miniJavaAdaptee.createIntegerValue(), null);
  }
  
  @Override
  public Instance createInstance() {
    return adaptersFactory.createInstanceAdapter(miniJavaAdaptee.createInstance(), null);
  }
  
  @Override
  public SymbolBinding createSymbolBinding() {
    return adaptersFactory.createSymbolBindingAdapter(miniJavaAdaptee.createSymbolBinding(), null);
  }
  
  @Override
  public FieldBinding createFieldBinding() {
    return adaptersFactory.createFieldBindingAdapter(miniJavaAdaptee.createFieldBinding(), null);
  }
  
  @Override
  public StringValue createStringValue() {
    return adaptersFactory.createStringValueAdapter(miniJavaAdaptee.createStringValue(), null);
  }
  
  @Override
  public BooleanValue createBooleanValue() {
    return adaptersFactory.createBooleanValueAdapter(miniJavaAdaptee.createBooleanValue(), null);
  }
  
  @Override
  public OutputStream createOutputStream() {
    return adaptersFactory.createOutputStreamAdapter(miniJavaAdaptee.createOutputStream(), null);
  }
  
  @Override
  public RefValue createRefValue() {
    return adaptersFactory.createRefValueAdapter(miniJavaAdaptee.createRefValue(), null);
  }
  
  @Override
  public State createState() {
    return adaptersFactory.createStateAdapter(miniJavaAdaptee.createState(), null);
  }
  
  @Override
  public Frame createFrame() {
    return adaptersFactory.createFrameAdapter(miniJavaAdaptee.createFrame(), null);
  }
  
  @Override
  public NullValue createNullValue() {
    return adaptersFactory.createNullValueAdapter(miniJavaAdaptee.createNullValue(), null);
  }
  
  @Override
  public Call createCall() {
    return adaptersFactory.createCallAdapter(miniJavaAdaptee.createCall(), null);
  }
  
  @Override
  public NewCall createNewCall() {
    return adaptersFactory.createNewCallAdapter(miniJavaAdaptee.createNewCall(), null);
  }
  
  @Override
  public MethodCall2 createMethodCall2() {
    return adaptersFactory.createMethodCall2Adapter(miniJavaAdaptee.createMethodCall2(), null);
  }
  
  @Override
  public EPackage getEPackage() {
    return getMiniJavaPackage();
  }
  
  public MiniJavaPackage getMiniJavaPackage() {
    return org.tetrabox.minijava.xminijavamt.miniJava.MiniJavaPackage.eINSTANCE;
  }
}