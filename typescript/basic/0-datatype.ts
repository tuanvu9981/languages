// boolean
var isDone: boolean = true;
console.log(isDone);

// string
var my_name: string = "TuanVu";
console.log(my_name);

// number = float + integer
// integer
var my_number: number = 81;

// float
const PI: number = 3.14;
console.log(my_number);
console.log(PI);

// array: Có 2 kiểu khai báo
var list1: string[] = ["TypeScript","Java","Python"];
var list2: Array<string> = ["R","C","PHP"];
console.log(list1);
console.log(list2);

// enum: Các phần tử sẽ được đánh số từ 0 và tăng dần
enum Country{"China","Japan","Korea","Vietnam"};
var country1: Country = Country.Japan;
var country2 = Country[3];
console.log(country1); // --> result: 1
console.log(country2); // --> result: "Vietnam"

// any: là kiểu dữ liệu mà có thể gán bất cứ kiểu nào cho nó
var noType: any = true;
console.log(noType); //true

noType = "Another String";
console.log(noType); // result: "Another String"

noType = PI*my_number;
console.log(noType); // result: 254.34

//list with any type
var list:any[] = [1, "String", true] // OK