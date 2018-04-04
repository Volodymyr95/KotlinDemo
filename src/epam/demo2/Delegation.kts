interface Manager {
    fun giveTask() :String
}

class ProjectManager : Manager {
    override fun giveTask() :String {
       return "Task"
    }
}

class Employee(var manager: Manager) : Manager by manager {
    override fun giveTask(): String {
        return  "Ovveride Task"
    }
}

var developer : Employee = Employee(ProjectManager())
print(developer.giveTask())


