package org.rd.ta.sample.lesson_11;

import java.util.ArrayList;
import java.util.List;
public class Department {
    Person teamLead;
    List<Person> PersonnelList;
    List<String> AssingmentList;

    public Department(Person _teamLead){
        this.teamLead = _teamLead;
        this.PersonnelList = new ArrayList<>();
        this.AssingmentList = new ArrayList<>();

    }

    public void ChangeTeamLead(Person newTeamLead){
        this.teamLead = newTeamLead;
    }
    public void AddStaff(Person staff){
        PersonnelList.add(staff);
    }
    public void RemoveStaff(Person staff){
        PersonnelList.remove(staff);
    }

    public void ChangeStaffDetails(Person oldStaff, Person newStaff){
        int index = PersonnelList.indexOf(oldStaff);
        if(index != -1)
        {
            PersonnelList.set(index, newStaff);
        }
    }

    public void AddTask(String task){
        AssingmentList.add(task);
    }
    public void MarkTaskAsCompleted(String completedTask){
        AssingmentList.remove(completedTask);
    }

}
