package LVCoref;

import java.util.logging.Level;
import java.util.logging.Logger;

import LVCoref.util.Log;

public class Constants {
	private static final Logger log = Logger.getLogger( Log.class.getName() );
	//static { log.setLevel(Level.OFF); }
	
    /** if false, use mention prediction */
    public static final boolean USE_GOLD_MENTIONS = false;
    
    public static final boolean PRINT_DECISIONS = false;
    
    public static final boolean LOGGER_FILE = false;
    public static final String LOGGER_FILE_PATH = "data/logs/";
    public static final Level LOGGER_FILE_LEVEL = Level.FINE;
    public static final Level LOGGER_ERR_LEVEL = Level.INFO;
    public static final Level LOGGER_LEVEL = Level.WARNING;
    
    public static final int SENTENCE_WINDOW = 30;
    
    public static final boolean USE_SINTAX = true;
    
    public static final boolean EXTRA_CONLL_COLUMNS = false;
    
    public static final boolean MULTIPLE_DOCS_EVAL = false;
    
    public static final boolean VERBOSE = false;
    public static final boolean DEBUG = false; // extra output (pretty json, ..)

    /** if true, use given mention boundaries */
    public static final boolean USE_GOLD_MENTION_BOUNDARIES = false;

    /** if true, remove singletons in post processing */
    public static final boolean REMOVE_SINGLETONS = false;

    /** if true, read *auto_conll, if false, read *gold_conll */
    public static final boolean USE_CONLL_AUTO = true;

    public static final int savedColumnCount = 7;

    /** Default path for conll scorer script */
    public static final String conllMentionEvalScript = "/scr/nlp/data/conll-2011/scorer/v4/scorer.pl";

    /** Default sieve passes */
    public static final String SIEVEPASSES = "MarkRole, DiscourseMatch, ExactStringMatch, RelaxedExactStringMatch, PreciseConstructs, StrictHeadMatch1, StrictHeadMatch2, StrictHeadMatch3, StrictHeadMatch4, RelaxedHeadMatch, PronounMatch";

    /** Share attributes between coreferent mentions **/
    public static final boolean SHARE_ATTRIBUTES = true;

    public static final String SIEVES_PROP = "lvcoref.sievePasses";
    public static final String SCORE_PROP = "lvcoref.score";
    public static final String LOG_PATH_PROP = "lvcoref.logFile";
    public static final String LOG_PROP = "lvcoref.log";
    public static final String MAXDIST_PROP = "lvcoref.maxdist";
    
    public static final String INPUT_PROP = "lvcoref.input";
    public static final String OUTPUT_PROP = "lvcoref.output";
    public static final String MMAX_EXPORT_PROP = "lvcoref.mmax.export";
    public static final String MMAX_EXPORT_PATH_PROP = "lvcoref.mmax.export.path";
    public static final String MMAX_EXPORT_NAME_PROP = "lvcoref.mmax.export.name";
    public static final String HTML_PROP = "lvcoref.html.output";
    public static final String CONLL_INPUT_LIST = "lvcoref.input.conll";
    public static final String MMAX_GOLD_PROP = "lvcoref.mmax.gold";
    public static final String NER_PROP = "lvcoref.ner";
    
    public static final String CONLL_SCORER = "lvcoref.conll.scorer";
    
    public static final String GOLD_MENTIONS_PROP = "lvcoref.gold.mentions";
    
    
    /** print the values of variables in this class */
    public static void printConstants() {
        if (Constants.USE_GOLD_MENTIONS) log.config("USE_GOLD_MENTIONS on");
        else log.config("USE_GOLD_MENTIONS off");
//        if (Constants.USE_GOLD_MENTION_BOUNDARIES) logger.info("USE_GOLD_MENTION_BOUNDARIES on");
//        else logger.info("USE_GOLD_MENTION_BOUNDARIES off");
        if (Constants.REMOVE_SINGLETONS) log.config("REMOVE_SINGLETONS on");
        else log.config("REMOVE_SINGLETONS off");
        log.config("=================================================================");
    }
}
