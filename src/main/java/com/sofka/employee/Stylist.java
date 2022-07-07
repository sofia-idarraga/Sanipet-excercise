package com.sofka.employee;

public class Stylist extends Employee{

    public Stylist(String name, String surname){
        this.name = name;
        this.surname = surname;
        setSchedule();
    }

    protected void setSchedule(){
        for(int i= 1 ; i<=5; i++){
            Schedule schedule =  new Schedule(i,"8AM", "4PM");
            this.schedules.add(schedule);
        }
        this.schedules.add(new Schedule(6,"9AM","4PM"));
    }
}
