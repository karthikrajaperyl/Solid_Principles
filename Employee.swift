class Employee
{
    var id:Int;
    var name:String;
    var role:String;
    var salary=0;
    var experienceYear=0
    init(id:Int,name:String,role:String)
    {
        self.id=id;
        self.name=name;
        self.role=role;
    }
    func incrementSalary(salary:Int)
    {
        self.salary+=salary;
    }
    func setExperienceYear(year:Int)
    {
        self.experienceYear=year;
    }
    func display()
    {
     print("Employee name is \(name) with id \(id) with position \(role)")   
    }
    func display(performance:String)
    {
        print("Employee name is \(name) with id \(id) with position \(role)  performing \(performance) at experience \(experienceYear) of earning salary \(salary)")   
    }
}
let employee1=Employee(id:1,name:"karthik",role:"Software developer")
let employee2=Employee(id:2,name:"Raja",role:"Senior Software developer")
employee1.incrementSalary(salary:1000)
employee2.incrementSalary(salary:1000)

employee1.setExperienceYear(year:1)
employee2.setExperienceYear(year:2)
employee1.display()
employee2.display()
employee1.display(performance:"Good")
employee2.display(performance:"Excellent")
