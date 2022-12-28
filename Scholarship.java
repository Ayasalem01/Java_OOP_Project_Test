/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tbssys;

/**
 *
 * @author lenovo
 */
public class Scholarship implements Opportunity {
  private int opportunityNumber;
  private int duration;
  private String requirements;
  private String name;

  public Scholarship(int opportunityNumber, int duration, String requirements) {
    this.opportunityNumber = opportunityNumber;
    this.duration = duration;
    this.requirements = requirements;
  }
  
  public Scholarship( String requirements) {
  
    this.requirements = requirements;
  }

 
  @Override
   public String getname() {
    return name;
  }

  
  
  @Override
  public int getOpportunityNumber() {
    return opportunityNumber;
  }

  @Override
  public int getDuration() {
    return duration;
  }

  public String getRequirements() {
    return requirements;
  }
}