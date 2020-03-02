import io, sys
sys.stdout = io.TextIOWrapper(sys.stdout.buffer, encoding='utf8')

class Main:
    x=float(input())
    print('%.2f' %round(x,2))




