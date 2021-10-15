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
FINAL_LINEA = \r\n
DIGITO = [0-9]
CARACTER = [A-Za-z]
COMENTARIO = #.*{FINAL_LINEA}
INT = {DIGITO}+
STRING = \".*\"
ID = {CARACTER}({CARACTER}|{DIGITO})


%%

<YYINITIAL> 
{
	"vacio"  		    {return crearToken (sym.VACIO);}
  "principal"     {return crearToken (sym.PRINCIPAL);}
  
  
  "+"  				    {return crearToken (sym.SUMA);}
  "-"  				    {return crearToken (sym.RESTA);}
  "*"  				    {return crearToken (sym.PRODUCTO);}
	"<"  				    {return crearToken (sym.MENOR_QUE);}
	"=="  			    {return crearToken (sym.IGUAL_QUE);}
  "("  				    {return crearToken (sym.PARENTESIS_IZQ);}
	")"  				    {return crearToken (sym.PARENTESIS_DER);}
	"["  				    {return crearToken (sym.CORCHETE_IZQ);}
	"]"  				    {return crearToken (sym.CORCHETE_DER);}
	","  				    {return crearToken (sym.COMA);}
	"."  				    {return crearToken (sym.PUNTO);}
	";"  				    {return crearToken (sym.PUNTO_COMA);}
	":"  				    {return crearToken (sym.DOS_PUNTOS);}
  ".."  	  			{return crearToken (sym.RANGO);}
  "="      				{return crearToken (sym.ASIGNACION);}
  "booleano" 	    {return crearToken (sym.BOOLEANO);}
	"cierto"  	    {return crearToken (sym.CIERTO);}
	"falso"  		    {return crearToken (sym.FALSO);}
	"comienzo" 	    {return crearToken (sym.COMIENZO);}
	"fin"  			    {return crearToken (sym.FIN);}
	"si"  			    {return crearToken (sym.SI);}
	"no"  			    {return crearToken (sym.NO);}
	"sino"  		    {return crearToken (sym.SINO);}
	"y"  				    {return crearToken (sym.Y);}
	"entonces"    	{return crearToken (sym.ENTONCES);}
	"de"  			    {return crearToken (sym.DE);}
	"para"  		    {return crearToken (sym.PARA);}
	"en"  			    {return crearToken (sym.EN);}
	"funcion"  	    {return crearToken (sym.FUNCION);}
	"procedimiento" {return crearToken (sym.PROCEDIMIENTO);}
	"programa"  		{return crearToken (sym.PROGRAMA);}
	"subprogramas"  {return crearToken (sym.SUBPROGRAMAS);}
	"tipos"  	  		{return crearToken (sym.TIPOS);}
	"variables"  		{return crearToken (sym.VARIABLES);}
	"constantes"  	{return crearToken (sym.CONSTANTES);}
	"escribir" 			{return crearToken (sym.ESCRIBIR);}
	"devolver"  		{return crearToken (sym.DEVOLVER);}
	"vector"  			{return crearToken (sym.VECTOR);}
	"entero"  			{return crearToken (sym.ENTERO);}
	"var"  		  		{return crearToken (sym.VAR);}
  {COMENTARIO} {}
  {INT}           {return crearToken (sym.INT);}
  {STRING}        {return crearToken (sym.STRING);}
  {ID}            {return crearToken (sym.ID);}
  {ESPACIO_BLANCO}	{}

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
