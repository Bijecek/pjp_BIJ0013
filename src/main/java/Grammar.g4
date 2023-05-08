grammar Grammar;

prog: stat+ EOF;

stat: firstRule
        | condition
        ;

firstRule:  'read' (VARIABLE ',')* VARIABLE (STREDNIK)+                                    #readVisitor
         | 'write' (expression ','?)+ (STREDNIK)+                                   #writeVisitor
         | promenne (STREDNIK)+                                    #visiterPromenne
         | expression (STREDNIK)+                                    #asa
         | COMMENT                                                          #visitComment
         ;

condition: 'if' '(' expression ')' '{' firstRule (','? firstRule)* '}'                                 #blockVisitor
          | 'if' '(' expression ')' firstRule* ('else' firstRule*)?                                    #ifVisitor
          | 'while' '(' expression ')' '{' firstRule (','? firstRule)* '}'                             #whileBlock
          ;
promenne: DATOVY_TYP (VARIABLE ',')* VARIABLE (PRIRAZENI (datovyTyp ('+'|'-'|'*'|'/')?)*)?         #deklaracePromenne
        | VARIABLE (PRIRAZENI VARIABLE)* PRIRAZENI ((datovyTyp | VARIABLE) op=('+'|'-'|'*'|'/')?)+      #inicializacePromenne
        ;

datovyTyp: FLOAT                                                 #visitPromennaFloat
        |INT                                                     #visitPromennaInt
        |BOOLEAN                                                 #visitPromennaBoolean
        |STRING                                                  #visitPromennaString
        | '-'datovyTyp                                           #visiterSubExpr
        ;

expression: STRINGSPECIAL                                       #visiterNazev
         | STRINGFIRSTPART                                      #visiterPrvniCast
         | STRING                                               #visiterString
         | VARIABLE                                             #visiterPromenna
         | FLOAT                                                #visiterFloat
         | INT                                                  #visiterInt
         | BOOLEAN                                              #visiterBoolean
         | expression op=('+'|'-'|'.') expression            #visiterPlusMinusSpojeni
         | expression op=('*'|'/'|'%') expression            #visiterKratDelenoModulo
         | expression (MODULO) expression                       #b
         | expression (RELACNI_OPERATORY_POROVNANI) expression            #visitRelacniOperatory
         | expression (LOGICKEANDOR) expression                 #visitAndOr
         | expression (SPOJENI_RETEZCU) expression              #b
         | '(' expression ')'                                   #visitZavorky
         | LOGICKENOT expression                                #visitLogickeNot
         ;



//LEXER

//Promenne
DATOVY_TYP: ('int'|'float'|'string'|'bool');

//Statementy
STREDNIK: ';';

//Math symboly
MINUS: '-';
MODULO: '%';
SPOJENI_RETEZCU: '.';
RELACNI_OPERATORY_POROVNANI: '<'|'>'|'=='|'!=';
LOGICKEANDOR: '&&'|'||';
LOGICKENOT: '!';
PRIRAZENI: '=';


//Identifikatory
FLOAT: ([0-9]+ '.' [0-9]+);
INT : [0-9]+ ;
BOOLEAN : 'true' | 'false';
VARIABLE: [a-zA-Z] [a-zA-Z0-9]*;
STRINGSPECIAL: '"<' [a-zA-Z-(), ]+ '>"';
STRINGFIRSTPART : '"' ' '? [a-zA-Z0-9.()+*/%=,<>==!= ]* '-'? [a-zA-Z0-9.()+*/%=,<>==!= ]* ':' ' '? '"';
STRING: ('"' [a-zA-Z0-9=,()+. ]+ '"') | '""';

//COMMENT: ('//' [a-zA-Z0-9.()"*-+/%, ]+ ';') |  ('//' [a-zA-Z0-9.()"*-+/%,]+ ' ');
COMMENT: '//' [a-zA-Z0-9.()"*-+/%, ]+ ';'?;

WS : [ \t\r\n]+ -> skip ;   // toss out whitespace



