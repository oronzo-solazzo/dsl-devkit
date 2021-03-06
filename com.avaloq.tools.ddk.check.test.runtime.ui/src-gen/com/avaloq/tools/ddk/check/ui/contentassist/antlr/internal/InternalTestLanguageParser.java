package com.avaloq.tools.ddk.check.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import com.avaloq.tools.ddk.check.services.TestLanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTestLanguageParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Hello'", "'!'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_INT=5;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalTestLanguageParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalTestLanguageParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalTestLanguageParser.tokenNames; }
    public String getGrammarFileName() { return "../com.avaloq.tools.ddk.check.test.runtime.ui/src-gen/com/avaloq/tools/ddk/check/ui/contentassist/antlr/internal/InternalTestLanguage.g"; }


     
     	private TestLanguageGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(TestLanguageGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleModel"
    // ../com.avaloq.tools.ddk.check.test.runtime.ui/src-gen/com/avaloq/tools/ddk/check/ui/contentassist/antlr/internal/InternalTestLanguage.g:60:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../com.avaloq.tools.ddk.check.test.runtime.ui/src-gen/com/avaloq/tools/ddk/check/ui/contentassist/antlr/internal/InternalTestLanguage.g:61:1: ( ruleModel EOF )
            // ../com.avaloq.tools.ddk.check.test.runtime.ui/src-gen/com/avaloq/tools/ddk/check/ui/contentassist/antlr/internal/InternalTestLanguage.g:62:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel61);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../com.avaloq.tools.ddk.check.test.runtime.ui/src-gen/com/avaloq/tools/ddk/check/ui/contentassist/antlr/internal/InternalTestLanguage.g:69:1: ruleModel : ( ( rule__Model__GreetingsAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.avaloq.tools.ddk.check.test.runtime.ui/src-gen/com/avaloq/tools/ddk/check/ui/contentassist/antlr/internal/InternalTestLanguage.g:73:2: ( ( ( rule__Model__GreetingsAssignment )* ) )
            // ../com.avaloq.tools.ddk.check.test.runtime.ui/src-gen/com/avaloq/tools/ddk/check/ui/contentassist/antlr/internal/InternalTestLanguage.g:74:1: ( ( rule__Model__GreetingsAssignment )* )
            {
            // ../com.avaloq.tools.ddk.check.test.runtime.ui/src-gen/com/avaloq/tools/ddk/check/ui/contentassist/antlr/internal/InternalTestLanguage.g:74:1: ( ( rule__Model__GreetingsAssignment )* )
            // ../com.avaloq.tools.ddk.check.test.runtime.ui/src-gen/com/avaloq/tools/ddk/check/ui/contentassist/antlr/internal/InternalTestLanguage.g:75:1: ( rule__Model__GreetingsAssignment )*
            {
             before(grammarAccess.getModelAccess().getGreetingsAssignment()); 
            // ../com.avaloq.tools.ddk.check.test.runtime.ui/src-gen/com/avaloq/tools/ddk/check/ui/contentassist/antlr/internal/InternalTestLanguage.g:76:1: ( rule__Model__GreetingsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../com.avaloq.tools.ddk.check.test.runtime.ui/src-gen/com/avaloq/tools/ddk/check/ui/contentassist/antlr/internal/InternalTestLanguage.g:76:2: rule__Model__GreetingsAssignment
            	    {
            	    pushFollow(FOLLOW_rule__Model__GreetingsAssignment_in_ruleModel94);
            	    rule__Model__GreetingsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getGreetingsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleGreeting"
    // ../com.avaloq.tools.ddk.check.test.runtime.ui/src-gen/com/avaloq/tools/ddk/check/ui/contentassist/antlr/internal/InternalTestLanguage.g:88:1: entryRuleGreeting : ruleGreeting EOF ;
    public final void entryRuleGreeting() throws RecognitionException {
        try {
            // ../com.avaloq.tools.ddk.check.test.runtime.ui/src-gen/com/avaloq/tools/ddk/check/ui/contentassist/antlr/internal/InternalTestLanguage.g:89:1: ( ruleGreeting EOF )
            // ../com.avaloq.tools.ddk.check.test.runtime.ui/src-gen/com/avaloq/tools/ddk/check/ui/contentassist/antlr/internal/InternalTestLanguage.g:90:1: ruleGreeting EOF
            {
             before(grammarAccess.getGreetingRule()); 
            pushFollow(FOLLOW_ruleGreeting_in_entryRuleGreeting122);
            ruleGreeting();

            state._fsp--;

             after(grammarAccess.getGreetingRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGreeting129); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGreeting"


    // $ANTLR start "ruleGreeting"
    // ../com.avaloq.tools.ddk.check.test.runtime.ui/src-gen/com/avaloq/tools/ddk/check/ui/contentassist/antlr/internal/InternalTestLanguage.g:97:1: ruleGreeting : ( ( rule__Greeting__Group__0 ) ) ;
    public final void ruleGreeting() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.avaloq.tools.ddk.check.test.runtime.ui/src-gen/com/avaloq/tools/ddk/check/ui/contentassist/antlr/internal/InternalTestLanguage.g:101:2: ( ( ( rule__Greeting__Group__0 ) ) )
            // ../com.avaloq.tools.ddk.check.test.runtime.ui/src-gen/com/avaloq/tools/ddk/check/ui/contentassist/antlr/internal/InternalTestLanguage.g:102:1: ( ( rule__Greeting__Group__0 ) )
            {
            // ../com.avaloq.tools.ddk.check.test.runtime.ui/src-gen/com/avaloq/tools/ddk/check/ui/contentassist/antlr/internal/InternalTestLanguage.g:102:1: ( ( rule__Greeting__Group__0 ) )
            // ../com.avaloq.tools.ddk.check.test.runtime.ui/src-gen/com/avaloq/tools/ddk/check/ui/contentassist/antlr/internal/InternalTestLanguage.g:103:1: ( rule__Greeting__Group__0 )
            {
             before(grammarAccess.getGreetingAccess().getGroup()); 
            // ../com.avaloq.tools.ddk.check.test.runtime.ui/src-gen/com/avaloq/tools/ddk/check/ui/contentassist/antlr/internal/InternalTestLanguage.g:104:1: ( rule__Greeting__Group__0 )
            // ../com.avaloq.tools.ddk.check.test.runtime.ui/src-gen/com/avaloq/tools/ddk/check/ui/contentassist/antlr/internal/InternalTestLanguage.g:104:2: rule__Greeting__Group__0
            {
            pushFollow(FOLLOW_rule__Greeting__Group__0_in_ruleGreeting155);
            rule__Greeting__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGreetingAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGreeting"


    // $ANTLR start "rule__Greeting__Group__0"
    // ../com.avaloq.tools.ddk.check.test.runtime.ui/src-gen/com/avaloq/tools/ddk/check/ui/contentassist/antlr/internal/InternalTestLanguage.g:118:1: rule__Greeting__Group__0 : rule__Greeting__Group__0__Impl rule__Greeting__Group__1 ;
    public final void rule__Greeting__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.avaloq.tools.ddk.check.test.runtime.ui/src-gen/com/avaloq/tools/ddk/check/ui/contentassist/antlr/internal/InternalTestLanguage.g:122:1: ( rule__Greeting__Group__0__Impl rule__Greeting__Group__1 )
            // ../com.avaloq.tools.ddk.check.test.runtime.ui/src-gen/com/avaloq/tools/ddk/check/ui/contentassist/antlr/internal/InternalTestLanguage.g:123:2: rule__Greeting__Group__0__Impl rule__Greeting__Group__1
            {
            pushFollow(FOLLOW_rule__Greeting__Group__0__Impl_in_rule__Greeting__Group__0189);
            rule__Greeting__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Greeting__Group__1_in_rule__Greeting__Group__0192);
            rule__Greeting__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Greeting__Group__0"


    // $ANTLR start "rule__Greeting__Group__0__Impl"
    // ../com.avaloq.tools.ddk.check.test.runtime.ui/src-gen/com/avaloq/tools/ddk/check/ui/contentassist/antlr/internal/InternalTestLanguage.g:130:1: rule__Greeting__Group__0__Impl : ( 'Hello' ) ;
    public final void rule__Greeting__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.avaloq.tools.ddk.check.test.runtime.ui/src-gen/com/avaloq/tools/ddk/check/ui/contentassist/antlr/internal/InternalTestLanguage.g:134:1: ( ( 'Hello' ) )
            // ../com.avaloq.tools.ddk.check.test.runtime.ui/src-gen/com/avaloq/tools/ddk/check/ui/contentassist/antlr/internal/InternalTestLanguage.g:135:1: ( 'Hello' )
            {
            // ../com.avaloq.tools.ddk.check.test.runtime.ui/src-gen/com/avaloq/tools/ddk/check/ui/contentassist/antlr/internal/InternalTestLanguage.g:135:1: ( 'Hello' )
            // ../com.avaloq.tools.ddk.check.test.runtime.ui/src-gen/com/avaloq/tools/ddk/check/ui/contentassist/antlr/internal/InternalTestLanguage.g:136:1: 'Hello'
            {
             before(grammarAccess.getGreetingAccess().getHelloKeyword_0()); 
            match(input,11,FOLLOW_11_in_rule__Greeting__Group__0__Impl220); 
             after(grammarAccess.getGreetingAccess().getHelloKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Greeting__Group__0__Impl"


    // $ANTLR start "rule__Greeting__Group__1"
    // ../com.avaloq.tools.ddk.check.test.runtime.ui/src-gen/com/avaloq/tools/ddk/check/ui/contentassist/antlr/internal/InternalTestLanguage.g:149:1: rule__Greeting__Group__1 : rule__Greeting__Group__1__Impl rule__Greeting__Group__2 ;
    public final void rule__Greeting__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.avaloq.tools.ddk.check.test.runtime.ui/src-gen/com/avaloq/tools/ddk/check/ui/contentassist/antlr/internal/InternalTestLanguage.g:153:1: ( rule__Greeting__Group__1__Impl rule__Greeting__Group__2 )
            // ../com.avaloq.tools.ddk.check.test.runtime.ui/src-gen/com/avaloq/tools/ddk/check/ui/contentassist/antlr/internal/InternalTestLanguage.g:154:2: rule__Greeting__Group__1__Impl rule__Greeting__Group__2
            {
            pushFollow(FOLLOW_rule__Greeting__Group__1__Impl_in_rule__Greeting__Group__1251);
            rule__Greeting__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Greeting__Group__2_in_rule__Greeting__Group__1254);
            rule__Greeting__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Greeting__Group__1"


    // $ANTLR start "rule__Greeting__Group__1__Impl"
    // ../com.avaloq.tools.ddk.check.test.runtime.ui/src-gen/com/avaloq/tools/ddk/check/ui/contentassist/antlr/internal/InternalTestLanguage.g:161:1: rule__Greeting__Group__1__Impl : ( ( rule__Greeting__NameAssignment_1 ) ) ;
    public final void rule__Greeting__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.avaloq.tools.ddk.check.test.runtime.ui/src-gen/com/avaloq/tools/ddk/check/ui/contentassist/antlr/internal/InternalTestLanguage.g:165:1: ( ( ( rule__Greeting__NameAssignment_1 ) ) )
            // ../com.avaloq.tools.ddk.check.test.runtime.ui/src-gen/com/avaloq/tools/ddk/check/ui/contentassist/antlr/internal/InternalTestLanguage.g:166:1: ( ( rule__Greeting__NameAssignment_1 ) )
            {
            // ../com.avaloq.tools.ddk.check.test.runtime.ui/src-gen/com/avaloq/tools/ddk/check/ui/contentassist/antlr/internal/InternalTestLanguage.g:166:1: ( ( rule__Greeting__NameAssignment_1 ) )
            // ../com.avaloq.tools.ddk.check.test.runtime.ui/src-gen/com/avaloq/tools/ddk/check/ui/contentassist/antlr/internal/InternalTestLanguage.g:167:1: ( rule__Greeting__NameAssignment_1 )
            {
             before(grammarAccess.getGreetingAccess().getNameAssignment_1()); 
            // ../com.avaloq.tools.ddk.check.test.runtime.ui/src-gen/com/avaloq/tools/ddk/check/ui/contentassist/antlr/internal/InternalTestLanguage.g:168:1: ( rule__Greeting__NameAssignment_1 )
            // ../com.avaloq.tools.ddk.check.test.runtime.ui/src-gen/com/avaloq/tools/ddk/check/ui/contentassist/antlr/internal/InternalTestLanguage.g:168:2: rule__Greeting__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Greeting__NameAssignment_1_in_rule__Greeting__Group__1__Impl281);
            rule__Greeting__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getGreetingAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Greeting__Group__1__Impl"


    // $ANTLR start "rule__Greeting__Group__2"
    // ../com.avaloq.tools.ddk.check.test.runtime.ui/src-gen/com/avaloq/tools/ddk/check/ui/contentassist/antlr/internal/InternalTestLanguage.g:178:1: rule__Greeting__Group__2 : rule__Greeting__Group__2__Impl ;
    public final void rule__Greeting__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.avaloq.tools.ddk.check.test.runtime.ui/src-gen/com/avaloq/tools/ddk/check/ui/contentassist/antlr/internal/InternalTestLanguage.g:182:1: ( rule__Greeting__Group__2__Impl )
            // ../com.avaloq.tools.ddk.check.test.runtime.ui/src-gen/com/avaloq/tools/ddk/check/ui/contentassist/antlr/internal/InternalTestLanguage.g:183:2: rule__Greeting__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Greeting__Group__2__Impl_in_rule__Greeting__Group__2311);
            rule__Greeting__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Greeting__Group__2"


    // $ANTLR start "rule__Greeting__Group__2__Impl"
    // ../com.avaloq.tools.ddk.check.test.runtime.ui/src-gen/com/avaloq/tools/ddk/check/ui/contentassist/antlr/internal/InternalTestLanguage.g:189:1: rule__Greeting__Group__2__Impl : ( '!' ) ;
    public final void rule__Greeting__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.avaloq.tools.ddk.check.test.runtime.ui/src-gen/com/avaloq/tools/ddk/check/ui/contentassist/antlr/internal/InternalTestLanguage.g:193:1: ( ( '!' ) )
            // ../com.avaloq.tools.ddk.check.test.runtime.ui/src-gen/com/avaloq/tools/ddk/check/ui/contentassist/antlr/internal/InternalTestLanguage.g:194:1: ( '!' )
            {
            // ../com.avaloq.tools.ddk.check.test.runtime.ui/src-gen/com/avaloq/tools/ddk/check/ui/contentassist/antlr/internal/InternalTestLanguage.g:194:1: ( '!' )
            // ../com.avaloq.tools.ddk.check.test.runtime.ui/src-gen/com/avaloq/tools/ddk/check/ui/contentassist/antlr/internal/InternalTestLanguage.g:195:1: '!'
            {
             before(grammarAccess.getGreetingAccess().getExclamationMarkKeyword_2()); 
            match(input,12,FOLLOW_12_in_rule__Greeting__Group__2__Impl339); 
             after(grammarAccess.getGreetingAccess().getExclamationMarkKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Greeting__Group__2__Impl"


    // $ANTLR start "rule__Model__GreetingsAssignment"
    // ../com.avaloq.tools.ddk.check.test.runtime.ui/src-gen/com/avaloq/tools/ddk/check/ui/contentassist/antlr/internal/InternalTestLanguage.g:215:1: rule__Model__GreetingsAssignment : ( ruleGreeting ) ;
    public final void rule__Model__GreetingsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.avaloq.tools.ddk.check.test.runtime.ui/src-gen/com/avaloq/tools/ddk/check/ui/contentassist/antlr/internal/InternalTestLanguage.g:219:1: ( ( ruleGreeting ) )
            // ../com.avaloq.tools.ddk.check.test.runtime.ui/src-gen/com/avaloq/tools/ddk/check/ui/contentassist/antlr/internal/InternalTestLanguage.g:220:1: ( ruleGreeting )
            {
            // ../com.avaloq.tools.ddk.check.test.runtime.ui/src-gen/com/avaloq/tools/ddk/check/ui/contentassist/antlr/internal/InternalTestLanguage.g:220:1: ( ruleGreeting )
            // ../com.avaloq.tools.ddk.check.test.runtime.ui/src-gen/com/avaloq/tools/ddk/check/ui/contentassist/antlr/internal/InternalTestLanguage.g:221:1: ruleGreeting
            {
             before(grammarAccess.getModelAccess().getGreetingsGreetingParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleGreeting_in_rule__Model__GreetingsAssignment381);
            ruleGreeting();

            state._fsp--;

             after(grammarAccess.getModelAccess().getGreetingsGreetingParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__GreetingsAssignment"


    // $ANTLR start "rule__Greeting__NameAssignment_1"
    // ../com.avaloq.tools.ddk.check.test.runtime.ui/src-gen/com/avaloq/tools/ddk/check/ui/contentassist/antlr/internal/InternalTestLanguage.g:230:1: rule__Greeting__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Greeting__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.avaloq.tools.ddk.check.test.runtime.ui/src-gen/com/avaloq/tools/ddk/check/ui/contentassist/antlr/internal/InternalTestLanguage.g:234:1: ( ( RULE_ID ) )
            // ../com.avaloq.tools.ddk.check.test.runtime.ui/src-gen/com/avaloq/tools/ddk/check/ui/contentassist/antlr/internal/InternalTestLanguage.g:235:1: ( RULE_ID )
            {
            // ../com.avaloq.tools.ddk.check.test.runtime.ui/src-gen/com/avaloq/tools/ddk/check/ui/contentassist/antlr/internal/InternalTestLanguage.g:235:1: ( RULE_ID )
            // ../com.avaloq.tools.ddk.check.test.runtime.ui/src-gen/com/avaloq/tools/ddk/check/ui/contentassist/antlr/internal/InternalTestLanguage.g:236:1: RULE_ID
            {
             before(grammarAccess.getGreetingAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Greeting__NameAssignment_1412); 
             after(grammarAccess.getGreetingAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Greeting__NameAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__GreetingsAssignment_in_ruleModel94 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_ruleGreeting_in_entryRuleGreeting122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGreeting129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Greeting__Group__0_in_ruleGreeting155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Greeting__Group__0__Impl_in_rule__Greeting__Group__0189 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Greeting__Group__1_in_rule__Greeting__Group__0192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Greeting__Group__0__Impl220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Greeting__Group__1__Impl_in_rule__Greeting__Group__1251 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Greeting__Group__2_in_rule__Greeting__Group__1254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Greeting__NameAssignment_1_in_rule__Greeting__Group__1__Impl281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Greeting__Group__2__Impl_in_rule__Greeting__Group__2311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Greeting__Group__2__Impl339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGreeting_in_rule__Model__GreetingsAssignment381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Greeting__NameAssignment_1412 = new BitSet(new long[]{0x0000000000000002L});

}