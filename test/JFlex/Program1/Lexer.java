/* The following code was generated by JFlex 1.4.3 on 2/21/12 7:21 PM */

import java_cup.runtime.*;



/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 2/21/12 7:21 PM from the specification file
 * <tt>C:/Users/Rob/Desktop/Study Abroad Classes/Compilers/test/JFlex/Program1/Program1edit.flex</tt>
 */
class Lexer implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int ERROR = 2;
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1, 1
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\26\1\26\1\0\2\26\22\0\1\47\1\41\1\17\3\0"+
    "\1\42\1\16\1\52\1\25\1\24\1\43\1\51\1\44\1\5\1\23"+
    "\1\3\11\2\1\46\1\50\1\37\1\36\1\40\2\0\32\1\1\20"+
    "\1\0\1\21\1\45\2\0\1\13\1\32\1\34\1\56\1\11\1\12"+
    "\1\1\1\35\1\27\2\1\1\14\1\1\1\30\1\31\1\33\1\1"+
    "\1\7\1\15\1\6\1\10\1\57\1\55\3\1\1\53\1\22\1\54"+
    "\u05e2\0\12\4\206\0\12\4\u026c\0\12\4\166\0\12\4\166\0\12\4"+
    "\166\0\12\4\166\0\12\4\167\0\11\4\166\0\12\4\166\0\12\4"+
    "\166\0\12\4\340\0\12\4\166\0\12\4\106\0\12\4\u0116\0\12\4"+
    "\u031f\0\11\4\u046e\0\12\4\46\0\12\4\u012c\0\12\4\ue5c0\0\12\4"+
    "\346\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\2\0\1\1\1\2\2\3\1\1\1\4\7\2\2\1"+
    "\1\5\1\6\1\1\1\7\1\10\1\11\1\12\4\2"+
    "\1\13\1\14\1\15\1\16\1\1\1\17\1\20\1\21"+
    "\1\22\1\23\1\24\1\25\1\26\1\27\3\2\2\30"+
    "\2\31\2\0\14\2\1\0\1\32\1\0\1\33\1\0"+
    "\1\34\1\0\1\35\1\0\1\36\1\37\3\2\1\40"+
    "\1\41\1\42\1\43\1\44\1\45\1\2\1\46\1\2"+
    "\1\0\1\47\12\2\1\50\1\2\1\51\1\34\2\0"+
    "\1\52\5\2\1\0\1\53\1\2\1\54\3\2\1\55"+
    "\1\2\1\56\1\57\2\0\1\60\1\12\1\0\1\61"+
    "\1\62\1\2\1\63\1\64\2\2\1\65\1\66\1\0"+
    "\1\67\1\70\1\71\1\72";

  private static int [] zzUnpackAction() {
    int [] result = new int[140];
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
    "\0\0\0\60\0\140\0\220\0\300\0\360\0\360\0\140"+
    "\0\u0120\0\u0150\0\u0180\0\u01b0\0\u01e0\0\u0210\0\u0240\0\u0270"+
    "\0\u02a0\0\u02d0\0\140\0\u0300\0\u0330\0\140\0\140\0\u0360"+
    "\0\u0390\0\u03c0\0\u03f0\0\u0420\0\u0450\0\u0480\0\u04b0\0\u04e0"+
    "\0\u0510\0\140\0\140\0\140\0\u0540\0\140\0\140\0\140"+
    "\0\140\0\140\0\u0570\0\u05a0\0\u05d0\0\140\0\u0600\0\140"+
    "\0\u0630\0\u0660\0\360\0\u0690\0\u06c0\0\u06f0\0\u0720\0\u0750"+
    "\0\u0780\0\u07b0\0\u07e0\0\u0810\0\u0840\0\u0870\0\u08a0\0\u0270"+
    "\0\140\0\u02a0\0\140\0\u08d0\0\140\0\u0900\0\140\0\u0930"+
    "\0\220\0\u0960\0\u0990\0\u09c0\0\u09f0\0\140\0\140\0\140"+
    "\0\140\0\140\0\140\0\u0a20\0\220\0\u0a50\0\u0a80\0\u0660"+
    "\0\u0ab0\0\u0ae0\0\u0b10\0\u0b40\0\u0b70\0\u0ba0\0\u0bd0\0\u0c00"+
    "\0\u0c30\0\u0c60\0\220\0\u0c90\0\220\0\u0cc0\0\u0cf0\0\u0d20"+
    "\0\220\0\u0d50\0\u0d80\0\u0db0\0\u0de0\0\u0e10\0\u0e40\0\220"+
    "\0\u0e70\0\220\0\u0ea0\0\u0ed0\0\u0f00\0\220\0\u0f30\0\220"+
    "\0\220\0\u0cc0\0\u0f60\0\140\0\140\0\u0f90\0\220\0\220"+
    "\0\u0fc0\0\220\0\220\0\u0ff0\0\u1020\0\220\0\220\0\u1050"+
    "\0\220\0\220\0\220\0\140";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[140];
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
    "\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12"+
    "\1\13\1\14\1\15\1\4\1\16\1\17\1\20\1\21"+
    "\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31"+
    "\1\32\1\4\1\33\1\4\1\34\1\4\1\35\1\36"+
    "\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\30"+
    "\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55"+
    "\23\56\1\57\1\56\1\60\1\61\20\56\1\61\1\60"+
    "\1\56\3\60\3\56\61\0\3\4\2\0\10\4\11\0"+
    "\7\4\17\0\3\4\2\0\3\5\1\62\54\0\3\63"+
    "\1\62\53\0\3\4\2\0\1\4\1\64\1\65\5\4"+
    "\11\0\7\4\17\0\1\4\1\66\1\4\1\0\3\4"+
    "\2\0\3\4\1\67\4\4\11\0\7\4\17\0\3\4"+
    "\1\0\3\4\2\0\10\4\11\0\1\4\1\70\5\4"+
    "\17\0\3\4\1\0\3\4\2\0\6\4\1\71\1\4"+
    "\11\0\7\4\17\0\3\4\1\0\3\4\2\0\5\4"+
    "\1\72\1\73\1\4\11\0\7\4\17\0\1\4\1\74"+
    "\1\4\1\0\3\4\2\0\3\4\1\75\4\4\11\0"+
    "\1\76\6\4\17\0\3\4\1\0\3\4\2\0\1\77"+
    "\7\4\11\0\7\4\17\0\3\4\16\100\1\101\41\100"+
    "\17\102\1\103\40\102\21\104\1\105\1\106\35\104\22\0"+
    "\1\107\61\0\1\110\61\0\1\30\20\0\1\30\11\0"+
    "\3\4\2\0\4\4\1\111\3\4\11\0\1\4\1\112"+
    "\5\4\17\0\3\4\1\0\3\4\2\0\10\4\11\0"+
    "\2\4\1\113\4\4\17\0\3\4\1\0\3\4\2\0"+
    "\10\4\11\0\2\4\1\114\4\4\17\0\3\4\1\0"+
    "\3\4\2\0\10\4\11\0\6\4\1\115\17\0\3\4"+
    "\36\0\1\116\57\0\1\117\57\0\1\120\57\0\1\121"+
    "\63\0\1\122\63\0\1\123\12\0\3\4\2\0\10\4"+
    "\11\0\6\4\1\124\17\0\3\4\1\0\3\4\2\0"+
    "\10\4\11\0\2\4\1\125\4\4\17\0\3\4\1\0"+
    "\3\4\2\0\10\4\11\0\2\4\1\126\4\4\17\0"+
    "\3\4\24\0\1\127\61\0\1\61\20\0\1\61\12\0"+
    "\3\130\54\0\3\4\2\0\2\4\1\131\5\4\11\0"+
    "\7\4\17\0\3\4\1\0\3\4\2\0\10\4\11\0"+
    "\4\4\1\132\2\4\17\0\3\4\1\0\3\4\2\0"+
    "\3\4\1\133\4\4\11\0\7\4\17\0\3\4\1\0"+
    "\3\4\2\0\1\134\7\4\11\0\4\4\1\135\2\4"+
    "\17\0\3\4\1\0\3\4\2\0\1\136\7\4\11\0"+
    "\7\4\17\0\3\4\1\0\3\4\2\0\7\4\1\137"+
    "\11\0\7\4\17\0\3\4\1\0\3\4\2\0\6\4"+
    "\1\140\1\4\11\0\7\4\17\0\3\4\1\0\3\4"+
    "\2\0\10\4\11\0\2\4\1\141\4\4\17\0\3\4"+
    "\1\0\3\4\2\0\3\4\1\142\4\4\11\0\7\4"+
    "\17\0\3\4\1\0\3\4\2\0\10\4\11\0\1\4"+
    "\1\143\5\4\17\0\3\4\1\0\3\4\2\0\7\4"+
    "\1\144\11\0\7\4\17\0\3\4\1\0\3\4\2\0"+
    "\1\4\1\145\6\4\11\0\7\4\17\0\3\4\21\104"+
    "\1\105\36\104\21\106\1\146\1\147\35\106\24\110\1\150"+
    "\33\110\1\0\3\4\2\0\1\151\7\4\11\0\7\4"+
    "\17\0\3\4\1\0\3\4\2\0\1\152\7\4\11\0"+
    "\7\4\17\0\3\4\1\0\3\4\2\0\10\4\11\0"+
    "\2\4\1\153\4\4\17\0\3\4\1\0\3\4\2\0"+
    "\5\4\1\154\2\4\11\0\7\4\17\0\3\4\1\0"+
    "\3\4\2\0\10\4\11\0\1\155\6\4\17\0\3\4"+
    "\1\0\3\4\2\0\10\4\11\0\1\156\6\4\17\0"+
    "\3\4\24\127\1\157\33\127\1\0\3\4\2\0\3\4"+
    "\1\160\4\4\11\0\7\4\17\0\3\4\1\0\3\4"+
    "\2\0\6\4\1\161\1\4\11\0\7\4\17\0\3\4"+
    "\1\0\3\4\2\0\4\4\1\162\3\4\11\0\7\4"+
    "\17\0\3\4\1\0\3\4\2\0\2\4\1\163\5\4"+
    "\11\0\7\4\17\0\3\4\1\0\3\4\2\0\3\4"+
    "\1\164\4\4\11\0\7\4\17\0\3\4\1\0\3\4"+
    "\2\0\10\4\11\0\1\165\6\4\17\0\3\4\1\0"+
    "\3\4\2\0\3\4\1\166\4\4\11\0\7\4\17\0"+
    "\3\4\1\0\3\4\2\0\7\4\1\131\11\0\7\4"+
    "\17\0\3\4\1\0\3\4\2\0\5\4\1\167\2\4"+
    "\11\0\7\4\17\0\3\4\1\0\3\4\2\0\4\4"+
    "\1\170\3\4\11\0\7\4\17\0\3\4\1\0\3\4"+
    "\2\0\1\171\7\4\11\0\7\4\17\0\3\4\22\172"+
    "\1\173\35\172\21\106\1\174\1\147\35\106\23\110\1\175"+
    "\1\150\33\110\1\0\3\4\2\0\10\4\11\0\7\4"+
    "\11\0\1\176\5\0\3\4\1\0\3\4\2\0\6\4"+
    "\1\177\1\4\11\0\7\4\17\0\3\4\1\0\3\4"+
    "\2\0\1\4\1\200\6\4\11\0\7\4\17\0\3\4"+
    "\1\0\3\4\2\0\6\4\1\201\1\4\11\0\7\4"+
    "\17\0\3\4\1\0\3\4\2\0\10\4\11\0\7\4"+
    "\17\0\1\4\1\202\1\4\23\127\1\60\1\157\33\127"+
    "\1\0\3\4\2\0\3\4\1\203\4\4\11\0\7\4"+
    "\17\0\3\4\1\0\3\4\2\0\1\4\1\204\6\4"+
    "\11\0\7\4\17\0\3\4\1\0\3\4\2\0\5\4"+
    "\1\205\2\4\11\0\7\4\17\0\3\4\1\0\3\4"+
    "\2\0\6\4\1\206\1\4\11\0\7\4\17\0\3\4"+
    "\1\0\3\4\2\0\1\207\7\4\11\0\7\4\17\0"+
    "\3\4\21\172\1\174\1\173\35\172\27\0\1\210\31\0"+
    "\3\4\2\0\3\4\1\211\4\4\11\0\7\4\17\0"+
    "\3\4\1\0\3\4\2\0\10\4\11\0\1\4\1\212"+
    "\5\4\17\0\3\4\1\0\3\4\2\0\1\213\7\4"+
    "\11\0\7\4\17\0\3\4\30\0\1\214\27\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[4224];
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
    "\2\0\1\11\4\1\1\11\12\1\1\11\2\1\2\11"+
    "\12\1\3\11\1\1\5\11\3\1\1\11\1\1\1\11"+
    "\1\1\2\0\14\1\1\0\1\11\1\0\1\11\1\0"+
    "\1\11\1\0\1\11\1\0\5\1\6\11\3\1\1\0"+
    "\17\1\2\0\6\1\1\0\12\1\2\0\2\11\1\0"+
    "\11\1\1\0\3\1\1\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[140];
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

  /* user code: */
  PParse p;
  public int getLine() {return yyline;}
  public int getCol() {return yycolumn;}
  private StringBuilder badin = null;  


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Lexer(java.io.Reader in) {
  	p = new PParse(this);
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  Lexer(java.io.InputStream in) {
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
    while (i < 202) {
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
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
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
  
      zzState = ZZ_LEXSTATE[zzLexicalState];


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
        case 56: 
          { return  p.sym(sym.RETURN);
          }
        case 59: break;
        case 53: 
          { return  p.sym(sym.UNTIL);
          }
        case 60: break;
        case 19: 
          { return  p.sym(sym.SEMI);
          }
        case 61: break;
        case 29: 
          { return p.sym(sym.OR);
          }
        case 62: break;
        case 31: 
          { return p.sym(sym.IN);
          }
        case 63: break;
        case 54: 
          { return p.sym(sym.FLOAT);
          }
        case 64: break;
        case 11: 
          { return p.sym(sym.EQ);
          }
        case 65: break;
        case 50: 
          { return p.sym(sym.CHAR);
          }
        case 66: break;
        case 49: 
          { return p.sym(sym.BOOL);
          }
        case 67: break;
        case 26: 
          { return p.charParse(yytext());
          }
        case 68: break;
        case 16: 
          { return p.sym(sym.MINUS);
          }
        case 69: break;
        case 21: 
          { return  p.sym(sym.LPAREN);
          }
        case 70: break;
        case 17: 
          { return p.sym(sym.TOPOWER);
          }
        case 71: break;
        case 58: 
          { return p.sym(sym.NOTIN);
          }
        case 72: break;
        case 20: 
          { return  p.sym(sym.COMMA);
          }
        case 73: break;
        case 33: 
          { return p.sym(sym.LTEQ);
          }
        case 74: break;
        case 23: 
          { return  p.sym(sym.RBRACE);
          }
        case 75: break;
        case 35: 
          { return p.sym(sym.NOTEQ);
          }
        case 76: break;
        case 1: 
          { yybegin(ERROR); badin = new StringBuilder(yytext());
          }
        case 77: break;
        case 28: 
          { return p.listsParse(yytext());
          }
        case 78: break;
        case 5: 
          { return  p.sym(sym.LBRACKET);
          }
        case 79: break;
        case 41: 
          { return p.sym(sym.STR);
          }
        case 80: break;
        case 25: 
          { yypushback(1); yybegin(YYINITIAL); System.err.println("error: unknown input " + badin + " found at line " + yyline);
          }
        case 81: break;
        case 4: 
          { return  p.sym(sym.DOT);
          }
        case 82: break;
        case 42: 
          { return p.sym(sym.INT);
          }
        case 83: break;
        case 32: 
          { return p.sym(sym.EQEQ);
          }
        case 84: break;
        case 36: 
          { return p.sym(sym.AND);
          }
        case 85: break;
        case 14: 
          { return p.sym(sym.NOT);
          }
        case 86: break;
        case 24: 
          { badin.append(yytext());
          }
        case 87: break;
        case 3: 
          { return p.intParse(yytext());
          }
        case 88: break;
        case 7: 
          { return p.sym(sym.DIV);
          }
        case 89: break;
        case 13: 
          { return p.sym(sym.GT);
          }
        case 90: break;
        case 57: 
          { return  p.sym(sym.REPEAT);
          }
        case 91: break;
        case 46: 
          { return  p.sym(sym.FDEF);
          }
        case 92: break;
        case 37: 
          { return p.sym(sym.CONCAT);
          }
        case 93: break;
        case 12: 
          { return p.sym(sym.LT);
          }
        case 94: break;
        case 38: 
          { return  p.sym(sym.DO);
          }
        case 95: break;
        case 6: 
          { return  p.sym(sym.RBRACKET);
          }
        case 96: break;
        case 40: 
          { return p.sym(sym.LEN);
          }
        case 97: break;
        case 2: 
          { return p.sym(sym.ID, yytext());
          }
        case 98: break;
        case 18: 
          { return  p.sym(sym.COL);
          }
        case 99: break;
        case 47: 
          { return p.sym(sym.LIST);
          }
        case 100: break;
        case 9: 
          { return  p.sym(sym.RPAREN);
          }
        case 101: break;
        case 34: 
          { return p.sym(sym.GTEQ);
          }
        case 102: break;
        case 43: 
          { return p.boolParse(yytext());
          }
        case 103: break;
        case 51: 
          { return  p.sym(sym.VOID);
          }
        case 104: break;
        case 30: 
          { return  p.sym(sym.IF);
          }
        case 105: break;
        case 45: 
          { return  p.sym(sym.ELSE);
          }
        case 106: break;
        case 52: 
          { return p.sym(sym.TUPLE);
          }
        case 107: break;
        case 22: 
          { return  p.sym(sym.LBRACE);
          }
        case 108: break;
        case 39: 
          { return p.floatParse(yytext());
          }
        case 109: break;
        case 44: 
          { return  p.sym(sym.TDEF);
          }
        case 110: break;
        case 27: 
          { return p.stringParse(yytext());
          }
        case 111: break;
        case 15: 
          { return p.sym(sym.PLUS);
          }
        case 112: break;
        case 8: 
          { return p.sym(sym.TIMES);
          }
        case 113: break;
        case 55: 
          { return  p.sym(sym.WHILE);
          }
        case 114: break;
        case 48: 
          { return p.tuplesParse(yytext());
          }
        case 115: break;
        case 10: 
          { 
          }
        case 116: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
              { return new java_cup.runtime.Symbol(sym.EOF); }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}