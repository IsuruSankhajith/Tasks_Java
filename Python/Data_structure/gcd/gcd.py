def gcd (m, n):

    if int(m) < 1 or int(n) < 1:
        return 0
    p, q = m, n   # p is the larger integer
    print (f'\np={p}, q ={q}')
    if p<q:
        p, q = q, p

    while (p%q!= 0):
        r = p % q
        print(f'p={p}, q={q}, r= {r}')
        p, q = q, r
    return q

def main():
    m = input("Please input two integers: \nm = ")
    n = input("n = ")
    gcdc = gcd(int(m), int(n))
    print(f'\n---> gcd({m},{n}) = {gcdc}\n')

main()
