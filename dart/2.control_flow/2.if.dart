import 'dart:io';

void main(){
  stdout.write("What's your name ?: ");
  String name = stdin.readLineSync()!;

  stdout.write("Enter your age: ");
  int age = int.parse(stdin.readLineSync()!);

  if (age >= 18){
    print("Lets drink some champagne, $name :D");
  } else if (age >= 5){
    print("I will buy you some coca-cola, $name :D");
  } else print("Back to your home and drink some milk, $name ?");
}