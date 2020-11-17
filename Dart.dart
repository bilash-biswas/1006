import 'dart:io';
void main(){
  double num1,num2,num3;

  num1 = double.parse(stdin.readLineSync());
  num2 = double.parse(stdin.readLineSync());
  num3 = double.parse(stdin.readLineSync());
  double mul = ((num1 * 2) + (num2 * 3) + (num3 * 5)) / 10;
  var num = mul.toStringAsFixed(1);
  print("MEDIA = $num");
}
