N = int(input()) 
temp = N
cnt = 0

while True :
    first = temp // 10  
    # 2
    second = temp % 10  
    # 6
    third = (first + second) % 10 
    # (2 + 6) / 10 = 0 . 8  ... 8
    temp = (second * 10) + third  
    # (6 * 10) + 8 = 68

    cnt = cnt + 1
    if (temp == N) :
        break

print(cnt)
