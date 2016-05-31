grammar Pew;

file:
    code;

code:
    statement '!' code
    |;

statement:
    decl
    | assign
    | print
    | startLoop
    | endLoop
;

decl:
    'create' ID;

assign:
    ID '=' expr
    | ID '=' ID;

print:
    'pow' expr;

expr:
    addExpr
    |;

addExpr:
    mulExpr
    | addExpr '+' mulExpr;

mulExpr:
    atomExpr
    | mulExpr '*' atomExpr;

atomExpr:
    ID
    | INT
    | '(' expr ')';

startLoop:
    'loop' greaterThanExpr '{' expr
    | 'loop' greaterThanExpr '{' assign;

endLoop:
    '}' code
    |;

greaterThanExpr:
    expr '>' expr;

ID:	('a'..'z')+ ;
INT:	('0'..'9')+ ;
WS:	[ \n\t\r]+ -> skip ;