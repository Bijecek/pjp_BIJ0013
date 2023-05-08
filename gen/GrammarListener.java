// Generated from C:/Users/sisin/IdeaProjects/PJP/projekt_PJP/pjp_BIJ0013/src/main/java\Grammar.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GrammarParser}.
 */
public interface GrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GrammarParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(GrammarParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(GrammarParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(GrammarParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(GrammarParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code readVisitor}
	 * labeled alternative in {@link GrammarParser#firstRule}.
	 * @param ctx the parse tree
	 */
	void enterReadVisitor(GrammarParser.ReadVisitorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code readVisitor}
	 * labeled alternative in {@link GrammarParser#firstRule}.
	 * @param ctx the parse tree
	 */
	void exitReadVisitor(GrammarParser.ReadVisitorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code writeVisitor}
	 * labeled alternative in {@link GrammarParser#firstRule}.
	 * @param ctx the parse tree
	 */
	void enterWriteVisitor(GrammarParser.WriteVisitorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code writeVisitor}
	 * labeled alternative in {@link GrammarParser#firstRule}.
	 * @param ctx the parse tree
	 */
	void exitWriteVisitor(GrammarParser.WriteVisitorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code visiterPromenne}
	 * labeled alternative in {@link GrammarParser#firstRule}.
	 * @param ctx the parse tree
	 */
	void enterVisiterPromenne(GrammarParser.VisiterPromenneContext ctx);
	/**
	 * Exit a parse tree produced by the {@code visiterPromenne}
	 * labeled alternative in {@link GrammarParser#firstRule}.
	 * @param ctx the parse tree
	 */
	void exitVisiterPromenne(GrammarParser.VisiterPromenneContext ctx);
	/**
	 * Enter a parse tree produced by the {@code asa}
	 * labeled alternative in {@link GrammarParser#firstRule}.
	 * @param ctx the parse tree
	 */
	void enterAsa(GrammarParser.AsaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code asa}
	 * labeled alternative in {@link GrammarParser#firstRule}.
	 * @param ctx the parse tree
	 */
	void exitAsa(GrammarParser.AsaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code visitComment}
	 * labeled alternative in {@link GrammarParser#firstRule}.
	 * @param ctx the parse tree
	 */
	void enterVisitComment(GrammarParser.VisitCommentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code visitComment}
	 * labeled alternative in {@link GrammarParser#firstRule}.
	 * @param ctx the parse tree
	 */
	void exitVisitComment(GrammarParser.VisitCommentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code blockVisitor}
	 * labeled alternative in {@link GrammarParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterBlockVisitor(GrammarParser.BlockVisitorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code blockVisitor}
	 * labeled alternative in {@link GrammarParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitBlockVisitor(GrammarParser.BlockVisitorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifVisitor}
	 * labeled alternative in {@link GrammarParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterIfVisitor(GrammarParser.IfVisitorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifVisitor}
	 * labeled alternative in {@link GrammarParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitIfVisitor(GrammarParser.IfVisitorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code deklaracePromenne}
	 * labeled alternative in {@link GrammarParser#promenne}.
	 * @param ctx the parse tree
	 */
	void enterDeklaracePromenne(GrammarParser.DeklaracePromenneContext ctx);
	/**
	 * Exit a parse tree produced by the {@code deklaracePromenne}
	 * labeled alternative in {@link GrammarParser#promenne}.
	 * @param ctx the parse tree
	 */
	void exitDeklaracePromenne(GrammarParser.DeklaracePromenneContext ctx);
	/**
	 * Enter a parse tree produced by the {@code inicializacePromenne}
	 * labeled alternative in {@link GrammarParser#promenne}.
	 * @param ctx the parse tree
	 */
	void enterInicializacePromenne(GrammarParser.InicializacePromenneContext ctx);
	/**
	 * Exit a parse tree produced by the {@code inicializacePromenne}
	 * labeled alternative in {@link GrammarParser#promenne}.
	 * @param ctx the parse tree
	 */
	void exitInicializacePromenne(GrammarParser.InicializacePromenneContext ctx);
	/**
	 * Enter a parse tree produced by the {@code visitPromennaFloat}
	 * labeled alternative in {@link GrammarParser#datovyTyp}.
	 * @param ctx the parse tree
	 */
	void enterVisitPromennaFloat(GrammarParser.VisitPromennaFloatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code visitPromennaFloat}
	 * labeled alternative in {@link GrammarParser#datovyTyp}.
	 * @param ctx the parse tree
	 */
	void exitVisitPromennaFloat(GrammarParser.VisitPromennaFloatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code visitPromennaInt}
	 * labeled alternative in {@link GrammarParser#datovyTyp}.
	 * @param ctx the parse tree
	 */
	void enterVisitPromennaInt(GrammarParser.VisitPromennaIntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code visitPromennaInt}
	 * labeled alternative in {@link GrammarParser#datovyTyp}.
	 * @param ctx the parse tree
	 */
	void exitVisitPromennaInt(GrammarParser.VisitPromennaIntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code visitPromennaBoolean}
	 * labeled alternative in {@link GrammarParser#datovyTyp}.
	 * @param ctx the parse tree
	 */
	void enterVisitPromennaBoolean(GrammarParser.VisitPromennaBooleanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code visitPromennaBoolean}
	 * labeled alternative in {@link GrammarParser#datovyTyp}.
	 * @param ctx the parse tree
	 */
	void exitVisitPromennaBoolean(GrammarParser.VisitPromennaBooleanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code visitPromennaString}
	 * labeled alternative in {@link GrammarParser#datovyTyp}.
	 * @param ctx the parse tree
	 */
	void enterVisitPromennaString(GrammarParser.VisitPromennaStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code visitPromennaString}
	 * labeled alternative in {@link GrammarParser#datovyTyp}.
	 * @param ctx the parse tree
	 */
	void exitVisitPromennaString(GrammarParser.VisitPromennaStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code visiterSubExpr}
	 * labeled alternative in {@link GrammarParser#datovyTyp}.
	 * @param ctx the parse tree
	 */
	void enterVisiterSubExpr(GrammarParser.VisiterSubExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code visiterSubExpr}
	 * labeled alternative in {@link GrammarParser#datovyTyp}.
	 * @param ctx the parse tree
	 */
	void exitVisiterSubExpr(GrammarParser.VisiterSubExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code visiterInt}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterVisiterInt(GrammarParser.VisiterIntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code visiterInt}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitVisiterInt(GrammarParser.VisiterIntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code b}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterB(GrammarParser.BContext ctx);
	/**
	 * Exit a parse tree produced by the {@code b}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitB(GrammarParser.BContext ctx);
	/**
	 * Enter a parse tree produced by the {@code visiterBoolean}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterVisiterBoolean(GrammarParser.VisiterBooleanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code visiterBoolean}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitVisiterBoolean(GrammarParser.VisiterBooleanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code visitZavorky}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterVisitZavorky(GrammarParser.VisitZavorkyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code visitZavorky}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitVisitZavorky(GrammarParser.VisitZavorkyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code visiterPromenna}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterVisiterPromenna(GrammarParser.VisiterPromennaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code visiterPromenna}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitVisiterPromenna(GrammarParser.VisiterPromennaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code visiterPlusMinusSpojeni}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterVisiterPlusMinusSpojeni(GrammarParser.VisiterPlusMinusSpojeniContext ctx);
	/**
	 * Exit a parse tree produced by the {@code visiterPlusMinusSpojeni}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitVisiterPlusMinusSpojeni(GrammarParser.VisiterPlusMinusSpojeniContext ctx);
	/**
	 * Enter a parse tree produced by the {@code visitRelacniOperatory}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterVisitRelacniOperatory(GrammarParser.VisitRelacniOperatoryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code visitRelacniOperatory}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitVisitRelacniOperatory(GrammarParser.VisitRelacniOperatoryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code visitAndOr}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterVisitAndOr(GrammarParser.VisitAndOrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code visitAndOr}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitVisitAndOr(GrammarParser.VisitAndOrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code visiterFloat}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterVisiterFloat(GrammarParser.VisiterFloatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code visiterFloat}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitVisiterFloat(GrammarParser.VisiterFloatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code visiterPrvniCast}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterVisiterPrvniCast(GrammarParser.VisiterPrvniCastContext ctx);
	/**
	 * Exit a parse tree produced by the {@code visiterPrvniCast}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitVisiterPrvniCast(GrammarParser.VisiterPrvniCastContext ctx);
	/**
	 * Enter a parse tree produced by the {@code visiterKratDelenoModulo}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterVisiterKratDelenoModulo(GrammarParser.VisiterKratDelenoModuloContext ctx);
	/**
	 * Exit a parse tree produced by the {@code visiterKratDelenoModulo}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitVisiterKratDelenoModulo(GrammarParser.VisiterKratDelenoModuloContext ctx);
	/**
	 * Enter a parse tree produced by the {@code visiterNazev}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterVisiterNazev(GrammarParser.VisiterNazevContext ctx);
	/**
	 * Exit a parse tree produced by the {@code visiterNazev}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitVisiterNazev(GrammarParser.VisiterNazevContext ctx);
	/**
	 * Enter a parse tree produced by the {@code visiterString}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterVisiterString(GrammarParser.VisiterStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code visiterString}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitVisiterString(GrammarParser.VisiterStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code visitLogickeNot}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterVisitLogickeNot(GrammarParser.VisitLogickeNotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code visitLogickeNot}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitVisitLogickeNot(GrammarParser.VisitLogickeNotContext ctx);
}