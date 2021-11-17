function addEmployee(){
    var employeeId = document.getElementById("employeeid").value;
    var employeeName = document.getElementById("employeename").value;
    var salary = document.getElementById("salary").value;
    var email = document.getElementById("email").value;
    
    document.getElementById("pemployeeid").innerHTML= employeeId;
    document.getElementById("pemployeename").innerHTML= employeeName;
    document.getElementById("psalary").innerHTML= salary;
    document.getElementById("pemail").innerHTML= email;

}