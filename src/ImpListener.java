// Generated from F:/IdeaProjects/IMProject\Imp.g4 by ANTLR 4.5
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ImpParser}.
 */
public interface ImpListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ImpParser#init}.
	 * @param ctx the parse tree
	 */
	void enterInit(@NotNull ImpParser.InitContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImpParser#init}.
	 * @param ctx the parse tree
	 */
	void exitInit(@NotNull ImpParser.InitContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImpParser#comlist}.
	 * @param ctx the parse tree
	 */
	void enterComlist(@NotNull ImpParser.ComlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImpParser#comlist}.
	 * @param ctx the parse tree
	 */
	void exitComlist(@NotNull ImpParser.ComlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImpParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(@NotNull ImpParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImpParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(@NotNull ImpParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImpParser#com}.
	 * @param ctx the parse tree
	 */
	void enterCom(@NotNull ImpParser.ComContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImpParser#com}.
	 * @param ctx the parse tree
	 */
	void exitCom(@NotNull ImpParser.ComContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImpParser#evalue}.
	 * @param ctx the parse tree
	 */
	void enterEvalue(@NotNull ImpParser.EvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImpParser#evalue}.
	 * @param ctx the parse tree
	 */
	void exitEvalue(@NotNull ImpParser.EvalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImpParser#ifstmt}.
	 * @param ctx the parse tree
	 */
	void enterIfstmt(@NotNull ImpParser.IfstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImpParser#ifstmt}.
	 * @param ctx the parse tree
	 */
	void exitIfstmt(@NotNull ImpParser.IfstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImpParser#whilestmt}.
	 * @param ctx the parse tree
	 */
	void enterWhilestmt(@NotNull ImpParser.WhilestmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImpParser#whilestmt}.
	 * @param ctx the parse tree
	 */
	void exitWhilestmt(@NotNull ImpParser.WhilestmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImpParser#aexp}.
	 * @param ctx the parse tree
	 */
	void enterAexp(@NotNull ImpParser.AexpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImpParser#aexp}.
	 * @param ctx the parse tree
	 */
	void exitAexp(@NotNull ImpParser.AexpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImpParser#addaexp}.
	 * @param ctx the parse tree
	 */
	void enterAddaexp(@NotNull ImpParser.AddaexpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImpParser#addaexp}.
	 * @param ctx the parse tree
	 */
	void exitAddaexp(@NotNull ImpParser.AddaexpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImpParser#mulaexp}.
	 * @param ctx the parse tree
	 */
	void enterMulaexp(@NotNull ImpParser.MulaexpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImpParser#mulaexp}.
	 * @param ctx the parse tree
	 */
	void exitMulaexp(@NotNull ImpParser.MulaexpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImpParser#aexpatom}.
	 * @param ctx the parse tree
	 */
	void enterAexpatom(@NotNull ImpParser.AexpatomContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImpParser#aexpatom}.
	 * @param ctx the parse tree
	 */
	void exitAexpatom(@NotNull ImpParser.AexpatomContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImpParser#bexp}.
	 * @param ctx the parse tree
	 */
	void enterBexp(@NotNull ImpParser.BexpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImpParser#bexp}.
	 * @param ctx the parse tree
	 */
	void exitBexp(@NotNull ImpParser.BexpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImpParser#orbexp}.
	 * @param ctx the parse tree
	 */
	void enterOrbexp(@NotNull ImpParser.OrbexpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImpParser#orbexp}.
	 * @param ctx the parse tree
	 */
	void exitOrbexp(@NotNull ImpParser.OrbexpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImpParser#andbexp}.
	 * @param ctx the parse tree
	 */
	void enterAndbexp(@NotNull ImpParser.AndbexpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImpParser#andbexp}.
	 * @param ctx the parse tree
	 */
	void exitAndbexp(@NotNull ImpParser.AndbexpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImpParser#equalbexp}.
	 * @param ctx the parse tree
	 */
	void enterEqualbexp(@NotNull ImpParser.EqualbexpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImpParser#equalbexp}.
	 * @param ctx the parse tree
	 */
	void exitEqualbexp(@NotNull ImpParser.EqualbexpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImpParser#bexpatom}.
	 * @param ctx the parse tree
	 */
	void enterBexpatom(@NotNull ImpParser.BexpatomContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImpParser#bexpatom}.
	 * @param ctx the parse tree
	 */
	void exitBexpatom(@NotNull ImpParser.BexpatomContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImpParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(@NotNull ImpParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImpParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(@NotNull ImpParser.AtomContext ctx);
}