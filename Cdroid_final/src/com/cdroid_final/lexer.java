/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.cdroid_final;

/**
 *
 * @author anita
 *//* The following code was generated by JFlex 1.5.1 */



/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.5.1
 * from the specification file <tt>test.lex</tt>
 */
class Yylex implements YYParser.Lexer{
int linenum=1;
String error="";
  
  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\45\1\44\1\50\1\51\1\43\22\0\1\45\1\32\1\46"+
    "\2\0\1\41\1\35\1\0\1\52\1\53\1\37\1\33\1\57\1\34"+
    "\1\0\1\40\12\2\1\64\1\54\1\27\1\31\1\30\1\63\1\0"+
    "\32\1\1\55\1\47\1\56\1\42\1\3\1\0\1\15\1\24\1\13"+
    "\1\22\1\7\1\11\1\21\1\14\1\5\2\1\1\12\1\1\1\20"+
    "\1\10\2\1\1\16\1\4\1\17\1\23\1\25\1\26\2\1\1\6"+
    "\1\60\1\36\1\61\1\62\6\0\1\50\u1fa2\0\1\50\1\50\udfd6\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\0\13\1\1\3\1\4\1\5"+
    "\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15"+
    "\1\16\2\17\1\20\1\0\1\21\1\22\1\23\1\24"+
    "\1\25\1\26\1\27\1\30\1\31\1\32\1\33\3\1"+
    "\1\34\10\1\1\35\3\1\1\36\1\37\1\40\1\41"+
    "\1\42\1\43\1\44\1\45\1\46\1\47\1\50\1\51"+
    "\1\52\1\53\1\54\1\55\1\56\1\57\1\60\1\0"+
    "\3\1\1\61\1\1\1\62\12\1\1\63\1\64\3\1"+
    "\1\65\1\1\1\66\1\1\1\67\3\1\1\70\4\1"+
    "\1\71\1\72\1\73\4\1\1\74\1\75\1\76\1\77"+
    "\1\100\4\1\1\101\1\102";

  private static int [] zzUnpackAction() {
    int [] result = new int[130];
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
    "\0\0\0\65\0\152\0\237\0\324\0\u0109\0\u013e\0\u0173"+
    "\0\u01a8\0\u01dd\0\u0212\0\u0247\0\u027c\0\u02b1\0\u02e6\0\u031b"+
    "\0\u0350\0\u0385\0\u03ba\0\u03ef\0\u0424\0\u0459\0\u048e\0\u04c3"+
    "\0\u04f8\0\u052d\0\u0562\0\u0597\0\u05cc\0\u0601\0\u0636\0\u05cc"+
    "\0\u05cc\0\u05cc\0\u05cc\0\u05cc\0\u05cc\0\u05cc\0\u05cc\0\u05cc"+
    "\0\u05cc\0\u05cc\0\u066b\0\u06a0\0\u06d5\0\u066b\0\u070a\0\u073f"+
    "\0\u0774\0\u07a9\0\u07de\0\u0813\0\u0848\0\u087d\0\u08b2\0\u08e7"+
    "\0\u091c\0\u0951\0\u0986\0\u05cc\0\u09bb\0\u05cc\0\u05cc\0\u05cc"+
    "\0\u05cc\0\u05cc\0\u05cc\0\u05cc\0\u05cc\0\u05cc\0\u05cc\0\u05cc"+
    "\0\u05cc\0\u05cc\0\u05cc\0\u05cc\0\u05cc\0\u09f0\0\u0a25\0\u0a5a"+
    "\0\u0a8f\0\u066b\0\u0ac4\0\u066b\0\u0af9\0\u0b2e\0\u0b63\0\u0b98"+
    "\0\u0bcd\0\u0c02\0\u0c37\0\u0c6c\0\u0ca1\0\u0cd6\0\u05cc\0\u05cc"+
    "\0\u0d0b\0\u0d40\0\u0d75\0\u066b\0\u0daa\0\u066b\0\u0ddf\0\u066b"+
    "\0\u0e14\0\u0e49\0\u0e7e\0\u066b\0\u0eb3\0\u0ee8\0\u0f1d\0\u0f52"+
    "\0\u066b\0\u066b\0\u066b\0\u0f87\0\u0fbc\0\u0ff1\0\u1026\0\u066b"+
    "\0\u066b\0\u066b\0\u066b\0\u066b\0\u105b\0\u1090\0\u10c5\0\u10fa"+
    "\0\u066b\0\u066b";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[130];
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
    "\1\0\1\2\1\3\1\4\1\5\1\6\1\2\1\7"+
    "\1\2\1\10\1\11\1\12\2\2\1\13\3\2\1\14"+
    "\1\15\1\2\1\16\1\17\1\20\1\21\1\22\1\23"+
    "\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33"+
    "\1\34\1\35\1\36\1\37\2\0\1\36\1\40\1\41"+
    "\1\42\1\43\1\44\1\45\1\46\1\47\1\50\1\51"+
    "\1\52\1\0\26\53\17\0\1\37\20\0\1\3\130\0"+
    "\1\37\17\0\4\53\1\54\6\53\1\55\12\53\17\0"+
    "\1\37\17\0\10\53\1\56\6\53\1\57\6\53\17\0"+
    "\1\37\17\0\11\53\1\60\14\53\17\0\1\37\17\0"+
    "\7\53\1\61\1\53\1\62\14\53\17\0\1\37\17\0"+
    "\7\53\1\63\16\53\17\0\1\37\17\0\7\53\1\64"+
    "\3\53\1\65\12\53\17\0\1\37\17\0\6\53\1\66"+
    "\17\53\17\0\1\37\17\0\7\53\1\67\16\53\17\0"+
    "\1\37\17\0\17\53\1\70\6\53\17\0\1\37\17\0"+
    "\7\53\1\71\16\53\17\0\1\37\17\0\13\53\1\72"+
    "\12\53\17\0\1\37\45\0\1\73\1\0\1\74\63\0"+
    "\1\75\1\76\64\0\1\77\64\0\1\100\64\0\1\101"+
    "\1\0\1\102\62\0\1\103\2\0\1\104\61\0\1\105"+
    "\3\0\1\106\60\0\1\107\4\0\1\110\57\0\1\111"+
    "\64\0\1\112\64\0\1\113\64\0\1\114\77\0\1\35"+
    "\152\0\1\36\3\0\1\36\13\0\46\37\1\115\1\116"+
    "\15\37\1\0\26\53\37\0\5\53\1\117\12\53\1\120"+
    "\5\53\37\0\7\53\1\121\16\53\37\0\16\53\1\122"+
    "\7\53\37\0\3\53\1\123\22\53\37\0\15\53\1\124"+
    "\10\53\37\0\7\53\1\125\16\53\37\0\17\53\1\126"+
    "\6\53\37\0\17\53\1\127\6\53\37\0\14\53\1\130"+
    "\11\53\37\0\16\53\1\131\7\53\37\0\22\53\1\132"+
    "\3\53\37\0\3\53\1\133\22\53\37\0\4\53\1\134"+
    "\4\53\1\135\14\53\37\0\4\53\1\136\21\53\67\0"+
    "\1\137\64\0\1\140\33\0\43\37\2\0\3\37\2\0"+
    "\13\37\1\0\6\53\1\141\17\53\37\0\17\53\1\142"+
    "\6\53\37\0\15\53\1\143\10\53\37\0\6\53\1\144"+
    "\17\53\37\0\14\53\1\145\11\53\37\0\20\53\1\146"+
    "\5\53\37\0\3\53\1\147\22\53\37\0\15\53\1\150"+
    "\10\53\37\0\22\53\1\151\3\53\37\0\23\53\1\152"+
    "\2\53\37\0\4\53\1\153\21\53\37\0\21\53\1\154"+
    "\4\53\37\0\14\53\1\155\11\53\37\0\11\53\1\156"+
    "\14\53\37\0\7\53\1\157\16\53\37\0\6\53\1\160"+
    "\17\53\37\0\16\53\1\161\7\53\37\0\16\53\1\162"+
    "\7\53\37\0\16\53\1\163\7\53\37\0\15\53\1\164"+
    "\10\53\37\0\11\53\1\165\14\53\37\0\20\53\1\166"+
    "\5\53\37\0\16\53\1\167\7\53\37\0\6\53\1\170"+
    "\17\53\37\0\10\53\1\171\15\53\37\0\21\53\1\172"+
    "\4\53\37\0\17\53\1\173\6\53\37\0\6\53\1\174"+
    "\17\53\37\0\17\53\1\175\6\53\37\0\4\53\1\176"+
    "\21\53\37\0\6\53\1\177\17\53\37\0\11\53\1\200"+
    "\14\53\37\0\21\53\1\201\4\53\37\0\6\53\1\202"+
    "\17\53\36\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[4399];
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
    "\1\0\2\1\1\0\30\1\1\11\1\1\1\0\13\11"+
    "\21\1\1\11\1\1\20\11\1\0\20\1\2\11\42\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[130];
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


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Yylex(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  Yylex(java.io.InputStream in) {
    this(new java.io.InputStreamReader
             (in, java.nio.charset.Charset.forName("UTF-8")));
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
    while (i < 140) {
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

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

    // numRead < 0
    return true;
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
   * Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
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
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public int yylex() throws java.io.IOException {
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

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


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

          zzAttributes = zzAttrL[zzState];
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
        case 1: 
          { return YYParser.IDENTIFIER;
          }
        case 67: break;
        case 2: 
          { return YYParser.CONSTANT;
          }
        case 68: break;
        case 3: 
          { return YYParser.LESS_THAN;
          }
        case 69: break;
        case 4: 
          { return YYParser.GREATER_THAN;
          }
        case 70: break;
        case 5: 
          { return YYParser.EQUAL_TO;
          }
        case 71: break;
        case 6: 
          { return YYParser.NOT_OPERATOR;
          }
        case 72: break;
        case 7: 
          { return YYParser.PLUS_OPERATOR;
          }
        case 73: break;
        case 8: 
          { return YYParser.MINUS_OPERATOR;
          }
        case 74: break;
        case 9: 
          { return YYParser.AND_OPERATOR;
          }
        case 75: break;
        case 10: 
          { return YYParser.OR_OPERATOR;
          }
        case 76: break;
        case 11: 
          { return YYParser.MUL_OPERATOR;
          }
        case 77: break;
        case 12: 
          { return YYParser.DIV_OPERATOR;
          }
        case 78: break;
        case 13: 
          { return YYParser.MOD_OPERATOR;
          }
        case 79: break;
        case 14: 
          { return YYParser.XOR_OPERATOR;
          }
        case 80: break;
        case 15: 
          { linenum++;
									/* ignore */
          }
        case 81: break;
        case 16: 
          { /* ignore */
          }
        case 82: break;
        case 17: 
          { return YYParser.LEFT_PARENTHESIS;
          }
        case 83: break;
        case 18: 
          { return YYParser.RIGHT_PARENTHESIS;
          }
        case 84: break;
        case 19: 
          { return YYParser.SEMI_COLON;
          }
        case 85: break;
        case 20: 
          { return YYParser.LEFT_SQUAREBRACKET;
          }
        case 86: break;
        case 21: 
          { return YYParser.RIGHT_SQUAREBRACKET;
          }
        case 87: break;
        case 22: 
          { return YYParser.COMMA;
          }
        case 88: break;
        case 23: 
          { return YYParser.LEFT_CURLYBRACE;
          }
        case 89: break;
        case 24: 
          { return YYParser.RIGHT_CURLYBRACE;
          }
        case 90: break;
        case 25: 
          { return YYParser.NEGATION;
          }
        case 91: break;
        case 26: 
          { return YYParser.CONDITIONAL_OP1;
          }
        case 92: break;
        case 27: 
          { return YYParser.CONDITIONAL_OP2;
          }
        case 93: break;
        case 28: 
          { return YYParser.IF;
          }
        case 94: break;
        case 29: 
          { return YYParser.DO;
          }
        case 95: break;
        case 30: 
          { return YYParser.LEFT_OP;
          }
        case 96: break;
        case 31: 
          { return YYParser.LE_OP;
          }
        case 97: break;
        case 32: 
          { return YYParser.RIGHT_OP;
          }
        case 98: break;
        case 33: 
          { return YYParser.GE_OP;
          }
        case 99: break;
        case 34: 
          { return YYParser.EQ_OP;
          }
        case 100: break;
        case 35: 
          { return YYParser.NE_OP;
          }
        case 101: break;
        case 36: 
          { return YYParser.ADD_ASSIGN;
          }
        case 102: break;
        case 37: 
          { return YYParser.INC_OP;
          }
        case 103: break;
        case 38: 
          { return YYParser.SUB_ASSIGN;
          }
        case 104: break;
        case 39: 
          { return YYParser.DEC_OP;
          }
        case 105: break;
        case 40: 
          { return YYParser.AND_ASSIGN;
          }
        case 106: break;
        case 41: 
          { return YYParser.AND_OP;
          }
        case 107: break;
        case 42: 
          { return YYParser.OR_ASSIGN;
          }
        case 108: break;
        case 43: 
          { return YYParser.OR_OP;
          }
        case 109: break;
        case 44: 
          { return YYParser.MUL_ASSIGN;
          }
        case 110: break;
        case 45: 
          { return YYParser.DIV_ASSIGN;
          }
        case 111: break;
        case 46: 
          { return YYParser.MOD_ASSIGN;
          }
        case 112: break;
        case 47: 
          { return YYParser.XOR_ASSIGN;
          }
        case 113: break;
        case 48: 
          { return YYParser.STRING_LITERAL;
          }
        case 114: break;
        case 49: 
          { return YYParser.INT;
          }
        case 115: break;
        case 50: 
          { return YYParser.FOR;
          }
        case 116: break;
        case 51: 
          { return YYParser.LEFT_ASSIGN;
          }
        case 117: break;
        case 52: 
          { return YYParser.RIGHT_ASSIGN;
          }
        case 118: break;
        case 53: 
          { return YYParser.ELSE;
          }
        case 119: break;
        case 54: 
          { return YYParser.LONG;
          }
        case 120: break;
        case 55: 
          { return YYParser.CHAR;
          }
        case 121: break;
        case 56: 
          { return YYParser.VOID;
          }
        case 122: break;
        case 57: 
          { return YYParser.SHORT;
          }
        case 123: break;
        case 58: 
          { return YYParser.FLOAT;
          }
        case 124: break;
        case 59: 
          { return YYParser.CONST;
          }
        case 125: break;
        case 60: 
          { return YYParser.WHILE;
          }
        case 126: break;
        case 61: 
          { return YYParser.SIZEOF;
          }
        case 127: break;
        case 62: 
          { return YYParser.SIGNED;
          }
        case 128: break;
        case 63: 
          { return YYParser.RETURN;
          }
        case 129: break;
        case 64: 
          { return YYParser.DOUBLE;
          }
        case 130: break;
        case 65: 
          { return YYParser.UNSIGNED;
          }
        case 131: break;
        case 66: 
          { return YYParser.VOLATILE;
          }
        case 132: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
              { return -1;
 }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


  @Override
    public nodeclass getLVal() {
        nodeclass temp = new nodeclass();
       temp.value=yytext();
return        temp;
//  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void yyerror(String s) {
        
        error+=("\n Parser Error"); 
        error+=("\nError at line number : "+linenum+"  before : "+yytext());
//       throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
