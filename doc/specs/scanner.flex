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
	// Palabras reservadas
   	"caso"				{return crearToken(sym.CASO);}
   "constante"			{return crearToken(sym.CONSTANTE);}
   "corte"				{return crearToken(sym.CORTE);}		       
    "entero"    		{return crearToken(sym.ENTERO);}
	"escribe"			{return crearToken(sym.ESCRIBE);}
	"escribeEnt"		{return crearToken(sym.ESCRIBE_ENT);}
	"alternativas"		{return crearToken(sym.ALTERNATIVAS);}
	"mientras"			{return crearToken(sym.MIENTRAS);}
	"pordefecto"		{return crearToken(sym.PORDEFECTO);}
	"principal"			{return crearToken(sym.PRINCIPAL);}
	"devuelve"			{return crearToken(sym.DEVUELVE);}
	"si"				{return crearToken(sym.SI);}
	"sino"				{return crearToken(sym.SINO);}
	"tipo"				{return crearToken(sym.TIPO);}
	"vacio"				{return crearToken(sym.VACIO);}
	
	// Delimitadores
	"("					{return crearToken(sym.PARENTESIS_ABRIR);}
	")"					{return crearToken(sym.PARENTESIS_CERRAR);}
	"["					{return crearToken(sym.CORCHETE_ABRIR);}
	"]"					{return crearToken(sym.CORCHETE_CERRAR);}
	"{"					{return crearToken(sym.LLAVE_ABRIR);}
	"}"					{return crearToken(sym.LLAVE_CERRAR);}	
	"#"					{return crearToken(sym.ALMOHADILLA);}
	","					{return crearToken(sym.COMA);}
	";"					{return crearToken(sym.PUNTO_COMA);}
	":"					{return crearToken(sym.DOS_PUNTOS);}

	// Operadores
	"+"					{return crearToken(sym.SUMA);}
	"*"					{return crearToken(sym.PRODUCTO);}
	"<"					{return crearToken(sym.MENOR);}
	"=="				{return crearToken(sym.IGUAL);}
	"&&"				{return crearToken(sym.CONJUNCION);}
	"!"					{return crearToken(sym.NEGACION);}
	"++"				{return crearToken(sym.AUTOINCREMENTO);}
	"="					{return crearToken(sym.ASIGNACION);}
	"+="				{return crearToken(sym.ASIGNACION_SUMA);}

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