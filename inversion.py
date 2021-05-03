#Source: https: // runzhuoli.me / 2018 / 09 / 06 / count - inversions - in -an - array.html  #:~:text=We%20can%20determine%20how%20%E2%80%9Cout,number%20of%20inversions%20it%20has.
#Source2: https: // mail.google.com / mail / u / 3 /  # label/Interview%2FDaily+Coding+question/FMfcgxwLtZpqXkTFXBtkmdJSwsgxFvjq
#Difficulty: Medium
#Asked in: Google

l = [2, 4, 1, 3, 5]
j = 1
temp = 0
r = len(l)
while j != r:
    if l[temp] >= l[j]:
        print((l[temp], l[j]))
    if j + 1 == len(l):
        temp += 1
        r += len(l)
        j = temp
    if temp + 1 == len(l):
        break
    j += 1
