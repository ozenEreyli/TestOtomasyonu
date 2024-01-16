import java.util.ArrayList;
import java.util.List;

class Department {
    Person teamLead;
    List<Person> personnelList;
    List<String> assignmentList;

    public Department(Person teamLead) {
        this.teamLead = teamLead;
        this.personnelList = new ArrayList<>();
        this.assignmentList = new ArrayList<>();
    }
    public void changeTeamLead(Person newTeamLead) {
        this.teamLead = newTeamLead;
    }
    public void addStaff(Person staff) {
        personnelList.add(staff);
    }
    public void removeStaff(Person staff) {
        personnelList.remove(staff);
    }
    public void changeStaffDetails(Person oldStaff, Person newStaff) {
        int index = personnelList.indexOf(oldStaff);
        if (index != -1) {
            personnelList.set(index, newStaff);
        }
    }
    public void addTask(String task) {
        assignmentList.add(task);
    }
    public void markTaskAsCompleted(String completedTask) {
        assignmentList.remove(completedTask);
    }
}
