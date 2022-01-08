package compiler.lexical;

import compiler.syntax.sym;
import compiler.lexical.Token;
import es.uned.lsi.compiler.lexical.ScannerIF;
import es.uned.lsi.compiler.lexical.LexicalError;
import es.uned.lsi.compiler.lexical.LexicalErrorManager;

// incluir aqui, si es necesario otras importaciones

%%
 
%public
%class Scanner
%char
%line
%column
%cup
%unicode


%implements ScannerIF
%scanerror LexicalError

// incluir aqui, si es necesario otras directivas

%{
  LexicalErrorManager lexicalErrorManager = new LexicalErrorManager ();
  private int commentCount = 0;

    Token crearToken(int x) {
    Token token = new Token(x);
    token.setLine(yyline + 1);
    token.setColumn(yycolumn + 1);
    token.setLexema(yytext());
    return token;
  }
%}  
  

ESPACIO_BLANCO = [ \t\r\n\f]
fin = "fin"{ESPACIO_BLANCO}
DIGITO = [0-9]
CARACTER = [A-Za-z]
INT = {DIGITO}+
STRING = \".*\"
INICIO_COMENTARIO = ("/*")
FINAL_COMENTARIO = ("*/")
CADENA_TEXTO = [^\"]*
COMENTARIO = {INICIO_COMENTARIO}{CADENA_TEXTO}{FINAL_COMENTARIO}
ID = {CARACTER}({CARACTER}|{DIGITO})*


%%

<YYINITIAL> 
{
   			       
    "#"					{return crearToken(sym.ALMOHADILLA);}
	"constante"			{return crearToken(sym.CONSTANTE);}
	";"					{return crearToken(sym.PUNTO_COMA);}
	"tipo"				{return crearToken(sym.TIPO);}
	"entero"    		{return crearToken(sym.ENTERO);}
	"["					{return crearToken(sym.CORCHETE_ABRIR);}
	"]"					{return crearToken(sym.CORCHETE_CERRAR);}
	","					{return crearToken(sym.COMA);}
	"="					{return crearToken(sym.ASIGNACION);}
	"("					{return crearToken(sym.PARENTESIS_ABRIR);}
	")"					{return crearToken(sym.PARENTESIS_CERRAR);}
	"{"					{return crearToken(sym.LLAVE_ABRIR);}
	"}"					{return crearToken(sym.LLAVE_CERRAR);}	
	"vacio"				{return crearToken(sym.VACIO);}
	"principal"			{return crearToken(sym.PRINCIPAL);}
	"+"					{return crearToken(sym.SUMA);}
	"*"					{return crearToken(sym.PRODUCTO);}
	"=="				{return crearToken(sym.IGUAL);}
	"<"					{return crearToken(sym.MENOR);}
	"&&"				{return crearToken(sym.CONJUNCION);}
	"!"					{return crearToken(sym.NEGACION);}
	"++"				{return crearToken(sym.AUTOINCREMENTO);}
	"escribe"			{return crearToken(sym.ESCRIBE);}
	"escribeEnt"		{return crearToken(sym.ESCRIBE_ENT);}
	"+="				{return crearToken(sym.ASIGNACION_SUMA);}
	"si"				{return crearToken(sym.SI);}
	"sino"				{return crearToken(sym.SINO);}
	"alternativas"		{return crearToken(sym.ALTERNATIVAS);}
	"caso"				{return crearToken(sym.CASO);}
	":"					{return crearToken(sym.DOS_PUNTOS);}
	"corte"				{return crearToken(sym.CORTE);}
	"pordefecto"		{return crearToken(sym.PORDEFECTO);}
	"mientras"			{return crearToken(sym.MIENTRAS);}

	{ESPACIO_BLANCO}	{}
	{COMENTARIO}		{}
	{ID}				{return crearToken (sym.ID);}
	{INT}	       		{return crearToken (sym.INT);}
	{STRING}	    	{return crearToken (sym.STRING);}


{fin} {}
    
    // error en caso de coincidir con ningun patron
	[^]     
                        {                                               
                           LexicalError error = new LexicalError ();
                           error.setLine (yyline + 1);
                           error.setColumn (yycolumn + 1);
                           error.setLexema (yytext ());
                           lexicalErrorManager.lexicalError (error);
                        } 
}