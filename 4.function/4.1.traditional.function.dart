
num calculateSubjectGrade(num midterm, num finalTerm, var midRate){
  if (midterm <=0 || finalTerm <=0){
    print("FAILED!");
    return -1; 
  } else {
    return (midterm*midRate + finalTerm*(1-midRate));
  }
}

void main(){
  num midterm = 7;
  num finalTerm = 9.5;
  num midRate = 0.3;
  var result = calculateSubjectGrade(midterm, finalTerm, midRate);
  print(result); // 8.75
  print("Result: ${calculateSubjectGrade(midterm, finalTerm, midRate)}"); // 8.75

  // No need to ${calculateSubjectGrade($midterm, $finalTerm, $midRate)}
}