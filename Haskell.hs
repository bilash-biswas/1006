import Text.Printf(printf)

main :: IO ()
main = do
    a <- readLn
    b <- readLn
    c <- readLn
    printf "MEDIA = %.1f\n" ((a * 2 + b * 3 + c * 5)/10 :: Double)
