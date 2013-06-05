package LVCoref.sievepasses;

public class PreciseConstructs extends DeterministicCorefSieve {
  public PreciseConstructs() {
    super();
    flags.USE_APPOSITION = true;
    flags.USE_PREDICATENOMINATIVES = true;
    flags.USE_ACRONYM = true;
    //flags.USE_RELATIVEPRONOUN = true;
    //flags.USE_ROLEAPPOSITION = true;
    //flags.USE_DEMONYM = true;
  }
}
