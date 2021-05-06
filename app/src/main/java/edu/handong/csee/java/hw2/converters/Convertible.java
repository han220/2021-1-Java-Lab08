package edu.handong.csee.java.hw2.converters;

/**
 * Convertible thing interface
 */
public interface Convertible {

        /**
   * set the class value
   * 
   * @param fromValue value to set
   */
    public void setFromValue(double fromValue);

    /**
   * get Converted Value
   * 
   * @return get class value
   */
    public double getConvertedValue();

    /**
   * do conversion
   */
    public void convert();

}