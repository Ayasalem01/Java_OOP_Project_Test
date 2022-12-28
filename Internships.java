/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tbssys;

/**
 *
 * @author lenovo
 */
public class Internships implements Opportunity {
  private int opportunityNumber;
  private int duration;
  private String characteristics;
   private String name;

  public Internships(int opportunityNumber, int duration, String characteristics) {
    this.opportunityNumber = opportunityNumber;
    this.duration = duration;
    this.characteristics = characteristics;
  }

  public Internships(String characteristics) {
    
    this.characteristics = characteristics;
  }
  
  @Override
  public int getOpportunityNumber() {
    return opportunityNumber;
  }

  
   @Override
   public String getname() {
    return name;
  }
  
  @Override
  public int getDuration() {
    return duration;
  }

  public String getCharacteristics() {
    return characteristics;
  }
}

