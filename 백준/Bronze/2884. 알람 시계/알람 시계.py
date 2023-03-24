h, m = (map(int, input().split()))

if(h==0 and m > 45) :
    print(f'{h} {m-45}')
elif(h==0 and m < 45) :
    print(f'{23} {(60-(45 - m))}')  
elif(h == h and m < 45) :
    print(f'{h-1} {60-(45-m)}')    
else :
    print(f'{h} {m-45}')
       