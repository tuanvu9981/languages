// kiểu void: không trả về gì 
function sayHello(): void{
    console.log("Hello");
}
sayHello();


// có 2 cách khai báo function
// cách 1
function add(x,y){
    return x+y;
}
var myAdd = add(3,4);
console.log(myAdd);


// cách 2: Hàm vô danh
var myNewAdd = function(x,y){return x+y}
console.log(myNewAdd(6,8));


// định kiểu với function
function add_typed(x: number, y: number): number{
    return x+y;
}
add_typed(4,5)

var new_add_typed = function(x: number, y:number): number{
    return x+y;
}
console.log(new_add_typed(1,2))

// set giá trị mặc định nếu không truyền đối số vào (giống Python)
function buildName(firstName: string, lastName = "Romannov"): string{
    return firstName + " " + lastName;
}
var fullname1 = buildName("Mike"); // Mike Romanov
var fullname2 = buildName("Mike", "Johnson") // Mike Johnson

// cho phép bỏ qua 1 vài giá trị 
function buildName1(firstName: string, lastName?:string): string{
    if (lastName){
        return firstName + " " + lastName;
    } else return firstName;
}
var fullname3 = buildName1("Mike"); // Mike
var fullname4 = buildName1("Mike", "Tyson") // Mike Tyson

// số lượng tham số đầu vào không xác định
// Khi đó, phải truyền ARRAY vào 
function buildName2(firstName: string, ...otherName: string[]){
    return firstName + " " + otherName.join(" ");
    // gộp string với dấu " "
}
var fullname5 = buildName2("Josh", "Adaman", "de","Shoemaker");
console.log(fullname5);
