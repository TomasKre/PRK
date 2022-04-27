// Generated from PRK.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PRKParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PRKVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PRKParser#syntax}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSyntax(PRKParser.SyntaxContext ctx);
	/**
	 * Visit a parse tree produced by {@link PRKParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine(PRKParser.LineContext ctx);
	/**
	 * Visit a parse tree produced by {@link PRKParser#booleanPRK}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanPRK(PRKParser.BooleanPRKContext ctx);
	/**
	 * Visit a parse tree produced by {@link PRKParser#integerPRK}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerPRK(PRKParser.IntegerPRKContext ctx);
	/**
	 * Visit a parse tree produced by {@link PRKParser#floatPRK}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatPRK(PRKParser.FloatPRKContext ctx);
	/**
	 * Visit a parse tree produced by {@link PRKParser#charPRK}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharPRK(PRKParser.CharPRKContext ctx);
	/**
	 * Visit a parse tree produced by {@link PRKParser#stringPRK}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringPRK(PRKParser.StringPRKContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Float}
	 * labeled alternative in {@link PRKParser#expressionPRK}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloat(PRKParser.FloatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Parenthesis}
	 * labeled alternative in {@link PRKParser#expressionPRK}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesis(PRKParser.ParenthesisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link PRKParser#expressionPRK}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDiv(PRKParser.MulDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link PRKParser#expressionPRK}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSub(PRKParser.AddSubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PowSqr}
	 * labeled alternative in {@link PRKParser#expressionPRK}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPowSqr(PRKParser.PowSqrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Int}
	 * labeled alternative in {@link PRKParser#expressionPRK}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(PRKParser.IntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Name}
	 * labeled alternative in {@link PRKParser#expressionPRK}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(PRKParser.NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PRKParser#assignmentToVarPRK}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentToVarPRK(PRKParser.AssignmentToVarPRKContext ctx);
	/**
	 * Visit a parse tree produced by {@link PRKParser#declarationPRK}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationPRK(PRKParser.DeclarationPRKContext ctx);
	/**
	 * Visit a parse tree produced by {@link PRKParser#declareBooleanPRK}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclareBooleanPRK(PRKParser.DeclareBooleanPRKContext ctx);
	/**
	 * Visit a parse tree produced by {@link PRKParser#declareIntegerPRK}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclareIntegerPRK(PRKParser.DeclareIntegerPRKContext ctx);
	/**
	 * Visit a parse tree produced by {@link PRKParser#declareFloatPRK}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclareFloatPRK(PRKParser.DeclareFloatPRKContext ctx);
	/**
	 * Visit a parse tree produced by {@link PRKParser#declareCharPRK}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclareCharPRK(PRKParser.DeclareCharPRKContext ctx);
	/**
	 * Visit a parse tree produced by {@link PRKParser#declareStringPRK}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclareStringPRK(PRKParser.DeclareStringPRKContext ctx);
}