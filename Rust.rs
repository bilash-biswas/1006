fn main(){
   let mut line1 = String::new();
   std::io::stdin().read_line(&mut line1).unwrap();
   let num1: f32 = line1.trim().parse().ok().expect("Try");
   let mut line2 = String::new();
   std::io::stdin().read_line(&mut line2).unwrap();
   let num2: f32 = line2.trim().parse().ok().expect("Try");
   let mut line3 = String::new();
   std::io::stdin().read_line(&mut line3).unwrap();
   let num3: f32 = line3.trim().parse().ok().expect("Try");
   println!("MEDIA = {0:.1}", (num1 * 2.0 + num2 * 3.0 + num3 * 5.0)/10.0)
}
