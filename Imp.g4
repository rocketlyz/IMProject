grammar Imp;
options{
    language = Java;
}

init:comlist;
comlist:(com)*;
block:'{'(com)*'}'|com?;
com:ifstmt
    |whilestmt
    |evalue;
evalue:ID ':='(aexp|bexp) ';';
ifstmt:IF bexp THEN block ELSE block
        |IF bexp THEN block
        ;
whilestmt:WHILE bexp DO block;

aexp:addaexp;
addaexp:mulaexp (('+'|'-')mulaexp)*;
mulaexp:aexpatom (('*'|'/')aexpatom)*;
aexpatom:INT
            |ID
            |'('addaexp')'
            ;

bexp:orbexp;
orbexp:andbexp (OR andbexp)*;
andbexp:equalbexp (AND equalbexp)*;
equalbexp: aexpatom (('<'|'<='|'>'|'=')aexpatom)+
            |NOR? bexpatom;
bexpatom: TRUE
        |FALSE
        |'('orbexp')'
      ;
atom:aexpatom|bexpatom;

fragment DIGIT:[0-9];

IF:'if';
THEN:'then';
ELSE:'else';
DO:'do';
WHILE:'while';
//AND:'∧'; // \u2227
AND:'&';
//OR:'∨'; // \u2228
OR:'|';
//NOR:'﹁';// \ufe41
NOR:'~';
TRUE:'true';
FALSE:'false';

ID: [a-zA-Z]+;
INT:'0'|[1-9]DIGIT*;
NEWLINE:'\r'?'\n'; //？表示\r出现0或1次
WS:[' '\t|\r|\n]+->skip;