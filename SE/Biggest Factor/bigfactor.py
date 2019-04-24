#####################################################
# Software Engineering
# the largest prime factor of the number 600851475143
# Phuc Le - 456061
#####################################################
def largestPrimeFactor(n):
    primeFactor = 1
    i = 2

    while i <= (n / i):
        if n % i == 0:
            primeFactor = i
            n /= i
        else:
            i += 1

    if primeFactor < n:
        primeFactor = n

    return primeFactor

print(largestPrimeFactor(600851475143))