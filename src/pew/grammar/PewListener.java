// Generated from C:/Users/Krogen/Documents/IntelliJ IDEA Workspace/xpres/src/pew/grammar\Pew.g4 by ANTLR 4.5.1
package pew.grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PewParser}.
 */
public interface PewListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PewParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(PewParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link PewParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(PewParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link PewParser#code}.
	 * @param ctx the parse tree
	 */
	void enterCode(PewParser.CodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PewParser#code}.
	 * @param ctx the parse tree
	 */
	void exitCode(PewParser.CodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PewParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(PewParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PewParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(PewParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PewParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(PewParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link PewParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(PewParser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link PewParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(PewParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link PewParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(PewParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link PewParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(PewParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link PewParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(PewParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link PewParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(PewParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PewParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(PewParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PewParser#addExpr}.
	 * @param ctx the parse tree
	 */
	void enterAddExpr(PewParser.AddExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PewParser#addExpr}.
	 * @param ctx the parse tree
	 */
	void exitAddExpr(PewParser.AddExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PewParser#mulExpr}.
	 * @param ctx the parse tree
	 */
	void enterMulExpr(PewParser.MulExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PewParser#mulExpr}.
	 * @param ctx the parse tree
	 */
	void exitMulExpr(PewParser.MulExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PewParser#atomExpr}.
	 * @param ctx the parse tree
	 */
	void enterAtomExpr(PewParser.AtomExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PewParser#atomExpr}.
	 * @param ctx the parse tree
	 */
	void exitAtomExpr(PewParser.AtomExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PewParser#startLoop}.
	 * @param ctx the parse tree
	 */
	void enterStartLoop(PewParser.StartLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link PewParser#startLoop}.
	 * @param ctx the parse tree
	 */
	void exitStartLoop(PewParser.StartLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link PewParser#endLoop}.
	 * @param ctx the parse tree
	 */
	void enterEndLoop(PewParser.EndLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link PewParser#endLoop}.
	 * @param ctx the parse tree
	 */
	void exitEndLoop(PewParser.EndLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link PewParser#greaterThanExpr}.
	 * @param ctx the parse tree
	 */
	void enterGreaterThanExpr(PewParser.GreaterThanExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PewParser#greaterThanExpr}.
	 * @param ctx the parse tree
	 */
	void exitGreaterThanExpr(PewParser.GreaterThanExprContext ctx);
}