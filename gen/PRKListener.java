// Generated from C:/Users/Tomáš/Desktop/PRK/PRK\PRK.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PRKParser}.
 */
public interface PRKListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PRKParser#syntax}.
	 * @param ctx the parse tree
	 */
	void enterSyntax(PRKParser.SyntaxContext ctx);
	/**
	 * Exit a parse tree produced by {@link PRKParser#syntax}.
	 * @param ctx the parse tree
	 */
	void exitSyntax(PRKParser.SyntaxContext ctx);
	/**
	 * Enter a parse tree produced by {@link PRKParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(PRKParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link PRKParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(PRKParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link PRKParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(PRKParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link PRKParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(PRKParser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link PRKParser#booleanPRK}.
	 * @param ctx the parse tree
	 */
	void enterBooleanPRK(PRKParser.BooleanPRKContext ctx);
	/**
	 * Exit a parse tree produced by {@link PRKParser#booleanPRK}.
	 * @param ctx the parse tree
	 */
	void exitBooleanPRK(PRKParser.BooleanPRKContext ctx);
	/**
	 * Enter a parse tree produced by {@link PRKParser#integerPRK}.
	 * @param ctx the parse tree
	 */
	void enterIntegerPRK(PRKParser.IntegerPRKContext ctx);
	/**
	 * Exit a parse tree produced by {@link PRKParser#integerPRK}.
	 * @param ctx the parse tree
	 */
	void exitIntegerPRK(PRKParser.IntegerPRKContext ctx);
	/**
	 * Enter a parse tree produced by {@link PRKParser#floatPRK}.
	 * @param ctx the parse tree
	 */
	void enterFloatPRK(PRKParser.FloatPRKContext ctx);
	/**
	 * Exit a parse tree produced by {@link PRKParser#floatPRK}.
	 * @param ctx the parse tree
	 */
	void exitFloatPRK(PRKParser.FloatPRKContext ctx);
	/**
	 * Enter a parse tree produced by {@link PRKParser#charPRK}.
	 * @param ctx the parse tree
	 */
	void enterCharPRK(PRKParser.CharPRKContext ctx);
	/**
	 * Exit a parse tree produced by {@link PRKParser#charPRK}.
	 * @param ctx the parse tree
	 */
	void exitCharPRK(PRKParser.CharPRKContext ctx);
	/**
	 * Enter a parse tree produced by {@link PRKParser#stringPRK}.
	 * @param ctx the parse tree
	 */
	void enterStringPRK(PRKParser.StringPRKContext ctx);
	/**
	 * Exit a parse tree produced by {@link PRKParser#stringPRK}.
	 * @param ctx the parse tree
	 */
	void exitStringPRK(PRKParser.StringPRKContext ctx);
	/**
	 * Enter a parse tree produced by {@link PRKParser#expressionPRK}.
	 * @param ctx the parse tree
	 */
	void enterExpressionPRK(PRKParser.ExpressionPRKContext ctx);
	/**
	 * Exit a parse tree produced by {@link PRKParser#expressionPRK}.
	 * @param ctx the parse tree
	 */
	void exitExpressionPRK(PRKParser.ExpressionPRKContext ctx);
	/**
	 * Enter a parse tree produced by {@link PRKParser#assignmentToVarPRK}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentToVarPRK(PRKParser.AssignmentToVarPRKContext ctx);
	/**
	 * Exit a parse tree produced by {@link PRKParser#assignmentToVarPRK}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentToVarPRK(PRKParser.AssignmentToVarPRKContext ctx);
	/**
	 * Enter a parse tree produced by {@link PRKParser#declarationPRK}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationPRK(PRKParser.DeclarationPRKContext ctx);
	/**
	 * Exit a parse tree produced by {@link PRKParser#declarationPRK}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationPRK(PRKParser.DeclarationPRKContext ctx);
	/**
	 * Enter a parse tree produced by {@link PRKParser#declareBooleanPRK}.
	 * @param ctx the parse tree
	 */
	void enterDeclareBooleanPRK(PRKParser.DeclareBooleanPRKContext ctx);
	/**
	 * Exit a parse tree produced by {@link PRKParser#declareBooleanPRK}.
	 * @param ctx the parse tree
	 */
	void exitDeclareBooleanPRK(PRKParser.DeclareBooleanPRKContext ctx);
	/**
	 * Enter a parse tree produced by {@link PRKParser#declareIntegerPRK}.
	 * @param ctx the parse tree
	 */
	void enterDeclareIntegerPRK(PRKParser.DeclareIntegerPRKContext ctx);
	/**
	 * Exit a parse tree produced by {@link PRKParser#declareIntegerPRK}.
	 * @param ctx the parse tree
	 */
	void exitDeclareIntegerPRK(PRKParser.DeclareIntegerPRKContext ctx);
	/**
	 * Enter a parse tree produced by {@link PRKParser#declareFloatPRK}.
	 * @param ctx the parse tree
	 */
	void enterDeclareFloatPRK(PRKParser.DeclareFloatPRKContext ctx);
	/**
	 * Exit a parse tree produced by {@link PRKParser#declareFloatPRK}.
	 * @param ctx the parse tree
	 */
	void exitDeclareFloatPRK(PRKParser.DeclareFloatPRKContext ctx);
	/**
	 * Enter a parse tree produced by {@link PRKParser#declareCharPRK}.
	 * @param ctx the parse tree
	 */
	void enterDeclareCharPRK(PRKParser.DeclareCharPRKContext ctx);
	/**
	 * Exit a parse tree produced by {@link PRKParser#declareCharPRK}.
	 * @param ctx the parse tree
	 */
	void exitDeclareCharPRK(PRKParser.DeclareCharPRKContext ctx);
	/**
	 * Enter a parse tree produced by {@link PRKParser#declareStringPRK}.
	 * @param ctx the parse tree
	 */
	void enterDeclareStringPRK(PRKParser.DeclareStringPRKContext ctx);
	/**
	 * Exit a parse tree produced by {@link PRKParser#declareStringPRK}.
	 * @param ctx the parse tree
	 */
	void exitDeclareStringPRK(PRKParser.DeclareStringPRKContext ctx);
}