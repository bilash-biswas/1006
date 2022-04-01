input <- file('stdin', 'r')

a <- as.numeric(readLines(input, n=1))
b <- as.numeric(readLines(input, n=1))
c <- as.numeric(readLines(input, n=1))

write(sprintf("MEDIA = %.1f",(a*2 + b*3 + c*5)/10.0),'')
