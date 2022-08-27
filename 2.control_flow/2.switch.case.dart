import 'dart:io';

void main(){
  stdout.write("Enter your grade: ");
  int grade = int.parse(stdin.readLineSync()!);

  switch(grade){
    case 10:{
      print("Perfect! You've got an A!");
    }
    break;

    case 9: {
      print("Pretty good! You've got an A!");
    }
    break;

    case 7: {
      print("Continue to make effort!");
    }
    break;

    case 5: {
      print("You need to study harder!");
    }
    break;

    default: {
      print("Invalid choice!");
    }
    break;

  }
}