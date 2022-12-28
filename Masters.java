/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tbssys;

/**
 *
 * @author lenovo
 */
  public class Masters implements Opportunity {
  private int opportunityNumber;
  private int duration;
  private double gparequired;
  private String characteristics;
   private String name;
  
  //constructor

  public Masters(int opportunityNumber, int duration, double gparequired) {
    this.opportunityNumber = opportunityNumber;
    this.duration = duration;
    this.gparequired = gparequired;
  }

   public Masters(int opportunityNumber, int duration, double gparequired,String characteristics) {
    this.opportunityNumber = opportunityNumber;
    this.duration = duration;
    this.gparequired = gparequired;
    this.characteristics=characteristics;
  }
   
    public Masters(String characteristics) {
       this.characteristics=characteristics;
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

  public double getGPARequired() {
    return gparequired;
  }
}
