package createClassAndObjects;

public class StudentGroup {
    String groupName;
    int studentCount;

    public StudentGroup(String someGroupName, int someStudentCount){
        this.groupName = someGroupName;
        this.studentCount = someStudentCount;
    }

    public String getGroupName(){
        return groupName;
    }
    public int getStudentCount(){
        return studentCount;
    }

    public void setGroupName(String newGroupName){
        this.groupName = newGroupName;
    }
    public void setStudentCount(int newStudentCount){
        this.studentCount = newStudentCount;
    }

    public void printInfo(){
        System.out.println("Название группы: " + this.groupName + "    Кол-во учеников: " + this.studentCount);
    }
}
