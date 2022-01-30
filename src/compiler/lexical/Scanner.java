/* The following code was generated by JFlex 1.4.1 on 30.01.2022, 22:14 */

package compiler.lexical;

import compiler.syntax.sym;
import compiler.lexical.Token;
import es.uned.lsi.compiler.lexical.ScannerIF;
import es.uned.lsi.compiler.lexical.LexicalError;
import es.uned.lsi.compiler.lexical.LexicalErrorManager;

// incluir aqui, si es necesario otras importaciones


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.1
 * on 30.01.2022, 22:14 from the specification file
 * <tt>C:/Users/yasma2/OneDrive - UNED/.ProyectosGITHUB/PL1 - Compilador2022/ArquitecturaPLI-2021-2022/doc/specs/scanner.flex</tt>
 */
public class Scanner implements java_cup.runtime.Scanner, ScannerIF {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\1\1\10\1\0\2\1\22\0\1\1\1\50\1\7\1\40"+
    "\2\0\1\47\1\0\1\32\1\33\1\12\1\44\1\41\2\0\1\11"+
    "\12\5\1\43\1\42\1\45\1\46\3\0\4\6\1\23\25\6\1\34"+
    "\1\0\1\35\3\0\1\14\1\22\1\13\1\30\1\20\1\2\2\6"+
    "\1\3\2\6\1\24\1\26\1\4\1\16\1\27\1\6\1\21\1\15"+
    "\1\17\1\31\1\25\4\6\1\36\1\0\1\37\uff82\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\2\3\1\4\2\1\1\5\11\3"+
    "\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15"+
    "\1\16\1\17\1\20\1\21\1\22\1\1\1\23\1\3"+
    "\1\0\1\24\1\0\3\3\1\25\10\3\1\26\1\27"+
    "\1\30\1\31\1\3\1\0\15\3\1\2\1\32\3\3"+
    "\1\33\1\34\10\3\1\35\3\3\1\36\6\3\1\37"+
    "\7\3\1\40\7\3\1\41\2\3\1\42\1\43\3\3"+
    "\1\44\1\3\1\45\1\46\1\3\1\47";

  private static int [] zzUnpackAction() {
    int [] result = new int[124];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\51\0\51\0\122\0\173\0\244\0\315\0\366"+
    "\0\51\0\u011f\0\u0148\0\u0171\0\u019a\0\u01c3\0\u01ec\0\u0215"+
    "\0\u023e\0\u0267\0\51\0\51\0\51\0\51\0\51\0\51"+
    "\0\51\0\51\0\51\0\51\0\u0290\0\51\0\u02b9\0\u02e2"+
    "\0\51\0\u030b\0\315\0\315\0\u0334\0\u035d\0\u0386\0\u03af"+
    "\0\u03d8\0\u0401\0\u042a\0\u0453\0\u047c\0\u04a5\0\u04ce\0\u04f7"+
    "\0\u0520\0\51\0\51\0\51\0\51\0\u0549\0\u0572\0\u059b"+
    "\0\u05c4\0\u05ed\0\u0616\0\u063f\0\u0668\0\u0691\0\u06ba\0\u06e3"+
    "\0\u070c\0\u0735\0\u075e\0\u0787\0\u0334\0\173\0\u07b0\0\u07d9"+
    "\0\u0802\0\173\0\173\0\u082b\0\u0854\0\u087d\0\u08a6\0\u08cf"+
    "\0\u08f8\0\u0921\0\u094a\0\173\0\u0973\0\u099c\0\u09c5\0\173"+
    "\0\u09ee\0\u0a17\0\u0a40\0\u0a69\0\u0a92\0\u0abb\0\173\0\u0ae4"+
    "\0\u0b0d\0\u0b36\0\u0b5f\0\u0b88\0\u0bb1\0\u0bda\0\u0c03\0\u0c2c"+
    "\0\u0c55\0\u0c7e\0\u0ca7\0\u0cd0\0\u0cf9\0\u0d22\0\173\0\u0d4b"+
    "\0\u0d74\0\173\0\173\0\u0d9d\0\u0dc6\0\u0def\0\173\0\u0e18"+
    "\0\173\0\173\0\u0e41\0\173";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[124];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\2\5\1\6\1\5\1\7\1\3"+
    "\1\10\1\11\1\12\1\13\1\14\1\5\1\15\1\16"+
    "\4\5\1\17\1\20\1\21\1\22\1\5\1\23\1\24"+
    "\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34"+
    "\1\35\1\36\1\37\1\40\1\41\53\0\1\5\1\42"+
    "\3\5\4\0\17\5\21\0\5\5\4\0\17\5\24\0"+
    "\1\6\43\0\7\43\1\44\1\0\40\43\12\0\1\45"+
    "\40\0\5\5\4\0\1\5\1\46\1\5\1\47\13\5"+
    "\21\0\5\5\4\0\11\5\1\50\5\5\21\0\1\5"+
    "\1\51\3\5\4\0\17\5\21\0\1\5\1\52\3\5"+
    "\4\0\17\5\21\0\2\5\1\53\2\5\4\0\2\5"+
    "\1\54\14\5\21\0\5\5\4\0\1\5\1\55\15\5"+
    "\21\0\1\5\1\56\3\5\4\0\17\5\21\0\5\5"+
    "\4\0\3\5\1\57\2\5\1\60\10\5\21\0\5\5"+
    "\4\0\5\5\1\61\11\5\63\0\1\62\1\0\1\63"+
    "\50\0\1\64\51\0\1\65\3\0\2\5\1\66\2\5"+
    "\4\0\17\5\17\0\7\45\1\0\2\45\1\67\36\45"+
    "\2\0\5\5\4\0\2\5\1\70\14\5\21\0\2\5"+
    "\1\71\2\5\4\0\6\5\1\72\10\5\21\0\5\5"+
    "\4\0\4\5\1\73\12\5\21\0\2\5\1\74\2\5"+
    "\4\0\17\5\21\0\5\5\4\0\14\5\1\75\2\5"+
    "\21\0\5\5\4\0\4\5\1\76\12\5\21\0\5\5"+
    "\4\0\1\77\16\5\21\0\5\5\4\0\1\100\16\5"+
    "\21\0\5\5\4\0\5\5\1\101\11\5\21\0\5\5"+
    "\4\0\6\5\1\102\10\5\21\0\1\5\1\103\3\5"+
    "\4\0\17\5\21\0\5\5\4\0\12\5\1\104\4\5"+
    "\20\0\1\3\5\5\1\0\1\3\2\0\17\5\17\0"+
    "\7\45\1\0\1\45\1\105\1\67\36\45\2\0\5\5"+
    "\4\0\3\5\1\106\13\5\21\0\5\5\4\0\2\5"+
    "\1\107\14\5\21\0\5\5\4\0\4\5\1\110\12\5"+
    "\21\0\5\5\4\0\5\5\1\111\11\5\21\0\5\5"+
    "\4\0\3\5\1\112\13\5\21\0\5\5\4\0\3\5"+
    "\1\113\13\5\21\0\5\5\4\0\5\5\1\114\11\5"+
    "\21\0\5\5\4\0\6\5\1\115\10\5\21\0\1\5"+
    "\1\116\3\5\4\0\17\5\21\0\2\5\1\117\2\5"+
    "\4\0\17\5\21\0\5\5\4\0\15\5\1\120\1\5"+
    "\21\0\2\5\1\121\2\5\4\0\17\5\21\0\5\5"+
    "\4\0\16\5\1\122\21\0\5\5\4\0\4\5\1\123"+
    "\12\5\21\0\5\5\4\0\5\5\1\124\11\5\21\0"+
    "\5\5\4\0\6\5\1\125\10\5\21\0\5\5\4\0"+
    "\6\5\1\126\10\5\21\0\1\5\1\127\3\5\4\0"+
    "\17\5\21\0\5\5\4\0\3\5\1\130\13\5\21\0"+
    "\5\5\4\0\4\5\1\131\12\5\21\0\5\5\4\0"+
    "\5\5\1\132\11\5\21\0\5\5\4\0\1\133\16\5"+
    "\21\0\5\5\4\0\5\5\1\134\11\5\21\0\5\5"+
    "\4\0\1\5\1\135\15\5\21\0\2\5\1\136\2\5"+
    "\4\0\17\5\21\0\5\5\4\0\3\5\1\137\13\5"+
    "\21\0\5\5\4\0\7\5\1\140\7\5\21\0\5\5"+
    "\4\0\6\5\1\141\10\5\21\0\1\142\4\5\4\0"+
    "\17\5\21\0\1\5\1\143\3\5\4\0\17\5\21\0"+
    "\5\5\4\0\11\5\1\144\5\5\21\0\2\5\1\145"+
    "\2\5\4\0\17\5\21\0\5\5\4\0\1\5\1\146"+
    "\15\5\21\0\5\5\4\0\5\5\1\147\11\5\21\0"+
    "\5\5\4\0\1\5\1\150\15\5\21\0\5\5\4\0"+
    "\5\5\1\151\11\5\21\0\5\5\4\0\14\5\1\152"+
    "\2\5\21\0\5\5\4\0\12\5\1\153\4\5\21\0"+
    "\5\5\4\0\4\5\1\154\12\5\21\0\5\5\4\0"+
    "\4\5\1\155\12\5\21\0\5\5\4\0\10\5\1\156"+
    "\6\5\21\0\5\5\4\0\2\5\1\157\14\5\21\0"+
    "\5\5\4\0\1\160\16\5\21\0\5\5\4\0\1\5"+
    "\1\161\15\5\21\0\5\5\4\0\5\5\1\162\11\5"+
    "\21\0\5\5\4\0\5\5\1\163\11\5\21\0\1\5"+
    "\1\164\3\5\4\0\17\5\21\0\2\5\1\165\2\5"+
    "\4\0\17\5\21\0\5\5\4\0\4\5\1\166\12\5"+
    "\21\0\5\5\4\0\11\5\1\167\5\5\21\0\5\5"+
    "\4\0\12\5\1\170\4\5\21\0\5\5\4\0\4\5"+
    "\1\171\12\5\21\0\5\5\4\0\3\5\1\172\13\5"+
    "\21\0\5\5\4\0\1\5\1\173\15\5\21\0\5\5"+
    "\4\0\2\5\1\174\14\5\17\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[3690];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\2\11\5\1\1\11\11\1\12\11\1\1\1\11"+
    "\2\1\1\11\1\1\1\0\1\1\1\0\14\1\4\11"+
    "\1\1\1\0\105\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[124];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the textposition at the last state to be included in yytext */
  private int zzPushbackPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
	LexicalErrorManager lexicalErrorManager = new LexicalErrorManager ();
  	private int commentCount = 0;

    Token crearToken(int x) {
    	Token token = new Token(x);
    	token.setLine(yyline + 1);
    	token.setColumn(yycolumn + 1);
    	token.setLexema(yytext());
    	return token;
  	}


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public Scanner(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  public Scanner(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 116) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzPushbackPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead < 0) {
      return true;
    }
    else {
      zzEndRead+= numRead;
      return false;
    }
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = zzPushbackPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) throws LexicalError {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new LexicalError(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  throws LexicalError {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException, LexicalError {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      yychar+= zzMarkedPosL-zzStartRead;

      boolean zzR = false;
      for (zzCurrentPosL = zzStartRead; zzCurrentPosL < zzMarkedPosL;
                                                             zzCurrentPosL++) {
        switch (zzBufferL[zzCurrentPosL]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn++;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = zzLexicalState;


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 39: 
          { return crearToken(sym.ALTERNATIVAS);
          }
        case 40: break;
        case 3: 
          { return crearToken (sym.ID);
          }
        case 41: break;
        case 36: 
          { return crearToken(sym.PRINCIPAL);
          }
        case 42: break;
        case 9: 
          { return crearToken(sym.CORCHETE_CERRAR);
          }
        case 43: break;
        case 8: 
          { return crearToken(sym.CORCHETE_ABRIR);
          }
        case 44: break;
        case 14: 
          { return crearToken(sym.PUNTO_COMA);
          }
        case 45: break;
        case 20: 
          { return crearToken (sym.STRING);
          }
        case 46: break;
        case 38: 
          { return crearToken(sym.PORDEFECTO);
          }
        case 47: break;
        case 6: 
          { return crearToken(sym.PARENTESIS_ABRIR);
          }
        case 48: break;
        case 19: 
          { return crearToken(sym.NEGACION);
          }
        case 49: break;
        case 35: 
          { return crearToken(sym.CONSTANTE);
          }
        case 50: break;
        case 4: 
          { return crearToken (sym.INT);
          }
        case 51: break;
        case 12: 
          { return crearToken(sym.ALMOHADILLA);
          }
        case 52: break;
        case 29: 
          { return crearToken(sym.CORTE);
          }
        case 53: break;
        case 18: 
          { return crearToken(sym.ASIGNACION);
          }
        case 54: break;
        case 16: 
          { return crearToken(sym.SUMA);
          }
        case 55: break;
        case 26: 
          { return crearToken(sym.CASO);
          }
        case 56: break;
        case 27: 
          { return crearToken(sym.SINO);
          }
        case 57: break;
        case 34: 
          { return crearToken(sym.DEVUELVE);
          }
        case 58: break;
        case 37: 
          { return crearToken(sym.ESCRIBE_ENT);
          }
        case 59: break;
        case 32: 
          { return crearToken(sym.ESCRIBE);
          }
        case 60: break;
        case 30: 
          { return crearToken(sym.VACIO);
          }
        case 61: break;
        case 33: 
          { return crearToken(sym.MIENTRAS);
          }
        case 62: break;
        case 31: 
          { return crearToken(sym.ENTERO);
          }
        case 63: break;
        case 25: 
          { return crearToken(sym.CONJUNCION);
          }
        case 64: break;
        case 11: 
          { return crearToken(sym.LLAVE_CERRAR);
          }
        case 65: break;
        case 21: 
          { return crearToken(sym.SI);
          }
        case 66: break;
        case 22: 
          { return crearToken(sym.AUTOINCREMENTO);
          }
        case 67: break;
        case 5: 
          { return crearToken(sym.PRODUCTO);
          }
        case 68: break;
        case 7: 
          { return crearToken(sym.PARENTESIS_CERRAR);
          }
        case 69: break;
        case 17: 
          { return crearToken(sym.MENOR);
          }
        case 70: break;
        case 24: 
          { return crearToken(sym.IGUAL);
          }
        case 71: break;
        case 1: 
          { LexicalError error = new LexicalError ();
                           error.setLine (yyline + 1);
                           error.setColumn (yycolumn + 1);
                           error.setLexema (yytext ());
                           lexicalErrorManager.lexicalError (error);
          }
        case 72: break;
        case 23: 
          { return crearToken(sym.ASIGNACION_SUMA);
          }
        case 73: break;
        case 13: 
          { return crearToken(sym.COMA);
          }
        case 74: break;
        case 28: 
          { return crearToken(sym.TIPO);
          }
        case 75: break;
        case 10: 
          { return crearToken(sym.LLAVE_ABRIR);
          }
        case 76: break;
        case 2: 
          { 
          }
        case 77: break;
        case 15: 
          { return crearToken(sym.DOS_PUNTOS);
          }
        case 78: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
              { return new java_cup.runtime.Symbol(sym.EOF); }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
