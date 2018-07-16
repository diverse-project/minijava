package org.tetrabox.minijava.minirunner

import com.google.inject.Inject
import org.tetrabox.minijava.xtext.miniJava.Program
import org.eclipse.xtext.parser.IParser
import org.tetrabox.minijava.xtext.MiniJavaStandaloneSetup
import com.google.inject.Injector
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.parser.IParseResult
import java.io.Reader
import org.eclipse.xtext.parser.ParseException
import java.io.IOException
import java.io.BufferedReader
import java.io.FileReader

import static extension org.tetrabox.minijava.semantics.ProgramAspect.execute
import static extension org.tetrabox.minijava.semantics.ProgramAspect.initialize

class MiniRunner {
	
	@Inject 
	private IParser parser
	
	new() {
		val Injector injector = new MiniJavaStandaloneSetup().createInjectorAndDoEMFRegistration();
		injector.injectMembers(this)
	}
	
	def EObject parse(Reader reader) throws IOException{
		val IParseResult result = parser.parse(reader)
		if(result.hasSyntaxErrors) {
			throw new ParseException("Provided input contains syntax errors.")
		}
		return result.rootASTElement
	}
	
	def static void main(String[] args) {
		val MiniRunner runner = new MiniRunner
		try{
			val BufferedReader br = new BufferedReader(new FileReader("/Users/ludovicmouline/runtime-EclipseXtext/Test/src/Test.minijava"))
			val Program root = runner.parse(br) as Program
			root.initialize(args)
			val state = root.execute()
		} catch(Exception e) {
			e.printStackTrace
		}
	}
}