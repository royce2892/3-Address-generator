/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.cdroid_final;

/**
 *
 * @author anita
 */
 
/* A Bison parser, made by GNU Bison 2.4.1.  */

/* Skeleton implementation for Bison LALR(1) parsers in Java
   
      Copyright (C) 2007, 2008 Free Software Foundation, Inc.
   
   This program is free software: you can redistribute it and/or modify
   it under the terms of the GNU General Public License as published by
   the Free Software Foundation, either version 3 of the License, or
   (at your option) any later version.
   
   This program is distributed in the hope that it will be useful,
   but WITHOUT ANY WARRANTY; without even the implied warranty of
   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
   GNU General Public License for more details.
   
   You should have received a copy of the GNU General Public License
   along with this program.  If not, see <http://www.gnu.org/licenses/>.  */

/* As a special exception, you may create a larger work that contains
   part or all of the Bison parser skeleton and distribute that work
   under terms of your choice, so long as that work isn't itself a
   parser generator using the skeleton or a modified version thereof
   as a parser skeleton.  Alternatively, if you modify or redistribute
   the parser skeleton itself, you may (at your option) remove this
   special exception, which will cause the skeleton and the resulting
   Bison output files to be licensed under the GNU General Public
   License without this special exception.
   
   This special exception was added by the Free Software Foundation in
   version 2.2 of Bison.  */

/* First part of user declarations.  */

/* Line 32 of lalr1.java  */
/* Line 1 of "Ccompiler.y"  */


import com.cdroid_final.nodeclass;



/**
 * A Bison parser, automatically generated from <tt>Ccompiler.y</tt>.
 *
 * @author LALR (1) parser skeleton written by Paolo Bonzini.
 */
class YYParser
{
	String outp="";

   
     int count=0;
String genlabel()
{
    count++;
    String str;
    str=""+count;
    str="_L"+str;
return str;
}
    /** Version number for the Bison executable that generated this parser.  */
  public static final String bisonVersion = "2.4.1";

  /** Name of the skeleton that generated this parser.  */
  public static final String bisonSkeleton = "lalr1.java";


  /** True if verbose error messages are enabled.  */
  public boolean errorVerbose = false;



  /** Token returned by the scanner to signal the end of its input.  */
  public static final int EOF = 0;

/* Tokens.  */
  /** Token number, to be returned by the scanner.  */
  public static final int IDENTIFIER = 258;
  /** Token number, to be returned by the scanner.  */
  public static final int CONSTANT = 259;
  /** Token number, to be returned by the scanner.  */
  public static final int STRING_LITERAL = 260;
  /** Token number, to be returned by the scanner.  */
  public static final int SIZEOF = 261;
  /** Token number, to be returned by the scanner.  */
  public static final int LEFT_OP = 262;
  /** Token number, to be returned by the scanner.  */
  public static final int RIGHT_OP = 263;
  /** Token number, to be returned by the scanner.  */
  public static final int LE_OP = 264;
  /** Token number, to be returned by the scanner.  */
  public static final int GE_OP = 265;
  /** Token number, to be returned by the scanner.  */
  public static final int EQ_OP = 266;
  /** Token number, to be returned by the scanner.  */
  public static final int NE_OP = 267;
  /** Token number, to be returned by the scanner.  */
  public static final int INC_OP = 268;
  /** Token number, to be returned by the scanner.  */
  public static final int DEC_OP = 269;
  /** Token number, to be returned by the scanner.  */
  public static final int AND_OP = 270;
  /** Token number, to be returned by the scanner.  */
  public static final int OR_OP = 271;
  /** Token number, to be returned by the scanner.  */
  public static final int MUL_ASSIGN = 272;
  /** Token number, to be returned by the scanner.  */
  public static final int DIV_ASSIGN = 273;
  /** Token number, to be returned by the scanner.  */
  public static final int MOD_ASSIGN = 274;
  /** Token number, to be returned by the scanner.  */
  public static final int ADD_ASSIGN = 275;
  /** Token number, to be returned by the scanner.  */
  public static final int SUB_ASSIGN = 276;
  /** Token number, to be returned by the scanner.  */
  public static final int LEFT_ASSIGN = 277;
  /** Token number, to be returned by the scanner.  */
  public static final int RIGHT_ASSIGN = 278;
  /** Token number, to be returned by the scanner.  */
  public static final int AND_ASSIGN = 279;
  /** Token number, to be returned by the scanner.  */
  public static final int XOR_ASSIGN = 280;
  /** Token number, to be returned by the scanner.  */
  public static final int OR_ASSIGN = 281;
  /** Token number, to be returned by the scanner.  */
  public static final int LEFT_PARENTHESIS = 282;
  /** Token number, to be returned by the scanner.  */
  public static final int RIGHT_PARENTHESIS = 283;
  /** Token number, to be returned by the scanner.  */
  public static final int SEMI_COLON = 284;
  /** Token number, to be returned by the scanner.  */
  public static final int LEFT_SQUAREBRACKET = 285;
  /** Token number, to be returned by the scanner.  */
  public static final int RIGHT_SQUAREBRACKET = 286;
  /** Token number, to be returned by the scanner.  */
  public static final int COMMA = 287;
  /** Token number, to be returned by the scanner.  */
  public static final int LEFT_CURLYBRACE = 288;
  /** Token number, to be returned by the scanner.  */
  public static final int RIGHT_CURLYBRACE = 289;
  /** Token number, to be returned by the scanner.  */
  public static final int PLUS_OPERATOR = 290;
  /** Token number, to be returned by the scanner.  */
  public static final int MINUS_OPERATOR = 291;
  /** Token number, to be returned by the scanner.  */
  public static final int MUL_OPERATOR = 292;
  /** Token number, to be returned by the scanner.  */
  public static final int DIV_OPERATOR = 293;
  /** Token number, to be returned by the scanner.  */
  public static final int AND_OPERATOR = 294;
  /** Token number, to be returned by the scanner.  */
  public static final int OR_OPERATOR = 295;
  /** Token number, to be returned by the scanner.  */
  public static final int XOR_OPERATOR = 296;
  /** Token number, to be returned by the scanner.  */
  public static final int GREATER_THAN = 297;
  /** Token number, to be returned by the scanner.  */
  public static final int LESS_THAN = 298;
  /** Token number, to be returned by the scanner.  */
  public static final int MOD_OPERATOR = 299;
  /** Token number, to be returned by the scanner.  */
  public static final int NEGATION = 300;
  /** Token number, to be returned by the scanner.  */
  public static final int NOT_OPERATOR = 301;
  /** Token number, to be returned by the scanner.  */
  public static final int EQUAL_TO = 302;
  /** Token number, to be returned by the scanner.  */
  public static final int CONDITIONAL_OP1 = 303;
  /** Token number, to be returned by the scanner.  */
  public static final int CONDITIONAL_OP2 = 304;
  /** Token number, to be returned by the scanner.  */
  public static final int DEFAULT = 305;
  /** Token number, to be returned by the scanner.  */
  public static final int AUTO = 306;
  /** Token number, to be returned by the scanner.  */
  public static final int CASE = 307;
  /** Token number, to be returned by the scanner.  */
  public static final int TYPE_NAME = 308;
  /** Token number, to be returned by the scanner.  */
  public static final int STATIC = 309;
  /** Token number, to be returned by the scanner.  */
  public static final int EXTERN = 310;
  /** Token number, to be returned by the scanner.  */
  public static final int REGISTER = 311;
  /** Token number, to be returned by the scanner.  */
  public static final int TYPEDEF = 312;
  /** Token number, to be returned by the scanner.  */
  public static final int PTR_OP = 313;
  /** Token number, to be returned by the scanner.  */
  public static final int ENUM = 314;
  /** Token number, to be returned by the scanner.  */
  public static final int UNION = 315;
  /** Token number, to be returned by the scanner.  */
  public static final int ELLIPSIS = 316;
  /** Token number, to be returned by the scanner.  */
  public static final int CONTINUE = 317;
  /** Token number, to be returned by the scanner.  */
  public static final int SWITCH = 318;
  /** Token number, to be returned by the scanner.  */
  public static final int DO = 319;
  /** Token number, to be returned by the scanner.  */
  public static final int GOTO = 320;
  /** Token number, to be returned by the scanner.  */
  public static final int BREAK = 321;
  /** Token number, to be returned by the scanner.  */
  public static final int STRUCT = 322;
  /** Token number, to be returned by the scanner.  */
  public static final int CHAR = 323;
  /** Token number, to be returned by the scanner.  */
  public static final int SHORT = 324;
  /** Token number, to be returned by the scanner.  */
  public static final int INT = 325;
  /** Token number, to be returned by the scanner.  */
  public static final int LONG = 326;
  /** Token number, to be returned by the scanner.  */
  public static final int SIGNED = 327;
  /** Token number, to be returned by the scanner.  */
  public static final int UNSIGNED = 328;
  /** Token number, to be returned by the scanner.  */
  public static final int FLOAT = 329;
  /** Token number, to be returned by the scanner.  */
  public static final int DOUBLE = 330;
  /** Token number, to be returned by the scanner.  */
  public static final int CONST = 331;
  /** Token number, to be returned by the scanner.  */
  public static final int VOLATILE = 332;
  /** Token number, to be returned by the scanner.  */
  public static final int VOID = 333;
  /** Token number, to be returned by the scanner.  */
  public static final int IF = 334;
  /** Token number, to be returned by the scanner.  */
  public static final int ELSE = 335;
  /** Token number, to be returned by the scanner.  */
  public static final int WHILE = 336;
  /** Token number, to be returned by the scanner.  */
  public static final int FOR = 337;
  /** Token number, to be returned by the scanner.  */
  public static final int RETURN = 338;



  

  /**
   * Communication interface between the scanner and the Bison-generated
   * parser <tt>YYParser</tt>.
   */
  public interface Lexer {
    

    /**
     * Method to retrieve the semantic value of the last scanned token.
     * @return the semantic value of the last scanned token.  */
    nodeclass getLVal ();

    /**
     * Entry point for the scanner.  Returns the token identifier corresponding
     * to the next token and prepares to return the semantic value
     * of the token. 
     * @return the token identifier corresponding to the next token. */
    int yylex () throws java.io.IOException;

    /**
     * Entry point for error reporting.  Emits an error
     * in a user-defined way.
     *
     * 
     * @param s The string for the error message.  */
     void yyerror (String s);
  }

  /** The object doing lexical analysis for us.  */
  private Lexer yylexer;
  
  



  /**
   * Instantiates the Bison-generated parser.
   * @param yylexer The scanner that will supply tokens to the parser.
   */
  public YYParser (Lexer yylexer) {
    this.yylexer = yylexer;
    
  }

  private java.io.PrintStream yyDebugStream = System.out;

  /**
   * Return the <tt>PrintStream</tt> on which the debugging output is
   * printed.
   */
  public final java.io.PrintStream getDebugStream () { return yyDebugStream; }

  /**
   * Set the <tt>PrintStream</tt> on which the debug output is printed.
   * @param s The stream that is used for debugging output.
   */
  public final void setDebugStream(java.io.PrintStream s) { yyDebugStream = s; }

  private int yydebug = 0;

  /**
   * Answer the verbosity of the debugging output; 0 means that all kinds of
   * output from the parser are suppressed.
   */
  public final int getDebugLevel() { return yydebug; }

  /**
   * Set the verbosity of the debugging output; 0 means that all kinds of
   * output from the parser are suppressed.
   * @param level The verbosity level for debugging output.
   */
  public final void setDebugLevel(int level) { yydebug = level; }

  private final int yylex () throws java.io.IOException {
    return yylexer.yylex ();
  }
  protected final void yyerror (String s) {
    yylexer.yyerror (s);
  }

  

  protected final void yycdebug (String s) {
    if (yydebug > 0)
      yyDebugStream.println (s);
  }

  private final class YYStack {
    private int[] stateStack = new int[16];
    
    private nodeclass[] valueStack = new nodeclass[16];

    public int size = 16;
    public int height = -1;
    
    public final void push (int state, nodeclass value    	   	      	    ) {
      height++;
      if (size == height) 
        {
	  int[] newStateStack = new int[size * 2];
	  System.arraycopy (stateStack, 0, newStateStack, 0, height);
	  stateStack = newStateStack;
	  
	  
	  nodeclass[] newValueStack = new nodeclass[size * 2];
	  System.arraycopy (valueStack, 0, newValueStack, 0, height);
	  valueStack = newValueStack;

	  size *= 2;
	}

      stateStack[height] = state;
      
      valueStack[height] = value;
    }

    public final void pop () {
      height--;
    }

    public final void pop (int num) {
      // Avoid memory leaks... garbage collection is a white lie!
      if (num > 0) {
	java.util.Arrays.fill (valueStack, height - num + 1, height, null);
        
      }
      height -= num;
    }

    public final int stateAt (int i) {
      return stateStack[height - i];
    }

    public final nodeclass valueAt (int i) {
      return valueStack[height - i];
    }

    // Print the state stack on the debug stream.
    public void print (java.io.PrintStream out)
    {
      out.print ("Stack now");
      
      for (int i = 0; i < height; i++)
        {
	  out.print (' ');
	  out.print (stateStack[i]);
        }
      out.println ();
    }
  }

  /**
   * Returned by a Bison action in order to stop the parsing process and
   * return success (<tt>true</tt>).  */
  public static final int YYACCEPT = 0;

  /**
   * Returned by a Bison action in order to stop the parsing process and
   * return failure (<tt>false</tt>).  */
  public static final int YYABORT = 1;

  /**
   * Returned by a Bison action in order to start error recovery without
   * printing an error message.  */
  public static final int YYERROR = 2;

  /**
   * Returned by a Bison action in order to print an error message and start
   * error recovery.  */
  public static final int YYFAIL = 3;

  private static final int YYNEWSTATE = 4;
  private static final int YYDEFAULT = 5;
  private static final int YYREDUCE = 6;
  private static final int YYERRLAB1 = 7;
  private static final int YYRETURN = 8;

  private int yyerrstatus_ = 0;

  /**
   * Return whether error recovery is being done.  In this state, the parser
   * reads token until it reaches a known state, and then restarts normal
   * operation.  */
  public final boolean recovering ()
  {
    return yyerrstatus_ == 0;
  }

  private int yyaction (int yyn, YYStack yystack, int yylen) 
  {
    nodeclass yyval;
    

    /* If YYLEN is nonzero, implement the default value of the action:
       `$$ = $1'.  Otherwise, use the top of the stack.
    
       Otherwise, the following line sets YYVAL to garbage.
       This behavior is undocumented and Bison
       users should not rely upon it.  */
    if (yylen > 0)
      yyval = yystack.valueAt (yylen - 1);
    else
      yyval = yystack.valueAt (0);
    
    yy_reduce_print (yyn, yystack);

    switch (yyn)
      {
	  case 2:
  if (yyn == 2)
    
/* Line 353 of lalr1.java  */
/* Line 130 of "Ccompiler.y"  */
    { yyval.last_value=((nodeclass)(yystack.valueAt (1-(1)))).value;};
  break;
    

  case 3:
  if (yyn == 3)
    
/* Line 353 of lalr1.java  */
/* Line 131 of "Ccompiler.y"  */
    {  yyval.last_value="t1";
								yyval.tac="t1="+((nodeclass)(yystack.valueAt (1-(1)))).value;};
  break;
    

  case 4:
  if (yyn == 4)
    
/* Line 353 of lalr1.java  */
/* Line 133 of "Ccompiler.y"  */
    {  yyval.last_value="t1";
								yyval.tac="t1="+((nodeclass)(yystack.valueAt (1-(1)))).value;
								};
  break;
    

  case 5:
  if (yyn == 5)
    
/* Line 353 of lalr1.java  */
/* Line 136 of "Ccompiler.y"  */
    { 
				yyval.last_value=((nodeclass)(yystack.valueAt (3-(2)))).last_value;
												yyval.tac=((nodeclass)(yystack.valueAt (3-(2)))).tac;};
  break;
    

  case 6:
  if (yyn == 6)
    
/* Line 353 of lalr1.java  */
/* Line 142 of "Ccompiler.y"  */
    {
				yyval.last_value=((nodeclass)(yystack.valueAt (1-(1)))).last_value;
												yyval.tac=((nodeclass)(yystack.valueAt (1-(1)))).tac;};
  break;
    

  case 7:
  if (yyn == 7)
    
/* Line 353 of lalr1.java  */
/* Line 145 of "Ccompiler.y"  */
    {
				yyval.last_value=((nodeclass)(yystack.valueAt (4-(1)))).last_value;
												yyval.tac=((nodeclass)(yystack.valueAt (4-(1)))).tac;};
  break;
    

  case 8:
  if (yyn == 8)
    
/* Line 353 of lalr1.java  */
/* Line 148 of "Ccompiler.y"  */
    {
				yyval.last_value=((nodeclass)(yystack.valueAt (3-(1)))).last_value;
												yyval.tac=((nodeclass)(yystack.valueAt (3-(1)))).tac;};
  break;
    

  case 9:
  if (yyn == 9)
    
/* Line 353 of lalr1.java  */
/* Line 151 of "Ccompiler.y"  */
    {	
												yyval.last_value=((nodeclass)(yystack.valueAt (4-(1)))).last_value;
												yyval.tac=((nodeclass)(yystack.valueAt (4-(3)))).tac;
												//$$.tac=$3.tac+"\nPush_param "+$3.last_value+"\nLcall "+$1.last_value+"\nPop_param "+$3.last_value;
												yyval.tac=((nodeclass)(yystack.valueAt (4-(3)))).tac+"\nLcall "+((nodeclass)(yystack.valueAt (4-(1)))).last_value+"\nPop_param "+((nodeclass)(yystack.valueAt (4-(3)))).length*4;
											};
  break;
    

  case 10:
  if (yyn == 10)
    
/* Line 353 of lalr1.java  */
/* Line 156 of "Ccompiler.y"  */
    {
				yyval.last_value=((nodeclass)(yystack.valueAt (3-(1)))).last_value;
												yyval.tac=((nodeclass)(yystack.valueAt (3-(1)))).tac;};
  break;
    

  case 11:
  if (yyn == 11)
    
/* Line 353 of lalr1.java  */
/* Line 159 of "Ccompiler.y"  */
    {
				yyval.last_value=((nodeclass)(yystack.valueAt (3-(1)))).last_value;
												yyval.tac=((nodeclass)(yystack.valueAt (3-(1)))).tac;};
  break;
    

  case 12:
  if (yyn == 12)
    
/* Line 353 of lalr1.java  */
/* Line 162 of "Ccompiler.y"  */
    {
							
							
							char s;
							if(((((nodeclass)(yystack.valueAt (2-(1)))).last_value).charAt(0))!='t')
							{
							s='1';
							yyval.tac="t1="+((nodeclass)(yystack.valueAt (2-(1)))).last_value+"+1"+"\n"+((nodeclass)(yystack.valueAt (2-(1)))).last_value+"=t"+s;
							}
							else
							{
							s=(((nodeclass)(yystack.valueAt (2-(1)))).last_value).charAt(1);
							if((char)(s-1)=='0')
										s=(char)(s+1);
									else
										s=1;
							yyval.tac=((nodeclass)(yystack.valueAt (2-(1)))).tac+"\n"+"t"+s+"="+((nodeclass)(yystack.valueAt (2-(1)))).last_value+"+1"+"\n"+((nodeclass)(yystack.valueAt (2-(1)))).last_value+"=t"+s;
							}
							yyval.last_value="t"+s;
							
							};
  break;
    

  case 13:
  if (yyn == 13)
    
/* Line 353 of lalr1.java  */
/* Line 183 of "Ccompiler.y"  */
    {
							
							
							char s;
							if(((((nodeclass)(yystack.valueAt (2-(1)))).last_value).charAt(0))!='t')
							{
							s='1';
							yyval.tac="t1="+((nodeclass)(yystack.valueAt (2-(1)))).last_value+"-1"+"\n"+((nodeclass)(yystack.valueAt (2-(1)))).last_value+"=t"+s;
							}
							else
							{
							s=(((nodeclass)(yystack.valueAt (2-(1)))).last_value).charAt(1);
							if((char)(s-1)=='0')
										s=(char)(s+1);
									else
										s=1;
							yyval.tac=((nodeclass)(yystack.valueAt (2-(1)))).tac+"\n"+"t"+s+"="+((nodeclass)(yystack.valueAt (2-(1)))).last_value+"-1"+"\n"+((nodeclass)(yystack.valueAt (2-(1)))).last_value+"=t"+s;
							}
							yyval.last_value="t"+s;
							
							};
  break;
    

  case 14:
  if (yyn == 14)
    
/* Line 353 of lalr1.java  */
/* Line 207 of "Ccompiler.y"  */
    {	
			yyval.last_value=((nodeclass)(yystack.valueAt (1-(1)))).last_value;
				if(((nodeclass)(yystack.valueAt (1-(1)))).tac!=null)
				yyval.tac=((nodeclass)(yystack.valueAt (1-(1)))).tac+"\nPush Parameter "+((nodeclass)(yystack.valueAt (1-(1)))).last_value;
				else
				yyval.tac="\nPush Parameter "+((nodeclass)(yystack.valueAt (1-(1)))).last_value;
                                yyval.length=1;
												//$$.tac=$1.tac;
														//$$.tac=$1.tac;
									  };
  break;
    

  case 15:
  if (yyn == 15)
    
/* Line 353 of lalr1.java  */
/* Line 211 of "Ccompiler.y"  */
     {					
								char s;
								String s1,s2;
								s1=((nodeclass)(yystack.valueAt (3-(1)))).last_value;
								s2=((nodeclass)(yystack.valueAt (3-(3)))).last_value;
								if(((nodeclass)(yystack.valueAt (3-(1)))).tac!=null)
									yyval.tac=((nodeclass)(yystack.valueAt (3-(1)))).tac;
								if(((nodeclass)(yystack.valueAt (3-(3)))).tac!=null)
									yyval.tac=yyval.tac+"\n"+((nodeclass)(yystack.valueAt (3-(3)))).tac+"\nPush Parameter "+((nodeclass)(yystack.valueAt (3-(3)))).last_value;
								else
									yyval.tac=yyval.tac+"\nPush Parameter "+((nodeclass)(yystack.valueAt (3-(3)))).last_value;								
						yyval.length=((nodeclass)(yystack.valueAt (3-(1)))).length+1;
										
								
								};
  break;
    

  case 16:
  if (yyn == 16)
    
/* Line 353 of lalr1.java  */
/* Line 242 of "Ccompiler.y"  */
    {	
						yyval.last_value=((nodeclass)(yystack.valueAt (1-(1)))).last_value;
												yyval.tac=((nodeclass)(yystack.valueAt (1-(1)))).tac;};
  break;
    

  case 17:
  if (yyn == 17)
    
/* Line 353 of lalr1.java  */
/* Line 245 of "Ccompiler.y"  */
    {
							
							
							char s;
							if(((((nodeclass)(yystack.valueAt (2-(2)))).last_value).charAt(0))!='t')
							{
							s='1';
							yyval.tac="t1="+((nodeclass)(yystack.valueAt (2-(2)))).last_value+"+1"+"\n"+((nodeclass)(yystack.valueAt (2-(2)))).last_value+"=t"+s;
							}
							else
							{
							s=(((nodeclass)(yystack.valueAt (2-(2)))).last_value).charAt(1);
							if((char)(s-1)=='0')
										s=(char)(s+1);
									else
										s=1;
							yyval.tac=((nodeclass)(yystack.valueAt (2-(2)))).tac+"\n"+"t"+s+"="+((nodeclass)(yystack.valueAt (2-(2)))).last_value+"+1"+"\n"+((nodeclass)(yystack.valueAt (2-(2)))).last_value+"=t"+s;
							}
							yyval.last_value="t"+s;
							
							};
  break;
    

  case 18:
  if (yyn == 18)
    
/* Line 353 of lalr1.java  */
/* Line 266 of "Ccompiler.y"  */
    {
							
							
							char s;
							if(((((nodeclass)(yystack.valueAt (2-(2)))).last_value).charAt(0))!='t')
							{
							s='1';
							yyval.tac="t1="+((nodeclass)(yystack.valueAt (2-(2)))).last_value+"-1"+"\n"+((nodeclass)(yystack.valueAt (2-(2)))).last_value+"=t"+s;
							}
							else
							{
							s=(((nodeclass)(yystack.valueAt (2-(2)))).last_value).charAt(1);
							if((char)(s-1)=='0')
										s=(char)(s+1);
									else
										s=1;
							yyval.tac=((nodeclass)(yystack.valueAt (2-(2)))).tac+"\n"+"t"+s+"="+((nodeclass)(yystack.valueAt (2-(2)))).last_value+"-1"+"\n"+((nodeclass)(yystack.valueAt (2-(2)))).last_value+"=t"+s;
							}
							yyval.last_value="t"+s;
							
							};
  break;
    

  case 19:
  if (yyn == 19)
    
/* Line 353 of lalr1.java  */
/* Line 287 of "Ccompiler.y"  */
    {
							
							
							char s;
							if(((((nodeclass)(yystack.valueAt (2-(2)))).last_value).charAt(0))!='t')
							{
							s='1';
							yyval.tac="t1="+((nodeclass)(yystack.valueAt (2-(1)))).last_value+((nodeclass)(yystack.valueAt (2-(2)))).last_value;
							}
							else
							{
							s=(((nodeclass)(yystack.valueAt (2-(2)))).last_value).charAt(1);
							if((char)(s-1)=='0')
										s=(char)(s+1);
									else
										s=1;
							yyval.tac=((nodeclass)(yystack.valueAt (2-(2)))).tac+"\n"+"t"+s+"="+((nodeclass)(yystack.valueAt (2-(1)))).last_value+((nodeclass)(yystack.valueAt (2-(2)))).last_value;
							}
							yyval.last_value="t"+s;
							
							};
  break;
    

  case 20:
  if (yyn == 20)
    
/* Line 353 of lalr1.java  */
/* Line 308 of "Ccompiler.y"  */
    {
							
							
							char s;
							if(((((nodeclass)(yystack.valueAt (2-(2)))).last_value).charAt(0))!='t')
							{
							s='1';
							yyval.tac="t1="+((nodeclass)(yystack.valueAt (2-(1)))).value+"("+((nodeclass)(yystack.valueAt (2-(2)))).last_value+")";
							}
							else
							{
							s=(((nodeclass)(yystack.valueAt (2-(2)))).last_value).charAt(1);
							if((char)(s-1)=='0')
										s=(char)(s+1);
									else
										s=1;
							yyval.tac=((nodeclass)(yystack.valueAt (2-(2)))).tac+"\n"+"t"+s+"="+((nodeclass)(yystack.valueAt (2-(1)))).value+"("+((nodeclass)(yystack.valueAt (2-(2)))).last_value+")";
							}
							yyval.last_value="t"+s;
							
							};
  break;
    

  case 21:
  if (yyn == 21)
    
/* Line 353 of lalr1.java  */
/* Line 329 of "Ccompiler.y"  */
    {
							
							
							char s;
							if(((((nodeclass)(yystack.valueAt (4-(3)))).last_value).charAt(0))!='t')
							{
							s='1';
							yyval.tac="t1="+((nodeclass)(yystack.valueAt (4-(1)))).value+"("+((nodeclass)(yystack.valueAt (4-(3)))).last_value+")";
							}
							else
							{
							s=(((nodeclass)(yystack.valueAt (4-(3)))).last_value).charAt(1);
							if((char)(s-1)=='0')
										s=(char)(s+1);
									else
										s=1;
							yyval.tac=((nodeclass)(yystack.valueAt (4-(3)))).tac+"\n"+"t"+s+"="+((nodeclass)(yystack.valueAt (4-(1)))).value+"("+((nodeclass)(yystack.valueAt (4-(3)))).last_value+")";
							}
							yyval.last_value="t"+s;
							
							};
  break;
    

  case 22:
  if (yyn == 22)
    
/* Line 353 of lalr1.java  */
/* Line 353 of "Ccompiler.y"  */
    {yyval.last_value=((nodeclass)(yystack.valueAt (1-(1)))).value;	};
  break;
    

  case 23:
  if (yyn == 23)
    
/* Line 353 of lalr1.java  */
/* Line 354 of "Ccompiler.y"  */
    {	yyval.last_value=((nodeclass)(yystack.valueAt (1-(1)))).value;};
  break;
    

  case 24:
  if (yyn == 24)
    
/* Line 353 of lalr1.java  */
/* Line 355 of "Ccompiler.y"  */
    {	yyval.last_value=((nodeclass)(yystack.valueAt (1-(1)))).value;};
  break;
    

  case 25:
  if (yyn == 25)
    
/* Line 353 of lalr1.java  */
/* Line 356 of "Ccompiler.y"  */
    {yyval.last_value=((nodeclass)(yystack.valueAt (1-(1)))).value;	};
  break;
    

  case 26:
  if (yyn == 26)
    
/* Line 353 of lalr1.java  */
/* Line 357 of "Ccompiler.y"  */
    {	yyval.last_value=((nodeclass)(yystack.valueAt (1-(1)))).value;};
  break;
    

  case 27:
  if (yyn == 27)
    
/* Line 353 of lalr1.java  */
/* Line 358 of "Ccompiler.y"  */
    {	yyval.last_value=((nodeclass)(yystack.valueAt (1-(1)))).value;};
  break;
    

  case 28:
  if (yyn == 28)
    
/* Line 353 of lalr1.java  */
/* Line 362 of "Ccompiler.y"  */
    {	
									yyval.last_value=((nodeclass)(yystack.valueAt (1-(1)))).last_value;
									yyval.tac=((nodeclass)(yystack.valueAt (1-(1)))).tac;
									};
  break;
    

  case 29:
  if (yyn == 29)
    
/* Line 353 of lalr1.java  */
/* Line 366 of "Ccompiler.y"  */
    {	
									// casting not considered
									yyval.last_value=((nodeclass)(yystack.valueAt (4-(4)))).last_value;
									yyval.tac=((nodeclass)(yystack.valueAt (4-(4)))).tac;
									};
  break;
    

  case 30:
  if (yyn == 30)
    
/* Line 353 of lalr1.java  */
/* Line 374 of "Ccompiler.y"  */
    {	
									yyval.last_value=((nodeclass)(yystack.valueAt (1-(1)))).last_value;
									yyval.tac=((nodeclass)(yystack.valueAt (1-(1)))).tac;
									};
  break;
    

  case 31:
  if (yyn == 31)
    
/* Line 353 of lalr1.java  */
/* Line 378 of "Ccompiler.y"  */
    {
								char s;
								String s1,s2;
								s1=((nodeclass)(yystack.valueAt (3-(1)))).last_value;
								s2=((nodeclass)(yystack.valueAt (3-(3)))).last_value;
								if(s2.charAt(0)!='t' && s1.charAt(0)!='t')
								{
								yyval.tac="t1"+"="+((nodeclass)(yystack.valueAt (3-(1)))).last_value+"*"+((nodeclass)(yystack.valueAt (3-(3)))).last_value;
								yyval.last_value="t1";
								}
								else
								{
								if(s1.charAt(0)!='t')
								{
									s=(((nodeclass)(yystack.valueAt (3-(3)))).last_value).charAt(1);
									if((char)(s-1)=='0')
										s=(char)(s+1);
									else
										s='1';
									yyval.tac=((nodeclass)(yystack.valueAt (3-(3)))).tac+"\n"+"t"+s+"="+((nodeclass)(yystack.valueAt (3-(3)))).last_value+"*"+((nodeclass)(yystack.valueAt (3-(1)))).last_value;
									yyval.last_value="t"+s;
									break;
								}
								if(s2.charAt(0)!='t')
								{
									s=(((nodeclass)(yystack.valueAt (3-(1)))).last_value).charAt(1);
									if((char)(s)=='1')
										s=(char)(s+1);
									else
										s='1';
									yyval.tac=((nodeclass)(yystack.valueAt (3-(1)))).tac+"\n"+"t"+s+"="+((nodeclass)(yystack.valueAt (3-(1)))).last_value+"*"+((nodeclass)(yystack.valueAt (3-(3)))).last_value;
									yyval.last_value="t"+s;
									break;
								}
								if(s1.compareTo(s2)<=0)
									{
									if(s2.charAt(0)!='t')
										s='1';
									else
										s=(((nodeclass)(yystack.valueAt (3-(3)))).last_value).charAt(1);
									if((char)(s-1)=='0')
										s=(char)(s+1);
									else
										s=1;
									yyval.tac=((nodeclass)(yystack.valueAt (3-(1)))).tac+"\n"+"t"+s+"="+((nodeclass)(yystack.valueAt (3-(1)))).last_value+"\n"+((nodeclass)(yystack.valueAt (3-(3)))).tac+"\n"+"t"+(char)(s+1)+"="+"t"+s+"*"+((nodeclass)(yystack.valueAt (3-(3)))).last_value;
									s=(char)(s+1);
									}
								else
									{
									if(s1.charAt(0)!='t')
										s='1';
									else
									s=(((nodeclass)(yystack.valueAt (3-(1)))).last_value).charAt(1);
									if((char)(s-1)=='0')
										s=(char)(s+1);
									else
										s=1;
									yyval.tac=((nodeclass)(yystack.valueAt (3-(1)))).tac+"\n"+((nodeclass)(yystack.valueAt (3-(3)))).tac+"\n"+"t"+s+"="+((nodeclass)(yystack.valueAt (3-(1)))).last_value+"*"+((nodeclass)(yystack.valueAt (3-(3)))).last_value;
									}
								yyval.last_value="t"+s;
								}
								};
  break;
    

  case 32:
  if (yyn == 32)
    
/* Line 353 of lalr1.java  */
/* Line 440 of "Ccompiler.y"  */
    {
							char s;
								String s1,s2;
								s1=((nodeclass)(yystack.valueAt (3-(1)))).last_value;
								s2=((nodeclass)(yystack.valueAt (3-(3)))).last_value;
								if(s2.charAt(0)!='t' && s1.charAt(0)!='t')
								{
								yyval.tac="t1"+"="+((nodeclass)(yystack.valueAt (3-(1)))).last_value+"/"+((nodeclass)(yystack.valueAt (3-(3)))).last_value;
								yyval.last_value="t1";
								}
								else
								{
								if(s1.charAt(0)!='t')
								{
									s=(((nodeclass)(yystack.valueAt (3-(3)))).last_value).charAt(1);
									if((char)(s-1)=='0')
										s=(char)(s+1);
									else
										s='1';
									yyval.tac=((nodeclass)(yystack.valueAt (3-(3)))).tac+"\n"+"t"+s+"="+((nodeclass)(yystack.valueAt (3-(1)))).last_value+"/"+((nodeclass)(yystack.valueAt (3-(3)))).last_value;
									yyval.last_value="t"+s;
									break;
								}
								if(s2.charAt(0)!='t')
								{
									s=(((nodeclass)(yystack.valueAt (3-(1)))).last_value).charAt(1);
									if((char)(s)=='1')
										s=(char)(s+1);
									else
										s='1';
									yyval.tac=((nodeclass)(yystack.valueAt (3-(1)))).tac+"\n"+"t"+s+"="+((nodeclass)(yystack.valueAt (3-(1)))).last_value+"/"+((nodeclass)(yystack.valueAt (3-(3)))).last_value;
									yyval.last_value="t"+s;
									break;
								}
								if(s1.compareTo(s2)<=0)
									{
									if(s2.charAt(0)!='t')
										s='1';
									else
										s=(((nodeclass)(yystack.valueAt (3-(3)))).last_value).charAt(1);
									if((char)(s-1)=='0')
										s=(char)(s+1);
									else
										s=1;
									yyval.tac=((nodeclass)(yystack.valueAt (3-(1)))).tac+"\n"+"t"+s+"="+((nodeclass)(yystack.valueAt (3-(1)))).last_value+"\n"+((nodeclass)(yystack.valueAt (3-(3)))).tac+"\n"+"t"+(char)(s+1)+"="+"t"+s+"/"+((nodeclass)(yystack.valueAt (3-(3)))).last_value;
									s=(char)(s+1);
									}
								else
									{
									if(s1.charAt(0)!='t')
										s='1';
									else
									s=(((nodeclass)(yystack.valueAt (3-(1)))).last_value).charAt(1);
									if((char)(s-1)=='0')
										s=(char)(s+1);
									else
										s=1;
									yyval.tac=((nodeclass)(yystack.valueAt (3-(1)))).tac+"\n"+((nodeclass)(yystack.valueAt (3-(3)))).tac+"\n"+"t"+s+"="+((nodeclass)(yystack.valueAt (3-(1)))).last_value+"/"+((nodeclass)(yystack.valueAt (3-(3)))).last_value;
									}
								yyval.last_value="t"+s;
								}
								};
  break;
    

  case 33:
  if (yyn == 33)
    
/* Line 353 of lalr1.java  */
/* Line 502 of "Ccompiler.y"  */
    {
							char s;
								String s1,s2;
								s1=((nodeclass)(yystack.valueAt (3-(1)))).last_value;
								s2=((nodeclass)(yystack.valueAt (3-(3)))).last_value;
								if(s2.charAt(0)!='t' && s1.charAt(0)!='t')
								{
								yyval.tac="t1"+"="+((nodeclass)(yystack.valueAt (3-(1)))).last_value+"%"+((nodeclass)(yystack.valueAt (3-(3)))).last_value;
								yyval.last_value="t1";
								}
								else
								{
								if(s1.charAt(0)!='t')
								{
									s=(((nodeclass)(yystack.valueAt (3-(3)))).last_value).charAt(1);
									if((char)(s-1)=='0')
										s=(char)(s+1);
									else
										s='1';
									yyval.tac=((nodeclass)(yystack.valueAt (3-(3)))).tac+"\n"+"t"+s+"="+((nodeclass)(yystack.valueAt (3-(1)))).last_value+"%"+((nodeclass)(yystack.valueAt (3-(3)))).last_value;
									yyval.last_value="t"+s;
									break;
								}
								if(s2.charAt(0)!='t')
								{
									s=(((nodeclass)(yystack.valueAt (3-(1)))).last_value).charAt(1);
									if((char)(s)=='1')
										s=(char)(s+1);
									else
										s='1';
									yyval.tac=((nodeclass)(yystack.valueAt (3-(1)))).tac+"\n"+"t"+s+"="+((nodeclass)(yystack.valueAt (3-(1)))).last_value+"%"+((nodeclass)(yystack.valueAt (3-(3)))).last_value;
									yyval.last_value="t"+s;
									break;
								}
								if(s1.compareTo(s2)<=0)
									{
									if(s2.charAt(0)!='t')
										s='1';
									else
										s=(((nodeclass)(yystack.valueAt (3-(3)))).last_value).charAt(1);
									if((char)(s-1)=='0')
										s=(char)(s+1);
									else
										s=1;
									yyval.tac=((nodeclass)(yystack.valueAt (3-(1)))).tac+"\n"+"t"+s+"="+((nodeclass)(yystack.valueAt (3-(1)))).last_value+"\n"+((nodeclass)(yystack.valueAt (3-(3)))).tac+"\n"+"t"+(char)(s+1)+"="+"t"+s+"%"+((nodeclass)(yystack.valueAt (3-(3)))).last_value;
									s=(char)(s+1);
									}
								else
									{
									if(s1.charAt(0)!='t')
										s='1';
									else
									s=(((nodeclass)(yystack.valueAt (3-(1)))).last_value).charAt(1);
									if((char)(s-1)=='0')
										s=(char)(s+1);
									else
										s=1;
									yyval.tac=((nodeclass)(yystack.valueAt (3-(1)))).tac+"\n"+((nodeclass)(yystack.valueAt (3-(3)))).tac+"\n"+"t"+s+"="+((nodeclass)(yystack.valueAt (3-(1)))).last_value+"%"+((nodeclass)(yystack.valueAt (3-(3)))).last_value;
									}
								yyval.last_value="t"+s;
								}
								};
  break;
    

  case 34:
  if (yyn == 34)
    
/* Line 353 of lalr1.java  */
/* Line 567 of "Ccompiler.y"  */
    {	
									yyval.last_value=((nodeclass)(yystack.valueAt (1-(1)))).last_value;
									yyval.tac=((nodeclass)(yystack.valueAt (1-(1)))).tac;
									};
  break;
    

  case 35:
  if (yyn == 35)
    
/* Line 353 of lalr1.java  */
/* Line 571 of "Ccompiler.y"  */
    {
								char s;
								String s1,s2;
								s1=((nodeclass)(yystack.valueAt (3-(1)))).last_value;
								s2=((nodeclass)(yystack.valueAt (3-(3)))).last_value;
								if(s2.charAt(0)!='t' && s1.charAt(0)!='t')
								{
								yyval.tac="t1"+"="+((nodeclass)(yystack.valueAt (3-(1)))).last_value+"+"+((nodeclass)(yystack.valueAt (3-(3)))).last_value;
								yyval.last_value="t1";
								}
								else
								{
								if(s1.charAt(0)!='t')
								{
									s=(((nodeclass)(yystack.valueAt (3-(3)))).last_value).charAt(1);
									if((char)(s-1)=='0')
										s=(char)(s+1);
									else
										s='1';
									yyval.tac=((nodeclass)(yystack.valueAt (3-(3)))).tac+"\n"+"t"+s+"="+((nodeclass)(yystack.valueAt (3-(3)))).last_value+"+"+((nodeclass)(yystack.valueAt (3-(1)))).last_value;
									yyval.last_value="t"+s;
									break;
								}
								if(s2.charAt(0)!='t')
								{
									s=(((nodeclass)(yystack.valueAt (3-(1)))).last_value).charAt(1);
									if((char)(s)=='1')
										s=(char)(s+1);
									else
										s='1';
									yyval.tac=((nodeclass)(yystack.valueAt (3-(1)))).tac+"\n"+"t"+s+"="+((nodeclass)(yystack.valueAt (3-(1)))).last_value+"+"+((nodeclass)(yystack.valueAt (3-(3)))).last_value;
									yyval.last_value="t"+s;
									break;
								}
								if(s1.compareTo(s2)<=0)
									{
									if(s2.charAt(0)!='t')
										s='1';
									else
										s=(((nodeclass)(yystack.valueAt (3-(3)))).last_value).charAt(1);
									if((char)(s)=='1')
										s=(char)(s+1);
									else
										s='1';
									yyval.tac=((nodeclass)(yystack.valueAt (3-(1)))).tac+"\n"+"t"+s+"="+((nodeclass)(yystack.valueAt (3-(1)))).last_value+"\n"+((nodeclass)(yystack.valueAt (3-(3)))).tac+"\n"+"t"+(char)(s+1)+"="+"t"+s+"+"+((nodeclass)(yystack.valueAt (3-(3)))).last_value;
									s=(char)(s+1);
									}
								else
									{
									if(s1.charAt(0)!='t')
										s='1';
									else
									s=(((nodeclass)(yystack.valueAt (3-(1)))).last_value).charAt(1);
									if((char)(s)=='1')
										s=(char)(s+1);
									else
										s='1';
									yyval.tac=((nodeclass)(yystack.valueAt (3-(1)))).tac+"\n"+((nodeclass)(yystack.valueAt (3-(3)))).tac+"\n"+"t"+s+"="+((nodeclass)(yystack.valueAt (3-(1)))).last_value+"+"+((nodeclass)(yystack.valueAt (3-(3)))).last_value;
									}
								yyval.last_value="t"+s;
								}
								
							};
  break;
    

  case 36:
  if (yyn == 36)
    
/* Line 353 of lalr1.java  */
/* Line 634 of "Ccompiler.y"  */
    {					
								char s;
								String s1,s2;
								s1=((nodeclass)(yystack.valueAt (3-(1)))).last_value;
								s2=((nodeclass)(yystack.valueAt (3-(3)))).last_value;
								if(s2.charAt(0)!='t' && s1.charAt(0)!='t')
								{
								yyval.tac="t1"+"="+((nodeclass)(yystack.valueAt (3-(1)))).last_value+"-"+((nodeclass)(yystack.valueAt (3-(3)))).last_value;
								yyval.last_value="t1";
								}
								else
								{
								if(s1.charAt(0)!='t')
								{
									s=(((nodeclass)(yystack.valueAt (3-(3)))).last_value).charAt(1);
									if((char)(s-1)=='0')
										s=(char)(s+1);
									else
										s='1';
									yyval.tac=((nodeclass)(yystack.valueAt (3-(3)))).tac+"\n"+"t"+s+"="+((nodeclass)(yystack.valueAt (3-(1)))).last_value+"-"+((nodeclass)(yystack.valueAt (3-(3)))).last_value;
									yyval.last_value="t"+s;
									break;
								}
								if(s2.charAt(0)!='t')
								{
									s=(((nodeclass)(yystack.valueAt (3-(1)))).last_value).charAt(1);
									if((char)(s)=='1')
										s=(char)(s+1);
									else
										s='1';
									yyval.tac=((nodeclass)(yystack.valueAt (3-(1)))).tac+"\n"+"t"+s+"="+((nodeclass)(yystack.valueAt (3-(1)))).last_value+"-"+((nodeclass)(yystack.valueAt (3-(3)))).last_value;
									yyval.last_value="t"+s;
									break;
								}
								if(s1.compareTo(s2)<=0)
									{
									if(s2.charAt(0)!='t')
										s='1';
									else
										s=(((nodeclass)(yystack.valueAt (3-(3)))).last_value).charAt(1);
									if((char)(s-1)=='0')
										s=(char)(s+1);
									else
										s=1;
									yyval.tac=((nodeclass)(yystack.valueAt (3-(1)))).tac+"\n"+"t"+s+"="+((nodeclass)(yystack.valueAt (3-(1)))).last_value+"\n"+((nodeclass)(yystack.valueAt (3-(3)))).tac+"\n"+"t"+(char)(s+1)+"="+"t"+s+"-"+((nodeclass)(yystack.valueAt (3-(3)))).last_value;
									s=(char)(s+1);
									}
								else
									{
									if(s1.charAt(0)!='t')
										s='1';
									else
									s=(((nodeclass)(yystack.valueAt (3-(1)))).last_value).charAt(1);
									if((char)(s-1)=='0')
										s=(char)(s+1);
									else
										s=1;
									yyval.tac=((nodeclass)(yystack.valueAt (3-(1)))).tac+"\n"+((nodeclass)(yystack.valueAt (3-(3)))).tac+"\n"+"t"+s+"="+((nodeclass)(yystack.valueAt (3-(1)))).last_value+"-"+((nodeclass)(yystack.valueAt (3-(3)))).last_value;
									}
								yyval.last_value="t"+s;
								}
								};
  break;
    

  case 37:
  if (yyn == 37)
    
/* Line 353 of lalr1.java  */
/* Line 699 of "Ccompiler.y"  */
    {	
									yyval.last_value=((nodeclass)(yystack.valueAt (1-(1)))).last_value;
									yyval.tac=((nodeclass)(yystack.valueAt (1-(1)))).tac;
									};
  break;
    

  case 38:
  if (yyn == 38)
    
/* Line 353 of lalr1.java  */
/* Line 703 of "Ccompiler.y"  */
    {					
								char s;
								String s1,s2;
								s1=((nodeclass)(yystack.valueAt (3-(1)))).last_value;
								s2=((nodeclass)(yystack.valueAt (3-(3)))).last_value;
								if(s2.charAt(0)!='t' && s1.charAt(0)!='t')
								{
								yyval.tac="t1"+"="+((nodeclass)(yystack.valueAt (3-(1)))).last_value+((nodeclass)(yystack.valueAt (3-(2)))).value+((nodeclass)(yystack.valueAt (3-(3)))).last_value;
								yyval.last_value="t1";
								}
								else
								{
								if(s1.charAt(0)!='t')
								{
									s=(((nodeclass)(yystack.valueAt (3-(3)))).last_value).charAt(1);
									if((char)(s-1)=='0')
										s=(char)(s+1);
									else
										s='1';
									yyval.tac=((nodeclass)(yystack.valueAt (3-(3)))).tac+"\n"+"t"+s+"="+((nodeclass)(yystack.valueAt (3-(1)))).last_value+((nodeclass)(yystack.valueAt (3-(2)))).value+((nodeclass)(yystack.valueAt (3-(3)))).last_value;
									yyval.last_value="t"+s;
									break;
								}
								if(s2.charAt(0)!='t')
								{
									s=(((nodeclass)(yystack.valueAt (3-(1)))).last_value).charAt(1);
									if((char)(s)=='1')
										s=(char)(s+1);
									else
										s='1';
									yyval.tac=((nodeclass)(yystack.valueAt (3-(1)))).tac+"\n"+"t"+s+"="+((nodeclass)(yystack.valueAt (3-(1)))).last_value+((nodeclass)(yystack.valueAt (3-(2)))).value+((nodeclass)(yystack.valueAt (3-(3)))).last_value;
									yyval.last_value="t"+s;
									break;
								}
								if(s1.compareTo(s2)<=0)
									{
									if(s2.charAt(0)!='t')
										s='1';
									else
										s=(((nodeclass)(yystack.valueAt (3-(3)))).last_value).charAt(1);
									if((char)(s-1)=='0')
										s=(char)(s+1);
									else
										s=1;
									yyval.tac=((nodeclass)(yystack.valueAt (3-(1)))).tac+"\n"+"t"+s+"="+((nodeclass)(yystack.valueAt (3-(1)))).last_value+"\n"+((nodeclass)(yystack.valueAt (3-(3)))).tac+"\n"+"t"+(char)(s+1)+"="+"t"+s+((nodeclass)(yystack.valueAt (3-(2)))).value+((nodeclass)(yystack.valueAt (3-(3)))).last_value;
									s=(char)(s+1);
									}
								else
									{
									if(s1.charAt(0)!='t')
										s='1';
									else
									s=(((nodeclass)(yystack.valueAt (3-(1)))).last_value).charAt(1);
									if((char)(s-1)=='0')
										s=(char)(s+1);
									else
										s=1;
									yyval.tac=((nodeclass)(yystack.valueAt (3-(1)))).tac+"\n"+((nodeclass)(yystack.valueAt (3-(3)))).tac+"\n"+"t"+s+"="+((nodeclass)(yystack.valueAt (3-(1)))).last_value+((nodeclass)(yystack.valueAt (3-(2)))).value+((nodeclass)(yystack.valueAt (3-(3)))).last_value;
									}
								yyval.last_value="t"+s;
								}
								};
  break;
    

  case 39:
  if (yyn == 39)
    
/* Line 353 of lalr1.java  */
/* Line 765 of "Ccompiler.y"  */
    {					
								char s;
								String s1,s2;
								s1=((nodeclass)(yystack.valueAt (3-(1)))).last_value;
								s2=((nodeclass)(yystack.valueAt (3-(3)))).last_value;
								if(s2.charAt(0)!='t' && s1.charAt(0)!='t')
								{
								yyval.tac="t1"+"="+((nodeclass)(yystack.valueAt (3-(1)))).last_value+((nodeclass)(yystack.valueAt (3-(2)))).value+((nodeclass)(yystack.valueAt (3-(3)))).last_value;
								yyval.last_value="t1";
								}
								else
								{
								if(s1.charAt(0)!='t')
								{
									s=(((nodeclass)(yystack.valueAt (3-(3)))).last_value).charAt(1);
									if((char)(s-1)=='0')
										s=(char)(s+1);
									else
										s='1';
									yyval.tac=((nodeclass)(yystack.valueAt (3-(3)))).tac+"\n"+"t"+s+"="+((nodeclass)(yystack.valueAt (3-(1)))).last_value+((nodeclass)(yystack.valueAt (3-(2)))).value+((nodeclass)(yystack.valueAt (3-(3)))).last_value;
									yyval.last_value="t"+s;
									break;
								}
								if(s2.charAt(0)!='t')
								{
									s=(((nodeclass)(yystack.valueAt (3-(1)))).last_value).charAt(1);
									if((char)(s)=='1')
										s=(char)(s+1);
									else
										s='1';
									yyval.tac=((nodeclass)(yystack.valueAt (3-(1)))).tac+"\n"+"t"+s+"="+((nodeclass)(yystack.valueAt (3-(1)))).last_value+((nodeclass)(yystack.valueAt (3-(2)))).value+((nodeclass)(yystack.valueAt (3-(3)))).last_value;
									yyval.last_value="t"+s;
									break;
								}
								if(s1.compareTo(s2)<=0)
									{
									if(s2.charAt(0)!='t')
										s='1';
									else
										s=(((nodeclass)(yystack.valueAt (3-(3)))).last_value).charAt(1);
									if((char)(s-1)=='0')
										s=(char)(s+1);
									else
										s=1;
									yyval.tac=((nodeclass)(yystack.valueAt (3-(1)))).tac+"\n"+"t"+s+"="+((nodeclass)(yystack.valueAt (3-(1)))).last_value+"\n"+((nodeclass)(yystack.valueAt (3-(3)))).tac+"\n"+"t"+(char)(s+1)+"="+"t"+s+((nodeclass)(yystack.valueAt (3-(2)))).value+((nodeclass)(yystack.valueAt (3-(3)))).last_value;
									s=(char)(s+1);
									}
								else
									{
									if(s1.charAt(0)!='t')
										s='1';
									else
									s=(((nodeclass)(yystack.valueAt (3-(1)))).last_value).charAt(1);
									if((char)(s-1)=='0')
										s=(char)(s+1);
									else
										s=1;
									yyval.tac=((nodeclass)(yystack.valueAt (3-(1)))).tac+"\n"+((nodeclass)(yystack.valueAt (3-(3)))).tac+"\n"+"t"+s+"="+((nodeclass)(yystack.valueAt (3-(1)))).last_value+((nodeclass)(yystack.valueAt (3-(2)))).value+((nodeclass)(yystack.valueAt (3-(3)))).last_value;
									}
								yyval.last_value="t"+s;
								}
								};
  break;
    

  case 40:
  if (yyn == 40)
    
/* Line 353 of lalr1.java  */
/* Line 830 of "Ccompiler.y"  */
    {	
									yyval.last_value=((nodeclass)(yystack.valueAt (1-(1)))).last_value;
									yyval.tac=((nodeclass)(yystack.valueAt (1-(1)))).tac;
									};
  break;
    

  case 41:
  if (yyn == 41)
    
/* Line 353 of lalr1.java  */
/* Line 834 of "Ccompiler.y"  */
    {					
								char s;
								String s1,s2;
								s1=((nodeclass)(yystack.valueAt (3-(1)))).last_value;
								s2=((nodeclass)(yystack.valueAt (3-(3)))).last_value;
								if(s2.charAt(0)!='t' && s1.charAt(0)!='t')
								{
								yyval.tac="t1"+"="+((nodeclass)(yystack.valueAt (3-(1)))).last_value+((nodeclass)(yystack.valueAt (3-(2)))).value+((nodeclass)(yystack.valueAt (3-(3)))).last_value;
								yyval.last_value="t1";
								}
								else
								{
								if(s1.charAt(0)!='t')
								{
									s=(((nodeclass)(yystack.valueAt (3-(3)))).last_value).charAt(1);
									if((char)(s-1)=='0')
										s=(char)(s+1);
									else
										s='1';
									yyval.tac=((nodeclass)(yystack.valueAt (3-(3)))).tac+"\n"+"t"+s+"="+((nodeclass)(yystack.valueAt (3-(1)))).last_value+((nodeclass)(yystack.valueAt (3-(2)))).value+((nodeclass)(yystack.valueAt (3-(3)))).last_value;
									yyval.last_value="t"+s;
									break;
								}
								if(s2.charAt(0)!='t')
								{
									s=(((nodeclass)(yystack.valueAt (3-(1)))).last_value).charAt(1);
									if((char)(s)=='1')
										s=(char)(s+1);
									else
										s='1';
									yyval.tac=((nodeclass)(yystack.valueAt (3-(1)))).tac+"\n"+"t"+s+"="+((nodeclass)(yystack.valueAt (3-(1)))).last_value+((nodeclass)(yystack.valueAt (3-(2)))).value+((nodeclass)(yystack.valueAt (3-(3)))).last_value;
									yyval.last_value="t"+s;
									break;
								}
								if(s1.compareTo(s2)<=0)
									{
									if(s2.charAt(0)!='t')
										s='1';
									else
										s=(((nodeclass)(yystack.valueAt (3-(3)))).last_value).charAt(1);
									if((char)(s-1)=='0')
										s=(char)(s+1);
									else
										s=1;
									yyval.tac=((nodeclass)(yystack.valueAt (3-(1)))).tac+"\n"+"t"+s+"="+((nodeclass)(yystack.valueAt (3-(1)))).last_value+"\n"+((nodeclass)(yystack.valueAt (3-(3)))).tac+"\n"+"t"+(char)(s+1)+"="+"t"+s+((nodeclass)(yystack.valueAt (3-(2)))).value+((nodeclass)(yystack.valueAt (3-(3)))).last_value;
									s=(char)(s+1);
									}
								else
									{
									if(s1.charAt(0)!='t')
										s='1';
									else
									s=(((nodeclass)(yystack.valueAt (3-(1)))).last_value).charAt(1);
									if((char)(s-1)=='0')
										s=(char)(s+1);
									else
										s=1;
									yyval.tac=((nodeclass)(yystack.valueAt (3-(1)))).tac+"\n"+((nodeclass)(yystack.valueAt (3-(3)))).tac+"\n"+"t"+s+"="+((nodeclass)(yystack.valueAt (3-(1)))).last_value+((nodeclass)(yystack.valueAt (3-(2)))).value+((nodeclass)(yystack.valueAt (3-(3)))).last_value;
									}
								yyval.last_value="t"+s;
								}
								};
  break;
    

  case 42:
  if (yyn == 42)
    
/* Line 353 of lalr1.java  */
/* Line 896 of "Ccompiler.y"  */
    {					
								char s;
								String s1,s2;
								s1=((nodeclass)(yystack.valueAt (3-(1)))).last_value;
								s2=((nodeclass)(yystack.valueAt (3-(3)))).last_value;
								if(s2.charAt(0)!='t' && s1.charAt(0)!='t')
								{
								yyval.tac="t1"+"="+((nodeclass)(yystack.valueAt (3-(1)))).last_value+((nodeclass)(yystack.valueAt (3-(2)))).value+((nodeclass)(yystack.valueAt (3-(3)))).last_value;
								yyval.last_value="t1";
								}
								else
								{
								if(s1.charAt(0)!='t')
								{
									s=(((nodeclass)(yystack.valueAt (3-(3)))).last_value).charAt(1);
									if((char)(s-1)=='0')
										s=(char)(s+1);
									else
										s='1';
									yyval.tac=((nodeclass)(yystack.valueAt (3-(3)))).tac+"\n"+"t"+s+"="+((nodeclass)(yystack.valueAt (3-(1)))).last_value+((nodeclass)(yystack.valueAt (3-(2)))).value+((nodeclass)(yystack.valueAt (3-(3)))).last_value;
									yyval.last_value="t"+s;
									break;
								}
								if(s2.charAt(0)!='t')
								{
									s=(((nodeclass)(yystack.valueAt (3-(1)))).last_value).charAt(1);
									if((char)(s)=='1')
										s=(char)(s+1);
									else
										s='1';
									yyval.tac=((nodeclass)(yystack.valueAt (3-(1)))).tac+"\n"+"t"+s+"="+((nodeclass)(yystack.valueAt (3-(1)))).last_value+((nodeclass)(yystack.valueAt (3-(2)))).value+((nodeclass)(yystack.valueAt (3-(3)))).last_value;
									yyval.last_value="t"+s;
									break;
								}
								if(s1.compareTo(s2)<=0)
									{
									if(s2.charAt(0)!='t')
										s='1';
									else
										s=(((nodeclass)(yystack.valueAt (3-(3)))).last_value).charAt(1);
									if((char)(s-1)=='0')
										s=(char)(s+1);
									else
										s=1;
									yyval.tac=((nodeclass)(yystack.valueAt (3-(1)))).tac+"\n"+"t"+s+"="+((nodeclass)(yystack.valueAt (3-(1)))).last_value+"\n"+((nodeclass)(yystack.valueAt (3-(3)))).tac+"\n"+"t"+(char)(s+1)+"="+"t"+s+((nodeclass)(yystack.valueAt (3-(2)))).value+((nodeclass)(yystack.valueAt (3-(3)))).last_value;
									s=(char)(s+1);
									}
								else
									{
									if(s1.charAt(0)!='t')
										s='1';
									else
									s=(((nodeclass)(yystack.valueAt (3-(1)))).last_value).charAt(1);
									if((char)(s-1)=='0')
										s=(char)(s+1);
									else
										s=1;
									yyval.tac=((nodeclass)(yystack.valueAt (3-(1)))).tac+"\n"+((nodeclass)(yystack.valueAt (3-(3)))).tac+"\n"+"t"+s+"="+((nodeclass)(yystack.valueAt (3-(1)))).last_value+((nodeclass)(yystack.valueAt (3-(2)))).value+((nodeclass)(yystack.valueAt (3-(3)))).last_value;
									}
								yyval.last_value="t"+s;
								}
								};
  break;
    

  case 43:
  if (yyn == 43)
    
/* Line 353 of lalr1.java  */
/* Line 958 of "Ccompiler.y"  */
    {					
								char s;
								String s1,s2;
								s1=((nodeclass)(yystack.valueAt (3-(1)))).last_value;
								s2=((nodeclass)(yystack.valueAt (3-(3)))).last_value;
								if(s2.charAt(0)!='t' && s1.charAt(0)!='t')
								{
								yyval.tac="t1"+"="+((nodeclass)(yystack.valueAt (3-(1)))).last_value+((nodeclass)(yystack.valueAt (3-(2)))).value+((nodeclass)(yystack.valueAt (3-(3)))).last_value;
								yyval.last_value="t1";
								}
								else
								{
								if(s1.charAt(0)!='t')
								{
									s=(((nodeclass)(yystack.valueAt (3-(3)))).last_value).charAt(1);
									if((char)(s-1)=='0')
										s=(char)(s+1);
									else
										s='1';
									yyval.tac=((nodeclass)(yystack.valueAt (3-(3)))).tac+"\n"+"t"+s+"="+((nodeclass)(yystack.valueAt (3-(1)))).last_value+((nodeclass)(yystack.valueAt (3-(2)))).value+((nodeclass)(yystack.valueAt (3-(3)))).last_value;
									yyval.last_value="t"+s;
									break;
								}
								if(s2.charAt(0)!='t')
								{
									s=(((nodeclass)(yystack.valueAt (3-(1)))).last_value).charAt(1);
									if((char)(s)=='1')
										s=(char)(s+1);
									else
										s='1';
									yyval.tac=((nodeclass)(yystack.valueAt (3-(1)))).tac+"\n"+"t"+s+"="+((nodeclass)(yystack.valueAt (3-(1)))).last_value+((nodeclass)(yystack.valueAt (3-(2)))).value+((nodeclass)(yystack.valueAt (3-(3)))).last_value;
									yyval.last_value="t"+s;
									break;
								}
								if(s1.compareTo(s2)<=0)
									{
									if(s2.charAt(0)!='t')
										s='1';
									else
										s=(((nodeclass)(yystack.valueAt (3-(3)))).last_value).charAt(1);
									if((char)(s-1)=='0')
										s=(char)(s+1);
									else
										s=1;
									yyval.tac=((nodeclass)(yystack.valueAt (3-(1)))).tac+"\n"+"t"+s+"="+((nodeclass)(yystack.valueAt (3-(1)))).last_value+"\n"+((nodeclass)(yystack.valueAt (3-(3)))).tac+"\n"+"t"+(char)(s+1)+"="+"t"+s+((nodeclass)(yystack.valueAt (3-(2)))).value+((nodeclass)(yystack.valueAt (3-(3)))).last_value;
									s=(char)(s+1);
									}
								else
									{
									if(s1.charAt(0)!='t')
										s='1';
									else
									s=(((nodeclass)(yystack.valueAt (3-(1)))).last_value).charAt(1);
									if((char)(s-1)=='0')
										s=(char)(s+1);
									else
										s=1;
									yyval.tac=((nodeclass)(yystack.valueAt (3-(1)))).tac+"\n"+((nodeclass)(yystack.valueAt (3-(3)))).tac+"\n"+"t"+s+"="+((nodeclass)(yystack.valueAt (3-(1)))).last_value+((nodeclass)(yystack.valueAt (3-(2)))).value+((nodeclass)(yystack.valueAt (3-(3)))).last_value;
									}
								yyval.last_value="t"+s;
								}
								};
  break;
    

  case 44:
  if (yyn == 44)
    
/* Line 353 of lalr1.java  */
/* Line 1020 of "Ccompiler.y"  */
    {					
								char s;
								String s1,s2;
								s1=((nodeclass)(yystack.valueAt (3-(1)))).last_value;
								s2=((nodeclass)(yystack.valueAt (3-(3)))).last_value;
								if(s2.charAt(0)!='t' && s1.charAt(0)!='t')
								{
								yyval.tac="t1"+"="+((nodeclass)(yystack.valueAt (3-(1)))).last_value+((nodeclass)(yystack.valueAt (3-(2)))).value+((nodeclass)(yystack.valueAt (3-(3)))).last_value;
								yyval.last_value="t1";
								}
								else
								{
								if(s1.charAt(0)!='t')
								{
									s=(((nodeclass)(yystack.valueAt (3-(3)))).last_value).charAt(1);
									if((char)(s-1)=='0')
										s=(char)(s+1);
									else
										s='1';
									yyval.tac=((nodeclass)(yystack.valueAt (3-(3)))).tac+"\n"+"t"+s+"="+((nodeclass)(yystack.valueAt (3-(1)))).last_value+((nodeclass)(yystack.valueAt (3-(2)))).value+((nodeclass)(yystack.valueAt (3-(3)))).last_value;
									yyval.last_value="t"+s;
									break;
								}
								if(s2.charAt(0)!='t')
								{
									s=(((nodeclass)(yystack.valueAt (3-(1)))).last_value).charAt(1);
									if((char)(s)=='1')
										s=(char)(s+1);
									else
										s='1';
									yyval.tac=((nodeclass)(yystack.valueAt (3-(1)))).tac+"\n"+"t"+s+"="+((nodeclass)(yystack.valueAt (3-(1)))).last_value+((nodeclass)(yystack.valueAt (3-(2)))).value+((nodeclass)(yystack.valueAt (3-(3)))).last_value;
									yyval.last_value="t"+s;
									break;
								}
								if(s1.compareTo(s2)<=0)
									{
									if(s2.charAt(0)!='t')
										s='1';
									else
										s=(((nodeclass)(yystack.valueAt (3-(3)))).last_value).charAt(1);
									if((char)(s-1)=='0')
										s=(char)(s+1);
									else
										s=1;
									yyval.tac=((nodeclass)(yystack.valueAt (3-(1)))).tac+"\n"+"t"+s+"="+((nodeclass)(yystack.valueAt (3-(1)))).last_value+"\n"+((nodeclass)(yystack.valueAt (3-(3)))).tac+"\n"+"t"+(char)(s+1)+"="+"t"+s+((nodeclass)(yystack.valueAt (3-(2)))).value+((nodeclass)(yystack.valueAt (3-(3)))).last_value;
									s=(char)(s+1);
									}
								else
									{
									if(s1.charAt(0)!='t')
										s='1';
									else
									s=(((nodeclass)(yystack.valueAt (3-(1)))).last_value).charAt(1);
									if((char)(s-1)=='0')
										s=(char)(s+1);
									else
										s=1;
									yyval.tac=((nodeclass)(yystack.valueAt (3-(1)))).tac+"\n"+((nodeclass)(yystack.valueAt (3-(3)))).tac+"\n"+"t"+s+"="+((nodeclass)(yystack.valueAt (3-(1)))).last_value+((nodeclass)(yystack.valueAt (3-(2)))).value+((nodeclass)(yystack.valueAt (3-(3)))).last_value;
									}
								yyval.last_value="t"+s;
								}
								};
  break;
    

  case 45:
  if (yyn == 45)
    
/* Line 353 of lalr1.java  */
/* Line 1085 of "Ccompiler.y"  */
    {	
									yyval.last_value=((nodeclass)(yystack.valueAt (1-(1)))).last_value;
									yyval.tac=((nodeclass)(yystack.valueAt (1-(1)))).tac;
									};
  break;
    

  case 46:
  if (yyn == 46)
    
/* Line 353 of lalr1.java  */
/* Line 1089 of "Ccompiler.y"  */
    {	System.out.println("\ninside eq op..\n");};
  break;
    

  case 47:
  if (yyn == 47)
    
/* Line 353 of lalr1.java  */
/* Line 1090 of "Ccompiler.y"  */
    {	};
  break;
    

  case 48:
  if (yyn == 48)
    
/* Line 353 of lalr1.java  */
/* Line 1094 of "Ccompiler.y"  */
    {	yyval.last_value=((nodeclass)(yystack.valueAt (1-(1)))).last_value;
												yyval.tac=((nodeclass)(yystack.valueAt (1-(1)))).tac;};
  break;
    

  case 49:
  if (yyn == 49)
    
/* Line 353 of lalr1.java  */
/* Line 1096 of "Ccompiler.y"  */
    {					
								char s;
								String s1,s2;
								s1=((nodeclass)(yystack.valueAt (3-(1)))).last_value;
								s2=((nodeclass)(yystack.valueAt (3-(3)))).last_value;
								if(s2.charAt(0)!='t' && s1.charAt(0)!='t')
								{
								yyval.tac="t1"+"="+((nodeclass)(yystack.valueAt (3-(1)))).last_value+((nodeclass)(yystack.valueAt (3-(2)))).value+((nodeclass)(yystack.valueAt (3-(3)))).last_value;
								yyval.last_value="t1";
								}
								else
								{
								if(s1.charAt(0)!='t')
								{
									s=(((nodeclass)(yystack.valueAt (3-(3)))).last_value).charAt(1);
									if((char)(s-1)=='0')
										s=(char)(s+1);
									else
										s='1';
									yyval.tac=((nodeclass)(yystack.valueAt (3-(3)))).tac+"\n"+"t"+s+"="+((nodeclass)(yystack.valueAt (3-(1)))).last_value+((nodeclass)(yystack.valueAt (3-(2)))).value+((nodeclass)(yystack.valueAt (3-(3)))).last_value;
									yyval.last_value="t"+s;
									break;
								}
								if(s2.charAt(0)!='t')
								{
									s=(((nodeclass)(yystack.valueAt (3-(1)))).last_value).charAt(1);
									if((char)(s)=='1')
										s=(char)(s+1);
									else
										s='1';
									yyval.tac=((nodeclass)(yystack.valueAt (3-(1)))).tac+"\n"+"t"+s+"="+((nodeclass)(yystack.valueAt (3-(1)))).last_value+((nodeclass)(yystack.valueAt (3-(2)))).value+((nodeclass)(yystack.valueAt (3-(3)))).last_value;
									yyval.last_value="t"+s;
									break;
								}
								if(s1.compareTo(s2)<=0)
									{
									if(s2.charAt(0)!='t')
										s='1';
									else
										s=(((nodeclass)(yystack.valueAt (3-(3)))).last_value).charAt(1);
									if((char)(s-1)=='0')
										s=(char)(s+1);
									else
										s=1;
									yyval.tac=((nodeclass)(yystack.valueAt (3-(1)))).tac+"\n"+"t"+s+"="+((nodeclass)(yystack.valueAt (3-(1)))).last_value+"\n"+((nodeclass)(yystack.valueAt (3-(3)))).tac+"\n"+"t"+(char)(s+1)+"="+"t"+s+((nodeclass)(yystack.valueAt (3-(2)))).value+((nodeclass)(yystack.valueAt (3-(3)))).last_value;
									s=(char)(s+1);
									}
								else
									{
									if(s1.charAt(0)!='t')
										s='1';
									else
									s=(((nodeclass)(yystack.valueAt (3-(1)))).last_value).charAt(1);
									if((char)(s-1)=='0')
										s=(char)(s+1);
									else
										s=1;
									yyval.tac=((nodeclass)(yystack.valueAt (3-(1)))).tac+"\n"+((nodeclass)(yystack.valueAt (3-(3)))).tac+"\n"+"t"+s+"="+((nodeclass)(yystack.valueAt (3-(1)))).last_value+((nodeclass)(yystack.valueAt (3-(2)))).value+((nodeclass)(yystack.valueAt (3-(3)))).last_value;
									}
								yyval.last_value="t"+s;
								}
								};
  break;
    

  case 50:
  if (yyn == 50)
    
/* Line 353 of lalr1.java  */
/* Line 1161 of "Ccompiler.y"  */
    {	yyval.last_value=((nodeclass)(yystack.valueAt (1-(1)))).last_value;
												yyval.tac=((nodeclass)(yystack.valueAt (1-(1)))).tac;};
  break;
    

  case 51:
  if (yyn == 51)
    
/* Line 353 of lalr1.java  */
/* Line 1163 of "Ccompiler.y"  */
    {					
								char s;
								String s1,s2;
								s1=((nodeclass)(yystack.valueAt (3-(1)))).last_value;
								s2=((nodeclass)(yystack.valueAt (3-(3)))).last_value;
								if(s2.charAt(0)!='t' && s1.charAt(0)!='t')
								{
								yyval.tac="t1"+"="+((nodeclass)(yystack.valueAt (3-(1)))).last_value+((nodeclass)(yystack.valueAt (3-(2)))).value+((nodeclass)(yystack.valueAt (3-(3)))).last_value;
								yyval.last_value="t1";
								}
								else
								{
								if(s1.charAt(0)!='t')
								{
									s=(((nodeclass)(yystack.valueAt (3-(3)))).last_value).charAt(1);
									if((char)(s-1)=='0')
										s=(char)(s+1);
									else
										s='1';
									yyval.tac=((nodeclass)(yystack.valueAt (3-(3)))).tac+"\n"+"t"+s+"="+((nodeclass)(yystack.valueAt (3-(1)))).last_value+((nodeclass)(yystack.valueAt (3-(2)))).value+((nodeclass)(yystack.valueAt (3-(3)))).last_value;
									yyval.last_value="t"+s;
									break;
								}
								if(s2.charAt(0)!='t')
								{
									s=(((nodeclass)(yystack.valueAt (3-(1)))).last_value).charAt(1);
									if((char)(s)=='1')
										s=(char)(s+1);
									else
										s='1';
									yyval.tac=((nodeclass)(yystack.valueAt (3-(1)))).tac+"\n"+"t"+s+"="+((nodeclass)(yystack.valueAt (3-(1)))).last_value+((nodeclass)(yystack.valueAt (3-(2)))).value+((nodeclass)(yystack.valueAt (3-(3)))).last_value;
									yyval.last_value="t"+s;
									break;
								}
								if(s1.compareTo(s2)<=0)
									{
									if(s2.charAt(0)!='t')
										s='1';
									else
										s=(((nodeclass)(yystack.valueAt (3-(3)))).last_value).charAt(1);
									if((char)(s-1)=='0')
										s=(char)(s+1);
									else
										s=1;
									yyval.tac=((nodeclass)(yystack.valueAt (3-(1)))).tac+"\n"+"t"+s+"="+((nodeclass)(yystack.valueAt (3-(1)))).last_value+"\n"+((nodeclass)(yystack.valueAt (3-(3)))).tac+"\n"+"t"+(char)(s+1)+"="+"t"+s+((nodeclass)(yystack.valueAt (3-(2)))).value+((nodeclass)(yystack.valueAt (3-(3)))).last_value;
									s=(char)(s+1);
									}
								else
									{
									if(s1.charAt(0)!='t')
										s='1';
									else
									s=(((nodeclass)(yystack.valueAt (3-(1)))).last_value).charAt(1);
									if((char)(s-1)=='0')
										s=(char)(s+1);
									else
										s=1;
									yyval.tac=((nodeclass)(yystack.valueAt (3-(1)))).tac+"\n"+((nodeclass)(yystack.valueAt (3-(3)))).tac+"\n"+"t"+s+"="+((nodeclass)(yystack.valueAt (3-(1)))).last_value+((nodeclass)(yystack.valueAt (3-(2)))).value+((nodeclass)(yystack.valueAt (3-(3)))).last_value;
									}
								yyval.last_value="t"+s;
								}
								};
  break;
    

  case 52:
  if (yyn == 52)
    
/* Line 353 of lalr1.java  */
/* Line 1228 of "Ccompiler.y"  */
    {	yyval.last_value=((nodeclass)(yystack.valueAt (1-(1)))).last_value;
												yyval.tac=((nodeclass)(yystack.valueAt (1-(1)))).tac;};
  break;
    

  case 53:
  if (yyn == 53)
    
/* Line 353 of lalr1.java  */
/* Line 1230 of "Ccompiler.y"  */
    {					
								char s;
								String s1,s2;
								s1=((nodeclass)(yystack.valueAt (3-(1)))).last_value;
								s2=((nodeclass)(yystack.valueAt (3-(3)))).last_value;
								if(s2.charAt(0)!='t' && s1.charAt(0)!='t')
								{
								yyval.tac="t1"+"="+((nodeclass)(yystack.valueAt (3-(1)))).last_value+((nodeclass)(yystack.valueAt (3-(2)))).value+((nodeclass)(yystack.valueAt (3-(3)))).last_value;
								yyval.last_value="t1";
								}
								else
								{
								if(s1.charAt(0)!='t')
								{
									s=(((nodeclass)(yystack.valueAt (3-(3)))).last_value).charAt(1);
									if((char)(s-1)=='0')
										s=(char)(s+1);
									else
										s='1';
									yyval.tac=((nodeclass)(yystack.valueAt (3-(3)))).tac+"\n"+"t"+s+"="+((nodeclass)(yystack.valueAt (3-(1)))).last_value+((nodeclass)(yystack.valueAt (3-(2)))).value+((nodeclass)(yystack.valueAt (3-(3)))).last_value;
									yyval.last_value="t"+s;
									break;
								}
								if(s2.charAt(0)!='t')
								{
									s=(((nodeclass)(yystack.valueAt (3-(1)))).last_value).charAt(1);
									if((char)(s)=='1')
										s=(char)(s+1);
									else
										s='1';
									yyval.tac=((nodeclass)(yystack.valueAt (3-(1)))).tac+"\n"+"t"+s+"="+((nodeclass)(yystack.valueAt (3-(1)))).last_value+((nodeclass)(yystack.valueAt (3-(2)))).value+((nodeclass)(yystack.valueAt (3-(3)))).last_value;
									yyval.last_value="t"+s;
									break;
								}
								if(s1.compareTo(s2)<=0)
									{
									if(s2.charAt(0)!='t')
										s='1';
									else
										s=(((nodeclass)(yystack.valueAt (3-(3)))).last_value).charAt(1);
									if((char)(s-1)=='0')
										s=(char)(s+1);
									else
										s=1;
									yyval.tac=((nodeclass)(yystack.valueAt (3-(1)))).tac+"\n"+"t"+s+"="+((nodeclass)(yystack.valueAt (3-(1)))).last_value+"\n"+((nodeclass)(yystack.valueAt (3-(3)))).tac+"\n"+"t"+(char)(s+1)+"="+"t"+s+((nodeclass)(yystack.valueAt (3-(2)))).value+((nodeclass)(yystack.valueAt (3-(3)))).last_value;
									s=(char)(s+1);
									}
								else
									{
									if(s1.charAt(0)!='t')
										s='1';
									else
									s=(((nodeclass)(yystack.valueAt (3-(1)))).last_value).charAt(1);
									if((char)(s-1)=='0')
										s=(char)(s+1);
									else
										s=1;
									yyval.tac=((nodeclass)(yystack.valueAt (3-(1)))).tac+"\n"+((nodeclass)(yystack.valueAt (3-(3)))).tac+"\n"+"t"+s+"="+((nodeclass)(yystack.valueAt (3-(1)))).last_value+((nodeclass)(yystack.valueAt (3-(2)))).value+((nodeclass)(yystack.valueAt (3-(3)))).last_value;
									}
								yyval.last_value="t"+s;
								}
								};
  break;
    

  case 54:
  if (yyn == 54)
    
/* Line 353 of lalr1.java  */
/* Line 1295 of "Ccompiler.y"  */
    {	yyval.last_value=((nodeclass)(yystack.valueAt (1-(1)))).last_value;
												yyval.tac=((nodeclass)(yystack.valueAt (1-(1)))).tac;};
  break;
    

  case 55:
  if (yyn == 55)
    
/* Line 353 of lalr1.java  */
/* Line 1297 of "Ccompiler.y"  */
    {					
								char s;
								String s1,s2;
								s1=((nodeclass)(yystack.valueAt (3-(1)))).last_value;
								s2=((nodeclass)(yystack.valueAt (3-(3)))).last_value;
								if(s2.charAt(0)!='t' && s1.charAt(0)!='t')
								{
								yyval.tac="t1"+"="+((nodeclass)(yystack.valueAt (3-(1)))).last_value+((nodeclass)(yystack.valueAt (3-(2)))).value+((nodeclass)(yystack.valueAt (3-(3)))).last_value;
								yyval.last_value="t1";
								}
								else
								{
								if(s1.charAt(0)!='t')
								{
									s=(((nodeclass)(yystack.valueAt (3-(3)))).last_value).charAt(1);
									if((char)(s-1)=='0')
										s=(char)(s+1);
									else
										s='1';
									yyval.tac=((nodeclass)(yystack.valueAt (3-(3)))).tac+"\n"+"t"+s+"="+((nodeclass)(yystack.valueAt (3-(1)))).last_value+((nodeclass)(yystack.valueAt (3-(2)))).value+((nodeclass)(yystack.valueAt (3-(3)))).last_value;
									yyval.last_value="t"+s;
									break;
								}
								if(s2.charAt(0)!='t')
								{
									s=(((nodeclass)(yystack.valueAt (3-(1)))).last_value).charAt(1);
									if((char)(s)=='1')
										s=(char)(s+1);
									else
										s='1';
									yyval.tac=((nodeclass)(yystack.valueAt (3-(1)))).tac+"\n"+"t"+s+"="+((nodeclass)(yystack.valueAt (3-(1)))).last_value+((nodeclass)(yystack.valueAt (3-(2)))).value+((nodeclass)(yystack.valueAt (3-(3)))).last_value;
									yyval.last_value="t"+s;
									break;
								}
								if(s1.compareTo(s2)<=0)
									{
									if(s2.charAt(0)!='t')
										s='1';
									else
										s=(((nodeclass)(yystack.valueAt (3-(3)))).last_value).charAt(1);
									if((char)(s-1)=='0')
										s=(char)(s+1);
									else
										s=1;
									yyval.tac=((nodeclass)(yystack.valueAt (3-(1)))).tac+"\n"+"t"+s+"="+((nodeclass)(yystack.valueAt (3-(1)))).last_value+"\n"+((nodeclass)(yystack.valueAt (3-(3)))).tac+"\n"+"t"+(char)(s+1)+"="+"t"+s+((nodeclass)(yystack.valueAt (3-(2)))).value+((nodeclass)(yystack.valueAt (3-(3)))).last_value;
									s=(char)(s+1);
									}
								else
									{
									if(s1.charAt(0)!='t')
										s='1';
									else
									s=(((nodeclass)(yystack.valueAt (3-(1)))).last_value).charAt(1);
									if((char)(s-1)=='0')
										s=(char)(s+1);
									else
										s=1;
									yyval.tac=((nodeclass)(yystack.valueAt (3-(1)))).tac+"\n"+((nodeclass)(yystack.valueAt (3-(3)))).tac+"\n"+"t"+s+"="+((nodeclass)(yystack.valueAt (3-(1)))).last_value+((nodeclass)(yystack.valueAt (3-(2)))).value+((nodeclass)(yystack.valueAt (3-(3)))).last_value;
									}
								yyval.last_value="t"+s;
								}
								};
  break;
    

  case 56:
  if (yyn == 56)
    
/* Line 353 of lalr1.java  */
/* Line 1362 of "Ccompiler.y"  */
    {	yyval.last_value=((nodeclass)(yystack.valueAt (1-(1)))).last_value;
												yyval.tac=((nodeclass)(yystack.valueAt (1-(1)))).tac;};
  break;
    

  case 57:
  if (yyn == 57)
    
/* Line 353 of lalr1.java  */
/* Line 1364 of "Ccompiler.y"  */
    {					
								char s;
								String s1,s2;
								s1=((nodeclass)(yystack.valueAt (3-(1)))).last_value;
								s2=((nodeclass)(yystack.valueAt (3-(3)))).last_value;
								if(s2.charAt(0)!='t' && s1.charAt(0)!='t')
								{
								yyval.tac="t1"+"="+((nodeclass)(yystack.valueAt (3-(1)))).last_value+((nodeclass)(yystack.valueAt (3-(2)))).value+((nodeclass)(yystack.valueAt (3-(3)))).last_value;
								yyval.last_value="t1";
								}
								else
								{
								if(s1.charAt(0)!='t')
								{
									s=(((nodeclass)(yystack.valueAt (3-(3)))).last_value).charAt(1);
									if((char)(s-1)=='0')
										s=(char)(s+1);
									else
										s='1';
									yyval.tac=((nodeclass)(yystack.valueAt (3-(3)))).tac+"\n"+"t"+s+"="+((nodeclass)(yystack.valueAt (3-(1)))).last_value+((nodeclass)(yystack.valueAt (3-(2)))).value+((nodeclass)(yystack.valueAt (3-(3)))).last_value;
									yyval.last_value="t"+s;
									break;
								}
								if(s2.charAt(0)!='t')
								{
									s=(((nodeclass)(yystack.valueAt (3-(1)))).last_value).charAt(1);
									if((char)(s)=='1')
										s=(char)(s+1);
									else
										s='1';
									yyval.tac=((nodeclass)(yystack.valueAt (3-(1)))).tac+"\n"+"t"+s+"="+((nodeclass)(yystack.valueAt (3-(1)))).last_value+((nodeclass)(yystack.valueAt (3-(2)))).value+((nodeclass)(yystack.valueAt (3-(3)))).last_value;
									yyval.last_value="t"+s;
									break;
								}
								if(s1.compareTo(s2)<=0)
									{
									if(s2.charAt(0)!='t')
										s='1';
									else
										s=(((nodeclass)(yystack.valueAt (3-(3)))).last_value).charAt(1);
									if((char)(s-1)=='0')
										s=(char)(s+1);
									else
										s=1;
									yyval.tac=((nodeclass)(yystack.valueAt (3-(1)))).tac+"\n"+"t"+s+"="+((nodeclass)(yystack.valueAt (3-(1)))).last_value+"\n"+((nodeclass)(yystack.valueAt (3-(3)))).tac+"\n"+"t"+(char)(s+1)+"="+"t"+s+((nodeclass)(yystack.valueAt (3-(2)))).value+((nodeclass)(yystack.valueAt (3-(3)))).last_value;
									s=(char)(s+1);
									}
								else
									{
									if(s1.charAt(0)!='t')
										s='1';
									else
									s=(((nodeclass)(yystack.valueAt (3-(1)))).last_value).charAt(1);
									if((char)(s-1)=='0')
										s=(char)(s+1);
									else
										s=1;
									yyval.tac=((nodeclass)(yystack.valueAt (3-(1)))).tac+"\n"+((nodeclass)(yystack.valueAt (3-(3)))).tac+"\n"+"t"+s+"="+((nodeclass)(yystack.valueAt (3-(1)))).last_value+((nodeclass)(yystack.valueAt (3-(2)))).value+((nodeclass)(yystack.valueAt (3-(3)))).last_value;
									}
								yyval.last_value="t"+s;
								}
								};
  break;
    

  case 58:
  if (yyn == 58)
    
/* Line 353 of lalr1.java  */
/* Line 1429 of "Ccompiler.y"  */
    {	yyval.last_value=((nodeclass)(yystack.valueAt (1-(1)))).last_value;
												yyval.tac=((nodeclass)(yystack.valueAt (1-(1)))).tac;};
  break;
    

  case 59:
  if (yyn == 59)
    
/* Line 353 of lalr1.java  */
/* Line 1431 of "Ccompiler.y"  */
    {	};
  break;
    

  case 60:
  if (yyn == 60)
    
/* Line 353 of lalr1.java  */
/* Line 1435 of "Ccompiler.y"  */
    {	yyval.last_value=((nodeclass)(yystack.valueAt (1-(1)))).last_value;
												yyval.tac=((nodeclass)(yystack.valueAt (1-(1)))).tac;};
  break;
    

  case 61:
  if (yyn == 61)
    
/* Line 353 of lalr1.java  */
/* Line 1437 of "Ccompiler.y"  */
    {					
								char s;
								String s1,s2;
								s1=((nodeclass)(yystack.valueAt (3-(1)))).last_value;
								s2=((nodeclass)(yystack.valueAt (3-(3)))).last_value;
                                                                if(s2.charAt(0)!='t' && s1.charAt(0)!='t')
			//					if(s2.charAt(0)!='t' && s1.charAt(0)!='t')
								{
								yyval.tac="t1"+((nodeclass)(yystack.valueAt (3-(2)))).value+((nodeclass)(yystack.valueAt (3-(3)))).last_value+"\n"+((nodeclass)(yystack.valueAt (3-(1)))).last_value+((nodeclass)(yystack.valueAt (3-(2)))).value+"t1";
								yyval.last_value="t1";
								}
								else
								{
								if(s1.charAt(0)!='t')
								{
									s=(((nodeclass)(yystack.valueAt (3-(3)))).last_value).charAt(1);
									if((char)(s-1)=='0')
										s=(char)(s+1);
									else
										s='1';
									yyval.tac=((nodeclass)(yystack.valueAt (3-(3)))).tac+"\n"+((nodeclass)(yystack.valueAt (3-(1)))).last_value+((nodeclass)(yystack.valueAt (3-(2)))).value+((nodeclass)(yystack.valueAt (3-(3)))).last_value;
									yyval.last_value="t"+s;
									break;
								}
								if(s2.charAt(0)!='t')
								{
									s=(((nodeclass)(yystack.valueAt (3-(1)))).last_value).charAt(1);
									if((char)(s)=='1')
										s=(char)(s+1);
									else
										s='1';
									yyval.tac=((nodeclass)(yystack.valueAt (3-(1)))).tac+"\n"+((nodeclass)(yystack.valueAt (3-(1)))).last_value+((nodeclass)(yystack.valueAt (3-(2)))).value+((nodeclass)(yystack.valueAt (3-(3)))).last_value;
									yyval.last_value="t"+s;
									break;
								}
								if(s1.compareTo(s2)<=0)
									{
									if(s2.charAt(0)!='t')
										s='1';
									else
										s=(((nodeclass)(yystack.valueAt (3-(3)))).last_value).charAt(1);
									if((char)(s-1)=='0')
										s=(char)(s+1);
									else
										s=1;
									yyval.tac=((nodeclass)(yystack.valueAt (3-(1)))).tac+"\n"+"t"+s+"="+((nodeclass)(yystack.valueAt (3-(1)))).last_value+"\n"+((nodeclass)(yystack.valueAt (3-(3)))).tac+"\n"+"t"+s+((nodeclass)(yystack.valueAt (3-(2)))).value+((nodeclass)(yystack.valueAt (3-(3)))).last_value;
									s=(char)(s+1);
									}
								else
									{
									if(s1.charAt(0)!='t')
										s='1';
									else
									s=(((nodeclass)(yystack.valueAt (3-(1)))).last_value).charAt(1);
									if((char)(s-1)=='0')
										s=(char)(s+1);
									else
										s=1;
									yyval.tac=((nodeclass)(yystack.valueAt (3-(1)))).tac+"\n"+((nodeclass)(yystack.valueAt (3-(3)))).tac+"\n"+((nodeclass)(yystack.valueAt (3-(1)))).last_value+((nodeclass)(yystack.valueAt (3-(2)))).value+((nodeclass)(yystack.valueAt (3-(3)))).last_value;
									}
								yyval.last_value="t"+s;
								}
								};
  break;
    

  case 62:
  if (yyn == 62)
    
/* Line 353 of lalr1.java  */
/* Line 1502 of "Ccompiler.y"  */
    {	yyval.last_value=((nodeclass)(yystack.valueAt (1-(1)))).value;};
  break;
    

  case 63:
  if (yyn == 63)
    
/* Line 353 of lalr1.java  */
/* Line 1503 of "Ccompiler.y"  */
    {	yyval.last_value=((nodeclass)(yystack.valueAt (1-(1)))).value;};
  break;
    

  case 64:
  if (yyn == 64)
    
/* Line 353 of lalr1.java  */
/* Line 1504 of "Ccompiler.y"  */
    {	yyval.last_value=((nodeclass)(yystack.valueAt (1-(1)))).value;};
  break;
    

  case 65:
  if (yyn == 65)
    
/* Line 353 of lalr1.java  */
/* Line 1505 of "Ccompiler.y"  */
    {	yyval.last_value=((nodeclass)(yystack.valueAt (1-(1)))).value;};
  break;
    

  case 66:
  if (yyn == 66)
    
/* Line 353 of lalr1.java  */
/* Line 1506 of "Ccompiler.y"  */
    {	yyval.last_value=((nodeclass)(yystack.valueAt (1-(1)))).value;};
  break;
    

  case 67:
  if (yyn == 67)
    
/* Line 353 of lalr1.java  */
/* Line 1507 of "Ccompiler.y"  */
    {	yyval.last_value=((nodeclass)(yystack.valueAt (1-(1)))).value;};
  break;
    

  case 68:
  if (yyn == 68)
    
/* Line 353 of lalr1.java  */
/* Line 1508 of "Ccompiler.y"  */
    {	yyval.last_value=((nodeclass)(yystack.valueAt (1-(1)))).value;};
  break;
    

  case 69:
  if (yyn == 69)
    
/* Line 353 of lalr1.java  */
/* Line 1509 of "Ccompiler.y"  */
    {	yyval.last_value=((nodeclass)(yystack.valueAt (1-(1)))).value;};
  break;
    

  case 70:
  if (yyn == 70)
    
/* Line 353 of lalr1.java  */
/* Line 1510 of "Ccompiler.y"  */
    {	yyval.last_value=((nodeclass)(yystack.valueAt (1-(1)))).value;};
  break;
    

  case 71:
  if (yyn == 71)
    
/* Line 353 of lalr1.java  */
/* Line 1511 of "Ccompiler.y"  */
    {	yyval.last_value=((nodeclass)(yystack.valueAt (1-(1)))).value;};
  break;
    

  case 72:
  if (yyn == 72)
    
/* Line 353 of lalr1.java  */
/* Line 1512 of "Ccompiler.y"  */
    {	yyval.last_value=((nodeclass)(yystack.valueAt (1-(1)))).value;};
  break;
    

  case 73:
  if (yyn == 73)
    
/* Line 353 of lalr1.java  */
/* Line 1516 of "Ccompiler.y"  */
    {	
									yyval.last_value=((nodeclass)(yystack.valueAt (1-(1)))).last_value;
									yyval.tac=((nodeclass)(yystack.valueAt (1-(1)))).tac;
									};
  break;
    

  case 74:
  if (yyn == 74)
    
/* Line 353 of lalr1.java  */
/* Line 1520 of "Ccompiler.y"  */
    {	
yyval.tac=((nodeclass)(yystack.valueAt (3-(1)))).tac+"\n"+((nodeclass)(yystack.valueAt (3-(3)))).tac;
						yyval.last_value=((nodeclass)(yystack.valueAt (3-(3)))).last_value;
					
    };
  break;
    

  case 75:
  if (yyn == 75)
    
/* Line 353 of lalr1.java  */
/* Line 1526 of "Ccompiler.y"  */
    {	
									yyval.last_value=((nodeclass)(yystack.valueAt (1-(1)))).last_value;
									yyval.tac=((nodeclass)(yystack.valueAt (1-(1)))).tac;
									};
  break;
    

  case 76:
  if (yyn == 76)
    
/* Line 353 of lalr1.java  */
/* Line 1533 of "Ccompiler.y"  */
    {	
									yyval.last_value=((nodeclass)(yystack.valueAt (2-(1)))).last_value;
									yyval.tac=((nodeclass)(yystack.valueAt (2-(1)))).tac;
									};
  break;
    

  case 77:
  if (yyn == 77)
    
/* Line 353 of lalr1.java  */
/* Line 1537 of "Ccompiler.y"  */
    {	
									yyval.last_value=((nodeclass)(yystack.valueAt (3-(1)))).last_value;
									yyval.tac=((nodeclass)(yystack.valueAt (3-(1)))).tac+((nodeclass)(yystack.valueAt (3-(2)))).tac;
									};
  break;
    

  case 78:
  if (yyn == 78)
    
/* Line 353 of lalr1.java  */
/* Line 1544 of "Ccompiler.y"  */
    {	
								//	$$.last_value=$1.last_value;
								//	$$.tac=$1.tac;
									};
  break;
    

  case 79:
  if (yyn == 79)
    
/* Line 353 of lalr1.java  */
/* Line 1548 of "Ccompiler.y"  */
    {	
								//	$$.last_value=$1.last_value;
								//	$$.tac=$1.tac+$2.tac;
									};
  break;
    

  case 80:
  if (yyn == 80)
    
/* Line 353 of lalr1.java  */
/* Line 1552 of "Ccompiler.y"  */
    {yyval.last_value=((nodeclass)(yystack.valueAt (1-(1)))).last_value;
												yyval.tac=((nodeclass)(yystack.valueAt (1-(1)))).tac;	};
  break;
    

  case 81:
  if (yyn == 81)
    
/* Line 353 of lalr1.java  */
/* Line 1554 of "Ccompiler.y"  */
    {	
									yyval.last_value=((nodeclass)(yystack.valueAt (2-(1)))).last_value;
									yyval.tac=((nodeclass)(yystack.valueAt (2-(1)))).tac+((nodeclass)(yystack.valueAt (2-(2)))).tac;
									};
  break;
    

  case 82:
  if (yyn == 82)
    
/* Line 353 of lalr1.java  */
/* Line 1558 of "Ccompiler.y"  */
    {	
									yyval.last_value=((nodeclass)(yystack.valueAt (1-(1)))).last_value;
									yyval.tac=((nodeclass)(yystack.valueAt (1-(1)))).tac;
									};
  break;
    

  case 83:
  if (yyn == 83)
    
/* Line 353 of lalr1.java  */
/* Line 1562 of "Ccompiler.y"  */
    {	
									yyval.last_value=((nodeclass)(yystack.valueAt (2-(1)))).last_value;
									yyval.tac=((nodeclass)(yystack.valueAt (2-(1)))).tac+((nodeclass)(yystack.valueAt (2-(2)))).tac;
									};
  break;
    

  case 84:
  if (yyn == 84)
    
/* Line 353 of lalr1.java  */
/* Line 1569 of "Ccompiler.y"  */
    {	
									yyval.last_value=((nodeclass)(yystack.valueAt (1-(1)))).last_value;
									yyval.tac=((nodeclass)(yystack.valueAt (1-(1)))).tac;
									};
  break;
    

  case 85:
  if (yyn == 85)
    
/* Line 353 of lalr1.java  */
/* Line 1573 of "Ccompiler.y"  */
    {	
						yyval.last_value=((nodeclass)(yystack.valueAt (3-(1)))).last_value+","+((nodeclass)(yystack.valueAt (3-(3)))).last_value;
												yyval.tac=((nodeclass)(yystack.valueAt (3-(1)))).tac+((nodeclass)(yystack.valueAt (3-(3)))).tac;};
  break;
    

  case 86:
  if (yyn == 86)
    
/* Line 353 of lalr1.java  */
/* Line 1579 of "Ccompiler.y"  */
    {	
									yyval.last_value=((nodeclass)(yystack.valueAt (1-(1)))).last_value;
									yyval.tac=((nodeclass)(yystack.valueAt (1-(1)))).tac;
									};
  break;
    

  case 87:
  if (yyn == 87)
    
/* Line 353 of lalr1.java  */
/* Line 1583 of "Ccompiler.y"  */
    {	};
  break;
    

  case 88:
  if (yyn == 88)
    
/* Line 353 of lalr1.java  */
/* Line 1587 of "Ccompiler.y"  */
    {	};
  break;
    

  case 89:
  if (yyn == 89)
    
/* Line 353 of lalr1.java  */
/* Line 1588 of "Ccompiler.y"  */
    {	};
  break;
    

  case 90:
  if (yyn == 90)
    
/* Line 353 of lalr1.java  */
/* Line 1589 of "Ccompiler.y"  */
    {	};
  break;
    

  case 91:
  if (yyn == 91)
    
/* Line 353 of lalr1.java  */
/* Line 1590 of "Ccompiler.y"  */
    {	};
  break;
    

  case 92:
  if (yyn == 92)
    
/* Line 353 of lalr1.java  */
/* Line 1591 of "Ccompiler.y"  */
    {	};
  break;
    

  case 93:
  if (yyn == 93)
    
/* Line 353 of lalr1.java  */
/* Line 1595 of "Ccompiler.y"  */
    {	yyval.last_value=((nodeclass)(yystack.valueAt (1-(1)))).value;};
  break;
    

  case 94:
  if (yyn == 94)
    
/* Line 353 of lalr1.java  */
/* Line 1596 of "Ccompiler.y"  */
    {yyval.last_value=((nodeclass)(yystack.valueAt (1-(1)))).value;	};
  break;
    

  case 95:
  if (yyn == 95)
    
/* Line 353 of lalr1.java  */
/* Line 1597 of "Ccompiler.y"  */
    {	yyval.last_value=((nodeclass)(yystack.valueAt (1-(1)))).value;};
  break;
    

  case 96:
  if (yyn == 96)
    
/* Line 353 of lalr1.java  */
/* Line 1598 of "Ccompiler.y"  */
    {	yyval.last_value=((nodeclass)(yystack.valueAt (1-(1)))).value;};
  break;
    

  case 97:
  if (yyn == 97)
    
/* Line 353 of lalr1.java  */
/* Line 1599 of "Ccompiler.y"  */
    {	yyval.last_value=((nodeclass)(yystack.valueAt (1-(1)))).value;};
  break;
    

  case 98:
  if (yyn == 98)
    
/* Line 353 of lalr1.java  */
/* Line 1600 of "Ccompiler.y"  */
    {	yyval.last_value=((nodeclass)(yystack.valueAt (1-(1)))).value;};
  break;
    

  case 99:
  if (yyn == 99)
    
/* Line 353 of lalr1.java  */
/* Line 1601 of "Ccompiler.y"  */
    {	yyval.last_value=((nodeclass)(yystack.valueAt (1-(1)))).value;};
  break;
    

  case 100:
  if (yyn == 100)
    
/* Line 353 of lalr1.java  */
/* Line 1602 of "Ccompiler.y"  */
    {	yyval.last_value=((nodeclass)(yystack.valueAt (1-(1)))).value;};
  break;
    

  case 101:
  if (yyn == 101)
    
/* Line 353 of lalr1.java  */
/* Line 1603 of "Ccompiler.y"  */
    {	yyval.last_value=((nodeclass)(yystack.valueAt (1-(1)))).value;};
  break;
    

  case 102:
  if (yyn == 102)
    
/* Line 353 of lalr1.java  */
/* Line 1604 of "Ccompiler.y"  */
    {	
									};
  break;
    

  case 103:
  if (yyn == 103)
    
/* Line 353 of lalr1.java  */
/* Line 1606 of "Ccompiler.y"  */
    {	
									};
  break;
    

  case 104:
  if (yyn == 104)
    
/* Line 353 of lalr1.java  */
/* Line 1608 of "Ccompiler.y"  */
    {	};
  break;
    

  case 105:
  if (yyn == 105)
    
/* Line 353 of lalr1.java  */
/* Line 1612 of "Ccompiler.y"  */
    {	};
  break;
    

  case 106:
  if (yyn == 106)
    
/* Line 353 of lalr1.java  */
/* Line 1613 of "Ccompiler.y"  */
    {	};
  break;
    

  case 107:
  if (yyn == 107)
    
/* Line 353 of lalr1.java  */
/* Line 1614 of "Ccompiler.y"  */
    {	};
  break;
    

  case 108:
  if (yyn == 108)
    
/* Line 353 of lalr1.java  */
/* Line 1618 of "Ccompiler.y"  */
    {	};
  break;
    

  case 109:
  if (yyn == 109)
    
/* Line 353 of lalr1.java  */
/* Line 1619 of "Ccompiler.y"  */
    {	};
  break;
    

  case 110:
  if (yyn == 110)
    
/* Line 353 of lalr1.java  */
/* Line 1623 of "Ccompiler.y"  */
    {	
									};
  break;
    

  case 111:
  if (yyn == 111)
    
/* Line 353 of lalr1.java  */
/* Line 1625 of "Ccompiler.y"  */
    {	};
  break;
    

  case 112:
  if (yyn == 112)
    
/* Line 353 of lalr1.java  */
/* Line 1629 of "Ccompiler.y"  */
    {	};
  break;
    

  case 113:
  if (yyn == 113)
    
/* Line 353 of lalr1.java  */
/* Line 1633 of "Ccompiler.y"  */
    {	};
  break;
    

  case 114:
  if (yyn == 114)
    
/* Line 353 of lalr1.java  */
/* Line 1634 of "Ccompiler.y"  */
    {	};
  break;
    

  case 115:
  if (yyn == 115)
    
/* Line 353 of lalr1.java  */
/* Line 1635 of "Ccompiler.y"  */
    {	};
  break;
    

  case 116:
  if (yyn == 116)
    
/* Line 353 of lalr1.java  */
/* Line 1636 of "Ccompiler.y"  */
    {	};
  break;
    

  case 117:
  if (yyn == 117)
    
/* Line 353 of lalr1.java  */
/* Line 1640 of "Ccompiler.y"  */
    {	};
  break;
    

  case 118:
  if (yyn == 118)
    
/* Line 353 of lalr1.java  */
/* Line 1641 of "Ccompiler.y"  */
    {	};
  break;
    

  case 119:
  if (yyn == 119)
    
/* Line 353 of lalr1.java  */
/* Line 1645 of "Ccompiler.y"  */
    {	};
  break;
    

  case 120:
  if (yyn == 120)
    
/* Line 353 of lalr1.java  */
/* Line 1646 of "Ccompiler.y"  */
    {	};
  break;
    

  case 121:
  if (yyn == 121)
    
/* Line 353 of lalr1.java  */
/* Line 1647 of "Ccompiler.y"  */
    {	};
  break;
    

  case 122:
  if (yyn == 122)
    
/* Line 353 of lalr1.java  */
/* Line 1651 of "Ccompiler.y"  */
    {	};
  break;
    

  case 123:
  if (yyn == 123)
    
/* Line 353 of lalr1.java  */
/* Line 1652 of "Ccompiler.y"  */
    {	};
  break;
    

  case 124:
  if (yyn == 124)
    
/* Line 353 of lalr1.java  */
/* Line 1653 of "Ccompiler.y"  */
    {	};
  break;
    

  case 125:
  if (yyn == 125)
    
/* Line 353 of lalr1.java  */
/* Line 1657 of "Ccompiler.y"  */
    {	};
  break;
    

  case 126:
  if (yyn == 126)
    
/* Line 353 of lalr1.java  */
/* Line 1658 of "Ccompiler.y"  */
    {	};
  break;
    

  case 127:
  if (yyn == 127)
    
/* Line 353 of lalr1.java  */
/* Line 1662 of "Ccompiler.y"  */
    {	};
  break;
    

  case 128:
  if (yyn == 128)
    
/* Line 353 of lalr1.java  */
/* Line 1663 of "Ccompiler.y"  */
    {	};
  break;
    

  case 129:
  if (yyn == 129)
    
/* Line 353 of lalr1.java  */
/* Line 1667 of "Ccompiler.y"  */
    {	yyval.last_value=((nodeclass)(yystack.valueAt (1-(1)))).value;};
  break;
    

  case 130:
  if (yyn == 130)
    
/* Line 353 of lalr1.java  */
/* Line 1668 of "Ccompiler.y"  */
    {	yyval.last_value=((nodeclass)(yystack.valueAt (1-(1)))).value;};
  break;
    

  case 131:
  if (yyn == 131)
    
/* Line 353 of lalr1.java  */
/* Line 1672 of "Ccompiler.y"  */
    { 	};
  break;
    

  case 132:
  if (yyn == 132)
    
/* Line 353 of lalr1.java  */
/* Line 1673 of "Ccompiler.y"  */
    {	yyval.last_value=((nodeclass)(yystack.valueAt (1-(1)))).last_value;
												yyval.tac=((nodeclass)(yystack.valueAt (1-(1)))).tac;};
  break;
    

  case 133:
  if (yyn == 133)
    
/* Line 353 of lalr1.java  */
/* Line 1678 of "Ccompiler.y"  */
    {	yyval.last_value=((nodeclass)(yystack.valueAt (1-(1)))).value;};
  break;
    

  case 134:
  if (yyn == 134)
    
/* Line 353 of lalr1.java  */
/* Line 1679 of "Ccompiler.y"  */
    {	yyval.last_value=((nodeclass)(yystack.valueAt (3-(2)))).last_value;
												yyval.tac=((nodeclass)(yystack.valueAt (3-(2)))).tac;};
  break;
    

  case 135:
  if (yyn == 135)
    
/* Line 353 of lalr1.java  */
/* Line 1681 of "Ccompiler.y"  */
    {	};
  break;
    

  case 136:
  if (yyn == 136)
    
/* Line 353 of lalr1.java  */
/* Line 1682 of "Ccompiler.y"  */
    {	};
  break;
    

  case 137:
  if (yyn == 137)
    
/* Line 353 of lalr1.java  */
/* Line 1683 of "Ccompiler.y"  */
    {	};
  break;
    

  case 138:
  if (yyn == 138)
    
/* Line 353 of lalr1.java  */
/* Line 1684 of "Ccompiler.y"  */
    {	};
  break;
    

  case 139:
  if (yyn == 139)
    
/* Line 353 of lalr1.java  */
/* Line 1685 of "Ccompiler.y"  */
    {	};
  break;
    

  case 140:
  if (yyn == 140)
    
/* Line 353 of lalr1.java  */
/* Line 1689 of "Ccompiler.y"  */
    {	};
  break;
    

  case 141:
  if (yyn == 141)
    
/* Line 353 of lalr1.java  */
/* Line 1690 of "Ccompiler.y"  */
    {	};
  break;
    

  case 142:
  if (yyn == 142)
    
/* Line 353 of lalr1.java  */
/* Line 1691 of "Ccompiler.y"  */
    {	};
  break;
    

  case 143:
  if (yyn == 143)
    
/* Line 353 of lalr1.java  */
/* Line 1692 of "Ccompiler.y"  */
    {	};
  break;
    

  case 144:
  if (yyn == 144)
    
/* Line 353 of lalr1.java  */
/* Line 1696 of "Ccompiler.y"  */
    {	};
  break;
    

  case 145:
  if (yyn == 145)
    
/* Line 353 of lalr1.java  */
/* Line 1697 of "Ccompiler.y"  */
    {	};
  break;
    

  case 146:
  if (yyn == 146)
    
/* Line 353 of lalr1.java  */
/* Line 1702 of "Ccompiler.y"  */
    {	};
  break;
    

  case 147:
  if (yyn == 147)
    
/* Line 353 of lalr1.java  */
/* Line 1703 of "Ccompiler.y"  */
    {	};
  break;
    

  case 148:
  if (yyn == 148)
    
/* Line 353 of lalr1.java  */
/* Line 1707 of "Ccompiler.y"  */
    {	};
  break;
    

  case 149:
  if (yyn == 149)
    
/* Line 353 of lalr1.java  */
/* Line 1708 of "Ccompiler.y"  */
    {	};
  break;
    

  case 150:
  if (yyn == 150)
    
/* Line 353 of lalr1.java  */
/* Line 1712 of "Ccompiler.y"  */
    {	};
  break;
    

  case 151:
  if (yyn == 151)
    
/* Line 353 of lalr1.java  */
/* Line 1713 of "Ccompiler.y"  */
    {	};
  break;
    

  case 152:
  if (yyn == 152)
    
/* Line 353 of lalr1.java  */
/* Line 1714 of "Ccompiler.y"  */
    {	};
  break;
    

  case 153:
  if (yyn == 153)
    
/* Line 353 of lalr1.java  */
/* Line 1718 of "Ccompiler.y"  */
    {	};
  break;
    

  case 154:
  if (yyn == 154)
    
/* Line 353 of lalr1.java  */
/* Line 1719 of "Ccompiler.y"  */
    {	};
  break;
    

  case 155:
  if (yyn == 155)
    
/* Line 353 of lalr1.java  */
/* Line 1723 of "Ccompiler.y"  */
    {	};
  break;
    

  case 156:
  if (yyn == 156)
    
/* Line 353 of lalr1.java  */
/* Line 1724 of "Ccompiler.y"  */
    {	};
  break;
    

  case 157:
  if (yyn == 157)
    
/* Line 353 of lalr1.java  */
/* Line 1728 of "Ccompiler.y"  */
    {	};
  break;
    

  case 158:
  if (yyn == 158)
    
/* Line 353 of lalr1.java  */
/* Line 1729 of "Ccompiler.y"  */
    {	};
  break;
    

  case 159:
  if (yyn == 159)
    
/* Line 353 of lalr1.java  */
/* Line 1730 of "Ccompiler.y"  */
    {	};
  break;
    

  case 160:
  if (yyn == 160)
    
/* Line 353 of lalr1.java  */
/* Line 1734 of "Ccompiler.y"  */
    {	};
  break;
    

  case 161:
  if (yyn == 161)
    
/* Line 353 of lalr1.java  */
/* Line 1735 of "Ccompiler.y"  */
    {	};
  break;
    

  case 162:
  if (yyn == 162)
    
/* Line 353 of lalr1.java  */
/* Line 1736 of "Ccompiler.y"  */
    {	};
  break;
    

  case 163:
  if (yyn == 163)
    
/* Line 353 of lalr1.java  */
/* Line 1737 of "Ccompiler.y"  */
    {	};
  break;
    

  case 164:
  if (yyn == 164)
    
/* Line 353 of lalr1.java  */
/* Line 1738 of "Ccompiler.y"  */
    {	};
  break;
    

  case 165:
  if (yyn == 165)
    
/* Line 353 of lalr1.java  */
/* Line 1739 of "Ccompiler.y"  */
    {	};
  break;
    

  case 166:
  if (yyn == 166)
    
/* Line 353 of lalr1.java  */
/* Line 1740 of "Ccompiler.y"  */
    {	};
  break;
    

  case 167:
  if (yyn == 167)
    
/* Line 353 of lalr1.java  */
/* Line 1741 of "Ccompiler.y"  */
    {	};
  break;
    

  case 168:
  if (yyn == 168)
    
/* Line 353 of lalr1.java  */
/* Line 1742 of "Ccompiler.y"  */
    {	};
  break;
    

  case 169:
  if (yyn == 169)
    
/* Line 353 of lalr1.java  */
/* Line 1746 of "Ccompiler.y"  */
    {	};
  break;
    

  case 170:
  if (yyn == 170)
    
/* Line 353 of lalr1.java  */
/* Line 1747 of "Ccompiler.y"  */
    {	};
  break;
    

  case 171:
  if (yyn == 171)
    
/* Line 353 of lalr1.java  */
/* Line 1748 of "Ccompiler.y"  */
    {	};
  break;
    

  case 172:
  if (yyn == 172)
    
/* Line 353 of lalr1.java  */
/* Line 1752 of "Ccompiler.y"  */
    {	};
  break;
    

  case 173:
  if (yyn == 173)
    
/* Line 353 of lalr1.java  */
/* Line 1753 of "Ccompiler.y"  */
    {	};
  break;
    

  case 174:
  if (yyn == 174)
    
/* Line 353 of lalr1.java  */
/* Line 1757 of "Ccompiler.y"  */
    {	};
  break;
    

  case 175:
  if (yyn == 175)
    
/* Line 353 of lalr1.java  */
/* Line 1758 of "Ccompiler.y"  */
    {	};
  break;
    

  case 176:
  if (yyn == 176)
    
/* Line 353 of lalr1.java  */
/* Line 1759 of "Ccompiler.y"  */
    {	yyval.last_value=((nodeclass)(yystack.valueAt (1-(1)))).last_value;
												yyval.tac=((nodeclass)(yystack.valueAt (1-(1)))).tac;};
  break;
    

  case 177:
  if (yyn == 177)
    
/* Line 353 of lalr1.java  */
/* Line 1761 of "Ccompiler.y"  */
    {	};
  break;
    

  case 178:
  if (yyn == 178)
    
/* Line 353 of lalr1.java  */
/* Line 1762 of "Ccompiler.y"  */
    {	};
  break;
    

  case 179:
  if (yyn == 179)
    
/* Line 353 of lalr1.java  */
/* Line 1763 of "Ccompiler.y"  */
    {	};
  break;
    

  case 180:
  if (yyn == 180)
    
/* Line 353 of lalr1.java  */
/* Line 1767 of "Ccompiler.y"  */
    {	};
  break;
    

  case 181:
  if (yyn == 181)
    
/* Line 353 of lalr1.java  */
/* Line 1768 of "Ccompiler.y"  */
    {	};
  break;
    

  case 182:
  if (yyn == 182)
    
/* Line 353 of lalr1.java  */
/* Line 1769 of "Ccompiler.y"  */
    {	};
  break;
    

  case 183:
  if (yyn == 183)
    
/* Line 353 of lalr1.java  */
/* Line 1773 of "Ccompiler.y"  */
    {	};
  break;
    

  case 184:
  if (yyn == 184)
    
/* Line 353 of lalr1.java  */
/* Line 1774 of "Ccompiler.y"  */
    {yyval.last_value=((nodeclass)(yystack.valueAt (3-(2)))).last_value;
												yyval.tac=((nodeclass)(yystack.valueAt (3-(2)))).tac;	};
  break;
    

  case 185:
  if (yyn == 185)
    
/* Line 353 of lalr1.java  */
/* Line 1776 of "Ccompiler.y"  */
    {	};
  break;
    

  case 186:
  if (yyn == 186)
    
/* Line 353 of lalr1.java  */
/* Line 1777 of "Ccompiler.y"  */
    {yyval.last_value=((nodeclass)(yystack.valueAt (4-(3)))).last_value;
												yyval.tac=((nodeclass)(yystack.valueAt (4-(3)))).tac;	};
  break;
    

  case 187:
  if (yyn == 187)
    
/* Line 353 of lalr1.java  */
/* Line 1782 of "Ccompiler.y"  */
    {	yyval.last_value=((nodeclass)(yystack.valueAt (1-(1)))).last_value;
												yyval.tac=((nodeclass)(yystack.valueAt (1-(1)))).tac;};
  break;
    

  case 188:
  if (yyn == 188)
    
/* Line 353 of lalr1.java  */
/* Line 1784 of "Ccompiler.y"  */
    {	yyval.last_value=((nodeclass)(yystack.valueAt (2-(2)))).last_value;
												yyval.tac=((nodeclass)(yystack.valueAt (2-(1)))).tac+((nodeclass)(yystack.valueAt (2-(2)))).tac;};
  break;
    

  case 189:
  if (yyn == 189)
    
/* Line 353 of lalr1.java  */
/* Line 1789 of "Ccompiler.y"  */
    {	yyval.last_value=((nodeclass)(yystack.valueAt (1-(1)))).last_value;
												yyval.tac=((nodeclass)(yystack.valueAt (1-(1)))).tac;};
  break;
    

  case 190:
  if (yyn == 190)
    
/* Line 353 of lalr1.java  */
/* Line 1791 of "Ccompiler.y"  */
    {	yyval.last_value=((nodeclass)(yystack.valueAt (2-(2)))).last_value;
												yyval.tac=((nodeclass)(yystack.valueAt (2-(1)))).tac+"\n"+((nodeclass)(yystack.valueAt (2-(2)))).tac;};
  break;
    

  case 191:
  if (yyn == 191)
    
/* Line 353 of lalr1.java  */
/* Line 1796 of "Ccompiler.y"  */
    {	};
  break;
    

  case 192:
  if (yyn == 192)
    
/* Line 353 of lalr1.java  */
/* Line 1797 of "Ccompiler.y"  */
    {	yyval.last_value=((nodeclass)(yystack.valueAt (2-(1)))).last_value;
												yyval.tac=((nodeclass)(yystack.valueAt (2-(1)))).tac;};
  break;
    

  case 193:
  if (yyn == 193)
    
/* Line 353 of lalr1.java  */
/* Line 1803 of "Ccompiler.y"  */
    {
		String l1,l2,l3;
			l1=genlabel();
			l2=genlabel();
			yyval.tac=((nodeclass)(yystack.valueAt (5-(3)))).tac+"\nif("+((nodeclass)(yystack.valueAt (5-(3)))).last_value+")  goto "+l1+"\n goto "+l2+"\n"+l1+": "+((nodeclass)(yystack.valueAt (5-(5)))).tac+"\n"+l2+": ";
			yyval.last_value=((nodeclass)(yystack.valueAt (5-(5)))).last_value;	
	};
  break;
    

  case 194:
  if (yyn == 194)
    
/* Line 353 of lalr1.java  */
/* Line 1811 of "Ccompiler.y"  */
    {
		String l1,l2,l3;
			l1=genlabel();
			l2=genlabel();
			yyval.tac=((nodeclass)(yystack.valueAt (7-(3)))).tac+"\nif("+((nodeclass)(yystack.valueAt (7-(3)))).last_value+")  goto "+l1+"\n"+((nodeclass)(yystack.valueAt (7-(7)))).tac+"\n goto "+l2+"\n"+l1+": "+((nodeclass)(yystack.valueAt (7-(5)))).tac+"\n"+l2+": ";
			l1=((nodeclass)(yystack.valueAt (7-(5)))).last_value;
			l2=((nodeclass)(yystack.valueAt (7-(7)))).last_value;
			if(l1.compareTo(l2)>=0)
				yyval.last_value=((nodeclass)(yystack.valueAt (7-(5)))).last_value;
			else
				yyval.last_value=((nodeclass)(yystack.valueAt (7-(7)))).last_value;	
	};
  break;
    

  case 195:
  if (yyn == 195)
    
/* Line 353 of lalr1.java  */
/* Line 1823 of "Ccompiler.y"  */
    {	};
  break;
    

  case 196:
  if (yyn == 196)
    
/* Line 353 of lalr1.java  */
/* Line 1828 of "Ccompiler.y"  */
    {
		String l1,l2,l3;
			l1=genlabel();
			l2=genlabel();
			l3=genlabel();
		//	if($5.tac==null && $5.last_value==null)
			
			yyval.tac=l1+": "+((nodeclass)(yystack.valueAt (5-(3)))).tac+"\nif("+((nodeclass)(yystack.valueAt (5-(3)))).last_value+")  goto "+l2+"\n goto "+l3+"\n"+l2+": "+((nodeclass)(yystack.valueAt (5-(5)))).tac+"\n goto "+l1+"\n "+l3+": ";
			yyval.last_value=((nodeclass)(yystack.valueAt (5-(5)))).last_value;	
	

				};
  break;
    

  case 197:
  if (yyn == 197)
    
/* Line 353 of lalr1.java  */
/* Line 1841 of "Ccompiler.y"  */
    {
		String l1,l2,l3;
			l1=genlabel();
			yyval.tac=l1+": "+((nodeclass)(yystack.valueAt (7-(2)))).tac+"\n"+((nodeclass)(yystack.valueAt (7-(5)))).tac+"\nif("+((nodeclass)(yystack.valueAt (7-(5)))).last_value+")  goto "+l1;
			yyval.last_value=((nodeclass)(yystack.valueAt (7-(2)))).last_value;	
	

				};
  break;
    

  case 198:
  if (yyn == 198)
    
/* Line 353 of lalr1.java  */
/* Line 1850 of "Ccompiler.y"  */
    {	
			String l1,l2,l3;
			l1=genlabel();
			l2=genlabel();
			l3=genlabel();
			/*
			if($1.tac==null)
				{
				if($2.tac==null)
					{
					
					}
				}
			*/
			yyval.tac=((nodeclass)(yystack.valueAt (6-(3)))).tac+"\n"+l1+": "+((nodeclass)(yystack.valueAt (6-(4)))).tac+"\nif("+((nodeclass)(yystack.valueAt (6-(4)))).last_value+")  goto "+l2+"\n goto "+l3+"\n"+l2+": "+((nodeclass)(yystack.valueAt (6-(6)))).tac+"\n goto "+l1+"\n "+l3+": ";
			
			yyval.last_value=((nodeclass)(yystack.valueAt (6-(6)))).last_value;	
	
						
						};
  break;
    

  case 199:
  if (yyn == 199)
    
/* Line 353 of lalr1.java  */
/* Line 1871 of "Ccompiler.y"  */
    {	
			String l1,l2,l3,l4;
			l1=genlabel();
			l2=genlabel();
			l3=genlabel();
			l4=genlabel();
			/*
			if($1.tac==null)
				{
				if($2.tac==null)
					{
					
					}
				}
			*/
			yyval.tac=((nodeclass)(yystack.valueAt (7-(3)))).tac+"\n"+l1+": "+((nodeclass)(yystack.valueAt (7-(4)))).tac+"\nif("+((nodeclass)(yystack.valueAt (7-(4)))).last_value+")  goto "+l2+"\n goto "+l3+"\n"+l4+": "+((nodeclass)(yystack.valueAt (7-(5)))).tac+"\n goto "+l1+"\n"+l2+": "+((nodeclass)(yystack.valueAt (7-(7)))).tac+"\n goto "+l4+"\n "+l3+": ";
			
			yyval.last_value=((nodeclass)(yystack.valueAt (7-(7)))).last_value;	
	
						
						};
  break;
    

  case 200:
  if (yyn == 200)
    
/* Line 353 of lalr1.java  */
/* Line 1895 of "Ccompiler.y"  */
    {	};
  break;
    

  case 201:
  if (yyn == 201)
    
/* Line 353 of lalr1.java  */
/* Line 1896 of "Ccompiler.y"  */
    {	};
  break;
    

  case 202:
  if (yyn == 202)
    
/* Line 353 of lalr1.java  */
/* Line 1897 of "Ccompiler.y"  */
    {	};
  break;
    

  case 203:
  if (yyn == 203)
    
/* Line 353 of lalr1.java  */
/* Line 1898 of "Ccompiler.y"  */
    {	};
  break;
    

  case 204:
  if (yyn == 204)
    
/* Line 353 of lalr1.java  */
/* Line 1899 of "Ccompiler.y"  */
    {	};
  break;
    

  case 205:
  if (yyn == 205)
    
/* Line 353 of lalr1.java  */
/* Line 1903 of "Ccompiler.y"  */
    {	outp+=(((nodeclass)(yystack.valueAt (1-(1)))).tac);};
  break;
    

  case 206:
  if (yyn == 206)
    
/* Line 353 of lalr1.java  */
/* Line 1904 of "Ccompiler.y"  */
    {						outp+=(((nodeclass)(yystack.valueAt (2-(2)))).tac);
							};
  break;
    

  case 207:
  if (yyn == 207)
    
/* Line 353 of lalr1.java  */
/* Line 1909 of "Ccompiler.y"  */
    {
									yyval.last_value=((nodeclass)(yystack.valueAt (1-(1)))).last_value;
												yyval.tac="\nfunction "+ ((nodeclass)(yystack.valueAt (1-(1)))).tac+ "\nfunction ends"; };
  break;
    

  case 208:
  if (yyn == 208)
    
/* Line 353 of lalr1.java  */
/* Line 1912 of "Ccompiler.y"  */
    {	yyval.last_value=((nodeclass)(yystack.valueAt (1-(1)))).last_value;
												yyval.tac=((nodeclass)(yystack.valueAt (1-(1)))).tac;};
  break;
    

  case 209:
  if (yyn == 209)
    
/* Line 353 of lalr1.java  */
/* Line 1917 of "Ccompiler.y"  */
    {	yyval.last_value=((nodeclass)(yystack.valueAt (4-(4)))).last_value;
												yyval.tac=((nodeclass)(yystack.valueAt (4-(2)))).last_value+"() starts :\n"+((nodeclass)(yystack.valueAt (4-(4)))).tac;};
  break;
    

  case 210:
  if (yyn == 210)
    
/* Line 353 of lalr1.java  */
/* Line 1919 of "Ccompiler.y"  */
    {	yyval.last_value=((nodeclass)(yystack.valueAt (3-(3)))).last_value;
												yyval.tac=((nodeclass)(yystack.valueAt (3-(2)))).last_value+"() starts :\n"+((nodeclass)(yystack.valueAt (3-(3)))).tac;};
  break;
    

  case 211:
  if (yyn == 211)
    
/* Line 353 of lalr1.java  */
/* Line 1921 of "Ccompiler.y"  */
    {	yyval.last_value=((nodeclass)(yystack.valueAt (3-(3)))).last_value;
												yyval.tac=((nodeclass)(yystack.valueAt (3-(1)))).last_value+"() starts :\n"+((nodeclass)(yystack.valueAt (3-(3)))).tac;};
  break;
    

  case 212:
  if (yyn == 212)
    
/* Line 353 of lalr1.java  */
/* Line 1923 of "Ccompiler.y"  */
    {	yyval.last_value=((nodeclass)(yystack.valueAt (2-(2)))).last_value;
												yyval.tac=((nodeclass)(yystack.valueAt (2-(1)))).last_value+"() starts :\n"+((nodeclass)(yystack.valueAt (2-(2)))).tac;};
  break;
    



/* Line 353 of lalr1.java  */
/* Line 3735 of "Ccompiler.java"  */
	default: break;
      }

    yy_symbol_print ("-> $$ =", yyr1_[yyn], yyval);

    yystack.pop (yylen);
    yylen = 0;

    /* Shift the result of the reduction.  */
    yyn = yyr1_[yyn];
    int yystate = yypgoto_[yyn - yyntokens_] + yystack.stateAt (0);
    if (0 <= yystate && yystate <= yylast_
	&& yycheck_[yystate] == yystack.stateAt (0))
      yystate = yytable_[yystate];
    else
      yystate = yydefgoto_[yyn - yyntokens_];

    yystack.push (yystate, yyval);
    return YYNEWSTATE;
  }

  /* Return YYSTR after stripping away unnecessary quotes and
     backslashes, so that it's suitable for yyerror.  The heuristic is
     that double-quoting is unnecessary unless the string contains an
     apostrophe, a comma, or backslash (other than backslash-backslash).
     YYSTR is taken from yytname.  */
  private final String yytnamerr_ (String yystr)
  {
    if (yystr.charAt (0) == '"')
      {
        StringBuffer yyr = new StringBuffer ();
        strip_quotes: for (int i = 1; i < yystr.length (); i++)
          switch (yystr.charAt (i))
            {
            case '\'':
            case ',':
              break strip_quotes;

            case '\\':
	      if (yystr.charAt(++i) != '\\')
                break strip_quotes;
              /* Fall through.  */
            default:
              yyr.append (yystr.charAt (i));
              break;

            case '"':
              return yyr.toString ();
            }
      }
    else if (yystr.equals ("$end"))
      return "end of input";

    return yystr;
  }

  /*--------------------------------.
  | Print this symbol on YYOUTPUT.  |
  `--------------------------------*/

  private void yy_symbol_print (String s, int yytype,
			         Object yyvaluep				 )
  {
    if (yydebug > 0)
    yycdebug (s + (yytype < yyntokens_ ? " token " : " nterm ")
	      + yytname_[yytype] + " ("
	      + (yyvaluep == null ? "(null)" : yyvaluep.toString ()) + ")");
  }

  /**
   * Parse input from the scanner that was specified at object construction
   * time.  Return whether the end of the input was reached successfully.
   *
   * @return <tt>true</tt> if the parsing succeeds.  Note that this does not
   *          imply that there were no syntax errors.
   */
  public boolean parse () throws java.io.IOException
  {
    /// Lookahead and lookahead in internal form.
    int yychar = yyempty_;
    int yytoken = 0;

    /* State.  */
    int yyn = 0;
    int yylen = 0;
    int yystate = 0;

    YYStack yystack = new YYStack ();

    /* Error handling.  */
    int yynerrs_ = 0;
    

    /// Semantic value of the lookahead.
    nodeclass yylval = null;

    int yyresult;

    yycdebug ("Starting parse\n");
    yyerrstatus_ = 0;


    /* Initialize the stack.  */
    yystack.push (yystate, yylval);

    int label = YYNEWSTATE;
    for (;;)
      switch (label)
      {
        /* New state.  Unlike in the C/C++ skeletons, the state is already
	   pushed when we come here.  */
      case YYNEWSTATE:
        yycdebug ("Entering state " + yystate + "\n");
        if (yydebug > 0)
          yystack.print (yyDebugStream);
    
        /* Accept?  */
        if (yystate == yyfinal_)
          return true;
    
        /* Take a decision.  First try without lookahead.  */
        yyn = yypact_[yystate];
        if (yyn == yypact_ninf_)
          {
            label = YYDEFAULT;
	    break;
          }
    
        /* Read a lookahead token.  */
        if (yychar == yyempty_)
          {
	    yycdebug ("Reading a token: ");
	    yychar = yylex ();
            
            yylval = yylexer.getLVal ();
          }
    
        /* Convert token to internal form.  */
        if (yychar <= EOF)
          {
	    yychar = yytoken = EOF;
	    yycdebug ("Now at end of input.\n");
          }
        else
          {
	    yytoken = yytranslate_ (yychar);
	    yy_symbol_print ("Next token is", yytoken,
	    		     yylval);
          }
    
        /* If the proper action on seeing token YYTOKEN is to reduce or to
           detect an error, take that action.  */
        yyn += yytoken;
        if (yyn < 0 || yylast_ < yyn || yycheck_[yyn] != yytoken)
          label = YYDEFAULT;
    
        /* <= 0 means reduce or error.  */
        else if ((yyn = yytable_[yyn]) <= 0)
          {
	    if (yyn == 0 || yyn == yytable_ninf_)
	      label = YYFAIL;
	    else
	      {
	        yyn = -yyn;
	        label = YYREDUCE;
	      }
          }
    
        else
          {
            /* Shift the lookahead token.  */
	    yy_symbol_print ("Shifting", yytoken,
	    		     yylval);
    
            /* Discard the token being shifted.  */
            yychar = yyempty_;
    
            /* Count tokens shifted since error; after three, turn off error
               status.  */
            if (yyerrstatus_ > 0)
              --yyerrstatus_;
    
            yystate = yyn;
            yystack.push (yystate, yylval);
            label = YYNEWSTATE;
          }
        break;
    
      /*-----------------------------------------------------------.
      | yydefault -- do the default action for the current state.  |
      `-----------------------------------------------------------*/
      case YYDEFAULT:
        yyn = yydefact_[yystate];
        if (yyn == 0)
          label = YYFAIL;
        else
          label = YYREDUCE;
        break;
    
      /*-----------------------------.
      | yyreduce -- Do a reduction.  |
      `-----------------------------*/
      case YYREDUCE:
        yylen = yyr2_[yyn];
        label = yyaction (yyn, yystack, yylen);
	yystate = yystack.stateAt (0);
        break;
    
      /*------------------------------------.
      | yyerrlab -- here on detecting error |
      `------------------------------------*/
      case YYFAIL:
        /* If not already recovering from an error, report this error.  */
        if (yyerrstatus_ == 0)
          {
	    ++yynerrs_;
	    yyerror (yysyntax_error (yystate, yytoken));
          }
    
        
        if (yyerrstatus_ == 3)
          {
	    /* If just tried and failed to reuse lookahead token after an
	     error, discard it.  */
    
	    if (yychar <= EOF)
	      {
	      /* Return failure if at end of input.  */
	      if (yychar == EOF)
	        return false;
	      }
	    else
	      yychar = yyempty_;
          }
    
        /* Else will try to reuse lookahead token after shifting the error
           token.  */
        label = YYERRLAB1;
        break;
    
      /*---------------------------------------------------.
      | errorlab -- error raised explicitly by YYERROR.  |
      `---------------------------------------------------*/
      case YYERROR:
    
        
        /* Do not reclaim the symbols of the rule which action triggered
           this YYERROR.  */
        yystack.pop (yylen);
        yylen = 0;
        yystate = yystack.stateAt (0);
        label = YYERRLAB1;
        break;
    
      /*-------------------------------------------------------------.
      | yyerrlab1 -- common code for both syntax error and YYERROR.  |
      `-------------------------------------------------------------*/
      case YYERRLAB1:
        yyerrstatus_ = 3;	/* Each real token shifted decrements this.  */
    
        for (;;)
          {
	    yyn = yypact_[yystate];
	    if (yyn != yypact_ninf_)
	      {
	        yyn += yyterror_;
	        if (0 <= yyn && yyn <= yylast_ && yycheck_[yyn] == yyterror_)
	          {
	            yyn = yytable_[yyn];
	            if (0 < yyn)
		      break;
	          }
	      }
    
	    /* Pop the current state because it cannot handle the error token.  */
	    if (yystack.height == 1)
	      return false;
    
	    
	    yystack.pop ();
	    yystate = yystack.stateAt (0);
	    if (yydebug > 0)
	      yystack.print (yyDebugStream);
          }
    
	

        /* Shift the error token.  */
        yy_symbol_print ("Shifting", yystos_[yyn],
			 yylval);
    
        yystate = yyn;
	yystack.push (yyn, yylval);
        label = YYNEWSTATE;
        break;
    
        /* Accept.  */
      case YYACCEPT:
        return true;
    
        /* Abort.  */
      case YYABORT:
        return false;
      }
  }

  // Generate an error message.
  private String yysyntax_error (int yystate, int tok)
  {
    if (errorVerbose)
      {
        int yyn = yypact_[yystate];
        if (yypact_ninf_ < yyn && yyn <= yylast_)
          {
	    StringBuffer res;

	    /* Start YYX at -YYN if negative to avoid negative indexes in
	       YYCHECK.  */
	    int yyxbegin = yyn < 0 ? -yyn : 0;

	    /* Stay within bounds of both yycheck and yytname.  */
	    int yychecklim = yylast_ - yyn + 1;
	    int yyxend = yychecklim < yyntokens_ ? yychecklim : yyntokens_;
	    int count = 0;
	    for (int x = yyxbegin; x < yyxend; ++x)
	      if (yycheck_[x + yyn] == x && x != yyterror_)
	        ++count;

	    // FIXME: This method of building the message is not compatible
	    // with internationalization.
	    res = new StringBuffer ("syntax error, unexpected ");
	    res.append (yytnamerr_ (yytname_[tok]));
	    if (count < 5)
	      {
	        count = 0;
	        for (int x = yyxbegin; x < yyxend; ++x)
	          if (yycheck_[x + yyn] == x && x != yyterror_)
		    {
		      res.append (count++ == 0 ? ", expecting " : " or ");
		      res.append (yytnamerr_ (yytname_[x]));
		    }
	      }
	    return res.toString ();
          }
      }

    return "syntax error";
  }


  /* YYPACT[STATE-NUM] -- Index in YYTABLE of the portion describing
     STATE-NUM.  */
  private static final short yypact_ninf_ = -220;
  private static final short yypact_[] =
  {
       768,  -220,    45,   -26,  -220,  -220,  -220,  -220,  -220,  -220,
      40,  -220,  -220,  -220,  -220,  -220,  -220,  -220,  -220,  -220,
    -220,  -220,  -220,  -220,  -220,    33,  1266,  1266,  -220,    63,
    -220,  1266,   940,    78,    80,   609,  -220,  -220,   -21,  -220,
    -220,   -26,   -11,    86,  -220,   184,  -220,   912,  -220,  -220,
      70,  1292,  -220,   279,  -220,    33,  -220,   940,   798,  1056,
      78,  -220,  -220,  -220,  -220,  -220,    86,    92,    42,  -220,
    -220,    45,   690,  -220,   940,  1292,  1292,   740,  -220,    18,
    1292,    76,  -220,  -220,  1193,  1237,  1237,   685,  -220,  -220,
    -220,  -220,  -220,  -220,  -220,  -220,    95,  1242,   155,   165,
     569,   196,   183,   193,   201,   208,  1071,  -220,    51,   251,
    1242,  -220,   105,    77,   171,    14,   226,   211,   206,   217,
     243,    52,  -220,  -220,   185,  -220,  -220,  -220,   360,   441,
    -220,  -220,  -220,  -220,   219,  -220,  -220,  -220,  -220,    22,
     250,   247,  -220,   104,  -220,  -220,  -220,  -220,   249,   159,
    1242,    86,  -220,  -220,   690,  -220,  -220,  -220,   967,  -220,
    -220,  -220,  1242,   189,  -220,   232,  -220,   569,   685,  -220,
    1242,  -220,  -220,   113,    91,   258,   569,   238,  -220,  1242,
     207,   260,  -220,  1242,  1242,  1076,  -220,   190,  -220,  -220,
    1120,  1242,   287,   288,  -220,  -220,  -220,  -220,  -220,  -220,
    -220,  -220,  -220,  -220,  -220,  1242,  -220,  1242,  1242,  1242,
    1242,  1242,  1242,  1242,  1242,  1242,  1242,  1242,  1242,  1242,
    1242,  1242,  1242,  1242,  1242,  1242,  -220,  1242,  -220,   505,
    -220,  -220,   713,  1136,  -220,    90,  -220,   197,  -220,  1238,
    -220,   291,  -220,  -220,  -220,  -220,  -220,   202,  -220,  -220,
    -220,    18,  1242,  -220,   267,  -220,   850,   203,  -220,  1242,
    -220,   569,   118,   269,  -220,   148,   157,  1076,  -220,  -220,
     158,  -220,   210,  -220,  -220,  -220,  -220,  -220,  -220,   105,
     105,    77,    77,   171,   171,   171,   171,    14,    14,   226,
     211,   206,   217,   243,    53,  -220,  -220,  -220,   271,   272,
    -220,   266,   197,   880,  1173,  -220,  -220,  -220,  1019,  -220,
    -220,  -220,  -220,  -220,  -220,   569,  1242,   569,   569,  1188,
    -220,  1242,  -220,  1242,  -220,  -220,  -220,  -220,   273,  -220,
     274,  -220,  -220,  -220,   170,   222,  -220,   569,   172,  -220,
    -220,  -220,  -220,   275,   569,  -220,   569,  -220,  -220,  -220
  };

  /* YYDEFACT[S] -- default rule to reduce with in state S when YYTABLE
     doesn't specify something else to do.  Zero means the default is an
     error.  */
  private static final short yydefact_[] =
  {
         0,   133,     0,   140,    91,   104,    90,    89,    92,    88,
       0,   109,   108,    94,    95,    96,    97,   100,   101,    98,
      99,   129,   130,    93,   208,     0,    78,    80,   102,     0,
     103,    82,     0,   132,     0,     0,   205,   207,     0,   144,
     142,   141,   124,     0,    76,     0,    84,    86,    79,    81,
     107,     0,    83,     0,   187,     0,   212,     0,     0,     0,
     131,     1,   206,   134,   145,   143,     0,   127,     0,   125,
      77,     0,     0,   210,     0,     0,   114,     0,   110,     0,
     116,     2,     3,     4,     0,     0,     0,     0,   191,   183,
      24,    25,    23,    22,    26,    27,     0,     0,     0,     0,
       0,     0,     0,     0,     0,     0,     0,     6,    16,    28,
       0,    30,    34,    37,    40,    45,    48,    50,    52,    54,
      56,    58,    60,    73,     0,   189,   174,   175,     0,     0,
     176,   177,   178,   179,    86,   188,   211,   153,   139,   152,
       0,   146,   148,     0,     2,   136,    28,    75,     0,     0,
       0,     0,   122,    85,     0,   169,    87,   209,     0,   113,
     106,   111,     0,     0,   117,   119,   115,     0,     0,    20,
       0,    17,    18,     0,   155,     0,     0,     0,   201,     0,
       0,     0,   202,     0,     0,     0,   203,     0,    12,    13,
       0,     0,     0,     0,    63,    64,    65,    66,    67,    68,
      69,    70,    71,    72,    62,     0,    19,     0,     0,     0,
       0,     0,     0,     0,     0,     0,     0,     0,     0,     0,
       0,     0,     0,     0,     0,     0,   192,     0,   185,     0,
     184,   190,     0,     0,   150,   157,   151,   158,   137,     0,
     138,     0,   135,   123,   128,   126,   172,     0,   105,   120,
     112,     0,     0,   180,     0,     5,     0,   157,   156,     0,
     182,     0,     0,     0,   200,     0,     0,     0,   204,     8,
       0,    14,     0,    11,    10,    61,    31,    32,    33,    35,
      36,    38,    39,    43,    44,    42,    41,    46,    47,    49,
      51,    53,    55,    57,     0,    74,   186,   165,     0,     0,
     161,     0,   159,     0,     0,   147,   149,   154,     0,   170,
     118,   121,    21,    29,   181,     0,     0,     0,     0,     0,
       9,     0,     7,     0,   166,   160,   162,   167,     0,   163,
       0,   171,   173,   195,     0,   193,   196,     0,     0,    15,
      59,   168,   164,     0,     0,   198,     0,   197,   194,   199
  };

  /* YYPGOTO[NTERM-NUM].  */
  private static final short yypgoto_[] =
  {
      -220,  -220,  -220,  -220,   -56,  -220,   -78,    50,    31,    -6,
      44,    87,    88,    89,    94,    97,  -220,   -58,   -57,  -220,
       4,   -51,    12,     0,  -220,   239,  -220,    47,  -220,  -220,
     244,   -63,   -67,  -220,    71,  -220,   261,   175,    39,     8,
     -29,    -1,  -220,   -54,  -220,    98,  -220,   160,  -121,  -219,
    -137,  -220,   -92,  -220,   -13,    24,   212,  -179,  -220,  -220,
    -220,  -220,   324,  -220
  };

  /* YYDEFGOTO[NTERM-NUM].  */
  private static final short
  yydefgoto_[] =
  {
        -1,   107,   108,   270,   109,   110,   111,   112,   113,   114,
     115,   116,   117,   118,   119,   120,   121,   122,   123,   205,
     124,   148,    54,    55,    45,    46,    26,    27,    28,    29,
      77,    78,    79,   163,   164,    30,    68,    69,    31,    32,
      33,    34,    41,   298,   141,   142,   143,   175,   299,   237,
     156,   247,   125,   126,   127,    57,   129,   130,   131,   132,
     133,    35,    36,    37
  };

  /* YYTABLE[YYPACT[STATE-NUM]].  What to do in state STATE-NUM.  If
     positive, shift that token.  If negative, reduce the rule which
     number is the opposite.  If zero, do what YYDEFACT says.  */
  private static final short yytable_ninf_ = -1;
  private static final short
  yytable_[] =
  {
        25,   147,    40,   146,   140,    60,   267,    63,   180,   159,
      38,     3,    24,   166,   161,   155,   302,   246,   236,    56,
     174,     1,    66,   214,   215,     1,    48,    49,   169,   171,
     172,    52,   206,    47,    73,    25,     1,   231,   302,   147,
      65,   146,    39,    42,   136,     2,   177,    24,     1,   232,
      21,    22,   233,   258,   146,     3,   216,   217,   139,     3,
       2,   157,    44,   134,   188,   189,    50,   162,   224,   135,
       3,    74,     2,    43,   151,   253,   152,   128,   190,   134,
      64,   191,     3,     1,   260,   227,   135,   165,   319,    67,
      80,   173,   147,     1,   146,   161,    51,   155,    76,   244,
     225,   174,   323,    75,   147,    58,   146,     2,    59,   192,
     187,   249,   210,   211,    80,    80,    80,   232,   256,    80,
     233,   233,    76,    76,    76,   167,    80,    76,     3,   276,
     277,   278,   240,   271,    76,   193,   241,   231,   235,   150,
     135,   255,   207,   208,   176,   227,   315,   234,   275,   209,
     227,   146,   146,   146,   146,   146,   146,   146,   146,   146,
     146,   146,   146,   146,   146,   146,   146,   146,   146,   314,
     295,   332,   173,   257,   173,   147,   317,   146,   212,   213,
     227,   313,   301,   262,   178,   318,   320,   265,   266,   227,
     321,   151,   179,   243,   147,   272,   146,    80,   343,   181,
     346,   311,   227,   146,   227,    76,    60,    80,   283,   284,
     285,   286,   182,    70,   226,    76,    71,   227,   250,   268,
     183,   251,   227,   333,   303,   335,   336,   304,   184,   294,
     256,   235,   139,   233,   308,   185,   309,   218,   219,   139,
      38,   322,   227,   281,   282,   345,   147,   221,   146,   328,
     220,   155,   348,   330,   349,   257,   139,   222,   223,   165,
     279,   280,   287,   288,   339,   340,    72,   146,   194,   195,
     196,   197,   198,   199,   200,   201,   202,   203,   238,   239,
     242,   252,    81,    82,    83,    84,   259,   261,   263,   264,
     273,   274,    85,    86,   307,   312,   316,   326,   204,   324,
     325,   341,   344,   139,   347,   342,    87,   289,    88,   290,
     153,   291,    53,    89,    90,    91,    92,   292,    93,   158,
     334,   293,   310,   338,    94,    95,   245,   149,   254,    96,
       4,    97,     5,     6,     7,     8,     9,   306,    10,    11,
     229,    98,    99,   100,   101,   102,    12,    13,    14,    15,
      16,    17,    18,    19,    20,    21,    22,    23,   103,    62,
     104,   105,   106,    81,    82,    83,    84,     0,     0,     0,
       0,     0,     0,    85,    86,     0,     0,     0,     0,     0,
       0,     0,     0,     0,     0,     0,     0,    87,     0,    88,
       0,     0,     0,    53,   228,    90,    91,    92,     0,    93,
       0,     0,     0,     0,     0,    94,    95,     0,     0,     0,
      96,     4,    97,     5,     6,     7,     8,     9,     0,    10,
      11,     0,    98,    99,   100,   101,   102,    12,    13,    14,
      15,    16,    17,    18,    19,    20,    21,    22,    23,   103,
       0,   104,   105,   106,    81,    82,    83,    84,     0,     0,
       0,     0,     0,     0,    85,    86,     0,     0,     0,     0,
       0,     0,     0,     0,     0,     0,     0,     0,    87,     0,
      88,     0,     0,     0,    53,   230,    90,    91,    92,     0,
      93,     0,     0,     0,     0,     0,    94,    95,     0,     0,
       0,    96,     0,    97,     0,     0,     0,     0,     0,     0,
       0,     0,     0,    98,    99,   100,   101,   102,    81,    82,
      83,    84,     0,     0,     0,     0,     0,     0,    85,    86,
     103,     0,   104,   105,   106,     0,     0,     0,     0,     0,
       0,     0,    87,     0,    88,     0,     0,     0,    53,   296,
      90,    91,    92,     0,    93,     0,     0,     0,     0,     0,
      94,    95,     0,     0,     0,    96,     0,    97,     0,     0,
       0,     0,     0,     0,     0,     0,     0,    98,    99,   100,
     101,   102,    81,    82,    83,    84,     0,     0,     0,     0,
       0,     0,    85,    86,   103,     0,   104,   105,   106,     0,
       0,     0,     0,     0,     0,     0,    87,     0,    88,     0,
       0,     0,    53,     0,    90,    91,    92,     0,    93,    61,
       0,     0,     1,     0,    94,    95,     0,     0,     0,    96,
       0,    97,     0,     0,     0,     0,     0,     0,     0,     0,
       0,    98,    99,   100,   101,   102,     2,     0,     0,     0,
       0,     0,     0,     0,     0,     0,     3,     0,   103,     0,
     104,   105,   106,     0,     0,     0,     0,     0,     0,     0,
       4,     0,     5,     6,     7,     8,     9,     0,    10,    11,
       0,     0,     0,     0,     0,     0,    12,    13,    14,    15,
      16,    17,    18,    19,    20,    21,    22,    23,   144,    82,
      83,    84,     0,   144,    82,    83,    84,     0,    85,    86,
       0,     0,     0,    85,    86,     0,     0,     0,     0,     0,
       0,     0,    87,     0,     0,     0,     1,    87,     0,     0,
      90,    91,    92,   154,    93,    90,    91,    92,     0,    93,
      94,    95,     0,     0,     0,    94,    95,     0,     5,     0,
     232,   297,     0,   233,    10,    11,     0,     0,     0,     0,
       3,     0,    12,    13,    14,    15,    16,    17,    18,    19,
      20,    21,    22,    23,     4,     0,     5,     6,     7,     8,
       9,     1,    10,    11,   160,     0,     0,     0,     0,     0,
      12,    13,    14,    15,    16,    17,    18,    19,    20,    21,
      22,    23,     0,     5,     0,     2,     0,     0,     0,    10,
      11,   137,     0,     0,     0,     3,     0,    12,    13,    14,
      15,    16,    17,    18,    19,    20,    21,    22,    23,     4,
       0,     5,     6,     7,     8,     9,   138,    10,    11,     0,
       0,     0,     0,     0,     0,    12,    13,    14,    15,    16,
      17,    18,    19,    20,    21,    22,    23,     0,     0,     4,
       0,     5,     6,     7,     8,     9,     0,    10,    11,     0,
       0,     0,     0,     0,     0,    12,    13,    14,    15,    16,
      17,    18,    19,    20,    21,    22,    23,   256,   297,     0,
     233,     0,     0,     0,     0,     0,     0,     3,     0,     0,
       0,     0,     0,     0,     0,     0,     0,     0,     0,     0,
       0,     4,     0,     5,     6,     7,     8,     9,   327,    10,
      11,     0,     0,     0,     0,     0,     0,    12,    13,    14,
      15,    16,    17,    18,    19,    20,    21,    22,    23,     0,
       0,     4,     0,     5,     6,     7,     8,     9,     0,    10,
      11,     0,     0,     0,     0,    53,     0,    12,    13,    14,
      15,    16,    17,    18,    19,    20,    21,    22,    23,    72,
       0,     0,     0,     4,     0,     5,     6,     7,     8,     9,
       0,    10,    11,    53,     0,     0,     0,     0,     0,    12,
      13,    14,    15,    16,    17,    18,    19,    20,    21,    22,
      23,     4,     0,     5,     6,     7,     8,     9,     0,    10,
      11,   248,     0,     0,     0,     0,     0,    12,    13,    14,
      15,    16,    17,    18,    19,    20,    21,    22,    23,     0,
       5,     0,   144,    82,    83,    84,    10,    11,     0,     0,
       0,     0,    85,    86,    12,    13,    14,    15,    16,    17,
      18,    19,    20,    21,    22,    23,    87,     0,     0,     0,
       0,     0,   154,   331,    90,    91,    92,     0,    93,   144,
      82,    83,    84,     0,    94,    95,     0,     0,     0,    85,
      86,     0,     0,     0,   144,    82,    83,    84,     0,   144,
      82,    83,    84,    87,    85,    86,     0,   145,     0,    85,
      86,    90,    91,    92,     0,    93,     0,     0,    87,     0,
     186,    94,    95,    87,     0,    88,    90,    91,    92,     0,
      93,    90,    91,    92,     0,    93,    94,    95,     0,     0,
       0,    94,    95,   144,    82,    83,    84,     0,     0,     0,
       0,     0,     0,    85,    86,     0,     0,     0,     0,   144,
      82,    83,    84,     0,     0,     0,     0,    87,   269,    85,
      86,     0,     0,     0,     0,    90,    91,    92,     0,    93,
       0,     0,     0,    87,     0,    94,    95,   300,     0,     0,
       0,    90,    91,    92,     0,    93,   144,    82,    83,    84,
       0,    94,    95,     0,     0,     0,    85,    86,     0,     0,
       0,   144,    82,    83,    84,     0,   144,    82,    83,    84,
      87,    85,    86,     0,   329,     0,    85,    86,    90,    91,
      92,     0,    93,     0,     0,    87,   337,     0,    94,    95,
     168,     0,     0,    90,    91,    92,     0,    93,    90,    91,
      92,     0,    93,    94,    95,     0,     0,     0,    94,    95,
     144,    82,    83,    84,     0,   144,    82,    83,    84,     0,
      85,    86,     0,     0,     0,    85,    86,     0,     0,     0,
       0,     0,     0,     0,   170,     0,     0,     0,     0,    87,
       0,     0,    90,    91,    92,     0,    93,    90,    91,    92,
       0,    93,    94,    95,     0,     0,     0,    94,    95,     4,
       0,     5,     6,     7,     8,     9,     0,    10,    11,   305,
       0,     0,     0,     0,     0,    12,    13,    14,    15,    16,
      17,    18,    19,    20,    21,    22,    23,     4,     0,     5,
       6,     7,     8,     9,     0,    10,    11,     0,     0,     0,
       0,     0,     0,    12,    13,    14,    15,    16,    17,    18,
      19,    20,    21,    22,    23,     5,     0,     0,     0,     0,
       0,    10,    11,     0,     0,     0,     0,     0,     0,    12,
      13,    14,    15,    16,    17,    18,    19,    20,    21,    22,
      23
  };

  /* YYCHECK.  */
  private static final short
  yycheck_[] =
  {
         0,    59,     3,    59,    58,    34,   185,    28,   100,    76,
       2,    37,     0,    80,    77,    72,   235,   154,   139,    32,
      87,     3,    33,     9,    10,     3,    26,    27,    84,    85,
      86,    31,   110,    25,    47,    35,     3,   129,   257,    97,
      41,    97,     3,     3,    57,    27,    97,    35,     3,    27,
      76,    77,    30,   174,   110,    37,    42,    43,    58,    37,
      27,    74,    29,    55,    13,    14,     3,    49,    16,    57,
      37,    47,    27,    33,    32,   167,    34,    53,    27,    71,
      41,    30,    37,     3,   176,    32,    74,    79,   267,     3,
      51,    87,   150,     3,   150,   158,    33,   154,    51,   150,
      48,   168,    49,    33,   162,    27,   162,    27,    30,    58,
     106,   162,    35,    36,    75,    76,    77,    27,    27,    80,
      30,    30,    75,    76,    77,    49,    87,    80,    37,   207,
     208,   209,    28,   190,    87,    84,    32,   229,   139,    47,
     128,    28,    37,    38,    49,    32,    28,   139,   205,    44,
      32,   207,   208,   209,   210,   211,   212,   213,   214,   215,
     216,   217,   218,   219,   220,   221,   222,   223,   224,   261,
     227,   308,   168,   174,   170,   233,    28,   233,     7,     8,
      32,   259,   233,   179,    29,    28,    28,   183,   184,    32,
      32,    32,    27,    34,   252,   191,   252,   158,    28,     3,
      28,   252,    32,   259,    32,   158,   235,   168,   214,   215,
     216,   217,    29,    29,    29,   168,    32,    32,    29,    29,
      27,    32,    32,   315,    27,   317,   318,    30,    27,   225,
      27,   232,   232,    30,    32,    27,    34,    11,    12,   239,
     232,    31,    32,   212,   213,   337,   304,    41,   304,   303,
      39,   308,   344,   304,   346,   256,   256,    40,    15,   251,
     210,   211,   218,   219,   321,   323,    47,   323,    17,    18,
      19,    20,    21,    22,    23,    24,    25,    26,    28,    32,
      31,    49,     3,     4,     5,     6,    28,    49,    81,    29,
       3,     3,    13,    14,     3,    28,    27,    31,    47,    28,
      28,    28,    80,   303,    29,    31,    27,   220,    29,   221,
      71,   222,    33,    34,    35,    36,    37,   223,    39,    75,
     316,   224,   251,   319,    45,    46,   151,    66,   168,    50,
      51,    52,    53,    54,    55,    56,    57,   239,    59,    60,
     128,    62,    63,    64,    65,    66,    67,    68,    69,    70,
      71,    72,    73,    74,    75,    76,    77,    78,    79,    35,
      81,    82,    83,     3,     4,     5,     6,    -1,    -1,    -1,
      -1,    -1,    -1,    13,    14,    -1,    -1,    -1,    -1,    -1,
      -1,    -1,    -1,    -1,    -1,    -1,    -1,    27,    -1,    29,
      -1,    -1,    -1,    33,    34,    35,    36,    37,    -1,    39,
      -1,    -1,    -1,    -1,    -1,    45,    46,    -1,    -1,    -1,
      50,    51,    52,    53,    54,    55,    56,    57,    -1,    59,
      60,    -1,    62,    63,    64,    65,    66,    67,    68,    69,
      70,    71,    72,    73,    74,    75,    76,    77,    78,    79,
      -1,    81,    82,    83,     3,     4,     5,     6,    -1,    -1,
      -1,    -1,    -1,    -1,    13,    14,    -1,    -1,    -1,    -1,
      -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    27,    -1,
      29,    -1,    -1,    -1,    33,    34,    35,    36,    37,    -1,
      39,    -1,    -1,    -1,    -1,    -1,    45,    46,    -1,    -1,
      -1,    50,    -1,    52,    -1,    -1,    -1,    -1,    -1,    -1,
      -1,    -1,    -1,    62,    63,    64,    65,    66,     3,     4,
       5,     6,    -1,    -1,    -1,    -1,    -1,    -1,    13,    14,
      79,    -1,    81,    82,    83,    -1,    -1,    -1,    -1,    -1,
      -1,    -1,    27,    -1,    29,    -1,    -1,    -1,    33,    34,
      35,    36,    37,    -1,    39,    -1,    -1,    -1,    -1,    -1,
      45,    46,    -1,    -1,    -1,    50,    -1,    52,    -1,    -1,
      -1,    -1,    -1,    -1,    -1,    -1,    -1,    62,    63,    64,
      65,    66,     3,     4,     5,     6,    -1,    -1,    -1,    -1,
      -1,    -1,    13,    14,    79,    -1,    81,    82,    83,    -1,
      -1,    -1,    -1,    -1,    -1,    -1,    27,    -1,    29,    -1,
      -1,    -1,    33,    -1,    35,    36,    37,    -1,    39,     0,
      -1,    -1,     3,    -1,    45,    46,    -1,    -1,    -1,    50,
      -1,    52,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,
      -1,    62,    63,    64,    65,    66,    27,    -1,    -1,    -1,
      -1,    -1,    -1,    -1,    -1,    -1,    37,    -1,    79,    -1,
      81,    82,    83,    -1,    -1,    -1,    -1,    -1,    -1,    -1,
      51,    -1,    53,    54,    55,    56,    57,    -1,    59,    60,
      -1,    -1,    -1,    -1,    -1,    -1,    67,    68,    69,    70,
      71,    72,    73,    74,    75,    76,    77,    78,     3,     4,
       5,     6,    -1,     3,     4,     5,     6,    -1,    13,    14,
      -1,    -1,    -1,    13,    14,    -1,    -1,    -1,    -1,    -1,
      -1,    -1,    27,    -1,    -1,    -1,     3,    27,    -1,    -1,
      35,    36,    37,    33,    39,    35,    36,    37,    -1,    39,
      45,    46,    -1,    -1,    -1,    45,    46,    -1,    53,    -1,
      27,    28,    -1,    30,    59,    60,    -1,    -1,    -1,    -1,
      37,    -1,    67,    68,    69,    70,    71,    72,    73,    74,
      75,    76,    77,    78,    51,    -1,    53,    54,    55,    56,
      57,     3,    59,    60,    34,    -1,    -1,    -1,    -1,    -1,
      67,    68,    69,    70,    71,    72,    73,    74,    75,    76,
      77,    78,    -1,    53,    -1,    27,    -1,    -1,    -1,    59,
      60,     3,    -1,    -1,    -1,    37,    -1,    67,    68,    69,
      70,    71,    72,    73,    74,    75,    76,    77,    78,    51,
      -1,    53,    54,    55,    56,    57,    28,    59,    60,    -1,
      -1,    -1,    -1,    -1,    -1,    67,    68,    69,    70,    71,
      72,    73,    74,    75,    76,    77,    78,    -1,    -1,    51,
      -1,    53,    54,    55,    56,    57,    -1,    59,    60,    -1,
      -1,    -1,    -1,    -1,    -1,    67,    68,    69,    70,    71,
      72,    73,    74,    75,    76,    77,    78,    27,    28,    -1,
      30,    -1,    -1,    -1,    -1,    -1,    -1,    37,    -1,    -1,
      -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,
      -1,    51,    -1,    53,    54,    55,    56,    57,    28,    59,
      60,    -1,    -1,    -1,    -1,    -1,    -1,    67,    68,    69,
      70,    71,    72,    73,    74,    75,    76,    77,    78,    -1,
      -1,    51,    -1,    53,    54,    55,    56,    57,    -1,    59,
      60,    -1,    -1,    -1,    -1,    33,    -1,    67,    68,    69,
      70,    71,    72,    73,    74,    75,    76,    77,    78,    47,
      -1,    -1,    -1,    51,    -1,    53,    54,    55,    56,    57,
      -1,    59,    60,    33,    -1,    -1,    -1,    -1,    -1,    67,
      68,    69,    70,    71,    72,    73,    74,    75,    76,    77,
      78,    51,    -1,    53,    54,    55,    56,    57,    -1,    59,
      60,    34,    -1,    -1,    -1,    -1,    -1,    67,    68,    69,
      70,    71,    72,    73,    74,    75,    76,    77,    78,    -1,
      53,    -1,     3,     4,     5,     6,    59,    60,    -1,    -1,
      -1,    -1,    13,    14,    67,    68,    69,    70,    71,    72,
      73,    74,    75,    76,    77,    78,    27,    -1,    -1,    -1,
      -1,    -1,    33,    34,    35,    36,    37,    -1,    39,     3,
       4,     5,     6,    -1,    45,    46,    -1,    -1,    -1,    13,
      14,    -1,    -1,    -1,     3,     4,     5,     6,    -1,     3,
       4,     5,     6,    27,    13,    14,    -1,    31,    -1,    13,
      14,    35,    36,    37,    -1,    39,    -1,    -1,    27,    -1,
      29,    45,    46,    27,    -1,    29,    35,    36,    37,    -1,
      39,    35,    36,    37,    -1,    39,    45,    46,    -1,    -1,
      -1,    45,    46,     3,     4,     5,     6,    -1,    -1,    -1,
      -1,    -1,    -1,    13,    14,    -1,    -1,    -1,    -1,     3,
       4,     5,     6,    -1,    -1,    -1,    -1,    27,    28,    13,
      14,    -1,    -1,    -1,    -1,    35,    36,    37,    -1,    39,
      -1,    -1,    -1,    27,    -1,    45,    46,    31,    -1,    -1,
      -1,    35,    36,    37,    -1,    39,     3,     4,     5,     6,
      -1,    45,    46,    -1,    -1,    -1,    13,    14,    -1,    -1,
      -1,     3,     4,     5,     6,    -1,     3,     4,     5,     6,
      27,    13,    14,    -1,    31,    -1,    13,    14,    35,    36,
      37,    -1,    39,    -1,    -1,    27,    28,    -1,    45,    46,
      27,    -1,    -1,    35,    36,    37,    -1,    39,    35,    36,
      37,    -1,    39,    45,    46,    -1,    -1,    -1,    45,    46,
       3,     4,     5,     6,    -1,     3,     4,     5,     6,    -1,
      13,    14,    -1,    -1,    -1,    13,    14,    -1,    -1,    -1,
      -1,    -1,    -1,    -1,    27,    -1,    -1,    -1,    -1,    27,
      -1,    -1,    35,    36,    37,    -1,    39,    35,    36,    37,
      -1,    39,    45,    46,    -1,    -1,    -1,    45,    46,    51,
      -1,    53,    54,    55,    56,    57,    -1,    59,    60,    61,
      -1,    -1,    -1,    -1,    -1,    67,    68,    69,    70,    71,
      72,    73,    74,    75,    76,    77,    78,    51,    -1,    53,
      54,    55,    56,    57,    -1,    59,    60,    -1,    -1,    -1,
      -1,    -1,    -1,    67,    68,    69,    70,    71,    72,    73,
      74,    75,    76,    77,    78,    53,    -1,    -1,    -1,    -1,
      -1,    59,    60,    -1,    -1,    -1,    -1,    -1,    -1,    67,
      68,    69,    70,    71,    72,    73,    74,    75,    76,    77,
      78
  };

  /* STOS_[STATE-NUM] -- The (internal number of the) accessing
     symbol of state STATE-NUM.  */
  private static final short
  yystos_[] =
  {
         0,     3,    27,    37,    51,    53,    54,    55,    56,    57,
      59,    60,    67,    68,    69,    70,    71,    72,    73,    74,
      75,    76,    77,    78,   107,   108,   111,   112,   113,   114,
     120,   123,   124,   125,   126,   146,   147,   148,   124,   123,
     126,   127,     3,    33,    29,   109,   110,   124,   108,   108,
       3,    33,   108,    33,   107,   108,   139,   140,    27,    30,
     125,     0,   147,    28,   123,   126,    33,     3,   121,   122,
      29,    32,    47,   139,   140,    33,   112,   115,   116,   117,
     123,     3,     4,     5,     6,    13,    14,    27,    29,    34,
      35,    36,    37,    39,    45,    46,    50,    52,    62,    63,
      64,    65,    66,    79,    81,    82,    83,    86,    87,    89,
      90,    91,    92,    93,    94,    95,    96,    97,    98,    99,
     100,   101,   102,   103,   105,   137,   138,   139,   140,   141,
     142,   143,   144,   145,   124,   107,   139,     3,    28,   108,
     128,   129,   130,   131,     3,    31,    89,   102,   106,   121,
      47,    32,    34,   110,    33,   103,   135,   139,   115,   117,
      34,   116,    49,   118,   119,   124,   117,    49,    27,    89,
      27,    89,    89,   105,   117,   132,    49,   106,    29,    27,
     137,     3,    29,    27,    27,    27,    29,   105,    13,    14,
      27,    30,    58,    84,    17,    18,    19,    20,    21,    22,
      23,    24,    25,    26,    47,   104,    91,    37,    38,    44,
      35,    36,     7,     8,     9,    10,    42,    43,    11,    12,
      39,    41,    40,    15,    16,    48,    29,    32,    34,   141,
      34,   137,    27,    30,   124,   126,   133,   134,    28,    32,
      28,    32,    31,    34,   106,   122,   135,   136,    34,   106,
      29,    32,    49,   137,   132,    28,    27,   126,   133,    28,
     137,    49,   105,    81,    29,   105,   105,   142,    29,    28,
      88,   103,   105,     3,     3,   103,    91,    91,    91,    92,
      92,    93,    93,    94,    94,    94,    94,    95,    95,    96,
      97,    98,    99,   100,   105,   103,    34,    28,   128,   133,
      31,   106,   134,    27,    30,    61,   130,     3,    32,    34,
     119,   106,    28,    91,   137,    28,    27,    28,    28,   142,
      28,    32,    31,    49,    28,    28,    31,    28,   128,    31,
     106,    34,   135,   137,   105,   137,   137,    28,   105,   103,
     102,    28,    31,    28,    80,   137,    28,    29,   137,   137
  };

  /* TOKEN_NUMBER_[YYLEX-NUM] -- Internal symbol number corresponding
     to YYLEX-NUM.  */
  private static final short
  yytoken_number_[] =
  {
         0,   256,   257,   258,   259,   260,   261,   262,   263,   264,
     265,   266,   267,   268,   269,   270,   271,   272,   273,   274,
     275,   276,   277,   278,   279,   280,   281,   282,   283,   284,
     285,   286,   287,   288,   289,   290,   291,   292,   293,   294,
     295,   296,   297,   298,   299,   300,   301,   302,   303,   304,
     305,   306,   307,   308,   309,   310,   311,   312,   313,   314,
     315,   316,   317,   318,   319,   320,   321,   322,   323,   324,
     325,   326,   327,   328,   329,   330,   331,   332,   333,   334,
     335,   336,   337,   338,    46
  };

  /* YYR1[YYN] -- Symbol number of symbol that rule YYN derives.  */
  private static final short
  yyr1_[] =
  {
         0,    85,    86,    86,    86,    86,    87,    87,    87,    87,
      87,    87,    87,    87,    88,    88,    89,    89,    89,    89,
      89,    89,    90,    90,    90,    90,    90,    90,    91,    91,
      92,    92,    92,    92,    93,    93,    93,    94,    94,    94,
      95,    95,    95,    95,    95,    96,    96,    96,    97,    97,
      98,    98,    99,    99,   100,   100,   101,   101,   102,   102,
     103,   103,   104,   104,   104,   104,   104,   104,   104,   104,
     104,   104,   104,   105,   105,   106,   107,   107,   108,   108,
     108,   108,   108,   108,   109,   109,   110,   110,   111,   111,
     111,   111,   111,   112,   112,   112,   112,   112,   112,   112,
     112,   112,   112,   112,   112,   113,   113,   113,   114,   114,
     115,   115,   116,   117,   117,   117,   117,   118,   118,   119,
     119,   119,   120,   120,   120,   121,   121,   122,   122,   123,
     123,   124,   124,   125,   125,   125,   125,   125,   125,   125,
     126,   126,   126,   126,   127,   127,   128,   128,   129,   129,
     130,   130,   130,   131,   131,   132,   132,   133,   133,   133,
     134,   134,   134,   134,   134,   134,   134,   134,   134,   135,
     135,   135,   136,   136,   137,   137,   137,   137,   137,   137,
     138,   138,   138,   139,   139,   139,   139,   140,   140,   141,
     141,   142,   142,   143,   143,   143,   144,   144,   144,   144,
     145,   145,   145,   145,   145,   146,   146,   147,   147,   148,
     148,   148,   148
  };

  /* YYR2[YYN] -- Number of symbols composing right hand side of rule YYN.  */
  private static final byte
  yyr2_[] =
  {
         0,     2,     1,     1,     1,     3,     1,     4,     3,     4,
       3,     3,     2,     2,     1,     3,     1,     2,     2,     2,
       2,     4,     1,     1,     1,     1,     1,     1,     1,     4,
       1,     3,     3,     3,     1,     3,     3,     1,     3,     3,
       1,     3,     3,     3,     3,     1,     3,     3,     1,     3,
       1,     3,     1,     3,     1,     3,     1,     3,     1,     5,
       1,     3,     1,     1,     1,     1,     1,     1,     1,     1,
       1,     1,     1,     1,     3,     1,     2,     3,     1,     2,
       1,     2,     1,     2,     1,     3,     1,     3,     1,     1,
       1,     1,     1,     1,     1,     1,     1,     1,     1,     1,
       1,     1,     1,     1,     1,     5,     4,     2,     1,     1,
       1,     2,     3,     2,     1,     2,     1,     1,     3,     1,
       2,     3,     4,     5,     2,     1,     3,     1,     3,     1,
       1,     2,     1,     1,     3,     4,     3,     4,     4,     3,
       1,     2,     2,     3,     1,     2,     1,     3,     1,     3,
       2,     2,     1,     1,     3,     1,     2,     1,     1,     2,
       3,     2,     3,     3,     4,     2,     3,     3,     4,     1,
       3,     4,     1,     3,     1,     1,     1,     1,     1,     1,
       3,     4,     3,     2,     3,     3,     4,     1,     2,     1,
       2,     1,     2,     5,     7,     5,     5,     7,     6,     7,
       3,     2,     2,     2,     3,     1,     2,     1,     1,     4,
       3,     3,     2
  };

  /* YYTNAME[SYMBOL-NUM] -- String name of the symbol SYMBOL-NUM.
     First, the terminals, then, starting at \a yyntokens_, nonterminals.  */
  private static final String yytname_[] =
  {
    "$end", "error", "$undefined", "IDENTIFIER", "CONSTANT",
  "STRING_LITERAL", "SIZEOF", "LEFT_OP", "RIGHT_OP", "LE_OP", "GE_OP",
  "EQ_OP", "NE_OP", "INC_OP", "DEC_OP", "AND_OP", "OR_OP", "MUL_ASSIGN",
  "DIV_ASSIGN", "MOD_ASSIGN", "ADD_ASSIGN", "SUB_ASSIGN", "LEFT_ASSIGN",
  "RIGHT_ASSIGN", "AND_ASSIGN", "XOR_ASSIGN", "OR_ASSIGN",
  "LEFT_PARENTHESIS", "RIGHT_PARENTHESIS", "SEMI_COLON",
  "LEFT_SQUAREBRACKET", "RIGHT_SQUAREBRACKET", "COMMA", "LEFT_CURLYBRACE",
  "RIGHT_CURLYBRACE", "PLUS_OPERATOR", "MINUS_OPERATOR", "MUL_OPERATOR",
  "DIV_OPERATOR", "AND_OPERATOR", "OR_OPERATOR", "XOR_OPERATOR",
  "GREATER_THAN", "LESS_THAN", "MOD_OPERATOR", "NEGATION", "NOT_OPERATOR",
  "EQUAL_TO", "CONDITIONAL_OP1", "CONDITIONAL_OP2", "DEFAULT", "AUTO",
  "CASE", "TYPE_NAME", "STATIC", "EXTERN", "REGISTER", "TYPEDEF", "PTR_OP",
  "ENUM", "UNION", "ELLIPSIS", "CONTINUE", "SWITCH", "DO", "GOTO", "BREAK",
  "STRUCT", "CHAR", "SHORT", "INT", "LONG", "SIGNED", "UNSIGNED", "FLOAT",
  "DOUBLE", "CONST", "VOLATILE", "VOID", "IF", "ELSE", "WHILE", "FOR",
  "RETURN", "'.'", "$accept", "primary_expression", "postfix_expression",
  "argument_expression_list", "unary_expression", "unary_operator",
  "cast_expression", "multiplicative_expression", "additive_expression",
  "shift_expression", "relational_expression", "equality_expression",
  "and_expression", "exclusive_or_expression", "inclusive_or_expression",
  "logical_and_expression", "logical_or_expression",
  "conditional_expression", "assignment_expression", "assignment_operator",
  "expression", "constant_expression", "declaration",
  "declaration_specifiers", "init_declarator_list", "init_declarator",
  "storage_class_specifier", "type_specifier", "struct_or_union_specifier",
  "struct_or_union", "struct_declaration_list", "struct_declaration",
  "specifier_qualifier_list", "struct_declarator_list",
  "struct_declarator", "enum_specifier", "enumerator_list", "enumerator",
  "type_qualifier", "declarator", "direct_declarator", "pointer",
  "type_qualifier_list", "parameter_type_list", "parameter_list",
  "parameter_declaration", "identifier_list", "type_name",
  "abstract_declarator", "direct_abstract_declarator", "initializer",
  "initializer_list", "statement", "labeled_statement",
  "compound_statement", "declaration_list", "statement_list",
  "expression_statement", "selection_statement", "iteration_statement",
  "jump_statement", "translation_unit", "external_declaration",
  "function_definition", null
  };

  /* YYRHS -- A `-1'-separated list of the rules' RHS.  */
  private static final short yyrhs_[] =
  {
       146,     0,    -1,     3,    -1,     4,    -1,     5,    -1,    27,
     105,    28,    -1,    86,    -1,    87,    30,   105,    31,    -1,
      87,    27,    28,    -1,    87,    27,    88,    28,    -1,    87,
      84,     3,    -1,    87,    58,     3,    -1,    87,    13,    -1,
      87,    14,    -1,   103,    -1,    88,    32,   103,    -1,    87,
      -1,    13,    89,    -1,    14,    89,    -1,    90,    91,    -1,
       6,    89,    -1,     6,    27,   132,    28,    -1,    39,    -1,
      37,    -1,    35,    -1,    36,    -1,    45,    -1,    46,    -1,
      89,    -1,    27,   132,    28,    91,    -1,    91,    -1,    92,
      37,    91,    -1,    92,    38,    91,    -1,    92,    44,    91,
      -1,    92,    -1,    93,    35,    92,    -1,    93,    36,    92,
      -1,    93,    -1,    94,     7,    93,    -1,    94,     8,    93,
      -1,    94,    -1,    95,    43,    94,    -1,    95,    42,    94,
      -1,    95,     9,    94,    -1,    95,    10,    94,    -1,    95,
      -1,    96,    11,    95,    -1,    96,    12,    95,    -1,    96,
      -1,    97,    39,    96,    -1,    97,    -1,    98,    41,    97,
      -1,    98,    -1,    99,    40,    98,    -1,    99,    -1,   100,
      15,    99,    -1,   100,    -1,   101,    16,   100,    -1,   101,
      -1,   101,    48,   105,    49,   102,    -1,   102,    -1,    89,
     104,   103,    -1,    47,    -1,    17,    -1,    18,    -1,    19,
      -1,    20,    -1,    21,    -1,    22,    -1,    23,    -1,    24,
      -1,    25,    -1,    26,    -1,   103,    -1,   105,    32,   103,
      -1,   102,    -1,   108,    29,    -1,   108,   109,    29,    -1,
     111,    -1,   111,   108,    -1,   112,    -1,   112,   108,    -1,
     123,    -1,   123,   108,    -1,   110,    -1,   109,    32,   110,
      -1,   124,    -1,   124,    47,   135,    -1,    57,    -1,    55,
      -1,    54,    -1,    51,    -1,    56,    -1,    78,    -1,    68,
      -1,    69,    -1,    70,    -1,    71,    -1,    74,    -1,    75,
      -1,    72,    -1,    73,    -1,   113,    -1,   120,    -1,    53,
      -1,   114,     3,    33,   115,    34,    -1,   114,    33,   115,
      34,    -1,   114,     3,    -1,    67,    -1,    60,    -1,   116,
      -1,   115,   116,    -1,   117,   118,    29,    -1,   112,   117,
      -1,   112,    -1,   123,   117,    -1,   123,    -1,   119,    -1,
     118,    32,   119,    -1,   124,    -1,    49,   106,    -1,   124,
      49,   106,    -1,    59,    33,   121,    34,    -1,    59,     3,
      33,   121,    34,    -1,    59,     3,    -1,   122,    -1,   121,
      32,   122,    -1,     3,    -1,     3,    47,   106,    -1,    76,
      -1,    77,    -1,   126,   125,    -1,   125,    -1,     3,    -1,
      27,   124,    28,    -1,   125,    30,   106,    31,    -1,   125,
      30,    31,    -1,   125,    27,   128,    28,    -1,   125,    27,
     131,    28,    -1,   125,    27,    28,    -1,    37,    -1,    37,
     127,    -1,    37,   126,    -1,    37,   127,   126,    -1,   123,
      -1,   127,   123,    -1,   129,    -1,   129,    32,    61,    -1,
     130,    -1,   129,    32,   130,    -1,   108,   124,    -1,   108,
     133,    -1,   108,    -1,     3,    -1,   131,    32,     3,    -1,
     117,    -1,   117,   133,    -1,   126,    -1,   134,    -1,   126,
     134,    -1,    27,   133,    28,    -1,    30,    31,    -1,    30,
     106,    31,    -1,   134,    30,    31,    -1,   134,    30,   106,
      31,    -1,    27,    28,    -1,    27,   128,    28,    -1,   134,
      27,    28,    -1,   134,    27,   128,    28,    -1,   103,    -1,
      33,   136,    34,    -1,    33,   136,    32,    34,    -1,   135,
      -1,   136,    32,   135,    -1,   138,    -1,   139,    -1,   142,
      -1,   143,    -1,   144,    -1,   145,    -1,     3,    49,   137,
      -1,    52,   106,    49,   137,    -1,    50,    49,   137,    -1,
      33,    34,    -1,    33,   141,    34,    -1,    33,   140,    34,
      -1,    33,   140,   141,    34,    -1,   107,    -1,   140,   107,
      -1,   137,    -1,   141,   137,    -1,    29,    -1,   105,    29,
      -1,    79,    27,   105,    28,   137,    -1,    79,    27,   105,
      28,   137,    80,   137,    -1,    63,    27,   105,    28,   137,
      -1,    81,    27,   105,    28,   137,    -1,    64,   137,    81,
      27,   105,    28,    29,    -1,    82,    27,   142,   142,    28,
     137,    -1,    82,    27,   142,   142,   105,    28,   137,    -1,
      65,     3,    29,    -1,    62,    29,    -1,    66,    29,    -1,
      83,    29,    -1,    83,   105,    29,    -1,   147,    -1,   146,
     147,    -1,   148,    -1,   107,    -1,   108,   124,   140,   139,
      -1,   108,   124,   139,    -1,   124,   140,   139,    -1,   124,
     139,    -1
  };

  /* YYPRHS[YYN] -- Index of the first RHS symbol of rule number YYN in
     YYRHS.  */
  private static final short yyprhs_[] =
  {
         0,     0,     3,     5,     7,     9,    13,    15,    20,    24,
      29,    33,    37,    40,    43,    45,    49,    51,    54,    57,
      60,    63,    68,    70,    72,    74,    76,    78,    80,    82,
      87,    89,    93,    97,   101,   103,   107,   111,   113,   117,
     121,   123,   127,   131,   135,   139,   141,   145,   149,   151,
     155,   157,   161,   163,   167,   169,   173,   175,   179,   181,
     187,   189,   193,   195,   197,   199,   201,   203,   205,   207,
     209,   211,   213,   215,   217,   221,   223,   226,   230,   232,
     235,   237,   240,   242,   245,   247,   251,   253,   257,   259,
     261,   263,   265,   267,   269,   271,   273,   275,   277,   279,
     281,   283,   285,   287,   289,   291,   297,   302,   305,   307,
     309,   311,   314,   318,   321,   323,   326,   328,   330,   334,
     336,   339,   343,   348,   354,   357,   359,   363,   365,   369,
     371,   373,   376,   378,   380,   384,   389,   393,   398,   403,
     407,   409,   412,   415,   419,   421,   424,   426,   430,   432,
     436,   439,   442,   444,   446,   450,   452,   455,   457,   459,
     462,   466,   469,   473,   477,   482,   485,   489,   493,   498,
     500,   504,   509,   511,   515,   517,   519,   521,   523,   525,
     527,   531,   536,   540,   543,   547,   551,   556,   558,   561,
     563,   566,   568,   571,   577,   585,   591,   597,   605,   612,
     620,   624,   627,   630,   633,   637,   639,   642,   644,   646,
     651,   655,   659
  };

  /* YYRLINE[YYN] -- Source line where rule number YYN was defined.  */
  private static final short yyrline_[] =
  {
         0,   130,   130,   131,   133,   136,   142,   145,   148,   151,
     156,   159,   162,   183,   207,   210,   242,   245,   266,   287,
     308,   329,   353,   354,   355,   356,   357,   358,   362,   366,
     374,   378,   440,   502,   567,   571,   634,   699,   703,   765,
     830,   834,   896,   958,  1020,  1085,  1089,  1090,  1094,  1096,
    1161,  1163,  1228,  1230,  1295,  1297,  1362,  1364,  1429,  1431,
    1435,  1437,  1502,  1503,  1504,  1505,  1506,  1507,  1508,  1509,
    1510,  1511,  1512,  1516,  1520,  1526,  1533,  1537,  1544,  1548,
    1552,  1554,  1558,  1562,  1569,  1573,  1579,  1583,  1587,  1588,
    1589,  1590,  1591,  1595,  1596,  1597,  1598,  1599,  1600,  1601,
    1602,  1603,  1604,  1606,  1608,  1612,  1613,  1614,  1618,  1619,
    1623,  1625,  1629,  1633,  1634,  1635,  1636,  1640,  1641,  1645,
    1646,  1647,  1651,  1652,  1653,  1657,  1658,  1662,  1663,  1667,
    1668,  1672,  1673,  1678,  1679,  1681,  1682,  1683,  1684,  1685,
    1689,  1690,  1691,  1692,  1696,  1697,  1702,  1703,  1707,  1708,
    1712,  1713,  1714,  1718,  1719,  1723,  1724,  1728,  1729,  1730,
    1734,  1735,  1736,  1737,  1738,  1739,  1740,  1741,  1742,  1746,
    1747,  1748,  1752,  1753,  1757,  1758,  1759,  1761,  1762,  1763,
    1767,  1768,  1769,  1773,  1774,  1776,  1777,  1782,  1784,  1789,
    1791,  1796,  1797,  1802,  1810,  1823,  1827,  1840,  1849,  1870,
    1895,  1896,  1897,  1898,  1899,  1903,  1904,  1909,  1912,  1917,
    1919,  1921,  1923
  };

  // Report on the debug stream that the rule yyrule is going to be reduced.
  private void yy_reduce_print (int yyrule, YYStack yystack)
  {
    if (yydebug == 0)
      return;

    int yylno = yyrline_[yyrule];
    int yynrhs = yyr2_[yyrule];
    /* Print the symbols being reduced, and their result.  */
    yycdebug ("Reducing stack by rule " + (yyrule - 1)
	      + " (line " + yylno + "), ");

    /* The symbols being reduced.  */
    for (int yyi = 0; yyi < yynrhs; yyi++)
      yy_symbol_print ("   $" + (yyi + 1) + " =",
		       yyrhs_[yyprhs_[yyrule] + yyi],
		       ((yystack.valueAt (yynrhs-(yyi + 1)))));
  }

  /* YYTRANSLATE(YYLEX) -- Bison symbol number corresponding to YYLEX.  */
  private static final byte yytranslate_table_[] =
  {
         0,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,    84,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     1,     2,     3,     4,
       5,     6,     7,     8,     9,    10,    11,    12,    13,    14,
      15,    16,    17,    18,    19,    20,    21,    22,    23,    24,
      25,    26,    27,    28,    29,    30,    31,    32,    33,    34,
      35,    36,    37,    38,    39,    40,    41,    42,    43,    44,
      45,    46,    47,    48,    49,    50,    51,    52,    53,    54,
      55,    56,    57,    58,    59,    60,    61,    62,    63,    64,
      65,    66,    67,    68,    69,    70,    71,    72,    73,    74,
      75,    76,    77,    78,    79,    80,    81,    82,    83
  };

  private static final byte yytranslate_ (int t)
  {
    if (t >= 0 && t <= yyuser_token_number_max_)
      return yytranslate_table_[t];
    else
      return yyundef_token_;
  }

  private static final int yylast_ = 1370;
  private static final int yynnts_ = 64;
  private static final int yyempty_ = -2;
  private static final int yyfinal_ = 61;
  private static final int yyterror_ = 1;
  private static final int yyerrcode_ = 256;
  private static final int yyntokens_ = 85;

  private static final int yyuser_token_number_max_ = 338;
  private static final int yyundef_token_ = 2;

/* User implementation code.  */

}


/* Line 879 of lalr1.java  */
/* Line 1926 of "Ccompiler.y"  */

