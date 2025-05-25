print("hello")
for i in range(10):
    print(i)

with open("pytest.txt", "r") as f:
    data = f.readlines()

print(data)


def fun(a,b):
    return a+b

a = fun(10,20)
print(a)

#%%
print("hamza, " *5)

a = input("Enter your name: ")
print(f"your name is {a}")