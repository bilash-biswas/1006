package main

import "fmt"

func main() {
	var num1 float64
	var num2 float64
	var num3 float64
	fmt.Scanln(&num1)
	fmt.Scanln(&num2)
	fmt.Scanln(&num3)
	var result float64 = (num1 * 2 + num2 * 3 + num3 * 5) / 10
	fmt.Printf("MEDIA = %.1f\n", result)
}
