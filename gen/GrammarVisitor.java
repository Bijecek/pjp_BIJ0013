// Generated from C:/Users/sisin/IdeaProjects/PJP/projekt_PJP/pjp_BIJ0013/src/main/java\Grammar.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GrammarParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(GrammarParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(GrammarParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code readVisitor}
	 * labeled alternative in {@link GrammarParser#firstRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadVisitor(GrammarParser.ReadVisitorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code writeVisitor}
	 * labeled alternative in {@link GrammarParser#firstRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWriteVisitor(GrammarParser.WriteVisitorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code visiterPromenne}
	 * labeled alternative in {@link GrammarParser#firstRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVisiterPromenne(GrammarParser.VisiterPromenneContext ctx);
	/**
	 * Visit a parse tree produced by the {@code asa}
	 * labeled alternative in {@link GrammarParser#firstRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsa(GrammarParser.AsaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code visitComment}
	 * labeled alternative in {@link GrammarParser#firstRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVisitComment(GrammarParser.VisitCommentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code blockVisitor}
	 * labeled alternative in {@link GrammarParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockVisitor(GrammarParser.BlockVisitorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifVisitor}
	 * labeled alternative in {@link GrammarParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfVisitor(GrammarParser.IfVisitorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code deklaracePromenne}
	 * labeled alternative in {@link GrammarParser#promenne}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeklaracePromenne(GrammarParser.DeklaracePromenneContext ctx);
	/**
	 * Visit a parse tree produced by the {@code inicializacePromenne}
	 * labeled alternative in {@link GrammarParser#promenne}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInicializacePromenne(GrammarParser.InicializacePromenneContext ctx);
	/**
	 * Visit a parse tree produced by the {@code visitPromennaFloat}
	 * labeled alternative in {@link GrammarParser#datovyTyp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVisitPromennaFloat(GrammarParser.VisitPromennaFloatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code visitPromennaInt}
	 * labeled alternative in {@link GrammarParser#datovyTyp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVisitPromennaInt(GrammarParser.VisitPromennaIntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code visitPromennaBoolean}
	 * labeled alternative in {@link GrammarParser#datovyTyp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVisitPromennaBoolean(GrammarParser.VisitPromennaBooleanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code visitPromennaString}
	 * labeled alternative in {@link GrammarParser#datovyTyp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVisitPromennaString(GrammarParser.VisitPromennaStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code visiterSubExpr}
	 * labeled alternative in {@link GrammarParser#datovyTyp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVisiterSubExpr(GrammarParser.VisiterSubExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code visiterInt}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVisiterInt(GrammarParser.VisiterIntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code b}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitB(GrammarParser.BContext ctx);
	/**
	 * Visit a parse tree produced by the {@code visiterBoolean}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVisiterBoolean(GrammarParser.VisiterBooleanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code visitZavorky}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVisitZavorky(GrammarParser.VisitZavorkyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code visiterPromenna}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVisiterPromenna(GrammarParser.VisiterPromennaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code visiterPlusMinusSpojeni}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVisiterPlusMinusSpojeni(GrammarParser.VisiterPlusMinusSpojeniContext ctx);
	/**
	 * Visit a parse tree produced by the {@code visitRelacniOperatory}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVisitRelacniOperatory(GrammarParser.VisitRelacniOperatoryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code visitAndOr}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVisitAndOr(GrammarParser.VisitAndOrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code visiterFloat}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVisiterFloat(GrammarParser.VisiterFloatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code visiterPrvniCast}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVisiterPrvniCast(GrammarParser.VisiterPrvniCastContext ctx);
	/**
	 * Visit a parse tree produced by the {@code visiterKratDelenoModulo}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVisiterKratDelenoModulo(GrammarParser.VisiterKratDelenoModuloContext ctx);
	/**
	 * Visit a parse tree produced by the {@code visiterNazev}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVisiterNazev(GrammarParser.VisiterNazevContext ctx);
	/**
	 * Visit a parse tree produced by the {@code visiterString}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVisiterString(GrammarParser.VisiterStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code visitLogickeNot}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVisitLogickeNot(GrammarParser.VisitLogickeNotContext ctx);
}