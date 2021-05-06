package edu.handong.csee.java.hw2.converters;

/**
 * Convert all things
 */
public class AllConverter {
  private double value;
  private String originalMeasure;
  private Convertible c;

  /**
   * Change the value from all value
   * 
   * @param newValue new value to set
   * @return AllConverter value
   */
  public AllConverter setFromValue(double newValue) {
    value = newValue;
    return this;
  }

  /**
   * Change the measure of the converter
   * 
   * @param originalMeasure
   * @return AllConverter value
   */
  public AllConverter setOriginalMeasure(String originalMeasure) {
    this.originalMeasure = originalMeasure;
    return this;
  }

  /**
   * Convert to all supported values and print it out
   */
  public void convertAndPrintOut() {
    Convertible c;
    if(originalMeasure.equalsIgnoreCase("km")) {
      c = new KMToMConverter();
      c.setFromValue(value);
      c.convert();
      System.out.println(value + " " + originalMeasure + " to " + c.getConvertedValue() + " M");

      c = new KMToMILEConverter();
      c.setFromValue(value);
      c.convert();
      System.out.println(value + " " + originalMeasure + " to " + c.getConvertedValue() + " MILE");
    } else if (originalMeasure.equalsIgnoreCase("ton")) {
      c = new TONToKGConverter();
      c.setFromValue(value);
      c.convert();
      System.out.println(value + " " + originalMeasure + " to " + c.getConvertedValue() + " KG");

      c = new TONToGConverter();
      c.setFromValue(value);
      c.convert();
      System.out.println(value + " " + originalMeasure + " to " + c.getConvertedValue() + " G");
    } else {
      System.out.println("AllConverter cannot support the measure!");
      //AllConverter cannot support the measure!
    }
  }
}