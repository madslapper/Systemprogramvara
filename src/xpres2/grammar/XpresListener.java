// Generated from C:/Users/Nick/IdeaProjects/xpres/src/xpres2/grammar\Xpres.g4 by ANTLR 4.5.1
package xpres2.grammar;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link XpresParser}.
 */
public interface XpresListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link XpresParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(XpresParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link XpresParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(XpresParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link XpresParser#code}.
	 * @param ctx the parse tree
	 */
	void enterCode(XpresParser.CodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link XpresParser#code}.
	 * @param ctx the parse tree
	 */
	void exitCode(XpresParser.CodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link XpresParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(XpresParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link XpresParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(XpresParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link XpresParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(XpresParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link XpresParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(XpresParser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link XpresParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(XpresParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link XpresParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(XpresParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link XpresParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(XpresParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link XpresParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(XpresParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link XpresParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(XpresParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link XpresParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(XpresParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link XpresParser#addExpr}.
	 * @param ctx the parse tree
	 */
	void enterAddExpr(XpresParser.AddExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link XpresParser#addExpr}.
	 * @param ctx the parse tree
	 */
	void exitAddExpr(XpresParser.AddExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link XpresParser#mulExpr}.
	 * @param ctx the parse tree
	 */
	void enterMulExpr(XpresParser.MulExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link XpresParser#mulExpr}.
	 * @param ctx the parse tree
	 */
	void exitMulExpr(XpresParser.MulExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link XpresParser#atomExpr}.
	 * @param ctx the parse tree
	 */
	void enterAtomExpr(XpresParser.AtomExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link XpresParser#atomExpr}.
	 * @param ctx the parse tree
	 */
	void exitAtomExpr(XpresParser.AtomExprContext ctx);
}