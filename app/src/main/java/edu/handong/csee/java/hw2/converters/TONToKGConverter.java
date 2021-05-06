package edu.handong.csee.java.hw2.converters;
/**
 * Ton to KG Converter
 */
public class TONToKGConverter implements Convertible {
  private double value;

   /**
   * set the class value
   * 
   * @param fromValue value to set
   */
  public void setFromValue(double fromValue) {
    value = fromValue;
  };

   /**
   * get Converted Value
   * 
   * @return get class value
   */
  public double getConvertedValue() {
    return value;
  };

  /**
   * do conversion
   */
  public void convert() {
    value = value * 100;
    value *= 10;
  };
}