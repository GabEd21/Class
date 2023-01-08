


let,num = input("").split(" ")
ans = float(num)
root = 3**0.5
sq = ans*ans
area = root/4
per = ans*3

if let == 'A':
    ares = area*sq

    print("Area: %.2f" % ares)
elif let == 'P':
    print("Peri: %.2f" % per)
else:
    print("Invalid Transaction!")

